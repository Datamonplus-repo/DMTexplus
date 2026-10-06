package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmetpi_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_rollos") == 0 )
      {
         gxnrgridlevel_rollos_newrow_invoke( ) ;
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
            AV37EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37EmprCod", AV37EmprCod);
            AV38MetTerCod = httpContext.GetPar( "MetTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38MetTerCod", AV38MetTerCod);
            AV39BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCod), 8, 0));
            AV40BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40BarCodReo", GXutil.str( AV40BarCodReo, 1, 0));
            AV41BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarCodPar", AV41BarCodPar);
            AV32AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbProcod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32AlbProcod), "ZZZZZZZZZ9")));
            AV33Pzs = (int)(GXutil.lval( httpContext.GetPar( "Pzs"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Pzs), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Pzs), "ZZZZZ9")));
            AV34Kgs = CommonUtil.decimalVal( httpContext.GetPar( "Kgs"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Kgs", GXutil.ltrimstr( AV34Kgs, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGS", getSecureSignedToken( "", localUtil.format( AV34Kgs, "ZZZZZ9.99")));
            AV35Mts = CommonUtil.decimalVal( httpContext.GetPar( "Mts"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Mts", GXutil.ltrimstr( AV35Mts, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTS", getSecureSignedToken( "", localUtil.format( AV35Mts, "ZZZZZ9.99")));
            AV36MetPiectr = httpContext.GetPar( "MetPiectr") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36MetPiectr", AV36MetPiectr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36MetPiectr, ""))));
            AV46Mensaje = httpContext.GetPar( "Mensaje") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Mensaje, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Piezas Programa Contador", ""), (short)(0)) ;
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

   public void gxnrgridlevel_rollos_newrow_invoke( )
   {
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_rollos_newrow( ) ;
      /* End function gxnrGridlevel_rollos_newrow_invoke */
   }

   public tmetpi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmetpi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmetpi_impl.class ));
   }

   public tmetpi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV32AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32AlbProcod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV32AlbProcod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Nº OS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPzs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPzs_Internalname, httpContext.getMessage( "Peças", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPzs_Internalname, GXutil.ltrim( localUtil.ntoc( AV33Pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33Pzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33Pzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavKgs_Internalname, httpContext.getMessage( "Quilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavKgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV34Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKgs_Enabled!=0) ? localUtil.format( AV34Kgs, "ZZZZZ9.99") : localUtil.format( AV34Kgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavMts_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavMts_Internalname, GXutil.ltrim( localUtil.ntoc( AV35Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMts_Enabled!=0) ? localUtil.format( AV35Mts, "ZZZZZ9.99") : localUtil.format( AV35Mts, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiectr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavMetpiectr_Internalname, httpContext.getMessage( "Var. Ctrl.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiectr_Internalname, GXutil.rtrim( AV36MetPiectr), GXutil.rtrim( localUtil.format( AV36MetPiectr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiectr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiectr_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnetiqueta_Internalname, "", httpContext.getMessage( "Imprimir Etiqueta", ""), bttBtnetiqueta_Jsonclick, 5, httpContext.getMessage( "Imprimir Etiqueta", ""), "", StyleString, ClassString, bttBtnetiqueta_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOETIQUETA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirtodas_Internalname, "", httpContext.getMessage( "Imprimir TODAS", ""), bttBtnimprimirtodas_Jsonclick, 5, httpContext.getMessage( "Imprimir TODAS", ""), "", StyleString, ClassString, bttBtnimprimirtodas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIRTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_rollos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_rollos( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLineatotal_Internalname, 1, 100, "%", 0, "px", "", "left", "top", " "+"data-gx-smarttable"+" ", "grid-template-columns:180px 155px 80px;grid-template-rows:auto;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemettotpie_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmettotpie_Internalname, httpContext.getMessage( "Tot. Pçs", ""), "", "", lblTextblockmettotpie_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotPie_Internalname, httpContext.getMessage( "Total Piezas Meradas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetTotPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemettotkil_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmettotkil_Internalname, httpContext.getMessage( "Tot. Quilos", ""), "", "", lblTextblockmettotkil_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotKil_Internalname, httpContext.getMessage( "Total Kilos Metrados", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotKil_Enabled!=0) ? localUtil.format( A2810MetTotKil, "ZZZZZ9.99") : localUtil.format( A2810MetTotKil, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotKil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetTotKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemettotmet_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmettotmet_Internalname, httpContext.getMessage( "Tot. Metros", ""), "", "", lblTextblockmettotmet_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotMet_Internalname, httpContext.getMessage( "Total Metros Metrados", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotMet_Enabled!=0) ? localUtil.format( A2811MetTotMet, "ZZZZZ9.99") : localUtil.format( A2811MetTotMet, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotMet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetTotMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV47Pgmname), GXutil.rtrim( localUtil.format( AV47Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI.htm");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_rollos( )
   {
      /*  Grid Control  */
      startgridcontrol79( ) ;
      nGXsfl_79_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount413 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_413 = (short)(1) ;
            scanStart1EJ413( ) ;
            while ( RcdFound413 != 0 )
            {
               init_level_properties413( ) ;
               getByPrimaryKey1EJ413( ) ;
               addRow1EJ413( ) ;
               scanNext1EJ413( ) ;
            }
            scanEnd1EJ413( ) ;
            nBlankRcdCount413 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2811MetTotMet = A2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         B2810MetTotKil = A2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         B2812MetTotPie = A2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         standaloneNotModal1EJ413( ) ;
         standaloneModal1EJ413( ) ;
         sMode413 = Gx_mode ;
         while ( nGXsfl_79_idx < nRC_GXsfl_79 )
         {
            bGXsfl_79_Refreshing = true ;
            readRow1EJ413( ) ;
            edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMetPieMtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMTD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtMetPiectr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECTR_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            if ( ( nRcdExists_413 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EJ413( ) ;
            }
            sendRow1EJ413( ) ;
            bGXsfl_79_Refreshing = false ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2811MetTotMet = B2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = B2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = B2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount413 = (short)(5) ;
         nRcdExists_413 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EJ413( ) ;
            while ( RcdFound413 != 0 )
            {
               sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_79413( ) ;
               init_level_properties413( ) ;
               standaloneNotModal1EJ413( ) ;
               getByPrimaryKey1EJ413( ) ;
               standaloneModal1EJ413( ) ;
               addRow1EJ413( ) ;
               scanNext1EJ413( ) ;
            }
            scanEnd1EJ413( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode413 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_79413( ) ;
         initAll1EJ413( ) ;
         init_level_properties413( ) ;
         B2811MetTotMet = A2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         B2810MetTotKil = A2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         B2812MetTotPie = A2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         nRcdExists_413 = (short)(0) ;
         nIsMod_413 = (short)(0) ;
         nRcdDeleted_413 = (short)(0) ;
         nBlankRcdCount413 = (short)(nBlankRcdUsr413+nBlankRcdCount413) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount413 > 0 )
         {
            standaloneNotModal1EJ413( ) ;
            standaloneModal1EJ413( ) ;
            addRow1EJ413( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMetPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount413 = (short)(nBlankRcdCount413-1) ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2811MetTotMet = B2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = B2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = B2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_rollosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_rollos", Gridlevel_rollosContainer, subGridlevel_rollos_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_rollosContainerData", Gridlevel_rollosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_rollosContainerData"+"V", Gridlevel_rollosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_rollosContainerData"+"V"+"\" value='"+Gridlevel_rollosContainer.GridValuesHidden()+"'/>") ;
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
      e111EJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2809MetTerCod = httpContext.cgiGet( "Z2809MetTerCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            O2811MetTotMet = localUtil.ctond( httpContext.cgiGet( "O2811MetTotMet")) ;
            O2810MetTotKil = localUtil.ctond( httpContext.cgiGet( "O2810MetTotKil")) ;
            O2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( "O2812MetTotPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV38MetTerCod = httpContext.cgiGet( "vMETTERCOD") ;
            A2809MetTerCod = httpContext.cgiGet( "METTERCOD") ;
            AV39BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A10784MetPieId = httpContext.cgiGet( "METPIEID") ;
            A10779MetPieOb = httpContext.cgiGet( "METPIEOB") ;
            A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( "METPIEFCH"), 0) ;
            A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2846MetPieDsc = httpContext.cgiGet( "METPIEDSC") ;
            A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "METPIEEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            AV32AlbProcod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbProcod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32AlbProcod), "ZZZZZZZZZ9")));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV33Pzs = (int)(localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Pzs), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Pzs), "ZZZZZ9")));
            AV34Kgs = localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Kgs", GXutil.ltrimstr( AV34Kgs, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGS", getSecureSignedToken( "", localUtil.format( AV34Kgs, "ZZZZZ9.99")));
            AV35Mts = localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Mts", GXutil.ltrimstr( AV35Mts, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTS", getSecureSignedToken( "", localUtil.format( AV35Mts, "ZZZZZ9.99")));
            AV36MetPiectr = httpContext.cgiGet( edtavMetpiectr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36MetPiectr", AV36MetPiectr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36MetPiectr, ""))));
            A2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( edtMetTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2810MetTotKil = localUtil.ctond( httpContext.cgiGet( edtMetTotKil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            A2811MetTotMet = localUtil.ctond( httpContext.cgiGet( edtMetTotMet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMETPI");
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmetpi:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
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
                  sMode412 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode412 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound412 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1EJ0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111EJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121EJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOETIQUETA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoEtiqueta' */
                        e131EJ2 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIRTODAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoImprimirTodas' */
                        e141EJ2 ();
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
         e121EJ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1EJ412( ) ;
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
         disableAttributes1EJ412( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavMetpiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiectr_Enabled), 5, 0), true);
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

   public void confirm_1EJ0( )
   {
      beforeValidate1EJ412( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EJ412( ) ;
         }
         else
         {
            checkExtendedTable1EJ412( ) ;
            closeExtendedTableCursors1EJ412( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode412 = Gx_mode ;
         confirm_1EJ413( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode412 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1EJ413( )
   {
      s2811MetTotMet = O2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      s2810MetTotKil = O2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      s2812MetTotPie = O2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1EJ413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            getKey1EJ413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               if ( RcdFound413 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EJ413( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EJ413( ) ;
                     closeExtendedTableCursors1EJ413( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2811MetTotMet = A2811MetTotMet ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                     O2810MetTotKil = A2810MetTotKil ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                     O2812MetTotPie = A2812MetTotPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "METPIECOD_" + sGXsfl_79_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMetPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( nRcdDeleted_413 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EJ413( ) ;
                     load1EJ413( ) ;
                     beforeValidate1EJ413( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EJ413( ) ;
                        O2811MetTotMet = A2811MetTotMet ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                        O2810MetTotKil = A2810MetTotKil ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                        O2812MetTotPie = A2812MetTotPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EJ413( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EJ413( ) ;
                           closeExtendedTableCursors1EJ413( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2811MetTotMet = A2811MetTotMet ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                           O2810MetTotKil = A2810MetTotKil ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                           O2812MetTotPie = A2812MetTotPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_79_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_79_idx, GXutil.rtrim( Z10784MetPieId)) ;
         httpContext.changePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_79_idx, GXutil.rtrim( Z10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_79_idx, GXutil.rtrim( Z10779MetPieOb)) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_79_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_79_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMTD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECTR_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2811MetTotMet = s2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = s2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = s2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EJ0( )
   {
   }

   public void e111EJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmetpi_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV37EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmetpi_impl.this.AV37EmprCod = GXv_char2[0] ;
      tmetpi_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmetpi_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37EmprCod", AV37EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV42WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV42WWPContext = GXv_SdtWWPContext5[0] ;
      AV43TrnContext.fromxml(AV44WebSession.getValue("TrnContext"), null, null);
   }

   public void e121EJ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = AV46Mensaje ;
      new app.pmetpiacopy1copy1(remoteHandle, context).execute( AV37EmprCod, AV39BarCod, AV40BarCodReo, AV41BarCodPar, AV33Pzs, GXv_char4) ;
      tmetpi_impl.this.AV46Mensaje = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Mensaje, ""))));
      if ( ! (GXutil.strcmp("", AV46Mensaje)==0) )
      {
         httpContext.popup(formatLink("app.controlpiezasvscontador", new String[] {GXutil.URLEncode(GXutil.rtrim(AV46Mensaje))}, new String[] {"Mensaje"}) , new Object[] {});
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e131EJ2( )
   {
      /* 'DoEtiqueta' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
      {
         httpContext.popup(formatLink("app.retim21", new String[] {GXutil.URLEncode(GXutil.rtrim(AV37EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A2814MetPieKil)),GXutil.URLEncode(DecimalUtil.decToString(A2815MetPieMet)),GXutil.URLEncode(GXutil.ltrimstr(A6635MetPieAnc,3,0)),GXutil.URLEncode(DecimalUtil.decToString(A4910MetPieMtD)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Metpiecod","Metpiekil","Metpiemet","MetPieAnc","MetPieMtd","MaqCod","Opecod","Output"}) , new Object[] {"AV37EmprCod","AV39BarCod","AV40BarCodReo","AV41BarCodPar","A2813MetPieCod","A2814MetPieKil","A2815MetPieMet","A6635MetPieAnc","A4910MetPieMtD","","",""});
      }
      /*  Sending Event outputs  */
   }

   public void e141EJ2( )
   {
      /* 'DoImprimirTodas' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV37EmprCod ;
      GXv_char3[0] = AV38MetTerCod ;
      GXv_int6[0] = AV39BarCod ;
      GXv_int7[0] = AV40BarCodReo ;
      GXv_char2[0] = AV41BarCodPar ;
      new app.pmetpii(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_int7, GXv_char2) ;
      tmetpi_impl.this.AV37EmprCod = GXv_char4[0] ;
      tmetpi_impl.this.AV38MetTerCod = GXv_char3[0] ;
      tmetpi_impl.this.AV39BarCod = GXv_int6[0] ;
      tmetpi_impl.this.AV40BarCodReo = GXv_int7[0] ;
      tmetpi_impl.this.AV41BarCodPar = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37EmprCod", AV37EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV38MetTerCod", AV38MetTerCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarCodReo", GXutil.str( AV40BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarCodPar", AV41BarCodPar);
      /*  Sending Event outputs  */
   }

   public void zm1EJ412( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -15 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z2812MetTotPie = A2812MetTotPie ;
         Z2811MetTotMet = A2811MetTotMet ;
         Z2810MetTotKil = A2810MetTotKil ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      AV47Pgmname = "TMETPI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         A396EmprCod = AV37EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01EJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EJ6_A407EmprNom[0] ;
      n407EmprNom = T01EJ6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (GXutil.strcmp("", AV38MetTerCod)==0) )
      {
         A2809MetTerCod = AV38MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      }
      if ( ! (0==AV39BarCod) )
      {
         A129BarCod = AV39BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV40BarCodReo) )
      {
         A132BarCodReo = AV40BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV41BarCodPar)==0) )
      {
         A130BarCodPar = AV41BarCodPar ;
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01EJ9 */
         pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A2812MetTotPie = T01EJ9_A2812MetTotPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2811MetTotMet = T01EJ9_A2811MetTotMet[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = T01EJ9_A2810MetTotKil[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            A2812MetTotPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         O2812MetTotPie = A2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         O2811MetTotMet = A2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = A2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         pr_default.close(6);
      }
   }

   public void load1EJ412( )
   {
      /* Using cursor T01EJ11 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A407EmprNom = T01EJ11_A407EmprNom[0] ;
         n407EmprNom = T01EJ11_n407EmprNom[0] ;
         A2812MetTotPie = T01EJ11_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01EJ11_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01EJ11_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         zm1EJ412( -15) ;
      }
      pr_default.close(7);
      onLoadActions1EJ412( ) ;
   }

   public void onLoadActions1EJ412( )
   {
      O2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
   }

   public void checkExtendedTable1EJ412( )
   {
      nIsDirty_412 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01EJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01EJ9 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A2812MetTotPie = T01EJ9_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01EJ9_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01EJ9_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         nIsDirty_412 = (short)(1) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         nIsDirty_412 = (short)(1) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1EJ412( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01EJ12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_18( String A396EmprCod ,
                          String A2809MetTerCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01EJ14 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A2812MetTotPie = T01EJ14_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01EJ14_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01EJ14_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1EJ412( )
   {
      /* Using cursor T01EJ15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      else
      {
         RcdFound412 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1EJ412( 15) ;
         RcdFound412 = (short)(1) ;
         A2809MetTerCod = T01EJ5_A2809MetTerCod[0] ;
         A396EmprCod = T01EJ5_A396EmprCod[0] ;
         A129BarCod = T01EJ5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01EJ5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01EJ5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1EJ412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound412 = (short)(0) ;
            initializeNonKey1EJ412( ) ;
         }
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound412 = (short)(0) ;
         initializeNonKey1EJ412( ) ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1EJ412( ) ;
      if ( RcdFound412 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound412 = (short)(0) ;
      /* Using cursor T01EJ16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ16_A129BarCod[0] < A129BarCod ) || ( T01EJ16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ16_A132BarCodReo[0] < A132BarCodReo ) || ( T01EJ16_A132BarCodReo[0] == A132BarCodReo ) && ( T01EJ16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ16_A129BarCod[0] > A129BarCod ) || ( T01EJ16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ16_A132BarCodReo[0] > A132BarCodReo ) || ( T01EJ16_A132BarCodReo[0] == A132BarCodReo ) && ( T01EJ16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ16_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01EJ16_A396EmprCod[0] ;
            A2809MetTerCod = T01EJ16_A2809MetTerCod[0] ;
            A129BarCod = T01EJ16_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01EJ16_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01EJ16_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound412 = (short)(0) ;
      /* Using cursor T01EJ17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ17_A129BarCod[0] > A129BarCod ) || ( T01EJ17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ17_A132BarCodReo[0] > A132BarCodReo ) || ( T01EJ17_A132BarCodReo[0] == A132BarCodReo ) && ( T01EJ17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ17_A129BarCod[0] < A129BarCod ) || ( T01EJ17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EJ17_A132BarCodReo[0] < A132BarCodReo ) || ( T01EJ17_A132BarCodReo[0] == A132BarCodReo ) && ( T01EJ17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EJ17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EJ17_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01EJ17_A396EmprCod[0] ;
            A2809MetTerCod = T01EJ17_A2809MetTerCod[0] ;
            A129BarCod = T01EJ17_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01EJ17_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01EJ17_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EJ412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2811MetTotMet = O2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = O2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = O2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         insert1EJ412( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound412 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2809MetTerCod = Z2809MetTerCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               update1EJ412( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               insert1EJ412( ) ;
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
                  A2811MetTotMet = O2811MetTotMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                  A2810MetTotKil = O2810MetTotKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                  A2812MetTotPie = O2812MetTotPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                  insert1EJ412( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = Z2809MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BARCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2811MetTotMet = O2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = O2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = O2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1EJ412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EJ412( )
   {
      beforeValidate1EJ412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EJ412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EJ412( 0) ;
         checkOptimisticConcurrency1EJ412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EJ412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EJ412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EJ18 */
                  pr_default.execute(13, new Object[] {A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1EJ412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EJ0( ) ;
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
            load1EJ412( ) ;
         }
         endLevel1EJ412( ) ;
      }
      closeExtendedTableCursors1EJ412( ) ;
   }

   public void update1EJ412( )
   {
      beforeValidate1EJ412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EJ412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EJ412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EJ412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EJ412( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCMETPI */
                  deferredUpdate1EJ412( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EJ412( ) ;
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
         endLevel1EJ412( ) ;
      }
      closeExtendedTableCursors1EJ412( ) ;
   }

   public void deferredUpdate1EJ412( )
   {
   }

   public void delete( )
   {
      beforeValidate1EJ412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EJ412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EJ412( ) ;
         afterConfirm1EJ412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EJ412( ) ;
            if ( AnyError == 0 )
            {
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               scanStart1EJ413( ) ;
               while ( RcdFound413 != 0 )
               {
                  getByPrimaryKey1EJ413( ) ;
                  delete1EJ413( ) ;
                  scanNext1EJ413( ) ;
                  O2811MetTotMet = A2811MetTotMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                  O2810MetTotKil = A2810MetTotKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                  O2812MetTotPie = A2812MetTotPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               }
               scanEnd1EJ413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EJ19 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( AnyError == 0 )
                  {
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
      sMode412 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EJ412( ) ;
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EJ412( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EJ21 */
         pr_default.execute(15, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A2812MetTotPie = T01EJ21_A2812MetTotPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2811MetTotMet = T01EJ21_A2811MetTotMet[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = T01EJ21_A2810MetTotKil[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            A2812MetTotPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01EJ22 */
         pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void processNestedLevel1EJ413( )
   {
      s2811MetTotMet = O2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      s2810MetTotKil = O2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      s2812MetTotPie = O2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1EJ413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            standaloneNotModal1EJ413( ) ;
            getKey1EJ413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EJ413( ) ;
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( ( nRcdDeleted_413 != 0 ) && ( nRcdExists_413 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EJ413( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EJ413( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2811MetTotMet = A2811MetTotMet ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            O2810MetTotKil = A2810MetTotKil ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            O2812MetTotPie = A2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_79_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_79_idx, GXutil.rtrim( Z10784MetPieId)) ;
         httpContext.changePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_79_idx, GXutil.rtrim( Z10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_79_idx, GXutil.rtrim( Z10779MetPieOb)) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_79_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_79_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMTD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECTR_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EJ413( ) ;
      if ( AnyError != 0 )
      {
         O2811MetTotMet = s2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = s2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         O2812MetTotPie = s2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
   }

   public void processLevel1EJ412( )
   {
      /* Save parent mode. */
      sMode412 = Gx_mode ;
      processNestedLevel1EJ413( ) ;
      if ( AnyError != 0 )
      {
         O2811MetTotMet = s2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = s2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         O2812MetTotPie = s2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1EJ412( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1EJ412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmetpi");
         if ( AnyError == 0 )
         {
            confirmValues1EJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmetpi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EJ412( )
   {
      /* Scan By routine */
      /* Using cursor T01EJ23 */
      pr_default.execute(17);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A396EmprCod = T01EJ23_A396EmprCod[0] ;
         A2809MetTerCod = T01EJ23_A2809MetTerCod[0] ;
         A129BarCod = T01EJ23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01EJ23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01EJ23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EJ412( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A396EmprCod = T01EJ23_A396EmprCod[0] ;
         A2809MetTerCod = T01EJ23_A2809MetTerCod[0] ;
         A129BarCod = T01EJ23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01EJ23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01EJ23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1EJ412( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1EJ412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EJ412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EJ412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EJ412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EJ412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EJ412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EJ412( )
   {
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtavPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Enabled), 5, 0), true);
      edtavKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Enabled), 5, 0), true);
      edtavMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Enabled), 5, 0), true);
      edtavMetpiectr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetpiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiectr_Enabled), 5, 0), true);
      edtMetTotPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotPie_Enabled), 5, 0), true);
      edtMetTotKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotKil_Enabled), 5, 0), true);
      edtMetTotMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotMet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1EJ413( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01EJ3_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01EJ3_A2815MetPieMet[0] ;
            Z10784MetPieId = T01EJ3_A10784MetPieId[0] ;
            Z10780MetPiectr = T01EJ3_A10780MetPiectr[0] ;
            Z10779MetPieOb = T01EJ3_A10779MetPieOb[0] ;
            Z6635MetPieAnc = T01EJ3_A6635MetPieAnc[0] ;
            Z5136MetPieFch = T01EJ3_A5136MetPieFch[0] ;
            Z4909MetPieDef = T01EJ3_A4909MetPieDef[0] ;
            Z2846MetPieDsc = T01EJ3_A2846MetPieDsc[0] ;
            Z2816MetPieEst = T01EJ3_A2816MetPieEst[0] ;
            Z4910MetPieMtD = T01EJ3_A4910MetPieMtD[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z10784MetPieId = A10784MetPieId ;
            Z10780MetPiectr = A10780MetPiectr ;
            Z10779MetPieOb = A10779MetPieOb ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z5136MetPieFch = A5136MetPieFch ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z2846MetPieDsc = A2846MetPieDsc ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z4910MetPieMtD = A4910MetPieMtD ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z10784MetPieId = A10784MetPieId ;
         Z10780MetPiectr = A10780MetPiectr ;
         Z10779MetPieOb = A10779MetPieOb ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z5136MetPieFch = A5136MetPieFch ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z2846MetPieDsc = A2846MetPieDsc ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z4910MetPieMtD = A4910MetPieMtD ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1EJ413( )
   {
   }

   public void standaloneModal1EJ413( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         edtMetPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
   }

   public void load1EJ413( )
   {
      /* Using cursor T01EJ24 */
      pr_default.execute(18, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2814MetPieKil = T01EJ24_A2814MetPieKil[0] ;
         A2815MetPieMet = T01EJ24_A2815MetPieMet[0] ;
         A10784MetPieId = T01EJ24_A10784MetPieId[0] ;
         A10780MetPiectr = T01EJ24_A10780MetPiectr[0] ;
         A10779MetPieOb = T01EJ24_A10779MetPieOb[0] ;
         A6635MetPieAnc = T01EJ24_A6635MetPieAnc[0] ;
         A5136MetPieFch = T01EJ24_A5136MetPieFch[0] ;
         A4909MetPieDef = T01EJ24_A4909MetPieDef[0] ;
         A2846MetPieDsc = T01EJ24_A2846MetPieDsc[0] ;
         A2816MetPieEst = T01EJ24_A2816MetPieEst[0] ;
         A4910MetPieMtD = T01EJ24_A4910MetPieMtD[0] ;
         zm1EJ413( -19) ;
      }
      pr_default.close(18);
      onLoadActions1EJ413( ) ;
   }

   public void onLoadActions1EJ413( )
   {
      if ( isIns( )  )
      {
         A2812MetTotPie = (short)(O2812MetTotPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2812MetTotPie = O2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2812MetTotPie = (short)(O2812MetTotPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable1EJ413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1EJ413( ) ;
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2812MetTotPie = (short)(O2812MetTotPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2812MetTotPie = O2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2812MetTotPie = (short)(O2812MetTotPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1EJ413( )
   {
   }

   public void enableDisable1EJ413( )
   {
   }

   public void getKey1EJ413( )
   {
      /* Using cursor T01EJ25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1EJ413( )
   {
      /* Using cursor T01EJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1EJ413( 19) ;
         RcdFound413 = (short)(1) ;
         initializeNonKey1EJ413( ) ;
         A2813MetPieCod = T01EJ3_A2813MetPieCod[0] ;
         A2814MetPieKil = T01EJ3_A2814MetPieKil[0] ;
         A2815MetPieMet = T01EJ3_A2815MetPieMet[0] ;
         A10784MetPieId = T01EJ3_A10784MetPieId[0] ;
         A10780MetPiectr = T01EJ3_A10780MetPiectr[0] ;
         A10779MetPieOb = T01EJ3_A10779MetPieOb[0] ;
         A6635MetPieAnc = T01EJ3_A6635MetPieAnc[0] ;
         A5136MetPieFch = T01EJ3_A5136MetPieFch[0] ;
         A4909MetPieDef = T01EJ3_A4909MetPieDef[0] ;
         A2846MetPieDsc = T01EJ3_A2846MetPieDsc[0] ;
         A2816MetPieEst = T01EJ3_A2816MetPieEst[0] ;
         A4910MetPieMtD = T01EJ3_A4910MetPieMtD[0] ;
         O2815MetPieMet = A2815MetPieMet ;
         O2814MetPieKil = A2814MetPieKil ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1EJ413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1EJ413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EJ413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EJ413( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EJ413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01EJ2_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01EJ2_A2815MetPieMet[0]) != 0 ) || ( GXutil.strcmp(Z10784MetPieId, T01EJ2_A10784MetPieId[0]) != 0 ) || ( GXutil.strcmp(Z10780MetPiectr, T01EJ2_A10780MetPiectr[0]) != 0 ) || ( GXutil.strcmp(Z10779MetPieOb, T01EJ2_A10779MetPieOb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6635MetPieAnc != T01EJ2_A6635MetPieAnc[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01EJ2_A5136MetPieFch[0])) ) || ( Z4909MetPieDef != T01EJ2_A4909MetPieDef[0] ) || ( GXutil.strcmp(Z2846MetPieDsc, T01EJ2_A2846MetPieDsc[0]) != 0 ) || ( Z2816MetPieEst != T01EJ2_A2816MetPieEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4910MetPieMtD, T01EJ2_A4910MetPieMtD[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01EJ2_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01EJ2_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01EJ2_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01EJ2_A2815MetPieMet[0]);
            }
            if ( GXutil.strcmp(Z10784MetPieId, T01EJ2_A10784MetPieId[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieId");
               GXutil.writeLogRaw("Old: ",Z10784MetPieId);
               GXutil.writeLogRaw("Current: ",T01EJ2_A10784MetPieId[0]);
            }
            if ( GXutil.strcmp(Z10780MetPiectr, T01EJ2_A10780MetPiectr[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPiectr");
               GXutil.writeLogRaw("Old: ",Z10780MetPiectr);
               GXutil.writeLogRaw("Current: ",T01EJ2_A10780MetPiectr[0]);
            }
            if ( GXutil.strcmp(Z10779MetPieOb, T01EJ2_A10779MetPieOb[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieOb");
               GXutil.writeLogRaw("Old: ",Z10779MetPieOb);
               GXutil.writeLogRaw("Current: ",T01EJ2_A10779MetPieOb[0]);
            }
            if ( Z6635MetPieAnc != T01EJ2_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T01EJ2_A6635MetPieAnc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01EJ2_A5136MetPieFch[0])) ) )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieFch");
               GXutil.writeLogRaw("Old: ",Z5136MetPieFch);
               GXutil.writeLogRaw("Current: ",T01EJ2_A5136MetPieFch[0]);
            }
            if ( Z4909MetPieDef != T01EJ2_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T01EJ2_A4909MetPieDef[0]);
            }
            if ( GXutil.strcmp(Z2846MetPieDsc, T01EJ2_A2846MetPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieDsc");
               GXutil.writeLogRaw("Old: ",Z2846MetPieDsc);
               GXutil.writeLogRaw("Current: ",T01EJ2_A2846MetPieDsc[0]);
            }
            if ( Z2816MetPieEst != T01EJ2_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T01EJ2_A2816MetPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z4910MetPieMtD, T01EJ2_A4910MetPieMtD[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi:[seudo value changed for attri]"+"MetPieMtD");
               GXutil.writeLogRaw("Old: ",Z4910MetPieMtD);
               GXutil.writeLogRaw("Current: ",T01EJ2_A4910MetPieMtD[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EJ413( )
   {
      beforeValidate1EJ413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EJ413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EJ413( 0) ;
         checkOptimisticConcurrency1EJ413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EJ413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EJ413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EJ26 */
                  pr_default.execute(20, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, A10784MetPieId, A10780MetPiectr, A10779MetPieOb, Short.valueOf(A6635MetPieAnc), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, Byte.valueOf(A2816MetPieEst), A4910MetPieMtD, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1EJ413( ) ;
         }
         endLevel1EJ413( ) ;
      }
      closeExtendedTableCursors1EJ413( ) ;
   }

   public void update1EJ413( )
   {
      beforeValidate1EJ413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EJ413( ) ;
      }
      if ( ( nIsMod_413 != 0 ) || ( nIsDirty_413 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EJ413( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EJ413( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EJ413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EJ27 */
                     pr_default.execute(21, new Object[] {A2814MetPieKil, A2815MetPieMet, A10784MetPieId, A10780MetPiectr, A10779MetPieOb, Short.valueOf(A6635MetPieAnc), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, Byte.valueOf(A2816MetPieEst), A4910MetPieMtD, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EJ413( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EJ413( ) ;
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
            endLevel1EJ413( ) ;
         }
      }
      closeExtendedTableCursors1EJ413( ) ;
   }

   public void deferredUpdate1EJ413( )
   {
   }

   public void delete1EJ413( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EJ413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EJ413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EJ413( ) ;
         afterConfirm1EJ413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EJ413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EJ28 */
               pr_default.execute(22, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EJ413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EJ413( )
   {
      standaloneModal1EJ413( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A2812MetTotPie = (short)(O2812MetTotPie+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2812MetTotPie = (short)(O2812MetTotPie-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               }
            }
         }
         if ( isDlt( )  && ( GXutil.strcmp(A10780MetPiectr, AV36MetPiectr) != 0 ) )
         {
            GXCCtl = "METPIECTR_" + sGXsfl_79_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Eliminacion NO permitida", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPiectr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01EJ29 */
         pr_default.execute(23, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void endLevel1EJ413( )
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

   public void scanStart1EJ413( )
   {
      /* Scan By routine */
      /* Using cursor T01EJ30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01EJ30_A2813MetPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EJ413( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01EJ30_A2813MetPieCod[0] ;
      }
   }

   public void scanEnd1EJ413( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1EJ413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EJ413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EJ413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EJ413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EJ413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EJ413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EJ413( )
   {
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMetPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMetPieMtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtMetPiectr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void send_integrity_lvl_hashes1EJ413( )
   {
   }

   public void send_integrity_lvl_hashes1EJ412( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32AlbProcod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Pzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGS", getSecureSignedToken( "", localUtil.format( AV34Kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTS", getSecureSignedToken( "", localUtil.format( AV35Mts, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36MetPiectr, ""))));
   }

   public void subsflControlProps_79413( )
   {
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_79_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_79_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_79_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_79_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_79_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_79413( )
   {
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_79_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_79_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_79_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_79_fel_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_79_fel_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_79_fel_idx ;
   }

   public void addRow1EJ413( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79413( ) ;
      sendRow1EJ413( ) ;
   }

   public void sendRow1EJ413( )
   {
      Gridlevel_rollosRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_rollos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_rollos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_rollos_Class, "") != 0 )
         {
            subGridlevel_rollos_Linesclass = subGridlevel_rollos_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_rollos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_rollos_Backstyle = (byte)(0) ;
         subGridlevel_rollos_Backcolor = subGridlevel_rollos_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_rollos_Class, "") != 0 )
         {
            subGridlevel_rollos_Linesclass = subGridlevel_rollos_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_rollos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_rollos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_rollos_Class, "") != 0 )
         {
            subGridlevel_rollos_Linesclass = subGridlevel_rollos_Class+"Odd" ;
         }
         subGridlevel_rollos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_rollos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_rollos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
         {
            subGridlevel_rollos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_rollos_Class, "") != 0 )
            {
               subGridlevel_rollos_Linesclass = subGridlevel_rollos_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_rollos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_rollos_Class, "") != 0 )
            {
               subGridlevel_rollos_Linesclass = subGridlevel_rollos_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_rollosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_rollosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_rollosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_rollosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetPieAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_rollosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMtD_Enabled!=0) ? localUtil.format( A4910MetPieMtD, "ZZZZ9.99") : localUtil.format( A4910MetPieMtD, "ZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMtD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_rollosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPiectr_Internalname,GXutil.rtrim( A10780MetPiectr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPiectr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetPiectr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_rollosRow);
      send_integrity_lvl_hashes1EJ413( ) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2813MetPieCod));
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10784MetPieId_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10784MetPieId));
      GXCCtl = "Z10780MetPiectr_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10780MetPiectr));
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10779MetPieOb));
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5136MetPieFch, 0, "/"));
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2846MetPieDsc));
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4910MetPieMtD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2815MetPieMet_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2814MetPieKil_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_413_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_413_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV37EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV40BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV41BarCodPar));
      GXCCtl = "vMETTERCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV38MetTerCod));
      GXCCtl = "vMODE_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vMENSAJE_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV46Mensaje);
      GXCCtl = "EMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "METTERCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEKIL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMET_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEANC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMTD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECTR_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_rollosContainer.AddRow(Gridlevel_rollosRow);
   }

   public void readRow1EJ413( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79413( ) ;
      edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMTD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPiectr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECTR_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEKIL_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieKil_Internalname ;
         wbErr = true ;
         A2814MetPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMET_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMet_Internalname ;
         wbErr = true ;
         A2815MetPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEANC_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieAnc_Internalname ;
         wbErr = true ;
         A6635MetPieAnc = (short)(0) ;
      }
      else
      {
         A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMTD_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMtD_Internalname ;
         wbErr = true ;
         A4910MetPieMtD = DecimalUtil.ZERO ;
      }
      else
      {
         A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
      }
      A10780MetPiectr = httpContext.cgiGet( edtMetPiectr_Internalname) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_79_idx ;
      Z2813MetPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_79_idx ;
      Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_79_idx ;
      Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10784MetPieId_" + sGXsfl_79_idx ;
      Z10784MetPieId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10780MetPiectr_" + sGXsfl_79_idx ;
      Z10780MetPiectr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_79_idx ;
      Z10779MetPieOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_79_idx ;
      Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_79_idx ;
      Z5136MetPieFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_79_idx ;
      Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_79_idx ;
      Z2846MetPieDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_79_idx ;
      Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4910MetPieMtD_" + sGXsfl_79_idx ;
      Z4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10784MetPieId_" + sGXsfl_79_idx ;
      A10784MetPieId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_79_idx ;
      A10779MetPieOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_79_idx ;
      A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_79_idx ;
      A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_79_idx ;
      A2846MetPieDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_79_idx ;
      A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2815MetPieMet_" + sGXsfl_79_idx ;
      O2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2814MetPieKil_" + sGXsfl_79_idx ;
      O2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_79_idx ;
      nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_413_" + sGXsfl_79_idx ;
      nRcdExists_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_413_" + sGXsfl_79_idx ;
      nIsMod_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMetPieCod_Enabled = edtMetPieCod_Enabled ;
   }

   public void confirmValues1EJ0( )
   {
      nGXsfl_79_idx = 0 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79413( ) ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_79413( ) ;
         httpContext.changePostValue( "Z2813MetPieCod_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z2813MetPieCod_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z2814MetPieKil_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z2814MetPieKil_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z2815MetPieMet_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z2815MetPieMet_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10784MetPieId_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10784MetPieId_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10780MetPiectr_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10780MetPiectr_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10779MetPieOb_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10779MetPieOb_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z6635MetPieAnc_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z5136MetPieFch_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z5136MetPieFch_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4909MetPieDef_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4909MetPieDef_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z2846MetPieDsc_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z2816MetPieEst_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z2816MetPieEst_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4910MetPieMtD_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_79_idx) ;
      }
      httpContext.changePostValue( "O2815MetPieMet", httpContext.cgiGet( "T2815MetPieMet")) ;
      httpContext.deletePostValue( "T2815MetPieMet") ;
      httpContext.changePostValue( "O2814MetPieKil", httpContext.cgiGet( "T2814MetPieKil")) ;
      httpContext.deletePostValue( "T2814MetPieKil") ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV37EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV38MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV32AlbProcod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV34Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV35Mts)),GXutil.URLEncode(GXutil.rtrim(AV36MetPiectr)),GXutil.URLEncode(GXutil.rtrim(AV46Mensaje))}, new String[] {"Gx_mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32AlbProcod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Pzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGS", getSecureSignedToken( "", localUtil.format( AV34Kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTS", getSecureSignedToken( "", localUtil.format( AV35Mts, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36MetPiectr, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMETPI");
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmetpi:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "O2811MetTotMet", GXutil.ltrim( localUtil.ntoc( O2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2810MetTotKil", GXutil.ltrim( localUtil.ntoc( O2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2812MetTotPie", GXutil.ltrim( localUtil.ntoc( O2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nGXsfl_79_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV46Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV37EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETTERCOD", GXutil.rtrim( AV38MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "METTERCOD", GXutil.rtrim( A2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV39BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV40BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV41BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEID", GXutil.rtrim( A10784MetPieId));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOB", GXutil.rtrim( A10779MetPieOb));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEFCH", localUtil.dtoc( A5136MetPieFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDEF", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDSC", GXutil.rtrim( A2846MetPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEEST", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
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
      return formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV37EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV38MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV32AlbProcod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV34Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV35Mts)),GXutil.URLEncode(GXutil.rtrim(AV36MetPiectr)),GXutil.URLEncode(GXutil.rtrim(AV46Mensaje))}, new String[] {"Gx_mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"})  ;
   }

   public String getPgmname( )
   {
      return "TMETPI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Piezas Programa Contador", "") ;
   }

   public void initializeNonKey1EJ412( )
   {
      A2812MetTotPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      A2811MetTotMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      A2810MetTotKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
   }

   public void initAll1EJ412( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2809MetTerCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1EJ412( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1EJ413( )
   {
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A10784MetPieId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10784MetPieId", A10784MetPieId);
      A10780MetPiectr = "" ;
      A10779MetPieOb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10779MetPieOb", A10779MetPieOb);
      A6635MetPieAnc = (short)(0) ;
      A5136MetPieFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
      A4909MetPieDef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
      A2846MetPieDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
      A2816MetPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
      A4910MetPieMtD = DecimalUtil.ZERO ;
      O2815MetPieMet = A2815MetPieMet ;
      O2814MetPieKil = A2814MetPieKil ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z10784MetPieId = "" ;
      Z10780MetPiectr = "" ;
      Z10779MetPieOb = "" ;
      Z6635MetPieAnc = (short)(0) ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z4909MetPieDef = (short)(0) ;
      Z2846MetPieDsc = "" ;
      Z2816MetPieEst = (byte)(0) ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
   }

   public void initAll1EJ413( )
   {
      A2813MetPieCod = "" ;
      initializeNonKey1EJ413( ) ;
   }

   public void standaloneModalInsert1EJ413( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211663512", true, true);
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
      httpContext.AddJavascriptSource("tmetpi.js", "?20268211663512", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties413( )
   {
      edtMetPieCod_Enabled = defedtMetPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void startgridcontrol79( )
   {
      Gridlevel_rollosContainer.AddObjectProperty("GridName", "Gridlevel_rollos");
      Gridlevel_rollosContainer.AddObjectProperty("Header", subGridlevel_rollos_Header);
      Gridlevel_rollosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_rollosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_rollosContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_rollosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_rollosColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
      Gridlevel_rollosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddColumnProperties(Gridlevel_rollosColumn);
      Gridlevel_rollosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_rollosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_rollosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddColumnProperties(Gridlevel_rollosColumn);
      Gridlevel_rollosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_rollosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_rollosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddColumnProperties(Gridlevel_rollosColumn);
      Gridlevel_rollosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_rollosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_rollosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddColumnProperties(Gridlevel_rollosColumn);
      Gridlevel_rollosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_rollosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      Gridlevel_rollosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddColumnProperties(Gridlevel_rollosColumn);
      Gridlevel_rollosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_rollosColumn.AddObjectProperty("Value", GXutil.rtrim( A10780MetPiectr));
      Gridlevel_rollosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddColumnProperties(Gridlevel_rollosColumn);
      Gridlevel_rollosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_rollosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_rollos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtavPzs_Internalname = "vPZS" ;
      edtavKgs_Internalname = "vKGS" ;
      edtavMts_Internalname = "vMTS" ;
      edtavMetpiectr_Internalname = "vMETPIECTR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtnetiqueta_Internalname = "BTNETIQUETA" ;
      bttBtnimprimirtodas_Internalname = "BTNIMPRIMIRTODAS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
      edtMetPiectr_Internalname = "METPIECTR" ;
      lblTextblockmettotpie_Internalname = "TEXTBLOCKMETTOTPIE" ;
      edtMetTotPie_Internalname = "METTOTPIE" ;
      divUnnamedtablemettotpie_Internalname = "UNNAMEDTABLEMETTOTPIE" ;
      lblTextblockmettotkil_Internalname = "TEXTBLOCKMETTOTKIL" ;
      edtMetTotKil_Internalname = "METTOTKIL" ;
      divUnnamedtablemettotkil_Internalname = "UNNAMEDTABLEMETTOTKIL" ;
      lblTextblockmettotmet_Internalname = "TEXTBLOCKMETTOTMET" ;
      edtMetTotMet_Internalname = "METTOTMET" ;
      divUnnamedtablemettotmet_Internalname = "UNNAMEDTABLEMETTOTMET" ;
      divLineatotal_Internalname = "LINEATOTAL" ;
      divTableleaflevel_rollos_Internalname = "TABLELEAFLEVEL_ROLLOS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_rollos_Internalname = "GRIDLEVEL_ROLLOS" ;
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
      subGridlevel_rollos_Allowcollapsing = (byte)(0) ;
      subGridlevel_rollos_Allowselection = (byte)(0) ;
      subGridlevel_rollos_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tabla Piezas Programa Contador", "") );
      edtMetPiectr_Jsonclick = "" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      subGridlevel_rollos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_rollos_Backcolorstyle = (byte)(0) ;
      edtMetPiectr_Enabled = 1 ;
      edtMetPieMtD_Enabled = 1 ;
      edtMetPieAnc_Enabled = 1 ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtMetTotMet_Jsonclick = "" ;
      edtMetTotMet_Enabled = 0 ;
      edtMetTotKil_Jsonclick = "" ;
      edtMetTotKil_Enabled = 0 ;
      edtMetTotPie_Jsonclick = "" ;
      edtMetTotPie_Enabled = 0 ;
      bttBtnimprimirtodas_Visible = 1 ;
      bttBtnetiqueta_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavMetpiectr_Jsonclick = "" ;
      edtavMetpiectr_Enabled = 0 ;
      edtavMts_Jsonclick = "" ;
      edtavMts_Enabled = 0 ;
      edtavKgs_Jsonclick = "" ;
      edtavKgs_Enabled = 0 ;
      edtavPzs_Jsonclick = "" ;
      edtavPzs_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
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

   public void gxnrgridlevel_rollos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_79413( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EJ413( ) ;
         standaloneModal1EJ413( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EJ413( ) ;
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_79413( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_rollosContainer)) ;
      /* End function gxnrGridlevel_rollos_newrow */
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01EJ31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(25);
      /* Using cursor T01EJ21 */
      pr_default.execute(15, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A2812MetTotPie = T01EJ21_A2812MetTotPie[0] ;
         A2811MetTotMet = T01EJ21_A2811MetTotMet[0] ;
         A2810MetTotKil = T01EJ21_A2810MetTotKil[0] ;
      }
      else
      {
         A2812MetTotPie = (short)(0) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV37EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV39BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV40BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV41BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV32AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV33Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'AV34Kgs',fld:'vKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV35Mts',fld:'vMTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV36MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV46Mensaje',fld:'vMENSAJE',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV32AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV33Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'AV34Kgs',fld:'vKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV35Mts',fld:'vMTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV36MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121EJ2',iparms:[{av:'AV37EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV40BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV41BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV33Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV46Mensaje',fld:'vMENSAJE',pic:'',hsh:true}]}");
      setEventMetadata("'DOETIQUETA'","{handler:'e131EJ2',iparms:[{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV37EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV40BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV41BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'}]");
      setEventMetadata("'DOETIQUETA'",",oparms:[{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV41BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV40BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOIMPRIMIRTODAS'","{handler:'e141EJ2',iparms:[{av:'AV37EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV39BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV40BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV41BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOIMPRIMIRTODAS'",",oparms:[{av:'AV41BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV40BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV37EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALIDV_METPIECTR","{handler:'validv_Metpiectr',iparms:[]");
      setEventMetadata("VALIDV_METPIECTR",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[]");
      setEventMetadata("VALID_METPIECOD",",oparms:[]}");
      setEventMetadata("VALID_METPIEKIL","{handler:'valid_Metpiekil',iparms:[]");
      setEventMetadata("VALID_METPIEKIL",",oparms:[]}");
      setEventMetadata("VALID_METPIEMET","{handler:'valid_Metpiemet',iparms:[]");
      setEventMetadata("VALID_METPIEMET",",oparms:[]}");
      setEventMetadata("VALID_METPIECTR","{handler:'valid_Metpiectr',iparms:[]");
      setEventMetadata("VALID_METPIECTR",",oparms:[]}");
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
      pr_default.close(25);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV37EmprCod = "" ;
      wcpOAV38MetTerCod = "" ;
      wcpOAV41BarCodPar = "" ;
      wcpOAV34Kgs = DecimalUtil.ZERO ;
      wcpOAV35Mts = DecimalUtil.ZERO ;
      wcpOAV36MetPiectr = "" ;
      wcpOAV46Mensaje = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      O2811MetTotMet = DecimalUtil.ZERO ;
      O2810MetTotKil = DecimalUtil.ZERO ;
      Z2813MetPieCod = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z10784MetPieId = "" ;
      Z10780MetPiectr = "" ;
      Z10779MetPieOb = "" ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z2846MetPieDsc = "" ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      O2815MetPieMet = DecimalUtil.ZERO ;
      O2814MetPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      Gx_mode = "" ;
      AV37EmprCod = "" ;
      AV38MetTerCod = "" ;
      AV41BarCodPar = "" ;
      AV34Kgs = DecimalUtil.ZERO ;
      AV35Mts = DecimalUtil.ZERO ;
      AV36MetPiectr = "" ;
      AV46Mensaje = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      bttBtnetiqueta_Jsonclick = "" ;
      bttBtnimprimirtodas_Jsonclick = "" ;
      lblTextblockmettotpie_Jsonclick = "" ;
      lblTextblockmettotkil_Jsonclick = "" ;
      A2810MetTotKil = DecimalUtil.ZERO ;
      lblTextblockmettotmet_Jsonclick = "" ;
      A2811MetTotMet = DecimalUtil.ZERO ;
      AV47Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_rollosContainer = new com.genexus.webpanels.GXWebGrid(context);
      B2811MetTotMet = DecimalUtil.ZERO ;
      B2810MetTotKil = DecimalUtil.ZERO ;
      sMode413 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A10784MetPieId = "" ;
      A10779MetPieOb = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A2846MetPieDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode412 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s2811MetTotMet = DecimalUtil.ZERO ;
      s2810MetTotKil = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A10780MetPiectr = "" ;
      T2815MetPieMet = DecimalUtil.ZERO ;
      T2814MetPieKil = DecimalUtil.ZERO ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV42WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV44WebSession = httpContext.getWebSession();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z2811MetTotMet = DecimalUtil.ZERO ;
      Z2810MetTotKil = DecimalUtil.ZERO ;
      T01EJ6_A407EmprNom = new String[] {""} ;
      T01EJ6_n407EmprNom = new boolean[] {false} ;
      T01EJ9_A2812MetTotPie = new short[1] ;
      T01EJ9_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ9_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ11_A2809MetTerCod = new String[] {""} ;
      T01EJ11_A407EmprNom = new String[] {""} ;
      T01EJ11_n407EmprNom = new boolean[] {false} ;
      T01EJ11_A396EmprCod = new String[] {""} ;
      T01EJ11_A129BarCod = new int[1] ;
      T01EJ11_A132BarCodReo = new byte[1] ;
      T01EJ11_A130BarCodPar = new String[] {""} ;
      T01EJ11_A2812MetTotPie = new short[1] ;
      T01EJ11_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ11_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ7_A396EmprCod = new String[] {""} ;
      T01EJ12_A396EmprCod = new String[] {""} ;
      T01EJ14_A2812MetTotPie = new short[1] ;
      T01EJ14_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ14_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ15_A396EmprCod = new String[] {""} ;
      T01EJ15_A2809MetTerCod = new String[] {""} ;
      T01EJ15_A129BarCod = new int[1] ;
      T01EJ15_A132BarCodReo = new byte[1] ;
      T01EJ15_A130BarCodPar = new String[] {""} ;
      T01EJ5_A2809MetTerCod = new String[] {""} ;
      T01EJ5_A396EmprCod = new String[] {""} ;
      T01EJ5_A129BarCod = new int[1] ;
      T01EJ5_A132BarCodReo = new byte[1] ;
      T01EJ5_A130BarCodPar = new String[] {""} ;
      T01EJ16_A396EmprCod = new String[] {""} ;
      T01EJ16_A2809MetTerCod = new String[] {""} ;
      T01EJ16_A129BarCod = new int[1] ;
      T01EJ16_A132BarCodReo = new byte[1] ;
      T01EJ16_A130BarCodPar = new String[] {""} ;
      T01EJ17_A396EmprCod = new String[] {""} ;
      T01EJ17_A2809MetTerCod = new String[] {""} ;
      T01EJ17_A129BarCod = new int[1] ;
      T01EJ17_A132BarCodReo = new byte[1] ;
      T01EJ17_A130BarCodPar = new String[] {""} ;
      T01EJ4_A2809MetTerCod = new String[] {""} ;
      T01EJ4_A396EmprCod = new String[] {""} ;
      T01EJ4_A129BarCod = new int[1] ;
      T01EJ4_A132BarCodReo = new byte[1] ;
      T01EJ4_A130BarCodPar = new String[] {""} ;
      T01EJ21_A2812MetTotPie = new short[1] ;
      T01EJ21_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ21_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ22_A396EmprCod = new String[] {""} ;
      T01EJ22_A2809MetTerCod = new String[] {""} ;
      T01EJ22_A129BarCod = new int[1] ;
      T01EJ22_A132BarCodReo = new byte[1] ;
      T01EJ22_A130BarCodPar = new String[] {""} ;
      T01EJ22_A2813MetPieCod = new String[] {""} ;
      T01EJ22_A12995MetPieDfLi = new short[1] ;
      T01EJ23_A396EmprCod = new String[] {""} ;
      T01EJ23_A2809MetTerCod = new String[] {""} ;
      T01EJ23_A129BarCod = new int[1] ;
      T01EJ23_A132BarCodReo = new byte[1] ;
      T01EJ23_A130BarCodPar = new String[] {""} ;
      T01EJ24_A2809MetTerCod = new String[] {""} ;
      T01EJ24_A129BarCod = new int[1] ;
      T01EJ24_A132BarCodReo = new byte[1] ;
      T01EJ24_A130BarCodPar = new String[] {""} ;
      T01EJ24_A2813MetPieCod = new String[] {""} ;
      T01EJ24_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ24_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ24_A10784MetPieId = new String[] {""} ;
      T01EJ24_A10780MetPiectr = new String[] {""} ;
      T01EJ24_A10779MetPieOb = new String[] {""} ;
      T01EJ24_A6635MetPieAnc = new short[1] ;
      T01EJ24_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01EJ24_A4909MetPieDef = new short[1] ;
      T01EJ24_A2846MetPieDsc = new String[] {""} ;
      T01EJ24_A2816MetPieEst = new byte[1] ;
      T01EJ24_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ24_A396EmprCod = new String[] {""} ;
      T01EJ25_A396EmprCod = new String[] {""} ;
      T01EJ25_A2809MetTerCod = new String[] {""} ;
      T01EJ25_A129BarCod = new int[1] ;
      T01EJ25_A132BarCodReo = new byte[1] ;
      T01EJ25_A130BarCodPar = new String[] {""} ;
      T01EJ25_A2813MetPieCod = new String[] {""} ;
      T01EJ3_A2809MetTerCod = new String[] {""} ;
      T01EJ3_A129BarCod = new int[1] ;
      T01EJ3_A132BarCodReo = new byte[1] ;
      T01EJ3_A130BarCodPar = new String[] {""} ;
      T01EJ3_A2813MetPieCod = new String[] {""} ;
      T01EJ3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ3_A10784MetPieId = new String[] {""} ;
      T01EJ3_A10780MetPiectr = new String[] {""} ;
      T01EJ3_A10779MetPieOb = new String[] {""} ;
      T01EJ3_A6635MetPieAnc = new short[1] ;
      T01EJ3_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01EJ3_A4909MetPieDef = new short[1] ;
      T01EJ3_A2846MetPieDsc = new String[] {""} ;
      T01EJ3_A2816MetPieEst = new byte[1] ;
      T01EJ3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ3_A396EmprCod = new String[] {""} ;
      T01EJ2_A2809MetTerCod = new String[] {""} ;
      T01EJ2_A129BarCod = new int[1] ;
      T01EJ2_A132BarCodReo = new byte[1] ;
      T01EJ2_A130BarCodPar = new String[] {""} ;
      T01EJ2_A2813MetPieCod = new String[] {""} ;
      T01EJ2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ2_A10784MetPieId = new String[] {""} ;
      T01EJ2_A10780MetPiectr = new String[] {""} ;
      T01EJ2_A10779MetPieOb = new String[] {""} ;
      T01EJ2_A6635MetPieAnc = new short[1] ;
      T01EJ2_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01EJ2_A4909MetPieDef = new short[1] ;
      T01EJ2_A2846MetPieDsc = new String[] {""} ;
      T01EJ2_A2816MetPieEst = new byte[1] ;
      T01EJ2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EJ2_A396EmprCod = new String[] {""} ;
      T01EJ29_A396EmprCod = new String[] {""} ;
      T01EJ29_A2809MetTerCod = new String[] {""} ;
      T01EJ29_A129BarCod = new int[1] ;
      T01EJ29_A132BarCodReo = new byte[1] ;
      T01EJ29_A130BarCodPar = new String[] {""} ;
      T01EJ29_A2813MetPieCod = new String[] {""} ;
      T01EJ29_A12995MetPieDfLi = new short[1] ;
      T01EJ30_A396EmprCod = new String[] {""} ;
      T01EJ30_A2809MetTerCod = new String[] {""} ;
      T01EJ30_A129BarCod = new int[1] ;
      T01EJ30_A132BarCodReo = new byte[1] ;
      T01EJ30_A130BarCodPar = new String[] {""} ;
      T01EJ30_A2813MetPieCod = new String[] {""} ;
      Gridlevel_rollosRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_rollos_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_rollosColumn = new com.genexus.webpanels.GXWebColumn();
      T01EJ31_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmetpi__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmetpi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmetpi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmetpi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmetpi__default(),
         new Object[] {
             new Object[] {
            T01EJ2_A2809MetTerCod, T01EJ2_A129BarCod, T01EJ2_A132BarCodReo, T01EJ2_A130BarCodPar, T01EJ2_A2813MetPieCod, T01EJ2_A2814MetPieKil, T01EJ2_A2815MetPieMet, T01EJ2_A10784MetPieId, T01EJ2_A10780MetPiectr, T01EJ2_A10779MetPieOb,
            T01EJ2_A6635MetPieAnc, T01EJ2_A5136MetPieFch, T01EJ2_A4909MetPieDef, T01EJ2_A2846MetPieDsc, T01EJ2_A2816MetPieEst, T01EJ2_A4910MetPieMtD, T01EJ2_A396EmprCod
            }
            , new Object[] {
            T01EJ3_A2809MetTerCod, T01EJ3_A129BarCod, T01EJ3_A132BarCodReo, T01EJ3_A130BarCodPar, T01EJ3_A2813MetPieCod, T01EJ3_A2814MetPieKil, T01EJ3_A2815MetPieMet, T01EJ3_A10784MetPieId, T01EJ3_A10780MetPiectr, T01EJ3_A10779MetPieOb,
            T01EJ3_A6635MetPieAnc, T01EJ3_A5136MetPieFch, T01EJ3_A4909MetPieDef, T01EJ3_A2846MetPieDsc, T01EJ3_A2816MetPieEst, T01EJ3_A4910MetPieMtD, T01EJ3_A396EmprCod
            }
            , new Object[] {
            T01EJ4_A2809MetTerCod, T01EJ4_A396EmprCod, T01EJ4_A129BarCod, T01EJ4_A132BarCodReo, T01EJ4_A130BarCodPar
            }
            , new Object[] {
            T01EJ5_A2809MetTerCod, T01EJ5_A396EmprCod, T01EJ5_A129BarCod, T01EJ5_A132BarCodReo, T01EJ5_A130BarCodPar
            }
            , new Object[] {
            T01EJ6_A407EmprNom, T01EJ6_n407EmprNom
            }
            , new Object[] {
            T01EJ7_A396EmprCod
            }
            , new Object[] {
            T01EJ9_A2812MetTotPie, T01EJ9_A2811MetTotMet, T01EJ9_A2810MetTotKil
            }
            , new Object[] {
            T01EJ11_A2809MetTerCod, T01EJ11_A407EmprNom, T01EJ11_n407EmprNom, T01EJ11_A396EmprCod, T01EJ11_A129BarCod, T01EJ11_A132BarCodReo, T01EJ11_A130BarCodPar, T01EJ11_A2812MetTotPie, T01EJ11_A2811MetTotMet, T01EJ11_A2810MetTotKil
            }
            , new Object[] {
            T01EJ12_A396EmprCod
            }
            , new Object[] {
            T01EJ14_A2812MetTotPie, T01EJ14_A2811MetTotMet, T01EJ14_A2810MetTotKil
            }
            , new Object[] {
            T01EJ15_A396EmprCod, T01EJ15_A2809MetTerCod, T01EJ15_A129BarCod, T01EJ15_A132BarCodReo, T01EJ15_A130BarCodPar
            }
            , new Object[] {
            T01EJ16_A396EmprCod, T01EJ16_A2809MetTerCod, T01EJ16_A129BarCod, T01EJ16_A132BarCodReo, T01EJ16_A130BarCodPar
            }
            , new Object[] {
            T01EJ17_A396EmprCod, T01EJ17_A2809MetTerCod, T01EJ17_A129BarCod, T01EJ17_A132BarCodReo, T01EJ17_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EJ21_A2812MetTotPie, T01EJ21_A2811MetTotMet, T01EJ21_A2810MetTotKil
            }
            , new Object[] {
            T01EJ22_A396EmprCod, T01EJ22_A2809MetTerCod, T01EJ22_A129BarCod, T01EJ22_A132BarCodReo, T01EJ22_A130BarCodPar, T01EJ22_A2813MetPieCod, T01EJ22_A12995MetPieDfLi
            }
            , new Object[] {
            T01EJ23_A396EmprCod, T01EJ23_A2809MetTerCod, T01EJ23_A129BarCod, T01EJ23_A132BarCodReo, T01EJ23_A130BarCodPar
            }
            , new Object[] {
            T01EJ24_A2809MetTerCod, T01EJ24_A129BarCod, T01EJ24_A132BarCodReo, T01EJ24_A130BarCodPar, T01EJ24_A2813MetPieCod, T01EJ24_A2814MetPieKil, T01EJ24_A2815MetPieMet, T01EJ24_A10784MetPieId, T01EJ24_A10780MetPiectr, T01EJ24_A10779MetPieOb,
            T01EJ24_A6635MetPieAnc, T01EJ24_A5136MetPieFch, T01EJ24_A4909MetPieDef, T01EJ24_A2846MetPieDsc, T01EJ24_A2816MetPieEst, T01EJ24_A4910MetPieMtD, T01EJ24_A396EmprCod
            }
            , new Object[] {
            T01EJ25_A396EmprCod, T01EJ25_A2809MetTerCod, T01EJ25_A129BarCod, T01EJ25_A132BarCodReo, T01EJ25_A130BarCodPar, T01EJ25_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EJ29_A396EmprCod, T01EJ29_A2809MetTerCod, T01EJ29_A129BarCod, T01EJ29_A132BarCodReo, T01EJ29_A130BarCodPar, T01EJ29_A2813MetPieCod, T01EJ29_A12995MetPieDfLi
            }
            , new Object[] {
            T01EJ30_A396EmprCod, T01EJ30_A2809MetTerCod, T01EJ30_A129BarCod, T01EJ30_A132BarCodReo, T01EJ30_A130BarCodPar, T01EJ30_A2813MetPieCod
            }
            , new Object[] {
            T01EJ31_A396EmprCod
            }
         }
      );
      AV47Pgmname = "TMETPI" ;
   }

   private byte wcpOAV40BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z2816MetPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV40BarCodReo ;
   private byte nKeyPressed ;
   private byte A2816MetPieEst ;
   private byte GXv_int7[] ;
   private byte Gx_BScreen ;
   private byte subGridlevel_rollos_Backcolorstyle ;
   private byte subGridlevel_rollos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_rollos_Allowselection ;
   private byte subGridlevel_rollos_Allowhovering ;
   private byte subGridlevel_rollos_Allowcollapsing ;
   private byte subGridlevel_rollos_Collapsed ;
   private short O2812MetTotPie ;
   private short Z6635MetPieAnc ;
   private short Z4909MetPieDef ;
   private short nRcdDeleted_413 ;
   private short nRcdExists_413 ;
   private short nIsMod_413 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2812MetTotPie ;
   private short nBlankRcdCount413 ;
   private short RcdFound413 ;
   private short B2812MetTotPie ;
   private short nBlankRcdUsr413 ;
   private short A4909MetPieDef ;
   private short RcdFound412 ;
   private short s2812MetTotPie ;
   private short A6635MetPieAnc ;
   private short Z2812MetTotPie ;
   private short nIsDirty_412 ;
   private short nIsDirty_413 ;
   private int wcpOAV39BarCod ;
   private int wcpOAV33Pzs ;
   private int Z129BarCod ;
   private int nRC_GXsfl_79 ;
   private int nGXsfl_79_idx=1 ;
   private int A129BarCod ;
   private int AV39BarCod ;
   private int AV33Pzs ;
   private int trnEnded ;
   private int edtavAlbprocod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtavPzs_Enabled ;
   private int edtavKgs_Enabled ;
   private int edtavMts_Enabled ;
   private int edtavMetpiectr_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtnetiqueta_Visible ;
   private int bttBtnimprimirtodas_Visible ;
   private int edtMetTotPie_Enabled ;
   private int edtMetTotKil_Enabled ;
   private int edtMetTotMet_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieAnc_Enabled ;
   private int edtMetPieMtD_Enabled ;
   private int edtMetPiectr_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int subGridlevel_rollos_Backcolor ;
   private int subGridlevel_rollos_Allbackcolor ;
   private int defedtMetPieCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_rollos_Selectedindex ;
   private int subGridlevel_rollos_Selectioncolor ;
   private int subGridlevel_rollos_Hoveringcolor ;
   private long wcpOAV32AlbProcod ;
   private long AV32AlbProcod ;
   private long GRIDLEVEL_ROLLOS_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV34Kgs ;
   private java.math.BigDecimal wcpOAV35Mts ;
   private java.math.BigDecimal O2811MetTotMet ;
   private java.math.BigDecimal O2810MetTotKil ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal Z4910MetPieMtD ;
   private java.math.BigDecimal O2815MetPieMet ;
   private java.math.BigDecimal O2814MetPieKil ;
   private java.math.BigDecimal AV34Kgs ;
   private java.math.BigDecimal AV35Mts ;
   private java.math.BigDecimal A2810MetTotKil ;
   private java.math.BigDecimal A2811MetTotMet ;
   private java.math.BigDecimal B2811MetTotMet ;
   private java.math.BigDecimal B2810MetTotKil ;
   private java.math.BigDecimal s2811MetTotMet ;
   private java.math.BigDecimal s2810MetTotKil ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal T2815MetPieMet ;
   private java.math.BigDecimal T2814MetPieKil ;
   private java.math.BigDecimal Z2811MetTotMet ;
   private java.math.BigDecimal Z2810MetTotKil ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV37EmprCod ;
   private String wcpOAV38MetTerCod ;
   private String wcpOAV41BarCodPar ;
   private String wcpOAV36MetPiectr ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z10784MetPieId ;
   private String Z10780MetPiectr ;
   private String Z10779MetPieOb ;
   private String Z2846MetPieDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String Gx_mode ;
   private String AV37EmprCod ;
   private String AV38MetTerCod ;
   private String AV41BarCodPar ;
   private String AV36MetPiectr ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_79_idx="0001" ;
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
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtavPzs_Internalname ;
   private String edtavPzs_Jsonclick ;
   private String edtavKgs_Internalname ;
   private String edtavKgs_Jsonclick ;
   private String edtavMts_Internalname ;
   private String edtavMts_Jsonclick ;
   private String edtavMetpiectr_Internalname ;
   private String edtavMetpiectr_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String bttBtnetiqueta_Internalname ;
   private String bttBtnetiqueta_Jsonclick ;
   private String bttBtnimprimirtodas_Internalname ;
   private String bttBtnimprimirtodas_Jsonclick ;
   private String divTableleaflevel_rollos_Internalname ;
   private String divLineatotal_Internalname ;
   private String divUnnamedtablemettotpie_Internalname ;
   private String lblTextblockmettotpie_Internalname ;
   private String lblTextblockmettotpie_Jsonclick ;
   private String edtMetTotPie_Internalname ;
   private String edtMetTotPie_Jsonclick ;
   private String divUnnamedtablemettotkil_Internalname ;
   private String lblTextblockmettotkil_Internalname ;
   private String lblTextblockmettotkil_Jsonclick ;
   private String edtMetTotKil_Internalname ;
   private String edtMetTotKil_Jsonclick ;
   private String divUnnamedtablemettotmet_Internalname ;
   private String lblTextblockmettotmet_Internalname ;
   private String lblTextblockmettotmet_Jsonclick ;
   private String edtMetTotMet_Internalname ;
   private String edtMetTotMet_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV47Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode413 ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPiectr_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_rollos_Internalname ;
   private String A407EmprNom ;
   private String A10784MetPieId ;
   private String A10779MetPieOb ;
   private String A2846MetPieDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode412 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A2813MetPieCod ;
   private String A10780MetPiectr ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String subGridlevel_rollos_Class ;
   private String subGridlevel_rollos_Linesclass ;
   private String ROClassString ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPiectr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_rollos_Header ;
   private java.util.Date Z5136MetPieFch ;
   private java.util.Date A5136MetPieFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV46Mensaje ;
   private String AV46Mensaje ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_rollosContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_rollosRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_rollosColumn ;
   private com.genexus.webpanels.WebSession AV44WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01EJ6_A407EmprNom ;
   private boolean[] T01EJ6_n407EmprNom ;
   private short[] T01EJ9_A2812MetTotPie ;
   private java.math.BigDecimal[] T01EJ9_A2811MetTotMet ;
   private java.math.BigDecimal[] T01EJ9_A2810MetTotKil ;
   private String[] T01EJ11_A2809MetTerCod ;
   private String[] T01EJ11_A407EmprNom ;
   private boolean[] T01EJ11_n407EmprNom ;
   private String[] T01EJ11_A396EmprCod ;
   private int[] T01EJ11_A129BarCod ;
   private byte[] T01EJ11_A132BarCodReo ;
   private String[] T01EJ11_A130BarCodPar ;
   private short[] T01EJ11_A2812MetTotPie ;
   private java.math.BigDecimal[] T01EJ11_A2811MetTotMet ;
   private java.math.BigDecimal[] T01EJ11_A2810MetTotKil ;
   private String[] T01EJ7_A396EmprCod ;
   private String[] T01EJ12_A396EmprCod ;
   private short[] T01EJ14_A2812MetTotPie ;
   private java.math.BigDecimal[] T01EJ14_A2811MetTotMet ;
   private java.math.BigDecimal[] T01EJ14_A2810MetTotKil ;
   private String[] T01EJ15_A396EmprCod ;
   private String[] T01EJ15_A2809MetTerCod ;
   private int[] T01EJ15_A129BarCod ;
   private byte[] T01EJ15_A132BarCodReo ;
   private String[] T01EJ15_A130BarCodPar ;
   private String[] T01EJ5_A2809MetTerCod ;
   private String[] T01EJ5_A396EmprCod ;
   private int[] T01EJ5_A129BarCod ;
   private byte[] T01EJ5_A132BarCodReo ;
   private String[] T01EJ5_A130BarCodPar ;
   private String[] T01EJ16_A396EmprCod ;
   private String[] T01EJ16_A2809MetTerCod ;
   private int[] T01EJ16_A129BarCod ;
   private byte[] T01EJ16_A132BarCodReo ;
   private String[] T01EJ16_A130BarCodPar ;
   private String[] T01EJ17_A396EmprCod ;
   private String[] T01EJ17_A2809MetTerCod ;
   private int[] T01EJ17_A129BarCod ;
   private byte[] T01EJ17_A132BarCodReo ;
   private String[] T01EJ17_A130BarCodPar ;
   private String[] T01EJ4_A2809MetTerCod ;
   private String[] T01EJ4_A396EmprCod ;
   private int[] T01EJ4_A129BarCod ;
   private byte[] T01EJ4_A132BarCodReo ;
   private String[] T01EJ4_A130BarCodPar ;
   private short[] T01EJ21_A2812MetTotPie ;
   private java.math.BigDecimal[] T01EJ21_A2811MetTotMet ;
   private java.math.BigDecimal[] T01EJ21_A2810MetTotKil ;
   private String[] T01EJ22_A396EmprCod ;
   private String[] T01EJ22_A2809MetTerCod ;
   private int[] T01EJ22_A129BarCod ;
   private byte[] T01EJ22_A132BarCodReo ;
   private String[] T01EJ22_A130BarCodPar ;
   private String[] T01EJ22_A2813MetPieCod ;
   private short[] T01EJ22_A12995MetPieDfLi ;
   private String[] T01EJ23_A396EmprCod ;
   private String[] T01EJ23_A2809MetTerCod ;
   private int[] T01EJ23_A129BarCod ;
   private byte[] T01EJ23_A132BarCodReo ;
   private String[] T01EJ23_A130BarCodPar ;
   private String[] T01EJ24_A2809MetTerCod ;
   private int[] T01EJ24_A129BarCod ;
   private byte[] T01EJ24_A132BarCodReo ;
   private String[] T01EJ24_A130BarCodPar ;
   private String[] T01EJ24_A2813MetPieCod ;
   private java.math.BigDecimal[] T01EJ24_A2814MetPieKil ;
   private java.math.BigDecimal[] T01EJ24_A2815MetPieMet ;
   private String[] T01EJ24_A10784MetPieId ;
   private String[] T01EJ24_A10780MetPiectr ;
   private String[] T01EJ24_A10779MetPieOb ;
   private short[] T01EJ24_A6635MetPieAnc ;
   private java.util.Date[] T01EJ24_A5136MetPieFch ;
   private short[] T01EJ24_A4909MetPieDef ;
   private String[] T01EJ24_A2846MetPieDsc ;
   private byte[] T01EJ24_A2816MetPieEst ;
   private java.math.BigDecimal[] T01EJ24_A4910MetPieMtD ;
   private String[] T01EJ24_A396EmprCod ;
   private String[] T01EJ25_A396EmprCod ;
   private String[] T01EJ25_A2809MetTerCod ;
   private int[] T01EJ25_A129BarCod ;
   private byte[] T01EJ25_A132BarCodReo ;
   private String[] T01EJ25_A130BarCodPar ;
   private String[] T01EJ25_A2813MetPieCod ;
   private String[] T01EJ3_A2809MetTerCod ;
   private int[] T01EJ3_A129BarCod ;
   private byte[] T01EJ3_A132BarCodReo ;
   private String[] T01EJ3_A130BarCodPar ;
   private String[] T01EJ3_A2813MetPieCod ;
   private java.math.BigDecimal[] T01EJ3_A2814MetPieKil ;
   private java.math.BigDecimal[] T01EJ3_A2815MetPieMet ;
   private String[] T01EJ3_A10784MetPieId ;
   private String[] T01EJ3_A10780MetPiectr ;
   private String[] T01EJ3_A10779MetPieOb ;
   private short[] T01EJ3_A6635MetPieAnc ;
   private java.util.Date[] T01EJ3_A5136MetPieFch ;
   private short[] T01EJ3_A4909MetPieDef ;
   private String[] T01EJ3_A2846MetPieDsc ;
   private byte[] T01EJ3_A2816MetPieEst ;
   private java.math.BigDecimal[] T01EJ3_A4910MetPieMtD ;
   private String[] T01EJ3_A396EmprCod ;
   private String[] T01EJ2_A2809MetTerCod ;
   private int[] T01EJ2_A129BarCod ;
   private byte[] T01EJ2_A132BarCodReo ;
   private String[] T01EJ2_A130BarCodPar ;
   private String[] T01EJ2_A2813MetPieCod ;
   private java.math.BigDecimal[] T01EJ2_A2814MetPieKil ;
   private java.math.BigDecimal[] T01EJ2_A2815MetPieMet ;
   private String[] T01EJ2_A10784MetPieId ;
   private String[] T01EJ2_A10780MetPiectr ;
   private String[] T01EJ2_A10779MetPieOb ;
   private short[] T01EJ2_A6635MetPieAnc ;
   private java.util.Date[] T01EJ2_A5136MetPieFch ;
   private short[] T01EJ2_A4909MetPieDef ;
   private String[] T01EJ2_A2846MetPieDsc ;
   private byte[] T01EJ2_A2816MetPieEst ;
   private java.math.BigDecimal[] T01EJ2_A4910MetPieMtD ;
   private String[] T01EJ2_A396EmprCod ;
   private String[] T01EJ29_A396EmprCod ;
   private String[] T01EJ29_A2809MetTerCod ;
   private int[] T01EJ29_A129BarCod ;
   private byte[] T01EJ29_A132BarCodReo ;
   private String[] T01EJ29_A130BarCodPar ;
   private String[] T01EJ29_A2813MetPieCod ;
   private short[] T01EJ29_A12995MetPieDfLi ;
   private String[] T01EJ30_A396EmprCod ;
   private String[] T01EJ30_A2809MetTerCod ;
   private int[] T01EJ30_A129BarCod ;
   private byte[] T01EJ30_A132BarCodReo ;
   private String[] T01EJ30_A130BarCodPar ;
   private String[] T01EJ30_A2813MetPieCod ;
   private String[] T01EJ31_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV42WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV43TrnContext ;
}

final  class tmetpi__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EJ2", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ3", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ4", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF MetTerCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ5", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ9", "SELECT COALESCE( T1.MetTotPie, 0) AS MetTotPie, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil FROM (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ11", "SELECT /*+ FIRST_ROWS(100) */ TM1.MetTerCod, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, COALESCE( T3.MetTotPie, 0) AS MetTotPie, COALESCE( T3.MetTotMet, 0) AS MetTotMet, COALESCE( T3.MetTotKil, 0) AS MetTotKil FROM ((TXPCMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.MetTerCod = TM1.MetTerCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ12", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ14", "SELECT COALESCE( T1.MetTotPie, 0) AS MetTotPie, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil FROM (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE ( EmprCod > ? or EmprCod = ? and MetTerCod > ? or MetTerCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EJ17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE ( EmprCod < ? or EmprCod = ? and MetTerCod < ? or MetTerCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EJ18", "INSERT INTO TXPCMETPI(MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCMETPI")
         ,new UpdateCursor("T01EJ19", "DELETE FROM TXPCMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPCMETPI")
         ,new ForEachCursor("T01EJ21", "SELECT COALESCE( T1.MetTotPie, 0) AS MetTotPie, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil FROM (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ22", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EJ23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ24", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ25", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EJ26", "INSERT INTO TXPLMETPI(MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01EJ27", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieId=?, MetPiectr=?, MetPieOb=?, MetPieAnc=?, MetPieFch=?, MetPieDef=?, MetPieDsc=?, MetPieEst=?, MetPieMtD=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01EJ28", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01EJ29", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EJ30", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EJ31", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 60);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 60);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 60);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 9);
               stmt.setString(9, (String)parms[8], 40);
               stmt.setString(10, (String)parms[9], 60);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 20);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(17, (String)parms[16], 3);
               return;
            case 21 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

