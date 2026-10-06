package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprvgen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"GPOECOCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlagpoecocod2794( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"PRVNUM") == 0 )
      {
         AV59PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PrvNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59PrvNum), "ZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asaprvnum2794( AV59PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"PRVNUM") == 0 )
      {
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         AV80autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asaprvnum2794( A795PrvNum, AV80autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"") == 0 )
      {
         AV58EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa101222794( AV58EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel27"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A497FpgCod = httpContext.GetPar( "FpgCod") ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_44( A396EmprCod, A497FpgCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9728Cod_Clas = (short)(GXutil.lval( httpContext.GetPar( "Cod_Clas"))) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_45( A396EmprCod, A9728Cod_Clas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10122GpoEcoCod = (int)(GXutil.lval( httpContext.GetPar( "GpoEcoCod"))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_46( A396EmprCod, A10122GpoEcoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14030PrvClasID = (short)(GXutil.lval( httpContext.GetPar( "PrvClasID"))) ;
         n14030PrvClasID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_47( A396EmprCod, A14030PrvClasID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( httpContext.GetPar( "PrvDivCo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_48( A3143PrvDivCo) ;
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
            AV58EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
            AV59PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PrvNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59PrvNum), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Proveedores", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tprvgen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprvgen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprvgen_impl.class ));
   }

   public tprvgen_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbPrvTipo = new HTMLChoice();
      chkPrvPri = UIFactory.getCheckbox(this);
      chkPrvAct = UIFactory.getCheckbox(this);
      chkPrvNac = UIFactory.getCheckbox(this);
      cmbPrvTip = new HTMLChoice();
      dynGpoEcoCod = new HTMLChoice();
      dynPrvDivCo = new HTMLChoice();
      cmbPrvDivCod = new HTMLChoice();
      cmbPrvMetTra = new HTMLChoice();
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
      if ( cmbPrvTipo.getItemCount() > 0 )
      {
         A13585PrvTipo = cmbPrvTipo.getValidValue(A13585PrvTipo) ;
         n13585PrvTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvTipo.setValue( GXutil.rtrim( A13585PrvTipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvTipo.getInternalname(), "Values", cmbPrvTipo.ToJavascriptSource(), true);
      }
      A800PrvPri = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A14216PrvAct = ((GXutil.strcmp(GXutil.rtrim( A14216PrvAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
      A14417PrvNac = ((GXutil.strcmp(GXutil.rtrim( A14417PrvNac), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14417PrvNac", A14417PrvNac);
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         A802PrvTip = cmbPrvTip.getValidValue(A802PrvTip) ;
         n802PrvTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
      }
      if ( dynGpoEcoCod.getItemCount() > 0 )
      {
         A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValidValue(GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0))))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Values", dynGpoEcoCod.ToJavascriptSource(), true);
      }
      if ( dynPrvDivCo.getItemCount() > 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValidValue(GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrvDivCo.setValue( GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynPrvDivCo.getInternalname(), "Values", dynPrvDivCo.ToJavascriptSource(), true);
      }
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
      }
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
         n792PrvMetTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvTipo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPrvTipo.getInternalname(), " ", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvTipo, cmbPrvTipo.getInternalname(), GXutil.rtrim( A13585PrvTipo), 1, cmbPrvTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvTipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "", true, (byte)(0), "HLP_TPRVGEN.htm");
      cmbPrvTipo.setValue( GXutil.rtrim( A13585PrvTipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTipo.getInternalname(), "Values", cmbPrvTipo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrvPri.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrvPri.getInternalname(), httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrvPri.getInternalname(), GXutil.str( A800PrvPri, 1, 0), "", httpContext.getMessage( "P", ""), 1, chkPrvPri.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(33, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrvAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrvAct.getInternalname(), httpContext.getMessage( "Activo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrvAct.getInternalname(), A14216PrvAct, "", httpContext.getMessage( "Activo?", ""), 1, chkPrvAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(37, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,37);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrvNac.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrvNac.getInternalname(), httpContext.getMessage( "Nacional?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrvNac.getInternalname(), A14417PrvNac, "", httpContext.getMessage( "Nacional?", ""), 1, chkPrvNac.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(41, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,41);\"");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNom2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom2_Internalname, GXutil.rtrim( A6570PrvNom2), GXutil.rtrim( localUtil.format( A6570PrvNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNif_Internalname, httpContext.getMessage( "N.I.F.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNif_Internalname, GXutil.rtrim( A793PrvNif), GXutil.rtrim( localUtil.format( A793PrvNif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvTip.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPrvTip.getInternalname(), httpContext.getMessage( "Proveedor o Acreador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvTip, cmbPrvTip.getInternalname(), GXutil.rtrim( A802PrvTip), 1, cmbPrvTip.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvTip.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "", true, (byte)(0), "HLP_TPRVGEN.htm");
      cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
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
      /* User Defined Control */
      ucDvpanel_p_datoslocalizacion.setProperty("Width", Dvpanel_p_datoslocalizacion_Width);
      ucDvpanel_p_datoslocalizacion.setProperty("AutoWidth", Dvpanel_p_datoslocalizacion_Autowidth);
      ucDvpanel_p_datoslocalizacion.setProperty("AutoHeight", Dvpanel_p_datoslocalizacion_Autoheight);
      ucDvpanel_p_datoslocalizacion.setProperty("Cls", Dvpanel_p_datoslocalizacion_Cls);
      ucDvpanel_p_datoslocalizacion.setProperty("Title", Dvpanel_p_datoslocalizacion_Title);
      ucDvpanel_p_datoslocalizacion.setProperty("Collapsible", Dvpanel_p_datoslocalizacion_Collapsible);
      ucDvpanel_p_datoslocalizacion.setProperty("Collapsed", Dvpanel_p_datoslocalizacion_Collapsed);
      ucDvpanel_p_datoslocalizacion.setProperty("ShowCollapseIcon", Dvpanel_p_datoslocalizacion_Showcollapseicon);
      ucDvpanel_p_datoslocalizacion.setProperty("IconPosition", Dvpanel_p_datoslocalizacion_Iconposition);
      ucDvpanel_p_datoslocalizacion.setProperty("AutoScroll", Dvpanel_p_datoslocalizacion_Autoscroll);
      ucDvpanel_p_datoslocalizacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_p_datoslocalizacion_Internalname, "DVPANEL_P_DATOSLOCALIZACIONContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_P_DATOSLOCALIZACIONContainer"+"P_DatosLocalizacion"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divP_datoslocalizacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDir_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvDir_Internalname, httpContext.getMessage( "Direccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir_Internalname, GXutil.rtrim( A786PrvDir), GXutil.rtrim( localUtil.format( A786PrvDir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDir_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDir2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvDir2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir2_Internalname, GXutil.rtrim( A6571PrvDir2), GXutil.rtrim( localUtil.format( A6571PrvDir2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDir2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCpo_Internalname, httpContext.getMessage( "Codigo Postal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCpo_Internalname, GXutil.rtrim( A782PrvCpo), GXutil.rtrim( localUtil.format( A782PrvCpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCpo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCpo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCp2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCp2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCp2_Internalname, GXutil.rtrim( A6075PrvCp2), GXutil.rtrim( localUtil.format( A6075PrvCp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPob_Internalname, GXutil.rtrim( A799PrvPob), GXutil.rtrim( localUtil.format( A799PrvPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvTlx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvTlx_Internalname, httpContext.getMessage( "Telex", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlx_Internalname, GXutil.rtrim( A804PrvTlx), GXutil.rtrim( localUtil.format( A804PrvTlx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvTlx_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvTlf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvTlf_Internalname, httpContext.getMessage( "Telefonos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlf_Internalname, GXutil.rtrim( A803PrvTlf), GXutil.rtrim( localUtil.format( A803PrvTlf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvTlf_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvFax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvFax_Internalname, httpContext.getMessage( "Fax", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvFax_Internalname, GXutil.rtrim( A6076PrvFax), GXutil.rtrim( localUtil.format( A6076PrvFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvFax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvFax_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvMail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvMail_Internalname, httpContext.getMessage( "E-mail", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvMail_Internalname, GXutil.rtrim( A6077PrvMail), GXutil.rtrim( localUtil.format( A6077PrvMail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvMail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvMail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divGpoecocod_cell_Internalname, 1, 0, "px", 0, "px", divGpoecocod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", dynGpoEcoCod.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynGpoEcoCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynGpoEcoCod.getInternalname(), httpContext.getMessage( "Grupo Economico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynGpoEcoCod, dynGpoEcoCod.getInternalname(), GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)), 1, dynGpoEcoCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynGpoEcoCod.getVisible(), dynGpoEcoCod.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "", true, (byte)(0), "HLP_TPRVGEN.htm");
      dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Values", dynGpoEcoCod.ToJavascriptSource(), true);
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
      /* User Defined Control */
      ucDvpanel_p_datospago.setProperty("Width", Dvpanel_p_datospago_Width);
      ucDvpanel_p_datospago.setProperty("AutoWidth", Dvpanel_p_datospago_Autowidth);
      ucDvpanel_p_datospago.setProperty("AutoHeight", Dvpanel_p_datospago_Autoheight);
      ucDvpanel_p_datospago.setProperty("Cls", Dvpanel_p_datospago_Cls);
      ucDvpanel_p_datospago.setProperty("Title", Dvpanel_p_datospago_Title);
      ucDvpanel_p_datospago.setProperty("Collapsible", Dvpanel_p_datospago_Collapsible);
      ucDvpanel_p_datospago.setProperty("Collapsed", Dvpanel_p_datospago_Collapsed);
      ucDvpanel_p_datospago.setProperty("ShowCollapseIcon", Dvpanel_p_datospago_Showcollapseicon);
      ucDvpanel_p_datospago.setProperty("IconPosition", Dvpanel_p_datospago_Iconposition);
      ucDvpanel_p_datospago.setProperty("AutoScroll", Dvpanel_p_datospago_Autoscroll);
      ucDvpanel_p_datospago.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_p_datospago_Internalname, "DVPANEL_P_DATOSPAGOContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_P_DATOSPAGOContainer"+"P_DatosPago"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divP_datospago_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfpgcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfpgcod_Internalname, httpContext.getMessage( "Forma de Pago", ""), "", "", lblTextblockfpgcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_fpgcod.setProperty("Caption", Combo_fpgcod_Caption);
      ucCombo_fpgcod.setProperty("Cls", Combo_fpgcod_Cls);
      ucCombo_fpgcod.setProperty("DropDownOptionsTitleSettingsIcons", AV74DDO_TitleSettingsIcons);
      ucCombo_fpgcod.setProperty("DropDownOptionsData", AV71FpgCod_Data);
      ucCombo_fpgcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fpgcod_Internalname, "COMBO_FPGCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFpgCod_Internalname, httpContext.getMessage( "Forma de Pago", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgCod_Internalname, GXutil.rtrim( A497FpgCod), GXutil.rtrim( localUtil.format( A497FpgCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgCod_Jsonclick, 0, "Attribute", "", "", "", "", edtFpgCod_Visible, edtFpgCod_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvVto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvVto_Internalname, httpContext.getMessage( "No.Vtos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvVto_Internalname, GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvVto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvVto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvVto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvPer_Internalname, httpContext.getMessage( "Periodo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPer_Internalname, GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvPer_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPer_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDiaPag_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvDiaPag_Internalname, httpContext.getMessage( "Dias de Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDiaPag_Internalname, GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDiaPag_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDiaPag_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDiaPag_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDtoPP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvDtoPP_Internalname, httpContext.getMessage( "Dto. P. P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDtoPP_Internalname, GXutil.ltrim( localUtil.ntoc( A8160PrvDtoPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDtoPP_Enabled!=0) ? localUtil.format( A8160PrvDtoPP, "ZZ9.99") : localUtil.format( A8160PrvDtoPP, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDtoPP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDtoPP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynPrvDivCo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynPrvDivCo.getInternalname(), httpContext.getMessage( "Divisa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynPrvDivCo, dynPrvDivCo.getInternalname(), GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0)), 1, dynPrvDivCo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynPrvDivCo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "", true, (byte)(0), "HLP_TPRVGEN.htm");
      dynPrvDivCo.setValue( GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynPrvDivCo.getInternalname(), "Values", dynPrvDivCo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvDivCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPrvDivCod.getInternalname(), httpContext.getMessage( "Divisa Traspaso Contable", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvDivCod, cmbPrvDivCod.getInternalname(), GXutil.rtrim( A3092PrvDivCod), 1, cmbPrvDivCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvDivCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "", true, (byte)(0), "HLP_TPRVGEN.htm");
      cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvBan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvBan_Internalname, httpContext.getMessage( " Banco", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvBan_Internalname, GXutil.ltrim( localUtil.ntoc( A780PrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvBan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvBan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvBan_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCta_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCta_Internalname, httpContext.getMessage( "Cuenta Contable", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCta_Internalname, GXutil.rtrim( A783PrvCta), GXutil.rtrim( localUtil.format( A783PrvCta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,167);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCta_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
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
      /* User Defined Control */
      ucDvpanel_p_datoscontabilidad.setProperty("Width", Dvpanel_p_datoscontabilidad_Width);
      ucDvpanel_p_datoscontabilidad.setProperty("AutoWidth", Dvpanel_p_datoscontabilidad_Autowidth);
      ucDvpanel_p_datoscontabilidad.setProperty("AutoHeight", Dvpanel_p_datoscontabilidad_Autoheight);
      ucDvpanel_p_datoscontabilidad.setProperty("Cls", Dvpanel_p_datoscontabilidad_Cls);
      ucDvpanel_p_datoscontabilidad.setProperty("Title", Dvpanel_p_datoscontabilidad_Title);
      ucDvpanel_p_datoscontabilidad.setProperty("Collapsible", Dvpanel_p_datoscontabilidad_Collapsible);
      ucDvpanel_p_datoscontabilidad.setProperty("Collapsed", Dvpanel_p_datoscontabilidad_Collapsed);
      ucDvpanel_p_datoscontabilidad.setProperty("ShowCollapseIcon", Dvpanel_p_datoscontabilidad_Showcollapseicon);
      ucDvpanel_p_datoscontabilidad.setProperty("IconPosition", Dvpanel_p_datoscontabilidad_Iconposition);
      ucDvpanel_p_datoscontabilidad.setProperty("AutoScroll", Dvpanel_p_datoscontabilidad_Autoscroll);
      ucDvpanel_p_datoscontabilidad.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_p_datoscontabilidad_Internalname, "DVPANEL_P_DATOSCONTABILIDADContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_P_DATOSCONTABILIDADContainer"+"P_DatosContabilidad"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divP_datoscontabilidad_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvRep_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvRep_Internalname, httpContext.getMessage( "Representante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvRep_Internalname, GXutil.rtrim( A801PrvRep), GXutil.rtrim( localUtil.format( A801PrvRep, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,180);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvRep_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvRep_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPlaEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvPlaEnt_Internalname, httpContext.getMessage( "Dias Plazo Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPlaEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvMetTra.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPrvMetTra.getInternalname(), httpContext.getMessage( "Metodo Transporte", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvMetTra, cmbPrvMetTra.getInternalname(), GXutil.rtrim( A792PrvMetTra), 1, cmbPrvMetTra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvMetTra.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,188);\"", "", true, (byte)(0), "HLP_TPRVGEN.htm");
      cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvContac_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvContac_Internalname, httpContext.getMessage( "Contacto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPrvContac_Internalname, A6572PrvContac, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", (short)(0), 1, edtPrvContac_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPRVGEN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCar_Internalname, httpContext.getMessage( "Carta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCar_Internalname, GXutil.rtrim( A3314PrvCar), GXutil.rtrim( localUtil.format( A3314PrvCar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedcod_clas_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcod_clas_Internalname, httpContext.getMessage( "Clasificacion", ""), "", "", lblTextblockcod_clas_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_cod_clas.setProperty("Caption", Combo_cod_clas_Caption);
      ucCombo_cod_clas.setProperty("Cls", Combo_cod_clas_Cls);
      ucCombo_cod_clas.setProperty("DropDownOptionsData", AV76Cod_Clas_Data);
      ucCombo_cod_clas.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cod_clas_Internalname, "COMBO_COD_CLASContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCod_Clas_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCod_Clas_Internalname, GXutil.ltrim( localUtil.ntoc( A9728Cod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9728Cod_Clas), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_Clas_Jsonclick, 0, "Attribute", "", "", "", "", edtCod_Clas_Visible, edtCod_Clas_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprvclasid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprvclasid_Internalname, httpContext.getMessage( "Clasificacion Proveedor", ""), "", "", lblTextblockprvclasid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prvclasid.setProperty("Caption", Combo_prvclasid_Caption);
      ucCombo_prvclasid.setProperty("Cls", Combo_prvclasid_Cls);
      ucCombo_prvclasid.setProperty("DropDownOptionsData", AV78PrvClasID_Data);
      ucCombo_prvclasid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvclasid_Internalname, "COMBO_PRVCLASIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvClasID_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvClasID_Internalname, GXutil.ltrim( localUtil.ntoc( A14030PrvClasID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14030PrvClasID), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvClasID_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvClasID_Visible, edtPrvClasID_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV82Pgmname), GXutil.rtrim( localUtil.format( AV82Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_fpgcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofpgcod_Internalname, GXutil.rtrim( AV73ComboFpgCod), GXutil.rtrim( localUtil.format( AV73ComboFpgCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofpgcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofpgcod_Visible, edtavCombofpgcod_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_cod_clas_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombocod_clas_Internalname, GXutil.ltrim( localUtil.ntoc( AV77ComboCod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombocod_clas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77ComboCod_Clas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV77ComboCod_Clas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombocod_clas_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombocod_clas_Visible, edtavCombocod_clas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prvclasid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprvclasid_Internalname, GXutil.ltrim( localUtil.ntoc( AV79ComboPrvClasID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboprvclasid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79ComboPrvClasID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79ComboPrvClasID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprvclasid_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprvclasid_Visible, edtavComboprvclasid_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 247,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,247);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGEN.htm");
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
      e11272 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV74DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFPGCOD_DATA"), AV71FpgCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOD_CLAS_DATA"), AV76Cod_Clas_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVCLASID_DATA"), AV78PrvClasID_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z794PrvNom = httpContext.cgiGet( "Z794PrvNom") ;
            Z786PrvDir = httpContext.cgiGet( "Z786PrvDir") ;
            Z782PrvCpo = httpContext.cgiGet( "Z782PrvCpo") ;
            Z799PrvPob = httpContext.cgiGet( "Z799PrvPob") ;
            Z793PrvNif = httpContext.cgiGet( "Z793PrvNif") ;
            Z803PrvTlf = httpContext.cgiGet( "Z803PrvTlf") ;
            Z800PrvPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z800PrvPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z804PrvTlx = httpContext.cgiGet( "Z804PrvTlx") ;
            Z802PrvTip = httpContext.cgiGet( "Z802PrvTip") ;
            Z805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( "Z805PrvVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( "Z785PrvDiaPag"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( "Z797PrvPer"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z780PrvBan = (int)(localUtil.ctol( httpContext.cgiGet( "Z780PrvBan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z801PrvRep = httpContext.cgiGet( "Z801PrvRep") ;
            Z798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z798PrvPlaEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z792PrvMetTra = httpContext.cgiGet( "Z792PrvMetTra") ;
            Z783PrvCta = httpContext.cgiGet( "Z783PrvCta") ;
            Z3092PrvDivCod = httpContext.cgiGet( "Z3092PrvDivCod") ;
            Z3314PrvCar = httpContext.cgiGet( "Z3314PrvCar") ;
            Z6075PrvCp2 = httpContext.cgiGet( "Z6075PrvCp2") ;
            Z6076PrvFax = httpContext.cgiGet( "Z6076PrvFax") ;
            Z6077PrvMail = httpContext.cgiGet( "Z6077PrvMail") ;
            Z6570PrvNom2 = httpContext.cgiGet( "Z6570PrvNom2") ;
            Z6571PrvDir2 = httpContext.cgiGet( "Z6571PrvDir2") ;
            Z8160PrvDtoPP = localUtil.ctond( httpContext.cgiGet( "Z8160PrvDtoPP")) ;
            Z13585PrvTipo = httpContext.cgiGet( "Z13585PrvTipo") ;
            Z14216PrvAct = httpContext.cgiGet( "Z14216PrvAct") ;
            Z14417PrvNac = httpContext.cgiGet( "Z14417PrvNac") ;
            Z497FpgCod = httpContext.cgiGet( "Z497FpgCod") ;
            Z9728Cod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( "Z9728Cod_Clas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            Z14030PrvClasID = (short)(localUtil.ctol( httpContext.cgiGet( "Z14030PrvClasID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3143PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3143PrvDivCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N497FpgCod = httpContext.cgiGet( "N497FpgCod") ;
            N3143PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( "N3143PrvDivCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9728Cod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( "N9728Cod_Clas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "N10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            N14030PrvClasID = (short)(localUtil.ctol( httpContext.cgiGet( "N14030PrvClasID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13719PrvNNom = httpContext.cgiGet( "PRVNNOM") ;
            AV58EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV59PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vPRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV80autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV63Insert_FpgCod = httpContext.cgiGet( "vINSERT_FPGCOD") ;
            AV64Insert_PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVDIVCO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65Insert_Cod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_COD_CLAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66Insert_GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GPOECOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV70Insert_PrvClasID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVCLASID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A498FpgDsc = httpContext.cgiGet( "FPGDSC") ;
            n498FpgDsc = false ;
            A9729Des_Clas = httpContext.cgiGet( "DES_CLAS") ;
            n9729Des_Clas = false ;
            A10123GpoEcoNom = httpContext.cgiGet( "GPOECONOM") ;
            n10123GpoEcoNom = false ;
            A14031PrvClasDsc = httpContext.cgiGet( "PRVCLASDSC") ;
            A3144PrvDivAbr = httpContext.cgiGet( "PRVDIVABR") ;
            n3144PrvDivAbr = false ;
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
            Dvpanel_p_datoslocalizacion_Objectcall = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Objectcall") ;
            Dvpanel_p_datoslocalizacion_Class = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Class") ;
            Dvpanel_p_datoslocalizacion_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Enabled")) ;
            Dvpanel_p_datoslocalizacion_Width = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Width") ;
            Dvpanel_p_datoslocalizacion_Height = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Height") ;
            Dvpanel_p_datoslocalizacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Autowidth")) ;
            Dvpanel_p_datoslocalizacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Autoheight")) ;
            Dvpanel_p_datoslocalizacion_Cls = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Cls") ;
            Dvpanel_p_datoslocalizacion_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Showheader")) ;
            Dvpanel_p_datoslocalizacion_Title = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Title") ;
            Dvpanel_p_datoslocalizacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Collapsible")) ;
            Dvpanel_p_datoslocalizacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Collapsed")) ;
            Dvpanel_p_datoslocalizacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Showcollapseicon")) ;
            Dvpanel_p_datoslocalizacion_Iconposition = httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Iconposition") ;
            Dvpanel_p_datoslocalizacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Autoscroll")) ;
            Dvpanel_p_datoslocalizacion_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSLOCALIZACION_Visible")) ;
            Combo_fpgcod_Objectcall = httpContext.cgiGet( "COMBO_FPGCOD_Objectcall") ;
            Combo_fpgcod_Class = httpContext.cgiGet( "COMBO_FPGCOD_Class") ;
            Combo_fpgcod_Icontype = httpContext.cgiGet( "COMBO_FPGCOD_Icontype") ;
            Combo_fpgcod_Icon = httpContext.cgiGet( "COMBO_FPGCOD_Icon") ;
            Combo_fpgcod_Caption = httpContext.cgiGet( "COMBO_FPGCOD_Caption") ;
            Combo_fpgcod_Tooltip = httpContext.cgiGet( "COMBO_FPGCOD_Tooltip") ;
            Combo_fpgcod_Cls = httpContext.cgiGet( "COMBO_FPGCOD_Cls") ;
            Combo_fpgcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FPGCOD_Selectedvalue_set") ;
            Combo_fpgcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FPGCOD_Selectedvalue_get") ;
            Combo_fpgcod_Selectedtext_set = httpContext.cgiGet( "COMBO_FPGCOD_Selectedtext_set") ;
            Combo_fpgcod_Selectedtext_get = httpContext.cgiGet( "COMBO_FPGCOD_Selectedtext_get") ;
            Combo_fpgcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FPGCOD_Gamoauthtoken") ;
            Combo_fpgcod_Ddointernalname = httpContext.cgiGet( "COMBO_FPGCOD_Ddointernalname") ;
            Combo_fpgcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FPGCOD_Titlecontrolalign") ;
            Combo_fpgcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FPGCOD_Dropdownoptionstype") ;
            Combo_fpgcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Enabled")) ;
            Combo_fpgcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Visible")) ;
            Combo_fpgcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FPGCOD_Titlecontrolidtoreplace") ;
            Combo_fpgcod_Datalisttype = httpContext.cgiGet( "COMBO_FPGCOD_Datalisttype") ;
            Combo_fpgcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Allowmultipleselection")) ;
            Combo_fpgcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FPGCOD_Datalistfixedvalues") ;
            Combo_fpgcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Isgriditem")) ;
            Combo_fpgcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Hasdescription")) ;
            Combo_fpgcod_Datalistproc = httpContext.cgiGet( "COMBO_FPGCOD_Datalistproc") ;
            Combo_fpgcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FPGCOD_Datalistprocparametersprefix") ;
            Combo_fpgcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FPGCOD_Remoteservicesparameters") ;
            Combo_fpgcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FPGCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fpgcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Includeonlyselectedoption")) ;
            Combo_fpgcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Includeselectalloption")) ;
            Combo_fpgcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Emptyitem")) ;
            Combo_fpgcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Includeaddnewoption")) ;
            Combo_fpgcod_Htmltemplate = httpContext.cgiGet( "COMBO_FPGCOD_Htmltemplate") ;
            Combo_fpgcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FPGCOD_Multiplevaluestype") ;
            Combo_fpgcod_Loadingdata = httpContext.cgiGet( "COMBO_FPGCOD_Loadingdata") ;
            Combo_fpgcod_Noresultsfound = httpContext.cgiGet( "COMBO_FPGCOD_Noresultsfound") ;
            Combo_fpgcod_Emptyitemtext = httpContext.cgiGet( "COMBO_FPGCOD_Emptyitemtext") ;
            Combo_fpgcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FPGCOD_Onlyselectedvalues") ;
            Combo_fpgcod_Selectalltext = httpContext.cgiGet( "COMBO_FPGCOD_Selectalltext") ;
            Combo_fpgcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FPGCOD_Multiplevaluesseparator") ;
            Combo_fpgcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FPGCOD_Addnewoptiontext") ;
            Dvpanel_p_datospago_Objectcall = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Objectcall") ;
            Dvpanel_p_datospago_Class = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Class") ;
            Dvpanel_p_datospago_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Enabled")) ;
            Dvpanel_p_datospago_Width = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Width") ;
            Dvpanel_p_datospago_Height = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Height") ;
            Dvpanel_p_datospago_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Autowidth")) ;
            Dvpanel_p_datospago_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Autoheight")) ;
            Dvpanel_p_datospago_Cls = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Cls") ;
            Dvpanel_p_datospago_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Showheader")) ;
            Dvpanel_p_datospago_Title = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Title") ;
            Dvpanel_p_datospago_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Collapsible")) ;
            Dvpanel_p_datospago_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Collapsed")) ;
            Dvpanel_p_datospago_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Showcollapseicon")) ;
            Dvpanel_p_datospago_Iconposition = httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Iconposition") ;
            Dvpanel_p_datospago_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Autoscroll")) ;
            Dvpanel_p_datospago_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSPAGO_Visible")) ;
            Combo_cod_clas_Objectcall = httpContext.cgiGet( "COMBO_COD_CLAS_Objectcall") ;
            Combo_cod_clas_Class = httpContext.cgiGet( "COMBO_COD_CLAS_Class") ;
            Combo_cod_clas_Icontype = httpContext.cgiGet( "COMBO_COD_CLAS_Icontype") ;
            Combo_cod_clas_Icon = httpContext.cgiGet( "COMBO_COD_CLAS_Icon") ;
            Combo_cod_clas_Caption = httpContext.cgiGet( "COMBO_COD_CLAS_Caption") ;
            Combo_cod_clas_Tooltip = httpContext.cgiGet( "COMBO_COD_CLAS_Tooltip") ;
            Combo_cod_clas_Cls = httpContext.cgiGet( "COMBO_COD_CLAS_Cls") ;
            Combo_cod_clas_Selectedvalue_set = httpContext.cgiGet( "COMBO_COD_CLAS_Selectedvalue_set") ;
            Combo_cod_clas_Selectedvalue_get = httpContext.cgiGet( "COMBO_COD_CLAS_Selectedvalue_get") ;
            Combo_cod_clas_Selectedtext_set = httpContext.cgiGet( "COMBO_COD_CLAS_Selectedtext_set") ;
            Combo_cod_clas_Selectedtext_get = httpContext.cgiGet( "COMBO_COD_CLAS_Selectedtext_get") ;
            Combo_cod_clas_Gamoauthtoken = httpContext.cgiGet( "COMBO_COD_CLAS_Gamoauthtoken") ;
            Combo_cod_clas_Ddointernalname = httpContext.cgiGet( "COMBO_COD_CLAS_Ddointernalname") ;
            Combo_cod_clas_Titlecontrolalign = httpContext.cgiGet( "COMBO_COD_CLAS_Titlecontrolalign") ;
            Combo_cod_clas_Dropdownoptionstype = httpContext.cgiGet( "COMBO_COD_CLAS_Dropdownoptionstype") ;
            Combo_cod_clas_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Enabled")) ;
            Combo_cod_clas_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Visible")) ;
            Combo_cod_clas_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_COD_CLAS_Titlecontrolidtoreplace") ;
            Combo_cod_clas_Datalisttype = httpContext.cgiGet( "COMBO_COD_CLAS_Datalisttype") ;
            Combo_cod_clas_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Allowmultipleselection")) ;
            Combo_cod_clas_Datalistfixedvalues = httpContext.cgiGet( "COMBO_COD_CLAS_Datalistfixedvalues") ;
            Combo_cod_clas_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Isgriditem")) ;
            Combo_cod_clas_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Hasdescription")) ;
            Combo_cod_clas_Datalistproc = httpContext.cgiGet( "COMBO_COD_CLAS_Datalistproc") ;
            Combo_cod_clas_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_COD_CLAS_Datalistprocparametersprefix") ;
            Combo_cod_clas_Remoteservicesparameters = httpContext.cgiGet( "COMBO_COD_CLAS_Remoteservicesparameters") ;
            Combo_cod_clas_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_COD_CLAS_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_cod_clas_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Includeonlyselectedoption")) ;
            Combo_cod_clas_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Includeselectalloption")) ;
            Combo_cod_clas_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Emptyitem")) ;
            Combo_cod_clas_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_CLAS_Includeaddnewoption")) ;
            Combo_cod_clas_Htmltemplate = httpContext.cgiGet( "COMBO_COD_CLAS_Htmltemplate") ;
            Combo_cod_clas_Multiplevaluestype = httpContext.cgiGet( "COMBO_COD_CLAS_Multiplevaluestype") ;
            Combo_cod_clas_Loadingdata = httpContext.cgiGet( "COMBO_COD_CLAS_Loadingdata") ;
            Combo_cod_clas_Noresultsfound = httpContext.cgiGet( "COMBO_COD_CLAS_Noresultsfound") ;
            Combo_cod_clas_Emptyitemtext = httpContext.cgiGet( "COMBO_COD_CLAS_Emptyitemtext") ;
            Combo_cod_clas_Onlyselectedvalues = httpContext.cgiGet( "COMBO_COD_CLAS_Onlyselectedvalues") ;
            Combo_cod_clas_Selectalltext = httpContext.cgiGet( "COMBO_COD_CLAS_Selectalltext") ;
            Combo_cod_clas_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_COD_CLAS_Multiplevaluesseparator") ;
            Combo_cod_clas_Addnewoptiontext = httpContext.cgiGet( "COMBO_COD_CLAS_Addnewoptiontext") ;
            Combo_prvclasid_Objectcall = httpContext.cgiGet( "COMBO_PRVCLASID_Objectcall") ;
            Combo_prvclasid_Class = httpContext.cgiGet( "COMBO_PRVCLASID_Class") ;
            Combo_prvclasid_Icontype = httpContext.cgiGet( "COMBO_PRVCLASID_Icontype") ;
            Combo_prvclasid_Icon = httpContext.cgiGet( "COMBO_PRVCLASID_Icon") ;
            Combo_prvclasid_Caption = httpContext.cgiGet( "COMBO_PRVCLASID_Caption") ;
            Combo_prvclasid_Tooltip = httpContext.cgiGet( "COMBO_PRVCLASID_Tooltip") ;
            Combo_prvclasid_Cls = httpContext.cgiGet( "COMBO_PRVCLASID_Cls") ;
            Combo_prvclasid_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVCLASID_Selectedvalue_set") ;
            Combo_prvclasid_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRVCLASID_Selectedvalue_get") ;
            Combo_prvclasid_Selectedtext_set = httpContext.cgiGet( "COMBO_PRVCLASID_Selectedtext_set") ;
            Combo_prvclasid_Selectedtext_get = httpContext.cgiGet( "COMBO_PRVCLASID_Selectedtext_get") ;
            Combo_prvclasid_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRVCLASID_Gamoauthtoken") ;
            Combo_prvclasid_Ddointernalname = httpContext.cgiGet( "COMBO_PRVCLASID_Ddointernalname") ;
            Combo_prvclasid_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRVCLASID_Titlecontrolalign") ;
            Combo_prvclasid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRVCLASID_Dropdownoptionstype") ;
            Combo_prvclasid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Enabled")) ;
            Combo_prvclasid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Visible")) ;
            Combo_prvclasid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRVCLASID_Titlecontrolidtoreplace") ;
            Combo_prvclasid_Datalisttype = httpContext.cgiGet( "COMBO_PRVCLASID_Datalisttype") ;
            Combo_prvclasid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Allowmultipleselection")) ;
            Combo_prvclasid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRVCLASID_Datalistfixedvalues") ;
            Combo_prvclasid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Isgriditem")) ;
            Combo_prvclasid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Hasdescription")) ;
            Combo_prvclasid_Datalistproc = httpContext.cgiGet( "COMBO_PRVCLASID_Datalistproc") ;
            Combo_prvclasid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRVCLASID_Datalistprocparametersprefix") ;
            Combo_prvclasid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRVCLASID_Remoteservicesparameters") ;
            Combo_prvclasid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRVCLASID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prvclasid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Includeonlyselectedoption")) ;
            Combo_prvclasid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Includeselectalloption")) ;
            Combo_prvclasid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Emptyitem")) ;
            Combo_prvclasid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCLASID_Includeaddnewoption")) ;
            Combo_prvclasid_Htmltemplate = httpContext.cgiGet( "COMBO_PRVCLASID_Htmltemplate") ;
            Combo_prvclasid_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRVCLASID_Multiplevaluestype") ;
            Combo_prvclasid_Loadingdata = httpContext.cgiGet( "COMBO_PRVCLASID_Loadingdata") ;
            Combo_prvclasid_Noresultsfound = httpContext.cgiGet( "COMBO_PRVCLASID_Noresultsfound") ;
            Combo_prvclasid_Emptyitemtext = httpContext.cgiGet( "COMBO_PRVCLASID_Emptyitemtext") ;
            Combo_prvclasid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRVCLASID_Onlyselectedvalues") ;
            Combo_prvclasid_Selectalltext = httpContext.cgiGet( "COMBO_PRVCLASID_Selectalltext") ;
            Combo_prvclasid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRVCLASID_Multiplevaluesseparator") ;
            Combo_prvclasid_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRVCLASID_Addnewoptiontext") ;
            Dvpanel_p_datoscontabilidad_Objectcall = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Objectcall") ;
            Dvpanel_p_datoscontabilidad_Class = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Class") ;
            Dvpanel_p_datoscontabilidad_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Enabled")) ;
            Dvpanel_p_datoscontabilidad_Width = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Width") ;
            Dvpanel_p_datoscontabilidad_Height = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Height") ;
            Dvpanel_p_datoscontabilidad_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Autowidth")) ;
            Dvpanel_p_datoscontabilidad_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Autoheight")) ;
            Dvpanel_p_datoscontabilidad_Cls = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Cls") ;
            Dvpanel_p_datoscontabilidad_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Showheader")) ;
            Dvpanel_p_datoscontabilidad_Title = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Title") ;
            Dvpanel_p_datoscontabilidad_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Collapsible")) ;
            Dvpanel_p_datoscontabilidad_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Collapsed")) ;
            Dvpanel_p_datoscontabilidad_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Showcollapseicon")) ;
            Dvpanel_p_datoscontabilidad_Iconposition = httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Iconposition") ;
            Dvpanel_p_datoscontabilidad_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Autoscroll")) ;
            Dvpanel_p_datoscontabilidad_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_P_DATOSCONTABILIDAD_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A795PrvNum = 0 ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            else
            {
               A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            cmbPrvTipo.setValue( httpContext.cgiGet( cmbPrvTipo.getInternalname()) );
            A13585PrvTipo = httpContext.cgiGet( cmbPrvTipo.getInternalname()) ;
            n13585PrvTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVPRI");
               AnyError = (short)(1) ;
               GX_FocusControl = chkPrvPri.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A800PrvPri = (byte)(0) ;
               n800PrvPri = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
            }
            else
            {
               A800PrvPri = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0)) ;
               n800PrvPri = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
            }
            A14216PrvAct = ((GXutil.strcmp(httpContext.cgiGet( chkPrvAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
            A14417PrvNac = ((GXutil.strcmp(httpContext.cgiGet( chkPrvNac.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14417PrvNac", A14417PrvNac);
            A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
            n794PrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
            A6570PrvNom2 = httpContext.cgiGet( edtPrvNom2_Internalname) ;
            n6570PrvNom2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
            A793PrvNif = httpContext.cgiGet( edtPrvNif_Internalname) ;
            n793PrvNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
            cmbPrvTip.setValue( httpContext.cgiGet( cmbPrvTip.getInternalname()) );
            A802PrvTip = httpContext.cgiGet( cmbPrvTip.getInternalname()) ;
            n802PrvTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
            A786PrvDir = httpContext.cgiGet( edtPrvDir_Internalname) ;
            n786PrvDir = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
            A6571PrvDir2 = httpContext.cgiGet( edtPrvDir2_Internalname) ;
            n6571PrvDir2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
            A782PrvCpo = httpContext.cgiGet( edtPrvCpo_Internalname) ;
            n782PrvCpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
            A6075PrvCp2 = httpContext.cgiGet( edtPrvCp2_Internalname) ;
            n6075PrvCp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
            A799PrvPob = httpContext.cgiGet( edtPrvPob_Internalname) ;
            n799PrvPob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
            A804PrvTlx = httpContext.cgiGet( edtPrvTlx_Internalname) ;
            n804PrvTlx = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
            A803PrvTlf = httpContext.cgiGet( edtPrvTlf_Internalname) ;
            n803PrvTlf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
            A6076PrvFax = httpContext.cgiGet( edtPrvFax_Internalname) ;
            n6076PrvFax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
            A6077PrvMail = httpContext.cgiGet( edtPrvMail_Internalname) ;
            n6077PrvMail = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
            dynGpoEcoCod.setValue( httpContext.cgiGet( dynGpoEcoCod.getInternalname()) );
            A10122GpoEcoCod = (int)(GXutil.lval( httpContext.cgiGet( dynGpoEcoCod.getInternalname()))) ;
            n10122GpoEcoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            A497FpgCod = GXutil.upper( httpContext.cgiGet( edtFpgCod_Internalname)) ;
            n497FpgCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A805PrvVto = (byte)(0) ;
               n805PrvVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
            }
            else
            {
               A805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n805PrvVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVPER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvPer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A797PrvPer = 0 ;
               n797PrvPer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
            }
            else
            {
               A797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n797PrvPer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVDIAPAG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvDiaPag_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A785PrvDiaPag = 0 ;
               n785PrvDiaPag = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
            }
            else
            {
               A785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n785PrvDiaPag = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVDTOPP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvDtoPP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8160PrvDtoPP = DecimalUtil.ZERO ;
               n8160PrvDtoPP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
            }
            else
            {
               A8160PrvDtoPP = localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)) ;
               n8160PrvDtoPP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
            }
            dynPrvDivCo.setValue( httpContext.cgiGet( dynPrvDivCo.getInternalname()) );
            A3143PrvDivCo = (byte)(GXutil.lval( httpContext.cgiGet( dynPrvDivCo.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
            cmbPrvDivCod.setValue( httpContext.cgiGet( cmbPrvDivCod.getInternalname()) );
            A3092PrvDivCod = httpContext.cgiGet( cmbPrvDivCod.getInternalname()) ;
            n3092PrvDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVBAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvBan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A780PrvBan = 0 ;
               n780PrvBan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
            }
            else
            {
               A780PrvBan = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n780PrvBan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
            }
            A783PrvCta = httpContext.cgiGet( edtPrvCta_Internalname) ;
            n783PrvCta = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
            A801PrvRep = httpContext.cgiGet( edtPrvRep_Internalname) ;
            n801PrvRep = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVPLAENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvPlaEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A798PrvPlaEnt = (short)(0) ;
               n798PrvPlaEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
            }
            else
            {
               A798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n798PrvPlaEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
            }
            cmbPrvMetTra.setValue( httpContext.cgiGet( cmbPrvMetTra.getInternalname()) );
            A792PrvMetTra = httpContext.cgiGet( cmbPrvMetTra.getInternalname()) ;
            n792PrvMetTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
            A6572PrvContac = httpContext.cgiGet( edtPrvContac_Internalname) ;
            n6572PrvContac = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
            A3314PrvCar = httpContext.cgiGet( edtPrvCar_Internalname) ;
            n3314PrvCar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCod_Clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCod_Clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COD_CLAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCod_Clas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9728Cod_Clas = (short)(0) ;
               n9728Cod_Clas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            }
            else
            {
               A9728Cod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_Clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9728Cod_Clas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvClasID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvClasID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVCLASID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvClasID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14030PrvClasID = (short)(0) ;
               n14030PrvClasID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
            }
            else
            {
               A14030PrvClasID = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvClasID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n14030PrvClasID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
            }
            AV82Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
            AV73ComboFpgCod = GXutil.upper( httpContext.cgiGet( edtavCombofpgcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73ComboFpgCod", AV73ComboFpgCod);
            AV77ComboCod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombocod_clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77ComboCod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77ComboCod_Clas), 4, 0));
            AV79ComboPrvClasID = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboprvclasid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79ComboPrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79ComboPrvClasID), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPRVGEN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV82Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tprvgen:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
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
                  sMode94 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode94 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound94 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_270( ) ;
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
                        e11272 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12272 ();
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
         e12272 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2794( ) ;
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
         disableAttributes2794( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofpgcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofpgcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocod_clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocod_clas_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvclasid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvclasid_Enabled), 5, 0), true);
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

   public void confirm_270( )
   {
      beforeValidate2794( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2794( ) ;
         }
         else
         {
            checkExtendedTable2794( ) ;
            closeExtendedTableCursors2794( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption270( )
   {
   }

   public void e11272( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprvgen_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV58EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprvgen_impl.this.AV58EmprCod = GXv_char2[0] ;
      tprvgen_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprvgen_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV80autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV58EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tprvgen_impl.this.GXt_int5 = GXv_int6[0] ;
      AV80autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80autonumber), 4, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tprvgen_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV58EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tprvgen_impl.this.AV58EmprCod = GXv_char4[0] ;
      tprvgen_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprvgen_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV60WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV60WWPContext = GXv_SdtWWPContext7[0] ;
      edtPrvClasID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvClasID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvClasID_Visible), 5, 0), true);
      AV79ComboPrvClasID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79ComboPrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79ComboPrvClasID), 4, 0));
      edtavComboprvclasid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvclasid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvclasid_Visible), 5, 0), true);
      edtCod_Clas_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_Clas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_Clas_Visible), 5, 0), true);
      AV77ComboCod_Clas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77ComboCod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77ComboCod_Clas), 4, 0));
      edtavCombocod_clas_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocod_clas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocod_clas_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV74DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV74DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      edtFpgCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Visible), 5, 0), true);
      AV73ComboFpgCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73ComboFpgCod", AV73ComboFpgCod);
      edtavCombofpgcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofpgcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofpgcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFPGCOD' */
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
      /* Execute user subroutine: 'LOADCOMBOCOD_CLAS' */
      S122 ();
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
      /* Execute user subroutine: 'LOADCOMBOPRVCLASID' */
      S132 ();
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
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S142 ();
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
      AV61TrnContext.fromxml(AV62WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV61TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV82Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV83GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83GXV1), 8, 0));
         while ( AV83GXV1 <= AV61TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV67TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV61TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV83GXV1));
            if ( GXutil.strcmp(AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FpgCod") == 0 )
            {
               AV63Insert_FpgCod = AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63Insert_FpgCod", AV63Insert_FpgCod);
               if ( ! (GXutil.strcmp("", AV63Insert_FpgCod)==0) )
               {
                  AV73ComboFpgCod = AV63Insert_FpgCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV73ComboFpgCod", AV73ComboFpgCod);
                  Combo_fpgcod_Selectedvalue_set = AV73ComboFpgCod ;
                  ucCombo_fpgcod.sendProperty(context, "", false, Combo_fpgcod_Internalname, "SelectedValue_set", Combo_fpgcod_Selectedvalue_set);
                  Combo_fpgcod_Enabled = false ;
                  ucCombo_fpgcod.sendProperty(context, "", false, Combo_fpgcod_Internalname, "Enabled", GXutil.booltostr( Combo_fpgcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvDivCo") == 0 )
            {
               AV64Insert_PrvDivCo = (byte)(GXutil.lval( AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64Insert_PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Insert_PrvDivCo), 2, 0));
            }
            else if ( GXutil.strcmp(AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "Cod_Clas") == 0 )
            {
               AV65Insert_Cod_Clas = (short)(GXutil.lval( AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65Insert_Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Insert_Cod_Clas), 4, 0));
               if ( ! (0==AV65Insert_Cod_Clas) )
               {
                  AV77ComboCod_Clas = AV65Insert_Cod_Clas ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV77ComboCod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77ComboCod_Clas), 4, 0));
                  Combo_cod_clas_Selectedvalue_set = GXutil.trim( GXutil.str( AV77ComboCod_Clas, 4, 0)) ;
                  ucCombo_cod_clas.sendProperty(context, "", false, Combo_cod_clas_Internalname, "SelectedValue_set", Combo_cod_clas_Selectedvalue_set);
                  Combo_cod_clas_Enabled = false ;
                  ucCombo_cod_clas.sendProperty(context, "", false, Combo_cod_clas_Internalname, "Enabled", GXutil.booltostr( Combo_cod_clas_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GpoEcoCod") == 0 )
            {
               AV66Insert_GpoEcoCod = (int)(GXutil.lval( AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66Insert_GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66Insert_GpoEcoCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvClasID") == 0 )
            {
               AV70Insert_PrvClasID = (short)(GXutil.lval( AV67TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Insert_PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Insert_PrvClasID), 4, 0));
               if ( ! (0==AV70Insert_PrvClasID) )
               {
                  AV79ComboPrvClasID = AV70Insert_PrvClasID ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV79ComboPrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79ComboPrvClasID), 4, 0));
                  Combo_prvclasid_Selectedvalue_set = GXutil.trim( GXutil.str( AV79ComboPrvClasID, 4, 0)) ;
                  ucCombo_prvclasid.sendProperty(context, "", false, Combo_prvclasid_Internalname, "SelectedValue_set", Combo_prvclasid_Selectedvalue_set);
                  Combo_prvclasid_Enabled = false ;
                  ucCombo_prvclasid.sendProperty(context, "", false, Combo_prvclasid_Internalname, "Enabled", GXutil.booltostr( Combo_prvclasid_Enabled));
               }
            }
            AV83GXV1 = (int)(AV83GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e12272( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV61TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tprvgenww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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

   public void S142( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      dynGpoEcoCod.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Visible", GXutil.ltrimstr( dynGpoEcoCod.getVisible(), 5, 0), true);
      divGpoecocod_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divGpoecocod_cell_Internalname, "Class", divGpoecocod_cell_Class, true);
   }

   public void S132( )
   {
      /* 'LOADCOMBOPRVCLASID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV78PrvClasID_Data ;
      GXv_char4[0] = AV72ComboSelectedValue ;
      GXv_char3[0] = AV75ComboSelectedText ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tprvgenloaddvcombo(remoteHandle, context).execute( "PrvClasID", Gx_mode, AV58EmprCod, AV59PrvNum, GXv_char4, GXv_char3, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tprvgen_impl.this.AV72ComboSelectedValue = GXv_char4[0] ;
      tprvgen_impl.this.AV75ComboSelectedText = GXv_char3[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV78PrvClasID_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_prvclasid_Selectedvalue_set = AV72ComboSelectedValue ;
      ucCombo_prvclasid.sendProperty(context, "", false, Combo_prvclasid_Internalname, "SelectedValue_set", Combo_prvclasid_Selectedvalue_set);
      AV79ComboPrvClasID = (short)(GXutil.lval( AV72ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79ComboPrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79ComboPrvClasID), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prvclasid_Enabled = false ;
         ucCombo_prvclasid.sendProperty(context, "", false, Combo_prvclasid_Internalname, "Enabled", GXutil.booltostr( Combo_prvclasid_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOCOD_CLAS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV76Cod_Clas_Data ;
      GXv_char4[0] = AV72ComboSelectedValue ;
      GXv_char3[0] = AV75ComboSelectedText ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tprvgenloaddvcombo(remoteHandle, context).execute( "Cod_Clas", Gx_mode, AV58EmprCod, AV59PrvNum, GXv_char4, GXv_char3, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tprvgen_impl.this.AV72ComboSelectedValue = GXv_char4[0] ;
      tprvgen_impl.this.AV75ComboSelectedText = GXv_char3[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV76Cod_Clas_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_cod_clas_Selectedvalue_set = AV72ComboSelectedValue ;
      ucCombo_cod_clas.sendProperty(context, "", false, Combo_cod_clas_Internalname, "SelectedValue_set", Combo_cod_clas_Selectedvalue_set);
      AV77ComboCod_Clas = (short)(GXutil.lval( AV72ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77ComboCod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77ComboCod_Clas), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_cod_clas_Enabled = false ;
         ucCombo_cod_clas.sendProperty(context, "", false, Combo_cod_clas_Internalname, "Enabled", GXutil.booltostr( Combo_cod_clas_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOFPGCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV71FpgCod_Data ;
      GXv_char4[0] = AV72ComboSelectedValue ;
      GXv_char3[0] = AV75ComboSelectedText ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tprvgenloaddvcombo(remoteHandle, context).execute( "FpgCod", Gx_mode, AV58EmprCod, AV59PrvNum, GXv_char4, GXv_char3, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tprvgen_impl.this.AV72ComboSelectedValue = GXv_char4[0] ;
      tprvgen_impl.this.AV75ComboSelectedText = GXv_char3[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV71FpgCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_fpgcod_Selectedvalue_set = AV72ComboSelectedValue ;
      ucCombo_fpgcod.sendProperty(context, "", false, Combo_fpgcod_Internalname, "SelectedValue_set", Combo_fpgcod_Selectedvalue_set);
      AV73ComboFpgCod = AV72ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73ComboFpgCod", AV73ComboFpgCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_fpgcod_Enabled = false ;
         ucCombo_fpgcod.sendProperty(context, "", false, Combo_fpgcod_Internalname, "Enabled", GXutil.booltostr( Combo_fpgcod_Enabled));
      }
   }

   public void zm2794( int GX_JID )
   {
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z794PrvNom = T00273_A794PrvNom[0] ;
            Z786PrvDir = T00273_A786PrvDir[0] ;
            Z782PrvCpo = T00273_A782PrvCpo[0] ;
            Z799PrvPob = T00273_A799PrvPob[0] ;
            Z793PrvNif = T00273_A793PrvNif[0] ;
            Z803PrvTlf = T00273_A803PrvTlf[0] ;
            Z800PrvPri = T00273_A800PrvPri[0] ;
            Z804PrvTlx = T00273_A804PrvTlx[0] ;
            Z802PrvTip = T00273_A802PrvTip[0] ;
            Z805PrvVto = T00273_A805PrvVto[0] ;
            Z785PrvDiaPag = T00273_A785PrvDiaPag[0] ;
            Z797PrvPer = T00273_A797PrvPer[0] ;
            Z780PrvBan = T00273_A780PrvBan[0] ;
            Z801PrvRep = T00273_A801PrvRep[0] ;
            Z798PrvPlaEnt = T00273_A798PrvPlaEnt[0] ;
            Z792PrvMetTra = T00273_A792PrvMetTra[0] ;
            Z783PrvCta = T00273_A783PrvCta[0] ;
            Z3092PrvDivCod = T00273_A3092PrvDivCod[0] ;
            Z3314PrvCar = T00273_A3314PrvCar[0] ;
            Z6075PrvCp2 = T00273_A6075PrvCp2[0] ;
            Z6076PrvFax = T00273_A6076PrvFax[0] ;
            Z6077PrvMail = T00273_A6077PrvMail[0] ;
            Z6570PrvNom2 = T00273_A6570PrvNom2[0] ;
            Z6571PrvDir2 = T00273_A6571PrvDir2[0] ;
            Z8160PrvDtoPP = T00273_A8160PrvDtoPP[0] ;
            Z13585PrvTipo = T00273_A13585PrvTipo[0] ;
            Z14216PrvAct = T00273_A14216PrvAct[0] ;
            Z14417PrvNac = T00273_A14417PrvNac[0] ;
            Z497FpgCod = T00273_A497FpgCod[0] ;
            Z9728Cod_Clas = T00273_A9728Cod_Clas[0] ;
            Z10122GpoEcoCod = T00273_A10122GpoEcoCod[0] ;
            Z14030PrvClasID = T00273_A14030PrvClasID[0] ;
            Z3143PrvDivCo = T00273_A3143PrvDivCo[0] ;
         }
         else
         {
            Z794PrvNom = A794PrvNom ;
            Z786PrvDir = A786PrvDir ;
            Z782PrvCpo = A782PrvCpo ;
            Z799PrvPob = A799PrvPob ;
            Z793PrvNif = A793PrvNif ;
            Z803PrvTlf = A803PrvTlf ;
            Z800PrvPri = A800PrvPri ;
            Z804PrvTlx = A804PrvTlx ;
            Z802PrvTip = A802PrvTip ;
            Z805PrvVto = A805PrvVto ;
            Z785PrvDiaPag = A785PrvDiaPag ;
            Z797PrvPer = A797PrvPer ;
            Z780PrvBan = A780PrvBan ;
            Z801PrvRep = A801PrvRep ;
            Z798PrvPlaEnt = A798PrvPlaEnt ;
            Z792PrvMetTra = A792PrvMetTra ;
            Z783PrvCta = A783PrvCta ;
            Z3092PrvDivCod = A3092PrvDivCod ;
            Z3314PrvCar = A3314PrvCar ;
            Z6075PrvCp2 = A6075PrvCp2 ;
            Z6076PrvFax = A6076PrvFax ;
            Z6077PrvMail = A6077PrvMail ;
            Z6570PrvNom2 = A6570PrvNom2 ;
            Z6571PrvDir2 = A6571PrvDir2 ;
            Z8160PrvDtoPP = A8160PrvDtoPP ;
            Z13585PrvTipo = A13585PrvTipo ;
            Z14216PrvAct = A14216PrvAct ;
            Z14417PrvNac = A14417PrvNac ;
            Z497FpgCod = A497FpgCod ;
            Z9728Cod_Clas = A9728Cod_Clas ;
            Z10122GpoEcoCod = A10122GpoEcoCod ;
            Z14030PrvClasID = A14030PrvClasID ;
            Z3143PrvDivCo = A3143PrvDivCo ;
         }
      }
      if ( GX_JID == -42 )
      {
         Z795PrvNum = A795PrvNum ;
         Z794PrvNom = A794PrvNom ;
         Z786PrvDir = A786PrvDir ;
         Z782PrvCpo = A782PrvCpo ;
         Z799PrvPob = A799PrvPob ;
         Z793PrvNif = A793PrvNif ;
         Z803PrvTlf = A803PrvTlf ;
         Z800PrvPri = A800PrvPri ;
         Z804PrvTlx = A804PrvTlx ;
         Z802PrvTip = A802PrvTip ;
         Z805PrvVto = A805PrvVto ;
         Z785PrvDiaPag = A785PrvDiaPag ;
         Z797PrvPer = A797PrvPer ;
         Z780PrvBan = A780PrvBan ;
         Z801PrvRep = A801PrvRep ;
         Z798PrvPlaEnt = A798PrvPlaEnt ;
         Z792PrvMetTra = A792PrvMetTra ;
         Z783PrvCta = A783PrvCta ;
         Z3092PrvDivCod = A3092PrvDivCod ;
         Z3314PrvCar = A3314PrvCar ;
         Z6075PrvCp2 = A6075PrvCp2 ;
         Z6076PrvFax = A6076PrvFax ;
         Z6077PrvMail = A6077PrvMail ;
         Z6570PrvNom2 = A6570PrvNom2 ;
         Z6571PrvDir2 = A6571PrvDir2 ;
         Z6572PrvContac = A6572PrvContac ;
         Z8160PrvDtoPP = A8160PrvDtoPP ;
         Z13585PrvTipo = A13585PrvTipo ;
         Z14216PrvAct = A14216PrvAct ;
         Z14417PrvNac = A14417PrvNac ;
         Z396EmprCod = A396EmprCod ;
         Z497FpgCod = A497FpgCod ;
         Z9728Cod_Clas = A9728Cod_Clas ;
         Z10122GpoEcoCod = A10122GpoEcoCod ;
         Z14030PrvClasID = A14030PrvClasID ;
         Z3143PrvDivCo = A3143PrvDivCo ;
         Z407EmprNom = A407EmprNom ;
         Z498FpgDsc = A498FpgDsc ;
         Z3144PrvDivAbr = A3144PrvDivAbr ;
         Z9729Des_Clas = A9729Des_Clas ;
         Z10123GpoEcoNom = A10123GpoEcoNom ;
         Z14031PrvClasDsc = A14031PrvClasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV82Pgmname = "TPRVGEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV58EmprCod)==0) )
      {
         A396EmprCod = AV58EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV58EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV58EmprCod, httpContext.getMessage( httpContext.getMessage( "RONTAL", ""), ""), GXv_int6) ;
      tprvgen_impl.this.GXt_int5 = GXv_int6[0] ;
      dynGpoEcoCod.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Visible", GXutil.ltrimstr( dynGpoEcoCod.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV58EmprCod, httpContext.getMessage( httpContext.getMessage( "RONTAL", ""), ""), GXv_int6) ;
      tprvgen_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divGpoecocod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divGpoecocod_cell_Internalname, "Class", divGpoecocod_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV58EmprCod, httpContext.getMessage( httpContext.getMessage( "RONTAL", ""), ""), GXv_int6) ;
         tprvgen_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divGpoecocod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divGpoecocod_cell_Internalname, "Class", divGpoecocod_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV58EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV59PrvNum) )
      {
         A795PrvNum = AV59PrvNum ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      if ( ! (0==AV59PrvNum) )
      {
         edtPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      }
      if ( ! (0==AV59PrvNum) )
      {
         edtPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV63Insert_FpgCod)==0) )
      {
         edtFpgCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFpgCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV64Insert_PrvDivCo) )
      {
         dynPrvDivCo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynPrvDivCo.getInternalname(), "Enabled", GXutil.ltrimstr( dynPrvDivCo.getEnabled(), 5, 0), true);
      }
      else
      {
         dynPrvDivCo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynPrvDivCo.getInternalname(), "Enabled", GXutil.ltrimstr( dynPrvDivCo.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV65Insert_Cod_Clas) )
      {
         edtCod_Clas_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_Clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_Clas_Enabled), 5, 0), true);
      }
      else
      {
         edtCod_Clas_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_Clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_Clas_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV66Insert_GpoEcoCod) )
      {
         dynGpoEcoCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynGpoEcoCod.getEnabled(), 5, 0), true);
      }
      else
      {
         dynGpoEcoCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynGpoEcoCod.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV70Insert_PrvClasID) )
      {
         edtPrvClasID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvClasID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvClasID_Enabled), 5, 0), true);
      }
      else
      {
         edtPrvClasID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvClasID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvClasID_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV66Insert_GpoEcoCod) )
      {
         A10122GpoEcoCod = AV66Insert_GpoEcoCod ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV64Insert_PrvDivCo) )
      {
         A3143PrvDivCo = AV64Insert_PrvDivCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV63Insert_FpgCod)==0) )
      {
         A497FpgCod = AV63Insert_FpgCod ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      }
      else
      {
         if ( (GXutil.strcmp("", AV73ComboFpgCod)==0) )
         {
            A497FpgCod = "" ;
            n497FpgCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            n497FpgCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV73ComboFpgCod)==0) )
            {
               A497FpgCod = AV73ComboFpgCod ;
               n497FpgCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV65Insert_Cod_Clas) )
      {
         A9728Cod_Clas = AV65Insert_Cod_Clas ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      }
      else
      {
         if ( (0==AV77ComboCod_Clas) )
         {
            A9728Cod_Clas = (short)(0) ;
            n9728Cod_Clas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            n9728Cod_Clas = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         }
         else
         {
            if ( ! (0==AV77ComboCod_Clas) )
            {
               A9728Cod_Clas = AV77ComboCod_Clas ;
               n9728Cod_Clas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV70Insert_PrvClasID) )
      {
         A14030PrvClasID = AV70Insert_PrvClasID ;
         n14030PrvClasID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
      }
      else
      {
         if ( (0==AV79ComboPrvClasID) )
         {
            A14030PrvClasID = (short)(0) ;
            n14030PrvClasID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
            n14030PrvClasID = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
         }
         else
         {
            if ( ! (0==AV79ComboPrvClasID) )
            {
               A14030PrvClasID = AV79ComboPrvClasID ;
               n14030PrvClasID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
            }
         }
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
      if ( isIns( )  && (0==A800PrvPri) && ( Gx_BScreen == 0 ) )
      {
         A800PrvPri = (byte)(1) ;
         n800PrvPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A802PrvTip)==0) && ( Gx_BScreen == 0 ) )
      {
         A802PrvTip = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         n802PrvTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      }
      if ( isIns( )  && (GXutil.strcmp("", A792PrvMetTra)==0) && ( Gx_BScreen == 0 ) )
      {
         A792PrvMetTra = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         n792PrvMetTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
      }
      if ( isIns( )  && (GXutil.strcmp("", A13585PrvTipo)==0) && ( Gx_BScreen == 0 ) )
      {
         A13585PrvTipo = httpContext.getMessage( httpContext.getMessage( "I", ""), "") ;
         n13585PrvTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14216PrvAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A14216PrvAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T00274 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T00274_A407EmprNom[0] ;
         n407EmprNom = T00274_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(2);
         gxagpoecocod_html2794( A396EmprCod) ;
         /* Using cursor T00277 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
         A10123GpoEcoNom = T00277_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T00277_n10123GpoEcoNom[0] ;
         pr_default.close(5);
         /* Using cursor T00279 */
         pr_default.execute(7, new Object[] {Byte.valueOf(A3143PrvDivCo)});
         A3144PrvDivAbr = T00279_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T00279_n3144PrvDivAbr[0] ;
         pr_default.close(7);
         /* Using cursor T00275 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         A498FpgDsc = T00275_A498FpgDsc[0] ;
         n498FpgDsc = T00275_n498FpgDsc[0] ;
         pr_default.close(3);
         /* Using cursor T00276 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
         A9729Des_Clas = T00276_A9729Des_Clas[0] ;
         n9729Des_Clas = T00276_n9729Des_Clas[0] ;
         pr_default.close(4);
         /* Using cursor T00278 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID)});
         A14031PrvClasDsc = T00278_A14031PrvClasDsc[0] ;
         pr_default.close(6);
      }
   }

   public void load2794( )
   {
      /* Using cursor T002710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound94 = (short)(1) ;
         A6572PrvContac = T002710_A6572PrvContac[0] ;
         n6572PrvContac = T002710_n6572PrvContac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
         A407EmprNom = T002710_A407EmprNom[0] ;
         n407EmprNom = T002710_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A794PrvNom = T002710_A794PrvNom[0] ;
         n794PrvNom = T002710_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A786PrvDir = T002710_A786PrvDir[0] ;
         n786PrvDir = T002710_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A782PrvCpo = T002710_A782PrvCpo[0] ;
         n782PrvCpo = T002710_n782PrvCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
         A799PrvPob = T002710_A799PrvPob[0] ;
         n799PrvPob = T002710_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A793PrvNif = T002710_A793PrvNif[0] ;
         n793PrvNif = T002710_n793PrvNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
         A803PrvTlf = T002710_A803PrvTlf[0] ;
         n803PrvTlf = T002710_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A800PrvPri = T002710_A800PrvPri[0] ;
         n800PrvPri = T002710_n800PrvPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
         A804PrvTlx = T002710_A804PrvTlx[0] ;
         n804PrvTlx = T002710_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A802PrvTip = T002710_A802PrvTip[0] ;
         n802PrvTip = T002710_n802PrvTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
         A498FpgDsc = T002710_A498FpgDsc[0] ;
         n498FpgDsc = T002710_n498FpgDsc[0] ;
         A805PrvVto = T002710_A805PrvVto[0] ;
         n805PrvVto = T002710_n805PrvVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
         A785PrvDiaPag = T002710_A785PrvDiaPag[0] ;
         n785PrvDiaPag = T002710_n785PrvDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
         A797PrvPer = T002710_A797PrvPer[0] ;
         n797PrvPer = T002710_n797PrvPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
         A780PrvBan = T002710_A780PrvBan[0] ;
         n780PrvBan = T002710_n780PrvBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
         A801PrvRep = T002710_A801PrvRep[0] ;
         n801PrvRep = T002710_n801PrvRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
         A798PrvPlaEnt = T002710_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = T002710_n798PrvPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
         A792PrvMetTra = T002710_A792PrvMetTra[0] ;
         n792PrvMetTra = T002710_n792PrvMetTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
         A783PrvCta = T002710_A783PrvCta[0] ;
         n783PrvCta = T002710_n783PrvCta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
         A3092PrvDivCod = T002710_A3092PrvDivCod[0] ;
         n3092PrvDivCod = T002710_n3092PrvDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
         A3144PrvDivAbr = T002710_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T002710_n3144PrvDivAbr[0] ;
         A3314PrvCar = T002710_A3314PrvCar[0] ;
         n3314PrvCar = T002710_n3314PrvCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
         A6075PrvCp2 = T002710_A6075PrvCp2[0] ;
         n6075PrvCp2 = T002710_n6075PrvCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
         A6076PrvFax = T002710_A6076PrvFax[0] ;
         n6076PrvFax = T002710_n6076PrvFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
         A6077PrvMail = T002710_A6077PrvMail[0] ;
         n6077PrvMail = T002710_n6077PrvMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
         A6570PrvNom2 = T002710_A6570PrvNom2[0] ;
         n6570PrvNom2 = T002710_n6570PrvNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
         A6571PrvDir2 = T002710_A6571PrvDir2[0] ;
         n6571PrvDir2 = T002710_n6571PrvDir2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
         A8160PrvDtoPP = T002710_A8160PrvDtoPP[0] ;
         n8160PrvDtoPP = T002710_n8160PrvDtoPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
         A9729Des_Clas = T002710_A9729Des_Clas[0] ;
         n9729Des_Clas = T002710_n9729Des_Clas[0] ;
         A10123GpoEcoNom = T002710_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T002710_n10123GpoEcoNom[0] ;
         A13585PrvTipo = T002710_A13585PrvTipo[0] ;
         n13585PrvTipo = T002710_n13585PrvTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
         A14031PrvClasDsc = T002710_A14031PrvClasDsc[0] ;
         A14216PrvAct = T002710_A14216PrvAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
         A14417PrvNac = T002710_A14417PrvNac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14417PrvNac", A14417PrvNac);
         A497FpgCod = T002710_A497FpgCod[0] ;
         n497FpgCod = T002710_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         A9728Cod_Clas = T002710_A9728Cod_Clas[0] ;
         n9728Cod_Clas = T002710_n9728Cod_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         A10122GpoEcoCod = T002710_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T002710_n10122GpoEcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A14030PrvClasID = T002710_A14030PrvClasID[0] ;
         n14030PrvClasID = T002710_n14030PrvClasID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
         A3143PrvDivCo = T002710_A3143PrvDivCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         zm2794( -42) ;
      }
      pr_default.close(8);
      onLoadActions2794( ) ;
   }

   public void onLoadActions2794( )
   {
      gxagpoecocod_html2794( A396EmprCod) ;
      A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
   }

   public void checkExtendedTable2794( )
   {
      nIsDirty_94 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00274 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00274_A407EmprNom[0] ;
      n407EmprNom = T00274_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T00275 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A497FpgCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A498FpgDsc = T00275_A498FpgDsc[0] ;
      n498FpgDsc = T00275_n498FpgDsc[0] ;
      pr_default.close(3);
      /* Using cursor T00276 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9728Cod_Clas) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ISOTB1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_CLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9729Des_Clas = T00276_A9729Des_Clas[0] ;
      n9729Des_Clas = T00276_n9729Des_Clas[0] ;
      pr_default.close(4);
      /* Using cursor T00277 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10123GpoEcoNom = T00277_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T00277_n10123GpoEcoNom[0] ;
      pr_default.close(5);
      /* Using cursor T00278 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A14030PrvClasID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCLASID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A14031PrvClasDsc = T00278_A14031PrvClasDsc[0] ;
      pr_default.close(6);
      gxagpoecocod_html2794( A396EmprCod) ;
      nIsDirty_94 = (short)(1) ;
      A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
      if ( ! ( ( A800PrvPri == 0 ) || ( A800PrvPri == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = chkPrvPri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A802PrvTip, "P") == 0 ) || ( GXutil.strcmp(A802PrvTip, "A") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPrvTip.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A792PrvMetTra, "N") == 0 ) || ( GXutil.strcmp(A792PrvMetTra, "S") == 0 ) || ( GXutil.strcmp(A792PrvMetTra, "A") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Metodo Transporte", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVMETTRA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPrvMetTra.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00279 */
      pr_default.execute(7, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
         GX_FocusControl = dynPrvDivCo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3144PrvDivAbr = T00279_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T00279_n3144PrvDivAbr[0] ;
      pr_default.close(7);
      if ( ! ( GxRegex.IsMatch(A6077PrvMail,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXM_DoesNotMatchRegExp", ""), httpContext.getMessage( "Mail", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvMail_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors2794( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_43( String A396EmprCod )
   {
      /* Using cursor T002711 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T002711_A407EmprNom[0] ;
      n407EmprNom = T002711_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_44( String A396EmprCod ,
                          String A497FpgCod )
   {
      /* Using cursor T002712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A497FpgCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A498FpgDsc = T002712_A498FpgDsc[0] ;
      n498FpgDsc = T002712_n498FpgDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A498FpgDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_45( String A396EmprCod ,
                          short A9728Cod_Clas )
   {
      /* Using cursor T002713 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9728Cod_Clas) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ISOTB1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_CLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9729Des_Clas = T002713_A9729Des_Clas[0] ;
      n9729Des_Clas = T002713_n9729Des_Clas[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9729Des_Clas))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_46( String A396EmprCod ,
                          int A10122GpoEcoCod )
   {
      /* Using cursor T002714 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10123GpoEcoNom = T002714_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T002714_n10123GpoEcoNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A10123GpoEcoNom)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_47( String A396EmprCod ,
                          short A14030PrvClasID )
   {
      /* Using cursor T002715 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A14030PrvClasID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCLASID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A14031PrvClasDsc = T002715_A14031PrvClasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14031PrvClasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_48( byte A3143PrvDivCo )
   {
      /* Using cursor T002716 */
      pr_default.execute(14, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
         GX_FocusControl = dynPrvDivCo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3144PrvDivAbr = T002716_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T002716_n3144PrvDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3144PrvDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey2794( )
   {
      /* Using cursor T002717 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound94 = (short)(1) ;
      }
      else
      {
         RcdFound94 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00273 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2794( 42) ;
         RcdFound94 = (short)(1) ;
         A6572PrvContac = T00273_A6572PrvContac[0] ;
         n6572PrvContac = T00273_n6572PrvContac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
         A795PrvNum = T00273_A795PrvNum[0] ;
         n795PrvNum = T00273_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A794PrvNom = T00273_A794PrvNom[0] ;
         n794PrvNom = T00273_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A786PrvDir = T00273_A786PrvDir[0] ;
         n786PrvDir = T00273_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A782PrvCpo = T00273_A782PrvCpo[0] ;
         n782PrvCpo = T00273_n782PrvCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
         A799PrvPob = T00273_A799PrvPob[0] ;
         n799PrvPob = T00273_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A793PrvNif = T00273_A793PrvNif[0] ;
         n793PrvNif = T00273_n793PrvNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
         A803PrvTlf = T00273_A803PrvTlf[0] ;
         n803PrvTlf = T00273_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A800PrvPri = T00273_A800PrvPri[0] ;
         n800PrvPri = T00273_n800PrvPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
         A804PrvTlx = T00273_A804PrvTlx[0] ;
         n804PrvTlx = T00273_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A802PrvTip = T00273_A802PrvTip[0] ;
         n802PrvTip = T00273_n802PrvTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
         A805PrvVto = T00273_A805PrvVto[0] ;
         n805PrvVto = T00273_n805PrvVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
         A785PrvDiaPag = T00273_A785PrvDiaPag[0] ;
         n785PrvDiaPag = T00273_n785PrvDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
         A797PrvPer = T00273_A797PrvPer[0] ;
         n797PrvPer = T00273_n797PrvPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
         A780PrvBan = T00273_A780PrvBan[0] ;
         n780PrvBan = T00273_n780PrvBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
         A801PrvRep = T00273_A801PrvRep[0] ;
         n801PrvRep = T00273_n801PrvRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
         A798PrvPlaEnt = T00273_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = T00273_n798PrvPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
         A792PrvMetTra = T00273_A792PrvMetTra[0] ;
         n792PrvMetTra = T00273_n792PrvMetTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
         A783PrvCta = T00273_A783PrvCta[0] ;
         n783PrvCta = T00273_n783PrvCta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
         A3092PrvDivCod = T00273_A3092PrvDivCod[0] ;
         n3092PrvDivCod = T00273_n3092PrvDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
         A3314PrvCar = T00273_A3314PrvCar[0] ;
         n3314PrvCar = T00273_n3314PrvCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
         A6075PrvCp2 = T00273_A6075PrvCp2[0] ;
         n6075PrvCp2 = T00273_n6075PrvCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
         A6076PrvFax = T00273_A6076PrvFax[0] ;
         n6076PrvFax = T00273_n6076PrvFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
         A6077PrvMail = T00273_A6077PrvMail[0] ;
         n6077PrvMail = T00273_n6077PrvMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
         A6570PrvNom2 = T00273_A6570PrvNom2[0] ;
         n6570PrvNom2 = T00273_n6570PrvNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
         A6571PrvDir2 = T00273_A6571PrvDir2[0] ;
         n6571PrvDir2 = T00273_n6571PrvDir2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
         A8160PrvDtoPP = T00273_A8160PrvDtoPP[0] ;
         n8160PrvDtoPP = T00273_n8160PrvDtoPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
         A13585PrvTipo = T00273_A13585PrvTipo[0] ;
         n13585PrvTipo = T00273_n13585PrvTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
         A14216PrvAct = T00273_A14216PrvAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
         A14417PrvNac = T00273_A14417PrvNac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14417PrvNac", A14417PrvNac);
         A396EmprCod = T00273_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A497FpgCod = T00273_A497FpgCod[0] ;
         n497FpgCod = T00273_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         A9728Cod_Clas = T00273_A9728Cod_Clas[0] ;
         n9728Cod_Clas = T00273_n9728Cod_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         A10122GpoEcoCod = T00273_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T00273_n10122GpoEcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A14030PrvClasID = T00273_A14030PrvClasID[0] ;
         n14030PrvClasID = T00273_n14030PrvClasID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
         A3143PrvDivCo = T00273_A3143PrvDivCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         sMode94 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2794( ) ;
         if ( AnyError == 1 )
         {
            RcdFound94 = (short)(0) ;
            initializeNonKey2794( ) ;
         }
         Gx_mode = sMode94 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound94 = (short)(0) ;
         initializeNonKey2794( ) ;
         sMode94 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode94 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2794( ) ;
      if ( RcdFound94 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound94 = (short)(0) ;
      /* Using cursor T002718 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T002718_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002718_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002718_A795PrvNum[0] < A795PrvNum ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T002718_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002718_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002718_A795PrvNum[0] > A795PrvNum ) ) )
         {
            A396EmprCod = T002718_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A795PrvNum = T002718_A795PrvNum[0] ;
            n795PrvNum = T002718_n795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            RcdFound94 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound94 = (short)(0) ;
      /* Using cursor T002719 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T002719_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002719_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002719_A795PrvNum[0] > A795PrvNum ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T002719_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002719_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002719_A795PrvNum[0] < A795PrvNum ) ) )
         {
            A396EmprCod = T002719_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A795PrvNum = T002719_A795PrvNum[0] ;
            n795PrvNum = T002719_n795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            RcdFound94 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2794( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2794( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound94 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A795PrvNum = Z795PrvNum ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2794( ) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2794( ) ;
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
                  GX_FocusControl = edtPrvNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2794( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = Z795PrvNum ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2794( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00272 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z794PrvNom, T00272_A794PrvNom[0]) != 0 ) || ( GXutil.strcmp(Z786PrvDir, T00272_A786PrvDir[0]) != 0 ) || ( GXutil.strcmp(Z782PrvCpo, T00272_A782PrvCpo[0]) != 0 ) || ( GXutil.strcmp(Z799PrvPob, T00272_A799PrvPob[0]) != 0 ) || ( GXutil.strcmp(Z793PrvNif, T00272_A793PrvNif[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z803PrvTlf, T00272_A803PrvTlf[0]) != 0 ) || ( Z800PrvPri != T00272_A800PrvPri[0] ) || ( GXutil.strcmp(Z804PrvTlx, T00272_A804PrvTlx[0]) != 0 ) || ( GXutil.strcmp(Z802PrvTip, T00272_A802PrvTip[0]) != 0 ) || ( Z805PrvVto != T00272_A805PrvVto[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z785PrvDiaPag != T00272_A785PrvDiaPag[0] ) || ( Z797PrvPer != T00272_A797PrvPer[0] ) || ( Z780PrvBan != T00272_A780PrvBan[0] ) || ( GXutil.strcmp(Z801PrvRep, T00272_A801PrvRep[0]) != 0 ) || ( Z798PrvPlaEnt != T00272_A798PrvPlaEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z792PrvMetTra, T00272_A792PrvMetTra[0]) != 0 ) || ( GXutil.strcmp(Z783PrvCta, T00272_A783PrvCta[0]) != 0 ) || ( GXutil.strcmp(Z3092PrvDivCod, T00272_A3092PrvDivCod[0]) != 0 ) || ( GXutil.strcmp(Z3314PrvCar, T00272_A3314PrvCar[0]) != 0 ) || ( GXutil.strcmp(Z6075PrvCp2, T00272_A6075PrvCp2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6076PrvFax, T00272_A6076PrvFax[0]) != 0 ) || ( GXutil.strcmp(Z6077PrvMail, T00272_A6077PrvMail[0]) != 0 ) || ( GXutil.strcmp(Z6570PrvNom2, T00272_A6570PrvNom2[0]) != 0 ) || ( GXutil.strcmp(Z6571PrvDir2, T00272_A6571PrvDir2[0]) != 0 ) || ( DecimalUtil.compareTo(Z8160PrvDtoPP, T00272_A8160PrvDtoPP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13585PrvTipo, T00272_A13585PrvTipo[0]) != 0 ) || ( GXutil.strcmp(Z14216PrvAct, T00272_A14216PrvAct[0]) != 0 ) || ( GXutil.strcmp(Z14417PrvNac, T00272_A14417PrvNac[0]) != 0 ) || ( GXutil.strcmp(Z497FpgCod, T00272_A497FpgCod[0]) != 0 ) || ( Z9728Cod_Clas != T00272_A9728Cod_Clas[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10122GpoEcoCod != T00272_A10122GpoEcoCod[0] ) || ( Z14030PrvClasID != T00272_A14030PrvClasID[0] ) || ( Z3143PrvDivCo != T00272_A3143PrvDivCo[0] ) )
         {
            if ( GXutil.strcmp(Z794PrvNom, T00272_A794PrvNom[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvNom");
               GXutil.writeLogRaw("Old: ",Z794PrvNom);
               GXutil.writeLogRaw("Current: ",T00272_A794PrvNom[0]);
            }
            if ( GXutil.strcmp(Z786PrvDir, T00272_A786PrvDir[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvDir");
               GXutil.writeLogRaw("Old: ",Z786PrvDir);
               GXutil.writeLogRaw("Current: ",T00272_A786PrvDir[0]);
            }
            if ( GXutil.strcmp(Z782PrvCpo, T00272_A782PrvCpo[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvCpo");
               GXutil.writeLogRaw("Old: ",Z782PrvCpo);
               GXutil.writeLogRaw("Current: ",T00272_A782PrvCpo[0]);
            }
            if ( GXutil.strcmp(Z799PrvPob, T00272_A799PrvPob[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvPob");
               GXutil.writeLogRaw("Old: ",Z799PrvPob);
               GXutil.writeLogRaw("Current: ",T00272_A799PrvPob[0]);
            }
            if ( GXutil.strcmp(Z793PrvNif, T00272_A793PrvNif[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvNif");
               GXutil.writeLogRaw("Old: ",Z793PrvNif);
               GXutil.writeLogRaw("Current: ",T00272_A793PrvNif[0]);
            }
            if ( GXutil.strcmp(Z803PrvTlf, T00272_A803PrvTlf[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvTlf");
               GXutil.writeLogRaw("Old: ",Z803PrvTlf);
               GXutil.writeLogRaw("Current: ",T00272_A803PrvTlf[0]);
            }
            if ( Z800PrvPri != T00272_A800PrvPri[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvPri");
               GXutil.writeLogRaw("Old: ",Z800PrvPri);
               GXutil.writeLogRaw("Current: ",T00272_A800PrvPri[0]);
            }
            if ( GXutil.strcmp(Z804PrvTlx, T00272_A804PrvTlx[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvTlx");
               GXutil.writeLogRaw("Old: ",Z804PrvTlx);
               GXutil.writeLogRaw("Current: ",T00272_A804PrvTlx[0]);
            }
            if ( GXutil.strcmp(Z802PrvTip, T00272_A802PrvTip[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvTip");
               GXutil.writeLogRaw("Old: ",Z802PrvTip);
               GXutil.writeLogRaw("Current: ",T00272_A802PrvTip[0]);
            }
            if ( Z805PrvVto != T00272_A805PrvVto[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvVto");
               GXutil.writeLogRaw("Old: ",Z805PrvVto);
               GXutil.writeLogRaw("Current: ",T00272_A805PrvVto[0]);
            }
            if ( Z785PrvDiaPag != T00272_A785PrvDiaPag[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvDiaPag");
               GXutil.writeLogRaw("Old: ",Z785PrvDiaPag);
               GXutil.writeLogRaw("Current: ",T00272_A785PrvDiaPag[0]);
            }
            if ( Z797PrvPer != T00272_A797PrvPer[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvPer");
               GXutil.writeLogRaw("Old: ",Z797PrvPer);
               GXutil.writeLogRaw("Current: ",T00272_A797PrvPer[0]);
            }
            if ( Z780PrvBan != T00272_A780PrvBan[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvBan");
               GXutil.writeLogRaw("Old: ",Z780PrvBan);
               GXutil.writeLogRaw("Current: ",T00272_A780PrvBan[0]);
            }
            if ( GXutil.strcmp(Z801PrvRep, T00272_A801PrvRep[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvRep");
               GXutil.writeLogRaw("Old: ",Z801PrvRep);
               GXutil.writeLogRaw("Current: ",T00272_A801PrvRep[0]);
            }
            if ( Z798PrvPlaEnt != T00272_A798PrvPlaEnt[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvPlaEnt");
               GXutil.writeLogRaw("Old: ",Z798PrvPlaEnt);
               GXutil.writeLogRaw("Current: ",T00272_A798PrvPlaEnt[0]);
            }
            if ( GXutil.strcmp(Z792PrvMetTra, T00272_A792PrvMetTra[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvMetTra");
               GXutil.writeLogRaw("Old: ",Z792PrvMetTra);
               GXutil.writeLogRaw("Current: ",T00272_A792PrvMetTra[0]);
            }
            if ( GXutil.strcmp(Z783PrvCta, T00272_A783PrvCta[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvCta");
               GXutil.writeLogRaw("Old: ",Z783PrvCta);
               GXutil.writeLogRaw("Current: ",T00272_A783PrvCta[0]);
            }
            if ( GXutil.strcmp(Z3092PrvDivCod, T00272_A3092PrvDivCod[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvDivCod");
               GXutil.writeLogRaw("Old: ",Z3092PrvDivCod);
               GXutil.writeLogRaw("Current: ",T00272_A3092PrvDivCod[0]);
            }
            if ( GXutil.strcmp(Z3314PrvCar, T00272_A3314PrvCar[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvCar");
               GXutil.writeLogRaw("Old: ",Z3314PrvCar);
               GXutil.writeLogRaw("Current: ",T00272_A3314PrvCar[0]);
            }
            if ( GXutil.strcmp(Z6075PrvCp2, T00272_A6075PrvCp2[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvCp2");
               GXutil.writeLogRaw("Old: ",Z6075PrvCp2);
               GXutil.writeLogRaw("Current: ",T00272_A6075PrvCp2[0]);
            }
            if ( GXutil.strcmp(Z6076PrvFax, T00272_A6076PrvFax[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvFax");
               GXutil.writeLogRaw("Old: ",Z6076PrvFax);
               GXutil.writeLogRaw("Current: ",T00272_A6076PrvFax[0]);
            }
            if ( GXutil.strcmp(Z6077PrvMail, T00272_A6077PrvMail[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvMail");
               GXutil.writeLogRaw("Old: ",Z6077PrvMail);
               GXutil.writeLogRaw("Current: ",T00272_A6077PrvMail[0]);
            }
            if ( GXutil.strcmp(Z6570PrvNom2, T00272_A6570PrvNom2[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvNom2");
               GXutil.writeLogRaw("Old: ",Z6570PrvNom2);
               GXutil.writeLogRaw("Current: ",T00272_A6570PrvNom2[0]);
            }
            if ( GXutil.strcmp(Z6571PrvDir2, T00272_A6571PrvDir2[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvDir2");
               GXutil.writeLogRaw("Old: ",Z6571PrvDir2);
               GXutil.writeLogRaw("Current: ",T00272_A6571PrvDir2[0]);
            }
            if ( DecimalUtil.compareTo(Z8160PrvDtoPP, T00272_A8160PrvDtoPP[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvDtoPP");
               GXutil.writeLogRaw("Old: ",Z8160PrvDtoPP);
               GXutil.writeLogRaw("Current: ",T00272_A8160PrvDtoPP[0]);
            }
            if ( GXutil.strcmp(Z13585PrvTipo, T00272_A13585PrvTipo[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvTipo");
               GXutil.writeLogRaw("Old: ",Z13585PrvTipo);
               GXutil.writeLogRaw("Current: ",T00272_A13585PrvTipo[0]);
            }
            if ( GXutil.strcmp(Z14216PrvAct, T00272_A14216PrvAct[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvAct");
               GXutil.writeLogRaw("Old: ",Z14216PrvAct);
               GXutil.writeLogRaw("Current: ",T00272_A14216PrvAct[0]);
            }
            if ( GXutil.strcmp(Z14417PrvNac, T00272_A14417PrvNac[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvNac");
               GXutil.writeLogRaw("Old: ",Z14417PrvNac);
               GXutil.writeLogRaw("Current: ",T00272_A14417PrvNac[0]);
            }
            if ( GXutil.strcmp(Z497FpgCod, T00272_A497FpgCod[0]) != 0 )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"FpgCod");
               GXutil.writeLogRaw("Old: ",Z497FpgCod);
               GXutil.writeLogRaw("Current: ",T00272_A497FpgCod[0]);
            }
            if ( Z9728Cod_Clas != T00272_A9728Cod_Clas[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"Cod_Clas");
               GXutil.writeLogRaw("Old: ",Z9728Cod_Clas);
               GXutil.writeLogRaw("Current: ",T00272_A9728Cod_Clas[0]);
            }
            if ( Z10122GpoEcoCod != T00272_A10122GpoEcoCod[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"GpoEcoCod");
               GXutil.writeLogRaw("Old: ",Z10122GpoEcoCod);
               GXutil.writeLogRaw("Current: ",T00272_A10122GpoEcoCod[0]);
            }
            if ( Z14030PrvClasID != T00272_A14030PrvClasID[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvClasID");
               GXutil.writeLogRaw("Old: ",Z14030PrvClasID);
               GXutil.writeLogRaw("Current: ",T00272_A14030PrvClasID[0]);
            }
            if ( Z3143PrvDivCo != T00272_A3143PrvDivCo[0] )
            {
               GXutil.writeLogln("tprvgen:[seudo value changed for attri]"+"PrvDivCo");
               GXutil.writeLogRaw("Old: ",Z3143PrvDivCo);
               GXutil.writeLogRaw("Current: ",T00272_A3143PrvDivCo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2794( )
   {
      beforeValidate2794( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2794( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2794( 0) ;
         checkOptimisticConcurrency2794( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2794( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2794( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002720 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n782PrvCpo), A782PrvCpo, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n800PrvPri), Byte.valueOf(A800PrvPri), Boolean.valueOf(n804PrvTlx), A804PrvTlx, Boolean.valueOf(n802PrvTip), A802PrvTip, Boolean.valueOf(n805PrvVto), Byte.valueOf(A805PrvVto), Boolean.valueOf(n785PrvDiaPag), Integer.valueOf(A785PrvDiaPag), Boolean.valueOf(n797PrvPer), Integer.valueOf(A797PrvPer), Boolean.valueOf(n780PrvBan), Integer.valueOf(A780PrvBan), Boolean.valueOf(n801PrvRep), A801PrvRep, Boolean.valueOf(n798PrvPlaEnt), Short.valueOf(A798PrvPlaEnt), Boolean.valueOf(n792PrvMetTra), A792PrvMetTra, Boolean.valueOf(n783PrvCta), A783PrvCta, Boolean.valueOf(n3092PrvDivCod), A3092PrvDivCod, Boolean.valueOf(n3314PrvCar), A3314PrvCar, Boolean.valueOf(n6075PrvCp2), A6075PrvCp2, Boolean.valueOf(n6076PrvFax), A6076PrvFax, Boolean.valueOf(n6077PrvMail), A6077PrvMail, Boolean.valueOf(n6570PrvNom2), A6570PrvNom2, Boolean.valueOf(n6571PrvDir2), A6571PrvDir2, Boolean.valueOf(n6572PrvContac), A6572PrvContac, Boolean.valueOf(n8160PrvDtoPP), A8160PrvDtoPP, Boolean.valueOf(n13585PrvTipo), A13585PrvTipo, A14216PrvAct, A14417PrvNac, A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas), Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID), Byte.valueOf(A3143PrvDivCo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        resetCaption270( ) ;
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
            load2794( ) ;
         }
         endLevel2794( ) ;
      }
      closeExtendedTableCursors2794( ) ;
   }

   public void update2794( )
   {
      beforeValidate2794( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2794( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2794( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2794( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2794( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002721 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n782PrvCpo), A782PrvCpo, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n800PrvPri), Byte.valueOf(A800PrvPri), Boolean.valueOf(n804PrvTlx), A804PrvTlx, Boolean.valueOf(n802PrvTip), A802PrvTip, Boolean.valueOf(n805PrvVto), Byte.valueOf(A805PrvVto), Boolean.valueOf(n785PrvDiaPag), Integer.valueOf(A785PrvDiaPag), Boolean.valueOf(n797PrvPer), Integer.valueOf(A797PrvPer), Boolean.valueOf(n780PrvBan), Integer.valueOf(A780PrvBan), Boolean.valueOf(n801PrvRep), A801PrvRep, Boolean.valueOf(n798PrvPlaEnt), Short.valueOf(A798PrvPlaEnt), Boolean.valueOf(n792PrvMetTra), A792PrvMetTra, Boolean.valueOf(n783PrvCta), A783PrvCta, Boolean.valueOf(n3092PrvDivCod), A3092PrvDivCod, Boolean.valueOf(n3314PrvCar), A3314PrvCar, Boolean.valueOf(n6075PrvCp2), A6075PrvCp2, Boolean.valueOf(n6076PrvFax), A6076PrvFax, Boolean.valueOf(n6077PrvMail), A6077PrvMail, Boolean.valueOf(n6570PrvNom2), A6570PrvNom2, Boolean.valueOf(n6571PrvDir2), A6571PrvDir2, Boolean.valueOf(n6572PrvContac), A6572PrvContac, Boolean.valueOf(n8160PrvDtoPP), A8160PrvDtoPP, Boolean.valueOf(n13585PrvTipo), A13585PrvTipo, A14216PrvAct, A14417PrvNac, Boolean.valueOf(n497FpgCod), A497FpgCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas), Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID), Byte.valueOf(A3143PrvDivCo), A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2794( ) ;
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
         endLevel2794( ) ;
      }
      closeExtendedTableCursors2794( ) ;
   }

   public void deferredUpdate2794( )
   {
   }

   public void delete( )
   {
      beforeValidate2794( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2794( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2794( ) ;
         afterConfirm2794( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2794( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002722 */
               pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
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
      sMode94 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2794( ) ;
      Gx_mode = sMode94 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2794( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002723 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T002723_A407EmprNom[0] ;
         n407EmprNom = T002723_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(21);
         gxagpoecocod_html2794( A396EmprCod) ;
         A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
         /* Using cursor T002724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         A498FpgDsc = T002724_A498FpgDsc[0] ;
         n498FpgDsc = T002724_n498FpgDsc[0] ;
         pr_default.close(22);
         /* Using cursor T002725 */
         pr_default.execute(23, new Object[] {Byte.valueOf(A3143PrvDivCo)});
         A3144PrvDivAbr = T002725_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T002725_n3144PrvDivAbr[0] ;
         pr_default.close(23);
         /* Using cursor T002726 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
         A9729Des_Clas = T002726_A9729Des_Clas[0] ;
         n9729Des_Clas = T002726_n9729Des_Clas[0] ;
         pr_default.close(24);
         /* Using cursor T002727 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
         A10123GpoEcoNom = T002727_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T002727_n10123GpoEcoNom[0] ;
         pr_default.close(25);
         /* Using cursor T002728 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID)});
         A14031PrvClasDsc = T002728_A14031PrvClasDsc[0] ;
         pr_default.close(26);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002729 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Albaran Transporte Proveedor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T002730 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ingresos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T002731 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Proveedores", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T002732 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Compras", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T002733 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Mov de Stock en Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T002734 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRVESX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T002735 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T002736 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRVES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T002737 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T002738 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRODUC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void endLevel2794( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2794( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprvgen");
         if ( AnyError == 0 )
         {
            confirmValues270( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprvgen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2794( )
   {
      /* Scan By routine */
      /* Using cursor T002739 */
      pr_default.execute(37);
      RcdFound94 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound94 = (short)(1) ;
         A396EmprCod = T002739_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T002739_A795PrvNum[0] ;
         n795PrvNum = T002739_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2794( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound94 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound94 = (short)(1) ;
         A396EmprCod = T002739_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T002739_A795PrvNum[0] ;
         n795PrvNum = T002739_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
   }

   public void scanEnd2794( )
   {
      pr_default.close(37);
   }

   public void afterConfirm2794( )
   {
      /* After Confirm Rules */
      if ( (0==A795PrvNum) && (0==AV80autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert2794( )
   {
      /* Before Insert Rules */
      if ( (0==A14030PrvClasID) )
      {
         A14030PrvClasID = (short)(0) ;
         n14030PrvClasID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
         n14030PrvClasID = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
      }
      if ( (0==A9728Cod_Clas) )
      {
         A9728Cod_Clas = (short)(0) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         n9728Cod_Clas = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      }
      if ( (GXutil.strcmp("", A497FpgCod)==0) )
      {
         A497FpgCod = "" ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         n497FpgCod = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A795PrvNum) && ( AV80autonumber == 1 ) )
      {
         GXt_int12 = A795PrvNum ;
         GXv_int13[0] = GXt_int12 ;
         new app.tprvgen_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int13) ;
         tprvgen_impl.this.GXt_int12 = GXv_int13[0] ;
         A795PrvNum = GXt_int12 ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
   }

   public void beforeUpdate2794( )
   {
      /* Before Update Rules */
      if ( (0==A14030PrvClasID) )
      {
         A14030PrvClasID = (short)(0) ;
         n14030PrvClasID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
         n14030PrvClasID = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
      }
      if ( (0==A9728Cod_Clas) )
      {
         A9728Cod_Clas = (short)(0) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         n9728Cod_Clas = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      }
      if ( (GXutil.strcmp("", A497FpgCod)==0) )
      {
         A497FpgCod = "" ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         n497FpgCod = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      }
   }

   public void beforeDelete2794( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2794( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2794( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2794( )
   {
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      cmbPrvTipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvTipo.getEnabled(), 5, 0), true);
      chkPrvPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrvPri.getEnabled(), 5, 0), true);
      chkPrvAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrvAct.getEnabled(), 5, 0), true);
      chkPrvNac.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvNac.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrvNac.getEnabled(), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrvNom2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom2_Enabled), 5, 0), true);
      edtPrvNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNif_Enabled), 5, 0), true);
      cmbPrvTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvTip.getEnabled(), 5, 0), true);
      edtPrvDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir_Enabled), 5, 0), true);
      edtPrvDir2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDir2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir2_Enabled), 5, 0), true);
      edtPrvCpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCpo_Enabled), 5, 0), true);
      edtPrvCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCp2_Enabled), 5, 0), true);
      edtPrvPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPob_Enabled), 5, 0), true);
      edtPrvTlx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlx_Enabled), 5, 0), true);
      edtPrvTlf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlf_Enabled), 5, 0), true);
      edtPrvFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvFax_Enabled), 5, 0), true);
      edtPrvMail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvMail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvMail_Enabled), 5, 0), true);
      dynGpoEcoCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynGpoEcoCod.getEnabled(), 5, 0), true);
      edtFpgCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      edtPrvVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvVto_Enabled), 5, 0), true);
      edtPrvPer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPer_Enabled), 5, 0), true);
      edtPrvDiaPag_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDiaPag_Enabled), 5, 0), true);
      edtPrvDtoPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDtoPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDtoPP_Enabled), 5, 0), true);
      dynPrvDivCo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynPrvDivCo.getInternalname(), "Enabled", GXutil.ltrimstr( dynPrvDivCo.getEnabled(), 5, 0), true);
      cmbPrvDivCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvDivCod.getEnabled(), 5, 0), true);
      edtPrvBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvBan_Enabled), 5, 0), true);
      edtPrvCta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCta_Enabled), 5, 0), true);
      edtPrvRep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvRep_Enabled), 5, 0), true);
      edtPrvPlaEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPlaEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPlaEnt_Enabled), 5, 0), true);
      cmbPrvMetTra.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvMetTra.getEnabled(), 5, 0), true);
      edtPrvContac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvContac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvContac_Enabled), 5, 0), true);
      edtPrvCar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCar_Enabled), 5, 0), true);
      edtCod_Clas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_Clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_Clas_Enabled), 5, 0), true);
      edtPrvClasID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvClasID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvClasID_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombofpgcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofpgcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofpgcod_Enabled), 5, 0), true);
      edtavCombocod_clas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocod_clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocod_clas_Enabled), 5, 0), true);
      edtavComboprvclasid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvclasid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvclasid_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2794( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues270( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV59PrvNum,6,0))}, new String[] {"Gx_mode","EmprCod","PrvNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPRVGEN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tprvgen:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z786PrvDir", GXutil.rtrim( Z786PrvDir));
      app.GxWebStd.gx_hidden_field( httpContext, "Z782PrvCpo", GXutil.rtrim( Z782PrvCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z799PrvPob", GXutil.rtrim( Z799PrvPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z793PrvNif", GXutil.rtrim( Z793PrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z803PrvTlf", GXutil.rtrim( Z803PrvTlf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z800PrvPri", GXutil.ltrim( localUtil.ntoc( Z800PrvPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z804PrvTlx", GXutil.rtrim( Z804PrvTlx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z802PrvTip", GXutil.rtrim( Z802PrvTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z805PrvVto", GXutil.ltrim( localUtil.ntoc( Z805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z785PrvDiaPag", GXutil.ltrim( localUtil.ntoc( Z785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z797PrvPer", GXutil.ltrim( localUtil.ntoc( Z797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z780PrvBan", GXutil.ltrim( localUtil.ntoc( Z780PrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z801PrvRep", GXutil.rtrim( Z801PrvRep));
      app.GxWebStd.gx_hidden_field( httpContext, "Z798PrvPlaEnt", GXutil.ltrim( localUtil.ntoc( Z798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z792PrvMetTra", GXutil.rtrim( Z792PrvMetTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z783PrvCta", GXutil.rtrim( Z783PrvCta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3092PrvDivCod", GXutil.rtrim( Z3092PrvDivCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3314PrvCar", GXutil.rtrim( Z3314PrvCar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6075PrvCp2", GXutil.rtrim( Z6075PrvCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6076PrvFax", GXutil.rtrim( Z6076PrvFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6077PrvMail", GXutil.rtrim( Z6077PrvMail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6570PrvNom2", GXutil.rtrim( Z6570PrvNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6571PrvDir2", GXutil.rtrim( Z6571PrvDir2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8160PrvDtoPP", GXutil.ltrim( localUtil.ntoc( Z8160PrvDtoPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13585PrvTipo", GXutil.rtrim( Z13585PrvTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14216PrvAct", GXutil.rtrim( Z14216PrvAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14417PrvNac", GXutil.rtrim( Z14417PrvNac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z497FpgCod", GXutil.rtrim( Z497FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9728Cod_Clas", GXutil.ltrim( localUtil.ntoc( Z9728Cod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( Z10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14030PrvClasID", GXutil.ltrim( localUtil.ntoc( Z14030PrvClasID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3143PrvDivCo", GXutil.ltrim( localUtil.ntoc( Z3143PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N497FpgCod", GXutil.rtrim( A497FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N3143PrvDivCo", GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9728Cod_Clas", GXutil.ltrim( localUtil.ntoc( A9728Cod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N14030PrvClasID", GXutil.ltrim( localUtil.ntoc( A14030PrvClasID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV74DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV74DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFPGCOD_DATA", AV71FpgCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFPGCOD_DATA", AV71FpgCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOD_CLAS_DATA", AV76Cod_Clas_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOD_CLAS_DATA", AV76Cod_Clas_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVCLASID_DATA", AV78PrvClasID_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVCLASID_DATA", AV78PrvClasID_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV61TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV61TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV61TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNNOM", A13719PrvNNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV58EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV59PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59PrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV80autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FPGCOD", GXutil.rtrim( AV63Insert_FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVDIVCO", GXutil.ltrim( localUtil.ntoc( AV64Insert_PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_COD_CLAS", GXutil.ltrim( localUtil.ntoc( AV65Insert_Cod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GPOECOCOD", GXutil.ltrim( localUtil.ntoc( AV66Insert_GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVCLASID", GXutil.ltrim( localUtil.ntoc( AV70Insert_PrvClasID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FPGDSC", GXutil.rtrim( A498FpgDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DES_CLAS", GXutil.rtrim( A9729Des_Clas));
      app.GxWebStd.gx_hidden_field( httpContext, "GPOECONOM", A10123GpoEcoNom);
      app.GxWebStd.gx_hidden_field( httpContext, "PRVCLASDSC", GXutil.rtrim( A14031PrvClasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVDIVABR", GXutil.rtrim( A3144PrvDivAbr));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Objectcall", GXutil.rtrim( Dvpanel_p_datoslocalizacion_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Enabled", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Width", GXutil.rtrim( Dvpanel_p_datoslocalizacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Autowidth", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Autoheight", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Cls", GXutil.rtrim( Dvpanel_p_datoslocalizacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Title", GXutil.rtrim( Dvpanel_p_datoslocalizacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Collapsible", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Collapsed", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Showcollapseicon", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Iconposition", GXutil.rtrim( Dvpanel_p_datoslocalizacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSLOCALIZACION_Autoscroll", GXutil.booltostr( Dvpanel_p_datoslocalizacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Objectcall", GXutil.rtrim( Combo_fpgcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Cls", GXutil.rtrim( Combo_fpgcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Selectedvalue_set", GXutil.rtrim( Combo_fpgcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Enabled", GXutil.booltostr( Combo_fpgcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Objectcall", GXutil.rtrim( Dvpanel_p_datospago_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Enabled", GXutil.booltostr( Dvpanel_p_datospago_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Width", GXutil.rtrim( Dvpanel_p_datospago_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Autowidth", GXutil.booltostr( Dvpanel_p_datospago_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Autoheight", GXutil.booltostr( Dvpanel_p_datospago_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Cls", GXutil.rtrim( Dvpanel_p_datospago_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Title", GXutil.rtrim( Dvpanel_p_datospago_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Collapsible", GXutil.booltostr( Dvpanel_p_datospago_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Collapsed", GXutil.booltostr( Dvpanel_p_datospago_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Showcollapseicon", GXutil.booltostr( Dvpanel_p_datospago_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Iconposition", GXutil.rtrim( Dvpanel_p_datospago_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSPAGO_Autoscroll", GXutil.booltostr( Dvpanel_p_datospago_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_CLAS_Objectcall", GXutil.rtrim( Combo_cod_clas_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_CLAS_Cls", GXutil.rtrim( Combo_cod_clas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_CLAS_Selectedvalue_set", GXutil.rtrim( Combo_cod_clas_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_CLAS_Enabled", GXutil.booltostr( Combo_cod_clas_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCLASID_Objectcall", GXutil.rtrim( Combo_prvclasid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCLASID_Cls", GXutil.rtrim( Combo_prvclasid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCLASID_Selectedvalue_set", GXutil.rtrim( Combo_prvclasid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCLASID_Enabled", GXutil.booltostr( Combo_prvclasid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Objectcall", GXutil.rtrim( Dvpanel_p_datoscontabilidad_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Enabled", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Width", GXutil.rtrim( Dvpanel_p_datoscontabilidad_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Autowidth", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Autoheight", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Cls", GXutil.rtrim( Dvpanel_p_datoscontabilidad_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Title", GXutil.rtrim( Dvpanel_p_datoscontabilidad_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Collapsible", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Collapsed", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Showcollapseicon", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Iconposition", GXutil.rtrim( Dvpanel_p_datoscontabilidad_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_P_DATOSCONTABILIDAD_Autoscroll", GXutil.booltostr( Dvpanel_p_datoscontabilidad_Autoscroll));
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
      return formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV59PrvNum,6,0))}, new String[] {"Gx_mode","EmprCod","PrvNum"})  ;
   }

   public String getPgmname( )
   {
      return "TPRVGEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Proveedores", "") ;
   }

   public void initializeNonKey2794( )
   {
      A497FpgCod = "" ;
      n497FpgCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      A3143PrvDivCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      A9728Cod_Clas = (short)(0) ;
      n9728Cod_Clas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      A10122GpoEcoCod = 0 ;
      n10122GpoEcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
      A14030PrvClasID = (short)(0) ;
      n14030PrvClasID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14030PrvClasID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14030PrvClasID), 4, 0));
      A13719PrvNNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A786PrvDir = "" ;
      n786PrvDir = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
      A782PrvCpo = "" ;
      n782PrvCpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
      A799PrvPob = "" ;
      n799PrvPob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
      A793PrvNif = "" ;
      n793PrvNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
      A803PrvTlf = "" ;
      n803PrvTlf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
      A804PrvTlx = "" ;
      n804PrvTlx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
      A498FpgDsc = "" ;
      n498FpgDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
      A805PrvVto = (byte)(0) ;
      n805PrvVto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
      A785PrvDiaPag = 0 ;
      n785PrvDiaPag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
      A797PrvPer = 0 ;
      n797PrvPer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
      A780PrvBan = 0 ;
      n780PrvBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
      A801PrvRep = "" ;
      n801PrvRep = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
      A798PrvPlaEnt = (short)(0) ;
      n798PrvPlaEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
      A783PrvCta = "" ;
      n783PrvCta = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
      A3092PrvDivCod = "" ;
      n3092PrvDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
      A3144PrvDivAbr = "" ;
      n3144PrvDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
      A3314PrvCar = "" ;
      n3314PrvCar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
      A6075PrvCp2 = "" ;
      n6075PrvCp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
      A6076PrvFax = "" ;
      n6076PrvFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
      A6077PrvMail = "" ;
      n6077PrvMail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
      A6570PrvNom2 = "" ;
      n6570PrvNom2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
      A6571PrvDir2 = "" ;
      n6571PrvDir2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
      A6572PrvContac = "" ;
      n6572PrvContac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      n8160PrvDtoPP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
      A9729Des_Clas = "" ;
      n9729Des_Clas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
      A10123GpoEcoNom = "" ;
      n10123GpoEcoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      A14031PrvClasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14031PrvClasDsc", A14031PrvClasDsc);
      A14417PrvNac = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14417PrvNac", A14417PrvNac);
      A800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      A792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
      A13585PrvTipo = httpContext.getMessage( "I", "") ;
      n13585PrvTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
      A14216PrvAct = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
      Z794PrvNom = "" ;
      Z786PrvDir = "" ;
      Z782PrvCpo = "" ;
      Z799PrvPob = "" ;
      Z793PrvNif = "" ;
      Z803PrvTlf = "" ;
      Z800PrvPri = (byte)(0) ;
      Z804PrvTlx = "" ;
      Z802PrvTip = "" ;
      Z805PrvVto = (byte)(0) ;
      Z785PrvDiaPag = 0 ;
      Z797PrvPer = 0 ;
      Z780PrvBan = 0 ;
      Z801PrvRep = "" ;
      Z798PrvPlaEnt = (short)(0) ;
      Z792PrvMetTra = "" ;
      Z783PrvCta = "" ;
      Z3092PrvDivCod = "" ;
      Z3314PrvCar = "" ;
      Z6075PrvCp2 = "" ;
      Z6076PrvFax = "" ;
      Z6077PrvMail = "" ;
      Z6570PrvNom2 = "" ;
      Z6571PrvDir2 = "" ;
      Z8160PrvDtoPP = DecimalUtil.ZERO ;
      Z13585PrvTipo = "" ;
      Z14216PrvAct = "" ;
      Z14417PrvNac = "" ;
      Z497FpgCod = "" ;
      Z9728Cod_Clas = (short)(0) ;
      Z10122GpoEcoCod = 0 ;
      Z14030PrvClasID = (short)(0) ;
      Z3143PrvDivCo = (byte)(0) ;
   }

   public void initAll2794( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A795PrvNum = 0 ;
      n795PrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      initializeNonKey2794( ) ;
   }

   public void standaloneModalInsert( )
   {
      A800PrvPri = i800PrvPri ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A802PrvTip = i802PrvTip ;
      n802PrvTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      A792PrvMetTra = i792PrvMetTra ;
      n792PrvMetTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
      A13585PrvTipo = i13585PrvTipo ;
      n13585PrvTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
      A14216PrvAct = i14216PrvAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211653548", true, true);
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
      httpContext.AddJavascriptSource("tprvgen.js", "?20268211653548", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtPrvNum_Internalname = "PRVNUM" ;
      cmbPrvTipo.setInternalname( "PRVTIPO" );
      chkPrvPri.setInternalname( "PRVPRI" );
      chkPrvAct.setInternalname( "PRVACT" );
      chkPrvNac.setInternalname( "PRVNAC" );
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrvNom2_Internalname = "PRVNOM2" ;
      edtPrvNif_Internalname = "PRVNIF" ;
      cmbPrvTip.setInternalname( "PRVTIP" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtPrvDir_Internalname = "PRVDIR" ;
      edtPrvDir2_Internalname = "PRVDIR2" ;
      edtPrvCpo_Internalname = "PRVCPO" ;
      edtPrvCp2_Internalname = "PRVCP2" ;
      edtPrvPob_Internalname = "PRVPOB" ;
      edtPrvTlx_Internalname = "PRVTLX" ;
      edtPrvTlf_Internalname = "PRVTLF" ;
      edtPrvFax_Internalname = "PRVFAX" ;
      edtPrvMail_Internalname = "PRVMAIL" ;
      dynGpoEcoCod.setInternalname( "GPOECOCOD" );
      divGpoecocod_cell_Internalname = "GPOECOCOD_CELL" ;
      divP_datoslocalizacion_Internalname = "P_DATOSLOCALIZACION" ;
      Dvpanel_p_datoslocalizacion_Internalname = "DVPANEL_P_DATOSLOCALIZACION" ;
      lblTextblockfpgcod_Internalname = "TEXTBLOCKFPGCOD" ;
      Combo_fpgcod_Internalname = "COMBO_FPGCOD" ;
      edtFpgCod_Internalname = "FPGCOD" ;
      divTablesplittedfpgcod_Internalname = "TABLESPLITTEDFPGCOD" ;
      edtPrvVto_Internalname = "PRVVTO" ;
      edtPrvPer_Internalname = "PRVPER" ;
      edtPrvDiaPag_Internalname = "PRVDIAPAG" ;
      edtPrvDtoPP_Internalname = "PRVDTOPP" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      dynPrvDivCo.setInternalname( "PRVDIVCO" );
      cmbPrvDivCod.setInternalname( "PRVDIVCOD" );
      edtPrvBan_Internalname = "PRVBAN" ;
      edtPrvCta_Internalname = "PRVCTA" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divP_datospago_Internalname = "P_DATOSPAGO" ;
      Dvpanel_p_datospago_Internalname = "DVPANEL_P_DATOSPAGO" ;
      edtPrvRep_Internalname = "PRVREP" ;
      edtPrvPlaEnt_Internalname = "PRVPLAENT" ;
      cmbPrvMetTra.setInternalname( "PRVMETTRA" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtPrvContac_Internalname = "PRVCONTAC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtPrvCar_Internalname = "PRVCAR" ;
      lblTextblockcod_clas_Internalname = "TEXTBLOCKCOD_CLAS" ;
      Combo_cod_clas_Internalname = "COMBO_COD_CLAS" ;
      edtCod_Clas_Internalname = "COD_CLAS" ;
      divTablesplittedcod_clas_Internalname = "TABLESPLITTEDCOD_CLAS" ;
      lblTextblockprvclasid_Internalname = "TEXTBLOCKPRVCLASID" ;
      Combo_prvclasid_Internalname = "COMBO_PRVCLASID" ;
      edtPrvClasID_Internalname = "PRVCLASID" ;
      divTablesplittedprvclasid_Internalname = "TABLESPLITTEDPRVCLASID" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divP_datoscontabilidad_Internalname = "P_DATOSCONTABILIDAD" ;
      Dvpanel_p_datoscontabilidad_Internalname = "DVPANEL_P_DATOSCONTABILIDAD" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombofpgcod_Internalname = "vCOMBOFPGCOD" ;
      divSectionattribute_fpgcod_Internalname = "SECTIONATTRIBUTE_FPGCOD" ;
      edtavCombocod_clas_Internalname = "vCOMBOCOD_CLAS" ;
      divSectionattribute_cod_clas_Internalname = "SECTIONATTRIBUTE_COD_CLAS" ;
      edtavComboprvclasid_Internalname = "vCOMBOPRVCLASID" ;
      divSectionattribute_prvclasid_Internalname = "SECTIONATTRIBUTE_PRVCLASID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Proveedores", "") );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavComboprvclasid_Jsonclick = "" ;
      edtavComboprvclasid_Enabled = 0 ;
      edtavComboprvclasid_Visible = 1 ;
      edtavCombocod_clas_Jsonclick = "" ;
      edtavCombocod_clas_Enabled = 0 ;
      edtavCombocod_clas_Visible = 1 ;
      edtavCombofpgcod_Jsonclick = "" ;
      edtavCombofpgcod_Enabled = 0 ;
      edtavCombofpgcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrvClasID_Jsonclick = "" ;
      edtPrvClasID_Enabled = 1 ;
      edtPrvClasID_Visible = 1 ;
      Combo_prvclasid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prvclasid_Enabled = GXutil.toBoolean( -1) ;
      edtCod_Clas_Jsonclick = "" ;
      edtCod_Clas_Enabled = 1 ;
      edtCod_Clas_Visible = 1 ;
      Combo_cod_clas_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cod_clas_Enabled = GXutil.toBoolean( -1) ;
      edtPrvCar_Jsonclick = "" ;
      edtPrvCar_Enabled = 1 ;
      edtPrvContac_Enabled = 1 ;
      cmbPrvMetTra.setJsonclick( "" );
      cmbPrvMetTra.setEnabled( 1 );
      edtPrvPlaEnt_Jsonclick = "" ;
      edtPrvPlaEnt_Enabled = 1 ;
      edtPrvRep_Jsonclick = "" ;
      edtPrvRep_Enabled = 1 ;
      Dvpanel_p_datoscontabilidad_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_p_datoscontabilidad_Iconposition = "Right" ;
      Dvpanel_p_datoscontabilidad_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_p_datoscontabilidad_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_p_datoscontabilidad_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_p_datoscontabilidad_Title = httpContext.getMessage( "Otros Datos", "") ;
      Dvpanel_p_datoscontabilidad_Cls = "CellMarginTop" ;
      Dvpanel_p_datoscontabilidad_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_p_datoscontabilidad_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_p_datoscontabilidad_Width = "100%" ;
      edtPrvCta_Jsonclick = "" ;
      edtPrvCta_Enabled = 1 ;
      edtPrvBan_Jsonclick = "" ;
      edtPrvBan_Enabled = 1 ;
      cmbPrvDivCod.setJsonclick( "" );
      cmbPrvDivCod.setEnabled( 1 );
      dynPrvDivCo.setJsonclick( "" );
      dynPrvDivCo.setEnabled( 1 );
      edtPrvDtoPP_Jsonclick = "" ;
      edtPrvDtoPP_Enabled = 1 ;
      edtPrvDiaPag_Jsonclick = "" ;
      edtPrvDiaPag_Enabled = 1 ;
      edtPrvPer_Jsonclick = "" ;
      edtPrvPer_Enabled = 1 ;
      edtPrvVto_Jsonclick = "" ;
      edtPrvVto_Enabled = 1 ;
      edtFpgCod_Jsonclick = "" ;
      edtFpgCod_Enabled = 1 ;
      edtFpgCod_Visible = 1 ;
      Combo_fpgcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fpgcod_Caption = "" ;
      Combo_fpgcod_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_p_datospago_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_p_datospago_Iconposition = "Right" ;
      Dvpanel_p_datospago_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_p_datospago_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_p_datospago_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_p_datospago_Title = httpContext.getMessage( "Pago", "") ;
      Dvpanel_p_datospago_Cls = "CellMarginTop" ;
      Dvpanel_p_datospago_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_p_datospago_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_p_datospago_Width = "100%" ;
      dynGpoEcoCod.setJsonclick( "" );
      dynGpoEcoCod.setEnabled( 1 );
      dynGpoEcoCod.setVisible( 1 );
      divGpoecocod_cell_Class = "col-xs-12 col-sm-6" ;
      edtPrvMail_Jsonclick = "" ;
      edtPrvMail_Enabled = 1 ;
      edtPrvFax_Jsonclick = "" ;
      edtPrvFax_Enabled = 1 ;
      edtPrvTlf_Jsonclick = "" ;
      edtPrvTlf_Enabled = 1 ;
      edtPrvTlx_Jsonclick = "" ;
      edtPrvTlx_Enabled = 1 ;
      edtPrvPob_Jsonclick = "" ;
      edtPrvPob_Enabled = 1 ;
      edtPrvCp2_Jsonclick = "" ;
      edtPrvCp2_Enabled = 1 ;
      edtPrvCpo_Jsonclick = "" ;
      edtPrvCpo_Enabled = 1 ;
      edtPrvDir2_Jsonclick = "" ;
      edtPrvDir2_Enabled = 1 ;
      edtPrvDir_Jsonclick = "" ;
      edtPrvDir_Enabled = 1 ;
      Dvpanel_p_datoslocalizacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_p_datoslocalizacion_Iconposition = "Right" ;
      Dvpanel_p_datoslocalizacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_p_datoslocalizacion_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_p_datoslocalizacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_p_datoslocalizacion_Title = httpContext.getMessage( "Localizacion", "") ;
      Dvpanel_p_datoslocalizacion_Cls = "CellMarginTop" ;
      Dvpanel_p_datoslocalizacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_p_datoslocalizacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_p_datoslocalizacion_Width = "100%" ;
      cmbPrvTip.setJsonclick( "" );
      cmbPrvTip.setEnabled( 1 );
      edtPrvNif_Jsonclick = "" ;
      edtPrvNif_Enabled = 1 ;
      edtPrvNom2_Jsonclick = "" ;
      edtPrvNom2_Enabled = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 1 ;
      chkPrvNac.setEnabled( 1 );
      chkPrvAct.setEnabled( 1 );
      chkPrvPri.setEnabled( 1 );
      cmbPrvTipo.setJsonclick( "" );
      cmbPrvTipo.setEnabled( 1 );
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 1 ;
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
      gxagpoecocod_html2794( A396EmprCod) ;
      /* End function dynload_actions */
   }

   public void gxdlaprvdivco271( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprvdivco_data271( ) ;
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

   public void gxaprvdivco_html271( )
   {
      byte gxdynajaxvalue;
      gxdlaprvdivco_data271( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynPrvDivCo.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynPrvDivCo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 2, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaprvdivco_data271( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T002740 */
      pr_default.execute(38);
      while ( (pr_default.getStatus(38) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T002740_A3099DivCod[0], (byte)(2), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T002740_A3101DivAbr[0]));
         pr_default.readNext(38);
      }
      pr_default.close(38);
   }

   public void gxdlagpoecocod2794( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlagpoecocod_data2794( A396EmprCod) ;
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

   public void gxagpoecocod_html2794( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlagpoecocod_data2794( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynGpoEcoCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynGpoEcoCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 6, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlagpoecocod_data2794( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T002741 */
      pr_default.execute(39, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(39) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T002741_A10122GpoEcoCod[0], (byte)(6), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(T002741_A10123GpoEcoNom[0]);
         pr_default.readNext(39);
      }
      pr_default.close(39);
   }

   public void gx10asaprvnum2794( int AV59PrvNum )
   {
      if ( ! (0==AV59PrvNum) )
      {
         A795PrvNum = AV59PrvNum ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx11asaprvnum2794( int A795PrvNum ,
                                  short AV80autonumber ,
                                  String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A795PrvNum) && ( AV80autonumber == 1 ) )
      {
         GXt_int12 = A795PrvNum ;
         GXv_int13[0] = GXt_int12 ;
         new app.tprvgen_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int13) ;
         tprvgen_impl.this.GXt_int12 = GXv_int13[0] ;
         A795PrvNum = GXt_int12 ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa101222794( String AV58EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV58EmprCod, httpContext.getMessage( httpContext.getMessage( "RONTAL", ""), ""), GXv_int6) ;
      tprvgen_impl.this.GXt_int5 = GXv_int6[0] ;
      dynGpoEcoCod.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Visible", GXutil.ltrimstr( dynGpoEcoCod.getVisible(), 5, 0), true);
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
      cmbPrvTipo.setName( "PRVTIPO" );
      cmbPrvTipo.setWebtags( "" );
      cmbPrvTipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbPrvTipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
      if ( cmbPrvTipo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A13585PrvTipo)==0) )
         {
            A13585PrvTipo = httpContext.getMessage( "I", "") ;
            n13585PrvTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13585PrvTipo", A13585PrvTipo);
         }
      }
      chkPrvPri.setName( "PRVPRI" );
      chkPrvPri.setWebtags( "" );
      chkPrvPri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "TitleCaption", chkPrvPri.getCaption(), true);
      chkPrvPri.setCheckedValue( "0" );
      if ( isIns( ) && (0==A800PrvPri) )
      {
         A800PrvPri = (byte)(1) ;
         n800PrvPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      }
      chkPrvAct.setName( "PRVACT" );
      chkPrvAct.setWebtags( "" );
      chkPrvAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvAct.getInternalname(), "TitleCaption", chkPrvAct.getCaption(), true);
      chkPrvAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A14216PrvAct)==0) )
      {
         A14216PrvAct = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14216PrvAct", A14216PrvAct);
      }
      chkPrvNac.setName( "PRVNAC" );
      chkPrvNac.setWebtags( "" );
      chkPrvNac.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvNac.getInternalname(), "TitleCaption", chkPrvNac.getCaption(), true);
      chkPrvNac.setCheckedValue( "N" );
      A14417PrvNac = ((GXutil.strcmp(GXutil.rtrim( A14417PrvNac), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14417PrvNac", A14417PrvNac);
      cmbPrvTip.setName( "PRVTIP" );
      cmbPrvTip.setWebtags( "" );
      cmbPrvTip.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      cmbPrvTip.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A802PrvTip)==0) )
         {
            A802PrvTip = httpContext.getMessage( "P", "") ;
            n802PrvTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
         }
      }
      dynGpoEcoCod.setName( "GPOECOCOD" );
      dynGpoEcoCod.setWebtags( "" );
      dynPrvDivCo.setName( "PRVDIVCO" );
      dynPrvDivCo.setWebtags( "" );
      dynPrvDivCo.removeAllItems();
      /* Using cursor T002742 */
      pr_default.execute(40);
      while ( (pr_default.getStatus(40) != 101) )
      {
         dynPrvDivCo.addItem(GXutil.trim( GXutil.str( T002742_A3099DivCod[0], 2, 0)), T002742_A3101DivAbr[0], (short)(0));
         pr_default.readNext(40);
      }
      pr_default.close(40);
      if ( dynPrvDivCo.getItemCount() > 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValidValue(GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      }
      cmbPrvDivCod.setName( "PRVDIVCOD" );
      cmbPrvDivCod.setWebtags( "" );
      cmbPrvDivCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbPrvDivCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
      }
      cmbPrvMetTra.setName( "PRVMETTRA" );
      cmbPrvMetTra.setWebtags( "" );
      cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
      cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
      cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A792PrvMetTra)==0) )
         {
            A792PrvMetTra = httpContext.getMessage( "S", "") ;
            n792PrvMetTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
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

   public void valid_Emprcod( )
   {
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValue())) ;
      n407EmprNom = false ;
      /* Using cursor T002723 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T002723_A407EmprNom[0] ;
      n407EmprNom = T002723_n407EmprNom[0] ;
      pr_default.close(21);
      gxagpoecocod_html2794( A396EmprCod) ;
      dynload_actions( ) ;
      if ( dynGpoEcoCod.getItemCount() > 0 )
      {
         A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValidValue(GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0))))) ;
         n10122GpoEcoCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
      dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynGpoEcoCod.getInternalname(), "Values", dynGpoEcoCod.ToJavascriptSource(), true);
   }

   public void valid_Gpoecocod( )
   {
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValue())) ;
      n10123GpoEcoNom = false ;
      /* Using cursor T002727 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A10123GpoEcoNom = T002727_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T002727_n10123GpoEcoNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
   }

   public void valid_Fpgcod( )
   {
      n497FpgCod = false ;
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValue())) ;
      n498FpgDsc = false ;
      /* Using cursor T002724 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A497FpgCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A498FpgDsc = T002724_A498FpgDsc[0] ;
      n498FpgDsc = T002724_n498FpgDsc[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", GXutil.rtrim( A498FpgDsc));
   }

   public void valid_Prvdivco( )
   {
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValue())) ;
      n3144PrvDivAbr = false ;
      /* Using cursor T002725 */
      pr_default.execute(23, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
         GX_FocusControl = dynPrvDivCo.getInternalname() ;
      }
      A3144PrvDivAbr = T002725_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T002725_n3144PrvDivAbr[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", GXutil.rtrim( A3144PrvDivAbr));
   }

   public void valid_Cod_clas( )
   {
      n9728Cod_Clas = false ;
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValue())) ;
      n9729Des_Clas = false ;
      /* Using cursor T002726 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9728Cod_Clas) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ISOTB1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_CLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A9729Des_Clas = T002726_A9729Des_Clas[0] ;
      n9729Des_Clas = T002726_n9729Des_Clas[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", GXutil.rtrim( A9729Des_Clas));
   }

   public void valid_Prvclasid( )
   {
      n14030PrvClasID = false ;
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValue())) ;
      /* Using cursor T002728 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A14030PrvClasID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCLASID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A14031PrvClasDsc = T002728_A14031PrvClasDsc[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14031PrvClasDsc", GXutil.rtrim( A14031PrvClasDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV61TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e12272',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV61TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVPRI","{handler:'valid_Prvpri',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVPRI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVNOM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVTIP","{handler:'valid_Prvtip',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVTIP",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVMAIL","{handler:'valid_Prvmail',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVMAIL",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_GPOECOCOD","{handler:'valid_Gpoecocod',iparms:[{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_GPOECOCOD",",oparms:[{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'},{av:'A498FpgDsc',fld:'FPGDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_FPGCOD",",oparms:[{av:'A498FpgDsc',fld:'FPGDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVDIVCO","{handler:'valid_Prvdivco',iparms:[{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVDIVCO",",oparms:[{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVMETTRA","{handler:'valid_Prvmettra',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVMETTRA",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_COD_CLAS","{handler:'valid_Cod_clas',iparms:[{av:'A9728Cod_Clas',fld:'COD_CLAS',pic:'ZZZ9'},{av:'A9729Des_Clas',fld:'DES_CLAS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_COD_CLAS",",oparms:[{av:'A9729Des_Clas',fld:'DES_CLAS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_PRVCLASID","{handler:'valid_Prvclasid',iparms:[{av:'A14030PrvClasID',fld:'PRVCLASID',pic:'ZZZ9'},{av:'A14031PrvClasDsc',fld:'PRVCLASDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_PRVCLASID",",oparms:[{av:'A14031PrvClasDsc',fld:'PRVCLASDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOFPGCOD","{handler:'validv_Combofpgcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALIDV_COMBOFPGCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOCOD_CLAS","{handler:'validv_Combocod_clas',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALIDV_COMBOCOD_CLAS",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPRVCLASID","{handler:'validv_Comboprvclasid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALIDV_COMBOPRVCLASID",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A14216PrvAct',fld:'PRVACT',pic:''},{av:'A14417PrvNac',fld:'PRVNAC',pic:''}]}");
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
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV58EmprCod = "" ;
      Z396EmprCod = "" ;
      Z794PrvNom = "" ;
      Z786PrvDir = "" ;
      Z782PrvCpo = "" ;
      Z799PrvPob = "" ;
      Z793PrvNif = "" ;
      Z803PrvTlf = "" ;
      Z804PrvTlx = "" ;
      Z802PrvTip = "" ;
      Z801PrvRep = "" ;
      Z792PrvMetTra = "" ;
      Z783PrvCta = "" ;
      Z3092PrvDivCod = "" ;
      Z3314PrvCar = "" ;
      Z6075PrvCp2 = "" ;
      Z6076PrvFax = "" ;
      Z6077PrvMail = "" ;
      Z6570PrvNom2 = "" ;
      Z6571PrvDir2 = "" ;
      Z8160PrvDtoPP = DecimalUtil.ZERO ;
      Z13585PrvTipo = "" ;
      Z14216PrvAct = "" ;
      Z14417PrvNac = "" ;
      Z497FpgCod = "" ;
      N497FpgCod = "" ;
      Combo_prvclasid_Selectedvalue_get = "" ;
      Combo_cod_clas_Selectedvalue_get = "" ;
      Combo_fpgcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV58EmprCod = "" ;
      A497FpgCod = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13585PrvTipo = "" ;
      A14216PrvAct = "" ;
      A14417PrvNac = "" ;
      A802PrvTip = "" ;
      A3092PrvDivCod = "" ;
      A792PrvMetTra = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A794PrvNom = "" ;
      A6570PrvNom2 = "" ;
      A793PrvNif = "" ;
      ucDvpanel_p_datoslocalizacion = new com.genexus.webpanels.GXUserControl();
      A786PrvDir = "" ;
      A6571PrvDir2 = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      A799PrvPob = "" ;
      A804PrvTlx = "" ;
      A803PrvTlf = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      ucDvpanel_p_datospago = new com.genexus.webpanels.GXUserControl();
      lblTextblockfpgcod_Jsonclick = "" ;
      ucCombo_fpgcod = new com.genexus.webpanels.GXUserControl();
      AV74DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV71FpgCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      A783PrvCta = "" ;
      ucDvpanel_p_datoscontabilidad = new com.genexus.webpanels.GXUserControl();
      A801PrvRep = "" ;
      A6572PrvContac = "" ;
      A3314PrvCar = "" ;
      lblTextblockcod_clas_Jsonclick = "" ;
      ucCombo_cod_clas = new com.genexus.webpanels.GXUserControl();
      Combo_cod_clas_Caption = "" ;
      AV76Cod_Clas_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockprvclasid_Jsonclick = "" ;
      ucCombo_prvclasid = new com.genexus.webpanels.GXUserControl();
      Combo_prvclasid_Caption = "" ;
      AV78PrvClasID_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV82Pgmname = "" ;
      AV73ComboFpgCod = "" ;
      A407EmprNom = "" ;
      A13719PrvNNom = "" ;
      AV63Insert_FpgCod = "" ;
      A498FpgDsc = "" ;
      A9729Des_Clas = "" ;
      A10123GpoEcoNom = "" ;
      A14031PrvClasDsc = "" ;
      A3144PrvDivAbr = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_p_datoslocalizacion_Objectcall = "" ;
      Dvpanel_p_datoslocalizacion_Class = "" ;
      Dvpanel_p_datoslocalizacion_Height = "" ;
      Combo_fpgcod_Objectcall = "" ;
      Combo_fpgcod_Class = "" ;
      Combo_fpgcod_Icontype = "" ;
      Combo_fpgcod_Icon = "" ;
      Combo_fpgcod_Tooltip = "" ;
      Combo_fpgcod_Selectedvalue_set = "" ;
      Combo_fpgcod_Selectedtext_set = "" ;
      Combo_fpgcod_Selectedtext_get = "" ;
      Combo_fpgcod_Gamoauthtoken = "" ;
      Combo_fpgcod_Ddointernalname = "" ;
      Combo_fpgcod_Titlecontrolalign = "" ;
      Combo_fpgcod_Dropdownoptionstype = "" ;
      Combo_fpgcod_Titlecontrolidtoreplace = "" ;
      Combo_fpgcod_Datalisttype = "" ;
      Combo_fpgcod_Datalistfixedvalues = "" ;
      Combo_fpgcod_Datalistproc = "" ;
      Combo_fpgcod_Datalistprocparametersprefix = "" ;
      Combo_fpgcod_Remoteservicesparameters = "" ;
      Combo_fpgcod_Htmltemplate = "" ;
      Combo_fpgcod_Multiplevaluestype = "" ;
      Combo_fpgcod_Loadingdata = "" ;
      Combo_fpgcod_Noresultsfound = "" ;
      Combo_fpgcod_Emptyitemtext = "" ;
      Combo_fpgcod_Onlyselectedvalues = "" ;
      Combo_fpgcod_Selectalltext = "" ;
      Combo_fpgcod_Multiplevaluesseparator = "" ;
      Combo_fpgcod_Addnewoptiontext = "" ;
      Dvpanel_p_datospago_Objectcall = "" ;
      Dvpanel_p_datospago_Class = "" ;
      Dvpanel_p_datospago_Height = "" ;
      Combo_cod_clas_Objectcall = "" ;
      Combo_cod_clas_Class = "" ;
      Combo_cod_clas_Icontype = "" ;
      Combo_cod_clas_Icon = "" ;
      Combo_cod_clas_Tooltip = "" ;
      Combo_cod_clas_Selectedvalue_set = "" ;
      Combo_cod_clas_Selectedtext_set = "" ;
      Combo_cod_clas_Selectedtext_get = "" ;
      Combo_cod_clas_Gamoauthtoken = "" ;
      Combo_cod_clas_Ddointernalname = "" ;
      Combo_cod_clas_Titlecontrolalign = "" ;
      Combo_cod_clas_Dropdownoptionstype = "" ;
      Combo_cod_clas_Titlecontrolidtoreplace = "" ;
      Combo_cod_clas_Datalisttype = "" ;
      Combo_cod_clas_Datalistfixedvalues = "" ;
      Combo_cod_clas_Datalistproc = "" ;
      Combo_cod_clas_Datalistprocparametersprefix = "" ;
      Combo_cod_clas_Remoteservicesparameters = "" ;
      Combo_cod_clas_Htmltemplate = "" ;
      Combo_cod_clas_Multiplevaluestype = "" ;
      Combo_cod_clas_Loadingdata = "" ;
      Combo_cod_clas_Noresultsfound = "" ;
      Combo_cod_clas_Emptyitemtext = "" ;
      Combo_cod_clas_Onlyselectedvalues = "" ;
      Combo_cod_clas_Selectalltext = "" ;
      Combo_cod_clas_Multiplevaluesseparator = "" ;
      Combo_cod_clas_Addnewoptiontext = "" ;
      Combo_prvclasid_Objectcall = "" ;
      Combo_prvclasid_Class = "" ;
      Combo_prvclasid_Icontype = "" ;
      Combo_prvclasid_Icon = "" ;
      Combo_prvclasid_Tooltip = "" ;
      Combo_prvclasid_Selectedvalue_set = "" ;
      Combo_prvclasid_Selectedtext_set = "" ;
      Combo_prvclasid_Selectedtext_get = "" ;
      Combo_prvclasid_Gamoauthtoken = "" ;
      Combo_prvclasid_Ddointernalname = "" ;
      Combo_prvclasid_Titlecontrolalign = "" ;
      Combo_prvclasid_Dropdownoptionstype = "" ;
      Combo_prvclasid_Titlecontrolidtoreplace = "" ;
      Combo_prvclasid_Datalisttype = "" ;
      Combo_prvclasid_Datalistfixedvalues = "" ;
      Combo_prvclasid_Datalistproc = "" ;
      Combo_prvclasid_Datalistprocparametersprefix = "" ;
      Combo_prvclasid_Remoteservicesparameters = "" ;
      Combo_prvclasid_Htmltemplate = "" ;
      Combo_prvclasid_Multiplevaluestype = "" ;
      Combo_prvclasid_Loadingdata = "" ;
      Combo_prvclasid_Noresultsfound = "" ;
      Combo_prvclasid_Emptyitemtext = "" ;
      Combo_prvclasid_Onlyselectedvalues = "" ;
      Combo_prvclasid_Selectalltext = "" ;
      Combo_prvclasid_Multiplevaluesseparator = "" ;
      Combo_prvclasid_Addnewoptiontext = "" ;
      Dvpanel_p_datoscontabilidad_Objectcall = "" ;
      Dvpanel_p_datoscontabilidad_Class = "" ;
      Dvpanel_p_datoscontabilidad_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode94 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV60WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV61TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV62WebSession = httpContext.getWebSession();
      AV67TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV72ComboSelectedValue = "" ;
      AV75ComboSelectedText = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z6572PrvContac = "" ;
      Z407EmprNom = "" ;
      Z498FpgDsc = "" ;
      Z3144PrvDivAbr = "" ;
      Z9729Des_Clas = "" ;
      Z10123GpoEcoNom = "" ;
      Z14031PrvClasDsc = "" ;
      T00274_A407EmprNom = new String[] {""} ;
      T00274_n407EmprNom = new boolean[] {false} ;
      T00277_A10123GpoEcoNom = new String[] {""} ;
      T00277_n10123GpoEcoNom = new boolean[] {false} ;
      T00279_A3144PrvDivAbr = new String[] {""} ;
      T00279_n3144PrvDivAbr = new boolean[] {false} ;
      T00275_A498FpgDsc = new String[] {""} ;
      T00275_n498FpgDsc = new boolean[] {false} ;
      T00276_A9729Des_Clas = new String[] {""} ;
      T00276_n9729Des_Clas = new boolean[] {false} ;
      T00278_A14031PrvClasDsc = new String[] {""} ;
      T002710_A6572PrvContac = new String[] {""} ;
      T002710_n6572PrvContac = new boolean[] {false} ;
      T002710_A795PrvNum = new int[1] ;
      T002710_n795PrvNum = new boolean[] {false} ;
      T002710_A407EmprNom = new String[] {""} ;
      T002710_n407EmprNom = new boolean[] {false} ;
      T002710_A794PrvNom = new String[] {""} ;
      T002710_n794PrvNom = new boolean[] {false} ;
      T002710_A786PrvDir = new String[] {""} ;
      T002710_n786PrvDir = new boolean[] {false} ;
      T002710_A782PrvCpo = new String[] {""} ;
      T002710_n782PrvCpo = new boolean[] {false} ;
      T002710_A799PrvPob = new String[] {""} ;
      T002710_n799PrvPob = new boolean[] {false} ;
      T002710_A793PrvNif = new String[] {""} ;
      T002710_n793PrvNif = new boolean[] {false} ;
      T002710_A803PrvTlf = new String[] {""} ;
      T002710_n803PrvTlf = new boolean[] {false} ;
      T002710_A800PrvPri = new byte[1] ;
      T002710_n800PrvPri = new boolean[] {false} ;
      T002710_A804PrvTlx = new String[] {""} ;
      T002710_n804PrvTlx = new boolean[] {false} ;
      T002710_A802PrvTip = new String[] {""} ;
      T002710_n802PrvTip = new boolean[] {false} ;
      T002710_A498FpgDsc = new String[] {""} ;
      T002710_n498FpgDsc = new boolean[] {false} ;
      T002710_A805PrvVto = new byte[1] ;
      T002710_n805PrvVto = new boolean[] {false} ;
      T002710_A785PrvDiaPag = new int[1] ;
      T002710_n785PrvDiaPag = new boolean[] {false} ;
      T002710_A797PrvPer = new int[1] ;
      T002710_n797PrvPer = new boolean[] {false} ;
      T002710_A780PrvBan = new int[1] ;
      T002710_n780PrvBan = new boolean[] {false} ;
      T002710_A801PrvRep = new String[] {""} ;
      T002710_n801PrvRep = new boolean[] {false} ;
      T002710_A798PrvPlaEnt = new short[1] ;
      T002710_n798PrvPlaEnt = new boolean[] {false} ;
      T002710_A792PrvMetTra = new String[] {""} ;
      T002710_n792PrvMetTra = new boolean[] {false} ;
      T002710_A783PrvCta = new String[] {""} ;
      T002710_n783PrvCta = new boolean[] {false} ;
      T002710_A3092PrvDivCod = new String[] {""} ;
      T002710_n3092PrvDivCod = new boolean[] {false} ;
      T002710_A3144PrvDivAbr = new String[] {""} ;
      T002710_n3144PrvDivAbr = new boolean[] {false} ;
      T002710_A3314PrvCar = new String[] {""} ;
      T002710_n3314PrvCar = new boolean[] {false} ;
      T002710_A6075PrvCp2 = new String[] {""} ;
      T002710_n6075PrvCp2 = new boolean[] {false} ;
      T002710_A6076PrvFax = new String[] {""} ;
      T002710_n6076PrvFax = new boolean[] {false} ;
      T002710_A6077PrvMail = new String[] {""} ;
      T002710_n6077PrvMail = new boolean[] {false} ;
      T002710_A6570PrvNom2 = new String[] {""} ;
      T002710_n6570PrvNom2 = new boolean[] {false} ;
      T002710_A6571PrvDir2 = new String[] {""} ;
      T002710_n6571PrvDir2 = new boolean[] {false} ;
      T002710_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002710_n8160PrvDtoPP = new boolean[] {false} ;
      T002710_A9729Des_Clas = new String[] {""} ;
      T002710_n9729Des_Clas = new boolean[] {false} ;
      T002710_A10123GpoEcoNom = new String[] {""} ;
      T002710_n10123GpoEcoNom = new boolean[] {false} ;
      T002710_A13585PrvTipo = new String[] {""} ;
      T002710_n13585PrvTipo = new boolean[] {false} ;
      T002710_A14031PrvClasDsc = new String[] {""} ;
      T002710_A14216PrvAct = new String[] {""} ;
      T002710_A14417PrvNac = new String[] {""} ;
      T002710_A396EmprCod = new String[] {""} ;
      T002710_A497FpgCod = new String[] {""} ;
      T002710_n497FpgCod = new boolean[] {false} ;
      T002710_A9728Cod_Clas = new short[1] ;
      T002710_n9728Cod_Clas = new boolean[] {false} ;
      T002710_A10122GpoEcoCod = new int[1] ;
      T002710_n10122GpoEcoCod = new boolean[] {false} ;
      T002710_A14030PrvClasID = new short[1] ;
      T002710_n14030PrvClasID = new boolean[] {false} ;
      T002710_A3143PrvDivCo = new byte[1] ;
      T002711_A407EmprNom = new String[] {""} ;
      T002711_n407EmprNom = new boolean[] {false} ;
      T002712_A498FpgDsc = new String[] {""} ;
      T002712_n498FpgDsc = new boolean[] {false} ;
      T002713_A9729Des_Clas = new String[] {""} ;
      T002713_n9729Des_Clas = new boolean[] {false} ;
      T002714_A10123GpoEcoNom = new String[] {""} ;
      T002714_n10123GpoEcoNom = new boolean[] {false} ;
      T002715_A14031PrvClasDsc = new String[] {""} ;
      T002716_A3144PrvDivAbr = new String[] {""} ;
      T002716_n3144PrvDivAbr = new boolean[] {false} ;
      T002717_A396EmprCod = new String[] {""} ;
      T002717_A795PrvNum = new int[1] ;
      T002717_n795PrvNum = new boolean[] {false} ;
      T00273_A6572PrvContac = new String[] {""} ;
      T00273_n6572PrvContac = new boolean[] {false} ;
      T00273_A795PrvNum = new int[1] ;
      T00273_n795PrvNum = new boolean[] {false} ;
      T00273_A794PrvNom = new String[] {""} ;
      T00273_n794PrvNom = new boolean[] {false} ;
      T00273_A786PrvDir = new String[] {""} ;
      T00273_n786PrvDir = new boolean[] {false} ;
      T00273_A782PrvCpo = new String[] {""} ;
      T00273_n782PrvCpo = new boolean[] {false} ;
      T00273_A799PrvPob = new String[] {""} ;
      T00273_n799PrvPob = new boolean[] {false} ;
      T00273_A793PrvNif = new String[] {""} ;
      T00273_n793PrvNif = new boolean[] {false} ;
      T00273_A803PrvTlf = new String[] {""} ;
      T00273_n803PrvTlf = new boolean[] {false} ;
      T00273_A800PrvPri = new byte[1] ;
      T00273_n800PrvPri = new boolean[] {false} ;
      T00273_A804PrvTlx = new String[] {""} ;
      T00273_n804PrvTlx = new boolean[] {false} ;
      T00273_A802PrvTip = new String[] {""} ;
      T00273_n802PrvTip = new boolean[] {false} ;
      T00273_A805PrvVto = new byte[1] ;
      T00273_n805PrvVto = new boolean[] {false} ;
      T00273_A785PrvDiaPag = new int[1] ;
      T00273_n785PrvDiaPag = new boolean[] {false} ;
      T00273_A797PrvPer = new int[1] ;
      T00273_n797PrvPer = new boolean[] {false} ;
      T00273_A780PrvBan = new int[1] ;
      T00273_n780PrvBan = new boolean[] {false} ;
      T00273_A801PrvRep = new String[] {""} ;
      T00273_n801PrvRep = new boolean[] {false} ;
      T00273_A798PrvPlaEnt = new short[1] ;
      T00273_n798PrvPlaEnt = new boolean[] {false} ;
      T00273_A792PrvMetTra = new String[] {""} ;
      T00273_n792PrvMetTra = new boolean[] {false} ;
      T00273_A783PrvCta = new String[] {""} ;
      T00273_n783PrvCta = new boolean[] {false} ;
      T00273_A3092PrvDivCod = new String[] {""} ;
      T00273_n3092PrvDivCod = new boolean[] {false} ;
      T00273_A3314PrvCar = new String[] {""} ;
      T00273_n3314PrvCar = new boolean[] {false} ;
      T00273_A6075PrvCp2 = new String[] {""} ;
      T00273_n6075PrvCp2 = new boolean[] {false} ;
      T00273_A6076PrvFax = new String[] {""} ;
      T00273_n6076PrvFax = new boolean[] {false} ;
      T00273_A6077PrvMail = new String[] {""} ;
      T00273_n6077PrvMail = new boolean[] {false} ;
      T00273_A6570PrvNom2 = new String[] {""} ;
      T00273_n6570PrvNom2 = new boolean[] {false} ;
      T00273_A6571PrvDir2 = new String[] {""} ;
      T00273_n6571PrvDir2 = new boolean[] {false} ;
      T00273_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00273_n8160PrvDtoPP = new boolean[] {false} ;
      T00273_A13585PrvTipo = new String[] {""} ;
      T00273_n13585PrvTipo = new boolean[] {false} ;
      T00273_A14216PrvAct = new String[] {""} ;
      T00273_A14417PrvNac = new String[] {""} ;
      T00273_A396EmprCod = new String[] {""} ;
      T00273_A497FpgCod = new String[] {""} ;
      T00273_n497FpgCod = new boolean[] {false} ;
      T00273_A9728Cod_Clas = new short[1] ;
      T00273_n9728Cod_Clas = new boolean[] {false} ;
      T00273_A10122GpoEcoCod = new int[1] ;
      T00273_n10122GpoEcoCod = new boolean[] {false} ;
      T00273_A14030PrvClasID = new short[1] ;
      T00273_n14030PrvClasID = new boolean[] {false} ;
      T00273_A3143PrvDivCo = new byte[1] ;
      T002718_A396EmprCod = new String[] {""} ;
      T002718_A795PrvNum = new int[1] ;
      T002718_n795PrvNum = new boolean[] {false} ;
      T002719_A396EmprCod = new String[] {""} ;
      T002719_A795PrvNum = new int[1] ;
      T002719_n795PrvNum = new boolean[] {false} ;
      T00272_A6572PrvContac = new String[] {""} ;
      T00272_n6572PrvContac = new boolean[] {false} ;
      T00272_A795PrvNum = new int[1] ;
      T00272_n795PrvNum = new boolean[] {false} ;
      T00272_A794PrvNom = new String[] {""} ;
      T00272_n794PrvNom = new boolean[] {false} ;
      T00272_A786PrvDir = new String[] {""} ;
      T00272_n786PrvDir = new boolean[] {false} ;
      T00272_A782PrvCpo = new String[] {""} ;
      T00272_n782PrvCpo = new boolean[] {false} ;
      T00272_A799PrvPob = new String[] {""} ;
      T00272_n799PrvPob = new boolean[] {false} ;
      T00272_A793PrvNif = new String[] {""} ;
      T00272_n793PrvNif = new boolean[] {false} ;
      T00272_A803PrvTlf = new String[] {""} ;
      T00272_n803PrvTlf = new boolean[] {false} ;
      T00272_A800PrvPri = new byte[1] ;
      T00272_n800PrvPri = new boolean[] {false} ;
      T00272_A804PrvTlx = new String[] {""} ;
      T00272_n804PrvTlx = new boolean[] {false} ;
      T00272_A802PrvTip = new String[] {""} ;
      T00272_n802PrvTip = new boolean[] {false} ;
      T00272_A805PrvVto = new byte[1] ;
      T00272_n805PrvVto = new boolean[] {false} ;
      T00272_A785PrvDiaPag = new int[1] ;
      T00272_n785PrvDiaPag = new boolean[] {false} ;
      T00272_A797PrvPer = new int[1] ;
      T00272_n797PrvPer = new boolean[] {false} ;
      T00272_A780PrvBan = new int[1] ;
      T00272_n780PrvBan = new boolean[] {false} ;
      T00272_A801PrvRep = new String[] {""} ;
      T00272_n801PrvRep = new boolean[] {false} ;
      T00272_A798PrvPlaEnt = new short[1] ;
      T00272_n798PrvPlaEnt = new boolean[] {false} ;
      T00272_A792PrvMetTra = new String[] {""} ;
      T00272_n792PrvMetTra = new boolean[] {false} ;
      T00272_A783PrvCta = new String[] {""} ;
      T00272_n783PrvCta = new boolean[] {false} ;
      T00272_A3092PrvDivCod = new String[] {""} ;
      T00272_n3092PrvDivCod = new boolean[] {false} ;
      T00272_A3314PrvCar = new String[] {""} ;
      T00272_n3314PrvCar = new boolean[] {false} ;
      T00272_A6075PrvCp2 = new String[] {""} ;
      T00272_n6075PrvCp2 = new boolean[] {false} ;
      T00272_A6076PrvFax = new String[] {""} ;
      T00272_n6076PrvFax = new boolean[] {false} ;
      T00272_A6077PrvMail = new String[] {""} ;
      T00272_n6077PrvMail = new boolean[] {false} ;
      T00272_A6570PrvNom2 = new String[] {""} ;
      T00272_n6570PrvNom2 = new boolean[] {false} ;
      T00272_A6571PrvDir2 = new String[] {""} ;
      T00272_n6571PrvDir2 = new boolean[] {false} ;
      T00272_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00272_n8160PrvDtoPP = new boolean[] {false} ;
      T00272_A13585PrvTipo = new String[] {""} ;
      T00272_n13585PrvTipo = new boolean[] {false} ;
      T00272_A14216PrvAct = new String[] {""} ;
      T00272_A14417PrvNac = new String[] {""} ;
      T00272_A396EmprCod = new String[] {""} ;
      T00272_A497FpgCod = new String[] {""} ;
      T00272_n497FpgCod = new boolean[] {false} ;
      T00272_A9728Cod_Clas = new short[1] ;
      T00272_n9728Cod_Clas = new boolean[] {false} ;
      T00272_A10122GpoEcoCod = new int[1] ;
      T00272_n10122GpoEcoCod = new boolean[] {false} ;
      T00272_A14030PrvClasID = new short[1] ;
      T00272_n14030PrvClasID = new boolean[] {false} ;
      T00272_A3143PrvDivCo = new byte[1] ;
      T002723_A407EmprNom = new String[] {""} ;
      T002723_n407EmprNom = new boolean[] {false} ;
      T002724_A498FpgDsc = new String[] {""} ;
      T002724_n498FpgDsc = new boolean[] {false} ;
      T002725_A3144PrvDivAbr = new String[] {""} ;
      T002725_n3144PrvDivAbr = new boolean[] {false} ;
      T002726_A9729Des_Clas = new String[] {""} ;
      T002726_n9729Des_Clas = new boolean[] {false} ;
      T002727_A10123GpoEcoNom = new String[] {""} ;
      T002727_n10123GpoEcoNom = new boolean[] {false} ;
      T002728_A14031PrvClasDsc = new String[] {""} ;
      T002729_A396EmprCod = new String[] {""} ;
      T002729_A13418AlbProID = new int[1] ;
      T002730_A396EmprCod = new String[] {""} ;
      T002730_A12205OrdenCID = new long[1] ;
      T002731_A396EmprCod = new String[] {""} ;
      T002731_A9492MRCod = new int[1] ;
      T002731_A795PrvNum = new int[1] ;
      T002731_n795PrvNum = new boolean[] {false} ;
      T002732_A396EmprCod = new String[] {""} ;
      T002732_A11055MComCod = new long[1] ;
      T002733_A396EmprCod = new String[] {""} ;
      T002733_A9412MMSCod = new int[1] ;
      T002734_A396EmprCod = new String[] {""} ;
      T002734_A795PrvNum = new int[1] ;
      T002734_n795PrvNum = new boolean[] {false} ;
      T002734_A6146PrvPAny = new short[1] ;
      T002734_A6147PrvPPr = new String[] {""} ;
      T002735_A396EmprCod = new String[] {""} ;
      T002735_A1387AlbPrvCod = new int[1] ;
      T002736_A396EmprCod = new String[] {""} ;
      T002736_A795PrvNum = new int[1] ;
      T002736_n795PrvNum = new boolean[] {false} ;
      T002736_A779PrvAny = new short[1] ;
      T002737_A396EmprCod = new String[] {""} ;
      T002737_A658PedCod = new int[1] ;
      T002738_A396EmprCod = new String[] {""} ;
      T002738_A719PrdNum = new String[] {""} ;
      T002739_A396EmprCod = new String[] {""} ;
      T002739_A795PrvNum = new int[1] ;
      T002739_n795PrvNum = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i802PrvTip = "" ;
      i792PrvMetTra = "" ;
      i13585PrvTipo = "" ;
      i14216PrvAct = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T002740_A3099DivCod = new byte[1] ;
      T002740_A3101DivAbr = new String[] {""} ;
      T002740_n3101DivAbr = new boolean[] {false} ;
      T002741_A396EmprCod = new String[] {""} ;
      T002741_A10122GpoEcoCod = new int[1] ;
      T002741_n10122GpoEcoCod = new boolean[] {false} ;
      T002741_A10123GpoEcoNom = new String[] {""} ;
      T002741_n10123GpoEcoNom = new boolean[] {false} ;
      GXv_int13 = new int[1] ;
      GXv_int6 = new byte[1] ;
      T002742_A3099DivCod = new byte[1] ;
      T002742_A3101DivAbr = new String[] {""} ;
      T002742_n3101DivAbr = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprvgen__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprvgen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprvgen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprvgen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgen__default(),
         new Object[] {
             new Object[] {
            T00272_A6572PrvContac, T00272_n6572PrvContac, T00272_A795PrvNum, T00272_A794PrvNom, T00272_n794PrvNom, T00272_A786PrvDir, T00272_n786PrvDir, T00272_A782PrvCpo, T00272_n782PrvCpo, T00272_A799PrvPob,
            T00272_n799PrvPob, T00272_A793PrvNif, T00272_n793PrvNif, T00272_A803PrvTlf, T00272_n803PrvTlf, T00272_A800PrvPri, T00272_n800PrvPri, T00272_A804PrvTlx, T00272_n804PrvTlx, T00272_A802PrvTip,
            T00272_n802PrvTip, T00272_A805PrvVto, T00272_n805PrvVto, T00272_A785PrvDiaPag, T00272_n785PrvDiaPag, T00272_A797PrvPer, T00272_n797PrvPer, T00272_A780PrvBan, T00272_n780PrvBan, T00272_A801PrvRep,
            T00272_n801PrvRep, T00272_A798PrvPlaEnt, T00272_n798PrvPlaEnt, T00272_A792PrvMetTra, T00272_n792PrvMetTra, T00272_A783PrvCta, T00272_n783PrvCta, T00272_A3092PrvDivCod, T00272_n3092PrvDivCod, T00272_A3314PrvCar,
            T00272_n3314PrvCar, T00272_A6075PrvCp2, T00272_n6075PrvCp2, T00272_A6076PrvFax, T00272_n6076PrvFax, T00272_A6077PrvMail, T00272_n6077PrvMail, T00272_A6570PrvNom2, T00272_n6570PrvNom2, T00272_A6571PrvDir2,
            T00272_n6571PrvDir2, T00272_A8160PrvDtoPP, T00272_n8160PrvDtoPP, T00272_A13585PrvTipo, T00272_n13585PrvTipo, T00272_A14216PrvAct, T00272_A14417PrvNac, T00272_A396EmprCod, T00272_A497FpgCod, T00272_n497FpgCod,
            T00272_A9728Cod_Clas, T00272_n9728Cod_Clas, T00272_A10122GpoEcoCod, T00272_n10122GpoEcoCod, T00272_A14030PrvClasID, T00272_n14030PrvClasID, T00272_A3143PrvDivCo
            }
            , new Object[] {
            T00273_A6572PrvContac, T00273_n6572PrvContac, T00273_A795PrvNum, T00273_A794PrvNom, T00273_n794PrvNom, T00273_A786PrvDir, T00273_n786PrvDir, T00273_A782PrvCpo, T00273_n782PrvCpo, T00273_A799PrvPob,
            T00273_n799PrvPob, T00273_A793PrvNif, T00273_n793PrvNif, T00273_A803PrvTlf, T00273_n803PrvTlf, T00273_A800PrvPri, T00273_n800PrvPri, T00273_A804PrvTlx, T00273_n804PrvTlx, T00273_A802PrvTip,
            T00273_n802PrvTip, T00273_A805PrvVto, T00273_n805PrvVto, T00273_A785PrvDiaPag, T00273_n785PrvDiaPag, T00273_A797PrvPer, T00273_n797PrvPer, T00273_A780PrvBan, T00273_n780PrvBan, T00273_A801PrvRep,
            T00273_n801PrvRep, T00273_A798PrvPlaEnt, T00273_n798PrvPlaEnt, T00273_A792PrvMetTra, T00273_n792PrvMetTra, T00273_A783PrvCta, T00273_n783PrvCta, T00273_A3092PrvDivCod, T00273_n3092PrvDivCod, T00273_A3314PrvCar,
            T00273_n3314PrvCar, T00273_A6075PrvCp2, T00273_n6075PrvCp2, T00273_A6076PrvFax, T00273_n6076PrvFax, T00273_A6077PrvMail, T00273_n6077PrvMail, T00273_A6570PrvNom2, T00273_n6570PrvNom2, T00273_A6571PrvDir2,
            T00273_n6571PrvDir2, T00273_A8160PrvDtoPP, T00273_n8160PrvDtoPP, T00273_A13585PrvTipo, T00273_n13585PrvTipo, T00273_A14216PrvAct, T00273_A14417PrvNac, T00273_A396EmprCod, T00273_A497FpgCod, T00273_n497FpgCod,
            T00273_A9728Cod_Clas, T00273_n9728Cod_Clas, T00273_A10122GpoEcoCod, T00273_n10122GpoEcoCod, T00273_A14030PrvClasID, T00273_n14030PrvClasID, T00273_A3143PrvDivCo
            }
            , new Object[] {
            T00274_A407EmprNom, T00274_n407EmprNom
            }
            , new Object[] {
            T00275_A498FpgDsc, T00275_n498FpgDsc
            }
            , new Object[] {
            T00276_A9729Des_Clas, T00276_n9729Des_Clas
            }
            , new Object[] {
            T00277_A10123GpoEcoNom, T00277_n10123GpoEcoNom
            }
            , new Object[] {
            T00278_A14031PrvClasDsc
            }
            , new Object[] {
            T00279_A3144PrvDivAbr, T00279_n3144PrvDivAbr
            }
            , new Object[] {
            T002710_A6572PrvContac, T002710_n6572PrvContac, T002710_A795PrvNum, T002710_A407EmprNom, T002710_n407EmprNom, T002710_A794PrvNom, T002710_n794PrvNom, T002710_A786PrvDir, T002710_n786PrvDir, T002710_A782PrvCpo,
            T002710_n782PrvCpo, T002710_A799PrvPob, T002710_n799PrvPob, T002710_A793PrvNif, T002710_n793PrvNif, T002710_A803PrvTlf, T002710_n803PrvTlf, T002710_A800PrvPri, T002710_n800PrvPri, T002710_A804PrvTlx,
            T002710_n804PrvTlx, T002710_A802PrvTip, T002710_n802PrvTip, T002710_A498FpgDsc, T002710_n498FpgDsc, T002710_A805PrvVto, T002710_n805PrvVto, T002710_A785PrvDiaPag, T002710_n785PrvDiaPag, T002710_A797PrvPer,
            T002710_n797PrvPer, T002710_A780PrvBan, T002710_n780PrvBan, T002710_A801PrvRep, T002710_n801PrvRep, T002710_A798PrvPlaEnt, T002710_n798PrvPlaEnt, T002710_A792PrvMetTra, T002710_n792PrvMetTra, T002710_A783PrvCta,
            T002710_n783PrvCta, T002710_A3092PrvDivCod, T002710_n3092PrvDivCod, T002710_A3144PrvDivAbr, T002710_n3144PrvDivAbr, T002710_A3314PrvCar, T002710_n3314PrvCar, T002710_A6075PrvCp2, T002710_n6075PrvCp2, T002710_A6076PrvFax,
            T002710_n6076PrvFax, T002710_A6077PrvMail, T002710_n6077PrvMail, T002710_A6570PrvNom2, T002710_n6570PrvNom2, T002710_A6571PrvDir2, T002710_n6571PrvDir2, T002710_A8160PrvDtoPP, T002710_n8160PrvDtoPP, T002710_A9729Des_Clas,
            T002710_n9729Des_Clas, T002710_A10123GpoEcoNom, T002710_n10123GpoEcoNom, T002710_A13585PrvTipo, T002710_n13585PrvTipo, T002710_A14031PrvClasDsc, T002710_A14216PrvAct, T002710_A14417PrvNac, T002710_A396EmprCod, T002710_A497FpgCod,
            T002710_n497FpgCod, T002710_A9728Cod_Clas, T002710_n9728Cod_Clas, T002710_A10122GpoEcoCod, T002710_n10122GpoEcoCod, T002710_A14030PrvClasID, T002710_n14030PrvClasID, T002710_A3143PrvDivCo
            }
            , new Object[] {
            T002711_A407EmprNom, T002711_n407EmprNom
            }
            , new Object[] {
            T002712_A498FpgDsc, T002712_n498FpgDsc
            }
            , new Object[] {
            T002713_A9729Des_Clas, T002713_n9729Des_Clas
            }
            , new Object[] {
            T002714_A10123GpoEcoNom, T002714_n10123GpoEcoNom
            }
            , new Object[] {
            T002715_A14031PrvClasDsc
            }
            , new Object[] {
            T002716_A3144PrvDivAbr, T002716_n3144PrvDivAbr
            }
            , new Object[] {
            T002717_A396EmprCod, T002717_A795PrvNum
            }
            , new Object[] {
            T002718_A396EmprCod, T002718_A795PrvNum
            }
            , new Object[] {
            T002719_A396EmprCod, T002719_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002723_A407EmprNom, T002723_n407EmprNom
            }
            , new Object[] {
            T002724_A498FpgDsc, T002724_n498FpgDsc
            }
            , new Object[] {
            T002725_A3144PrvDivAbr, T002725_n3144PrvDivAbr
            }
            , new Object[] {
            T002726_A9729Des_Clas, T002726_n9729Des_Clas
            }
            , new Object[] {
            T002727_A10123GpoEcoNom, T002727_n10123GpoEcoNom
            }
            , new Object[] {
            T002728_A14031PrvClasDsc
            }
            , new Object[] {
            T002729_A396EmprCod, T002729_A13418AlbProID
            }
            , new Object[] {
            T002730_A396EmprCod, T002730_A12205OrdenCID
            }
            , new Object[] {
            T002731_A396EmprCod, T002731_A9492MRCod, T002731_A795PrvNum
            }
            , new Object[] {
            T002732_A396EmprCod, T002732_A11055MComCod
            }
            , new Object[] {
            T002733_A396EmprCod, T002733_A9412MMSCod
            }
            , new Object[] {
            T002734_A396EmprCod, T002734_A795PrvNum, T002734_A6146PrvPAny, T002734_A6147PrvPPr
            }
            , new Object[] {
            T002735_A396EmprCod, T002735_A1387AlbPrvCod
            }
            , new Object[] {
            T002736_A396EmprCod, T002736_A795PrvNum, T002736_A779PrvAny
            }
            , new Object[] {
            T002737_A396EmprCod, T002737_A658PedCod
            }
            , new Object[] {
            T002738_A396EmprCod, T002738_A719PrdNum
            }
            , new Object[] {
            T002739_A396EmprCod, T002739_A795PrvNum
            }
            , new Object[] {
            T002740_A3099DivCod, T002740_A3101DivAbr, T002740_n3101DivAbr
            }
            , new Object[] {
            T002741_A396EmprCod, T002741_A10122GpoEcoCod, T002741_A10123GpoEcoNom, T002741_n10123GpoEcoNom
            }
            , new Object[] {
            T002742_A3099DivCod, T002742_A3101DivAbr, T002742_n3101DivAbr
            }
         }
      );
      AV82Pgmname = "TPRVGEN" ;
      Z14216PrvAct = httpContext.getMessage( "S", "") ;
      A14216PrvAct = httpContext.getMessage( "S", "") ;
      i14216PrvAct = httpContext.getMessage( "S", "") ;
      Z13585PrvTipo = httpContext.getMessage( "I", "") ;
      n13585PrvTipo = false ;
      A13585PrvTipo = httpContext.getMessage( "I", "") ;
      n13585PrvTipo = false ;
      i13585PrvTipo = httpContext.getMessage( "I", "") ;
      n13585PrvTipo = false ;
      Z792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      A792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      i792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      Z802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      A802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      i802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      Z800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
      A800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
      i800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
   }

   private byte Z800PrvPri ;
   private byte Z805PrvVto ;
   private byte Z3143PrvDivCo ;
   private byte N3143PrvDivCo ;
   private byte GxWebError ;
   private byte A3143PrvDivCo ;
   private byte nKeyPressed ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte AV64Insert_PrvDivCo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte i800PrvPri ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short Z798PrvPlaEnt ;
   private short Z9728Cod_Clas ;
   private short Z14030PrvClasID ;
   private short N9728Cod_Clas ;
   private short N14030PrvClasID ;
   private short AV80autonumber ;
   private short A9728Cod_Clas ;
   private short A14030PrvClasID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A798PrvPlaEnt ;
   private short AV77ComboCod_Clas ;
   private short AV79ComboPrvClasID ;
   private short AV65Insert_Cod_Clas ;
   private short AV70Insert_PrvClasID ;
   private short RcdFound94 ;
   private short nIsDirty_94 ;
   private int wcpOAV59PrvNum ;
   private int Z795PrvNum ;
   private int Z785PrvDiaPag ;
   private int Z797PrvPer ;
   private int Z780PrvBan ;
   private int Z10122GpoEcoCod ;
   private int N10122GpoEcoCod ;
   private int AV59PrvNum ;
   private int A795PrvNum ;
   private int A10122GpoEcoCod ;
   private int trnEnded ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrvNom2_Enabled ;
   private int edtPrvNif_Enabled ;
   private int edtPrvDir_Enabled ;
   private int edtPrvDir2_Enabled ;
   private int edtPrvCpo_Enabled ;
   private int edtPrvCp2_Enabled ;
   private int edtPrvPob_Enabled ;
   private int edtPrvTlx_Enabled ;
   private int edtPrvTlf_Enabled ;
   private int edtPrvFax_Enabled ;
   private int edtPrvMail_Enabled ;
   private int edtFpgCod_Visible ;
   private int edtFpgCod_Enabled ;
   private int edtPrvVto_Enabled ;
   private int A797PrvPer ;
   private int edtPrvPer_Enabled ;
   private int A785PrvDiaPag ;
   private int edtPrvDiaPag_Enabled ;
   private int edtPrvDtoPP_Enabled ;
   private int A780PrvBan ;
   private int edtPrvBan_Enabled ;
   private int edtPrvCta_Enabled ;
   private int edtPrvRep_Enabled ;
   private int edtPrvPlaEnt_Enabled ;
   private int edtPrvContac_Enabled ;
   private int edtPrvCar_Enabled ;
   private int edtCod_Clas_Visible ;
   private int edtCod_Clas_Enabled ;
   private int edtPrvClasID_Visible ;
   private int edtPrvClasID_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombofpgcod_Visible ;
   private int edtavCombofpgcod_Enabled ;
   private int edtavCombocod_clas_Enabled ;
   private int edtavCombocod_clas_Visible ;
   private int edtavComboprvclasid_Enabled ;
   private int edtavComboprvclasid_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int AV66Insert_GpoEcoCod ;
   private int Combo_fpgcod_Datalistupdateminimumcharacters ;
   private int Combo_cod_clas_Datalistupdateminimumcharacters ;
   private int Combo_prvclasid_Datalistupdateminimumcharacters ;
   private int AV83GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private java.math.BigDecimal Z8160PrvDtoPP ;
   private java.math.BigDecimal A8160PrvDtoPP ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV58EmprCod ;
   private String Z396EmprCod ;
   private String Z794PrvNom ;
   private String Z786PrvDir ;
   private String Z782PrvCpo ;
   private String Z799PrvPob ;
   private String Z793PrvNif ;
   private String Z803PrvTlf ;
   private String Z804PrvTlx ;
   private String Z802PrvTip ;
   private String Z801PrvRep ;
   private String Z792PrvMetTra ;
   private String Z783PrvCta ;
   private String Z3092PrvDivCod ;
   private String Z3314PrvCar ;
   private String Z6075PrvCp2 ;
   private String Z6076PrvFax ;
   private String Z6077PrvMail ;
   private String Z6570PrvNom2 ;
   private String Z6571PrvDir2 ;
   private String Z13585PrvTipo ;
   private String Z14216PrvAct ;
   private String Z14417PrvNac ;
   private String Z497FpgCod ;
   private String N497FpgCod ;
   private String Combo_prvclasid_Selectedvalue_get ;
   private String Combo_cod_clas_Selectedvalue_get ;
   private String Combo_fpgcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV58EmprCod ;
   private String A497FpgCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrvNum_Internalname ;
   private String A13585PrvTipo ;
   private String A14216PrvAct ;
   private String A14417PrvNac ;
   private String A802PrvTip ;
   private String A3092PrvDivCod ;
   private String A792PrvMetTra ;
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
   private String divUnnamedtable6_Internalname ;
   private String TempTags ;
   private String edtPrvNum_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrvNom2_Internalname ;
   private String A6570PrvNom2 ;
   private String edtPrvNom2_Jsonclick ;
   private String edtPrvNif_Internalname ;
   private String A793PrvNif ;
   private String edtPrvNif_Jsonclick ;
   private String Dvpanel_p_datoslocalizacion_Width ;
   private String Dvpanel_p_datoslocalizacion_Cls ;
   private String Dvpanel_p_datoslocalizacion_Title ;
   private String Dvpanel_p_datoslocalizacion_Iconposition ;
   private String Dvpanel_p_datoslocalizacion_Internalname ;
   private String divP_datoslocalizacion_Internalname ;
   private String edtPrvDir_Internalname ;
   private String A786PrvDir ;
   private String edtPrvDir_Jsonclick ;
   private String edtPrvDir2_Internalname ;
   private String A6571PrvDir2 ;
   private String edtPrvDir2_Jsonclick ;
   private String edtPrvCpo_Internalname ;
   private String A782PrvCpo ;
   private String edtPrvCpo_Jsonclick ;
   private String edtPrvCp2_Internalname ;
   private String A6075PrvCp2 ;
   private String edtPrvCp2_Jsonclick ;
   private String edtPrvPob_Internalname ;
   private String A799PrvPob ;
   private String edtPrvPob_Jsonclick ;
   private String edtPrvTlx_Internalname ;
   private String A804PrvTlx ;
   private String edtPrvTlx_Jsonclick ;
   private String edtPrvTlf_Internalname ;
   private String A803PrvTlf ;
   private String edtPrvTlf_Jsonclick ;
   private String edtPrvFax_Internalname ;
   private String A6076PrvFax ;
   private String edtPrvFax_Jsonclick ;
   private String edtPrvMail_Internalname ;
   private String A6077PrvMail ;
   private String edtPrvMail_Jsonclick ;
   private String divGpoecocod_cell_Internalname ;
   private String divGpoecocod_cell_Class ;
   private String Dvpanel_p_datospago_Width ;
   private String Dvpanel_p_datospago_Cls ;
   private String Dvpanel_p_datospago_Title ;
   private String Dvpanel_p_datospago_Iconposition ;
   private String Dvpanel_p_datospago_Internalname ;
   private String divP_datospago_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedfpgcod_Internalname ;
   private String lblTextblockfpgcod_Internalname ;
   private String lblTextblockfpgcod_Jsonclick ;
   private String Combo_fpgcod_Caption ;
   private String Combo_fpgcod_Cls ;
   private String Combo_fpgcod_Internalname ;
   private String edtFpgCod_Internalname ;
   private String edtFpgCod_Jsonclick ;
   private String edtPrvVto_Internalname ;
   private String edtPrvVto_Jsonclick ;
   private String edtPrvPer_Internalname ;
   private String edtPrvPer_Jsonclick ;
   private String edtPrvDiaPag_Internalname ;
   private String edtPrvDiaPag_Jsonclick ;
   private String edtPrvDtoPP_Internalname ;
   private String edtPrvDtoPP_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtPrvBan_Internalname ;
   private String edtPrvBan_Jsonclick ;
   private String edtPrvCta_Internalname ;
   private String A783PrvCta ;
   private String edtPrvCta_Jsonclick ;
   private String Dvpanel_p_datoscontabilidad_Width ;
   private String Dvpanel_p_datoscontabilidad_Cls ;
   private String Dvpanel_p_datoscontabilidad_Title ;
   private String Dvpanel_p_datoscontabilidad_Iconposition ;
   private String Dvpanel_p_datoscontabilidad_Internalname ;
   private String divP_datoscontabilidad_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtPrvRep_Internalname ;
   private String A801PrvRep ;
   private String edtPrvRep_Jsonclick ;
   private String edtPrvPlaEnt_Internalname ;
   private String edtPrvPlaEnt_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtPrvContac_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtPrvCar_Internalname ;
   private String A3314PrvCar ;
   private String edtPrvCar_Jsonclick ;
   private String divTablesplittedcod_clas_Internalname ;
   private String lblTextblockcod_clas_Internalname ;
   private String lblTextblockcod_clas_Jsonclick ;
   private String Combo_cod_clas_Caption ;
   private String Combo_cod_clas_Cls ;
   private String Combo_cod_clas_Internalname ;
   private String edtCod_Clas_Internalname ;
   private String edtCod_Clas_Jsonclick ;
   private String divTablesplittedprvclasid_Internalname ;
   private String lblTextblockprvclasid_Internalname ;
   private String lblTextblockprvclasid_Jsonclick ;
   private String Combo_prvclasid_Caption ;
   private String Combo_prvclasid_Cls ;
   private String Combo_prvclasid_Internalname ;
   private String edtPrvClasID_Internalname ;
   private String edtPrvClasID_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV82Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_fpgcod_Internalname ;
   private String edtavCombofpgcod_Internalname ;
   private String AV73ComboFpgCod ;
   private String edtavCombofpgcod_Jsonclick ;
   private String divSectionattribute_cod_clas_Internalname ;
   private String edtavCombocod_clas_Internalname ;
   private String edtavCombocod_clas_Jsonclick ;
   private String divSectionattribute_prvclasid_Internalname ;
   private String edtavComboprvclasid_Internalname ;
   private String edtavComboprvclasid_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String AV63Insert_FpgCod ;
   private String A498FpgDsc ;
   private String A9729Des_Clas ;
   private String A14031PrvClasDsc ;
   private String A3144PrvDivAbr ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_p_datoslocalizacion_Objectcall ;
   private String Dvpanel_p_datoslocalizacion_Class ;
   private String Dvpanel_p_datoslocalizacion_Height ;
   private String Combo_fpgcod_Objectcall ;
   private String Combo_fpgcod_Class ;
   private String Combo_fpgcod_Icontype ;
   private String Combo_fpgcod_Icon ;
   private String Combo_fpgcod_Tooltip ;
   private String Combo_fpgcod_Selectedvalue_set ;
   private String Combo_fpgcod_Selectedtext_set ;
   private String Combo_fpgcod_Selectedtext_get ;
   private String Combo_fpgcod_Gamoauthtoken ;
   private String Combo_fpgcod_Ddointernalname ;
   private String Combo_fpgcod_Titlecontrolalign ;
   private String Combo_fpgcod_Dropdownoptionstype ;
   private String Combo_fpgcod_Titlecontrolidtoreplace ;
   private String Combo_fpgcod_Datalisttype ;
   private String Combo_fpgcod_Datalistfixedvalues ;
   private String Combo_fpgcod_Datalistproc ;
   private String Combo_fpgcod_Datalistprocparametersprefix ;
   private String Combo_fpgcod_Remoteservicesparameters ;
   private String Combo_fpgcod_Htmltemplate ;
   private String Combo_fpgcod_Multiplevaluestype ;
   private String Combo_fpgcod_Loadingdata ;
   private String Combo_fpgcod_Noresultsfound ;
   private String Combo_fpgcod_Emptyitemtext ;
   private String Combo_fpgcod_Onlyselectedvalues ;
   private String Combo_fpgcod_Selectalltext ;
   private String Combo_fpgcod_Multiplevaluesseparator ;
   private String Combo_fpgcod_Addnewoptiontext ;
   private String Dvpanel_p_datospago_Objectcall ;
   private String Dvpanel_p_datospago_Class ;
   private String Dvpanel_p_datospago_Height ;
   private String Combo_cod_clas_Objectcall ;
   private String Combo_cod_clas_Class ;
   private String Combo_cod_clas_Icontype ;
   private String Combo_cod_clas_Icon ;
   private String Combo_cod_clas_Tooltip ;
   private String Combo_cod_clas_Selectedvalue_set ;
   private String Combo_cod_clas_Selectedtext_set ;
   private String Combo_cod_clas_Selectedtext_get ;
   private String Combo_cod_clas_Gamoauthtoken ;
   private String Combo_cod_clas_Ddointernalname ;
   private String Combo_cod_clas_Titlecontrolalign ;
   private String Combo_cod_clas_Dropdownoptionstype ;
   private String Combo_cod_clas_Titlecontrolidtoreplace ;
   private String Combo_cod_clas_Datalisttype ;
   private String Combo_cod_clas_Datalistfixedvalues ;
   private String Combo_cod_clas_Datalistproc ;
   private String Combo_cod_clas_Datalistprocparametersprefix ;
   private String Combo_cod_clas_Remoteservicesparameters ;
   private String Combo_cod_clas_Htmltemplate ;
   private String Combo_cod_clas_Multiplevaluestype ;
   private String Combo_cod_clas_Loadingdata ;
   private String Combo_cod_clas_Noresultsfound ;
   private String Combo_cod_clas_Emptyitemtext ;
   private String Combo_cod_clas_Onlyselectedvalues ;
   private String Combo_cod_clas_Selectalltext ;
   private String Combo_cod_clas_Multiplevaluesseparator ;
   private String Combo_cod_clas_Addnewoptiontext ;
   private String Combo_prvclasid_Objectcall ;
   private String Combo_prvclasid_Class ;
   private String Combo_prvclasid_Icontype ;
   private String Combo_prvclasid_Icon ;
   private String Combo_prvclasid_Tooltip ;
   private String Combo_prvclasid_Selectedvalue_set ;
   private String Combo_prvclasid_Selectedtext_set ;
   private String Combo_prvclasid_Selectedtext_get ;
   private String Combo_prvclasid_Gamoauthtoken ;
   private String Combo_prvclasid_Ddointernalname ;
   private String Combo_prvclasid_Titlecontrolalign ;
   private String Combo_prvclasid_Dropdownoptionstype ;
   private String Combo_prvclasid_Titlecontrolidtoreplace ;
   private String Combo_prvclasid_Datalisttype ;
   private String Combo_prvclasid_Datalistfixedvalues ;
   private String Combo_prvclasid_Datalistproc ;
   private String Combo_prvclasid_Datalistprocparametersprefix ;
   private String Combo_prvclasid_Remoteservicesparameters ;
   private String Combo_prvclasid_Htmltemplate ;
   private String Combo_prvclasid_Multiplevaluestype ;
   private String Combo_prvclasid_Loadingdata ;
   private String Combo_prvclasid_Noresultsfound ;
   private String Combo_prvclasid_Emptyitemtext ;
   private String Combo_prvclasid_Onlyselectedvalues ;
   private String Combo_prvclasid_Selectalltext ;
   private String Combo_prvclasid_Multiplevaluesseparator ;
   private String Combo_prvclasid_Addnewoptiontext ;
   private String Dvpanel_p_datoscontabilidad_Objectcall ;
   private String Dvpanel_p_datoscontabilidad_Class ;
   private String Dvpanel_p_datoscontabilidad_Height ;
   private String hsh ;
   private String sMode94 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z498FpgDsc ;
   private String Z3144PrvDivAbr ;
   private String Z9729Des_Clas ;
   private String Z14031PrvClasDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i802PrvTip ;
   private String i792PrvMetTra ;
   private String i13585PrvTipo ;
   private String i14216PrvAct ;
   private String gxwrpcisep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n795PrvNum ;
   private boolean n497FpgCod ;
   private boolean n9728Cod_Clas ;
   private boolean n10122GpoEcoCod ;
   private boolean n14030PrvClasID ;
   private boolean wbErr ;
   private boolean n13585PrvTipo ;
   private boolean n800PrvPri ;
   private boolean n802PrvTip ;
   private boolean n3092PrvDivCod ;
   private boolean n792PrvMetTra ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_p_datoslocalizacion_Autowidth ;
   private boolean Dvpanel_p_datoslocalizacion_Autoheight ;
   private boolean Dvpanel_p_datoslocalizacion_Collapsible ;
   private boolean Dvpanel_p_datoslocalizacion_Collapsed ;
   private boolean Dvpanel_p_datoslocalizacion_Showcollapseicon ;
   private boolean Dvpanel_p_datoslocalizacion_Autoscroll ;
   private boolean Dvpanel_p_datospago_Autowidth ;
   private boolean Dvpanel_p_datospago_Autoheight ;
   private boolean Dvpanel_p_datospago_Collapsible ;
   private boolean Dvpanel_p_datospago_Collapsed ;
   private boolean Dvpanel_p_datospago_Showcollapseicon ;
   private boolean Dvpanel_p_datospago_Autoscroll ;
   private boolean Dvpanel_p_datoscontabilidad_Autowidth ;
   private boolean Dvpanel_p_datoscontabilidad_Autoheight ;
   private boolean Dvpanel_p_datoscontabilidad_Collapsible ;
   private boolean Dvpanel_p_datoscontabilidad_Collapsed ;
   private boolean Dvpanel_p_datoscontabilidad_Showcollapseicon ;
   private boolean Dvpanel_p_datoscontabilidad_Autoscroll ;
   private boolean n498FpgDsc ;
   private boolean n9729Des_Clas ;
   private boolean n10123GpoEcoNom ;
   private boolean n3144PrvDivAbr ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_p_datoslocalizacion_Enabled ;
   private boolean Dvpanel_p_datoslocalizacion_Showheader ;
   private boolean Dvpanel_p_datoslocalizacion_Visible ;
   private boolean Combo_fpgcod_Enabled ;
   private boolean Combo_fpgcod_Visible ;
   private boolean Combo_fpgcod_Allowmultipleselection ;
   private boolean Combo_fpgcod_Isgriditem ;
   private boolean Combo_fpgcod_Hasdescription ;
   private boolean Combo_fpgcod_Includeonlyselectedoption ;
   private boolean Combo_fpgcod_Includeselectalloption ;
   private boolean Combo_fpgcod_Emptyitem ;
   private boolean Combo_fpgcod_Includeaddnewoption ;
   private boolean Dvpanel_p_datospago_Enabled ;
   private boolean Dvpanel_p_datospago_Showheader ;
   private boolean Dvpanel_p_datospago_Visible ;
   private boolean Combo_cod_clas_Enabled ;
   private boolean Combo_cod_clas_Visible ;
   private boolean Combo_cod_clas_Allowmultipleselection ;
   private boolean Combo_cod_clas_Isgriditem ;
   private boolean Combo_cod_clas_Hasdescription ;
   private boolean Combo_cod_clas_Includeonlyselectedoption ;
   private boolean Combo_cod_clas_Includeselectalloption ;
   private boolean Combo_cod_clas_Emptyitem ;
   private boolean Combo_cod_clas_Includeaddnewoption ;
   private boolean Combo_prvclasid_Enabled ;
   private boolean Combo_prvclasid_Visible ;
   private boolean Combo_prvclasid_Allowmultipleselection ;
   private boolean Combo_prvclasid_Isgriditem ;
   private boolean Combo_prvclasid_Hasdescription ;
   private boolean Combo_prvclasid_Includeonlyselectedoption ;
   private boolean Combo_prvclasid_Includeselectalloption ;
   private boolean Combo_prvclasid_Emptyitem ;
   private boolean Combo_prvclasid_Includeaddnewoption ;
   private boolean Dvpanel_p_datoscontabilidad_Enabled ;
   private boolean Dvpanel_p_datoscontabilidad_Showheader ;
   private boolean Dvpanel_p_datoscontabilidad_Visible ;
   private boolean n794PrvNom ;
   private boolean n6570PrvNom2 ;
   private boolean n793PrvNif ;
   private boolean n786PrvDir ;
   private boolean n6571PrvDir2 ;
   private boolean n782PrvCpo ;
   private boolean n6075PrvCp2 ;
   private boolean n799PrvPob ;
   private boolean n804PrvTlx ;
   private boolean n803PrvTlf ;
   private boolean n6076PrvFax ;
   private boolean n6077PrvMail ;
   private boolean n805PrvVto ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n8160PrvDtoPP ;
   private boolean n780PrvBan ;
   private boolean n783PrvCta ;
   private boolean n801PrvRep ;
   private boolean n798PrvPlaEnt ;
   private boolean n6572PrvContac ;
   private boolean n3314PrvCar ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private String A6572PrvContac ;
   private String Z6572PrvContac ;
   private String A13719PrvNNom ;
   private String A10123GpoEcoNom ;
   private String AV72ComboSelectedValue ;
   private String AV75ComboSelectedText ;
   private String Z10123GpoEcoNom ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV62WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_p_datoslocalizacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_p_datospago ;
   private com.genexus.webpanels.GXUserControl ucCombo_fpgcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_p_datoscontabilidad ;
   private com.genexus.webpanels.GXUserControl ucCombo_cod_clas ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvclasid ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPrvTipo ;
   private ICheckbox chkPrvPri ;
   private ICheckbox chkPrvAct ;
   private ICheckbox chkPrvNac ;
   private HTMLChoice cmbPrvTip ;
   private HTMLChoice dynGpoEcoCod ;
   private HTMLChoice dynPrvDivCo ;
   private HTMLChoice cmbPrvDivCod ;
   private HTMLChoice cmbPrvMetTra ;
   private IDataStoreProvider pr_default ;
   private String[] T00274_A407EmprNom ;
   private boolean[] T00274_n407EmprNom ;
   private String[] T00277_A10123GpoEcoNom ;
   private boolean[] T00277_n10123GpoEcoNom ;
   private String[] T00279_A3144PrvDivAbr ;
   private boolean[] T00279_n3144PrvDivAbr ;
   private String[] T00275_A498FpgDsc ;
   private boolean[] T00275_n498FpgDsc ;
   private String[] T00276_A9729Des_Clas ;
   private boolean[] T00276_n9729Des_Clas ;
   private String[] T00278_A14031PrvClasDsc ;
   private String[] T002710_A6572PrvContac ;
   private boolean[] T002710_n6572PrvContac ;
   private int[] T002710_A795PrvNum ;
   private boolean[] T002710_n795PrvNum ;
   private String[] T002710_A407EmprNom ;
   private boolean[] T002710_n407EmprNom ;
   private String[] T002710_A794PrvNom ;
   private boolean[] T002710_n794PrvNom ;
   private String[] T002710_A786PrvDir ;
   private boolean[] T002710_n786PrvDir ;
   private String[] T002710_A782PrvCpo ;
   private boolean[] T002710_n782PrvCpo ;
   private String[] T002710_A799PrvPob ;
   private boolean[] T002710_n799PrvPob ;
   private String[] T002710_A793PrvNif ;
   private boolean[] T002710_n793PrvNif ;
   private String[] T002710_A803PrvTlf ;
   private boolean[] T002710_n803PrvTlf ;
   private byte[] T002710_A800PrvPri ;
   private boolean[] T002710_n800PrvPri ;
   private String[] T002710_A804PrvTlx ;
   private boolean[] T002710_n804PrvTlx ;
   private String[] T002710_A802PrvTip ;
   private boolean[] T002710_n802PrvTip ;
   private String[] T002710_A498FpgDsc ;
   private boolean[] T002710_n498FpgDsc ;
   private byte[] T002710_A805PrvVto ;
   private boolean[] T002710_n805PrvVto ;
   private int[] T002710_A785PrvDiaPag ;
   private boolean[] T002710_n785PrvDiaPag ;
   private int[] T002710_A797PrvPer ;
   private boolean[] T002710_n797PrvPer ;
   private int[] T002710_A780PrvBan ;
   private boolean[] T002710_n780PrvBan ;
   private String[] T002710_A801PrvRep ;
   private boolean[] T002710_n801PrvRep ;
   private short[] T002710_A798PrvPlaEnt ;
   private boolean[] T002710_n798PrvPlaEnt ;
   private String[] T002710_A792PrvMetTra ;
   private boolean[] T002710_n792PrvMetTra ;
   private String[] T002710_A783PrvCta ;
   private boolean[] T002710_n783PrvCta ;
   private String[] T002710_A3092PrvDivCod ;
   private boolean[] T002710_n3092PrvDivCod ;
   private String[] T002710_A3144PrvDivAbr ;
   private boolean[] T002710_n3144PrvDivAbr ;
   private String[] T002710_A3314PrvCar ;
   private boolean[] T002710_n3314PrvCar ;
   private String[] T002710_A6075PrvCp2 ;
   private boolean[] T002710_n6075PrvCp2 ;
   private String[] T002710_A6076PrvFax ;
   private boolean[] T002710_n6076PrvFax ;
   private String[] T002710_A6077PrvMail ;
   private boolean[] T002710_n6077PrvMail ;
   private String[] T002710_A6570PrvNom2 ;
   private boolean[] T002710_n6570PrvNom2 ;
   private String[] T002710_A6571PrvDir2 ;
   private boolean[] T002710_n6571PrvDir2 ;
   private java.math.BigDecimal[] T002710_A8160PrvDtoPP ;
   private boolean[] T002710_n8160PrvDtoPP ;
   private String[] T002710_A9729Des_Clas ;
   private boolean[] T002710_n9729Des_Clas ;
   private String[] T002710_A10123GpoEcoNom ;
   private boolean[] T002710_n10123GpoEcoNom ;
   private String[] T002710_A13585PrvTipo ;
   private boolean[] T002710_n13585PrvTipo ;
   private String[] T002710_A14031PrvClasDsc ;
   private String[] T002710_A14216PrvAct ;
   private String[] T002710_A14417PrvNac ;
   private String[] T002710_A396EmprCod ;
   private String[] T002710_A497FpgCod ;
   private boolean[] T002710_n497FpgCod ;
   private short[] T002710_A9728Cod_Clas ;
   private boolean[] T002710_n9728Cod_Clas ;
   private int[] T002710_A10122GpoEcoCod ;
   private boolean[] T002710_n10122GpoEcoCod ;
   private short[] T002710_A14030PrvClasID ;
   private boolean[] T002710_n14030PrvClasID ;
   private byte[] T002710_A3143PrvDivCo ;
   private String[] T002711_A407EmprNom ;
   private boolean[] T002711_n407EmprNom ;
   private String[] T002712_A498FpgDsc ;
   private boolean[] T002712_n498FpgDsc ;
   private String[] T002713_A9729Des_Clas ;
   private boolean[] T002713_n9729Des_Clas ;
   private String[] T002714_A10123GpoEcoNom ;
   private boolean[] T002714_n10123GpoEcoNom ;
   private String[] T002715_A14031PrvClasDsc ;
   private String[] T002716_A3144PrvDivAbr ;
   private boolean[] T002716_n3144PrvDivAbr ;
   private String[] T002717_A396EmprCod ;
   private int[] T002717_A795PrvNum ;
   private boolean[] T002717_n795PrvNum ;
   private String[] T00273_A6572PrvContac ;
   private boolean[] T00273_n6572PrvContac ;
   private int[] T00273_A795PrvNum ;
   private boolean[] T00273_n795PrvNum ;
   private String[] T00273_A794PrvNom ;
   private boolean[] T00273_n794PrvNom ;
   private String[] T00273_A786PrvDir ;
   private boolean[] T00273_n786PrvDir ;
   private String[] T00273_A782PrvCpo ;
   private boolean[] T00273_n782PrvCpo ;
   private String[] T00273_A799PrvPob ;
   private boolean[] T00273_n799PrvPob ;
   private String[] T00273_A793PrvNif ;
   private boolean[] T00273_n793PrvNif ;
   private String[] T00273_A803PrvTlf ;
   private boolean[] T00273_n803PrvTlf ;
   private byte[] T00273_A800PrvPri ;
   private boolean[] T00273_n800PrvPri ;
   private String[] T00273_A804PrvTlx ;
   private boolean[] T00273_n804PrvTlx ;
   private String[] T00273_A802PrvTip ;
   private boolean[] T00273_n802PrvTip ;
   private byte[] T00273_A805PrvVto ;
   private boolean[] T00273_n805PrvVto ;
   private int[] T00273_A785PrvDiaPag ;
   private boolean[] T00273_n785PrvDiaPag ;
   private int[] T00273_A797PrvPer ;
   private boolean[] T00273_n797PrvPer ;
   private int[] T00273_A780PrvBan ;
   private boolean[] T00273_n780PrvBan ;
   private String[] T00273_A801PrvRep ;
   private boolean[] T00273_n801PrvRep ;
   private short[] T00273_A798PrvPlaEnt ;
   private boolean[] T00273_n798PrvPlaEnt ;
   private String[] T00273_A792PrvMetTra ;
   private boolean[] T00273_n792PrvMetTra ;
   private String[] T00273_A783PrvCta ;
   private boolean[] T00273_n783PrvCta ;
   private String[] T00273_A3092PrvDivCod ;
   private boolean[] T00273_n3092PrvDivCod ;
   private String[] T00273_A3314PrvCar ;
   private boolean[] T00273_n3314PrvCar ;
   private String[] T00273_A6075PrvCp2 ;
   private boolean[] T00273_n6075PrvCp2 ;
   private String[] T00273_A6076PrvFax ;
   private boolean[] T00273_n6076PrvFax ;
   private String[] T00273_A6077PrvMail ;
   private boolean[] T00273_n6077PrvMail ;
   private String[] T00273_A6570PrvNom2 ;
   private boolean[] T00273_n6570PrvNom2 ;
   private String[] T00273_A6571PrvDir2 ;
   private boolean[] T00273_n6571PrvDir2 ;
   private java.math.BigDecimal[] T00273_A8160PrvDtoPP ;
   private boolean[] T00273_n8160PrvDtoPP ;
   private String[] T00273_A13585PrvTipo ;
   private boolean[] T00273_n13585PrvTipo ;
   private String[] T00273_A14216PrvAct ;
   private String[] T00273_A14417PrvNac ;
   private String[] T00273_A396EmprCod ;
   private String[] T00273_A497FpgCod ;
   private boolean[] T00273_n497FpgCod ;
   private short[] T00273_A9728Cod_Clas ;
   private boolean[] T00273_n9728Cod_Clas ;
   private int[] T00273_A10122GpoEcoCod ;
   private boolean[] T00273_n10122GpoEcoCod ;
   private short[] T00273_A14030PrvClasID ;
   private boolean[] T00273_n14030PrvClasID ;
   private byte[] T00273_A3143PrvDivCo ;
   private String[] T002718_A396EmprCod ;
   private int[] T002718_A795PrvNum ;
   private boolean[] T002718_n795PrvNum ;
   private String[] T002719_A396EmprCod ;
   private int[] T002719_A795PrvNum ;
   private boolean[] T002719_n795PrvNum ;
   private String[] T00272_A6572PrvContac ;
   private boolean[] T00272_n6572PrvContac ;
   private int[] T00272_A795PrvNum ;
   private boolean[] T00272_n795PrvNum ;
   private String[] T00272_A794PrvNom ;
   private boolean[] T00272_n794PrvNom ;
   private String[] T00272_A786PrvDir ;
   private boolean[] T00272_n786PrvDir ;
   private String[] T00272_A782PrvCpo ;
   private boolean[] T00272_n782PrvCpo ;
   private String[] T00272_A799PrvPob ;
   private boolean[] T00272_n799PrvPob ;
   private String[] T00272_A793PrvNif ;
   private boolean[] T00272_n793PrvNif ;
   private String[] T00272_A803PrvTlf ;
   private boolean[] T00272_n803PrvTlf ;
   private byte[] T00272_A800PrvPri ;
   private boolean[] T00272_n800PrvPri ;
   private String[] T00272_A804PrvTlx ;
   private boolean[] T00272_n804PrvTlx ;
   private String[] T00272_A802PrvTip ;
   private boolean[] T00272_n802PrvTip ;
   private byte[] T00272_A805PrvVto ;
   private boolean[] T00272_n805PrvVto ;
   private int[] T00272_A785PrvDiaPag ;
   private boolean[] T00272_n785PrvDiaPag ;
   private int[] T00272_A797PrvPer ;
   private boolean[] T00272_n797PrvPer ;
   private int[] T00272_A780PrvBan ;
   private boolean[] T00272_n780PrvBan ;
   private String[] T00272_A801PrvRep ;
   private boolean[] T00272_n801PrvRep ;
   private short[] T00272_A798PrvPlaEnt ;
   private boolean[] T00272_n798PrvPlaEnt ;
   private String[] T00272_A792PrvMetTra ;
   private boolean[] T00272_n792PrvMetTra ;
   private String[] T00272_A783PrvCta ;
   private boolean[] T00272_n783PrvCta ;
   private String[] T00272_A3092PrvDivCod ;
   private boolean[] T00272_n3092PrvDivCod ;
   private String[] T00272_A3314PrvCar ;
   private boolean[] T00272_n3314PrvCar ;
   private String[] T00272_A6075PrvCp2 ;
   private boolean[] T00272_n6075PrvCp2 ;
   private String[] T00272_A6076PrvFax ;
   private boolean[] T00272_n6076PrvFax ;
   private String[] T00272_A6077PrvMail ;
   private boolean[] T00272_n6077PrvMail ;
   private String[] T00272_A6570PrvNom2 ;
   private boolean[] T00272_n6570PrvNom2 ;
   private String[] T00272_A6571PrvDir2 ;
   private boolean[] T00272_n6571PrvDir2 ;
   private java.math.BigDecimal[] T00272_A8160PrvDtoPP ;
   private boolean[] T00272_n8160PrvDtoPP ;
   private String[] T00272_A13585PrvTipo ;
   private boolean[] T00272_n13585PrvTipo ;
   private String[] T00272_A14216PrvAct ;
   private String[] T00272_A14417PrvNac ;
   private String[] T00272_A396EmprCod ;
   private String[] T00272_A497FpgCod ;
   private boolean[] T00272_n497FpgCod ;
   private short[] T00272_A9728Cod_Clas ;
   private boolean[] T00272_n9728Cod_Clas ;
   private int[] T00272_A10122GpoEcoCod ;
   private boolean[] T00272_n10122GpoEcoCod ;
   private short[] T00272_A14030PrvClasID ;
   private boolean[] T00272_n14030PrvClasID ;
   private byte[] T00272_A3143PrvDivCo ;
   private String[] T002723_A407EmprNom ;
   private boolean[] T002723_n407EmprNom ;
   private String[] T002724_A498FpgDsc ;
   private boolean[] T002724_n498FpgDsc ;
   private String[] T002725_A3144PrvDivAbr ;
   private boolean[] T002725_n3144PrvDivAbr ;
   private String[] T002726_A9729Des_Clas ;
   private boolean[] T002726_n9729Des_Clas ;
   private String[] T002727_A10123GpoEcoNom ;
   private boolean[] T002727_n10123GpoEcoNom ;
   private String[] T002728_A14031PrvClasDsc ;
   private String[] T002729_A396EmprCod ;
   private int[] T002729_A13418AlbProID ;
   private String[] T002730_A396EmprCod ;
   private long[] T002730_A12205OrdenCID ;
   private String[] T002731_A396EmprCod ;
   private int[] T002731_A9492MRCod ;
   private int[] T002731_A795PrvNum ;
   private boolean[] T002731_n795PrvNum ;
   private String[] T002732_A396EmprCod ;
   private long[] T002732_A11055MComCod ;
   private String[] T002733_A396EmprCod ;
   private int[] T002733_A9412MMSCod ;
   private String[] T002734_A396EmprCod ;
   private int[] T002734_A795PrvNum ;
   private boolean[] T002734_n795PrvNum ;
   private short[] T002734_A6146PrvPAny ;
   private String[] T002734_A6147PrvPPr ;
   private String[] T002735_A396EmprCod ;
   private int[] T002735_A1387AlbPrvCod ;
   private String[] T002736_A396EmprCod ;
   private int[] T002736_A795PrvNum ;
   private boolean[] T002736_n795PrvNum ;
   private short[] T002736_A779PrvAny ;
   private String[] T002737_A396EmprCod ;
   private int[] T002737_A658PedCod ;
   private String[] T002738_A396EmprCod ;
   private String[] T002738_A719PrdNum ;
   private String[] T002739_A396EmprCod ;
   private int[] T002739_A795PrvNum ;
   private boolean[] T002739_n795PrvNum ;
   private byte[] T002740_A3099DivCod ;
   private String[] T002740_A3101DivAbr ;
   private boolean[] T002740_n3101DivAbr ;
   private String[] T002741_A396EmprCod ;
   private int[] T002741_A10122GpoEcoCod ;
   private boolean[] T002741_n10122GpoEcoCod ;
   private String[] T002741_A10123GpoEcoNom ;
   private boolean[] T002741_n10123GpoEcoNom ;
   private byte[] T002742_A3099DivCod ;
   private String[] T002742_A3101DivAbr ;
   private boolean[] T002742_n3101DivAbr ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV71FpgCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV76Cod_Clas_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV78PrvClasID_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV74DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV61TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV67TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV60WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tprvgen__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprvgen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprvgen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprvgen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprvgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00272", "SELECT PrvContac, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvDtoPP, PrvTipo, PrvAct, PrvNac, EmprCod, FpgCod, Cod_Clas, GpoEcoCod, PrvClasID, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ?  FOR UPDATE OF PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvContac, PrvDtoPP, PrvTipo, PrvAct, PrvNac, FpgCod, Cod_Clas, GpoEcoCod, PrvClasID, PrvDivCo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00273", "SELECT PrvContac, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvDtoPP, PrvTipo, PrvAct, PrvNac, EmprCod, FpgCod, Cod_Clas, GpoEcoCod, PrvClasID, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00274", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00275", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00276", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00277", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00278", "SELECT PrvClasDsc FROM TXPCLAPRV WHERE EmprCod = ? AND PrvClasID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00279", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002710", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrvContac, TM1.PrvNum, T2.EmprNom, TM1.PrvNom, TM1.PrvDir, TM1.PrvCpo, TM1.PrvPob, TM1.PrvNif, TM1.PrvTlf, TM1.PrvPri, TM1.PrvTlx, TM1.PrvTip, T3.FpgDsc, TM1.PrvVto, TM1.PrvDiaPag, TM1.PrvPer, TM1.PrvBan, TM1.PrvRep, TM1.PrvPlaEnt, TM1.PrvMetTra, TM1.PrvCta, TM1.PrvDivCod, T4.DivAbr AS PrvDivAbr, TM1.PrvCar, TM1.PrvCp2, TM1.PrvFax, TM1.PrvMail, TM1.PrvNom2, TM1.PrvDir2, TM1.PrvDtoPP, T5.Des_Clas, T6.GpoEcoNom, TM1.PrvTipo, T7.PrvClasDsc, TM1.PrvAct, TM1.PrvNac, TM1.EmprCod, TM1.FpgCod, TM1.Cod_Clas, TM1.GpoEcoCod, TM1.PrvClasID, TM1.PrvDivCo AS PrvDivCo FROM ((((((TXPPRVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPFORPAG T3 ON T3.EmprCod = TM1.EmprCod AND T3.FpgCod = TM1.FpgCod) INNER JOIN TXPDIVISA T4 ON T4.DivCod = TM1.PrvDivCo) LEFT JOIN TXPISOTB1 T5 ON T5.EmprCod = TM1.EmprCod AND T5.Cod_Clas = TM1.Cod_Clas) LEFT JOIN TXPGPOECO T6 ON T6.EmprCod = TM1.EmprCod AND T6.GpoEcoCod = TM1.GpoEcoCod) LEFT JOIN TXPCLAPRV T7 ON T7.EmprCod = TM1.EmprCod AND T7.PrvClasID = TM1.PrvClasID) WHERE TM1.EmprCod = ? and TM1.PrvNum = ? ORDER BY TM1.EmprCod, TM1.PrvNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002711", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002712", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002713", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002714", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002715", "SELECT PrvClasDsc FROM TXPCLAPRV WHERE EmprCod = ? AND PrvClasID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002716", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002717", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002718", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE ( EmprCod > ? or EmprCod = ? and PrvNum > ?) ORDER BY EmprCod, PrvNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002719", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE ( EmprCod < ? or EmprCod = ? and PrvNum < ?) ORDER BY EmprCod DESC, PrvNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002720", "INSERT INTO TXPPRVGEN(PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvContac, PrvDtoPP, PrvTipo, PrvAct, PrvNac, EmprCod, FpgCod, Cod_Clas, GpoEcoCod, PrvClasID, PrvDivCo, PrvDiaPgA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPPRVGEN")
         ,new UpdateCursor("T002721", "UPDATE TXPPRVGEN SET PrvNom=?, PrvDir=?, PrvCpo=?, PrvPob=?, PrvNif=?, PrvTlf=?, PrvPri=?, PrvTlx=?, PrvTip=?, PrvVto=?, PrvDiaPag=?, PrvPer=?, PrvBan=?, PrvRep=?, PrvPlaEnt=?, PrvMetTra=?, PrvCta=?, PrvDivCod=?, PrvCar=?, PrvCp2=?, PrvFax=?, PrvMail=?, PrvNom2=?, PrvDir2=?, PrvContac=?, PrvDtoPP=?, PrvTipo=?, PrvAct=?, PrvNac=?, FpgCod=?, Cod_Clas=?, GpoEcoCod=?, PrvClasID=?, PrvDivCo=?  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK, "TXPPRVGEN")
         ,new UpdateCursor("T002722", "DELETE FROM TXPPRVGEN  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK, "TXPPRVGEN")
         ,new ForEachCursor("T002723", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002724", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002725", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002726", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002727", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002728", "SELECT PrvClasDsc FROM TXPCLAPRV WHERE EmprCod = ? AND PrvClasID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002729", "SELECT * FROM (SELECT EmprCod, AlbProID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProPrvI = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002730", "SELECT * FROM (SELECT EmprCod, OrdenCID FROM TXPIngQui WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002731", "SELECT * FROM (SELECT EmprCod, MRCod, PrvNum FROM TXPMRepu1 WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002732", "SELECT * FROM (SELECT EmprCod, MComCod FROM TXPMRepCo WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002733", "SELECT * FROM (SELECT EmprCod, MMSCod FROM TXPMMoStk WHERE EmprCod = ? AND MMSPrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002734", "SELECT * FROM (SELECT EmprCod, PrvNum, PrvPAny, PrvPPr FROM TXPPRVESX WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002735", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002736", "SELECT * FROM (SELECT EmprCod, PrvNum, PrvAny FROM TXPCPRVES WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002737", "SELECT * FROM (SELECT EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002738", "SELECT * FROM (SELECT EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002739", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrvNum FROM TXPPRVGEN ORDER BY EmprCod, PrvNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002740", "SELECT DivCod, DivAbr FROM TXPDIVISA ORDER BY DivAbr ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002741", "SELECT EmprCod, GpoEcoCod, GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? ORDER BY GpoEcoNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002742", "SELECT DivCod, DivAbr FROM TXPDIVISA ORDER BY DivAbr ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 18);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 12);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 15);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((String[]) buf[57])[0] = rslt.getString(31, 3);
               ((String[]) buf[58])[0] = rslt.getString(32, 2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(36);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 18);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 12);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 15);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((String[]) buf[57])[0] = rslt.getString(31, 3);
               ((String[]) buf[58])[0] = rslt.getString(32, 2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(36);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 18);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 12);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 15);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 40);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 40);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 40);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 60);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 30);
               ((String[]) buf[66])[0] = rslt.getString(35, 1);
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((String[]) buf[68])[0] = rslt.getString(37, 3);
               ((String[]) buf[69])[0] = rslt.getString(38, 2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(39);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((int[]) buf[73])[0] = rslt.getInt(40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(41);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((byte[]) buf[77])[0] = rslt.getByte(42);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 40 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 18 :
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
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 30);
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
                  stmt.setString(7, (String)parms[13], 18);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 14);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 12);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 6);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 15);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 40);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 40);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(26, (String)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               stmt.setString(29, (String)parms[56], 1);
               stmt.setString(30, (String)parms[57], 1);
               stmt.setString(31, (String)parms[58], 3);
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[64]).intValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[66]).shortValue());
               }
               stmt.setByte(36, ((Number) parms[67]).byteValue());
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 18);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 14);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 12);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 6);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 15);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 40);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(25, (String)parms[49]);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 1);
               }
               stmt.setString(28, (String)parms[54], 1);
               stmt.setString(29, (String)parms[55], 1);
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[61]).intValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[63]).shortValue());
               }
               stmt.setByte(34, ((Number) parms[64]).byteValue());
               stmt.setString(35, (String)parms[65], 3);
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[67]).intValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 23 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

