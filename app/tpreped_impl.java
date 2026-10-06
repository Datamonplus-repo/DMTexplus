package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpreped_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV24Proprv = (short)(GXutil.lval( httpContext.GetPar( "Proprv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Proprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Proprv), 4, 0));
         A756PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdnum210( A396EmprCod, AV24Proprv, A756PrePrvNum, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV24Proprv = (short)(GXutil.lval( httpContext.GetPar( "Proprv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Proprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Proprv), 4, 0));
         A756PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdnum210( A396EmprCod, AV24Proprv, A756PrePrvNum, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRDNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         AV24Proprv = (short)(GXutil.lval( httpContext.GetPar( "Proprv"))) ;
         A756PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
         h719PrdNum = httpContext.GetPar( "h719PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprdnum2186( A396EmprCod, AV24Proprv, A756PrePrvNum, h719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
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
         gxload_17( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A835TipDtoCod = (byte)(GXutil.lval( httpContext.GetPar( "TipDtoCod"))) ;
         n835TipDtoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A835TipDtoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A756PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A756PrePrvNum) ;
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
            AV16EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
            AV17PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17PrePrvNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPREPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17PrePrvNum), "ZZZZZ9")));
            AV18PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNum", AV18PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18PrdNum, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Realizacion Pedidos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrePrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tpreped_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpreped_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpreped_impl.class ));
   }

   public tpreped_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrePrvDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrePrvDsc_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrePrvDsc_Internalname, GXutil.rtrim( A13791PrePrvDsc), GXutil.rtrim( localUtil.format( A13791PrePrvDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrePrvDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrePrvDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreAct_Internalname, httpContext.getMessage( "Precio Actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDtoDto_Internalname, httpContext.getMessage( "Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoDto_Internalname, GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoDto_Enabled!=0) ? localUtil.format( A837TipDtoDto, "Z9.99") : localUtil.format( A837TipDtoDto, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtPrePrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrePrvNum_Internalname, httpContext.getMessage( "Proveedor", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrePrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A756PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrePrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrePrvNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREPED.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, h719PrdNum, GXutil.rtrim( localUtil.format( h719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtPrePedUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrePedUni_Internalname, httpContext.getMessage( "Unidades", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrePedUni_Internalname, GXutil.ltrim( localUtil.ntoc( A755PrePedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrePedUni_Enabled!=0) ? localUtil.format( A755PrePedUni, "ZZZZZ9.99") : localUtil.format( A755PrePedUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrePedUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrePedUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtPrePedPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrePedPre_Internalname, httpContext.getMessage( "Precio", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrePedPre_Internalname, GXutil.ltrim( localUtil.ntoc( A753PrePedPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrePedPre_Enabled!=0) ? localUtil.format( A753PrePedPre, "ZZZZZ9.999") : localUtil.format( A753PrePedPre, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrePedPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrePedPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtPrePedDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrePedDto_Internalname, httpContext.getMessage( "Descuento", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrePedDto_Internalname, GXutil.ltrim( localUtil.ntoc( A752PrePedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrePedDto_Enabled!=0) ? localUtil.format( A752PrePedDto, "Z9.99") : localUtil.format( A752PrePedDto, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrePedDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrePedDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREPED.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e11212 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z756PrePrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z756PrePrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z755PrePedUni = localUtil.ctond( httpContext.cgiGet( "Z755PrePedUni")) ;
            Z751PrePedCon = httpContext.cgiGet( "Z751PrePedCon") ;
            Z753PrePedPre = localUtil.ctond( httpContext.cgiGet( "Z753PrePedPre")) ;
            Z752PrePedDto = localUtil.ctond( httpContext.cgiGet( "Z752PrePedDto")) ;
            Z754PrePedPri = httpContext.cgiGet( "Z754PrePedPri") ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A751PrePedCon = httpContext.cgiGet( "Z751PrePedCon") ;
            n751PrePedCon = false ;
            A754PrePedPri = httpContext.cgiGet( "Z754PrePedPri") ;
            n754PrePedPri = false ;
            A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n658PedCod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "N658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV17PrePrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vPREPRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            A719PrdNum = httpContext.cgiGet( "GXHCPRDNUM") ;
            AV22Insert_PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PEDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Proprv = (short)(localUtil.ctol( httpContext.cgiGet( "vPROPRV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A751PrePedCon = httpContext.cgiGet( "PREPEDCON") ;
            A754PrePedPri = httpContext.cgiGet( "PREPEDPRI") ;
            A835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( "TIPDTOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A13791PrePrvDsc = httpContext.cgiGet( edtPrePrvDsc_Internalname) ;
            n13791PrePrvDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
            A837TipDtoDto = localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)) ;
            n837TipDtoDto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrePrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrePrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PREPRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrePrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A756PrePrvNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
            }
            else
            {
               A756PrePrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrePrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
            }
            h719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrePedUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrePedUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PREPEDUNI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrePedUni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A755PrePedUni = DecimalUtil.ZERO ;
               n755PrePedUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A755PrePedUni", GXutil.ltrimstr( A755PrePedUni, 9, 2));
            }
            else
            {
               A755PrePedUni = localUtil.ctond( httpContext.cgiGet( edtPrePedUni_Internalname)) ;
               n755PrePedUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A755PrePedUni", GXutil.ltrimstr( A755PrePedUni, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrePedPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrePedPre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PREPEDPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrePedPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A753PrePedPre = DecimalUtil.ZERO ;
               n753PrePedPre = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
            }
            else
            {
               A753PrePedPre = localUtil.ctond( httpContext.cgiGet( edtPrePedPre_Internalname)) ;
               n753PrePedPre = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrePedDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrePedDto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PREPEDDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrePedDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A752PrePedDto = DecimalUtil.ZERO ;
               n752PrePedDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
            }
            else
            {
               A752PrePedDto = localUtil.ctond( httpContext.cgiGet( edtPrePedDto_Internalname)) ;
               n752PrePedDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPREPED");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("PrePedCon", GXutil.rtrim( localUtil.format( A751PrePedCon, "@!")));
            forbiddenHiddens.add("PrePedPri", GXutil.rtrim( localUtil.format( A754PrePedPri, "9")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A756PrePrvNum != Z756PrePrvNum ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpreped:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A756PrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrePrvNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
                  sMode86 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode86 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound86 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_210( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PREPRVNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrePrvNum_Internalname ;
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
                        e11212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12212 ();
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
         e12212 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2186( ) ;
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
         disableAttributes2186( ) ;
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

   public void confirm_210( )
   {
      beforeValidate2186( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2186( ) ;
         }
         else
         {
            checkExtendedTable2186( ) ;
            closeExtendedTableCursors2186( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption210( )
   {
   }

   public void e11212( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV24Proprv) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int2) ;
      tpreped_impl.this.GXt_int1 = GXv_int2[0] ;
      AV24Proprv = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Proprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Proprv), 4, 0));
      GXt_char3 = AV26Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tpreped_impl.this.GXt_char3 = GXv_char4[0] ;
      AV26Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char4[0] = AV16EmprCod ;
      GXv_char5[0] = AV27Emprnom ;
      GXv_char6[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char4, GXv_char5, GXv_char6) ;
      tpreped_impl.this.AV16EmprCod = GXv_char4[0] ;
      tpreped_impl.this.AV27Emprnom = GXv_char5[0] ;
      tpreped_impl.this.AV28Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprnom", AV27Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Usurcod", AV28Usurcod);
      GXv_SdtWWPContext7[0] = AV19WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV19WWPContext = GXv_SdtWWPContext7[0] ;
      AV20TrnContext.fromxml(AV21WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV20TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV29Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV30GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GXV1), 8, 0));
         while ( AV30GXV1 <= AV20TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV23TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV20TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV30GXV1));
            if ( GXutil.strcmp(AV23TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PedCod") == 0 )
            {
               AV22Insert_PedCod = (int)(GXutil.lval( AV23TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Insert_PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Insert_PedCod), 8, 0));
            }
            AV30GXV1 = (int)(AV30GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GXV1), 8, 0));
         }
      }
   }

   public void e12212( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV20TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tprepedww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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

   public void zm2186( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z755PrePedUni = T00213_A755PrePedUni[0] ;
            Z751PrePedCon = T00213_A751PrePedCon[0] ;
            Z753PrePedPre = T00213_A753PrePedPre[0] ;
            Z752PrePedDto = T00213_A752PrePedDto[0] ;
            Z754PrePedPri = T00213_A754PrePedPri[0] ;
            Z658PedCod = T00213_A658PedCod[0] ;
         }
         else
         {
            Z755PrePedUni = A755PrePedUni ;
            Z751PrePedCon = A751PrePedCon ;
            Z753PrePedPre = A753PrePedPre ;
            Z752PrePedDto = A752PrePedDto ;
            Z754PrePedPri = A754PrePedPri ;
            Z658PedCod = A658PedCod ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z756PrePrvNum = A756PrePrvNum ;
         Z755PrePedUni = A755PrePedUni ;
         Z751PrePedCon = A751PrePedCon ;
         Z753PrePedPre = A753PrePedPre ;
         Z752PrePedDto = A752PrePedDto ;
         Z754PrePedPri = A754PrePedPri ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z13791PrePrvDsc = A13791PrePrvDsc ;
         Z835TipDtoCod = A835TipDtoCod ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z837TipDtoDto = A837TipDtoDto ;
      }
   }

   public void standaloneNotModal( )
   {
      AV29Pgmname = "TPREPED" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV16EmprCod)==0) )
      {
         A396EmprCod = AV16EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (0==AV17PrePrvNum) )
      {
         A756PrePrvNum = AV17PrePrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
      }
      if ( ! (0==AV17PrePrvNum) )
      {
         edtPrePrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrePrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrePrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrePrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvNum_Enabled), 5, 0), true);
      }
      if ( ! (0==AV17PrePrvNum) )
      {
         edtPrePrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrePrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvNum_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV18PrdNum)==0) )
      {
         A719PrdNum = AV18PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         /* Using cursor T00217 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), A719PrdNum});
         h719PrdNum = "" ;
         while ( (pr_default.getStatus(5) != 101) )
         {
            h719PrdNum = T00217_A13747PrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(5);
         httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      }
      if ( ! (GXutil.strcmp("", AV18PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV18PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV22Insert_PedCod) )
      {
         A658PedCod = AV22Insert_PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
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
         /* Using cursor T00216 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum)});
         if ( (pr_default.getStatus(4) != 101) )
         {
            A13791PrePrvDsc = T00216_A13791PrePrvDsc[0] ;
            n13791PrePrvDsc = T00216_n13791PrePrvDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
         }
         else
         {
            A13791PrePrvDsc = "Error" ;
            n13791PrePrvDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
         }
         pr_default.close(4);
         /* Using cursor T00214 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
         A835TipDtoCod = T00214_A835TipDtoCod[0] ;
         n835TipDtoCod = T00214_n835TipDtoCod[0] ;
         A724PrdPreAct = T00214_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         pr_default.close(2);
         /* Using cursor T00215 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         A837TipDtoDto = T00215_A837TipDtoDto[0] ;
         n837TipDtoDto = T00215_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         pr_default.close(3);
      }
   }

   public void load2186( )
   {
      /* Using cursor T00218 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A756PrePrvNum), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound86 = (short)(1) ;
         A835TipDtoCod = T00218_A835TipDtoCod[0] ;
         n835TipDtoCod = T00218_n835TipDtoCod[0] ;
         A755PrePedUni = T00218_A755PrePedUni[0] ;
         n755PrePedUni = T00218_n755PrePedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A755PrePedUni", GXutil.ltrimstr( A755PrePedUni, 9, 2));
         A751PrePedCon = T00218_A751PrePedCon[0] ;
         n751PrePedCon = T00218_n751PrePedCon[0] ;
         A753PrePedPre = T00218_A753PrePedPre[0] ;
         n753PrePedPre = T00218_n753PrePedPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
         A752PrePedDto = T00218_A752PrePedDto[0] ;
         n752PrePedDto = T00218_n752PrePedDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
         A754PrePedPri = T00218_A754PrePedPri[0] ;
         n754PrePedPri = T00218_n754PrePedPri[0] ;
         A724PrdPreAct = T00218_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A837TipDtoDto = T00218_A837TipDtoDto[0] ;
         n837TipDtoDto = T00218_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         A658PedCod = T00218_A658PedCod[0] ;
         n658PedCod = T00218_n658PedCod[0] ;
         A13791PrePrvDsc = T00218_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = T00218_n13791PrePrvDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
         zm2186( -16) ;
      }
      pr_default.close(6);
      onLoadActions2186( ) ;
   }

   public void onLoadActions2186( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A753PrePedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A753PrePedPre = A724PrdPreAct ;
         n753PrePedPre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A752PrePedDto)==0) && ( Gx_BScreen == 0 ) )
      {
         A752PrePedDto = A837TipDtoDto ;
         n752PrePedDto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
      }
      /* Using cursor T00219 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), A719PrdNum});
      h719PrdNum = "" ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         h719PrdNum = T00219_A13747PrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(7);
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
   }

   public void checkExtendedTable2186( )
   {
      nIsDirty_86 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h719PrdNum)==0) )
      {
         nIsDirty_86 = (short)(1) ;
         A719PrdNum = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A13747PrdCDsc = h719PrdNum ;
         /* Using cursor T002110 */
         pr_default.execute(8, new Object[] {A13747PrdCDsc, A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv)});
         A396EmprCod = T002110_A396EmprCod[0] ;
         A719PrdNum = T002110_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A719PrdNum = T002110_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      if ( (GXutil.strcmp("", h719PrdNum)==0) )
      {
         nIsDirty_86 = (short)(1) ;
         A719PrdNum = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A13747PrdCDsc = h719PrdNum ;
         /* Using cursor T002111 */
         pr_default.execute(9, new Object[] {A13747PrdCDsc, A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv)});
         A396EmprCod = T002111_A396EmprCod[0] ;
         A719PrdNum = T002111_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A719PrdNum = T002111_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( ! ( (pr_default.getStatus(9) == 101) ) )
         {
            pr_default.readNext(9);
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(9);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      /* Using cursor T00214 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A835TipDtoCod = T00214_A835TipDtoCod[0] ;
      n835TipDtoCod = T00214_n835TipDtoCod[0] ;
      A724PrdPreAct = T00214_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A753PrePedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_86 = (short)(1) ;
         A753PrePedPre = A724PrdPreAct ;
         n753PrePedPre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
      }
      /* Using cursor T00215 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
         }
      }
      A837TipDtoDto = T00215_A837TipDtoDto[0] ;
      n837TipDtoDto = T00215_n837TipDtoDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      pr_default.close(3);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A752PrePedDto)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_86 = (short)(1) ;
         A752PrePedDto = A837TipDtoDto ;
         n752PrePedDto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
      }
      /* Using cursor T00216 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13791PrePrvDsc = T00216_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = T00216_n13791PrePrvDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
      }
      else
      {
         nIsDirty_86 = (short)(1) ;
         A13791PrePrvDsc = "Error" ;
         n13791PrePrvDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors2186( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T002112 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A835TipDtoCod = T002112_A835TipDtoCod[0] ;
      n835TipDtoCod = T002112_n835TipDtoCod[0] ;
      A724PrdPreAct = T002112_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_18( String A396EmprCod ,
                          byte A835TipDtoCod )
   {
      /* Using cursor T002113 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
         }
      }
      A837TipDtoDto = T002113_A837TipDtoDto[0] ;
      n837TipDtoDto = T002113_n837TipDtoDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_19( String A396EmprCod ,
                          int A756PrePrvNum )
   {
      /* Using cursor T002114 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A13791PrePrvDsc = T002114_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = T002114_n13791PrePrvDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
      }
      else
      {
         A13791PrePrvDsc = "Error" ;
         n13791PrePrvDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13791PrePrvDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey2186( )
   {
      /* Using cursor T002115 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound86 = (short)(1) ;
      }
      else
      {
         RcdFound86 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00213 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2186( 16) ;
         RcdFound86 = (short)(1) ;
         A756PrePrvNum = T00213_A756PrePrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         A755PrePedUni = T00213_A755PrePedUni[0] ;
         n755PrePedUni = T00213_n755PrePedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A755PrePedUni", GXutil.ltrimstr( A755PrePedUni, 9, 2));
         A751PrePedCon = T00213_A751PrePedCon[0] ;
         n751PrePedCon = T00213_n751PrePedCon[0] ;
         A753PrePedPre = T00213_A753PrePedPre[0] ;
         n753PrePedPre = T00213_n753PrePedPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
         A752PrePedDto = T00213_A752PrePedDto[0] ;
         n752PrePedDto = T00213_n752PrePedDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
         A754PrePedPri = T00213_A754PrePedPri[0] ;
         n754PrePedPri = T00213_n754PrePedPri[0] ;
         A396EmprCod = T00213_A396EmprCod[0] ;
         A719PrdNum = T00213_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A658PedCod = T00213_A658PedCod[0] ;
         n658PedCod = T00213_n658PedCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z756PrePrvNum = A756PrePrvNum ;
         Z719PrdNum = A719PrdNum ;
         sMode86 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2186( ) ;
         if ( AnyError == 1 )
         {
            RcdFound86 = (short)(0) ;
            initializeNonKey2186( ) ;
         }
         Gx_mode = sMode86 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound86 = (short)(0) ;
         initializeNonKey2186( ) ;
         sMode86 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode86 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2186( ) ;
      if ( RcdFound86 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound86 = (short)(0) ;
      /* Using cursor T002116 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A756PrePrvNum), Integer.valueOf(A756PrePrvNum), A396EmprCod, A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T002116_A756PrePrvNum[0] < A756PrePrvNum ) || ( T002116_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002116_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002116_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002116_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002116_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T002116_A756PrePrvNum[0] > A756PrePrvNum ) || ( T002116_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002116_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002116_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002116_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002116_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A756PrePrvNum = T002116_A756PrePrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
            A396EmprCod = T002116_A396EmprCod[0] ;
            A719PrdNum = T002116_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound86 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound86 = (short)(0) ;
      /* Using cursor T002117 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A756PrePrvNum), Integer.valueOf(A756PrePrvNum), A396EmprCod, A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T002117_A756PrePrvNum[0] > A756PrePrvNum ) || ( T002117_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002117_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002117_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002117_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002117_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T002117_A756PrePrvNum[0] < A756PrePrvNum ) || ( T002117_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002117_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002117_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002117_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(T002117_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A756PrePrvNum = T002117_A756PrePrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
            A396EmprCod = T002117_A396EmprCod[0] ;
            A719PrdNum = T002117_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound86 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2186( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrePrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2186( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound86 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A756PrePrvNum != Z756PrePrvNum ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A756PrePrvNum = Z756PrePrvNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PREPRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrePrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrePrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2186( ) ;
               GX_FocusControl = edtPrePrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A756PrePrvNum != Z756PrePrvNum ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrePrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2186( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PREPRVNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrePrvNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPrePrvNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2186( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A756PrePrvNum != Z756PrePrvNum ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A756PrePrvNum = Z756PrePrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PREPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrePrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrePrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2186( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h719PrdNum)==0) )
         {
            A719PrdNum = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         }
         else
         {
            A13747PrdCDsc = h719PrdNum ;
            /* Using cursor T002118 */
            pr_default.execute(16, new Object[] {A13747PrdCDsc, A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv)});
            A396EmprCod = T002118_A396EmprCod[0] ;
            A719PrdNum = T002118_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A719PrdNum = T002118_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               pr_default.readNext(16);
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(16);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00212 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREPED"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z755PrePedUni, T00212_A755PrePedUni[0]) != 0 ) || ( GXutil.strcmp(Z751PrePedCon, T00212_A751PrePedCon[0]) != 0 ) || ( DecimalUtil.compareTo(Z753PrePedPre, T00212_A753PrePedPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z752PrePedDto, T00212_A752PrePedDto[0]) != 0 ) || ( GXutil.strcmp(Z754PrePedPri, T00212_A754PrePedPri[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z658PedCod != T00212_A658PedCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z755PrePedUni, T00212_A755PrePedUni[0]) != 0 )
            {
               GXutil.writeLogln("tpreped:[seudo value changed for attri]"+"PrePedUni");
               GXutil.writeLogRaw("Old: ",Z755PrePedUni);
               GXutil.writeLogRaw("Current: ",T00212_A755PrePedUni[0]);
            }
            if ( GXutil.strcmp(Z751PrePedCon, T00212_A751PrePedCon[0]) != 0 )
            {
               GXutil.writeLogln("tpreped:[seudo value changed for attri]"+"PrePedCon");
               GXutil.writeLogRaw("Old: ",Z751PrePedCon);
               GXutil.writeLogRaw("Current: ",T00212_A751PrePedCon[0]);
            }
            if ( DecimalUtil.compareTo(Z753PrePedPre, T00212_A753PrePedPre[0]) != 0 )
            {
               GXutil.writeLogln("tpreped:[seudo value changed for attri]"+"PrePedPre");
               GXutil.writeLogRaw("Old: ",Z753PrePedPre);
               GXutil.writeLogRaw("Current: ",T00212_A753PrePedPre[0]);
            }
            if ( DecimalUtil.compareTo(Z752PrePedDto, T00212_A752PrePedDto[0]) != 0 )
            {
               GXutil.writeLogln("tpreped:[seudo value changed for attri]"+"PrePedDto");
               GXutil.writeLogRaw("Old: ",Z752PrePedDto);
               GXutil.writeLogRaw("Current: ",T00212_A752PrePedDto[0]);
            }
            if ( GXutil.strcmp(Z754PrePedPri, T00212_A754PrePedPri[0]) != 0 )
            {
               GXutil.writeLogln("tpreped:[seudo value changed for attri]"+"PrePedPri");
               GXutil.writeLogRaw("Old: ",Z754PrePedPri);
               GXutil.writeLogRaw("Current: ",T00212_A754PrePedPri[0]);
            }
            if ( Z658PedCod != T00212_A658PedCod[0] )
            {
               GXutil.writeLogln("tpreped:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T00212_A658PedCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPREPED"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2186( )
   {
      beforeValidate2186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2186( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2186( 0) ;
         checkOptimisticConcurrency2186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2186( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002119 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A756PrePrvNum), Boolean.valueOf(n755PrePedUni), A755PrePedUni, Boolean.valueOf(n751PrePedCon), A751PrePedCon, Boolean.valueOf(n753PrePedPre), A753PrePedPre, Boolean.valueOf(n752PrePedDto), A752PrePedDto, Boolean.valueOf(n754PrePedPri), A754PrePedPri, A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        resetCaption210( ) ;
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
            load2186( ) ;
         }
         endLevel2186( ) ;
      }
      closeExtendedTableCursors2186( ) ;
   }

   public void update2186( )
   {
      beforeValidate2186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2186( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2186( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002120 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n755PrePedUni), A755PrePedUni, Boolean.valueOf(n751PrePedCon), A751PrePedCon, Boolean.valueOf(n753PrePedPre), A753PrePedPre, Boolean.valueOf(n752PrePedDto), A752PrePedDto, Boolean.valueOf(n754PrePedPri), A754PrePedPri, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREPED"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2186( ) ;
                  if ( AnyError == 0 )
                  {
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
         endLevel2186( ) ;
      }
      closeExtendedTableCursors2186( ) ;
   }

   public void deferredUpdate2186( )
   {
   }

   public void delete( )
   {
      beforeValidate2186( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2186( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2186( ) ;
         afterConfirm2186( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2186( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002121 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
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
      sMode86 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2186( ) ;
      Gx_mode = sMode86 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2186( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002122 */
         pr_default.execute(20, new Object[] {A396EmprCod, A719PrdNum});
         A835TipDtoCod = T002122_A835TipDtoCod[0] ;
         n835TipDtoCod = T002122_n835TipDtoCod[0] ;
         A724PrdPreAct = T002122_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         pr_default.close(20);
         /* Using cursor T002123 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         A837TipDtoDto = T002123_A837TipDtoDto[0] ;
         n837TipDtoDto = T002123_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         pr_default.close(21);
         /* Using cursor T002124 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A13791PrePrvDsc = T002124_A13791PrePrvDsc[0] ;
            n13791PrePrvDsc = T002124_n13791PrePrvDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
         }
         else
         {
            A13791PrePrvDsc = "Error" ;
            n13791PrePrvDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
         }
         pr_default.close(22);
      }
   }

   public void endLevel2186( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2186( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpreped");
         if ( AnyError == 0 )
         {
            confirmValues210( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpreped");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2186( )
   {
      /* Scan By routine */
      /* Using cursor T002125 */
      pr_default.execute(23);
      RcdFound86 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound86 = (short)(1) ;
         A396EmprCod = T002125_A396EmprCod[0] ;
         A756PrePrvNum = T002125_A756PrePrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         A719PrdNum = T002125_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2186( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound86 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound86 = (short)(1) ;
         A396EmprCod = T002125_A396EmprCod[0] ;
         A756PrePrvNum = T002125_A756PrePrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
         A719PrdNum = T002125_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd2186( )
   {
      pr_default.close(23);
   }

   public void afterConfirm2186( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2186( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2186( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2186( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2186( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2186( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2186( )
   {
      edtPrePrvDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePrvDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvDsc_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtTipDtoDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoDto_Enabled), 5, 0), true);
      edtPrePrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvNum_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrePedUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedUni_Enabled), 5, 0), true);
      edtPrePedPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedPre_Enabled), 5, 0), true);
      edtPrePedDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedDto_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2186( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues210( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tpreped", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18PrdNum))}, new String[] {"Gx_mode","EmprCod","PrePrvNum","PrdNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPREPED");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("PrePedCon", GXutil.rtrim( localUtil.format( A751PrePedCon, "@!")));
      forbiddenHiddens.add("PrePedPri", GXutil.rtrim( localUtil.format( A754PrePedPri, "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpreped:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z756PrePrvNum", GXutil.ltrim( localUtil.ntoc( Z756PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z755PrePedUni", GXutil.ltrim( localUtil.ntoc( Z755PrePedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z751PrePedCon", GXutil.rtrim( Z751PrePedCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z753PrePedPre", GXutil.ltrim( localUtil.ntoc( Z753PrePedPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z752PrePedDto", GXutil.ltrim( localUtil.ntoc( Z752PrePedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z754PrePedPri", GXutil.rtrim( Z754PrePedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N658PedCod", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV20TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV20TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV20TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPREPRVNUM", GXutil.ltrim( localUtil.ntoc( AV17PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPREPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17PrePrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV18PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PEDCOD", GXutil.ltrim( localUtil.ntoc( AV22Insert_PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCOD", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROPRV", GXutil.ltrim( localUtil.ntoc( AV24Proprv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPEDCON", GXutil.rtrim( A751PrePedCon));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPEDPRI", GXutil.rtrim( A754PrePedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDTOCOD", GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV29Pgmname));
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
      return formatLink("app.tpreped", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18PrdNum))}, new String[] {"Gx_mode","EmprCod","PrePrvNum","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "TPREPED" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Realizacion Pedidos", "") ;
   }

   public void initializeNonKey2186( )
   {
      A835TipDtoCod = (byte)(0) ;
      n835TipDtoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      A13791PrePrvDsc = "" ;
      n13791PrePrvDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", A13791PrePrvDsc);
      A755PrePedUni = DecimalUtil.ZERO ;
      n755PrePedUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A755PrePedUni", GXutil.ltrimstr( A755PrePedUni, 9, 2));
      A751PrePedCon = "" ;
      n751PrePedCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A751PrePedCon", A751PrePedCon);
      A754PrePedPri = "" ;
      n754PrePedPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A754PrePedPri", A754PrePedPri);
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A837TipDtoDto = DecimalUtil.ZERO ;
      n837TipDtoDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      A753PrePedPre = DecimalUtil.ZERO ;
      n753PrePedPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrimstr( A753PrePedPre, 12, 5));
      A752PrePedDto = DecimalUtil.ZERO ;
      n752PrePedDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrimstr( A752PrePedDto, 5, 2));
      Z755PrePedUni = DecimalUtil.ZERO ;
      Z751PrePedCon = "" ;
      Z753PrePedPre = DecimalUtil.ZERO ;
      Z752PrePedDto = DecimalUtil.ZERO ;
      Z754PrePedPri = "" ;
      Z658PedCod = 0 ;
   }

   public void initAll2186( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A756PrePrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A756PrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A756PrePrvNum), 6, 0));
      h719PrdNum = "" ;
      initializeNonKey2186( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652121", true, true);
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
      httpContext.AddJavascriptSource("tpreped.js", "?20268211652121", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtPrePrvDsc_Internalname = "PREPRVDSC" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtTipDtoDto_Internalname = "TIPDTODTO" ;
      edtPrePrvNum_Internalname = "PREPRVNUM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrePedUni_Internalname = "PREPEDUNI" ;
      edtPrePedPre_Internalname = "PREPEDPRE" ;
      edtPrePedDto_Internalname = "PREPEDDTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Realizacion Pedidos", "") );
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrePedDto_Jsonclick = "" ;
      edtPrePedDto_Enabled = 1 ;
      edtPrePedPre_Jsonclick = "" ;
      edtPrePedPre_Enabled = 1 ;
      edtPrePedUni_Jsonclick = "" ;
      edtPrePedUni_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrePrvNum_Jsonclick = "" ;
      edtPrePrvNum_Enabled = 1 ;
      edtTipDtoDto_Jsonclick = "" ;
      edtTipDtoDto_Enabled = 0 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrePrvDsc_Jsonclick = "" ;
      edtPrePrvDsc_Enabled = 0 ;
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

   public void gxsgaprdnum210( String A396EmprCod ,
                               short AV24Proprv ,
                               int A756PrePrvNum ,
                               String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprdnum_data210( A396EmprCod, AV24Proprv, A756PrePrvNum, A13747PrdCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaprdnum_data210( String A396EmprCod ,
                                       short AV24Proprv ,
                                       int A756PrePrvNum ,
                                       String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor T002126 */
      pr_default.execute(24, new Object[] {A396EmprCod, l13747PrdCDsc, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv)});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(24) != 101) )
      {
         gxdynajaxctrlcodr.add(T002126_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(T002126_A13747PrdCDsc[0]);
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void gxhcaprdnum2186( String A396EmprCod ,
                                short AV24Proprv ,
                                int A756PrePrvNum ,
                                String A13747PrdCDsc )
   {
      /* Using cursor T002127 */
      pr_default.execute(25, new Object[] {A13747PrdCDsc, A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv)});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(25) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A795PrvNum = T002127_A795PrvNum[0] ;
         A13747PrdCDsc = T002127_A13747PrdCDsc[0] ;
         A396EmprCod = T002127_A396EmprCod[0] ;
         A719PrdNum = T002127_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A6158PrdPrv = T002127_A6158PrdPrv[0] ;
         pr_default.readNext(25);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
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

   public void valid_Preprvnum( )
   {
      n13791PrePrvDsc = false ;
      /* Using cursor T002128 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A13791PrePrvDsc = T002128_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = T002128_n13791PrePrvDsc[0] ;
      }
      else
      {
         A13791PrePrvDsc = "Error" ;
         n13791PrePrvDsc = false ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13791PrePrvDsc", GXutil.rtrim( A13791PrePrvDsc));
   }

   public void valid_Prdnum( )
   {
      n835TipDtoCod = false ;
      n837TipDtoDto = false ;
      n752PrePedDto = false ;
      n753PrePedPre = false ;
      if ( (GXutil.strcmp("", h719PrdNum)==0) )
      {
         A719PrdNum = "" ;
      }
      else
      {
         A13747PrdCDsc = h719PrdNum ;
         /* Using cursor T002129 */
         pr_default.execute(27, new Object[] {A13747PrdCDsc, A396EmprCod, Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv), Integer.valueOf(A756PrePrvNum), Short.valueOf(AV24Proprv)});
         A396EmprCod = T002129_A396EmprCod[0] ;
         A719PrdNum = T002129_A719PrdNum[0] ;
         A719PrdNum = T002129_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(27) == 101) ) )
         {
            pr_default.readNext(27);
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(27);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      /* Using cursor T002130 */
      pr_default.execute(28, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A835TipDtoCod = T002130_A835TipDtoCod[0] ;
      n835TipDtoCod = T002130_n835TipDtoCod[0] ;
      A724PrdPreAct = T002130_A724PrdPreAct[0] ;
      pr_default.close(28);
      /* Using cursor T002131 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
         }
      }
      A837TipDtoDto = T002131_A837TipDtoDto[0] ;
      n837TipDtoDto = T002131_n837TipDtoDto[0] ;
      pr_default.close(29);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A752PrePedDto)==0) && ( Gx_BScreen == 0 ) )
      {
         A752PrePedDto = A837TipDtoDto ;
         n752PrePedDto = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A753PrePedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A753PrePedPre = A724PrdPreAct ;
         n753PrePedPre = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A752PrePedDto", GXutil.ltrim( localUtil.ntoc( A752PrePedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A753PrePedPre", GXutil.ltrim( localUtil.ntoc( A753PrePedPre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV18PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17PrePrvNum',fld:'vPREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV18PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A751PrePedCon',fld:'PREPEDCON',pic:'@!'},{av:'A754PrePedPri',fld:'PREPEDPRI',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12212',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_TIPDTODTO","{handler:'valid_Tipdtodto',iparms:[]");
      setEventMetadata("VALID_TIPDTODTO",",oparms:[]}");
      setEventMetadata("VALID_PREPRVNUM","{handler:'valid_Preprvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9'},{av:'A13791PrePrvDsc',fld:'PREPRVDSC',pic:''}]");
      setEventMetadata("VALID_PREPRVNUM",",oparms:[{av:'A13791PrePrvDsc',fld:'PREPRVDSC',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'h719PrdNum'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24Proprv',fld:'vPROPRV',pic:'ZZZ9'},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9'},{av:'A835TipDtoCod',fld:'TIPDTOCOD',pic:'Z9'},{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A752PrePedDto',fld:'PREPEDDTO',pic:'Z9.99'},{av:'A753PrePedPre',fld:'PREPEDPRE',pic:'ZZZZZ9.999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A835TipDtoCod',fld:'TIPDTOCOD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'A752PrePedDto',fld:'PREPEDDTO',pic:'Z9.99'},{av:'A753PrePedPre',fld:'PREPEDPRE',pic:'ZZZZZ9.999'},{av:'h719PrdNum'}]}");
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
      pr_default.close(28);
      pr_default.close(20);
      pr_default.close(29);
      pr_default.close(21);
      pr_default.close(26);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV16EmprCod = "" ;
      wcpOAV18PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z755PrePedUni = DecimalUtil.ZERO ;
      Z751PrePedCon = "" ;
      Z753PrePedPre = DecimalUtil.ZERO ;
      Z752PrePedDto = DecimalUtil.ZERO ;
      Z754PrePedPri = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13747PrdCDsc = "" ;
      h719PrdNum = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV16EmprCod = "" ;
      AV18PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13791PrePrvDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      TempTags = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A751PrePedCon = "" ;
      A754PrePedPri = "" ;
      AV29Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode86 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXv_int2 = new byte[1] ;
      AV26Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV27Emprnom = "" ;
      GXv_char5 = new String[1] ;
      AV28Usurcod = "" ;
      GXv_char6 = new String[1] ;
      AV19WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV21WebSession = httpContext.getWebSession();
      AV23TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z13791PrePrvDsc = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z837TipDtoDto = DecimalUtil.ZERO ;
      T00217_A795PrvNum = new int[1] ;
      T00217_A13747PrdCDsc = new String[] {""} ;
      T00217_A396EmprCod = new String[] {""} ;
      T00217_A719PrdNum = new String[] {""} ;
      T00217_A6158PrdPrv = new int[1] ;
      T00216_A13791PrePrvDsc = new String[] {""} ;
      T00216_n13791PrePrvDsc = new boolean[] {false} ;
      T00214_A835TipDtoCod = new byte[1] ;
      T00214_n835TipDtoCod = new boolean[] {false} ;
      T00214_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00215_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00215_n837TipDtoDto = new boolean[] {false} ;
      T00218_A795PrvNum = new int[1] ;
      T00218_A835TipDtoCod = new byte[1] ;
      T00218_n835TipDtoCod = new boolean[] {false} ;
      T00218_A756PrePrvNum = new int[1] ;
      T00218_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00218_n755PrePedUni = new boolean[] {false} ;
      T00218_A751PrePedCon = new String[] {""} ;
      T00218_n751PrePedCon = new boolean[] {false} ;
      T00218_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00218_n753PrePedPre = new boolean[] {false} ;
      T00218_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00218_n752PrePedDto = new boolean[] {false} ;
      T00218_A754PrePedPri = new String[] {""} ;
      T00218_n754PrePedPri = new boolean[] {false} ;
      T00218_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00218_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00218_n837TipDtoDto = new boolean[] {false} ;
      T00218_A396EmprCod = new String[] {""} ;
      T00218_A719PrdNum = new String[] {""} ;
      T00218_A658PedCod = new int[1] ;
      T00218_n658PedCod = new boolean[] {false} ;
      T00218_A13791PrePrvDsc = new String[] {""} ;
      T00218_n13791PrePrvDsc = new boolean[] {false} ;
      T00219_A795PrvNum = new int[1] ;
      T00219_A13747PrdCDsc = new String[] {""} ;
      T00219_A396EmprCod = new String[] {""} ;
      T00219_A719PrdNum = new String[] {""} ;
      T00219_A6158PrdPrv = new int[1] ;
      T002110_A795PrvNum = new int[1] ;
      T002110_A13747PrdCDsc = new String[] {""} ;
      T002110_A396EmprCod = new String[] {""} ;
      T002110_A719PrdNum = new String[] {""} ;
      T002110_A6158PrdPrv = new int[1] ;
      T002111_A795PrvNum = new int[1] ;
      T002111_A13747PrdCDsc = new String[] {""} ;
      T002111_A396EmprCod = new String[] {""} ;
      T002111_A719PrdNum = new String[] {""} ;
      T002111_A6158PrdPrv = new int[1] ;
      T002112_A835TipDtoCod = new byte[1] ;
      T002112_n835TipDtoCod = new boolean[] {false} ;
      T002112_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002113_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002113_n837TipDtoDto = new boolean[] {false} ;
      T002114_A13791PrePrvDsc = new String[] {""} ;
      T002114_n13791PrePrvDsc = new boolean[] {false} ;
      T002115_A396EmprCod = new String[] {""} ;
      T002115_A756PrePrvNum = new int[1] ;
      T002115_A719PrdNum = new String[] {""} ;
      T00213_A756PrePrvNum = new int[1] ;
      T00213_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00213_n755PrePedUni = new boolean[] {false} ;
      T00213_A751PrePedCon = new String[] {""} ;
      T00213_n751PrePedCon = new boolean[] {false} ;
      T00213_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00213_n753PrePedPre = new boolean[] {false} ;
      T00213_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00213_n752PrePedDto = new boolean[] {false} ;
      T00213_A754PrePedPri = new String[] {""} ;
      T00213_n754PrePedPri = new boolean[] {false} ;
      T00213_A396EmprCod = new String[] {""} ;
      T00213_A719PrdNum = new String[] {""} ;
      T00213_A658PedCod = new int[1] ;
      T00213_n658PedCod = new boolean[] {false} ;
      T002116_A756PrePrvNum = new int[1] ;
      T002116_A396EmprCod = new String[] {""} ;
      T002116_A719PrdNum = new String[] {""} ;
      T002117_A756PrePrvNum = new int[1] ;
      T002117_A396EmprCod = new String[] {""} ;
      T002117_A719PrdNum = new String[] {""} ;
      T002118_A795PrvNum = new int[1] ;
      T002118_A13747PrdCDsc = new String[] {""} ;
      T002118_A396EmprCod = new String[] {""} ;
      T002118_A719PrdNum = new String[] {""} ;
      T002118_A6158PrdPrv = new int[1] ;
      T00212_A756PrePrvNum = new int[1] ;
      T00212_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00212_n755PrePedUni = new boolean[] {false} ;
      T00212_A751PrePedCon = new String[] {""} ;
      T00212_n751PrePedCon = new boolean[] {false} ;
      T00212_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00212_n753PrePedPre = new boolean[] {false} ;
      T00212_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00212_n752PrePedDto = new boolean[] {false} ;
      T00212_A754PrePedPri = new String[] {""} ;
      T00212_n754PrePedPri = new boolean[] {false} ;
      T00212_A396EmprCod = new String[] {""} ;
      T00212_A719PrdNum = new String[] {""} ;
      T00212_A658PedCod = new int[1] ;
      T00212_n658PedCod = new boolean[] {false} ;
      T002122_A835TipDtoCod = new byte[1] ;
      T002122_n835TipDtoCod = new boolean[] {false} ;
      T002122_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002123_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002123_n837TipDtoDto = new boolean[] {false} ;
      T002124_A13791PrePrvDsc = new String[] {""} ;
      T002124_n13791PrePrvDsc = new boolean[] {false} ;
      T002125_A396EmprCod = new String[] {""} ;
      T002125_A756PrePrvNum = new int[1] ;
      T002125_A719PrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13747PrdCDsc = "" ;
      T002126_A13747PrdCDsc = new String[] {""} ;
      T002127_A795PrvNum = new int[1] ;
      T002127_A13747PrdCDsc = new String[] {""} ;
      T002127_A396EmprCod = new String[] {""} ;
      T002127_A719PrdNum = new String[] {""} ;
      T002127_A6158PrdPrv = new int[1] ;
      T002128_A13791PrePrvDsc = new String[] {""} ;
      T002128_n13791PrePrvDsc = new boolean[] {false} ;
      T002129_A795PrvNum = new int[1] ;
      T002129_A13747PrdCDsc = new String[] {""} ;
      T002129_A396EmprCod = new String[] {""} ;
      T002129_A719PrdNum = new String[] {""} ;
      T002129_A6158PrdPrv = new int[1] ;
      T002130_A835TipDtoCod = new byte[1] ;
      T002130_n835TipDtoCod = new boolean[] {false} ;
      T002130_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002131_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002131_n837TipDtoDto = new boolean[] {false} ;
      Zh719PrdNum = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpreped__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpreped__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpreped__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpreped__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpreped__default(),
         new Object[] {
             new Object[] {
            T00212_A756PrePrvNum, T00212_A755PrePedUni, T00212_n755PrePedUni, T00212_A751PrePedCon, T00212_n751PrePedCon, T00212_A753PrePedPre, T00212_n753PrePedPre, T00212_A752PrePedDto, T00212_n752PrePedDto, T00212_A754PrePedPri,
            T00212_n754PrePedPri, T00212_A396EmprCod, T00212_A719PrdNum, T00212_A658PedCod, T00212_n658PedCod
            }
            , new Object[] {
            T00213_A756PrePrvNum, T00213_A755PrePedUni, T00213_n755PrePedUni, T00213_A751PrePedCon, T00213_n751PrePedCon, T00213_A753PrePedPre, T00213_n753PrePedPre, T00213_A752PrePedDto, T00213_n752PrePedDto, T00213_A754PrePedPri,
            T00213_n754PrePedPri, T00213_A396EmprCod, T00213_A719PrdNum, T00213_A658PedCod, T00213_n658PedCod
            }
            , new Object[] {
            T00214_A835TipDtoCod, T00214_n835TipDtoCod, T00214_A724PrdPreAct
            }
            , new Object[] {
            T00215_A837TipDtoDto, T00215_n837TipDtoDto
            }
            , new Object[] {
            T00216_A13791PrePrvDsc, T00216_n13791PrePrvDsc
            }
            , new Object[] {
            T00217_A795PrvNum, T00217_A13747PrdCDsc, T00217_A396EmprCod, T00217_A719PrdNum, T00217_A6158PrdPrv
            }
            , new Object[] {
            T00218_A795PrvNum, T00218_A835TipDtoCod, T00218_n835TipDtoCod, T00218_A756PrePrvNum, T00218_A755PrePedUni, T00218_n755PrePedUni, T00218_A751PrePedCon, T00218_n751PrePedCon, T00218_A753PrePedPre, T00218_n753PrePedPre,
            T00218_A752PrePedDto, T00218_n752PrePedDto, T00218_A754PrePedPri, T00218_n754PrePedPri, T00218_A724PrdPreAct, T00218_A837TipDtoDto, T00218_n837TipDtoDto, T00218_A396EmprCod, T00218_A719PrdNum, T00218_A658PedCod,
            T00218_n658PedCod, T00218_A13791PrePrvDsc, T00218_n13791PrePrvDsc
            }
            , new Object[] {
            T00219_A795PrvNum, T00219_A13747PrdCDsc, T00219_A396EmprCod, T00219_A719PrdNum, T00219_A6158PrdPrv
            }
            , new Object[] {
            T002110_A795PrvNum, T002110_A13747PrdCDsc, T002110_A396EmprCod, T002110_A719PrdNum, T002110_A6158PrdPrv
            }
            , new Object[] {
            T002111_A795PrvNum, T002111_A13747PrdCDsc, T002111_A396EmprCod, T002111_A719PrdNum, T002111_A6158PrdPrv
            }
            , new Object[] {
            T002112_A835TipDtoCod, T002112_n835TipDtoCod, T002112_A724PrdPreAct
            }
            , new Object[] {
            T002113_A837TipDtoDto, T002113_n837TipDtoDto
            }
            , new Object[] {
            T002114_A13791PrePrvDsc, T002114_n13791PrePrvDsc
            }
            , new Object[] {
            T002115_A396EmprCod, T002115_A756PrePrvNum, T002115_A719PrdNum
            }
            , new Object[] {
            T002116_A756PrePrvNum, T002116_A396EmprCod, T002116_A719PrdNum
            }
            , new Object[] {
            T002117_A756PrePrvNum, T002117_A396EmprCod, T002117_A719PrdNum
            }
            , new Object[] {
            T002118_A795PrvNum, T002118_A13747PrdCDsc, T002118_A396EmprCod, T002118_A719PrdNum, T002118_A6158PrdPrv
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002122_A835TipDtoCod, T002122_n835TipDtoCod, T002122_A724PrdPreAct
            }
            , new Object[] {
            T002123_A837TipDtoDto, T002123_n837TipDtoDto
            }
            , new Object[] {
            T002124_A13791PrePrvDsc, T002124_n13791PrePrvDsc
            }
            , new Object[] {
            T002125_A396EmprCod, T002125_A756PrePrvNum, T002125_A719PrdNum
            }
            , new Object[] {
            T002126_A13747PrdCDsc
            }
            , new Object[] {
            T002127_A795PrvNum, T002127_A13747PrdCDsc, T002127_A396EmprCod, T002127_A719PrdNum, T002127_A6158PrdPrv
            }
            , new Object[] {
            T002128_A13791PrePrvDsc, T002128_n13791PrePrvDsc
            }
            , new Object[] {
            T002129_A795PrvNum, T002129_A13747PrdCDsc, T002129_A396EmprCod, T002129_A719PrdNum, T002129_A6158PrdPrv
            }
            , new Object[] {
            T002130_A835TipDtoCod, T002130_n835TipDtoCod, T002130_A724PrdPreAct
            }
            , new Object[] {
            T002131_A837TipDtoDto, T002131_n837TipDtoDto
            }
         }
      );
      AV29Pgmname = "TPREPED" ;
      Z752PrePedDto = DecimalUtil.ZERO ;
      n752PrePedDto = false ;
      A752PrePedDto = DecimalUtil.ZERO ;
      n752PrePedDto = false ;
      Z753PrePedPre = DecimalUtil.ZERO ;
      n753PrePedPre = false ;
      A753PrePedPre = DecimalUtil.ZERO ;
      n753PrePedPre = false ;
   }

   private byte GxWebError ;
   private byte A835TipDtoCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte Z835TipDtoCod ;
   private byte gxajaxcallmode ;
   private short AV24Proprv ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound86 ;
   private short nIsDirty_86 ;
   private short gxhchits ;
   private int wcpOAV17PrePrvNum ;
   private int Z756PrePrvNum ;
   private int Z658PedCod ;
   private int N658PedCod ;
   private int A756PrePrvNum ;
   private int AV17PrePrvNum ;
   private int trnEnded ;
   private int edtPrePrvDsc_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtTipDtoDto_Enabled ;
   private int edtPrePrvNum_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrePedUni_Enabled ;
   private int edtPrePedPre_Enabled ;
   private int edtPrePedDto_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int A658PedCod ;
   private int AV22Insert_PedCod ;
   private int AV30GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int A795PrvNum ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal Z755PrePedUni ;
   private java.math.BigDecimal Z753PrePedPre ;
   private java.math.BigDecimal Z752PrePedDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z837TipDtoDto ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV16EmprCod ;
   private String wcpOAV18PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z751PrePedCon ;
   private String Z754PrePedPri ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV16EmprCod ;
   private String AV18PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrePrvNum_Internalname ;
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
   private String edtPrePrvDsc_Internalname ;
   private String A13791PrePrvDsc ;
   private String edtPrePrvDsc_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtTipDtoDto_Internalname ;
   private String edtTipDtoDto_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtPrePrvNum_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrePedUni_Internalname ;
   private String edtPrePedUni_Jsonclick ;
   private String edtPrePedPre_Internalname ;
   private String edtPrePedPre_Jsonclick ;
   private String edtPrePedDto_Internalname ;
   private String edtPrePedDto_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String A751PrePedCon ;
   private String A754PrePedPri ;
   private String AV29Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode86 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV26Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV27Emprnom ;
   private String GXv_char5[] ;
   private String AV28Usurcod ;
   private String GXv_char6[] ;
   private String Z13791PrePrvDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n835TipDtoCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n751PrePedCon ;
   private boolean n754PrePedPri ;
   private boolean n658PedCod ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n13791PrePrvDsc ;
   private boolean n837TipDtoDto ;
   private boolean n755PrePedUni ;
   private boolean n753PrePedPre ;
   private boolean n752PrePedDto ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13747PrdCDsc ;
   private String h719PrdNum ;
   private String l13747PrdCDsc ;
   private String Zh719PrdNum ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV21WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T00217_A795PrvNum ;
   private String[] T00217_A13747PrdCDsc ;
   private String[] T00217_A396EmprCod ;
   private String[] T00217_A719PrdNum ;
   private int[] T00217_A6158PrdPrv ;
   private String[] T00216_A13791PrePrvDsc ;
   private boolean[] T00216_n13791PrePrvDsc ;
   private byte[] T00214_A835TipDtoCod ;
   private boolean[] T00214_n835TipDtoCod ;
   private java.math.BigDecimal[] T00214_A724PrdPreAct ;
   private java.math.BigDecimal[] T00215_A837TipDtoDto ;
   private boolean[] T00215_n837TipDtoDto ;
   private int[] T00218_A795PrvNum ;
   private byte[] T00218_A835TipDtoCod ;
   private boolean[] T00218_n835TipDtoCod ;
   private int[] T00218_A756PrePrvNum ;
   private java.math.BigDecimal[] T00218_A755PrePedUni ;
   private boolean[] T00218_n755PrePedUni ;
   private String[] T00218_A751PrePedCon ;
   private boolean[] T00218_n751PrePedCon ;
   private java.math.BigDecimal[] T00218_A753PrePedPre ;
   private boolean[] T00218_n753PrePedPre ;
   private java.math.BigDecimal[] T00218_A752PrePedDto ;
   private boolean[] T00218_n752PrePedDto ;
   private String[] T00218_A754PrePedPri ;
   private boolean[] T00218_n754PrePedPri ;
   private java.math.BigDecimal[] T00218_A724PrdPreAct ;
   private java.math.BigDecimal[] T00218_A837TipDtoDto ;
   private boolean[] T00218_n837TipDtoDto ;
   private String[] T00218_A396EmprCod ;
   private String[] T00218_A719PrdNum ;
   private int[] T00218_A658PedCod ;
   private boolean[] T00218_n658PedCod ;
   private String[] T00218_A13791PrePrvDsc ;
   private boolean[] T00218_n13791PrePrvDsc ;
   private int[] T00219_A795PrvNum ;
   private String[] T00219_A13747PrdCDsc ;
   private String[] T00219_A396EmprCod ;
   private String[] T00219_A719PrdNum ;
   private int[] T00219_A6158PrdPrv ;
   private int[] T002110_A795PrvNum ;
   private String[] T002110_A13747PrdCDsc ;
   private String[] T002110_A396EmprCod ;
   private String[] T002110_A719PrdNum ;
   private int[] T002110_A6158PrdPrv ;
   private int[] T002111_A795PrvNum ;
   private String[] T002111_A13747PrdCDsc ;
   private String[] T002111_A396EmprCod ;
   private String[] T002111_A719PrdNum ;
   private int[] T002111_A6158PrdPrv ;
   private byte[] T002112_A835TipDtoCod ;
   private boolean[] T002112_n835TipDtoCod ;
   private java.math.BigDecimal[] T002112_A724PrdPreAct ;
   private java.math.BigDecimal[] T002113_A837TipDtoDto ;
   private boolean[] T002113_n837TipDtoDto ;
   private String[] T002114_A13791PrePrvDsc ;
   private boolean[] T002114_n13791PrePrvDsc ;
   private String[] T002115_A396EmprCod ;
   private int[] T002115_A756PrePrvNum ;
   private String[] T002115_A719PrdNum ;
   private int[] T00213_A756PrePrvNum ;
   private java.math.BigDecimal[] T00213_A755PrePedUni ;
   private boolean[] T00213_n755PrePedUni ;
   private String[] T00213_A751PrePedCon ;
   private boolean[] T00213_n751PrePedCon ;
   private java.math.BigDecimal[] T00213_A753PrePedPre ;
   private boolean[] T00213_n753PrePedPre ;
   private java.math.BigDecimal[] T00213_A752PrePedDto ;
   private boolean[] T00213_n752PrePedDto ;
   private String[] T00213_A754PrePedPri ;
   private boolean[] T00213_n754PrePedPri ;
   private String[] T00213_A396EmprCod ;
   private String[] T00213_A719PrdNum ;
   private int[] T00213_A658PedCod ;
   private boolean[] T00213_n658PedCod ;
   private int[] T002116_A756PrePrvNum ;
   private String[] T002116_A396EmprCod ;
   private String[] T002116_A719PrdNum ;
   private int[] T002117_A756PrePrvNum ;
   private String[] T002117_A396EmprCod ;
   private String[] T002117_A719PrdNum ;
   private int[] T002118_A795PrvNum ;
   private String[] T002118_A13747PrdCDsc ;
   private String[] T002118_A396EmprCod ;
   private String[] T002118_A719PrdNum ;
   private int[] T002118_A6158PrdPrv ;
   private int[] T00212_A756PrePrvNum ;
   private java.math.BigDecimal[] T00212_A755PrePedUni ;
   private boolean[] T00212_n755PrePedUni ;
   private String[] T00212_A751PrePedCon ;
   private boolean[] T00212_n751PrePedCon ;
   private java.math.BigDecimal[] T00212_A753PrePedPre ;
   private boolean[] T00212_n753PrePedPre ;
   private java.math.BigDecimal[] T00212_A752PrePedDto ;
   private boolean[] T00212_n752PrePedDto ;
   private String[] T00212_A754PrePedPri ;
   private boolean[] T00212_n754PrePedPri ;
   private String[] T00212_A396EmprCod ;
   private String[] T00212_A719PrdNum ;
   private int[] T00212_A658PedCod ;
   private boolean[] T00212_n658PedCod ;
   private byte[] T002122_A835TipDtoCod ;
   private boolean[] T002122_n835TipDtoCod ;
   private java.math.BigDecimal[] T002122_A724PrdPreAct ;
   private java.math.BigDecimal[] T002123_A837TipDtoDto ;
   private boolean[] T002123_n837TipDtoDto ;
   private String[] T002124_A13791PrePrvDsc ;
   private boolean[] T002124_n13791PrePrvDsc ;
   private String[] T002125_A396EmprCod ;
   private int[] T002125_A756PrePrvNum ;
   private String[] T002125_A719PrdNum ;
   private String[] T002126_A13747PrdCDsc ;
   private int[] T002127_A795PrvNum ;
   private String[] T002127_A13747PrdCDsc ;
   private String[] T002127_A396EmprCod ;
   private String[] T002127_A719PrdNum ;
   private int[] T002127_A6158PrdPrv ;
   private String[] T002128_A13791PrePrvDsc ;
   private boolean[] T002128_n13791PrePrvDsc ;
   private int[] T002129_A795PrvNum ;
   private String[] T002129_A13747PrdCDsc ;
   private String[] T002129_A396EmprCod ;
   private String[] T002129_A719PrdNum ;
   private int[] T002129_A6158PrdPrv ;
   private byte[] T002130_A835TipDtoCod ;
   private boolean[] T002130_n835TipDtoCod ;
   private java.math.BigDecimal[] T002130_A724PrdPreAct ;
   private java.math.BigDecimal[] T002131_A837TipDtoDto ;
   private boolean[] T002131_n837TipDtoDto ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV19WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV20TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV23TrnContextAtt ;
}

final  class tpreped__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreped__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreped__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreped__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00212", "SELECT PrePrvNum, PrePedUni, PrePedCon, PrePedPre, PrePedDto, PrePedPri, EmprCod, PrdNum, PedCod FROM TXPPREPED WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ?  FOR UPDATE OF PrePedUni, PrePedCon, PrePedPre, PrePedDto, PrePedPri, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00213", "SELECT PrePrvNum, PrePedUni, PrePedCon, PrePedPre, PrePedDto, PrePedPri, EmprCod, PrdNum, PedCod FROM TXPPREPED WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00214", "SELECT TipDtoCod, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00215", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00216", "SELECT COALESCE( PrvNom, 'Error') AS PrePrvDsc FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00217", "SELECT T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) AND (T1.PrdNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00218", "SELECT /*+ FIRST_ROWS(100) */ T2.PrvNum, T3.TipDtoCod, TM1.PrePrvNum, TM1.PrePedUni, TM1.PrePedCon, TM1.PrePedPre, TM1.PrePedDto, TM1.PrePedPri, T3.PrdPreAct, T4.TipDtoDto, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, COALESCE( T2.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED TM1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrvNum = TM1.PrePrvNum) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) LEFT JOIN TXPTIPDTO T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipDtoCod = T3.TipDtoCod) WHERE TM1.PrePrvNum = ? and TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrePrvNum, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00219", "SELECT T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) AND (T1.PrdNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002110", "SELECT /*+ FIRST_ROWS */ T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) = ?) AND (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002111", "SELECT /*+ FIRST_ROWS */ T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) = ?) AND (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002112", "SELECT TipDtoCod, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002113", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002114", "SELECT COALESCE( PrvNom, 'Error') AS PrePrvDsc FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002115", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrePrvNum, PrdNum FROM TXPPREPED WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002116", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrePrvNum, EmprCod, PrdNum FROM TXPPREPED WHERE ( PrePrvNum > ? or PrePrvNum = ? and EmprCod > ? or EmprCod = ? and PrePrvNum = ? and PrdNum > ?) ORDER BY EmprCod, PrePrvNum, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002117", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrePrvNum, EmprCod, PrdNum FROM TXPPREPED WHERE ( PrePrvNum < ? or PrePrvNum = ? and EmprCod < ? or EmprCod = ? and PrePrvNum = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrePrvNum DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002118", "SELECT /*+ FIRST_ROWS */ T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) = ?) AND (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002119", "INSERT INTO TXPPREPED(PrePrvNum, PrePedUni, PrePedCon, PrePedPre, PrePedDto, PrePedPri, EmprCod, PrdNum, PedCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPREPED")
         ,new UpdateCursor("T002120", "UPDATE TXPPREPED SET PrePedUni=?, PrePedCon=?, PrePedPre=?, PrePedDto=?, PrePedPri=?, PedCod=?  WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ?", GX_NOMASK, "TXPPREPED")
         ,new UpdateCursor("T002121", "DELETE FROM TXPPREPED  WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ?", GX_NOMASK, "TXPPREPED")
         ,new ForEachCursor("T002122", "SELECT TipDtoCod, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002123", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002124", "SELECT COALESCE( PrvNom, 'Error') AS PrePrvDsc FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002125", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrePrvNum, PrdNum FROM TXPPREPED ORDER BY EmprCod, PrePrvNum, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002126", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (UPPER(RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom))) like '%' || UPPER(?)) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0))) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002127", "SELECT T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) = ?) AND (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002128", "SELECT COALESCE( PrvNom, 'Error') AS PrePrvDsc FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002129", "SELECT /*+ FIRST_ROWS */ T2.PrvNum, RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) AS PrdCDsc, T1.EmprCod, T1.PrdNum, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (RTRIM(LTRIM(T2.PrdNum)) || ' - ' || RTRIM(LTRIM(T2.PrdNom)) = ?) AND (T1.EmprCod = ?) AND (( ? = T1.PrdPrv and ? = 1) or ( ? = T2.PrvNum and ? = 0)) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002130", "SELECT TipDtoCod, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002131", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 3);
               ((String[]) buf[18])[0] = rslt.getString(12, 6);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 28 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               return;
            case 29 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setString(8, (String)parms[12], 6);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
   }

}

