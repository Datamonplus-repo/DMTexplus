package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class numerodeprogramaautomata_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6096MacNumPrg = (int)(GXutil.lval( httpContext.GetPar( "MacNumPrg"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         AV25Msg_er = httpContext.GetPar( "Msg_er") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Msg_er", AV25Msg_er);
         AV16Nprog = (short)(GXutil.lval( httpContext.GetPar( "Nprog"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Nprog", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Nprog), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1RO214( A396EmprCod, A6096MacNumPrg, AV25Msg_er, AV16Nprog) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13463MacProPrg2 = httpContext.GetPar( "MacProPrg2") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         AV17ExiPrg = (short)(GXutil.lval( httpContext.GetPar( "ExiPrg"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
         AV15Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Carvitin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_18_1RO214( A396EmprCod, A13463MacProPrg2, AV17ExiPrg, AV15Carvitin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13464MacProPrg3 = httpContext.GetPar( "MacProPrg3") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         AV17ExiPrg = (short)(GXutil.lval( httpContext.GetPar( "ExiPrg"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
         AV15Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Carvitin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_19_1RO214( A396EmprCod, A13464MacProPrg3, AV17ExiPrg, AV15Carvitin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.GetPar( "MacProCod") ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         AV12Noigual = (short)(GXutil.lval( httpContext.GetPar( "Noigual"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Noigual", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Noigual), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1RO214( Gx_mode, A396EmprCod, A1514MacProCod, AV12Noigual) ;
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
         xc_25_1RO214( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"MACTOTTIE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.GetPar( "MacProCod") ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asamactottie1RO214( A396EmprCod, A1514MacProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa7691RO214( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa125341RO214( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.GetPar( "MacProCod") ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A1514MacProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
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
         gxload_38( A396EmprCod, A764ProForCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_procesosquimicos") == 0 )
      {
         gxnrgridlevel_procesosquimicos_newrow_invoke( ) ;
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
            AV20EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
            AV21MacProCod = httpContext.GetPar( "MacProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21MacProCod", AV21MacProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21MacProCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Numero de Programa Automata", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMacProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_procesosquimicos_newrow_invoke( )
   {
      nRC_GXsfl_84 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_84"))) ;
      nGXsfl_84_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_84_idx"))) ;
      sGXsfl_84_idx = httpContext.GetPar( "sGXsfl_84_idx") ;
      edtMacPrgNum_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Visible), 5, 0), !bGXsfl_84_Refreshing);
      A1516MacProULin = (short)(GXutil.lval( httpContext.GetPar( "MacProULin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_procesosquimicos_newrow( ) ;
      /* End function gxnrGridlevel_procesosquimicos_newrow_invoke */
   }

   public numerodeprogramaautomata_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public numerodeprogramaautomata_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( numerodeprogramaautomata_impl.class ));
   }

   public numerodeprogramaautomata_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProCod_Internalname, httpContext.getMessage( "Nº de Programa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCod_Internalname, GXutil.rtrim( A1514MacProCod), GXutil.rtrim( localUtil.format( A1514MacProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc_Internalname, GXutil.rtrim( A1515MacProDsc), GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProDsc2_Internalname, httpContext.getMessage( "Descripcion (large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc2_Internalname, GXutil.rtrim( A6231MacProDsc2), GXutil.rtrim( localUtil.format( A6231MacProDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProDsc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProMat_Internalname, GXutil.rtrim( A5425MacProMat), GXutil.rtrim( localUtil.format( A5425MacProMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProTmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProTmx_Internalname, httpContext.getMessage( "Temperatura Max.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A5424MacProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacProTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5424MacProTmx), "ZZZZ") : localUtil.format( DecimalUtil.doubleToDec(A5424MacProTmx), "ZZZZ"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProTmx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacTotTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacTotTie_Internalname, httpContext.getMessage( "Tiempo Concedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacTotTie_Internalname, GXutil.ltrim( localUtil.ntoc( A3602MacTotTie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacTotTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3602MacTotTie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3602MacTotTie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacTotTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacTotTie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacNumPrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacNumPrg_Internalname, httpContext.getMessage( "Nº Programa Centralizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacNumPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacNumPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6096MacNumPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6096MacNumPrg), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacNumPrg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacNumPrg_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMackgttin_cell_Internalname, 1, 0, "px", 0, "px", divMackgttin_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMacKgTTin_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacKgTTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacKgTTin_Internalname, httpContext.getMessage( "Lavar LItros p/kg", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacKgTTin_Internalname, GXutil.ltrim( localUtil.ntoc( A12534MacKgTTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacKgTTin_Enabled!=0) ? localUtil.format( A12534MacKgTTin, "ZZZZZ9.99") : localUtil.format( A12534MacKgTTin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacKgTTin_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMacKgTTin_Visible, edtMacKgTTin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable4_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable4_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
      ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
      ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
      ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
      ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
      ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
      ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
      ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
      ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
      ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
      ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProPrg2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProPrg2_Internalname, httpContext.getMessage( "Programa 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProPrg2_Internalname, GXutil.rtrim( A13463MacProPrg2), GXutil.rtrim( localUtil.format( A13463MacProPrg2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProPrg2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProPrg2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProPrg3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProPrg3_Internalname, httpContext.getMessage( "Programa 3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProPrg3_Internalname, GXutil.rtrim( A13464MacProPrg3), GXutil.rtrim( localUtil.format( A13464MacProPrg3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProPrg3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProPrg3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_procesosquimicos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_procesosquimicos( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV33Pgmname), GXutil.rtrim( localUtil.format( AV33Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\NumerodeProgramaAutomata.htm");
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
      /* User Defined Control */
      ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
      ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
      ucCombo_proforcod.setProperty("IsGridItem", Combo_proforcod_Isgriditem);
      ucCombo_proforcod.setProperty("EmptyItem", Combo_proforcod_Emptyitem);
      ucCombo_proforcod.setProperty("DropDownOptionsData", AV28ProForCod_Data);
      ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_procesosquimicos( )
   {
      /*  Grid Control  */
      startgridcontrol84( ) ;
      nGXsfl_84_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount215 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_215 = (short)(1) ;
            scanStart1RO215( ) ;
            while ( RcdFound215 != 0 )
            {
               init_level_properties215( ) ;
               getByPrimaryKey1RO215( ) ;
               addRow1RO215( ) ;
               scanNext1RO215( ) ;
            }
            scanEnd1RO215( ) ;
            nBlankRcdCount215 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1516MacProULin = A1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         B6097MacSumTim = A6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         B12534MacKgTTin = A12534MacKgTTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         B1515MacProDsc = A1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         standaloneNotModal1RO215( ) ;
         standaloneModal1RO215( ) ;
         sMode215 = Gx_mode ;
         while ( nGXsfl_84_idx < nRC_GXsfl_84 )
         {
            bGXsfl_84_Refreshing = true ;
            readRow1RO215( ) ;
            edtMacProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACPROLIN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtProForTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTIE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtProForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTMX_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtProForMat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORMAT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtProForMat_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORMAT_"+sGXsfl_84_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Visible), 5, 0), !bGXsfl_84_Refreshing);
            edtMacPrgNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACPRGNUM_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMacPrgNum_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MACPRGNUM_"+sGXsfl_84_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Visible), 5, 0), !bGXsfl_84_Refreshing);
            edtMacPrdTt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACPRDTT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacPrdTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrdTt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMacRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACRB_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacRb_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMacNH2O_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACNH2O_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNH2O_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            if ( ( nRcdExists_215 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RO215( ) ;
            }
            sendRow1RO215( ) ;
            bGXsfl_84_Refreshing = false ;
         }
         Gx_mode = sMode215 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1516MacProULin = B1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         A6097MacSumTim = B6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         A12534MacKgTTin = B12534MacKgTTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A1515MacProDsc = B1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount215 = (short)(5) ;
         nRcdExists_215 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RO215( ) ;
            while ( RcdFound215 != 0 )
            {
               sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_84215( ) ;
               init_level_properties215( ) ;
               standaloneNotModal1RO215( ) ;
               getByPrimaryKey1RO215( ) ;
               standaloneModal1RO215( ) ;
               addRow1RO215( ) ;
               scanNext1RO215( ) ;
            }
            scanEnd1RO215( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode215 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_84215( ) ;
         initAll1RO215( ) ;
         init_level_properties215( ) ;
         B1516MacProULin = A1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         B6097MacSumTim = A6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         B12534MacKgTTin = A12534MacKgTTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         B1515MacProDsc = A1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         nRcdExists_215 = (short)(0) ;
         nIsMod_215 = (short)(0) ;
         nRcdDeleted_215 = (short)(0) ;
         nBlankRcdCount215 = (short)(nBlankRcdUsr215+nBlankRcdCount215) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount215 > 0 )
         {
            standaloneNotModal1RO215( ) ;
            standaloneModal1RO215( ) ;
            addRow1RO215( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMacProLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount215 = (short)(nBlankRcdCount215-1) ;
         }
         Gx_mode = sMode215 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1516MacProULin = B1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         A6097MacSumTim = B6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         A12534MacKgTTin = B12534MacKgTTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A1515MacProDsc = B1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_procesosquimicosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_procesosquimicos", Gridlevel_procesosquimicosContainer, subGridlevel_procesosquimicos_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_procesosquimicosContainerData", Gridlevel_procesosquimicosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_procesosquimicosContainerData"+"V", Gridlevel_procesosquimicosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_procesosquimicosContainerData"+"V"+"\" value='"+Gridlevel_procesosquimicosContainer.GridValuesHidden()+"'/>") ;
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
      e111RO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV28ProForCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1514MacProCod = httpContext.cgiGet( "Z1514MacProCod") ;
            Z1515MacProDsc = httpContext.cgiGet( "Z1515MacProDsc") ;
            Z6231MacProDsc2 = httpContext.cgiGet( "Z6231MacProDsc2") ;
            Z6096MacNumPrg = (int)(localUtil.ctol( httpContext.cgiGet( "Z6096MacNumPrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12534MacKgTTin = localUtil.ctond( httpContext.cgiGet( "Z12534MacKgTTin")) ;
            Z13463MacProPrg2 = httpContext.cgiGet( "Z13463MacProPrg2") ;
            Z13464MacProPrg3 = httpContext.cgiGet( "Z13464MacProPrg3") ;
            Z1516MacProULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1516MacProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5424MacProTmx = (short)(localUtil.ctol( httpContext.cgiGet( "Z5424MacProTmx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5425MacProMat = httpContext.cgiGet( "Z5425MacProMat") ;
            A1516MacProULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1516MacProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1516MacProULin = (short)(localUtil.ctol( httpContext.cgiGet( "O1516MacProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6097MacSumTim = (int)(localUtil.ctol( httpContext.cgiGet( "O6097MacSumTim"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12534MacKgTTin = localUtil.ctond( httpContext.cgiGet( "O12534MacKgTTin")) ;
            O1515MacProDsc = httpContext.cgiGet( "O1515MacProDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_84 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A13755MacProCDsc = httpContext.cgiGet( "MACPROCDSC") ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV21MacProCod = httpContext.cgiGet( "vMACPROCOD") ;
            AV19Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV14jpf = (short)(localUtil.ctol( httpContext.cgiGet( "vJPF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Modif2 = httpContext.cgiGet( "vMODIF2") ;
            AV25Msg_er = httpContext.cgiGet( "vMSG_ER") ;
            AV16Nprog = (short)(localUtil.ctol( httpContext.cgiGet( "vNPROG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17ExiPrg = (short)(localUtil.ctol( httpContext.cgiGet( "vEXIPRG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15Carvitin = (short)(localUtil.ctol( httpContext.cgiGet( "vCARVITIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV12Noigual = (short)(localUtil.ctol( httpContext.cgiGet( "vNOIGUAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV7Station = httpContext.cgiGet( "vSTATION") ;
            A1516MacProULin = (short)(localUtil.ctol( httpContext.cgiGet( "MACPROULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A6097MacSumTim = (int)(localUtil.ctol( httpContext.cgiGet( "MACSUMTIM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Modif = httpContext.cgiGet( "vMODIF") ;
            A766ProForDsc = httpContext.cgiGet( "PROFORDSC") ;
            Dvpanel_unnamedtable4_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Objectcall") ;
            Dvpanel_unnamedtable4_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Class") ;
            Dvpanel_unnamedtable4_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Enabled")) ;
            Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
            Dvpanel_unnamedtable4_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Height") ;
            Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
            Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
            Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
            Dvpanel_unnamedtable4_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showheader")) ;
            Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
            Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
            Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
            Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
            Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
            Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
            Dvpanel_unnamedtable4_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Visible")) ;
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
            A1514MacProCod = httpContext.cgiGet( edtMacProCod_Internalname) ;
            n1514MacProCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            A1515MacProDsc = httpContext.cgiGet( edtMacProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
            A6231MacProDsc2 = httpContext.cgiGet( edtMacProDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
            A5425MacProMat = httpContext.cgiGet( edtMacProMat_Internalname) ;
            n5425MacProMat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5425MacProMat", A5425MacProMat);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacProTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacProTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACPROTMX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMacProTmx_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5424MacProTmx = (short)(0) ;
               n5424MacProTmx = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5424MacProTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5424MacProTmx), 4, 0));
            }
            else
            {
               A5424MacProTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtMacProTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5424MacProTmx = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5424MacProTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5424MacProTmx), 4, 0));
            }
            A3602MacTotTie = (int)(localUtil.ctol( httpContext.cgiGet( edtMacTotTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacNumPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacNumPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACNUMPRG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMacNumPrg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6096MacNumPrg = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
            }
            else
            {
               A6096MacNumPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtMacNumPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacKgTTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacKgTTin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACKGTTIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMacKgTTin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12534MacKgTTin = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
            }
            else
            {
               A12534MacKgTTin = localUtil.ctond( httpContext.cgiGet( edtMacKgTTin_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
            }
            A13463MacProPrg2 = httpContext.cgiGet( edtMacProPrg2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
            A13464MacProPrg3 = httpContext.cgiGet( edtMacProPrg3_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
            AV33Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"NumerodeProgramaAutomata");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\numerodeprogramaautomata:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1514MacProCod = httpContext.GetPar( "MacProCod") ;
               n1514MacProCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
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
                  sMode214 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode214 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound214 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RO0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MACPROCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacProCod_Internalname ;
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
                        e111RO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RO2 ();
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
         e121RO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RO214( ) ;
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
         disableAttributes1RO214( ) ;
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

   public void confirm_1RO0( )
   {
      beforeValidate1RO214( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RO214( ) ;
         }
         else
         {
            checkExtendedTable1RO214( ) ;
            closeExtendedTableCursors1RO214( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode214 = Gx_mode ;
         confirm_1RO215( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode214 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode214 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1RO215( )
   {
      s1516MacProULin = O1516MacProULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      s6097MacSumTim = O6097MacSumTim ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      sV26Modif = OV26Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      nGXsfl_84_idx = 0 ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         readRow1RO215( ) ;
         if ( ( nRcdExists_215 != 0 ) || ( nIsMod_215 != 0 ) )
         {
            getKey1RO215( ) ;
            if ( ( nRcdExists_215 == 0 ) && ( nRcdDeleted_215 == 0 ) )
            {
               if ( RcdFound215 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RO215( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RO215( ) ;
                     closeExtendedTableCursors1RO215( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1516MacProULin = A1516MacProULin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
                     O6097MacSumTim = A6097MacSumTim ;
                     n6097MacSumTim = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
                     OV26Modif = AV26Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
                  }
               }
               else
               {
                  GXCCtl = "MACPROLIN_" + sGXsfl_84_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMacProLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound215 != 0 )
               {
                  if ( nRcdDeleted_215 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RO215( ) ;
                     load1RO215( ) ;
                     beforeValidate1RO215( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RO215( ) ;
                        O1516MacProULin = A1516MacProULin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
                        O6097MacSumTim = A6097MacSumTim ;
                        n6097MacSumTim = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
                        OV26Modif = AV26Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_215 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RO215( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RO215( ) ;
                           closeExtendedTableCursors1RO215( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1516MacProULin = A1516MacProULin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
                           O6097MacSumTim = A6097MacSumTim ;
                           n6097MacSumTim = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
                           OV26Modif = AV26Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_215 == 0 )
                  {
                     GXCCtl = "MACPROLIN_" + sGXsfl_84_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMacProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForMat_Internalname, GXutil.rtrim( A769ProForMat)) ;
         httpContext.changePostValue( edtMacPrgNum_Internalname, GXutil.ltrim( localUtil.ntoc( A7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacPrdTt_Internalname, GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacRb_Internalname, GXutil.ltrim( localUtil.ntoc( A10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacNH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1517MacProLin_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8011MacPrdTt_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7787MacPrgNum_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10549MacRb_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10550MacNH2O_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_84_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "T764ProForCod_"+sGXsfl_84_idx, GXutil.rtrim( O764ProForCod)) ;
         httpContext.changePostValue( "T8011MacPrdTt_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_215_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_215_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_215_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_215 != 0 )
         {
            httpContext.changePostValue( "MACPROLIN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTIE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTMX_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORMAT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORMAT_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForMat_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACPRGNUM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACPRGNUM_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACPRDTT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrdTt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACRB_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACNH2O_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacNH2O_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1516MacProULin = s1516MacProULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      O6097MacSumTim = s6097MacSumTim ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      OV26Modif = sV26Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RO0( )
   {
   }

   public void e111RO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      numerodeprogramaautomata_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      numerodeprogramaautomata_impl.this.AV20EmprCod = GXv_char2[0] ;
      numerodeprogramaautomata_impl.this.AV8EmprNom = GXv_char3[0] ;
      numerodeprogramaautomata_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXv_SdtWWPContext5[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV22WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_proforcod_Titlecontrolidtoreplace = edtProForCod_Internalname ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "TitleControlIdToReplace", Combo_proforcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPROFORCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV23TrnContext.fromxml(AV24WebSession.getValue("TrnContext"), null, null);
      GXt_int6 = (byte)(AV10F_CMACPR) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CMACPR", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV10F_CMACPR = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10F_CMACPR", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10F_CMACPR), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vF_CMACPR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10F_CMACPR), "ZZZ9")));
      GXt_int8 = AV11Num_l ;
      GXv_int9[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CMACPR", ""), GXv_int9) ;
      numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
      AV11Num_l = (short)(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Num_l", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Num_l), 4, 0));
      GXt_int6 = (byte)(AV12Noigual) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "MPNPQ", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV12Noigual = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Noigual", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Noigual), 4, 0));
      GXt_int6 = (byte)(AV13Eliot) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV13Eliot = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Eliot", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Eliot), 4, 0));
      GXt_int6 = (byte)(AV14jpf) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "JPF", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV14jpf = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14jpf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14jpf), 4, 0));
      GXt_int6 = (byte)(AV15Carvitin) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV15Carvitin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Carvitin), 4, 0));
      GXt_int6 = (byte)(AV16Nprog) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "PRGNRO", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV16Nprog = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Nprog", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Nprog), 4, 0));
      GXt_int6 = (byte)(AV31moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      AV31moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31moda21), "ZZZ9")));
      edtMacPrgNum_Visible = (((AV13Eliot==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Visible), 5, 0), !bGXsfl_84_Refreshing);
      AV26Modif = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
   }

   public void e121RO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV23TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.formulaciontinte.numerodeprogramaautomataww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( AV31moda21 == 1 )
      {
         new app.pmacprh(remoteHandle, context).execute( A396EmprCod, A1514MacProCod, Gx_mode) ;
      }
      if ( AV10F_CMACPR == 1 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.cambiodenumerodeprogramaenformulas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1514MacProCod)),GXutil.URLEncode(GXutil.rtrim(A1515MacProDsc)),GXutil.URLEncode(GXutil.rtrim(A6231MacProDsc2))}, new String[] {"EmprCod","MacProCod","MacProDsc","MacProDsc2"}) , new Object[] {"A396EmprCod","A1514MacProCod","A1515MacProDsc","A6231MacProDsc2"});
         httpContext.popup(formatLink("app.formulaciontinte.cambiodenumerodeprogramaenensayos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1514MacProCod)),GXutil.URLEncode(GXutil.rtrim(A1515MacProDsc)),GXutil.URLEncode(GXutil.rtrim(A6231MacProDsc2))}, new String[] {"EmprCod","MacProCod","MacProDsc","MacProDsc2"}) , new Object[] {"A396EmprCod","A1514MacProCod","A1515MacProDsc","A6231MacProDsc2"});
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtMacKgTTin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacKgTTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacKgTTin_Visible), 5, 0), true);
      divMackgttin_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMackgttin_cell_Internalname, "Class", divMackgttin_cell_Class, true);
      divDvpanel_unnamedtable4_cell_Class = "col-xs-12" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV28ProForCod_Data ;
      GXv_char4[0] = AV29ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.formulaciontinte.numerodeprogramaautomataloaddvcombo(remoteHandle, context).execute( "ProForCod", Gx_mode, AV20EmprCod, AV21MacProCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      numerodeprogramaautomata_impl.this.AV29ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV28ProForCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void zm1RO214( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1515MacProDsc = T01RO6_A1515MacProDsc[0] ;
            Z6231MacProDsc2 = T01RO6_A6231MacProDsc2[0] ;
            Z6096MacNumPrg = T01RO6_A6096MacNumPrg[0] ;
            Z12534MacKgTTin = T01RO6_A12534MacKgTTin[0] ;
            Z13463MacProPrg2 = T01RO6_A13463MacProPrg2[0] ;
            Z13464MacProPrg3 = T01RO6_A13464MacProPrg3[0] ;
            Z1516MacProULin = T01RO6_A1516MacProULin[0] ;
            Z5424MacProTmx = T01RO6_A5424MacProTmx[0] ;
            Z5425MacProMat = T01RO6_A5425MacProMat[0] ;
         }
         else
         {
            Z1515MacProDsc = A1515MacProDsc ;
            Z6231MacProDsc2 = A6231MacProDsc2 ;
            Z6096MacNumPrg = A6096MacNumPrg ;
            Z12534MacKgTTin = A12534MacKgTTin ;
            Z13463MacProPrg2 = A13463MacProPrg2 ;
            Z13464MacProPrg3 = A13464MacProPrg3 ;
            Z1516MacProULin = A1516MacProULin ;
            Z5424MacProTmx = A5424MacProTmx ;
            Z5425MacProMat = A5425MacProMat ;
         }
      }
      if ( GX_JID == -34 )
      {
         Z1514MacProCod = A1514MacProCod ;
         Z1515MacProDsc = A1515MacProDsc ;
         Z6231MacProDsc2 = A6231MacProDsc2 ;
         Z6096MacNumPrg = A6096MacNumPrg ;
         Z12534MacKgTTin = A12534MacKgTTin ;
         Z13463MacProPrg2 = A13463MacProPrg2 ;
         Z13464MacProPrg3 = A13464MacProPrg3 ;
         Z1516MacProULin = A1516MacProULin ;
         Z5424MacProTmx = A5424MacProTmx ;
         Z5425MacProMat = A5425MacProMat ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z6097MacSumTim = A6097MacSumTim ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "FormulacionTinte.NumerodeProgramaAutomata" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01RO7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01RO7_A407EmprNom[0] ;
      n407EmprNom = T01RO7_n407EmprNom[0] ;
      pr_default.close(5);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      edtProForMat_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Visible), 5, 0), !bGXsfl_84_Refreshing);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      edtMacKgTTin_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacKgTTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacKgTTin_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divMackgttin_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMackgttin_cell_Internalname, "Class", divMackgttin_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int7) ;
         numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divMackgttin_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMackgttin_cell_Internalname, "Class", divMackgttin_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      divUnnamedtable2_Visible = (((GXt_int6==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divDvpanel_unnamedtable4_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int7) ;
         numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divDvpanel_unnamedtable4_cell_Class = httpContext.getMessage( "col-xs-12", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV21MacProCod)==0) )
      {
         A1514MacProCod = AV21MacProCod ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      }
      if ( ! (GXutil.strcmp("", AV21MacProCod)==0) )
      {
         edtMacProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMacProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV21MacProCod)==0) )
      {
         edtMacProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
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
         /* Using cursor T01RO9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A6097MacSumTim = T01RO9_A6097MacSumTim[0] ;
            n6097MacSumTim = T01RO9_n6097MacSumTim[0] ;
         }
         else
         {
            A6097MacSumTim = 0 ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         O6097MacSumTim = A6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         pr_default.close(6);
         GXt_int8 = A3602MacTotTie ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1514MacProCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ptotmac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
         numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A3602MacTotTie = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
      }
   }

   public void load1RO214( )
   {
      /* Using cursor T01RO11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound214 = (short)(1) ;
         A1515MacProDsc = T01RO11_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6231MacProDsc2 = T01RO11_A6231MacProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
         A6096MacNumPrg = T01RO11_A6096MacNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         A12534MacKgTTin = T01RO11_A12534MacKgTTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A13463MacProPrg2 = T01RO11_A13463MacProPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         A13464MacProPrg3 = T01RO11_A13464MacProPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         A407EmprNom = T01RO11_A407EmprNom[0] ;
         n407EmprNom = T01RO11_n407EmprNom[0] ;
         A1516MacProULin = T01RO11_A1516MacProULin[0] ;
         A5424MacProTmx = T01RO11_A5424MacProTmx[0] ;
         n5424MacProTmx = T01RO11_n5424MacProTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5424MacProTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5424MacProTmx), 4, 0));
         A5425MacProMat = T01RO11_A5425MacProMat[0] ;
         n5425MacProMat = T01RO11_n5425MacProMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5425MacProMat", A5425MacProMat);
         A6097MacSumTim = T01RO11_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RO11_n6097MacSumTim[0] ;
         zm1RO214( -34) ;
      }
      pr_default.close(7);
      onLoadActions1RO214( ) ;
   }

   public void onLoadActions1RO214( )
   {
      O6097MacSumTim = A6097MacSumTim ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
      if ( GXutil.strcmp(A1515MacProDsc, O1515MacProDsc) != 0 )
      {
         AV19Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Descripcion, Old =", ""), "") + O1515MacProDsc + httpContext.getMessage( httpContext.getMessage( " New = ", ""), "") + A1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_obs", AV19Inc_obs);
      }
      GXt_int8 = A3602MacTotTie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A1514MacProCod ;
      GXv_int9[0] = GXt_int8 ;
      new app.ptotmac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9) ;
      numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
      numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
      numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      A3602MacTotTie = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
   }

   public void checkExtendedTable1RO214( )
   {
      nIsDirty_214 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_214 = (short)(1) ;
      A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
      if ( (GXutil.strcmp("", A1514MacProCod)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Codigo Incorrecto", ""), 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( AV12Noigual == 1 ) && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1514MacProCod ;
         GXv_char2[0] = AV18msg_err ;
         new app.pmpnpq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
         numerodeprogramaautomata_impl.this.AV18msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV18msg_err", AV18msg_err);
      }
      if ( true /* After */ && ( GXutil.strcmp(AV18msg_err, " ") != 0 ) && ( AV12Noigual == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV18msg_err, 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A1515MacProDsc, O1515MacProDsc) != 0 )
      {
         AV19Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Descripcion, Old =", ""), "") + O1515MacProDsc + httpContext.getMessage( httpContext.getMessage( " New = ", ""), "") + A1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_obs", AV19Inc_obs);
      }
      if ( ( A6096MacNumPrg > 0 ) && ( AV16Nprog == 1 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A6096MacNumPrg ;
         GXv_char3[0] = AV25Msg_er ;
         new app.pprogno(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         numerodeprogramaautomata_impl.this.A6096MacNumPrg = GXv_int9[0] ;
         numerodeprogramaautomata_impl.this.AV25Msg_er = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25Msg_er", AV25Msg_er);
      }
      if ( ( A6096MacNumPrg > 0 ) && ( AV16Nprog == 1 ) && ( GXutil.strcmp(AV25Msg_er, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Programa Inexistente", ""), 1, "MACNUMPRG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacNumPrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV15Carvitin == 1 ) && true /* After */ && ! (GXutil.strcmp("", A13463MacProPrg2)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A13463MacProPrg2 ;
         GXv_int7[0] = (byte)(AV17ExiPrg) ;
         new app.peximac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         numerodeprogramaautomata_impl.this.A13463MacProPrg2 = GXv_char3[0] ;
         numerodeprogramaautomata_impl.this.AV17ExiPrg = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
      }
      if ( ( AV17ExiPrg == 0 ) && ( AV15Carvitin == 1 ) && ! (GXutil.strcmp("", A13464MacProPrg3)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Programa Nº3", ""), 1, "MACPROPRG3");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProPrg3_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV17ExiPrg == 0 ) && ( AV15Carvitin == 1 ) && ! (GXutil.strcmp("", A13463MacProPrg2)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Programa Nº2", ""), 1, "MACPROPRG2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProPrg2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV15Carvitin == 1 ) && true /* After */ && ! (GXutil.strcmp("", A13464MacProPrg3)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A13464MacProPrg3 ;
         GXv_int7[0] = (byte)(AV17ExiPrg) ;
         new app.peximac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         numerodeprogramaautomata_impl.this.A13464MacProPrg3 = GXv_char3[0] ;
         numerodeprogramaautomata_impl.this.AV17ExiPrg = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
      }
      /* Using cursor T01RO9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A6097MacSumTim = T01RO9_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RO9_n6097MacSumTim[0] ;
      }
      else
      {
         nIsDirty_214 = (short)(1) ;
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      pr_default.close(6);
      nIsDirty_214 = (short)(1) ;
      GXt_int8 = A3602MacTotTie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A1514MacProCod ;
      GXv_int9[0] = GXt_int8 ;
      new app.ptotmac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9) ;
      numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
      numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
      numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      A3602MacTotTie = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
   }

   public void closeExtendedTableCursors1RO214( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_36( String A396EmprCod ,
                          String A1514MacProCod )
   {
      /* Using cursor T01RO13 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A6097MacSumTim = T01RO13_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RO13_n6097MacSumTim[0] ;
      }
      else
      {
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1RO214( )
   {
      /* Using cursor T01RO14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound214 = (short)(1) ;
      }
      else
      {
         RcdFound214 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1RO214( 34) ;
         RcdFound214 = (short)(1) ;
         A1514MacProCod = T01RO6_A1514MacProCod[0] ;
         n1514MacProCod = T01RO6_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1515MacProDsc = T01RO6_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6231MacProDsc2 = T01RO6_A6231MacProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
         A6096MacNumPrg = T01RO6_A6096MacNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         A12534MacKgTTin = T01RO6_A12534MacKgTTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A13463MacProPrg2 = T01RO6_A13463MacProPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         A13464MacProPrg3 = T01RO6_A13464MacProPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         A1516MacProULin = T01RO6_A1516MacProULin[0] ;
         A5424MacProTmx = T01RO6_A5424MacProTmx[0] ;
         n5424MacProTmx = T01RO6_n5424MacProTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5424MacProTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5424MacProTmx), 4, 0));
         A5425MacProMat = T01RO6_A5425MacProMat[0] ;
         n5425MacProMat = T01RO6_n5425MacProMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5425MacProMat", A5425MacProMat);
         A396EmprCod = T01RO6_A396EmprCod[0] ;
         O1516MacProULin = A1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         O12534MacKgTTin = A12534MacKgTTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         O1515MacProDsc = A1515MacProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         Z396EmprCod = A396EmprCod ;
         Z1514MacProCod = A1514MacProCod ;
         sMode214 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RO214( ) ;
         if ( AnyError == 1 )
         {
            RcdFound214 = (short)(0) ;
            initializeNonKey1RO214( ) ;
         }
         Gx_mode = sMode214 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound214 = (short)(0) ;
         initializeNonKey1RO214( ) ;
         sMode214 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode214 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1RO214( ) ;
      if ( RcdFound214 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound214 = (short)(0) ;
      /* Using cursor T01RO15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01RO15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RO15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RO15_A1514MacProCod[0], A1514MacProCod) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01RO15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RO15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RO15_A1514MacProCod[0], A1514MacProCod) > 0 ) ) )
         {
            A396EmprCod = T01RO15_A396EmprCod[0] ;
            A1514MacProCod = T01RO15_A1514MacProCod[0] ;
            n1514MacProCod = T01RO15_n1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            RcdFound214 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound214 = (short)(0) ;
      /* Using cursor T01RO16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01RO16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RO16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RO16_A1514MacProCod[0], A1514MacProCod) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01RO16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RO16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RO16_A1514MacProCod[0], A1514MacProCod) < 0 ) ) )
         {
            A396EmprCod = T01RO16_A396EmprCod[0] ;
            A1514MacProCod = T01RO16_A1514MacProCod[0] ;
            n1514MacProCod = T01RO16_n1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            RcdFound214 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RO214( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1516MacProULin = O1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         A6097MacSumTim = O6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         AV26Modif = OV26Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
         GX_FocusControl = edtMacProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RO214( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound214 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1514MacProCod = Z1514MacProCod ;
               n1514MacProCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MACPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMacProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1516MacProULin = O1516MacProULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
               A6097MacSumTim = O6097MacSumTim ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
               AV26Modif = OV26Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMacProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A1516MacProULin = O1516MacProULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
               A6097MacSumTim = O6097MacSumTim ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
               AV26Modif = OV26Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
               update1RO214( ) ;
               GX_FocusControl = edtMacProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) )
            {
               /* Insert record */
               A1516MacProULin = O1516MacProULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
               A6097MacSumTim = O6097MacSumTim ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
               AV26Modif = OV26Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
               GX_FocusControl = edtMacProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RO214( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MACPROCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMacProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A1516MacProULin = O1516MacProULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
                  A6097MacSumTim = O6097MacSumTim ;
                  n6097MacSumTim = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
                  AV26Modif = OV26Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
                  GX_FocusControl = edtMacProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RO214( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = Z1514MacProCod ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1516MacProULin = O1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         A6097MacSumTim = O6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         AV26Modif = OV26Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMacProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RO214( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RO5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMACPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z1515MacProDsc, T01RO5_A1515MacProDsc[0]) != 0 ) || ( GXutil.strcmp(Z6231MacProDsc2, T01RO5_A6231MacProDsc2[0]) != 0 ) || ( Z6096MacNumPrg != T01RO5_A6096MacNumPrg[0] ) || ( DecimalUtil.compareTo(Z12534MacKgTTin, T01RO5_A12534MacKgTTin[0]) != 0 ) || ( GXutil.strcmp(Z13463MacProPrg2, T01RO5_A13463MacProPrg2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13464MacProPrg3, T01RO5_A13464MacProPrg3[0]) != 0 ) || ( Z1516MacProULin != T01RO5_A1516MacProULin[0] ) || ( Z5424MacProTmx != T01RO5_A5424MacProTmx[0] ) || ( GXutil.strcmp(Z5425MacProMat, T01RO5_A5425MacProMat[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1515MacProDsc, T01RO5_A1515MacProDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProDsc");
               GXutil.writeLogRaw("Old: ",Z1515MacProDsc);
               GXutil.writeLogRaw("Current: ",T01RO5_A1515MacProDsc[0]);
            }
            if ( GXutil.strcmp(Z6231MacProDsc2, T01RO5_A6231MacProDsc2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProDsc2");
               GXutil.writeLogRaw("Old: ",Z6231MacProDsc2);
               GXutil.writeLogRaw("Current: ",T01RO5_A6231MacProDsc2[0]);
            }
            if ( Z6096MacNumPrg != T01RO5_A6096MacNumPrg[0] )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacNumPrg");
               GXutil.writeLogRaw("Old: ",Z6096MacNumPrg);
               GXutil.writeLogRaw("Current: ",T01RO5_A6096MacNumPrg[0]);
            }
            if ( DecimalUtil.compareTo(Z12534MacKgTTin, T01RO5_A12534MacKgTTin[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacKgTTin");
               GXutil.writeLogRaw("Old: ",Z12534MacKgTTin);
               GXutil.writeLogRaw("Current: ",T01RO5_A12534MacKgTTin[0]);
            }
            if ( GXutil.strcmp(Z13463MacProPrg2, T01RO5_A13463MacProPrg2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProPrg2");
               GXutil.writeLogRaw("Old: ",Z13463MacProPrg2);
               GXutil.writeLogRaw("Current: ",T01RO5_A13463MacProPrg2[0]);
            }
            if ( GXutil.strcmp(Z13464MacProPrg3, T01RO5_A13464MacProPrg3[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProPrg3");
               GXutil.writeLogRaw("Old: ",Z13464MacProPrg3);
               GXutil.writeLogRaw("Current: ",T01RO5_A13464MacProPrg3[0]);
            }
            if ( Z1516MacProULin != T01RO5_A1516MacProULin[0] )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProULin");
               GXutil.writeLogRaw("Old: ",Z1516MacProULin);
               GXutil.writeLogRaw("Current: ",T01RO5_A1516MacProULin[0]);
            }
            if ( Z5424MacProTmx != T01RO5_A5424MacProTmx[0] )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProTmx");
               GXutil.writeLogRaw("Old: ",Z5424MacProTmx);
               GXutil.writeLogRaw("Current: ",T01RO5_A5424MacProTmx[0]);
            }
            if ( GXutil.strcmp(Z5425MacProMat, T01RO5_A5425MacProMat[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacProMat");
               GXutil.writeLogRaw("Old: ",Z5425MacProMat);
               GXutil.writeLogRaw("Current: ",T01RO5_A5425MacProMat[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMACPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RO214( )
   {
      beforeValidate1RO214( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RO214( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RO214( 0) ;
         checkOptimisticConcurrency1RO214( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RO214( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RO214( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RO17 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n1514MacProCod), A1514MacProCod, A1515MacProDsc, A6231MacProDsc2, Integer.valueOf(A6096MacNumPrg), A12534MacKgTTin, A13463MacProPrg2, A13464MacProPrg3, Short.valueOf(A1516MacProULin), Boolean.valueOf(n5424MacProTmx), Short.valueOf(A5424MacProTmx), Boolean.valueOf(n5425MacProMat), A5425MacProMat, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACPR");
                  if ( (pr_default.getStatus(12) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( ( ( DecimalUtil.compareTo(A12534MacKgTTin, O12534MacKgTTin) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ && ( AV14jpf == 1 ) )
                     {
                        AV27Modif2 = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV27Modif2", AV27Modif2);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RO214( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RO0( ) ;
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
            load1RO214( ) ;
         }
         endLevel1RO214( ) ;
      }
      closeExtendedTableCursors1RO214( ) ;
   }

   public void update1RO214( )
   {
      beforeValidate1RO214( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RO214( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RO214( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RO214( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RO214( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RO18 */
                  pr_default.execute(13, new Object[] {A1515MacProDsc, A6231MacProDsc2, Integer.valueOf(A6096MacNumPrg), A12534MacKgTTin, A13463MacProPrg2, A13464MacProPrg3, Short.valueOf(A1516MacProULin), Boolean.valueOf(n5424MacProTmx), Short.valueOf(A5424MacProTmx), Boolean.valueOf(n5425MacProMat), A5425MacProMat, A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACPR");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMACPR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RO214( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( GXutil.strcmp(A1515MacProDsc, O1515MacProDsc) != 0 ) && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV33Pgmname, 1, 10), AV9UsurCod, AV7Station, AV19Inc_obs, 99999999, (byte)(9), httpContext.getMessage( "z", "")) ;
                     }
                     if ( ( ( ( ( DecimalUtil.compareTo(A12534MacKgTTin, O12534MacKgTTin) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ && ( AV14jpf == 1 ) )
                     {
                        AV27Modif2 = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV27Modif2", AV27Modif2);
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RO214( ) ;
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
         endLevel1RO214( ) ;
      }
      closeExtendedTableCursors1RO214( ) ;
   }

   public void deferredUpdate1RO214( )
   {
   }

   public void delete( )
   {
      beforeValidate1RO214( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RO214( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RO214( ) ;
         afterConfirm1RO214( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RO214( ) ;
            if ( AnyError == 0 )
            {
               A1516MacProULin = O1516MacProULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
               A6097MacSumTim = O6097MacSumTim ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
               AV26Modif = OV26Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
               scanStart1RO215( ) ;
               while ( RcdFound215 != 0 )
               {
                  getByPrimaryKey1RO215( ) ;
                  delete1RO215( ) ;
                  scanNext1RO215( ) ;
                  O1516MacProULin = A1516MacProULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
                  O6097MacSumTim = A6097MacSumTim ;
                  n6097MacSumTim = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
                  OV26Modif = AV26Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
               }
               scanEnd1RO215( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RO19 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACPR");
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
      sMode214 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RO214( ) ;
      Gx_mode = sMode214 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RO214( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* After */ && ( AV12Noigual == 1 ) && isIns( )  )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A1514MacProCod ;
            GXv_char2[0] = AV18msg_err ;
            new app.pmpnpq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
            numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
            numerodeprogramaautomata_impl.this.AV18msg_err = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV18msg_err", AV18msg_err);
         }
         A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
         if ( GXutil.strcmp(A1515MacProDsc, O1515MacProDsc) != 0 )
         {
            AV19Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Descripcion, Old =", ""), "") + O1515MacProDsc + httpContext.getMessage( httpContext.getMessage( " New = ", ""), "") + A1515MacProDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_obs", AV19Inc_obs);
         }
         /* Using cursor T01RO21 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A6097MacSumTim = T01RO21_A6097MacSumTim[0] ;
            n6097MacSumTim = T01RO21_n6097MacSumTim[0] ;
         }
         else
         {
            A6097MacSumTim = 0 ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         pr_default.close(15);
         GXt_int8 = A3602MacTotTie ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1514MacProCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ptotmac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
         numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A3602MacTotTie = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RO22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01RO23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01RO24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1RO215( )
   {
      s1516MacProULin = O1516MacProULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      s6097MacSumTim = O6097MacSumTim ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      sV26Modif = OV26Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      nGXsfl_84_idx = 0 ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         readRow1RO215( ) ;
         if ( ( nRcdExists_215 != 0 ) || ( nIsMod_215 != 0 ) )
         {
            standaloneNotModal1RO215( ) ;
            getKey1RO215( ) ;
            if ( ( nRcdExists_215 == 0 ) && ( nRcdDeleted_215 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RO215( ) ;
            }
            else
            {
               if ( RcdFound215 != 0 )
               {
                  if ( ( nRcdDeleted_215 != 0 ) && ( nRcdExists_215 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RO215( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_215 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RO215( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_215 == 0 )
                  {
                     GXCCtl = "MACPROLIN_" + sGXsfl_84_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1516MacProULin = A1516MacProULin ;
            httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
            O6097MacSumTim = A6097MacSumTim ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
            OV26Modif = AV26Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
         }
         httpContext.changePostValue( edtMacProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForMat_Internalname, GXutil.rtrim( A769ProForMat)) ;
         httpContext.changePostValue( edtMacPrgNum_Internalname, GXutil.ltrim( localUtil.ntoc( A7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacPrdTt_Internalname, GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacRb_Internalname, GXutil.ltrim( localUtil.ntoc( A10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacNH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1517MacProLin_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8011MacPrdTt_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7787MacPrgNum_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10549MacRb_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10550MacNH2O_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_84_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "T764ProForCod_"+sGXsfl_84_idx, GXutil.rtrim( O764ProForCod)) ;
         httpContext.changePostValue( "T8011MacPrdTt_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_215_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_215_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_215_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_215 != 0 )
         {
            httpContext.changePostValue( "MACPROLIN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTIE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTMX_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORMAT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORMAT_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForMat_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACPRGNUM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACPRGNUM_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACPRDTT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrdTt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACRB_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACNH2O_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacNH2O_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RO215( ) ;
      if ( AnyError != 0 )
      {
         O1516MacProULin = s1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         O6097MacSumTim = s6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         OV26Modif = sV26Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      }
      nRcdExists_215 = (short)(0) ;
      nIsMod_215 = (short)(0) ;
      nRcdDeleted_215 = (short)(0) ;
   }

   public void processLevel1RO214( )
   {
      /* Save parent mode. */
      sMode214 = Gx_mode ;
      processNestedLevel1RO215( ) ;
      if ( AnyError != 0 )
      {
         O1516MacProULin = s1516MacProULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         O6097MacSumTim = s6097MacSumTim ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         OV26Modif = sV26Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode214 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01RO25 */
      pr_default.execute(19, new Object[] {Short.valueOf(A1516MacProULin), A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACPR");
   }

   public void endLevel1RO214( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1RO214( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.numerodeprogramaautomata");
         if ( AnyError == 0 )
         {
            confirmValues1RO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.numerodeprogramaautomata");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RO214( )
   {
      /* Scan By routine */
      /* Using cursor T01RO26 */
      pr_default.execute(20);
      RcdFound214 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound214 = (short)(1) ;
         A396EmprCod = T01RO26_A396EmprCod[0] ;
         A1514MacProCod = T01RO26_A1514MacProCod[0] ;
         n1514MacProCod = T01RO26_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RO214( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound214 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound214 = (short)(1) ;
         A396EmprCod = T01RO26_A396EmprCod[0] ;
         A1514MacProCod = T01RO26_A1514MacProCod[0] ;
         n1514MacProCod = T01RO26_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      }
   }

   public void scanEnd1RO214( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1RO214( )
   {
      /* After Confirm Rules */
      if ( ( A6096MacNumPrg > 0 ) && ( AV16Nprog == 1 ) && ( GXutil.strcmp(AV25Msg_er, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Programa Inexistente", ""), 1, "MACNUMPRG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacNumPrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1RO214( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RO214( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RO214( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RO214( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RO214( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RO214( )
   {
      edtMacProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
      edtMacProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc_Enabled), 5, 0), true);
      edtMacProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc2_Enabled), 5, 0), true);
      edtMacProMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProMat_Enabled), 5, 0), true);
      edtMacProTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProTmx_Enabled), 5, 0), true);
      edtMacTotTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacTotTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacTotTie_Enabled), 5, 0), true);
      edtMacNumPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacNumPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNumPrg_Enabled), 5, 0), true);
      edtMacKgTTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacKgTTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacKgTTin_Enabled), 5, 0), true);
      edtMacProPrg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProPrg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProPrg2_Enabled), 5, 0), true);
      edtMacProPrg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProPrg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProPrg3_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1RO215( int GX_JID )
   {
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8011MacPrdTt = T01RO3_A8011MacPrdTt[0] ;
            Z7787MacPrgNum = T01RO3_A7787MacPrgNum[0] ;
            Z10549MacRb = T01RO3_A10549MacRb[0] ;
            Z10550MacNH2O = T01RO3_A10550MacNH2O[0] ;
            Z764ProForCod = T01RO3_A764ProForCod[0] ;
         }
         else
         {
            Z8011MacPrdTt = A8011MacPrdTt ;
            Z7787MacPrgNum = A7787MacPrgNum ;
            Z10549MacRb = A10549MacRb ;
            Z10550MacNH2O = A10550MacNH2O ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -37 )
      {
         Z1514MacProCod = A1514MacProCod ;
         Z1517MacProLin = A1517MacProLin ;
         Z8011MacPrdTt = A8011MacPrdTt ;
         Z7787MacPrgNum = A7787MacPrgNum ;
         Z10549MacRb = A10549MacRb ;
         Z10550MacNH2O = A10550MacNH2O ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z771ProForTie = A771ProForTie ;
         Z772ProForTmx = A772ProForTmx ;
         Z769ProForMat = A769ProForMat ;
      }
   }

   public void standaloneNotModal1RO215( )
   {
      edtMacPrdTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrdTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrdTt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacPrgNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacNH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNH2O_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void standaloneModal1RO215( )
   {
      if ( isIns( )  )
      {
         A1516MacProULin = (short)(O1516MacProULin+5) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1517MacProLin = A1516MacProULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMacProLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      }
      else
      {
         edtMacProLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      }
   }

   public void load1RO215( )
   {
      /* Using cursor T01RO27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound215 = (short)(1) ;
         A8011MacPrdTt = T01RO27_A8011MacPrdTt[0] ;
         A766ProForDsc = T01RO27_A766ProForDsc[0] ;
         A771ProForTie = T01RO27_A771ProForTie[0] ;
         A772ProForTmx = T01RO27_A772ProForTmx[0] ;
         A769ProForMat = T01RO27_A769ProForMat[0] ;
         A7787MacPrgNum = T01RO27_A7787MacPrgNum[0] ;
         A10549MacRb = T01RO27_A10549MacRb[0] ;
         A10550MacNH2O = T01RO27_A10550MacNH2O[0] ;
         A764ProForCod = T01RO27_A764ProForCod[0] ;
         zm1RO215( -37) ;
      }
      pr_default.close(21);
      onLoadActions1RO215( ) ;
   }

   public void onLoadActions1RO215( )
   {
      if ( isIns( )  && (0==A8011MacPrdTt) && ( Gx_BScreen == 0 ) )
      {
         A8011MacPrdTt = A771ProForTie ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      }
      else
      {
         if ( ( isIns( )  || isUpd( )  ) && ( GXutil.strcmp(A764ProForCod, O764ProForCod) != 0 ) && true /* Level */ )
         {
            AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
         }
      }
      if ( isIns( )  )
      {
         A6097MacSumTim = (int)(O6097MacSumTim+A8011MacPrdTt) ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6097MacSumTim = (int)(O6097MacSumTim+A8011MacPrdTt-O8011MacPrdTt) ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6097MacSumTim = (int)(O6097MacSumTim-O8011MacPrdTt) ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
            }
         }
      }
   }

   public void checkExtendedTable1RO215( )
   {
      nIsDirty_215 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1RO215( ) ;
      /* Using cursor T01RO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01RO4_A766ProForDsc[0] ;
      A771ProForTie = T01RO4_A771ProForTie[0] ;
      A772ProForTmx = T01RO4_A772ProForTmx[0] ;
      A769ProForMat = T01RO4_A769ProForMat[0] ;
      pr_default.close(2);
      if ( isIns( )  && (0==A8011MacPrdTt) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_215 = (short)(1) ;
         A8011MacPrdTt = A771ProForTie ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
      }
      else
      {
         if ( ( isIns( )  || isUpd( )  ) && ( GXutil.strcmp(A764ProForCod, O764ProForCod) != 0 ) && true /* Level */ )
         {
            AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_215 = (short)(1) ;
         A6097MacSumTim = (int)(O6097MacSumTim+A8011MacPrdTt) ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_215 = (short)(1) ;
            A6097MacSumTim = (int)(O6097MacSumTim+A8011MacPrdTt-O8011MacPrdTt) ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_215 = (short)(1) ;
               A6097MacSumTim = (int)(O6097MacSumTim-O8011MacPrdTt) ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1RO215( )
   {
      pr_default.close(2);
   }

   public void enableDisable1RO215( )
   {
   }

   public void gxload_38( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T01RO28 */
      pr_default.execute(22, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01RO28_A766ProForDsc[0] ;
      A771ProForTie = T01RO28_A771ProForTie[0] ;
      A772ProForTmx = T01RO28_A772ProForTmx[0] ;
      A769ProForMat = T01RO28_A769ProForMat[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A769ProForMat))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1RO215( )
   {
      /* Using cursor T01RO29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound215 = (short)(1) ;
      }
      else
      {
         RcdFound215 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey1RO215( )
   {
      /* Using cursor T01RO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RO215( 37) ;
         RcdFound215 = (short)(1) ;
         initializeNonKey1RO215( ) ;
         A1517MacProLin = T01RO3_A1517MacProLin[0] ;
         A8011MacPrdTt = T01RO3_A8011MacPrdTt[0] ;
         A7787MacPrgNum = T01RO3_A7787MacPrgNum[0] ;
         A10549MacRb = T01RO3_A10549MacRb[0] ;
         A10550MacNH2O = T01RO3_A10550MacNH2O[0] ;
         A764ProForCod = T01RO3_A764ProForCod[0] ;
         O764ProForCod = A764ProForCod ;
         O8011MacPrdTt = A8011MacPrdTt ;
         Z396EmprCod = A396EmprCod ;
         Z1514MacProCod = A1514MacProCod ;
         Z1517MacProLin = A1517MacProLin ;
         sMode215 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RO215( ) ;
         Gx_mode = sMode215 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound215 = (short)(0) ;
         initializeNonKey1RO215( ) ;
         sMode215 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RO215( ) ;
         Gx_mode = sMode215 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RO215( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RO215( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z8011MacPrdTt != T01RO2_A8011MacPrdTt[0] ) || ( Z7787MacPrgNum != T01RO2_A7787MacPrgNum[0] ) || ( DecimalUtil.compareTo(Z10549MacRb, T01RO2_A10549MacRb[0]) != 0 ) || ( Z10550MacNH2O != T01RO2_A10550MacNH2O[0] ) || ( GXutil.strcmp(Z764ProForCod, T01RO2_A764ProForCod[0]) != 0 ) )
         {
            if ( Z8011MacPrdTt != T01RO2_A8011MacPrdTt[0] )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacPrdTt");
               GXutil.writeLogRaw("Old: ",Z8011MacPrdTt);
               GXutil.writeLogRaw("Current: ",T01RO2_A8011MacPrdTt[0]);
            }
            if ( Z7787MacPrgNum != T01RO2_A7787MacPrgNum[0] )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacPrgNum");
               GXutil.writeLogRaw("Old: ",Z7787MacPrgNum);
               GXutil.writeLogRaw("Current: ",T01RO2_A7787MacPrgNum[0]);
            }
            if ( DecimalUtil.compareTo(Z10549MacRb, T01RO2_A10549MacRb[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacRb");
               GXutil.writeLogRaw("Old: ",Z10549MacRb);
               GXutil.writeLogRaw("Current: ",T01RO2_A10549MacRb[0]);
            }
            if ( Z10550MacNH2O != T01RO2_A10550MacNH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"MacNH2O");
               GXutil.writeLogRaw("Old: ",Z10550MacNH2O);
               GXutil.writeLogRaw("Current: ",T01RO2_A10550MacNH2O[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01RO2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.numerodeprogramaautomata:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01RO2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMACPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RO215( )
   {
      beforeValidate1RO215( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RO215( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RO215( 0) ;
         checkOptimisticConcurrency1RO215( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RO215( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RO215( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RO30 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin), Short.valueOf(A8011MacPrdTt), Short.valueOf(A7787MacPrgNum), A10549MacRb, Short.valueOf(A10550MacNH2O), A396EmprCod, A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1RO215( ) ;
         }
         endLevel1RO215( ) ;
      }
      closeExtendedTableCursors1RO215( ) ;
   }

   public void update1RO215( )
   {
      beforeValidate1RO215( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RO215( ) ;
      }
      if ( ( nIsMod_215 != 0 ) || ( nIsDirty_215 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RO215( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RO215( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RO215( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RO31 */
                     pr_default.execute(25, new Object[] {Short.valueOf(A8011MacPrdTt), Short.valueOf(A7787MacPrgNum), A10549MacRb, Short.valueOf(A10550MacNH2O), A764ProForCod, A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACPR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RO215( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RO215( ) ;
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
            endLevel1RO215( ) ;
         }
      }
      closeExtendedTableCursors1RO215( ) ;
   }

   public void deferredUpdate1RO215( )
   {
   }

   public void delete1RO215( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RO215( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RO215( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RO215( ) ;
         afterConfirm1RO215( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RO215( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RO32 */
               pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Short.valueOf(A1517MacProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
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
      sMode215 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RO215( ) ;
      Gx_mode = sMode215 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RO215( )
   {
      standaloneModal1RO215( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RO33 */
         pr_default.execute(27, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01RO33_A766ProForDsc[0] ;
         A771ProForTie = T01RO33_A771ProForTie[0] ;
         A772ProForTmx = T01RO33_A772ProForTmx[0] ;
         A769ProForMat = T01RO33_A769ProForMat[0] ;
         pr_default.close(27);
         if ( isDlt( )  && true /* Level */ )
         {
            AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
         }
         else
         {
            if ( ( isIns( )  || isUpd( )  ) && ( GXutil.strcmp(A764ProForCod, O764ProForCod) != 0 ) && true /* Level */ )
            {
               AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", AV26Modif);
            }
         }
         if ( isIns( )  )
         {
            A6097MacSumTim = (int)(O6097MacSumTim+A8011MacPrdTt) ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6097MacSumTim = (int)(O6097MacSumTim+A8011MacPrdTt-O8011MacPrdTt) ;
               n6097MacSumTim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6097MacSumTim = (int)(O6097MacSumTim-O8011MacPrdTt) ;
                  n6097MacSumTim = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
               }
            }
         }
      }
   }

   public void endLevel1RO215( )
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

   public void scanStart1RO215( )
   {
      /* Scan By routine */
      /* Using cursor T01RO34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      RcdFound215 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound215 = (short)(1) ;
         A1517MacProLin = T01RO34_A1517MacProLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RO215( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound215 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound215 = (short)(1) ;
         A1517MacProLin = T01RO34_A1517MacProLin[0] ;
      }
   }

   public void scanEnd1RO215( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1RO215( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RO215( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RO215( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RO215( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RO215( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RO215( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RO215( )
   {
      edtMacProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtProForTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtProForMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacPrgNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacPrdTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrdTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrdTt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacRb_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacNH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNH2O_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void send_integrity_lvl_hashes1RO215( )
   {
   }

   public void send_integrity_lvl_hashes1RO214( )
   {
   }

   public void subsflControlProps_84215( )
   {
      edtMacProLin_Internalname = "MACPROLIN_"+sGXsfl_84_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_84_idx ;
      edtProForTie_Internalname = "PROFORTIE_"+sGXsfl_84_idx ;
      edtProForTmx_Internalname = "PROFORTMX_"+sGXsfl_84_idx ;
      edtProForMat_Internalname = "PROFORMAT_"+sGXsfl_84_idx ;
      edtMacPrgNum_Internalname = "MACPRGNUM_"+sGXsfl_84_idx ;
      edtMacPrdTt_Internalname = "MACPRDTT_"+sGXsfl_84_idx ;
      edtMacRb_Internalname = "MACRB_"+sGXsfl_84_idx ;
      edtMacNH2O_Internalname = "MACNH2O_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_84215( )
   {
      edtMacProLin_Internalname = "MACPROLIN_"+sGXsfl_84_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_84_fel_idx ;
      edtProForTie_Internalname = "PROFORTIE_"+sGXsfl_84_fel_idx ;
      edtProForTmx_Internalname = "PROFORTMX_"+sGXsfl_84_fel_idx ;
      edtProForMat_Internalname = "PROFORMAT_"+sGXsfl_84_fel_idx ;
      edtMacPrgNum_Internalname = "MACPRGNUM_"+sGXsfl_84_fel_idx ;
      edtMacPrdTt_Internalname = "MACPRDTT_"+sGXsfl_84_fel_idx ;
      edtMacRb_Internalname = "MACRB_"+sGXsfl_84_fel_idx ;
      edtMacNH2O_Internalname = "MACNH2O_"+sGXsfl_84_fel_idx ;
   }

   public void addRow1RO215( )
   {
      nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_84215( ) ;
      sendRow1RO215( ) ;
   }

   public void sendRow1RO215( )
   {
      Gridlevel_procesosquimicosRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_procesosquimicos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_procesosquimicos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_procesosquimicos_Class, "") != 0 )
         {
            subGridlevel_procesosquimicos_Linesclass = subGridlevel_procesosquimicos_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_procesosquimicos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_procesosquimicos_Backstyle = (byte)(0) ;
         subGridlevel_procesosquimicos_Backcolor = subGridlevel_procesosquimicos_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_procesosquimicos_Class, "") != 0 )
         {
            subGridlevel_procesosquimicos_Linesclass = subGridlevel_procesosquimicos_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_procesosquimicos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_procesosquimicos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_procesosquimicos_Class, "") != 0 )
         {
            subGridlevel_procesosquimicos_Linesclass = subGridlevel_procesosquimicos_Class+"Odd" ;
         }
         subGridlevel_procesosquimicos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_procesosquimicos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_procesosquimicos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
         {
            subGridlevel_procesosquimicos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_procesosquimicos_Class, "") != 0 )
            {
               subGridlevel_procesosquimicos_Linesclass = subGridlevel_procesosquimicos_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_procesosquimicos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_procesosquimicos_Class, "") != 0 )
            {
               subGridlevel_procesosquimicos_Linesclass = subGridlevel_procesosquimicos_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_215_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1517MacProLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMacProLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_215_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTie_Internalname,GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForTie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForMat_Internalname,GXutil.rtrim( A769ProForMat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtProForMat_Visible),Integer.valueOf(edtProForMat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacPrgNum_Internalname,GXutil.ltrim( localUtil.ntoc( A7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacPrgNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7787MacPrgNum), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7787MacPrgNum), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacPrgNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtMacPrgNum_Visible),Integer.valueOf(edtMacPrgNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacPrdTt_Internalname,GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacPrdTt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8011MacPrdTt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8011MacPrdTt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacPrdTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMacPrdTt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_215_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacRb_Internalname,GXutil.ltrim( localUtil.ntoc( A10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacRb_Enabled!=0) ? localUtil.format( A10549MacRb, "ZZ9.99") : localUtil.format( A10549MacRb, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMacRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacNH2O_Internalname,GXutil.ltrim( localUtil.ntoc( A10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacNH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10550MacNH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10550MacNH2O), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacNH2O_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMacNH2O_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_procesosquimicosRow);
      send_integrity_lvl_hashes1RO215( ) ;
      GXCCtl = "Z1517MacProLin_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8011MacPrdTt_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7787MacPrgNum_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10549MacRb_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10550MacNH2O_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "O764ProForCod_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O764ProForCod));
      GXCCtl = "O8011MacPrdTt_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_215_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_215_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_215_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_215, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_84_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV23TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV23TrnContext);
      }
      GXCCtl = "vMODA21_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV31moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vF_CMACPR_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV10F_CMACPR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vMACPROCOD_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV21MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MACPROLIN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORTIE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORTMX_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMAT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMAT_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForMat_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACPRGNUM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACPRGNUM_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACPRDTT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrdTt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACRB_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACNH2O_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacNH2O_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_procesosquimicosContainer.AddRow(Gridlevel_procesosquimicosRow);
   }

   public void readRow1RO215( )
   {
      nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_84215( ) ;
      edtMacProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACPROLIN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTIE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTMX_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForMat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORMAT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForMat_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORMAT_"+sGXsfl_84_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacPrgNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACPRGNUM_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacPrgNum_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MACPRGNUM_"+sGXsfl_84_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacPrdTt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACPRDTT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACRB_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacNH2O_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACNH2O_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "MACPROLIN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProLin_Internalname ;
         wbErr = true ;
         A1517MacProLin = (short)(0) ;
      }
      else
      {
         A1517MacProLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMacProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A769ProForMat = httpContext.cgiGet( edtProForMat_Internalname) ;
      A7787MacPrgNum = (short)(localUtil.ctol( httpContext.cgiGet( edtMacPrgNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A8011MacPrdTt = (short)(localUtil.ctol( httpContext.cgiGet( edtMacPrdTt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacRb_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MACRB_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacRb_Internalname ;
         wbErr = true ;
         A10549MacRb = DecimalUtil.ZERO ;
      }
      else
      {
         A10549MacRb = localUtil.ctond( httpContext.cgiGet( edtMacRb_Internalname)) ;
      }
      A10550MacNH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtMacNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1517MacProLin_" + sGXsfl_84_idx ;
      Z1517MacProLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8011MacPrdTt_" + sGXsfl_84_idx ;
      Z8011MacPrdTt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7787MacPrgNum_" + sGXsfl_84_idx ;
      Z7787MacPrgNum = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10549MacRb_" + sGXsfl_84_idx ;
      Z10549MacRb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10550MacNH2O_" + sGXsfl_84_idx ;
      Z10550MacNH2O = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_84_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O764ProForCod_" + sGXsfl_84_idx ;
      O764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O8011MacPrdTt_" + sGXsfl_84_idx ;
      O8011MacPrdTt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_215_" + sGXsfl_84_idx ;
      nRcdDeleted_215 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_215_" + sGXsfl_84_idx ;
      nRcdExists_215 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_215_" + sGXsfl_84_idx ;
      nIsMod_215 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMacNH2O_Enabled = edtMacNH2O_Enabled ;
      defedtMacPrdTt_Enabled = edtMacPrdTt_Enabled ;
      defedtMacPrgNum_Enabled = edtMacPrgNum_Enabled ;
      defedtMacProLin_Enabled = edtMacProLin_Enabled ;
   }

   public void confirmValues1RO0( )
   {
      nGXsfl_84_idx = 0 ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_84215( ) ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_84215( ) ;
         httpContext.changePostValue( "Z1517MacProLin_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z1517MacProLin_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1517MacProLin_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z8011MacPrdTt_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z8011MacPrdTt_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8011MacPrdTt_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z7787MacPrgNum_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z7787MacPrgNum_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7787MacPrgNum_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z10549MacRb_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z10549MacRb_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10549MacRb_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z10550MacNH2O_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z10550MacNH2O_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10550MacNH2O_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_84_idx) ;
      }
      httpContext.changePostValue( "O764ProForCod", httpContext.cgiGet( "T764ProForCod")) ;
      httpContext.deletePostValue( "T764ProForCod") ;
      httpContext.changePostValue( "O8011MacPrdTt", httpContext.cgiGet( "T8011MacPrdTt")) ;
      httpContext.deletePostValue( "T8011MacPrdTt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.numerodeprogramaautomata", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21MacProCod))}, new String[] {"Gx_mode","EmprCod","MacProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"NumerodeProgramaAutomata");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\numerodeprogramaautomata:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1515MacProDsc", GXutil.rtrim( Z1515MacProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6231MacProDsc2", GXutil.rtrim( Z6231MacProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6096MacNumPrg", GXutil.ltrim( localUtil.ntoc( Z6096MacNumPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12534MacKgTTin", GXutil.ltrim( localUtil.ntoc( Z12534MacKgTTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13463MacProPrg2", GXutil.rtrim( Z13463MacProPrg2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13464MacProPrg3", GXutil.rtrim( Z13464MacProPrg3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1516MacProULin", GXutil.ltrim( localUtil.ntoc( Z1516MacProULin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5424MacProTmx", GXutil.ltrim( localUtil.ntoc( Z5424MacProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5425MacProMat", GXutil.rtrim( Z5425MacProMat));
      app.GxWebStd.gx_hidden_field( httpContext, "O1516MacProULin", GXutil.ltrim( localUtil.ntoc( O1516MacProULin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6097MacSumTim", GXutil.ltrim( localUtil.ntoc( O6097MacSumTim, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12534MacKgTTin", GXutil.ltrim( localUtil.ntoc( O12534MacKgTTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1515MacProDsc", GXutil.rtrim( O1515MacProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nGXsfl_84_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV28ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV28ProForCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV23TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV23TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV23TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV31moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_CMACPR", GXutil.ltrim( localUtil.ntoc( AV10F_CMACPR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vF_CMACPR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10F_CMACPR), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MACPROCDSC", A13755MacProCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACPROCOD", GXutil.rtrim( AV21MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21MacProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV19Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vJPF", GXutil.ltrim( localUtil.ntoc( AV14jpf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF2", GXutil.rtrim( AV27Modif2));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ER", GXutil.rtrim( AV25Msg_er));
      app.GxWebStd.gx_hidden_field( httpContext, "vNPROG", GXutil.ltrim( localUtil.ntoc( AV16Nprog, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXIPRG", GXutil.ltrim( localUtil.ntoc( AV17ExiPrg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV15Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV18msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOIGUAL", GXutil.ltrim( localUtil.ntoc( AV12Noigual, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV9UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "MACPROULIN", GXutil.ltrim( localUtil.ntoc( A1516MacProULin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "MACSUMTIM", GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV26Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC", GXutil.rtrim( A766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable4_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Enabled", GXutil.booltostr( Dvpanel_unnamedtable4_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
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
      return formatLink("app.formulaciontinte.numerodeprogramaautomata", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21MacProCod))}, new String[] {"Gx_mode","EmprCod","MacProCod"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.NumerodeProgramaAutomata" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Numero de Programa Automata", "") ;
   }

   public void initializeNonKey1RO214( )
   {
      AV25Msg_er = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Msg_er", AV25Msg_er);
      AV17ExiPrg = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
      AV18msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18msg_err", AV18msg_err);
      AV19Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_obs", AV19Inc_obs);
      AV27Modif2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Modif2", AV27Modif2);
      A13755MacProCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
      A3602MacTotTie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
      A1515MacProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A6231MacProDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
      A6096MacNumPrg = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
      A12534MacKgTTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
      A13463MacProPrg2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
      A13464MacProPrg3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
      A1516MacProULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      A6097MacSumTim = 0 ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      A5424MacProTmx = (short)(0) ;
      n5424MacProTmx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5424MacProTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5424MacProTmx), 4, 0));
      A5425MacProMat = "" ;
      n5425MacProMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5425MacProMat", A5425MacProMat);
      O1516MacProULin = A1516MacProULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      O6097MacSumTim = A6097MacSumTim ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      O12534MacKgTTin = A12534MacKgTTin ;
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
      O1515MacProDsc = A1515MacProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      Z1515MacProDsc = "" ;
      Z6231MacProDsc2 = "" ;
      Z6096MacNumPrg = 0 ;
      Z12534MacKgTTin = DecimalUtil.ZERO ;
      Z13463MacProPrg2 = "" ;
      Z13464MacProPrg3 = "" ;
      Z1516MacProULin = (short)(0) ;
      Z5424MacProTmx = (short)(0) ;
      Z5425MacProMat = "" ;
   }

   public void initAll1RO214( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1514MacProCod = "" ;
      n1514MacProCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      initializeNonKey1RO214( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RO215( )
   {
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A771ProForTie = (short)(0) ;
      A772ProForTmx = (short)(0) ;
      A769ProForMat = "" ;
      A7787MacPrgNum = (short)(0) ;
      A10549MacRb = DecimalUtil.ZERO ;
      A10550MacNH2O = (short)(0) ;
      A8011MacPrdTt = (short)(0) ;
      O764ProForCod = A764ProForCod ;
      O8011MacPrdTt = A8011MacPrdTt ;
      Z8011MacPrdTt = (short)(0) ;
      Z7787MacPrgNum = (short)(0) ;
      Z10549MacRb = DecimalUtil.ZERO ;
      Z10550MacNH2O = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAll1RO215( )
   {
      A1517MacProLin = (short)(0) ;
      initializeNonKey1RO215( ) ;
   }

   public void standaloneModalInsert1RO215( )
   {
      A1516MacProULin = i1516MacProULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692924", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/numerodeprogramaautomata.js", "?20268211692924", false, true);
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

   public void init_level_properties215( )
   {
      edtMacNH2O_Enabled = defedtMacNH2O_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNH2O_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacPrdTt_Enabled = defedtMacPrdTt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrdTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrdTt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacPrgNum_Enabled = defedtMacPrgNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMacProLin_Enabled = defedtMacProLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void startgridcontrol84( )
   {
      Gridlevel_procesosquimicosContainer.AddObjectProperty("GridName", "Gridlevel_procesosquimicos");
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Header", subGridlevel_procesosquimicos_Header);
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_procesosquimicosContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1517MacProLin, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.rtrim( A769ProForMat));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProForMat_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7787MacPrgNum, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMacPrgNum_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacPrdTt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10549MacRb, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10550MacNH2O, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacNH2O_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddColumnProperties(Gridlevel_procesosquimicosColumn);
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtMacProCod_Internalname = "MACPROCOD" ;
      edtMacProDsc_Internalname = "MACPRODSC" ;
      edtMacProDsc2_Internalname = "MACPRODSC2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtMacProMat_Internalname = "MACPROMAT" ;
      edtMacProTmx_Internalname = "MACPROTMX" ;
      edtMacTotTie_Internalname = "MACTOTTIE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtMacNumPrg_Internalname = "MACNUMPRG" ;
      edtMacKgTTin_Internalname = "MACKGTTIN" ;
      divMackgttin_cell_Internalname = "MACKGTTIN_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtMacProPrg2_Internalname = "MACPROPRG2" ;
      edtMacProPrg3_Internalname = "MACPROPRG3" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divDvpanel_unnamedtable4_cell_Internalname = "DVPANEL_UNNAMEDTABLE4_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMacProLin_Internalname = "MACPROLIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForTie_Internalname = "PROFORTIE" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProForMat_Internalname = "PROFORMAT" ;
      edtMacPrgNum_Internalname = "MACPRGNUM" ;
      edtMacPrdTt_Internalname = "MACPRDTT" ;
      edtMacRb_Internalname = "MACRB" ;
      edtMacNH2O_Internalname = "MACNH2O" ;
      divTableleaflevel_procesosquimicos_Internalname = "TABLELEAFLEVEL_PROCESOSQUIMICOS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_procesosquimicos_Internalname = "GRIDLEVEL_PROCESOSQUIMICOS" ;
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
      subGridlevel_procesosquimicos_Allowcollapsing = (byte)(0) ;
      subGridlevel_procesosquimicos_Allowselection = (byte)(0) ;
      subGridlevel_procesosquimicos_Header = "" ;
      Combo_proforcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Numero de Programa Automata", "") );
      edtMacNH2O_Jsonclick = "" ;
      edtMacRb_Jsonclick = "" ;
      edtMacPrdTt_Jsonclick = "" ;
      edtMacPrgNum_Jsonclick = "" ;
      edtProForMat_Jsonclick = "" ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTie_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtMacProLin_Jsonclick = "" ;
      subGridlevel_procesosquimicos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_procesosquimicos_Backcolorstyle = (byte)(0) ;
      Combo_proforcod_Titlecontrolidtoreplace = "" ;
      edtMacNH2O_Enabled = 0 ;
      edtMacRb_Enabled = 1 ;
      edtMacPrdTt_Enabled = 0 ;
      edtMacPrgNum_Enabled = 0 ;
      edtProForMat_Visible = -1 ;
      edtProForMat_Enabled = 0 ;
      edtProForTmx_Enabled = 0 ;
      edtProForTie_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtMacProLin_Enabled = 1 ;
      Combo_proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_proforcod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtMacProPrg3_Jsonclick = "" ;
      edtMacProPrg3_Enabled = 1 ;
      edtMacProPrg2_Jsonclick = "" ;
      edtMacProPrg2_Enabled = 1 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Otros Programas", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      divDvpanel_unnamedtable4_cell_Class = "col-xs-12" ;
      edtMacKgTTin_Jsonclick = "" ;
      edtMacKgTTin_Enabled = 1 ;
      edtMacKgTTin_Visible = 1 ;
      divMackgttin_cell_Class = "col-xs-12 col-sm-3" ;
      edtMacNumPrg_Jsonclick = "" ;
      edtMacNumPrg_Enabled = 1 ;
      edtMacTotTie_Jsonclick = "" ;
      edtMacTotTie_Enabled = 0 ;
      edtMacProTmx_Jsonclick = "" ;
      edtMacProTmx_Enabled = 1 ;
      edtMacProMat_Jsonclick = "" ;
      edtMacProMat_Enabled = 1 ;
      divUnnamedtable2_Visible = 1 ;
      edtMacProDsc2_Jsonclick = "" ;
      edtMacProDsc2_Enabled = 1 ;
      edtMacProDsc_Jsonclick = "" ;
      edtMacProDsc_Enabled = 1 ;
      edtMacProCod_Jsonclick = "" ;
      edtMacProCod_Enabled = 1 ;
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
      edtMacPrgNum_Visible = 0 ;
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

   public void gx1asamactottie1RO214( String A396EmprCod ,
                                      String A1514MacProCod )
   {
      GXt_int8 = A3602MacTotTie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A1514MacProCod ;
      GXv_int9[0] = GXt_int8 ;
      new app.ptotmac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9) ;
      numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
      numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
      numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      A3602MacTotTie = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3602MacTotTie), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3602MacTotTie, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa7691RO214( String A396EmprCod )
   {
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      edtProForMat_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Visible), 5, 0), !bGXsfl_84_Refreshing);
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

   public void gxasa125341RO214( String A396EmprCod )
   {
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int7) ;
      numerodeprogramaautomata_impl.this.GXt_int6 = GXv_int7[0] ;
      edtMacKgTTin_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacKgTTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacKgTTin_Visible), 5, 0), true);
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

   public void xc_15_1RO214( String A396EmprCod ,
                             int A6096MacNumPrg ,
                             String AV25Msg_er ,
                             short AV16Nprog )
   {
      if ( ( A6096MacNumPrg > 0 ) && ( AV16Nprog == 1 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A6096MacNumPrg ;
         GXv_char3[0] = AV25Msg_er ;
         new app.pprogno(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A6096MacNumPrg = GXv_int9[0] ;
         AV25Msg_er = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25Msg_er", AV25Msg_er);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV25Msg_er))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_18_1RO214( String A396EmprCod ,
                             String A13463MacProPrg2 ,
                             short AV17ExiPrg ,
                             short AV15Carvitin )
   {
      if ( ( AV15Carvitin == 1 ) && true /* After */ && ! (GXutil.strcmp("", A13463MacProPrg2)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A13463MacProPrg2 ;
         GXv_int7[0] = (byte)(AV17ExiPrg) ;
         new app.peximac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         A396EmprCod = GXv_char4[0] ;
         A13463MacProPrg2 = GXv_char3[0] ;
         AV17ExiPrg = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13463MacProPrg2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV17ExiPrg, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_19_1RO214( String A396EmprCod ,
                             String A13464MacProPrg3 ,
                             short AV17ExiPrg ,
                             short AV15Carvitin )
   {
      if ( ( AV15Carvitin == 1 ) && true /* After */ && ! (GXutil.strcmp("", A13464MacProPrg3)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A13464MacProPrg3 ;
         GXv_int7[0] = (byte)(AV17ExiPrg) ;
         new app.peximac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         A396EmprCod = GXv_char4[0] ;
         A13464MacProPrg3 = GXv_char3[0] ;
         AV17ExiPrg = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ExiPrg), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13464MacProPrg3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV17ExiPrg, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_1RO214( String Gx_mode ,
                             String A396EmprCod ,
                             String A1514MacProCod ,
                             short AV12Noigual )
   {
      if ( true /* After */ && ( AV12Noigual == 1 ) && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1514MacProCod ;
         GXv_char2[0] = AV18msg_err ;
         new app.pmpnpq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A1514MacProCod = GXv_char3[0] ;
         AV18msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV18msg_err", AV18msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1514MacProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV18msg_err))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_25_1RO214( )
   {
      if ( ( GXutil.strcmp(A1515MacProDsc, O1515MacProDsc) != 0 ) && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV33Pgmname, 1, 10), AV9UsurCod, AV7Station, AV19Inc_obs, 99999999, (byte)(9), httpContext.getMessage( "z", "")) ;
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

   public void gxnrgridlevel_procesosquimicos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_84215( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RO215( ) ;
         standaloneModal1RO215( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RO215( ) ;
         nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_84215( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_procesosquimicosContainer)) ;
      /* End function gxnrGridlevel_procesosquimicos_newrow */
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

   public void valid_Macprocod( )
   {
      n1514MacProCod = false ;
      n6097MacSumTim = false ;
      /* Using cursor T01RO21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A6097MacSumTim = T01RO21_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RO21_n6097MacSumTim[0] ;
      }
      else
      {
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
      }
      pr_default.close(15);
      GXt_int8 = A3602MacTotTie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A1514MacProCod ;
      GXv_int9[0] = GXt_int8 ;
      new app.ptotmac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9) ;
      numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
      A396EmprCod = this.A396EmprCod ;
      numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
      A1514MacProCod = this.A1514MacProCod ;
      numerodeprogramaautomata_impl.this.GXt_int8 = GXv_int9[0] ;
      A3602MacTotTie = GXt_int8 ;
      if ( (GXutil.strcmp("", A1514MacProCod)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Codigo Incorrecto", ""), 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProCod_Internalname ;
      }
      if ( true /* After */ && ( AV12Noigual == 1 ) && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1514MacProCod ;
         GXv_char2[0] = AV18msg_err ;
         new app.pmpnpq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         numerodeprogramaautomata_impl.this.A1514MacProCod = GXv_char3[0] ;
         A1514MacProCod = this.A1514MacProCod ;
         numerodeprogramaautomata_impl.this.AV18msg_err = GXv_char2[0] ;
         AV18msg_err = this.AV18msg_err ;
      }
      if ( true /* After */ && ( GXutil.strcmp(AV18msg_err, " ") != 0 ) && ( AV12Noigual == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV18msg_err, 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3602MacTotTie", GXutil.ltrim( localUtil.ntoc( A3602MacTotTie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", GXutil.rtrim( A1514MacProCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV18msg_err", GXutil.rtrim( AV18msg_err));
   }

   public void valid_Macprodsc( )
   {
      n1514MacProCod = false ;
      A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
      if ( GXutil.strcmp(A1515MacProDsc, O1515MacProDsc) != 0 )
      {
         AV19Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Descripcion, Old =", ""), "") + O1515MacProDsc + httpContext.getMessage( httpContext.getMessage( " New = ", ""), "") + A1515MacProDsc ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_obs", AV19Inc_obs);
   }

   public void valid_Macnumprg( )
   {
      if ( ( A6096MacNumPrg > 0 ) && ( AV16Nprog == 1 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A6096MacNumPrg ;
         GXv_char3[0] = AV25Msg_er ;
         new app.pprogno(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         numerodeprogramaautomata_impl.this.A6096MacNumPrg = GXv_int9[0] ;
         A6096MacNumPrg = this.A6096MacNumPrg ;
         numerodeprogramaautomata_impl.this.AV25Msg_er = GXv_char3[0] ;
         AV25Msg_er = this.AV25Msg_er ;
      }
      if ( ( A6096MacNumPrg > 0 ) && ( AV16Nprog == 1 ) && ( GXutil.strcmp(AV25Msg_er, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Programa Inexistente", ""), 1, "MACNUMPRG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacNumPrg_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV25Msg_er", GXutil.rtrim( AV25Msg_er));
   }

   public void valid_Macproprg2( )
   {
      if ( ( AV15Carvitin == 1 ) && true /* After */ && ! (GXutil.strcmp("", A13463MacProPrg2)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A13463MacProPrg2 ;
         GXv_int7[0] = (byte)(AV17ExiPrg) ;
         new app.peximac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         numerodeprogramaautomata_impl.this.A13463MacProPrg2 = GXv_char3[0] ;
         A13463MacProPrg2 = this.A13463MacProPrg2 ;
         numerodeprogramaautomata_impl.this.AV17ExiPrg = GXv_int7[0] ;
         AV17ExiPrg = this.AV17ExiPrg ;
      }
      if ( ( AV17ExiPrg == 0 ) && ( AV15Carvitin == 1 ) && ! (GXutil.strcmp("", A13463MacProPrg2)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Programa Nº2", ""), 1, "MACPROPRG2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProPrg2_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", GXutil.rtrim( A13463MacProPrg2));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrim( localUtil.ntoc( AV17ExiPrg, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Macproprg3( )
   {
      if ( ( AV15Carvitin == 1 ) && true /* After */ && ! (GXutil.strcmp("", A13464MacProPrg3)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A13464MacProPrg3 ;
         GXv_int7[0] = (byte)(AV17ExiPrg) ;
         new app.peximac(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         numerodeprogramaautomata_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         numerodeprogramaautomata_impl.this.A13464MacProPrg3 = GXv_char3[0] ;
         A13464MacProPrg3 = this.A13464MacProPrg3 ;
         numerodeprogramaautomata_impl.this.AV17ExiPrg = GXv_int7[0] ;
         AV17ExiPrg = this.AV17ExiPrg ;
      }
      if ( ( AV17ExiPrg == 0 ) && ( AV15Carvitin == 1 ) && ! (GXutil.strcmp("", A13464MacProPrg3)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Programa Nº3", ""), 1, "MACPROPRG3");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacProPrg3_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", GXutil.rtrim( A13464MacProPrg3));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ExiPrg", GXutil.ltrim( localUtil.ntoc( AV17ExiPrg, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T01RO33 */
      pr_default.execute(27, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T01RO33_A766ProForDsc[0] ;
      A771ProForTie = T01RO33_A771ProForTie[0] ;
      A772ProForTmx = T01RO33_A772ProForTmx[0] ;
      A769ProForMat = T01RO33_A769ProForMat[0] ;
      pr_default.close(27);
      if ( isIns( )  && (0==A8011MacPrdTt) && ( Gx_BScreen == 0 ) )
      {
         A8011MacPrdTt = A771ProForTie ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
      }
      else
      {
         if ( ( isIns( )  || isUpd( )  ) && ( GXutil.strcmp(A764ProForCod, O764ProForCod) != 0 ) && true /* Level */ )
         {
            AV26Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", GXutil.rtrim( A769ProForMat));
      httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Modif", GXutil.rtrim( AV26Modif));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21MacProCod',fld:'vMACPROCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV23TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV31moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV10F_CMACPR',fld:'vF_CMACPR',pic:'ZZZ9',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21MacProCod',fld:'vMACPROCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RO2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV23TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV31moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'AV10F_CMACPR',fld:'vF_CMACPR',pic:'ZZZ9',hsh:true},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A6231MacProDsc2',fld:'MACPRODSC2',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A6231MacProDsc2',fld:'MACPRODSC2',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_MACPROCOD","{handler:'valid_Macprocod',iparms:[{av:'AV12Noigual',fld:'vNOIGUAL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A6097MacSumTim',fld:'MACSUMTIM',pic:'ZZZZZ9'},{av:'A3602MacTotTie',fld:'MACTOTTIE',pic:'ZZZZZ9'},{av:'AV18msg_err',fld:'vMSG_ERR',pic:''}]");
      setEventMetadata("VALID_MACPROCOD",",oparms:[{av:'A6097MacSumTim',fld:'MACSUMTIM',pic:'ZZZZZ9'},{av:'A3602MacTotTie',fld:'MACTOTTIE',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'AV18msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("VALID_MACPRODSC","{handler:'valid_Macprodsc',iparms:[{av:'O1515MacProDsc'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A13755MacProCDsc',fld:'MACPROCDSC',pic:''},{av:'AV19Inc_obs',fld:'vINC_OBS',pic:''}]");
      setEventMetadata("VALID_MACPRODSC",",oparms:[{av:'A13755MacProCDsc',fld:'MACPROCDSC',pic:''},{av:'AV19Inc_obs',fld:'vINC_OBS',pic:''}]}");
      setEventMetadata("VALID_MACNUMPRG","{handler:'valid_Macnumprg',iparms:[{av:'AV16Nprog',fld:'vNPROG',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6096MacNumPrg',fld:'MACNUMPRG',pic:'ZZZZ9'},{av:'AV25Msg_er',fld:'vMSG_ER',pic:''}]");
      setEventMetadata("VALID_MACNUMPRG",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6096MacNumPrg',fld:'MACNUMPRG',pic:'ZZZZ9'},{av:'AV25Msg_er',fld:'vMSG_ER',pic:''}]}");
      setEventMetadata("VALID_MACKGTTIN","{handler:'valid_Mackgttin',iparms:[]");
      setEventMetadata("VALID_MACKGTTIN",",oparms:[]}");
      setEventMetadata("VALID_MACPROPRG2","{handler:'valid_Macproprg2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13463MacProPrg2',fld:'MACPROPRG2',pic:''},{av:'AV17ExiPrg',fld:'vEXIPRG',pic:'ZZZ9'},{av:'AV15Carvitin',fld:'vCARVITIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_MACPROPRG2",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13463MacProPrg2',fld:'MACPROPRG2',pic:''},{av:'AV17ExiPrg',fld:'vEXIPRG',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_MACPROPRG3","{handler:'valid_Macproprg3',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13464MacProPrg3',fld:'MACPROPRG3',pic:''},{av:'AV17ExiPrg',fld:'vEXIPRG',pic:'ZZZ9'},{av:'AV15Carvitin',fld:'vCARVITIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_MACPROPRG3",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13464MacProPrg3',fld:'MACPROPRG3',pic:''},{av:'AV17ExiPrg',fld:'vEXIPRG',pic:'ZZZ9'}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_MACPROLIN","{handler:'valid_Macprolin',iparms:[]");
      setEventMetadata("VALID_MACPROLIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O764ProForCod'},{av:'O8011MacPrdTt'},{av:'O6097MacSumTim'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A8011MacPrdTt',fld:'MACPRDTT',pic:'ZZZ9'},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'AV26Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'A8011MacPrdTt',fld:'MACPRDTT',pic:'ZZZ9'},{av:'AV26Modif',fld:'vMODIF',pic:''}]}");
      setEventMetadata("VALID_PROFORTIE","{handler:'valid_Profortie',iparms:[]");
      setEventMetadata("VALID_PROFORTIE",",oparms:[]}");
      setEventMetadata("VALID_MACPRDTT","{handler:'valid_Macprdtt',iparms:[]");
      setEventMetadata("VALID_MACPRDTT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Macnh2o',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      wcpOAV21MacProCod = "" ;
      Z396EmprCod = "" ;
      Z1514MacProCod = "" ;
      Z1515MacProDsc = "" ;
      Z6231MacProDsc2 = "" ;
      Z12534MacKgTTin = DecimalUtil.ZERO ;
      Z13463MacProPrg2 = "" ;
      Z13464MacProPrg3 = "" ;
      Z5425MacProMat = "" ;
      O12534MacKgTTin = DecimalUtil.ZERO ;
      O1515MacProDsc = "" ;
      Z10549MacRb = DecimalUtil.ZERO ;
      Z764ProForCod = "" ;
      O764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV25Msg_er = "" ;
      A13463MacProPrg2 = "" ;
      A13464MacProPrg3 = "" ;
      Gx_mode = "" ;
      A1514MacProCod = "" ;
      A764ProForCod = "" ;
      AV20EmprCod = "" ;
      AV21MacProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      A5425MacProMat = "" ;
      A12534MacKgTTin = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV33Pgmname = "" ;
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      Combo_proforcod_Caption = "" ;
      AV28ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_procesosquimicosContainer = new com.genexus.webpanels.GXWebGrid(context);
      B12534MacKgTTin = DecimalUtil.ZERO ;
      B1515MacProDsc = "" ;
      sMode215 = "" ;
      A13755MacProCDsc = "" ;
      AV19Inc_obs = "" ;
      AV27Modif2 = "" ;
      AV18msg_err = "" ;
      AV9UsurCod = "" ;
      AV7Station = "" ;
      A407EmprNom = "" ;
      AV26Modif = "" ;
      A766ProForDsc = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
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
      sMode214 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sV26Modif = "" ;
      OV26Modif = "" ;
      GXCCtl = "" ;
      A769ProForMat = "" ;
      A10549MacRb = DecimalUtil.ZERO ;
      T764ProForCod = "" ;
      GXt_char1 = "" ;
      AV8EmprNom = "" ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01RO7_A407EmprNom = new String[] {""} ;
      T01RO7_n407EmprNom = new boolean[] {false} ;
      T01RO9_A6097MacSumTim = new int[1] ;
      T01RO9_n6097MacSumTim = new boolean[] {false} ;
      T01RO11_A1514MacProCod = new String[] {""} ;
      T01RO11_n1514MacProCod = new boolean[] {false} ;
      T01RO11_A1515MacProDsc = new String[] {""} ;
      T01RO11_A6231MacProDsc2 = new String[] {""} ;
      T01RO11_A6096MacNumPrg = new int[1] ;
      T01RO11_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RO11_A13463MacProPrg2 = new String[] {""} ;
      T01RO11_A13464MacProPrg3 = new String[] {""} ;
      T01RO11_A407EmprNom = new String[] {""} ;
      T01RO11_n407EmprNom = new boolean[] {false} ;
      T01RO11_A1516MacProULin = new short[1] ;
      T01RO11_A5424MacProTmx = new short[1] ;
      T01RO11_n5424MacProTmx = new boolean[] {false} ;
      T01RO11_A5425MacProMat = new String[] {""} ;
      T01RO11_n5425MacProMat = new boolean[] {false} ;
      T01RO11_A396EmprCod = new String[] {""} ;
      T01RO11_A6097MacSumTim = new int[1] ;
      T01RO11_n6097MacSumTim = new boolean[] {false} ;
      T01RO13_A6097MacSumTim = new int[1] ;
      T01RO13_n6097MacSumTim = new boolean[] {false} ;
      T01RO14_A396EmprCod = new String[] {""} ;
      T01RO14_A1514MacProCod = new String[] {""} ;
      T01RO14_n1514MacProCod = new boolean[] {false} ;
      T01RO6_A1514MacProCod = new String[] {""} ;
      T01RO6_n1514MacProCod = new boolean[] {false} ;
      T01RO6_A1515MacProDsc = new String[] {""} ;
      T01RO6_A6231MacProDsc2 = new String[] {""} ;
      T01RO6_A6096MacNumPrg = new int[1] ;
      T01RO6_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RO6_A13463MacProPrg2 = new String[] {""} ;
      T01RO6_A13464MacProPrg3 = new String[] {""} ;
      T01RO6_A1516MacProULin = new short[1] ;
      T01RO6_A5424MacProTmx = new short[1] ;
      T01RO6_n5424MacProTmx = new boolean[] {false} ;
      T01RO6_A5425MacProMat = new String[] {""} ;
      T01RO6_n5425MacProMat = new boolean[] {false} ;
      T01RO6_A396EmprCod = new String[] {""} ;
      T01RO15_A396EmprCod = new String[] {""} ;
      T01RO15_A1514MacProCod = new String[] {""} ;
      T01RO15_n1514MacProCod = new boolean[] {false} ;
      T01RO16_A396EmprCod = new String[] {""} ;
      T01RO16_A1514MacProCod = new String[] {""} ;
      T01RO16_n1514MacProCod = new boolean[] {false} ;
      T01RO5_A1514MacProCod = new String[] {""} ;
      T01RO5_n1514MacProCod = new boolean[] {false} ;
      T01RO5_A1515MacProDsc = new String[] {""} ;
      T01RO5_A6231MacProDsc2 = new String[] {""} ;
      T01RO5_A6096MacNumPrg = new int[1] ;
      T01RO5_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RO5_A13463MacProPrg2 = new String[] {""} ;
      T01RO5_A13464MacProPrg3 = new String[] {""} ;
      T01RO5_A1516MacProULin = new short[1] ;
      T01RO5_A5424MacProTmx = new short[1] ;
      T01RO5_n5424MacProTmx = new boolean[] {false} ;
      T01RO5_A5425MacProMat = new String[] {""} ;
      T01RO5_n5425MacProMat = new boolean[] {false} ;
      T01RO5_A396EmprCod = new String[] {""} ;
      T01RO21_A6097MacSumTim = new int[1] ;
      T01RO21_n6097MacSumTim = new boolean[] {false} ;
      T01RO22_A396EmprCod = new String[] {""} ;
      T01RO22_A602MaqCod = new String[] {""} ;
      T01RO22_A8008Maq_Prg = new String[] {""} ;
      T01RO23_A396EmprCod = new String[] {""} ;
      T01RO23_A5532Lb_numero = new int[1] ;
      T01RO24_A396EmprCod = new String[] {""} ;
      T01RO24_A252CliCod = new int[1] ;
      T01RO24_A494ForSer = new String[] {""} ;
      T01RO24_A482ForColNom = new String[] {""} ;
      T01RO24_A483ForColNum = new int[1] ;
      T01RO24_A831TipColCod = new byte[1] ;
      T01RO26_A396EmprCod = new String[] {""} ;
      T01RO26_A1514MacProCod = new String[] {""} ;
      T01RO26_n1514MacProCod = new boolean[] {false} ;
      Z766ProForDsc = "" ;
      Z769ProForMat = "" ;
      T01RO27_A1514MacProCod = new String[] {""} ;
      T01RO27_n1514MacProCod = new boolean[] {false} ;
      T01RO27_A1517MacProLin = new short[1] ;
      T01RO27_A8011MacPrdTt = new short[1] ;
      T01RO27_A766ProForDsc = new String[] {""} ;
      T01RO27_A771ProForTie = new short[1] ;
      T01RO27_A772ProForTmx = new short[1] ;
      T01RO27_A769ProForMat = new String[] {""} ;
      T01RO27_A7787MacPrgNum = new short[1] ;
      T01RO27_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RO27_A10550MacNH2O = new short[1] ;
      T01RO27_A396EmprCod = new String[] {""} ;
      T01RO27_A764ProForCod = new String[] {""} ;
      T01RO4_A766ProForDsc = new String[] {""} ;
      T01RO4_A771ProForTie = new short[1] ;
      T01RO4_A772ProForTmx = new short[1] ;
      T01RO4_A769ProForMat = new String[] {""} ;
      T01RO28_A766ProForDsc = new String[] {""} ;
      T01RO28_A771ProForTie = new short[1] ;
      T01RO28_A772ProForTmx = new short[1] ;
      T01RO28_A769ProForMat = new String[] {""} ;
      T01RO29_A396EmprCod = new String[] {""} ;
      T01RO29_A1514MacProCod = new String[] {""} ;
      T01RO29_n1514MacProCod = new boolean[] {false} ;
      T01RO29_A1517MacProLin = new short[1] ;
      T01RO3_A1514MacProCod = new String[] {""} ;
      T01RO3_n1514MacProCod = new boolean[] {false} ;
      T01RO3_A1517MacProLin = new short[1] ;
      T01RO3_A8011MacPrdTt = new short[1] ;
      T01RO3_A7787MacPrgNum = new short[1] ;
      T01RO3_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RO3_A10550MacNH2O = new short[1] ;
      T01RO3_A396EmprCod = new String[] {""} ;
      T01RO3_A764ProForCod = new String[] {""} ;
      T01RO2_A1514MacProCod = new String[] {""} ;
      T01RO2_n1514MacProCod = new boolean[] {false} ;
      T01RO2_A1517MacProLin = new short[1] ;
      T01RO2_A8011MacPrdTt = new short[1] ;
      T01RO2_A7787MacPrgNum = new short[1] ;
      T01RO2_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RO2_A10550MacNH2O = new short[1] ;
      T01RO2_A396EmprCod = new String[] {""} ;
      T01RO2_A764ProForCod = new String[] {""} ;
      T01RO33_A766ProForDsc = new String[] {""} ;
      T01RO33_A771ProForTie = new short[1] ;
      T01RO33_A772ProForTmx = new short[1] ;
      T01RO33_A769ProForMat = new String[] {""} ;
      T01RO34_A396EmprCod = new String[] {""} ;
      T01RO34_A1514MacProCod = new String[] {""} ;
      T01RO34_n1514MacProCod = new boolean[] {false} ;
      T01RO34_A1517MacProLin = new short[1] ;
      Gridlevel_procesosquimicosRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_procesosquimicos_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_procesosquimicosColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_char2 = new String[1] ;
      ZV18msg_err = "" ;
      Z13755MacProCDsc = "" ;
      ZV19Inc_obs = "" ;
      GXv_int9 = new int[1] ;
      ZV25Msg_er = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      ZV26Modif = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomata__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomata__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomata__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomata__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomata__default(),
         new Object[] {
             new Object[] {
            T01RO2_A1514MacProCod, T01RO2_A1517MacProLin, T01RO2_A8011MacPrdTt, T01RO2_A7787MacPrgNum, T01RO2_A10549MacRb, T01RO2_A10550MacNH2O, T01RO2_A396EmprCod, T01RO2_A764ProForCod
            }
            , new Object[] {
            T01RO3_A1514MacProCod, T01RO3_A1517MacProLin, T01RO3_A8011MacPrdTt, T01RO3_A7787MacPrgNum, T01RO3_A10549MacRb, T01RO3_A10550MacNH2O, T01RO3_A396EmprCod, T01RO3_A764ProForCod
            }
            , new Object[] {
            T01RO4_A766ProForDsc, T01RO4_A771ProForTie, T01RO4_A772ProForTmx, T01RO4_A769ProForMat
            }
            , new Object[] {
            T01RO5_A1514MacProCod, T01RO5_A1515MacProDsc, T01RO5_A6231MacProDsc2, T01RO5_A6096MacNumPrg, T01RO5_A12534MacKgTTin, T01RO5_A13463MacProPrg2, T01RO5_A13464MacProPrg3, T01RO5_A1516MacProULin, T01RO5_A5424MacProTmx, T01RO5_n5424MacProTmx,
            T01RO5_A5425MacProMat, T01RO5_n5425MacProMat, T01RO5_A396EmprCod
            }
            , new Object[] {
            T01RO6_A1514MacProCod, T01RO6_A1515MacProDsc, T01RO6_A6231MacProDsc2, T01RO6_A6096MacNumPrg, T01RO6_A12534MacKgTTin, T01RO6_A13463MacProPrg2, T01RO6_A13464MacProPrg3, T01RO6_A1516MacProULin, T01RO6_A5424MacProTmx, T01RO6_n5424MacProTmx,
            T01RO6_A5425MacProMat, T01RO6_n5425MacProMat, T01RO6_A396EmprCod
            }
            , new Object[] {
            T01RO7_A407EmprNom, T01RO7_n407EmprNom
            }
            , new Object[] {
            T01RO9_A6097MacSumTim, T01RO9_n6097MacSumTim
            }
            , new Object[] {
            T01RO11_A1514MacProCod, T01RO11_A1515MacProDsc, T01RO11_A6231MacProDsc2, T01RO11_A6096MacNumPrg, T01RO11_A12534MacKgTTin, T01RO11_A13463MacProPrg2, T01RO11_A13464MacProPrg3, T01RO11_A407EmprNom, T01RO11_n407EmprNom, T01RO11_A1516MacProULin,
            T01RO11_A5424MacProTmx, T01RO11_n5424MacProTmx, T01RO11_A5425MacProMat, T01RO11_n5425MacProMat, T01RO11_A396EmprCod, T01RO11_A6097MacSumTim, T01RO11_n6097MacSumTim
            }
            , new Object[] {
            T01RO13_A6097MacSumTim, T01RO13_n6097MacSumTim
            }
            , new Object[] {
            T01RO14_A396EmprCod, T01RO14_A1514MacProCod
            }
            , new Object[] {
            T01RO15_A396EmprCod, T01RO15_A1514MacProCod
            }
            , new Object[] {
            T01RO16_A396EmprCod, T01RO16_A1514MacProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RO21_A6097MacSumTim, T01RO21_n6097MacSumTim
            }
            , new Object[] {
            T01RO22_A396EmprCod, T01RO22_A602MaqCod, T01RO22_A8008Maq_Prg
            }
            , new Object[] {
            T01RO23_A396EmprCod, T01RO23_A5532Lb_numero
            }
            , new Object[] {
            T01RO24_A396EmprCod, T01RO24_A252CliCod, T01RO24_A494ForSer, T01RO24_A482ForColNom, T01RO24_A483ForColNum, T01RO24_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01RO26_A396EmprCod, T01RO26_A1514MacProCod
            }
            , new Object[] {
            T01RO27_A1514MacProCod, T01RO27_A1517MacProLin, T01RO27_A8011MacPrdTt, T01RO27_A766ProForDsc, T01RO27_A771ProForTie, T01RO27_A772ProForTmx, T01RO27_A769ProForMat, T01RO27_A7787MacPrgNum, T01RO27_A10549MacRb, T01RO27_A10550MacNH2O,
            T01RO27_A396EmprCod, T01RO27_A764ProForCod
            }
            , new Object[] {
            T01RO28_A766ProForDsc, T01RO28_A771ProForTie, T01RO28_A772ProForTmx, T01RO28_A769ProForMat
            }
            , new Object[] {
            T01RO29_A396EmprCod, T01RO29_A1514MacProCod, T01RO29_A1517MacProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RO33_A766ProForDsc, T01RO33_A771ProForTie, T01RO33_A772ProForTmx, T01RO33_A769ProForMat
            }
            , new Object[] {
            T01RO34_A396EmprCod, T01RO34_A1514MacProCod, T01RO34_A1517MacProLin
            }
         }
      );
      AV33Pgmname = "FormulacionTinte.NumerodeProgramaAutomata" ;
      Z8011MacPrdTt = (short)(0) ;
      O8011MacPrdTt = (short)(0) ;
      A8011MacPrdTt = (short)(0) ;
      T8011MacPrdTt = (short)(0) ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_procesosquimicos_Backcolorstyle ;
   private byte subGridlevel_procesosquimicos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_procesosquimicos_Allowselection ;
   private byte subGridlevel_procesosquimicos_Allowhovering ;
   private byte subGridlevel_procesosquimicos_Allowcollapsing ;
   private byte subGridlevel_procesosquimicos_Collapsed ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private short Z1516MacProULin ;
   private short Z5424MacProTmx ;
   private short O1516MacProULin ;
   private short Z1517MacProLin ;
   private short Z8011MacPrdTt ;
   private short Z7787MacPrgNum ;
   private short Z10550MacNH2O ;
   private short O8011MacPrdTt ;
   private short nRcdDeleted_215 ;
   private short nRcdExists_215 ;
   private short nIsMod_215 ;
   private short AV16Nprog ;
   private short AV17ExiPrg ;
   private short AV15Carvitin ;
   private short AV12Noigual ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1516MacProULin ;
   private short A5424MacProTmx ;
   private short nBlankRcdCount215 ;
   private short RcdFound215 ;
   private short B1516MacProULin ;
   private short nBlankRcdUsr215 ;
   private short AV14jpf ;
   private short RcdFound214 ;
   private short s1516MacProULin ;
   private short A1517MacProLin ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A7787MacPrgNum ;
   private short A8011MacPrdTt ;
   private short A10550MacNH2O ;
   private short T8011MacPrdTt ;
   private short AV10F_CMACPR ;
   private short AV11Num_l ;
   private short AV13Eliot ;
   private short AV31moda21 ;
   private short nIsDirty_214 ;
   private short Z771ProForTie ;
   private short Z772ProForTmx ;
   private short nIsDirty_215 ;
   private short i1516MacProULin ;
   private short ZV17ExiPrg ;
   private int Z6096MacNumPrg ;
   private int O6097MacSumTim ;
   private int nRC_GXsfl_84 ;
   private int nGXsfl_84_idx=1 ;
   private int A6096MacNumPrg ;
   private int trnEnded ;
   private int edtMacPrgNum_Visible ;
   private int edtMacProCod_Enabled ;
   private int edtMacProDsc_Enabled ;
   private int edtMacProDsc2_Enabled ;
   private int divUnnamedtable2_Visible ;
   private int edtMacProMat_Enabled ;
   private int edtMacProTmx_Enabled ;
   private int A3602MacTotTie ;
   private int edtMacTotTie_Enabled ;
   private int edtMacNumPrg_Enabled ;
   private int edtMacKgTTin_Visible ;
   private int edtMacKgTTin_Enabled ;
   private int edtMacProPrg2_Enabled ;
   private int edtMacProPrg3_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int B6097MacSumTim ;
   private int A6097MacSumTim ;
   private int edtMacProLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForMat_Enabled ;
   private int edtProForMat_Visible ;
   private int edtMacPrgNum_Enabled ;
   private int edtMacPrdTt_Enabled ;
   private int edtMacRb_Enabled ;
   private int edtMacNH2O_Enabled ;
   private int fRowAdded ;
   private int Combo_proforcod_Datalistupdateminimumcharacters ;
   private int s6097MacSumTim ;
   private int GX_JID ;
   private int Z6097MacSumTim ;
   private int subGridlevel_procesosquimicos_Backcolor ;
   private int subGridlevel_procesosquimicos_Allbackcolor ;
   private int defedtMacNH2O_Enabled ;
   private int defedtMacPrdTt_Enabled ;
   private int defedtMacPrgNum_Enabled ;
   private int defedtMacProLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_procesosquimicos_Selectedindex ;
   private int subGridlevel_procesosquimicos_Selectioncolor ;
   private int subGridlevel_procesosquimicos_Hoveringcolor ;
   private int GXt_int8 ;
   private int Z3602MacTotTie ;
   private int GXv_int9[] ;
   private long GRIDLEVEL_PROCESOSQUIMICOS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12534MacKgTTin ;
   private java.math.BigDecimal O12534MacKgTTin ;
   private java.math.BigDecimal Z10549MacRb ;
   private java.math.BigDecimal A12534MacKgTTin ;
   private java.math.BigDecimal B12534MacKgTTin ;
   private java.math.BigDecimal A10549MacRb ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String wcpOAV21MacProCod ;
   private String Z396EmprCod ;
   private String Z1514MacProCod ;
   private String Z1515MacProDsc ;
   private String Z6231MacProDsc2 ;
   private String Z13463MacProPrg2 ;
   private String Z13464MacProPrg3 ;
   private String Z5425MacProMat ;
   private String O1515MacProDsc ;
   private String Z764ProForCod ;
   private String O764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV25Msg_er ;
   private String A13463MacProPrg2 ;
   private String A13464MacProPrg3 ;
   private String Gx_mode ;
   private String A1514MacProCod ;
   private String A764ProForCod ;
   private String AV20EmprCod ;
   private String AV21MacProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMacProCod_Internalname ;
   private String sGXsfl_84_idx="0001" ;
   private String edtMacPrgNum_Internalname ;
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
   private String TempTags ;
   private String edtMacProCod_Jsonclick ;
   private String edtMacProDsc_Internalname ;
   private String A1515MacProDsc ;
   private String edtMacProDsc_Jsonclick ;
   private String edtMacProDsc2_Internalname ;
   private String A6231MacProDsc2 ;
   private String edtMacProDsc2_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtMacProMat_Internalname ;
   private String A5425MacProMat ;
   private String edtMacProMat_Jsonclick ;
   private String edtMacProTmx_Internalname ;
   private String edtMacProTmx_Jsonclick ;
   private String edtMacTotTie_Internalname ;
   private String edtMacTotTie_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtMacNumPrg_Internalname ;
   private String edtMacNumPrg_Jsonclick ;
   private String divMackgttin_cell_Internalname ;
   private String divMackgttin_cell_Class ;
   private String edtMacKgTTin_Internalname ;
   private String edtMacKgTTin_Jsonclick ;
   private String divDvpanel_unnamedtable4_cell_Internalname ;
   private String divDvpanel_unnamedtable4_cell_Class ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtMacProPrg2_Internalname ;
   private String edtMacProPrg2_Jsonclick ;
   private String edtMacProPrg3_Internalname ;
   private String edtMacProPrg3_Jsonclick ;
   private String divTableleaflevel_procesosquimicos_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV33Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_proforcod_Caption ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Internalname ;
   private String B1515MacProDsc ;
   private String sMode215 ;
   private String edtMacProLin_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForTie_Internalname ;
   private String edtProForTmx_Internalname ;
   private String edtProForMat_Internalname ;
   private String edtMacPrdTt_Internalname ;
   private String edtMacRb_Internalname ;
   private String edtMacNH2O_Internalname ;
   private String subGridlevel_procesosquimicos_Internalname ;
   private String AV27Modif2 ;
   private String AV18msg_err ;
   private String AV9UsurCod ;
   private String AV7Station ;
   private String A407EmprNom ;
   private String AV26Modif ;
   private String A766ProForDsc ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
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
   private String sMode214 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sV26Modif ;
   private String OV26Modif ;
   private String GXCCtl ;
   private String A769ProForMat ;
   private String T764ProForCod ;
   private String GXt_char1 ;
   private String AV8EmprNom ;
   private String Z407EmprNom ;
   private String Z766ProForDsc ;
   private String Z769ProForMat ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String subGridlevel_procesosquimicos_Class ;
   private String subGridlevel_procesosquimicos_Linesclass ;
   private String ROClassString ;
   private String edtMacProLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForMat_Jsonclick ;
   private String edtMacPrgNum_Jsonclick ;
   private String edtMacPrdTt_Jsonclick ;
   private String edtMacRb_Jsonclick ;
   private String edtMacNH2O_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_procesosquimicos_Header ;
   private String GXv_char2[] ;
   private String ZV18msg_err ;
   private String ZV25Msg_er ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV26Modif ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1514MacProCod ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Combo_proforcod_Isgriditem ;
   private boolean Combo_proforcod_Emptyitem ;
   private boolean n6097MacSumTim ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_proforcod_Enabled ;
   private boolean Combo_proforcod_Visible ;
   private boolean Combo_proforcod_Allowmultipleselection ;
   private boolean Combo_proforcod_Hasdescription ;
   private boolean Combo_proforcod_Includeonlyselectedoption ;
   private boolean Combo_proforcod_Includeselectalloption ;
   private boolean Combo_proforcod_Includeaddnewoption ;
   private boolean n5425MacProMat ;
   private boolean n5424MacProTmx ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13755MacProCDsc ;
   private String AV19Inc_obs ;
   private String AV29ComboSelectedValue ;
   private String Z13755MacProCDsc ;
   private String ZV19Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_procesosquimicosContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_procesosquimicosRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_procesosquimicosColumn ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RO7_A407EmprNom ;
   private boolean[] T01RO7_n407EmprNom ;
   private int[] T01RO9_A6097MacSumTim ;
   private boolean[] T01RO9_n6097MacSumTim ;
   private String[] T01RO11_A1514MacProCod ;
   private boolean[] T01RO11_n1514MacProCod ;
   private String[] T01RO11_A1515MacProDsc ;
   private String[] T01RO11_A6231MacProDsc2 ;
   private int[] T01RO11_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RO11_A12534MacKgTTin ;
   private String[] T01RO11_A13463MacProPrg2 ;
   private String[] T01RO11_A13464MacProPrg3 ;
   private String[] T01RO11_A407EmprNom ;
   private boolean[] T01RO11_n407EmprNom ;
   private short[] T01RO11_A1516MacProULin ;
   private short[] T01RO11_A5424MacProTmx ;
   private boolean[] T01RO11_n5424MacProTmx ;
   private String[] T01RO11_A5425MacProMat ;
   private boolean[] T01RO11_n5425MacProMat ;
   private String[] T01RO11_A396EmprCod ;
   private int[] T01RO11_A6097MacSumTim ;
   private boolean[] T01RO11_n6097MacSumTim ;
   private int[] T01RO13_A6097MacSumTim ;
   private boolean[] T01RO13_n6097MacSumTim ;
   private String[] T01RO14_A396EmprCod ;
   private String[] T01RO14_A1514MacProCod ;
   private boolean[] T01RO14_n1514MacProCod ;
   private String[] T01RO6_A1514MacProCod ;
   private boolean[] T01RO6_n1514MacProCod ;
   private String[] T01RO6_A1515MacProDsc ;
   private String[] T01RO6_A6231MacProDsc2 ;
   private int[] T01RO6_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RO6_A12534MacKgTTin ;
   private String[] T01RO6_A13463MacProPrg2 ;
   private String[] T01RO6_A13464MacProPrg3 ;
   private short[] T01RO6_A1516MacProULin ;
   private short[] T01RO6_A5424MacProTmx ;
   private boolean[] T01RO6_n5424MacProTmx ;
   private String[] T01RO6_A5425MacProMat ;
   private boolean[] T01RO6_n5425MacProMat ;
   private String[] T01RO6_A396EmprCod ;
   private String[] T01RO15_A396EmprCod ;
   private String[] T01RO15_A1514MacProCod ;
   private boolean[] T01RO15_n1514MacProCod ;
   private String[] T01RO16_A396EmprCod ;
   private String[] T01RO16_A1514MacProCod ;
   private boolean[] T01RO16_n1514MacProCod ;
   private String[] T01RO5_A1514MacProCod ;
   private boolean[] T01RO5_n1514MacProCod ;
   private String[] T01RO5_A1515MacProDsc ;
   private String[] T01RO5_A6231MacProDsc2 ;
   private int[] T01RO5_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RO5_A12534MacKgTTin ;
   private String[] T01RO5_A13463MacProPrg2 ;
   private String[] T01RO5_A13464MacProPrg3 ;
   private short[] T01RO5_A1516MacProULin ;
   private short[] T01RO5_A5424MacProTmx ;
   private boolean[] T01RO5_n5424MacProTmx ;
   private String[] T01RO5_A5425MacProMat ;
   private boolean[] T01RO5_n5425MacProMat ;
   private String[] T01RO5_A396EmprCod ;
   private int[] T01RO21_A6097MacSumTim ;
   private boolean[] T01RO21_n6097MacSumTim ;
   private String[] T01RO22_A396EmprCod ;
   private String[] T01RO22_A602MaqCod ;
   private String[] T01RO22_A8008Maq_Prg ;
   private String[] T01RO23_A396EmprCod ;
   private int[] T01RO23_A5532Lb_numero ;
   private String[] T01RO24_A396EmprCod ;
   private int[] T01RO24_A252CliCod ;
   private String[] T01RO24_A494ForSer ;
   private String[] T01RO24_A482ForColNom ;
   private int[] T01RO24_A483ForColNum ;
   private byte[] T01RO24_A831TipColCod ;
   private String[] T01RO26_A396EmprCod ;
   private String[] T01RO26_A1514MacProCod ;
   private boolean[] T01RO26_n1514MacProCod ;
   private String[] T01RO27_A1514MacProCod ;
   private boolean[] T01RO27_n1514MacProCod ;
   private short[] T01RO27_A1517MacProLin ;
   private short[] T01RO27_A8011MacPrdTt ;
   private String[] T01RO27_A766ProForDsc ;
   private short[] T01RO27_A771ProForTie ;
   private short[] T01RO27_A772ProForTmx ;
   private String[] T01RO27_A769ProForMat ;
   private short[] T01RO27_A7787MacPrgNum ;
   private java.math.BigDecimal[] T01RO27_A10549MacRb ;
   private short[] T01RO27_A10550MacNH2O ;
   private String[] T01RO27_A396EmprCod ;
   private String[] T01RO27_A764ProForCod ;
   private String[] T01RO4_A766ProForDsc ;
   private short[] T01RO4_A771ProForTie ;
   private short[] T01RO4_A772ProForTmx ;
   private String[] T01RO4_A769ProForMat ;
   private String[] T01RO28_A766ProForDsc ;
   private short[] T01RO28_A771ProForTie ;
   private short[] T01RO28_A772ProForTmx ;
   private String[] T01RO28_A769ProForMat ;
   private String[] T01RO29_A396EmprCod ;
   private String[] T01RO29_A1514MacProCod ;
   private boolean[] T01RO29_n1514MacProCod ;
   private short[] T01RO29_A1517MacProLin ;
   private String[] T01RO3_A1514MacProCod ;
   private boolean[] T01RO3_n1514MacProCod ;
   private short[] T01RO3_A1517MacProLin ;
   private short[] T01RO3_A8011MacPrdTt ;
   private short[] T01RO3_A7787MacPrgNum ;
   private java.math.BigDecimal[] T01RO3_A10549MacRb ;
   private short[] T01RO3_A10550MacNH2O ;
   private String[] T01RO3_A396EmprCod ;
   private String[] T01RO3_A764ProForCod ;
   private String[] T01RO2_A1514MacProCod ;
   private boolean[] T01RO2_n1514MacProCod ;
   private short[] T01RO2_A1517MacProLin ;
   private short[] T01RO2_A8011MacPrdTt ;
   private short[] T01RO2_A7787MacPrgNum ;
   private java.math.BigDecimal[] T01RO2_A10549MacRb ;
   private short[] T01RO2_A10550MacNH2O ;
   private String[] T01RO2_A396EmprCod ;
   private String[] T01RO2_A764ProForCod ;
   private String[] T01RO33_A766ProForDsc ;
   private short[] T01RO33_A771ProForTie ;
   private short[] T01RO33_A772ProForTmx ;
   private String[] T01RO33_A769ProForMat ;
   private String[] T01RO34_A396EmprCod ;
   private String[] T01RO34_A1514MacProCod ;
   private boolean[] T01RO34_n1514MacProCod ;
   private short[] T01RO34_A1517MacProLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28ProForCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV23TrnContext ;
}

final  class numerodeprogramaautomata__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class numerodeprogramaautomata__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class numerodeprogramaautomata__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class numerodeprogramaautomata__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class numerodeprogramaautomata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RO2", "SELECT MacProCod, MacProLin, MacPrdTt, MacPrgNum, MacRb, MacNH2O, EmprCod, ProForCod FROM TXPLMACPR WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ?  FOR UPDATE OF MacPrdTt, MacPrgNum, MacRb, MacNH2O, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO3", "SELECT MacProCod, MacProLin, MacPrdTt, MacPrgNum, MacRb, MacNH2O, EmprCod, ProForCod FROM TXPLMACPR WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO4", "SELECT ProForDsc, ProForTie, ProForTmx, ProForMat FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO5", "SELECT MacProCod, MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin, MacProTmx, MacProMat, EmprCod FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ?  FOR UPDATE OF MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin, MacProTmx, MacProMat NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO6", "SELECT MacProCod, MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin, MacProTmx, MacProMat, EmprCod FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO9", "SELECT COALESCE( T1.MacSumTim, 0) AS MacSumTim FROM (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T1 WHERE T1.EmprCod = ? AND T1.MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO11", "SELECT /*+ FIRST_ROWS(100) */ TM1.MacProCod, TM1.MacProDsc, TM1.MacProDsc2, TM1.MacNumPrg, TM1.MacKgTTin, TM1.MacProPrg2, TM1.MacProPrg3, T2.EmprNom, TM1.MacProULin, TM1.MacProTmx, TM1.MacProMat, TM1.EmprCod, COALESCE( T3.MacSumTim, 0) AS MacSumTim FROM ((TXPCMACPR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.MacProCod = TM1.MacProCod) WHERE TM1.EmprCod = ? and TM1.MacProCod = ? ORDER BY TM1.EmprCod, TM1.MacProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO13", "SELECT COALESCE( T1.MacSumTim, 0) AS MacSumTim FROM (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T1 WHERE T1.EmprCod = ? AND T1.MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacProCod FROM TXPCMACPR WHERE ( EmprCod > ? or EmprCod = ? and MacProCod > ?) ORDER BY EmprCod, MacProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RO16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacProCod FROM TXPCMACPR WHERE ( EmprCod < ? or EmprCod = ? and MacProCod < ?) ORDER BY EmprCod DESC, MacProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RO17", "INSERT INTO TXPCMACPR(MacProCod, MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin, MacProTmx, MacProMat, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCMACPR")
         ,new UpdateCursor("T01RO18", "UPDATE TXPCMACPR SET MacProDsc=?, MacProDsc2=?, MacNumPrg=?, MacKgTTin=?, MacProPrg2=?, MacProPrg3=?, MacProULin=?, MacProTmx=?, MacProMat=?  WHERE EmprCod = ? AND MacProCod = ?", GX_NOMASK, "TXPCMACPR")
         ,new UpdateCursor("T01RO19", "DELETE FROM TXPCMACPR  WHERE EmprCod = ? AND MacProCod = ?", GX_NOMASK, "TXPCMACPR")
         ,new ForEachCursor("T01RO21", "SELECT COALESCE( T1.MacSumTim, 0) AS MacSumTim FROM (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T1 WHERE T1.EmprCod = ? AND T1.MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO22", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND Maq_Prg = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RO23", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND MacProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RO24", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND MacProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RO25", "UPDATE TXPCMACPR SET MacProULin=?  WHERE EmprCod = ? AND MacProCod = ?", GX_NOMASK, "TXPCMACPR")
         ,new ForEachCursor("T01RO26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MacProCod FROM TXPCMACPR ORDER BY EmprCod, MacProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO27", "SELECT T1.MacProCod, T1.MacProLin, T1.MacPrdTt, T2.ProForDsc, T2.ProForTie, T2.ProForTmx, T2.ProForMat, T1.MacPrgNum, T1.MacRb, T1.MacNH2O, T1.EmprCod, T1.ProForCod FROM (TXPLMACPR T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.MacProCod = ? and T1.MacProLin = ? ORDER BY T1.EmprCod, T1.MacProCod, T1.MacProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO28", "SELECT ProForDsc, ProForTie, ProForTmx, ProForMat FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO29", "SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RO30", "INSERT INTO TXPLMACPR(MacProCod, MacProLin, MacPrdTt, MacPrgNum, MacRb, MacNH2O, EmprCod, ProForCod, MacProNPro, MacProTPau) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPLMACPR")
         ,new UpdateCursor("T01RO31", "UPDATE TXPLMACPR SET MacPrdTt=?, MacPrgNum=?, MacRb=?, MacNH2O=?, ProForCod=?  WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ?", GX_NOMASK, "TXPLMACPR")
         ,new UpdateCursor("T01RO32", "DELETE FROM TXPLMACPR  WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ?", GX_NOMASK, "TXPLMACPR")
         ,new ForEachCursor("T01RO33", "SELECT ProForDsc, ProForTie, ProForTmx, ProForMat FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RO34", "SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod, MacProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 20);
               stmt.setString(3, (String)parms[3], 60);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 6);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 16);
               }
               stmt.setString(11, (String)parms[13], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 16);
               }
               stmt.setString(10, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 6);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 3);
               stmt.setString(8, (String)parms[8], 6);
               return;
            case 25 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

