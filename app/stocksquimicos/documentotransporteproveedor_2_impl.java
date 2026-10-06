package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1TI1839( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1TI1839( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_1TI1839( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13443AlbProCnt = CommonUtil.decimalVal( httpContext.GetPar( "AlbProCnt"), ".") ;
         n13443AlbProCnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         AV22Msg_errcant = httpContext.GetPar( "Msg_errcant") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_1TI1839( Gx_mode, A396EmprCod, A719PrdNum, A13443AlbProCnt, AV22Msg_errcant) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13443AlbProCnt = CommonUtil.decimalVal( httpContext.GetPar( "AlbProCnt"), ".") ;
         n13443AlbProCnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         AV18AlbProCntold = CommonUtil.decimalVal( httpContext.GetPar( "AlbProCntold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
         AV22Msg_errcant = httpContext.GetPar( "Msg_errcant") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_1TI1839( Gx_mode, A396EmprCod, A719PrdNum, A13443AlbProCnt, AV18AlbProCntold, AV22Msg_errcant) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV30Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
         AV15UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
         AV17Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
         AV16Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Inc_obs", AV16Inc_obs);
         A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_1TI1839( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV30Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
         AV15UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
         AV17Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
         AV16Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Inc_obs", AV16Inc_obs);
         A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_1TI1839( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"ALBPROLINE") == 0 )
      {
         AV9AlbProLinea = (short)(GXutil.lval( httpContext.GetPar( "AlbProLinea"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProLinea), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbProLinea), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaalbproline1TI1839( AV9AlbProLinea) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"ALBPROLINE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaalbproline1TI1839( A396EmprCod, A13418AlbProID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_34( A396EmprCod, A719PrdNum) ;
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
            AV8AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProID), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProID), "ZZZZZZZ9")));
            AV9AlbProLinea = (short)(GXutil.lval( httpContext.GetPar( "AlbProLinea"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProLinea), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbProLinea), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Transporte Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public documentotransporteproveedor_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransporteproveedor_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_2_impl.class ));
   }

   public documentotransporteproveedor_2_impl( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProUnd = new HTMLChoice();
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
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
         n13444AlbProUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProUnd.setValue( GXutil.rtrim( A13444AlbProUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Values", cmbAlbProUnd.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproid_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavAlbproid_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproid_Internalname, GXutil.ltrim( localUtil.ntoc( AV8AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8AlbProID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8AlbProID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
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
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLine_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLine_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProLine_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLine_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLine_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockprdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV24PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdNum_Visible, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProDsc_Internalname, GXutil.rtrim( A13448AlbProDsc), GXutil.rtrim( localUtil.format( A13448AlbProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCnt_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCnt_Enabled!=0) ? localUtil.format( A13443AlbProCnt, "ZZZZZ9.99") : localUtil.format( A13443AlbProCnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProUnd.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProUnd.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProUnd, cmbAlbProUnd.getInternalname(), GXutil.rtrim( A13444AlbProUnd), 1, cmbAlbProUnd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProUnd.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      cmbAlbProUnd.setValue( GXutil.rtrim( A13444AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Values", cmbAlbProUnd.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCaja_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCaja_Internalname, httpContext.getMessage( "Embalaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCaja_Internalname, GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCaja_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCaja_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCaja_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProObsL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProObsL_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProObsL_Internalname, GXutil.rtrim( A13447AlbProObsL), GXutil.rtrim( localUtil.format( A13447AlbProObsL, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProObsL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProObsL_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV30Pgmname), GXutil.rtrim( localUtil.format( AV30Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prdnum_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprdnum_Internalname, GXutil.rtrim( AV26ComboPrdNum), GXutil.rtrim( localUtil.format( AV26ComboPrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprdnum_Visible, edtavComboprdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e111TI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV27DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV24PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( "Z13418AlbProID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( "Z13442AlbProLine"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13448AlbProDsc = httpContext.cgiGet( "Z13448AlbProDsc") ;
            Z13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( "Z13443AlbProCnt")) ;
            Z13444AlbProUnd = httpContext.cgiGet( "Z13444AlbProUnd") ;
            Z13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( "Z13449AlbProCaja"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13447AlbProObsL = httpContext.cgiGet( "Z13447AlbProObsL") ;
            Z13445AlbProNRef = httpContext.cgiGet( "Z13445AlbProNRef") ;
            Z13446AlbProVRef = httpContext.cgiGet( "Z13446AlbProVRef") ;
            Z13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( "Z13852AlbProPrvp")) ;
            Z13853AlbProDto = localUtil.ctond( httpContext.cgiGet( "Z13853AlbProDto")) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            A13445AlbProNRef = httpContext.cgiGet( "Z13445AlbProNRef") ;
            n13445AlbProNRef = false ;
            A13446AlbProVRef = httpContext.cgiGet( "Z13446AlbProVRef") ;
            n13446AlbProVRef = false ;
            A13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( "Z13852AlbProPrvp")) ;
            n13852AlbProPrvp = false ;
            A13853AlbProDto = localUtil.ctond( httpContext.cgiGet( "Z13853AlbProDto")) ;
            n13853AlbProDto = false ;
            O719PrdNum = httpContext.cgiGet( "O719PrdNum") ;
            O13448AlbProDsc = httpContext.cgiGet( "O13448AlbProDsc") ;
            O13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( "O13442AlbProLine"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( "O13443AlbProCnt")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N719PrdNum = httpContext.cgiGet( "N719PrdNum") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbProLinea = (short)(localUtil.ctol( httpContext.cgiGet( "vALBPROLINEA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_PrdNum = httpContext.cgiGet( "vINSERT_PRDNUM") ;
            AV18AlbProCntold = localUtil.ctond( httpContext.cgiGet( "vALBPROCNTOLD")) ;
            AV19AlbProLineaold = (short)(localUtil.ctol( httpContext.cgiGet( "vALBPROLINEAOLD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20AlbProDscold = httpContext.cgiGet( "vALBPRODSCOLD") ;
            AV21PrdnumOld = httpContext.cgiGet( "vPRDNUMOLD") ;
            AV16Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13430AlbProDate = localUtil.ctod( httpContext.cgiGet( "ALBPRODATE"), 0) ;
            A13417AlbProTipo = httpContext.cgiGet( "ALBPROTIPO") ;
            A13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROPRVI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28DevCant = (short)(localUtil.ctol( httpContext.cgiGet( "vDEVCANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV22Msg_errcant = httpContext.cgiGet( "vMSG_ERRCANT") ;
            AV17Station = httpContext.cgiGet( "vSTATION") ;
            A13445AlbProNRef = httpContext.cgiGet( "ALBPRONREF") ;
            A13446AlbProVRef = httpContext.cgiGet( "ALBPROVREF") ;
            A13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( "ALBPROPRVP")) ;
            A13853AlbProDto = localUtil.ctond( httpContext.cgiGet( "ALBPRODTO")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "PRDEXIALM")) ;
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
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            /* Read variables values. */
            AV8AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbproid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProID), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProID), "ZZZZZZZ9")));
            A13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A13448AlbProDsc = httpContext.cgiGet( edtAlbProDsc_Internalname) ;
            n13448AlbProDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13443AlbProCnt = DecimalUtil.ZERO ;
               n13443AlbProCnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
            }
            else
            {
               A13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)) ;
               n13443AlbProCnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
            }
            cmbAlbProUnd.setValue( httpContext.cgiGet( cmbAlbProUnd.getInternalname()) );
            A13444AlbProUnd = httpContext.cgiGet( cmbAlbProUnd.getInternalname()) ;
            n13444AlbProUnd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCAJA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCaja_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13449AlbProCaja = (short)(0) ;
               n13449AlbProCaja = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
            }
            else
            {
               A13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13449AlbProCaja = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
            }
            A13447AlbProObsL = httpContext.cgiGet( edtAlbProObsL_Internalname) ;
            n13447AlbProObsL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13447AlbProObsL", A13447AlbProObsL);
            AV30Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
            AV26ComboPrdNum = httpContext.cgiGet( edtavComboprdnum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ComboPrdNum", AV26ComboPrdNum);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_2");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV30Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV30Pgmname, "")));
            forbiddenHiddens.add("AlbProNRef", GXutil.rtrim( localUtil.format( A13445AlbProNRef, "")));
            forbiddenHiddens.add("AlbProVRef", GXutil.rtrim( localUtil.format( A13446AlbProVRef, "")));
            forbiddenHiddens.add("AlbProPrvp", localUtil.format( A13852AlbProPrvp, "ZZZZZZ9.99999"));
            forbiddenHiddens.add("AlbProDto", localUtil.format( A13853AlbProDto, "ZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A13442AlbProLine != Z13442AlbProLine ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\documentotransporteproveedor_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
               A13442AlbProLine = (short)(GXutil.lval( httpContext.GetPar( "AlbProLine"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
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
                  sMode1839 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1839 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1839 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TI0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBPROLINE");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProLine_Internalname ;
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
                        e111TI2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TI2 ();
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
         e121TI2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TI1839( ) ;
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
         disableAttributes1TI1839( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproid_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
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

   public void confirm_1TI0( )
   {
      beforeValidate1TI1839( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TI1839( ) ;
         }
         else
         {
            checkExtendedTable1TI1839( ) ;
            closeExtendedTableCursors1TI1839( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TI0( )
   {
   }

   public void e111TI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV28DevCant) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "DEVPRO", ""), GXv_int2) ;
      documentotransporteproveedor_2_impl.this.GXt_int1 = GXv_int2[0] ;
      AV28DevCant = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DevCant", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28DevCant), 4, 0));
      GXt_char3 = AV17Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentotransporteproveedor_2_impl.this.GXt_char3 = GXv_char4[0] ;
      AV17Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char5[0] = AV31Emprnom ;
      GXv_char6[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char4, GXv_char5, GXv_char6) ;
      documentotransporteproveedor_2_impl.this.AV7EmprCod = GXv_char4[0] ;
      documentotransporteproveedor_2_impl.this.AV31Emprnom = GXv_char5[0] ;
      documentotransporteproveedor_2_impl.this.AV15UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Emprnom", AV31Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext7[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV10WWPContext = GXv_SdtWWPContext7[0] ;
      divUnnamedtable1_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV27DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV27DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      edtPrdNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), true);
      AV26ComboPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboPrdNum", AV26ComboPrdNum);
      edtavComboprdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV30Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV32GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GXV1), 8, 0));
         while ( AV32GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV32GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdNum") == 0 )
            {
               AV13Insert_PrdNum = AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_PrdNum", AV13Insert_PrdNum);
               if ( ! (GXutil.strcmp("", AV13Insert_PrdNum)==0) )
               {
                  AV26ComboPrdNum = AV13Insert_PrdNum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26ComboPrdNum", AV26ComboPrdNum);
                  Combo_prdnum_Selectedvalue_set = AV26ComboPrdNum ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
                  Combo_prdnum_Enabled = false ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
               }
            }
            AV32GXV1 = (int)(AV32GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GXV1), 8, 0));
         }
      }
   }

   public void e121TI2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV24PrdNum_Data ;
      GXv_char6[0] = AV25ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.stocksquimicos.documentotransporteproveedor_2loaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV7EmprCod, AV8AlbProID, AV9AlbProLinea, GXv_char6, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      documentotransporteproveedor_2_impl.this.AV25ComboSelectedValue = GXv_char6[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV24PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_prdnum_Selectedvalue_set = AV25ComboSelectedValue ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      AV26ComboPrdNum = AV25ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboPrdNum", AV26ComboPrdNum);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prdnum_Enabled = false ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      }
   }

   public void zm1TI1839( int GX_JID )
   {
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13448AlbProDsc = T01TI3_A13448AlbProDsc[0] ;
            Z13443AlbProCnt = T01TI3_A13443AlbProCnt[0] ;
            Z13444AlbProUnd = T01TI3_A13444AlbProUnd[0] ;
            Z13449AlbProCaja = T01TI3_A13449AlbProCaja[0] ;
            Z13447AlbProObsL = T01TI3_A13447AlbProObsL[0] ;
            Z13445AlbProNRef = T01TI3_A13445AlbProNRef[0] ;
            Z13446AlbProVRef = T01TI3_A13446AlbProVRef[0] ;
            Z13852AlbProPrvp = T01TI3_A13852AlbProPrvp[0] ;
            Z13853AlbProDto = T01TI3_A13853AlbProDto[0] ;
            Z719PrdNum = T01TI3_A719PrdNum[0] ;
         }
         else
         {
            Z13448AlbProDsc = A13448AlbProDsc ;
            Z13443AlbProCnt = A13443AlbProCnt ;
            Z13444AlbProUnd = A13444AlbProUnd ;
            Z13449AlbProCaja = A13449AlbProCaja ;
            Z13447AlbProObsL = A13447AlbProObsL ;
            Z13445AlbProNRef = A13445AlbProNRef ;
            Z13446AlbProVRef = A13446AlbProVRef ;
            Z13852AlbProPrvp = A13852AlbProPrvp ;
            Z13853AlbProDto = A13853AlbProDto ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -32 )
      {
         Z13442AlbProLine = A13442AlbProLine ;
         Z13448AlbProDsc = A13448AlbProDsc ;
         Z13443AlbProCnt = A13443AlbProCnt ;
         Z13444AlbProUnd = A13444AlbProUnd ;
         Z13449AlbProCaja = A13449AlbProCaja ;
         Z13447AlbProObsL = A13447AlbProObsL ;
         Z13445AlbProNRef = A13445AlbProNRef ;
         Z13446AlbProVRef = A13446AlbProVRef ;
         Z13852AlbProPrvp = A13852AlbProPrvp ;
         Z13853AlbProDto = A13853AlbProDto ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z13418AlbProID = A13418AlbProID ;
         Z407EmprNom = A407EmprNom ;
         Z13417AlbProTipo = A13417AlbProTipo ;
         Z13430AlbProDate = A13430AlbProDate ;
         Z13419AlbProPrvI = A13419AlbProPrvI ;
         Z718PrdNom = A718PrdNom ;
         Z704PrdExiAlm = A704PrdExiAlm ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbProLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), true);
      AV30Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbProLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TI4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TI4_A407EmprNom[0] ;
      n407EmprNom = T01TI4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV8AlbProID) )
      {
         A13418AlbProID = AV8AlbProID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
      /* Using cursor T01TI6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Albaran Transporte Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROID");
         AnyError = (short)(1) ;
      }
      A13417AlbProTipo = T01TI6_A13417AlbProTipo[0] ;
      A13430AlbProDate = T01TI6_A13430AlbProDate[0] ;
      A13419AlbProPrvI = T01TI6_A13419AlbProPrvI[0] ;
      pr_default.close(4);
      if ( ! (0==AV9AlbProLinea) )
      {
         A13442AlbProLine = AV9AlbProLinea ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_PrdNum)==0) )
      {
         A719PrdNum = AV13Insert_PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = AV26ComboPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
      if ( isIns( )  && (0==A13449AlbProCaja) && ( Gx_BScreen == 0 ) )
      {
         A13449AlbProCaja = (short)(1) ;
         n13449AlbProCaja = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A13444AlbProUnd)==0) && ( Gx_BScreen == 0 ) )
      {
         A13444AlbProUnd = " " ;
         n13444AlbProUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            AV19AlbProLineaold = O13442AlbProLine ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProLineaold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProLineaold), 4, 0));
         }
         /* Using cursor T01TI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01TI5_A718PrdNom[0] ;
         A704PrdExiAlm = T01TI5_A704PrdExiAlm[0] ;
         pr_default.close(3);
         AV21PrdnumOld = O719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21PrdnumOld", AV21PrdnumOld);
      }
   }

   public void load1TI1839( )
   {
      /* Using cursor T01TI7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A407EmprNom = T01TI7_A407EmprNom[0] ;
         n407EmprNom = T01TI7_n407EmprNom[0] ;
         A13417AlbProTipo = T01TI7_A13417AlbProTipo[0] ;
         A13430AlbProDate = T01TI7_A13430AlbProDate[0] ;
         A13448AlbProDsc = T01TI7_A13448AlbProDsc[0] ;
         n13448AlbProDsc = T01TI7_n13448AlbProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
         A13443AlbProCnt = T01TI7_A13443AlbProCnt[0] ;
         n13443AlbProCnt = T01TI7_n13443AlbProCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         A13444AlbProUnd = T01TI7_A13444AlbProUnd[0] ;
         n13444AlbProUnd = T01TI7_n13444AlbProUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
         A13449AlbProCaja = T01TI7_A13449AlbProCaja[0] ;
         n13449AlbProCaja = T01TI7_n13449AlbProCaja[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
         A13447AlbProObsL = T01TI7_A13447AlbProObsL[0] ;
         n13447AlbProObsL = T01TI7_n13447AlbProObsL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13447AlbProObsL", A13447AlbProObsL);
         A718PrdNom = T01TI7_A718PrdNom[0] ;
         A704PrdExiAlm = T01TI7_A704PrdExiAlm[0] ;
         A13445AlbProNRef = T01TI7_A13445AlbProNRef[0] ;
         n13445AlbProNRef = T01TI7_n13445AlbProNRef[0] ;
         A13446AlbProVRef = T01TI7_A13446AlbProVRef[0] ;
         n13446AlbProVRef = T01TI7_n13446AlbProVRef[0] ;
         A13852AlbProPrvp = T01TI7_A13852AlbProPrvp[0] ;
         n13852AlbProPrvp = T01TI7_n13852AlbProPrvp[0] ;
         A13853AlbProDto = T01TI7_A13853AlbProDto[0] ;
         n13853AlbProDto = T01TI7_n13853AlbProDto[0] ;
         A719PrdNum = T01TI7_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13419AlbProPrvI = T01TI7_A13419AlbProPrvI[0] ;
         zm1TI1839( -32) ;
      }
      pr_default.close(5);
      onLoadActions1TI1839( ) ;
   }

   public void onLoadActions1TI1839( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV19AlbProLineaold = O13442AlbProLine ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProLineaold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProLineaold), 4, 0));
      }
      AV21PrdnumOld = O719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdnumOld", AV21PrdnumOld);
      AV18AlbProCntold = O13443AlbProCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
      if ( isIns( )  && (GXutil.strcmp("", A13448AlbProDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A13448AlbProDsc = A718PrdNom ;
         n13448AlbProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
      }
      AV20AlbProDscold = O13448AlbProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProDscold", AV20AlbProDscold);
   }

   public void checkExtendedTable1TI1839( )
   {
      nIsDirty_1839 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV19AlbProLineaold = O13442AlbProLine ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProLineaold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProLineaold), 4, 0));
      }
      AV21PrdnumOld = O719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdnumOld", AV21PrdnumOld);
      if ( ( GXutil.strcmp(A719PrdNum, AV21PrdnumOld) != 0 ) && ( GXutil.strcmp(AV21PrdnumOld, " ") != 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se puede modificar el Producto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV18AlbProCntold = O13443AlbProCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A719PrdNum ;
         GXv_decimal12[0] = A13443AlbProCnt ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = AV22Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_decimal12, GXv_decimal13, GXv_char4) ;
         documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char6[0] ;
         documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char5[0] ;
         documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal12[0] ;
         documentotransporteproveedor_2_impl.this.AV22Msg_errcant = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
      }
      if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A719PrdNum ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = AV18AlbProCntold ;
         GXv_char4[0] = AV22Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_decimal13, GXv_decimal12, GXv_char4) ;
         documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char6[0] ;
         documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char5[0] ;
         documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
         documentotransporteproveedor_2_impl.this.AV18AlbProCntold = GXv_decimal12[0] ;
         documentotransporteproveedor_2_impl.this.AV22Msg_errcant = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) && ( GXutil.strcmp(AV22Msg_errcant, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV22Msg_errcant, 0, "ALBPROCNT");
      }
      /* Using cursor T01TI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01TI5_A718PrdNom[0] ;
      A704PrdExiAlm = T01TI5_A704PrdExiAlm[0] ;
      pr_default.close(3);
      if ( isIns( )  && (GXutil.strcmp("", A13448AlbProDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1839 = (short)(1) ;
         A13448AlbProDsc = A718PrdNom ;
         n13448AlbProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
      }
      AV20AlbProDscold = O13448AlbProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProDscold", AV20AlbProDscold);
   }

   public void closeExtendedTableCursors1TI1839( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_34( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01TI8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01TI8_A718PrdNom[0] ;
      A704PrdExiAlm = T01TI8_A704PrdExiAlm[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1TI1839( )
   {
      /* Using cursor T01TI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1839 = (short)(1) ;
      }
      else
      {
         RcdFound1839 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TI1839( 32) ;
         RcdFound1839 = (short)(1) ;
         A13442AlbProLine = T01TI3_A13442AlbProLine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
         A13448AlbProDsc = T01TI3_A13448AlbProDsc[0] ;
         n13448AlbProDsc = T01TI3_n13448AlbProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
         A13443AlbProCnt = T01TI3_A13443AlbProCnt[0] ;
         n13443AlbProCnt = T01TI3_n13443AlbProCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         A13444AlbProUnd = T01TI3_A13444AlbProUnd[0] ;
         n13444AlbProUnd = T01TI3_n13444AlbProUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
         A13449AlbProCaja = T01TI3_A13449AlbProCaja[0] ;
         n13449AlbProCaja = T01TI3_n13449AlbProCaja[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
         A13447AlbProObsL = T01TI3_A13447AlbProObsL[0] ;
         n13447AlbProObsL = T01TI3_n13447AlbProObsL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13447AlbProObsL", A13447AlbProObsL);
         A13445AlbProNRef = T01TI3_A13445AlbProNRef[0] ;
         n13445AlbProNRef = T01TI3_n13445AlbProNRef[0] ;
         A13446AlbProVRef = T01TI3_A13446AlbProVRef[0] ;
         n13446AlbProVRef = T01TI3_n13446AlbProVRef[0] ;
         A13852AlbProPrvp = T01TI3_A13852AlbProPrvp[0] ;
         n13852AlbProPrvp = T01TI3_n13852AlbProPrvp[0] ;
         A13853AlbProDto = T01TI3_A13853AlbProDto[0] ;
         n13853AlbProDto = T01TI3_n13853AlbProDto[0] ;
         A396EmprCod = T01TI3_A396EmprCod[0] ;
         A719PrdNum = T01TI3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13418AlbProID = T01TI3_A13418AlbProID[0] ;
         O719PrdNum = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         O13448AlbProDsc = A13448AlbProDsc ;
         n13448AlbProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
         O13442AlbProLine = A13442AlbProLine ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
         O13443AlbProCnt = A13443AlbProCnt ;
         n13443AlbProCnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z13418AlbProID = A13418AlbProID ;
         Z13442AlbProLine = A13442AlbProLine ;
         sMode1839 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TI1839( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1839 = (short)(0) ;
            initializeNonKey1TI1839( ) ;
         }
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1839 = (short)(0) ;
         initializeNonKey1TI1839( ) ;
         sMode1839 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TI1839( ) ;
      if ( RcdFound1839 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1839 = (short)(0) ;
      /* Using cursor T01TI10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A13418AlbProID), Integer.valueOf(A13418AlbProID), A396EmprCod, Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01TI10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI10_A13418AlbProID[0] < A13418AlbProID ) || ( T01TI10_A13418AlbProID[0] == A13418AlbProID ) && ( GXutil.strcmp(T01TI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI10_A13442AlbProLine[0] < A13442AlbProLine ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01TI10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI10_A13418AlbProID[0] > A13418AlbProID ) || ( T01TI10_A13418AlbProID[0] == A13418AlbProID ) && ( GXutil.strcmp(T01TI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI10_A13442AlbProLine[0] > A13442AlbProLine ) ) )
         {
            A396EmprCod = T01TI10_A396EmprCod[0] ;
            A13418AlbProID = T01TI10_A13418AlbProID[0] ;
            A13442AlbProLine = T01TI10_A13442AlbProLine[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
            RcdFound1839 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1839 = (short)(0) ;
      /* Using cursor T01TI11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A13418AlbProID), Integer.valueOf(A13418AlbProID), A396EmprCod, Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01TI11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI11_A13418AlbProID[0] > A13418AlbProID ) || ( T01TI11_A13418AlbProID[0] == A13418AlbProID ) && ( GXutil.strcmp(T01TI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI11_A13442AlbProLine[0] > A13442AlbProLine ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01TI11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI11_A13418AlbProID[0] < A13418AlbProID ) || ( T01TI11_A13418AlbProID[0] == A13418AlbProID ) && ( GXutil.strcmp(T01TI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TI11_A13442AlbProLine[0] < A13442AlbProLine ) ) )
         {
            A396EmprCod = T01TI11_A396EmprCod[0] ;
            A13418AlbProID = T01TI11_A13418AlbProID[0] ;
            A13442AlbProLine = T01TI11_A13442AlbProLine[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
            RcdFound1839 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TI1839( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TI1839( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1839 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) || ( A13442AlbProLine != Z13442AlbProLine ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A13418AlbProID = Z13418AlbProID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
               A13442AlbProLine = Z13442AlbProLine ;
               httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBPROLINE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProLine_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TI1839( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) || ( A13442AlbProLine != Z13442AlbProLine ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TI1839( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBPROLINE");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProLine_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TI1839( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) || ( A13442AlbProLine != Z13442AlbProLine ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13418AlbProID = Z13418AlbProID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A13442AlbProLine = Z13442AlbProLine ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBPROLINE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProLine_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TI1839( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13448AlbProDsc, T01TI2_A13448AlbProDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z13443AlbProCnt, T01TI2_A13443AlbProCnt[0]) != 0 ) || ( GXutil.strcmp(Z13444AlbProUnd, T01TI2_A13444AlbProUnd[0]) != 0 ) || ( Z13449AlbProCaja != T01TI2_A13449AlbProCaja[0] ) || ( GXutil.strcmp(Z13447AlbProObsL, T01TI2_A13447AlbProObsL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13445AlbProNRef, T01TI2_A13445AlbProNRef[0]) != 0 ) || ( GXutil.strcmp(Z13446AlbProVRef, T01TI2_A13446AlbProVRef[0]) != 0 ) || ( DecimalUtil.compareTo(Z13852AlbProPrvp, T01TI2_A13852AlbProPrvp[0]) != 0 ) || ( DecimalUtil.compareTo(Z13853AlbProDto, T01TI2_A13853AlbProDto[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01TI2_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13448AlbProDsc, T01TI2_A13448AlbProDsc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProDsc");
               GXutil.writeLogRaw("Old: ",Z13448AlbProDsc);
               GXutil.writeLogRaw("Current: ",T01TI2_A13448AlbProDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z13443AlbProCnt, T01TI2_A13443AlbProCnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProCnt");
               GXutil.writeLogRaw("Old: ",Z13443AlbProCnt);
               GXutil.writeLogRaw("Current: ",T01TI2_A13443AlbProCnt[0]);
            }
            if ( GXutil.strcmp(Z13444AlbProUnd, T01TI2_A13444AlbProUnd[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProUnd");
               GXutil.writeLogRaw("Old: ",Z13444AlbProUnd);
               GXutil.writeLogRaw("Current: ",T01TI2_A13444AlbProUnd[0]);
            }
            if ( Z13449AlbProCaja != T01TI2_A13449AlbProCaja[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProCaja");
               GXutil.writeLogRaw("Old: ",Z13449AlbProCaja);
               GXutil.writeLogRaw("Current: ",T01TI2_A13449AlbProCaja[0]);
            }
            if ( GXutil.strcmp(Z13447AlbProObsL, T01TI2_A13447AlbProObsL[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProObsL");
               GXutil.writeLogRaw("Old: ",Z13447AlbProObsL);
               GXutil.writeLogRaw("Current: ",T01TI2_A13447AlbProObsL[0]);
            }
            if ( GXutil.strcmp(Z13445AlbProNRef, T01TI2_A13445AlbProNRef[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProNRef");
               GXutil.writeLogRaw("Old: ",Z13445AlbProNRef);
               GXutil.writeLogRaw("Current: ",T01TI2_A13445AlbProNRef[0]);
            }
            if ( GXutil.strcmp(Z13446AlbProVRef, T01TI2_A13446AlbProVRef[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProVRef");
               GXutil.writeLogRaw("Old: ",Z13446AlbProVRef);
               GXutil.writeLogRaw("Current: ",T01TI2_A13446AlbProVRef[0]);
            }
            if ( DecimalUtil.compareTo(Z13852AlbProPrvp, T01TI2_A13852AlbProPrvp[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProPrvp");
               GXutil.writeLogRaw("Old: ",Z13852AlbProPrvp);
               GXutil.writeLogRaw("Current: ",T01TI2_A13852AlbProPrvp[0]);
            }
            if ( DecimalUtil.compareTo(Z13853AlbProDto, T01TI2_A13853AlbProDto[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"AlbProDto");
               GXutil.writeLogRaw("Old: ",Z13853AlbProDto);
               GXutil.writeLogRaw("Current: ",T01TI2_A13853AlbProDto[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01TI2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_2:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01TI2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TI1839( )
   {
      beforeValidate1TI1839( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TI1839( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TI1839( 0) ;
         checkOptimisticConcurrency1TI1839( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TI1839( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TI1839( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TI12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A13442AlbProLine), Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13445AlbProNRef), A13445AlbProNRef, Boolean.valueOf(n13446AlbProVRef), A13446AlbProVRef, Boolean.valueOf(n13852AlbProPrvp), A13852AlbProPrvp, Boolean.valueOf(n13853AlbProDto), A13853AlbProDto, A396EmprCod, A719PrdNum, Integer.valueOf(A13418AlbProID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ ) && true /* Level */ )
                     {
                        AV16Inc_obs = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") + httpContext.getMessage( httpContext.getMessage( ",Linea ", ""), "") + GXutil.trim( GXutil.str( A13442AlbProLine, 4, 0)) + " " + GXutil.trim( A13448AlbProDsc) + httpContext.getMessage( httpContext.getMessage( " Cant ", ""), "") + GXutil.trim( GXutil.str( A13443AlbProCnt, 9, 2)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV16Inc_obs", AV16Inc_obs);
                     }
                     if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV28DevCant == 1 ) )
                     {
                        GXv_char6[0] = A396EmprCod ;
                        GXv_char5[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_int14[0] = A13418AlbProID ;
                        GXv_date15[0] = A13430AlbProDate ;
                        GXv_char16[0] = A13417AlbProTipo ;
                        GXv_int17[0] = A13442AlbProLine ;
                        GXv_int18[0] = A13419AlbProPrvI ;
                        GXv_decimal13[0] = A13443AlbProCnt ;
                        GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                        GXv_char19[0] = AV15UsurCod ;
                        GXv_char20[0] = "" ;
                        new app.pdevcalpro(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_int14, GXv_date15, GXv_char16, GXv_int17, GXv_int18, GXv_decimal13, GXv_decimal12, GXv_char19, GXv_char20) ;
                        documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char6[0] ;
                        documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char4[0] ;
                        documentotransporteproveedor_2_impl.this.A13418AlbProID = GXv_int14[0] ;
                        documentotransporteproveedor_2_impl.this.A13430AlbProDate = GXv_date15[0] ;
                        documentotransporteproveedor_2_impl.this.A13417AlbProTipo = GXv_char16[0] ;
                        documentotransporteproveedor_2_impl.this.A13442AlbProLine = GXv_int17[0] ;
                        documentotransporteproveedor_2_impl.this.A13419AlbProPrvI = GXv_int18[0] ;
                        documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
                        documentotransporteproveedor_2_impl.this.AV15UsurCod = GXv_char19[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
                        httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
                     }
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, (byte)(0), " ") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1TI0( ) ;
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
            load1TI1839( ) ;
         }
         endLevel1TI1839( ) ;
      }
      closeExtendedTableCursors1TI1839( ) ;
   }

   public void update1TI1839( )
   {
      beforeValidate1TI1839( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TI1839( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TI1839( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TI1839( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TI1839( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TI13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13445AlbProNRef), A13445AlbProNRef, Boolean.valueOf(n13446AlbProVRef), A13446AlbProVRef, Boolean.valueOf(n13852AlbProPrvp), A13852AlbProPrvp, Boolean.valueOf(n13853AlbProDto), A13853AlbProDto, A719PrdNum, A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TI1839( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( true /* After */ ) && true /* Level */ )
                     {
                        AV16Inc_obs = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") + httpContext.getMessage( httpContext.getMessage( ",Linea ", ""), "") + GXutil.trim( GXutil.str( A13442AlbProLine, 4, 0)) + " " + GXutil.trim( A13448AlbProDsc) + httpContext.getMessage( httpContext.getMessage( " Cant ", ""), "") + GXutil.trim( GXutil.str( AV18AlbProCntold, 9, 2)) + "/" + GXutil.trim( GXutil.str( A13443AlbProCnt, 9, 2)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV16Inc_obs", AV16Inc_obs);
                     }
                     if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV28DevCant == 1 ) )
                     {
                        GXv_char20[0] = A396EmprCod ;
                        GXv_char19[0] = httpContext.getMessage( "UPD", "") ;
                        GXv_char16[0] = A719PrdNum ;
                        GXv_int18[0] = A13418AlbProID ;
                        GXv_date15[0] = A13430AlbProDate ;
                        GXv_char6[0] = A13417AlbProTipo ;
                        GXv_int17[0] = A13442AlbProLine ;
                        GXv_int14[0] = A13419AlbProPrvI ;
                        GXv_decimal13[0] = A13443AlbProCnt ;
                        GXv_decimal12[0] = AV18AlbProCntold ;
                        GXv_char5[0] = AV15UsurCod ;
                        GXv_char4[0] = "" ;
                        new app.pdevcalpro(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_char16, GXv_int18, GXv_date15, GXv_char6, GXv_int17, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_char5, GXv_char4) ;
                        documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char20[0] ;
                        documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char16[0] ;
                        documentotransporteproveedor_2_impl.this.A13418AlbProID = GXv_int18[0] ;
                        documentotransporteproveedor_2_impl.this.A13430AlbProDate = GXv_date15[0] ;
                        documentotransporteproveedor_2_impl.this.A13417AlbProTipo = GXv_char6[0] ;
                        documentotransporteproveedor_2_impl.this.A13442AlbProLine = GXv_int17[0] ;
                        documentotransporteproveedor_2_impl.this.A13419AlbProPrvI = GXv_int14[0] ;
                        documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
                        documentotransporteproveedor_2_impl.this.AV18AlbProCntold = GXv_decimal12[0] ;
                        documentotransporteproveedor_2_impl.this.AV15UsurCod = GXv_char5[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
                        httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
                     }
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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
         endLevel1TI1839( ) ;
      }
      closeExtendedTableCursors1TI1839( ) ;
   }

   public void deferredUpdate1TI1839( )
   {
   }

   public void delete( )
   {
      beforeValidate1TI1839( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TI1839( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TI1839( ) ;
         afterConfirm1TI1839( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TI1839( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TI14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV16Inc_obs = httpContext.getMessage( httpContext.getMessage( "DLT", ""), "") + httpContext.getMessage( httpContext.getMessage( ",Linea ", ""), "") + GXutil.trim( GXutil.str( AV19AlbProLineaold, 4, 0)) + " " + GXutil.trim( AV20AlbProDscold) + " " + GXutil.trim( GXutil.str( AV18AlbProCntold, 9, 2)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16Inc_obs", AV16Inc_obs);
                  }
                  if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV28DevCant == 1 ) )
                  {
                     GXv_char20[0] = A396EmprCod ;
                     GXv_char19[0] = httpContext.getMessage( "DLT", "") ;
                     GXv_char16[0] = A719PrdNum ;
                     GXv_int18[0] = A13418AlbProID ;
                     GXv_date15[0] = A13430AlbProDate ;
                     GXv_char6[0] = A13417AlbProTipo ;
                     GXv_int17[0] = A13442AlbProLine ;
                     GXv_int14[0] = A13419AlbProPrvI ;
                     GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_char5[0] = AV15UsurCod ;
                     GXv_char4[0] = "" ;
                     new app.pdevcalpro(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_char16, GXv_int18, GXv_date15, GXv_char6, GXv_int17, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_char5, GXv_char4) ;
                     documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char20[0] ;
                     documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char16[0] ;
                     documentotransporteproveedor_2_impl.this.A13418AlbProID = GXv_int18[0] ;
                     documentotransporteproveedor_2_impl.this.A13430AlbProDate = GXv_date15[0] ;
                     documentotransporteproveedor_2_impl.this.A13417AlbProTipo = GXv_char6[0] ;
                     documentotransporteproveedor_2_impl.this.A13442AlbProLine = GXv_int17[0] ;
                     documentotransporteproveedor_2_impl.this.A13419AlbProPrvI = GXv_int14[0] ;
                     documentotransporteproveedor_2_impl.this.AV15UsurCod = GXv_char5[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                     httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
                     httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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
      sMode1839 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TI1839( ) ;
      Gx_mode = sMode1839 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TI1839( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_char19[0] = A719PrdNum ;
            GXv_decimal13[0] = A13443AlbProCnt ;
            GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char16[0] = AV22Msg_errcant ;
            new app.pexctrlproducto(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal13, GXv_decimal12, GXv_char16) ;
            documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char20[0] ;
            documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char19[0] ;
            documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
            documentotransporteproveedor_2_impl.this.AV22Msg_errcant = GXv_char16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
         }
         if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_char19[0] = A719PrdNum ;
            GXv_decimal13[0] = A13443AlbProCnt ;
            GXv_decimal12[0] = AV18AlbProCntold ;
            GXv_char16[0] = AV22Msg_errcant ;
            new app.pexctrlproducto(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal13, GXv_decimal12, GXv_char16) ;
            documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char20[0] ;
            documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char19[0] ;
            documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
            documentotransporteproveedor_2_impl.this.AV18AlbProCntold = GXv_decimal12[0] ;
            documentotransporteproveedor_2_impl.this.AV22Msg_errcant = GXv_char16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
         }
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            AV19AlbProLineaold = O13442AlbProLine ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProLineaold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProLineaold), 4, 0));
         }
         AV21PrdnumOld = O719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21PrdnumOld", AV21PrdnumOld);
         AV20AlbProDscold = O13448AlbProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProDscold", AV20AlbProDscold);
         AV18AlbProCntold = O13443AlbProCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
         /* Using cursor T01TI15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01TI15_A718PrdNom[0] ;
         A704PrdExiAlm = T01TI15_A704PrdExiAlm[0] ;
         pr_default.close(13);
      }
   }

   public void endLevel1TI1839( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TI1839( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_2");
         if ( AnyError == 0 )
         {
            confirmValues1TI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TI1839( )
   {
      /* Scan By routine */
      /* Using cursor T01TI16 */
      pr_default.execute(14);
      RcdFound1839 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A396EmprCod = T01TI16_A396EmprCod[0] ;
         A13418AlbProID = T01TI16_A13418AlbProID[0] ;
         A13442AlbProLine = T01TI16_A13442AlbProLine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TI1839( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1839 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A396EmprCod = T01TI16_A396EmprCod[0] ;
         A13418AlbProID = T01TI16_A13418AlbProID[0] ;
         A13442AlbProLine = T01TI16_A13442AlbProLine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
      }
   }

   public void scanEnd1TI1839( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1TI1839( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TI1839( )
   {
      /* Before Insert Rules */
      GXt_int21 = A13442AlbProLine ;
      GXv_int17[0] = GXt_int21 ;
      new app.stocksquimicos.documentotransporteproveedor_prxlinea(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_int17) ;
      documentotransporteproveedor_2_impl.this.GXt_int21 = GXv_int17[0] ;
      A13442AlbProLine = GXt_int21 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
   }

   public void beforeUpdate1TI1839( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TI1839( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TI1839( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TI1839( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TI1839( )
   {
      edtavAlbproid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproid_Enabled), 5, 0), true);
      edtAlbProLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtAlbProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDsc_Enabled), 5, 0), true);
      edtAlbProCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCnt_Enabled), 5, 0), true);
      cmbAlbProUnd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProUnd.getEnabled(), 5, 0), true);
      edtAlbProCaja_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCaja_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCaja_Enabled), 5, 0), true);
      edtAlbProObsL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObsL_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TI1839( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProID), "ZZZZZZZ9")));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TI0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbProLinea,4,0))}, new String[] {"Gx_mode","EmprCod","AlbProID","AlbProLinea"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProID), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_2");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV30Pgmname, "")));
      forbiddenHiddens.add("AlbProNRef", GXutil.rtrim( localUtil.format( A13445AlbProNRef, "")));
      forbiddenHiddens.add("AlbProVRef", GXutil.rtrim( localUtil.format( A13446AlbProVRef, "")));
      forbiddenHiddens.add("AlbProPrvp", localUtil.format( A13852AlbProPrvp, "ZZZZZZ9.99999"));
      forbiddenHiddens.add("AlbProDto", localUtil.format( A13853AlbProDto, "ZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13418AlbProID", GXutil.ltrim( localUtil.ntoc( Z13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13442AlbProLine", GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13448AlbProDsc", GXutil.rtrim( Z13448AlbProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13443AlbProCnt", GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13444AlbProUnd", GXutil.rtrim( Z13444AlbProUnd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13449AlbProCaja", GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13447AlbProObsL", GXutil.rtrim( Z13447AlbProObsL));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13445AlbProNRef", GXutil.rtrim( Z13445AlbProNRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13446AlbProVRef", GXutil.rtrim( Z13446AlbProVRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13852AlbProPrvp", GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13853AlbProDto", GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "O719PrdNum", GXutil.rtrim( O719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "O13448AlbProDsc", GXutil.rtrim( O13448AlbProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "O13442AlbProLine", GXutil.ltrim( localUtil.ntoc( O13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13443AlbProCnt", GXutil.ltrim( localUtil.ntoc( O13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N719PrdNum", GXutil.rtrim( A719PrdNum));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV24PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV24PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROID", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROLINEA", GXutil.ltrim( localUtil.ntoc( AV9AlbProLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbProLinea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRDNUM", GXutil.rtrim( AV13Insert_PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCNTOLD", GXutil.ltrim( localUtil.ntoc( AV18AlbProCntold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROLINEAOLD", GXutil.ltrim( localUtil.ntoc( AV19AlbProLineaold, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPRODSCOLD", GXutil.rtrim( AV20AlbProDscold));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUMOLD", GXutil.rtrim( AV21PrdnumOld));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV16Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODATE", localUtil.dtoc( A13430AlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROTIPO", GXutil.rtrim( A13417AlbProTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCANT", GXutil.ltrim( localUtil.ntoc( AV28DevCant, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV15UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRCANT", AV22Msg_errcant);
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV17Station));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRONREF", GXutil.rtrim( A13445AlbProNRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROVREF", GXutil.rtrim( A13446AlbProVRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVP", GXutil.ltrim( localUtil.ntoc( A13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODTO", GXutil.ltrim( localUtil.ntoc( A13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      return formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbProLinea,4,0))}, new String[] {"Gx_mode","EmprCod","AlbProID","AlbProLinea"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.DocumentoTransporteProveedor_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Transporte Proveedor", "") ;
   }

   public void initializeNonKey1TI1839( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      AV18AlbProCntold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
      AV19AlbProLineaold = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProLineaold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProLineaold), 4, 0));
      AV20AlbProDscold = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProDscold", AV20AlbProDscold);
      AV21PrdnumOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdnumOld", AV21PrdnumOld);
      AV22Msg_errcant = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
      AV16Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Inc_obs", AV16Inc_obs);
      A13443AlbProCnt = DecimalUtil.ZERO ;
      n13443AlbProCnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
      A13447AlbProObsL = "" ;
      n13447AlbProObsL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13447AlbProObsL", A13447AlbProObsL);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A13445AlbProNRef = "" ;
      n13445AlbProNRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13445AlbProNRef", A13445AlbProNRef);
      A13446AlbProVRef = "" ;
      n13446AlbProVRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13446AlbProVRef", A13446AlbProVRef);
      A13852AlbProPrvp = DecimalUtil.ZERO ;
      n13852AlbProPrvp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13852AlbProPrvp", GXutil.ltrimstr( A13852AlbProPrvp, 13, 5));
      A13853AlbProDto = DecimalUtil.ZERO ;
      n13853AlbProDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13853AlbProDto", GXutil.ltrimstr( A13853AlbProDto, 6, 2));
      A13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
      A13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
      A13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
      O719PrdNum = A719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      O13448AlbProDsc = A13448AlbProDsc ;
      n13448AlbProDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", A13448AlbProDsc);
      O13443AlbProCnt = A13443AlbProCnt ;
      n13443AlbProCnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
      Z13448AlbProDsc = "" ;
      Z13443AlbProCnt = DecimalUtil.ZERO ;
      Z13444AlbProUnd = "" ;
      Z13449AlbProCaja = (short)(0) ;
      Z13447AlbProObsL = "" ;
      Z13445AlbProNRef = "" ;
      Z13446AlbProVRef = "" ;
      Z13852AlbProPrvp = DecimalUtil.ZERO ;
      Z13853AlbProDto = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll1TI1839( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A13418AlbProID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      A13442AlbProLine = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
      initializeNonKey1TI1839( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13449AlbProCaja = i13449AlbProCaja ;
      n13449AlbProCaja = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13449AlbProCaja", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13449AlbProCaja), 4, 0));
      A13444AlbProUnd = i13444AlbProUnd ;
      n13444AlbProUnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610567", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/documentotransporteproveedor_2.js", "?20268211610568", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavAlbproid_Internalname = "vALBPROID" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtAlbProLine_Internalname = "ALBPROLINE" ;
      lblTextblockprdnum_Internalname = "TEXTBLOCKPRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtAlbProDsc_Internalname = "ALBPRODSC" ;
      edtAlbProCnt_Internalname = "ALBPROCNT" ;
      cmbAlbProUnd.setInternalname( "ALBPROUND" );
      edtAlbProCaja_Internalname = "ALBPROCAJA" ;
      edtAlbProObsL_Internalname = "ALBPROOBSL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprdnum_Internalname = "vCOMBOPRDNUM" ;
      divSectionattribute_prdnum_Internalname = "SECTIONATTRIBUTE_PRDNUM" ;
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
      Form.setCaption( httpContext.getMessage( "Documento Transporte Proveedor", "") );
      edtavComboprdnum_Jsonclick = "" ;
      edtavComboprdnum_Enabled = 0 ;
      edtavComboprdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable1_Height = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbProObsL_Jsonclick = "" ;
      edtAlbProObsL_Enabled = 1 ;
      edtAlbProCaja_Jsonclick = "" ;
      edtAlbProCaja_Enabled = 1 ;
      cmbAlbProUnd.setJsonclick( "" );
      cmbAlbProUnd.setEnabled( 1 );
      edtAlbProCnt_Jsonclick = "" ;
      edtAlbProCnt_Enabled = 1 ;
      edtAlbProDsc_Jsonclick = "" ;
      edtAlbProDsc_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdNum_Visible = 1 ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_Caption = "" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      edtAlbProLine_Jsonclick = "" ;
      edtAlbProLine_Enabled = 0 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtavAlbproid_Jsonclick = "" ;
      edtavAlbproid_Enabled = 0 ;
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

   public void gx6asaalbproline1TI1839( short AV9AlbProLinea )
   {
      if ( ! (0==AV9AlbProLinea) )
      {
         A13442AlbProLine = AV9AlbProLinea ;
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asaalbproline1TI1839( String A396EmprCod ,
                                        int A13418AlbProID )
   {
      GXt_int21 = A13442AlbProLine ;
      GXv_int17[0] = GXt_int21 ;
      new app.stocksquimicos.documentotransporteproveedor_prxlinea(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_int17) ;
      documentotransporteproveedor_2_impl.this.GXt_int21 = GXv_int17[0] ;
      A13442AlbProLine = GXt_int21 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_1TI1839( )
   {
      if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV28DevCant == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = httpContext.getMessage( "INS", "") ;
         GXv_char16[0] = A719PrdNum ;
         GXv_int18[0] = A13418AlbProID ;
         GXv_date15[0] = A13430AlbProDate ;
         GXv_char6[0] = A13417AlbProTipo ;
         GXv_int17[0] = A13442AlbProLine ;
         GXv_int14[0] = A13419AlbProPrvI ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char5[0] = AV15UsurCod ;
         GXv_char4[0] = "" ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_char16, GXv_int18, GXv_date15, GXv_char6, GXv_int17, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_char5, GXv_char4) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char16[0] ;
         A13418AlbProID = GXv_int18[0] ;
         A13430AlbProDate = GXv_date15[0] ;
         A13417AlbProTipo = GXv_char6[0] ;
         A13442AlbProLine = GXv_int17[0] ;
         A13419AlbProPrvI = GXv_int14[0] ;
         A13443AlbProCnt = GXv_decimal13[0] ;
         AV15UsurCod = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
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

   public void xc_24_1TI1839( )
   {
      if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV28DevCant == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = httpContext.getMessage( "DLT", "") ;
         GXv_char16[0] = A719PrdNum ;
         GXv_int18[0] = A13418AlbProID ;
         GXv_date15[0] = A13430AlbProDate ;
         GXv_char6[0] = A13417AlbProTipo ;
         GXv_int17[0] = A13442AlbProLine ;
         GXv_int14[0] = A13419AlbProPrvI ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char5[0] = AV15UsurCod ;
         GXv_char4[0] = "" ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_char16, GXv_int18, GXv_date15, GXv_char6, GXv_int17, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_char5, GXv_char4) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char16[0] ;
         A13418AlbProID = GXv_int18[0] ;
         A13430AlbProDate = GXv_date15[0] ;
         A13417AlbProTipo = GXv_char6[0] ;
         A13442AlbProLine = GXv_int17[0] ;
         A13419AlbProPrvI = GXv_int14[0] ;
         AV15UsurCod = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
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

   public void xc_25_1TI1839( )
   {
      if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV28DevCant == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = httpContext.getMessage( "UPD", "") ;
         GXv_char16[0] = A719PrdNum ;
         GXv_int18[0] = A13418AlbProID ;
         GXv_date15[0] = A13430AlbProDate ;
         GXv_char6[0] = A13417AlbProTipo ;
         GXv_int17[0] = A13442AlbProLine ;
         GXv_int14[0] = A13419AlbProPrvI ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = AV18AlbProCntold ;
         GXv_char5[0] = AV15UsurCod ;
         GXv_char4[0] = "" ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_char16, GXv_int18, GXv_date15, GXv_char6, GXv_int17, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_char5, GXv_char4) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char16[0] ;
         A13418AlbProID = GXv_int18[0] ;
         A13430AlbProDate = GXv_date15[0] ;
         A13417AlbProTipo = GXv_char6[0] ;
         A13442AlbProLine = GXv_int17[0] ;
         A13419AlbProPrvI = GXv_int14[0] ;
         A13443AlbProCnt = GXv_decimal13[0] ;
         AV18AlbProCntold = GXv_decimal12[0] ;
         AV15UsurCod = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.ajax_rsp_assign_attri("", false, "A13442AlbProLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13442AlbProLine), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
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

   public void xc_26_1TI1839( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              java.math.BigDecimal A13443AlbProCnt ,
                              String AV22Msg_errcant )
   {
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char16[0] = AV22Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal13, GXv_decimal12, GXv_char16) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         A13443AlbProCnt = GXv_decimal13[0] ;
         AV22Msg_errcant = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV22Msg_errcant)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_27_1TI1839( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              java.math.BigDecimal A13443AlbProCnt ,
                              java.math.BigDecimal AV18AlbProCntold ,
                              String AV22Msg_errcant )
   {
      if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = AV18AlbProCntold ;
         GXv_char16[0] = AV22Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal13, GXv_decimal12, GXv_char16) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         A13443AlbProCnt = GXv_decimal13[0] ;
         AV18AlbProCntold = GXv_decimal12[0] ;
         AV22Msg_errcant = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrimstr( A13443AlbProCnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrimstr( AV18AlbProCntold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV18AlbProCntold, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV22Msg_errcant)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_30_1TI1839( String A396EmprCod ,
                              String AV30Pgmname ,
                              String AV15UsurCod ,
                              String AV17Station ,
                              String AV16Inc_obs ,
                              int A13418AlbProID ,
                              String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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

   public void xc_31_1TI1839( String A396EmprCod ,
                              String AV30Pgmname ,
                              String AV15UsurCod ,
                              String AV17Station ,
                              String AV16Inc_obs ,
                              int A13418AlbProID ,
                              String A719PrdNum )
   {
      if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV15UsurCod, AV17Station, AV16Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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

   public void init_web_controls( )
   {
      cmbAlbProUnd.setName( "ALBPROUND" );
      cmbAlbProUnd.setWebtags( "" );
      cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A13444AlbProUnd)==0) )
         {
            A13444AlbProUnd = " " ;
            n13444AlbProUnd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13444AlbProUnd", A13444AlbProUnd);
         }
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

   public void valid_Albproline( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV19AlbProLineaold = O13442AlbProLine ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProLineaold", GXutil.ltrim( localUtil.ntoc( AV19AlbProLineaold, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      n13448AlbProDsc = false ;
      /* Using cursor T01TI15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01TI15_A718PrdNom[0] ;
      A704PrdExiAlm = T01TI15_A704PrdExiAlm[0] ;
      pr_default.close(13);
      if ( isIns( )  && (GXutil.strcmp("", A13448AlbProDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A13448AlbProDsc = A718PrdNom ;
         n13448AlbProDsc = false ;
      }
      AV21PrdnumOld = O719PrdNum ;
      if ( ( GXutil.strcmp(A719PrdNum, AV21PrdnumOld) != 0 ) && ( GXutil.strcmp(AV21PrdnumOld, " ") != 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se puede modificar el Producto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", GXutil.rtrim( A13448AlbProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdnumOld", GXutil.rtrim( AV21PrdnumOld));
   }

   public void valid_Albprodsc( )
   {
      n13448AlbProDsc = false ;
      AV20AlbProDscold = O13448AlbProDsc ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProDscold", GXutil.rtrim( AV20AlbProDscold));
   }

   public void valid_Albprocnt( )
   {
      n13443AlbProCnt = false ;
      AV18AlbProCntold = O13443AlbProCnt ;
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char16[0] = AV22Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal13, GXv_decimal12, GXv_char16) ;
         documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char19[0] ;
         A719PrdNum = this.A719PrdNum ;
         documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
         A13443AlbProCnt = this.A13443AlbProCnt ;
         documentotransporteproveedor_2_impl.this.AV22Msg_errcant = GXv_char16[0] ;
         AV22Msg_errcant = this.AV22Msg_errcant ;
      }
      if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal13[0] = A13443AlbProCnt ;
         GXv_decimal12[0] = AV18AlbProCntold ;
         GXv_char16[0] = AV22Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal13, GXv_decimal12, GXv_char16) ;
         documentotransporteproveedor_2_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         documentotransporteproveedor_2_impl.this.A719PrdNum = GXv_char19[0] ;
         A719PrdNum = this.A719PrdNum ;
         documentotransporteproveedor_2_impl.this.A13443AlbProCnt = GXv_decimal13[0] ;
         A13443AlbProCnt = this.A13443AlbProCnt ;
         documentotransporteproveedor_2_impl.this.AV18AlbProCntold = GXv_decimal12[0] ;
         AV18AlbProCntold = this.AV18AlbProCntold ;
         documentotransporteproveedor_2_impl.this.AV22Msg_errcant = GXv_char16[0] ;
         AV22Msg_errcant = this.AV22Msg_errcant ;
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) && ( GXutil.strcmp(AV22Msg_errcant, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV22Msg_errcant, 0, "ALBPROCNT");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProCntold", GXutil.ltrim( localUtil.ntoc( AV18AlbProCntold, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_errcant", AV22Msg_errcant);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9',hsh:true},{av:'AV8AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'AV30Pgmname',fld:'vPGMNAME',pic:''},{av:'A13445AlbProNRef',fld:'ALBPRONREF',pic:''},{av:'A13446AlbProVRef',fld:'ALBPROVREF',pic:''},{av:'A13852AlbProPrvp',fld:'ALBPROPRVP',pic:'ZZZZZZ9.99999'},{av:'A13853AlbProDto',fld:'ALBPRODTO',pic:'ZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TI2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALIDV_ALBPROID","{handler:'validv_Albproid',iparms:[]");
      setEventMetadata("VALIDV_ALBPROID",",oparms:[]}");
      setEventMetadata("VALID_ALBPROLINE","{handler:'valid_Albproline',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O13442AlbProLine'},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9'},{av:'AV19AlbProLineaold',fld:'vALBPROLINEAOLD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBPROLINE",",oparms:[{av:'AV19AlbProLineaold',fld:'vALBPROLINEAOLD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O719PrdNum'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV21PrdnumOld',fld:'vPRDNUMOLD',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A13448AlbProDsc',fld:'ALBPRODSC',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A13448AlbProDsc',fld:'ALBPRODSC',pic:''},{av:'AV21PrdnumOld',fld:'vPRDNUMOLD',pic:''}]}");
      setEventMetadata("VALID_ALBPRODSC","{handler:'valid_Albprodsc',iparms:[{av:'O13448AlbProDsc'},{av:'A13448AlbProDsc',fld:'ALBPRODSC',pic:''},{av:'AV20AlbProDscold',fld:'vALBPRODSCOLD',pic:''}]");
      setEventMetadata("VALID_ALBPRODSC",",oparms:[{av:'AV20AlbProDscold',fld:'vALBPRODSCOLD',pic:''}]}");
      setEventMetadata("VALID_ALBPROCNT","{handler:'valid_Albprocnt',iparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O13443AlbProCnt'},{av:'A13443AlbProCnt',fld:'ALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV18AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV22Msg_errcant',fld:'vMSG_ERRCANT',pic:''}]");
      setEventMetadata("VALID_ALBPROCNT",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13443AlbProCnt',fld:'ALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV18AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV22Msg_errcant',fld:'vMSG_ERRCANT',pic:''}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPRDNUM","{handler:'validv_Comboprdnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRDNUM",",oparms:[]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z13448AlbProDsc = "" ;
      Z13443AlbProCnt = DecimalUtil.ZERO ;
      Z13444AlbProUnd = "" ;
      Z13447AlbProObsL = "" ;
      Z13445AlbProNRef = "" ;
      Z13446AlbProVRef = "" ;
      Z13852AlbProPrvp = DecimalUtil.ZERO ;
      Z13853AlbProDto = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O719PrdNum = "" ;
      O13448AlbProDsc = "" ;
      O13443AlbProCnt = DecimalUtil.ZERO ;
      N719PrdNum = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      AV22Msg_errcant = "" ;
      AV18AlbProCntold = DecimalUtil.ZERO ;
      AV30Pgmname = "" ;
      AV15UsurCod = "" ;
      AV17Station = "" ;
      AV16Inc_obs = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13444AlbProUnd = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockprdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      AV27DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV24PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A13448AlbProDsc = "" ;
      A13447AlbProObsL = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV26ComboPrdNum = "" ;
      A13445AlbProNRef = "" ;
      A13446AlbProVRef = "" ;
      A13852AlbProPrvp = DecimalUtil.ZERO ;
      A13853AlbProDto = DecimalUtil.ZERO ;
      AV13Insert_PrdNum = "" ;
      AV20AlbProDscold = "" ;
      AV21PrdnumOld = "" ;
      A718PrdNom = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13417AlbProTipo = "" ;
      A407EmprNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1839 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXv_int2 = new byte[1] ;
      GXt_char3 = "" ;
      AV31Emprnom = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV25ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z13417AlbProTipo = "" ;
      Z13430AlbProDate = GXutil.nullDate() ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      T01TI4_A407EmprNom = new String[] {""} ;
      T01TI4_n407EmprNom = new boolean[] {false} ;
      T01TI6_A13417AlbProTipo = new String[] {""} ;
      T01TI6_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01TI6_A13419AlbProPrvI = new int[1] ;
      T01TI5_A718PrdNom = new String[] {""} ;
      T01TI5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI7_A13442AlbProLine = new short[1] ;
      T01TI7_A407EmprNom = new String[] {""} ;
      T01TI7_n407EmprNom = new boolean[] {false} ;
      T01TI7_A13417AlbProTipo = new String[] {""} ;
      T01TI7_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01TI7_A13448AlbProDsc = new String[] {""} ;
      T01TI7_n13448AlbProDsc = new boolean[] {false} ;
      T01TI7_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI7_n13443AlbProCnt = new boolean[] {false} ;
      T01TI7_A13444AlbProUnd = new String[] {""} ;
      T01TI7_n13444AlbProUnd = new boolean[] {false} ;
      T01TI7_A13449AlbProCaja = new short[1] ;
      T01TI7_n13449AlbProCaja = new boolean[] {false} ;
      T01TI7_A13447AlbProObsL = new String[] {""} ;
      T01TI7_n13447AlbProObsL = new boolean[] {false} ;
      T01TI7_A718PrdNom = new String[] {""} ;
      T01TI7_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI7_A13445AlbProNRef = new String[] {""} ;
      T01TI7_n13445AlbProNRef = new boolean[] {false} ;
      T01TI7_A13446AlbProVRef = new String[] {""} ;
      T01TI7_n13446AlbProVRef = new boolean[] {false} ;
      T01TI7_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI7_n13852AlbProPrvp = new boolean[] {false} ;
      T01TI7_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI7_n13853AlbProDto = new boolean[] {false} ;
      T01TI7_A396EmprCod = new String[] {""} ;
      T01TI7_A719PrdNum = new String[] {""} ;
      T01TI7_A13418AlbProID = new int[1] ;
      T01TI7_A13419AlbProPrvI = new int[1] ;
      T01TI8_A718PrdNom = new String[] {""} ;
      T01TI8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI9_A396EmprCod = new String[] {""} ;
      T01TI9_A13418AlbProID = new int[1] ;
      T01TI9_A13442AlbProLine = new short[1] ;
      T01TI3_A13442AlbProLine = new short[1] ;
      T01TI3_A13448AlbProDsc = new String[] {""} ;
      T01TI3_n13448AlbProDsc = new boolean[] {false} ;
      T01TI3_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI3_n13443AlbProCnt = new boolean[] {false} ;
      T01TI3_A13444AlbProUnd = new String[] {""} ;
      T01TI3_n13444AlbProUnd = new boolean[] {false} ;
      T01TI3_A13449AlbProCaja = new short[1] ;
      T01TI3_n13449AlbProCaja = new boolean[] {false} ;
      T01TI3_A13447AlbProObsL = new String[] {""} ;
      T01TI3_n13447AlbProObsL = new boolean[] {false} ;
      T01TI3_A13445AlbProNRef = new String[] {""} ;
      T01TI3_n13445AlbProNRef = new boolean[] {false} ;
      T01TI3_A13446AlbProVRef = new String[] {""} ;
      T01TI3_n13446AlbProVRef = new boolean[] {false} ;
      T01TI3_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI3_n13852AlbProPrvp = new boolean[] {false} ;
      T01TI3_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI3_n13853AlbProDto = new boolean[] {false} ;
      T01TI3_A396EmprCod = new String[] {""} ;
      T01TI3_A719PrdNum = new String[] {""} ;
      T01TI3_A13418AlbProID = new int[1] ;
      T01TI10_A396EmprCod = new String[] {""} ;
      T01TI10_A13418AlbProID = new int[1] ;
      T01TI10_A13442AlbProLine = new short[1] ;
      T01TI11_A396EmprCod = new String[] {""} ;
      T01TI11_A13418AlbProID = new int[1] ;
      T01TI11_A13442AlbProLine = new short[1] ;
      T01TI2_A13442AlbProLine = new short[1] ;
      T01TI2_A13448AlbProDsc = new String[] {""} ;
      T01TI2_n13448AlbProDsc = new boolean[] {false} ;
      T01TI2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI2_n13443AlbProCnt = new boolean[] {false} ;
      T01TI2_A13444AlbProUnd = new String[] {""} ;
      T01TI2_n13444AlbProUnd = new boolean[] {false} ;
      T01TI2_A13449AlbProCaja = new short[1] ;
      T01TI2_n13449AlbProCaja = new boolean[] {false} ;
      T01TI2_A13447AlbProObsL = new String[] {""} ;
      T01TI2_n13447AlbProObsL = new boolean[] {false} ;
      T01TI2_A13445AlbProNRef = new String[] {""} ;
      T01TI2_n13445AlbProNRef = new boolean[] {false} ;
      T01TI2_A13446AlbProVRef = new String[] {""} ;
      T01TI2_n13446AlbProVRef = new boolean[] {false} ;
      T01TI2_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI2_n13852AlbProPrvp = new boolean[] {false} ;
      T01TI2_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI2_n13853AlbProDto = new boolean[] {false} ;
      T01TI2_A396EmprCod = new String[] {""} ;
      T01TI2_A719PrdNum = new String[] {""} ;
      T01TI2_A13418AlbProID = new int[1] ;
      T01TI15_A718PrdNom = new String[] {""} ;
      T01TI15_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TI16_A396EmprCod = new String[] {""} ;
      T01TI16_A13418AlbProID = new int[1] ;
      T01TI16_A13442AlbProLine = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13444AlbProUnd = "" ;
      GXv_int18 = new int[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_char6 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_int14 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      ZV21PrdnumOld = "" ;
      ZV20AlbProDscold = "" ;
      GXv_char20 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char16 = new String[1] ;
      ZV18AlbProCntold = DecimalUtil.ZERO ;
      ZV22Msg_errcant = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_2__default(),
         new Object[] {
             new Object[] {
            T01TI2_A13442AlbProLine, T01TI2_A13448AlbProDsc, T01TI2_n13448AlbProDsc, T01TI2_A13443AlbProCnt, T01TI2_n13443AlbProCnt, T01TI2_A13444AlbProUnd, T01TI2_n13444AlbProUnd, T01TI2_A13449AlbProCaja, T01TI2_n13449AlbProCaja, T01TI2_A13447AlbProObsL,
            T01TI2_n13447AlbProObsL, T01TI2_A13445AlbProNRef, T01TI2_n13445AlbProNRef, T01TI2_A13446AlbProVRef, T01TI2_n13446AlbProVRef, T01TI2_A13852AlbProPrvp, T01TI2_n13852AlbProPrvp, T01TI2_A13853AlbProDto, T01TI2_n13853AlbProDto, T01TI2_A396EmprCod,
            T01TI2_A719PrdNum, T01TI2_A13418AlbProID
            }
            , new Object[] {
            T01TI3_A13442AlbProLine, T01TI3_A13448AlbProDsc, T01TI3_n13448AlbProDsc, T01TI3_A13443AlbProCnt, T01TI3_n13443AlbProCnt, T01TI3_A13444AlbProUnd, T01TI3_n13444AlbProUnd, T01TI3_A13449AlbProCaja, T01TI3_n13449AlbProCaja, T01TI3_A13447AlbProObsL,
            T01TI3_n13447AlbProObsL, T01TI3_A13445AlbProNRef, T01TI3_n13445AlbProNRef, T01TI3_A13446AlbProVRef, T01TI3_n13446AlbProVRef, T01TI3_A13852AlbProPrvp, T01TI3_n13852AlbProPrvp, T01TI3_A13853AlbProDto, T01TI3_n13853AlbProDto, T01TI3_A396EmprCod,
            T01TI3_A719PrdNum, T01TI3_A13418AlbProID
            }
            , new Object[] {
            T01TI4_A407EmprNom, T01TI4_n407EmprNom
            }
            , new Object[] {
            T01TI5_A718PrdNom, T01TI5_A704PrdExiAlm
            }
            , new Object[] {
            T01TI6_A13417AlbProTipo, T01TI6_A13430AlbProDate, T01TI6_A13419AlbProPrvI
            }
            , new Object[] {
            T01TI7_A13442AlbProLine, T01TI7_A407EmprNom, T01TI7_n407EmprNom, T01TI7_A13417AlbProTipo, T01TI7_A13430AlbProDate, T01TI7_A13448AlbProDsc, T01TI7_n13448AlbProDsc, T01TI7_A13443AlbProCnt, T01TI7_n13443AlbProCnt, T01TI7_A13444AlbProUnd,
            T01TI7_n13444AlbProUnd, T01TI7_A13449AlbProCaja, T01TI7_n13449AlbProCaja, T01TI7_A13447AlbProObsL, T01TI7_n13447AlbProObsL, T01TI7_A718PrdNom, T01TI7_A704PrdExiAlm, T01TI7_A13445AlbProNRef, T01TI7_n13445AlbProNRef, T01TI7_A13446AlbProVRef,
            T01TI7_n13446AlbProVRef, T01TI7_A13852AlbProPrvp, T01TI7_n13852AlbProPrvp, T01TI7_A13853AlbProDto, T01TI7_n13853AlbProDto, T01TI7_A396EmprCod, T01TI7_A719PrdNum, T01TI7_A13418AlbProID, T01TI7_A13419AlbProPrvI
            }
            , new Object[] {
            T01TI8_A718PrdNom, T01TI8_A704PrdExiAlm
            }
            , new Object[] {
            T01TI9_A396EmprCod, T01TI9_A13418AlbProID, T01TI9_A13442AlbProLine
            }
            , new Object[] {
            T01TI10_A396EmprCod, T01TI10_A13418AlbProID, T01TI10_A13442AlbProLine
            }
            , new Object[] {
            T01TI11_A396EmprCod, T01TI11_A13418AlbProID, T01TI11_A13442AlbProLine
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TI15_A718PrdNom, T01TI15_A704PrdExiAlm
            }
            , new Object[] {
            T01TI16_A396EmprCod, T01TI16_A13418AlbProID, T01TI16_A13442AlbProLine
            }
         }
      );
      AV30Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_2" ;
      Z13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      A13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      i13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      Z13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      A13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      i13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      Z13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      O13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      A13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte gxajaxcallmode ;
   private short wcpOAV9AlbProLinea ;
   private short Z13442AlbProLine ;
   private short Z13449AlbProCaja ;
   private short O13442AlbProLine ;
   private short AV9AlbProLinea ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short AV19AlbProLineaold ;
   private short AV28DevCant ;
   private short RcdFound1839 ;
   private short nIsDirty_1839 ;
   private short i13449AlbProCaja ;
   private short GXt_int21 ;
   private short GXv_int17[] ;
   private short ZV19AlbProLineaold ;
   private int wcpOAV8AlbProID ;
   private int Z13418AlbProID ;
   private int A13418AlbProID ;
   private int AV8AlbProID ;
   private int trnEnded ;
   private int edtavAlbproid_Enabled ;
   private int edtAlbProLine_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtAlbProDsc_Enabled ;
   private int edtAlbProCnt_Enabled ;
   private int edtAlbProCaja_Enabled ;
   private int edtAlbProObsL_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int divUnnamedtable1_Height ;
   private int edtavPgmname_Enabled ;
   private int edtavComboprdnum_Visible ;
   private int edtavComboprdnum_Enabled ;
   private int A13419AlbProPrvI ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int AV32GXV1 ;
   private int GX_JID ;
   private int Z13419AlbProPrvI ;
   private int idxLst ;
   private int GXv_int18[] ;
   private int GXv_int14[] ;
   private java.math.BigDecimal Z13443AlbProCnt ;
   private java.math.BigDecimal Z13852AlbProPrvp ;
   private java.math.BigDecimal Z13853AlbProDto ;
   private java.math.BigDecimal O13443AlbProCnt ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal AV18AlbProCntold ;
   private java.math.BigDecimal A13852AlbProPrvp ;
   private java.math.BigDecimal A13853AlbProDto ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal ZV18AlbProCntold ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z13448AlbProDsc ;
   private String Z13444AlbProUnd ;
   private String Z13447AlbProObsL ;
   private String Z13445AlbProNRef ;
   private String Z13446AlbProVRef ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String O13448AlbProDsc ;
   private String N719PrdNum ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV30Pgmname ;
   private String AV15UsurCod ;
   private String AV17Station ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
   private String A13444AlbProUnd ;
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
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbproid_Internalname ;
   private String edtavAlbproid_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtAlbProLine_Internalname ;
   private String edtAlbProLine_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockprdnum_Internalname ;
   private String lblTextblockprdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtAlbProDsc_Internalname ;
   private String A13448AlbProDsc ;
   private String edtAlbProDsc_Jsonclick ;
   private String edtAlbProCnt_Internalname ;
   private String edtAlbProCnt_Jsonclick ;
   private String edtAlbProCaja_Internalname ;
   private String edtAlbProCaja_Jsonclick ;
   private String edtAlbProObsL_Internalname ;
   private String A13447AlbProObsL ;
   private String edtAlbProObsL_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prdnum_Internalname ;
   private String edtavComboprdnum_Internalname ;
   private String AV26ComboPrdNum ;
   private String edtavComboprdnum_Jsonclick ;
   private String A13445AlbProNRef ;
   private String A13446AlbProVRef ;
   private String AV13Insert_PrdNum ;
   private String AV20AlbProDscold ;
   private String AV21PrdnumOld ;
   private String A718PrdNom ;
   private String A13417AlbProTipo ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String hsh ;
   private String sMode1839 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXt_char3 ;
   private String AV31Emprnom ;
   private String Z407EmprNom ;
   private String Z13417AlbProTipo ;
   private String Z718PrdNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13444AlbProUnd ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String ZV21PrdnumOld ;
   private String ZV20AlbProDscold ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char16[] ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date Z13430AlbProDate ;
   private java.util.Date GXv_date15[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13443AlbProCnt ;
   private boolean wbErr ;
   private boolean n13444AlbProUnd ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean n13445AlbProNRef ;
   private boolean n13446AlbProVRef ;
   private boolean n13852AlbProPrvp ;
   private boolean n13853AlbProDto ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean n13448AlbProDsc ;
   private boolean n13449AlbProCaja ;
   private boolean n13447AlbProObsL ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV22Msg_errcant ;
   private String AV16Inc_obs ;
   private String AV25ComboSelectedValue ;
   private String ZV22Msg_errcant ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbProUnd ;
   private IDataStoreProvider pr_default ;
   private String[] T01TI4_A407EmprNom ;
   private boolean[] T01TI4_n407EmprNom ;
   private String[] T01TI6_A13417AlbProTipo ;
   private java.util.Date[] T01TI6_A13430AlbProDate ;
   private int[] T01TI6_A13419AlbProPrvI ;
   private String[] T01TI5_A718PrdNom ;
   private java.math.BigDecimal[] T01TI5_A704PrdExiAlm ;
   private short[] T01TI7_A13442AlbProLine ;
   private String[] T01TI7_A407EmprNom ;
   private boolean[] T01TI7_n407EmprNom ;
   private String[] T01TI7_A13417AlbProTipo ;
   private java.util.Date[] T01TI7_A13430AlbProDate ;
   private String[] T01TI7_A13448AlbProDsc ;
   private boolean[] T01TI7_n13448AlbProDsc ;
   private java.math.BigDecimal[] T01TI7_A13443AlbProCnt ;
   private boolean[] T01TI7_n13443AlbProCnt ;
   private String[] T01TI7_A13444AlbProUnd ;
   private boolean[] T01TI7_n13444AlbProUnd ;
   private short[] T01TI7_A13449AlbProCaja ;
   private boolean[] T01TI7_n13449AlbProCaja ;
   private String[] T01TI7_A13447AlbProObsL ;
   private boolean[] T01TI7_n13447AlbProObsL ;
   private String[] T01TI7_A718PrdNom ;
   private java.math.BigDecimal[] T01TI7_A704PrdExiAlm ;
   private String[] T01TI7_A13445AlbProNRef ;
   private boolean[] T01TI7_n13445AlbProNRef ;
   private String[] T01TI7_A13446AlbProVRef ;
   private boolean[] T01TI7_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01TI7_A13852AlbProPrvp ;
   private boolean[] T01TI7_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01TI7_A13853AlbProDto ;
   private boolean[] T01TI7_n13853AlbProDto ;
   private String[] T01TI7_A396EmprCod ;
   private String[] T01TI7_A719PrdNum ;
   private int[] T01TI7_A13418AlbProID ;
   private int[] T01TI7_A13419AlbProPrvI ;
   private String[] T01TI8_A718PrdNom ;
   private java.math.BigDecimal[] T01TI8_A704PrdExiAlm ;
   private String[] T01TI9_A396EmprCod ;
   private int[] T01TI9_A13418AlbProID ;
   private short[] T01TI9_A13442AlbProLine ;
   private short[] T01TI3_A13442AlbProLine ;
   private String[] T01TI3_A13448AlbProDsc ;
   private boolean[] T01TI3_n13448AlbProDsc ;
   private java.math.BigDecimal[] T01TI3_A13443AlbProCnt ;
   private boolean[] T01TI3_n13443AlbProCnt ;
   private String[] T01TI3_A13444AlbProUnd ;
   private boolean[] T01TI3_n13444AlbProUnd ;
   private short[] T01TI3_A13449AlbProCaja ;
   private boolean[] T01TI3_n13449AlbProCaja ;
   private String[] T01TI3_A13447AlbProObsL ;
   private boolean[] T01TI3_n13447AlbProObsL ;
   private String[] T01TI3_A13445AlbProNRef ;
   private boolean[] T01TI3_n13445AlbProNRef ;
   private String[] T01TI3_A13446AlbProVRef ;
   private boolean[] T01TI3_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01TI3_A13852AlbProPrvp ;
   private boolean[] T01TI3_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01TI3_A13853AlbProDto ;
   private boolean[] T01TI3_n13853AlbProDto ;
   private String[] T01TI3_A396EmprCod ;
   private String[] T01TI3_A719PrdNum ;
   private int[] T01TI3_A13418AlbProID ;
   private String[] T01TI10_A396EmprCod ;
   private int[] T01TI10_A13418AlbProID ;
   private short[] T01TI10_A13442AlbProLine ;
   private String[] T01TI11_A396EmprCod ;
   private int[] T01TI11_A13418AlbProID ;
   private short[] T01TI11_A13442AlbProLine ;
   private short[] T01TI2_A13442AlbProLine ;
   private String[] T01TI2_A13448AlbProDsc ;
   private boolean[] T01TI2_n13448AlbProDsc ;
   private java.math.BigDecimal[] T01TI2_A13443AlbProCnt ;
   private boolean[] T01TI2_n13443AlbProCnt ;
   private String[] T01TI2_A13444AlbProUnd ;
   private boolean[] T01TI2_n13444AlbProUnd ;
   private short[] T01TI2_A13449AlbProCaja ;
   private boolean[] T01TI2_n13449AlbProCaja ;
   private String[] T01TI2_A13447AlbProObsL ;
   private boolean[] T01TI2_n13447AlbProObsL ;
   private String[] T01TI2_A13445AlbProNRef ;
   private boolean[] T01TI2_n13445AlbProNRef ;
   private String[] T01TI2_A13446AlbProVRef ;
   private boolean[] T01TI2_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01TI2_A13852AlbProPrvp ;
   private boolean[] T01TI2_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01TI2_A13853AlbProDto ;
   private boolean[] T01TI2_n13853AlbProDto ;
   private String[] T01TI2_A396EmprCod ;
   private String[] T01TI2_A719PrdNum ;
   private int[] T01TI2_A13418AlbProID ;
   private String[] T01TI15_A718PrdNom ;
   private java.math.BigDecimal[] T01TI15_A704PrdExiAlm ;
   private String[] T01TI16_A396EmprCod ;
   private int[] T01TI16_A13418AlbProID ;
   private short[] T01TI16_A13442AlbProLine ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV27DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class documentotransporteproveedor_2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TI2", "SELECT AlbProLine, AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, EmprCod, PrdNum, AlbProID FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?  FOR UPDATE OF AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI3", "SELECT AlbProLine, AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, EmprCod, PrdNum, AlbProID FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI5", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI6", "SELECT AlbProTipo, AlbProDate, AlbProPrvI FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI7", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbProLine, T2.EmprNom, T3.AlbProTipo, T3.AlbProDate, TM1.AlbProDsc, TM1.AlbProCnt, TM1.AlbProUnd, TM1.AlbProCaja, TM1.AlbProObsL, T4.PrdNom, T4.PrdExiAlm, TM1.AlbProNRef, TM1.AlbProVRef, TM1.AlbProPrvp, TM1.AlbProDto, TM1.EmprCod, TM1.PrdNum, TM1.AlbProID, T3.AlbProPrvI FROM (((TXPLALPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCALPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProID = TM1.AlbProID) INNER JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.AlbProID = ? and TM1.AlbProLine = ? ORDER BY TM1.EmprCod, TM1.AlbProID, TM1.AlbProLine ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI8", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE ( EmprCod > ? or EmprCod = ? and AlbProID > ? or AlbProID = ? and EmprCod = ? and AlbProLine > ?) ORDER BY EmprCod, AlbProID, AlbProLine) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TI11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE ( EmprCod < ? or EmprCod = ? and AlbProID < ? or AlbProID = ? and EmprCod = ? and AlbProLine < ?) ORDER BY EmprCod DESC, AlbProID DESC, AlbProLine DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TI12", "INSERT INTO TXPLALPRO(AlbProLine, AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, EmprCod, PrdNum, AlbProID, AlbProLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPLALPRO")
         ,new UpdateCursor("T01TI13", "UPDATE TXPLALPRO SET AlbProDsc=?, AlbProCnt=?, AlbProUnd=?, AlbProCaja=?, AlbProObsL=?, AlbProNRef=?, AlbProVRef=?, AlbProPrvp=?, AlbProDto=?, PrdNum=?  WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?", GX_NOMASK, "TXPLALPRO")
         ,new UpdateCursor("T01TI14", "DELETE FROM TXPLALPRO  WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?", GX_NOMASK, "TXPLALPRO")
         ,new ForEachCursor("T01TI15", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TI16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProID, AlbProLine FROM TXPLALPRO ORDER BY EmprCod, AlbProID, AlbProLine ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((int[]) buf[21])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((int[]) buf[21])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 3);
               ((String[]) buf[26])[0] = rslt.getString(17, 6);
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((int[]) buf[28])[0] = rslt.getInt(19);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 60);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               stmt.setString(11, (String)parms[19], 3);
               stmt.setString(12, (String)parms[20], 6);
               stmt.setInt(13, ((Number) parms[21]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 60);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(10, (String)parms[18], 6);
               stmt.setString(11, (String)parms[19], 3);
               stmt.setInt(12, ((Number) parms[20]).intValue());
               stmt.setShort(13, ((Number) parms[21]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

