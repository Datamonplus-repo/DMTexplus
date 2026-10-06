package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mtoformulastinte_procesos_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_1QQ154( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_1QQ154( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1QQ154( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
         AV9ForSer = httpContext.GetPar( "ForSer") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ForSer", AV9ForSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ForSer, ""))));
         AV10ForColNom = httpContext.GetPar( "ForColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNom", AV10ForColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ForColNom, ""))));
         AV11ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11ForColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ForColNum), "ZZZZZ9")));
         AV12TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipColCod), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
         A1160ProForL = (short)(GXutil.lval( httpContext.GetPar( "ProForL"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_1QQ154( AV7EmprCod, AV8CliCod, AV9ForSer, AV10ForColNom, AV11ForColNum, AV12TipColCod, A1160ProForL) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_37( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_39( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
         gxload_38( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_40( A396EmprCod, A831TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_42( A396EmprCod, A764ProForCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_procesos") == 0 )
      {
         gxnrgridlevel_procesos_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
            AV9ForSer = httpContext.GetPar( "ForSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ForSer", AV9ForSer);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ForSer, ""))));
            AV10ForColNom = httpContext.GetPar( "ForColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNom", AV10ForColNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ForColNom, ""))));
            AV11ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11ForColNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ForColNum), "ZZZZZ9")));
            AV12TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipColCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mto Formulas Tinte (Procesos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_procesos_newrow_invoke( )
   {
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
      A2838ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
      n2838ForRelBan = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_procesos_newrow( ) ;
      /* End function gxnrGridlevel_procesos_newrow_invoke */
   }

   public mtoformulastinte_procesos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mtoformulastinte_procesos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastinte_procesos_impl.class ));
   }

   public mtoformulastinte_procesos_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbProForFR = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForSer_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipColCod_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtncolorantes_Internalname, "", httpContext.getMessage( "Colorantes", ""), bttBtncolorantes_Jsonclick, 7, httpContext.getMessage( "Colorantes", ""), "", StyleString, ClassString, bttBtncolorantes_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111qq47_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnproductos_Internalname, "", httpContext.getMessage( "Productos (#)", ""), bttBtnproductos_Jsonclick, 7, httpContext.getMessage( "Productos (#)", ""), "", StyleString, ClassString, bttBtnproductos_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121qq47_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobservaciones_Internalname, "", httpContext.getMessage( "Observaciones", ""), bttBtnobservaciones_Jsonclick, 7, httpContext.getMessage( "Observaciones", ""), "", StyleString, ClassString, bttBtnobservaciones_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131qq47_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_procesos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_procesos( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV32Pgmname), GXutil.rtrim( localUtil.format( AV32Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
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
      /* User Defined Control */
      ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
      ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
      ucCombo_proforcod.setProperty("IsGridItem", Combo_proforcod_Isgriditem);
      ucCombo_proforcod.setProperty("EmptyItem", Combo_proforcod_Emptyitem);
      ucCombo_proforcod.setProperty("DropDownOptionsData", AV26ProForCod_Data);
      ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1159ForUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1159ForUltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1159ForUltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltLin_Jsonclick, 0, "Attribute", "", "", "", "", edtForUltLin_Visible, edtForUltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtForSerDsc_Visible, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinte_Procesos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_procesos( )
   {
      /*  Grid Control  */
      startgridcontrol59( ) ;
      nGXsfl_59_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount154 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_154 = (short)(1) ;
            scanStart1QQ154( ) ;
            while ( RcdFound154 != 0 )
            {
               init_level_properties154( ) ;
               getByPrimaryKey1QQ154( ) ;
               addRow1QQ154( ) ;
               scanNext1QQ154( ) ;
            }
            scanEnd1QQ154( ) ;
            nBlankRcdCount154 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1QQ154( ) ;
         standaloneModal1QQ154( ) ;
         sMode154 = Gx_mode ;
         while ( nGXsfl_59_idx < nRC_GXsfl_59 )
         {
            bGXsfl_59_Refreshing = true ;
            readRow1QQ154( ) ;
            edtProForL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORL_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            cmbProForFR.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROFORFR_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbProForFR.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProForFR.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            edtProForrbn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORRBN_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForrbn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForrbn_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtProforFabs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORFABS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProforFabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforFabs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtProFoNPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFONPRG_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoNPrg_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            if ( ( nRcdExists_154 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1QQ154( ) ;
            }
            sendRow1QQ154( ) ;
            bGXsfl_59_Refreshing = false ;
         }
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount154 = (short)(2) ;
         nRcdExists_154 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1QQ154( ) ;
            while ( RcdFound154 != 0 )
            {
               sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_59154( ) ;
               init_level_properties154( ) ;
               standaloneNotModal1QQ154( ) ;
               getByPrimaryKey1QQ154( ) ;
               standaloneModal1QQ154( ) ;
               addRow1QQ154( ) ;
               scanNext1QQ154( ) ;
            }
            scanEnd1QQ154( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode154 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_59154( ) ;
         initAll1QQ154( ) ;
         init_level_properties154( ) ;
         nRcdExists_154 = (short)(0) ;
         nIsMod_154 = (short)(0) ;
         nRcdDeleted_154 = (short)(0) ;
         nBlankRcdCount154 = (short)(nBlankRcdUsr154+nBlankRcdCount154) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount154 > 0 )
         {
            standaloneNotModal1QQ154( ) ;
            standaloneModal1QQ154( ) ;
            addRow1QQ154( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtProForL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount154 = (short)(nBlankRcdCount154-1) ;
         }
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_procesosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_procesos", Gridlevel_procesosContainer, subGridlevel_procesos_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_procesosContainerData", Gridlevel_procesosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_procesosContainerData"+"V", Gridlevel_procesosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_procesosContainerData"+"V"+"\" value='"+Gridlevel_procesosContainer.GridValuesHidden()+"'/>") ;
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
      e141QQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV26ProForCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
            Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
            Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5742ForSerDsc = httpContext.cgiGet( "Z5742ForSerDsc") ;
            Z1159ForUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1159ForUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2838ForRelBan = localUtil.ctond( httpContext.cgiGet( "Z2838ForRelBan")) ;
            Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( "Z2838ForRelBan")) ;
            n2838ForRelBan = false ;
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "N486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            AV23FlagModC = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGMODC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22ValCon = (byte)(localUtil.ctol( httpContext.cgiGet( "vVALCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9ForSer = httpContext.cgiGet( "vFORSER") ;
            AV10ForColNom = httpContext.cgiGet( "vFORCOLNOM") ;
            AV11ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "vFORCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Insert_ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "FORNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( "FORRELBAN")) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV20Modif = httpContext.cgiGet( "vMODIF") ;
            A10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13133ProForAct = httpContext.cgiGet( "PROFORACT") ;
            AV16Usurcod = httpContext.cgiGet( "vUSURCOD") ;
            AV17Station = httpContext.cgiGet( "vSTATION") ;
            A9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORVOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9707ProForMq = httpContext.cgiGet( "PROFORMQ") ;
            A766ProForDsc = httpContext.cgiGet( "PROFORDSC") ;
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
            Barradeprogreso_Objectcall = httpContext.cgiGet( "BARRADEPROGRESO_Objectcall") ;
            Barradeprogreso_Class = httpContext.cgiGet( "BARRADEPROGRESO_Class") ;
            Barradeprogreso_Enabled = GXutil.strtobool( httpContext.cgiGet( "BARRADEPROGRESO_Enabled")) ;
            Barradeprogreso_Height = httpContext.cgiGet( "BARRADEPROGRESO_Height") ;
            Barradeprogreso_Width = httpContext.cgiGet( "BARRADEPROGRESO_Width") ;
            Barradeprogreso_Visible = GXutil.strtobool( httpContext.cgiGet( "BARRADEPROGRESO_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforcod_Objectcall = httpContext.cgiGet( "COMBO_PROFORCOD_Objectcall") ;
            Combo_proforcod_Class = httpContext.cgiGet( "COMBO_PROFORCOD_Class") ;
            Combo_proforcod_Icontype = httpContext.cgiGet( "COMBO_PROFORCOD_Icontype") ;
            Combo_proforcod_Icon = httpContext.cgiGet( "COMBO_PROFORCOD_Icon") ;
            Combo_proforcod_Caption = httpContext.cgiGet( "COMBO_PROFORCOD_Caption") ;
            Combo_proforcod_Tooltip = httpContext.cgiGet( "COMBO_PROFORCOD_Tooltip") ;
            Combo_proforcod_Cls = httpContext.cgiGet( "COMBO_PROFORCOD_Cls") ;
            Combo_proforcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_set") ;
            Combo_proforcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_get") ;
            Combo_proforcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_set") ;
            Combo_proforcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_get") ;
            Combo_proforcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORCOD_Gamoauthtoken") ;
            Combo_proforcod_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORCOD_Ddointernalname") ;
            Combo_proforcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolalign") ;
            Combo_proforcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORCOD_Dropdownoptionstype") ;
            Combo_proforcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Enabled")) ;
            Combo_proforcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Visible")) ;
            Combo_proforcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolidtoreplace") ;
            Combo_proforcod_Datalisttype = httpContext.cgiGet( "COMBO_PROFORCOD_Datalisttype") ;
            Combo_proforcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Allowmultipleselection")) ;
            Combo_proforcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistfixedvalues") ;
            Combo_proforcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Isgriditem")) ;
            Combo_proforcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Hasdescription")) ;
            Combo_proforcod_Datalistproc = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistproc") ;
            Combo_proforcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistprocparametersprefix") ;
            Combo_proforcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORCOD_Remoteservicesparameters") ;
            Combo_proforcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeonlyselectedoption")) ;
            Combo_proforcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeselectalloption")) ;
            Combo_proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitem")) ;
            Combo_proforcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeaddnewoption")) ;
            Combo_proforcod_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORCOD_Htmltemplate") ;
            Combo_proforcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluestype") ;
            Combo_proforcod_Loadingdata = httpContext.cgiGet( "COMBO_PROFORCOD_Loadingdata") ;
            Combo_proforcod_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORCOD_Noresultsfound") ;
            Combo_proforcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitemtext") ;
            Combo_proforcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Onlyselectedvalues") ;
            Combo_proforcod_Selectalltext = httpContext.cgiGet( "COMBO_PROFORCOD_Selectalltext") ;
            Combo_proforcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluesseparator") ;
            Combo_proforcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORULTLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForUltLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1159ForUltLin = (short)(0) ;
               n1159ForUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
            }
            else
            {
               A1159ForUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1159ForUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
            }
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MtoFormulasTinte_Procesos");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
            forbiddenHiddens.add("ForSerDsc", GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")));
            forbiddenHiddens.add("ForRelBan", localUtil.format( A2838ForRelBan, "ZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\mtoformulastinte_procesos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = httpContext.GetPar( "ForSer") ;
               n494ForSer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               n482ForColNom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
                  sMode47 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode47 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound47 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1QQ0( ) ;
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
                        e141QQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e151QQ2 ();
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
         e151QQ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1QQ47( ) ;
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
         disableAttributes1QQ47( ) ;
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

   public void confirm_1QQ0( )
   {
      beforeValidate1QQ47( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1QQ47( ) ;
         }
         else
         {
            checkExtendedTable1QQ47( ) ;
            closeExtendedTableCursors1QQ47( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_1QQ154( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode47 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1QQ154( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1QQ154( ) ;
         if ( ( nRcdExists_154 != 0 ) || ( nIsMod_154 != 0 ) )
         {
            getKey1QQ154( ) ;
            if ( ( nRcdExists_154 == 0 ) && ( nRcdDeleted_154 == 0 ) )
            {
               if ( RcdFound154 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1QQ154( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1QQ154( ) ;
                     closeExtendedTableCursors1QQ154( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROFORL_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound154 != 0 )
               {
                  if ( nRcdDeleted_154 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1QQ154( ) ;
                     load1QQ154( ) ;
                     beforeValidate1QQ154( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1QQ154( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_154 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1QQ154( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1QQ154( ) ;
                           closeExtendedTableCursors1QQ154( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_154 == 0 )
                  {
                     GXCCtl = "PROFORL_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForL_Internalname, GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( cmbProForFR.getInternalname(), GXutil.rtrim( A6549ProForFR)) ;
         httpContext.changePostValue( edtProForrbn_Internalname, GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProforFabs_Internalname, GXutil.ltrim( localUtil.ntoc( A14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoNPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1160ProForL_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8656ProForrbn_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10542ProForH2O_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6549ProForFR_"+sGXsfl_59_idx, GXutil.rtrim( Z6549ProForFR)) ;
         httpContext.changePostValue( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9704ProForVol_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9707ProForMq_"+sGXsfl_59_idx, GXutil.rtrim( Z9707ProForMq)) ;
         httpContext.changePostValue( "ZT_"+"Z14198ProforFabs_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_59_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "T764ProForCod_"+sGXsfl_59_idx, GXutil.rtrim( O764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_154_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_154_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_154_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_154 != 0 )
         {
            httpContext.changePostValue( "PROFORL_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORFR_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbProForFR.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORRBN_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORFABS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProforFabs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFONPRG_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1QQ0( )
   {
   }

   public void e141QQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = AV7EmprCod ;
      GXv_char2[0] = "030100" ;
      GXv_int3[0] = AV22ValCon ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      mtoformulastinte_procesos_impl.this.AV7EmprCod = GXv_char1[0] ;
      mtoformulastinte_procesos_impl.this.AV22ValCon = (byte)((byte)(GXv_int3[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV22ValCon", GXutil.str( AV22ValCon, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22ValCon), "9")));
      GXt_int4 = AV24Carvitin ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int5) ;
      mtoformulastinte_procesos_impl.this.GXt_int4 = GXv_int5[0] ;
      AV24Carvitin = GXt_int4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Carvitin", GXutil.str( AV24Carvitin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Carvitin), "9")));
      GXt_char6 = AV17Station ;
      GXv_char2[0] = GXt_char6 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mtoformulastinte_procesos_impl.this.GXt_char6 = GXv_char2[0] ;
      AV17Station = GXt_char6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Station, ""))));
      GXv_char2[0] = AV7EmprCod ;
      GXv_char1[0] = AV25EmprNom ;
      GXv_char7[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char1, GXv_char7) ;
      mtoformulastinte_procesos_impl.this.AV7EmprCod = GXv_char2[0] ;
      mtoformulastinte_procesos_impl.this.AV25EmprNom = GXv_char1[0] ;
      mtoformulastinte_procesos_impl.this.AV16Usurcod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
      GXt_int4 = (byte)(AV31MForEq) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MFOREQ", ""), GXv_int5) ;
      mtoformulastinte_procesos_impl.this.GXt_int4 = GXv_int5[0] ;
      AV31MForEq = GXt_int4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31MForEq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MForEq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31MForEq), "ZZZ9")));
      GXt_char6 = AV17Station ;
      GXv_char7[0] = GXt_char6 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char7) ;
      mtoformulastinte_procesos_impl.this.GXt_char6 = GXv_char7[0] ;
      AV17Station = GXt_char6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Station, ""))));
      GXv_char7[0] = AV7EmprCod ;
      GXv_char2[0] = AV25EmprNom ;
      GXv_char1[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char7, GXv_char2, GXv_char1) ;
      mtoformulastinte_procesos_impl.this.AV7EmprCod = GXv_char7[0] ;
      mtoformulastinte_procesos_impl.this.AV25EmprNom = GXv_char2[0] ;
      mtoformulastinte_procesos_impl.this.AV16Usurcod = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
      GXv_SdtWWPContext8[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV13WWPContext = GXv_SdtWWPContext8[0] ;
      divUnnamedtable2_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      Combo_proforcod_Titlecontrolidtoreplace = edtProForCod_Internalname ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "TitleControlIdToReplace", Combo_proforcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPROFORCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV14TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV32Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV34GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         while ( AV34GXV1 <= AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV34GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForNumCol") == 0 )
            {
               AV18Insert_ForNumCol = (int)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Insert_ForNumCol), 8, 0));
            }
            AV34GXV1 = (int)(AV34GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      edtForUltLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLin_Visible), 5, 0), true);
      edtForSerDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), true);
   }

   public void e151QQ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV14TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.formulaciontinte.mtoformulastinte_procesosww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, "", "") ;
      if ( AV31MForEq == 1 )
      {
         System.out.println( httpContext.getMessage( "go PMFOREQ", "") );
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char2[0] = A494ForSer ;
         GXv_char1[0] = A482ForColNom ;
         GXv_int9[0] = A483ForColNum ;
         GXv_int5[0] = A831TipColCod ;
         new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char2, GXv_char1, GXv_int9, GXv_int5) ;
         mtoformulastinte_procesos_impl.this.A396EmprCod = GXv_char7[0] ;
         mtoformulastinte_procesos_impl.this.A252CliCod = GXv_int3[0] ;
         mtoformulastinte_procesos_impl.this.A494ForSer = GXv_char2[0] ;
         mtoformulastinte_procesos_impl.this.A482ForColNom = GXv_char1[0] ;
         mtoformulastinte_procesos_impl.this.A483ForColNum = GXv_int9[0] ;
         mtoformulastinte_procesos_impl.this.A831TipColCod = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         System.out.println( httpContext.getMessage( "return PMFOREQ", "") );
      }
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, "", "") ;
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char7[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char2[0] = A494ForSer ;
      GXv_char1[0] = A482ForColNom ;
      GXv_int3[0] = A483ForColNum ;
      GXv_int5[0] = A831TipColCod ;
      GXv_decimal10[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int11[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
      GXv_char12[0] = " " ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_char2, GXv_char1, GXv_int3, GXv_int5, GXv_decimal10, GXv_int11, GXv_char12, GXv_decimal13) ;
      mtoformulastinte_procesos_impl.this.A396EmprCod = GXv_char7[0] ;
      mtoformulastinte_procesos_impl.this.A252CliCod = GXv_int9[0] ;
      mtoformulastinte_procesos_impl.this.A494ForSer = GXv_char2[0] ;
      mtoformulastinte_procesos_impl.this.A482ForColNom = GXv_char1[0] ;
      mtoformulastinte_procesos_impl.this.A483ForColNum = GXv_int3[0] ;
      mtoformulastinte_procesos_impl.this.A831TipColCod = GXv_int5[0] ;
      mtoformulastinte_procesos_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int11[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORRELBAN", getSecureSignedToken( "", localUtil.format( A2838ForRelBan, "ZZZ9.99")));
      GXv_char12[0] = A396EmprCod ;
      GXv_char7[0] = AV17Station ;
      GXv_decimal13[0] = AV30Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char12, GXv_char7, GXv_decimal13) ;
      mtoformulastinte_procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      mtoformulastinte_procesos_impl.this.AV17Station = GXv_char7[0] ;
      mtoformulastinte_procesos_impl.this.AV30Valor_cor = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Station, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Valor_cor", GXutil.ltrimstr( AV30Valor_cor, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV30Valor_cor, "ZZZZ9.99999")));
      GXv_char12[0] = A396EmprCod ;
      GXv_int11[0] = A252CliCod ;
      GXv_char7[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int9[0] = A483ForColNum ;
      GXv_int5[0] = A831TipColCod ;
      GXv_decimal13[0] = AV30Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_char7, GXv_char2, GXv_int9, GXv_int5, GXv_decimal13) ;
      mtoformulastinte_procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      mtoformulastinte_procesos_impl.this.A252CliCod = GXv_int11[0] ;
      mtoformulastinte_procesos_impl.this.A494ForSer = GXv_char7[0] ;
      mtoformulastinte_procesos_impl.this.A482ForColNom = GXv_char2[0] ;
      mtoformulastinte_procesos_impl.this.A483ForColNum = GXv_int9[0] ;
      mtoformulastinte_procesos_impl.this.A831TipColCod = GXv_int5[0] ;
      mtoformulastinte_procesos_impl.this.AV30Valor_cor = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Valor_cor", GXutil.ltrimstr( AV30Valor_cor, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV30Valor_cor, "ZZZZ9.99999")));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV30Valor_cor, 11, 5) );
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==AV24Carvitin) )
      {
         httpContext.popup(formatLink("app.formulaciontinte.tobsfor", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV14TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.mtoformulastinte_procesosww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV26ProForCod_Data ;
      GXv_char12[0] = AV27ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.formulaciontinte.mtoformulastinte_procesosloaddvcombo(remoteHandle, context).execute( "ProForCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ForSer, AV10ForColNom, AV11ForColNum, AV12TipColCod, GXv_char12, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      mtoformulastinte_procesos_impl.this.AV27ComboSelectedValue = GXv_char12[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV26ProForCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   }

   public void zm1QQ47( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5742ForSerDsc = T01QQ6_A5742ForSerDsc[0] ;
            Z1159ForUltLin = T01QQ6_A1159ForUltLin[0] ;
            Z2838ForRelBan = T01QQ6_A2838ForRelBan[0] ;
            Z486ForNumCol = T01QQ6_A486ForNumCol[0] ;
         }
         else
         {
            Z5742ForSerDsc = A5742ForSerDsc ;
            Z1159ForUltLin = A1159ForUltLin ;
            Z2838ForRelBan = A2838ForRelBan ;
            Z486ForNumCol = A486ForNumCol ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z5742ForSerDsc = A5742ForSerDsc ;
         Z1159ForUltLin = A1159ForUltLin ;
         Z2838ForRelBan = A2838ForRelBan ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      AV32Pgmname = "FormulacionTinte.MtoFormulasTinte_Procesos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ForSer)==0) )
      {
         A494ForSer = AV9ForSer ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      }
      if ( ! (GXutil.strcmp("", AV10ForColNom)==0) )
      {
         A482ForColNom = AV10ForColNom ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      }
      if ( ! (0==AV11ForColNum) )
      {
         A483ForColNum = AV11ForColNum ;
         n483ForColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      }
      if ( ! (0==AV12TipColCod) )
      {
         A831TipColCod = AV12TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_ForNumCol) )
      {
         A486ForNumCol = AV18Insert_ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
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
         /* Using cursor T01QQ7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T01QQ7_A407EmprNom[0] ;
         n407EmprNom = T01QQ7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T01QQ8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01QQ8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(6);
      }
   }

   public void load1QQ47( )
   {
      /* Using cursor T01QQ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A407EmprNom = T01QQ11_A407EmprNom[0] ;
         n407EmprNom = T01QQ11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01QQ11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5742ForSerDsc = T01QQ11_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01QQ11_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A1159ForUltLin = T01QQ11_A1159ForUltLin[0] ;
         n1159ForUltLin = T01QQ11_n1159ForUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         A2838ForRelBan = T01QQ11_A2838ForRelBan[0] ;
         n2838ForRelBan = T01QQ11_n2838ForRelBan[0] ;
         A486ForNumCol = T01QQ11_A486ForNumCol[0] ;
         zm1QQ47( -36) ;
      }
      pr_default.close(9);
      onLoadActions1QQ47( ) ;
   }

   public void onLoadActions1QQ47( )
   {
   }

   public void checkExtendedTable1QQ47( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01QQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QQ7_A407EmprNom[0] ;
      n407EmprNom = T01QQ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01QQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T01QQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01QQ8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T01QQ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1QQ47( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_37( String A396EmprCod )
   {
      /* Using cursor T01QQ12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QQ12_A407EmprNom[0] ;
      n407EmprNom = T01QQ12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_39( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T01QQ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_38( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01QQ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01QQ14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_40( String A396EmprCod ,
                          byte A831TipColCod )
   {
      /* Using cursor T01QQ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1QQ47( )
   {
      /* Using cursor T01QQ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1QQ47( 36) ;
         RcdFound47 = (short)(1) ;
         A494ForSer = T01QQ6_A494ForSer[0] ;
         n494ForSer = T01QQ6_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01QQ6_A482ForColNom[0] ;
         n482ForColNom = T01QQ6_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01QQ6_A483ForColNum[0] ;
         n483ForColNum = T01QQ6_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A5742ForSerDsc = T01QQ6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01QQ6_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A1159ForUltLin = T01QQ6_A1159ForUltLin[0] ;
         n1159ForUltLin = T01QQ6_n1159ForUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         A2838ForRelBan = T01QQ6_A2838ForRelBan[0] ;
         n2838ForRelBan = T01QQ6_n2838ForRelBan[0] ;
         A396EmprCod = T01QQ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01QQ6_A252CliCod[0] ;
         n252CliCod = T01QQ6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A486ForNumCol = T01QQ6_A486ForNumCol[0] ;
         A831TipColCod = T01QQ6_A831TipColCod[0] ;
         n831TipColCod = T01QQ6_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1QQ47( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1QQ47( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1QQ47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1QQ47( ) ;
      if ( RcdFound47 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T01QQ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ17_A252CliCod[0] < A252CliCod ) || ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ17_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01QQ17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ17_A483ForColNum[0] < A483ForColNum ) || ( T01QQ17_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QQ17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ17_A831TipColCod[0] < A831TipColCod ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ17_A252CliCod[0] > A252CliCod ) || ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ17_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01QQ17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ17_A483ForColNum[0] > A483ForColNum ) || ( T01QQ17_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QQ17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ17_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ17_A831TipColCod[0] > A831TipColCod ) ) )
         {
            A396EmprCod = T01QQ17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01QQ17_A252CliCod[0] ;
            n252CliCod = T01QQ17_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01QQ17_A494ForSer[0] ;
            n494ForSer = T01QQ17_n494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01QQ17_A482ForColNom[0] ;
            n482ForColNom = T01QQ17_n482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01QQ17_A483ForColNum[0] ;
            n483ForColNum = T01QQ17_n483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01QQ17_A831TipColCod[0] ;
            n831TipColCod = T01QQ17_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T01QQ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ18_A252CliCod[0] > A252CliCod ) || ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ18_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01QQ18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ18_A483ForColNum[0] > A483ForColNum ) || ( T01QQ18_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QQ18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ18_A831TipColCod[0] > A831TipColCod ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ18_A252CliCod[0] < A252CliCod ) || ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QQ18_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01QQ18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ18_A483ForColNum[0] < A483ForColNum ) || ( T01QQ18_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QQ18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QQ18_A494ForSer[0], A494ForSer) == 0 ) && ( T01QQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QQ18_A831TipColCod[0] < A831TipColCod ) ) )
         {
            A396EmprCod = T01QQ18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01QQ18_A252CliCod[0] ;
            n252CliCod = T01QQ18_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01QQ18_A494ForSer[0] ;
            n494ForSer = T01QQ18_n494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01QQ18_A482ForColNom[0] ;
            n482ForColNom = T01QQ18_n482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01QQ18_A483ForColNum[0] ;
            n483ForColNum = T01QQ18_n483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01QQ18_A831TipColCod[0] ;
            n831TipColCod = T01QQ18_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QQ47( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QQ47( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound47 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = Z494ForSer ;
               n494ForSer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = Z482ForColNom ;
               n482ForColNom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = Z483ForColNum ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = Z831TipColCod ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1QQ47( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QQ47( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1QQ47( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = Z494ForSer ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = Z482ForColNom ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = Z483ForColNum ;
         n483ForColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = Z831TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1QQ47( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z5742ForSerDsc, T01QQ5_A5742ForSerDsc[0]) != 0 ) || ( Z1159ForUltLin != T01QQ5_A1159ForUltLin[0] ) || ( DecimalUtil.compareTo(Z2838ForRelBan, T01QQ5_A2838ForRelBan[0]) != 0 ) || ( Z486ForNumCol != T01QQ5_A486ForNumCol[0] ) )
         {
            if ( GXutil.strcmp(Z5742ForSerDsc, T01QQ5_A5742ForSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ForSerDsc");
               GXutil.writeLogRaw("Old: ",Z5742ForSerDsc);
               GXutil.writeLogRaw("Current: ",T01QQ5_A5742ForSerDsc[0]);
            }
            if ( Z1159ForUltLin != T01QQ5_A1159ForUltLin[0] )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ForUltLin");
               GXutil.writeLogRaw("Old: ",Z1159ForUltLin);
               GXutil.writeLogRaw("Current: ",T01QQ5_A1159ForUltLin[0]);
            }
            if ( DecimalUtil.compareTo(Z2838ForRelBan, T01QQ5_A2838ForRelBan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ForRelBan");
               GXutil.writeLogRaw("Old: ",Z2838ForRelBan);
               GXutil.writeLogRaw("Current: ",T01QQ5_A2838ForRelBan[0]);
            }
            if ( Z486ForNumCol != T01QQ5_A486ForNumCol[0] )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ForNumCol");
               GXutil.writeLogRaw("Old: ",Z486ForNumCol);
               GXutil.writeLogRaw("Current: ",T01QQ5_A486ForNumCol[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QQ47( )
   {
      beforeValidate1QQ47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QQ47( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QQ47( 0) ;
         checkOptimisticConcurrency1QQ47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QQ47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QQ47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QQ19 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A486ForNumCol), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
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
                        processLevel1QQ47( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1QQ0( ) ;
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
            load1QQ47( ) ;
         }
         endLevel1QQ47( ) ;
      }
      closeExtendedTableCursors1QQ47( ) ;
   }

   public void update1QQ47( )
   {
      beforeValidate1QQ47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QQ47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QQ47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QQ47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QQ47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QQ20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Integer.valueOf(A486ForNumCol), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QQ47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1QQ47( ) ;
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
         endLevel1QQ47( ) ;
      }
      closeExtendedTableCursors1QQ47( ) ;
   }

   public void deferredUpdate1QQ47( )
   {
   }

   public void delete( )
   {
      beforeValidate1QQ47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QQ47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QQ47( ) ;
         afterConfirm1QQ47( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QQ47( ) ;
            if ( AnyError == 0 )
            {
               scanStart1QQ154( ) ;
               while ( RcdFound154 != 0 )
               {
                  getByPrimaryKey1QQ154( ) ;
                  delete1QQ154( ) ;
                  scanNext1QQ154( ) ;
               }
               scanEnd1QQ154( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QQ21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QQ47( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QQ47( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QQ22 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         A407EmprNom = T01QQ22_A407EmprNom[0] ;
         n407EmprNom = T01QQ22_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(20);
         /* Using cursor T01QQ23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01QQ23_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(21);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01QQ24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01QQ25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01QQ26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01QQ27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01QQ28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCACP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01QQ29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORMQPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01QQ30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01QQ31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPDCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01QQ32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01QQ33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01QQ34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01QQ35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01QQ36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01QQ37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void processNestedLevel1QQ154( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1QQ154( ) ;
         if ( ( nRcdExists_154 != 0 ) || ( nIsMod_154 != 0 ) )
         {
            standaloneNotModal1QQ154( ) ;
            getKey1QQ154( ) ;
            if ( ( nRcdExists_154 == 0 ) && ( nRcdDeleted_154 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1QQ154( ) ;
            }
            else
            {
               if ( RcdFound154 != 0 )
               {
                  if ( ( nRcdDeleted_154 != 0 ) && ( nRcdExists_154 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1QQ154( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_154 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1QQ154( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_154 == 0 )
                  {
                     GXCCtl = "PROFORL_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForL_Internalname, GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( cmbProForFR.getInternalname(), GXutil.rtrim( A6549ProForFR)) ;
         httpContext.changePostValue( edtProForrbn_Internalname, GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProforFabs_Internalname, GXutil.ltrim( localUtil.ntoc( A14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoNPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1160ProForL_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8656ProForrbn_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10542ProForH2O_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6549ProForFR_"+sGXsfl_59_idx, GXutil.rtrim( Z6549ProForFR)) ;
         httpContext.changePostValue( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9704ProForVol_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9707ProForMq_"+sGXsfl_59_idx, GXutil.rtrim( Z9707ProForMq)) ;
         httpContext.changePostValue( "ZT_"+"Z14198ProforFabs_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_59_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "T764ProForCod_"+sGXsfl_59_idx, GXutil.rtrim( O764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_154_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_154_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_154_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_154 != 0 )
         {
            httpContext.changePostValue( "PROFORL_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORFR_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbProForFR.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORRBN_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORFABS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProforFabs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFONPRG_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1QQ154( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_154 = (short)(0) ;
      nIsMod_154 = (short)(0) ;
      nRcdDeleted_154 = (short)(0) ;
   }

   public void processLevel1QQ47( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevel1QQ154( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1QQ47( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QQ47( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.mtoformulastinte_procesos");
         if ( AnyError == 0 )
         {
            confirmValues1QQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.mtoformulastinte_procesos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QQ47( )
   {
      /* Scan By routine */
      /* Using cursor T01QQ38 */
      pr_default.execute(36);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A396EmprCod = T01QQ38_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01QQ38_A252CliCod[0] ;
         n252CliCod = T01QQ38_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01QQ38_A494ForSer[0] ;
         n494ForSer = T01QQ38_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01QQ38_A482ForColNom[0] ;
         n482ForColNom = T01QQ38_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01QQ38_A483ForColNum[0] ;
         n483ForColNum = T01QQ38_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01QQ38_A831TipColCod[0] ;
         n831TipColCod = T01QQ38_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QQ47( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A396EmprCod = T01QQ38_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01QQ38_A252CliCod[0] ;
         n252CliCod = T01QQ38_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01QQ38_A494ForSer[0] ;
         n494ForSer = T01QQ38_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01QQ38_A482ForColNom[0] ;
         n482ForColNom = T01QQ38_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01QQ38_A483ForColNum[0] ;
         n483ForColNum = T01QQ38_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01QQ38_A831TipColCod[0] ;
         n831TipColCod = T01QQ38_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void scanEnd1QQ47( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1QQ47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QQ47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QQ47( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QQ47( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QQ47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QQ47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QQ47( )
   {
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLin_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
   }

   public void zm1QQ154( int GX_JID )
   {
      if ( ( GX_JID == 41 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8656ProForrbn = T01QQ3_A8656ProForrbn[0] ;
            Z10542ProForH2O = T01QQ3_A10542ProForH2O[0] ;
            Z6549ProForFR = T01QQ3_A6549ProForFR[0] ;
            Z7802ProFoNPrg = T01QQ3_A7802ProFoNPrg[0] ;
            Z9704ProForVol = T01QQ3_A9704ProForVol[0] ;
            Z9707ProForMq = T01QQ3_A9707ProForMq[0] ;
            Z14198ProforFabs = T01QQ3_A14198ProforFabs[0] ;
            Z764ProForCod = T01QQ3_A764ProForCod[0] ;
         }
         else
         {
            Z8656ProForrbn = A8656ProForrbn ;
            Z10542ProForH2O = A10542ProForH2O ;
            Z6549ProForFR = A6549ProForFR ;
            Z7802ProFoNPrg = A7802ProFoNPrg ;
            Z9704ProForVol = A9704ProForVol ;
            Z9707ProForMq = A9707ProForMq ;
            Z14198ProforFabs = A14198ProforFabs ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -41 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z1160ProForL = A1160ProForL ;
         Z8656ProForrbn = A8656ProForrbn ;
         Z10542ProForH2O = A10542ProForH2O ;
         Z6549ProForFR = A6549ProForFR ;
         Z7802ProFoNPrg = A7802ProFoNPrg ;
         Z9704ProForVol = A9704ProForVol ;
         Z9707ProForMq = A9707ProForMq ;
         Z14198ProforFabs = A14198ProforFabs ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z252CliCod = A252CliCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z13133ProForAct = A13133ProForAct ;
      }
   }

   public void standaloneNotModal1QQ154( )
   {
   }

   public void standaloneModal1QQ154( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8656ProForrbn)==0) && ( Gx_BScreen == 0 ) )
      {
         A8656ProForrbn = A2838ForRelBan ;
      }
      if ( isIns( )  && (0==A10542ProForH2O) && ( Gx_BScreen == 0 ) )
      {
         A10542ProForH2O = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProForL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtProForL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
   }

   public void load1QQ154( )
   {
      /* Using cursor T01QQ39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A8656ProForrbn = T01QQ39_A8656ProForrbn[0] ;
         A10542ProForH2O = T01QQ39_A10542ProForH2O[0] ;
         A766ProForDsc = T01QQ39_A766ProForDsc[0] ;
         A6549ProForFR = T01QQ39_A6549ProForFR[0] ;
         A7802ProFoNPrg = T01QQ39_A7802ProFoNPrg[0] ;
         A9704ProForVol = T01QQ39_A9704ProForVol[0] ;
         A9707ProForMq = T01QQ39_A9707ProForMq[0] ;
         A13133ProForAct = T01QQ39_A13133ProForAct[0] ;
         A14198ProforFabs = T01QQ39_A14198ProforFabs[0] ;
         A764ProForCod = T01QQ39_A764ProForCod[0] ;
         zm1QQ154( -41) ;
      }
      pr_default.close(37);
      onLoadActions1QQ154( ) ;
   }

   public void onLoadActions1QQ154( )
   {
   }

   public void checkExtendedTable1QQ154( )
   {
      nIsDirty_154 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1QQ154( ) ;
      /* Using cursor T01QQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01QQ4_A766ProForDsc[0] ;
      A13133ProForAct = T01QQ4_A13133ProForAct[0] ;
      pr_default.close(2);
      if ( (0==A1160ProForL) )
      {
         GXv_int16[0] = A1160ProForL ;
         new app.getlblineaprocesosquimicos(remoteHandle, context).execute( AV7EmprCod, AV8CliCod, AV9ForSer, AV10ForColNom, AV11ForColNum, AV12TipColCod, GXv_int16) ;
         mtoformulastinte_procesos_impl.this.A1160ProForL = GXv_int16[0] ;
      }
   }

   public void closeExtendedTableCursors1QQ154( )
   {
      pr_default.close(2);
   }

   public void enableDisable1QQ154( )
   {
   }

   public void gxload_42( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T01QQ40 */
      pr_default.execute(38, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01QQ40_A766ProForDsc[0] ;
      A13133ProForAct = T01QQ40_A13133ProForAct[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13133ProForAct))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(38) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(38);
   }

   public void getKey1QQ154( )
   {
      /* Using cursor T01QQ41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound154 = (short)(1) ;
      }
      else
      {
         RcdFound154 = (short)(0) ;
      }
      pr_default.close(39);
   }

   public void getByPrimaryKey1QQ154( )
   {
      /* Using cursor T01QQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QQ154( 41) ;
         RcdFound154 = (short)(1) ;
         initializeNonKey1QQ154( ) ;
         A1160ProForL = T01QQ3_A1160ProForL[0] ;
         A8656ProForrbn = T01QQ3_A8656ProForrbn[0] ;
         A10542ProForH2O = T01QQ3_A10542ProForH2O[0] ;
         A6549ProForFR = T01QQ3_A6549ProForFR[0] ;
         A7802ProFoNPrg = T01QQ3_A7802ProFoNPrg[0] ;
         A9704ProForVol = T01QQ3_A9704ProForVol[0] ;
         A9707ProForMq = T01QQ3_A9707ProForMq[0] ;
         A14198ProforFabs = T01QQ3_A14198ProforFabs[0] ;
         A764ProForCod = T01QQ3_A764ProForCod[0] ;
         O764ProForCod = A764ProForCod ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z1160ProForL = A1160ProForL ;
         sMode154 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1QQ154( ) ;
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound154 = (short)(0) ;
         initializeNonKey1QQ154( ) ;
         sMode154 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1QQ154( ) ;
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1QQ154( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1QQ154( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8656ProForrbn, T01QQ2_A8656ProForrbn[0]) != 0 ) || ( Z10542ProForH2O != T01QQ2_A10542ProForH2O[0] ) || ( GXutil.strcmp(Z6549ProForFR, T01QQ2_A6549ProForFR[0]) != 0 ) || ( Z7802ProFoNPrg != T01QQ2_A7802ProFoNPrg[0] ) || ( Z9704ProForVol != T01QQ2_A9704ProForVol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9707ProForMq, T01QQ2_A9707ProForMq[0]) != 0 ) || ( DecimalUtil.compareTo(Z14198ProforFabs, T01QQ2_A14198ProforFabs[0]) != 0 ) || ( GXutil.strcmp(Z764ProForCod, T01QQ2_A764ProForCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8656ProForrbn, T01QQ2_A8656ProForrbn[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProForrbn");
               GXutil.writeLogRaw("Old: ",Z8656ProForrbn);
               GXutil.writeLogRaw("Current: ",T01QQ2_A8656ProForrbn[0]);
            }
            if ( Z10542ProForH2O != T01QQ2_A10542ProForH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProForH2O");
               GXutil.writeLogRaw("Old: ",Z10542ProForH2O);
               GXutil.writeLogRaw("Current: ",T01QQ2_A10542ProForH2O[0]);
            }
            if ( GXutil.strcmp(Z6549ProForFR, T01QQ2_A6549ProForFR[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProForFR");
               GXutil.writeLogRaw("Old: ",Z6549ProForFR);
               GXutil.writeLogRaw("Current: ",T01QQ2_A6549ProForFR[0]);
            }
            if ( Z7802ProFoNPrg != T01QQ2_A7802ProFoNPrg[0] )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProFoNPrg");
               GXutil.writeLogRaw("Old: ",Z7802ProFoNPrg);
               GXutil.writeLogRaw("Current: ",T01QQ2_A7802ProFoNPrg[0]);
            }
            if ( Z9704ProForVol != T01QQ2_A9704ProForVol[0] )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProForVol");
               GXutil.writeLogRaw("Old: ",Z9704ProForVol);
               GXutil.writeLogRaw("Current: ",T01QQ2_A9704ProForVol[0]);
            }
            if ( GXutil.strcmp(Z9707ProForMq, T01QQ2_A9707ProForMq[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProForMq");
               GXutil.writeLogRaw("Old: ",Z9707ProForMq);
               GXutil.writeLogRaw("Current: ",T01QQ2_A9707ProForMq[0]);
            }
            if ( DecimalUtil.compareTo(Z14198ProforFabs, T01QQ2_A14198ProforFabs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProforFabs");
               GXutil.writeLogRaw("Old: ",Z14198ProforFabs);
               GXutil.writeLogRaw("Current: ",T01QQ2_A14198ProforFabs[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01QQ2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mtoformulastinte_procesos:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01QQ2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QQ154( )
   {
      beforeValidate1QQ154( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QQ154( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QQ154( 0) ;
         checkOptimisticConcurrency1QQ154( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QQ154( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QQ154( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QQ42 */
                  pr_default.execute(40, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A8656ProForrbn, Short.valueOf(A10542ProForH2O), A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), Integer.valueOf(A9704ProForVol), A9707ProForMq, A14198ProforFabs, A396EmprCod, A764ProForCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                  if ( (pr_default.getStatus(40) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        AV20Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV20Modif", AV20Modif);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        AV29Texto_i = httpContext.getMessage( httpContext.getMessage( "Inserta Proceso Quimico ", ""), "") + A764ProForCod + httpContext.getMessage( httpContext.getMessage( " Color ", ""), "") + GXutil.str( A252CliCod, 6, 0) + " " + GXutil.trim( A482ForColNom) + " " + GXutil.str( A483ForColNum, 6, 0) + " " + GXutil.str( A831TipColCod, 2, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV29Texto_i", AV29Texto_i);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV32Pgmname, 1, 10), AV16Usurcod, AV17Station, AV29Texto_i, A486ForNumCol, (byte)(0), "") ;
                     }
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
            load1QQ154( ) ;
         }
         endLevel1QQ154( ) ;
      }
      closeExtendedTableCursors1QQ154( ) ;
   }

   public void update1QQ154( )
   {
      beforeValidate1QQ154( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QQ154( ) ;
      }
      if ( ( nIsMod_154 != 0 ) || ( nIsDirty_154 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1QQ154( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1QQ154( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1QQ154( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01QQ43 */
                     pr_default.execute(41, new Object[] {A8656ProForrbn, Short.valueOf(A10542ProForH2O), A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), Integer.valueOf(A9704ProForVol), A9707ProForMq, A14198ProforFabs, A764ProForCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                     if ( (pr_default.getStatus(41) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFORMU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1QQ154( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( GXutil.strcmp(O764ProForCod, A764ProForCod) != 0 ) && true /* After */ && true /* Level */ )
                        {
                           AV29Texto_i = httpContext.getMessage( httpContext.getMessage( "Cambio Proceso Quimico ", ""), "") + O764ProForCod + httpContext.getMessage( httpContext.getMessage( " a ", ""), "") + A764ProForCod + httpContext.getMessage( httpContext.getMessage( " Color ", ""), "") + GXutil.str( A252CliCod, 6, 0) + " " + GXutil.trim( A482ForColNom) + " " + GXutil.str( A483ForColNum, 6, 0) + " " + GXutil.str( A831TipColCod, 2, 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV29Texto_i", AV29Texto_i);
                        }
                        if ( ( ( GXutil.strcmp(A764ProForCod, O764ProForCod) != 0 ) ) && true /* After */ && true /* Level */ )
                        {
                           AV20Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV20Modif", AV20Modif);
                        }
                        if ( ( GXutil.strcmp(O764ProForCod, A764ProForCod) != 0 ) && true /* After */ && true /* Level */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV32Pgmname, 1, 10), AV16Usurcod, AV17Station, AV29Texto_i, A486ForNumCol, (byte)(0), "") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1QQ154( ) ;
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
            endLevel1QQ154( ) ;
         }
      }
      closeExtendedTableCursors1QQ154( ) ;
   }

   public void deferredUpdate1QQ154( )
   {
   }

   public void delete1QQ154( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QQ154( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QQ154( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QQ154( ) ;
         afterConfirm1QQ154( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QQ154( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QQ44 */
               pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV20Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV20Modif", AV20Modif);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV29Texto_i = httpContext.getMessage( httpContext.getMessage( "Delete Proceso Quimico ", ""), "") + A764ProForCod + httpContext.getMessage( httpContext.getMessage( " Color ", ""), "") + GXutil.str( A252CliCod, 6, 0) + " " + GXutil.trim( A482ForColNom) + " " + GXutil.str( A483ForColNum, 6, 0) + " " + GXutil.str( A831TipColCod, 2, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV29Texto_i", AV29Texto_i);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV32Pgmname, 1, 10), AV16Usurcod, AV17Station, AV29Texto_i, A486ForNumCol, (byte)(0), "") ;
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
      sMode154 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QQ154( ) ;
      Gx_mode = sMode154 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QQ154( )
   {
      standaloneModal1QQ154( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QQ45 */
         pr_default.execute(43, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01QQ45_A766ProForDsc[0] ;
         A13133ProForAct = T01QQ45_A13133ProForAct[0] ;
         pr_default.close(43);
      }
   }

   public void endLevel1QQ154( )
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

   public void scanStart1QQ154( )
   {
      /* Scan By routine */
      /* Using cursor T01QQ46 */
      pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound154 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A1160ProForL = T01QQ46_A1160ProForL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QQ154( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound154 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A1160ProForL = T01QQ46_A1160ProForL[0] ;
      }
   }

   public void scanEnd1QQ154( )
   {
      pr_default.close(44);
   }

   public void afterConfirm1QQ154( )
   {
      /* After Confirm Rules */
      if ( ! ( ( GXutil.strcmp(A6549ProForFR, httpContext.getMessage( "R", "")) == 0 ) || ( GXutil.strcmp(A6549ProForFR, httpContext.getMessage( "F", "")) == 0 ) ) && true /* After */ && true /* Level */ )
      {
         GXCCtl = "PROFORFR_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Dato incorrecto, R=Rb o F=Factor Abs.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProForFR.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(A6549ProForFR, " ") == 0 ) && true /* After */ && true /* Level */ )
      {
         GXCCtl = "PROFORFR_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Dato incorrecto, R=Rb o F=Factor Abs.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProForFR.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( true /* Level */ && ( GXutil.strcmp(A13133ProForAct, httpContext.getMessage( "S", "")) != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso INACTIVO", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1QQ154( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QQ154( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QQ154( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QQ154( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QQ154( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QQ154( )
   {
      edtProForL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbProForFR.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbProForFR.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProForFR.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtProForrbn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForrbn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForrbn_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtProforFabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforFabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforFabs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtProFoNPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoNPrg_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void send_integrity_lvl_hashes1QQ154( )
   {
   }

   public void send_integrity_lvl_hashes1QQ47( )
   {
   }

   public void subsflControlProps_59154( )
   {
      edtProForL_Internalname = "PROFORL_"+sGXsfl_59_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_59_idx ;
      cmbProForFR.setInternalname( "PROFORFR_"+sGXsfl_59_idx );
      edtProForrbn_Internalname = "PROFORRBN_"+sGXsfl_59_idx ;
      edtProforFabs_Internalname = "PROFORFABS_"+sGXsfl_59_idx ;
      edtProFoNPrg_Internalname = "PROFONPRG_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_59154( )
   {
      edtProForL_Internalname = "PROFORL_"+sGXsfl_59_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_59_fel_idx ;
      cmbProForFR.setInternalname( "PROFORFR_"+sGXsfl_59_fel_idx );
      edtProForrbn_Internalname = "PROFORRBN_"+sGXsfl_59_fel_idx ;
      edtProforFabs_Internalname = "PROFORFABS_"+sGXsfl_59_fel_idx ;
      edtProFoNPrg_Internalname = "PROFONPRG_"+sGXsfl_59_fel_idx ;
   }

   public void addRow1QQ154( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_59154( ) ;
      sendRow1QQ154( ) ;
   }

   public void sendRow1QQ154( )
   {
      Gridlevel_procesosRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_procesos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_procesos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_procesos_Class, "") != 0 )
         {
            subGridlevel_procesos_Linesclass = subGridlevel_procesos_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_procesos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_procesos_Backstyle = (byte)(0) ;
         subGridlevel_procesos_Backcolor = subGridlevel_procesos_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_procesos_Class, "") != 0 )
         {
            subGridlevel_procesos_Linesclass = subGridlevel_procesos_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_procesos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_procesos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_procesos_Class, "") != 0 )
         {
            subGridlevel_procesos_Linesclass = subGridlevel_procesos_Class+"Odd" ;
         }
         subGridlevel_procesos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_procesos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_procesos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
         {
            subGridlevel_procesos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_procesos_Class, "") != 0 )
            {
               subGridlevel_procesos_Linesclass = subGridlevel_procesos_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_procesos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_procesos_Class, "") != 0 )
            {
               subGridlevel_procesos_Linesclass = subGridlevel_procesos_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForL_Internalname,GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForL_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      if ( ( cmbProForFR.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "PROFORFR_" + sGXsfl_59_idx ;
         cmbProForFR.setName( GXCCtl );
         cmbProForFR.setWebtags( "" );
         cmbProForFR.addItem("R", httpContext.getMessage( "R", ""), (short)(0));
         cmbProForFR.addItem("F", httpContext.getMessage( "F", ""), (short)(0));
         if ( cmbProForFR.getItemCount() > 0 )
         {
            A6549ProForFR = cmbProForFR.getValidValue(A6549ProForFR) ;
         }
      }
      /* ComboBox */
      Gridlevel_procesosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbProForFR,cmbProForFR.getInternalname(),GXutil.rtrim( A6549ProForFR),Integer.valueOf(1),cmbProForFR.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbProForFR.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbProForFR.setValue( GXutil.rtrim( A6549ProForFR) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProForFR.getInternalname(), "Values", cmbProForFR.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForrbn_Internalname,GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForrbn_Enabled!=0) ? localUtil.format( A8656ProForrbn, "ZZ9.99") : localUtil.format( A8656ProForrbn, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForrbn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForrbn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProforFabs_Internalname,GXutil.ltrim( localUtil.ntoc( A14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProforFabs_Enabled!=0) ? localUtil.format( A14198ProforFabs, "ZZ9.99") : localUtil.format( A14198ProforFabs, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProforFabs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProforFabs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoNPrg_Internalname,GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFoNPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoNPrg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProFoNPrg_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_procesosRow);
      send_integrity_lvl_hashes1QQ154( ) ;
      GXCCtl = "Z1160ProForL_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8656ProForrbn_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10542ProForH2O_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6549ProForFR_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6549ProForFR));
      GXCCtl = "Z7802ProFoNPrg_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9704ProForVol_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9707ProForMq_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9707ProForMq));
      GXCCtl = "Z14198ProforFabs_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "O764ProForCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O764ProForCod));
      GXCCtl = "nRcdDeleted_154_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_154_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_154_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_59_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV14TrnContext);
      }
      GXCCtl = "vMFOREQ_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV31MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "FORRELBAN_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vSTATION_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV17Station));
      GXCCtl = "vVALOR_COR_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV30Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCARVITIN_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV24Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "FORNUMCOL_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vVALCON_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV22ValCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFLAGMODC_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV23FlagModC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLICOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFORSER_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV9ForSer));
      GXCCtl = "vFORCOLNOM_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10ForColNom));
      GXCCtl = "vFORCOLNUM_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV11ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTIPCOLCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV12TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "PROFORH2O_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORL_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFR_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbProForFR.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORRBN_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFABS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProforFabs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFONPRG_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_procesosContainer.AddRow(Gridlevel_procesosRow);
   }

   public void readRow1QQ154( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_59154( ) ;
      edtProForL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORL_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbProForFR.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROFORFR_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtProForrbn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORRBN_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProforFabs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORFABS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoNPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFONPRG_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORL_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForL_Internalname ;
         wbErr = true ;
         A1160ProForL = (short)(0) ;
      }
      else
      {
         A1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      cmbProForFR.setName( cmbProForFR.getInternalname() );
      cmbProForFR.setValue( httpContext.cgiGet( cmbProForFR.getInternalname()) );
      A6549ProForFR = httpContext.cgiGet( cmbProForFR.getInternalname()) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PROFORRBN_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForrbn_Internalname ;
         wbErr = true ;
         A8656ProForrbn = DecimalUtil.ZERO ;
      }
      else
      {
         A8656ProForrbn = localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProforFabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProforFabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PROFORFABS_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProforFabs_Internalname ;
         wbErr = true ;
         A14198ProforFabs = DecimalUtil.ZERO ;
      }
      else
      {
         A14198ProforFabs = localUtil.ctond( httpContext.cgiGet( edtProforFabs_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "PROFONPRG_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoNPrg_Internalname ;
         wbErr = true ;
         A7802ProFoNPrg = 0 ;
      }
      else
      {
         A7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z1160ProForL_" + sGXsfl_59_idx ;
      Z1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8656ProForrbn_" + sGXsfl_59_idx ;
      Z8656ProForrbn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10542ProForH2O_" + sGXsfl_59_idx ;
      Z10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6549ProForFR_" + sGXsfl_59_idx ;
      Z6549ProForFR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7802ProFoNPrg_" + sGXsfl_59_idx ;
      Z7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9704ProForVol_" + sGXsfl_59_idx ;
      Z9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9707ProForMq_" + sGXsfl_59_idx ;
      Z9707ProForMq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14198ProforFabs_" + sGXsfl_59_idx ;
      Z14198ProforFabs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_59_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10542ProForH2O_" + sGXsfl_59_idx ;
      A10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9704ProForVol_" + sGXsfl_59_idx ;
      A9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9707ProForMq_" + sGXsfl_59_idx ;
      A9707ProForMq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O764ProForCod_" + sGXsfl_59_idx ;
      O764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_154_" + sGXsfl_59_idx ;
      nRcdDeleted_154 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_154_" + sGXsfl_59_idx ;
      nRcdExists_154 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_154_" + sGXsfl_59_idx ;
      nIsMod_154 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PROFORH2O_" + sGXsfl_59_idx ;
      A10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProForL_Enabled = edtProForL_Enabled ;
   }

   public void confirmValues1QQ0( )
   {
      nGXsfl_59_idx = 0 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_59154( ) ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_59154( ) ;
         httpContext.changePostValue( "Z1160ProForL_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z1160ProForL_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1160ProForL_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z8656ProForrbn_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8656ProForrbn_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8656ProForrbn_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z10542ProForH2O_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z10542ProForH2O_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10542ProForH2O_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z6549ProForFR_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z6549ProForFR_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6549ProForFR_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z7802ProFoNPrg_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z9704ProForVol_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z9704ProForVol_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9704ProForVol_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z9707ProForMq_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z9707ProForMq_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9707ProForMq_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z14198ProforFabs_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z14198ProforFabs_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14198ProforFabs_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_59_idx) ;
      }
      httpContext.changePostValue( "O764ProForCod", httpContext.cgiGet( "T764ProForCod")) ;
      httpContext.deletePostValue( "T764ProForCod") ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.mtoformulastinte_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ForSer)),GXutil.URLEncode(GXutil.rtrim(AV10ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV11ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12TipColCod,2,0))}, new String[] {"Gx_mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"MtoFormulasTinte_Procesos");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
      forbiddenHiddens.add("ForSerDsc", GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")));
      forbiddenHiddens.add("ForRelBan", localUtil.format( A2838ForRelBan, "ZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mtoformulastinte_procesos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1159ForUltLin", GXutil.ltrim( localUtil.ntoc( Z1159ForUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2838ForRelBan", GXutil.ltrim( localUtil.ntoc( Z2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nGXsfl_59_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N486ForNumCol", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV26ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV26ProForCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV14TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV14TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vMFOREQ", GXutil.ltrim( localUtil.ntoc( AV31MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31MForEq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV30Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV30Valor_cor, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV24Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCON", GXutil.ltrim( localUtil.ntoc( AV22ValCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22ValCon), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODC", GXutil.ltrim( localUtil.ntoc( AV23FlagModC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23FlagModC), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV9ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV10ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV11ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV12TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV18Insert_ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNUMCOL", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORRELBAN", GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORRELBAN", getSecureSignedToken( "", localUtil.format( A2838ForRelBan, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV29Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV20Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORH2O", GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORACT", GXutil.rtrim( A13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV16Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV17Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORVOL", GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMQ", GXutil.rtrim( A9707ProForMq));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC", GXutil.rtrim( A766ProForDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "BARRADEPROGRESO_Objectcall", GXutil.rtrim( Barradeprogreso_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRADEPROGRESO_Enabled", GXutil.booltostr( Barradeprogreso_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Objectcall", GXutil.rtrim( Combo_proforcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Cls", GXutil.rtrim( Combo_proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Enabled", GXutil.booltostr( Combo_proforcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_proforcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Isgriditem", GXutil.booltostr( Combo_proforcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Emptyitem", GXutil.booltostr( Combo_proforcod_Emptyitem));
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
      return formatLink("app.formulaciontinte.mtoformulastinte_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ForSer)),GXutil.URLEncode(GXutil.rtrim(AV10ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV11ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12TipColCod,2,0))}, new String[] {"Gx_mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.MtoFormulasTinte_Procesos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mto Formulas Tinte (Procesos)", "") ;
   }

   public void initializeNonKey1QQ47( )
   {
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A5742ForSerDsc = "" ;
      n5742ForSerDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      A1159ForUltLin = (short)(0) ;
      n1159ForUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
      A2838ForRelBan = DecimalUtil.ZERO ;
      n2838ForRelBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORRELBAN", getSecureSignedToken( "", localUtil.format( A2838ForRelBan, "ZZZ9.99")));
      Z5742ForSerDsc = "" ;
      Z1159ForUltLin = (short)(0) ;
      Z2838ForRelBan = DecimalUtil.ZERO ;
      Z486ForNumCol = 0 ;
   }

   public void initAll1QQ47( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = "" ;
      n494ForSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      A482ForColNom = "" ;
      n482ForColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      A483ForColNum = 0 ;
      n483ForColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      initializeNonKey1QQ47( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1QQ154( )
   {
      AV29Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Texto_i", AV29Texto_i);
      AV20Modif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modif", AV20Modif);
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A6549ProForFR = "" ;
      A7802ProFoNPrg = 0 ;
      A9704ProForVol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9704ProForVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9704ProForVol), 5, 0));
      A9707ProForMq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9707ProForMq", A9707ProForMq);
      A13133ProForAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      A14198ProforFabs = DecimalUtil.ZERO ;
      A8656ProForrbn = A2838ForRelBan ;
      A10542ProForH2O = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
      O764ProForCod = A764ProForCod ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      Z10542ProForH2O = (short)(0) ;
      Z6549ProForFR = "" ;
      Z7802ProFoNPrg = 0 ;
      Z9704ProForVol = 0 ;
      Z9707ProForMq = "" ;
      Z14198ProforFabs = DecimalUtil.ZERO ;
      Z764ProForCod = "" ;
   }

   public void initAll1QQ154( )
   {
      A1160ProForL = (short)(0) ;
      initializeNonKey1QQ154( ) ;
   }

   public void standaloneModalInsert1QQ154( )
   {
      A8656ProForrbn = i8656ProForrbn ;
      A10542ProForH2O = i10542ProForH2O ;
      httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105389", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/mtoformulastinte_procesos.js", "?202682116105389", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties154( )
   {
      edtProForL_Enabled = defedtProForL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void startgridcontrol59( )
   {
      Gridlevel_procesosContainer.AddObjectProperty("GridName", "Gridlevel_procesos");
      Gridlevel_procesosContainer.AddObjectProperty("Header", subGridlevel_procesos_Header);
      Gridlevel_procesosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_procesosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_procesosContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_procesosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddColumnProperties(Gridlevel_procesosColumn);
      Gridlevel_procesosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Gridlevel_procesosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddColumnProperties(Gridlevel_procesosColumn);
      Gridlevel_procesosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosColumn.AddObjectProperty("Value", GXutil.rtrim( A6549ProForFR));
      Gridlevel_procesosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbProForFR.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddColumnProperties(Gridlevel_procesosColumn);
      Gridlevel_procesosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_procesosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddColumnProperties(Gridlevel_procesosColumn);
      Gridlevel_procesosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14198ProforFabs, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_procesosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProforFabs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddColumnProperties(Gridlevel_procesosColumn);
      Gridlevel_procesosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddColumnProperties(Gridlevel_procesosColumn);
      Gridlevel_procesosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCliNom_Internalname = "CLINOM" ;
      edtForSer_Internalname = "FORSER" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtncolorantes_Internalname = "BTNCOLORANTES" ;
      bttBtnproductos_Internalname = "BTNPRODUCTOS" ;
      bttBtnobservaciones_Internalname = "BTNOBSERVACIONES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtProForL_Internalname = "PROFORL" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      cmbProForFR.setInternalname( "PROFORFR" );
      edtProForrbn_Internalname = "PROFORRBN" ;
      edtProforFabs_Internalname = "PROFORFABS" ;
      edtProFoNPrg_Internalname = "PROFONPRG" ;
      divTableleaflevel_procesos_Internalname = "TABLELEAFLEVEL_PROCESOS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtForUltLin_Internalname = "FORULTLIN" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_procesos_Internalname = "GRIDLEVEL_PROCESOS" ;
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
      subGridlevel_procesos_Allowcollapsing = (byte)(0) ;
      subGridlevel_procesos_Allowselection = (byte)(0) ;
      subGridlevel_procesos_Header = "" ;
      Combo_proforcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mto Formulas Tinte (Procesos)", "") );
      edtProFoNPrg_Jsonclick = "" ;
      edtProforFabs_Jsonclick = "" ;
      edtProForrbn_Jsonclick = "" ;
      cmbProForFR.setJsonclick( "" );
      edtProForCod_Jsonclick = "" ;
      edtProForL_Jsonclick = "" ;
      subGridlevel_procesos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_procesos_Backcolorstyle = (byte)(0) ;
      Combo_proforcod_Titlecontrolidtoreplace = "" ;
      edtProFoNPrg_Enabled = 1 ;
      edtProforFabs_Enabled = 1 ;
      edtProForrbn_Enabled = 1 ;
      cmbProForFR.setEnabled( 1 );
      edtProForCod_Enabled = 1 ;
      edtProForL_Enabled = 1 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Enabled = 0 ;
      edtForSerDsc_Visible = 1 ;
      edtForUltLin_Jsonclick = "" ;
      edtForUltLin_Enabled = 1 ;
      edtForUltLin_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Combo_proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_proforcod_Cls = "ExtendedCombo" ;
      divUnnamedtable2_Height = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtnobservaciones_Visible = 1 ;
      bttBtnproductos_Visible = 1 ;
      bttBtncolorantes_Visible = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
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

   public void xc_30_1QQ154( )
   {
      if ( ( GXutil.strcmp(O764ProForCod, A764ProForCod) != 0 ) && true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV32Pgmname, 1, 10), AV16Usurcod, AV17Station, AV29Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_31_1QQ154( )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV32Pgmname, 1, 10), AV16Usurcod, AV17Station, AV29Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_32_1QQ154( )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV32Pgmname, 1, 10), AV16Usurcod, AV17Station, AV29Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_35_1QQ154( String AV7EmprCod ,
                             int AV8CliCod ,
                             String AV9ForSer ,
                             String AV10ForColNom ,
                             int AV11ForColNum ,
                             byte AV12TipColCod ,
                             short A1160ProForL )
   {
      if ( (0==A1160ProForL) )
      {
         GXv_int16[0] = A1160ProForL ;
         new app.getlblineaprocesosquimicos(remoteHandle, context).execute( AV7EmprCod, AV8CliCod, AV9ForSer, AV10ForColNom, AV11ForColNum, AV12TipColCod, GXv_int16) ;
         A1160ProForL = GXv_int16[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_procesos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_59154( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1QQ154( ) ;
         standaloneModal1QQ154( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1QQ154( ) ;
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_59154( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_procesosContainer)) ;
      /* End function gxnrGridlevel_procesos_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "PROFORFR_" + sGXsfl_59_idx ;
      cmbProForFR.setName( GXCCtl );
      cmbProForFR.setWebtags( "" );
      cmbProForFR.addItem("R", httpContext.getMessage( "R", ""), (short)(0));
      cmbProForFR.addItem("F", httpContext.getMessage( "F", ""), (short)(0));
      if ( cmbProForFR.getItemCount() > 0 )
      {
         A6549ProForFR = cmbProForFR.getValidValue(A6549ProForFR) ;
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
      n831TipColCod = false ;
      n407EmprNom = false ;
      /* Using cursor T01QQ22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01QQ22_A407EmprNom[0] ;
      n407EmprNom = T01QQ22_n407EmprNom[0] ;
      pr_default.close(20);
      /* Using cursor T01QQ47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(45);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01QQ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01QQ23_A279CliNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Proforl( )
   {
      if ( (0==A1160ProForL) )
      {
         GXv_int16[0] = A1160ProForL ;
         new app.getlblineaprocesosquimicos(remoteHandle, context).execute( AV7EmprCod, AV8CliCod, AV9ForSer, AV10ForColNom, AV11ForColNum, AV12TipColCod, GXv_int16) ;
         mtoformulastinte_procesos_impl.this.A1160ProForL = GXv_int16[0] ;
         A1160ProForL = this.A1160ProForL ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T01QQ45 */
      pr_default.execute(43, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T01QQ45_A766ProForDsc[0] ;
      A13133ProForAct = T01QQ45_A13133ProForAct[0] ;
      pr_default.close(43);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", GXutil.rtrim( A13133ProForAct));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV31MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV30Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV24Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV22ValCon',fld:'vVALCON',pic:'9',hsh:true},{av:'AV23FlagModC',fld:'vFLAGMODC',pic:'9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV17Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e151QQ2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV31MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV17Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV24Carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV30Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV17Station',fld:'vSTATION',pic:'',hsh:true}]}");
      setEventMetadata("'DOCOLORANTES'","{handler:'e111QQ47',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV22ValCon',fld:'vVALCON',pic:'9',hsh:true},{av:'AV23FlagModC',fld:'vFLAGMODC',pic:'9',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99',hsh:true}]");
      setEventMetadata("'DOCOLORANTES'",",oparms:[]}");
      setEventMetadata("'DOPRODUCTOS'","{handler:'e121QQ47',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99',hsh:true}]");
      setEventMetadata("'DOPRODUCTOS'",",oparms:[]}");
      setEventMetadata("'DOOBSERVACIONES'","{handler:'e131QQ47',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("'DOOBSERVACIONES'",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_PROFORL","{handler:'valid_Proforl',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'A1160ProForL',fld:'PROFORL',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROFORL",",oparms:[{av:'A1160ProForL',fld:'PROFORL',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORFR","{handler:'valid_Proforfr',iparms:[]");
      setEventMetadata("VALID_PROFORFR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Profonprg',iparms:[]");
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
      pr_default.close(43);
      pr_default.close(21);
      pr_default.close(20);
      pr_default.close(45);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ForSer = "" ;
      wcpOAV10ForColNom = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z5742ForSerDsc = "" ;
      Z2838ForRelBan = DecimalUtil.ZERO ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      Z6549ProForFR = "" ;
      Z9707ProForMq = "" ;
      Z14198ProforFabs = DecimalUtil.ZERO ;
      Z764ProForCod = "" ;
      O764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV9ForSer = "" ;
      AV10ForColNom = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      TempTags = "" ;
      bttBtncolorantes_Jsonclick = "" ;
      bttBtnproductos_Jsonclick = "" ;
      bttBtnobservaciones_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV32Pgmname = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      Combo_proforcod_Caption = "" ;
      AV26ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      A5742ForSerDsc = "" ;
      Gridlevel_procesosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode154 = "" ;
      sStyleString = "" ;
      AV29Texto_i = "" ;
      AV20Modif = "" ;
      A13133ProForAct = "" ;
      AV16Usurcod = "" ;
      AV17Station = "" ;
      A9707ProForMq = "" ;
      A766ProForDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Barradeprogreso_Objectcall = "" ;
      Barradeprogreso_Class = "" ;
      Barradeprogreso_Height = "" ;
      Barradeprogreso_Width = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_proforcod_Objectcall = "" ;
      Combo_proforcod_Class = "" ;
      Combo_proforcod_Icontype = "" ;
      Combo_proforcod_Icon = "" ;
      Combo_proforcod_Tooltip = "" ;
      Combo_proforcod_Selectedvalue_set = "" ;
      Combo_proforcod_Selectedvalue_get = "" ;
      Combo_proforcod_Selectedtext_set = "" ;
      Combo_proforcod_Selectedtext_get = "" ;
      Combo_proforcod_Gamoauthtoken = "" ;
      Combo_proforcod_Ddointernalname = "" ;
      Combo_proforcod_Titlecontrolalign = "" ;
      Combo_proforcod_Dropdownoptionstype = "" ;
      Combo_proforcod_Datalisttype = "" ;
      Combo_proforcod_Datalistfixedvalues = "" ;
      Combo_proforcod_Datalistproc = "" ;
      Combo_proforcod_Datalistprocparametersprefix = "" ;
      Combo_proforcod_Remoteservicesparameters = "" ;
      Combo_proforcod_Htmltemplate = "" ;
      Combo_proforcod_Multiplevaluestype = "" ;
      Combo_proforcod_Loadingdata = "" ;
      Combo_proforcod_Noresultsfound = "" ;
      Combo_proforcod_Emptyitemtext = "" ;
      Combo_proforcod_Onlyselectedvalues = "" ;
      Combo_proforcod_Selectalltext = "" ;
      Combo_proforcod_Multiplevaluesseparator = "" ;
      Combo_proforcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode47 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      T764ProForCod = "" ;
      AV25EmprNom = "" ;
      GXt_char6 = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_char1 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV30Valor_cor = DecimalUtil.ZERO ;
      GXv_int11 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27ComboSelectedValue = "" ;
      GXv_char12 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01QQ7_A407EmprNom = new String[] {""} ;
      T01QQ7_n407EmprNom = new boolean[] {false} ;
      T01QQ8_A279CliNom = new String[] {""} ;
      T01QQ11_A494ForSer = new String[] {""} ;
      T01QQ11_n494ForSer = new boolean[] {false} ;
      T01QQ11_A482ForColNom = new String[] {""} ;
      T01QQ11_n482ForColNom = new boolean[] {false} ;
      T01QQ11_A483ForColNum = new int[1] ;
      T01QQ11_n483ForColNum = new boolean[] {false} ;
      T01QQ11_A407EmprNom = new String[] {""} ;
      T01QQ11_n407EmprNom = new boolean[] {false} ;
      T01QQ11_A279CliNom = new String[] {""} ;
      T01QQ11_A5742ForSerDsc = new String[] {""} ;
      T01QQ11_n5742ForSerDsc = new boolean[] {false} ;
      T01QQ11_A1159ForUltLin = new short[1] ;
      T01QQ11_n1159ForUltLin = new boolean[] {false} ;
      T01QQ11_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ11_n2838ForRelBan = new boolean[] {false} ;
      T01QQ11_A396EmprCod = new String[] {""} ;
      T01QQ11_A252CliCod = new int[1] ;
      T01QQ11_n252CliCod = new boolean[] {false} ;
      T01QQ11_A486ForNumCol = new int[1] ;
      T01QQ11_A831TipColCod = new byte[1] ;
      T01QQ11_n831TipColCod = new boolean[] {false} ;
      T01QQ9_A396EmprCod = new String[] {""} ;
      T01QQ10_A396EmprCod = new String[] {""} ;
      T01QQ12_A407EmprNom = new String[] {""} ;
      T01QQ12_n407EmprNom = new boolean[] {false} ;
      T01QQ13_A396EmprCod = new String[] {""} ;
      T01QQ14_A279CliNom = new String[] {""} ;
      T01QQ15_A396EmprCod = new String[] {""} ;
      T01QQ16_A396EmprCod = new String[] {""} ;
      T01QQ16_A252CliCod = new int[1] ;
      T01QQ16_n252CliCod = new boolean[] {false} ;
      T01QQ16_A494ForSer = new String[] {""} ;
      T01QQ16_n494ForSer = new boolean[] {false} ;
      T01QQ16_A482ForColNom = new String[] {""} ;
      T01QQ16_n482ForColNom = new boolean[] {false} ;
      T01QQ16_A483ForColNum = new int[1] ;
      T01QQ16_n483ForColNum = new boolean[] {false} ;
      T01QQ16_A831TipColCod = new byte[1] ;
      T01QQ16_n831TipColCod = new boolean[] {false} ;
      T01QQ6_A494ForSer = new String[] {""} ;
      T01QQ6_n494ForSer = new boolean[] {false} ;
      T01QQ6_A482ForColNom = new String[] {""} ;
      T01QQ6_n482ForColNom = new boolean[] {false} ;
      T01QQ6_A483ForColNum = new int[1] ;
      T01QQ6_n483ForColNum = new boolean[] {false} ;
      T01QQ6_A5742ForSerDsc = new String[] {""} ;
      T01QQ6_n5742ForSerDsc = new boolean[] {false} ;
      T01QQ6_A1159ForUltLin = new short[1] ;
      T01QQ6_n1159ForUltLin = new boolean[] {false} ;
      T01QQ6_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ6_n2838ForRelBan = new boolean[] {false} ;
      T01QQ6_A396EmprCod = new String[] {""} ;
      T01QQ6_A252CliCod = new int[1] ;
      T01QQ6_n252CliCod = new boolean[] {false} ;
      T01QQ6_A486ForNumCol = new int[1] ;
      T01QQ6_A831TipColCod = new byte[1] ;
      T01QQ6_n831TipColCod = new boolean[] {false} ;
      T01QQ17_A396EmprCod = new String[] {""} ;
      T01QQ17_A252CliCod = new int[1] ;
      T01QQ17_n252CliCod = new boolean[] {false} ;
      T01QQ17_A494ForSer = new String[] {""} ;
      T01QQ17_n494ForSer = new boolean[] {false} ;
      T01QQ17_A482ForColNom = new String[] {""} ;
      T01QQ17_n482ForColNom = new boolean[] {false} ;
      T01QQ17_A483ForColNum = new int[1] ;
      T01QQ17_n483ForColNum = new boolean[] {false} ;
      T01QQ17_A831TipColCod = new byte[1] ;
      T01QQ17_n831TipColCod = new boolean[] {false} ;
      T01QQ18_A396EmprCod = new String[] {""} ;
      T01QQ18_A252CliCod = new int[1] ;
      T01QQ18_n252CliCod = new boolean[] {false} ;
      T01QQ18_A494ForSer = new String[] {""} ;
      T01QQ18_n494ForSer = new boolean[] {false} ;
      T01QQ18_A482ForColNom = new String[] {""} ;
      T01QQ18_n482ForColNom = new boolean[] {false} ;
      T01QQ18_A483ForColNum = new int[1] ;
      T01QQ18_n483ForColNum = new boolean[] {false} ;
      T01QQ18_A831TipColCod = new byte[1] ;
      T01QQ18_n831TipColCod = new boolean[] {false} ;
      T01QQ5_A494ForSer = new String[] {""} ;
      T01QQ5_n494ForSer = new boolean[] {false} ;
      T01QQ5_A482ForColNom = new String[] {""} ;
      T01QQ5_n482ForColNom = new boolean[] {false} ;
      T01QQ5_A483ForColNum = new int[1] ;
      T01QQ5_n483ForColNum = new boolean[] {false} ;
      T01QQ5_A5742ForSerDsc = new String[] {""} ;
      T01QQ5_n5742ForSerDsc = new boolean[] {false} ;
      T01QQ5_A1159ForUltLin = new short[1] ;
      T01QQ5_n1159ForUltLin = new boolean[] {false} ;
      T01QQ5_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ5_n2838ForRelBan = new boolean[] {false} ;
      T01QQ5_A396EmprCod = new String[] {""} ;
      T01QQ5_A252CliCod = new int[1] ;
      T01QQ5_n252CliCod = new boolean[] {false} ;
      T01QQ5_A486ForNumCol = new int[1] ;
      T01QQ5_A831TipColCod = new byte[1] ;
      T01QQ5_n831TipColCod = new boolean[] {false} ;
      T01QQ22_A407EmprNom = new String[] {""} ;
      T01QQ22_n407EmprNom = new boolean[] {false} ;
      T01QQ23_A279CliNom = new String[] {""} ;
      T01QQ24_A396EmprCod = new String[] {""} ;
      T01QQ24_A252CliCod = new int[1] ;
      T01QQ24_n252CliCod = new boolean[] {false} ;
      T01QQ24_A494ForSer = new String[] {""} ;
      T01QQ24_n494ForSer = new boolean[] {false} ;
      T01QQ24_A482ForColNom = new String[] {""} ;
      T01QQ24_n482ForColNom = new boolean[] {false} ;
      T01QQ24_A483ForColNum = new int[1] ;
      T01QQ24_n483ForColNum = new boolean[] {false} ;
      T01QQ24_A831TipColCod = new byte[1] ;
      T01QQ24_n831TipColCod = new boolean[] {false} ;
      T01QQ24_A13377ForNormaID = new String[] {""} ;
      T01QQ25_A396EmprCod = new String[] {""} ;
      T01QQ25_A252CliCod = new int[1] ;
      T01QQ25_n252CliCod = new boolean[] {false} ;
      T01QQ25_A494ForSer = new String[] {""} ;
      T01QQ25_n494ForSer = new boolean[] {false} ;
      T01QQ25_A482ForColNom = new String[] {""} ;
      T01QQ25_n482ForColNom = new boolean[] {false} ;
      T01QQ25_A483ForColNum = new int[1] ;
      T01QQ25_n483ForColNum = new boolean[] {false} ;
      T01QQ25_A831TipColCod = new byte[1] ;
      T01QQ25_n831TipColCod = new boolean[] {false} ;
      T01QQ25_A3571EnsCod = new String[] {""} ;
      T01QQ26_A396EmprCod = new String[] {""} ;
      T01QQ26_A252CliCod = new int[1] ;
      T01QQ26_n252CliCod = new boolean[] {false} ;
      T01QQ26_A494ForSer = new String[] {""} ;
      T01QQ26_n494ForSer = new boolean[] {false} ;
      T01QQ26_A482ForColNom = new String[] {""} ;
      T01QQ26_n482ForColNom = new boolean[] {false} ;
      T01QQ26_A483ForColNum = new int[1] ;
      T01QQ26_n483ForColNum = new boolean[] {false} ;
      T01QQ26_A831TipColCod = new byte[1] ;
      T01QQ26_n831TipColCod = new boolean[] {false} ;
      T01QQ26_A7270Procod_c = new String[] {""} ;
      T01QQ26_A7272CliCod_d = new int[1] ;
      T01QQ27_A396EmprCod = new String[] {""} ;
      T01QQ27_A252CliCod = new int[1] ;
      T01QQ27_n252CliCod = new boolean[] {false} ;
      T01QQ27_A494ForSer = new String[] {""} ;
      T01QQ27_n494ForSer = new boolean[] {false} ;
      T01QQ27_A482ForColNom = new String[] {""} ;
      T01QQ27_n482ForColNom = new boolean[] {false} ;
      T01QQ27_A483ForColNum = new int[1] ;
      T01QQ27_n483ForColNum = new boolean[] {false} ;
      T01QQ27_A831TipColCod = new byte[1] ;
      T01QQ27_n831TipColCod = new boolean[] {false} ;
      T01QQ27_A6525ColAqP = new String[] {""} ;
      T01QQ28_A396EmprCod = new String[] {""} ;
      T01QQ28_A252CliCod = new int[1] ;
      T01QQ28_n252CliCod = new boolean[] {false} ;
      T01QQ28_A494ForSer = new String[] {""} ;
      T01QQ28_n494ForSer = new boolean[] {false} ;
      T01QQ28_A482ForColNom = new String[] {""} ;
      T01QQ28_n482ForColNom = new boolean[] {false} ;
      T01QQ28_A483ForColNum = new int[1] ;
      T01QQ28_n483ForColNum = new boolean[] {false} ;
      T01QQ28_A831TipColCod = new byte[1] ;
      T01QQ28_n831TipColCod = new boolean[] {false} ;
      T01QQ28_A7262CACPP = new String[] {""} ;
      T01QQ29_A396EmprCod = new String[] {""} ;
      T01QQ29_A252CliCod = new int[1] ;
      T01QQ29_n252CliCod = new boolean[] {false} ;
      T01QQ29_A494ForSer = new String[] {""} ;
      T01QQ29_n494ForSer = new boolean[] {false} ;
      T01QQ29_A482ForColNom = new String[] {""} ;
      T01QQ29_n482ForColNom = new boolean[] {false} ;
      T01QQ29_A483ForColNum = new int[1] ;
      T01QQ29_n483ForColNum = new boolean[] {false} ;
      T01QQ29_A831TipColCod = new byte[1] ;
      T01QQ29_n831TipColCod = new boolean[] {false} ;
      T01QQ29_A6037Mq_Grupo = new byte[1] ;
      T01QQ30_A396EmprCod = new String[] {""} ;
      T01QQ30_A252CliCod = new int[1] ;
      T01QQ30_n252CliCod = new boolean[] {false} ;
      T01QQ30_A494ForSer = new String[] {""} ;
      T01QQ30_n494ForSer = new boolean[] {false} ;
      T01QQ30_A482ForColNom = new String[] {""} ;
      T01QQ30_n482ForColNom = new boolean[] {false} ;
      T01QQ30_A483ForColNum = new int[1] ;
      T01QQ30_n483ForColNum = new boolean[] {false} ;
      T01QQ30_A831TipColCod = new byte[1] ;
      T01QQ30_n831TipColCod = new boolean[] {false} ;
      T01QQ30_A853For_ProC = new String[] {""} ;
      T01QQ31_A396EmprCod = new String[] {""} ;
      T01QQ31_A252CliCod = new int[1] ;
      T01QQ31_n252CliCod = new boolean[] {false} ;
      T01QQ31_A494ForSer = new String[] {""} ;
      T01QQ31_n494ForSer = new boolean[] {false} ;
      T01QQ31_A482ForColNom = new String[] {""} ;
      T01QQ31_n482ForColNom = new boolean[] {false} ;
      T01QQ31_A483ForColNum = new int[1] ;
      T01QQ31_n483ForColNum = new boolean[] {false} ;
      T01QQ31_A831TipColCod = new byte[1] ;
      T01QQ31_n831TipColCod = new boolean[] {false} ;
      T01QQ31_A9766ForProC = new String[] {""} ;
      T01QQ32_A396EmprCod = new String[] {""} ;
      T01QQ32_A252CliCod = new int[1] ;
      T01QQ32_n252CliCod = new boolean[] {false} ;
      T01QQ32_A494ForSer = new String[] {""} ;
      T01QQ32_n494ForSer = new boolean[] {false} ;
      T01QQ32_A482ForColNom = new String[] {""} ;
      T01QQ32_n482ForColNom = new boolean[] {false} ;
      T01QQ32_A483ForColNum = new int[1] ;
      T01QQ32_n483ForColNum = new boolean[] {false} ;
      T01QQ32_A831TipColCod = new byte[1] ;
      T01QQ32_n831TipColCod = new boolean[] {false} ;
      T01QQ32_A7797Sim_lin = new short[1] ;
      T01QQ33_A396EmprCod = new String[] {""} ;
      T01QQ33_A252CliCod = new int[1] ;
      T01QQ33_n252CliCod = new boolean[] {false} ;
      T01QQ33_A494ForSer = new String[] {""} ;
      T01QQ33_n494ForSer = new boolean[] {false} ;
      T01QQ33_A482ForColNom = new String[] {""} ;
      T01QQ33_n482ForColNom = new boolean[] {false} ;
      T01QQ33_A483ForColNum = new int[1] ;
      T01QQ33_n483ForColNum = new boolean[] {false} ;
      T01QQ33_A831TipColCod = new byte[1] ;
      T01QQ33_n831TipColCod = new boolean[] {false} ;
      T01QQ33_A7094Acab_Ter = new String[] {""} ;
      T01QQ34_A396EmprCod = new String[] {""} ;
      T01QQ34_A252CliCod = new int[1] ;
      T01QQ34_n252CliCod = new boolean[] {false} ;
      T01QQ34_A494ForSer = new String[] {""} ;
      T01QQ34_n494ForSer = new boolean[] {false} ;
      T01QQ34_A482ForColNom = new String[] {""} ;
      T01QQ34_n482ForColNom = new boolean[] {false} ;
      T01QQ34_A483ForColNum = new int[1] ;
      T01QQ34_n483ForColNum = new boolean[] {false} ;
      T01QQ34_A831TipColCod = new byte[1] ;
      T01QQ34_n831TipColCod = new boolean[] {false} ;
      T01QQ34_A3689ComForLin = new short[1] ;
      T01QQ35_A396EmprCod = new String[] {""} ;
      T01QQ35_A252CliCod = new int[1] ;
      T01QQ35_n252CliCod = new boolean[] {false} ;
      T01QQ35_A494ForSer = new String[] {""} ;
      T01QQ35_n494ForSer = new boolean[] {false} ;
      T01QQ35_A482ForColNom = new String[] {""} ;
      T01QQ35_n482ForColNom = new boolean[] {false} ;
      T01QQ35_A483ForColNum = new int[1] ;
      T01QQ35_n483ForColNum = new boolean[] {false} ;
      T01QQ35_A831TipColCod = new byte[1] ;
      T01QQ35_n831TipColCod = new boolean[] {false} ;
      T01QQ35_A1519RecCorLin = new byte[1] ;
      T01QQ36_A396EmprCod = new String[] {""} ;
      T01QQ36_A910Workstat = new String[] {""} ;
      T01QQ36_A880EscLin = new short[1] ;
      T01QQ37_A396EmprCod = new String[] {""} ;
      T01QQ37_A252CliCod = new int[1] ;
      T01QQ37_n252CliCod = new boolean[] {false} ;
      T01QQ37_A494ForSer = new String[] {""} ;
      T01QQ37_n494ForSer = new boolean[] {false} ;
      T01QQ37_A482ForColNom = new String[] {""} ;
      T01QQ37_n482ForColNom = new boolean[] {false} ;
      T01QQ37_A483ForColNum = new int[1] ;
      T01QQ37_n483ForColNum = new boolean[] {false} ;
      T01QQ37_A831TipColCod = new byte[1] ;
      T01QQ37_n831TipColCod = new boolean[] {false} ;
      T01QQ37_A650ObsLin = new short[1] ;
      T01QQ38_A396EmprCod = new String[] {""} ;
      T01QQ38_A252CliCod = new int[1] ;
      T01QQ38_n252CliCod = new boolean[] {false} ;
      T01QQ38_A494ForSer = new String[] {""} ;
      T01QQ38_n494ForSer = new boolean[] {false} ;
      T01QQ38_A482ForColNom = new String[] {""} ;
      T01QQ38_n482ForColNom = new boolean[] {false} ;
      T01QQ38_A483ForColNum = new int[1] ;
      T01QQ38_n483ForColNum = new boolean[] {false} ;
      T01QQ38_A831TipColCod = new byte[1] ;
      T01QQ38_n831TipColCod = new boolean[] {false} ;
      Z766ProForDsc = "" ;
      Z13133ProForAct = "" ;
      T01QQ39_A494ForSer = new String[] {""} ;
      T01QQ39_n494ForSer = new boolean[] {false} ;
      T01QQ39_A482ForColNom = new String[] {""} ;
      T01QQ39_n482ForColNom = new boolean[] {false} ;
      T01QQ39_A483ForColNum = new int[1] ;
      T01QQ39_n483ForColNum = new boolean[] {false} ;
      T01QQ39_A831TipColCod = new byte[1] ;
      T01QQ39_n831TipColCod = new boolean[] {false} ;
      T01QQ39_A1160ProForL = new short[1] ;
      T01QQ39_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ39_A10542ProForH2O = new short[1] ;
      T01QQ39_A766ProForDsc = new String[] {""} ;
      T01QQ39_A6549ProForFR = new String[] {""} ;
      T01QQ39_A7802ProFoNPrg = new int[1] ;
      T01QQ39_A9704ProForVol = new int[1] ;
      T01QQ39_A9707ProForMq = new String[] {""} ;
      T01QQ39_A13133ProForAct = new String[] {""} ;
      T01QQ39_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ39_A396EmprCod = new String[] {""} ;
      T01QQ39_A764ProForCod = new String[] {""} ;
      T01QQ39_A252CliCod = new int[1] ;
      T01QQ39_n252CliCod = new boolean[] {false} ;
      T01QQ4_A766ProForDsc = new String[] {""} ;
      T01QQ4_A13133ProForAct = new String[] {""} ;
      T01QQ40_A766ProForDsc = new String[] {""} ;
      T01QQ40_A13133ProForAct = new String[] {""} ;
      T01QQ41_A396EmprCod = new String[] {""} ;
      T01QQ41_A252CliCod = new int[1] ;
      T01QQ41_n252CliCod = new boolean[] {false} ;
      T01QQ41_A494ForSer = new String[] {""} ;
      T01QQ41_n494ForSer = new boolean[] {false} ;
      T01QQ41_A482ForColNom = new String[] {""} ;
      T01QQ41_n482ForColNom = new boolean[] {false} ;
      T01QQ41_A483ForColNum = new int[1] ;
      T01QQ41_n483ForColNum = new boolean[] {false} ;
      T01QQ41_A831TipColCod = new byte[1] ;
      T01QQ41_n831TipColCod = new boolean[] {false} ;
      T01QQ41_A1160ProForL = new short[1] ;
      T01QQ3_A494ForSer = new String[] {""} ;
      T01QQ3_n494ForSer = new boolean[] {false} ;
      T01QQ3_A482ForColNom = new String[] {""} ;
      T01QQ3_n482ForColNom = new boolean[] {false} ;
      T01QQ3_A483ForColNum = new int[1] ;
      T01QQ3_n483ForColNum = new boolean[] {false} ;
      T01QQ3_A831TipColCod = new byte[1] ;
      T01QQ3_n831TipColCod = new boolean[] {false} ;
      T01QQ3_A1160ProForL = new short[1] ;
      T01QQ3_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ3_A10542ProForH2O = new short[1] ;
      T01QQ3_A6549ProForFR = new String[] {""} ;
      T01QQ3_A7802ProFoNPrg = new int[1] ;
      T01QQ3_A9704ProForVol = new int[1] ;
      T01QQ3_A9707ProForMq = new String[] {""} ;
      T01QQ3_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ3_A396EmprCod = new String[] {""} ;
      T01QQ3_A764ProForCod = new String[] {""} ;
      T01QQ3_A252CliCod = new int[1] ;
      T01QQ3_n252CliCod = new boolean[] {false} ;
      T01QQ2_A494ForSer = new String[] {""} ;
      T01QQ2_n494ForSer = new boolean[] {false} ;
      T01QQ2_A482ForColNom = new String[] {""} ;
      T01QQ2_n482ForColNom = new boolean[] {false} ;
      T01QQ2_A483ForColNum = new int[1] ;
      T01QQ2_n483ForColNum = new boolean[] {false} ;
      T01QQ2_A831TipColCod = new byte[1] ;
      T01QQ2_n831TipColCod = new boolean[] {false} ;
      T01QQ2_A1160ProForL = new short[1] ;
      T01QQ2_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ2_A10542ProForH2O = new short[1] ;
      T01QQ2_A6549ProForFR = new String[] {""} ;
      T01QQ2_A7802ProFoNPrg = new int[1] ;
      T01QQ2_A9704ProForVol = new int[1] ;
      T01QQ2_A9707ProForMq = new String[] {""} ;
      T01QQ2_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QQ2_A396EmprCod = new String[] {""} ;
      T01QQ2_A764ProForCod = new String[] {""} ;
      T01QQ2_A252CliCod = new int[1] ;
      T01QQ2_n252CliCod = new boolean[] {false} ;
      T01QQ45_A766ProForDsc = new String[] {""} ;
      T01QQ45_A13133ProForAct = new String[] {""} ;
      T01QQ46_A396EmprCod = new String[] {""} ;
      T01QQ46_A252CliCod = new int[1] ;
      T01QQ46_n252CliCod = new boolean[] {false} ;
      T01QQ46_A494ForSer = new String[] {""} ;
      T01QQ46_n494ForSer = new boolean[] {false} ;
      T01QQ46_A482ForColNom = new String[] {""} ;
      T01QQ46_n482ForColNom = new boolean[] {false} ;
      T01QQ46_A483ForColNum = new int[1] ;
      T01QQ46_n483ForColNum = new boolean[] {false} ;
      T01QQ46_A831TipColCod = new byte[1] ;
      T01QQ46_n831TipColCod = new boolean[] {false} ;
      T01QQ46_A1160ProForL = new short[1] ;
      Gridlevel_procesosRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_procesos_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8656ProForrbn = DecimalUtil.ZERO ;
      Gridlevel_procesosColumn = new com.genexus.webpanels.GXWebColumn();
      T01QQ47_A396EmprCod = new String[] {""} ;
      GXv_int16 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesos__default(),
         new Object[] {
             new Object[] {
            T01QQ2_A494ForSer, T01QQ2_A482ForColNom, T01QQ2_A483ForColNum, T01QQ2_A831TipColCod, T01QQ2_A1160ProForL, T01QQ2_A8656ProForrbn, T01QQ2_A10542ProForH2O, T01QQ2_A6549ProForFR, T01QQ2_A7802ProFoNPrg, T01QQ2_A9704ProForVol,
            T01QQ2_A9707ProForMq, T01QQ2_A14198ProforFabs, T01QQ2_A396EmprCod, T01QQ2_A764ProForCod, T01QQ2_A252CliCod
            }
            , new Object[] {
            T01QQ3_A494ForSer, T01QQ3_A482ForColNom, T01QQ3_A483ForColNum, T01QQ3_A831TipColCod, T01QQ3_A1160ProForL, T01QQ3_A8656ProForrbn, T01QQ3_A10542ProForH2O, T01QQ3_A6549ProForFR, T01QQ3_A7802ProFoNPrg, T01QQ3_A9704ProForVol,
            T01QQ3_A9707ProForMq, T01QQ3_A14198ProforFabs, T01QQ3_A396EmprCod, T01QQ3_A764ProForCod, T01QQ3_A252CliCod
            }
            , new Object[] {
            T01QQ4_A766ProForDsc, T01QQ4_A13133ProForAct
            }
            , new Object[] {
            T01QQ5_A494ForSer, T01QQ5_A482ForColNom, T01QQ5_A483ForColNum, T01QQ5_A5742ForSerDsc, T01QQ5_n5742ForSerDsc, T01QQ5_A1159ForUltLin, T01QQ5_n1159ForUltLin, T01QQ5_A2838ForRelBan, T01QQ5_n2838ForRelBan, T01QQ5_A396EmprCod,
            T01QQ5_A252CliCod, T01QQ5_A486ForNumCol, T01QQ5_A831TipColCod
            }
            , new Object[] {
            T01QQ6_A494ForSer, T01QQ6_A482ForColNom, T01QQ6_A483ForColNum, T01QQ6_A5742ForSerDsc, T01QQ6_n5742ForSerDsc, T01QQ6_A1159ForUltLin, T01QQ6_n1159ForUltLin, T01QQ6_A2838ForRelBan, T01QQ6_n2838ForRelBan, T01QQ6_A396EmprCod,
            T01QQ6_A252CliCod, T01QQ6_A486ForNumCol, T01QQ6_A831TipColCod
            }
            , new Object[] {
            T01QQ7_A407EmprNom, T01QQ7_n407EmprNom
            }
            , new Object[] {
            T01QQ8_A279CliNom
            }
            , new Object[] {
            T01QQ9_A396EmprCod
            }
            , new Object[] {
            T01QQ10_A396EmprCod
            }
            , new Object[] {
            T01QQ11_A494ForSer, T01QQ11_A482ForColNom, T01QQ11_A483ForColNum, T01QQ11_A407EmprNom, T01QQ11_n407EmprNom, T01QQ11_A279CliNom, T01QQ11_A5742ForSerDsc, T01QQ11_n5742ForSerDsc, T01QQ11_A1159ForUltLin, T01QQ11_n1159ForUltLin,
            T01QQ11_A2838ForRelBan, T01QQ11_n2838ForRelBan, T01QQ11_A396EmprCod, T01QQ11_A252CliCod, T01QQ11_A486ForNumCol, T01QQ11_A831TipColCod
            }
            , new Object[] {
            T01QQ12_A407EmprNom, T01QQ12_n407EmprNom
            }
            , new Object[] {
            T01QQ13_A396EmprCod
            }
            , new Object[] {
            T01QQ14_A279CliNom
            }
            , new Object[] {
            T01QQ15_A396EmprCod
            }
            , new Object[] {
            T01QQ16_A396EmprCod, T01QQ16_A252CliCod, T01QQ16_A494ForSer, T01QQ16_A482ForColNom, T01QQ16_A483ForColNum, T01QQ16_A831TipColCod
            }
            , new Object[] {
            T01QQ17_A396EmprCod, T01QQ17_A252CliCod, T01QQ17_A494ForSer, T01QQ17_A482ForColNom, T01QQ17_A483ForColNum, T01QQ17_A831TipColCod
            }
            , new Object[] {
            T01QQ18_A396EmprCod, T01QQ18_A252CliCod, T01QQ18_A494ForSer, T01QQ18_A482ForColNom, T01QQ18_A483ForColNum, T01QQ18_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QQ22_A407EmprNom, T01QQ22_n407EmprNom
            }
            , new Object[] {
            T01QQ23_A279CliNom
            }
            , new Object[] {
            T01QQ24_A396EmprCod, T01QQ24_A252CliCod, T01QQ24_A494ForSer, T01QQ24_A482ForColNom, T01QQ24_A483ForColNum, T01QQ24_A831TipColCod, T01QQ24_A13377ForNormaID
            }
            , new Object[] {
            T01QQ25_A396EmprCod, T01QQ25_A252CliCod, T01QQ25_A494ForSer, T01QQ25_A482ForColNom, T01QQ25_A483ForColNum, T01QQ25_A831TipColCod, T01QQ25_A3571EnsCod
            }
            , new Object[] {
            T01QQ26_A396EmprCod, T01QQ26_A252CliCod, T01QQ26_A494ForSer, T01QQ26_A482ForColNom, T01QQ26_A483ForColNum, T01QQ26_A831TipColCod, T01QQ26_A7270Procod_c, T01QQ26_A7272CliCod_d
            }
            , new Object[] {
            T01QQ27_A396EmprCod, T01QQ27_A252CliCod, T01QQ27_A494ForSer, T01QQ27_A482ForColNom, T01QQ27_A483ForColNum, T01QQ27_A831TipColCod, T01QQ27_A6525ColAqP
            }
            , new Object[] {
            T01QQ28_A396EmprCod, T01QQ28_A252CliCod, T01QQ28_A494ForSer, T01QQ28_A482ForColNom, T01QQ28_A483ForColNum, T01QQ28_A831TipColCod, T01QQ28_A7262CACPP
            }
            , new Object[] {
            T01QQ29_A396EmprCod, T01QQ29_A252CliCod, T01QQ29_A494ForSer, T01QQ29_A482ForColNom, T01QQ29_A483ForColNum, T01QQ29_A831TipColCod, T01QQ29_A6037Mq_Grupo
            }
            , new Object[] {
            T01QQ30_A396EmprCod, T01QQ30_A252CliCod, T01QQ30_A494ForSer, T01QQ30_A482ForColNom, T01QQ30_A483ForColNum, T01QQ30_A831TipColCod, T01QQ30_A853For_ProC
            }
            , new Object[] {
            T01QQ31_A396EmprCod, T01QQ31_A252CliCod, T01QQ31_A494ForSer, T01QQ31_A482ForColNom, T01QQ31_A483ForColNum, T01QQ31_A831TipColCod, T01QQ31_A9766ForProC
            }
            , new Object[] {
            T01QQ32_A396EmprCod, T01QQ32_A252CliCod, T01QQ32_A494ForSer, T01QQ32_A482ForColNom, T01QQ32_A483ForColNum, T01QQ32_A831TipColCod, T01QQ32_A7797Sim_lin
            }
            , new Object[] {
            T01QQ33_A396EmprCod, T01QQ33_A252CliCod, T01QQ33_A494ForSer, T01QQ33_A482ForColNom, T01QQ33_A483ForColNum, T01QQ33_A831TipColCod, T01QQ33_A7094Acab_Ter
            }
            , new Object[] {
            T01QQ34_A396EmprCod, T01QQ34_A252CliCod, T01QQ34_A494ForSer, T01QQ34_A482ForColNom, T01QQ34_A483ForColNum, T01QQ34_A831TipColCod, T01QQ34_A3689ComForLin
            }
            , new Object[] {
            T01QQ35_A396EmprCod, T01QQ35_A252CliCod, T01QQ35_A494ForSer, T01QQ35_A482ForColNom, T01QQ35_A483ForColNum, T01QQ35_A831TipColCod, T01QQ35_A1519RecCorLin
            }
            , new Object[] {
            T01QQ36_A396EmprCod, T01QQ36_A910Workstat, T01QQ36_A880EscLin
            }
            , new Object[] {
            T01QQ37_A396EmprCod, T01QQ37_A252CliCod, T01QQ37_A494ForSer, T01QQ37_A482ForColNom, T01QQ37_A483ForColNum, T01QQ37_A831TipColCod, T01QQ37_A650ObsLin
            }
            , new Object[] {
            T01QQ38_A396EmprCod, T01QQ38_A252CliCod, T01QQ38_A494ForSer, T01QQ38_A482ForColNom, T01QQ38_A483ForColNum, T01QQ38_A831TipColCod
            }
            , new Object[] {
            T01QQ39_A494ForSer, T01QQ39_A482ForColNom, T01QQ39_A483ForColNum, T01QQ39_A831TipColCod, T01QQ39_A1160ProForL, T01QQ39_A8656ProForrbn, T01QQ39_A10542ProForH2O, T01QQ39_A766ProForDsc, T01QQ39_A6549ProForFR, T01QQ39_A7802ProFoNPrg,
            T01QQ39_A9704ProForVol, T01QQ39_A9707ProForMq, T01QQ39_A13133ProForAct, T01QQ39_A14198ProforFabs, T01QQ39_A396EmprCod, T01QQ39_A764ProForCod, T01QQ39_A252CliCod
            }
            , new Object[] {
            T01QQ40_A766ProForDsc, T01QQ40_A13133ProForAct
            }
            , new Object[] {
            T01QQ41_A396EmprCod, T01QQ41_A252CliCod, T01QQ41_A494ForSer, T01QQ41_A482ForColNom, T01QQ41_A483ForColNum, T01QQ41_A831TipColCod, T01QQ41_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QQ45_A766ProForDsc, T01QQ45_A13133ProForAct
            }
            , new Object[] {
            T01QQ46_A396EmprCod, T01QQ46_A252CliCod, T01QQ46_A494ForSer, T01QQ46_A482ForColNom, T01QQ46_A483ForColNum, T01QQ46_A831TipColCod, T01QQ46_A1160ProForL
            }
            , new Object[] {
            T01QQ47_A396EmprCod
            }
         }
      );
      Z10542ProForH2O = (short)(1) ;
      A10542ProForH2O = (short)(1) ;
      i10542ProForH2O = (short)(1) ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      i8656ProForrbn = DecimalUtil.ZERO ;
      AV32Pgmname = "FormulacionTinte.MtoFormulasTinte_Procesos" ;
   }

   private byte wcpOAV12TipColCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte AV12TipColCod ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV23FlagModC ;
   private byte AV22ValCon ;
   private byte AV24Carvitin ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private byte subGridlevel_procesos_Backcolorstyle ;
   private byte subGridlevel_procesos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_procesos_Allowselection ;
   private byte subGridlevel_procesos_Allowhovering ;
   private byte subGridlevel_procesos_Allowcollapsing ;
   private byte subGridlevel_procesos_Collapsed ;
   private short Z1159ForUltLin ;
   private short Z1160ProForL ;
   private short Z10542ProForH2O ;
   private short nRcdDeleted_154 ;
   private short nRcdExists_154 ;
   private short nIsMod_154 ;
   private short A1160ProForL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1159ForUltLin ;
   private short nBlankRcdCount154 ;
   private short RcdFound154 ;
   private short nBlankRcdUsr154 ;
   private short A10542ProForH2O ;
   private short RcdFound47 ;
   private short AV31MForEq ;
   private short nIsDirty_47 ;
   private short nIsDirty_154 ;
   private short i10542ProForH2O ;
   private short GXv_int16[] ;
   private int wcpOAV8CliCod ;
   private int wcpOAV11ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z486ForNumCol ;
   private int nRC_GXsfl_59 ;
   private int nGXsfl_59_idx=1 ;
   private int N486ForNumCol ;
   private int Z7802ProFoNPrg ;
   private int Z9704ProForVol ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int A486ForNumCol ;
   private int A252CliCod ;
   private int trnEnded ;
   private int edtCliNom_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int A483ForColNum ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int bttBtncolorantes_Visible ;
   private int bttBtnproductos_Visible ;
   private int bttBtnobservaciones_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int divUnnamedtable2_Height ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtForUltLin_Enabled ;
   private int edtForUltLin_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForSerDsc_Enabled ;
   private int edtProForL_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForrbn_Enabled ;
   private int edtProforFabs_Enabled ;
   private int edtProFoNPrg_Enabled ;
   private int fRowAdded ;
   private int AV18Insert_ForNumCol ;
   private int A9704ProForVol ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_proforcod_Datalistupdateminimumcharacters ;
   private int A7802ProFoNPrg ;
   private int AV34GXV1 ;
   private int GXv_int3[] ;
   private int GXv_int11[] ;
   private int GXv_int9[] ;
   private int GX_JID ;
   private int subGridlevel_procesos_Backcolor ;
   private int subGridlevel_procesos_Allbackcolor ;
   private int defedtProForL_Enabled ;
   private int idxLst ;
   private int subGridlevel_procesos_Selectedindex ;
   private int subGridlevel_procesos_Selectioncolor ;
   private int subGridlevel_procesos_Hoveringcolor ;
   private long GRIDLEVEL_PROCESOS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2838ForRelBan ;
   private java.math.BigDecimal Z8656ProForrbn ;
   private java.math.BigDecimal Z14198ProforFabs ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A14198ProforFabs ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV30Valor_cor ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal i8656ProForrbn ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ForSer ;
   private String wcpOAV10ForColNom ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z5742ForSerDsc ;
   private String Z6549ProForFR ;
   private String Z9707ProForMq ;
   private String Z764ProForCod ;
   private String O764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_59_idx="0001" ;
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
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtncolorantes_Internalname ;
   private String bttBtncolorantes_Jsonclick ;
   private String bttBtnproductos_Internalname ;
   private String bttBtnproductos_Jsonclick ;
   private String bttBtnobservaciones_Internalname ;
   private String bttBtnobservaciones_Jsonclick ;
   private String divTableleaflevel_procesos_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV32Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String Datamonjs_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_proforcod_Caption ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtForUltLin_Internalname ;
   private String edtForUltLin_Jsonclick ;
   private String edtForSerDsc_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String sMode154 ;
   private String edtProForL_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForrbn_Internalname ;
   private String edtProforFabs_Internalname ;
   private String edtProFoNPrg_Internalname ;
   private String sStyleString ;
   private String subGridlevel_procesos_Internalname ;
   private String AV20Modif ;
   private String A13133ProForAct ;
   private String AV16Usurcod ;
   private String AV17Station ;
   private String A9707ProForMq ;
   private String A766ProForDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Barradeprogreso_Objectcall ;
   private String Barradeprogreso_Class ;
   private String Barradeprogreso_Height ;
   private String Barradeprogreso_Width ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_proforcod_Objectcall ;
   private String Combo_proforcod_Class ;
   private String Combo_proforcod_Icontype ;
   private String Combo_proforcod_Icon ;
   private String Combo_proforcod_Tooltip ;
   private String Combo_proforcod_Selectedvalue_set ;
   private String Combo_proforcod_Selectedvalue_get ;
   private String Combo_proforcod_Selectedtext_set ;
   private String Combo_proforcod_Selectedtext_get ;
   private String Combo_proforcod_Gamoauthtoken ;
   private String Combo_proforcod_Ddointernalname ;
   private String Combo_proforcod_Titlecontrolalign ;
   private String Combo_proforcod_Dropdownoptionstype ;
   private String Combo_proforcod_Titlecontrolidtoreplace ;
   private String Combo_proforcod_Datalisttype ;
   private String Combo_proforcod_Datalistfixedvalues ;
   private String Combo_proforcod_Datalistproc ;
   private String Combo_proforcod_Datalistprocparametersprefix ;
   private String Combo_proforcod_Remoteservicesparameters ;
   private String Combo_proforcod_Htmltemplate ;
   private String Combo_proforcod_Multiplevaluestype ;
   private String Combo_proforcod_Loadingdata ;
   private String Combo_proforcod_Noresultsfound ;
   private String Combo_proforcod_Emptyitemtext ;
   private String Combo_proforcod_Onlyselectedvalues ;
   private String Combo_proforcod_Selectalltext ;
   private String Combo_proforcod_Multiplevaluesseparator ;
   private String Combo_proforcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode47 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A6549ProForFR ;
   private String T764ProForCod ;
   private String AV25EmprNom ;
   private String GXt_char6 ;
   private String GXv_char1[] ;
   private String GXv_char7[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z766ProForDsc ;
   private String Z13133ProForAct ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String subGridlevel_procesos_Class ;
   private String subGridlevel_procesos_Linesclass ;
   private String ROClassString ;
   private String edtProForL_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForrbn_Jsonclick ;
   private String edtProforFabs_Jsonclick ;
   private String edtProFoNPrg_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_procesos_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean n2838ForRelBan ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_proforcod_Isgriditem ;
   private boolean Combo_proforcod_Emptyitem ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Barradeprogreso_Enabled ;
   private boolean Barradeprogreso_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_proforcod_Enabled ;
   private boolean Combo_proforcod_Visible ;
   private boolean Combo_proforcod_Allowmultipleselection ;
   private boolean Combo_proforcod_Hasdescription ;
   private boolean Combo_proforcod_Includeonlyselectedoption ;
   private boolean Combo_proforcod_Includeselectalloption ;
   private boolean Combo_proforcod_Includeaddnewoption ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n407EmprNom ;
   private boolean n1159ForUltLin ;
   private boolean n5742ForSerDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV29Texto_i ;
   private String AV27ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_procesosContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_procesosRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_procesosColumn ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbProForFR ;
   private IDataStoreProvider pr_default ;
   private String[] T01QQ7_A407EmprNom ;
   private boolean[] T01QQ7_n407EmprNom ;
   private String[] T01QQ8_A279CliNom ;
   private String[] T01QQ11_A494ForSer ;
   private boolean[] T01QQ11_n494ForSer ;
   private String[] T01QQ11_A482ForColNom ;
   private boolean[] T01QQ11_n482ForColNom ;
   private int[] T01QQ11_A483ForColNum ;
   private boolean[] T01QQ11_n483ForColNum ;
   private String[] T01QQ11_A407EmprNom ;
   private boolean[] T01QQ11_n407EmprNom ;
   private String[] T01QQ11_A279CliNom ;
   private String[] T01QQ11_A5742ForSerDsc ;
   private boolean[] T01QQ11_n5742ForSerDsc ;
   private short[] T01QQ11_A1159ForUltLin ;
   private boolean[] T01QQ11_n1159ForUltLin ;
   private java.math.BigDecimal[] T01QQ11_A2838ForRelBan ;
   private boolean[] T01QQ11_n2838ForRelBan ;
   private String[] T01QQ11_A396EmprCod ;
   private int[] T01QQ11_A252CliCod ;
   private boolean[] T01QQ11_n252CliCod ;
   private int[] T01QQ11_A486ForNumCol ;
   private byte[] T01QQ11_A831TipColCod ;
   private boolean[] T01QQ11_n831TipColCod ;
   private String[] T01QQ9_A396EmprCod ;
   private String[] T01QQ10_A396EmprCod ;
   private String[] T01QQ12_A407EmprNom ;
   private boolean[] T01QQ12_n407EmprNom ;
   private String[] T01QQ13_A396EmprCod ;
   private String[] T01QQ14_A279CliNom ;
   private String[] T01QQ15_A396EmprCod ;
   private String[] T01QQ16_A396EmprCod ;
   private int[] T01QQ16_A252CliCod ;
   private boolean[] T01QQ16_n252CliCod ;
   private String[] T01QQ16_A494ForSer ;
   private boolean[] T01QQ16_n494ForSer ;
   private String[] T01QQ16_A482ForColNom ;
   private boolean[] T01QQ16_n482ForColNom ;
   private int[] T01QQ16_A483ForColNum ;
   private boolean[] T01QQ16_n483ForColNum ;
   private byte[] T01QQ16_A831TipColCod ;
   private boolean[] T01QQ16_n831TipColCod ;
   private String[] T01QQ6_A494ForSer ;
   private boolean[] T01QQ6_n494ForSer ;
   private String[] T01QQ6_A482ForColNom ;
   private boolean[] T01QQ6_n482ForColNom ;
   private int[] T01QQ6_A483ForColNum ;
   private boolean[] T01QQ6_n483ForColNum ;
   private String[] T01QQ6_A5742ForSerDsc ;
   private boolean[] T01QQ6_n5742ForSerDsc ;
   private short[] T01QQ6_A1159ForUltLin ;
   private boolean[] T01QQ6_n1159ForUltLin ;
   private java.math.BigDecimal[] T01QQ6_A2838ForRelBan ;
   private boolean[] T01QQ6_n2838ForRelBan ;
   private String[] T01QQ6_A396EmprCod ;
   private int[] T01QQ6_A252CliCod ;
   private boolean[] T01QQ6_n252CliCod ;
   private int[] T01QQ6_A486ForNumCol ;
   private byte[] T01QQ6_A831TipColCod ;
   private boolean[] T01QQ6_n831TipColCod ;
   private String[] T01QQ17_A396EmprCod ;
   private int[] T01QQ17_A252CliCod ;
   private boolean[] T01QQ17_n252CliCod ;
   private String[] T01QQ17_A494ForSer ;
   private boolean[] T01QQ17_n494ForSer ;
   private String[] T01QQ17_A482ForColNom ;
   private boolean[] T01QQ17_n482ForColNom ;
   private int[] T01QQ17_A483ForColNum ;
   private boolean[] T01QQ17_n483ForColNum ;
   private byte[] T01QQ17_A831TipColCod ;
   private boolean[] T01QQ17_n831TipColCod ;
   private String[] T01QQ18_A396EmprCod ;
   private int[] T01QQ18_A252CliCod ;
   private boolean[] T01QQ18_n252CliCod ;
   private String[] T01QQ18_A494ForSer ;
   private boolean[] T01QQ18_n494ForSer ;
   private String[] T01QQ18_A482ForColNom ;
   private boolean[] T01QQ18_n482ForColNom ;
   private int[] T01QQ18_A483ForColNum ;
   private boolean[] T01QQ18_n483ForColNum ;
   private byte[] T01QQ18_A831TipColCod ;
   private boolean[] T01QQ18_n831TipColCod ;
   private String[] T01QQ5_A494ForSer ;
   private boolean[] T01QQ5_n494ForSer ;
   private String[] T01QQ5_A482ForColNom ;
   private boolean[] T01QQ5_n482ForColNom ;
   private int[] T01QQ5_A483ForColNum ;
   private boolean[] T01QQ5_n483ForColNum ;
   private String[] T01QQ5_A5742ForSerDsc ;
   private boolean[] T01QQ5_n5742ForSerDsc ;
   private short[] T01QQ5_A1159ForUltLin ;
   private boolean[] T01QQ5_n1159ForUltLin ;
   private java.math.BigDecimal[] T01QQ5_A2838ForRelBan ;
   private boolean[] T01QQ5_n2838ForRelBan ;
   private String[] T01QQ5_A396EmprCod ;
   private int[] T01QQ5_A252CliCod ;
   private boolean[] T01QQ5_n252CliCod ;
   private int[] T01QQ5_A486ForNumCol ;
   private byte[] T01QQ5_A831TipColCod ;
   private boolean[] T01QQ5_n831TipColCod ;
   private String[] T01QQ22_A407EmprNom ;
   private boolean[] T01QQ22_n407EmprNom ;
   private String[] T01QQ23_A279CliNom ;
   private String[] T01QQ24_A396EmprCod ;
   private int[] T01QQ24_A252CliCod ;
   private boolean[] T01QQ24_n252CliCod ;
   private String[] T01QQ24_A494ForSer ;
   private boolean[] T01QQ24_n494ForSer ;
   private String[] T01QQ24_A482ForColNom ;
   private boolean[] T01QQ24_n482ForColNom ;
   private int[] T01QQ24_A483ForColNum ;
   private boolean[] T01QQ24_n483ForColNum ;
   private byte[] T01QQ24_A831TipColCod ;
   private boolean[] T01QQ24_n831TipColCod ;
   private String[] T01QQ24_A13377ForNormaID ;
   private String[] T01QQ25_A396EmprCod ;
   private int[] T01QQ25_A252CliCod ;
   private boolean[] T01QQ25_n252CliCod ;
   private String[] T01QQ25_A494ForSer ;
   private boolean[] T01QQ25_n494ForSer ;
   private String[] T01QQ25_A482ForColNom ;
   private boolean[] T01QQ25_n482ForColNom ;
   private int[] T01QQ25_A483ForColNum ;
   private boolean[] T01QQ25_n483ForColNum ;
   private byte[] T01QQ25_A831TipColCod ;
   private boolean[] T01QQ25_n831TipColCod ;
   private String[] T01QQ25_A3571EnsCod ;
   private String[] T01QQ26_A396EmprCod ;
   private int[] T01QQ26_A252CliCod ;
   private boolean[] T01QQ26_n252CliCod ;
   private String[] T01QQ26_A494ForSer ;
   private boolean[] T01QQ26_n494ForSer ;
   private String[] T01QQ26_A482ForColNom ;
   private boolean[] T01QQ26_n482ForColNom ;
   private int[] T01QQ26_A483ForColNum ;
   private boolean[] T01QQ26_n483ForColNum ;
   private byte[] T01QQ26_A831TipColCod ;
   private boolean[] T01QQ26_n831TipColCod ;
   private String[] T01QQ26_A7270Procod_c ;
   private int[] T01QQ26_A7272CliCod_d ;
   private String[] T01QQ27_A396EmprCod ;
   private int[] T01QQ27_A252CliCod ;
   private boolean[] T01QQ27_n252CliCod ;
   private String[] T01QQ27_A494ForSer ;
   private boolean[] T01QQ27_n494ForSer ;
   private String[] T01QQ27_A482ForColNom ;
   private boolean[] T01QQ27_n482ForColNom ;
   private int[] T01QQ27_A483ForColNum ;
   private boolean[] T01QQ27_n483ForColNum ;
   private byte[] T01QQ27_A831TipColCod ;
   private boolean[] T01QQ27_n831TipColCod ;
   private String[] T01QQ27_A6525ColAqP ;
   private String[] T01QQ28_A396EmprCod ;
   private int[] T01QQ28_A252CliCod ;
   private boolean[] T01QQ28_n252CliCod ;
   private String[] T01QQ28_A494ForSer ;
   private boolean[] T01QQ28_n494ForSer ;
   private String[] T01QQ28_A482ForColNom ;
   private boolean[] T01QQ28_n482ForColNom ;
   private int[] T01QQ28_A483ForColNum ;
   private boolean[] T01QQ28_n483ForColNum ;
   private byte[] T01QQ28_A831TipColCod ;
   private boolean[] T01QQ28_n831TipColCod ;
   private String[] T01QQ28_A7262CACPP ;
   private String[] T01QQ29_A396EmprCod ;
   private int[] T01QQ29_A252CliCod ;
   private boolean[] T01QQ29_n252CliCod ;
   private String[] T01QQ29_A494ForSer ;
   private boolean[] T01QQ29_n494ForSer ;
   private String[] T01QQ29_A482ForColNom ;
   private boolean[] T01QQ29_n482ForColNom ;
   private int[] T01QQ29_A483ForColNum ;
   private boolean[] T01QQ29_n483ForColNum ;
   private byte[] T01QQ29_A831TipColCod ;
   private boolean[] T01QQ29_n831TipColCod ;
   private byte[] T01QQ29_A6037Mq_Grupo ;
   private String[] T01QQ30_A396EmprCod ;
   private int[] T01QQ30_A252CliCod ;
   private boolean[] T01QQ30_n252CliCod ;
   private String[] T01QQ30_A494ForSer ;
   private boolean[] T01QQ30_n494ForSer ;
   private String[] T01QQ30_A482ForColNom ;
   private boolean[] T01QQ30_n482ForColNom ;
   private int[] T01QQ30_A483ForColNum ;
   private boolean[] T01QQ30_n483ForColNum ;
   private byte[] T01QQ30_A831TipColCod ;
   private boolean[] T01QQ30_n831TipColCod ;
   private String[] T01QQ30_A853For_ProC ;
   private String[] T01QQ31_A396EmprCod ;
   private int[] T01QQ31_A252CliCod ;
   private boolean[] T01QQ31_n252CliCod ;
   private String[] T01QQ31_A494ForSer ;
   private boolean[] T01QQ31_n494ForSer ;
   private String[] T01QQ31_A482ForColNom ;
   private boolean[] T01QQ31_n482ForColNom ;
   private int[] T01QQ31_A483ForColNum ;
   private boolean[] T01QQ31_n483ForColNum ;
   private byte[] T01QQ31_A831TipColCod ;
   private boolean[] T01QQ31_n831TipColCod ;
   private String[] T01QQ31_A9766ForProC ;
   private String[] T01QQ32_A396EmprCod ;
   private int[] T01QQ32_A252CliCod ;
   private boolean[] T01QQ32_n252CliCod ;
   private String[] T01QQ32_A494ForSer ;
   private boolean[] T01QQ32_n494ForSer ;
   private String[] T01QQ32_A482ForColNom ;
   private boolean[] T01QQ32_n482ForColNom ;
   private int[] T01QQ32_A483ForColNum ;
   private boolean[] T01QQ32_n483ForColNum ;
   private byte[] T01QQ32_A831TipColCod ;
   private boolean[] T01QQ32_n831TipColCod ;
   private short[] T01QQ32_A7797Sim_lin ;
   private String[] T01QQ33_A396EmprCod ;
   private int[] T01QQ33_A252CliCod ;
   private boolean[] T01QQ33_n252CliCod ;
   private String[] T01QQ33_A494ForSer ;
   private boolean[] T01QQ33_n494ForSer ;
   private String[] T01QQ33_A482ForColNom ;
   private boolean[] T01QQ33_n482ForColNom ;
   private int[] T01QQ33_A483ForColNum ;
   private boolean[] T01QQ33_n483ForColNum ;
   private byte[] T01QQ33_A831TipColCod ;
   private boolean[] T01QQ33_n831TipColCod ;
   private String[] T01QQ33_A7094Acab_Ter ;
   private String[] T01QQ34_A396EmprCod ;
   private int[] T01QQ34_A252CliCod ;
   private boolean[] T01QQ34_n252CliCod ;
   private String[] T01QQ34_A494ForSer ;
   private boolean[] T01QQ34_n494ForSer ;
   private String[] T01QQ34_A482ForColNom ;
   private boolean[] T01QQ34_n482ForColNom ;
   private int[] T01QQ34_A483ForColNum ;
   private boolean[] T01QQ34_n483ForColNum ;
   private byte[] T01QQ34_A831TipColCod ;
   private boolean[] T01QQ34_n831TipColCod ;
   private short[] T01QQ34_A3689ComForLin ;
   private String[] T01QQ35_A396EmprCod ;
   private int[] T01QQ35_A252CliCod ;
   private boolean[] T01QQ35_n252CliCod ;
   private String[] T01QQ35_A494ForSer ;
   private boolean[] T01QQ35_n494ForSer ;
   private String[] T01QQ35_A482ForColNom ;
   private boolean[] T01QQ35_n482ForColNom ;
   private int[] T01QQ35_A483ForColNum ;
   private boolean[] T01QQ35_n483ForColNum ;
   private byte[] T01QQ35_A831TipColCod ;
   private boolean[] T01QQ35_n831TipColCod ;
   private byte[] T01QQ35_A1519RecCorLin ;
   private String[] T01QQ36_A396EmprCod ;
   private String[] T01QQ36_A910Workstat ;
   private short[] T01QQ36_A880EscLin ;
   private String[] T01QQ37_A396EmprCod ;
   private int[] T01QQ37_A252CliCod ;
   private boolean[] T01QQ37_n252CliCod ;
   private String[] T01QQ37_A494ForSer ;
   private boolean[] T01QQ37_n494ForSer ;
   private String[] T01QQ37_A482ForColNom ;
   private boolean[] T01QQ37_n482ForColNom ;
   private int[] T01QQ37_A483ForColNum ;
   private boolean[] T01QQ37_n483ForColNum ;
   private byte[] T01QQ37_A831TipColCod ;
   private boolean[] T01QQ37_n831TipColCod ;
   private short[] T01QQ37_A650ObsLin ;
   private String[] T01QQ38_A396EmprCod ;
   private int[] T01QQ38_A252CliCod ;
   private boolean[] T01QQ38_n252CliCod ;
   private String[] T01QQ38_A494ForSer ;
   private boolean[] T01QQ38_n494ForSer ;
   private String[] T01QQ38_A482ForColNom ;
   private boolean[] T01QQ38_n482ForColNom ;
   private int[] T01QQ38_A483ForColNum ;
   private boolean[] T01QQ38_n483ForColNum ;
   private byte[] T01QQ38_A831TipColCod ;
   private boolean[] T01QQ38_n831TipColCod ;
   private String[] T01QQ39_A494ForSer ;
   private boolean[] T01QQ39_n494ForSer ;
   private String[] T01QQ39_A482ForColNom ;
   private boolean[] T01QQ39_n482ForColNom ;
   private int[] T01QQ39_A483ForColNum ;
   private boolean[] T01QQ39_n483ForColNum ;
   private byte[] T01QQ39_A831TipColCod ;
   private boolean[] T01QQ39_n831TipColCod ;
   private short[] T01QQ39_A1160ProForL ;
   private java.math.BigDecimal[] T01QQ39_A8656ProForrbn ;
   private short[] T01QQ39_A10542ProForH2O ;
   private String[] T01QQ39_A766ProForDsc ;
   private String[] T01QQ39_A6549ProForFR ;
   private int[] T01QQ39_A7802ProFoNPrg ;
   private int[] T01QQ39_A9704ProForVol ;
   private String[] T01QQ39_A9707ProForMq ;
   private String[] T01QQ39_A13133ProForAct ;
   private java.math.BigDecimal[] T01QQ39_A14198ProforFabs ;
   private String[] T01QQ39_A396EmprCod ;
   private String[] T01QQ39_A764ProForCod ;
   private int[] T01QQ39_A252CliCod ;
   private boolean[] T01QQ39_n252CliCod ;
   private String[] T01QQ4_A766ProForDsc ;
   private String[] T01QQ4_A13133ProForAct ;
   private String[] T01QQ40_A766ProForDsc ;
   private String[] T01QQ40_A13133ProForAct ;
   private String[] T01QQ41_A396EmprCod ;
   private int[] T01QQ41_A252CliCod ;
   private boolean[] T01QQ41_n252CliCod ;
   private String[] T01QQ41_A494ForSer ;
   private boolean[] T01QQ41_n494ForSer ;
   private String[] T01QQ41_A482ForColNom ;
   private boolean[] T01QQ41_n482ForColNom ;
   private int[] T01QQ41_A483ForColNum ;
   private boolean[] T01QQ41_n483ForColNum ;
   private byte[] T01QQ41_A831TipColCod ;
   private boolean[] T01QQ41_n831TipColCod ;
   private short[] T01QQ41_A1160ProForL ;
   private String[] T01QQ3_A494ForSer ;
   private boolean[] T01QQ3_n494ForSer ;
   private String[] T01QQ3_A482ForColNom ;
   private boolean[] T01QQ3_n482ForColNom ;
   private int[] T01QQ3_A483ForColNum ;
   private boolean[] T01QQ3_n483ForColNum ;
   private byte[] T01QQ3_A831TipColCod ;
   private boolean[] T01QQ3_n831TipColCod ;
   private short[] T01QQ3_A1160ProForL ;
   private java.math.BigDecimal[] T01QQ3_A8656ProForrbn ;
   private short[] T01QQ3_A10542ProForH2O ;
   private String[] T01QQ3_A6549ProForFR ;
   private int[] T01QQ3_A7802ProFoNPrg ;
   private int[] T01QQ3_A9704ProForVol ;
   private String[] T01QQ3_A9707ProForMq ;
   private java.math.BigDecimal[] T01QQ3_A14198ProforFabs ;
   private String[] T01QQ3_A396EmprCod ;
   private String[] T01QQ3_A764ProForCod ;
   private int[] T01QQ3_A252CliCod ;
   private boolean[] T01QQ3_n252CliCod ;
   private String[] T01QQ2_A494ForSer ;
   private boolean[] T01QQ2_n494ForSer ;
   private String[] T01QQ2_A482ForColNom ;
   private boolean[] T01QQ2_n482ForColNom ;
   private int[] T01QQ2_A483ForColNum ;
   private boolean[] T01QQ2_n483ForColNum ;
   private byte[] T01QQ2_A831TipColCod ;
   private boolean[] T01QQ2_n831TipColCod ;
   private short[] T01QQ2_A1160ProForL ;
   private java.math.BigDecimal[] T01QQ2_A8656ProForrbn ;
   private short[] T01QQ2_A10542ProForH2O ;
   private String[] T01QQ2_A6549ProForFR ;
   private int[] T01QQ2_A7802ProFoNPrg ;
   private int[] T01QQ2_A9704ProForVol ;
   private String[] T01QQ2_A9707ProForMq ;
   private java.math.BigDecimal[] T01QQ2_A14198ProforFabs ;
   private String[] T01QQ2_A396EmprCod ;
   private String[] T01QQ2_A764ProForCod ;
   private int[] T01QQ2_A252CliCod ;
   private boolean[] T01QQ2_n252CliCod ;
   private String[] T01QQ45_A766ProForDsc ;
   private String[] T01QQ45_A13133ProForAct ;
   private String[] T01QQ46_A396EmprCod ;
   private int[] T01QQ46_A252CliCod ;
   private boolean[] T01QQ46_n252CliCod ;
   private String[] T01QQ46_A494ForSer ;
   private boolean[] T01QQ46_n494ForSer ;
   private String[] T01QQ46_A482ForColNom ;
   private boolean[] T01QQ46_n482ForColNom ;
   private int[] T01QQ46_A483ForColNum ;
   private boolean[] T01QQ46_n483ForColNum ;
   private byte[] T01QQ46_A831TipColCod ;
   private boolean[] T01QQ46_n831TipColCod ;
   private short[] T01QQ46_A1160ProForL ;
   private String[] T01QQ47_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26ProForCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class mtoformulastinte_procesos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mtoformulastinte_procesos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mtoformulastinte_procesos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mtoformulastinte_procesos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mtoformulastinte_procesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QQ2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForrbn, ProForH2O, ProForFR, ProFoNPrg, ProForVol, ProForMq, ProforFabs, EmprCod, ProForCod, CliCod FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?  FOR UPDATE OF ProForrbn, ProForH2O, ProForFR, ProFoNPrg, ProForVol, ProForMq, ProforFabs, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForrbn, ProForH2O, ProForFR, ProFoNPrg, ProForVol, ProForMq, ProforFabs, EmprCod, ProForCod, CliCod FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ4", "SELECT ProForDsc, ProForAct FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ5", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, ForUltLin, ForRelBan, EmprCod, CliCod, ForNumCol, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ForSerDsc, ForUltLin, ForRelBan, ForNumCol NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ6", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, ForUltLin, ForRelBan, EmprCod, CliCod, ForNumCol, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ9", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ10", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ11", "SELECT /*+ FIRST_ROWS(100) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, T2.EmprNom, T3.CliNom, TM1.ForSerDsc, TM1.ForUltLin, TM1.ForRelBan, TM1.EmprCod, TM1.CliCod, TM1.ForNumCol, TM1.TipColCod FROM ((TXPCFORMU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ13", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ15", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ForSer > ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom > ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum > ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod > ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ForSer < ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom < ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum < ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QQ19", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, ForSerDsc, ForUltLin, ForRelBan, EmprCod, CliCod, ForNumCol, TipColCod, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01QQ20", "UPDATE TXPCFORMU SET ForSerDsc=?, ForUltLin=?, ForRelBan=?, ForNumCol=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01QQ21", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T01QQ22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ23", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ24", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ25", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ26", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ27", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ28", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ29", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ30", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ31", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ32", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ33", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ34", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ35", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ36", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ37", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QQ38", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ39", "SELECT T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL, T1.ProForrbn, T1.ProForH2O, T2.ProForDsc, T1.ProForFR, T1.ProFoNPrg, T1.ProForVol, T1.ProForMq, T2.ProForAct, T1.ProforFabs, T1.EmprCod, T1.ProForCod, T1.CliCod FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.ProForL = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ40", "SELECT ProForDsc, ProForAct FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ41", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01QQ42", "INSERT INTO TXPLFORMU(ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForrbn, ProForH2O, ProForFR, ProFoNPrg, ProForVol, ProForMq, ProforFabs, EmprCod, ProForCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLFORMU")
         ,new UpdateCursor("T01QQ43", "UPDATE TXPLFORMU SET ProForrbn=?, ProForH2O=?, ProForFR=?, ProFoNPrg=?, ProForVol=?, ProForMq=?, ProforFabs=?, ProForCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK, "TXPLFORMU")
         ,new UpdateCursor("T01QQ44", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK, "TXPLFORMU")
         ,new ForEachCursor("T01QQ45", "SELECT ProForDsc, ProForAct FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ46", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QQ47", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((String[]) buf[15])[0] = rslt.getString(16, 6);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 45 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 15 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               stmt.setString(9, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 13);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[21]).intValue());
               }
               stmt.setString(14, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 13);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[30], 16);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[32]).intValue());
               }
               stmt.setString(20, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[35]).byteValue());
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               stmt.setString(9, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 13);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[21]).intValue());
               }
               stmt.setString(14, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 13);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[30], 16);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[32]).intValue());
               }
               stmt.setString(20, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[35]).byteValue());
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               stmt.setInt(9, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[17]).byteValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setString(5, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[17]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setInt(10, ((Number) parms[13]).intValue());
               stmt.setString(11, (String)parms[14], 6);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(13, (String)parms[16], 3);
               stmt.setString(14, (String)parms[17], 6);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[19]).intValue());
               }
               return;
            case 41 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[18]).byteValue());
               }
               stmt.setShort(15, ((Number) parms[19]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 45 :
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

