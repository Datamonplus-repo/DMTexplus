package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class programasdetingimento_2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"PMDCOLNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8531PMDConCod = (int)(GXutil.lval( httpContext.GetPar( "PMDConCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx8asapmdcolnom1TZ1159( A396EmprCod, A252CliCod, A8531PMDConCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
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
         gxload_15( A396EmprCod, A252CliCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_pmdcol") == 0 )
      {
         gxnrgridlevel_pmdcol_newrow_invoke( ) ;
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
            AV9PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PMDCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9PMDCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programas de Tingimento", ""), (short)(0)) ;
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

   public void gxnrgridlevel_pmdcol_newrow_invoke( )
   {
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
      AV14Promptcolor = httpContext.GetPar( "Promptcolor") ;
      A8529PMDUltCon = (int)(GXutil.lval( httpContext.GetPar( "PMDUltCon"))) ;
      n8529PMDUltCon = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_pmdcol_newrow( ) ;
      /* End function gxnrGridlevel_pmdcol_newrow_invoke */
   }

   public programasdetingimento_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public programasdetingimento_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programasdetingimento_2_impl.class ));
   }

   public programasdetingimento_2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDCod_Internalname, httpContext.getMessage( "Programa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDDsc_Internalname, GXutil.rtrim( A8392PMDDsc), GXutil.rtrim( localUtil.format( A8392PMDDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_pmdcol_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts CellMarginTop", "left", "top", "", "", "div");
      gxdraw_gridlevel_pmdcol( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV19Pgmname), GXutil.rtrim( localUtil.format( AV19Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ProgramasdeTingimento_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_pmdcol( )
   {
      /*  Grid Control  */
      startgridcontrol43( ) ;
      nGXsfl_43_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1159 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1159 = (short)(1) ;
            scanStart1TZ1159( ) ;
            while ( RcdFound1159 != 0 )
            {
               init_level_properties1159( ) ;
               getByPrimaryKey1TZ1159( ) ;
               addRow1TZ1159( ) ;
               scanNext1TZ1159( ) ;
            }
            scanEnd1TZ1159( ) ;
            nBlankRcdCount1159 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8529PMDUltCon = A8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
         standaloneNotModal1TZ1159( ) ;
         standaloneModal1TZ1159( ) ;
         sMode1159 = Gx_mode ;
         while ( nGXsfl_43_idx < nRC_GXsfl_43 )
         {
            bGXsfl_43_Refreshing = true ;
            readRow1TZ1159( ) ;
            edtPMDColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNUM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDColCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLCLI_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDColCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColCli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDConCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCONCOD_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDConCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtavPromptcolor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPromptcolor_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtavPromptcolor_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPromptcolor_Visible), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNOM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREKGM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreKgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDEntKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDENTKGM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDEntKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDEntKgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDDtoTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOTIN_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoTin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDDtoAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOACA_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoAca_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREUNI_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreUni_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtPMDValFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDVALFCH_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDValFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDValFch_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            if ( ( nRcdExists_1159 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TZ1159( ) ;
            }
            sendRow1TZ1159( ) ;
            bGXsfl_43_Refreshing = false ;
         }
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8529PMDUltCon = B8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1159 = (short)(5) ;
         nRcdExists_1159 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TZ1159( ) ;
            while ( RcdFound1159 != 0 )
            {
               sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_431159( ) ;
               init_level_properties1159( ) ;
               standaloneNotModal1TZ1159( ) ;
               getByPrimaryKey1TZ1159( ) ;
               standaloneModal1TZ1159( ) ;
               addRow1TZ1159( ) ;
               scanNext1TZ1159( ) ;
            }
            scanEnd1TZ1159( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1159 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_431159( ) ;
         initAll1TZ1159( ) ;
         init_level_properties1159( ) ;
         B8529PMDUltCon = A8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
         nRcdExists_1159 = (short)(0) ;
         nIsMod_1159 = (short)(0) ;
         nRcdDeleted_1159 = (short)(0) ;
         nBlankRcdCount1159 = (short)(nBlankRcdUsr1159+nBlankRcdCount1159) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1159 > 0 )
         {
            standaloneNotModal1TZ1159( ) ;
            standaloneModal1TZ1159( ) ;
            addRow1TZ1159( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPMDColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1159 = (short)(nBlankRcdCount1159-1) ;
         }
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8529PMDUltCon = B8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_pmdcolContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_pmdcol", Gridlevel_pmdcolContainer, subGridlevel_pmdcol_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_pmdcolContainerData", Gridlevel_pmdcolContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_pmdcolContainerData"+"V", Gridlevel_pmdcolContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_pmdcolContainerData"+"V"+"\" value='"+Gridlevel_pmdcolContainer.GridValuesHidden()+"'/>") ;
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
      e111TZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z8391PMDCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8392PMDDsc = httpContext.cgiGet( "Z8392PMDDsc") ;
            Z8529PMDUltCon = (int)(localUtil.ctol( httpContext.cgiGet( "Z8529PMDUltCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8529PMDUltCon = (int)(localUtil.ctol( httpContext.cgiGet( "Z8529PMDUltCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8529PMDUltCon = false ;
            O8529PMDUltCon = (int)(localUtil.ctol( httpContext.cgiGet( "O8529PMDUltCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( "vPMDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8529PMDUltCon = (int)(localUtil.ctol( httpContext.cgiGet( "PMDULTCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A8390PMDProUlt = (short)(localUtil.ctol( httpContext.cgiGet( "PMDPROULT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8390PMDProUlt = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
            A8392PMDDsc = httpContext.cgiGet( edtPMDDsc_Internalname) ;
            n8392PMDDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
            AV19Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ProgramasdeTingimento_2");
            A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A8392PMDDsc = httpContext.cgiGet( edtPMDDsc_Internalname) ;
            n8392PMDDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
            forbiddenHiddens.add("PMDDsc", GXutil.rtrim( localUtil.format( A8392PMDDsc, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\programasdetingimento_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A8391PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
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
                  sMode1158 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1158 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1158 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TZ0( ) ;
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
                        e111TZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TZ2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 18), "VPROMPTCOLOR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VPROMPTCOLOR.CLICK") == 0 ) )
                     {
                        nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_431159( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                        {
                           GXCCtl = "PMDCOLNUM_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDColNum_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8393PMDColNum = 0 ;
                        }
                        else
                        {
                           A8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A8530PMDColCli = httpContext.cgiGet( edtPMDColCli_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                        {
                           GXCCtl = "PMDCONCOD_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDConCod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8531PMDConCod = 0 ;
                        }
                        else
                        {
                           A8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        AV14Promptcolor = httpContext.cgiGet( edtavPromptcolor_Internalname) ;
                        httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "Bitmap", ((GXutil.strcmp("", AV14Promptcolor)==0) ? AV20Promptcolor_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14Promptcolor))), !bGXsfl_43_Refreshing);
                        httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14Promptcolor), true);
                        A8394PMDColNom = httpContext.cgiGet( edtPMDColNom_Internalname) ;
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                        {
                           GXCCtl = "PMDPREKGM_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDPreKgm_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8395PMDPreKgm = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                        {
                           GXCCtl = "PMDENTKGM_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDEntKgm_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8396PMDEntKgm = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                        {
                           GXCCtl = "PMDDTOTIN_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDDtoTin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8397PMDDtoTin = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                        {
                           GXCCtl = "PMDDTOACA_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDDtoAca_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8398PMDDtoAca = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
                        {
                           GXCCtl = "PMDPREUNI_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDPreUni_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8532PMDPreUni = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)) ;
                        }
                        if ( localUtil.vcdate( httpContext.cgiGet( edtPMDValFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
                        {
                           GXCCtl = "PMDVALFCH_" + sGXsfl_43_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtPMDValFch_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A8399PMDValFch = GXutil.nullDate() ;
                        }
                        else
                        {
                           A8399PMDValFch = localUtil.ctod( httpContext.cgiGet( edtPMDValFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                        }
                        GXCCtl = "Z8393PMDColNum_" + sGXsfl_43_idx ;
                        Z8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z8398PMDDtoAca_" + sGXsfl_43_idx ;
                        Z8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z8395PMDPreKgm_" + sGXsfl_43_idx ;
                        Z8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z8396PMDEntKgm_" + sGXsfl_43_idx ;
                        Z8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z8397PMDDtoTin_" + sGXsfl_43_idx ;
                        Z8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z8399PMDValFch_" + sGXsfl_43_idx ;
                        Z8399PMDValFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
                        GXCCtl = "Z8530PMDColCli_" + sGXsfl_43_idx ;
                        Z8530PMDColCli = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z8531PMDConCod_" + sGXsfl_43_idx ;
                        Z8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z8532PMDPreUni_" + sGXsfl_43_idx ;
                        Z8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "nRcdDeleted_1159_" + sGXsfl_43_idx ;
                        nRcdDeleted_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdExists_1159_" + sGXsfl_43_idx ;
                        nRcdExists_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nIsMod_1159_" + sGXsfl_43_idx ;
                        nIsMod_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "VPROMPTCOLOR.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e131TZ2 ();
                           }
                        }
                        else
                        {
                        }
                     }
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
         e121TZ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TZ1158( ) ;
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
         disableAttributes1TZ1158( ) ;
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

   public void confirm_1TZ0( )
   {
      beforeValidate1TZ1158( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TZ1158( ) ;
         }
         else
         {
            checkExtendedTable1TZ1158( ) ;
            closeExtendedTableCursors1TZ1158( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1158 = Gx_mode ;
         confirm_1TZ1159( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1158 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1158 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TZ1159( )
   {
      s8529PMDUltCon = O8529PMDUltCon ;
      n8529PMDUltCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRow1TZ1159( ) ;
         if ( ( nRcdExists_1159 != 0 ) || ( nIsMod_1159 != 0 ) )
         {
            getKey1TZ1159( ) ;
            if ( ( nRcdExists_1159 == 0 ) && ( nRcdDeleted_1159 == 0 ) )
            {
               if ( RcdFound1159 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TZ1159( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TZ1159( ) ;
                     closeExtendedTableCursors1TZ1159( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8529PMDUltCon = A8529PMDUltCon ;
                     n8529PMDUltCon = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "PMDCOLNUM_" + sGXsfl_43_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMDColNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1159 != 0 )
               {
                  if ( nRcdDeleted_1159 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TZ1159( ) ;
                     load1TZ1159( ) ;
                     beforeValidate1TZ1159( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TZ1159( ) ;
                        O8529PMDUltCon = A8529PMDUltCon ;
                        n8529PMDUltCon = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1159 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TZ1159( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TZ1159( ) ;
                           closeExtendedTableCursors1TZ1159( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8529PMDUltCon = A8529PMDUltCon ;
                           n8529PMDUltCon = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1159 == 0 )
                  {
                     GXCCtl = "PMDCOLNUM_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDColNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMDColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDColCli_Internalname, GXutil.rtrim( A8530PMDColCli)) ;
         httpContext.changePostValue( edtPMDConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavPromptcolor_Internalname, AV14Promptcolor) ;
         httpContext.changePostValue( edtPMDColNom_Internalname, GXutil.rtrim( A8394PMDColNom)) ;
         httpContext.changePostValue( edtPMDPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDEntKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoAca_Internalname, GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDValFch_Internalname, localUtil.format(A8399PMDValFch, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z8393PMDColNum_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8399PMDValFch_"+sGXsfl_43_idx, localUtil.dtoc( Z8399PMDValFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8530PMDColCli_"+sGXsfl_43_idx, GXutil.rtrim( Z8530PMDColCli)) ;
         httpContext.changePostValue( "ZT_"+"Z8531PMDConCod_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1159_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1159_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1159_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1159 != 0 )
         {
            httpContext.changePostValue( "PMDCOLNUM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLCLI_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCONCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLNOM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREKGM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDENTKGM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOTIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOACA_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREUNI_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDVALFCH_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8529PMDUltCon = s8529PMDUltCon ;
      n8529PMDUltCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TZ0( )
   {
   }

   public void e111TZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV13WS_PMDCod = (short)(GXutil.lval( AV12WebSession.getValue("PMDCod"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13WS_PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13WS_PMDCod), 4, 0));
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      programasdetingimento_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      programasdetingimento_2_impl.this.AV7EmprCod = GXv_char2[0] ;
      programasdetingimento_2_impl.this.AV16EmprNom = GXv_char3[0] ;
      programasdetingimento_2_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtavPromptcolor_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "gximage", edtavPromptcolor_gximage, !bGXsfl_43_Refreshing);
      AV14Promptcolor = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "Bitmap", ((GXutil.strcmp("", AV14Promptcolor)==0) ? AV20Promptcolor_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14Promptcolor))), !bGXsfl_43_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14Promptcolor), true);
      AV20Promptcolor_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "Bitmap", ((GXutil.strcmp("", AV14Promptcolor)==0) ? AV20Promptcolor_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14Promptcolor))), !bGXsfl_43_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavPromptcolor_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14Promptcolor), true);
   }

   public void e121TZ2( )
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

   public void e131TZ2( )
   {
      /* Promptcolor_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionformulatinteprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(A8394PMDColNom)),GXutil.URLEncode(GXutil.ltrimstr(A8531PMDConCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"EmprCod","CliCod","ForSer","Forcolnom","Forcolnum","TipColCod","ForNomcli","ForNumCli"}) , new Object[] {"A252CliCod","","A8394PMDColNom","A8531PMDConCod","","",""});
      /*  Sending Event outputs  */
   }

   public void zm1TZ1158( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8392PMDDsc = T01TZ5_A8392PMDDsc[0] ;
            Z8529PMDUltCon = T01TZ5_A8529PMDUltCon[0] ;
         }
         else
         {
            Z8392PMDDsc = A8392PMDDsc ;
            Z8529PMDUltCon = A8529PMDUltCon ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z8391PMDCod = A8391PMDCod ;
         Z8392PMDDsc = A8392PMDDsc ;
         Z8529PMDUltCon = A8529PMDUltCon ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z8390PMDProUlt = A8390PMDProUlt ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtPMDCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), true);
      edtPMDDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDsc_Enabled), 5, 0), true);
      AV19Pgmname = "Facturacion.ProgramasdeTingimento_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtPMDCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), true);
      edtPMDDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV9PMDCod) )
      {
         A8391PMDCod = AV9PMDCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
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
         /* Using cursor T01TZ6 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T01TZ6_A407EmprNom[0] ;
         n407EmprNom = T01TZ6_n407EmprNom[0] ;
         pr_default.close(4);
         /* Using cursor T01TZ7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TZ7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8390PMDProUlt = T01TZ7_A8390PMDProUlt[0] ;
         n8390PMDProUlt = T01TZ7_n8390PMDProUlt[0] ;
         pr_default.close(5);
      }
   }

   public void load1TZ1158( )
   {
      /* Using cursor T01TZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1158 = (short)(1) ;
         A407EmprNom = T01TZ8_A407EmprNom[0] ;
         n407EmprNom = T01TZ8_n407EmprNom[0] ;
         A279CliNom = T01TZ8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8392PMDDsc = T01TZ8_A8392PMDDsc[0] ;
         n8392PMDDsc = T01TZ8_n8392PMDDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
         A8390PMDProUlt = T01TZ8_A8390PMDProUlt[0] ;
         n8390PMDProUlt = T01TZ8_n8390PMDProUlt[0] ;
         A8529PMDUltCon = T01TZ8_A8529PMDUltCon[0] ;
         n8529PMDUltCon = T01TZ8_n8529PMDUltCon[0] ;
         zm1TZ1158( -13) ;
      }
      pr_default.close(6);
      onLoadActions1TZ1158( ) ;
   }

   public void onLoadActions1TZ1158( )
   {
   }

   public void checkExtendedTable1TZ1158( )
   {
      nIsDirty_1158 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01TZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TZ6_A407EmprNom[0] ;
      n407EmprNom = T01TZ6_n407EmprNom[0] ;
      pr_default.close(4);
      /* Using cursor T01TZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TZ7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8390PMDProUlt = T01TZ7_A8390PMDProUlt[0] ;
      n8390PMDProUlt = T01TZ7_n8390PMDProUlt[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1TZ1158( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod )
   {
      /* Using cursor T01TZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TZ9_A407EmprNom[0] ;
      n407EmprNom = T01TZ9_n407EmprNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TZ10_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8390PMDProUlt = T01TZ10_A8390PMDProUlt[0] ;
      n8390PMDProUlt = T01TZ10_n8390PMDProUlt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8390PMDProUlt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1TZ1158( )
   {
      /* Using cursor T01TZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1158 = (short)(1) ;
      }
      else
      {
         RcdFound1158 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1TZ1158( 13) ;
         RcdFound1158 = (short)(1) ;
         A8391PMDCod = T01TZ5_A8391PMDCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         A8392PMDDsc = T01TZ5_A8392PMDDsc[0] ;
         n8392PMDDsc = T01TZ5_n8392PMDDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
         A8529PMDUltCon = T01TZ5_A8529PMDUltCon[0] ;
         n8529PMDUltCon = T01TZ5_n8529PMDUltCon[0] ;
         A396EmprCod = T01TZ5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01TZ5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         O8529PMDUltCon = A8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         sMode1158 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TZ1158( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1158 = (short)(0) ;
            initializeNonKey1TZ1158( ) ;
         }
         Gx_mode = sMode1158 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1158 = (short)(0) ;
         initializeNonKey1TZ1158( ) ;
         sMode1158 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1158 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1TZ1158( ) ;
      if ( RcdFound1158 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1158 = (short)(0) ;
      /* Using cursor T01TZ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01TZ12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TZ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ12_A252CliCod[0] < A252CliCod ) || ( T01TZ12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TZ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ12_A8391PMDCod[0] < A8391PMDCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01TZ12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TZ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ12_A252CliCod[0] > A252CliCod ) || ( T01TZ12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TZ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ12_A8391PMDCod[0] > A8391PMDCod ) ) )
         {
            A396EmprCod = T01TZ12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01TZ12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A8391PMDCod = T01TZ12_A8391PMDCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
            RcdFound1158 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1158 = (short)(0) ;
      /* Using cursor T01TZ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01TZ13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TZ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ13_A252CliCod[0] > A252CliCod ) || ( T01TZ13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TZ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ13_A8391PMDCod[0] > A8391PMDCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01TZ13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TZ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ13_A252CliCod[0] < A252CliCod ) || ( T01TZ13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TZ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TZ13_A8391PMDCod[0] < A8391PMDCod ) ) )
         {
            A396EmprCod = T01TZ13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01TZ13_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A8391PMDCod = T01TZ13_A8391PMDCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
            RcdFound1158 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TZ1158( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8529PMDUltCon = O8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
         insert1TZ1158( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1158 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A8391PMDCod = Z8391PMDCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A8529PMDUltCon = O8529PMDUltCon ;
               n8529PMDUltCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A8529PMDUltCon = O8529PMDUltCon ;
               n8529PMDUltCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
               update1TZ1158( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) )
            {
               /* Insert record */
               A8529PMDUltCon = O8529PMDUltCon ;
               n8529PMDUltCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
               insert1TZ1158( ) ;
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
                  A8529PMDUltCon = O8529PMDUltCon ;
                  n8529PMDUltCon = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
                  insert1TZ1158( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = Z8391PMDCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A8529PMDUltCon = O8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TZ1158( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z8392PMDDsc, T01TZ4_A8392PMDDsc[0]) != 0 ) || ( Z8529PMDUltCon != T01TZ4_A8529PMDUltCon[0] ) )
         {
            if ( GXutil.strcmp(Z8392PMDDsc, T01TZ4_A8392PMDDsc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDDsc");
               GXutil.writeLogRaw("Old: ",Z8392PMDDsc);
               GXutil.writeLogRaw("Current: ",T01TZ4_A8392PMDDsc[0]);
            }
            if ( Z8529PMDUltCon != T01TZ4_A8529PMDUltCon[0] )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDUltCon");
               GXutil.writeLogRaw("Old: ",Z8529PMDUltCon);
               GXutil.writeLogRaw("Current: ",T01TZ4_A8529PMDUltCon[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPProMD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TZ1158( )
   {
      beforeValidate1TZ1158( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TZ1158( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TZ1158( 0) ;
         checkOptimisticConcurrency1TZ1158( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TZ1158( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TZ1158( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TZ14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A8391PMDCod), Boolean.valueOf(n8392PMDDsc), A8392PMDDsc, Boolean.valueOf(n8529PMDUltCon), Integer.valueOf(A8529PMDUltCon), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1TZ1158( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TZ0( ) ;
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
            load1TZ1158( ) ;
         }
         endLevel1TZ1158( ) ;
      }
      closeExtendedTableCursors1TZ1158( ) ;
   }

   public void update1TZ1158( )
   {
      beforeValidate1TZ1158( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TZ1158( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TZ1158( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TZ1158( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TZ1158( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TZ15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n8392PMDDsc), A8392PMDDsc, Boolean.valueOf(n8529PMDUltCon), Integer.valueOf(A8529PMDUltCon), A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TZ1158( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TZ1158( ) ;
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
         endLevel1TZ1158( ) ;
      }
      closeExtendedTableCursors1TZ1158( ) ;
   }

   public void deferredUpdate1TZ1158( )
   {
   }

   public void delete( )
   {
      beforeValidate1TZ1158( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TZ1158( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TZ1158( ) ;
         afterConfirm1TZ1158( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TZ1158( ) ;
            if ( AnyError == 0 )
            {
               A8529PMDUltCon = O8529PMDUltCon ;
               n8529PMDUltCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
               scanStart1TZ1159( ) ;
               while ( RcdFound1159 != 0 )
               {
                  getByPrimaryKey1TZ1159( ) ;
                  delete1TZ1159( ) ;
                  scanNext1TZ1159( ) ;
                  O8529PMDUltCon = A8529PMDUltCon ;
                  n8529PMDUltCon = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
               }
               scanEnd1TZ1159( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TZ16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
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
      sMode1158 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TZ1158( ) ;
      Gx_mode = sMode1158 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TZ1158( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TZ17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01TZ17_A407EmprNom[0] ;
         n407EmprNom = T01TZ17_n407EmprNom[0] ;
         pr_default.close(15);
         /* Using cursor T01TZ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TZ18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8390PMDProUlt = T01TZ18_A8390PMDProUlt[0] ;
         n8390PMDProUlt = T01TZ18_n8390PMDProUlt[0] ;
         pr_default.close(16);
      }
   }

   public void processNestedLevel1TZ1159( )
   {
      s8529PMDUltCon = O8529PMDUltCon ;
      n8529PMDUltCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRow1TZ1159( ) ;
         if ( ( nRcdExists_1159 != 0 ) || ( nIsMod_1159 != 0 ) )
         {
            standaloneNotModal1TZ1159( ) ;
            getKey1TZ1159( ) ;
            if ( ( nRcdExists_1159 == 0 ) && ( nRcdDeleted_1159 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TZ1159( ) ;
            }
            else
            {
               if ( RcdFound1159 != 0 )
               {
                  if ( ( nRcdDeleted_1159 != 0 ) && ( nRcdExists_1159 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TZ1159( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1159 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TZ1159( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1159 == 0 )
                  {
                     GXCCtl = "PMDCOLNUM_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDColNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8529PMDUltCon = A8529PMDUltCon ;
            n8529PMDUltCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
         }
         httpContext.changePostValue( edtPMDColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDColCli_Internalname, GXutil.rtrim( A8530PMDColCli)) ;
         httpContext.changePostValue( edtPMDConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavPromptcolor_Internalname, AV14Promptcolor) ;
         httpContext.changePostValue( edtPMDColNom_Internalname, GXutil.rtrim( A8394PMDColNom)) ;
         httpContext.changePostValue( edtPMDPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDEntKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoAca_Internalname, GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDValFch_Internalname, localUtil.format(A8399PMDValFch, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z8393PMDColNum_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8399PMDValFch_"+sGXsfl_43_idx, localUtil.dtoc( Z8399PMDValFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8530PMDColCli_"+sGXsfl_43_idx, GXutil.rtrim( Z8530PMDColCli)) ;
         httpContext.changePostValue( "ZT_"+"Z8531PMDConCod_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1159_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1159_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1159_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1159 != 0 )
         {
            httpContext.changePostValue( "PMDCOLNUM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLCLI_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCONCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLNOM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREKGM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDENTKGM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOTIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOACA_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREUNI_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDVALFCH_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TZ1159( ) ;
      if ( AnyError != 0 )
      {
         O8529PMDUltCon = s8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      }
      nRcdExists_1159 = (short)(0) ;
      nIsMod_1159 = (short)(0) ;
      nRcdDeleted_1159 = (short)(0) ;
   }

   public void processLevel1TZ1158( )
   {
      /* Save parent mode. */
      sMode1158 = Gx_mode ;
      processNestedLevel1TZ1159( ) ;
      if ( AnyError != 0 )
      {
         O8529PMDUltCon = s8529PMDUltCon ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1158 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01TZ19 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n8529PMDUltCon), Integer.valueOf(A8529PMDUltCon), A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
   }

   public void endLevel1TZ1158( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1TZ1158( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.programasdetingimento_2");
         if ( AnyError == 0 )
         {
            confirmValues1TZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.programasdetingimento_2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TZ1158( )
   {
      /* Scan By routine */
      /* Using cursor T01TZ20 */
      pr_default.execute(18);
      RcdFound1158 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1158 = (short)(1) ;
         A396EmprCod = T01TZ20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01TZ20_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = T01TZ20_A8391PMDCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TZ1158( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1158 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1158 = (short)(1) ;
         A396EmprCod = T01TZ20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01TZ20_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = T01TZ20_A8391PMDCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
      }
   }

   public void scanEnd1TZ1158( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1TZ1158( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TZ1158( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TZ1158( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TZ1158( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TZ1158( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TZ1158( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TZ1158( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPMDCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), true);
      edtPMDDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void zm1TZ1159( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8398PMDDtoAca = T01TZ3_A8398PMDDtoAca[0] ;
            Z8395PMDPreKgm = T01TZ3_A8395PMDPreKgm[0] ;
            Z8396PMDEntKgm = T01TZ3_A8396PMDEntKgm[0] ;
            Z8397PMDDtoTin = T01TZ3_A8397PMDDtoTin[0] ;
            Z8399PMDValFch = T01TZ3_A8399PMDValFch[0] ;
            Z8530PMDColCli = T01TZ3_A8530PMDColCli[0] ;
            Z8531PMDConCod = T01TZ3_A8531PMDConCod[0] ;
            Z8532PMDPreUni = T01TZ3_A8532PMDPreUni[0] ;
         }
         else
         {
            Z8398PMDDtoAca = A8398PMDDtoAca ;
            Z8395PMDPreKgm = A8395PMDPreKgm ;
            Z8396PMDEntKgm = A8396PMDEntKgm ;
            Z8397PMDDtoTin = A8397PMDDtoTin ;
            Z8399PMDValFch = A8399PMDValFch ;
            Z8530PMDColCli = A8530PMDColCli ;
            Z8531PMDConCod = A8531PMDConCod ;
            Z8532PMDPreUni = A8532PMDPreUni ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z8393PMDColNum = A8393PMDColNum ;
         Z8398PMDDtoAca = A8398PMDDtoAca ;
         Z8395PMDPreKgm = A8395PMDPreKgm ;
         Z8396PMDEntKgm = A8396PMDEntKgm ;
         Z8397PMDDtoTin = A8397PMDDtoTin ;
         Z8399PMDValFch = A8399PMDValFch ;
         Z8530PMDColCli = A8530PMDColCli ;
         Z8531PMDConCod = A8531PMDConCod ;
         Z8532PMDPreUni = A8532PMDPreUni ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1TZ1159( )
   {
   }

   public void standaloneModal1TZ1159( )
   {
      if ( isIns( )  )
      {
         A8529PMDUltCon = (int)(O8529PMDUltCon+1) ;
         n8529PMDUltCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A8393PMDColNum = A8529PMDUltCon ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMDColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
      else
      {
         edtPMDColNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
   }

   public void load1TZ1159( )
   {
      /* Using cursor T01TZ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A8398PMDDtoAca = T01TZ21_A8398PMDDtoAca[0] ;
         A8395PMDPreKgm = T01TZ21_A8395PMDPreKgm[0] ;
         A8396PMDEntKgm = T01TZ21_A8396PMDEntKgm[0] ;
         A8397PMDDtoTin = T01TZ21_A8397PMDDtoTin[0] ;
         A8399PMDValFch = T01TZ21_A8399PMDValFch[0] ;
         A8530PMDColCli = T01TZ21_A8530PMDColCli[0] ;
         A8531PMDConCod = T01TZ21_A8531PMDConCod[0] ;
         A8532PMDPreUni = T01TZ21_A8532PMDPreUni[0] ;
         zm1TZ1159( -16) ;
      }
      pr_default.close(19);
      onLoadActions1TZ1159( ) ;
   }

   public void onLoadActions1TZ1159( )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      programasdetingimento_2_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8398PMDDtoAca)==0) && ( Gx_BScreen == 0 ) )
      {
         A8398PMDDtoAca = A8397PMDDtoTin ;
      }
   }

   public void checkExtendedTable1TZ1159( )
   {
      nIsDirty_1159 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1TZ1159( ) ;
      nIsDirty_1159 = (short)(1) ;
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      programasdetingimento_2_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8398PMDDtoAca)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1159 = (short)(1) ;
         A8398PMDDtoAca = A8397PMDDtoTin ;
      }
   }

   public void closeExtendedTableCursors1TZ1159( )
   {
   }

   public void enableDisable1TZ1159( )
   {
   }

   public void getKey1TZ1159( )
   {
      /* Using cursor T01TZ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1159 = (short)(1) ;
      }
      else
      {
         RcdFound1159 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1TZ1159( )
   {
      /* Using cursor T01TZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TZ1159( 16) ;
         RcdFound1159 = (short)(1) ;
         initializeNonKey1TZ1159( ) ;
         A8393PMDColNum = T01TZ3_A8393PMDColNum[0] ;
         A8398PMDDtoAca = T01TZ3_A8398PMDDtoAca[0] ;
         A8395PMDPreKgm = T01TZ3_A8395PMDPreKgm[0] ;
         A8396PMDEntKgm = T01TZ3_A8396PMDEntKgm[0] ;
         A8397PMDDtoTin = T01TZ3_A8397PMDDtoTin[0] ;
         A8399PMDValFch = T01TZ3_A8399PMDValFch[0] ;
         A8530PMDColCli = T01TZ3_A8530PMDColCli[0] ;
         A8531PMDConCod = T01TZ3_A8531PMDConCod[0] ;
         A8532PMDPreUni = T01TZ3_A8532PMDPreUni[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z8393PMDColNum = A8393PMDColNum ;
         sMode1159 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TZ1159( ) ;
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1159 = (short)(0) ;
         initializeNonKey1TZ1159( ) ;
         sMode1159 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TZ1159( ) ;
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TZ1159( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TZ1159( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8398PMDDtoAca, T01TZ2_A8398PMDDtoAca[0]) != 0 ) || ( DecimalUtil.compareTo(Z8395PMDPreKgm, T01TZ2_A8395PMDPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z8396PMDEntKgm, T01TZ2_A8396PMDEntKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z8397PMDDtoTin, T01TZ2_A8397PMDDtoTin[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8399PMDValFch), GXutil.resetTime(T01TZ2_A8399PMDValFch[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8530PMDColCli, T01TZ2_A8530PMDColCli[0]) != 0 ) || ( Z8531PMDConCod != T01TZ2_A8531PMDConCod[0] ) || ( DecimalUtil.compareTo(Z8532PMDPreUni, T01TZ2_A8532PMDPreUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8398PMDDtoAca, T01TZ2_A8398PMDDtoAca[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDDtoAca");
               GXutil.writeLogRaw("Old: ",Z8398PMDDtoAca);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8398PMDDtoAca[0]);
            }
            if ( DecimalUtil.compareTo(Z8395PMDPreKgm, T01TZ2_A8395PMDPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDPreKgm");
               GXutil.writeLogRaw("Old: ",Z8395PMDPreKgm);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8395PMDPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z8396PMDEntKgm, T01TZ2_A8396PMDEntKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDEntKgm");
               GXutil.writeLogRaw("Old: ",Z8396PMDEntKgm);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8396PMDEntKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z8397PMDDtoTin, T01TZ2_A8397PMDDtoTin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDDtoTin");
               GXutil.writeLogRaw("Old: ",Z8397PMDDtoTin);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8397PMDDtoTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8399PMDValFch), GXutil.resetTime(T01TZ2_A8399PMDValFch[0])) ) )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDValFch");
               GXutil.writeLogRaw("Old: ",Z8399PMDValFch);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8399PMDValFch[0]);
            }
            if ( GXutil.strcmp(Z8530PMDColCli, T01TZ2_A8530PMDColCli[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDColCli");
               GXutil.writeLogRaw("Old: ",Z8530PMDColCli);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8530PMDColCli[0]);
            }
            if ( Z8531PMDConCod != T01TZ2_A8531PMDConCod[0] )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDConCod");
               GXutil.writeLogRaw("Old: ",Z8531PMDConCod);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8531PMDConCod[0]);
            }
            if ( DecimalUtil.compareTo(Z8532PMDPreUni, T01TZ2_A8532PMDPreUni[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.programasdetingimento_2:[seudo value changed for attri]"+"PMDPreUni");
               GXutil.writeLogRaw("Old: ",Z8532PMDPreUni);
               GXutil.writeLogRaw("Current: ",T01TZ2_A8532PMDPreUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPProMD1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TZ1159( )
   {
      beforeValidate1TZ1159( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TZ1159( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TZ1159( 0) ;
         checkOptimisticConcurrency1TZ1159( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TZ1159( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TZ1159( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TZ23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum), A8398PMDDtoAca, A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1TZ1159( ) ;
         }
         endLevel1TZ1159( ) ;
      }
      closeExtendedTableCursors1TZ1159( ) ;
   }

   public void update1TZ1159( )
   {
      beforeValidate1TZ1159( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TZ1159( ) ;
      }
      if ( ( nIsMod_1159 != 0 ) || ( nIsDirty_1159 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TZ1159( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TZ1159( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TZ1159( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TZ24 */
                     pr_default.execute(22, new Object[] {A8398PMDDtoAca, A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TZ1159( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TZ1159( ) ;
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
            endLevel1TZ1159( ) ;
         }
      }
      closeExtendedTableCursors1TZ1159( ) ;
   }

   public void deferredUpdate1TZ1159( )
   {
   }

   public void delete1TZ1159( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TZ1159( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TZ1159( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TZ1159( ) ;
         afterConfirm1TZ1159( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TZ1159( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TZ25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
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
      sMode1159 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TZ1159( ) ;
      Gx_mode = sMode1159 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TZ1159( )
   {
      standaloneModal1TZ1159( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A8394PMDColNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
         programasdetingimento_2_impl.this.GXt_char1 = GXv_char4[0] ;
         A8394PMDColNom = GXt_char1 ;
      }
   }

   public void endLevel1TZ1159( )
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

   public void scanStart1TZ1159( )
   {
      /* Scan By routine */
      /* Using cursor T01TZ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      RcdFound1159 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A8393PMDColNum = T01TZ26_A8393PMDColNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TZ1159( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1159 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A8393PMDColNum = T01TZ26_A8393PMDColNum[0] ;
      }
   }

   public void scanEnd1TZ1159( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1TZ1159( )
   {
      /* After Confirm Rules */
      if ( ( A8397PMDDtoTin.doubleValue() == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8532PMDPreUni)==0) && true /* After */ )
      {
         GXCCtl = "PMDDTOTIN_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Desc T(%)", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDDtoTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1TZ1159( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TZ1159( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TZ1159( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TZ1159( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TZ1159( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TZ1159( )
   {
      edtPMDColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDColCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColCli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDConCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDConCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreKgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDEntKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDEntKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDEntKgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDDtoTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoTin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDDtoAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoAca_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDPreUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreUni_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtPMDValFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDValFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDValFch_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void send_integrity_lvl_hashes1TZ1159( )
   {
   }

   public void send_integrity_lvl_hashes1TZ1158( )
   {
   }

   public void subsflControlProps_431159( )
   {
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_43_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_43_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_43_idx ;
      edtavPromptcolor_Internalname = "vPROMPTCOLOR_"+sGXsfl_43_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_43_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_43_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_43_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_43_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_43_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_43_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_431159( )
   {
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_43_fel_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_43_fel_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_43_fel_idx ;
      edtavPromptcolor_Internalname = "vPROMPTCOLOR_"+sGXsfl_43_fel_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_43_fel_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_43_fel_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_43_fel_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_43_fel_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_43_fel_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_43_fel_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_43_fel_idx ;
   }

   public void addRow1TZ1159( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_431159( ) ;
      sendRow1TZ1159( ) ;
   }

   public void sendRow1TZ1159( )
   {
      Gridlevel_pmdcolRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_pmdcol_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_pmdcol_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_pmdcol_Class, "") != 0 )
         {
            subGridlevel_pmdcol_Linesclass = subGridlevel_pmdcol_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_pmdcol_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_pmdcol_Backstyle = (byte)(0) ;
         subGridlevel_pmdcol_Backcolor = subGridlevel_pmdcol_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_pmdcol_Class, "") != 0 )
         {
            subGridlevel_pmdcol_Linesclass = subGridlevel_pmdcol_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_pmdcol_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_pmdcol_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_pmdcol_Class, "") != 0 )
         {
            subGridlevel_pmdcol_Linesclass = subGridlevel_pmdcol_Class+"Odd" ;
         }
         subGridlevel_pmdcol_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_pmdcol_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_pmdcol_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
         {
            subGridlevel_pmdcol_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_pmdcol_Class, "") != 0 )
            {
               subGridlevel_pmdcol_Linesclass = subGridlevel_pmdcol_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_pmdcol_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_pmdcol_Class, "") != 0 )
            {
               subGridlevel_pmdcol_Linesclass = subGridlevel_pmdcol_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDColNum_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColCli_Internalname,GXutil.rtrim( A8530PMDColCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDColCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDConCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDConCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDConCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDConCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',43)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavPromptcolor_gximage, "")==0) ? "" : "GX_Image_"+edtavPromptcolor_gximage+"_Class") ;
      StyleString = "" ;
      AV14Promptcolor_IsBlob = (boolean)(((GXutil.strcmp("", AV14Promptcolor)==0)&&(GXutil.strcmp("", AV20Promptcolor_GXI)==0))||!(GXutil.strcmp("", AV14Promptcolor)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV14Promptcolor)==0) ? AV20Promptcolor_GXI : httpContext.getResourceRelative(AV14Promptcolor)) ;
      Gridlevel_pmdcolRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavPromptcolor_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavPromptcolor_Visible),Integer.valueOf(edtavPromptcolor_Enabled),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavPromptcolor_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVPROMPTCOLOR.CLICK."+sGXsfl_43_idx+"'",StyleString,ClassString,"TrnColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV14Promptcolor_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNom_Internalname,GXutil.rtrim( A8394PMDColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDPreKgm_Enabled!=0) ? localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99") : localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDEntKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDEntKgm_Enabled!=0) ? localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 ") : localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 "))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDEntKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDEntKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoTin_Internalname,GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDDtoTin_Enabled!=0) ? localUtil.format( A8397PMDDtoTin, "ZZ9.99 ") : localUtil.format( A8397PMDDtoTin, "ZZ9.99 "))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDDtoTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoAca_Internalname,GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDDtoAca_Enabled!=0) ? localUtil.format( A8398PMDDtoAca, "ZZ9.99") : localUtil.format( A8398PMDDtoAca, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDDtoAca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreUni_Internalname,GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDPreUni_Enabled!=0) ? localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999") : localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDPreUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_pmdcolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDValFch_Internalname,localUtil.format(A8399PMDValFch, "99/99/99"),localUtil.format( A8399PMDValFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDValFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDValFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_pmdcolRow);
      send_integrity_lvl_hashes1TZ1159( ) ;
      GXCCtl = "Z8393PMDColNum_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8398PMDDtoAca_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8395PMDPreKgm_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8396PMDEntKgm_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8397PMDDtoTin_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8399PMDValFch_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z8399PMDValFch, 0, "/"));
      GXCCtl = "Z8530PMDColCli_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8530PMDColCli));
      GXCCtl = "Z8531PMDConCod_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8532PMDPreUni_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1159_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1159_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1159_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPMDCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLNUM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLCLI_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCONCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROMPTCOLOR_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROMPTCOLOR_"+sGXsfl_43_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLNOM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDPREKGM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDENTKGM_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDDTOTIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDDTOACA_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDPREUNI_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDVALFCH_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_pmdcolContainer.AddRow(Gridlevel_pmdcolRow);
   }

   public void readRow1TZ1159( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_431159( ) ;
      edtPMDColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNUM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDColCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLCLI_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDConCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCONCOD_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavPromptcolor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavPromptcolor_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vPROMPTCOLOR_"+sGXsfl_43_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNOM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREKGM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDEntKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDENTKGM_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDDtoTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOTIN_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDDtoAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOACA_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREUNI_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDValFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDVALFCH_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PMDCOLNUM_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDColNum_Internalname ;
         wbErr = true ;
         A8393PMDColNum = 0 ;
      }
      else
      {
         A8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8530PMDColCli = httpContext.cgiGet( edtPMDColCli_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PMDCONCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDConCod_Internalname ;
         wbErr = true ;
         A8531PMDConCod = 0 ;
      }
      else
      {
         A8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      AV14Promptcolor = httpContext.cgiGet( edtavPromptcolor_Internalname) ;
      A8394PMDColNom = httpContext.cgiGet( edtPMDColNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDPREKGM_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDPreKgm_Internalname ;
         wbErr = true ;
         A8395PMDPreKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDENTKGM_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDEntKgm_Internalname ;
         wbErr = true ;
         A8396PMDEntKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDDTOTIN_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDDtoTin_Internalname ;
         wbErr = true ;
         A8397PMDDtoTin = DecimalUtil.ZERO ;
      }
      else
      {
         A8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDDTOACA_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDDtoAca_Internalname ;
         wbErr = true ;
         A8398PMDDtoAca = DecimalUtil.ZERO ;
      }
      else
      {
         A8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PMDPREUNI_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDPreUni_Internalname ;
         wbErr = true ;
         A8532PMDPreUni = DecimalUtil.ZERO ;
      }
      else
      {
         A8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtPMDValFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "PMDVALFCH_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDValFch_Internalname ;
         wbErr = true ;
         A8399PMDValFch = GXutil.nullDate() ;
      }
      else
      {
         A8399PMDValFch = localUtil.ctod( httpContext.cgiGet( edtPMDValFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      GXCCtl = "Z8393PMDColNum_" + sGXsfl_43_idx ;
      Z8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8398PMDDtoAca_" + sGXsfl_43_idx ;
      Z8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8395PMDPreKgm_" + sGXsfl_43_idx ;
      Z8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8396PMDEntKgm_" + sGXsfl_43_idx ;
      Z8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8397PMDDtoTin_" + sGXsfl_43_idx ;
      Z8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8399PMDValFch_" + sGXsfl_43_idx ;
      Z8399PMDValFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8530PMDColCli_" + sGXsfl_43_idx ;
      Z8530PMDColCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8531PMDConCod_" + sGXsfl_43_idx ;
      Z8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8532PMDPreUni_" + sGXsfl_43_idx ;
      Z8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1159_" + sGXsfl_43_idx ;
      nRcdDeleted_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1159_" + sGXsfl_43_idx ;
      nRcdExists_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1159_" + sGXsfl_43_idx ;
      nIsMod_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPMDColNum_Enabled = edtPMDColNum_Enabled ;
   }

   public void confirmValues1TZ0( )
   {
      nGXsfl_43_idx = 0 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_431159( ) ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_431159( ) ;
         httpContext.changePostValue( "Z8393PMDColNum_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8393PMDColNum_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8393PMDColNum_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8398PMDDtoAca_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8395PMDPreKgm_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8396PMDEntKgm_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8397PMDDtoTin_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8399PMDValFch_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8399PMDValFch_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8399PMDValFch_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8530PMDColCli_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8530PMDColCli_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8530PMDColCli_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8531PMDConCod_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8531PMDConCod_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8531PMDConCod_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8532PMDPreUni_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_43_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.programasdetingimento_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9PMDCod,4,0))}, new String[] {"Gx_mode","EmprCod","CliCod","PMDCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ProgramasdeTingimento_2");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("PMDDsc", GXutil.rtrim( localUtil.format( A8392PMDDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\programasdetingimento_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8391PMDCod", GXutil.ltrim( localUtil.ntoc( Z8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8392PMDDsc", GXutil.rtrim( Z8392PMDDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8529PMDUltCon", GXutil.ltrim( localUtil.ntoc( Z8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8529PMDUltCon", GXutil.ltrim( localUtil.ntoc( O8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nGXsfl_43_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDCOD", GXutil.ltrim( localUtil.ntoc( AV9PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9PMDCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDULTCON", GXutil.ltrim( localUtil.ntoc( A8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDPROULT", GXutil.ltrim( localUtil.ntoc( A8390PMDProUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.facturacion.programasdetingimento_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9PMDCod,4,0))}, new String[] {"Gx_mode","EmprCod","CliCod","PMDCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.ProgramasdeTingimento_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programas de Tingimento", "") ;
   }

   public void initializeNonKey1TZ1158( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8392PMDDsc = "" ;
      n8392PMDDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
      A8390PMDProUlt = (short)(0) ;
      n8390PMDProUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8390PMDProUlt), 4, 0));
      A8529PMDUltCon = 0 ;
      n8529PMDUltCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      O8529PMDUltCon = A8529PMDUltCon ;
      n8529PMDUltCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
      Z8392PMDDsc = "" ;
      Z8529PMDUltCon = 0 ;
   }

   public void initAll1TZ1158( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A8391PMDCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
      initializeNonKey1TZ1158( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TZ1159( )
   {
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8530PMDColCli = "" ;
      A8531PMDConCod = 0 ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8395PMDPreKgm = DecimalUtil.ZERO ;
      Z8396PMDEntKgm = DecimalUtil.ZERO ;
      Z8397PMDDtoTin = DecimalUtil.ZERO ;
      Z8399PMDValFch = GXutil.nullDate() ;
      Z8530PMDColCli = "" ;
      Z8531PMDConCod = 0 ;
      Z8532PMDPreUni = DecimalUtil.ZERO ;
   }

   public void initAll1TZ1159( )
   {
      A8393PMDColNum = 0 ;
      initializeNonKey1TZ1159( ) ;
   }

   public void standaloneModalInsert1TZ1159( )
   {
      A8529PMDUltCon = i8529PMDUltCon ;
      n8529PMDUltCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8529PMDUltCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8529PMDUltCon), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102015", true, true);
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
      httpContext.AddJavascriptSource("facturacion/programasdetingimento_2.js", "?202682116102015", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1159( )
   {
      edtPMDColNum_Enabled = defedtPMDColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void startgridcontrol43( )
   {
      Gridlevel_pmdcolContainer.AddObjectProperty("GridName", "Gridlevel_pmdcol");
      Gridlevel_pmdcolContainer.AddObjectProperty("Header", subGridlevel_pmdcol_Header);
      Gridlevel_pmdcolContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_pmdcolContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_pmdcolContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.rtrim( A8530PMDColCli));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", httpContext.convertURL( AV14Promptcolor));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPromptcolor_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.rtrim( A8394PMDColNom));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_pmdcolColumn.AddObjectProperty("Value", localUtil.format(A8399PMDValFch, "99/99/99"));
      Gridlevel_pmdcolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddColumnProperties(Gridlevel_pmdcolColumn);
      Gridlevel_pmdcolContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_pmdcolContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_pmdcol_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtPMDCod_Internalname = "PMDCOD" ;
      edtPMDDsc_Internalname = "PMDDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPMDColNum_Internalname = "PMDCOLNUM" ;
      edtPMDColCli_Internalname = "PMDCOLCLI" ;
      edtPMDConCod_Internalname = "PMDCONCOD" ;
      edtavPromptcolor_Internalname = "vPROMPTCOLOR" ;
      edtPMDColNom_Internalname = "PMDCOLNOM" ;
      edtPMDPreKgm_Internalname = "PMDPREKGM" ;
      edtPMDEntKgm_Internalname = "PMDENTKGM" ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN" ;
      edtPMDDtoAca_Internalname = "PMDDTOACA" ;
      edtPMDPreUni_Internalname = "PMDPREUNI" ;
      edtPMDValFch_Internalname = "PMDVALFCH" ;
      divTableleaflevel_pmdcol_Internalname = "TABLELEAFLEVEL_PMDCOL" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_pmdcol_Internalname = "GRIDLEVEL_PMDCOL" ;
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
      subGridlevel_pmdcol_Allowcollapsing = (byte)(0) ;
      subGridlevel_pmdcol_Allowselection = (byte)(0) ;
      subGridlevel_pmdcol_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programas de Tingimento", "") );
      edtPMDValFch_Jsonclick = "" ;
      edtPMDPreUni_Jsonclick = "" ;
      edtPMDDtoAca_Jsonclick = "" ;
      edtPMDDtoTin_Jsonclick = "" ;
      edtPMDEntKgm_Jsonclick = "" ;
      edtPMDPreKgm_Jsonclick = "" ;
      edtPMDColNom_Jsonclick = "" ;
      edtavPromptcolor_Jsonclick = "" ;
      edtPMDConCod_Jsonclick = "" ;
      edtPMDColCli_Jsonclick = "" ;
      edtPMDColNum_Jsonclick = "" ;
      subGridlevel_pmdcol_Class = "GridNoBorder WorkWith" ;
      subGridlevel_pmdcol_Backcolorstyle = (byte)(0) ;
      edtavPromptcolor_gximage = "" ;
      edtPMDValFch_Enabled = 1 ;
      edtPMDPreUni_Enabled = 1 ;
      edtPMDDtoAca_Enabled = 1 ;
      edtPMDDtoTin_Enabled = 1 ;
      edtPMDEntKgm_Enabled = 1 ;
      edtPMDPreKgm_Enabled = 1 ;
      edtPMDColNom_Enabled = 0 ;
      edtavPromptcolor_Visible = -1 ;
      edtavPromptcolor_Enabled = 1 ;
      edtPMDConCod_Enabled = 1 ;
      edtPMDColCli_Enabled = 1 ;
      edtPMDColNum_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPMDDsc_Jsonclick = "" ;
      edtPMDDsc_Enabled = 0 ;
      edtPMDCod_Jsonclick = "" ;
      edtPMDCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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

   public void gx8asapmdcolnom1TZ1159( String A396EmprCod ,
                                       int A252CliCod ,
                                       int A8531PMDConCod )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      programasdetingimento_2_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8394PMDColNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_pmdcol_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_431159( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TZ1159( ) ;
         standaloneModal1TZ1159( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TZ1159( ) ;
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_431159( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_pmdcolContainer)) ;
      /* End function gxnrGridlevel_pmdcol_newrow */
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      n8390PMDProUlt = false ;
      /* Using cursor T01TZ17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01TZ17_A407EmprNom[0] ;
      n407EmprNom = T01TZ17_n407EmprNom[0] ;
      pr_default.close(15);
      /* Using cursor T01TZ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01TZ18_A279CliNom[0] ;
      A8390PMDProUlt = T01TZ18_A8390PMDProUlt[0] ;
      n8390PMDProUlt = T01TZ18_n8390PMDProUlt[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrim( localUtil.ntoc( A8390PMDProUlt, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Pmdconcod( )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      programasdetingimento_2_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", GXutil.rtrim( A8394PMDColNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8392PMDDsc',fld:'PMDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TZ2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VPROMPTCOLOR.CLICK","{handler:'e131TZ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''},{av:'A8531PMDConCod',fld:'PMDCONCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VPROMPTCOLOR.CLICK",",oparms:[{av:'A8531PMDConCod',fld:'PMDCONCOD',pic:'ZZZZZ9'},{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_PMDCOD","{handler:'valid_Pmdcod',iparms:[]");
      setEventMetadata("VALID_PMDCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8390PMDProUlt',fld:'PMDPROULT',pic:'ZZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8390PMDProUlt',fld:'PMDPROULT',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PMDCOLNUM","{handler:'valid_Pmdcolnum',iparms:[]");
      setEventMetadata("VALID_PMDCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_PMDCONCOD","{handler:'valid_Pmdconcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8531PMDConCod',fld:'PMDCONCOD',pic:'ZZZZZ9'},{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''}]");
      setEventMetadata("VALID_PMDCONCOD",",oparms:[{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''}]}");
      setEventMetadata("VALID_PMDDTOTIN","{handler:'valid_Pmddtotin',iparms:[]");
      setEventMetadata("VALID_PMDDTOTIN",",oparms:[]}");
      setEventMetadata("VALID_PMDPREUNI","{handler:'valid_Pmdpreuni',iparms:[]");
      setEventMetadata("VALID_PMDPREUNI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pmdvalfch',iparms:[]");
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
      pr_default.close(16);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8392PMDDsc = "" ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8395PMDPreKgm = DecimalUtil.ZERO ;
      Z8396PMDEntKgm = DecimalUtil.ZERO ;
      Z8397PMDDtoTin = DecimalUtil.ZERO ;
      Z8399PMDValFch = GXutil.nullDate() ;
      Z8530PMDColCli = "" ;
      Z8532PMDPreUni = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      AV14Promptcolor = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      A8392PMDDsc = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV19Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_pmdcolContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1159 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1158 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      A8530PMDColCli = "" ;
      AV20Promptcolor_GXI = "" ;
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12WebSession = httpContext.getWebSession();
      AV15Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01TZ6_A407EmprNom = new String[] {""} ;
      T01TZ6_n407EmprNom = new boolean[] {false} ;
      T01TZ7_A279CliNom = new String[] {""} ;
      T01TZ7_A8390PMDProUlt = new short[1] ;
      T01TZ7_n8390PMDProUlt = new boolean[] {false} ;
      T01TZ8_A8391PMDCod = new short[1] ;
      T01TZ8_A407EmprNom = new String[] {""} ;
      T01TZ8_n407EmprNom = new boolean[] {false} ;
      T01TZ8_A279CliNom = new String[] {""} ;
      T01TZ8_A8392PMDDsc = new String[] {""} ;
      T01TZ8_n8392PMDDsc = new boolean[] {false} ;
      T01TZ8_A8390PMDProUlt = new short[1] ;
      T01TZ8_n8390PMDProUlt = new boolean[] {false} ;
      T01TZ8_A8529PMDUltCon = new int[1] ;
      T01TZ8_n8529PMDUltCon = new boolean[] {false} ;
      T01TZ8_A396EmprCod = new String[] {""} ;
      T01TZ8_A252CliCod = new int[1] ;
      T01TZ9_A407EmprNom = new String[] {""} ;
      T01TZ9_n407EmprNom = new boolean[] {false} ;
      T01TZ10_A279CliNom = new String[] {""} ;
      T01TZ10_A8390PMDProUlt = new short[1] ;
      T01TZ10_n8390PMDProUlt = new boolean[] {false} ;
      T01TZ11_A396EmprCod = new String[] {""} ;
      T01TZ11_A252CliCod = new int[1] ;
      T01TZ11_A8391PMDCod = new short[1] ;
      T01TZ5_A8391PMDCod = new short[1] ;
      T01TZ5_A8392PMDDsc = new String[] {""} ;
      T01TZ5_n8392PMDDsc = new boolean[] {false} ;
      T01TZ5_A8529PMDUltCon = new int[1] ;
      T01TZ5_n8529PMDUltCon = new boolean[] {false} ;
      T01TZ5_A396EmprCod = new String[] {""} ;
      T01TZ5_A252CliCod = new int[1] ;
      T01TZ12_A396EmprCod = new String[] {""} ;
      T01TZ12_A252CliCod = new int[1] ;
      T01TZ12_A8391PMDCod = new short[1] ;
      T01TZ13_A396EmprCod = new String[] {""} ;
      T01TZ13_A252CliCod = new int[1] ;
      T01TZ13_A8391PMDCod = new short[1] ;
      T01TZ4_A8391PMDCod = new short[1] ;
      T01TZ4_A8392PMDDsc = new String[] {""} ;
      T01TZ4_n8392PMDDsc = new boolean[] {false} ;
      T01TZ4_A8529PMDUltCon = new int[1] ;
      T01TZ4_n8529PMDUltCon = new boolean[] {false} ;
      T01TZ4_A396EmprCod = new String[] {""} ;
      T01TZ4_A252CliCod = new int[1] ;
      T01TZ17_A407EmprNom = new String[] {""} ;
      T01TZ17_n407EmprNom = new boolean[] {false} ;
      T01TZ18_A279CliNom = new String[] {""} ;
      T01TZ18_A8390PMDProUlt = new short[1] ;
      T01TZ18_n8390PMDProUlt = new boolean[] {false} ;
      T01TZ20_A396EmprCod = new String[] {""} ;
      T01TZ20_A252CliCod = new int[1] ;
      T01TZ20_A8391PMDCod = new short[1] ;
      T01TZ21_A252CliCod = new int[1] ;
      T01TZ21_A8391PMDCod = new short[1] ;
      T01TZ21_A8393PMDColNum = new int[1] ;
      T01TZ21_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ21_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ21_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ21_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ21_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TZ21_A8530PMDColCli = new String[] {""} ;
      T01TZ21_A8531PMDConCod = new int[1] ;
      T01TZ21_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ21_A396EmprCod = new String[] {""} ;
      T01TZ22_A396EmprCod = new String[] {""} ;
      T01TZ22_A252CliCod = new int[1] ;
      T01TZ22_A8391PMDCod = new short[1] ;
      T01TZ22_A8393PMDColNum = new int[1] ;
      T01TZ3_A252CliCod = new int[1] ;
      T01TZ3_A8391PMDCod = new short[1] ;
      T01TZ3_A8393PMDColNum = new int[1] ;
      T01TZ3_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ3_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ3_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ3_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ3_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TZ3_A8530PMDColCli = new String[] {""} ;
      T01TZ3_A8531PMDConCod = new int[1] ;
      T01TZ3_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ3_A396EmprCod = new String[] {""} ;
      T01TZ2_A252CliCod = new int[1] ;
      T01TZ2_A8391PMDCod = new short[1] ;
      T01TZ2_A8393PMDColNum = new int[1] ;
      T01TZ2_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ2_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ2_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ2_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TZ2_A8530PMDColCli = new String[] {""} ;
      T01TZ2_A8531PMDConCod = new int[1] ;
      T01TZ2_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TZ2_A396EmprCod = new String[] {""} ;
      T01TZ26_A396EmprCod = new String[] {""} ;
      T01TZ26_A252CliCod = new int[1] ;
      T01TZ26_A8391PMDCod = new short[1] ;
      T01TZ26_A8393PMDColNum = new int[1] ;
      Gridlevel_pmdcolRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_pmdcol_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_pmdcolColumn = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z8394PMDColNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.programasdetingimento_2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.programasdetingimento_2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.programasdetingimento_2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.programasdetingimento_2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.programasdetingimento_2__default(),
         new Object[] {
             new Object[] {
            T01TZ2_A252CliCod, T01TZ2_A8391PMDCod, T01TZ2_A8393PMDColNum, T01TZ2_A8398PMDDtoAca, T01TZ2_A8395PMDPreKgm, T01TZ2_A8396PMDEntKgm, T01TZ2_A8397PMDDtoTin, T01TZ2_A8399PMDValFch, T01TZ2_A8530PMDColCli, T01TZ2_A8531PMDConCod,
            T01TZ2_A8532PMDPreUni, T01TZ2_A396EmprCod
            }
            , new Object[] {
            T01TZ3_A252CliCod, T01TZ3_A8391PMDCod, T01TZ3_A8393PMDColNum, T01TZ3_A8398PMDDtoAca, T01TZ3_A8395PMDPreKgm, T01TZ3_A8396PMDEntKgm, T01TZ3_A8397PMDDtoTin, T01TZ3_A8399PMDValFch, T01TZ3_A8530PMDColCli, T01TZ3_A8531PMDConCod,
            T01TZ3_A8532PMDPreUni, T01TZ3_A396EmprCod
            }
            , new Object[] {
            T01TZ4_A8391PMDCod, T01TZ4_A8392PMDDsc, T01TZ4_n8392PMDDsc, T01TZ4_A8529PMDUltCon, T01TZ4_n8529PMDUltCon, T01TZ4_A396EmprCod, T01TZ4_A252CliCod
            }
            , new Object[] {
            T01TZ5_A8391PMDCod, T01TZ5_A8392PMDDsc, T01TZ5_n8392PMDDsc, T01TZ5_A8529PMDUltCon, T01TZ5_n8529PMDUltCon, T01TZ5_A396EmprCod, T01TZ5_A252CliCod
            }
            , new Object[] {
            T01TZ6_A407EmprNom, T01TZ6_n407EmprNom
            }
            , new Object[] {
            T01TZ7_A279CliNom, T01TZ7_A8390PMDProUlt, T01TZ7_n8390PMDProUlt
            }
            , new Object[] {
            T01TZ8_A8391PMDCod, T01TZ8_A407EmprNom, T01TZ8_n407EmprNom, T01TZ8_A279CliNom, T01TZ8_A8392PMDDsc, T01TZ8_n8392PMDDsc, T01TZ8_A8390PMDProUlt, T01TZ8_n8390PMDProUlt, T01TZ8_A8529PMDUltCon, T01TZ8_n8529PMDUltCon,
            T01TZ8_A396EmprCod, T01TZ8_A252CliCod
            }
            , new Object[] {
            T01TZ9_A407EmprNom, T01TZ9_n407EmprNom
            }
            , new Object[] {
            T01TZ10_A279CliNom, T01TZ10_A8390PMDProUlt, T01TZ10_n8390PMDProUlt
            }
            , new Object[] {
            T01TZ11_A396EmprCod, T01TZ11_A252CliCod, T01TZ11_A8391PMDCod
            }
            , new Object[] {
            T01TZ12_A396EmprCod, T01TZ12_A252CliCod, T01TZ12_A8391PMDCod
            }
            , new Object[] {
            T01TZ13_A396EmprCod, T01TZ13_A252CliCod, T01TZ13_A8391PMDCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TZ17_A407EmprNom, T01TZ17_n407EmprNom
            }
            , new Object[] {
            T01TZ18_A279CliNom, T01TZ18_A8390PMDProUlt, T01TZ18_n8390PMDProUlt
            }
            , new Object[] {
            }
            , new Object[] {
            T01TZ20_A396EmprCod, T01TZ20_A252CliCod, T01TZ20_A8391PMDCod
            }
            , new Object[] {
            T01TZ21_A252CliCod, T01TZ21_A8391PMDCod, T01TZ21_A8393PMDColNum, T01TZ21_A8398PMDDtoAca, T01TZ21_A8395PMDPreKgm, T01TZ21_A8396PMDEntKgm, T01TZ21_A8397PMDDtoTin, T01TZ21_A8399PMDValFch, T01TZ21_A8530PMDColCli, T01TZ21_A8531PMDConCod,
            T01TZ21_A8532PMDPreUni, T01TZ21_A396EmprCod
            }
            , new Object[] {
            T01TZ22_A396EmprCod, T01TZ22_A252CliCod, T01TZ22_A8391PMDCod, T01TZ22_A8393PMDColNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TZ26_A396EmprCod, T01TZ26_A252CliCod, T01TZ26_A8391PMDCod, T01TZ26_A8393PMDColNum
            }
         }
      );
      AV19Pgmname = "Facturacion.ProgramasdeTingimento_2" ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_pmdcol_Backcolorstyle ;
   private byte subGridlevel_pmdcol_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_pmdcol_Allowselection ;
   private byte subGridlevel_pmdcol_Allowhovering ;
   private byte subGridlevel_pmdcol_Allowcollapsing ;
   private byte subGridlevel_pmdcol_Collapsed ;
   private short wcpOAV9PMDCod ;
   private short Z8391PMDCod ;
   private short nRcdDeleted_1159 ;
   private short nRcdExists_1159 ;
   private short nIsMod_1159 ;
   private short AV9PMDCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8391PMDCod ;
   private short nBlankRcdCount1159 ;
   private short RcdFound1159 ;
   private short nBlankRcdUsr1159 ;
   private short A8390PMDProUlt ;
   private short RcdFound1158 ;
   private short AV13WS_PMDCod ;
   private short Z8390PMDProUlt ;
   private short nIsDirty_1158 ;
   private short nIsDirty_1159 ;
   private int wcpOAV8CliCod ;
   private int Z252CliCod ;
   private int Z8529PMDUltCon ;
   private int O8529PMDUltCon ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int Z8393PMDColNum ;
   private int Z8531PMDConCod ;
   private int A252CliCod ;
   private int A8531PMDConCod ;
   private int AV8CliCod ;
   private int trnEnded ;
   private int A8529PMDUltCon ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtPMDCod_Enabled ;
   private int edtPMDDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int B8529PMDUltCon ;
   private int edtPMDColNum_Enabled ;
   private int edtPMDColCli_Enabled ;
   private int edtPMDConCod_Enabled ;
   private int edtavPromptcolor_Enabled ;
   private int edtavPromptcolor_Visible ;
   private int edtPMDColNom_Enabled ;
   private int edtPMDPreKgm_Enabled ;
   private int edtPMDEntKgm_Enabled ;
   private int edtPMDDtoTin_Enabled ;
   private int edtPMDDtoAca_Enabled ;
   private int edtPMDPreUni_Enabled ;
   private int edtPMDValFch_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int A8393PMDColNum ;
   private int s8529PMDUltCon ;
   private int GX_JID ;
   private int subGridlevel_pmdcol_Backcolor ;
   private int subGridlevel_pmdcol_Allbackcolor ;
   private int defedtPMDColNum_Enabled ;
   private int i8529PMDUltCon ;
   private int idxLst ;
   private int subGridlevel_pmdcol_Selectedindex ;
   private int subGridlevel_pmdcol_Selectioncolor ;
   private int subGridlevel_pmdcol_Hoveringcolor ;
   private long GRIDLEVEL_PMDCOL_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8398PMDDtoAca ;
   private java.math.BigDecimal Z8395PMDPreKgm ;
   private java.math.BigDecimal Z8396PMDEntKgm ;
   private java.math.BigDecimal Z8397PMDDtoTin ;
   private java.math.BigDecimal Z8532PMDPreUni ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z8392PMDDsc ;
   private String Z8530PMDColCli ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_43_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtPMDCod_Internalname ;
   private String edtPMDCod_Jsonclick ;
   private String edtPMDDsc_Internalname ;
   private String A8392PMDDsc ;
   private String edtPMDDsc_Jsonclick ;
   private String divTableleaflevel_pmdcol_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV19Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String sMode1159 ;
   private String edtPMDColNum_Internalname ;
   private String edtPMDColCli_Internalname ;
   private String edtPMDConCod_Internalname ;
   private String edtavPromptcolor_Internalname ;
   private String edtPMDColNom_Internalname ;
   private String edtPMDPreKgm_Internalname ;
   private String edtPMDEntKgm_Internalname ;
   private String edtPMDDtoTin_Internalname ;
   private String edtPMDDtoAca_Internalname ;
   private String edtPMDPreUni_Internalname ;
   private String edtPMDValFch_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_pmdcol_Internalname ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1158 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String A8530PMDColCli ;
   private String A8394PMDColNom ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV15Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String edtavPromptcolor_gximage ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGridlevel_pmdcol_Class ;
   private String subGridlevel_pmdcol_Linesclass ;
   private String ROClassString ;
   private String edtPMDColNum_Jsonclick ;
   private String edtPMDColCli_Jsonclick ;
   private String edtPMDConCod_Jsonclick ;
   private String sImgUrl ;
   private String edtavPromptcolor_Jsonclick ;
   private String edtPMDColNom_Jsonclick ;
   private String edtPMDPreKgm_Jsonclick ;
   private String edtPMDEntKgm_Jsonclick ;
   private String edtPMDDtoTin_Jsonclick ;
   private String edtPMDDtoAca_Jsonclick ;
   private String edtPMDPreUni_Jsonclick ;
   private String edtPMDValFch_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_pmdcol_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z8394PMDColNom ;
   private java.util.Date Z8399PMDValFch ;
   private java.util.Date A8399PMDValFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n8529PMDUltCon ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8390PMDProUlt ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n8392PMDDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean AV14Promptcolor_IsBlob ;
   private String AV20Promptcolor_GXI ;
   private String AV14Promptcolor ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_pmdcolContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_pmdcolRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_pmdcolColumn ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01TZ6_A407EmprNom ;
   private boolean[] T01TZ6_n407EmprNom ;
   private String[] T01TZ7_A279CliNom ;
   private short[] T01TZ7_A8390PMDProUlt ;
   private boolean[] T01TZ7_n8390PMDProUlt ;
   private short[] T01TZ8_A8391PMDCod ;
   private String[] T01TZ8_A407EmprNom ;
   private boolean[] T01TZ8_n407EmprNom ;
   private String[] T01TZ8_A279CliNom ;
   private String[] T01TZ8_A8392PMDDsc ;
   private boolean[] T01TZ8_n8392PMDDsc ;
   private short[] T01TZ8_A8390PMDProUlt ;
   private boolean[] T01TZ8_n8390PMDProUlt ;
   private int[] T01TZ8_A8529PMDUltCon ;
   private boolean[] T01TZ8_n8529PMDUltCon ;
   private String[] T01TZ8_A396EmprCod ;
   private int[] T01TZ8_A252CliCod ;
   private String[] T01TZ9_A407EmprNom ;
   private boolean[] T01TZ9_n407EmprNom ;
   private String[] T01TZ10_A279CliNom ;
   private short[] T01TZ10_A8390PMDProUlt ;
   private boolean[] T01TZ10_n8390PMDProUlt ;
   private String[] T01TZ11_A396EmprCod ;
   private int[] T01TZ11_A252CliCod ;
   private short[] T01TZ11_A8391PMDCod ;
   private short[] T01TZ5_A8391PMDCod ;
   private String[] T01TZ5_A8392PMDDsc ;
   private boolean[] T01TZ5_n8392PMDDsc ;
   private int[] T01TZ5_A8529PMDUltCon ;
   private boolean[] T01TZ5_n8529PMDUltCon ;
   private String[] T01TZ5_A396EmprCod ;
   private int[] T01TZ5_A252CliCod ;
   private String[] T01TZ12_A396EmprCod ;
   private int[] T01TZ12_A252CliCod ;
   private short[] T01TZ12_A8391PMDCod ;
   private String[] T01TZ13_A396EmprCod ;
   private int[] T01TZ13_A252CliCod ;
   private short[] T01TZ13_A8391PMDCod ;
   private short[] T01TZ4_A8391PMDCod ;
   private String[] T01TZ4_A8392PMDDsc ;
   private boolean[] T01TZ4_n8392PMDDsc ;
   private int[] T01TZ4_A8529PMDUltCon ;
   private boolean[] T01TZ4_n8529PMDUltCon ;
   private String[] T01TZ4_A396EmprCod ;
   private int[] T01TZ4_A252CliCod ;
   private String[] T01TZ17_A407EmprNom ;
   private boolean[] T01TZ17_n407EmprNom ;
   private String[] T01TZ18_A279CliNom ;
   private short[] T01TZ18_A8390PMDProUlt ;
   private boolean[] T01TZ18_n8390PMDProUlt ;
   private String[] T01TZ20_A396EmprCod ;
   private int[] T01TZ20_A252CliCod ;
   private short[] T01TZ20_A8391PMDCod ;
   private int[] T01TZ21_A252CliCod ;
   private short[] T01TZ21_A8391PMDCod ;
   private int[] T01TZ21_A8393PMDColNum ;
   private java.math.BigDecimal[] T01TZ21_A8398PMDDtoAca ;
   private java.math.BigDecimal[] T01TZ21_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T01TZ21_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T01TZ21_A8397PMDDtoTin ;
   private java.util.Date[] T01TZ21_A8399PMDValFch ;
   private String[] T01TZ21_A8530PMDColCli ;
   private int[] T01TZ21_A8531PMDConCod ;
   private java.math.BigDecimal[] T01TZ21_A8532PMDPreUni ;
   private String[] T01TZ21_A396EmprCod ;
   private String[] T01TZ22_A396EmprCod ;
   private int[] T01TZ22_A252CliCod ;
   private short[] T01TZ22_A8391PMDCod ;
   private int[] T01TZ22_A8393PMDColNum ;
   private int[] T01TZ3_A252CliCod ;
   private short[] T01TZ3_A8391PMDCod ;
   private int[] T01TZ3_A8393PMDColNum ;
   private java.math.BigDecimal[] T01TZ3_A8398PMDDtoAca ;
   private java.math.BigDecimal[] T01TZ3_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T01TZ3_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T01TZ3_A8397PMDDtoTin ;
   private java.util.Date[] T01TZ3_A8399PMDValFch ;
   private String[] T01TZ3_A8530PMDColCli ;
   private int[] T01TZ3_A8531PMDConCod ;
   private java.math.BigDecimal[] T01TZ3_A8532PMDPreUni ;
   private String[] T01TZ3_A396EmprCod ;
   private int[] T01TZ2_A252CliCod ;
   private short[] T01TZ2_A8391PMDCod ;
   private int[] T01TZ2_A8393PMDColNum ;
   private java.math.BigDecimal[] T01TZ2_A8398PMDDtoAca ;
   private java.math.BigDecimal[] T01TZ2_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T01TZ2_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T01TZ2_A8397PMDDtoTin ;
   private java.util.Date[] T01TZ2_A8399PMDValFch ;
   private String[] T01TZ2_A8530PMDColCli ;
   private int[] T01TZ2_A8531PMDConCod ;
   private java.math.BigDecimal[] T01TZ2_A8532PMDPreUni ;
   private String[] T01TZ2_A396EmprCod ;
   private String[] T01TZ26_A396EmprCod ;
   private int[] T01TZ26_A252CliCod ;
   private short[] T01TZ26_A8391PMDCod ;
   private int[] T01TZ26_A8393PMDColNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class programasdetingimento_2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class programasdetingimento_2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class programasdetingimento_2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class programasdetingimento_2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class programasdetingimento_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TZ2", "SELECT CliCod, PMDCod, PMDColNum, PMDDtoAca, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?  FOR UPDATE OF PMDDtoAca, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDValFch, PMDColCli, PMDConCod, PMDPreUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ3", "SELECT CliCod, PMDCod, PMDColNum, PMDDtoAca, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ4", "SELECT PMDCod, PMDDsc, PMDUltCon, EmprCod, CliCod FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?  FOR UPDATE OF PMDDsc, PMDUltCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ5", "SELECT PMDCod, PMDDsc, PMDUltCon, EmprCod, CliCod FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ7", "SELECT CliNom, PMDProUlt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PMDCod, T2.EmprNom, T3.CliNom, TM1.PMDDsc, T3.PMDProUlt, TM1.PMDUltCon, TM1.EmprCod, TM1.CliCod FROM ((TXPProMD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.PMDCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.PMDCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ10", "SELECT CliNom, PMDProUlt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDCod FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDCod FROM TXPProMD WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and PMDCod > ?) ORDER BY EmprCod, CliCod, PMDCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TZ13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDCod FROM TXPProMD WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and PMDCod < ?) ORDER BY EmprCod DESC, CliCod DESC, PMDCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TZ14", "INSERT INTO TXPProMD(PMDCod, PMDDsc, PMDUltCon, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPProMD")
         ,new UpdateCursor("T01TZ15", "UPDATE TXPProMD SET PMDDsc=?, PMDUltCon=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?", GX_NOMASK, "TXPProMD")
         ,new UpdateCursor("T01TZ16", "DELETE FROM TXPProMD  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?", GX_NOMASK, "TXPProMD")
         ,new ForEachCursor("T01TZ17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ18", "SELECT CliNom, PMDProUlt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TZ19", "UPDATE TXPProMD SET PMDUltCon=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?", GX_NOMASK, "TXPProMD")
         ,new ForEachCursor("T01TZ20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, PMDCod FROM TXPProMD ORDER BY EmprCod, CliCod, PMDCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ21", "SELECT CliCod, PMDCod, PMDColNum, PMDDtoAca, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod FROM TXPProMD1 WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TZ22", "SELECT EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TZ23", "INSERT INTO TXPProMD1(CliCod, PMDCod, PMDColNum, PMDDtoAca, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPProMD1")
         ,new UpdateCursor("T01TZ24", "UPDATE TXPProMD1 SET PMDDtoAca=?, PMDPreKgm=?, PMDEntKgm=?, PMDDtoTin=?, PMDValFch=?, PMDColCli=?, PMDConCod=?, PMDPreUni=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK, "TXPProMD1")
         ,new UpdateCursor("T01TZ25", "DELETE FROM TXPProMD1  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK, "TXPProMD1")
         ,new ForEachCursor("T01TZ26", "SELECT EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 13 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setString(12, (String)parms[11], 3);
               return;
            case 22 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

