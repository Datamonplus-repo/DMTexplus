package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbarpin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
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
         A392DisUniMed = httpContext.GetPar( "DisUniMed") ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         AV49PesoML = (byte)(GXutil.lval( httpContext.GetPar( "PesoML"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49PesoML", GXutil.str( AV49PesoML, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_5212( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A392DisUniMed, AV49PesoML) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action69") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_69_5218( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action70") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_70_5218( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action71") == 0 )
      {
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
         A203BarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "BarPieKil"), ".") ;
         A120BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_71_5218( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A203BarPieKil, A120BarAgrEst) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"PEDIDOCLIE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
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
         gx4asapedidoclie5212( A396EmprCod, A4812BarEncCli, A143BarDisNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_74") == 0 )
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
         gxload_74( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_75") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_75( A396EmprCod, A252CliCod) ;
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
            AV43EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43EmprCod, "@!"))));
            AV64BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV64BarCod), "ZZZZZZZ9")));
            AV65BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65BarCodReo", GXutil.str( AV65BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65BarCodReo), "9")));
            AV66BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodPar", AV66BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66BarCodPar, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Kilos, Metros y Piezas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarMat_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      nRC_GXsfl_86 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_86"))) ;
      nGXsfl_86_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_86_idx"))) ;
      sGXsfl_86_idx = httpContext.GetPar( "sGXsfl_86_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      n396EmprCod = false ;
      A392DisUniMed = httpContext.GetPar( "DisUniMed") ;
      AV45F_samofil = (byte)(GXutil.lval( httpContext.GetPar( "F_samofil"))) ;
      A898BarPieNDes = (int)(GXutil.lval( httpContext.GetPar( "BarPieNDes"))) ;
      A365DisDes = httpContext.GetPar( "DisDes") ;
      A199BarPie1 = (short)(GXutil.lval( httpContext.GetPar( "BarPie1"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tbarpin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbarpin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbarpin_impl.class ));
   }

   public tbarpin_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbREst = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedidoClie_Internalname, GXutil.rtrim( A13878PedidoClie), GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedidoClie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedidoClie_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, divUnnamedtable3_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtr_Enabled!=0) ? localUtil.format( A184BarMtr, "ZZZZZ9.99") : localUtil.format( A184BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieNDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPieNDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarUniMed_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarlinea_Internalname, "", httpContext.getMessage( "Eliminar Linea", ""), bttBtneliminarlinea_Jsonclick, 7, httpContext.getMessage( "Eliminar Linea", ""), "", StyleString, ClassString, bttBtneliminarlinea_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e115212_client"+"'", TempTags, "", 2, "HLP_TBARPIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnalta_Internalname, "", httpContext.getMessage( "Alta N Recepcion", ""), bttBtnalta_Jsonclick, 5, httpContext.getMessage( "Alta N Recepcion", ""), "", StyleString, ClassString, bttBtnalta_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOALTA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMat_Internalname, GXutil.rtrim( A182BarMat), GXutil.rtrim( localUtil.format( A182BarMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMat_Jsonclick, 0, "Attribute", "", "", "", "", edtBarMat_Visible, edtBarMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", edtDisCod_Visible, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "Attribute", "", "", "", "", edtDisUniMed_Visible, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie_Jsonclick, 0, "Attribute", "", "", "", "", edtBarPie_Visible, edtBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie1_Internalname, GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A199BarPie1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A199BarPie1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie1_Jsonclick, 0, "Attribute", "", "", "", "", edtBarPie1_Visible, edtBarPie1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "Attribute", "", "", "", "", edtBarSit_Visible, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAgrEst_Visible, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A192BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumUni_Enabled!=0) ? localUtil.format( A192BarNumUni, "ZZZZZ9.99") : localUtil.format( A192BarNumUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumUni_Jsonclick, 0, "Attribute", "", "", "", "", edtBarNumUni_Visible, edtBarNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A191BarNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A191BarNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A191BarNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumPie_Jsonclick, 0, "Attribute", "", "", "", "", edtBarNumPie_Visible, edtBarNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPes_Internalname, GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPes_Jsonclick, 0, "Attribute", "", "", "", "", edtBarPes_Visible, edtBarPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIN.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
      ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
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
      startgridcontrol86( ) ;
      nGXsfl_86_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount18 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_18 = (short)(1) ;
            scanStart5218( ) ;
            while ( RcdFound18 != 0 )
            {
               init_level_properties18( ) ;
               getByPrimaryKey5218( ) ;
               addRow5218( ) ;
               scanNext5218( ) ;
            }
            scanEnd5218( ) ;
            nBlankRcdCount18 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B184BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         B166BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         standaloneNotModal5218( ) ;
         standaloneModal5218( ) ;
         sMode18 = Gx_mode ;
         while ( nGXsfl_86_idx < nRC_GXsfl_86 )
         {
            bGXsfl_86_Refreshing = true ;
            readRow5218( ) ;
            edtBarPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIECOD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEKIL_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEMET_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarPiePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEPIE_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEEST_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarKilLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKILLAN_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarMetLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMETLAN_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarPConTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtPieOriCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEORICOD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtBarPieLzd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELZD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbREnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRENT_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
            cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_86_Refreshing);
            if ( ( nRcdExists_18 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal5218( ) ;
            }
            sendRow5218( ) ;
            bGXsfl_86_Refreshing = false ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A184BarMtr = B184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = B166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount18 = (short)(1) ;
         nRcdExists_18 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart5218( ) ;
            while ( RcdFound18 != 0 )
            {
               sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_8618( ) ;
               init_level_properties18( ) ;
               standaloneNotModal5218( ) ;
               getByPrimaryKey5218( ) ;
               standaloneModal5218( ) ;
               addRow5218( ) ;
               scanNext5218( ) ;
            }
            scanEnd5218( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode18 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_8618( ) ;
         initAll5218( ) ;
         init_level_properties18( ) ;
         B184BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         B166BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         nRcdExists_18 = (short)(0) ;
         nIsMod_18 = (short)(0) ;
         nRcdDeleted_18 = (short)(0) ;
         nBlankRcdCount18 = (short)(nBlankRcdUsr18+nBlankRcdCount18) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount18 > 0 )
         {
            standaloneNotModal5218( ) ;
            standaloneModal5218( ) ;
            addRow5218( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBarPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount18 = (short)(nBlankRcdCount18-1) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A184BarMtr = B184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = B166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
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
      e12522 ();
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
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z4812BarEncCli = httpContext.cgiGet( "Z4812BarEncCli") ;
            Z143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
            Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
            Z1652BarSerDsc = httpContext.cgiGet( "Z1652BarSerDsc") ;
            Z182BarMat = httpContext.cgiGet( "Z182BarMat") ;
            Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
            Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z218BarTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( "Z864BarPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z228BarUniMed = httpContext.cgiGet( "Z228BarUniMed") ;
            Z192BarNumUni = localUtil.ctond( httpContext.cgiGet( "Z192BarNumUni")) ;
            Z191BarNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z191BarNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            A4812BarEncCli = httpContext.cgiGet( "Z4812BarEncCli") ;
            A143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
            O184BarMtr = localUtil.ctond( httpContext.cgiGet( "O184BarMtr")) ;
            O166BarKgm = localUtil.ctond( httpContext.cgiGet( "O166BarKgm")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_86 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_86"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "N361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A4812BarEncCli = httpContext.cgiGet( "BARENCCLI") ;
            A143BarDisNum = httpContext.cgiGet( "BARDISNUM") ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV43EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV64BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV61Insert_DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV49PesoML = (byte)(localUtil.ctol( httpContext.cgiGet( "vPESOML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV67Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV45F_samofil = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_SAMOFIL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16Flag2 = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV18MtrAnt = localUtil.ctond( httpContext.cgiGet( "vMTRANT")) ;
            AV19BarPieAnt = (int)(localUtil.ctol( httpContext.cgiGet( "vBARPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV47Kohler = (byte)(localUtil.ctol( httpContext.cgiGet( "vKOHLER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46Vertex = (byte)(localUtil.ctol( httpContext.cgiGet( "vVERTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvelop_confirmpanel_eliminarlinea_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Objectcall") ;
            Dvelop_confirmpanel_eliminarlinea_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Enabled")) ;
            Dvelop_confirmpanel_eliminarlinea_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Width") ;
            Dvelop_confirmpanel_eliminarlinea_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Height") ;
            Dvelop_confirmpanel_eliminarlinea_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Class") ;
            Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
            Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
            Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
            Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
            Dvelop_confirmpanel_eliminarlinea_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Comment") ;
            Dvelop_confirmpanel_eliminarlinea_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Bodytype") ;
            Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Bodycontentinternalname") ;
            Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
            Dvelop_confirmpanel_eliminarlinea_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Texttype") ;
            Dvelop_confirmpanel_eliminarlinea_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Visible")) ;
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
            A182BarMat = httpContext.cgiGet( edtBarMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A361DisCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            else
            {
               A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
            A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPie1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A213BarSit = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            else
            {
               A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarNumUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarNumUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMUNI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarNumUni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A192BarNumUni = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
            }
            else
            {
               A192BarNumUni = localUtil.ctond( httpContext.cgiGet( edtBarNumUni_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarNumPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A191BarNumPie = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
            }
            else
            {
               A191BarNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarPes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A864BarPes = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
            }
            else
            {
               A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBARPIN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            forbiddenHiddens.add("BarEncCli", GXutil.rtrim( localUtil.format( A4812BarEncCli, "")));
            forbiddenHiddens.add("BarDisNum", GXutil.rtrim( localUtil.format( A143BarDisNum, "")));
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
            forbiddenHiddens.add("BarSerDsc", GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")));
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( A135BarColNom, "")));
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            forbiddenHiddens.add("BarTipCol", localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbarpin:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_520( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "BARCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e13522 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e12522 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e14522 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOALTA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoAlta' */
                        e15522 ();
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
         e14522 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll5212( ) ;
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
         disableAttributes5212( ) ;
      }
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

   public void confirm_520( )
   {
      beforeValidate5212( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls5212( ) ;
         }
         else
         {
            checkExtendedTable5212( ) ;
            closeExtendedTableCursors5212( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_5218( ) ;
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

   public void confirm_5218( )
   {
      s184BarMtr = O184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      s166BarKgm = O166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      s198BarPie = O198BarPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      nGXsfl_86_idx = 0 ;
      while ( nGXsfl_86_idx < nRC_GXsfl_86 )
      {
         readRow5218( ) ;
         if ( ( nRcdExists_18 != 0 ) || ( nIsMod_18 != 0 ) )
         {
            getKey5218( ) ;
            if ( ( nRcdExists_18 == 0 ) && ( nRcdDeleted_18 == 0 ) )
            {
               if ( RcdFound18 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate5218( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable5218( ) ;
                     closeExtendedTableCursors5218( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O184BarMtr = A184BarMtr ;
                     httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                     O166BarKgm = A166BarKgm ;
                     httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                     O198BarPie = A198BarPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
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
               if ( RcdFound18 != 0 )
               {
                  if ( nRcdDeleted_18 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey5218( ) ;
                     load5218( ) ;
                     beforeValidate5218( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls5218( ) ;
                        O184BarMtr = A184BarMtr ;
                        httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                        O166BarKgm = A166BarKgm ;
                        httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                        O198BarPie = A198BarPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_18 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate5218( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable5218( ) ;
                           closeExtendedTableCursors5218( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O184BarMtr = A184BarMtr ;
                           httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                           O166BarKgm = A166BarKgm ;
                           httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                           O198BarPie = A198BarPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_18 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod)) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieOriCod_Internalname, GXutil.rtrim( A908PieOriCod)) ;
         httpContext.changePostValue( edtBarPieLzd_Internalname, GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt)) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_86_idx, GXutil.rtrim( Z200BarPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z203BarPieKil_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z205BarPieMet_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z201BarPieEst_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z170BarKilLan_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z183BarMetLan_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z908PieOriCod_"+sGXsfl_86_idx, GXutil.rtrim( Z908PieOriCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1501BarPiePie_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1501BarPiePie_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T205BarPieMet_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T203BarPieKil_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_18_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_18_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_18_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N205BarPieMet_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_18 != 0 )
         {
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEKIL_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEMET_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEPIE_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEEST_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKILLAN_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMETLAN_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPCONTRO_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEORICOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELZD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O184BarMtr = s184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      O166BarKgm = s166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      O198BarPie = s198BarPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      /* Start of After( level) rules */
      /* Using cursor T00526 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A199BarPie1 = T00526_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T00526_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
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
      /* End of After( level) rules */
   }

   public void resetCaption520( )
   {
   }

   public void e12522( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV42Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tbarpin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Station", AV42Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbarpin_impl.this.A396EmprCod = GXv_char2[0] ;
      tbarpin_impl.this.AV44EmprNom = GXv_char3[0] ;
      tbarpin_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV44EmprNom", AV44EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV39UsurCod", AV39UsurCod);
      GXt_int5 = AV16Flag2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "999999", GXv_int6) ;
      tbarpin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16Flag2 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Flag2", GXutil.str( AV16Flag2, 1, 0));
      GXt_int5 = AV20Flag1 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int6) ;
      tbarpin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20Flag1 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag1", GXutil.str( AV20Flag1, 1, 0));
      GXt_int5 = AV47Kohler ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOCTAR", ""), GXv_int6) ;
      tbarpin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV47Kohler = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Kohler", GXutil.str( AV47Kohler, 1, 0));
      GXv_int6[0] = AV45F_samofil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SAMOFI", ""), GXv_int6) ;
      tbarpin_impl.this.AV45F_samofil = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45F_samofil", GXutil.str( AV45F_samofil, 1, 0));
      GXv_int6[0] = AV49PesoML ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOPML", ""), GXv_int6) ;
      tbarpin_impl.this.AV49PesoML = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49PesoML", GXutil.str( AV49PesoML, 1, 0));
      GXt_int5 = AV46Vertex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int6) ;
      tbarpin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV46Vertex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Vertex", GXutil.str( AV46Vertex, 1, 0));
      GXv_int6[0] = AV50Velta ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int6) ;
      tbarpin_impl.this.AV50Velta = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Velta", GXutil.str( AV50Velta, 1, 0));
      if ( AV50Velta == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = AV51BarMtrOld ;
         GXv_int10[0] = 0 ;
         new app.pbuskmp(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_int10) ;
         tbarpin_impl.this.A396EmprCod = GXv_char4[0] ;
         tbarpin_impl.this.A129BarCod = GXv_int7[0] ;
         tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
         tbarpin_impl.this.A130BarCodPar = GXv_char3[0] ;
         tbarpin_impl.this.AV51BarMtrOld = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV51BarMtrOld", GXutil.ltrimstr( AV51BarMtrOld, 9, 2));
      }
      GXt_char1 = AV42Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tbarpin_impl.this.GXt_char1 = GXv_char4[0] ;
      AV42Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Station", AV42Station);
      GXv_char4[0] = AV43EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char2[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char4, GXv_char3, GXv_char2) ;
      tbarpin_impl.this.AV43EmprCod = GXv_char4[0] ;
      tbarpin_impl.this.AV44EmprNom = GXv_char3[0] ;
      tbarpin_impl.this.AV39UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV44EmprNom", AV44EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV39UsurCod", AV39UsurCod);
      GXv_SdtWWPContext11[0] = AV58WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV58WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV59TrnContext.fromxml(AV60WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV59TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV67Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV68GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GXV1), 8, 0));
         while ( AV68GXV1 <= AV59TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV62TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV59TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV68GXV1));
            if ( GXutil.strcmp(AV62TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "DisCod") == 0 )
            {
               AV61Insert_DisCod = (int)(GXutil.lval( AV62TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61Insert_DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Insert_DisCod), 8, 0));
            }
            AV68GXV1 = (int)(AV68GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GXV1), 8, 0));
         }
      }
      edtBarMat_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Visible), 5, 0), true);
      edtDisCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), true);
      edtDisUniMed_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Visible), 5, 0), true);
      edtBarPie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Visible), 5, 0), true);
      edtBarPie1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie1_Visible), 5, 0), true);
      edtBarSit_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), true);
      edtBarAgrEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtBarNumUni_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumUni_Visible), 5, 0), true);
      edtBarNumPie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPie_Visible), 5, 0), true);
      edtBarPes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
   }

   public void e14522( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e13522( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(5);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e15522( )
   {
      /* 'DoAlta' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwaltpin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A120BarAgrEst)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BarpieCod","AlbRecCodIN","Clicod","cliNom","Barser","BarCod","BarCodReo","BarCodPar","Discod","BarUniMed","BarPes","BarAgrEst","BarPieKilIN","BarPieMetIN","BarPiePieIN"}) , new Object[] {"A396EmprCod","A200BarPieCod","A44AlbRecCod","A252CliCod","A279CliNom","A212BarSer","A129BarCod","A132BarCodReo","A130BarCodPar","A361DisCod","A228BarUniMed","A864BarPes","A120BarAgrEst","A203BarPieKil","A205BarPieMet","A1501BarPiePie"});
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A200BarPieCod ;
      new app.eliminarregistrobarpie(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_char2) ;
      tbarpin_impl.this.A396EmprCod = GXv_char4[0] ;
      tbarpin_impl.this.A129BarCod = GXv_int10[0] ;
      tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
      tbarpin_impl.this.A130BarCodPar = GXv_char3[0] ;
      tbarpin_impl.this.A200BarPieCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
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

   public void zm5212( int GX_JID )
   {
      if ( ( GX_JID == 72 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2759BarMaqGru = T00528_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T00528_A180BarMaqCod[0] ;
            Z4812BarEncCli = T00528_A4812BarEncCli[0] ;
            Z143BarDisNum = T00528_A143BarDisNum[0] ;
            Z212BarSer = T00528_A212BarSer[0] ;
            Z1652BarSerDsc = T00528_A1652BarSerDsc[0] ;
            Z182BarMat = T00528_A182BarMat[0] ;
            Z135BarColNom = T00528_A135BarColNom[0] ;
            Z136BarColNum = T00528_A136BarColNum[0] ;
            Z218BarTipCol = T00528_A218BarTipCol[0] ;
            Z864BarPes = T00528_A864BarPes[0] ;
            Z213BarSit = T00528_A213BarSit[0] ;
            Z120BarAgrEst = T00528_A120BarAgrEst[0] ;
            Z228BarUniMed = T00528_A228BarUniMed[0] ;
            Z192BarNumUni = T00528_A192BarNumUni[0] ;
            Z191BarNumPie = T00528_A191BarNumPie[0] ;
            Z361DisCod = T00528_A361DisCod[0] ;
         }
         else
         {
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
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
         }
      }
      if ( GX_JID == -72 )
      {
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z143BarDisNum = A143BarDisNum ;
         Z252CliCod = A252CliCod ;
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
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z407EmprNom = A407EmprNom ;
         Z166BarKgm = A166BarKgm ;
         Z184BarMtr = A184BarMtr ;
         Z199BarPie1 = A199BarPie1 ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z392DisUniMed = A392DisUniMed ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
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
      divUnnamedtable3_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      AV67Pgmname = "TBARPIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
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
      if ( ! (GXutil.strcmp("", AV43EmprCod)==0) )
      {
         A396EmprCod = AV43EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00529 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00529_A407EmprNom[0] ;
      n407EmprNom = T00529_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      if ( ! (0==AV64BarCod) )
      {
         A129BarCod = AV64BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV64BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV64BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV65BarCodReo) )
      {
         A132BarCodReo = AV65BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV65BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV65BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV66BarCodPar)==0) )
      {
         A130BarCodPar = AV66BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Using cursor T00526 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A166BarKgm = T00526_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = T00526_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T00526_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T00526_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      O166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      O184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      pr_default.close(3);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( ! (GXutil.strcmp("", AV66BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV66BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV61Insert_DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV61Insert_DisCod) )
      {
         A361DisCod = AV61Insert_DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
         /* Using cursor T005210 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T005210_A252CliCod[0] ;
         n252CliCod = T005210_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A392DisUniMed = T005210_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A365DisDes = T005210_A365DisDes[0] ;
         pr_default.close(7);
         /* Using cursor T005211 */
         pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T005211_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(8);
      }
   }

   public void load5212( )
   {
      /* Using cursor T005213 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A2759BarMaqGru = T005213_A2759BarMaqGru[0] ;
         A180BarMaqCod = T005213_A180BarMaqCod[0] ;
         A4812BarEncCli = T005213_A4812BarEncCli[0] ;
         A143BarDisNum = T005213_A143BarDisNum[0] ;
         A252CliCod = T005213_A252CliCod[0] ;
         n252CliCod = T005213_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T005213_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T005213_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T005213_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A182BarMat = T005213_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = T005213_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T005213_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T005213_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A392DisUniMed = T005213_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A864BarPes = T005213_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T005213_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T005213_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = T005213_A407EmprNom[0] ;
         n407EmprNom = T005213_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A228BarUniMed = T005213_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         A192BarNumUni = T005213_A192BarNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
         A191BarNumPie = T005213_A191BarNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
         A365DisDes = T005213_A365DisDes[0] ;
         A361DisCod = T005213_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A166BarKgm = T005213_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = T005213_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T005213_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T005213_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         zm5212( -72) ;
      }
      pr_default.close(9);
      onLoadActions5212( ) ;
   }

   public void onLoadActions5212( )
   {
      O184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      O166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      GXt_char1 = A13878PedidoClie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4812BarEncCli ;
      GXv_char2[0] = A143BarDisNum ;
      GXv_char12[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char12) ;
      tbarpin_impl.this.A396EmprCod = GXv_char4[0] ;
      tbarpin_impl.this.A4812BarEncCli = GXv_char3[0] ;
      tbarpin_impl.this.A143BarDisNum = GXv_char2[0] ;
      tbarpin_impl.this.GXt_char1 = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
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
   }

   public void checkExtendedTable5212( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_12 = (short)(1) ;
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      /* Using cursor T005210 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T005210_A252CliCod[0] ;
      n252CliCod = T005210_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A392DisUniMed = T005210_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T005210_A365DisDes[0] ;
      pr_default.close(7);
      /* Using cursor T005211 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T005211_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(8);
      nIsDirty_12 = (short)(1) ;
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char4[0] = A4812BarEncCli ;
      GXv_char3[0] = A143BarDisNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_char3, GXv_char2) ;
      tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
      tbarpin_impl.this.A4812BarEncCli = GXv_char4[0] ;
      tbarpin_impl.this.A143BarDisNum = GXv_char3[0] ;
      tbarpin_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_12 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
   }

   public void closeExtendedTableCursors5212( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_74( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T005214 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T005214_A252CliCod[0] ;
      n252CliCod = T005214_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A392DisUniMed = T005214_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T005214_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_75( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T005215 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T005215_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey5212( )
   {
      /* Using cursor T005216 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00528 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) && ( T00528_A129BarCod[0] == A129BarCod ) && ( T00528_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00528_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00528_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm5212( 72) ;
         RcdFound12 = (short)(1) ;
         A2759BarMaqGru = T00528_A2759BarMaqGru[0] ;
         A180BarMaqCod = T00528_A180BarMaqCod[0] ;
         A4812BarEncCli = T00528_A4812BarEncCli[0] ;
         A143BarDisNum = T00528_A143BarDisNum[0] ;
         A212BarSer = T00528_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T00528_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A182BarMat = T00528_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = T00528_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T00528_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T00528_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A864BarPes = T00528_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T00528_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T00528_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A228BarUniMed = T00528_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         A192BarNumUni = T00528_A192BarNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
         A191BarNumPie = T00528_A191BarNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
         A361DisCod = T00528_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load5212( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey5212( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey5212( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey5212( ) ;
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
      /* Using cursor T005217 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T005217_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005217_A129BarCod[0] == A129BarCod ) && ( T005217_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T005217_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T005217_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005217_A129BarCod[0] == A129BarCod ) && ( T005217_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T005217_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T005218 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T005218_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005218_A129BarCod[0] == A129BarCod ) && ( T005218_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T005218_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T005218_A396EmprCod[0], A396EmprCod) == 0 ) && ( T005218_A129BarCod[0] == A129BarCod ) && ( T005218_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T005218_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey5212( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A184BarMtr = O184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = O166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A198BarPie = O198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         GX_FocusControl = edtBarMat_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert5212( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarMat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               update5212( ) ;
               GX_FocusControl = edtBarMat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               GX_FocusControl = edtBarMat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert5212( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BARCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A184BarMtr = O184BarMtr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                  A166BarKgm = O166BarKgm ;
                  httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                  A198BarPie = O198BarPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                  GX_FocusControl = edtBarMat_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert5212( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BARCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A184BarMtr = O184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = O166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A198BarPie = O198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarMat_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency5212( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00527 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z2759BarMaqGru, T00527_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T00527_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z4812BarEncCli, T00527_A4812BarEncCli[0]) != 0 ) || ( GXutil.strcmp(Z143BarDisNum, T00527_A143BarDisNum[0]) != 0 ) || ( GXutil.strcmp(Z212BarSer, T00527_A212BarSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1652BarSerDsc, T00527_A1652BarSerDsc[0]) != 0 ) || ( GXutil.strcmp(Z182BarMat, T00527_A182BarMat[0]) != 0 ) || ( GXutil.strcmp(Z135BarColNom, T00527_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T00527_A136BarColNum[0] ) || ( Z218BarTipCol != T00527_A218BarTipCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z864BarPes != T00527_A864BarPes[0] ) || ( Z213BarSit != T00527_A213BarSit[0] ) || ( GXutil.strcmp(Z120BarAgrEst, T00527_A120BarAgrEst[0]) != 0 ) || ( GXutil.strcmp(Z228BarUniMed, T00527_A228BarUniMed[0]) != 0 ) || ( DecimalUtil.compareTo(Z192BarNumUni, T00527_A192BarNumUni[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z191BarNumPie != T00527_A191BarNumPie[0] ) || ( Z361DisCod != T00527_A361DisCod[0] ) )
         {
            if ( GXutil.strcmp(Z2759BarMaqGru, T00527_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T00527_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T00527_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T00527_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z4812BarEncCli, T00527_A4812BarEncCli[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarEncCli");
               GXutil.writeLogRaw("Old: ",Z4812BarEncCli);
               GXutil.writeLogRaw("Current: ",T00527_A4812BarEncCli[0]);
            }
            if ( GXutil.strcmp(Z143BarDisNum, T00527_A143BarDisNum[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarDisNum");
               GXutil.writeLogRaw("Old: ",Z143BarDisNum);
               GXutil.writeLogRaw("Current: ",T00527_A143BarDisNum[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T00527_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T00527_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z1652BarSerDsc, T00527_A1652BarSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarSerDsc");
               GXutil.writeLogRaw("Old: ",Z1652BarSerDsc);
               GXutil.writeLogRaw("Current: ",T00527_A1652BarSerDsc[0]);
            }
            if ( GXutil.strcmp(Z182BarMat, T00527_A182BarMat[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarMat");
               GXutil.writeLogRaw("Old: ",Z182BarMat);
               GXutil.writeLogRaw("Current: ",T00527_A182BarMat[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T00527_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T00527_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T00527_A136BarColNum[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T00527_A136BarColNum[0]);
            }
            if ( Z218BarTipCol != T00527_A218BarTipCol[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarTipCol");
               GXutil.writeLogRaw("Old: ",Z218BarTipCol);
               GXutil.writeLogRaw("Current: ",T00527_A218BarTipCol[0]);
            }
            if ( Z864BarPes != T00527_A864BarPes[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPes");
               GXutil.writeLogRaw("Old: ",Z864BarPes);
               GXutil.writeLogRaw("Current: ",T00527_A864BarPes[0]);
            }
            if ( Z213BarSit != T00527_A213BarSit[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T00527_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T00527_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T00527_A120BarAgrEst[0]);
            }
            if ( GXutil.strcmp(Z228BarUniMed, T00527_A228BarUniMed[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarUniMed");
               GXutil.writeLogRaw("Old: ",Z228BarUniMed);
               GXutil.writeLogRaw("Current: ",T00527_A228BarUniMed[0]);
            }
            if ( DecimalUtil.compareTo(Z192BarNumUni, T00527_A192BarNumUni[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarNumUni");
               GXutil.writeLogRaw("Old: ",Z192BarNumUni);
               GXutil.writeLogRaw("Current: ",T00527_A192BarNumUni[0]);
            }
            if ( Z191BarNumPie != T00527_A191BarNumPie[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarNumPie");
               GXutil.writeLogRaw("Old: ",Z191BarNumPie);
               GXutil.writeLogRaw("Current: ",T00527_A191BarNumPie[0]);
            }
            if ( Z361DisCod != T00527_A361DisCod[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T00527_A361DisCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5212( )
   {
      beforeValidate5212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5212( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5212( 0) ;
         checkOptimisticConcurrency5212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5212( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005219 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, A4812BarEncCli, A143BarDisNum, A212BarSer, A1652BarSerDsc, A182BarMat, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A864BarPes), Byte.valueOf(A213BarSit), A120BarAgrEst, A228BarUniMed, A192BarNumUni, Short.valueOf(A191BarNumPie), Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN15212( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel5212( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         else
         {
            load5212( ) ;
         }
         endLevel5212( ) ;
      }
      closeExtendedTableCursors5212( ) ;
   }

   public void update5212( )
   {
      beforeValidate5212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5212( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5212( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate5212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005220 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, A2759BarMaqGru, A180BarMaqCod, A4812BarEncCli, A143BarDisNum, A212BarSer, A1652BarSerDsc, A182BarMat, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A864BarPes), Byte.valueOf(A213BarSit), A120BarAgrEst, A228BarUniMed, A192BarNumUni, Short.valueOf(A191BarNumPie), Integer.valueOf(A361DisCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate5212( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char12[0] = A396EmprCod ;
                     GXv_int10[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int6, GXv_char4) ;
                     tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
                     tbarpin_impl.this.A129BarCod = GXv_int10[0] ;
                     tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tbarpin_impl.this.A130BarCodPar = GXv_char4[0] ;
                     updateTablesN15212( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel5212( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         endLevel5212( ) ;
      }
      closeExtendedTableCursors5212( ) ;
   }

   public void deferredUpdate5212( )
   {
   }

   public void delete( )
   {
      beforeValidate5212( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5212( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5212( ) ;
         afterConfirm5212( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5212( ) ;
            if ( AnyError == 0 )
            {
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               scanStart5218( ) ;
               while ( RcdFound18 != 0 )
               {
                  getByPrimaryKey5218( ) ;
                  delete5218( ) ;
                  scanNext5218( ) ;
                  O184BarMtr = A184BarMtr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                  O166BarKgm = A166BarKgm ;
                  httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                  O198BarPie = A198BarPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               }
               scanEnd5218( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005221 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN15212( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
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
      endLevel5212( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5212( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T005222 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T005222_A252CliCod[0] ;
         n252CliCod = T005222_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A392DisUniMed = T005222_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A365DisDes = T005222_A365DisDes[0] ;
         pr_default.close(18);
         /* Using cursor T005223 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T005223_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(19);
         GXt_char1 = A13878PedidoClie ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char3[0] = A143BarDisNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_char3, GXv_char2) ;
         tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
         tbarpin_impl.this.A4812BarEncCli = GXv_char4[0] ;
         tbarpin_impl.this.A143BarDisNum = GXv_char3[0] ;
         tbarpin_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
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
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T005224 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T005225 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T005226 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T005227 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T005228 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T005229 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T005230 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T005231 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T005232 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T005233 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T005234 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T005235 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T005236 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T005237 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T005238 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T005239 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T005240 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T005241 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T005242 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T005243 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T005244 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T005245 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T005246 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T005247 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T005248 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T005249 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T005250 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T005251 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T005252 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T005253 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T005254 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T005255 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T005256 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T005257 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T005258 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T005259 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T005260 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T005261 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T005262 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T005263 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T005264 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T005265 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T005266 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T005267 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T005268 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T005269 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T005270 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T005271 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T005272 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T005273 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T005274 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T005275 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T005276 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T005277 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T005278 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T005279 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T005280 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T005281 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T005282 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T005283 */
         pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T005284 */
         pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T005285 */
         pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T005286 */
         pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
      }
   }

   public void processNestedLevel5218( )
   {
      s184BarMtr = O184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      s166BarKgm = O166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      s198BarPie = O198BarPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      nGXsfl_86_idx = 0 ;
      while ( nGXsfl_86_idx < nRC_GXsfl_86 )
      {
         readRow5218( ) ;
         if ( ( nRcdExists_18 != 0 ) || ( nIsMod_18 != 0 ) )
         {
            standaloneNotModal5218( ) ;
            getKey5218( ) ;
            if ( ( nRcdExists_18 == 0 ) && ( nRcdDeleted_18 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert5218( ) ;
            }
            else
            {
               if ( RcdFound18 != 0 )
               {
                  if ( ( nRcdDeleted_18 != 0 ) && ( nRcdExists_18 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete5218( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_18 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update5218( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_18 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O184BarMtr = A184BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            O166BarKgm = A166BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            O198BarPie = A198BarPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         httpContext.changePostValue( edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod)) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieOriCod_Internalname, GXutil.rtrim( A908PieOriCod)) ;
         httpContext.changePostValue( edtBarPieLzd_Internalname, GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt)) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_86_idx, GXutil.rtrim( Z200BarPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z203BarPieKil_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z205BarPieMet_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z201BarPieEst_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z170BarKilLan_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z183BarMetLan_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z908PieOriCod_"+sGXsfl_86_idx, GXutil.rtrim( Z908PieOriCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1501BarPiePie_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1501BarPiePie_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T205BarPieMet_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T203BarPieKil_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_18_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_18_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_18_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N205BarPieMet_"+sGXsfl_86_idx, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_18 != 0 )
         {
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEKIL_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEMET_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEPIE_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEEST_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKILLAN_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMETLAN_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPCONTRO_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEORICOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELZD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T005288 */
      pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(83) != 101) )
      {
         A199BarPie1 = T005288_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T005288_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
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
      /* End of After( level) rules */
      initAll5218( ) ;
      if ( AnyError != 0 )
      {
         O184BarMtr = s184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         O166BarKgm = s166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         O198BarPie = s198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      nRcdExists_18 = (short)(0) ;
      nIsMod_18 = (short)(0) ;
      nRcdDeleted_18 = (short)(0) ;
   }

   public void processLevel5212( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel5218( ) ;
      if ( AnyError != 0 )
      {
         O184BarMtr = s184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         O166BarKgm = s166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         O198BarPie = s198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN15212( )
   {
      /* Using cursor T005289 */
      pr_default.execute(84, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel5212( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete5212( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbarpin");
         if ( AnyError == 0 )
         {
            confirmValues520( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV49PesoML == 0 ) )
         {
            GXv_char12[0] = A396EmprCod ;
            GXv_int10[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            new app.pmodpes(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int6, GXv_char4) ;
            tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
            tbarpin_impl.this.A129BarCod = GXv_int10[0] ;
            tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
            tbarpin_impl.this.A130BarCodPar = GXv_char4[0] ;
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
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarpin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart5212( )
   {
      /* Scan By routine */
      /* Using cursor T005290 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5212( )
   {
      /* Scan next routine */
      pr_default.readNext(85);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEnd5212( )
   {
      pr_default.close(85);
   }

   public void afterConfirm5212( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert5212( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate5212( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5212( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5212( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5212( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5212( )
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
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), true);
      edtBarPie1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie1_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumUni_Enabled), 5, 0), true);
      edtBarNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPie_Enabled), 5, 0), true);
      edtBarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
   }

   public void zm5218( int GX_JID )
   {
      if ( ( GX_JID == 77 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z203BarPieKil = T00523_A203BarPieKil[0] ;
            Z205BarPieMet = T00523_A205BarPieMet[0] ;
            Z201BarPieEst = T00523_A201BarPieEst[0] ;
            Z170BarKilLan = T00523_A170BarKilLan[0] ;
            Z183BarMetLan = T00523_A183BarMetLan[0] ;
            Z197BarPConTro = T00523_A197BarPConTro[0] ;
            Z908PieOriCod = T00523_A908PieOriCod[0] ;
            Z1271BarPieLzd = T00523_A1271BarPieLzd[0] ;
            Z1501BarPiePie = T00523_A1501BarPiePie[0] ;
            Z44AlbRecCod = T00523_A44AlbRecCod[0] ;
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
      if ( GX_JID == -77 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
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
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z47AlbREst = A47AlbREst ;
         Z46AlbREnt = A46AlbREnt ;
      }
   }

   public void standaloneNotModal5218( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarKilLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarMetLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtPieOriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieLzd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_86_Refreshing);
      if ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( AV45F_samofil == 0 ) )
      {
         edtBarPieMet_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      }
      else
      {
         edtBarPieMet_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      }
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
   }

   public void standaloneModal5218( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizar F2 para dar de alta una linea", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T00524 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A60AlbRUniUti = T00524_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T00524_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T00524_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T00524_A52AlbRPieEnt[0] ;
      A47AlbREst = T00524_A47AlbREst[0] ;
      A46AlbREnt = T00524_A46AlbREnt[0] ;
      pr_default.close(2);
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
   }

   public void load5218( )
   {
      /* Using cursor T005291 */
      pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A203BarPieKil = T005291_A203BarPieKil[0] ;
         A60AlbRUniUti = T005291_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T005291_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T005291_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T005291_A52AlbRPieEnt[0] ;
         A47AlbREst = T005291_A47AlbREst[0] ;
         A205BarPieMet = T005291_A205BarPieMet[0] ;
         A201BarPieEst = T005291_A201BarPieEst[0] ;
         A170BarKilLan = T005291_A170BarKilLan[0] ;
         A183BarMetLan = T005291_A183BarMetLan[0] ;
         A197BarPConTro = T005291_A197BarPConTro[0] ;
         A908PieOriCod = T005291_A908PieOriCod[0] ;
         A1271BarPieLzd = T005291_A1271BarPieLzd[0] ;
         A1501BarPiePie = T005291_A1501BarPiePie[0] ;
         A46AlbREnt = T005291_A46AlbREnt[0] ;
         A44AlbRecCod = T005291_A44AlbRecCod[0] ;
         zm5218( -77) ;
      }
      pr_default.close(86);
      onLoadActions5218( ) ;
   }

   public void onLoadActions5218( )
   {
      if ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A203BarPieKil, O203BarPieKil) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, O205BarPieMet) != 0 ) && ( AV16Flag2 != 1 ) )
      {
         A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      if ( isIns( )  )
      {
         A166BarKgm = O166BarKgm.add(A203BarPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A166BarKgm = O166BarKgm.add(A203BarPieKil).subtract(O203BarPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A166BarKgm = O166BarKgm.subtract(O203BarPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            }
         }
      }
      AV17KilAnt = O203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
      if ( isIns( )  )
      {
         A184BarMtr = O184BarMtr.add(A205BarPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A184BarMtr = O184BarMtr.add(A205BarPieMet).subtract(O205BarPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A184BarMtr = O184BarMtr.subtract(O205BarPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
         }
      }
      AV18MtrAnt = O205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
      AV19BarPieAnt = O1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
   }

   public void checkExtendedTable5218( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal5218( ) ;
      if ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A203BarPieKil, O203BarPieKil) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, O205BarPieMet) != 0 ) && ( AV16Flag2 != 1 ) )
      {
         nIsDirty_18 = (short)(1) ;
         A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
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
      if ( isIns( )  )
      {
         nIsDirty_18 = (short)(1) ;
         A166BarKgm = O166BarKgm.add(A203BarPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_18 = (short)(1) ;
            A166BarKgm = O166BarKgm.add(A203BarPieKil).subtract(O203BarPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_18 = (short)(1) ;
               A166BarKgm = O166BarKgm.subtract(O203BarPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            }
         }
      }
      AV17KilAnt = O203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_18 = (short)(1) ;
         A184BarMtr = O184BarMtr.add(A205BarPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_18 = (short)(1) ;
            A184BarMtr = O184BarMtr.add(A205BarPieMet).subtract(O205BarPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_18 = (short)(1) ;
               A184BarMtr = O184BarMtr.subtract(O205BarPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
         }
      }
      AV18MtrAnt = O205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
      AV19BarPieAnt = O1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( AV47Kohler == 0 ) && ( AV46Vertex == 0 ) )
      {
         GXCCtl = "BARPIEPIE_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( ( AV47Kohler == 1 ) || ( AV46Vertex == 1 ) ) )
      {
         GXCCtl = "BARPIEPIE_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. Quantidade de peças dispostas superior à disponível", ""), 0, GXCCtl);
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O205BarPieMet).add(A205BarPieMet)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV47Kohler == 0 ) && ( AV46Vertex == 0 ) )
      {
         GXCCtl = "BARPIEMET_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( AV47Kohler == 0 ) && ( AV46Vertex == 0 ) )
      {
         GXCCtl = "BARPIEKIL_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( ( AV47Kohler == 1 ) || ( AV46Vertex == 1 ) ) )
      {
         GXCCtl = "BARPIEKIL_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, GXCCtl);
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( ( AV47Kohler == 1 ) || ( AV46Vertex == 1 ) ) )
      {
         GXCCtl = "BARPIEKIL_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors5218( )
   {
   }

   public void enableDisable5218( )
   {
   }

   public void getKey5218( )
   {
      /* Using cursor T005292 */
      pr_default.execute(87, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(87);
   }

   public void getByPrimaryKey5218( )
   {
      /* Using cursor T00523 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(1) != 101) && ( T00523_A129BarCod[0] == A129BarCod ) && ( T00523_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00523_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00523_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm5218( 77) ;
         RcdFound18 = (short)(1) ;
         initializeNonKey5218( ) ;
         A200BarPieCod = T00523_A200BarPieCod[0] ;
         A203BarPieKil = T00523_A203BarPieKil[0] ;
         A205BarPieMet = T00523_A205BarPieMet[0] ;
         A201BarPieEst = T00523_A201BarPieEst[0] ;
         A170BarKilLan = T00523_A170BarKilLan[0] ;
         A183BarMetLan = T00523_A183BarMetLan[0] ;
         A197BarPConTro = T00523_A197BarPConTro[0] ;
         A908PieOriCod = T00523_A908PieOriCod[0] ;
         A1271BarPieLzd = T00523_A1271BarPieLzd[0] ;
         A1501BarPiePie = T00523_A1501BarPiePie[0] ;
         A44AlbRecCod = T00523_A44AlbRecCod[0] ;
         O1501BarPiePie = A1501BarPiePie ;
         O205BarPieMet = A205BarPieMet ;
         O203BarPieKil = A203BarPieKil ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load5218( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey5218( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal5218( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes5218( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency5218( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00522 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z203BarPieKil, T00522_A203BarPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z205BarPieMet, T00522_A205BarPieMet[0]) != 0 ) || ( Z201BarPieEst != T00522_A201BarPieEst[0] ) || ( DecimalUtil.compareTo(Z170BarKilLan, T00522_A170BarKilLan[0]) != 0 ) || ( DecimalUtil.compareTo(Z183BarMetLan, T00522_A183BarMetLan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z197BarPConTro != T00522_A197BarPConTro[0] ) || ( GXutil.strcmp(Z908PieOriCod, T00522_A908PieOriCod[0]) != 0 ) || ( Z1271BarPieLzd != T00522_A1271BarPieLzd[0] ) || ( Z1501BarPiePie != T00522_A1501BarPiePie[0] ) || ( Z44AlbRecCod != T00522_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z203BarPieKil, T00522_A203BarPieKil[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPieKil");
               GXutil.writeLogRaw("Old: ",Z203BarPieKil);
               GXutil.writeLogRaw("Current: ",T00522_A203BarPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z205BarPieMet, T00522_A205BarPieMet[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPieMet");
               GXutil.writeLogRaw("Old: ",Z205BarPieMet);
               GXutil.writeLogRaw("Current: ",T00522_A205BarPieMet[0]);
            }
            if ( Z201BarPieEst != T00522_A201BarPieEst[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPieEst");
               GXutil.writeLogRaw("Old: ",Z201BarPieEst);
               GXutil.writeLogRaw("Current: ",T00522_A201BarPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z170BarKilLan, T00522_A170BarKilLan[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarKilLan");
               GXutil.writeLogRaw("Old: ",Z170BarKilLan);
               GXutil.writeLogRaw("Current: ",T00522_A170BarKilLan[0]);
            }
            if ( DecimalUtil.compareTo(Z183BarMetLan, T00522_A183BarMetLan[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarMetLan");
               GXutil.writeLogRaw("Old: ",Z183BarMetLan);
               GXutil.writeLogRaw("Current: ",T00522_A183BarMetLan[0]);
            }
            if ( Z197BarPConTro != T00522_A197BarPConTro[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T00522_A197BarPConTro[0]);
            }
            if ( GXutil.strcmp(Z908PieOriCod, T00522_A908PieOriCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"PieOriCod");
               GXutil.writeLogRaw("Old: ",Z908PieOriCod);
               GXutil.writeLogRaw("Current: ",T00522_A908PieOriCod[0]);
            }
            if ( Z1271BarPieLzd != T00522_A1271BarPieLzd[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPieLzd");
               GXutil.writeLogRaw("Old: ",Z1271BarPieLzd);
               GXutil.writeLogRaw("Current: ",T00522_A1271BarPieLzd[0]);
            }
            if ( Z1501BarPiePie != T00522_A1501BarPiePie[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"BarPiePie");
               GXutil.writeLogRaw("Old: ",Z1501BarPiePie);
               GXutil.writeLogRaw("Current: ",T00522_A1501BarPiePie[0]);
            }
            if ( Z44AlbRecCod != T00522_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tbarpin:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T00522_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5218( )
   {
      beforeValidate5218( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5218( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5218( 0) ;
         checkOptimisticConcurrency5218( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5218( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5218( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005293 */
                  pr_default.execute(88, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(88) == 1) )
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
            load5218( ) ;
         }
         endLevel5218( ) ;
      }
      closeExtendedTableCursors5218( ) ;
   }

   public void update5218( )
   {
      beforeValidate5218( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5218( ) ;
      }
      if ( ( nIsMod_18 != 0 ) || ( nIsDirty_18 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency5218( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm5218( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate5218( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T005294 */
                     pr_default.execute(89, new Object[] {A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                     if ( (pr_default.getStatus(89) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate5218( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int10[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char4[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int6, GXv_char4) ;
                        tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
                        tbarpin_impl.this.A129BarCod = GXv_int10[0] ;
                        tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbarpin_impl.this.A130BarCodPar = GXv_char4[0] ;
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) )
                        {
                           GXv_char12[0] = A396EmprCod ;
                           GXv_int10[0] = A129BarCod ;
                           GXv_int6[0] = A132BarCodReo ;
                           GXv_char4[0] = A130BarCodPar ;
                           new app.pactagr(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int6, GXv_char4) ;
                           tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
                           tbarpin_impl.this.A129BarCod = GXv_int10[0] ;
                           tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
                           tbarpin_impl.this.A130BarCodPar = GXv_char4[0] ;
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
                           GXv_decimal8[0] = AV17KilAnt ;
                           GXv_decimal13[0] = A205BarPieMet ;
                           GXv_decimal14[0] = AV18MtrAnt ;
                           GXv_int15[0] = A1501BarPiePie ;
                           GXv_int16[0] = AV19BarPieAnt ;
                           GXv_char3[0] = httpContext.getMessage( "N", "") ;
                           new app.pmodpdi2(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int7, GXv_char4, GXv_decimal9, GXv_decimal8, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_int16, GXv_char3) ;
                           tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
                           tbarpin_impl.this.A361DisCod = GXv_int10[0] ;
                           tbarpin_impl.this.A44AlbRecCod = GXv_int7[0] ;
                           tbarpin_impl.this.A200BarPieCod = GXv_char4[0] ;
                           tbarpin_impl.this.A203BarPieKil = GXv_decimal9[0] ;
                           tbarpin_impl.this.AV17KilAnt = GXv_decimal8[0] ;
                           tbarpin_impl.this.A205BarPieMet = GXv_decimal13[0] ;
                           tbarpin_impl.this.AV18MtrAnt = GXv_decimal14[0] ;
                           tbarpin_impl.this.A1501BarPiePie = GXv_int15[0] ;
                           tbarpin_impl.this.AV19BarPieAnt = GXv_int16[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey5218( ) ;
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
            endLevel5218( ) ;
         }
      }
      closeExtendedTableCursors5218( ) ;
   }

   public void deferredUpdate5218( )
   {
   }

   public void delete5218( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate5218( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5218( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5218( ) ;
         afterConfirm5218( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5218( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T005295 */
               pr_default.execute(90, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
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
                     tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
                     tbarpin_impl.this.A129BarCod = GXv_int16[0] ;
                     tbarpin_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tbarpin_impl.this.A130BarCodPar = GXv_char4[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                  }
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel5218( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5218( )
   {
      standaloneModal5218( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A166BarKgm = O166BarKgm.add(A203BarPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A166BarKgm = O166BarKgm.add(A203BarPieKil).subtract(O203BarPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A166BarKgm = O166BarKgm.subtract(O203BarPieKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               }
            }
         }
         AV17KilAnt = O203BarPieKil ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
         if ( isIns( )  )
         {
            A184BarMtr = O184BarMtr.add(A205BarPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A184BarMtr = O184BarMtr.add(A205BarPieMet).subtract(O205BarPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A184BarMtr = O184BarMtr.subtract(O205BarPieMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               }
            }
         }
         AV18MtrAnt = O205BarPieMet ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
         AV19BarPieAnt = O1501BarPiePie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T005296 */
         pr_default.execute(91, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T005297 */
         pr_default.execute(92, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T005298 */
         pr_default.execute(93, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
      }
   }

   public void endLevel5218( )
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

   public void scanStart5218( )
   {
      /* Scan By routine */
      /* Using cursor T005299 */
      pr_default.execute(94, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T005299_A200BarPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5218( )
   {
      /* Scan next routine */
      pr_default.readNext(94);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T005299_A200BarPieCod[0] ;
      }
   }

   public void scanEnd5218( )
   {
      pr_default.close(94);
   }

   public void afterConfirm5218( )
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
         tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
         tbarpin_impl.this.A361DisCod = GXv_int16[0] ;
         tbarpin_impl.this.A44AlbRecCod = GXv_int15[0] ;
         tbarpin_impl.this.A200BarPieCod = GXv_char4[0] ;
         tbarpin_impl.this.A203BarPieKil = GXv_decimal14[0] ;
         tbarpin_impl.this.A205BarPieMet = GXv_decimal13[0] ;
         tbarpin_impl.this.A1501BarPiePie = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void beforeInsert5218( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate5218( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5218( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5218( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5218( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5218( )
   {
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarKilLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarMetLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtPieOriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieLzd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_86_Refreshing);
   }

   public void send_integrity_lvl_hashes5218( )
   {
   }

   public void send_integrity_lvl_hashes5212( )
   {
   }

   public void subsflControlProps_8618( )
   {
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_86_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_86_idx ;
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_86_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_86_idx ;
      edtBarPiePie_Internalname = "BARPIEPIE_"+sGXsfl_86_idx ;
      edtBarPieEst_Internalname = "BARPIEEST_"+sGXsfl_86_idx ;
      edtBarKilLan_Internalname = "BARKILLAN_"+sGXsfl_86_idx ;
      edtBarMetLan_Internalname = "BARMETLAN_"+sGXsfl_86_idx ;
      edtBarPConTro_Internalname = "BARPCONTRO_"+sGXsfl_86_idx ;
      edtPieOriCod_Internalname = "PIEORICOD_"+sGXsfl_86_idx ;
      edtBarPieLzd_Internalname = "BARPIELZD_"+sGXsfl_86_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_86_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_86_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_86_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_86_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_86_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_86_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_86_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_86_idx );
   }

   public void subsflControlProps_fel_8618( )
   {
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_86_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_86_fel_idx ;
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_86_fel_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_86_fel_idx ;
      edtBarPiePie_Internalname = "BARPIEPIE_"+sGXsfl_86_fel_idx ;
      edtBarPieEst_Internalname = "BARPIEEST_"+sGXsfl_86_fel_idx ;
      edtBarKilLan_Internalname = "BARKILLAN_"+sGXsfl_86_fel_idx ;
      edtBarMetLan_Internalname = "BARMETLAN_"+sGXsfl_86_fel_idx ;
      edtBarPConTro_Internalname = "BARPCONTRO_"+sGXsfl_86_fel_idx ;
      edtPieOriCod_Internalname = "PIEORICOD_"+sGXsfl_86_fel_idx ;
      edtBarPieLzd_Internalname = "BARPIELZD_"+sGXsfl_86_fel_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_86_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_86_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_86_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_86_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_86_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_86_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_86_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_86_fel_idx );
   }

   public void addRow5218( )
   {
      nGXsfl_86_idx = (int)(nGXsfl_86_idx+1) ;
      sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_8618( ) ;
      sendRow5218( ) ;
   }

   public void sendRow5218( )
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
         if ( ((int)((nGXsfl_86_idx) % (2))) == 0 )
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
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPieCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_86_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_86_idx + "',86)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieKil_Enabled!=0) ? localUtil.format( A203BarPieKil, "ZZZZZ9.99") : localUtil.format( A203BarPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_86_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_86_idx + "',86)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarPieMet_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_86_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_86_idx + "',86)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarPiePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPieEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKilLan_Internalname,GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKilLan_Enabled!=0) ? localUtil.format( A170BarKilLan, "ZZZZZ9.99") : localUtil.format( A170BarKilLan, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKilLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarKilLan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMetLan_Internalname,GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarMetLan_Enabled!=0) ? localUtil.format( A183BarMetLan, "ZZZZZ9.99") : localUtil.format( A183BarMetLan, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMetLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarMetLan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPConTro_Internalname,GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPConTro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPConTro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieOriCod_Internalname,GXutil.rtrim( A908PieOriCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPieOriCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPieOriCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieLzd_Internalname,GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieLzd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieLzd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPieLzd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt_Internalname,GXutil.rtrim( A46AlbREnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbREnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbREnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(86),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBREST_" + sGXsfl_86_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbAlbREst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_86_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes5218( ) ;
      GXCCtl = "Z200BarPieCod_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z200BarPieCod));
      GXCCtl = "Z203BarPieKil_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z205BarPieMet_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z201BarPieEst_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z170BarKilLan_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z183BarMetLan_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z197BarPConTro_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z908PieOriCod_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z908PieOriCod));
      GXCCtl = "Z1271BarPieLzd_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1501BarPiePie_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1501BarPiePie_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O205BarPieMet_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O203BarPieKil_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_18_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_18_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_18_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N205BarPieMet_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV43EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV64BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV65BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_86_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV66BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEKIL_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEMET_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEPIE_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKILLAN_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMETLAN_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPCONTRO_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEORICOD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIELZD_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST_"+sGXsfl_86_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow5218( )
   {
      nGXsfl_86_idx = (int)(nGXsfl_86_idx+1) ;
      sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_8618( ) ;
      edtBarPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIECOD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEKIL_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEMET_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPiePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEPIE_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEEST_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKilLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKILLAN_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMetLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMETLAN_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPConTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPieOriCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEORICOD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieLzd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELZD_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbREnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRENT_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_86_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
      A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEKIL_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
         wbErr = true ;
         A203BarPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEMET_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
         wbErr = true ;
         A205BarPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARPIEPIE_" + sGXsfl_86_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
         wbErr = true ;
         A1501BarPiePie = 0 ;
      }
      else
      {
         A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
      A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
      A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A908PieOriCod = httpContext.cgiGet( edtPieOriCod_Internalname) ;
      A1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
      A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
      A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
      A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
      A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setName( cmbAlbREst.getInternalname() );
      cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
      A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
      GXCCtl = "Z200BarPieCod_" + sGXsfl_86_idx ;
      Z200BarPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z203BarPieKil_" + sGXsfl_86_idx ;
      Z203BarPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z205BarPieMet_" + sGXsfl_86_idx ;
      Z205BarPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z201BarPieEst_" + sGXsfl_86_idx ;
      Z201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z170BarKilLan_" + sGXsfl_86_idx ;
      Z170BarKilLan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z183BarMetLan_" + sGXsfl_86_idx ;
      Z183BarMetLan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z197BarPConTro_" + sGXsfl_86_idx ;
      Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z908PieOriCod_" + sGXsfl_86_idx ;
      Z908PieOriCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1271BarPieLzd_" + sGXsfl_86_idx ;
      Z1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1501BarPiePie_" + sGXsfl_86_idx ;
      Z1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_86_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1501BarPiePie_" + sGXsfl_86_idx ;
      O1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O205BarPieMet_" + sGXsfl_86_idx ;
      O205BarPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O203BarPieKil_" + sGXsfl_86_idx ;
      O203BarPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_18_" + sGXsfl_86_idx ;
      nRcdDeleted_18 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_18_" + sGXsfl_86_idx ;
      nRcdExists_18 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_18_" + sGXsfl_86_idx ;
      nIsMod_18 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N205BarPieMet_" + sGXsfl_86_idx ;
      N205BarPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defcmbAlbREst_Enabled = cmbAlbREst.getEnabled() ;
      defedtAlbRPieEnt_Enabled = edtAlbRPieEnt_Enabled ;
      defedtAlbRUniEnt_Enabled = edtAlbRUniEnt_Enabled ;
      defedtAlbRPieUti_Enabled = edtAlbRPieUti_Enabled ;
      defedtAlbRUniUti_Enabled = edtAlbRUniUti_Enabled ;
      defedtAlbRUniDis_Enabled = edtAlbRUniDis_Enabled ;
      defedtAlbRPieDis_Enabled = edtAlbRPieDis_Enabled ;
      defedtAlbREnt_Enabled = edtAlbREnt_Enabled ;
      defedtBarPieLzd_Enabled = edtBarPieLzd_Enabled ;
      defedtPieOriCod_Enabled = edtPieOriCod_Enabled ;
      defedtBarPConTro_Enabled = edtBarPConTro_Enabled ;
      defedtBarMetLan_Enabled = edtBarMetLan_Enabled ;
      defedtBarKilLan_Enabled = edtBarKilLan_Enabled ;
      defedtBarPieEst_Enabled = edtBarPieEst_Enabled ;
      defedtBarPieMet_Enabled = edtBarPieMet_Enabled ;
      defedtAlbRecCod_Enabled = edtAlbRecCod_Enabled ;
      defedtBarPieCod_Enabled = edtBarPieCod_Enabled ;
   }

   public void confirmValues520( )
   {
      nGXsfl_86_idx = 0 ;
      sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_8618( ) ;
      while ( nGXsfl_86_idx < nRC_GXsfl_86 )
      {
         nGXsfl_86_idx = (int)(nGXsfl_86_idx+1) ;
         sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_8618( ) ;
         httpContext.changePostValue( "Z200BarPieCod_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z200BarPieCod_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z203BarPieKil_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z203BarPieKil_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z203BarPieKil_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z205BarPieMet_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z205BarPieMet_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z205BarPieMet_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z201BarPieEst_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z201BarPieEst_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z201BarPieEst_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z170BarKilLan_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z170BarKilLan_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z170BarKilLan_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z183BarMetLan_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z183BarMetLan_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z183BarMetLan_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z197BarPConTro_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z197BarPConTro_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z908PieOriCod_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z908PieOriCod_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z908PieOriCod_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z1271BarPieLzd_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z1501BarPiePie_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z1501BarPiePie_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1501BarPiePie_"+sGXsfl_86_idx) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_86_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_86_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_86_idx) ;
      }
      httpContext.changePostValue( "O1501BarPiePie", httpContext.cgiGet( "T1501BarPiePie")) ;
      httpContext.deletePostValue( "T1501BarPiePie") ;
      httpContext.changePostValue( "O205BarPieMet", httpContext.cgiGet( "T205BarPieMet")) ;
      httpContext.deletePostValue( "T205BarPieMet") ;
      httpContext.changePostValue( "O203BarPieKil", httpContext.cgiGet( "T203BarPieKil")) ;
      httpContext.deletePostValue( "T203BarPieKil") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tbarpin", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV43EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV64BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66BarCodPar))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARPIN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      forbiddenHiddens.add("BarEncCli", GXutil.rtrim( localUtil.format( A4812BarEncCli, "")));
      forbiddenHiddens.add("BarDisNum", GXutil.rtrim( localUtil.format( A143BarDisNum, "")));
      forbiddenHiddens.add("BarSerDsc", GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")));
      forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( A135BarColNom, "")));
      forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"));
      forbiddenHiddens.add("BarTipCol", localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbarpin:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4812BarEncCli", GXutil.rtrim( Z4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z182BarMat", GXutil.rtrim( Z182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z864BarPes", GXutil.ltrim( localUtil.ntoc( Z864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z228BarUniMed", GXutil.rtrim( Z228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z192BarNumUni", GXutil.ltrim( localUtil.ntoc( Z192BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z191BarNumPie", GXutil.ltrim( localUtil.ntoc( Z191BarNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O184BarMtr", GXutil.ltrim( localUtil.ntoc( O184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O166BarKgm", GXutil.ltrim( localUtil.ntoc( O166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_86", GXutil.ltrim( localUtil.ntoc( nGXsfl_86_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV64BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV64BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV65BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV66BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_DISCOD", GXutil.ltrim( localUtil.ntoc( AV61Insert_DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOML", GXutil.ltrim( localUtil.ntoc( AV49PesoML, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV67Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_SAMOFIL", GXutil.ltrim( localUtil.ntoc( AV45F_samofil, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG2", GXutil.ltrim( localUtil.ntoc( AV16Flag2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV17KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRANT", GXutil.ltrim( localUtil.ntoc( AV18MtrAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEANT", GXutil.ltrim( localUtil.ntoc( AV19BarPieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKOHLER", GXutil.ltrim( localUtil.ntoc( AV47Kohler, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV46Vertex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Enabled", GXutil.booltostr( Dvelop_confirmpanel_eliminarlinea_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
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
      return formatLink("app.tbarpin", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV43EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV64BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66BarCodPar))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TBARPIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Kilos, Metros y Piezas", "") ;
   }

   public void initializeNonKey5212( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A198BarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      A13878PedidoClie = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A4812BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A182BarMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A864BarPes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A228BarUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      A192BarNumUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
      A191BarNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      O166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z4812BarEncCli = "" ;
      Z143BarDisNum = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z182BarMat = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z218BarTipCol = (byte)(0) ;
      Z864BarPes = (short)(0) ;
      Z213BarSit = (byte)(0) ;
      Z120BarAgrEst = "" ;
      Z228BarUniMed = "" ;
      Z192BarNumUni = DecimalUtil.ZERO ;
      Z191BarNumPie = (short)(0) ;
      Z361DisCod = 0 ;
   }

   public void initAll5212( )
   {
      initializeNonKey5212( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey5218( )
   {
      A203BarPieKil = DecimalUtil.ZERO ;
      AV17KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
      AV18MtrAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
      AV19BarPieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A44AlbRecCod = 0 ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A47AlbREst = (byte)(0) ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A201BarPieEst = (byte)(0) ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A197BarPConTro = (short)(0) ;
      A908PieOriCod = "" ;
      A1271BarPieLzd = 0 ;
      A1501BarPiePie = 0 ;
      A46AlbREnt = "" ;
      O1501BarPiePie = A1501BarPiePie ;
      O205BarPieMet = A205BarPieMet ;
      O203BarPieKil = A203BarPieKil ;
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

   public void initAll5218( )
   {
      A200BarPieCod = "" ;
      initializeNonKey5218( ) ;
   }

   public void standaloneModalInsert5218( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512493", true, true);
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
      httpContext.AddJavascriptSource("tbarpin.js", "?20268241512493", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties18( )
   {
      cmbAlbREst.setEnabled( defcmbAlbREst_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieEnt_Enabled = defedtAlbRPieEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniEnt_Enabled = defedtAlbRUniEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieUti_Enabled = defedtAlbRPieUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniUti_Enabled = defedtAlbRUniUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRUniDis_Enabled = defedtAlbRUniDis_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRPieDis_Enabled = defedtAlbRPieDis_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbREnt_Enabled = defedtAlbREnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieLzd_Enabled = defedtBarPieLzd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtPieOriCod_Enabled = defedtPieOriCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPConTro_Enabled = defedtBarPConTro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarMetLan_Enabled = defedtBarMetLan_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarKilLan_Enabled = defedtBarKilLan_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieEst_Enabled = defedtBarPieEst_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieMet_Enabled = defedtBarPieMet_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtAlbRecCod_Enabled = defedtAlbRecCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
      edtBarPieCod_Enabled = defedtBarPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_86_Refreshing);
   }

   public void startgridcontrol86( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A908PieOriCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A46AlbREnt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarPieNDes_Internalname = "BARPIENDES" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      edtBarPiePie_Internalname = "BARPIEPIE" ;
      edtBarPieEst_Internalname = "BARPIEEST" ;
      edtBarKilLan_Internalname = "BARKILLAN" ;
      edtBarMetLan_Internalname = "BARMETLAN" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      edtPieOriCod_Internalname = "PIEORICOD" ;
      edtBarPieLzd_Internalname = "BARPIELZD" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtneliminarlinea_Internalname = "BTNELIMINARLINEA" ;
      bttBtnalta_Internalname = "BTNALTA" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtBarMat_Internalname = "BARMAT" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarPie1_Internalname = "BARPIE1" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarNumUni_Internalname = "BARNUMUNI" ;
      edtBarNumPie_Internalname = "BARNUMPIE" ;
      edtBarPes_Internalname = "BARPES" ;
      edtCliCod_Internalname = "CLICOD" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Kilos, Metros y Piezas", "") );
      cmbAlbREst.setJsonclick( "" );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtBarPieLzd_Jsonclick = "" ;
      edtPieOriCod_Jsonclick = "" ;
      edtBarPConTro_Jsonclick = "" ;
      edtBarMetLan_Jsonclick = "" ;
      edtBarKilLan_Jsonclick = "" ;
      edtBarPieEst_Jsonclick = "" ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieKil_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtBarPieCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      cmbAlbREst.setEnabled( 0 );
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbREnt_Enabled = 0 ;
      edtBarPieLzd_Enabled = 0 ;
      edtPieOriCod_Enabled = 0 ;
      edtBarPConTro_Enabled = 0 ;
      edtBarMetLan_Enabled = 0 ;
      edtBarKilLan_Enabled = 0 ;
      edtBarPieEst_Enabled = 0 ;
      edtBarPiePie_Enabled = 1 ;
      edtBarPieMet_Enabled = 1 ;
      edtBarPieKil_Enabled = 1 ;
      edtAlbRecCod_Enabled = 0 ;
      edtBarPieCod_Enabled = 0 ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtCliCod_Visible = 1 ;
      edtBarPes_Jsonclick = "" ;
      edtBarPes_Enabled = 1 ;
      edtBarPes_Visible = 1 ;
      edtBarNumPie_Jsonclick = "" ;
      edtBarNumPie_Enabled = 1 ;
      edtBarNumPie_Visible = 1 ;
      edtBarNumUni_Jsonclick = "" ;
      edtBarNumUni_Enabled = 1 ;
      edtBarNumUni_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtBarCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarAgrEst_Visible = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 1 ;
      edtBarSit_Visible = 1 ;
      edtBarPie1_Jsonclick = "" ;
      edtBarPie1_Enabled = 0 ;
      edtBarPie1_Visible = 1 ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Enabled = 0 ;
      edtBarPie_Visible = 1 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Enabled = 0 ;
      edtDisUniMed_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
      edtDisCod_Visible = 1 ;
      edtBarMat_Jsonclick = "" ;
      edtBarMat_Enabled = 1 ;
      edtBarMat_Visible = 1 ;
      bttBtnalta_Visible = 1 ;
      bttBtneliminarlinea_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
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
      divUnnamedtable3_Visible = 1 ;
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
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
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

   public void gx4asapedidoclie5212( String A396EmprCod ,
                                     String A4812BarEncCli ,
                                     String A143BarDisNum )
   {
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char4[0] = A4812BarEncCli ;
      GXv_char3[0] = A143BarDisNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_char3, GXv_char2) ;
      tbarpin_impl.this.A396EmprCod = GXv_char12[0] ;
      tbarpin_impl.this.A4812BarEncCli = GXv_char4[0] ;
      tbarpin_impl.this.A143BarDisNum = GXv_char3[0] ;
      tbarpin_impl.this.GXt_char1 = GXv_char2[0] ;
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

   public void xc_30_5212( String A396EmprCod ,
                           int A129BarCod ,
                           byte A132BarCodReo ,
                           String A130BarCodPar ,
                           String A392DisUniMed ,
                           byte AV49PesoML )
   {
      if ( true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV49PesoML == 0 ) )
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

   public void xc_69_5218( )
   {
      if ( true /* After */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int16[0] = A361DisCod ;
         GXv_int15[0] = A44AlbRecCod ;
         GXv_char4[0] = A200BarPieCod ;
         GXv_decimal14[0] = A203BarPieKil ;
         GXv_decimal13[0] = AV17KilAnt ;
         GXv_decimal9[0] = A205BarPieMet ;
         GXv_decimal8[0] = AV18MtrAnt ;
         GXv_int10[0] = A1501BarPiePie ;
         GXv_int7[0] = AV19BarPieAnt ;
         GXv_char3[0] = httpContext.getMessage( "N", "") ;
         new app.pmodpdi2(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int15, GXv_char4, GXv_decimal14, GXv_decimal13, GXv_decimal9, GXv_decimal8, GXv_int10, GXv_int7, GXv_char3) ;
         A396EmprCod = GXv_char12[0] ;
         A361DisCod = GXv_int16[0] ;
         A44AlbRecCod = GXv_int15[0] ;
         A200BarPieCod = GXv_char4[0] ;
         A203BarPieKil = GXv_decimal14[0] ;
         AV17KilAnt = GXv_decimal13[0] ;
         A205BarPieMet = GXv_decimal9[0] ;
         AV18MtrAnt = GXv_decimal8[0] ;
         A1501BarPiePie = GXv_int10[0] ;
         AV19BarPieAnt = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
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

   public void xc_70_5218( )
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

   public void xc_71_5218( String A396EmprCod ,
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_8618( ) ;
      while ( nGXsfl_86_idx <= nRC_GXsfl_86 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal5218( ) ;
         standaloneModal5218( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow5218( ) ;
         nGXsfl_86_idx = (int)(nGXsfl_86_idx+1) ;
         sGXsfl_86_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_86_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_8618( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBREST_" + sGXsfl_86_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
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

   public void valid_Discod( )
   {
      n396EmprCod = false ;
      n252CliCod = false ;
      /* Using cursor T005222 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
      }
      A252CliCod = T005222_A252CliCod[0] ;
      n252CliCod = T005222_n252CliCod[0] ;
      A392DisUniMed = T005222_A392DisUniMed[0] ;
      A365DisDes = T005222_A365DisDes[0] ;
      pr_default.close(18);
      /* Using cursor T005223 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T005223_A279CliNom[0] ;
      pr_default.close(19);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Barpiemet( )
   {
      if ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A203BarPieKil, O203BarPieKil) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, O205BarPieMet) != 0 ) && ( AV16Flag2 != 1 ) )
      {
         A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      AV17KilAnt = O203BarPieKil ;
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( AV47Kohler == 0 ) && ( AV46Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEMET");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( ( AV47Kohler == 1 ) || ( AV46Vertex == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, "BARPIEKIL");
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( ( AV47Kohler == 1 ) || ( AV46Vertex == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, "BARPIEKIL");
      }
      AV18MtrAnt = O205BarPieMet ;
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O205BarPieMet).add(A205BarPieMet)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV47Kohler == 0 ) && ( AV46Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEMET");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrim( localUtil.ntoc( AV17KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrim( localUtil.ntoc( AV18MtrAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Barpiepie( )
   {
      AV19BarPieAnt = O1501BarPiePie ;
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( AV47Kohler == 0 ) && ( AV46Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", ""), 1, "BARPIEPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
      }
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( ( AV47Kohler == 1 ) || ( AV46Vertex == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. Quantidade de peças dispostas superior à disponível", ""), 0, "BARPIEPIE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrim( localUtil.ntoc( AV19BarPieAnt, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV64BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV65BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV66BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV64BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV65BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV66BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e14522',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOELIMINARLINEA'","{handler:'e115212',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOELIMINARLINEA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e13522',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOALTA'","{handler:'e15522',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'}]");
      setEventMetadata("'DOALTA'",",oparms:[{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARPIENDES","{handler:'valid_Barpiendes',iparms:[]");
      setEventMetadata("VALID_BARPIENDES",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[]}");
      setEventMetadata("VALID_BARPIE1","{handler:'valid_Barpie1',iparms:[]");
      setEventMetadata("VALID_BARPIE1",",oparms:[]}");
      setEventMetadata("VALID_BARAGREST","{handler:'valid_Baragrest',iparms:[]");
      setEventMetadata("VALID_BARAGREST",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPES","{handler:'valid_Barpes',iparms:[]");
      setEventMetadata("VALID_BARPES",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_BARPIEKIL","{handler:'valid_Barpiekil',iparms:[]");
      setEventMetadata("VALID_BARPIEKIL",",oparms:[]}");
      setEventMetadata("VALID_BARPIEMET","{handler:'valid_Barpiemet',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O166BarKgm'},{av:'O203BarPieKil'},{av:'O205BarPieMet'},{av:'O184BarMtr'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV16Flag2',fld:'vFLAG2',pic:'9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV47Kohler',fld:'vKOHLER',pic:'9'},{av:'AV46Vertex',fld:'vVERTEX',pic:'9'},{av:'AV17KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV18MtrAnt',fld:'vMTRANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARPIEMET",",oparms:[{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV17KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV18MtrAnt',fld:'vMTRANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARPIEPIE","{handler:'valid_Barpiepie',iparms:[{av:'O1501BarPiePie'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV47Kohler',fld:'vKOHLER',pic:'9'},{av:'AV46Vertex',fld:'vVERTEX',pic:'9'},{av:'AV19BarPieAnt',fld:'vBARPIEANT',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARPIEPIE",",oparms:[{av:'AV19BarPieAnt',fld:'vBARPIEANT',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albrest',iparms:[]");
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
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(83);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV43EmprCod = "" ;
      wcpOAV66BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z4812BarEncCli = "" ;
      Z143BarDisNum = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z182BarMat = "" ;
      Z135BarColNom = "" ;
      Z120BarAgrEst = "" ;
      Z228BarUniMed = "" ;
      Z192BarNumUni = DecimalUtil.ZERO ;
      O184BarMtr = DecimalUtil.ZERO ;
      O166BarKgm = DecimalUtil.ZERO ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
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
      A392DisUniMed = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Gx_mode = "" ;
      AV43EmprCod = "" ;
      AV66BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A365DisDes = "" ;
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
      A228BarUniMed = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtneliminarlinea_Jsonclick = "" ;
      bttBtnalta_Jsonclick = "" ;
      A182BarMat = "" ;
      A407EmprNom = "" ;
      A192BarNumUni = DecimalUtil.ZERO ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B184BarMtr = DecimalUtil.ZERO ;
      B166BarKgm = DecimalUtil.ZERO ;
      sMode18 = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      AV67Pgmname = "" ;
      AV17KilAnt = DecimalUtil.ZERO ;
      AV18MtrAnt = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvelop_confirmpanel_eliminarlinea_Objectcall = "" ;
      Dvelop_confirmpanel_eliminarlinea_Width = "" ;
      Dvelop_confirmpanel_eliminarlinea_Height = "" ;
      Dvelop_confirmpanel_eliminarlinea_Class = "" ;
      Dvelop_confirmpanel_eliminarlinea_Comment = "" ;
      Dvelop_confirmpanel_eliminarlinea_Bodytype = "" ;
      Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_eliminarlinea_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode12 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s184BarMtr = DecimalUtil.ZERO ;
      s166BarKgm = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A46AlbREnt = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      T205BarPieMet = DecimalUtil.ZERO ;
      T203BarPieKil = DecimalUtil.ZERO ;
      T00526_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00526_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00526_A199BarPie1 = new short[1] ;
      T00526_A898BarPieNDes = new int[1] ;
      AV42Station = "" ;
      AV44EmprNom = "" ;
      AV39UsurCod = "" ;
      AV51BarMtrOld = DecimalUtil.ZERO ;
      AV58WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV59TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV60WebSession = httpContext.getWebSession();
      AV62TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z166BarKgm = DecimalUtil.ZERO ;
      Z184BarMtr = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z279CliNom = "" ;
      T00529_A407EmprNom = new String[] {""} ;
      T00529_n407EmprNom = new boolean[] {false} ;
      T005210_A252CliCod = new int[1] ;
      T005210_n252CliCod = new boolean[] {false} ;
      T005210_A392DisUniMed = new String[] {""} ;
      T005210_A365DisDes = new String[] {""} ;
      T005211_A279CliNom = new String[] {""} ;
      T005213_A2759BarMaqGru = new String[] {""} ;
      T005213_A129BarCod = new int[1] ;
      T005213_n129BarCod = new boolean[] {false} ;
      T005213_A132BarCodReo = new byte[1] ;
      T005213_n132BarCodReo = new boolean[] {false} ;
      T005213_A130BarCodPar = new String[] {""} ;
      T005213_n130BarCodPar = new boolean[] {false} ;
      T005213_A180BarMaqCod = new String[] {""} ;
      T005213_A4812BarEncCli = new String[] {""} ;
      T005213_A143BarDisNum = new String[] {""} ;
      T005213_A252CliCod = new int[1] ;
      T005213_n252CliCod = new boolean[] {false} ;
      T005213_A279CliNom = new String[] {""} ;
      T005213_A212BarSer = new String[] {""} ;
      T005213_A1652BarSerDsc = new String[] {""} ;
      T005213_A182BarMat = new String[] {""} ;
      T005213_A135BarColNom = new String[] {""} ;
      T005213_A136BarColNum = new int[1] ;
      T005213_A218BarTipCol = new byte[1] ;
      T005213_A392DisUniMed = new String[] {""} ;
      T005213_A864BarPes = new short[1] ;
      T005213_A213BarSit = new byte[1] ;
      T005213_A120BarAgrEst = new String[] {""} ;
      T005213_A407EmprNom = new String[] {""} ;
      T005213_n407EmprNom = new boolean[] {false} ;
      T005213_A228BarUniMed = new String[] {""} ;
      T005213_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005213_A191BarNumPie = new short[1] ;
      T005213_A365DisDes = new String[] {""} ;
      T005213_A396EmprCod = new String[] {""} ;
      T005213_n396EmprCod = new boolean[] {false} ;
      T005213_A361DisCod = new int[1] ;
      T005213_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005213_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005213_A199BarPie1 = new short[1] ;
      T005213_A898BarPieNDes = new int[1] ;
      T005214_A252CliCod = new int[1] ;
      T005214_n252CliCod = new boolean[] {false} ;
      T005214_A392DisUniMed = new String[] {""} ;
      T005214_A365DisDes = new String[] {""} ;
      T005215_A279CliNom = new String[] {""} ;
      T005216_A396EmprCod = new String[] {""} ;
      T005216_n396EmprCod = new boolean[] {false} ;
      T005216_A129BarCod = new int[1] ;
      T005216_n129BarCod = new boolean[] {false} ;
      T005216_A132BarCodReo = new byte[1] ;
      T005216_n132BarCodReo = new boolean[] {false} ;
      T005216_A130BarCodPar = new String[] {""} ;
      T005216_n130BarCodPar = new boolean[] {false} ;
      T00528_A2759BarMaqGru = new String[] {""} ;
      T00528_A129BarCod = new int[1] ;
      T00528_n129BarCod = new boolean[] {false} ;
      T00528_A132BarCodReo = new byte[1] ;
      T00528_n132BarCodReo = new boolean[] {false} ;
      T00528_A130BarCodPar = new String[] {""} ;
      T00528_n130BarCodPar = new boolean[] {false} ;
      T00528_A180BarMaqCod = new String[] {""} ;
      T00528_A4812BarEncCli = new String[] {""} ;
      T00528_A143BarDisNum = new String[] {""} ;
      T00528_A212BarSer = new String[] {""} ;
      T00528_A1652BarSerDsc = new String[] {""} ;
      T00528_A182BarMat = new String[] {""} ;
      T00528_A135BarColNom = new String[] {""} ;
      T00528_A136BarColNum = new int[1] ;
      T00528_A218BarTipCol = new byte[1] ;
      T00528_A864BarPes = new short[1] ;
      T00528_A213BarSit = new byte[1] ;
      T00528_A120BarAgrEst = new String[] {""} ;
      T00528_A228BarUniMed = new String[] {""} ;
      T00528_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00528_A191BarNumPie = new short[1] ;
      T00528_A396EmprCod = new String[] {""} ;
      T00528_n396EmprCod = new boolean[] {false} ;
      T00528_A361DisCod = new int[1] ;
      T00528_A252CliCod = new int[1] ;
      T00528_n252CliCod = new boolean[] {false} ;
      T00528_A365DisDes = new String[] {""} ;
      T005217_A396EmprCod = new String[] {""} ;
      T005217_n396EmprCod = new boolean[] {false} ;
      T005217_A129BarCod = new int[1] ;
      T005217_n129BarCod = new boolean[] {false} ;
      T005217_A132BarCodReo = new byte[1] ;
      T005217_n132BarCodReo = new boolean[] {false} ;
      T005217_A130BarCodPar = new String[] {""} ;
      T005217_n130BarCodPar = new boolean[] {false} ;
      T005218_A396EmprCod = new String[] {""} ;
      T005218_n396EmprCod = new boolean[] {false} ;
      T005218_A129BarCod = new int[1] ;
      T005218_n129BarCod = new boolean[] {false} ;
      T005218_A132BarCodReo = new byte[1] ;
      T005218_n132BarCodReo = new boolean[] {false} ;
      T005218_A130BarCodPar = new String[] {""} ;
      T005218_n130BarCodPar = new boolean[] {false} ;
      T00527_A2759BarMaqGru = new String[] {""} ;
      T00527_A129BarCod = new int[1] ;
      T00527_n129BarCod = new boolean[] {false} ;
      T00527_A132BarCodReo = new byte[1] ;
      T00527_n132BarCodReo = new boolean[] {false} ;
      T00527_A130BarCodPar = new String[] {""} ;
      T00527_n130BarCodPar = new boolean[] {false} ;
      T00527_A180BarMaqCod = new String[] {""} ;
      T00527_A4812BarEncCli = new String[] {""} ;
      T00527_A143BarDisNum = new String[] {""} ;
      T00527_A212BarSer = new String[] {""} ;
      T00527_A1652BarSerDsc = new String[] {""} ;
      T00527_A182BarMat = new String[] {""} ;
      T00527_A135BarColNom = new String[] {""} ;
      T00527_A136BarColNum = new int[1] ;
      T00527_A218BarTipCol = new byte[1] ;
      T00527_A864BarPes = new short[1] ;
      T00527_A213BarSit = new byte[1] ;
      T00527_A120BarAgrEst = new String[] {""} ;
      T00527_A228BarUniMed = new String[] {""} ;
      T00527_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00527_A191BarNumPie = new short[1] ;
      T00527_A396EmprCod = new String[] {""} ;
      T00527_n396EmprCod = new boolean[] {false} ;
      T00527_A361DisCod = new int[1] ;
      T00527_A252CliCod = new int[1] ;
      T00527_n252CliCod = new boolean[] {false} ;
      T00527_A365DisDes = new String[] {""} ;
      T005222_A252CliCod = new int[1] ;
      T005222_n252CliCod = new boolean[] {false} ;
      T005222_A392DisUniMed = new String[] {""} ;
      T005222_A365DisDes = new String[] {""} ;
      T005223_A279CliNom = new String[] {""} ;
      T005224_A14681MRPrId = new long[1] ;
      T005225_A5921XCjaDis = new String[] {""} ;
      T005225_A5922XCjaCod = new long[1] ;
      T005226_A396EmprCod = new String[] {""} ;
      T005226_n396EmprCod = new boolean[] {false} ;
      T005226_A129BarCod = new int[1] ;
      T005226_n129BarCod = new boolean[] {false} ;
      T005226_A132BarCodReo = new byte[1] ;
      T005226_n132BarCodReo = new boolean[] {false} ;
      T005226_A130BarCodPar = new String[] {""} ;
      T005226_n130BarCodPar = new boolean[] {false} ;
      T005226_A14152MEnvOrd = new short[1] ;
      T005227_A396EmprCod = new String[] {""} ;
      T005227_n396EmprCod = new boolean[] {false} ;
      T005227_A129BarCod = new int[1] ;
      T005227_n129BarCod = new boolean[] {false} ;
      T005227_A132BarCodReo = new byte[1] ;
      T005227_n132BarCodReo = new boolean[] {false} ;
      T005227_A130BarCodPar = new String[] {""} ;
      T005227_n130BarCodPar = new boolean[] {false} ;
      T005227_A13905BarTraID = new String[] {""} ;
      T005228_A396EmprCod = new String[] {""} ;
      T005228_n396EmprCod = new boolean[] {false} ;
      T005228_A129BarCod = new int[1] ;
      T005228_n129BarCod = new boolean[] {false} ;
      T005228_A132BarCodReo = new byte[1] ;
      T005228_n132BarCodReo = new boolean[] {false} ;
      T005228_A130BarCodPar = new String[] {""} ;
      T005228_n130BarCodPar = new boolean[] {false} ;
      T005228_A13093BarDGLin = new byte[1] ;
      T005228_A13094BarDGDibCl = new String[] {""} ;
      T005228_A13095BarDGDibIn = new int[1] ;
      T005228_A13096BarDGComb = new String[] {""} ;
      T005228_A13097BarDGFOndo = new String[] {""} ;
      T005229_A396EmprCod = new String[] {""} ;
      T005229_n396EmprCod = new boolean[] {false} ;
      T005229_A11917Ebd_numero = new int[1] ;
      T005230_A396EmprCod = new String[] {""} ;
      T005230_n396EmprCod = new boolean[] {false} ;
      T005230_A11898Prd_numero = new int[1] ;
      T005231_A396EmprCod = new String[] {""} ;
      T005231_n396EmprCod = new boolean[] {false} ;
      T005231_A11849Cte_numero = new int[1] ;
      T005232_A396EmprCod = new String[] {""} ;
      T005232_n396EmprCod = new boolean[] {false} ;
      T005232_A11791Ap_numero = new int[1] ;
      T005233_A396EmprCod = new String[] {""} ;
      T005233_n396EmprCod = new boolean[] {false} ;
      T005233_A3985CalBarCod = new int[1] ;
      T005233_A3986CalBarCodR = new byte[1] ;
      T005233_A3987CalBarCodP = new String[] {""} ;
      T005234_A396EmprCod = new String[] {""} ;
      T005234_n396EmprCod = new boolean[] {false} ;
      T005234_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T005234_A652OpeCod = new int[1] ;
      T005235_A396EmprCod = new String[] {""} ;
      T005235_n396EmprCod = new boolean[] {false} ;
      T005235_A129BarCod = new int[1] ;
      T005235_n129BarCod = new boolean[] {false} ;
      T005235_A132BarCodReo = new byte[1] ;
      T005235_n132BarCodReo = new boolean[] {false} ;
      T005235_A130BarCodPar = new String[] {""} ;
      T005235_n130BarCodPar = new boolean[] {false} ;
      T005235_A4118tinagrcod = new int[1] ;
      T005235_A4119tinagrreo = new byte[1] ;
      T005235_A4120tinagrpar = new String[] {""} ;
      T005236_A396EmprCod = new String[] {""} ;
      T005236_n396EmprCod = new boolean[] {false} ;
      T005236_A129BarCod = new int[1] ;
      T005236_n129BarCod = new boolean[] {false} ;
      T005236_A132BarCodReo = new byte[1] ;
      T005236_n132BarCodReo = new boolean[] {false} ;
      T005236_A130BarCodPar = new String[] {""} ;
      T005236_n130BarCodPar = new boolean[] {false} ;
      T005236_A4080estagrcod = new int[1] ;
      T005236_A4081estagrreo = new byte[1] ;
      T005236_A4082estagrpar = new String[] {""} ;
      T005237_A396EmprCod = new String[] {""} ;
      T005237_n396EmprCod = new boolean[] {false} ;
      T005237_A129BarCod = new int[1] ;
      T005237_n129BarCod = new boolean[] {false} ;
      T005237_A132BarCodReo = new byte[1] ;
      T005237_n132BarCodReo = new boolean[] {false} ;
      T005237_A130BarCodPar = new String[] {""} ;
      T005237_n130BarCodPar = new boolean[] {false} ;
      T005237_A4075recestncol = new byte[1] ;
      T005237_A4076recestnpro = new byte[1] ;
      T005238_A396EmprCod = new String[] {""} ;
      T005238_n396EmprCod = new boolean[] {false} ;
      T005238_A602MaqCod = new String[] {""} ;
      T005238_A1142MaqFCod = new String[] {""} ;
      T005238_A3068PlaEtaOrd = new short[1] ;
      T005238_A3069PlaEtaOrdA = new byte[1] ;
      T005238_A129BarCod = new int[1] ;
      T005238_n129BarCod = new boolean[] {false} ;
      T005238_A132BarCodReo = new byte[1] ;
      T005238_n132BarCodReo = new boolean[] {false} ;
      T005238_A130BarCodPar = new String[] {""} ;
      T005238_n130BarCodPar = new boolean[] {false} ;
      T005239_A396EmprCod = new String[] {""} ;
      T005239_n396EmprCod = new boolean[] {false} ;
      T005239_A129BarCod = new int[1] ;
      T005239_n129BarCod = new boolean[] {false} ;
      T005239_A132BarCodReo = new byte[1] ;
      T005239_n132BarCodReo = new boolean[] {false} ;
      T005239_A130BarCodPar = new String[] {""} ;
      T005239_n130BarCodPar = new boolean[] {false} ;
      T005239_A4846BarAudLin = new short[1] ;
      T005240_A396EmprCod = new String[] {""} ;
      T005240_n396EmprCod = new boolean[] {false} ;
      T005240_A129BarCod = new int[1] ;
      T005240_n129BarCod = new boolean[] {false} ;
      T005240_A132BarCodReo = new byte[1] ;
      T005240_n132BarCodReo = new boolean[] {false} ;
      T005240_A130BarCodPar = new String[] {""} ;
      T005240_n130BarCodPar = new boolean[] {false} ;
      T005240_A3940BarEnsLin = new short[1] ;
      T005241_A396EmprCod = new String[] {""} ;
      T005241_n396EmprCod = new boolean[] {false} ;
      T005241_A129BarCod = new int[1] ;
      T005241_n129BarCod = new boolean[] {false} ;
      T005241_A132BarCodReo = new byte[1] ;
      T005241_n132BarCodReo = new boolean[] {false} ;
      T005241_A130BarCodPar = new String[] {""} ;
      T005241_n130BarCodPar = new boolean[] {false} ;
      T005241_A3384RefBarCod = new int[1] ;
      T005241_A3385RefBarReo = new byte[1] ;
      T005241_A3386RefBarPar = new String[] {""} ;
      T005242_A396EmprCod = new String[] {""} ;
      T005242_n396EmprCod = new boolean[] {false} ;
      T005242_A10914SolSalCod = new int[1] ;
      T005243_A396EmprCod = new String[] {""} ;
      T005243_n396EmprCod = new boolean[] {false} ;
      T005243_A10364Ph_numero = new int[1] ;
      T005244_A396EmprCod = new String[] {""} ;
      T005244_n396EmprCod = new boolean[] {false} ;
      T005244_A129BarCod = new int[1] ;
      T005244_n129BarCod = new boolean[] {false} ;
      T005244_A132BarCodReo = new byte[1] ;
      T005244_n132BarCodReo = new boolean[] {false} ;
      T005244_A130BarCodPar = new String[] {""} ;
      T005244_n130BarCodPar = new boolean[] {false} ;
      T005244_A10197ProEspCod = new String[] {""} ;
      T005245_A396EmprCod = new String[] {""} ;
      T005245_n396EmprCod = new boolean[] {false} ;
      T005245_A129BarCod = new int[1] ;
      T005245_n129BarCod = new boolean[] {false} ;
      T005245_A132BarCodReo = new byte[1] ;
      T005245_n132BarCodReo = new boolean[] {false} ;
      T005245_A130BarCodPar = new String[] {""} ;
      T005245_n130BarCodPar = new boolean[] {false} ;
      T005245_A5322Dp_Nrecep = new int[1] ;
      T005246_A396EmprCod = new String[] {""} ;
      T005246_n396EmprCod = new boolean[] {false} ;
      T005246_A129BarCod = new int[1] ;
      T005246_n129BarCod = new boolean[] {false} ;
      T005246_A132BarCodReo = new byte[1] ;
      T005246_n132BarCodReo = new boolean[] {false} ;
      T005246_A130BarCodPar = new String[] {""} ;
      T005246_n130BarCodPar = new boolean[] {false} ;
      T005246_A8569EntSecLn = new int[1] ;
      T005247_A396EmprCod = new String[] {""} ;
      T005247_n396EmprCod = new boolean[] {false} ;
      T005247_A7434PLLNro = new int[1] ;
      T005247_A7443LPLNro = new short[1] ;
      T005247_A7459CPLCom = new short[1] ;
      T005247_A129BarCod = new int[1] ;
      T005247_n129BarCod = new boolean[] {false} ;
      T005247_A132BarCodReo = new byte[1] ;
      T005247_n132BarCodReo = new boolean[] {false} ;
      T005247_A130BarCodPar = new String[] {""} ;
      T005247_n130BarCodPar = new boolean[] {false} ;
      T005248_A396EmprCod = new String[] {""} ;
      T005248_n396EmprCod = new boolean[] {false} ;
      T005248_A7145OSSCod = new int[1] ;
      T005249_A396EmprCod = new String[] {""} ;
      T005249_n396EmprCod = new boolean[] {false} ;
      T005249_A7049OGSCod = new int[1] ;
      T005250_A396EmprCod = new String[] {""} ;
      T005250_n396EmprCod = new boolean[] {false} ;
      T005250_A129BarCod = new int[1] ;
      T005250_n129BarCod = new boolean[] {false} ;
      T005250_A132BarCodReo = new byte[1] ;
      T005250_n132BarCodReo = new boolean[] {false} ;
      T005250_A130BarCodPar = new String[] {""} ;
      T005250_n130BarCodPar = new boolean[] {false} ;
      T005250_A6031Ac_Barcod = new int[1] ;
      T005250_A6032Ac_BarReo = new byte[1] ;
      T005250_A6033Ac_BarPar = new String[] {""} ;
      T005251_A396EmprCod = new String[] {""} ;
      T005251_n396EmprCod = new boolean[] {false} ;
      T005251_A129BarCod = new int[1] ;
      T005251_n129BarCod = new boolean[] {false} ;
      T005251_A132BarCodReo = new byte[1] ;
      T005251_n132BarCodReo = new boolean[] {false} ;
      T005251_A130BarCodPar = new String[] {""} ;
      T005251_n130BarCodPar = new boolean[] {false} ;
      T005251_A5908PartPal = new int[1] ;
      T005252_A396EmprCod = new String[] {""} ;
      T005252_n396EmprCod = new boolean[] {false} ;
      T005252_A129BarCod = new int[1] ;
      T005252_n129BarCod = new boolean[] {false} ;
      T005252_A132BarCodReo = new byte[1] ;
      T005252_n132BarCodReo = new boolean[] {false} ;
      T005252_A130BarCodPar = new String[] {""} ;
      T005252_n130BarCodPar = new boolean[] {false} ;
      T005252_A2524DisComLin = new byte[1] ;
      T005252_A1056DisComCod = new String[] {""} ;
      T005252_A1032FonCod = new String[] {""} ;
      T005253_A396EmprCod = new String[] {""} ;
      T005253_n396EmprCod = new boolean[] {false} ;
      T005253_A1736AlbExtCod = new long[1] ;
      T005253_A129BarCod = new int[1] ;
      T005253_n129BarCod = new boolean[] {false} ;
      T005253_A132BarCodReo = new byte[1] ;
      T005253_n132BarCodReo = new boolean[] {false} ;
      T005253_A130BarCodPar = new String[] {""} ;
      T005253_n130BarCodPar = new boolean[] {false} ;
      T005254_A396EmprCod = new String[] {""} ;
      T005254_n396EmprCod = new boolean[] {false} ;
      T005254_A129BarCod = new int[1] ;
      T005254_n129BarCod = new boolean[] {false} ;
      T005254_A132BarCodReo = new byte[1] ;
      T005254_n132BarCodReo = new boolean[] {false} ;
      T005254_A130BarCodPar = new String[] {""} ;
      T005254_n130BarCodPar = new boolean[] {false} ;
      T005254_A3753BarFoaCod = new int[1] ;
      T005254_A3754BarFoaReo = new byte[1] ;
      T005254_A3755BarFoaPar = new String[] {""} ;
      T005255_A396EmprCod = new String[] {""} ;
      T005255_n396EmprCod = new boolean[] {false} ;
      T005255_A129BarCod = new int[1] ;
      T005255_n129BarCod = new boolean[] {false} ;
      T005255_A132BarCodReo = new byte[1] ;
      T005255_n132BarCodReo = new boolean[] {false} ;
      T005255_A130BarCodPar = new String[] {""} ;
      T005255_n130BarCodPar = new boolean[] {false} ;
      T005255_A3747BarPegCod = new int[1] ;
      T005255_A3748BarPegReo = new byte[1] ;
      T005255_A3749BarPegPar = new String[] {""} ;
      T005256_A396EmprCod = new String[] {""} ;
      T005256_n396EmprCod = new boolean[] {false} ;
      T005256_A3253SolTraCod = new int[1] ;
      T005257_A396EmprCod = new String[] {""} ;
      T005257_n396EmprCod = new boolean[] {false} ;
      T005257_A3235SolSubCod = new int[1] ;
      T005258_A396EmprCod = new String[] {""} ;
      T005258_n396EmprCod = new boolean[] {false} ;
      T005258_A3218SolLuzCod = new int[1] ;
      T005259_A396EmprCod = new String[] {""} ;
      T005259_n396EmprCod = new boolean[] {false} ;
      T005259_A3196SolFriCod = new int[1] ;
      T005260_A396EmprCod = new String[] {""} ;
      T005260_n396EmprCod = new boolean[] {false} ;
      T005260_A3165SolPilCod = new int[1] ;
      T005261_A396EmprCod = new String[] {""} ;
      T005261_n396EmprCod = new boolean[] {false} ;
      T005261_A129BarCod = new int[1] ;
      T005261_n129BarCod = new boolean[] {false} ;
      T005261_A132BarCodReo = new byte[1] ;
      T005261_n132BarCodReo = new boolean[] {false} ;
      T005261_A130BarCodPar = new String[] {""} ;
      T005261_n130BarCodPar = new boolean[] {false} ;
      T005261_A2872HAnRLinMaq = new short[1] ;
      T005261_A2873HAnRLinPro = new byte[1] ;
      T005261_A2874HAnRLin = new short[1] ;
      T005261_A2875HAnNumAny = new byte[1] ;
      T005262_A396EmprCod = new String[] {""} ;
      T005262_n396EmprCod = new boolean[] {false} ;
      T005262_A2817PlaTer = new String[] {""} ;
      T005262_A2818PlaOrd = new short[1] ;
      T005263_A396EmprCod = new String[] {""} ;
      T005263_n396EmprCod = new boolean[] {false} ;
      T005263_A2809MetTerCod = new String[] {""} ;
      T005263_A129BarCod = new int[1] ;
      T005263_n129BarCod = new boolean[] {false} ;
      T005263_A132BarCodReo = new byte[1] ;
      T005263_n132BarCodReo = new boolean[] {false} ;
      T005263_A130BarCodPar = new String[] {""} ;
      T005263_n130BarCodPar = new boolean[] {false} ;
      T005264_A396EmprCod = new String[] {""} ;
      T005264_n396EmprCod = new boolean[] {false} ;
      T005264_A129BarCod = new int[1] ;
      T005264_n129BarCod = new boolean[] {false} ;
      T005264_A132BarCodReo = new byte[1] ;
      T005264_n132BarCodReo = new boolean[] {false} ;
      T005264_A130BarCodPar = new String[] {""} ;
      T005264_n130BarCodPar = new boolean[] {false} ;
      T005264_A2808RecLinMAL = new short[1] ;
      T005264_A1377RecNumAny = new byte[1] ;
      T005264_A719PrdNum = new String[] {""} ;
      T005265_A396EmprCod = new String[] {""} ;
      T005265_n396EmprCod = new boolean[] {false} ;
      T005265_A129BarCod = new int[1] ;
      T005265_n129BarCod = new boolean[] {false} ;
      T005265_A132BarCodReo = new byte[1] ;
      T005265_n132BarCodReo = new boolean[] {false} ;
      T005265_A130BarCodPar = new String[] {""} ;
      T005265_n130BarCodPar = new boolean[] {false} ;
      T005265_A2804RecLinMaq = new short[1] ;
      T005266_A396EmprCod = new String[] {""} ;
      T005266_n396EmprCod = new boolean[] {false} ;
      T005266_A2792TermiCod = new String[] {""} ;
      T005266_A129BarCod = new int[1] ;
      T005266_n129BarCod = new boolean[] {false} ;
      T005266_A132BarCodReo = new byte[1] ;
      T005266_n132BarCodReo = new boolean[] {false} ;
      T005266_A130BarCodPar = new String[] {""} ;
      T005266_n130BarCodPar = new boolean[] {false} ;
      T005267_A396EmprCod = new String[] {""} ;
      T005267_n396EmprCod = new boolean[] {false} ;
      T005267_A2248ManCod = new short[1] ;
      T005267_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T005267_A2713RpExHdLi = new short[1] ;
      T005268_A396EmprCod = new String[] {""} ;
      T005268_n396EmprCod = new boolean[] {false} ;
      T005268_A2248ManCod = new short[1] ;
      T005268_A2689ExHdrFas = new String[] {""} ;
      T005268_A2692ExHdrLin = new int[1] ;
      T005269_A396EmprCod = new String[] {""} ;
      T005269_n396EmprCod = new boolean[] {false} ;
      T005269_A129BarCod = new int[1] ;
      T005269_n129BarCod = new boolean[] {false} ;
      T005269_A132BarCodReo = new byte[1] ;
      T005269_n132BarCodReo = new boolean[] {false} ;
      T005269_A130BarCodPar = new String[] {""} ;
      T005269_n130BarCodPar = new boolean[] {false} ;
      T005269_A2494BarDosPro = new String[] {""} ;
      T005269_A719PrdNum = new String[] {""} ;
      T005270_A396EmprCod = new String[] {""} ;
      T005270_n396EmprCod = new boolean[] {false} ;
      T005270_A602MaqCod = new String[] {""} ;
      T005270_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T005270_A129BarCod = new int[1] ;
      T005270_n129BarCod = new boolean[] {false} ;
      T005270_A132BarCodReo = new byte[1] ;
      T005270_n132BarCodReo = new boolean[] {false} ;
      T005270_A130BarCodPar = new String[] {""} ;
      T005270_n130BarCodPar = new boolean[] {false} ;
      T005271_A396EmprCod = new String[] {""} ;
      T005271_n396EmprCod = new boolean[] {false} ;
      T005271_A129BarCod = new int[1] ;
      T005271_n129BarCod = new boolean[] {false} ;
      T005271_A132BarCodReo = new byte[1] ;
      T005271_n132BarCodReo = new boolean[] {false} ;
      T005271_A130BarCodPar = new String[] {""} ;
      T005271_n130BarCodPar = new boolean[] {false} ;
      T005271_A2457BarObLin = new short[1] ;
      T005272_A396EmprCod = new String[] {""} ;
      T005272_n396EmprCod = new boolean[] {false} ;
      T005272_A129BarCod = new int[1] ;
      T005272_n129BarCod = new boolean[] {false} ;
      T005272_A132BarCodReo = new byte[1] ;
      T005272_n132BarCodReo = new boolean[] {false} ;
      T005272_A130BarCodPar = new String[] {""} ;
      T005272_n130BarCodPar = new boolean[] {false} ;
      T005272_A2444BarEnLin = new short[1] ;
      T005273_A396EmprCod = new String[] {""} ;
      T005273_n396EmprCod = new boolean[] {false} ;
      T005273_A2406ExhAlbCod = new int[1] ;
      T005273_A129BarCod = new int[1] ;
      T005273_n129BarCod = new boolean[] {false} ;
      T005273_A132BarCodReo = new byte[1] ;
      T005273_n132BarCodReo = new boolean[] {false} ;
      T005273_A130BarCodPar = new String[] {""} ;
      T005273_n130BarCodPar = new boolean[] {false} ;
      T005274_A396EmprCod = new String[] {""} ;
      T005274_n396EmprCod = new boolean[] {false} ;
      T005274_A2253SalExtAlb = new int[1] ;
      T005274_A129BarCod = new int[1] ;
      T005274_n129BarCod = new boolean[] {false} ;
      T005274_A132BarCodReo = new byte[1] ;
      T005274_n132BarCodReo = new boolean[] {false} ;
      T005274_A130BarCodPar = new String[] {""} ;
      T005274_n130BarCodPar = new boolean[] {false} ;
      T005275_A396EmprCod = new String[] {""} ;
      T005275_n396EmprCod = new boolean[] {false} ;
      T005275_A30AlbProCod = new long[1] ;
      T005275_A129BarCod = new int[1] ;
      T005275_n129BarCod = new boolean[] {false} ;
      T005275_A132BarCodReo = new byte[1] ;
      T005275_n132BarCodReo = new boolean[] {false} ;
      T005275_A130BarCodPar = new String[] {""} ;
      T005275_n130BarCodPar = new boolean[] {false} ;
      T005276_A396EmprCod = new String[] {""} ;
      T005276_n396EmprCod = new boolean[] {false} ;
      T005276_A1348SolColCod = new int[1] ;
      T005277_A396EmprCod = new String[] {""} ;
      T005277_n396EmprCod = new boolean[] {false} ;
      T005277_A1333EstDimCod = new int[1] ;
      T005278_A396EmprCod = new String[] {""} ;
      T005278_n396EmprCod = new boolean[] {false} ;
      T005278_A1314EnsLabCod = new int[1] ;
      T005279_A396EmprCod = new String[] {""} ;
      T005279_n396EmprCod = new boolean[] {false} ;
      T005279_A129BarCod = new int[1] ;
      T005279_n129BarCod = new boolean[] {false} ;
      T005279_A132BarCodReo = new byte[1] ;
      T005279_n132BarCodReo = new boolean[] {false} ;
      T005279_A130BarCodPar = new String[] {""} ;
      T005279_n130BarCodPar = new boolean[] {false} ;
      T005279_A906ObsReoLin = new byte[1] ;
      T005280_A396EmprCod = new String[] {""} ;
      T005280_n396EmprCod = new boolean[] {false} ;
      T005280_A859CumCodCont = new int[1] ;
      T005281_A396EmprCod = new String[] {""} ;
      T005281_n396EmprCod = new boolean[] {false} ;
      T005281_A602MaqCod = new String[] {""} ;
      T005281_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005281_A561HisProLin = new int[1] ;
      T005282_A396EmprCod = new String[] {""} ;
      T005282_n396EmprCod = new boolean[] {false} ;
      T005282_A252CliCod = new int[1] ;
      T005282_n252CliCod = new boolean[] {false} ;
      T005282_A494ForSer = new String[] {""} ;
      T005282_A482ForColNom = new String[] {""} ;
      T005282_A483ForColNum = new int[1] ;
      T005282_A831TipColCod = new byte[1] ;
      T005283_A396EmprCod = new String[] {""} ;
      T005283_n396EmprCod = new boolean[] {false} ;
      T005283_A30AlbProCod = new long[1] ;
      T005283_A129BarCod = new int[1] ;
      T005283_n129BarCod = new boolean[] {false} ;
      T005283_A132BarCodReo = new byte[1] ;
      T005283_n132BarCodReo = new boolean[] {false} ;
      T005283_A130BarCodPar = new String[] {""} ;
      T005283_n130BarCodPar = new boolean[] {false} ;
      T005283_A200BarPieCod = new String[] {""} ;
      T005284_A396EmprCod = new String[] {""} ;
      T005284_n396EmprCod = new boolean[] {false} ;
      T005284_A129BarCod = new int[1] ;
      T005284_n129BarCod = new boolean[] {false} ;
      T005284_A132BarCodReo = new byte[1] ;
      T005284_n132BarCodReo = new boolean[] {false} ;
      T005284_A130BarCodPar = new String[] {""} ;
      T005284_n130BarCodPar = new boolean[] {false} ;
      T005284_A188BarNotLin = new byte[1] ;
      T005285_A396EmprCod = new String[] {""} ;
      T005285_n396EmprCod = new boolean[] {false} ;
      T005285_A129BarCod = new int[1] ;
      T005285_n129BarCod = new boolean[] {false} ;
      T005285_A132BarCodReo = new byte[1] ;
      T005285_n132BarCodReo = new boolean[] {false} ;
      T005285_A130BarCodPar = new String[] {""} ;
      T005285_n130BarCodPar = new boolean[] {false} ;
      T005285_A758ProCod = new String[] {""} ;
      T005286_A396EmprCod = new String[] {""} ;
      T005286_n396EmprCod = new boolean[] {false} ;
      T005286_A129BarCod = new int[1] ;
      T005286_n129BarCod = new boolean[] {false} ;
      T005286_A132BarCodReo = new byte[1] ;
      T005286_n132BarCodReo = new boolean[] {false} ;
      T005286_A130BarCodPar = new String[] {""} ;
      T005286_n130BarCodPar = new boolean[] {false} ;
      T005286_A119BarAgrCod = new int[1] ;
      T005286_A124BarAgrReo = new byte[1] ;
      T005286_A122BarAgrPar = new String[] {""} ;
      T005288_A199BarPie1 = new short[1] ;
      T005288_A898BarPieNDes = new int[1] ;
      T005290_A396EmprCod = new String[] {""} ;
      T005290_n396EmprCod = new boolean[] {false} ;
      T005290_A129BarCod = new int[1] ;
      T005290_n129BarCod = new boolean[] {false} ;
      T005290_A132BarCodReo = new byte[1] ;
      T005290_n132BarCodReo = new boolean[] {false} ;
      T005290_A130BarCodPar = new String[] {""} ;
      T005290_n130BarCodPar = new boolean[] {false} ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z46AlbREnt = "" ;
      T00524_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00524_A54AlbRPieUti = new int[1] ;
      T00524_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00524_A52AlbRPieEnt = new int[1] ;
      T00524_A47AlbREst = new byte[1] ;
      T00524_A46AlbREnt = new String[] {""} ;
      GXCCtl = "" ;
      T005291_A129BarCod = new int[1] ;
      T005291_n129BarCod = new boolean[] {false} ;
      T005291_A132BarCodReo = new byte[1] ;
      T005291_n132BarCodReo = new boolean[] {false} ;
      T005291_A130BarCodPar = new String[] {""} ;
      T005291_n130BarCodPar = new boolean[] {false} ;
      T005291_A200BarPieCod = new String[] {""} ;
      T005291_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005291_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005291_A54AlbRPieUti = new int[1] ;
      T005291_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005291_A52AlbRPieEnt = new int[1] ;
      T005291_A47AlbREst = new byte[1] ;
      T005291_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005291_A201BarPieEst = new byte[1] ;
      T005291_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005291_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005291_A197BarPConTro = new short[1] ;
      T005291_A908PieOriCod = new String[] {""} ;
      T005291_A1271BarPieLzd = new int[1] ;
      T005291_A1501BarPiePie = new int[1] ;
      T005291_A46AlbREnt = new String[] {""} ;
      T005291_A396EmprCod = new String[] {""} ;
      T005291_n396EmprCod = new boolean[] {false} ;
      T005291_A44AlbRecCod = new int[1] ;
      T005292_A396EmprCod = new String[] {""} ;
      T005292_n396EmprCod = new boolean[] {false} ;
      T005292_A129BarCod = new int[1] ;
      T005292_n129BarCod = new boolean[] {false} ;
      T005292_A132BarCodReo = new byte[1] ;
      T005292_n132BarCodReo = new boolean[] {false} ;
      T005292_A130BarCodPar = new String[] {""} ;
      T005292_n130BarCodPar = new boolean[] {false} ;
      T005292_A200BarPieCod = new String[] {""} ;
      T00523_A129BarCod = new int[1] ;
      T00523_n129BarCod = new boolean[] {false} ;
      T00523_A132BarCodReo = new byte[1] ;
      T00523_n132BarCodReo = new boolean[] {false} ;
      T00523_A130BarCodPar = new String[] {""} ;
      T00523_n130BarCodPar = new boolean[] {false} ;
      T00523_A200BarPieCod = new String[] {""} ;
      T00523_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00523_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00523_A201BarPieEst = new byte[1] ;
      T00523_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00523_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00523_A197BarPConTro = new short[1] ;
      T00523_A908PieOriCod = new String[] {""} ;
      T00523_A1271BarPieLzd = new int[1] ;
      T00523_A1501BarPiePie = new int[1] ;
      T00523_A396EmprCod = new String[] {""} ;
      T00523_n396EmprCod = new boolean[] {false} ;
      T00523_A44AlbRecCod = new int[1] ;
      T00522_A129BarCod = new int[1] ;
      T00522_n129BarCod = new boolean[] {false} ;
      T00522_A132BarCodReo = new byte[1] ;
      T00522_n132BarCodReo = new boolean[] {false} ;
      T00522_A130BarCodPar = new String[] {""} ;
      T00522_n130BarCodPar = new boolean[] {false} ;
      T00522_A200BarPieCod = new String[] {""} ;
      T00522_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00522_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00522_A201BarPieEst = new byte[1] ;
      T00522_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00522_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00522_A197BarPConTro = new short[1] ;
      T00522_A908PieOriCod = new String[] {""} ;
      T00522_A1271BarPieLzd = new int[1] ;
      T00522_A1501BarPiePie = new int[1] ;
      T00522_A396EmprCod = new String[] {""} ;
      T00522_n396EmprCod = new boolean[] {false} ;
      T00522_A44AlbRecCod = new int[1] ;
      T005296_A396EmprCod = new String[] {""} ;
      T005296_n396EmprCod = new boolean[] {false} ;
      T005296_A129BarCod = new int[1] ;
      T005296_n129BarCod = new boolean[] {false} ;
      T005296_A132BarCodReo = new byte[1] ;
      T005296_n132BarCodReo = new boolean[] {false} ;
      T005296_A130BarCodPar = new String[] {""} ;
      T005296_n130BarCodPar = new boolean[] {false} ;
      T005296_A200BarPieCod = new String[] {""} ;
      T005296_A12913BarPieLDf = new short[1] ;
      T005297_A396EmprCod = new String[] {""} ;
      T005297_n396EmprCod = new boolean[] {false} ;
      T005297_A129BarCod = new int[1] ;
      T005297_n129BarCod = new boolean[] {false} ;
      T005297_A132BarCodReo = new byte[1] ;
      T005297_n132BarCodReo = new boolean[] {false} ;
      T005297_A130BarCodPar = new String[] {""} ;
      T005297_n130BarCodPar = new boolean[] {false} ;
      T005297_A200BarPieCod = new String[] {""} ;
      T005297_A3858BarTroCod = new short[1] ;
      T005298_A396EmprCod = new String[] {""} ;
      T005298_n396EmprCod = new boolean[] {false} ;
      T005298_A30AlbProCod = new long[1] ;
      T005298_A129BarCod = new int[1] ;
      T005298_n129BarCod = new boolean[] {false} ;
      T005298_A132BarCodReo = new byte[1] ;
      T005298_n132BarCodReo = new boolean[] {false} ;
      T005298_A130BarCodPar = new String[] {""} ;
      T005298_n130BarCodPar = new boolean[] {false} ;
      T005298_A200BarPieCod = new String[] {""} ;
      T005299_A396EmprCod = new String[] {""} ;
      T005299_n396EmprCod = new boolean[] {false} ;
      T005299_A129BarCod = new int[1] ;
      T005299_n129BarCod = new boolean[] {false} ;
      T005299_A132BarCodReo = new byte[1] ;
      T005299_n132BarCodReo = new boolean[] {false} ;
      T005299_A130BarCodPar = new String[] {""} ;
      T005299_n130BarCodPar = new boolean[] {false} ;
      T005299_A200BarPieCod = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
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
      ZV17KilAnt = DecimalUtil.ZERO ;
      ZV18MtrAnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbarpin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbarpin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbarpin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbarpin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbarpin__default(),
         new Object[] {
             new Object[] {
            T00522_A129BarCod, T00522_A132BarCodReo, T00522_A130BarCodPar, T00522_A200BarPieCod, T00522_A203BarPieKil, T00522_A205BarPieMet, T00522_A201BarPieEst, T00522_A170BarKilLan, T00522_A183BarMetLan, T00522_A197BarPConTro,
            T00522_A908PieOriCod, T00522_A1271BarPieLzd, T00522_A1501BarPiePie, T00522_A396EmprCod, T00522_A44AlbRecCod
            }
            , new Object[] {
            T00523_A129BarCod, T00523_A132BarCodReo, T00523_A130BarCodPar, T00523_A200BarPieCod, T00523_A203BarPieKil, T00523_A205BarPieMet, T00523_A201BarPieEst, T00523_A170BarKilLan, T00523_A183BarMetLan, T00523_A197BarPConTro,
            T00523_A908PieOriCod, T00523_A1271BarPieLzd, T00523_A1501BarPiePie, T00523_A396EmprCod, T00523_A44AlbRecCod
            }
            , new Object[] {
            T00524_A60AlbRUniUti, T00524_A54AlbRPieUti, T00524_A58AlbRUniEnt, T00524_A52AlbRPieEnt, T00524_A47AlbREst, T00524_A46AlbREnt
            }
            , new Object[] {
            T00526_A166BarKgm, T00526_A184BarMtr, T00526_A199BarPie1, T00526_A898BarPieNDes
            }
            , new Object[] {
            T00527_A2759BarMaqGru, T00527_A129BarCod, T00527_A132BarCodReo, T00527_A130BarCodPar, T00527_A180BarMaqCod, T00527_A4812BarEncCli, T00527_A143BarDisNum, T00527_A212BarSer, T00527_A1652BarSerDsc, T00527_A182BarMat,
            T00527_A135BarColNom, T00527_A136BarColNum, T00527_A218BarTipCol, T00527_A864BarPes, T00527_A213BarSit, T00527_A120BarAgrEst, T00527_A228BarUniMed, T00527_A192BarNumUni, T00527_A191BarNumPie, T00527_A396EmprCod,
            T00527_A361DisCod, T00527_A252CliCod, T00527_n252CliCod, T00527_A365DisDes
            }
            , new Object[] {
            T00528_A2759BarMaqGru, T00528_A129BarCod, T00528_A132BarCodReo, T00528_A130BarCodPar, T00528_A180BarMaqCod, T00528_A4812BarEncCli, T00528_A143BarDisNum, T00528_A212BarSer, T00528_A1652BarSerDsc, T00528_A182BarMat,
            T00528_A135BarColNom, T00528_A136BarColNum, T00528_A218BarTipCol, T00528_A864BarPes, T00528_A213BarSit, T00528_A120BarAgrEst, T00528_A228BarUniMed, T00528_A192BarNumUni, T00528_A191BarNumPie, T00528_A396EmprCod,
            T00528_A361DisCod, T00528_A252CliCod, T00528_n252CliCod, T00528_A365DisDes
            }
            , new Object[] {
            T00529_A407EmprNom, T00529_n407EmprNom
            }
            , new Object[] {
            T005210_A252CliCod, T005210_A392DisUniMed, T005210_A365DisDes
            }
            , new Object[] {
            T005211_A279CliNom
            }
            , new Object[] {
            T005213_A2759BarMaqGru, T005213_A129BarCod, T005213_A132BarCodReo, T005213_A130BarCodPar, T005213_A180BarMaqCod, T005213_A4812BarEncCli, T005213_A143BarDisNum, T005213_A252CliCod, T005213_n252CliCod, T005213_A279CliNom,
            T005213_A212BarSer, T005213_A1652BarSerDsc, T005213_A182BarMat, T005213_A135BarColNom, T005213_A136BarColNum, T005213_A218BarTipCol, T005213_A392DisUniMed, T005213_A864BarPes, T005213_A213BarSit, T005213_A120BarAgrEst,
            T005213_A407EmprNom, T005213_n407EmprNom, T005213_A228BarUniMed, T005213_A192BarNumUni, T005213_A191BarNumPie, T005213_A365DisDes, T005213_A396EmprCod, T005213_A361DisCod, T005213_A166BarKgm, T005213_A184BarMtr,
            T005213_A199BarPie1, T005213_A898BarPieNDes
            }
            , new Object[] {
            T005214_A252CliCod, T005214_A392DisUniMed, T005214_A365DisDes
            }
            , new Object[] {
            T005215_A279CliNom
            }
            , new Object[] {
            T005216_A396EmprCod, T005216_A129BarCod, T005216_A132BarCodReo, T005216_A130BarCodPar
            }
            , new Object[] {
            T005217_A396EmprCod, T005217_A129BarCod, T005217_A132BarCodReo, T005217_A130BarCodPar
            }
            , new Object[] {
            T005218_A396EmprCod, T005218_A129BarCod, T005218_A132BarCodReo, T005218_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T005222_A252CliCod, T005222_A392DisUniMed, T005222_A365DisDes
            }
            , new Object[] {
            T005223_A279CliNom
            }
            , new Object[] {
            T005224_A14681MRPrId
            }
            , new Object[] {
            T005225_A5921XCjaDis, T005225_A5922XCjaCod
            }
            , new Object[] {
            T005226_A396EmprCod, T005226_A129BarCod, T005226_A132BarCodReo, T005226_A130BarCodPar, T005226_A14152MEnvOrd
            }
            , new Object[] {
            T005227_A396EmprCod, T005227_A129BarCod, T005227_A132BarCodReo, T005227_A130BarCodPar, T005227_A13905BarTraID
            }
            , new Object[] {
            T005228_A396EmprCod, T005228_A129BarCod, T005228_A132BarCodReo, T005228_A130BarCodPar, T005228_A13093BarDGLin, T005228_A13094BarDGDibCl, T005228_A13095BarDGDibIn, T005228_A13096BarDGComb, T005228_A13097BarDGFOndo
            }
            , new Object[] {
            T005229_A396EmprCod, T005229_A11917Ebd_numero
            }
            , new Object[] {
            T005230_A396EmprCod, T005230_A11898Prd_numero
            }
            , new Object[] {
            T005231_A396EmprCod, T005231_A11849Cte_numero
            }
            , new Object[] {
            T005232_A396EmprCod, T005232_A11791Ap_numero
            }
            , new Object[] {
            T005233_A396EmprCod, T005233_A3985CalBarCod, T005233_A3986CalBarCodR, T005233_A3987CalBarCodP
            }
            , new Object[] {
            T005234_A396EmprCod, T005234_A5294InPTime, T005234_A652OpeCod
            }
            , new Object[] {
            T005235_A396EmprCod, T005235_A129BarCod, T005235_A132BarCodReo, T005235_A130BarCodPar, T005235_A4118tinagrcod, T005235_A4119tinagrreo, T005235_A4120tinagrpar
            }
            , new Object[] {
            T005236_A396EmprCod, T005236_A129BarCod, T005236_A132BarCodReo, T005236_A130BarCodPar, T005236_A4080estagrcod, T005236_A4081estagrreo, T005236_A4082estagrpar
            }
            , new Object[] {
            T005237_A396EmprCod, T005237_A129BarCod, T005237_A132BarCodReo, T005237_A130BarCodPar, T005237_A4075recestncol, T005237_A4076recestnpro
            }
            , new Object[] {
            T005238_A396EmprCod, T005238_A602MaqCod, T005238_A1142MaqFCod, T005238_A3068PlaEtaOrd, T005238_A3069PlaEtaOrdA, T005238_A129BarCod, T005238_A132BarCodReo, T005238_A130BarCodPar
            }
            , new Object[] {
            T005239_A396EmprCod, T005239_A129BarCod, T005239_A132BarCodReo, T005239_A130BarCodPar, T005239_A4846BarAudLin
            }
            , new Object[] {
            T005240_A396EmprCod, T005240_A129BarCod, T005240_A132BarCodReo, T005240_A130BarCodPar, T005240_A3940BarEnsLin
            }
            , new Object[] {
            T005241_A396EmprCod, T005241_A129BarCod, T005241_A132BarCodReo, T005241_A130BarCodPar, T005241_A3384RefBarCod, T005241_A3385RefBarReo, T005241_A3386RefBarPar
            }
            , new Object[] {
            T005242_A396EmprCod, T005242_A10914SolSalCod
            }
            , new Object[] {
            T005243_A396EmprCod, T005243_A10364Ph_numero
            }
            , new Object[] {
            T005244_A396EmprCod, T005244_A129BarCod, T005244_A132BarCodReo, T005244_A130BarCodPar, T005244_A10197ProEspCod
            }
            , new Object[] {
            T005245_A396EmprCod, T005245_A129BarCod, T005245_A132BarCodReo, T005245_A130BarCodPar, T005245_A5322Dp_Nrecep
            }
            , new Object[] {
            T005246_A396EmprCod, T005246_A129BarCod, T005246_A132BarCodReo, T005246_A130BarCodPar, T005246_A8569EntSecLn
            }
            , new Object[] {
            T005247_A396EmprCod, T005247_A7434PLLNro, T005247_A7443LPLNro, T005247_A7459CPLCom, T005247_A129BarCod, T005247_A132BarCodReo, T005247_A130BarCodPar
            }
            , new Object[] {
            T005248_A396EmprCod, T005248_A7145OSSCod
            }
            , new Object[] {
            T005249_A396EmprCod, T005249_A7049OGSCod
            }
            , new Object[] {
            T005250_A396EmprCod, T005250_A129BarCod, T005250_A132BarCodReo, T005250_A130BarCodPar, T005250_A6031Ac_Barcod, T005250_A6032Ac_BarReo, T005250_A6033Ac_BarPar
            }
            , new Object[] {
            T005251_A396EmprCod, T005251_A129BarCod, T005251_A132BarCodReo, T005251_A130BarCodPar, T005251_A5908PartPal
            }
            , new Object[] {
            T005252_A396EmprCod, T005252_A129BarCod, T005252_A132BarCodReo, T005252_A130BarCodPar, T005252_A2524DisComLin, T005252_A1056DisComCod, T005252_A1032FonCod
            }
            , new Object[] {
            T005253_A396EmprCod, T005253_A1736AlbExtCod, T005253_A129BarCod, T005253_A132BarCodReo, T005253_A130BarCodPar
            }
            , new Object[] {
            T005254_A396EmprCod, T005254_A129BarCod, T005254_A132BarCodReo, T005254_A130BarCodPar, T005254_A3753BarFoaCod, T005254_A3754BarFoaReo, T005254_A3755BarFoaPar
            }
            , new Object[] {
            T005255_A396EmprCod, T005255_A129BarCod, T005255_A132BarCodReo, T005255_A130BarCodPar, T005255_A3747BarPegCod, T005255_A3748BarPegReo, T005255_A3749BarPegPar
            }
            , new Object[] {
            T005256_A396EmprCod, T005256_A3253SolTraCod
            }
            , new Object[] {
            T005257_A396EmprCod, T005257_A3235SolSubCod
            }
            , new Object[] {
            T005258_A396EmprCod, T005258_A3218SolLuzCod
            }
            , new Object[] {
            T005259_A396EmprCod, T005259_A3196SolFriCod
            }
            , new Object[] {
            T005260_A396EmprCod, T005260_A3165SolPilCod
            }
            , new Object[] {
            T005261_A396EmprCod, T005261_A129BarCod, T005261_A132BarCodReo, T005261_A130BarCodPar, T005261_A2872HAnRLinMaq, T005261_A2873HAnRLinPro, T005261_A2874HAnRLin, T005261_A2875HAnNumAny
            }
            , new Object[] {
            T005262_A396EmprCod, T005262_A2817PlaTer, T005262_A2818PlaOrd
            }
            , new Object[] {
            T005263_A396EmprCod, T005263_A2809MetTerCod, T005263_A129BarCod, T005263_A132BarCodReo, T005263_A130BarCodPar
            }
            , new Object[] {
            T005264_A396EmprCod, T005264_A129BarCod, T005264_A132BarCodReo, T005264_A130BarCodPar, T005264_A2808RecLinMAL, T005264_A1377RecNumAny, T005264_A719PrdNum
            }
            , new Object[] {
            T005265_A396EmprCod, T005265_A129BarCod, T005265_A132BarCodReo, T005265_A130BarCodPar, T005265_A2804RecLinMaq
            }
            , new Object[] {
            T005266_A396EmprCod, T005266_A2792TermiCod, T005266_A129BarCod, T005266_A132BarCodReo, T005266_A130BarCodPar
            }
            , new Object[] {
            T005267_A396EmprCod, T005267_A2248ManCod, T005267_A2711RpExHdFe, T005267_A2713RpExHdLi
            }
            , new Object[] {
            T005268_A396EmprCod, T005268_A2248ManCod, T005268_A2689ExHdrFas, T005268_A2692ExHdrLin
            }
            , new Object[] {
            T005269_A396EmprCod, T005269_A129BarCod, T005269_A132BarCodReo, T005269_A130BarCodPar, T005269_A2494BarDosPro, T005269_A719PrdNum
            }
            , new Object[] {
            T005270_A396EmprCod, T005270_A602MaqCod, T005270_A2461PlaFecTin, T005270_A129BarCod, T005270_A132BarCodReo, T005270_A130BarCodPar
            }
            , new Object[] {
            T005271_A396EmprCod, T005271_A129BarCod, T005271_A132BarCodReo, T005271_A130BarCodPar, T005271_A2457BarObLin
            }
            , new Object[] {
            T005272_A396EmprCod, T005272_A129BarCod, T005272_A132BarCodReo, T005272_A130BarCodPar, T005272_A2444BarEnLin
            }
            , new Object[] {
            T005273_A396EmprCod, T005273_A2406ExhAlbCod, T005273_A129BarCod, T005273_A132BarCodReo, T005273_A130BarCodPar
            }
            , new Object[] {
            T005274_A396EmprCod, T005274_A2253SalExtAlb, T005274_A129BarCod, T005274_A132BarCodReo, T005274_A130BarCodPar
            }
            , new Object[] {
            T005275_A396EmprCod, T005275_A30AlbProCod, T005275_A129BarCod, T005275_A132BarCodReo, T005275_A130BarCodPar
            }
            , new Object[] {
            T005276_A396EmprCod, T005276_A1348SolColCod
            }
            , new Object[] {
            T005277_A396EmprCod, T005277_A1333EstDimCod
            }
            , new Object[] {
            T005278_A396EmprCod, T005278_A1314EnsLabCod
            }
            , new Object[] {
            T005279_A396EmprCod, T005279_A129BarCod, T005279_A132BarCodReo, T005279_A130BarCodPar, T005279_A906ObsReoLin
            }
            , new Object[] {
            T005280_A396EmprCod, T005280_A859CumCodCont
            }
            , new Object[] {
            T005281_A396EmprCod, T005281_A602MaqCod, T005281_A558HisProFec, T005281_A561HisProLin
            }
            , new Object[] {
            T005282_A396EmprCod, T005282_A252CliCod, T005282_A494ForSer, T005282_A482ForColNom, T005282_A483ForColNum, T005282_A831TipColCod
            }
            , new Object[] {
            T005283_A396EmprCod, T005283_A30AlbProCod, T005283_A129BarCod, T005283_A132BarCodReo, T005283_A130BarCodPar, T005283_A200BarPieCod
            }
            , new Object[] {
            T005284_A396EmprCod, T005284_A129BarCod, T005284_A132BarCodReo, T005284_A130BarCodPar, T005284_A188BarNotLin
            }
            , new Object[] {
            T005285_A396EmprCod, T005285_A129BarCod, T005285_A132BarCodReo, T005285_A130BarCodPar, T005285_A758ProCod
            }
            , new Object[] {
            T005286_A396EmprCod, T005286_A129BarCod, T005286_A132BarCodReo, T005286_A130BarCodPar, T005286_A119BarAgrCod, T005286_A124BarAgrReo, T005286_A122BarAgrPar
            }
            , new Object[] {
            T005288_A199BarPie1, T005288_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            T005290_A396EmprCod, T005290_A129BarCod, T005290_A132BarCodReo, T005290_A130BarCodPar
            }
            , new Object[] {
            T005291_A129BarCod, T005291_A132BarCodReo, T005291_A130BarCodPar, T005291_A200BarPieCod, T005291_A203BarPieKil, T005291_A60AlbRUniUti, T005291_A54AlbRPieUti, T005291_A58AlbRUniEnt, T005291_A52AlbRPieEnt, T005291_A47AlbREst,
            T005291_A205BarPieMet, T005291_A201BarPieEst, T005291_A170BarKilLan, T005291_A183BarMetLan, T005291_A197BarPConTro, T005291_A908PieOriCod, T005291_A1271BarPieLzd, T005291_A1501BarPiePie, T005291_A46AlbREnt, T005291_A396EmprCod,
            T005291_A44AlbRecCod
            }
            , new Object[] {
            T005292_A396EmprCod, T005292_A129BarCod, T005292_A132BarCodReo, T005292_A130BarCodPar, T005292_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T005296_A396EmprCod, T005296_A129BarCod, T005296_A132BarCodReo, T005296_A130BarCodPar, T005296_A200BarPieCod, T005296_A12913BarPieLDf
            }
            , new Object[] {
            T005297_A396EmprCod, T005297_A129BarCod, T005297_A132BarCodReo, T005297_A130BarCodPar, T005297_A200BarPieCod, T005297_A3858BarTroCod
            }
            , new Object[] {
            T005298_A396EmprCod, T005298_A30AlbProCod, T005298_A129BarCod, T005298_A132BarCodReo, T005298_A130BarCodPar, T005298_A200BarPieCod
            }
            , new Object[] {
            T005299_A396EmprCod, T005299_A129BarCod, T005299_A132BarCodReo, T005299_A130BarCodPar, T005299_A200BarPieCod
            }
         }
      );
      Z130BarCodPar = "" ;
      n130BarCodPar = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      Z132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      Z129BarCod = 0 ;
      n129BarCod = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
      AV67Pgmname = "TBARPIN" ;
   }

   private byte wcpOAV65BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Z201BarPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV49PesoML ;
   private byte AV65BarCodReo ;
   private byte nKeyPressed ;
   private byte AV45F_samofil ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte AV16Flag2 ;
   private byte AV47Kohler ;
   private byte AV46Vertex ;
   private byte A201BarPieEst ;
   private byte A47AlbREst ;
   private byte AV20Flag1 ;
   private byte GXt_int5 ;
   private byte AV50Velta ;
   private byte Gx_BScreen ;
   private byte Z47AlbREst ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int6[] ;
   private short Z864BarPes ;
   private short Z191BarNumPie ;
   private short Z197BarPConTro ;
   private short nRcdDeleted_18 ;
   private short nRcdExists_18 ;
   private short nIsMod_18 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A199BarPie1 ;
   private short A191BarNumPie ;
   private short A864BarPes ;
   private short nBlankRcdCount18 ;
   private short RcdFound18 ;
   private short nBlankRcdUsr18 ;
   private short RcdFound12 ;
   private short A197BarPConTro ;
   private short Z199BarPie1 ;
   private short nIsDirty_12 ;
   private short nIsDirty_18 ;
   private int wcpOAV64BarCod ;
   private int Z129BarCod ;
   private int Z136BarColNum ;
   private int Z361DisCod ;
   private int nRC_GXsfl_86 ;
   private int nGXsfl_86_idx=1 ;
   private int N361DisCod ;
   private int Z1271BarPieLzd ;
   private int Z1501BarPiePie ;
   private int Z44AlbRecCod ;
   private int O1501BarPiePie ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV64BarCod ;
   private int trnEnded ;
   private int A898BarPieNDes ;
   private int edtBarNHdr_Enabled ;
   private int edtPedidoClie_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int divUnnamedtable3_Visible ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtBarMtr_Enabled ;
   private int edtBarPieNDes_Enabled ;
   private int edtBarUniMed_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtneliminarlinea_Visible ;
   private int bttBtnalta_Visible ;
   private int edtBarMat_Visible ;
   private int edtBarMat_Enabled ;
   private int edtDisCod_Visible ;
   private int edtDisCod_Enabled ;
   private int edtDisUniMed_Visible ;
   private int edtDisUniMed_Enabled ;
   private int A198BarPie ;
   private int edtBarPie_Enabled ;
   private int edtBarPie_Visible ;
   private int edtBarPie1_Enabled ;
   private int edtBarPie1_Visible ;
   private int edtBarSit_Enabled ;
   private int edtBarSit_Visible ;
   private int edtBarAgrEst_Visible ;
   private int edtBarAgrEst_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Visible ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Visible ;
   private int edtBarCodPar_Enabled ;
   private int edtBarNumUni_Enabled ;
   private int edtBarNumUni_Visible ;
   private int edtBarNumPie_Enabled ;
   private int edtBarNumPie_Visible ;
   private int edtBarPes_Enabled ;
   private int edtBarPes_Visible ;
   private int edtCliCod_Enabled ;
   private int edtCliCod_Visible ;
   private int edtBarPieCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtBarPieKil_Enabled ;
   private int edtBarPieMet_Enabled ;
   private int edtBarPiePie_Enabled ;
   private int edtBarPieEst_Enabled ;
   private int edtBarKilLan_Enabled ;
   private int edtBarMetLan_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int edtPieOriCod_Enabled ;
   private int edtBarPieLzd_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int fRowAdded ;
   private int AV61Insert_DisCod ;
   private int AV19BarPieAnt ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int s198BarPie ;
   private int O198BarPie ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int A1271BarPieLzd ;
   private int A51AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int T1501BarPiePie ;
   private int AV68GXV1 ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int Z54AlbRPieUti ;
   private int Z52AlbRPieEnt ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defcmbAlbREst_Enabled ;
   private int defedtAlbRPieEnt_Enabled ;
   private int defedtAlbRUniEnt_Enabled ;
   private int defedtAlbRPieUti_Enabled ;
   private int defedtAlbRUniUti_Enabled ;
   private int defedtAlbRUniDis_Enabled ;
   private int defedtAlbRPieDis_Enabled ;
   private int defedtAlbREnt_Enabled ;
   private int defedtBarPieLzd_Enabled ;
   private int defedtPieOriCod_Enabled ;
   private int defedtBarPConTro_Enabled ;
   private int defedtBarMetLan_Enabled ;
   private int defedtBarKilLan_Enabled ;
   private int defedtBarPieEst_Enabled ;
   private int defedtBarPieMet_Enabled ;
   private int defedtAlbRecCod_Enabled ;
   private int defedtBarPieCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int7[] ;
   private int GXv_int15[] ;
   private int GXv_int10[] ;
   private int GXv_int16[] ;
   private int Z198BarPie ;
   private int ZV19BarPieAnt ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z192BarNumUni ;
   private java.math.BigDecimal O184BarMtr ;
   private java.math.BigDecimal O166BarKgm ;
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
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal B184BarMtr ;
   private java.math.BigDecimal B166BarKgm ;
   private java.math.BigDecimal AV17KilAnt ;
   private java.math.BigDecimal AV18MtrAnt ;
   private java.math.BigDecimal s184BarMtr ;
   private java.math.BigDecimal s166BarKgm ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal T205BarPieMet ;
   private java.math.BigDecimal T203BarPieKil ;
   private java.math.BigDecimal AV51BarMtrOld ;
   private java.math.BigDecimal Z166BarKgm ;
   private java.math.BigDecimal Z184BarMtr ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal ZV17KilAnt ;
   private java.math.BigDecimal ZV18MtrAnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV43EmprCod ;
   private String wcpOAV66BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z4812BarEncCli ;
   private String Z143BarDisNum ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z182BarMat ;
   private String Z135BarColNom ;
   private String Z120BarAgrEst ;
   private String Z228BarUniMed ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Z200BarPieCod ;
   private String Z908PieOriCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A392DisUniMed ;
   private String A120BarAgrEst ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String Gx_mode ;
   private String AV43EmprCod ;
   private String AV66BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarMat_Internalname ;
   private String sGXsfl_86_idx="0001" ;
   private String A365DisDes ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtPedidoClie_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Internalname ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarPieNDes_Internalname ;
   private String edtBarPieNDes_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtneliminarlinea_Internalname ;
   private String bttBtneliminarlinea_Jsonclick ;
   private String bttBtnalta_Internalname ;
   private String bttBtnalta_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String A182BarMat ;
   private String edtBarMat_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String edtDisUniMed_Jsonclick ;
   private String edtBarPie_Internalname ;
   private String edtBarPie_Jsonclick ;
   private String edtBarPie1_Internalname ;
   private String edtBarPie1_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarNumUni_Internalname ;
   private String edtBarNumUni_Jsonclick ;
   private String edtBarNumPie_Internalname ;
   private String edtBarNumPie_Jsonclick ;
   private String edtBarPes_Internalname ;
   private String edtBarPes_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sMode18 ;
   private String edtBarPieCod_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPiePie_Internalname ;
   private String edtBarPieEst_Internalname ;
   private String edtBarKilLan_Internalname ;
   private String edtBarMetLan_Internalname ;
   private String edtBarPConTro_Internalname ;
   private String edtPieOriCod_Internalname ;
   private String edtBarPieLzd_Internalname ;
   private String edtAlbREnt_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String AV67Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvelop_confirmpanel_eliminarlinea_Objectcall ;
   private String Dvelop_confirmpanel_eliminarlinea_Width ;
   private String Dvelop_confirmpanel_eliminarlinea_Height ;
   private String Dvelop_confirmpanel_eliminarlinea_Class ;
   private String Dvelop_confirmpanel_eliminarlinea_Comment ;
   private String Dvelop_confirmpanel_eliminarlinea_Bodytype ;
   private String Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Texttype ;
   private String hsh ;
   private String sMode12 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A200BarPieCod ;
   private String A908PieOriCod ;
   private String A46AlbREnt ;
   private String AV42Station ;
   private String AV44EmprNom ;
   private String AV39UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z392DisUniMed ;
   private String Z279CliNom ;
   private String Z46AlbREnt ;
   private String GXCCtl ;
   private String sGXsfl_86_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPiePie_Jsonclick ;
   private String edtBarPieEst_Jsonclick ;
   private String edtBarKilLan_Jsonclick ;
   private String edtBarMetLan_Jsonclick ;
   private String edtBarPConTro_Jsonclick ;
   private String edtPieOriCod_Jsonclick ;
   private String edtBarPieLzd_Jsonclick ;
   private String edtAlbREnt_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_86_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Enabled ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV60WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T00526_A166BarKgm ;
   private java.math.BigDecimal[] T00526_A184BarMtr ;
   private short[] T00526_A199BarPie1 ;
   private int[] T00526_A898BarPieNDes ;
   private String[] T00529_A407EmprNom ;
   private boolean[] T00529_n407EmprNom ;
   private int[] T005210_A252CliCod ;
   private boolean[] T005210_n252CliCod ;
   private String[] T005210_A392DisUniMed ;
   private String[] T005210_A365DisDes ;
   private String[] T005211_A279CliNom ;
   private String[] T005213_A2759BarMaqGru ;
   private int[] T005213_A129BarCod ;
   private boolean[] T005213_n129BarCod ;
   private byte[] T005213_A132BarCodReo ;
   private boolean[] T005213_n132BarCodReo ;
   private String[] T005213_A130BarCodPar ;
   private boolean[] T005213_n130BarCodPar ;
   private String[] T005213_A180BarMaqCod ;
   private String[] T005213_A4812BarEncCli ;
   private String[] T005213_A143BarDisNum ;
   private int[] T005213_A252CliCod ;
   private boolean[] T005213_n252CliCod ;
   private String[] T005213_A279CliNom ;
   private String[] T005213_A212BarSer ;
   private String[] T005213_A1652BarSerDsc ;
   private String[] T005213_A182BarMat ;
   private String[] T005213_A135BarColNom ;
   private int[] T005213_A136BarColNum ;
   private byte[] T005213_A218BarTipCol ;
   private String[] T005213_A392DisUniMed ;
   private short[] T005213_A864BarPes ;
   private byte[] T005213_A213BarSit ;
   private String[] T005213_A120BarAgrEst ;
   private String[] T005213_A407EmprNom ;
   private boolean[] T005213_n407EmprNom ;
   private String[] T005213_A228BarUniMed ;
   private java.math.BigDecimal[] T005213_A192BarNumUni ;
   private short[] T005213_A191BarNumPie ;
   private String[] T005213_A365DisDes ;
   private String[] T005213_A396EmprCod ;
   private boolean[] T005213_n396EmprCod ;
   private int[] T005213_A361DisCod ;
   private java.math.BigDecimal[] T005213_A166BarKgm ;
   private java.math.BigDecimal[] T005213_A184BarMtr ;
   private short[] T005213_A199BarPie1 ;
   private int[] T005213_A898BarPieNDes ;
   private int[] T005214_A252CliCod ;
   private boolean[] T005214_n252CliCod ;
   private String[] T005214_A392DisUniMed ;
   private String[] T005214_A365DisDes ;
   private String[] T005215_A279CliNom ;
   private String[] T005216_A396EmprCod ;
   private boolean[] T005216_n396EmprCod ;
   private int[] T005216_A129BarCod ;
   private boolean[] T005216_n129BarCod ;
   private byte[] T005216_A132BarCodReo ;
   private boolean[] T005216_n132BarCodReo ;
   private String[] T005216_A130BarCodPar ;
   private boolean[] T005216_n130BarCodPar ;
   private String[] T00528_A2759BarMaqGru ;
   private int[] T00528_A129BarCod ;
   private boolean[] T00528_n129BarCod ;
   private byte[] T00528_A132BarCodReo ;
   private boolean[] T00528_n132BarCodReo ;
   private String[] T00528_A130BarCodPar ;
   private boolean[] T00528_n130BarCodPar ;
   private String[] T00528_A180BarMaqCod ;
   private String[] T00528_A4812BarEncCli ;
   private String[] T00528_A143BarDisNum ;
   private String[] T00528_A212BarSer ;
   private String[] T00528_A1652BarSerDsc ;
   private String[] T00528_A182BarMat ;
   private String[] T00528_A135BarColNom ;
   private int[] T00528_A136BarColNum ;
   private byte[] T00528_A218BarTipCol ;
   private short[] T00528_A864BarPes ;
   private byte[] T00528_A213BarSit ;
   private String[] T00528_A120BarAgrEst ;
   private String[] T00528_A228BarUniMed ;
   private java.math.BigDecimal[] T00528_A192BarNumUni ;
   private short[] T00528_A191BarNumPie ;
   private String[] T00528_A396EmprCod ;
   private boolean[] T00528_n396EmprCod ;
   private int[] T00528_A361DisCod ;
   private int[] T00528_A252CliCod ;
   private boolean[] T00528_n252CliCod ;
   private String[] T00528_A365DisDes ;
   private String[] T005217_A396EmprCod ;
   private boolean[] T005217_n396EmprCod ;
   private int[] T005217_A129BarCod ;
   private boolean[] T005217_n129BarCod ;
   private byte[] T005217_A132BarCodReo ;
   private boolean[] T005217_n132BarCodReo ;
   private String[] T005217_A130BarCodPar ;
   private boolean[] T005217_n130BarCodPar ;
   private String[] T005218_A396EmprCod ;
   private boolean[] T005218_n396EmprCod ;
   private int[] T005218_A129BarCod ;
   private boolean[] T005218_n129BarCod ;
   private byte[] T005218_A132BarCodReo ;
   private boolean[] T005218_n132BarCodReo ;
   private String[] T005218_A130BarCodPar ;
   private boolean[] T005218_n130BarCodPar ;
   private String[] T00527_A2759BarMaqGru ;
   private int[] T00527_A129BarCod ;
   private boolean[] T00527_n129BarCod ;
   private byte[] T00527_A132BarCodReo ;
   private boolean[] T00527_n132BarCodReo ;
   private String[] T00527_A130BarCodPar ;
   private boolean[] T00527_n130BarCodPar ;
   private String[] T00527_A180BarMaqCod ;
   private String[] T00527_A4812BarEncCli ;
   private String[] T00527_A143BarDisNum ;
   private String[] T00527_A212BarSer ;
   private String[] T00527_A1652BarSerDsc ;
   private String[] T00527_A182BarMat ;
   private String[] T00527_A135BarColNom ;
   private int[] T00527_A136BarColNum ;
   private byte[] T00527_A218BarTipCol ;
   private short[] T00527_A864BarPes ;
   private byte[] T00527_A213BarSit ;
   private String[] T00527_A120BarAgrEst ;
   private String[] T00527_A228BarUniMed ;
   private java.math.BigDecimal[] T00527_A192BarNumUni ;
   private short[] T00527_A191BarNumPie ;
   private String[] T00527_A396EmprCod ;
   private boolean[] T00527_n396EmprCod ;
   private int[] T00527_A361DisCod ;
   private int[] T00527_A252CliCod ;
   private boolean[] T00527_n252CliCod ;
   private String[] T00527_A365DisDes ;
   private int[] T005222_A252CliCod ;
   private boolean[] T005222_n252CliCod ;
   private String[] T005222_A392DisUniMed ;
   private String[] T005222_A365DisDes ;
   private String[] T005223_A279CliNom ;
   private long[] T005224_A14681MRPrId ;
   private String[] T005225_A5921XCjaDis ;
   private long[] T005225_A5922XCjaCod ;
   private String[] T005226_A396EmprCod ;
   private boolean[] T005226_n396EmprCod ;
   private int[] T005226_A129BarCod ;
   private boolean[] T005226_n129BarCod ;
   private byte[] T005226_A132BarCodReo ;
   private boolean[] T005226_n132BarCodReo ;
   private String[] T005226_A130BarCodPar ;
   private boolean[] T005226_n130BarCodPar ;
   private short[] T005226_A14152MEnvOrd ;
   private String[] T005227_A396EmprCod ;
   private boolean[] T005227_n396EmprCod ;
   private int[] T005227_A129BarCod ;
   private boolean[] T005227_n129BarCod ;
   private byte[] T005227_A132BarCodReo ;
   private boolean[] T005227_n132BarCodReo ;
   private String[] T005227_A130BarCodPar ;
   private boolean[] T005227_n130BarCodPar ;
   private String[] T005227_A13905BarTraID ;
   private String[] T005228_A396EmprCod ;
   private boolean[] T005228_n396EmprCod ;
   private int[] T005228_A129BarCod ;
   private boolean[] T005228_n129BarCod ;
   private byte[] T005228_A132BarCodReo ;
   private boolean[] T005228_n132BarCodReo ;
   private String[] T005228_A130BarCodPar ;
   private boolean[] T005228_n130BarCodPar ;
   private byte[] T005228_A13093BarDGLin ;
   private String[] T005228_A13094BarDGDibCl ;
   private int[] T005228_A13095BarDGDibIn ;
   private String[] T005228_A13096BarDGComb ;
   private String[] T005228_A13097BarDGFOndo ;
   private String[] T005229_A396EmprCod ;
   private boolean[] T005229_n396EmprCod ;
   private int[] T005229_A11917Ebd_numero ;
   private String[] T005230_A396EmprCod ;
   private boolean[] T005230_n396EmprCod ;
   private int[] T005230_A11898Prd_numero ;
   private String[] T005231_A396EmprCod ;
   private boolean[] T005231_n396EmprCod ;
   private int[] T005231_A11849Cte_numero ;
   private String[] T005232_A396EmprCod ;
   private boolean[] T005232_n396EmprCod ;
   private int[] T005232_A11791Ap_numero ;
   private String[] T005233_A396EmprCod ;
   private boolean[] T005233_n396EmprCod ;
   private int[] T005233_A3985CalBarCod ;
   private byte[] T005233_A3986CalBarCodR ;
   private String[] T005233_A3987CalBarCodP ;
   private String[] T005234_A396EmprCod ;
   private boolean[] T005234_n396EmprCod ;
   private java.util.Date[] T005234_A5294InPTime ;
   private int[] T005234_A652OpeCod ;
   private String[] T005235_A396EmprCod ;
   private boolean[] T005235_n396EmprCod ;
   private int[] T005235_A129BarCod ;
   private boolean[] T005235_n129BarCod ;
   private byte[] T005235_A132BarCodReo ;
   private boolean[] T005235_n132BarCodReo ;
   private String[] T005235_A130BarCodPar ;
   private boolean[] T005235_n130BarCodPar ;
   private int[] T005235_A4118tinagrcod ;
   private byte[] T005235_A4119tinagrreo ;
   private String[] T005235_A4120tinagrpar ;
   private String[] T005236_A396EmprCod ;
   private boolean[] T005236_n396EmprCod ;
   private int[] T005236_A129BarCod ;
   private boolean[] T005236_n129BarCod ;
   private byte[] T005236_A132BarCodReo ;
   private boolean[] T005236_n132BarCodReo ;
   private String[] T005236_A130BarCodPar ;
   private boolean[] T005236_n130BarCodPar ;
   private int[] T005236_A4080estagrcod ;
   private byte[] T005236_A4081estagrreo ;
   private String[] T005236_A4082estagrpar ;
   private String[] T005237_A396EmprCod ;
   private boolean[] T005237_n396EmprCod ;
   private int[] T005237_A129BarCod ;
   private boolean[] T005237_n129BarCod ;
   private byte[] T005237_A132BarCodReo ;
   private boolean[] T005237_n132BarCodReo ;
   private String[] T005237_A130BarCodPar ;
   private boolean[] T005237_n130BarCodPar ;
   private byte[] T005237_A4075recestncol ;
   private byte[] T005237_A4076recestnpro ;
   private String[] T005238_A396EmprCod ;
   private boolean[] T005238_n396EmprCod ;
   private String[] T005238_A602MaqCod ;
   private String[] T005238_A1142MaqFCod ;
   private short[] T005238_A3068PlaEtaOrd ;
   private byte[] T005238_A3069PlaEtaOrdA ;
   private int[] T005238_A129BarCod ;
   private boolean[] T005238_n129BarCod ;
   private byte[] T005238_A132BarCodReo ;
   private boolean[] T005238_n132BarCodReo ;
   private String[] T005238_A130BarCodPar ;
   private boolean[] T005238_n130BarCodPar ;
   private String[] T005239_A396EmprCod ;
   private boolean[] T005239_n396EmprCod ;
   private int[] T005239_A129BarCod ;
   private boolean[] T005239_n129BarCod ;
   private byte[] T005239_A132BarCodReo ;
   private boolean[] T005239_n132BarCodReo ;
   private String[] T005239_A130BarCodPar ;
   private boolean[] T005239_n130BarCodPar ;
   private short[] T005239_A4846BarAudLin ;
   private String[] T005240_A396EmprCod ;
   private boolean[] T005240_n396EmprCod ;
   private int[] T005240_A129BarCod ;
   private boolean[] T005240_n129BarCod ;
   private byte[] T005240_A132BarCodReo ;
   private boolean[] T005240_n132BarCodReo ;
   private String[] T005240_A130BarCodPar ;
   private boolean[] T005240_n130BarCodPar ;
   private short[] T005240_A3940BarEnsLin ;
   private String[] T005241_A396EmprCod ;
   private boolean[] T005241_n396EmprCod ;
   private int[] T005241_A129BarCod ;
   private boolean[] T005241_n129BarCod ;
   private byte[] T005241_A132BarCodReo ;
   private boolean[] T005241_n132BarCodReo ;
   private String[] T005241_A130BarCodPar ;
   private boolean[] T005241_n130BarCodPar ;
   private int[] T005241_A3384RefBarCod ;
   private byte[] T005241_A3385RefBarReo ;
   private String[] T005241_A3386RefBarPar ;
   private String[] T005242_A396EmprCod ;
   private boolean[] T005242_n396EmprCod ;
   private int[] T005242_A10914SolSalCod ;
   private String[] T005243_A396EmprCod ;
   private boolean[] T005243_n396EmprCod ;
   private int[] T005243_A10364Ph_numero ;
   private String[] T005244_A396EmprCod ;
   private boolean[] T005244_n396EmprCod ;
   private int[] T005244_A129BarCod ;
   private boolean[] T005244_n129BarCod ;
   private byte[] T005244_A132BarCodReo ;
   private boolean[] T005244_n132BarCodReo ;
   private String[] T005244_A130BarCodPar ;
   private boolean[] T005244_n130BarCodPar ;
   private String[] T005244_A10197ProEspCod ;
   private String[] T005245_A396EmprCod ;
   private boolean[] T005245_n396EmprCod ;
   private int[] T005245_A129BarCod ;
   private boolean[] T005245_n129BarCod ;
   private byte[] T005245_A132BarCodReo ;
   private boolean[] T005245_n132BarCodReo ;
   private String[] T005245_A130BarCodPar ;
   private boolean[] T005245_n130BarCodPar ;
   private int[] T005245_A5322Dp_Nrecep ;
   private String[] T005246_A396EmprCod ;
   private boolean[] T005246_n396EmprCod ;
   private int[] T005246_A129BarCod ;
   private boolean[] T005246_n129BarCod ;
   private byte[] T005246_A132BarCodReo ;
   private boolean[] T005246_n132BarCodReo ;
   private String[] T005246_A130BarCodPar ;
   private boolean[] T005246_n130BarCodPar ;
   private int[] T005246_A8569EntSecLn ;
   private String[] T005247_A396EmprCod ;
   private boolean[] T005247_n396EmprCod ;
   private int[] T005247_A7434PLLNro ;
   private short[] T005247_A7443LPLNro ;
   private short[] T005247_A7459CPLCom ;
   private int[] T005247_A129BarCod ;
   private boolean[] T005247_n129BarCod ;
   private byte[] T005247_A132BarCodReo ;
   private boolean[] T005247_n132BarCodReo ;
   private String[] T005247_A130BarCodPar ;
   private boolean[] T005247_n130BarCodPar ;
   private String[] T005248_A396EmprCod ;
   private boolean[] T005248_n396EmprCod ;
   private int[] T005248_A7145OSSCod ;
   private String[] T005249_A396EmprCod ;
   private boolean[] T005249_n396EmprCod ;
   private int[] T005249_A7049OGSCod ;
   private String[] T005250_A396EmprCod ;
   private boolean[] T005250_n396EmprCod ;
   private int[] T005250_A129BarCod ;
   private boolean[] T005250_n129BarCod ;
   private byte[] T005250_A132BarCodReo ;
   private boolean[] T005250_n132BarCodReo ;
   private String[] T005250_A130BarCodPar ;
   private boolean[] T005250_n130BarCodPar ;
   private int[] T005250_A6031Ac_Barcod ;
   private byte[] T005250_A6032Ac_BarReo ;
   private String[] T005250_A6033Ac_BarPar ;
   private String[] T005251_A396EmprCod ;
   private boolean[] T005251_n396EmprCod ;
   private int[] T005251_A129BarCod ;
   private boolean[] T005251_n129BarCod ;
   private byte[] T005251_A132BarCodReo ;
   private boolean[] T005251_n132BarCodReo ;
   private String[] T005251_A130BarCodPar ;
   private boolean[] T005251_n130BarCodPar ;
   private int[] T005251_A5908PartPal ;
   private String[] T005252_A396EmprCod ;
   private boolean[] T005252_n396EmprCod ;
   private int[] T005252_A129BarCod ;
   private boolean[] T005252_n129BarCod ;
   private byte[] T005252_A132BarCodReo ;
   private boolean[] T005252_n132BarCodReo ;
   private String[] T005252_A130BarCodPar ;
   private boolean[] T005252_n130BarCodPar ;
   private byte[] T005252_A2524DisComLin ;
   private String[] T005252_A1056DisComCod ;
   private String[] T005252_A1032FonCod ;
   private String[] T005253_A396EmprCod ;
   private boolean[] T005253_n396EmprCod ;
   private long[] T005253_A1736AlbExtCod ;
   private int[] T005253_A129BarCod ;
   private boolean[] T005253_n129BarCod ;
   private byte[] T005253_A132BarCodReo ;
   private boolean[] T005253_n132BarCodReo ;
   private String[] T005253_A130BarCodPar ;
   private boolean[] T005253_n130BarCodPar ;
   private String[] T005254_A396EmprCod ;
   private boolean[] T005254_n396EmprCod ;
   private int[] T005254_A129BarCod ;
   private boolean[] T005254_n129BarCod ;
   private byte[] T005254_A132BarCodReo ;
   private boolean[] T005254_n132BarCodReo ;
   private String[] T005254_A130BarCodPar ;
   private boolean[] T005254_n130BarCodPar ;
   private int[] T005254_A3753BarFoaCod ;
   private byte[] T005254_A3754BarFoaReo ;
   private String[] T005254_A3755BarFoaPar ;
   private String[] T005255_A396EmprCod ;
   private boolean[] T005255_n396EmprCod ;
   private int[] T005255_A129BarCod ;
   private boolean[] T005255_n129BarCod ;
   private byte[] T005255_A132BarCodReo ;
   private boolean[] T005255_n132BarCodReo ;
   private String[] T005255_A130BarCodPar ;
   private boolean[] T005255_n130BarCodPar ;
   private int[] T005255_A3747BarPegCod ;
   private byte[] T005255_A3748BarPegReo ;
   private String[] T005255_A3749BarPegPar ;
   private String[] T005256_A396EmprCod ;
   private boolean[] T005256_n396EmprCod ;
   private int[] T005256_A3253SolTraCod ;
   private String[] T005257_A396EmprCod ;
   private boolean[] T005257_n396EmprCod ;
   private int[] T005257_A3235SolSubCod ;
   private String[] T005258_A396EmprCod ;
   private boolean[] T005258_n396EmprCod ;
   private int[] T005258_A3218SolLuzCod ;
   private String[] T005259_A396EmprCod ;
   private boolean[] T005259_n396EmprCod ;
   private int[] T005259_A3196SolFriCod ;
   private String[] T005260_A396EmprCod ;
   private boolean[] T005260_n396EmprCod ;
   private int[] T005260_A3165SolPilCod ;
   private String[] T005261_A396EmprCod ;
   private boolean[] T005261_n396EmprCod ;
   private int[] T005261_A129BarCod ;
   private boolean[] T005261_n129BarCod ;
   private byte[] T005261_A132BarCodReo ;
   private boolean[] T005261_n132BarCodReo ;
   private String[] T005261_A130BarCodPar ;
   private boolean[] T005261_n130BarCodPar ;
   private short[] T005261_A2872HAnRLinMaq ;
   private byte[] T005261_A2873HAnRLinPro ;
   private short[] T005261_A2874HAnRLin ;
   private byte[] T005261_A2875HAnNumAny ;
   private String[] T005262_A396EmprCod ;
   private boolean[] T005262_n396EmprCod ;
   private String[] T005262_A2817PlaTer ;
   private short[] T005262_A2818PlaOrd ;
   private String[] T005263_A396EmprCod ;
   private boolean[] T005263_n396EmprCod ;
   private String[] T005263_A2809MetTerCod ;
   private int[] T005263_A129BarCod ;
   private boolean[] T005263_n129BarCod ;
   private byte[] T005263_A132BarCodReo ;
   private boolean[] T005263_n132BarCodReo ;
   private String[] T005263_A130BarCodPar ;
   private boolean[] T005263_n130BarCodPar ;
   private String[] T005264_A396EmprCod ;
   private boolean[] T005264_n396EmprCod ;
   private int[] T005264_A129BarCod ;
   private boolean[] T005264_n129BarCod ;
   private byte[] T005264_A132BarCodReo ;
   private boolean[] T005264_n132BarCodReo ;
   private String[] T005264_A130BarCodPar ;
   private boolean[] T005264_n130BarCodPar ;
   private short[] T005264_A2808RecLinMAL ;
   private byte[] T005264_A1377RecNumAny ;
   private String[] T005264_A719PrdNum ;
   private String[] T005265_A396EmprCod ;
   private boolean[] T005265_n396EmprCod ;
   private int[] T005265_A129BarCod ;
   private boolean[] T005265_n129BarCod ;
   private byte[] T005265_A132BarCodReo ;
   private boolean[] T005265_n132BarCodReo ;
   private String[] T005265_A130BarCodPar ;
   private boolean[] T005265_n130BarCodPar ;
   private short[] T005265_A2804RecLinMaq ;
   private String[] T005266_A396EmprCod ;
   private boolean[] T005266_n396EmprCod ;
   private String[] T005266_A2792TermiCod ;
   private int[] T005266_A129BarCod ;
   private boolean[] T005266_n129BarCod ;
   private byte[] T005266_A132BarCodReo ;
   private boolean[] T005266_n132BarCodReo ;
   private String[] T005266_A130BarCodPar ;
   private boolean[] T005266_n130BarCodPar ;
   private String[] T005267_A396EmprCod ;
   private boolean[] T005267_n396EmprCod ;
   private short[] T005267_A2248ManCod ;
   private java.util.Date[] T005267_A2711RpExHdFe ;
   private short[] T005267_A2713RpExHdLi ;
   private String[] T005268_A396EmprCod ;
   private boolean[] T005268_n396EmprCod ;
   private short[] T005268_A2248ManCod ;
   private String[] T005268_A2689ExHdrFas ;
   private int[] T005268_A2692ExHdrLin ;
   private String[] T005269_A396EmprCod ;
   private boolean[] T005269_n396EmprCod ;
   private int[] T005269_A129BarCod ;
   private boolean[] T005269_n129BarCod ;
   private byte[] T005269_A132BarCodReo ;
   private boolean[] T005269_n132BarCodReo ;
   private String[] T005269_A130BarCodPar ;
   private boolean[] T005269_n130BarCodPar ;
   private String[] T005269_A2494BarDosPro ;
   private String[] T005269_A719PrdNum ;
   private String[] T005270_A396EmprCod ;
   private boolean[] T005270_n396EmprCod ;
   private String[] T005270_A602MaqCod ;
   private java.util.Date[] T005270_A2461PlaFecTin ;
   private int[] T005270_A129BarCod ;
   private boolean[] T005270_n129BarCod ;
   private byte[] T005270_A132BarCodReo ;
   private boolean[] T005270_n132BarCodReo ;
   private String[] T005270_A130BarCodPar ;
   private boolean[] T005270_n130BarCodPar ;
   private String[] T005271_A396EmprCod ;
   private boolean[] T005271_n396EmprCod ;
   private int[] T005271_A129BarCod ;
   private boolean[] T005271_n129BarCod ;
   private byte[] T005271_A132BarCodReo ;
   private boolean[] T005271_n132BarCodReo ;
   private String[] T005271_A130BarCodPar ;
   private boolean[] T005271_n130BarCodPar ;
   private short[] T005271_A2457BarObLin ;
   private String[] T005272_A396EmprCod ;
   private boolean[] T005272_n396EmprCod ;
   private int[] T005272_A129BarCod ;
   private boolean[] T005272_n129BarCod ;
   private byte[] T005272_A132BarCodReo ;
   private boolean[] T005272_n132BarCodReo ;
   private String[] T005272_A130BarCodPar ;
   private boolean[] T005272_n130BarCodPar ;
   private short[] T005272_A2444BarEnLin ;
   private String[] T005273_A396EmprCod ;
   private boolean[] T005273_n396EmprCod ;
   private int[] T005273_A2406ExhAlbCod ;
   private int[] T005273_A129BarCod ;
   private boolean[] T005273_n129BarCod ;
   private byte[] T005273_A132BarCodReo ;
   private boolean[] T005273_n132BarCodReo ;
   private String[] T005273_A130BarCodPar ;
   private boolean[] T005273_n130BarCodPar ;
   private String[] T005274_A396EmprCod ;
   private boolean[] T005274_n396EmprCod ;
   private int[] T005274_A2253SalExtAlb ;
   private int[] T005274_A129BarCod ;
   private boolean[] T005274_n129BarCod ;
   private byte[] T005274_A132BarCodReo ;
   private boolean[] T005274_n132BarCodReo ;
   private String[] T005274_A130BarCodPar ;
   private boolean[] T005274_n130BarCodPar ;
   private String[] T005275_A396EmprCod ;
   private boolean[] T005275_n396EmprCod ;
   private long[] T005275_A30AlbProCod ;
   private int[] T005275_A129BarCod ;
   private boolean[] T005275_n129BarCod ;
   private byte[] T005275_A132BarCodReo ;
   private boolean[] T005275_n132BarCodReo ;
   private String[] T005275_A130BarCodPar ;
   private boolean[] T005275_n130BarCodPar ;
   private String[] T005276_A396EmprCod ;
   private boolean[] T005276_n396EmprCod ;
   private int[] T005276_A1348SolColCod ;
   private String[] T005277_A396EmprCod ;
   private boolean[] T005277_n396EmprCod ;
   private int[] T005277_A1333EstDimCod ;
   private String[] T005278_A396EmprCod ;
   private boolean[] T005278_n396EmprCod ;
   private int[] T005278_A1314EnsLabCod ;
   private String[] T005279_A396EmprCod ;
   private boolean[] T005279_n396EmprCod ;
   private int[] T005279_A129BarCod ;
   private boolean[] T005279_n129BarCod ;
   private byte[] T005279_A132BarCodReo ;
   private boolean[] T005279_n132BarCodReo ;
   private String[] T005279_A130BarCodPar ;
   private boolean[] T005279_n130BarCodPar ;
   private byte[] T005279_A906ObsReoLin ;
   private String[] T005280_A396EmprCod ;
   private boolean[] T005280_n396EmprCod ;
   private int[] T005280_A859CumCodCont ;
   private String[] T005281_A396EmprCod ;
   private boolean[] T005281_n396EmprCod ;
   private String[] T005281_A602MaqCod ;
   private java.util.Date[] T005281_A558HisProFec ;
   private int[] T005281_A561HisProLin ;
   private String[] T005282_A396EmprCod ;
   private boolean[] T005282_n396EmprCod ;
   private int[] T005282_A252CliCod ;
   private boolean[] T005282_n252CliCod ;
   private String[] T005282_A494ForSer ;
   private String[] T005282_A482ForColNom ;
   private int[] T005282_A483ForColNum ;
   private byte[] T005282_A831TipColCod ;
   private String[] T005283_A396EmprCod ;
   private boolean[] T005283_n396EmprCod ;
   private long[] T005283_A30AlbProCod ;
   private int[] T005283_A129BarCod ;
   private boolean[] T005283_n129BarCod ;
   private byte[] T005283_A132BarCodReo ;
   private boolean[] T005283_n132BarCodReo ;
   private String[] T005283_A130BarCodPar ;
   private boolean[] T005283_n130BarCodPar ;
   private String[] T005283_A200BarPieCod ;
   private String[] T005284_A396EmprCod ;
   private boolean[] T005284_n396EmprCod ;
   private int[] T005284_A129BarCod ;
   private boolean[] T005284_n129BarCod ;
   private byte[] T005284_A132BarCodReo ;
   private boolean[] T005284_n132BarCodReo ;
   private String[] T005284_A130BarCodPar ;
   private boolean[] T005284_n130BarCodPar ;
   private byte[] T005284_A188BarNotLin ;
   private String[] T005285_A396EmprCod ;
   private boolean[] T005285_n396EmprCod ;
   private int[] T005285_A129BarCod ;
   private boolean[] T005285_n129BarCod ;
   private byte[] T005285_A132BarCodReo ;
   private boolean[] T005285_n132BarCodReo ;
   private String[] T005285_A130BarCodPar ;
   private boolean[] T005285_n130BarCodPar ;
   private String[] T005285_A758ProCod ;
   private String[] T005286_A396EmprCod ;
   private boolean[] T005286_n396EmprCod ;
   private int[] T005286_A129BarCod ;
   private boolean[] T005286_n129BarCod ;
   private byte[] T005286_A132BarCodReo ;
   private boolean[] T005286_n132BarCodReo ;
   private String[] T005286_A130BarCodPar ;
   private boolean[] T005286_n130BarCodPar ;
   private int[] T005286_A119BarAgrCod ;
   private byte[] T005286_A124BarAgrReo ;
   private String[] T005286_A122BarAgrPar ;
   private short[] T005288_A199BarPie1 ;
   private int[] T005288_A898BarPieNDes ;
   private String[] T005290_A396EmprCod ;
   private boolean[] T005290_n396EmprCod ;
   private int[] T005290_A129BarCod ;
   private boolean[] T005290_n129BarCod ;
   private byte[] T005290_A132BarCodReo ;
   private boolean[] T005290_n132BarCodReo ;
   private String[] T005290_A130BarCodPar ;
   private boolean[] T005290_n130BarCodPar ;
   private java.math.BigDecimal[] T00524_A60AlbRUniUti ;
   private int[] T00524_A54AlbRPieUti ;
   private java.math.BigDecimal[] T00524_A58AlbRUniEnt ;
   private int[] T00524_A52AlbRPieEnt ;
   private byte[] T00524_A47AlbREst ;
   private String[] T00524_A46AlbREnt ;
   private int[] T005291_A129BarCod ;
   private boolean[] T005291_n129BarCod ;
   private byte[] T005291_A132BarCodReo ;
   private boolean[] T005291_n132BarCodReo ;
   private String[] T005291_A130BarCodPar ;
   private boolean[] T005291_n130BarCodPar ;
   private String[] T005291_A200BarPieCod ;
   private java.math.BigDecimal[] T005291_A203BarPieKil ;
   private java.math.BigDecimal[] T005291_A60AlbRUniUti ;
   private int[] T005291_A54AlbRPieUti ;
   private java.math.BigDecimal[] T005291_A58AlbRUniEnt ;
   private int[] T005291_A52AlbRPieEnt ;
   private byte[] T005291_A47AlbREst ;
   private java.math.BigDecimal[] T005291_A205BarPieMet ;
   private byte[] T005291_A201BarPieEst ;
   private java.math.BigDecimal[] T005291_A170BarKilLan ;
   private java.math.BigDecimal[] T005291_A183BarMetLan ;
   private short[] T005291_A197BarPConTro ;
   private String[] T005291_A908PieOriCod ;
   private int[] T005291_A1271BarPieLzd ;
   private int[] T005291_A1501BarPiePie ;
   private String[] T005291_A46AlbREnt ;
   private String[] T005291_A396EmprCod ;
   private boolean[] T005291_n396EmprCod ;
   private int[] T005291_A44AlbRecCod ;
   private String[] T005292_A396EmprCod ;
   private boolean[] T005292_n396EmprCod ;
   private int[] T005292_A129BarCod ;
   private boolean[] T005292_n129BarCod ;
   private byte[] T005292_A132BarCodReo ;
   private boolean[] T005292_n132BarCodReo ;
   private String[] T005292_A130BarCodPar ;
   private boolean[] T005292_n130BarCodPar ;
   private String[] T005292_A200BarPieCod ;
   private int[] T00523_A129BarCod ;
   private boolean[] T00523_n129BarCod ;
   private byte[] T00523_A132BarCodReo ;
   private boolean[] T00523_n132BarCodReo ;
   private String[] T00523_A130BarCodPar ;
   private boolean[] T00523_n130BarCodPar ;
   private String[] T00523_A200BarPieCod ;
   private java.math.BigDecimal[] T00523_A203BarPieKil ;
   private java.math.BigDecimal[] T00523_A205BarPieMet ;
   private byte[] T00523_A201BarPieEst ;
   private java.math.BigDecimal[] T00523_A170BarKilLan ;
   private java.math.BigDecimal[] T00523_A183BarMetLan ;
   private short[] T00523_A197BarPConTro ;
   private String[] T00523_A908PieOriCod ;
   private int[] T00523_A1271BarPieLzd ;
   private int[] T00523_A1501BarPiePie ;
   private String[] T00523_A396EmprCod ;
   private boolean[] T00523_n396EmprCod ;
   private int[] T00523_A44AlbRecCod ;
   private int[] T00522_A129BarCod ;
   private boolean[] T00522_n129BarCod ;
   private byte[] T00522_A132BarCodReo ;
   private boolean[] T00522_n132BarCodReo ;
   private String[] T00522_A130BarCodPar ;
   private boolean[] T00522_n130BarCodPar ;
   private String[] T00522_A200BarPieCod ;
   private java.math.BigDecimal[] T00522_A203BarPieKil ;
   private java.math.BigDecimal[] T00522_A205BarPieMet ;
   private byte[] T00522_A201BarPieEst ;
   private java.math.BigDecimal[] T00522_A170BarKilLan ;
   private java.math.BigDecimal[] T00522_A183BarMetLan ;
   private short[] T00522_A197BarPConTro ;
   private String[] T00522_A908PieOriCod ;
   private int[] T00522_A1271BarPieLzd ;
   private int[] T00522_A1501BarPiePie ;
   private String[] T00522_A396EmprCod ;
   private boolean[] T00522_n396EmprCod ;
   private int[] T00522_A44AlbRecCod ;
   private String[] T005296_A396EmprCod ;
   private boolean[] T005296_n396EmprCod ;
   private int[] T005296_A129BarCod ;
   private boolean[] T005296_n129BarCod ;
   private byte[] T005296_A132BarCodReo ;
   private boolean[] T005296_n132BarCodReo ;
   private String[] T005296_A130BarCodPar ;
   private boolean[] T005296_n130BarCodPar ;
   private String[] T005296_A200BarPieCod ;
   private short[] T005296_A12913BarPieLDf ;
   private String[] T005297_A396EmprCod ;
   private boolean[] T005297_n396EmprCod ;
   private int[] T005297_A129BarCod ;
   private boolean[] T005297_n129BarCod ;
   private byte[] T005297_A132BarCodReo ;
   private boolean[] T005297_n132BarCodReo ;
   private String[] T005297_A130BarCodPar ;
   private boolean[] T005297_n130BarCodPar ;
   private String[] T005297_A200BarPieCod ;
   private short[] T005297_A3858BarTroCod ;
   private String[] T005298_A396EmprCod ;
   private boolean[] T005298_n396EmprCod ;
   private long[] T005298_A30AlbProCod ;
   private int[] T005298_A129BarCod ;
   private boolean[] T005298_n129BarCod ;
   private byte[] T005298_A132BarCodReo ;
   private boolean[] T005298_n132BarCodReo ;
   private String[] T005298_A130BarCodPar ;
   private boolean[] T005298_n130BarCodPar ;
   private String[] T005298_A200BarPieCod ;
   private String[] T005299_A396EmprCod ;
   private boolean[] T005299_n396EmprCod ;
   private int[] T005299_A129BarCod ;
   private boolean[] T005299_n129BarCod ;
   private byte[] T005299_A132BarCodReo ;
   private boolean[] T005299_n132BarCodReo ;
   private String[] T005299_A130BarCodPar ;
   private boolean[] T005299_n130BarCodPar ;
   private String[] T005299_A200BarPieCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV58WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV59TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV62TrnContextAtt ;
}

final  class tbarpin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00522", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00523", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00524", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbREnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00526", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1, SUM(BarPiePie) AS BarPieNDes FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00527", "SELECT BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarEncCli, BarDisNum, BarSer, BarSerDsc, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarUniMed, BarNumUni, BarNumPie, EmprCod, DisCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarMaqGru, BarMaqCod, BarEncCli, BarDisNum, BarSer, BarSerDsc, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarUniMed, BarNumUni, BarNumPie, DisCod, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00528", "SELECT BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarEncCli, BarDisNum, BarSer, BarSerDsc, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarUniMed, BarNumUni, BarNumPie, EmprCod, DisCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00529", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005210", "SELECT CliCod, DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005211", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005213", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.BarEncCli, TM1.BarDisNum, TM1.CliCod, T5.CliNom, TM1.BarSer, TM1.BarSerDsc, TM1.BarMat, TM1.BarColNom, TM1.BarColNum, TM1.BarTipCol, T4.DisUniMed, TM1.BarPes, TM1.BarSit, TM1.BarAgrEst, T2.EmprNom, TM1.BarUniMed, TM1.BarNumUni, TM1.BarNumPie, TM1.DisDes, TM1.EmprCod, TM1.DisCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1, SUM(BarPiePie) AS BarPieNDes FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) INNER JOIN TXPDISPOS T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = TM1.DisCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005214", "SELECT CliCod, DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005215", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005216", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005217", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005218", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T005219", "INSERT INTO TXPBARCAD(CliCod, DisDes, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarEncCli, BarDisNum, BarSer, BarSerDsc, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarUniMed, BarNumUni, BarNumPie, EmprCod, DisCod, BarVolMaq, BarTipArt, BarFecGen, BarEstReo, BarFecCli, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T005220", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, BarMaqGru=?, BarMaqCod=?, BarEncCli=?, BarDisNum=?, BarSer=?, BarSerDsc=?, BarMat=?, BarColNom=?, BarColNum=?, BarTipCol=?, BarPes=?, BarSit=?, BarAgrEst=?, BarUniMed=?, BarNumUni=?, BarNumPie=?, DisCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T005221", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T005222", "SELECT CliCod, DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005223", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005224", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005225", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005226", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005227", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005228", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005229", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005230", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005231", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005232", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005233", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005234", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005235", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005236", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005237", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005238", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005239", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005240", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005241", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005242", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005243", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005244", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005245", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005246", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005247", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005248", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005249", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005250", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005251", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005252", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005253", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005254", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005255", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005256", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005257", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005258", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005259", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005260", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005261", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005262", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005263", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005264", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005265", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005266", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005267", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005268", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005269", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005270", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005271", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005272", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005273", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005274", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005275", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005276", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005277", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005278", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005279", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005280", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005281", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005282", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005283", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005284", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005285", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005286", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005288", "SELECT COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1, SUM(BarPiePie) AS BarPieNDes FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T005289", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T005290", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005291", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarPieKil, T2.AlbRUniUti, T2.AlbRPieUti, T2.AlbRUniEnt, T2.AlbRPieEnt, T2.AlbREst, T1.BarPieMet, T1.BarPieEst, T1.BarKilLan, T1.BarMetLan, T1.BarPConTro, T1.PieOriCod, T1.BarPieLzd, T1.BarPiePie, T2.AlbREnt, T1.EmprCod, T1.AlbRecCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005292", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T005293", "INSERT INTO TXPBARPIE(BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T005294", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?, BarPieEst=?, BarKilLan=?, BarMetLan=?, BarPConTro=?, PieOriCod=?, BarPieLzd=?, BarPiePie=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T005295", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T005296", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005297", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005298", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005299", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 3);
               ((int[]) buf[27])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 24 :
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
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 83 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 86 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 9);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 94 :
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
               stmt.setString(5, (String)parms[8], 9);
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
               stmt.setString(5, (String)parms[8], 9);
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
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
            case 5 :
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
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
            case 10 :
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
            case 11 :
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
               return;
            case 12 :
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
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               stmt.setString(7, (String)parms[10], 6);
               stmt.setString(8, (String)parms[11], 20);
               stmt.setString(9, (String)parms[12], 8);
               stmt.setString(10, (String)parms[13], 16);
               stmt.setString(11, (String)parms[14], 26);
               stmt.setString(12, (String)parms[15], 16);
               stmt.setString(13, (String)parms[16], 13);
               stmt.setInt(14, ((Number) parms[17]).intValue());
               stmt.setByte(15, ((Number) parms[18]).byteValue());
               stmt.setShort(16, ((Number) parms[19]).shortValue());
               stmt.setByte(17, ((Number) parms[20]).byteValue());
               stmt.setString(18, (String)parms[21], 1);
               stmt.setString(19, (String)parms[22], 1);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[23], 2);
               stmt.setShort(21, ((Number) parms[24]).shortValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[26], 3);
               }
               stmt.setInt(23, ((Number) parms[27]).intValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 4);
               stmt.setString(4, (String)parms[4], 6);
               stmt.setString(5, (String)parms[5], 20);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setString(7, (String)parms[7], 16);
               stmt.setString(8, (String)parms[8], 26);
               stmt.setString(9, (String)parms[9], 16);
               stmt.setString(10, (String)parms[10], 13);
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setString(15, (String)parms[15], 1);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setInt(19, ((Number) parms[19]).intValue());
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[21], 3);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[27], 1);
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
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
            case 78 :
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
            case 79 :
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
               return;
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 86 :
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
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 87 :
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
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 88 :
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
               stmt.setString(4, (String)parms[6], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               stmt.setString(11, (String)parms[13], 9);
               stmt.setInt(12, ((Number) parms[14]).intValue());
               stmt.setInt(13, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 3);
               }
               stmt.setInt(15, ((Number) parms[18]).intValue());
               return;
            case 89 :
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
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 1);
               }
               stmt.setString(15, (String)parms[18], 9);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 91 :
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
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 92 :
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
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 93 :
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
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 94 :
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

