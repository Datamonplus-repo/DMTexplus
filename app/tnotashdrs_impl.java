package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnotashdrs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A361DisCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            AV33BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarCod), 8, 0));
            AV34BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodReo", GXutil.str( AV34BarCodReo, 1, 0));
            AV35BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodPar", AV35BarCodPar);
            AV39DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39DisCod), "ZZZZZZZ9")));
            AV40CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
            AV41BarSer = httpContext.GetPar( "BarSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarSer", AV41BarSer);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41BarSer, ""))));
            AV42PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42PedidoCliente", AV42PedidoCliente);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42PedidoCliente, ""))));
            AV43BarColNom = httpContext.GetPar( "BarColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43BarColNom", AV43BarColNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43BarColNom, ""))));
            AV44BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarColNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9")));
            AV45BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45BarPie), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45BarPie), "ZZZZZ9")));
            AV46BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarKgm", GXutil.ltrimstr( AV46BarKgm, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV46BarKgm, "ZZZZZ9.99")));
            AV47BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47BarMtr", GXutil.ltrimstr( AV47BarMtr, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV47BarMtr, "ZZZZZ9.99")));
            AV48CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48CliNom", AV48CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CliNom, ""))));
            AV49BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49BarSerDsc", AV49BarSerDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49BarSerDsc, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Notas Hdrs", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
      A646NotUltLin = (byte)(GXutil.lval( httpContext.GetPar( "NotUltLin"))) ;
      n646NotUltLin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tnotashdrs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnotashdrs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnotashdrs_impl.class ));
   }

   public tnotashdrs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
      ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
      ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
      ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
      ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
      ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
      ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
      ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
      ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
      ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
      ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV33BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV34BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV34BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV35BarCodPar), GXutil.rtrim( localUtil.format( AV35BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV40CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV48CliNom), GXutil.rtrim( localUtil.format( AV48CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNotasHdrs.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV42PedidoCliente), GXutil.rtrim( localUtil.format( AV42PedidoCliente, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV41BarSer), GXutil.rtrim( localUtil.format( AV41BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV43BarColNom), GXutil.rtrim( localUtil.format( AV43BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV44BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV45BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV46BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV46BarKgm, "ZZZZZ9.99") : localUtil.format( AV46BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV47BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV47BarMtr, "ZZZZZ9.99") : localUtil.format( AV47BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNotasHdrs.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntipospresentacion_Internalname, "", httpContext.getMessage( "Tipos Presentacion", ""), bttBtntipospresentacion_Jsonclick, 5, httpContext.getMessage( "Tipos Presentacion", ""), "", StyleString, ClassString, bttBtntipospresentacion_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOTIPOSPRESENTACION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNotasHdrs.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrenumerarlinea_Internalname, "", httpContext.getMessage( "Renumerar Linea", ""), bttBtnrenumerarlinea_Jsonclick, 7, httpContext.getMessage( "Renumerar Linea", ""), "", StyleString, ClassString, bttBtnrenumerarlinea_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111nj12_client"+"'", TempTags, "", 2, "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNotasHdrs.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNotasHdrs.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNotasHdrs.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNotasHdrs.htm");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_renumerarlinea_Internalname, tblTabledvelop_confirmpanel_renumerarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_renumerarlinea.setProperty("Title", Dvelop_confirmpanel_renumerarlinea_Title);
      ucDvelop_confirmpanel_renumerarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_renumerarlinea_Confirmationtext);
      ucDvelop_confirmpanel_renumerarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_renumerarlinea_Yesbuttoncaption);
      ucDvelop_confirmpanel_renumerarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_renumerarlinea_Nobuttoncaption);
      ucDvelop_confirmpanel_renumerarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_renumerarlinea_Cancelbuttoncaption);
      ucDvelop_confirmpanel_renumerarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_renumerarlinea_Yesbuttonposition);
      ucDvelop_confirmpanel_renumerarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_renumerarlinea_Confirmtype);
      ucDvelop_confirmpanel_renumerarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_renumerarlinea_Internalname, "DVELOP_CONFIRMPANEL_RENUMERARLINEAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RENUMERARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol100( ) ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount17 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_17 = (short)(1) ;
            scanStart1NJ17( ) ;
            while ( RcdFound17 != 0 )
            {
               init_level_properties17( ) ;
               getByPrimaryKey1NJ17( ) ;
               addRow1NJ17( ) ;
               scanNext1NJ17( ) ;
            }
            scanEnd1NJ17( ) ;
            nBlankRcdCount17 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B646NotUltLin = A646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
         standaloneNotModal1NJ17( ) ;
         standaloneModal1NJ17( ) ;
         sMode17 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow1NJ17( ) ;
            edtBarNotLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOTLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNotLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNotLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtBarNotDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOTDSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNotDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNotDsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_17 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NJ17( ) ;
            }
            sendRow1NJ17( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A646NotUltLin = B646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount17 = (short)(5) ;
         nRcdExists_17 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NJ17( ) ;
            while ( RcdFound17 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_10017( ) ;
               init_level_properties17( ) ;
               standaloneNotModal1NJ17( ) ;
               getByPrimaryKey1NJ17( ) ;
               standaloneModal1NJ17( ) ;
               addRow1NJ17( ) ;
               scanNext1NJ17( ) ;
            }
            scanEnd1NJ17( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode17 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_10017( ) ;
         initAll1NJ17( ) ;
         init_level_properties17( ) ;
         B646NotUltLin = A646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
         nRcdExists_17 = (short)(0) ;
         nIsMod_17 = (short)(0) ;
         nRcdDeleted_17 = (short)(0) ;
         nBlankRcdCount17 = (short)(nBlankRcdUsr17+nBlankRcdCount17) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount17 > 0 )
         {
            standaloneNotModal1NJ17( ) ;
            standaloneModal1NJ17( ) ;
            addRow1NJ17( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBarNotDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount17 = (short)(nBlankRcdCount17-1) ;
         }
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A646NotUltLin = B646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
      }
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
      e121NJ2 ();
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
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z646NotUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z646NotUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            A646NotUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z646NotUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n646NotUltLin = false ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            O646NotUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "O646NotUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            n130BarCodPar = false ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A646NotUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "NOTULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "BARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A120BarAgrEst = httpContext.cgiGet( "BARAGREST") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable3_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Objectcall") ;
            Dvpanel_unnamedtable3_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Class") ;
            Dvpanel_unnamedtable3_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Enabled")) ;
            Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
            Dvpanel_unnamedtable3_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Height") ;
            Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
            Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
            Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
            Dvpanel_unnamedtable3_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showheader")) ;
            Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
            Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
            Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
            Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
            Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
            Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
            Dvpanel_unnamedtable3_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Visible")) ;
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
            Dvelop_confirmpanel_renumerarlinea_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Objectcall") ;
            Dvelop_confirmpanel_renumerarlinea_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Enabled")) ;
            Dvelop_confirmpanel_renumerarlinea_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Width") ;
            Dvelop_confirmpanel_renumerarlinea_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Height") ;
            Dvelop_confirmpanel_renumerarlinea_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Class") ;
            Dvelop_confirmpanel_renumerarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Title") ;
            Dvelop_confirmpanel_renumerarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Confirmationtext") ;
            Dvelop_confirmpanel_renumerarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Yesbuttoncaption") ;
            Dvelop_confirmpanel_renumerarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Nobuttoncaption") ;
            Dvelop_confirmpanel_renumerarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_renumerarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Yesbuttonposition") ;
            Dvelop_confirmpanel_renumerarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Confirmtype") ;
            Dvelop_confirmpanel_renumerarlinea_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Comment") ;
            Dvelop_confirmpanel_renumerarlinea_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Bodytype") ;
            Dvelop_confirmpanel_renumerarlinea_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Bodycontentinternalname") ;
            Dvelop_confirmpanel_renumerarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Result") ;
            Dvelop_confirmpanel_renumerarlinea_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Texttype") ;
            Dvelop_confirmpanel_renumerarlinea_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Visible")) ;
            /* Read variables values. */
            AV33BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarCod), 8, 0));
            AV34BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodReo", GXutil.str( AV34BarCodReo, 1, 0));
            AV35BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodPar", AV35BarCodPar);
            AV40CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
            AV48CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48CliNom", AV48CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CliNom, ""))));
            AV42PedidoCliente = httpContext.cgiGet( edtavPedidocliente_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42PedidoCliente", AV42PedidoCliente);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42PedidoCliente, ""))));
            AV41BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarSer", AV41BarSer);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41BarSer, ""))));
            AV43BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43BarColNom", AV43BarColNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43BarColNom, ""))));
            AV44BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarColNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9")));
            AV45BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45BarPie), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45BarPie), "ZZZZZ9")));
            AV46BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarKgm", GXutil.ltrimstr( AV46BarKgm, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV46BarKgm, "ZZZZZ9.99")));
            AV47BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47BarMtr", GXutil.ltrimstr( AV47BarMtr, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV47BarMtr, "ZZZZZ9.99")));
            AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TNotasHdrs");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            forbiddenHiddens.add("BarSit", localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"));
            forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tnotashdrs:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                  sMode12 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode12 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound12 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1NJ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "");
                     AnyError = (short)(1) ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RENUMERARLINEA.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131NJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e121NJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141NJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOTIPOSPRESENTACION'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoTiposPresentacion' */
                        e151NJ2 ();
                        nKeyPressed = (byte)(3) ;
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
         e141NJ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1NJ12( ) ;
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
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1NJ12( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
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

   public void confirm_1NJ0( )
   {
      beforeValidate1NJ12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NJ12( ) ;
         }
         else
         {
            checkExtendedTable1NJ12( ) ;
            closeExtendedTableCursors1NJ12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1NJ17( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1NJ17( )
   {
      s646NotUltLin = O646NotUltLin ;
      n646NotUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1NJ17( ) ;
         if ( ( nRcdExists_17 != 0 ) || ( nIsMod_17 != 0 ) )
         {
            getKey1NJ17( ) ;
            if ( ( nRcdExists_17 == 0 ) && ( nRcdDeleted_17 == 0 ) )
            {
               if ( RcdFound17 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NJ17( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NJ17( ) ;
                     closeExtendedTableCursors1NJ17( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O646NotUltLin = A646NotUltLin ;
                     n646NotUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound17 != 0 )
               {
                  if ( nRcdDeleted_17 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NJ17( ) ;
                     load1NJ17( ) ;
                     beforeValidate1NJ17( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NJ17( ) ;
                        O646NotUltLin = A646NotUltLin ;
                        n646NotUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_17 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NJ17( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NJ17( ) ;
                           closeExtendedTableCursors1NJ17( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O646NotUltLin = A646NotUltLin ;
                           n646NotUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_17 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarNotLin_Internalname, GXutil.ltrim( localUtil.ntoc( A188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNotDsc_Internalname, GXutil.rtrim( A187BarNotDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z188BarNotLin_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z187BarNotDsc_"+sGXsfl_100_idx, GXutil.rtrim( Z187BarNotDsc)) ;
         httpContext.changePostValue( "nRcdDeleted_17_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_17_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_17_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_17 != 0 )
         {
            httpContext.changePostValue( "BARNOTLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOTDSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O646NotUltLin = s646NotUltLin ;
      n646NotUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NJ0( )
   {
   }

   public void e121NJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnotashdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnotashdrs_impl.this.AV32EmprCod = GXv_char2[0] ;
      tnotashdrs_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnotashdrs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV36WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV36WWPContext = GXv_SdtWWPContext5[0] ;
      AV37TrnContext.fromxml(AV38WebSession.getValue("TrnContext"), null, null);
   }

   public void e141NJ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e151NJ2( )
   {
      /* 'DoTiposPresentacion' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV32EmprCod ;
      GXv_int6[0] = AV33BarCod ;
      GXv_int7[0] = AV34BarCodReo ;
      GXv_char3[0] = AV35BarCodPar ;
      new app.pininotultlin(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3) ;
      tnotashdrs_impl.this.AV32EmprCod = GXv_char4[0] ;
      tnotashdrs_impl.this.AV33BarCod = GXv_int6[0] ;
      tnotashdrs_impl.this.AV34BarCodReo = GXv_int7[0] ;
      tnotashdrs_impl.this.AV35BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodReo", GXutil.str( AV34BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodPar", AV35BarCodPar);
      httpContext.popup(formatLink("app.webwstppreh", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarCodPar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"}) , new Object[] {});
      callWebObject(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV39DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarSer)),GXutil.URLEncode(GXutil.rtrim(AV42PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV43BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV47BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV48CliNom)),GXutil.URLEncode(GXutil.rtrim(AV49BarSerDsc))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e131NJ2( )
   {
      /* Dvelop_confirmpanel_renumerarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_renumerarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RENUMERARLINEA' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
   }

   public void S112( )
   {
      /* 'DO ACTION RENUMERARLINEA' Routine */
      returnInSub = false ;
      new app.prennotas(remoteHandle, context).execute( AV32EmprCod, AV33BarCod, AV34BarCodReo, AV35BarCodPar) ;
      callWebObject(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV39DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarSer)),GXutil.URLEncode(GXutil.rtrim(AV42PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV43BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV47BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV48CliNom)),GXutil.URLEncode(GXutil.rtrim(AV49BarSerDsc))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1NJ12( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01NJ5_A361DisCod[0] ;
            Z2759BarMaqGru = T01NJ5_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01NJ5_A180BarMaqCod[0] ;
            Z646NotUltLin = T01NJ5_A646NotUltLin[0] ;
            Z213BarSit = T01NJ5_A213BarSit[0] ;
            Z120BarAgrEst = T01NJ5_A120BarAgrEst[0] ;
            Z252CliCod = T01NJ5_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z646NotUltLin = A646NotUltLin ;
            Z213BarSit = A213BarSit ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z646NotUltLin = A646NotUltLin ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV51Pgmname = "TNotasHdrs" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01NJ6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NJ6_A407EmprNom[0] ;
      n407EmprNom = T01NJ6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV33BarCod) )
      {
         A129BarCod = AV33BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV34BarCodReo) )
      {
         A132BarCodReo = AV34BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV35BarCodPar)==0) )
      {
         A130BarCodPar = AV35BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void standaloneModal( )
   {
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
   }

   public void load1NJ12( )
   {
      /* Using cursor T01NJ8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01NJ8_A361DisCod[0] ;
         A2759BarMaqGru = T01NJ8_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01NJ8_A180BarMaqCod[0] ;
         A646NotUltLin = T01NJ8_A646NotUltLin[0] ;
         n646NotUltLin = T01NJ8_n646NotUltLin[0] ;
         A213BarSit = T01NJ8_A213BarSit[0] ;
         A120BarAgrEst = T01NJ8_A120BarAgrEst[0] ;
         A407EmprNom = T01NJ8_A407EmprNom[0] ;
         n407EmprNom = T01NJ8_n407EmprNom[0] ;
         A252CliCod = T01NJ8_A252CliCod[0] ;
         n252CliCod = T01NJ8_n252CliCod[0] ;
         A252CliCod = T01NJ8_A252CliCod[0] ;
         n252CliCod = T01NJ8_n252CliCod[0] ;
         A365DisDes = T01NJ8_A365DisDes[0] ;
         zm1NJ12( -13) ;
      }
      pr_default.close(6);
      onLoadActions1NJ12( ) ;
   }

   public void onLoadActions1NJ12( )
   {
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      /* Using cursor T01NJ7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T01NJ7_A252CliCod[0] ;
      n252CliCod = T01NJ7_n252CliCod[0] ;
      A365DisDes = T01NJ7_A365DisDes[0] ;
      pr_default.close(5);
   }

   public void checkExtendedTable1NJ12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_12 = (short)(1) ;
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      /* Using cursor T01NJ7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01NJ7_A252CliCod[0] ;
      n252CliCod = T01NJ7_n252CliCod[0] ;
      A365DisDes = T01NJ7_A365DisDes[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1NJ12( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01NJ9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01NJ9_A252CliCod[0] ;
      n252CliCod = T01NJ9_n252CliCod[0] ;
      A365DisDes = T01NJ9_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1NJ12( )
   {
      /* Using cursor T01NJ10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NJ5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1NJ12( 13) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01NJ5_A361DisCod[0] ;
         A2759BarMaqGru = T01NJ5_A2759BarMaqGru[0] ;
         A129BarCod = T01NJ5_A129BarCod[0] ;
         n129BarCod = T01NJ5_n129BarCod[0] ;
         A132BarCodReo = T01NJ5_A132BarCodReo[0] ;
         n132BarCodReo = T01NJ5_n132BarCodReo[0] ;
         A130BarCodPar = T01NJ5_A130BarCodPar[0] ;
         n130BarCodPar = T01NJ5_n130BarCodPar[0] ;
         A180BarMaqCod = T01NJ5_A180BarMaqCod[0] ;
         A646NotUltLin = T01NJ5_A646NotUltLin[0] ;
         n646NotUltLin = T01NJ5_n646NotUltLin[0] ;
         A213BarSit = T01NJ5_A213BarSit[0] ;
         A120BarAgrEst = T01NJ5_A120BarAgrEst[0] ;
         A396EmprCod = T01NJ5_A396EmprCod[0] ;
         n396EmprCod = T01NJ5_n396EmprCod[0] ;
         A252CliCod = T01NJ5_A252CliCod[0] ;
         n252CliCod = T01NJ5_n252CliCod[0] ;
         O646NotUltLin = A646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NJ12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1NJ12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1NJ12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1NJ12( ) ;
      if ( RcdFound12 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01NJ11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ11_A129BarCod[0] < A129BarCod ) || ( T01NJ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ11_A132BarCodReo[0] < A132BarCodReo ) || ( T01NJ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01NJ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NJ11_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ11_A129BarCod[0] > A129BarCod ) || ( T01NJ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ11_A132BarCodReo[0] > A132BarCodReo ) || ( T01NJ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01NJ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NJ11_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01NJ11_A396EmprCod[0] ;
            n396EmprCod = T01NJ11_n396EmprCod[0] ;
            A129BarCod = T01NJ11_A129BarCod[0] ;
            n129BarCod = T01NJ11_n129BarCod[0] ;
            A132BarCodReo = T01NJ11_A132BarCodReo[0] ;
            n132BarCodReo = T01NJ11_n132BarCodReo[0] ;
            A130BarCodPar = T01NJ11_A130BarCodPar[0] ;
            n130BarCodPar = T01NJ11_n130BarCodPar[0] ;
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01NJ12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ12_A129BarCod[0] > A129BarCod ) || ( T01NJ12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ12_A132BarCodReo[0] > A132BarCodReo ) || ( T01NJ12_A132BarCodReo[0] == A132BarCodReo ) && ( T01NJ12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NJ12_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ12_A129BarCod[0] < A129BarCod ) || ( T01NJ12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NJ12_A132BarCodReo[0] < A132BarCodReo ) || ( T01NJ12_A132BarCodReo[0] == A132BarCodReo ) && ( T01NJ12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NJ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NJ12_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01NJ12_A396EmprCod[0] ;
            n396EmprCod = T01NJ12_n396EmprCod[0] ;
            A129BarCod = T01NJ12_A129BarCod[0] ;
            n129BarCod = T01NJ12_n129BarCod[0] ;
            A132BarCodReo = T01NJ12_A132BarCodReo[0] ;
            n132BarCodReo = T01NJ12_n132BarCodReo[0] ;
            A130BarCodPar = T01NJ12_A130BarCodPar[0] ;
            n130BarCodPar = T01NJ12_n130BarCodPar[0] ;
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NJ12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A646NotUltLin = O646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
         insert1NJ12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               A646NotUltLin = O646NotUltLin ;
               n646NotUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A646NotUltLin = O646NotUltLin ;
               n646NotUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
               update1NJ12( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A646NotUltLin = O646NotUltLin ;
               n646NotUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
               insert1NJ12( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  /* Insert record */
                  A646NotUltLin = O646NotUltLin ;
                  n646NotUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
                  insert1NJ12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "");
         AnyError = (short)(1) ;
      }
      else
      {
         A646NotUltLin = O646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1NJ12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NJ4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T01NJ4_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01NJ4_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01NJ4_A180BarMaqCod[0]) != 0 ) || ( Z646NotUltLin != T01NJ4_A646NotUltLin[0] ) || ( Z213BarSit != T01NJ4_A213BarSit[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z120BarAgrEst, T01NJ4_A120BarAgrEst[0]) != 0 ) || ( Z252CliCod != T01NJ4_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01NJ4_A361DisCod[0] )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01NJ4_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01NJ4_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01NJ4_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01NJ4_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01NJ4_A180BarMaqCod[0]);
            }
            if ( Z646NotUltLin != T01NJ4_A646NotUltLin[0] )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"NotUltLin");
               GXutil.writeLogRaw("Old: ",Z646NotUltLin);
               GXutil.writeLogRaw("Current: ",T01NJ4_A646NotUltLin[0]);
            }
            if ( Z213BarSit != T01NJ4_A213BarSit[0] )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T01NJ4_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T01NJ4_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T01NJ4_A120BarAgrEst[0]);
            }
            if ( Z252CliCod != T01NJ4_A252CliCod[0] )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01NJ4_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NJ12( )
   {
      beforeValidate1NJ12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NJ12( 0) ;
         checkOptimisticConcurrency1NJ12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NJ12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NJ12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NJ13 */
                  pr_default.execute(11, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Byte.valueOf(A213BarSit), A120BarAgrEst, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11NJ12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NJ12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NJ0( ) ;
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
         else
         {
            load1NJ12( ) ;
         }
         endLevel1NJ12( ) ;
      }
      closeExtendedTableCursors1NJ12( ) ;
   }

   public void update1NJ12( )
   {
      beforeValidate1NJ12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NJ12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NJ12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NJ12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NJ14 */
                  pr_default.execute(12, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Byte.valueOf(A213BarSit), A120BarAgrEst, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NJ12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A129BarCod ;
                     GXv_int7[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3) ;
                     tnotashdrs_impl.this.A396EmprCod = GXv_char4[0] ;
                     tnotashdrs_impl.this.A129BarCod = GXv_int6[0] ;
                     tnotashdrs_impl.this.A132BarCodReo = GXv_int7[0] ;
                     tnotashdrs_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN11NJ12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NJ12( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1NJ12( ) ;
      }
      closeExtendedTableCursors1NJ12( ) ;
   }

   public void deferredUpdate1NJ12( )
   {
   }

   public void delete( )
   {
      beforeValidate1NJ12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NJ12( ) ;
         afterConfirm1NJ12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NJ12( ) ;
            if ( AnyError == 0 )
            {
               A646NotUltLin = O646NotUltLin ;
               n646NotUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
               scanStart1NJ17( ) ;
               while ( RcdFound17 != 0 )
               {
                  getByPrimaryKey1NJ17( ) ;
                  delete1NJ17( ) ;
                  scanNext1NJ17( ) ;
                  O646NotUltLin = A646NotUltLin ;
                  n646NotUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
               }
               scanEnd1NJ17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NJ15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11NJ12( ) ;
                     /* Start of After( delete) rules */
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
      }
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NJ12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NJ12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NJ16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T01NJ16_A252CliCod[0] ;
         n252CliCod = T01NJ16_n252CliCod[0] ;
         A365DisDes = T01NJ16_A365DisDes[0] ;
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01NJ17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01NJ18 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01NJ19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01NJ20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01NJ21 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01NJ22 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01NJ23 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01NJ24 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01NJ25 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01NJ26 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01NJ27 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01NJ28 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01NJ29 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01NJ30 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01NJ31 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01NJ32 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01NJ33 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01NJ34 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01NJ35 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01NJ36 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01NJ37 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01NJ38 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01NJ39 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01NJ40 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01NJ41 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01NJ42 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01NJ43 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01NJ44 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01NJ45 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01NJ46 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01NJ47 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01NJ48 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01NJ49 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01NJ50 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01NJ51 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01NJ52 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01NJ53 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01NJ54 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01NJ55 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01NJ56 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01NJ57 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01NJ58 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01NJ59 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01NJ60 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01NJ61 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01NJ62 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01NJ63 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01NJ64 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01NJ65 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01NJ66 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01NJ67 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01NJ68 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01NJ69 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01NJ70 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01NJ71 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01NJ72 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01NJ73 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01NJ74 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01NJ75 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01NJ76 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01NJ77 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01NJ78 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
      }
   }

   public void processNestedLevel1NJ17( )
   {
      s646NotUltLin = O646NotUltLin ;
      n646NotUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1NJ17( ) ;
         if ( ( nRcdExists_17 != 0 ) || ( nIsMod_17 != 0 ) )
         {
            standaloneNotModal1NJ17( ) ;
            getKey1NJ17( ) ;
            if ( ( nRcdExists_17 == 0 ) && ( nRcdDeleted_17 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NJ17( ) ;
            }
            else
            {
               if ( RcdFound17 != 0 )
               {
                  if ( ( nRcdDeleted_17 != 0 ) && ( nRcdExists_17 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NJ17( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_17 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NJ17( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_17 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O646NotUltLin = A646NotUltLin ;
            n646NotUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
         }
         httpContext.changePostValue( edtBarNotLin_Internalname, GXutil.ltrim( localUtil.ntoc( A188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNotDsc_Internalname, GXutil.rtrim( A187BarNotDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z188BarNotLin_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z187BarNotDsc_"+sGXsfl_100_idx, GXutil.rtrim( Z187BarNotDsc)) ;
         httpContext.changePostValue( "nRcdDeleted_17_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_17_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_17_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_17 != 0 )
         {
            httpContext.changePostValue( "BARNOTLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOTDSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NJ17( ) ;
      if ( AnyError != 0 )
      {
         O646NotUltLin = s646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      }
      nRcdExists_17 = (short)(0) ;
      nIsMod_17 = (short)(0) ;
      nRcdDeleted_17 = (short)(0) ;
   }

   public void processLevel1NJ12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1NJ17( ) ;
      if ( AnyError != 0 )
      {
         O646NotUltLin = s646NotUltLin ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01NJ79 */
      pr_default.execute(77, new Object[] {Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
   }

   public void updateTablesN11NJ12( )
   {
      /* Using cursor T01NJ80 */
      pr_default.execute(78, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1NJ12( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1NJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tnotashdrs");
         if ( AnyError == 0 )
         {
            confirmValues1NJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tnotashdrs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NJ12( )
   {
      /* Scan By routine */
      /* Using cursor T01NJ81 */
      pr_default.execute(79);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01NJ81_A396EmprCod[0] ;
         n396EmprCod = T01NJ81_n396EmprCod[0] ;
         A129BarCod = T01NJ81_A129BarCod[0] ;
         n129BarCod = T01NJ81_n129BarCod[0] ;
         A132BarCodReo = T01NJ81_A132BarCodReo[0] ;
         n132BarCodReo = T01NJ81_n132BarCodReo[0] ;
         A130BarCodPar = T01NJ81_A130BarCodPar[0] ;
         n130BarCodPar = T01NJ81_n130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NJ12( )
   {
      /* Scan next routine */
      pr_default.readNext(79);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01NJ81_A396EmprCod[0] ;
         n396EmprCod = T01NJ81_n396EmprCod[0] ;
         A129BarCod = T01NJ81_A129BarCod[0] ;
         n129BarCod = T01NJ81_n129BarCod[0] ;
         A132BarCodReo = T01NJ81_A132BarCodReo[0] ;
         n132BarCodReo = T01NJ81_n132BarCodReo[0] ;
         A130BarCodPar = T01NJ81_A130BarCodPar[0] ;
         n130BarCodPar = T01NJ81_n130BarCodPar[0] ;
      }
   }

   public void scanEnd1NJ12( )
   {
      pr_default.close(79);
   }

   public void afterConfirm1NJ12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NJ12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NJ12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NJ12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NJ12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NJ12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NJ12( )
   {
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1NJ17( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z187BarNotDsc = T01NJ3_A187BarNotDsc[0] ;
         }
         else
         {
            Z187BarNotDsc = A187BarNotDsc ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z188BarNotLin = A188BarNotLin ;
         Z187BarNotDsc = A187BarNotDsc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1NJ17( )
   {
      edtBarNotLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNotLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNotLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void standaloneModal1NJ17( )
   {
      if ( isIns( )  )
      {
         A646NotUltLin = (byte)(O646NotUltLin+1) ;
         n646NotUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A188BarNotLin = A646NotUltLin ;
      }
   }

   public void load1NJ17( )
   {
      /* Using cursor T01NJ82 */
      pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin)});
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A187BarNotDsc = T01NJ82_A187BarNotDsc[0] ;
         zm1NJ17( -16) ;
      }
      pr_default.close(80);
      onLoadActions1NJ17( ) ;
   }

   public void onLoadActions1NJ17( )
   {
   }

   public void checkExtendedTable1NJ17( )
   {
      nIsDirty_17 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1NJ17( ) ;
   }

   public void closeExtendedTableCursors1NJ17( )
   {
   }

   public void enableDisable1NJ17( )
   {
   }

   public void getKey1NJ17( )
   {
      /* Using cursor T01NJ83 */
      pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin)});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound17 = (short)(1) ;
      }
      else
      {
         RcdFound17 = (short)(0) ;
      }
      pr_default.close(81);
   }

   public void getByPrimaryKey1NJ17( )
   {
      /* Using cursor T01NJ3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1NJ17( 16) ;
         RcdFound17 = (short)(1) ;
         initializeNonKey1NJ17( ) ;
         A188BarNotLin = T01NJ3_A188BarNotLin[0] ;
         A187BarNotDsc = T01NJ3_A187BarNotDsc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z188BarNotLin = A188BarNotLin ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NJ17( ) ;
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound17 = (short)(0) ;
         initializeNonKey1NJ17( ) ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NJ17( ) ;
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NJ17( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NJ17( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NJ2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARNOT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z187BarNotDsc, T01NJ2_A187BarNotDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z187BarNotDsc, T01NJ2_A187BarNotDsc[0]) != 0 )
            {
               GXutil.writeLogln("tnotashdrs:[seudo value changed for attri]"+"BarNotDsc");
               GXutil.writeLogRaw("Old: ",Z187BarNotDsc);
               GXutil.writeLogRaw("Current: ",T01NJ2_A187BarNotDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARNOT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NJ17( )
   {
      beforeValidate1NJ17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NJ17( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NJ17( 0) ;
         checkOptimisticConcurrency1NJ17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NJ17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NJ17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NJ84 */
                  pr_default.execute(82, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
                  if ( (pr_default.getStatus(82) == 1) )
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
            load1NJ17( ) ;
         }
         endLevel1NJ17( ) ;
      }
      closeExtendedTableCursors1NJ17( ) ;
   }

   public void update1NJ17( )
   {
      beforeValidate1NJ17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NJ17( ) ;
      }
      if ( ( nIsMod_17 != 0 ) || ( nIsDirty_17 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NJ17( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NJ17( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NJ17( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NJ85 */
                     pr_default.execute(83, new Object[] {A187BarNotDsc, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
                     if ( (pr_default.getStatus(83) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARNOT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NJ17( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A129BarCod ;
                        GXv_int7[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3) ;
                        tnotashdrs_impl.this.A396EmprCod = GXv_char4[0] ;
                        tnotashdrs_impl.this.A129BarCod = GXv_int6[0] ;
                        tnotashdrs_impl.this.A132BarCodReo = GXv_int7[0] ;
                        tnotashdrs_impl.this.A130BarCodPar = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NJ17( ) ;
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
            endLevel1NJ17( ) ;
         }
      }
      closeExtendedTableCursors1NJ17( ) ;
   }

   public void deferredUpdate1NJ17( )
   {
   }

   public void delete1NJ17( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NJ17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NJ17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NJ17( ) ;
         afterConfirm1NJ17( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NJ17( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NJ86 */
               pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode17 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NJ17( ) ;
      Gx_mode = sMode17 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NJ17( )
   {
      standaloneModal1NJ17( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1NJ17( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NJ17( )
   {
      /* Scan By routine */
      /* Using cursor T01NJ87 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A188BarNotLin = T01NJ87_A188BarNotLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NJ17( )
   {
      /* Scan next routine */
      pr_default.readNext(85);
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A188BarNotLin = T01NJ87_A188BarNotLin[0] ;
      }
   }

   public void scanEnd1NJ17( )
   {
      pr_default.close(85);
   }

   public void afterConfirm1NJ17( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NJ17( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NJ17( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NJ17( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NJ17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NJ17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NJ17( )
   {
      edtBarNotLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNotLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNotLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtBarNotDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNotDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNotDsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void send_integrity_lvl_hashes1NJ17( )
   {
   }

   public void send_integrity_lvl_hashes1NJ12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV46BarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV47BarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CliNom, ""))));
   }

   public void subsflControlProps_10017( )
   {
      edtBarNotLin_Internalname = "BARNOTLIN_"+sGXsfl_100_idx ;
      edtBarNotDsc_Internalname = "BARNOTDSC_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_10017( )
   {
      edtBarNotLin_Internalname = "BARNOTLIN_"+sGXsfl_100_fel_idx ;
      edtBarNotDsc_Internalname = "BARNOTDSC_"+sGXsfl_100_fel_idx ;
   }

   public void addRow1NJ17( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10017( ) ;
      sendRow1NJ17( ) ;
   }

   public void sendRow1NJ17( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "WWActionColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNotLin_Internalname,GXutil.ltrim( localUtil.ntoc( A188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNotLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A188BarNotLin), "9") : localUtil.format( DecimalUtil.doubleToDec(A188BarNotLin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNotLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarNotLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_17_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNotDsc_Internalname,GXutil.rtrim( A187BarNotDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNotDsc_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarNotDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1NJ17( ) ;
      GXCCtl = "Z188BarNotLin_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z187BarNotDsc_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z187BarNotDsc));
      GXCCtl = "nRcdDeleted_17_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_17_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_17_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_17, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vDISCOD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARSERDSC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV49BarSerDsc));
      GXCCtl = "EMPRCOD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "BARCOD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODREO_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODPAR_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOTLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOTDSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1NJ17( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10017( ) ;
      edtBarNotLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOTLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNotDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOTDSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A188BarNotLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarNotLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A187BarNotDsc = httpContext.cgiGet( edtBarNotDsc_Internalname) ;
      GXCCtl = "Z188BarNotLin_" + sGXsfl_100_idx ;
      Z188BarNotLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z187BarNotDsc_" + sGXsfl_100_idx ;
      Z187BarNotDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_17_" + sGXsfl_100_idx ;
      nRcdDeleted_17 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_17_" + sGXsfl_100_idx ;
      nRcdExists_17 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_17_" + sGXsfl_100_idx ;
      nIsMod_17 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarNotLin_Enabled = edtBarNotLin_Enabled ;
   }

   public void confirmValues1NJ0( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10017( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10017( ) ;
         httpContext.changePostValue( "Z188BarNotLin_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z188BarNotLin_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z188BarNotLin_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z187BarNotDsc_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z187BarNotDsc_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z187BarNotDsc_"+sGXsfl_100_idx) ;
      }
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV39DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarSer)),GXutil.URLEncode(GXutil.rtrim(AV42PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV43BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV47BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV48CliNom)),GXutil.URLEncode(GXutil.rtrim(AV49BarSerDsc))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV46BarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV47BarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CliNom, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TNotasHdrs");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      forbiddenHiddens.add("BarSit", localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"));
      forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tnotashdrs:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z646NotUltLin", GXutil.ltrim( localUtil.ntoc( Z646NotUltLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O646NotUltLin", GXutil.ltrim( localUtil.ntoc( O646NotUltLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV39DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV49BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NOTULTLIN", GXutil.ltrim( localUtil.ntoc( A646NotUltLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Enabled", GXutil.booltostr( Dvpanel_unnamedtable3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Enabled", GXutil.booltostr( Dvelop_confirmpanel_renumerarlinea_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_renumerarlinea_Confirmtype));
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
      return formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV39DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarSer)),GXutil.URLEncode(GXutil.rtrim(AV42PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV43BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV47BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV48CliNom)),GXutil.URLEncode(GXutil.rtrim(AV49BarSerDsc))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"})  ;
   }

   public String getPgmname( )
   {
      return "TNotasHdrs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Notas Hdrs", "") ;
   }

   public void initializeNonKey1NJ12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A646NotUltLin = (byte)(0) ;
      n646NotUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O646NotUltLin = A646NotUltLin ;
      n646NotUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z646NotUltLin = (byte)(0) ;
      Z213BarSit = (byte)(0) ;
      Z120BarAgrEst = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1NJ12( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1NJ12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NJ17( )
   {
      A187BarNotDsc = "" ;
      Z187BarNotDsc = "" ;
   }

   public void initAll1NJ17( )
   {
      A188BarNotLin = (byte)(0) ;
      initializeNonKey1NJ17( ) ;
   }

   public void standaloneModalInsert1NJ17( )
   {
      A646NotUltLin = i646NotUltLin ;
      n646NotUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646NotUltLin", GXutil.str( A646NotUltLin, 1, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211675431", true, true);
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
      httpContext.AddJavascriptSource("tnotashdrs.js", "?20268211675432", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties17( )
   {
      edtBarNotLin_Enabled = defedtBarNotLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNotLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNotLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void startgridcontrol100( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A188BarNotLin, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A187BarNotDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNotDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtntipospresentacion_Internalname = "BTNTIPOSPRESENTACION" ;
      bttBtnrenumerarlinea_Internalname = "BTNRENUMERARLINEA" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtBarNotLin_Internalname = "BARNOTLIN" ;
      edtBarNotDsc_Internalname = "BARNOTDSC" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_renumerarlinea_Internalname = "DVELOP_CONFIRMPANEL_RENUMERARLINEA" ;
      tblTabledvelop_confirmpanel_renumerarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_RENUMERARLINEA" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Notas Hdrs", "") );
      edtBarNotDsc_Jsonclick = "" ;
      edtBarNotLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtBarNotDsc_Enabled = 1 ;
      edtBarNotLin_Enabled = 0 ;
      Dvelop_confirmpanel_renumerarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_renumerarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_renumerarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_renumerarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_renumerarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_renumerarlinea_Confirmationtext = "¿Deseas renumerar las lineas?" ;
      Dvelop_confirmpanel_renumerarlinea_Title = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtnrenumerarlinea_Visible = 1 ;
      bttBtntipospresentacion_Visible = 1 ;
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
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_10017( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NJ17( ) ;
         standaloneModal1NJ17( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NJ17( ) ;
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10017( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV39DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV41BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV45BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV46BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV47BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV48CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV49BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV49BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV41BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV45BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV46BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV47BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV48CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e141NJ2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOTIPOSPRESENTACION'","{handler:'e151NJ2',iparms:[{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV41BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV45BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV46BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV47BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV48CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV49BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true}]");
      setEventMetadata("'DOTIPOSPRESENTACION'",",oparms:[{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORENUMERARLINEA'","{handler:'e111NJ12',iparms:[]");
      setEventMetadata("'DORENUMERARLINEA'",",oparms:[{av:'Dvelop_confirmpanel_renumerarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_RENUMERARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RENUMERARLINEA.CLOSE","{handler:'e131NJ2',iparms:[{av:'Dvelop_confirmpanel_renumerarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_RENUMERARLINEA',prop:'Result'},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV41BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV45BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV46BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV47BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV48CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV49BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RENUMERARLINEA.CLOSE",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARNOTLIN","{handler:'valid_Barnotlin',iparms:[]");
      setEventMetadata("VALID_BARNOTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barnotdsc',iparms:[]");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV35BarCodPar = "" ;
      wcpOAV41BarSer = "" ;
      wcpOAV42PedidoCliente = "" ;
      wcpOAV43BarColNom = "" ;
      wcpOAV46BarKgm = DecimalUtil.ZERO ;
      wcpOAV47BarMtr = DecimalUtil.ZERO ;
      wcpOAV48CliNom = "" ;
      wcpOAV49BarSerDsc = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z120BarAgrEst = "" ;
      Dvelop_confirmpanel_renumerarlinea_Result = "" ;
      Z187BarNotDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV35BarCodPar = "" ;
      AV41BarSer = "" ;
      AV42PedidoCliente = "" ;
      AV43BarColNom = "" ;
      AV46BarKgm = DecimalUtil.ZERO ;
      AV47BarMtr = DecimalUtil.ZERO ;
      AV48CliNom = "" ;
      AV49BarSerDsc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtntipospresentacion_Jsonclick = "" ;
      bttBtnrenumerarlinea_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV51Pgmname = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_renumerarlinea = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode17 = "" ;
      GX_FocusControl = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A130BarCodPar = "" ;
      A407EmprNom = "" ;
      A365DisDes = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvelop_confirmpanel_renumerarlinea_Objectcall = "" ;
      Dvelop_confirmpanel_renumerarlinea_Width = "" ;
      Dvelop_confirmpanel_renumerarlinea_Height = "" ;
      Dvelop_confirmpanel_renumerarlinea_Class = "" ;
      Dvelop_confirmpanel_renumerarlinea_Comment = "" ;
      Dvelop_confirmpanel_renumerarlinea_Bodytype = "" ;
      Dvelop_confirmpanel_renumerarlinea_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_renumerarlinea_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode12 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A187BarNotDsc = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV36WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV38WebSession = httpContext.getWebSession();
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T01NJ6_A407EmprNom = new String[] {""} ;
      T01NJ6_n407EmprNom = new boolean[] {false} ;
      T01NJ8_A361DisCod = new int[1] ;
      T01NJ8_A2759BarMaqGru = new String[] {""} ;
      T01NJ8_A129BarCod = new int[1] ;
      T01NJ8_n129BarCod = new boolean[] {false} ;
      T01NJ8_A132BarCodReo = new byte[1] ;
      T01NJ8_n132BarCodReo = new boolean[] {false} ;
      T01NJ8_A130BarCodPar = new String[] {""} ;
      T01NJ8_n130BarCodPar = new boolean[] {false} ;
      T01NJ8_A180BarMaqCod = new String[] {""} ;
      T01NJ8_A646NotUltLin = new byte[1] ;
      T01NJ8_n646NotUltLin = new boolean[] {false} ;
      T01NJ8_A213BarSit = new byte[1] ;
      T01NJ8_A120BarAgrEst = new String[] {""} ;
      T01NJ8_A407EmprNom = new String[] {""} ;
      T01NJ8_n407EmprNom = new boolean[] {false} ;
      T01NJ8_A252CliCod = new int[1] ;
      T01NJ8_n252CliCod = new boolean[] {false} ;
      T01NJ8_A365DisDes = new String[] {""} ;
      T01NJ8_A396EmprCod = new String[] {""} ;
      T01NJ8_n396EmprCod = new boolean[] {false} ;
      T01NJ7_A252CliCod = new int[1] ;
      T01NJ7_n252CliCod = new boolean[] {false} ;
      T01NJ7_A365DisDes = new String[] {""} ;
      T01NJ9_A252CliCod = new int[1] ;
      T01NJ9_n252CliCod = new boolean[] {false} ;
      T01NJ9_A365DisDes = new String[] {""} ;
      T01NJ10_A396EmprCod = new String[] {""} ;
      T01NJ10_n396EmprCod = new boolean[] {false} ;
      T01NJ10_A129BarCod = new int[1] ;
      T01NJ10_n129BarCod = new boolean[] {false} ;
      T01NJ10_A132BarCodReo = new byte[1] ;
      T01NJ10_n132BarCodReo = new boolean[] {false} ;
      T01NJ10_A130BarCodPar = new String[] {""} ;
      T01NJ10_n130BarCodPar = new boolean[] {false} ;
      T01NJ5_A361DisCod = new int[1] ;
      T01NJ5_A2759BarMaqGru = new String[] {""} ;
      T01NJ5_A129BarCod = new int[1] ;
      T01NJ5_n129BarCod = new boolean[] {false} ;
      T01NJ5_A132BarCodReo = new byte[1] ;
      T01NJ5_n132BarCodReo = new boolean[] {false} ;
      T01NJ5_A130BarCodPar = new String[] {""} ;
      T01NJ5_n130BarCodPar = new boolean[] {false} ;
      T01NJ5_A180BarMaqCod = new String[] {""} ;
      T01NJ5_A646NotUltLin = new byte[1] ;
      T01NJ5_n646NotUltLin = new boolean[] {false} ;
      T01NJ5_A213BarSit = new byte[1] ;
      T01NJ5_A120BarAgrEst = new String[] {""} ;
      T01NJ5_A396EmprCod = new String[] {""} ;
      T01NJ5_n396EmprCod = new boolean[] {false} ;
      T01NJ5_A252CliCod = new int[1] ;
      T01NJ5_n252CliCod = new boolean[] {false} ;
      T01NJ5_A365DisDes = new String[] {""} ;
      T01NJ11_A396EmprCod = new String[] {""} ;
      T01NJ11_n396EmprCod = new boolean[] {false} ;
      T01NJ11_A129BarCod = new int[1] ;
      T01NJ11_n129BarCod = new boolean[] {false} ;
      T01NJ11_A132BarCodReo = new byte[1] ;
      T01NJ11_n132BarCodReo = new boolean[] {false} ;
      T01NJ11_A130BarCodPar = new String[] {""} ;
      T01NJ11_n130BarCodPar = new boolean[] {false} ;
      T01NJ12_A396EmprCod = new String[] {""} ;
      T01NJ12_n396EmprCod = new boolean[] {false} ;
      T01NJ12_A129BarCod = new int[1] ;
      T01NJ12_n129BarCod = new boolean[] {false} ;
      T01NJ12_A132BarCodReo = new byte[1] ;
      T01NJ12_n132BarCodReo = new boolean[] {false} ;
      T01NJ12_A130BarCodPar = new String[] {""} ;
      T01NJ12_n130BarCodPar = new boolean[] {false} ;
      T01NJ4_A361DisCod = new int[1] ;
      T01NJ4_A2759BarMaqGru = new String[] {""} ;
      T01NJ4_A129BarCod = new int[1] ;
      T01NJ4_n129BarCod = new boolean[] {false} ;
      T01NJ4_A132BarCodReo = new byte[1] ;
      T01NJ4_n132BarCodReo = new boolean[] {false} ;
      T01NJ4_A130BarCodPar = new String[] {""} ;
      T01NJ4_n130BarCodPar = new boolean[] {false} ;
      T01NJ4_A180BarMaqCod = new String[] {""} ;
      T01NJ4_A646NotUltLin = new byte[1] ;
      T01NJ4_n646NotUltLin = new boolean[] {false} ;
      T01NJ4_A213BarSit = new byte[1] ;
      T01NJ4_A120BarAgrEst = new String[] {""} ;
      T01NJ4_A396EmprCod = new String[] {""} ;
      T01NJ4_n396EmprCod = new boolean[] {false} ;
      T01NJ4_A252CliCod = new int[1] ;
      T01NJ4_n252CliCod = new boolean[] {false} ;
      T01NJ4_A365DisDes = new String[] {""} ;
      T01NJ16_A252CliCod = new int[1] ;
      T01NJ16_n252CliCod = new boolean[] {false} ;
      T01NJ16_A365DisDes = new String[] {""} ;
      T01NJ17_A14681MRPrId = new long[1] ;
      T01NJ18_A5921XCjaDis = new String[] {""} ;
      T01NJ18_A5922XCjaCod = new long[1] ;
      T01NJ19_A396EmprCod = new String[] {""} ;
      T01NJ19_n396EmprCod = new boolean[] {false} ;
      T01NJ19_A129BarCod = new int[1] ;
      T01NJ19_n129BarCod = new boolean[] {false} ;
      T01NJ19_A132BarCodReo = new byte[1] ;
      T01NJ19_n132BarCodReo = new boolean[] {false} ;
      T01NJ19_A130BarCodPar = new String[] {""} ;
      T01NJ19_n130BarCodPar = new boolean[] {false} ;
      T01NJ19_A14152MEnvOrd = new short[1] ;
      T01NJ20_A396EmprCod = new String[] {""} ;
      T01NJ20_n396EmprCod = new boolean[] {false} ;
      T01NJ20_A129BarCod = new int[1] ;
      T01NJ20_n129BarCod = new boolean[] {false} ;
      T01NJ20_A132BarCodReo = new byte[1] ;
      T01NJ20_n132BarCodReo = new boolean[] {false} ;
      T01NJ20_A130BarCodPar = new String[] {""} ;
      T01NJ20_n130BarCodPar = new boolean[] {false} ;
      T01NJ20_A13905BarTraID = new String[] {""} ;
      T01NJ21_A396EmprCod = new String[] {""} ;
      T01NJ21_n396EmprCod = new boolean[] {false} ;
      T01NJ21_A129BarCod = new int[1] ;
      T01NJ21_n129BarCod = new boolean[] {false} ;
      T01NJ21_A132BarCodReo = new byte[1] ;
      T01NJ21_n132BarCodReo = new boolean[] {false} ;
      T01NJ21_A130BarCodPar = new String[] {""} ;
      T01NJ21_n130BarCodPar = new boolean[] {false} ;
      T01NJ21_A13093BarDGLin = new byte[1] ;
      T01NJ21_A13094BarDGDibCl = new String[] {""} ;
      T01NJ21_A13095BarDGDibIn = new int[1] ;
      T01NJ21_A13096BarDGComb = new String[] {""} ;
      T01NJ21_A13097BarDGFOndo = new String[] {""} ;
      T01NJ22_A396EmprCod = new String[] {""} ;
      T01NJ22_n396EmprCod = new boolean[] {false} ;
      T01NJ22_A11917Ebd_numero = new int[1] ;
      T01NJ23_A396EmprCod = new String[] {""} ;
      T01NJ23_n396EmprCod = new boolean[] {false} ;
      T01NJ23_A11898Prd_numero = new int[1] ;
      T01NJ24_A396EmprCod = new String[] {""} ;
      T01NJ24_n396EmprCod = new boolean[] {false} ;
      T01NJ24_A11849Cte_numero = new int[1] ;
      T01NJ25_A396EmprCod = new String[] {""} ;
      T01NJ25_n396EmprCod = new boolean[] {false} ;
      T01NJ25_A11791Ap_numero = new int[1] ;
      T01NJ26_A396EmprCod = new String[] {""} ;
      T01NJ26_n396EmprCod = new boolean[] {false} ;
      T01NJ26_A3985CalBarCod = new int[1] ;
      T01NJ26_A3986CalBarCodR = new byte[1] ;
      T01NJ26_A3987CalBarCodP = new String[] {""} ;
      T01NJ27_A396EmprCod = new String[] {""} ;
      T01NJ27_n396EmprCod = new boolean[] {false} ;
      T01NJ27_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01NJ27_A652OpeCod = new int[1] ;
      T01NJ28_A396EmprCod = new String[] {""} ;
      T01NJ28_n396EmprCod = new boolean[] {false} ;
      T01NJ28_A129BarCod = new int[1] ;
      T01NJ28_n129BarCod = new boolean[] {false} ;
      T01NJ28_A132BarCodReo = new byte[1] ;
      T01NJ28_n132BarCodReo = new boolean[] {false} ;
      T01NJ28_A130BarCodPar = new String[] {""} ;
      T01NJ28_n130BarCodPar = new boolean[] {false} ;
      T01NJ28_A4118tinagrcod = new int[1] ;
      T01NJ28_A4119tinagrreo = new byte[1] ;
      T01NJ28_A4120tinagrpar = new String[] {""} ;
      T01NJ29_A396EmprCod = new String[] {""} ;
      T01NJ29_n396EmprCod = new boolean[] {false} ;
      T01NJ29_A129BarCod = new int[1] ;
      T01NJ29_n129BarCod = new boolean[] {false} ;
      T01NJ29_A132BarCodReo = new byte[1] ;
      T01NJ29_n132BarCodReo = new boolean[] {false} ;
      T01NJ29_A130BarCodPar = new String[] {""} ;
      T01NJ29_n130BarCodPar = new boolean[] {false} ;
      T01NJ29_A4080estagrcod = new int[1] ;
      T01NJ29_A4081estagrreo = new byte[1] ;
      T01NJ29_A4082estagrpar = new String[] {""} ;
      T01NJ30_A396EmprCod = new String[] {""} ;
      T01NJ30_n396EmprCod = new boolean[] {false} ;
      T01NJ30_A129BarCod = new int[1] ;
      T01NJ30_n129BarCod = new boolean[] {false} ;
      T01NJ30_A132BarCodReo = new byte[1] ;
      T01NJ30_n132BarCodReo = new boolean[] {false} ;
      T01NJ30_A130BarCodPar = new String[] {""} ;
      T01NJ30_n130BarCodPar = new boolean[] {false} ;
      T01NJ30_A4075recestncol = new byte[1] ;
      T01NJ30_A4076recestnpro = new byte[1] ;
      T01NJ31_A396EmprCod = new String[] {""} ;
      T01NJ31_n396EmprCod = new boolean[] {false} ;
      T01NJ31_A602MaqCod = new String[] {""} ;
      T01NJ31_A1142MaqFCod = new String[] {""} ;
      T01NJ31_A3068PlaEtaOrd = new short[1] ;
      T01NJ31_A3069PlaEtaOrdA = new byte[1] ;
      T01NJ31_A129BarCod = new int[1] ;
      T01NJ31_n129BarCod = new boolean[] {false} ;
      T01NJ31_A132BarCodReo = new byte[1] ;
      T01NJ31_n132BarCodReo = new boolean[] {false} ;
      T01NJ31_A130BarCodPar = new String[] {""} ;
      T01NJ31_n130BarCodPar = new boolean[] {false} ;
      T01NJ32_A396EmprCod = new String[] {""} ;
      T01NJ32_n396EmprCod = new boolean[] {false} ;
      T01NJ32_A129BarCod = new int[1] ;
      T01NJ32_n129BarCod = new boolean[] {false} ;
      T01NJ32_A132BarCodReo = new byte[1] ;
      T01NJ32_n132BarCodReo = new boolean[] {false} ;
      T01NJ32_A130BarCodPar = new String[] {""} ;
      T01NJ32_n130BarCodPar = new boolean[] {false} ;
      T01NJ32_A4846BarAudLin = new short[1] ;
      T01NJ33_A396EmprCod = new String[] {""} ;
      T01NJ33_n396EmprCod = new boolean[] {false} ;
      T01NJ33_A129BarCod = new int[1] ;
      T01NJ33_n129BarCod = new boolean[] {false} ;
      T01NJ33_A132BarCodReo = new byte[1] ;
      T01NJ33_n132BarCodReo = new boolean[] {false} ;
      T01NJ33_A130BarCodPar = new String[] {""} ;
      T01NJ33_n130BarCodPar = new boolean[] {false} ;
      T01NJ33_A3940BarEnsLin = new short[1] ;
      T01NJ34_A396EmprCod = new String[] {""} ;
      T01NJ34_n396EmprCod = new boolean[] {false} ;
      T01NJ34_A129BarCod = new int[1] ;
      T01NJ34_n129BarCod = new boolean[] {false} ;
      T01NJ34_A132BarCodReo = new byte[1] ;
      T01NJ34_n132BarCodReo = new boolean[] {false} ;
      T01NJ34_A130BarCodPar = new String[] {""} ;
      T01NJ34_n130BarCodPar = new boolean[] {false} ;
      T01NJ34_A3384RefBarCod = new int[1] ;
      T01NJ34_A3385RefBarReo = new byte[1] ;
      T01NJ34_A3386RefBarPar = new String[] {""} ;
      T01NJ35_A396EmprCod = new String[] {""} ;
      T01NJ35_n396EmprCod = new boolean[] {false} ;
      T01NJ35_A10914SolSalCod = new int[1] ;
      T01NJ36_A396EmprCod = new String[] {""} ;
      T01NJ36_n396EmprCod = new boolean[] {false} ;
      T01NJ36_A10364Ph_numero = new int[1] ;
      T01NJ37_A396EmprCod = new String[] {""} ;
      T01NJ37_n396EmprCod = new boolean[] {false} ;
      T01NJ37_A129BarCod = new int[1] ;
      T01NJ37_n129BarCod = new boolean[] {false} ;
      T01NJ37_A132BarCodReo = new byte[1] ;
      T01NJ37_n132BarCodReo = new boolean[] {false} ;
      T01NJ37_A130BarCodPar = new String[] {""} ;
      T01NJ37_n130BarCodPar = new boolean[] {false} ;
      T01NJ37_A10197ProEspCod = new String[] {""} ;
      T01NJ38_A396EmprCod = new String[] {""} ;
      T01NJ38_n396EmprCod = new boolean[] {false} ;
      T01NJ38_A129BarCod = new int[1] ;
      T01NJ38_n129BarCod = new boolean[] {false} ;
      T01NJ38_A132BarCodReo = new byte[1] ;
      T01NJ38_n132BarCodReo = new boolean[] {false} ;
      T01NJ38_A130BarCodPar = new String[] {""} ;
      T01NJ38_n130BarCodPar = new boolean[] {false} ;
      T01NJ38_A5322Dp_Nrecep = new int[1] ;
      T01NJ39_A396EmprCod = new String[] {""} ;
      T01NJ39_n396EmprCod = new boolean[] {false} ;
      T01NJ39_A129BarCod = new int[1] ;
      T01NJ39_n129BarCod = new boolean[] {false} ;
      T01NJ39_A132BarCodReo = new byte[1] ;
      T01NJ39_n132BarCodReo = new boolean[] {false} ;
      T01NJ39_A130BarCodPar = new String[] {""} ;
      T01NJ39_n130BarCodPar = new boolean[] {false} ;
      T01NJ39_A8569EntSecLn = new int[1] ;
      T01NJ40_A396EmprCod = new String[] {""} ;
      T01NJ40_n396EmprCod = new boolean[] {false} ;
      T01NJ40_A7434PLLNro = new int[1] ;
      T01NJ40_A7443LPLNro = new short[1] ;
      T01NJ40_A7459CPLCom = new short[1] ;
      T01NJ40_A129BarCod = new int[1] ;
      T01NJ40_n129BarCod = new boolean[] {false} ;
      T01NJ40_A132BarCodReo = new byte[1] ;
      T01NJ40_n132BarCodReo = new boolean[] {false} ;
      T01NJ40_A130BarCodPar = new String[] {""} ;
      T01NJ40_n130BarCodPar = new boolean[] {false} ;
      T01NJ41_A396EmprCod = new String[] {""} ;
      T01NJ41_n396EmprCod = new boolean[] {false} ;
      T01NJ41_A7145OSSCod = new int[1] ;
      T01NJ42_A396EmprCod = new String[] {""} ;
      T01NJ42_n396EmprCod = new boolean[] {false} ;
      T01NJ42_A7049OGSCod = new int[1] ;
      T01NJ43_A396EmprCod = new String[] {""} ;
      T01NJ43_n396EmprCod = new boolean[] {false} ;
      T01NJ43_A129BarCod = new int[1] ;
      T01NJ43_n129BarCod = new boolean[] {false} ;
      T01NJ43_A132BarCodReo = new byte[1] ;
      T01NJ43_n132BarCodReo = new boolean[] {false} ;
      T01NJ43_A130BarCodPar = new String[] {""} ;
      T01NJ43_n130BarCodPar = new boolean[] {false} ;
      T01NJ43_A6031Ac_Barcod = new int[1] ;
      T01NJ43_A6032Ac_BarReo = new byte[1] ;
      T01NJ43_A6033Ac_BarPar = new String[] {""} ;
      T01NJ44_A396EmprCod = new String[] {""} ;
      T01NJ44_n396EmprCod = new boolean[] {false} ;
      T01NJ44_A129BarCod = new int[1] ;
      T01NJ44_n129BarCod = new boolean[] {false} ;
      T01NJ44_A132BarCodReo = new byte[1] ;
      T01NJ44_n132BarCodReo = new boolean[] {false} ;
      T01NJ44_A130BarCodPar = new String[] {""} ;
      T01NJ44_n130BarCodPar = new boolean[] {false} ;
      T01NJ44_A5908PartPal = new int[1] ;
      T01NJ45_A396EmprCod = new String[] {""} ;
      T01NJ45_n396EmprCod = new boolean[] {false} ;
      T01NJ45_A129BarCod = new int[1] ;
      T01NJ45_n129BarCod = new boolean[] {false} ;
      T01NJ45_A132BarCodReo = new byte[1] ;
      T01NJ45_n132BarCodReo = new boolean[] {false} ;
      T01NJ45_A130BarCodPar = new String[] {""} ;
      T01NJ45_n130BarCodPar = new boolean[] {false} ;
      T01NJ45_A2524DisComLin = new byte[1] ;
      T01NJ45_A1056DisComCod = new String[] {""} ;
      T01NJ45_A1032FonCod = new String[] {""} ;
      T01NJ46_A396EmprCod = new String[] {""} ;
      T01NJ46_n396EmprCod = new boolean[] {false} ;
      T01NJ46_A1736AlbExtCod = new long[1] ;
      T01NJ46_A129BarCod = new int[1] ;
      T01NJ46_n129BarCod = new boolean[] {false} ;
      T01NJ46_A132BarCodReo = new byte[1] ;
      T01NJ46_n132BarCodReo = new boolean[] {false} ;
      T01NJ46_A130BarCodPar = new String[] {""} ;
      T01NJ46_n130BarCodPar = new boolean[] {false} ;
      T01NJ47_A396EmprCod = new String[] {""} ;
      T01NJ47_n396EmprCod = new boolean[] {false} ;
      T01NJ47_A129BarCod = new int[1] ;
      T01NJ47_n129BarCod = new boolean[] {false} ;
      T01NJ47_A132BarCodReo = new byte[1] ;
      T01NJ47_n132BarCodReo = new boolean[] {false} ;
      T01NJ47_A130BarCodPar = new String[] {""} ;
      T01NJ47_n130BarCodPar = new boolean[] {false} ;
      T01NJ47_A3753BarFoaCod = new int[1] ;
      T01NJ47_A3754BarFoaReo = new byte[1] ;
      T01NJ47_A3755BarFoaPar = new String[] {""} ;
      T01NJ48_A396EmprCod = new String[] {""} ;
      T01NJ48_n396EmprCod = new boolean[] {false} ;
      T01NJ48_A129BarCod = new int[1] ;
      T01NJ48_n129BarCod = new boolean[] {false} ;
      T01NJ48_A132BarCodReo = new byte[1] ;
      T01NJ48_n132BarCodReo = new boolean[] {false} ;
      T01NJ48_A130BarCodPar = new String[] {""} ;
      T01NJ48_n130BarCodPar = new boolean[] {false} ;
      T01NJ48_A3747BarPegCod = new int[1] ;
      T01NJ48_A3748BarPegReo = new byte[1] ;
      T01NJ48_A3749BarPegPar = new String[] {""} ;
      T01NJ49_A396EmprCod = new String[] {""} ;
      T01NJ49_n396EmprCod = new boolean[] {false} ;
      T01NJ49_A3253SolTraCod = new int[1] ;
      T01NJ50_A396EmprCod = new String[] {""} ;
      T01NJ50_n396EmprCod = new boolean[] {false} ;
      T01NJ50_A3235SolSubCod = new int[1] ;
      T01NJ51_A396EmprCod = new String[] {""} ;
      T01NJ51_n396EmprCod = new boolean[] {false} ;
      T01NJ51_A3218SolLuzCod = new int[1] ;
      T01NJ52_A396EmprCod = new String[] {""} ;
      T01NJ52_n396EmprCod = new boolean[] {false} ;
      T01NJ52_A3196SolFriCod = new int[1] ;
      T01NJ53_A396EmprCod = new String[] {""} ;
      T01NJ53_n396EmprCod = new boolean[] {false} ;
      T01NJ53_A3165SolPilCod = new int[1] ;
      T01NJ54_A396EmprCod = new String[] {""} ;
      T01NJ54_n396EmprCod = new boolean[] {false} ;
      T01NJ54_A129BarCod = new int[1] ;
      T01NJ54_n129BarCod = new boolean[] {false} ;
      T01NJ54_A132BarCodReo = new byte[1] ;
      T01NJ54_n132BarCodReo = new boolean[] {false} ;
      T01NJ54_A130BarCodPar = new String[] {""} ;
      T01NJ54_n130BarCodPar = new boolean[] {false} ;
      T01NJ54_A2872HAnRLinMaq = new short[1] ;
      T01NJ54_A2873HAnRLinPro = new byte[1] ;
      T01NJ54_A2874HAnRLin = new short[1] ;
      T01NJ54_A2875HAnNumAny = new byte[1] ;
      T01NJ55_A396EmprCod = new String[] {""} ;
      T01NJ55_n396EmprCod = new boolean[] {false} ;
      T01NJ55_A2817PlaTer = new String[] {""} ;
      T01NJ55_A2818PlaOrd = new short[1] ;
      T01NJ56_A396EmprCod = new String[] {""} ;
      T01NJ56_n396EmprCod = new boolean[] {false} ;
      T01NJ56_A2809MetTerCod = new String[] {""} ;
      T01NJ56_A129BarCod = new int[1] ;
      T01NJ56_n129BarCod = new boolean[] {false} ;
      T01NJ56_A132BarCodReo = new byte[1] ;
      T01NJ56_n132BarCodReo = new boolean[] {false} ;
      T01NJ56_A130BarCodPar = new String[] {""} ;
      T01NJ56_n130BarCodPar = new boolean[] {false} ;
      T01NJ57_A396EmprCod = new String[] {""} ;
      T01NJ57_n396EmprCod = new boolean[] {false} ;
      T01NJ57_A129BarCod = new int[1] ;
      T01NJ57_n129BarCod = new boolean[] {false} ;
      T01NJ57_A132BarCodReo = new byte[1] ;
      T01NJ57_n132BarCodReo = new boolean[] {false} ;
      T01NJ57_A130BarCodPar = new String[] {""} ;
      T01NJ57_n130BarCodPar = new boolean[] {false} ;
      T01NJ57_A2808RecLinMAL = new short[1] ;
      T01NJ57_A1377RecNumAny = new byte[1] ;
      T01NJ57_A719PrdNum = new String[] {""} ;
      T01NJ58_A396EmprCod = new String[] {""} ;
      T01NJ58_n396EmprCod = new boolean[] {false} ;
      T01NJ58_A129BarCod = new int[1] ;
      T01NJ58_n129BarCod = new boolean[] {false} ;
      T01NJ58_A132BarCodReo = new byte[1] ;
      T01NJ58_n132BarCodReo = new boolean[] {false} ;
      T01NJ58_A130BarCodPar = new String[] {""} ;
      T01NJ58_n130BarCodPar = new boolean[] {false} ;
      T01NJ58_A2804RecLinMaq = new short[1] ;
      T01NJ59_A396EmprCod = new String[] {""} ;
      T01NJ59_n396EmprCod = new boolean[] {false} ;
      T01NJ59_A2792TermiCod = new String[] {""} ;
      T01NJ59_A129BarCod = new int[1] ;
      T01NJ59_n129BarCod = new boolean[] {false} ;
      T01NJ59_A132BarCodReo = new byte[1] ;
      T01NJ59_n132BarCodReo = new boolean[] {false} ;
      T01NJ59_A130BarCodPar = new String[] {""} ;
      T01NJ59_n130BarCodPar = new boolean[] {false} ;
      T01NJ60_A396EmprCod = new String[] {""} ;
      T01NJ60_n396EmprCod = new boolean[] {false} ;
      T01NJ60_A2248ManCod = new short[1] ;
      T01NJ60_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01NJ60_A2713RpExHdLi = new short[1] ;
      T01NJ61_A396EmprCod = new String[] {""} ;
      T01NJ61_n396EmprCod = new boolean[] {false} ;
      T01NJ61_A2248ManCod = new short[1] ;
      T01NJ61_A2689ExHdrFas = new String[] {""} ;
      T01NJ61_A2692ExHdrLin = new int[1] ;
      T01NJ62_A396EmprCod = new String[] {""} ;
      T01NJ62_n396EmprCod = new boolean[] {false} ;
      T01NJ62_A129BarCod = new int[1] ;
      T01NJ62_n129BarCod = new boolean[] {false} ;
      T01NJ62_A132BarCodReo = new byte[1] ;
      T01NJ62_n132BarCodReo = new boolean[] {false} ;
      T01NJ62_A130BarCodPar = new String[] {""} ;
      T01NJ62_n130BarCodPar = new boolean[] {false} ;
      T01NJ62_A2494BarDosPro = new String[] {""} ;
      T01NJ62_A719PrdNum = new String[] {""} ;
      T01NJ63_A396EmprCod = new String[] {""} ;
      T01NJ63_n396EmprCod = new boolean[] {false} ;
      T01NJ63_A602MaqCod = new String[] {""} ;
      T01NJ63_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01NJ63_A129BarCod = new int[1] ;
      T01NJ63_n129BarCod = new boolean[] {false} ;
      T01NJ63_A132BarCodReo = new byte[1] ;
      T01NJ63_n132BarCodReo = new boolean[] {false} ;
      T01NJ63_A130BarCodPar = new String[] {""} ;
      T01NJ63_n130BarCodPar = new boolean[] {false} ;
      T01NJ64_A396EmprCod = new String[] {""} ;
      T01NJ64_n396EmprCod = new boolean[] {false} ;
      T01NJ64_A129BarCod = new int[1] ;
      T01NJ64_n129BarCod = new boolean[] {false} ;
      T01NJ64_A132BarCodReo = new byte[1] ;
      T01NJ64_n132BarCodReo = new boolean[] {false} ;
      T01NJ64_A130BarCodPar = new String[] {""} ;
      T01NJ64_n130BarCodPar = new boolean[] {false} ;
      T01NJ64_A2457BarObLin = new short[1] ;
      T01NJ65_A396EmprCod = new String[] {""} ;
      T01NJ65_n396EmprCod = new boolean[] {false} ;
      T01NJ65_A129BarCod = new int[1] ;
      T01NJ65_n129BarCod = new boolean[] {false} ;
      T01NJ65_A132BarCodReo = new byte[1] ;
      T01NJ65_n132BarCodReo = new boolean[] {false} ;
      T01NJ65_A130BarCodPar = new String[] {""} ;
      T01NJ65_n130BarCodPar = new boolean[] {false} ;
      T01NJ65_A2444BarEnLin = new short[1] ;
      T01NJ66_A396EmprCod = new String[] {""} ;
      T01NJ66_n396EmprCod = new boolean[] {false} ;
      T01NJ66_A2406ExhAlbCod = new int[1] ;
      T01NJ66_A129BarCod = new int[1] ;
      T01NJ66_n129BarCod = new boolean[] {false} ;
      T01NJ66_A132BarCodReo = new byte[1] ;
      T01NJ66_n132BarCodReo = new boolean[] {false} ;
      T01NJ66_A130BarCodPar = new String[] {""} ;
      T01NJ66_n130BarCodPar = new boolean[] {false} ;
      T01NJ67_A396EmprCod = new String[] {""} ;
      T01NJ67_n396EmprCod = new boolean[] {false} ;
      T01NJ67_A2253SalExtAlb = new int[1] ;
      T01NJ67_A129BarCod = new int[1] ;
      T01NJ67_n129BarCod = new boolean[] {false} ;
      T01NJ67_A132BarCodReo = new byte[1] ;
      T01NJ67_n132BarCodReo = new boolean[] {false} ;
      T01NJ67_A130BarCodPar = new String[] {""} ;
      T01NJ67_n130BarCodPar = new boolean[] {false} ;
      T01NJ68_A396EmprCod = new String[] {""} ;
      T01NJ68_n396EmprCod = new boolean[] {false} ;
      T01NJ68_A30AlbProCod = new long[1] ;
      T01NJ68_A129BarCod = new int[1] ;
      T01NJ68_n129BarCod = new boolean[] {false} ;
      T01NJ68_A132BarCodReo = new byte[1] ;
      T01NJ68_n132BarCodReo = new boolean[] {false} ;
      T01NJ68_A130BarCodPar = new String[] {""} ;
      T01NJ68_n130BarCodPar = new boolean[] {false} ;
      T01NJ69_A396EmprCod = new String[] {""} ;
      T01NJ69_n396EmprCod = new boolean[] {false} ;
      T01NJ69_A1348SolColCod = new int[1] ;
      T01NJ70_A396EmprCod = new String[] {""} ;
      T01NJ70_n396EmprCod = new boolean[] {false} ;
      T01NJ70_A1333EstDimCod = new int[1] ;
      T01NJ71_A396EmprCod = new String[] {""} ;
      T01NJ71_n396EmprCod = new boolean[] {false} ;
      T01NJ71_A1314EnsLabCod = new int[1] ;
      T01NJ72_A396EmprCod = new String[] {""} ;
      T01NJ72_n396EmprCod = new boolean[] {false} ;
      T01NJ72_A129BarCod = new int[1] ;
      T01NJ72_n129BarCod = new boolean[] {false} ;
      T01NJ72_A132BarCodReo = new byte[1] ;
      T01NJ72_n132BarCodReo = new boolean[] {false} ;
      T01NJ72_A130BarCodPar = new String[] {""} ;
      T01NJ72_n130BarCodPar = new boolean[] {false} ;
      T01NJ72_A906ObsReoLin = new byte[1] ;
      T01NJ73_A396EmprCod = new String[] {""} ;
      T01NJ73_n396EmprCod = new boolean[] {false} ;
      T01NJ73_A859CumCodCont = new int[1] ;
      T01NJ74_A396EmprCod = new String[] {""} ;
      T01NJ74_n396EmprCod = new boolean[] {false} ;
      T01NJ74_A602MaqCod = new String[] {""} ;
      T01NJ74_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01NJ74_A561HisProLin = new int[1] ;
      T01NJ75_A396EmprCod = new String[] {""} ;
      T01NJ75_n396EmprCod = new boolean[] {false} ;
      T01NJ75_A252CliCod = new int[1] ;
      T01NJ75_n252CliCod = new boolean[] {false} ;
      T01NJ75_A494ForSer = new String[] {""} ;
      T01NJ75_A482ForColNom = new String[] {""} ;
      T01NJ75_A483ForColNum = new int[1] ;
      T01NJ75_A831TipColCod = new byte[1] ;
      T01NJ76_A396EmprCod = new String[] {""} ;
      T01NJ76_n396EmprCod = new boolean[] {false} ;
      T01NJ76_A129BarCod = new int[1] ;
      T01NJ76_n129BarCod = new boolean[] {false} ;
      T01NJ76_A132BarCodReo = new byte[1] ;
      T01NJ76_n132BarCodReo = new boolean[] {false} ;
      T01NJ76_A130BarCodPar = new String[] {""} ;
      T01NJ76_n130BarCodPar = new boolean[] {false} ;
      T01NJ76_A200BarPieCod = new String[] {""} ;
      T01NJ77_A396EmprCod = new String[] {""} ;
      T01NJ77_n396EmprCod = new boolean[] {false} ;
      T01NJ77_A129BarCod = new int[1] ;
      T01NJ77_n129BarCod = new boolean[] {false} ;
      T01NJ77_A132BarCodReo = new byte[1] ;
      T01NJ77_n132BarCodReo = new boolean[] {false} ;
      T01NJ77_A130BarCodPar = new String[] {""} ;
      T01NJ77_n130BarCodPar = new boolean[] {false} ;
      T01NJ77_A758ProCod = new String[] {""} ;
      T01NJ78_A396EmprCod = new String[] {""} ;
      T01NJ78_n396EmprCod = new boolean[] {false} ;
      T01NJ78_A129BarCod = new int[1] ;
      T01NJ78_n129BarCod = new boolean[] {false} ;
      T01NJ78_A132BarCodReo = new byte[1] ;
      T01NJ78_n132BarCodReo = new boolean[] {false} ;
      T01NJ78_A130BarCodPar = new String[] {""} ;
      T01NJ78_n130BarCodPar = new boolean[] {false} ;
      T01NJ78_A119BarAgrCod = new int[1] ;
      T01NJ78_A124BarAgrReo = new byte[1] ;
      T01NJ78_A122BarAgrPar = new String[] {""} ;
      T01NJ81_A396EmprCod = new String[] {""} ;
      T01NJ81_n396EmprCod = new boolean[] {false} ;
      T01NJ81_A129BarCod = new int[1] ;
      T01NJ81_n129BarCod = new boolean[] {false} ;
      T01NJ81_A132BarCodReo = new byte[1] ;
      T01NJ81_n132BarCodReo = new boolean[] {false} ;
      T01NJ81_A130BarCodPar = new String[] {""} ;
      T01NJ81_n130BarCodPar = new boolean[] {false} ;
      T01NJ82_A129BarCod = new int[1] ;
      T01NJ82_n129BarCod = new boolean[] {false} ;
      T01NJ82_A132BarCodReo = new byte[1] ;
      T01NJ82_n132BarCodReo = new boolean[] {false} ;
      T01NJ82_A130BarCodPar = new String[] {""} ;
      T01NJ82_n130BarCodPar = new boolean[] {false} ;
      T01NJ82_A188BarNotLin = new byte[1] ;
      T01NJ82_A187BarNotDsc = new String[] {""} ;
      T01NJ82_A396EmprCod = new String[] {""} ;
      T01NJ82_n396EmprCod = new boolean[] {false} ;
      T01NJ83_A396EmprCod = new String[] {""} ;
      T01NJ83_n396EmprCod = new boolean[] {false} ;
      T01NJ83_A129BarCod = new int[1] ;
      T01NJ83_n129BarCod = new boolean[] {false} ;
      T01NJ83_A132BarCodReo = new byte[1] ;
      T01NJ83_n132BarCodReo = new boolean[] {false} ;
      T01NJ83_A130BarCodPar = new String[] {""} ;
      T01NJ83_n130BarCodPar = new boolean[] {false} ;
      T01NJ83_A188BarNotLin = new byte[1] ;
      T01NJ3_A129BarCod = new int[1] ;
      T01NJ3_n129BarCod = new boolean[] {false} ;
      T01NJ3_A132BarCodReo = new byte[1] ;
      T01NJ3_n132BarCodReo = new boolean[] {false} ;
      T01NJ3_A130BarCodPar = new String[] {""} ;
      T01NJ3_n130BarCodPar = new boolean[] {false} ;
      T01NJ3_A188BarNotLin = new byte[1] ;
      T01NJ3_A187BarNotDsc = new String[] {""} ;
      T01NJ3_A396EmprCod = new String[] {""} ;
      T01NJ3_n396EmprCod = new boolean[] {false} ;
      T01NJ2_A129BarCod = new int[1] ;
      T01NJ2_n129BarCod = new boolean[] {false} ;
      T01NJ2_A132BarCodReo = new byte[1] ;
      T01NJ2_n132BarCodReo = new boolean[] {false} ;
      T01NJ2_A130BarCodPar = new String[] {""} ;
      T01NJ2_n130BarCodPar = new boolean[] {false} ;
      T01NJ2_A188BarNotLin = new byte[1] ;
      T01NJ2_A187BarNotDsc = new String[] {""} ;
      T01NJ2_A396EmprCod = new String[] {""} ;
      T01NJ2_n396EmprCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      T01NJ87_A396EmprCod = new String[] {""} ;
      T01NJ87_n396EmprCod = new boolean[] {false} ;
      T01NJ87_A129BarCod = new int[1] ;
      T01NJ87_n129BarCod = new boolean[] {false} ;
      T01NJ87_A132BarCodReo = new byte[1] ;
      T01NJ87_n132BarCodReo = new boolean[] {false} ;
      T01NJ87_A130BarCodPar = new String[] {""} ;
      T01NJ87_n130BarCodPar = new boolean[] {false} ;
      T01NJ87_A188BarNotLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tnotashdrs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tnotashdrs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tnotashdrs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tnotashdrs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotashdrs__default(),
         new Object[] {
             new Object[] {
            T01NJ2_A129BarCod, T01NJ2_A132BarCodReo, T01NJ2_A130BarCodPar, T01NJ2_A188BarNotLin, T01NJ2_A187BarNotDsc, T01NJ2_A396EmprCod
            }
            , new Object[] {
            T01NJ3_A129BarCod, T01NJ3_A132BarCodReo, T01NJ3_A130BarCodPar, T01NJ3_A188BarNotLin, T01NJ3_A187BarNotDsc, T01NJ3_A396EmprCod
            }
            , new Object[] {
            T01NJ4_A361DisCod, T01NJ4_A2759BarMaqGru, T01NJ4_A129BarCod, T01NJ4_A132BarCodReo, T01NJ4_A130BarCodPar, T01NJ4_A180BarMaqCod, T01NJ4_A646NotUltLin, T01NJ4_n646NotUltLin, T01NJ4_A213BarSit, T01NJ4_A120BarAgrEst,
            T01NJ4_A396EmprCod, T01NJ4_A252CliCod, T01NJ4_n252CliCod, T01NJ4_A365DisDes
            }
            , new Object[] {
            T01NJ5_A361DisCod, T01NJ5_A2759BarMaqGru, T01NJ5_A129BarCod, T01NJ5_A132BarCodReo, T01NJ5_A130BarCodPar, T01NJ5_A180BarMaqCod, T01NJ5_A646NotUltLin, T01NJ5_n646NotUltLin, T01NJ5_A213BarSit, T01NJ5_A120BarAgrEst,
            T01NJ5_A396EmprCod, T01NJ5_A252CliCod, T01NJ5_n252CliCod, T01NJ5_A365DisDes
            }
            , new Object[] {
            T01NJ6_A407EmprNom, T01NJ6_n407EmprNom
            }
            , new Object[] {
            T01NJ7_A252CliCod, T01NJ7_A365DisDes
            }
            , new Object[] {
            T01NJ8_A361DisCod, T01NJ8_A2759BarMaqGru, T01NJ8_A129BarCod, T01NJ8_A132BarCodReo, T01NJ8_A130BarCodPar, T01NJ8_A180BarMaqCod, T01NJ8_A646NotUltLin, T01NJ8_n646NotUltLin, T01NJ8_A213BarSit, T01NJ8_A120BarAgrEst,
            T01NJ8_A407EmprNom, T01NJ8_n407EmprNom, T01NJ8_A252CliCod, T01NJ8_n252CliCod, T01NJ8_A365DisDes, T01NJ8_A396EmprCod
            }
            , new Object[] {
            T01NJ9_A252CliCod, T01NJ9_A365DisDes
            }
            , new Object[] {
            T01NJ10_A396EmprCod, T01NJ10_A129BarCod, T01NJ10_A132BarCodReo, T01NJ10_A130BarCodPar
            }
            , new Object[] {
            T01NJ11_A396EmprCod, T01NJ11_A129BarCod, T01NJ11_A132BarCodReo, T01NJ11_A130BarCodPar
            }
            , new Object[] {
            T01NJ12_A396EmprCod, T01NJ12_A129BarCod, T01NJ12_A132BarCodReo, T01NJ12_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NJ16_A252CliCod, T01NJ16_A365DisDes
            }
            , new Object[] {
            T01NJ17_A14681MRPrId
            }
            , new Object[] {
            T01NJ18_A5921XCjaDis, T01NJ18_A5922XCjaCod
            }
            , new Object[] {
            T01NJ19_A396EmprCod, T01NJ19_A129BarCod, T01NJ19_A132BarCodReo, T01NJ19_A130BarCodPar, T01NJ19_A14152MEnvOrd
            }
            , new Object[] {
            T01NJ20_A396EmprCod, T01NJ20_A129BarCod, T01NJ20_A132BarCodReo, T01NJ20_A130BarCodPar, T01NJ20_A13905BarTraID
            }
            , new Object[] {
            T01NJ21_A396EmprCod, T01NJ21_A129BarCod, T01NJ21_A132BarCodReo, T01NJ21_A130BarCodPar, T01NJ21_A13093BarDGLin, T01NJ21_A13094BarDGDibCl, T01NJ21_A13095BarDGDibIn, T01NJ21_A13096BarDGComb, T01NJ21_A13097BarDGFOndo
            }
            , new Object[] {
            T01NJ22_A396EmprCod, T01NJ22_A11917Ebd_numero
            }
            , new Object[] {
            T01NJ23_A396EmprCod, T01NJ23_A11898Prd_numero
            }
            , new Object[] {
            T01NJ24_A396EmprCod, T01NJ24_A11849Cte_numero
            }
            , new Object[] {
            T01NJ25_A396EmprCod, T01NJ25_A11791Ap_numero
            }
            , new Object[] {
            T01NJ26_A396EmprCod, T01NJ26_A3985CalBarCod, T01NJ26_A3986CalBarCodR, T01NJ26_A3987CalBarCodP
            }
            , new Object[] {
            T01NJ27_A396EmprCod, T01NJ27_A5294InPTime, T01NJ27_A652OpeCod
            }
            , new Object[] {
            T01NJ28_A396EmprCod, T01NJ28_A129BarCod, T01NJ28_A132BarCodReo, T01NJ28_A130BarCodPar, T01NJ28_A4118tinagrcod, T01NJ28_A4119tinagrreo, T01NJ28_A4120tinagrpar
            }
            , new Object[] {
            T01NJ29_A396EmprCod, T01NJ29_A129BarCod, T01NJ29_A132BarCodReo, T01NJ29_A130BarCodPar, T01NJ29_A4080estagrcod, T01NJ29_A4081estagrreo, T01NJ29_A4082estagrpar
            }
            , new Object[] {
            T01NJ30_A396EmprCod, T01NJ30_A129BarCod, T01NJ30_A132BarCodReo, T01NJ30_A130BarCodPar, T01NJ30_A4075recestncol, T01NJ30_A4076recestnpro
            }
            , new Object[] {
            T01NJ31_A396EmprCod, T01NJ31_A602MaqCod, T01NJ31_A1142MaqFCod, T01NJ31_A3068PlaEtaOrd, T01NJ31_A3069PlaEtaOrdA, T01NJ31_A129BarCod, T01NJ31_A132BarCodReo, T01NJ31_A130BarCodPar
            }
            , new Object[] {
            T01NJ32_A396EmprCod, T01NJ32_A129BarCod, T01NJ32_A132BarCodReo, T01NJ32_A130BarCodPar, T01NJ32_A4846BarAudLin
            }
            , new Object[] {
            T01NJ33_A396EmprCod, T01NJ33_A129BarCod, T01NJ33_A132BarCodReo, T01NJ33_A130BarCodPar, T01NJ33_A3940BarEnsLin
            }
            , new Object[] {
            T01NJ34_A396EmprCod, T01NJ34_A129BarCod, T01NJ34_A132BarCodReo, T01NJ34_A130BarCodPar, T01NJ34_A3384RefBarCod, T01NJ34_A3385RefBarReo, T01NJ34_A3386RefBarPar
            }
            , new Object[] {
            T01NJ35_A396EmprCod, T01NJ35_A10914SolSalCod
            }
            , new Object[] {
            T01NJ36_A396EmprCod, T01NJ36_A10364Ph_numero
            }
            , new Object[] {
            T01NJ37_A396EmprCod, T01NJ37_A129BarCod, T01NJ37_A132BarCodReo, T01NJ37_A130BarCodPar, T01NJ37_A10197ProEspCod
            }
            , new Object[] {
            T01NJ38_A396EmprCod, T01NJ38_A129BarCod, T01NJ38_A132BarCodReo, T01NJ38_A130BarCodPar, T01NJ38_A5322Dp_Nrecep
            }
            , new Object[] {
            T01NJ39_A396EmprCod, T01NJ39_A129BarCod, T01NJ39_A132BarCodReo, T01NJ39_A130BarCodPar, T01NJ39_A8569EntSecLn
            }
            , new Object[] {
            T01NJ40_A396EmprCod, T01NJ40_A7434PLLNro, T01NJ40_A7443LPLNro, T01NJ40_A7459CPLCom, T01NJ40_A129BarCod, T01NJ40_A132BarCodReo, T01NJ40_A130BarCodPar
            }
            , new Object[] {
            T01NJ41_A396EmprCod, T01NJ41_A7145OSSCod
            }
            , new Object[] {
            T01NJ42_A396EmprCod, T01NJ42_A7049OGSCod
            }
            , new Object[] {
            T01NJ43_A396EmprCod, T01NJ43_A129BarCod, T01NJ43_A132BarCodReo, T01NJ43_A130BarCodPar, T01NJ43_A6031Ac_Barcod, T01NJ43_A6032Ac_BarReo, T01NJ43_A6033Ac_BarPar
            }
            , new Object[] {
            T01NJ44_A396EmprCod, T01NJ44_A129BarCod, T01NJ44_A132BarCodReo, T01NJ44_A130BarCodPar, T01NJ44_A5908PartPal
            }
            , new Object[] {
            T01NJ45_A396EmprCod, T01NJ45_A129BarCod, T01NJ45_A132BarCodReo, T01NJ45_A130BarCodPar, T01NJ45_A2524DisComLin, T01NJ45_A1056DisComCod, T01NJ45_A1032FonCod
            }
            , new Object[] {
            T01NJ46_A396EmprCod, T01NJ46_A1736AlbExtCod, T01NJ46_A129BarCod, T01NJ46_A132BarCodReo, T01NJ46_A130BarCodPar
            }
            , new Object[] {
            T01NJ47_A396EmprCod, T01NJ47_A129BarCod, T01NJ47_A132BarCodReo, T01NJ47_A130BarCodPar, T01NJ47_A3753BarFoaCod, T01NJ47_A3754BarFoaReo, T01NJ47_A3755BarFoaPar
            }
            , new Object[] {
            T01NJ48_A396EmprCod, T01NJ48_A129BarCod, T01NJ48_A132BarCodReo, T01NJ48_A130BarCodPar, T01NJ48_A3747BarPegCod, T01NJ48_A3748BarPegReo, T01NJ48_A3749BarPegPar
            }
            , new Object[] {
            T01NJ49_A396EmprCod, T01NJ49_A3253SolTraCod
            }
            , new Object[] {
            T01NJ50_A396EmprCod, T01NJ50_A3235SolSubCod
            }
            , new Object[] {
            T01NJ51_A396EmprCod, T01NJ51_A3218SolLuzCod
            }
            , new Object[] {
            T01NJ52_A396EmprCod, T01NJ52_A3196SolFriCod
            }
            , new Object[] {
            T01NJ53_A396EmprCod, T01NJ53_A3165SolPilCod
            }
            , new Object[] {
            T01NJ54_A396EmprCod, T01NJ54_A129BarCod, T01NJ54_A132BarCodReo, T01NJ54_A130BarCodPar, T01NJ54_A2872HAnRLinMaq, T01NJ54_A2873HAnRLinPro, T01NJ54_A2874HAnRLin, T01NJ54_A2875HAnNumAny
            }
            , new Object[] {
            T01NJ55_A396EmprCod, T01NJ55_A2817PlaTer, T01NJ55_A2818PlaOrd
            }
            , new Object[] {
            T01NJ56_A396EmprCod, T01NJ56_A2809MetTerCod, T01NJ56_A129BarCod, T01NJ56_A132BarCodReo, T01NJ56_A130BarCodPar
            }
            , new Object[] {
            T01NJ57_A396EmprCod, T01NJ57_A129BarCod, T01NJ57_A132BarCodReo, T01NJ57_A130BarCodPar, T01NJ57_A2808RecLinMAL, T01NJ57_A1377RecNumAny, T01NJ57_A719PrdNum
            }
            , new Object[] {
            T01NJ58_A396EmprCod, T01NJ58_A129BarCod, T01NJ58_A132BarCodReo, T01NJ58_A130BarCodPar, T01NJ58_A2804RecLinMaq
            }
            , new Object[] {
            T01NJ59_A396EmprCod, T01NJ59_A2792TermiCod, T01NJ59_A129BarCod, T01NJ59_A132BarCodReo, T01NJ59_A130BarCodPar
            }
            , new Object[] {
            T01NJ60_A396EmprCod, T01NJ60_A2248ManCod, T01NJ60_A2711RpExHdFe, T01NJ60_A2713RpExHdLi
            }
            , new Object[] {
            T01NJ61_A396EmprCod, T01NJ61_A2248ManCod, T01NJ61_A2689ExHdrFas, T01NJ61_A2692ExHdrLin
            }
            , new Object[] {
            T01NJ62_A396EmprCod, T01NJ62_A129BarCod, T01NJ62_A132BarCodReo, T01NJ62_A130BarCodPar, T01NJ62_A2494BarDosPro, T01NJ62_A719PrdNum
            }
            , new Object[] {
            T01NJ63_A396EmprCod, T01NJ63_A602MaqCod, T01NJ63_A2461PlaFecTin, T01NJ63_A129BarCod, T01NJ63_A132BarCodReo, T01NJ63_A130BarCodPar
            }
            , new Object[] {
            T01NJ64_A396EmprCod, T01NJ64_A129BarCod, T01NJ64_A132BarCodReo, T01NJ64_A130BarCodPar, T01NJ64_A2457BarObLin
            }
            , new Object[] {
            T01NJ65_A396EmprCod, T01NJ65_A129BarCod, T01NJ65_A132BarCodReo, T01NJ65_A130BarCodPar, T01NJ65_A2444BarEnLin
            }
            , new Object[] {
            T01NJ66_A396EmprCod, T01NJ66_A2406ExhAlbCod, T01NJ66_A129BarCod, T01NJ66_A132BarCodReo, T01NJ66_A130BarCodPar
            }
            , new Object[] {
            T01NJ67_A396EmprCod, T01NJ67_A2253SalExtAlb, T01NJ67_A129BarCod, T01NJ67_A132BarCodReo, T01NJ67_A130BarCodPar
            }
            , new Object[] {
            T01NJ68_A396EmprCod, T01NJ68_A30AlbProCod, T01NJ68_A129BarCod, T01NJ68_A132BarCodReo, T01NJ68_A130BarCodPar
            }
            , new Object[] {
            T01NJ69_A396EmprCod, T01NJ69_A1348SolColCod
            }
            , new Object[] {
            T01NJ70_A396EmprCod, T01NJ70_A1333EstDimCod
            }
            , new Object[] {
            T01NJ71_A396EmprCod, T01NJ71_A1314EnsLabCod
            }
            , new Object[] {
            T01NJ72_A396EmprCod, T01NJ72_A129BarCod, T01NJ72_A132BarCodReo, T01NJ72_A130BarCodPar, T01NJ72_A906ObsReoLin
            }
            , new Object[] {
            T01NJ73_A396EmprCod, T01NJ73_A859CumCodCont
            }
            , new Object[] {
            T01NJ74_A396EmprCod, T01NJ74_A602MaqCod, T01NJ74_A558HisProFec, T01NJ74_A561HisProLin
            }
            , new Object[] {
            T01NJ75_A396EmprCod, T01NJ75_A252CliCod, T01NJ75_A494ForSer, T01NJ75_A482ForColNom, T01NJ75_A483ForColNum, T01NJ75_A831TipColCod
            }
            , new Object[] {
            T01NJ76_A396EmprCod, T01NJ76_A129BarCod, T01NJ76_A132BarCodReo, T01NJ76_A130BarCodPar, T01NJ76_A200BarPieCod
            }
            , new Object[] {
            T01NJ77_A396EmprCod, T01NJ77_A129BarCod, T01NJ77_A132BarCodReo, T01NJ77_A130BarCodPar, T01NJ77_A758ProCod
            }
            , new Object[] {
            T01NJ78_A396EmprCod, T01NJ78_A129BarCod, T01NJ78_A132BarCodReo, T01NJ78_A130BarCodPar, T01NJ78_A119BarAgrCod, T01NJ78_A124BarAgrReo, T01NJ78_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NJ81_A396EmprCod, T01NJ81_A129BarCod, T01NJ81_A132BarCodReo, T01NJ81_A130BarCodPar
            }
            , new Object[] {
            T01NJ82_A129BarCod, T01NJ82_A132BarCodReo, T01NJ82_A130BarCodPar, T01NJ82_A188BarNotLin, T01NJ82_A187BarNotDsc, T01NJ82_A396EmprCod
            }
            , new Object[] {
            T01NJ83_A396EmprCod, T01NJ83_A129BarCod, T01NJ83_A132BarCodReo, T01NJ83_A130BarCodPar, T01NJ83_A188BarNotLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NJ87_A396EmprCod, T01NJ87_A129BarCod, T01NJ87_A132BarCodReo, T01NJ87_A130BarCodPar, T01NJ87_A188BarNotLin
            }
         }
      );
      AV51Pgmname = "TNotasHdrs" ;
   }

   private byte wcpOAV34BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z646NotUltLin ;
   private byte Z213BarSit ;
   private byte O646NotUltLin ;
   private byte Z188BarNotLin ;
   private byte GxWebError ;
   private byte AV34BarCodReo ;
   private byte nKeyPressed ;
   private byte A646NotUltLin ;
   private byte Gx_BScreen ;
   private byte B646NotUltLin ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte s646NotUltLin ;
   private byte A188BarNotLin ;
   private byte GXv_int7[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i646NotUltLin ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_17 ;
   private short nRcdExists_17 ;
   private short nIsMod_17 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount17 ;
   private short RcdFound17 ;
   private short nBlankRcdUsr17 ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_17 ;
   private int wcpOAV33BarCod ;
   private int wcpOAV39DisCod ;
   private int wcpOAV40CliCod ;
   private int wcpOAV44BarColNum ;
   private int wcpOAV45BarPie ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int A361DisCod ;
   private int AV33BarCod ;
   private int AV39DisCod ;
   private int AV40CliCod ;
   private int AV44BarColNum ;
   private int AV45BarPie ;
   private int trnEnded ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int bttBtntipospresentacion_Visible ;
   private int bttBtnrenumerarlinea_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtBarNotLin_Enabled ;
   private int edtBarNotDsc_Enabled ;
   private int fRowAdded ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int GX_JID ;
   private int GXv_int6[] ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtBarNotLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV46BarKgm ;
   private java.math.BigDecimal wcpOAV47BarMtr ;
   private java.math.BigDecimal AV46BarKgm ;
   private java.math.BigDecimal AV47BarMtr ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV35BarCodPar ;
   private String wcpOAV41BarSer ;
   private String wcpOAV42PedidoCliente ;
   private String wcpOAV43BarColNom ;
   private String wcpOAV48CliNom ;
   private String wcpOAV49BarSerDsc ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z120BarAgrEst ;
   private String Dvelop_confirmpanel_renumerarlinea_Result ;
   private String Z187BarNotDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV35BarCodPar ;
   private String AV41BarSer ;
   private String AV42PedidoCliente ;
   private String AV43BarColNom ;
   private String AV48CliNom ;
   private String AV49BarSerDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_100_idx="0001" ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
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
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String bttBtntipospresentacion_Internalname ;
   private String bttBtntipospresentacion_Jsonclick ;
   private String bttBtnrenumerarlinea_Internalname ;
   private String bttBtnrenumerarlinea_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV51Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_renumerarlinea_Internalname ;
   private String Dvelop_confirmpanel_renumerarlinea_Title ;
   private String Dvelop_confirmpanel_renumerarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_renumerarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_renumerarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_renumerarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_renumerarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_renumerarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_renumerarlinea_Internalname ;
   private String sMode17 ;
   private String edtBarNotLin_Internalname ;
   private String edtBarNotDsc_Internalname ;
   private String GX_FocusControl ;
   private String subGridlevel_level1_Internalname ;
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A407EmprNom ;
   private String A365DisDes ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvelop_confirmpanel_renumerarlinea_Objectcall ;
   private String Dvelop_confirmpanel_renumerarlinea_Width ;
   private String Dvelop_confirmpanel_renumerarlinea_Height ;
   private String Dvelop_confirmpanel_renumerarlinea_Class ;
   private String Dvelop_confirmpanel_renumerarlinea_Comment ;
   private String Dvelop_confirmpanel_renumerarlinea_Bodytype ;
   private String Dvelop_confirmpanel_renumerarlinea_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_renumerarlinea_Texttype ;
   private String hsh ;
   private String sMode12 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A187BarNotDsc ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtBarNotLin_Jsonclick ;
   private String edtBarNotDsc_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean wbErr ;
   private boolean n646NotUltLin ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvelop_confirmpanel_renumerarlinea_Enabled ;
   private boolean Dvelop_confirmpanel_renumerarlinea_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV38WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_renumerarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01NJ6_A407EmprNom ;
   private boolean[] T01NJ6_n407EmprNom ;
   private int[] T01NJ8_A361DisCod ;
   private String[] T01NJ8_A2759BarMaqGru ;
   private int[] T01NJ8_A129BarCod ;
   private boolean[] T01NJ8_n129BarCod ;
   private byte[] T01NJ8_A132BarCodReo ;
   private boolean[] T01NJ8_n132BarCodReo ;
   private String[] T01NJ8_A130BarCodPar ;
   private boolean[] T01NJ8_n130BarCodPar ;
   private String[] T01NJ8_A180BarMaqCod ;
   private byte[] T01NJ8_A646NotUltLin ;
   private boolean[] T01NJ8_n646NotUltLin ;
   private byte[] T01NJ8_A213BarSit ;
   private String[] T01NJ8_A120BarAgrEst ;
   private String[] T01NJ8_A407EmprNom ;
   private boolean[] T01NJ8_n407EmprNom ;
   private int[] T01NJ8_A252CliCod ;
   private boolean[] T01NJ8_n252CliCod ;
   private String[] T01NJ8_A365DisDes ;
   private String[] T01NJ8_A396EmprCod ;
   private boolean[] T01NJ8_n396EmprCod ;
   private int[] T01NJ7_A252CliCod ;
   private boolean[] T01NJ7_n252CliCod ;
   private String[] T01NJ7_A365DisDes ;
   private int[] T01NJ9_A252CliCod ;
   private boolean[] T01NJ9_n252CliCod ;
   private String[] T01NJ9_A365DisDes ;
   private String[] T01NJ10_A396EmprCod ;
   private boolean[] T01NJ10_n396EmprCod ;
   private int[] T01NJ10_A129BarCod ;
   private boolean[] T01NJ10_n129BarCod ;
   private byte[] T01NJ10_A132BarCodReo ;
   private boolean[] T01NJ10_n132BarCodReo ;
   private String[] T01NJ10_A130BarCodPar ;
   private boolean[] T01NJ10_n130BarCodPar ;
   private int[] T01NJ5_A361DisCod ;
   private String[] T01NJ5_A2759BarMaqGru ;
   private int[] T01NJ5_A129BarCod ;
   private boolean[] T01NJ5_n129BarCod ;
   private byte[] T01NJ5_A132BarCodReo ;
   private boolean[] T01NJ5_n132BarCodReo ;
   private String[] T01NJ5_A130BarCodPar ;
   private boolean[] T01NJ5_n130BarCodPar ;
   private String[] T01NJ5_A180BarMaqCod ;
   private byte[] T01NJ5_A646NotUltLin ;
   private boolean[] T01NJ5_n646NotUltLin ;
   private byte[] T01NJ5_A213BarSit ;
   private String[] T01NJ5_A120BarAgrEst ;
   private String[] T01NJ5_A396EmprCod ;
   private boolean[] T01NJ5_n396EmprCod ;
   private int[] T01NJ5_A252CliCod ;
   private boolean[] T01NJ5_n252CliCod ;
   private String[] T01NJ5_A365DisDes ;
   private String[] T01NJ11_A396EmprCod ;
   private boolean[] T01NJ11_n396EmprCod ;
   private int[] T01NJ11_A129BarCod ;
   private boolean[] T01NJ11_n129BarCod ;
   private byte[] T01NJ11_A132BarCodReo ;
   private boolean[] T01NJ11_n132BarCodReo ;
   private String[] T01NJ11_A130BarCodPar ;
   private boolean[] T01NJ11_n130BarCodPar ;
   private String[] T01NJ12_A396EmprCod ;
   private boolean[] T01NJ12_n396EmprCod ;
   private int[] T01NJ12_A129BarCod ;
   private boolean[] T01NJ12_n129BarCod ;
   private byte[] T01NJ12_A132BarCodReo ;
   private boolean[] T01NJ12_n132BarCodReo ;
   private String[] T01NJ12_A130BarCodPar ;
   private boolean[] T01NJ12_n130BarCodPar ;
   private int[] T01NJ4_A361DisCod ;
   private String[] T01NJ4_A2759BarMaqGru ;
   private int[] T01NJ4_A129BarCod ;
   private boolean[] T01NJ4_n129BarCod ;
   private byte[] T01NJ4_A132BarCodReo ;
   private boolean[] T01NJ4_n132BarCodReo ;
   private String[] T01NJ4_A130BarCodPar ;
   private boolean[] T01NJ4_n130BarCodPar ;
   private String[] T01NJ4_A180BarMaqCod ;
   private byte[] T01NJ4_A646NotUltLin ;
   private boolean[] T01NJ4_n646NotUltLin ;
   private byte[] T01NJ4_A213BarSit ;
   private String[] T01NJ4_A120BarAgrEst ;
   private String[] T01NJ4_A396EmprCod ;
   private boolean[] T01NJ4_n396EmprCod ;
   private int[] T01NJ4_A252CliCod ;
   private boolean[] T01NJ4_n252CliCod ;
   private String[] T01NJ4_A365DisDes ;
   private int[] T01NJ16_A252CliCod ;
   private boolean[] T01NJ16_n252CliCod ;
   private String[] T01NJ16_A365DisDes ;
   private long[] T01NJ17_A14681MRPrId ;
   private String[] T01NJ18_A5921XCjaDis ;
   private long[] T01NJ18_A5922XCjaCod ;
   private String[] T01NJ19_A396EmprCod ;
   private boolean[] T01NJ19_n396EmprCod ;
   private int[] T01NJ19_A129BarCod ;
   private boolean[] T01NJ19_n129BarCod ;
   private byte[] T01NJ19_A132BarCodReo ;
   private boolean[] T01NJ19_n132BarCodReo ;
   private String[] T01NJ19_A130BarCodPar ;
   private boolean[] T01NJ19_n130BarCodPar ;
   private short[] T01NJ19_A14152MEnvOrd ;
   private String[] T01NJ20_A396EmprCod ;
   private boolean[] T01NJ20_n396EmprCod ;
   private int[] T01NJ20_A129BarCod ;
   private boolean[] T01NJ20_n129BarCod ;
   private byte[] T01NJ20_A132BarCodReo ;
   private boolean[] T01NJ20_n132BarCodReo ;
   private String[] T01NJ20_A130BarCodPar ;
   private boolean[] T01NJ20_n130BarCodPar ;
   private String[] T01NJ20_A13905BarTraID ;
   private String[] T01NJ21_A396EmprCod ;
   private boolean[] T01NJ21_n396EmprCod ;
   private int[] T01NJ21_A129BarCod ;
   private boolean[] T01NJ21_n129BarCod ;
   private byte[] T01NJ21_A132BarCodReo ;
   private boolean[] T01NJ21_n132BarCodReo ;
   private String[] T01NJ21_A130BarCodPar ;
   private boolean[] T01NJ21_n130BarCodPar ;
   private byte[] T01NJ21_A13093BarDGLin ;
   private String[] T01NJ21_A13094BarDGDibCl ;
   private int[] T01NJ21_A13095BarDGDibIn ;
   private String[] T01NJ21_A13096BarDGComb ;
   private String[] T01NJ21_A13097BarDGFOndo ;
   private String[] T01NJ22_A396EmprCod ;
   private boolean[] T01NJ22_n396EmprCod ;
   private int[] T01NJ22_A11917Ebd_numero ;
   private String[] T01NJ23_A396EmprCod ;
   private boolean[] T01NJ23_n396EmprCod ;
   private int[] T01NJ23_A11898Prd_numero ;
   private String[] T01NJ24_A396EmprCod ;
   private boolean[] T01NJ24_n396EmprCod ;
   private int[] T01NJ24_A11849Cte_numero ;
   private String[] T01NJ25_A396EmprCod ;
   private boolean[] T01NJ25_n396EmprCod ;
   private int[] T01NJ25_A11791Ap_numero ;
   private String[] T01NJ26_A396EmprCod ;
   private boolean[] T01NJ26_n396EmprCod ;
   private int[] T01NJ26_A3985CalBarCod ;
   private byte[] T01NJ26_A3986CalBarCodR ;
   private String[] T01NJ26_A3987CalBarCodP ;
   private String[] T01NJ27_A396EmprCod ;
   private boolean[] T01NJ27_n396EmprCod ;
   private java.util.Date[] T01NJ27_A5294InPTime ;
   private int[] T01NJ27_A652OpeCod ;
   private String[] T01NJ28_A396EmprCod ;
   private boolean[] T01NJ28_n396EmprCod ;
   private int[] T01NJ28_A129BarCod ;
   private boolean[] T01NJ28_n129BarCod ;
   private byte[] T01NJ28_A132BarCodReo ;
   private boolean[] T01NJ28_n132BarCodReo ;
   private String[] T01NJ28_A130BarCodPar ;
   private boolean[] T01NJ28_n130BarCodPar ;
   private int[] T01NJ28_A4118tinagrcod ;
   private byte[] T01NJ28_A4119tinagrreo ;
   private String[] T01NJ28_A4120tinagrpar ;
   private String[] T01NJ29_A396EmprCod ;
   private boolean[] T01NJ29_n396EmprCod ;
   private int[] T01NJ29_A129BarCod ;
   private boolean[] T01NJ29_n129BarCod ;
   private byte[] T01NJ29_A132BarCodReo ;
   private boolean[] T01NJ29_n132BarCodReo ;
   private String[] T01NJ29_A130BarCodPar ;
   private boolean[] T01NJ29_n130BarCodPar ;
   private int[] T01NJ29_A4080estagrcod ;
   private byte[] T01NJ29_A4081estagrreo ;
   private String[] T01NJ29_A4082estagrpar ;
   private String[] T01NJ30_A396EmprCod ;
   private boolean[] T01NJ30_n396EmprCod ;
   private int[] T01NJ30_A129BarCod ;
   private boolean[] T01NJ30_n129BarCod ;
   private byte[] T01NJ30_A132BarCodReo ;
   private boolean[] T01NJ30_n132BarCodReo ;
   private String[] T01NJ30_A130BarCodPar ;
   private boolean[] T01NJ30_n130BarCodPar ;
   private byte[] T01NJ30_A4075recestncol ;
   private byte[] T01NJ30_A4076recestnpro ;
   private String[] T01NJ31_A396EmprCod ;
   private boolean[] T01NJ31_n396EmprCod ;
   private String[] T01NJ31_A602MaqCod ;
   private String[] T01NJ31_A1142MaqFCod ;
   private short[] T01NJ31_A3068PlaEtaOrd ;
   private byte[] T01NJ31_A3069PlaEtaOrdA ;
   private int[] T01NJ31_A129BarCod ;
   private boolean[] T01NJ31_n129BarCod ;
   private byte[] T01NJ31_A132BarCodReo ;
   private boolean[] T01NJ31_n132BarCodReo ;
   private String[] T01NJ31_A130BarCodPar ;
   private boolean[] T01NJ31_n130BarCodPar ;
   private String[] T01NJ32_A396EmprCod ;
   private boolean[] T01NJ32_n396EmprCod ;
   private int[] T01NJ32_A129BarCod ;
   private boolean[] T01NJ32_n129BarCod ;
   private byte[] T01NJ32_A132BarCodReo ;
   private boolean[] T01NJ32_n132BarCodReo ;
   private String[] T01NJ32_A130BarCodPar ;
   private boolean[] T01NJ32_n130BarCodPar ;
   private short[] T01NJ32_A4846BarAudLin ;
   private String[] T01NJ33_A396EmprCod ;
   private boolean[] T01NJ33_n396EmprCod ;
   private int[] T01NJ33_A129BarCod ;
   private boolean[] T01NJ33_n129BarCod ;
   private byte[] T01NJ33_A132BarCodReo ;
   private boolean[] T01NJ33_n132BarCodReo ;
   private String[] T01NJ33_A130BarCodPar ;
   private boolean[] T01NJ33_n130BarCodPar ;
   private short[] T01NJ33_A3940BarEnsLin ;
   private String[] T01NJ34_A396EmprCod ;
   private boolean[] T01NJ34_n396EmprCod ;
   private int[] T01NJ34_A129BarCod ;
   private boolean[] T01NJ34_n129BarCod ;
   private byte[] T01NJ34_A132BarCodReo ;
   private boolean[] T01NJ34_n132BarCodReo ;
   private String[] T01NJ34_A130BarCodPar ;
   private boolean[] T01NJ34_n130BarCodPar ;
   private int[] T01NJ34_A3384RefBarCod ;
   private byte[] T01NJ34_A3385RefBarReo ;
   private String[] T01NJ34_A3386RefBarPar ;
   private String[] T01NJ35_A396EmprCod ;
   private boolean[] T01NJ35_n396EmprCod ;
   private int[] T01NJ35_A10914SolSalCod ;
   private String[] T01NJ36_A396EmprCod ;
   private boolean[] T01NJ36_n396EmprCod ;
   private int[] T01NJ36_A10364Ph_numero ;
   private String[] T01NJ37_A396EmprCod ;
   private boolean[] T01NJ37_n396EmprCod ;
   private int[] T01NJ37_A129BarCod ;
   private boolean[] T01NJ37_n129BarCod ;
   private byte[] T01NJ37_A132BarCodReo ;
   private boolean[] T01NJ37_n132BarCodReo ;
   private String[] T01NJ37_A130BarCodPar ;
   private boolean[] T01NJ37_n130BarCodPar ;
   private String[] T01NJ37_A10197ProEspCod ;
   private String[] T01NJ38_A396EmprCod ;
   private boolean[] T01NJ38_n396EmprCod ;
   private int[] T01NJ38_A129BarCod ;
   private boolean[] T01NJ38_n129BarCod ;
   private byte[] T01NJ38_A132BarCodReo ;
   private boolean[] T01NJ38_n132BarCodReo ;
   private String[] T01NJ38_A130BarCodPar ;
   private boolean[] T01NJ38_n130BarCodPar ;
   private int[] T01NJ38_A5322Dp_Nrecep ;
   private String[] T01NJ39_A396EmprCod ;
   private boolean[] T01NJ39_n396EmprCod ;
   private int[] T01NJ39_A129BarCod ;
   private boolean[] T01NJ39_n129BarCod ;
   private byte[] T01NJ39_A132BarCodReo ;
   private boolean[] T01NJ39_n132BarCodReo ;
   private String[] T01NJ39_A130BarCodPar ;
   private boolean[] T01NJ39_n130BarCodPar ;
   private int[] T01NJ39_A8569EntSecLn ;
   private String[] T01NJ40_A396EmprCod ;
   private boolean[] T01NJ40_n396EmprCod ;
   private int[] T01NJ40_A7434PLLNro ;
   private short[] T01NJ40_A7443LPLNro ;
   private short[] T01NJ40_A7459CPLCom ;
   private int[] T01NJ40_A129BarCod ;
   private boolean[] T01NJ40_n129BarCod ;
   private byte[] T01NJ40_A132BarCodReo ;
   private boolean[] T01NJ40_n132BarCodReo ;
   private String[] T01NJ40_A130BarCodPar ;
   private boolean[] T01NJ40_n130BarCodPar ;
   private String[] T01NJ41_A396EmprCod ;
   private boolean[] T01NJ41_n396EmprCod ;
   private int[] T01NJ41_A7145OSSCod ;
   private String[] T01NJ42_A396EmprCod ;
   private boolean[] T01NJ42_n396EmprCod ;
   private int[] T01NJ42_A7049OGSCod ;
   private String[] T01NJ43_A396EmprCod ;
   private boolean[] T01NJ43_n396EmprCod ;
   private int[] T01NJ43_A129BarCod ;
   private boolean[] T01NJ43_n129BarCod ;
   private byte[] T01NJ43_A132BarCodReo ;
   private boolean[] T01NJ43_n132BarCodReo ;
   private String[] T01NJ43_A130BarCodPar ;
   private boolean[] T01NJ43_n130BarCodPar ;
   private int[] T01NJ43_A6031Ac_Barcod ;
   private byte[] T01NJ43_A6032Ac_BarReo ;
   private String[] T01NJ43_A6033Ac_BarPar ;
   private String[] T01NJ44_A396EmprCod ;
   private boolean[] T01NJ44_n396EmprCod ;
   private int[] T01NJ44_A129BarCod ;
   private boolean[] T01NJ44_n129BarCod ;
   private byte[] T01NJ44_A132BarCodReo ;
   private boolean[] T01NJ44_n132BarCodReo ;
   private String[] T01NJ44_A130BarCodPar ;
   private boolean[] T01NJ44_n130BarCodPar ;
   private int[] T01NJ44_A5908PartPal ;
   private String[] T01NJ45_A396EmprCod ;
   private boolean[] T01NJ45_n396EmprCod ;
   private int[] T01NJ45_A129BarCod ;
   private boolean[] T01NJ45_n129BarCod ;
   private byte[] T01NJ45_A132BarCodReo ;
   private boolean[] T01NJ45_n132BarCodReo ;
   private String[] T01NJ45_A130BarCodPar ;
   private boolean[] T01NJ45_n130BarCodPar ;
   private byte[] T01NJ45_A2524DisComLin ;
   private String[] T01NJ45_A1056DisComCod ;
   private String[] T01NJ45_A1032FonCod ;
   private String[] T01NJ46_A396EmprCod ;
   private boolean[] T01NJ46_n396EmprCod ;
   private long[] T01NJ46_A1736AlbExtCod ;
   private int[] T01NJ46_A129BarCod ;
   private boolean[] T01NJ46_n129BarCod ;
   private byte[] T01NJ46_A132BarCodReo ;
   private boolean[] T01NJ46_n132BarCodReo ;
   private String[] T01NJ46_A130BarCodPar ;
   private boolean[] T01NJ46_n130BarCodPar ;
   private String[] T01NJ47_A396EmprCod ;
   private boolean[] T01NJ47_n396EmprCod ;
   private int[] T01NJ47_A129BarCod ;
   private boolean[] T01NJ47_n129BarCod ;
   private byte[] T01NJ47_A132BarCodReo ;
   private boolean[] T01NJ47_n132BarCodReo ;
   private String[] T01NJ47_A130BarCodPar ;
   private boolean[] T01NJ47_n130BarCodPar ;
   private int[] T01NJ47_A3753BarFoaCod ;
   private byte[] T01NJ47_A3754BarFoaReo ;
   private String[] T01NJ47_A3755BarFoaPar ;
   private String[] T01NJ48_A396EmprCod ;
   private boolean[] T01NJ48_n396EmprCod ;
   private int[] T01NJ48_A129BarCod ;
   private boolean[] T01NJ48_n129BarCod ;
   private byte[] T01NJ48_A132BarCodReo ;
   private boolean[] T01NJ48_n132BarCodReo ;
   private String[] T01NJ48_A130BarCodPar ;
   private boolean[] T01NJ48_n130BarCodPar ;
   private int[] T01NJ48_A3747BarPegCod ;
   private byte[] T01NJ48_A3748BarPegReo ;
   private String[] T01NJ48_A3749BarPegPar ;
   private String[] T01NJ49_A396EmprCod ;
   private boolean[] T01NJ49_n396EmprCod ;
   private int[] T01NJ49_A3253SolTraCod ;
   private String[] T01NJ50_A396EmprCod ;
   private boolean[] T01NJ50_n396EmprCod ;
   private int[] T01NJ50_A3235SolSubCod ;
   private String[] T01NJ51_A396EmprCod ;
   private boolean[] T01NJ51_n396EmprCod ;
   private int[] T01NJ51_A3218SolLuzCod ;
   private String[] T01NJ52_A396EmprCod ;
   private boolean[] T01NJ52_n396EmprCod ;
   private int[] T01NJ52_A3196SolFriCod ;
   private String[] T01NJ53_A396EmprCod ;
   private boolean[] T01NJ53_n396EmprCod ;
   private int[] T01NJ53_A3165SolPilCod ;
   private String[] T01NJ54_A396EmprCod ;
   private boolean[] T01NJ54_n396EmprCod ;
   private int[] T01NJ54_A129BarCod ;
   private boolean[] T01NJ54_n129BarCod ;
   private byte[] T01NJ54_A132BarCodReo ;
   private boolean[] T01NJ54_n132BarCodReo ;
   private String[] T01NJ54_A130BarCodPar ;
   private boolean[] T01NJ54_n130BarCodPar ;
   private short[] T01NJ54_A2872HAnRLinMaq ;
   private byte[] T01NJ54_A2873HAnRLinPro ;
   private short[] T01NJ54_A2874HAnRLin ;
   private byte[] T01NJ54_A2875HAnNumAny ;
   private String[] T01NJ55_A396EmprCod ;
   private boolean[] T01NJ55_n396EmprCod ;
   private String[] T01NJ55_A2817PlaTer ;
   private short[] T01NJ55_A2818PlaOrd ;
   private String[] T01NJ56_A396EmprCod ;
   private boolean[] T01NJ56_n396EmprCod ;
   private String[] T01NJ56_A2809MetTerCod ;
   private int[] T01NJ56_A129BarCod ;
   private boolean[] T01NJ56_n129BarCod ;
   private byte[] T01NJ56_A132BarCodReo ;
   private boolean[] T01NJ56_n132BarCodReo ;
   private String[] T01NJ56_A130BarCodPar ;
   private boolean[] T01NJ56_n130BarCodPar ;
   private String[] T01NJ57_A396EmprCod ;
   private boolean[] T01NJ57_n396EmprCod ;
   private int[] T01NJ57_A129BarCod ;
   private boolean[] T01NJ57_n129BarCod ;
   private byte[] T01NJ57_A132BarCodReo ;
   private boolean[] T01NJ57_n132BarCodReo ;
   private String[] T01NJ57_A130BarCodPar ;
   private boolean[] T01NJ57_n130BarCodPar ;
   private short[] T01NJ57_A2808RecLinMAL ;
   private byte[] T01NJ57_A1377RecNumAny ;
   private String[] T01NJ57_A719PrdNum ;
   private String[] T01NJ58_A396EmprCod ;
   private boolean[] T01NJ58_n396EmprCod ;
   private int[] T01NJ58_A129BarCod ;
   private boolean[] T01NJ58_n129BarCod ;
   private byte[] T01NJ58_A132BarCodReo ;
   private boolean[] T01NJ58_n132BarCodReo ;
   private String[] T01NJ58_A130BarCodPar ;
   private boolean[] T01NJ58_n130BarCodPar ;
   private short[] T01NJ58_A2804RecLinMaq ;
   private String[] T01NJ59_A396EmprCod ;
   private boolean[] T01NJ59_n396EmprCod ;
   private String[] T01NJ59_A2792TermiCod ;
   private int[] T01NJ59_A129BarCod ;
   private boolean[] T01NJ59_n129BarCod ;
   private byte[] T01NJ59_A132BarCodReo ;
   private boolean[] T01NJ59_n132BarCodReo ;
   private String[] T01NJ59_A130BarCodPar ;
   private boolean[] T01NJ59_n130BarCodPar ;
   private String[] T01NJ60_A396EmprCod ;
   private boolean[] T01NJ60_n396EmprCod ;
   private short[] T01NJ60_A2248ManCod ;
   private java.util.Date[] T01NJ60_A2711RpExHdFe ;
   private short[] T01NJ60_A2713RpExHdLi ;
   private String[] T01NJ61_A396EmprCod ;
   private boolean[] T01NJ61_n396EmprCod ;
   private short[] T01NJ61_A2248ManCod ;
   private String[] T01NJ61_A2689ExHdrFas ;
   private int[] T01NJ61_A2692ExHdrLin ;
   private String[] T01NJ62_A396EmprCod ;
   private boolean[] T01NJ62_n396EmprCod ;
   private int[] T01NJ62_A129BarCod ;
   private boolean[] T01NJ62_n129BarCod ;
   private byte[] T01NJ62_A132BarCodReo ;
   private boolean[] T01NJ62_n132BarCodReo ;
   private String[] T01NJ62_A130BarCodPar ;
   private boolean[] T01NJ62_n130BarCodPar ;
   private String[] T01NJ62_A2494BarDosPro ;
   private String[] T01NJ62_A719PrdNum ;
   private String[] T01NJ63_A396EmprCod ;
   private boolean[] T01NJ63_n396EmprCod ;
   private String[] T01NJ63_A602MaqCod ;
   private java.util.Date[] T01NJ63_A2461PlaFecTin ;
   private int[] T01NJ63_A129BarCod ;
   private boolean[] T01NJ63_n129BarCod ;
   private byte[] T01NJ63_A132BarCodReo ;
   private boolean[] T01NJ63_n132BarCodReo ;
   private String[] T01NJ63_A130BarCodPar ;
   private boolean[] T01NJ63_n130BarCodPar ;
   private String[] T01NJ64_A396EmprCod ;
   private boolean[] T01NJ64_n396EmprCod ;
   private int[] T01NJ64_A129BarCod ;
   private boolean[] T01NJ64_n129BarCod ;
   private byte[] T01NJ64_A132BarCodReo ;
   private boolean[] T01NJ64_n132BarCodReo ;
   private String[] T01NJ64_A130BarCodPar ;
   private boolean[] T01NJ64_n130BarCodPar ;
   private short[] T01NJ64_A2457BarObLin ;
   private String[] T01NJ65_A396EmprCod ;
   private boolean[] T01NJ65_n396EmprCod ;
   private int[] T01NJ65_A129BarCod ;
   private boolean[] T01NJ65_n129BarCod ;
   private byte[] T01NJ65_A132BarCodReo ;
   private boolean[] T01NJ65_n132BarCodReo ;
   private String[] T01NJ65_A130BarCodPar ;
   private boolean[] T01NJ65_n130BarCodPar ;
   private short[] T01NJ65_A2444BarEnLin ;
   private String[] T01NJ66_A396EmprCod ;
   private boolean[] T01NJ66_n396EmprCod ;
   private int[] T01NJ66_A2406ExhAlbCod ;
   private int[] T01NJ66_A129BarCod ;
   private boolean[] T01NJ66_n129BarCod ;
   private byte[] T01NJ66_A132BarCodReo ;
   private boolean[] T01NJ66_n132BarCodReo ;
   private String[] T01NJ66_A130BarCodPar ;
   private boolean[] T01NJ66_n130BarCodPar ;
   private String[] T01NJ67_A396EmprCod ;
   private boolean[] T01NJ67_n396EmprCod ;
   private int[] T01NJ67_A2253SalExtAlb ;
   private int[] T01NJ67_A129BarCod ;
   private boolean[] T01NJ67_n129BarCod ;
   private byte[] T01NJ67_A132BarCodReo ;
   private boolean[] T01NJ67_n132BarCodReo ;
   private String[] T01NJ67_A130BarCodPar ;
   private boolean[] T01NJ67_n130BarCodPar ;
   private String[] T01NJ68_A396EmprCod ;
   private boolean[] T01NJ68_n396EmprCod ;
   private long[] T01NJ68_A30AlbProCod ;
   private int[] T01NJ68_A129BarCod ;
   private boolean[] T01NJ68_n129BarCod ;
   private byte[] T01NJ68_A132BarCodReo ;
   private boolean[] T01NJ68_n132BarCodReo ;
   private String[] T01NJ68_A130BarCodPar ;
   private boolean[] T01NJ68_n130BarCodPar ;
   private String[] T01NJ69_A396EmprCod ;
   private boolean[] T01NJ69_n396EmprCod ;
   private int[] T01NJ69_A1348SolColCod ;
   private String[] T01NJ70_A396EmprCod ;
   private boolean[] T01NJ70_n396EmprCod ;
   private int[] T01NJ70_A1333EstDimCod ;
   private String[] T01NJ71_A396EmprCod ;
   private boolean[] T01NJ71_n396EmprCod ;
   private int[] T01NJ71_A1314EnsLabCod ;
   private String[] T01NJ72_A396EmprCod ;
   private boolean[] T01NJ72_n396EmprCod ;
   private int[] T01NJ72_A129BarCod ;
   private boolean[] T01NJ72_n129BarCod ;
   private byte[] T01NJ72_A132BarCodReo ;
   private boolean[] T01NJ72_n132BarCodReo ;
   private String[] T01NJ72_A130BarCodPar ;
   private boolean[] T01NJ72_n130BarCodPar ;
   private byte[] T01NJ72_A906ObsReoLin ;
   private String[] T01NJ73_A396EmprCod ;
   private boolean[] T01NJ73_n396EmprCod ;
   private int[] T01NJ73_A859CumCodCont ;
   private String[] T01NJ74_A396EmprCod ;
   private boolean[] T01NJ74_n396EmprCod ;
   private String[] T01NJ74_A602MaqCod ;
   private java.util.Date[] T01NJ74_A558HisProFec ;
   private int[] T01NJ74_A561HisProLin ;
   private String[] T01NJ75_A396EmprCod ;
   private boolean[] T01NJ75_n396EmprCod ;
   private int[] T01NJ75_A252CliCod ;
   private boolean[] T01NJ75_n252CliCod ;
   private String[] T01NJ75_A494ForSer ;
   private String[] T01NJ75_A482ForColNom ;
   private int[] T01NJ75_A483ForColNum ;
   private byte[] T01NJ75_A831TipColCod ;
   private String[] T01NJ76_A396EmprCod ;
   private boolean[] T01NJ76_n396EmprCod ;
   private int[] T01NJ76_A129BarCod ;
   private boolean[] T01NJ76_n129BarCod ;
   private byte[] T01NJ76_A132BarCodReo ;
   private boolean[] T01NJ76_n132BarCodReo ;
   private String[] T01NJ76_A130BarCodPar ;
   private boolean[] T01NJ76_n130BarCodPar ;
   private String[] T01NJ76_A200BarPieCod ;
   private String[] T01NJ77_A396EmprCod ;
   private boolean[] T01NJ77_n396EmprCod ;
   private int[] T01NJ77_A129BarCod ;
   private boolean[] T01NJ77_n129BarCod ;
   private byte[] T01NJ77_A132BarCodReo ;
   private boolean[] T01NJ77_n132BarCodReo ;
   private String[] T01NJ77_A130BarCodPar ;
   private boolean[] T01NJ77_n130BarCodPar ;
   private String[] T01NJ77_A758ProCod ;
   private String[] T01NJ78_A396EmprCod ;
   private boolean[] T01NJ78_n396EmprCod ;
   private int[] T01NJ78_A129BarCod ;
   private boolean[] T01NJ78_n129BarCod ;
   private byte[] T01NJ78_A132BarCodReo ;
   private boolean[] T01NJ78_n132BarCodReo ;
   private String[] T01NJ78_A130BarCodPar ;
   private boolean[] T01NJ78_n130BarCodPar ;
   private int[] T01NJ78_A119BarAgrCod ;
   private byte[] T01NJ78_A124BarAgrReo ;
   private String[] T01NJ78_A122BarAgrPar ;
   private String[] T01NJ81_A396EmprCod ;
   private boolean[] T01NJ81_n396EmprCod ;
   private int[] T01NJ81_A129BarCod ;
   private boolean[] T01NJ81_n129BarCod ;
   private byte[] T01NJ81_A132BarCodReo ;
   private boolean[] T01NJ81_n132BarCodReo ;
   private String[] T01NJ81_A130BarCodPar ;
   private boolean[] T01NJ81_n130BarCodPar ;
   private int[] T01NJ82_A129BarCod ;
   private boolean[] T01NJ82_n129BarCod ;
   private byte[] T01NJ82_A132BarCodReo ;
   private boolean[] T01NJ82_n132BarCodReo ;
   private String[] T01NJ82_A130BarCodPar ;
   private boolean[] T01NJ82_n130BarCodPar ;
   private byte[] T01NJ82_A188BarNotLin ;
   private String[] T01NJ82_A187BarNotDsc ;
   private String[] T01NJ82_A396EmprCod ;
   private boolean[] T01NJ82_n396EmprCod ;
   private String[] T01NJ83_A396EmprCod ;
   private boolean[] T01NJ83_n396EmprCod ;
   private int[] T01NJ83_A129BarCod ;
   private boolean[] T01NJ83_n129BarCod ;
   private byte[] T01NJ83_A132BarCodReo ;
   private boolean[] T01NJ83_n132BarCodReo ;
   private String[] T01NJ83_A130BarCodPar ;
   private boolean[] T01NJ83_n130BarCodPar ;
   private byte[] T01NJ83_A188BarNotLin ;
   private int[] T01NJ3_A129BarCod ;
   private boolean[] T01NJ3_n129BarCod ;
   private byte[] T01NJ3_A132BarCodReo ;
   private boolean[] T01NJ3_n132BarCodReo ;
   private String[] T01NJ3_A130BarCodPar ;
   private boolean[] T01NJ3_n130BarCodPar ;
   private byte[] T01NJ3_A188BarNotLin ;
   private String[] T01NJ3_A187BarNotDsc ;
   private String[] T01NJ3_A396EmprCod ;
   private boolean[] T01NJ3_n396EmprCod ;
   private int[] T01NJ2_A129BarCod ;
   private boolean[] T01NJ2_n129BarCod ;
   private byte[] T01NJ2_A132BarCodReo ;
   private boolean[] T01NJ2_n132BarCodReo ;
   private String[] T01NJ2_A130BarCodPar ;
   private boolean[] T01NJ2_n130BarCodPar ;
   private byte[] T01NJ2_A188BarNotLin ;
   private String[] T01NJ2_A187BarNotDsc ;
   private String[] T01NJ2_A396EmprCod ;
   private boolean[] T01NJ2_n396EmprCod ;
   private String[] T01NJ87_A396EmprCod ;
   private boolean[] T01NJ87_n396EmprCod ;
   private int[] T01NJ87_A129BarCod ;
   private boolean[] T01NJ87_n129BarCod ;
   private byte[] T01NJ87_A132BarCodReo ;
   private boolean[] T01NJ87_n132BarCodReo ;
   private String[] T01NJ87_A130BarCodPar ;
   private boolean[] T01NJ87_n130BarCodPar ;
   private byte[] T01NJ87_A188BarNotLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV36WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV37TrnContext ;
}

final  class tnotashdrs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnotashdrs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnotashdrs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnotashdrs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnotashdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NJ2", "SELECT BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc, EmprCod FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarNotLin = ?  FOR UPDATE OF BarNotDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ3", "SELECT BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc, EmprCod FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarNotLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ4", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, NotUltLin, BarSit, BarAgrEst, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, NotUltLin, BarSit, BarAgrEst, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, NotUltLin, BarSit, BarAgrEst, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ7", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ8", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.NotUltLin, TM1.BarSit, TM1.BarAgrEst, T2.EmprNom, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ9", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NJ13", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, NotUltLin, BarSit, BarAgrEst, EmprCod, CliCod, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01NJ14", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, NotUltLin=?, BarSit=?, BarAgrEst=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01NJ15", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01NJ16", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ17", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ18", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ22", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ23", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ24", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ25", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ26", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ27", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ31", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ35", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ36", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ40", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ41", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ42", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ44", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ46", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ49", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ50", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ51", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ52", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ53", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ54", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ55", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ56", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ57", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ58", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ59", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ60", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ61", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ63", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ64", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ65", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ66", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ67", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ68", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ69", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ70", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ71", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ73", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ74", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ75", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NJ78", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NJ79", "UPDATE TXPBARCAD SET NotUltLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01NJ80", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01NJ81", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ82", "SELECT BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc, EmprCod FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarNotLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NJ83", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarNotLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NJ84", "INSERT INTO TXPBARNOT(BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARNOT")
         ,new UpdateCursor("T01NJ85", "UPDATE TXPBARNOT SET BarNotDsc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarNotLin = ?", GX_NOMASK, "TXPBARNOT")
         ,new UpdateCursor("T01NJ86", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarNotLin = ?", GX_NOMASK, "TXPBARNOT")
         ,new ForEachCursor("T01NJ87", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((String[]) buf[15])[0] = rslt.getString(13, 3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 80 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               stmt.setString(10, (String)parms[13], 1);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[17]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[17], 1);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               stmt.setString(5, (String)parms[7], 65);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 3);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 65);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
   }

}

