package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaranguiatextolibre_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"ALBHDRLIN") == 0 )
      {
         AV17AlbHdrLin = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17AlbHdrLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBHDRLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17AlbHdrLin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx13asaalbhdrlin1T3402( AV17AlbHdrLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"ALBHDRLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         gx14asaalbhdrlin1T3402( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
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
         gxload_20( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         gxload_22( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV13AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13AlbProCod), "ZZZZZZZZZ9")));
            AV14BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14BarCod), "ZZZZZZZ9")));
            AV15BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodReo", GXutil.str( AV15BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarCodReo), "9")));
            AV16BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16BarCodPar", AV16BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarCodPar, ""))));
            AV17AlbHdrLin = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17AlbHdrLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBHDRLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17AlbHdrLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guia / Texto libre", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbHdrTxt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public albaranguiatextolibre_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaranguiatextolibre_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiatextolibre_impl.class ));
   }

   public albaranguiatextolibre_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbEnvFtp = new HTMLChoice();
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
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tablealbaran.setProperty("Width", Dvpanel_tablealbaran_Width);
      ucDvpanel_tablealbaran.setProperty("AutoWidth", Dvpanel_tablealbaran_Autowidth);
      ucDvpanel_tablealbaran.setProperty("AutoHeight", Dvpanel_tablealbaran_Autoheight);
      ucDvpanel_tablealbaran.setProperty("Cls", Dvpanel_tablealbaran_Cls);
      ucDvpanel_tablealbaran.setProperty("Title", Dvpanel_tablealbaran_Title);
      ucDvpanel_tablealbaran.setProperty("Collapsible", Dvpanel_tablealbaran_Collapsible);
      ucDvpanel_tablealbaran.setProperty("Collapsed", Dvpanel_tablealbaran_Collapsed);
      ucDvpanel_tablealbaran.setProperty("ShowCollapseIcon", Dvpanel_tablealbaran_Showcollapseicon);
      ucDvpanel_tablealbaran.setProperty("IconPosition", Dvpanel_tablealbaran_Iconposition);
      ucDvpanel_tablealbaran.setProperty("AutoScroll", Dvpanel_tablealbaran_Autoscroll);
      ucDvpanel_tablealbaran.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablealbaran_Internalname, "DVPANEL_TABLEALBARANContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEALBARANContainer"+"TableAlbaran"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Guia</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8 col-sm-1 CellMarginTop20", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbos_Internalname, httpContext.getMessage( "<b>O. Servicio</b>", ""), "", "", lblTbos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrTxt_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrTxt_Internalname, GXutil.rtrim( A2765AlbHdrTxt), GXutil.rtrim( localUtil.format( A2765AlbHdrTxt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrTxt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrTxt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrRD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrRD_Internalname, httpContext.getMessage( "Rec o Dto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrRD_Internalname, GXutil.ltrim( localUtil.ntoc( A2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrRD_Enabled!=0) ? localUtil.format( A2766AlbHdrRD, "ZZ9.99") : localUtil.format( A2766AlbHdrRD, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrRD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrRD_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrPKg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrPKg_Internalname, httpContext.getMessage( "Preço Kg", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrPKg_Enabled!=0) ? localUtil.format( A2767AlbHdrPKg, "ZZZZZZ9.999") : localUtil.format( A2767AlbHdrPKg, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrPKg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrPKg_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrKgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrKgs_Internalname, httpContext.getMessage( "Quilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrKgs_Enabled!=0) ? localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99") : localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrKgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrPMt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrPMt_Internalname, httpContext.getMessage( "Preço M", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrPMt_Enabled!=0) ? localUtil.format( A2769AlbHdrPMt, "ZZZZZZ9.999") : localUtil.format( A2769AlbHdrPMt, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrPMt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrPMt_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtALbHdrMts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtALbHdrMts_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtALbHdrMts_Internalname, GXutil.ltrim( localUtil.ntoc( A2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtALbHdrMts_Enabled!=0) ? localUtil.format( A2770ALbHdrMts, "ZZZZZ9.99") : localUtil.format( A2770ALbHdrMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtALbHdrMts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtALbHdrMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtALbHdrImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtALbHdrImp_Internalname, httpContext.getMessage( "Importe", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtALbHdrImp_Internalname, GXutil.ltrim( localUtil.ntoc( A2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtALbHdrImp_Enabled!=0) ? localUtil.format( A2771ALbHdrImp, "ZZZZZZ9.99") : localUtil.format( A2771ALbHdrImp, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtALbHdrImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtALbHdrImp_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrTip_Internalname, httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrTip_Internalname, GXutil.rtrim( A2772AlbHdrTip), GXutil.rtrim( localUtil.format( A2772AlbHdrTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-9", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2764AlbHdrLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2764AlbHdrLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrLin_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbHdrLin_Visible, edtAlbHdrLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaTextoLibre.htm");
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
      e111T32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z2764AlbHdrLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2764AlbHdrLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2771ALbHdrImp = localUtil.ctond( httpContext.cgiGet( "Z2771ALbHdrImp")) ;
            Z2765AlbHdrTxt = httpContext.cgiGet( "Z2765AlbHdrTxt") ;
            Z2766AlbHdrRD = localUtil.ctond( httpContext.cgiGet( "Z2766AlbHdrRD")) ;
            Z2767AlbHdrPKg = localUtil.ctond( httpContext.cgiGet( "Z2767AlbHdrPKg")) ;
            Z2768AlbHdrKgs = localUtil.ctond( httpContext.cgiGet( "Z2768AlbHdrKgs")) ;
            Z2769AlbHdrPMt = localUtil.ctond( httpContext.cgiGet( "Z2769AlbHdrPMt")) ;
            Z2770ALbHdrMts = localUtil.ctond( httpContext.cgiGet( "Z2770ALbHdrMts")) ;
            Z2772AlbHdrTip = httpContext.cgiGet( "Z2772AlbHdrTip") ;
            Z3614AlbTxtCod = httpContext.cgiGet( "Z3614AlbTxtCod") ;
            Z2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            Z2026BarAlbPbr = localUtil.ctond( httpContext.cgiGet( "Z2026BarAlbPbr")) ;
            Z1462BarAlbTar = localUtil.ctond( httpContext.cgiGet( "Z1462BarAlbTar")) ;
            A3614AlbTxtCod = httpContext.cgiGet( "Z3614AlbTxtCod") ;
            A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            A2026BarAlbPbr = localUtil.ctond( httpContext.cgiGet( "Z2026BarAlbPbr")) ;
            n2026BarAlbPbr = false ;
            A1462BarAlbTar = localUtil.ctond( httpContext.cgiGet( "Z1462BarAlbTar")) ;
            n1462BarAlbTar = false ;
            O2769AlbHdrPMt = localUtil.ctond( httpContext.cgiGet( "O2769AlbHdrPMt")) ;
            O2770ALbHdrMts = localUtil.ctond( httpContext.cgiGet( "O2770ALbHdrMts")) ;
            O2767AlbHdrPKg = localUtil.ctond( httpContext.cgiGet( "O2767AlbHdrPKg")) ;
            O2768AlbHdrKgs = localUtil.ctond( httpContext.cgiGet( "O2768AlbHdrKgs")) ;
            O2771ALbHdrImp = localUtil.ctond( httpContext.cgiGet( "O2771ALbHdrImp")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A2026BarAlbPbr = localUtil.ctond( httpContext.cgiGet( "BARALBPBR")) ;
            A1462BarAlbTar = localUtil.ctond( httpContext.cgiGet( "BARALBTAR")) ;
            A2027BarAlbPne = localUtil.ctond( httpContext.cgiGet( "BARALBPNE")) ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV14BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV17AlbHdrLin = (short)(localUtil.ctol( httpContext.cgiGet( "vALBHDRLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "ALBHDRULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3614AlbTxtCod = httpContext.cgiGet( "ALBTXTCOD") ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A120BarAgrEst = httpContext.cgiGet( "BARAGREST") ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            A7101AlbLic = httpContext.cgiGet( "ALBLIC") ;
            A2242AlbSec = httpContext.cgiGet( "ALBSEC") ;
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "GUIFASULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "BARALBKGME")) ;
            A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "BARALBMTRE")) ;
            Dvpanel_tablealbaran_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Objectcall") ;
            Dvpanel_tablealbaran_Class = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Class") ;
            Dvpanel_tablealbaran_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Enabled")) ;
            Dvpanel_tablealbaran_Width = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Width") ;
            Dvpanel_tablealbaran_Height = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Height") ;
            Dvpanel_tablealbaran_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autowidth")) ;
            Dvpanel_tablealbaran_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autoheight")) ;
            Dvpanel_tablealbaran_Cls = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Cls") ;
            Dvpanel_tablealbaran_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Showheader")) ;
            Dvpanel_tablealbaran_Title = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Title") ;
            Dvpanel_tablealbaran_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Collapsible")) ;
            Dvpanel_tablealbaran_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Collapsed")) ;
            Dvpanel_tablealbaran_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Showcollapseicon")) ;
            Dvpanel_tablealbaran_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Iconposition") ;
            Dvpanel_tablealbaran_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autoscroll")) ;
            Dvpanel_tablealbaran_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Visible")) ;
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
            /* Read variables values. */
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2765AlbHdrTxt = httpContext.cgiGet( edtAlbHdrTxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2765AlbHdrTxt", A2765AlbHdrTxt);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrRD_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrRD_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRRD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdrRD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2766AlbHdrRD = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2766AlbHdrRD", GXutil.ltrimstr( A2766AlbHdrRD, 6, 2));
            }
            else
            {
               A2766AlbHdrRD = localUtil.ctond( httpContext.cgiGet( edtAlbHdrRD_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2766AlbHdrRD", GXutil.ltrimstr( A2766AlbHdrRD, 6, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPKg_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRPKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdrPKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2767AlbHdrPKg = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
            }
            else
            {
               A2767AlbHdrPKg = localUtil.ctond( httpContext.cgiGet( edtAlbHdrPKg_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrKgs_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdrKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2768AlbHdrKgs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
            }
            else
            {
               A2768AlbHdrKgs = localUtil.ctond( httpContext.cgiGet( edtAlbHdrKgs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPMt_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdrPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRPMT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdrPMt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2769AlbHdrPMt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
            }
            else
            {
               A2769AlbHdrPMt = localUtil.ctond( httpContext.cgiGet( edtAlbHdrPMt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrMts_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRMTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtALbHdrMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2770ALbHdrMts = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
            }
            else
            {
               A2770ALbHdrMts = localUtil.ctond( httpContext.cgiGet( edtALbHdrMts_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrImp_Internalname)), DecimalUtil.stringToDec("-999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtALbHdrImp_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRIMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtALbHdrImp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2771ALbHdrImp = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
            }
            else
            {
               A2771ALbHdrImp = localUtil.ctond( httpContext.cgiGet( edtALbHdrImp_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
            }
            A2772AlbHdrTip = httpContext.cgiGet( edtAlbHdrTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2772AlbHdrTip", A2772AlbHdrTip);
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            A2764AlbHdrLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"AlbaranGuiaTextoLibre");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("AlbTxtCod", GXutil.rtrim( localUtil.format( A3614AlbTxtCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2764AlbHdrLin != Z2764AlbHdrLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("albaranes\\albaranguiatextolibre:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2764AlbHdrLin = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
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
                  sMode402 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode402 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound402 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1T30( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                        e111T32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121T32 ();
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
         e121T32 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T3402( ) ;
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
         disableAttributes1T3402( ) ;
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

   public void confirm_1T30( )
   {
      beforeValidate1T3402( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T3402( ) ;
         }
         else
         {
            checkExtendedTable1T3402( ) ;
            closeExtendedTableCursors1T3402( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T30( )
   {
   }

   public void e111T32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaranguiatextolibre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaranguiatextolibre_impl.this.AV10EmprCod = GXv_char2[0] ;
      albaranguiatextolibre_impl.this.AV11EmprNom = GXv_char3[0] ;
      albaranguiatextolibre_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
      GXv_SdtWWPContext5[0] = AV18WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV18WWPContext = GXv_SdtWWPContext5[0] ;
      AV19TrnContext.fromxml(AV20WebSession.getValue("TrnContext"), null, null);
      edtAlbHdrLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
   }

   public void e121T32( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1T3402( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2771ALbHdrImp = T01T33_A2771ALbHdrImp[0] ;
            Z2765AlbHdrTxt = T01T33_A2765AlbHdrTxt[0] ;
            Z2766AlbHdrRD = T01T33_A2766AlbHdrRD[0] ;
            Z2767AlbHdrPKg = T01T33_A2767AlbHdrPKg[0] ;
            Z2768AlbHdrKgs = T01T33_A2768AlbHdrKgs[0] ;
            Z2769AlbHdrPMt = T01T33_A2769AlbHdrPMt[0] ;
            Z2770ALbHdrMts = T01T33_A2770ALbHdrMts[0] ;
            Z2772AlbHdrTip = T01T33_A2772AlbHdrTip[0] ;
            Z3614AlbTxtCod = T01T33_A3614AlbTxtCod[0] ;
         }
         else
         {
            Z2771ALbHdrImp = A2771ALbHdrImp ;
            Z2765AlbHdrTxt = A2765AlbHdrTxt ;
            Z2766AlbHdrRD = A2766AlbHdrRD ;
            Z2767AlbHdrPKg = A2767AlbHdrPKg ;
            Z2768AlbHdrKgs = A2768AlbHdrKgs ;
            Z2769AlbHdrPMt = A2769AlbHdrPMt ;
            Z2770ALbHdrMts = A2770ALbHdrMts ;
            Z2772AlbHdrTip = A2772AlbHdrTip ;
            Z3614AlbTxtCod = A3614AlbTxtCod ;
         }
      }
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         Z2763AlbHdrUlin = T01T38_A2763AlbHdrUlin[0] ;
         Z1248GuiFasULin = T01T38_A1248GuiFasULin[0] ;
         Z1261BarAlbKgmE = T01T38_A1261BarAlbKgmE[0] ;
         Z1263BarAlbMtrE = T01T38_A1263BarAlbMtrE[0] ;
         Z2026BarAlbPbr = T01T38_A2026BarAlbPbr[0] ;
         Z1462BarAlbTar = T01T38_A1462BarAlbTar[0] ;
      }
      if ( GX_JID == -18 )
      {
         Z2764AlbHdrLin = A2764AlbHdrLin ;
         Z2771ALbHdrImp = A2771ALbHdrImp ;
         Z2765AlbHdrTxt = A2765AlbHdrTxt ;
         Z2766AlbHdrRD = A2766AlbHdrRD ;
         Z2767AlbHdrPKg = A2767AlbHdrPKg ;
         Z2768AlbHdrKgs = A2768AlbHdrKgs ;
         Z2769AlbHdrPMt = A2769AlbHdrPMt ;
         Z2770ALbHdrMts = A2770ALbHdrMts ;
         Z2772AlbHdrTip = A2772AlbHdrTip ;
         Z3614AlbTxtCod = A3614AlbTxtCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z34AlbProfch = A34AlbProfch ;
         Z2242AlbSec = A2242AlbSec ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z252CliCod = A252CliCod ;
         Z2763AlbHdrUlin = A2763AlbHdrUlin ;
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z2026BarAlbPbr = A2026BarAlbPbr ;
         Z1462BarAlbTar = A1462BarAlbTar ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbHdrLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      AV21Pgmname = "Albaranes.AlbaranGuiaTextoLibre" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      edtAlbHdrLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13AlbProCod) )
      {
         A30AlbProCod = AV13AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV14BarCod) )
      {
         A129BarCod = AV14BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV15BarCodReo) )
      {
         A132BarCodReo = AV15BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV16BarCodPar)==0) )
      {
         A130BarCodPar = AV16BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (0==AV17AlbHdrLin) )
      {
         A2764AlbHdrLin = AV17AlbHdrLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
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
         /* Using cursor T01T34 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A3915EmpNumDec = T01T34_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01T34_n3915EmpNumDec[0] ;
         pr_default.close(2);
         /* Using cursor T01T36 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1253EmprGuiRem = T01T36_A1253EmprGuiRem[0] ;
         A5805AlbEnvFtp = T01T36_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T36_A7101AlbLic[0] ;
         A34AlbProfch = T01T36_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T36_A2242AlbSec[0] ;
         A1243GuiRemCli = T01T36_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(4);
         /* Using cursor T01T39 */
         pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01T39_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(7);
         /* Using cursor T01T35 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A120BarAgrEst = T01T35_A120BarAgrEst[0] ;
         A252CliCod = T01T35_A252CliCod[0] ;
         n252CliCod = T01T35_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(3);
         /* Using cursor T01T38 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         zm1T3402( 22) ;
         A2763AlbHdrUlin = T01T38_A2763AlbHdrUlin[0] ;
         A1248GuiFasULin = T01T38_A1248GuiFasULin[0] ;
         A1261BarAlbKgmE = T01T38_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01T38_A1263BarAlbMtrE[0] ;
         A2026BarAlbPbr = T01T38_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = T01T38_n2026BarAlbPbr[0] ;
         A1462BarAlbTar = T01T38_A1462BarAlbTar[0] ;
         n1462BarAlbTar = T01T38_n1462BarAlbTar[0] ;
         pr_default.close(6);
         A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      }
   }

   public void load1T3402( )
   {
      /* Using cursor T01T310 */
      pr_default.execute(8, new Object[] {Short.valueOf(A2764AlbHdrLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound402 = (short)(1) ;
         A1253EmprGuiRem = T01T310_A1253EmprGuiRem[0] ;
         A2763AlbHdrUlin = T01T310_A2763AlbHdrUlin[0] ;
         A2771ALbHdrImp = T01T310_A2771ALbHdrImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
         A5805AlbEnvFtp = T01T310_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T310_A7101AlbLic[0] ;
         A1244GuiRemCln = T01T310_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A34AlbProfch = T01T310_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T310_A2242AlbSec[0] ;
         A1248GuiFasULin = T01T310_A1248GuiFasULin[0] ;
         A1261BarAlbKgmE = T01T310_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01T310_A1263BarAlbMtrE[0] ;
         A120BarAgrEst = T01T310_A120BarAgrEst[0] ;
         A3915EmpNumDec = T01T310_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01T310_n3915EmpNumDec[0] ;
         A2765AlbHdrTxt = T01T310_A2765AlbHdrTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2765AlbHdrTxt", A2765AlbHdrTxt);
         A2766AlbHdrRD = T01T310_A2766AlbHdrRD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2766AlbHdrRD", GXutil.ltrimstr( A2766AlbHdrRD, 6, 2));
         A2767AlbHdrPKg = T01T310_A2767AlbHdrPKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
         A2768AlbHdrKgs = T01T310_A2768AlbHdrKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
         A2769AlbHdrPMt = T01T310_A2769AlbHdrPMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
         A2770ALbHdrMts = T01T310_A2770ALbHdrMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
         A2772AlbHdrTip = T01T310_A2772AlbHdrTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2772AlbHdrTip", A2772AlbHdrTip);
         A3614AlbTxtCod = T01T310_A3614AlbTxtCod[0] ;
         A2026BarAlbPbr = T01T310_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = T01T310_n2026BarAlbPbr[0] ;
         A1462BarAlbTar = T01T310_A1462BarAlbTar[0] ;
         n1462BarAlbTar = T01T310_n1462BarAlbTar[0] ;
         A1243GuiRemCli = T01T310_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A252CliCod = T01T310_A252CliCod[0] ;
         n252CliCod = T01T310_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1T3402( -18) ;
      }
      pr_default.close(8);
      onLoadActions1T3402( ) ;
   }

   public void onLoadActions1T3402( )
   {
      A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      if ( ( DecimalUtil.compareTo(A2771ALbHdrImp, O2771ALbHdrImp) == 0 ) && ( ( DecimalUtil.compareTo(A2768AlbHdrKgs, O2768AlbHdrKgs) != 0 ) || ( DecimalUtil.compareTo(A2767AlbHdrPKg, O2767AlbHdrPKg) != 0 ) || ( DecimalUtil.compareTo(A2770ALbHdrMts, O2770ALbHdrMts) != 0 ) || ( DecimalUtil.compareTo(A2769AlbHdrPMt, O2769AlbHdrPMt) != 0 ) ) )
      {
         A2771ALbHdrImp = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 2).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
      }
   }

   public void checkExtendedTable1T3402( )
   {
      nIsDirty_402 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01T34 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3915EmpNumDec = T01T34_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01T34_n3915EmpNumDec[0] ;
      pr_default.close(2);
      /* Using cursor T01T36 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01T36_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01T36_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = T01T36_A7101AlbLic[0] ;
      A34AlbProfch = T01T36_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = T01T36_A2242AlbSec[0] ;
      A1243GuiRemCli = T01T36_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      pr_default.close(4);
      /* Using cursor T01T39 */
      pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T39_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(7);
      /* Using cursor T01T35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A120BarAgrEst = T01T35_A120BarAgrEst[0] ;
      A252CliCod = T01T35_A252CliCod[0] ;
      n252CliCod = T01T35_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(3);
      /* Using cursor T01T38 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2763AlbHdrUlin = T01T38_A2763AlbHdrUlin[0] ;
      A1248GuiFasULin = T01T38_A1248GuiFasULin[0] ;
      A1261BarAlbKgmE = T01T38_A1261BarAlbKgmE[0] ;
      A1263BarAlbMtrE = T01T38_A1263BarAlbMtrE[0] ;
      A2026BarAlbPbr = T01T38_A2026BarAlbPbr[0] ;
      n2026BarAlbPbr = T01T38_n2026BarAlbPbr[0] ;
      A1462BarAlbTar = T01T38_A1462BarAlbTar[0] ;
      n1462BarAlbTar = T01T38_n1462BarAlbTar[0] ;
      pr_default.close(6);
      nIsDirty_402 = (short)(1) ;
      A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      if ( ( DecimalUtil.compareTo(A2771ALbHdrImp, O2771ALbHdrImp) == 0 ) && ( ( DecimalUtil.compareTo(A2768AlbHdrKgs, O2768AlbHdrKgs) != 0 ) || ( DecimalUtil.compareTo(A2767AlbHdrPKg, O2767AlbHdrPKg) != 0 ) || ( DecimalUtil.compareTo(A2770ALbHdrMts, O2770ALbHdrMts) != 0 ) || ( DecimalUtil.compareTo(A2769AlbHdrPMt, O2769AlbHdrPMt) != 0 ) ) )
      {
         nIsDirty_402 = (short)(1) ;
         A2771ALbHdrImp = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 2).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
      }
   }

   public void closeExtendedTableCursors1T3402( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(7);
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod )
   {
      /* Using cursor T01T311 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3915EmpNumDec = T01T311_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01T311_n3915EmpNumDec[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_21( String A396EmprCod ,
                          long A30AlbProCod )
   {
      /* Using cursor T01T312 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01T312_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01T312_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = T01T312_A7101AlbLic[0] ;
      A34AlbProfch = T01T312_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = T01T312_A2242AlbSec[0] ;
      A1243GuiRemCli = T01T312_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1253EmprGuiRem))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7101AlbLic))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2242AlbSec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_23( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01T313 */
      pr_default.execute(11, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T313_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_20( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01T314 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A120BarAgrEst = T01T314_A120BarAgrEst[0] ;
      A252CliCod = T01T314_A252CliCod[0] ;
      n252CliCod = T01T314_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A120BarAgrEst))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_22( String A396EmprCod ,
                          long A30AlbProCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01T38 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2763AlbHdrUlin = T01T38_A2763AlbHdrUlin[0] ;
      A1248GuiFasULin = T01T38_A1248GuiFasULin[0] ;
      A1261BarAlbKgmE = T01T38_A1261BarAlbKgmE[0] ;
      A1263BarAlbMtrE = T01T38_A1263BarAlbMtrE[0] ;
      A2026BarAlbPbr = T01T38_A2026BarAlbPbr[0] ;
      n2026BarAlbPbr = T01T38_n2026BarAlbPbr[0] ;
      A1462BarAlbTar = T01T38_A1462BarAlbTar[0] ;
      n1462BarAlbTar = T01T38_n1462BarAlbTar[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2026BarAlbPbr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1462BarAlbTar, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1T3402( )
   {
      /* Using cursor T01T315 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound402 = (short)(1) ;
      }
      else
      {
         RcdFound402 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1T3402( 18) ;
         RcdFound402 = (short)(1) ;
         A2764AlbHdrLin = T01T33_A2764AlbHdrLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
         A2771ALbHdrImp = T01T33_A2771ALbHdrImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
         A2765AlbHdrTxt = T01T33_A2765AlbHdrTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2765AlbHdrTxt", A2765AlbHdrTxt);
         A2766AlbHdrRD = T01T33_A2766AlbHdrRD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2766AlbHdrRD", GXutil.ltrimstr( A2766AlbHdrRD, 6, 2));
         A2767AlbHdrPKg = T01T33_A2767AlbHdrPKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
         A2768AlbHdrKgs = T01T33_A2768AlbHdrKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
         A2769AlbHdrPMt = T01T33_A2769AlbHdrPMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
         A2770ALbHdrMts = T01T33_A2770ALbHdrMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
         A2772AlbHdrTip = T01T33_A2772AlbHdrTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2772AlbHdrTip", A2772AlbHdrTip);
         A3614AlbTxtCod = T01T33_A3614AlbTxtCod[0] ;
         A396EmprCod = T01T33_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01T33_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01T33_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01T33_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A30AlbProCod = T01T33_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         O2769AlbHdrPMt = A2769AlbHdrPMt ;
         httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
         O2770ALbHdrMts = A2770ALbHdrMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
         O2767AlbHdrPKg = A2767AlbHdrPKg ;
         httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
         O2768AlbHdrKgs = A2768AlbHdrKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
         O2771ALbHdrImp = A2771ALbHdrImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2764AlbHdrLin = A2764AlbHdrLin ;
         sMode402 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1T3402( ) ;
         if ( AnyError == 1 )
         {
            RcdFound402 = (short)(0) ;
            initializeNonKey1T3402( ) ;
         }
         Gx_mode = sMode402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound402 = (short)(0) ;
         initializeNonKey1T3402( ) ;
         sMode402 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1T3402( ) ;
      if ( RcdFound402 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound402 = (short)(0) ;
      /* Using cursor T01T316 */
      pr_default.execute(14, new Object[] {Short.valueOf(A2764AlbHdrLin), Short.valueOf(A2764AlbHdrLin), A396EmprCod, A396EmprCod, Short.valueOf(A2764AlbHdrLin), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2764AlbHdrLin), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2764AlbHdrLin), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2764AlbHdrLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01T316_A2764AlbHdrLin[0] < A2764AlbHdrLin ) || ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T316_A129BarCod[0] < A129BarCod ) || ( T01T316_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T316_A132BarCodReo[0] < A132BarCodReo ) || ( T01T316_A132BarCodReo[0] == A132BarCodReo ) && ( T01T316_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T316_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01T316_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T316_A132BarCodReo[0] == A132BarCodReo ) && ( T01T316_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T316_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01T316_A2764AlbHdrLin[0] > A2764AlbHdrLin ) || ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T316_A129BarCod[0] > A129BarCod ) || ( T01T316_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T316_A132BarCodReo[0] > A132BarCodReo ) || ( T01T316_A132BarCodReo[0] == A132BarCodReo ) && ( T01T316_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T316_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01T316_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T316_A132BarCodReo[0] == A132BarCodReo ) && ( T01T316_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T316_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T316_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T316_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A2764AlbHdrLin = T01T316_A2764AlbHdrLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
            A396EmprCod = T01T316_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01T316_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01T316_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01T316_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01T316_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound402 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound402 = (short)(0) ;
      /* Using cursor T01T317 */
      pr_default.execute(15, new Object[] {Short.valueOf(A2764AlbHdrLin), Short.valueOf(A2764AlbHdrLin), A396EmprCod, A396EmprCod, Short.valueOf(A2764AlbHdrLin), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2764AlbHdrLin), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2764AlbHdrLin), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2764AlbHdrLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T01T317_A2764AlbHdrLin[0] > A2764AlbHdrLin ) || ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T317_A129BarCod[0] > A129BarCod ) || ( T01T317_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T317_A132BarCodReo[0] > A132BarCodReo ) || ( T01T317_A132BarCodReo[0] == A132BarCodReo ) && ( T01T317_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T317_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01T317_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T317_A132BarCodReo[0] == A132BarCodReo ) && ( T01T317_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T317_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T01T317_A2764AlbHdrLin[0] < A2764AlbHdrLin ) || ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T317_A129BarCod[0] < A129BarCod ) || ( T01T317_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T317_A132BarCodReo[0] < A132BarCodReo ) || ( T01T317_A132BarCodReo[0] == A132BarCodReo ) && ( T01T317_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( GXutil.strcmp(T01T317_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01T317_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T317_A132BarCodReo[0] == A132BarCodReo ) && ( T01T317_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T317_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T317_A2764AlbHdrLin[0] == A2764AlbHdrLin ) && ( T01T317_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A2764AlbHdrLin = T01T317_A2764AlbHdrLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
            A396EmprCod = T01T317_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01T317_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01T317_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01T317_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01T317_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound402 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T3402( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbHdrTxt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T3402( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound402 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2764AlbHdrLin != Z2764AlbHdrLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2764AlbHdrLin = Z2764AlbHdrLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbHdrTxt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1T3402( ) ;
               GX_FocusControl = edtAlbHdrTxt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2764AlbHdrLin != Z2764AlbHdrLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbHdrTxt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T3402( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlbHdrTxt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T3402( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2764AlbHdrLin != Z2764AlbHdrLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2764AlbHdrLin = Z2764AlbHdrLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbHdrTxt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1T3402( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBTXT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2771ALbHdrImp, T01T32_A2771ALbHdrImp[0]) != 0 ) || ( GXutil.strcmp(Z2765AlbHdrTxt, T01T32_A2765AlbHdrTxt[0]) != 0 ) || ( DecimalUtil.compareTo(Z2766AlbHdrRD, T01T32_A2766AlbHdrRD[0]) != 0 ) || ( DecimalUtil.compareTo(Z2767AlbHdrPKg, T01T32_A2767AlbHdrPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z2768AlbHdrKgs, T01T32_A2768AlbHdrKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2769AlbHdrPMt, T01T32_A2769AlbHdrPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z2770ALbHdrMts, T01T32_A2770ALbHdrMts[0]) != 0 ) || ( GXutil.strcmp(Z2772AlbHdrTip, T01T32_A2772AlbHdrTip[0]) != 0 ) || ( GXutil.strcmp(Z3614AlbTxtCod, T01T32_A3614AlbTxtCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2771ALbHdrImp, T01T32_A2771ALbHdrImp[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"ALbHdrImp");
               GXutil.writeLogRaw("Old: ",Z2771ALbHdrImp);
               GXutil.writeLogRaw("Current: ",T01T32_A2771ALbHdrImp[0]);
            }
            if ( GXutil.strcmp(Z2765AlbHdrTxt, T01T32_A2765AlbHdrTxt[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrTxt");
               GXutil.writeLogRaw("Old: ",Z2765AlbHdrTxt);
               GXutil.writeLogRaw("Current: ",T01T32_A2765AlbHdrTxt[0]);
            }
            if ( DecimalUtil.compareTo(Z2766AlbHdrRD, T01T32_A2766AlbHdrRD[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrRD");
               GXutil.writeLogRaw("Old: ",Z2766AlbHdrRD);
               GXutil.writeLogRaw("Current: ",T01T32_A2766AlbHdrRD[0]);
            }
            if ( DecimalUtil.compareTo(Z2767AlbHdrPKg, T01T32_A2767AlbHdrPKg[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrPKg");
               GXutil.writeLogRaw("Old: ",Z2767AlbHdrPKg);
               GXutil.writeLogRaw("Current: ",T01T32_A2767AlbHdrPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z2768AlbHdrKgs, T01T32_A2768AlbHdrKgs[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrKgs");
               GXutil.writeLogRaw("Old: ",Z2768AlbHdrKgs);
               GXutil.writeLogRaw("Current: ",T01T32_A2768AlbHdrKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z2769AlbHdrPMt, T01T32_A2769AlbHdrPMt[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrPMt");
               GXutil.writeLogRaw("Old: ",Z2769AlbHdrPMt);
               GXutil.writeLogRaw("Current: ",T01T32_A2769AlbHdrPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z2770ALbHdrMts, T01T32_A2770ALbHdrMts[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"ALbHdrMts");
               GXutil.writeLogRaw("Old: ",Z2770ALbHdrMts);
               GXutil.writeLogRaw("Current: ",T01T32_A2770ALbHdrMts[0]);
            }
            if ( GXutil.strcmp(Z2772AlbHdrTip, T01T32_A2772AlbHdrTip[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrTip");
               GXutil.writeLogRaw("Old: ",Z2772AlbHdrTip);
               GXutil.writeLogRaw("Current: ",T01T32_A2772AlbHdrTip[0]);
            }
            if ( GXutil.strcmp(Z3614AlbTxtCod, T01T32_A3614AlbTxtCod[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbTxtCod");
               GXutil.writeLogRaw("Old: ",Z3614AlbTxtCod);
               GXutil.writeLogRaw("Current: ",T01T32_A3614AlbTxtCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBTXT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01T318 */
      pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z2763AlbHdrUlin != T01T318_A2763AlbHdrUlin[0] ) || ( Z1248GuiFasULin != T01T318_A1248GuiFasULin[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01T318_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01T318_A1263BarAlbMtrE[0]) != 0 ) || ( DecimalUtil.compareTo(Z2026BarAlbPbr, T01T318_A2026BarAlbPbr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1462BarAlbTar, T01T318_A1462BarAlbTar[0]) != 0 ) )
         {
            if ( Z2763AlbHdrUlin != T01T318_A2763AlbHdrUlin[0] )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"AlbHdrUlin");
               GXutil.writeLogRaw("Old: ",Z2763AlbHdrUlin);
               GXutil.writeLogRaw("Current: ",T01T318_A2763AlbHdrUlin[0]);
            }
            if ( Z1248GuiFasULin != T01T318_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T01T318_A1248GuiFasULin[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01T318_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01T318_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01T318_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01T318_A1263BarAlbMtrE[0]);
            }
            if ( DecimalUtil.compareTo(Z2026BarAlbPbr, T01T318_A2026BarAlbPbr[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"BarAlbPbr");
               GXutil.writeLogRaw("Old: ",Z2026BarAlbPbr);
               GXutil.writeLogRaw("Current: ",T01T318_A2026BarAlbPbr[0]);
            }
            if ( DecimalUtil.compareTo(Z1462BarAlbTar, T01T318_A1462BarAlbTar[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiatextolibre:[seudo value changed for attri]"+"BarAlbTar");
               GXutil.writeLogRaw("Old: ",Z1462BarAlbTar);
               GXutil.writeLogRaw("Current: ",T01T318_A1462BarAlbTar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T3402( )
   {
      beforeValidate1T3402( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T3402( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T3402( 0) ;
         checkOptimisticConcurrency1T3402( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T3402( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T3402( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T319 */
                  pr_default.execute(17, new Object[] {Short.valueOf(A2764AlbHdrLin), A2771ALbHdrImp, A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2772AlbHdrTip, A3614AlbTxtCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T3402( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1T30( ) ;
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
            load1T3402( ) ;
         }
         endLevel1T3402( ) ;
      }
      closeExtendedTableCursors1T3402( ) ;
   }

   public void update1T3402( )
   {
      beforeValidate1T3402( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T3402( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T3402( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T3402( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T3402( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T320 */
                  pr_default.execute(18, new Object[] {A2771ALbHdrImp, A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2772AlbHdrTip, A3614AlbTxtCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBTXT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T3402( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T3402( ) ;
                     /* Start of After( update) rules */
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
         endLevel1T3402( ) ;
      }
      closeExtendedTableCursors1T3402( ) ;
   }

   public void deferredUpdate1T3402( )
   {
   }

   public void delete( )
   {
      beforeValidate1T3402( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T3402( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T3402( ) ;
         afterConfirm1T3402( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T3402( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T321 */
               pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
               if ( AnyError == 0 )
               {
                  updateTablesN11T3402( ) ;
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
      sMode402 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T3402( ) ;
      Gx_mode = sMode402 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T3402( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01T322 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         A3915EmpNumDec = T01T322_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01T322_n3915EmpNumDec[0] ;
         pr_default.close(20);
         /* Using cursor T01T323 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1253EmprGuiRem = T01T323_A1253EmprGuiRem[0] ;
         A5805AlbEnvFtp = T01T323_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T323_A7101AlbLic[0] ;
         A34AlbProfch = T01T323_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T323_A2242AlbSec[0] ;
         A1243GuiRemCli = T01T323_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(21);
         /* Using cursor T01T324 */
         pr_default.execute(22, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01T324_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(22);
         /* Using cursor T01T325 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A120BarAgrEst = T01T325_A120BarAgrEst[0] ;
         A252CliCod = T01T325_A252CliCod[0] ;
         n252CliCod = T01T325_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(23);
         /* Using cursor T01T326 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Z2763AlbHdrUlin = T01T326_A2763AlbHdrUlin[0] ;
         Z1248GuiFasULin = T01T326_A1248GuiFasULin[0] ;
         Z1261BarAlbKgmE = T01T326_A1261BarAlbKgmE[0] ;
         Z1263BarAlbMtrE = T01T326_A1263BarAlbMtrE[0] ;
         Z2026BarAlbPbr = T01T326_A2026BarAlbPbr[0] ;
         Z1462BarAlbTar = T01T326_A1462BarAlbTar[0] ;
         A2763AlbHdrUlin = T01T326_A2763AlbHdrUlin[0] ;
         A1248GuiFasULin = T01T326_A1248GuiFasULin[0] ;
         A1261BarAlbKgmE = T01T326_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01T326_A1263BarAlbMtrE[0] ;
         A2026BarAlbPbr = T01T326_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = T01T326_n2026BarAlbPbr[0] ;
         A1462BarAlbTar = T01T326_A1462BarAlbTar[0] ;
         n1462BarAlbTar = T01T326_n1462BarAlbTar[0] ;
         pr_default.close(24);
         A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      }
   }

   public void updateTablesN11T3402( )
   {
      /* Using cursor T01T327 */
      pr_default.execute(25, new Object[] {Short.valueOf(A2763AlbHdrUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevel1T3402( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(16);
      if ( AnyError == 0 )
      {
         beforeComplete1T3402( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.albaranguiatextolibre");
         if ( AnyError == 0 )
         {
            confirmValues1T30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "albaranes.albaranguiatextolibre");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T3402( )
   {
      /* Scan By routine */
      /* Using cursor T01T328 */
      pr_default.execute(26);
      RcdFound402 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound402 = (short)(1) ;
         A396EmprCod = T01T328_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T328_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01T328_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01T328_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01T328_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2764AlbHdrLin = T01T328_A2764AlbHdrLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T3402( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound402 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound402 = (short)(1) ;
         A396EmprCod = T01T328_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T328_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01T328_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01T328_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01T328_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2764AlbHdrLin = T01T328_A2764AlbHdrLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
      }
   }

   public void scanEnd1T3402( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1T3402( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T3402( )
   {
      /* Before Insert Rules */
      GXt_int6 = A2764AlbHdrLin ;
      GXv_int7[0] = GXt_int6 ;
      new app.albaranes.albaranguiatextolibre_proxid(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
      albaranguiatextolibre_impl.this.GXt_int6 = GXv_int7[0] ;
      A2764AlbHdrLin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
      A2763AlbHdrUlin = A2764AlbHdrLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
   }

   public void beforeUpdate1T3402( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T3402( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T3402( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T3402( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T3402( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbHdrTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrTxt_Enabled), 5, 0), true);
      edtAlbHdrRD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrRD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrRD_Enabled), 5, 0), true);
      edtAlbHdrPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrPKg_Enabled), 5, 0), true);
      edtAlbHdrKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrKgs_Enabled), 5, 0), true);
      edtAlbHdrPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrPMt_Enabled), 5, 0), true);
      edtALbHdrMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbHdrMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbHdrMts_Enabled), 5, 0), true);
      edtALbHdrImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbHdrImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbHdrImp_Enabled), 5, 0), true);
      edtAlbHdrTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrTip_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtAlbHdrLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrLin_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1T3402( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T30( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaranguiatextolibre", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV17AlbHdrLin,4,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbHdrLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"AlbaranGuiaTextoLibre");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("AlbTxtCod", GXutil.rtrim( localUtil.format( A3614AlbTxtCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranguiatextolibre:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2764AlbHdrLin", GXutil.ltrim( localUtil.ntoc( Z2764AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2771ALbHdrImp", GXutil.ltrim( localUtil.ntoc( Z2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2765AlbHdrTxt", GXutil.rtrim( Z2765AlbHdrTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2766AlbHdrRD", GXutil.ltrim( localUtil.ntoc( Z2766AlbHdrRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2767AlbHdrPKg", GXutil.ltrim( localUtil.ntoc( Z2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2768AlbHdrKgs", GXutil.ltrim( localUtil.ntoc( Z2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2769AlbHdrPMt", GXutil.ltrim( localUtil.ntoc( Z2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2770ALbHdrMts", GXutil.ltrim( localUtil.ntoc( Z2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2772AlbHdrTip", GXutil.rtrim( Z2772AlbHdrTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3614AlbTxtCod", GXutil.rtrim( Z3614AlbTxtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2026BarAlbPbr", GXutil.ltrim( localUtil.ntoc( Z2026BarAlbPbr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1462BarAlbTar", GXutil.ltrim( localUtil.ntoc( Z1462BarAlbTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2769AlbHdrPMt", GXutil.ltrim( localUtil.ntoc( O2769AlbHdrPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2770ALbHdrMts", GXutil.ltrim( localUtil.ntoc( O2770ALbHdrMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2767AlbHdrPKg", GXutil.ltrim( localUtil.ntoc( O2767AlbHdrPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2768AlbHdrKgs", GXutil.ltrim( localUtil.ntoc( O2768AlbHdrKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2771ALbHdrImp", GXutil.ltrim( localUtil.ntoc( O2771ALbHdrImp, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPBR", GXutil.ltrim( localUtil.ntoc( A2026BarAlbPbr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBTAR", GXutil.ltrim( localUtil.ntoc( A1462BarAlbTar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPNE", GXutil.ltrim( localUtil.ntoc( A2027BarAlbPne, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV13AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV14BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV15BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV16BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBHDRLIN", GXutil.ltrim( localUtil.ntoc( AV17AlbHdrLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBHDRLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17AlbHdrLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRULIN", GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTXTCOD", GXutil.rtrim( A3614AlbTxtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASULIN", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Objectcall", GXutil.rtrim( Dvpanel_tablealbaran_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Enabled", GXutil.booltostr( Dvpanel_tablealbaran_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Width", GXutil.rtrim( Dvpanel_tablealbaran_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autowidth", GXutil.booltostr( Dvpanel_tablealbaran_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autoheight", GXutil.booltostr( Dvpanel_tablealbaran_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Cls", GXutil.rtrim( Dvpanel_tablealbaran_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Title", GXutil.rtrim( Dvpanel_tablealbaran_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Collapsible", GXutil.booltostr( Dvpanel_tablealbaran_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Collapsed", GXutil.booltostr( Dvpanel_tablealbaran_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Showcollapseicon", GXutil.booltostr( Dvpanel_tablealbaran_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Iconposition", GXutil.rtrim( Dvpanel_tablealbaran_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autoscroll", GXutil.booltostr( Dvpanel_tablealbaran_Autoscroll));
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
      return formatLink("app.albaranes.albaranguiatextolibre", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV17AlbHdrLin,4,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbHdrLin"})  ;
   }

   public String getPgmname( )
   {
      return "Albaranes.AlbaranGuiaTextoLibre" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guia / Texto libre", "") ;
   }

   public void initializeNonKey1T3402( )
   {
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A2763AlbHdrUlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A34AlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A1248GuiFasULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A2027BarAlbPne = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrimstr( A2027BarAlbPne, 9, 2));
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      A2765AlbHdrTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2765AlbHdrTxt", A2765AlbHdrTxt);
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2766AlbHdrRD", GXutil.ltrimstr( A2766AlbHdrRD, 6, 2));
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
      A2772AlbHdrTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2772AlbHdrTip", A2772AlbHdrTip);
      A3614AlbTxtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3614AlbTxtCod", A3614AlbTxtCod);
      A2026BarAlbPbr = DecimalUtil.ZERO ;
      n2026BarAlbPbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2026BarAlbPbr", GXutil.ltrimstr( A2026BarAlbPbr, 9, 2));
      A1462BarAlbTar = DecimalUtil.ZERO ;
      n1462BarAlbTar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1462BarAlbTar", GXutil.ltrimstr( A1462BarAlbTar, 9, 2));
      O2769AlbHdrPMt = A2769AlbHdrPMt ;
      httpContext.ajax_rsp_assign_attri("", false, "A2769AlbHdrPMt", GXutil.ltrimstr( A2769AlbHdrPMt, 13, 5));
      O2770ALbHdrMts = A2770ALbHdrMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A2770ALbHdrMts", GXutil.ltrimstr( A2770ALbHdrMts, 9, 2));
      O2767AlbHdrPKg = A2767AlbHdrPKg ;
      httpContext.ajax_rsp_assign_attri("", false, "A2767AlbHdrPKg", GXutil.ltrimstr( A2767AlbHdrPKg, 13, 5));
      O2768AlbHdrKgs = A2768AlbHdrKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2768AlbHdrKgs", GXutil.ltrimstr( A2768AlbHdrKgs, 9, 2));
      O2771ALbHdrImp = A2771ALbHdrImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A2771ALbHdrImp", GXutil.ltrimstr( A2771ALbHdrImp, 10, 2));
      Z2771ALbHdrImp = DecimalUtil.ZERO ;
      Z2765AlbHdrTxt = "" ;
      Z2766AlbHdrRD = DecimalUtil.ZERO ;
      Z2767AlbHdrPKg = DecimalUtil.ZERO ;
      Z2768AlbHdrKgs = DecimalUtil.ZERO ;
      Z2769AlbHdrPMt = DecimalUtil.ZERO ;
      Z2770ALbHdrMts = DecimalUtil.ZERO ;
      Z2772AlbHdrTip = "" ;
      Z3614AlbTxtCod = "" ;
      Z2763AlbHdrUlin = (short)(0) ;
      Z1248GuiFasULin = (short)(0) ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z2026BarAlbPbr = DecimalUtil.ZERO ;
      Z1462BarAlbTar = DecimalUtil.ZERO ;
   }

   public void initAll1T3402( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2764AlbHdrLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
      initializeNonKey1T3402( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695054", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaranguiatextolibre.js", "?20268211695055", false, true);
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
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTbos_Internalname = "TBOS" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablealbaran_Internalname = "TABLEALBARAN" ;
      Dvpanel_tablealbaran_Internalname = "DVPANEL_TABLEALBARAN" ;
      edtAlbHdrTxt_Internalname = "ALBHDRTXT" ;
      edtAlbHdrRD_Internalname = "ALBHDRRD" ;
      edtAlbHdrPKg_Internalname = "ALBHDRPKG" ;
      edtAlbHdrKgs_Internalname = "ALBHDRKGS" ;
      edtAlbHdrPMt_Internalname = "ALBHDRPMT" ;
      edtALbHdrMts_Internalname = "ALBHDRMTS" ;
      edtALbHdrImp_Internalname = "ALBHDRIMP" ;
      edtAlbHdrTip_Internalname = "ALBHDRTIP" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtAlbHdrLin_Internalname = "ALBHDRLIN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Guia / Texto libre", "") );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtCliCod_Visible = 1 ;
      edtAlbHdrLin_Jsonclick = "" ;
      edtAlbHdrLin_Enabled = 0 ;
      edtAlbHdrLin_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbHdrTip_Jsonclick = "" ;
      edtAlbHdrTip_Enabled = 1 ;
      edtALbHdrImp_Jsonclick = "" ;
      edtALbHdrImp_Enabled = 1 ;
      edtALbHdrMts_Jsonclick = "" ;
      edtALbHdrMts_Enabled = 1 ;
      edtAlbHdrPMt_Jsonclick = "" ;
      edtAlbHdrPMt_Enabled = 1 ;
      edtAlbHdrKgs_Jsonclick = "" ;
      edtAlbHdrKgs_Enabled = 1 ;
      edtAlbHdrPKg_Jsonclick = "" ;
      edtAlbHdrPKg_Enabled = 1 ;
      edtAlbHdrRD_Jsonclick = "" ;
      edtAlbHdrRD_Enabled = 1 ;
      edtAlbHdrTxt_Jsonclick = "" ;
      edtAlbHdrTxt_Enabled = 1 ;
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
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
      Dvpanel_tablealbaran_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Iconposition = "Right" ;
      Dvpanel_tablealbaran_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Title = httpContext.getMessage( "Albarán", "") ;
      Dvpanel_tablealbaran_Cls = "PanelNoHeader" ;
      Dvpanel_tablealbaran_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablealbaran_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Width = "100%" ;
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

   public void gx13asaalbhdrlin1T3402( short AV17AlbHdrLin )
   {
      if ( ! (0==AV17AlbHdrLin) )
      {
         A2764AlbHdrLin = AV17AlbHdrLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx14asaalbhdrlin1T3402( String A396EmprCod ,
                                       long A30AlbProCod ,
                                       int A129BarCod ,
                                       byte A132BarCodReo ,
                                       String A130BarCodPar )
   {
      GXt_int6 = A2764AlbHdrLin ;
      GXv_int7[0] = GXt_int6 ;
      new app.albaranes.albaranguiatextolibre_proxid(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
      albaranguiatextolibre_impl.this.GXt_int6 = GXv_int7[0] ;
      A2764AlbHdrLin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2764AlbHdrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2764AlbHdrLin), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2764AlbHdrLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
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

   public void valid_Emprcod( )
   {
      n2026BarAlbPbr = false ;
      n1462BarAlbTar = false ;
      n3915EmpNumDec = false ;
      n252CliCod = false ;
      A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValue())) ;
      cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      /* Using cursor T01T322 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A3915EmpNumDec = T01T322_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01T322_n3915EmpNumDec[0] ;
      pr_default.close(20);
      /* Using cursor T01T325 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A120BarAgrEst = T01T325_A120BarAgrEst[0] ;
      A252CliCod = T01T325_A252CliCod[0] ;
      n252CliCod = T01T325_n252CliCod[0] ;
      pr_default.close(23);
      /* Using cursor T01T323 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1253EmprGuiRem = T01T323_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01T323_A5805AlbEnvFtp[0] ;
      cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      A7101AlbLic = T01T323_A7101AlbLic[0] ;
      A34AlbProfch = T01T323_A34AlbProfch[0] ;
      A2242AlbSec = T01T323_A2242AlbSec[0] ;
      A1243GuiRemCli = T01T323_A1243GuiRemCli[0] ;
      pr_default.close(21);
      /* Using cursor T01T324 */
      pr_default.execute(22, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T324_A1244GuiRemCln[0] ;
      pr_default.close(22);
      /* Using cursor T01T326 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Z2763AlbHdrUlin = T01T326_A2763AlbHdrUlin[0] ;
      Z1248GuiFasULin = T01T326_A1248GuiFasULin[0] ;
      Z1261BarAlbKgmE = T01T326_A1261BarAlbKgmE[0] ;
      Z1263BarAlbMtrE = T01T326_A1263BarAlbMtrE[0] ;
      Z2026BarAlbPbr = T01T326_A2026BarAlbPbr[0] ;
      Z1462BarAlbTar = T01T326_A1462BarAlbTar[0] ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2763AlbHdrUlin = T01T326_A2763AlbHdrUlin[0] ;
      A1248GuiFasULin = T01T326_A1248GuiFasULin[0] ;
      A1261BarAlbKgmE = T01T326_A1261BarAlbKgmE[0] ;
      A1263BarAlbMtrE = T01T326_A1263BarAlbMtrE[0] ;
      A2026BarAlbPbr = T01T326_A2026BarAlbPbr[0] ;
      n2026BarAlbPbr = T01T326_n2026BarAlbPbr[0] ;
      A1462BarAlbTar = T01T326_A1462BarAlbTar[0] ;
      n1462BarAlbTar = T01T326_n1462BarAlbTar[0] ;
      pr_default.close(24);
      A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
      dynload_actions( ) ;
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", GXutil.rtrim( A7101AlbLic));
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", GXutil.rtrim( A2242AlbSec));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2026BarAlbPbr", GXutil.ltrim( localUtil.ntoc( A2026BarAlbPbr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1462BarAlbTar", GXutil.ltrim( localUtil.ntoc( A1462BarAlbTar, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2027BarAlbPne", GXutil.ltrim( localUtil.ntoc( A2027BarAlbPne, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV14BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV15BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV16BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV17AlbHdrLin',fld:'vALBHDRLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV14BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV15BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV16BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV17AlbHdrLin',fld:'vALBHDRLIN',pic:'ZZZ9',hsh:true},{av:'A3614AlbTxtCod',fld:'ALBTXTCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121T32',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRPKG","{handler:'valid_Albhdrpkg',iparms:[]");
      setEventMetadata("VALID_ALBHDRPKG",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRKGS","{handler:'valid_Albhdrkgs',iparms:[]");
      setEventMetadata("VALID_ALBHDRKGS",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRPMT","{handler:'valid_Albhdrpmt',iparms:[]");
      setEventMetadata("VALID_ALBHDRPMT",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRMTS","{handler:'valid_Albhdrmts',iparms:[]");
      setEventMetadata("VALID_ALBHDRMTS",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRIMP","{handler:'valid_Albhdrimp',iparms:[]");
      setEventMetadata("VALID_ALBHDRIMP",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRLIN","{handler:'valid_Albhdrlin',iparms:[]");
      setEventMetadata("VALID_ALBHDRLIN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A2026BarAlbPbr',fld:'BARALBPBR',pic:'ZZZZZ9.99'},{av:'A1462BarAlbTar',fld:'BARALBTAR',pic:'ZZZZZ9.99'},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A2763AlbHdrUlin',fld:'ALBHDRULIN',pic:'ZZZ9'},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A2027BarAlbPne',fld:'BARALBPNE',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A2763AlbHdrUlin',fld:'ALBHDRULIN',pic:'ZZZ9'},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A2026BarAlbPbr',fld:'BARALBPBR',pic:'ZZZZZ9.99'},{av:'A1462BarAlbTar',fld:'BARALBTAR',pic:'ZZZZZ9.99'},{av:'A2027BarAlbPne',fld:'BARALBPNE',pic:'ZZZZZ9.99'}]}");
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
      pr_default.close(23);
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(24);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV16BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2771ALbHdrImp = DecimalUtil.ZERO ;
      Z2765AlbHdrTxt = "" ;
      Z2766AlbHdrRD = DecimalUtil.ZERO ;
      Z2767AlbHdrPKg = DecimalUtil.ZERO ;
      Z2768AlbHdrKgs = DecimalUtil.ZERO ;
      Z2769AlbHdrPMt = DecimalUtil.ZERO ;
      Z2770ALbHdrMts = DecimalUtil.ZERO ;
      Z2772AlbHdrTip = "" ;
      Z3614AlbTxtCod = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z2026BarAlbPbr = DecimalUtil.ZERO ;
      Z1462BarAlbTar = DecimalUtil.ZERO ;
      O2769AlbHdrPMt = DecimalUtil.ZERO ;
      O2770ALbHdrMts = DecimalUtil.ZERO ;
      O2767AlbHdrPKg = DecimalUtil.ZERO ;
      O2768AlbHdrKgs = DecimalUtil.ZERO ;
      O2771ALbHdrImp = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1253EmprGuiRem = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      AV16BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablealbaran = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      lblTbos_Jsonclick = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A2765AlbHdrTxt = "" ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV21Pgmname = "" ;
      A3614AlbTxtCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2026BarAlbPbr = DecimalUtil.ZERO ;
      A1462BarAlbTar = DecimalUtil.ZERO ;
      A2027BarAlbPne = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A7101AlbLic = "" ;
      A2242AlbSec = "" ;
      Dvpanel_tablealbaran_Objectcall = "" ;
      Dvpanel_tablealbaran_Class = "" ;
      Dvpanel_tablealbaran_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode402 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV18WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV20WebSession = httpContext.getWebSession();
      Z1253EmprGuiRem = "" ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      Z1244GuiRemCln = "" ;
      Z120BarAgrEst = "" ;
      T01T34_A3915EmpNumDec = new byte[1] ;
      T01T34_n3915EmpNumDec = new boolean[] {false} ;
      T01T36_A1253EmprGuiRem = new String[] {""} ;
      T01T36_A5805AlbEnvFtp = new byte[1] ;
      T01T36_A7101AlbLic = new String[] {""} ;
      T01T36_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T36_A2242AlbSec = new String[] {""} ;
      T01T36_A1243GuiRemCli = new int[1] ;
      T01T39_A1244GuiRemCln = new String[] {""} ;
      T01T35_A120BarAgrEst = new String[] {""} ;
      T01T35_A252CliCod = new int[1] ;
      T01T35_n252CliCod = new boolean[] {false} ;
      T01T38_A2763AlbHdrUlin = new short[1] ;
      T01T38_A1248GuiFasULin = new short[1] ;
      T01T38_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T38_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T38_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T38_n2026BarAlbPbr = new boolean[] {false} ;
      T01T38_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T38_n1462BarAlbTar = new boolean[] {false} ;
      T01T310_A1253EmprGuiRem = new String[] {""} ;
      T01T310_A2764AlbHdrLin = new short[1] ;
      T01T310_A2763AlbHdrUlin = new short[1] ;
      T01T310_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A5805AlbEnvFtp = new byte[1] ;
      T01T310_A7101AlbLic = new String[] {""} ;
      T01T310_A1244GuiRemCln = new String[] {""} ;
      T01T310_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T310_A2242AlbSec = new String[] {""} ;
      T01T310_A1248GuiFasULin = new short[1] ;
      T01T310_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A120BarAgrEst = new String[] {""} ;
      T01T310_A3915EmpNumDec = new byte[1] ;
      T01T310_n3915EmpNumDec = new boolean[] {false} ;
      T01T310_A2765AlbHdrTxt = new String[] {""} ;
      T01T310_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_A2772AlbHdrTip = new String[] {""} ;
      T01T310_A3614AlbTxtCod = new String[] {""} ;
      T01T310_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_n2026BarAlbPbr = new boolean[] {false} ;
      T01T310_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T310_n1462BarAlbTar = new boolean[] {false} ;
      T01T310_A396EmprCod = new String[] {""} ;
      T01T310_A129BarCod = new int[1] ;
      T01T310_A132BarCodReo = new byte[1] ;
      T01T310_A130BarCodPar = new String[] {""} ;
      T01T310_A30AlbProCod = new long[1] ;
      T01T310_A1243GuiRemCli = new int[1] ;
      T01T310_A252CliCod = new int[1] ;
      T01T310_n252CliCod = new boolean[] {false} ;
      T01T311_A3915EmpNumDec = new byte[1] ;
      T01T311_n3915EmpNumDec = new boolean[] {false} ;
      T01T312_A1253EmprGuiRem = new String[] {""} ;
      T01T312_A5805AlbEnvFtp = new byte[1] ;
      T01T312_A7101AlbLic = new String[] {""} ;
      T01T312_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T312_A2242AlbSec = new String[] {""} ;
      T01T312_A1243GuiRemCli = new int[1] ;
      T01T313_A1244GuiRemCln = new String[] {""} ;
      T01T314_A120BarAgrEst = new String[] {""} ;
      T01T314_A252CliCod = new int[1] ;
      T01T314_n252CliCod = new boolean[] {false} ;
      T01T315_A396EmprCod = new String[] {""} ;
      T01T315_A30AlbProCod = new long[1] ;
      T01T315_A129BarCod = new int[1] ;
      T01T315_A132BarCodReo = new byte[1] ;
      T01T315_A130BarCodPar = new String[] {""} ;
      T01T315_A2764AlbHdrLin = new short[1] ;
      T01T33_A2764AlbHdrLin = new short[1] ;
      T01T33_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T33_A2765AlbHdrTxt = new String[] {""} ;
      T01T33_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T33_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T33_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T33_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T33_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T33_A2772AlbHdrTip = new String[] {""} ;
      T01T33_A3614AlbTxtCod = new String[] {""} ;
      T01T33_A396EmprCod = new String[] {""} ;
      T01T33_A129BarCod = new int[1] ;
      T01T33_A132BarCodReo = new byte[1] ;
      T01T33_A130BarCodPar = new String[] {""} ;
      T01T33_A30AlbProCod = new long[1] ;
      T01T316_A2764AlbHdrLin = new short[1] ;
      T01T316_A396EmprCod = new String[] {""} ;
      T01T316_A129BarCod = new int[1] ;
      T01T316_A132BarCodReo = new byte[1] ;
      T01T316_A130BarCodPar = new String[] {""} ;
      T01T316_A30AlbProCod = new long[1] ;
      T01T317_A2764AlbHdrLin = new short[1] ;
      T01T317_A396EmprCod = new String[] {""} ;
      T01T317_A129BarCod = new int[1] ;
      T01T317_A132BarCodReo = new byte[1] ;
      T01T317_A130BarCodPar = new String[] {""} ;
      T01T317_A30AlbProCod = new long[1] ;
      T01T32_A2764AlbHdrLin = new short[1] ;
      T01T32_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T32_A2765AlbHdrTxt = new String[] {""} ;
      T01T32_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T32_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T32_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T32_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T32_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T32_A2772AlbHdrTip = new String[] {""} ;
      T01T32_A3614AlbTxtCod = new String[] {""} ;
      T01T32_A396EmprCod = new String[] {""} ;
      T01T32_A129BarCod = new int[1] ;
      T01T32_A132BarCodReo = new byte[1] ;
      T01T32_A130BarCodPar = new String[] {""} ;
      T01T32_A30AlbProCod = new long[1] ;
      T01T318_A2763AlbHdrUlin = new short[1] ;
      T01T318_A1248GuiFasULin = new short[1] ;
      T01T318_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T318_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T318_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T318_n2026BarAlbPbr = new boolean[] {false} ;
      T01T318_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T318_n1462BarAlbTar = new boolean[] {false} ;
      T01T322_A3915EmpNumDec = new byte[1] ;
      T01T322_n3915EmpNumDec = new boolean[] {false} ;
      T01T323_A1253EmprGuiRem = new String[] {""} ;
      T01T323_A5805AlbEnvFtp = new byte[1] ;
      T01T323_A7101AlbLic = new String[] {""} ;
      T01T323_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T323_A2242AlbSec = new String[] {""} ;
      T01T323_A1243GuiRemCli = new int[1] ;
      T01T324_A1244GuiRemCln = new String[] {""} ;
      T01T325_A120BarAgrEst = new String[] {""} ;
      T01T325_A252CliCod = new int[1] ;
      T01T325_n252CliCod = new boolean[] {false} ;
      T01T326_A2763AlbHdrUlin = new short[1] ;
      T01T326_A1248GuiFasULin = new short[1] ;
      T01T326_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T326_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T326_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T326_n2026BarAlbPbr = new boolean[] {false} ;
      T01T326_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T326_n1462BarAlbTar = new boolean[] {false} ;
      T01T328_A396EmprCod = new String[] {""} ;
      T01T328_A30AlbProCod = new long[1] ;
      T01T328_A129BarCod = new int[1] ;
      T01T328_A132BarCodReo = new byte[1] ;
      T01T328_A130BarCodPar = new String[] {""} ;
      T01T328_A2764AlbHdrLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int7 = new short[1] ;
      Z2027BarAlbPne = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre__default(),
         new Object[] {
             new Object[] {
            T01T32_A2764AlbHdrLin, T01T32_A2771ALbHdrImp, T01T32_A2765AlbHdrTxt, T01T32_A2766AlbHdrRD, T01T32_A2767AlbHdrPKg, T01T32_A2768AlbHdrKgs, T01T32_A2769AlbHdrPMt, T01T32_A2770ALbHdrMts, T01T32_A2772AlbHdrTip, T01T32_A3614AlbTxtCod,
            T01T32_A396EmprCod, T01T32_A129BarCod, T01T32_A132BarCodReo, T01T32_A130BarCodPar, T01T32_A30AlbProCod
            }
            , new Object[] {
            T01T33_A2764AlbHdrLin, T01T33_A2771ALbHdrImp, T01T33_A2765AlbHdrTxt, T01T33_A2766AlbHdrRD, T01T33_A2767AlbHdrPKg, T01T33_A2768AlbHdrKgs, T01T33_A2769AlbHdrPMt, T01T33_A2770ALbHdrMts, T01T33_A2772AlbHdrTip, T01T33_A3614AlbTxtCod,
            T01T33_A396EmprCod, T01T33_A129BarCod, T01T33_A132BarCodReo, T01T33_A130BarCodPar, T01T33_A30AlbProCod
            }
            , new Object[] {
            T01T34_A3915EmpNumDec, T01T34_n3915EmpNumDec
            }
            , new Object[] {
            T01T35_A120BarAgrEst, T01T35_A252CliCod, T01T35_n252CliCod
            }
            , new Object[] {
            T01T36_A1253EmprGuiRem, T01T36_A5805AlbEnvFtp, T01T36_A7101AlbLic, T01T36_A34AlbProfch, T01T36_A2242AlbSec, T01T36_A1243GuiRemCli
            }
            , new Object[] {
            T01T37_A2763AlbHdrUlin, T01T37_A1248GuiFasULin, T01T37_A1261BarAlbKgmE, T01T37_A1263BarAlbMtrE, T01T37_A2026BarAlbPbr, T01T37_n2026BarAlbPbr, T01T37_A1462BarAlbTar, T01T37_n1462BarAlbTar
            }
            , new Object[] {
            T01T38_A2763AlbHdrUlin, T01T38_A1248GuiFasULin, T01T38_A1261BarAlbKgmE, T01T38_A1263BarAlbMtrE, T01T38_A2026BarAlbPbr, T01T38_n2026BarAlbPbr, T01T38_A1462BarAlbTar, T01T38_n1462BarAlbTar
            }
            , new Object[] {
            T01T39_A1244GuiRemCln
            }
            , new Object[] {
            T01T310_A1253EmprGuiRem, T01T310_A2764AlbHdrLin, T01T310_A2763AlbHdrUlin, T01T310_A2771ALbHdrImp, T01T310_A5805AlbEnvFtp, T01T310_A7101AlbLic, T01T310_A1244GuiRemCln, T01T310_A34AlbProfch, T01T310_A2242AlbSec, T01T310_A1248GuiFasULin,
            T01T310_A1261BarAlbKgmE, T01T310_A1263BarAlbMtrE, T01T310_A120BarAgrEst, T01T310_A3915EmpNumDec, T01T310_n3915EmpNumDec, T01T310_A2765AlbHdrTxt, T01T310_A2766AlbHdrRD, T01T310_A2767AlbHdrPKg, T01T310_A2768AlbHdrKgs, T01T310_A2769AlbHdrPMt,
            T01T310_A2770ALbHdrMts, T01T310_A2772AlbHdrTip, T01T310_A3614AlbTxtCod, T01T310_A2026BarAlbPbr, T01T310_n2026BarAlbPbr, T01T310_A1462BarAlbTar, T01T310_n1462BarAlbTar, T01T310_A396EmprCod, T01T310_A129BarCod, T01T310_A132BarCodReo,
            T01T310_A130BarCodPar, T01T310_A30AlbProCod, T01T310_A1243GuiRemCli, T01T310_A252CliCod, T01T310_n252CliCod
            }
            , new Object[] {
            T01T311_A3915EmpNumDec, T01T311_n3915EmpNumDec
            }
            , new Object[] {
            T01T312_A1253EmprGuiRem, T01T312_A5805AlbEnvFtp, T01T312_A7101AlbLic, T01T312_A34AlbProfch, T01T312_A2242AlbSec, T01T312_A1243GuiRemCli
            }
            , new Object[] {
            T01T313_A1244GuiRemCln
            }
            , new Object[] {
            T01T314_A120BarAgrEst, T01T314_A252CliCod, T01T314_n252CliCod
            }
            , new Object[] {
            T01T315_A396EmprCod, T01T315_A30AlbProCod, T01T315_A129BarCod, T01T315_A132BarCodReo, T01T315_A130BarCodPar, T01T315_A2764AlbHdrLin
            }
            , new Object[] {
            T01T316_A2764AlbHdrLin, T01T316_A396EmprCod, T01T316_A129BarCod, T01T316_A132BarCodReo, T01T316_A130BarCodPar, T01T316_A30AlbProCod
            }
            , new Object[] {
            T01T317_A2764AlbHdrLin, T01T317_A396EmprCod, T01T317_A129BarCod, T01T317_A132BarCodReo, T01T317_A130BarCodPar, T01T317_A30AlbProCod
            }
            , new Object[] {
            T01T318_A2763AlbHdrUlin, T01T318_A1248GuiFasULin, T01T318_A1261BarAlbKgmE, T01T318_A1263BarAlbMtrE, T01T318_A2026BarAlbPbr, T01T318_n2026BarAlbPbr, T01T318_A1462BarAlbTar, T01T318_n1462BarAlbTar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T322_A3915EmpNumDec, T01T322_n3915EmpNumDec
            }
            , new Object[] {
            T01T323_A1253EmprGuiRem, T01T323_A5805AlbEnvFtp, T01T323_A7101AlbLic, T01T323_A34AlbProfch, T01T323_A2242AlbSec, T01T323_A1243GuiRemCli
            }
            , new Object[] {
            T01T324_A1244GuiRemCln
            }
            , new Object[] {
            T01T325_A120BarAgrEst, T01T325_A252CliCod, T01T325_n252CliCod
            }
            , new Object[] {
            T01T326_A2763AlbHdrUlin, T01T326_A1248GuiFasULin, T01T326_A1261BarAlbKgmE, T01T326_A1263BarAlbMtrE, T01T326_A2026BarAlbPbr, T01T326_n2026BarAlbPbr, T01T326_A1462BarAlbTar, T01T326_n1462BarAlbTar
            }
            , new Object[] {
            }
            , new Object[] {
            T01T328_A396EmprCod, T01T328_A30AlbProCod, T01T328_A129BarCod, T01T328_A132BarCodReo, T01T328_A130BarCodPar, T01T328_A2764AlbHdrLin
            }
         }
      );
      AV21Pgmname = "Albaranes.AlbaranGuiaTextoLibre" ;
   }

   private byte wcpOAV15BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV15BarCodReo ;
   private byte nKeyPressed ;
   private byte A5805AlbEnvFtp ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte Z5805AlbEnvFtp ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV17AlbHdrLin ;
   private short Z2764AlbHdrLin ;
   private short Z2763AlbHdrUlin ;
   private short Z1248GuiFasULin ;
   private short AV17AlbHdrLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2764AlbHdrLin ;
   private short A2763AlbHdrUlin ;
   private short A1248GuiFasULin ;
   private short RcdFound402 ;
   private short nIsDirty_402 ;
   private short GXt_int6 ;
   private short GXv_int7[] ;
   private int wcpOAV14BarCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int A1243GuiRemCli ;
   private int AV14BarCod ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtAlbHdrTxt_Enabled ;
   private int edtAlbHdrRD_Enabled ;
   private int edtAlbHdrPKg_Enabled ;
   private int edtAlbHdrKgs_Enabled ;
   private int edtAlbHdrPMt_Enabled ;
   private int edtALbHdrMts_Enabled ;
   private int edtALbHdrImp_Enabled ;
   private int edtAlbHdrTip_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtAlbHdrLin_Enabled ;
   private int edtAlbHdrLin_Visible ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliCod_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int GX_JID ;
   private int Z1243GuiRemCli ;
   private int Z252CliCod ;
   private int idxLst ;
   private long wcpOAV13AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long AV13AlbProCod ;
   private java.math.BigDecimal Z2771ALbHdrImp ;
   private java.math.BigDecimal Z2766AlbHdrRD ;
   private java.math.BigDecimal Z2767AlbHdrPKg ;
   private java.math.BigDecimal Z2768AlbHdrKgs ;
   private java.math.BigDecimal Z2769AlbHdrPMt ;
   private java.math.BigDecimal Z2770ALbHdrMts ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z2026BarAlbPbr ;
   private java.math.BigDecimal Z1462BarAlbTar ;
   private java.math.BigDecimal O2769AlbHdrPMt ;
   private java.math.BigDecimal O2770ALbHdrMts ;
   private java.math.BigDecimal O2767AlbHdrPKg ;
   private java.math.BigDecimal O2768AlbHdrKgs ;
   private java.math.BigDecimal O2771ALbHdrImp ;
   private java.math.BigDecimal A2766AlbHdrRD ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2026BarAlbPbr ;
   private java.math.BigDecimal A1462BarAlbTar ;
   private java.math.BigDecimal A2027BarAlbPne ;
   private java.math.BigDecimal Z2027BarAlbPne ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV16BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2765AlbHdrTxt ;
   private String Z2772AlbHdrTip ;
   private String Z3614AlbTxtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1253EmprGuiRem ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String AV16BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbHdrTxt_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tablealbaran_Width ;
   private String Dvpanel_tablealbaran_Cls ;
   private String Dvpanel_tablealbaran_Title ;
   private String Dvpanel_tablealbaran_Iconposition ;
   private String Dvpanel_tablealbaran_Internalname ;
   private String divTablealbaran_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String lblTbos_Internalname ;
   private String lblTbos_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String TempTags ;
   private String A2765AlbHdrTxt ;
   private String edtAlbHdrTxt_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbHdrRD_Internalname ;
   private String edtAlbHdrRD_Jsonclick ;
   private String edtAlbHdrPKg_Internalname ;
   private String edtAlbHdrPKg_Jsonclick ;
   private String edtAlbHdrKgs_Internalname ;
   private String edtAlbHdrKgs_Jsonclick ;
   private String edtAlbHdrPMt_Internalname ;
   private String edtAlbHdrPMt_Jsonclick ;
   private String edtALbHdrMts_Internalname ;
   private String edtALbHdrMts_Jsonclick ;
   private String edtALbHdrImp_Internalname ;
   private String edtALbHdrImp_Jsonclick ;
   private String edtAlbHdrTip_Internalname ;
   private String A2772AlbHdrTip ;
   private String edtAlbHdrTip_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtAlbHdrLin_Internalname ;
   private String edtAlbHdrLin_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String A3614AlbTxtCod ;
   private String A120BarAgrEst ;
   private String A7101AlbLic ;
   private String A2242AlbSec ;
   private String Dvpanel_tablealbaran_Objectcall ;
   private String Dvpanel_tablealbaran_Class ;
   private String Dvpanel_tablealbaran_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode402 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private String Z1253EmprGuiRem ;
   private String Z7101AlbLic ;
   private String Z2242AlbSec ;
   private String Z1244GuiRemCln ;
   private String Z120BarAgrEst ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Z34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tablealbaran_Autowidth ;
   private boolean Dvpanel_tablealbaran_Autoheight ;
   private boolean Dvpanel_tablealbaran_Collapsible ;
   private boolean Dvpanel_tablealbaran_Collapsed ;
   private boolean Dvpanel_tablealbaran_Showcollapseicon ;
   private boolean Dvpanel_tablealbaran_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n2026BarAlbPbr ;
   private boolean n1462BarAlbTar ;
   private boolean n3915EmpNumDec ;
   private boolean Dvpanel_tablealbaran_Enabled ;
   private boolean Dvpanel_tablealbaran_Showheader ;
   private boolean Dvpanel_tablealbaran_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV20WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablealbaran ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbEnvFtp ;
   private IDataStoreProvider pr_default ;
   private byte[] T01T34_A3915EmpNumDec ;
   private boolean[] T01T34_n3915EmpNumDec ;
   private String[] T01T36_A1253EmprGuiRem ;
   private byte[] T01T36_A5805AlbEnvFtp ;
   private String[] T01T36_A7101AlbLic ;
   private java.util.Date[] T01T36_A34AlbProfch ;
   private String[] T01T36_A2242AlbSec ;
   private int[] T01T36_A1243GuiRemCli ;
   private String[] T01T39_A1244GuiRemCln ;
   private String[] T01T35_A120BarAgrEst ;
   private int[] T01T35_A252CliCod ;
   private boolean[] T01T35_n252CliCod ;
   private short[] T01T38_A2763AlbHdrUlin ;
   private short[] T01T38_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T38_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T38_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01T38_A2026BarAlbPbr ;
   private boolean[] T01T38_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01T38_A1462BarAlbTar ;
   private boolean[] T01T38_n1462BarAlbTar ;
   private String[] T01T310_A1253EmprGuiRem ;
   private short[] T01T310_A2764AlbHdrLin ;
   private short[] T01T310_A2763AlbHdrUlin ;
   private java.math.BigDecimal[] T01T310_A2771ALbHdrImp ;
   private byte[] T01T310_A5805AlbEnvFtp ;
   private String[] T01T310_A7101AlbLic ;
   private String[] T01T310_A1244GuiRemCln ;
   private java.util.Date[] T01T310_A34AlbProfch ;
   private String[] T01T310_A2242AlbSec ;
   private short[] T01T310_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T310_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T310_A1263BarAlbMtrE ;
   private String[] T01T310_A120BarAgrEst ;
   private byte[] T01T310_A3915EmpNumDec ;
   private boolean[] T01T310_n3915EmpNumDec ;
   private String[] T01T310_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] T01T310_A2766AlbHdrRD ;
   private java.math.BigDecimal[] T01T310_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] T01T310_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] T01T310_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] T01T310_A2770ALbHdrMts ;
   private String[] T01T310_A2772AlbHdrTip ;
   private String[] T01T310_A3614AlbTxtCod ;
   private java.math.BigDecimal[] T01T310_A2026BarAlbPbr ;
   private boolean[] T01T310_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01T310_A1462BarAlbTar ;
   private boolean[] T01T310_n1462BarAlbTar ;
   private String[] T01T310_A396EmprCod ;
   private int[] T01T310_A129BarCod ;
   private byte[] T01T310_A132BarCodReo ;
   private String[] T01T310_A130BarCodPar ;
   private long[] T01T310_A30AlbProCod ;
   private int[] T01T310_A1243GuiRemCli ;
   private int[] T01T310_A252CliCod ;
   private boolean[] T01T310_n252CliCod ;
   private byte[] T01T311_A3915EmpNumDec ;
   private boolean[] T01T311_n3915EmpNumDec ;
   private String[] T01T312_A1253EmprGuiRem ;
   private byte[] T01T312_A5805AlbEnvFtp ;
   private String[] T01T312_A7101AlbLic ;
   private java.util.Date[] T01T312_A34AlbProfch ;
   private String[] T01T312_A2242AlbSec ;
   private int[] T01T312_A1243GuiRemCli ;
   private String[] T01T313_A1244GuiRemCln ;
   private String[] T01T314_A120BarAgrEst ;
   private int[] T01T314_A252CliCod ;
   private boolean[] T01T314_n252CliCod ;
   private String[] T01T315_A396EmprCod ;
   private long[] T01T315_A30AlbProCod ;
   private int[] T01T315_A129BarCod ;
   private byte[] T01T315_A132BarCodReo ;
   private String[] T01T315_A130BarCodPar ;
   private short[] T01T315_A2764AlbHdrLin ;
   private short[] T01T33_A2764AlbHdrLin ;
   private java.math.BigDecimal[] T01T33_A2771ALbHdrImp ;
   private String[] T01T33_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] T01T33_A2766AlbHdrRD ;
   private java.math.BigDecimal[] T01T33_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] T01T33_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] T01T33_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] T01T33_A2770ALbHdrMts ;
   private String[] T01T33_A2772AlbHdrTip ;
   private String[] T01T33_A3614AlbTxtCod ;
   private String[] T01T33_A396EmprCod ;
   private int[] T01T33_A129BarCod ;
   private byte[] T01T33_A132BarCodReo ;
   private String[] T01T33_A130BarCodPar ;
   private long[] T01T33_A30AlbProCod ;
   private short[] T01T316_A2764AlbHdrLin ;
   private String[] T01T316_A396EmprCod ;
   private int[] T01T316_A129BarCod ;
   private byte[] T01T316_A132BarCodReo ;
   private String[] T01T316_A130BarCodPar ;
   private long[] T01T316_A30AlbProCod ;
   private short[] T01T317_A2764AlbHdrLin ;
   private String[] T01T317_A396EmprCod ;
   private int[] T01T317_A129BarCod ;
   private byte[] T01T317_A132BarCodReo ;
   private String[] T01T317_A130BarCodPar ;
   private long[] T01T317_A30AlbProCod ;
   private short[] T01T32_A2764AlbHdrLin ;
   private java.math.BigDecimal[] T01T32_A2771ALbHdrImp ;
   private String[] T01T32_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] T01T32_A2766AlbHdrRD ;
   private java.math.BigDecimal[] T01T32_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] T01T32_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] T01T32_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] T01T32_A2770ALbHdrMts ;
   private String[] T01T32_A2772AlbHdrTip ;
   private String[] T01T32_A3614AlbTxtCod ;
   private String[] T01T32_A396EmprCod ;
   private int[] T01T32_A129BarCod ;
   private byte[] T01T32_A132BarCodReo ;
   private String[] T01T32_A130BarCodPar ;
   private long[] T01T32_A30AlbProCod ;
   private short[] T01T318_A2763AlbHdrUlin ;
   private short[] T01T318_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T318_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T318_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01T318_A2026BarAlbPbr ;
   private boolean[] T01T318_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01T318_A1462BarAlbTar ;
   private boolean[] T01T318_n1462BarAlbTar ;
   private byte[] T01T322_A3915EmpNumDec ;
   private boolean[] T01T322_n3915EmpNumDec ;
   private String[] T01T323_A1253EmprGuiRem ;
   private byte[] T01T323_A5805AlbEnvFtp ;
   private String[] T01T323_A7101AlbLic ;
   private java.util.Date[] T01T323_A34AlbProfch ;
   private String[] T01T323_A2242AlbSec ;
   private int[] T01T323_A1243GuiRemCli ;
   private String[] T01T324_A1244GuiRemCln ;
   private String[] T01T325_A120BarAgrEst ;
   private int[] T01T325_A252CliCod ;
   private boolean[] T01T325_n252CliCod ;
   private short[] T01T326_A2763AlbHdrUlin ;
   private short[] T01T326_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T326_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T326_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01T326_A2026BarAlbPbr ;
   private boolean[] T01T326_n2026BarAlbPbr ;
   private java.math.BigDecimal[] T01T326_A1462BarAlbTar ;
   private boolean[] T01T326_n1462BarAlbTar ;
   private String[] T01T328_A396EmprCod ;
   private long[] T01T328_A30AlbProCod ;
   private int[] T01T328_A129BarCod ;
   private byte[] T01T328_A132BarCodReo ;
   private String[] T01T328_A130BarCodPar ;
   private short[] T01T328_A2764AlbHdrLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01T37_A2763AlbHdrUlin ;
   private short[] T01T37_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T37_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T37_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01T37_A2026BarAlbPbr ;
   private java.math.BigDecimal[] T01T37_A1462BarAlbTar ;
   private boolean[] T01T37_n2026BarAlbPbr ;
   private boolean[] T01T37_n1462BarAlbTar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV18WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV19TrnContext ;
}

final  class albaranguiatextolibre__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiatextolibre__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiatextolibre__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiatextolibre__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiatextolibre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T32", "SELECT AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?  FOR UPDATE OF ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T33", "SELECT AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T34", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T35", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T36", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T37", "SELECT AlbHdrUlin, GuiFasULin, BarAlbKgmE, BarAlbMtrE, BarAlbPbr, BarAlbTar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbHdrUlin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T38", "SELECT AlbHdrUlin, GuiFasULin, BarAlbKgmE, BarAlbMtrE, BarAlbPbr, BarAlbTar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T39", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T310", "SELECT /*+ FIRST_ROWS(100) */ T3.EmprGuiRem AS EmprGuiRem, TM1.AlbHdrLin, T6.AlbHdrUlin, TM1.ALbHdrImp, T3.AlbEnvFtp, T3.AlbLic, T4.CliNom AS GuiRemCln, T3.AlbProfch, T3.AlbSec, T6.GuiFasULin, T6.BarAlbKgmE, T6.BarAlbMtrE, T5.BarAgrEst, T2.EmpNumDec, TM1.AlbHdrTxt, TM1.AlbHdrRD, TM1.AlbHdrPKg, TM1.AlbHdrKgs, TM1.AlbHdrPMt, TM1.ALbHdrMts, TM1.AlbHdrTip, TM1.AlbTxtCod, T6.BarAlbPbr, T6.BarAlbTar, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod, T3.GuiRemCli AS GuiRemCli, T5.CliCod FROM (((((TXPALBTXT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProCod = TM1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli) INNER JOIN TXPBARCAD T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) INNER JOIN TXPALBBAR T6 ON T6.EmprCod = TM1.EmprCod AND T6.AlbProCod = TM1.AlbProCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar) WHERE TM1.AlbHdrLin = ? and TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbHdrLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T311", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T312", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T313", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T314", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T315", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T316", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlbHdrLin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBTXT WHERE ( AlbHdrLin > ? or AlbHdrLin = ? and EmprCod > ? or EmprCod = ? and AlbHdrLin = ? and BarCod > ? or BarCod = ? and EmprCod = ? and AlbHdrLin = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbHdrLin = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbHdrLin = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T317", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlbHdrLin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBTXT WHERE ( AlbHdrLin < ? or AlbHdrLin = ? and EmprCod < ? or EmprCod = ? and AlbHdrLin = ? and BarCod < ? or BarCod = ? and EmprCod = ? and AlbHdrLin = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbHdrLin = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbHdrLin = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, AlbHdrLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T318", "SELECT AlbHdrUlin, GuiFasULin, BarAlbKgmE, BarAlbMtrE, BarAlbPbr, BarAlbTar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbHdrUlin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T319", "INSERT INTO TXPALBTXT(AlbHdrLin, ALbHdrImp, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, AlbHdrTip, AlbTxtCod, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPALBTXT")
         ,new UpdateCursor("T01T320", "UPDATE TXPALBTXT SET ALbHdrImp=?, AlbHdrTxt=?, AlbHdrRD=?, AlbHdrPKg=?, AlbHdrKgs=?, AlbHdrPMt=?, ALbHdrMts=?, AlbHdrTip=?, AlbTxtCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?", GX_NOMASK, "TXPALBTXT")
         ,new UpdateCursor("T01T321", "DELETE FROM TXPALBTXT  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?", GX_NOMASK, "TXPALBTXT")
         ,new ForEachCursor("T01T322", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T323", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T324", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T325", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T326", "SELECT AlbHdrUlin, GuiFasULin, BarAlbKgmE, BarAlbMtrE, BarAlbPbr, BarAlbTar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T327", "UPDATE TXPALBBAR SET AlbHdrUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01T328", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((String[]) buf[22])[0] = rslt.getString(22, 6);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((byte[]) buf[29])[0] = rslt.getByte(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 1);
               ((long[]) buf[31])[0] = rslt.getLong(29);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((int[]) buf[33])[0] = rslt.getInt(31);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 20 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               return;
            case 18 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 25 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

