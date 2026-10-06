package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disalb__trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV40DisUniMedIn = httpContext.GetPar( "DisUniMedIn") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40DisUniMedIn", AV40DisUniMedIn);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMEDIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40DisUniMedIn, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_13_1TO35( A396EmprCod, A44AlbRecCod, AV40DisUniMedIn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A55AlbRReo = httpContext.GetPar( "AlbRReo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1TO35( A396EmprCod, A44AlbRecCod, A361DisCod, A55AlbRReo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV37ClicodIn = (int)(GXutil.lval( httpContext.GetPar( "ClicodIn"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37ClicodIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37ClicodIn), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37ClicodIn), "ZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_18_1TO35( A396EmprCod, A44AlbRecCod, AV37ClicodIn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
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
         gxload_26( A396EmprCod, A252CliCod) ;
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
            AV13EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
            AV12DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12DisCod), "ZZZZZZZ9")));
            AV7AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbRecCod), "ZZZZZZZ9")));
            AV37ClicodIn = (int)(GXutil.lval( httpContext.GetPar( "ClicodIn"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37ClicodIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37ClicodIn), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37ClicodIn), "ZZZZZ9")));
            AV38DisArtcodIn = httpContext.GetPar( "DisArtcodIn") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DisArtcodIn", AV38DisArtcodIn);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCODIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38DisArtcodIn, ""))));
            AV40DisUniMedIn = httpContext.GetPar( "DisUniMedIn") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DisUniMedIn", AV40DisUniMedIn);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMEDIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40DisUniMedIn, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada de Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public disalb__trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disalb__trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb__trn_impl.class ));
   }

   public disalb__trn_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
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
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0015"+"", GXutil.rtrim( WebComp_Wcdisalb__wc_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0015"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcdisalb__wc), GXutil.lower( WebComp_Wcdisalb__wc_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0015"+"");
            }
            WebComp_Wcdisalb__wc.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcdisalb__wc), GXutil.lower( WebComp_Wcdisalb__wc_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavPromptalbreccod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptalbreccod_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptalbreccod_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptalbreccod_gximage+"_Class") ;
      StyleString = "" ;
      AV35PromptAlbrecCod_IsBlob = (boolean)(((GXutil.strcmp("", AV35PromptAlbrecCod)==0)&&(GXutil.strcmp("", AV43Promptalbreccod_GXI)==0))||!(GXutil.strcmp("", AV35PromptAlbrecCod)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV35PromptAlbrecCod)==0) ? AV43Promptalbreccod_GXI : httpContext.getResourceRelative(AV35PromptAlbrecCod)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavPromptalbreccod_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgavPromptalbreccod_Visible, imgavPromptalbreccod_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPromptalbreccod_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPTALBRECCOD.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV35PromptAlbrecCod_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtKilos_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKilos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKilos_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKilos_Enabled!=0) ? localUtil.format( A595Kilos, "ZZZZZ9.99") : localUtil.format( A595Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKilos_Jsonclick, 0, "AttributeFL", "", "", "", "", edtKilos_Visible, edtKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMetros_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetros_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetros_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetros_Enabled!=0) ? localUtil.format( A631Metros, "ZZZZZ9.99") : localUtil.format( A631Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMetros_Visible, edtMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Und. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb__TRN.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPiezas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPiezas_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPiezas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPiezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Pzs. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "RC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb__TRN.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV42Pgmname), GXutil.rtrim( localUtil.format( AV42Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
            {
               WebComp_Wcdisalb__wc.componentstart();
            }
         }
      }
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
      e111TO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z595Kilos = localUtil.ctond( httpContext.cgiGet( "Z595Kilos")) ;
            Z631Metros = localUtil.ctond( httpContext.cgiGet( "Z631Metros")) ;
            Z673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "Z673Piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "O673Piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O631Metros = localUtil.ctond( httpContext.cgiGet( "O631Metros")) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            O595Kilos = localUtil.ctond( httpContext.cgiGet( "O595Kilos")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "ALBRUNIENT")) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV12DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40DisUniMedIn = httpContext.cgiGet( "vDISUNIMEDIN") ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32FlagCli = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33FlagEmp = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGEMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19msg7 = httpContext.cgiGet( "vMSG7") ;
            AV38DisArtcodIn = httpContext.cgiGet( "vDISARTCODIN") ;
            AV18errartref = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRARTREF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A369DisFec = localUtil.ctod( httpContext.cgiGet( "DISFEC"), 0) ;
            A392DisUniMed = httpContext.cgiGet( "DISUNIMED") ;
            A335DisArtCod = httpContext.cgiGet( "DISARTCOD") ;
            A337DisArtDsc = httpContext.cgiGet( "DISARTDSC") ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            AV35PromptAlbrecCod = httpContext.cgiGet( imgavPromptalbreccod_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KILOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtKilos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A595Kilos = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
            }
            else
            {
               A595Kilos = localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METROS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetros_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A631Metros = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
            }
            else
            {
               A631Metros = localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
            }
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PIEZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A673Piezas = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
            }
            else
            {
               A673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
            }
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb__TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidos\\disalb__trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
                  sMode35 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode35 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound35 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TO0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBRECCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
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
                        e111TO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VPROMPTALBRECCOD.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131TO2 ();
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
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 15 )
                  {
                     OldWcdisalb__wc = httpContext.cgiGet( "W0015") ;
                     if ( ( GXutil.len( OldWcdisalb__wc) == 0 ) || ( GXutil.strcmp(OldWcdisalb__wc, WebComp_Wcdisalb__wc_Component) != 0 ) )
                     {
                        WebComp_Wcdisalb__wc = WebUtils.getWebComponent(getClass(), "app." + OldWcdisalb__wc + "_impl", remoteHandle, context);
                        WebComp_Wcdisalb__wc_Component = OldWcdisalb__wc ;
                     }
                     if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
                     {
                        WebComp_Wcdisalb__wc.componentprocess("W0015", "", sEvt);
                     }
                     WebComp_Wcdisalb__wc_Component = OldWcdisalb__wc ;
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
         e121TO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TO35( ) ;
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
         disableAttributes1TO35( ) ;
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

   public void confirm_1TO0( )
   {
      beforeValidate1TO35( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TO35( ) ;
         }
         else
         {
            checkExtendedTable1TO35( ) ;
            closeExtendedTableCursors1TO35( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TO0( )
   {
   }

   public void e111TO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disalb__trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char4[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      disalb__trn_impl.this.A396EmprCod = GXv_char2[0] ;
      disalb__trn_impl.this.AV34EmprNom = GXv_char3[0] ;
      disalb__trn_impl.this.AV30UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV34EmprNom", AV34EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      GXt_int5 = (byte)(AV33FlagEmp) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JL0000", ""), GXv_int6) ;
      disalb__trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33FlagEmp = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33FlagEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33FlagEmp), 4, 0));
      GXt_char1 = AV19msg7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG253_", ""), (byte)(99), GXv_char4) ;
      disalb__trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19msg7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19msg7", AV19msg7);
      GXt_int5 = AV18errartref ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERARRF", ""), GXv_int6) ;
      disalb__trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18errartref = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18errartref", GXutil.str( AV18errartref, 1, 0));
      GXt_char1 = AV31Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      disalb__trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char4[0] = AV13EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char2[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char4, GXv_char3, GXv_char2) ;
      disalb__trn_impl.this.AV13EmprCod = GXv_char4[0] ;
      disalb__trn_impl.this.AV34EmprNom = GXv_char3[0] ;
      disalb__trn_impl.this.AV30UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV34EmprNom", AV34EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      GXv_SdtWWPContext7[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV17WWPContext = GXv_SdtWWPContext7[0] ;
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcdisalb__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdisalb__wc_Component), GXutil.lower( "Pedidos.DisAlb__WC")) != 0 )
      {
         WebComp_Wcdisalb__wc = WebUtils.getWebComponent(getClass(), "app.pedidos.disalb__wc_impl", remoteHandle, context);
         WebComp_Wcdisalb__wc_Component = "Pedidos.DisAlb__WC" ;
      }
      if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
      {
         WebComp_Wcdisalb__wc.setjustcreated();
         WebComp_Wcdisalb__wc.componentprepare(new Object[] {"W0015","",AV13EmprCod,Integer.valueOf(AV12DisCod)});
         WebComp_Wcdisalb__wc.componentbind(new Object[] {"",""});
      }
      imgavPromptalbreccod_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbreccod_Internalname, "gximage", imgavPromptalbreccod_gximage, true);
      AV35PromptAlbrecCod = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbreccod_Internalname, "Bitmap", ((GXutil.strcmp("", AV35PromptAlbrecCod)==0) ? AV43Promptalbreccod_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV35PromptAlbrecCod))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbreccod_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV35PromptAlbrecCod), true);
      AV43Promptalbreccod_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbreccod_Internalname, "Bitmap", ((GXutil.strcmp("", AV35PromptAlbrecCod)==0) ? AV43Promptalbreccod_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV35PromptAlbrecCod))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbreccod_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV35PromptAlbrecCod), true);
      edtMetros_Visible = ((GXutil.strcmp(AV40DisUniMedIn, "K")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), true);
      edtKilos_Visible = ((GXutil.strcmp(AV40DisUniMedIn, "M")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Visible), 5, 0), true);
   }

   public void e121TO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         GXt_char1 = AV41Rc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pedidos.entradacomorc(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char4) ;
         disalb__trn_impl.this.GXt_char1 = GXv_char4[0] ;
         AV41Rc = GXt_char1 ;
         if ( GXutil.strcmp(AV41Rc, "S") == 0 )
         {
            httpContext.popup(formatLink("app.pedidos.disdef__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(false))}, new String[] {"EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
         }
      }
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

   public void e131TO2( )
   {
      /* Promptalbreccod_Click Routine */
      returnInSub = false ;
      AV10AlbRfeni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRfeni", localUtil.format(AV10AlbRfeni, "99/99/99"));
      AV9Albrfenff = GXutil.today( ) ;
      AV8AlbRef = AV38DisArtcodIn ;
      AV11Clicod = AV37ClicodIn ;
      AV39DisUniMed = AV40DisUniMedIn ;
      httpContext.popup(formatLink("app.pedidos.disalb__albreccod_prompt", new String[] {GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV8AlbRef)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(AV39DisUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV11Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim("T")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.formatDateParm(AV10AlbRfeni)),GXutil.URLEncode(GXutil.formatDateParm(AV9Albrfenff)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Nrecep","Nrefer","Nentre","Unid","CliCod","Opreo","EmprCod","AlbREst","TipEnt","AlbRLoc","AlbRDisCli","AlbRfeni","Albrfenf","Albrent2i","Albreccod"}) , new Object[] {"A44AlbRecCod"});
      /*  Sending Event outputs  */
   }

   public void zm1TO35( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z595Kilos = T01TO3_A595Kilos[0] ;
            Z631Metros = T01TO3_A631Metros[0] ;
            Z673Piezas = T01TO3_A673Piezas[0] ;
         }
         else
         {
            Z595Kilos = A595Kilos ;
            Z631Metros = A631Metros ;
            Z673Piezas = A673Piezas ;
         }
      }
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01TO5_A47AlbREst[0] ;
         Z58AlbRUniEnt = T01TO5_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01TO5_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01TO5_A56AlbRUni[0] ;
         Z55AlbRReo = T01TO5_A55AlbRReo[0] ;
         Z45AlbRef = T01TO5_A45AlbRef[0] ;
         Z4920AlbRGrm2 = T01TO5_A4920AlbRGrm2[0] ;
         Z4921AlbRAnc = T01TO5_A4921AlbRAnc[0] ;
         Z6463AlbRLote = T01TO5_A6463AlbRLote[0] ;
         Z252CliCod = T01TO5_A252CliCod[0] ;
      }
      if ( GX_JID == -23 )
      {
         Z595Kilos = A595Kilos ;
         Z631Metros = A631Metros ;
         Z673Piezas = A673Piezas ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z361DisCod = A361DisCod ;
         Z369DisFec = A369DisFec ;
         Z392DisUniMed = A392DisUniMed ;
         Z335DisArtCod = A335DisArtCod ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z55AlbRReo = A55AlbRReo ;
         Z45AlbRef = A45AlbRef ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV42Pgmname = "Pedidos.DisAlb__TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         A396EmprCod = AV13EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (0==AV12DisCod) )
      {
         A361DisCod = AV12DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Using cursor T01TO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A369DisFec = T01TO6_A369DisFec[0] ;
      A392DisUniMed = T01TO6_A392DisUniMed[0] ;
      A335DisArtCod = T01TO6_A335DisArtCod[0] ;
      A337DisArtDsc = T01TO6_A337DisArtDsc[0] ;
      pr_default.close(4);
      if ( ! (0==AV7AlbRecCod) )
      {
         A44AlbRecCod = AV7AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV7AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
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
         /* Using cursor T01TO5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         zm1TO35( 24) ;
         A60AlbRUniUti = T01TO5_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01TO5_A54AlbRPieUti[0] ;
         A47AlbREst = T01TO5_A47AlbREst[0] ;
         A58AlbRUniEnt = T01TO5_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01TO5_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01TO5_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A55AlbRReo = T01TO5_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A45AlbRef = T01TO5_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = T01TO5_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01TO5_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A6463AlbRLote = T01TO5_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A252CliCod = T01TO5_A252CliCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(3);
         /* Using cursor T01TO7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TO7_A279CliNom[0] ;
         pr_default.close(5);
      }
   }

   public void load1TO35( )
   {
      /* Using cursor T01TO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A595Kilos = T01TO8_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01TO8_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A673Piezas = T01TO8_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A60AlbRUniUti = T01TO8_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01TO8_A54AlbRPieUti[0] ;
         A47AlbREst = T01TO8_A47AlbREst[0] ;
         A369DisFec = T01TO8_A369DisFec[0] ;
         A392DisUniMed = T01TO8_A392DisUniMed[0] ;
         A279CliNom = T01TO8_A279CliNom[0] ;
         A335DisArtCod = T01TO8_A335DisArtCod[0] ;
         A337DisArtDsc = T01TO8_A337DisArtDsc[0] ;
         A58AlbRUniEnt = T01TO8_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01TO8_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01TO8_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A55AlbRReo = T01TO8_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A45AlbRef = T01TO8_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = T01TO8_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01TO8_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A6463AlbRLote = T01TO8_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A252CliCod = T01TO8_A252CliCod[0] ;
         zm1TO35( -23) ;
      }
      pr_default.close(6);
      onLoadActions1TO35( ) ;
   }

   public void onLoadActions1TO35( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      if ( isDlt( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               }
               else
               {
                  if ( isDlt( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  }
                  else
                  {
                     if ( isUpd( )  && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     }
                     else
                     {
                        if ( isUpd( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        }
                        else
                        {
                           if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( A57AlbRUniDis.doubleValue() <= 0 )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() > 0 )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void checkExtendedTable1TO35( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! (0==A44AlbRecCod) && true /* After */ )
      {
         GXv_decimal8[0] = A595Kilos ;
         GXv_decimal9[0] = A631Metros ;
         GXv_int10[0] = A673Piezas ;
         new app.kilosometrospiezasdisponibles(remoteHandle, context).execute( A396EmprCod, A44AlbRecCod, AV40DisUniMedIn, GXv_decimal8, GXv_decimal9, GXv_int10) ;
         disalb__trn_impl.this.A595Kilos = GXv_decimal8[0] ;
         disalb__trn_impl.this.A631Metros = GXv_decimal9[0] ;
         disalb__trn_impl.this.A673Piezas = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      }
      if ( (0==A44AlbRecCod) && true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Repecion INVALIDO", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int11[0] = AV37ClicodIn ;
         GXv_int6[0] = AV32FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_int6) ;
         disalb__trn_impl.this.A396EmprCod = GXv_char4[0] ;
         disalb__trn_impl.this.A44AlbRecCod = GXv_int10[0] ;
         disalb__trn_impl.this.AV37ClicodIn = GXv_int11[0] ;
         disalb__trn_impl.this.AV32FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV37ClicodIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37ClicodIn), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37ClicodIn), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.str( AV32FlagCli, 1, 0));
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Disposicion Diferente a Cliente Empesa", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO: Cliente Disposicion Diferente a Cliente Empesa", ""), 0, "ALBRECCOD");
      }
      /* Using cursor T01TO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01TO5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01TO5_A54AlbRPieUti[0] ;
      A47AlbREst = T01TO5_A47AlbREst[0] ;
      A58AlbRUniEnt = T01TO5_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01TO5_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01TO5_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A55AlbRReo = T01TO5_A55AlbRReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A45AlbRef = T01TO5_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A4920AlbRGrm2 = T01TO5_A4920AlbRGrm2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = T01TO5_A4921AlbRAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A6463AlbRLote = T01TO5_A6463AlbRLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A252CliCod = T01TO5_A252CliCod[0] ;
      nIsDirty_35 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_35 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(3);
      if ( isDlt( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         nIsDirty_35 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            nIsDirty_35 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               nIsDirty_35 = (short)(1) ;
               A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  nIsDirty_35 = (short)(1) ;
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               }
               else
               {
                  if ( isDlt( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     nIsDirty_35 = (short)(1) ;
                     A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  }
                  else
                  {
                     if ( isUpd( )  && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        nIsDirty_35 = (short)(1) ;
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     }
                     else
                     {
                        if ( isUpd( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           nIsDirty_35 = (short)(1) ;
                           A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        }
                        else
                        {
                           if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              nIsDirty_35 = (short)(1) ;
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_35 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_35 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_35 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( A57AlbRUniDis.doubleValue() <= 0 )
      {
         nIsDirty_35 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() > 0 )
         {
            nIsDirty_35 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      if ( A57AlbRUniDis.doubleValue() < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_35 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( A51AlbRPieDis < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad de Piezas Pedido superior a Piezas Disponibles", ""), 0, "");
      }
      if ( ( GXutil.strcmp(AV38DisArtcodIn, A45AlbRef) != 0 ) && ( AV18errartref == 0 ) && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 0, "");
      }
      if ( ( GXutil.strcmp(AV38DisArtcodIn, A45AlbRef) != 0 ) && ( AV18errartref == 1 ) && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01TO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TO7_A279CliNom[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1TO35( )
   {
      pr_default.close(2);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01TO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01TO5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01TO5_A54AlbRPieUti[0] ;
      A47AlbREst = T01TO5_A47AlbREst[0] ;
      A58AlbRUniEnt = T01TO5_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01TO5_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01TO5_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A55AlbRReo = T01TO5_A55AlbRReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A45AlbRef = T01TO5_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A4920AlbRGrm2 = T01TO5_A4920AlbRGrm2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = T01TO5_A4921AlbRAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A6463AlbRLote = T01TO5_A6463AlbRLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A252CliCod = T01TO5_A252CliCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A55AlbRReo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6463AlbRLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void gxload_26( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TO9_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1TO35( )
   {
      /* Using cursor T01TO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01TO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1TO35( 23) ;
         RcdFound35 = (short)(1) ;
         A595Kilos = T01TO3_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01TO3_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A673Piezas = T01TO3_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A44AlbRecCod = T01TO3_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A361DisCod = T01TO3_A361DisCod[0] ;
         O673Piezas = A673Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         O631Metros = A631Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         O595Kilos = A595Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TO35( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey1TO35( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1TO35( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TO35( ) ;
      if ( RcdFound35 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01TO11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01TO11_A361DisCod[0] < A361DisCod ) || ( T01TO11_A361DisCod[0] == A361DisCod ) && ( T01TO11_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T01TO11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01TO11_A361DisCod[0] > A361DisCod ) || ( T01TO11_A361DisCod[0] == A361DisCod ) && ( T01TO11_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T01TO11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A361DisCod = T01TO11_A361DisCod[0] ;
            A44AlbRecCod = T01TO11_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01TO12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01TO12_A361DisCod[0] > A361DisCod ) || ( T01TO12_A361DisCod[0] == A361DisCod ) && ( T01TO12_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T01TO12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01TO12_A361DisCod[0] < A361DisCod ) || ( T01TO12_A361DisCod[0] == A361DisCod ) && ( T01TO12_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T01TO12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A361DisCod = T01TO12_A361DisCod[0] ;
            A44AlbRecCod = T01TO12_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TO35( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TO35( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound35 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = Z44AlbRecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TO35( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TO35( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBRECCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TO35( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = Z44AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TO35( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z595Kilos, T01TO2_A595Kilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z631Metros, T01TO2_A631Metros[0]) != 0 ) || ( Z673Piezas != T01TO2_A673Piezas[0] ) )
         {
            if ( DecimalUtil.compareTo(Z595Kilos, T01TO2_A595Kilos[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"Kilos");
               GXutil.writeLogRaw("Old: ",Z595Kilos);
               GXutil.writeLogRaw("Current: ",T01TO2_A595Kilos[0]);
            }
            if ( DecimalUtil.compareTo(Z631Metros, T01TO2_A631Metros[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"Metros");
               GXutil.writeLogRaw("Old: ",Z631Metros);
               GXutil.writeLogRaw("Current: ",T01TO2_A631Metros[0]);
            }
            if ( Z673Piezas != T01TO2_A673Piezas[0] )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"Piezas");
               GXutil.writeLogRaw("Old: ",Z673Piezas);
               GXutil.writeLogRaw("Current: ",T01TO2_A673Piezas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01TO13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01TO13_A47AlbREst[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01TO13_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01TO13_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z56AlbRUni, T01TO13_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T01TO13_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z45AlbRef, T01TO13_A45AlbRef[0]) != 0 ) || ( Z4920AlbRGrm2 != T01TO13_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T01TO13_A4921AlbRAnc[0] ) || ( GXutil.strcmp(Z6463AlbRLote, T01TO13_A6463AlbRLote[0]) != 0 ) || ( Z252CliCod != T01TO13_A252CliCod[0] ) )
         {
            if ( Z47AlbREst != T01TO13_A47AlbREst[0] )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01TO13_A47AlbREst[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01TO13_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01TO13_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01TO13_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01TO13_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01TO13_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01TO13_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01TO13_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01TO13_A55AlbRReo[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01TO13_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01TO13_A45AlbRef[0]);
            }
            if ( Z4920AlbRGrm2 != T01TO13_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01TO13_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01TO13_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01TO13_A4921AlbRAnc[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01TO13_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01TO13_A6463AlbRLote[0]);
            }
            if ( Z252CliCod != T01TO13_A252CliCod[0] )
            {
               GXutil.writeLogln("pedidos.disalb__trn:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01TO13_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TO35( )
   {
      beforeValidate1TO35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TO35( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TO35( 0) ;
         checkOptimisticConcurrency1TO35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TO35( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TO35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TO14 */
                  pr_default.execute(12, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(12) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TO35( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int11[0] = A44AlbRecCod ;
                        GXv_int10[0] = A361DisCod ;
                        new app.ptdisdef(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int10) ;
                        disalb__trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        disalb__trn_impl.this.A44AlbRecCod = GXv_int11[0] ;
                        disalb__trn_impl.this.A361DisCod = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1TO0( ) ;
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
            load1TO35( ) ;
         }
         endLevel1TO35( ) ;
      }
      closeExtendedTableCursors1TO35( ) ;
   }

   public void update1TO35( )
   {
      beforeValidate1TO35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TO35( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TO35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TO35( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TO35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TO15 */
                  pr_default.execute(13, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TO35( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TO35( ) ;
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
         endLevel1TO35( ) ;
      }
      closeExtendedTableCursors1TO35( ) ;
   }

   public void deferredUpdate1TO35( )
   {
   }

   public void delete( )
   {
      beforeValidate1TO35( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TO35( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TO35( ) ;
         afterConfirm1TO35( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TO35( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TO16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               if ( AnyError == 0 )
               {
                  updateTablesN11TO35( ) ;
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TO35( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TO35( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (0==A44AlbRecCod) && true /* After */ && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "N Repecion INVALIDO", ""), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01TO17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01TO17_A47AlbREst[0] ;
         Z58AlbRUniEnt = T01TO17_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01TO17_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01TO17_A56AlbRUni[0] ;
         Z55AlbRReo = T01TO17_A55AlbRReo[0] ;
         Z45AlbRef = T01TO17_A45AlbRef[0] ;
         Z4920AlbRGrm2 = T01TO17_A4920AlbRGrm2[0] ;
         Z4921AlbRAnc = T01TO17_A4921AlbRAnc[0] ;
         Z6463AlbRLote = T01TO17_A6463AlbRLote[0] ;
         Z252CliCod = T01TO17_A252CliCod[0] ;
         A60AlbRUniUti = T01TO17_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01TO17_A54AlbRPieUti[0] ;
         A47AlbREst = T01TO17_A47AlbREst[0] ;
         A58AlbRUniEnt = T01TO17_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01TO17_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01TO17_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A55AlbRReo = T01TO17_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A45AlbRef = T01TO17_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = T01TO17_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01TO17_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A6463AlbRLote = T01TO17_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A252CliCod = T01TO17_A252CliCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(15);
         if ( isDlt( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               if ( isUpd( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
                  {
                     A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  }
                  else
                  {
                     if ( isDlt( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     }
                     else
                     {
                        if ( isUpd( )  && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        }
                        else
                        {
                           if ( isUpd( )  && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           }
                           else
                           {
                              if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(AV40DisUniMedIn, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                              {
                                 A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
         }
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( A57AlbRUniDis.doubleValue() <= 0 )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() > 0 )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         /* Using cursor T01TO18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TO18_A279CliNom[0] ;
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TO19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIOUT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01TO20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void updateTablesN11TO35( )
   {
      /* Using cursor T01TO21 */
      pr_default.execute(19, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1TO35( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(11);
      if ( AnyError == 0 )
      {
         beforeComplete1TO35( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disalb__trn");
         if ( AnyError == 0 )
         {
            confirmValues1TO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidos.disalb__trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TO35( )
   {
      /* Scan By routine */
      /* Using cursor T01TO22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A361DisCod = T01TO22_A361DisCod[0] ;
         A44AlbRecCod = T01TO22_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TO35( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A361DisCod = T01TO22_A361DisCod[0] ;
         A44AlbRecCod = T01TO22_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1TO35( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1TO35( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TO35( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TO35( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TO35( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TO35( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TO35( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TO35( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Enabled), 5, 0), true);
      edtMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TO35( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TO0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disalb__trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37ClicodIn,6,0)),GXutil.URLEncode(GXutil.rtrim(AV38DisArtcodIn)),GXutil.URLEncode(GXutil.rtrim(AV40DisUniMedIn))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod","ClicodIn","DisArtcodIn","DisUniMedIn"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb__TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb__trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z595Kilos", GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z631Metros", GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z673Piezas", GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O673Piezas", GXutil.ltrim( localUtil.ntoc( O673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O631Metros", GXutil.ltrim( localUtil.ntoc( O631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O595Kilos", GXutil.ltrim( localUtil.ntoc( O595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENI", localUtil.dtoc( AV10AlbRfeni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV37ClicodIn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37ClicodIn), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV12DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV7AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISUNIMEDIN", GXutil.rtrim( AV40DisUniMedIn));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMEDIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40DisUniMedIn, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV32FlagCli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGEMP", GXutil.ltrim( localUtil.ntoc( AV33FlagEmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG7", GXutil.rtrim( AV19msg7));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISARTCODIN", GXutil.rtrim( AV38DisArtcodIn));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCODIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38DisArtcodIn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRARTREF", GXutil.ltrim( localUtil.ntoc( AV18errartref, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFEC", localUtil.dtoc( A369DisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED", GXutil.rtrim( A392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTCOD", GXutil.rtrim( A335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTDSC", GXutil.rtrim( A337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
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
      if ( ! ( WebComp_Wcdisalb__wc == null ) )
      {
         WebComp_Wcdisalb__wc.componentjscripts();
      }
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
            {
               WebComp_Wcdisalb__wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
            {
               WebComp_Wcdisalb__wc.componentstart();
            }
         }
      }
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
      return formatLink("app.pedidos.disalb__trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37ClicodIn,6,0)),GXutil.URLEncode(GXutil.rtrim(AV38DisArtcodIn)),GXutil.URLEncode(GXutil.rtrim(AV40DisUniMedIn))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod","ClicodIn","DisArtcodIn","DisUniMedIn"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisAlb__TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada de Almacen", "") ;
   }

   public void initializeNonKey1TO35( )
   {
      A595Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      A631Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      A673Piezas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      AV32FlagCli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.str( AV32FlagCli, 1, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A55AlbRReo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A6463AlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      O673Piezas = A673Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O631Metros = A631Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O595Kilos = A595Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      Z673Piezas = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
      Z55AlbRReo = "" ;
      Z45AlbRef = "" ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z6463AlbRLote = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1TO35( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1TO35( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcdisalb__wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcdisalb__wc_Component) != 0 )
         {
            WebComp_Wcdisalb__wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101481", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disalb__trn.js", "?202682116101482", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      imgavPromptalbreccod_Internalname = "vPROMPTALBRECCOD" ;
      edtKilos_Internalname = "KILOS" ;
      edtMetros_Internalname = "METROS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtPiezas_Internalname = "PIEZAS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtAlbRef_Internalname = "ALBREF" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada de Almacen", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 0 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 0 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 0 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 0 );
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtPiezas_Jsonclick = "" ;
      edtPiezas_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtMetros_Jsonclick = "" ;
      edtMetros_Enabled = 1 ;
      edtMetros_Visible = 1 ;
      edtKilos_Jsonclick = "" ;
      edtKilos_Enabled = 1 ;
      edtKilos_Visible = 1 ;
      imgavPromptalbreccod_Jsonclick = "" ;
      imgavPromptalbreccod_gximage = "" ;
      imgavPromptalbreccod_Enabled = 1 ;
      imgavPromptalbreccod_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Entrada de almacén", "") ;
      Dvpanel_tableattributes_Cls = "PanelNoHeader" ;
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

   public void xc_13_1TO35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV40DisUniMedIn )
   {
      if ( ! (0==A44AlbRecCod) && true /* After */ )
      {
         GXv_decimal9[0] = A595Kilos ;
         GXv_decimal8[0] = A631Metros ;
         GXv_int11[0] = A673Piezas ;
         new app.kilosometrospiezasdisponibles(remoteHandle, context).execute( A396EmprCod, A44AlbRecCod, AV40DisUniMedIn, GXv_decimal9, GXv_decimal8, GXv_int11) ;
         A595Kilos = GXv_decimal9[0] ;
         A631Metros = GXv_decimal8[0] ;
         A673Piezas = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_17_1TO35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            int A361DisCod ,
                            String A55AlbRReo )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A44AlbRecCod ;
         GXv_int10[0] = A361DisCod ;
         new app.ptdisdef(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int10) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int11[0] ;
         A361DisCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_18_1TO35( String A396EmprCod ,
                            int A44AlbRecCod ,
                            int AV37ClicodIn )
   {
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A44AlbRecCod ;
         GXv_int10[0] = AV37ClicodIn ;
         GXv_int6[0] = AV32FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int10, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int11[0] ;
         AV37ClicodIn = GXv_int10[0] ;
         AV32FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV37ClicodIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37ClicodIn), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37ClicodIn), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.str( AV32FlagCli, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV37ClicodIn, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32FlagCli, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
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

   public void valid_Albreccod( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      /* Using cursor T01TO17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01TO17_A47AlbREst[0] ;
      Z58AlbRUniEnt = T01TO17_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01TO17_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01TO17_A56AlbRUni[0] ;
      Z55AlbRReo = T01TO17_A55AlbRReo[0] ;
      Z45AlbRef = T01TO17_A45AlbRef[0] ;
      Z4920AlbRGrm2 = T01TO17_A4920AlbRGrm2[0] ;
      Z4921AlbRAnc = T01TO17_A4921AlbRAnc[0] ;
      Z6463AlbRLote = T01TO17_A6463AlbRLote[0] ;
      Z252CliCod = T01TO17_A252CliCod[0] ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01TO17_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01TO17_A54AlbRPieUti[0] ;
      A47AlbREst = T01TO17_A47AlbREst[0] ;
      A58AlbRUniEnt = T01TO17_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01TO17_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01TO17_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A55AlbRReo = T01TO17_A55AlbRReo[0] ;
      cmbAlbRReo.setValue( A55AlbRReo );
      A45AlbRef = T01TO17_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01TO17_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01TO17_A4921AlbRAnc[0] ;
      A6463AlbRLote = T01TO17_A6463AlbRLote[0] ;
      A252CliCod = T01TO17_A252CliCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(15);
      if ( ( GXutil.strcmp(AV38DisArtcodIn, A45AlbRef) != 0 ) && ( AV18errartref == 0 ) && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 0, "");
      }
      if ( ( GXutil.strcmp(AV38DisArtcodIn, A45AlbRef) != 0 ) && ( AV18errartref == 1 ) && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         httpContext.GX_msglist.addItem(AV19msg7, 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      /* Using cursor T01TO18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TO18_A279CliNom[0] ;
      pr_default.close(16);
      if ( ! (0==A44AlbRecCod) && true /* After */ )
      {
         GXv_decimal9[0] = A595Kilos ;
         GXv_decimal8[0] = A631Metros ;
         GXv_int11[0] = A673Piezas ;
         new app.kilosometrospiezasdisponibles(remoteHandle, context).execute( A396EmprCod, A44AlbRecCod, AV40DisUniMedIn, GXv_decimal9, GXv_decimal8, GXv_int11) ;
         disalb__trn_impl.this.A595Kilos = GXv_decimal9[0] ;
         A595Kilos = this.A595Kilos ;
         disalb__trn_impl.this.A631Metros = GXv_decimal8[0] ;
         A631Metros = this.A631Metros ;
         disalb__trn_impl.this.A673Piezas = GXv_int11[0] ;
         A673Piezas = this.A673Piezas ;
      }
      if ( (0==A44AlbRecCod) && true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Repecion INVALIDO", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A44AlbRecCod ;
         GXv_int10[0] = AV37ClicodIn ;
         GXv_int6[0] = AV32FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int10, GXv_int6) ;
         disalb__trn_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         disalb__trn_impl.this.A44AlbRecCod = GXv_int11[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         disalb__trn_impl.this.AV37ClicodIn = GXv_int10[0] ;
         AV37ClicodIn = this.AV37ClicodIn ;
         disalb__trn_impl.this.AV32FlagCli = GXv_int6[0] ;
         AV32FlagCli = this.AV32FlagCli ;
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Disposicion Diferente a Cliente Empesa", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      if ( true /* After */ && ( AV32FlagCli == 1 ) && ! (0==A44AlbRecCod) && ( AV33FlagEmp == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO: Cliente Disposicion Diferente a Cliente Empesa", ""), 0, "ALBRECCOD");
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37ClicodIn", GXutil.ltrim( localUtil.ntoc( AV37ClicodIn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagCli", GXutil.ltrim( localUtil.ntoc( AV32FlagCli, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV37ClicodIn',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV38DisArtcodIn',fld:'vDISARTCODIN',pic:'',hsh:true},{av:'AV40DisUniMedIn',fld:'vDISUNIMEDIN',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV37ClicodIn',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV40DisUniMedIn',fld:'vDISUNIMEDIN',pic:'@!',hsh:true},{av:'AV38DisArtcodIn',fld:'vDISARTCODIN',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TO2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VPROMPTALBRECCOD.CLICK","{handler:'e131TO2',iparms:[{av:'AV10AlbRfeni',fld:'vALBRFENI',pic:''},{av:'AV38DisArtcodIn',fld:'vDISARTCODIN',pic:'',hsh:true},{av:'AV37ClicodIn',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV40DisUniMedIn',fld:'vDISUNIMEDIN',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VPROMPTALBRECCOD.CLICK",",oparms:[{av:'AV10AlbRfeni',fld:'vALBRFENI',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'AV37ClicodIn',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV40DisUniMedIn',fld:'vDISUNIMEDIN',pic:'@!',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV19msg7',fld:'vMSG7',pic:''},{av:'AV38DisArtcodIn',fld:'vDISARTCODIN',pic:'',hsh:true},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'AV18errartref',fld:'vERRARTREF',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'},{av:'AV32FlagCli',fld:'vFLAGCLI',pic:'9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV37ClicodIn',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV32FlagCli',fld:'vFLAGCLI',pic:'9'}]}");
      setEventMetadata("VALID_KILOS","{handler:'valid_Kilos',iparms:[]");
      setEventMetadata("VALID_KILOS",",oparms:[]}");
      setEventMetadata("VALID_METROS","{handler:'valid_Metros',iparms:[]");
      setEventMetadata("VALID_METROS",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_PIEZAS","{handler:'valid_Piezas',iparms:[]");
      setEventMetadata("VALID_PIEZAS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
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
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV13EmprCod = "" ;
      wcpOAV38DisArtcodIn = "" ;
      wcpOAV40DisUniMedIn = "" ;
      Z396EmprCod = "" ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z55AlbRReo = "" ;
      Z45AlbRef = "" ;
      Z6463AlbRLote = "" ;
      O631Metros = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      O595Kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV40DisUniMedIn = "" ;
      A55AlbRReo = "" ;
      Gx_mode = "" ;
      AV13EmprCod = "" ;
      AV38DisArtcodIn = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      ClassString = "" ;
      StyleString = "" ;
      WebComp_Wcdisalb__wc_Component = "" ;
      OldWcdisalb__wc = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV35PromptAlbrecCod = "" ;
      AV43Promptalbreccod_GXI = "" ;
      sImgUrl = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A45AlbRef = "" ;
      A6463AlbRLote = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV42Pgmname = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV19msg7 = "" ;
      A369DisFec = GXutil.nullDate() ;
      A392DisUniMed = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A279CliNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode35 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV31Station = "" ;
      AV34EmprNom = "" ;
      AV30UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV41Rc = "" ;
      GXt_char1 = "" ;
      AV10AlbRfeni = GXutil.nullDate() ;
      AV9Albrfenff = GXutil.nullDate() ;
      AV8AlbRef = "" ;
      AV39DisUniMed = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z392DisUniMed = "" ;
      Z335DisArtCod = "" ;
      Z337DisArtDsc = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      T01TO6_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TO6_A392DisUniMed = new String[] {""} ;
      T01TO6_A335DisArtCod = new String[] {""} ;
      T01TO6_A337DisArtDsc = new String[] {""} ;
      T01TO5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO5_A54AlbRPieUti = new int[1] ;
      T01TO5_A47AlbREst = new byte[1] ;
      T01TO5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO5_A52AlbRPieEnt = new int[1] ;
      T01TO5_A56AlbRUni = new String[] {""} ;
      T01TO5_A55AlbRReo = new String[] {""} ;
      T01TO5_A45AlbRef = new String[] {""} ;
      T01TO5_A4920AlbRGrm2 = new short[1] ;
      T01TO5_A4921AlbRAnc = new short[1] ;
      T01TO5_A6463AlbRLote = new String[] {""} ;
      T01TO5_A252CliCod = new int[1] ;
      T01TO7_A279CliNom = new String[] {""} ;
      T01TO8_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO8_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO8_A673Piezas = new int[1] ;
      T01TO8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO8_A54AlbRPieUti = new int[1] ;
      T01TO8_A47AlbREst = new byte[1] ;
      T01TO8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TO8_A392DisUniMed = new String[] {""} ;
      T01TO8_A279CliNom = new String[] {""} ;
      T01TO8_A335DisArtCod = new String[] {""} ;
      T01TO8_A337DisArtDsc = new String[] {""} ;
      T01TO8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO8_A52AlbRPieEnt = new int[1] ;
      T01TO8_A56AlbRUni = new String[] {""} ;
      T01TO8_A55AlbRReo = new String[] {""} ;
      T01TO8_A45AlbRef = new String[] {""} ;
      T01TO8_A4920AlbRGrm2 = new short[1] ;
      T01TO8_A4921AlbRAnc = new short[1] ;
      T01TO8_A6463AlbRLote = new String[] {""} ;
      T01TO8_A396EmprCod = new String[] {""} ;
      T01TO8_A44AlbRecCod = new int[1] ;
      T01TO8_A361DisCod = new int[1] ;
      T01TO8_A252CliCod = new int[1] ;
      T01TO9_A279CliNom = new String[] {""} ;
      T01TO10_A396EmprCod = new String[] {""} ;
      T01TO10_A361DisCod = new int[1] ;
      T01TO10_A44AlbRecCod = new int[1] ;
      T01TO3_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO3_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO3_A673Piezas = new int[1] ;
      T01TO3_A396EmprCod = new String[] {""} ;
      T01TO3_A44AlbRecCod = new int[1] ;
      T01TO3_A361DisCod = new int[1] ;
      T01TO11_A396EmprCod = new String[] {""} ;
      T01TO11_A361DisCod = new int[1] ;
      T01TO11_A44AlbRecCod = new int[1] ;
      T01TO12_A396EmprCod = new String[] {""} ;
      T01TO12_A361DisCod = new int[1] ;
      T01TO12_A44AlbRecCod = new int[1] ;
      T01TO2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO2_A673Piezas = new int[1] ;
      T01TO2_A396EmprCod = new String[] {""} ;
      T01TO2_A44AlbRecCod = new int[1] ;
      T01TO2_A361DisCod = new int[1] ;
      T01TO13_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO13_A54AlbRPieUti = new int[1] ;
      T01TO13_A47AlbREst = new byte[1] ;
      T01TO13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO13_A52AlbRPieEnt = new int[1] ;
      T01TO13_A56AlbRUni = new String[] {""} ;
      T01TO13_A55AlbRReo = new String[] {""} ;
      T01TO13_A45AlbRef = new String[] {""} ;
      T01TO13_A4920AlbRGrm2 = new short[1] ;
      T01TO13_A4921AlbRAnc = new short[1] ;
      T01TO13_A6463AlbRLote = new String[] {""} ;
      T01TO13_A252CliCod = new int[1] ;
      T01TO17_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO17_A54AlbRPieUti = new int[1] ;
      T01TO17_A47AlbREst = new byte[1] ;
      T01TO17_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TO17_A52AlbRPieEnt = new int[1] ;
      T01TO17_A56AlbRUni = new String[] {""} ;
      T01TO17_A55AlbRReo = new String[] {""} ;
      T01TO17_A45AlbRef = new String[] {""} ;
      T01TO17_A4920AlbRGrm2 = new short[1] ;
      T01TO17_A4921AlbRAnc = new short[1] ;
      T01TO17_A6463AlbRLote = new String[] {""} ;
      T01TO17_A252CliCod = new int[1] ;
      T01TO18_A279CliNom = new String[] {""} ;
      T01TO19_A396EmprCod = new String[] {""} ;
      T01TO19_A361DisCod = new int[1] ;
      T01TO19_A44AlbRecCod = new int[1] ;
      T01TO19_A9756Dis_CUb = new String[] {""} ;
      T01TO20_A396EmprCod = new String[] {""} ;
      T01TO20_A361DisCod = new int[1] ;
      T01TO20_A44AlbRecCod = new int[1] ;
      T01TO20_A380DisPieCod = new String[] {""} ;
      T01TO22_A396EmprCod = new String[] {""} ;
      T01TO22_A361DisCod = new int[1] ;
      T01TO22_A44AlbRecCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new byte[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__trn__default(),
         new Object[] {
             new Object[] {
            T01TO2_A595Kilos, T01TO2_A631Metros, T01TO2_A673Piezas, T01TO2_A396EmprCod, T01TO2_A44AlbRecCod, T01TO2_A361DisCod
            }
            , new Object[] {
            T01TO3_A595Kilos, T01TO3_A631Metros, T01TO3_A673Piezas, T01TO3_A396EmprCod, T01TO3_A44AlbRecCod, T01TO3_A361DisCod
            }
            , new Object[] {
            T01TO4_A60AlbRUniUti, T01TO4_A54AlbRPieUti, T01TO4_A47AlbREst, T01TO4_A58AlbRUniEnt, T01TO4_A52AlbRPieEnt, T01TO4_A56AlbRUni, T01TO4_A55AlbRReo, T01TO4_A45AlbRef, T01TO4_A4920AlbRGrm2, T01TO4_A4921AlbRAnc,
            T01TO4_A6463AlbRLote, T01TO4_A252CliCod
            }
            , new Object[] {
            T01TO5_A60AlbRUniUti, T01TO5_A54AlbRPieUti, T01TO5_A47AlbREst, T01TO5_A58AlbRUniEnt, T01TO5_A52AlbRPieEnt, T01TO5_A56AlbRUni, T01TO5_A55AlbRReo, T01TO5_A45AlbRef, T01TO5_A4920AlbRGrm2, T01TO5_A4921AlbRAnc,
            T01TO5_A6463AlbRLote, T01TO5_A252CliCod
            }
            , new Object[] {
            T01TO6_A369DisFec, T01TO6_A392DisUniMed, T01TO6_A335DisArtCod, T01TO6_A337DisArtDsc
            }
            , new Object[] {
            T01TO7_A279CliNom
            }
            , new Object[] {
            T01TO8_A595Kilos, T01TO8_A631Metros, T01TO8_A673Piezas, T01TO8_A60AlbRUniUti, T01TO8_A54AlbRPieUti, T01TO8_A47AlbREst, T01TO8_A369DisFec, T01TO8_A392DisUniMed, T01TO8_A279CliNom, T01TO8_A335DisArtCod,
            T01TO8_A337DisArtDsc, T01TO8_A58AlbRUniEnt, T01TO8_A52AlbRPieEnt, T01TO8_A56AlbRUni, T01TO8_A55AlbRReo, T01TO8_A45AlbRef, T01TO8_A4920AlbRGrm2, T01TO8_A4921AlbRAnc, T01TO8_A6463AlbRLote, T01TO8_A396EmprCod,
            T01TO8_A44AlbRecCod, T01TO8_A361DisCod, T01TO8_A252CliCod
            }
            , new Object[] {
            T01TO9_A279CliNom
            }
            , new Object[] {
            T01TO10_A396EmprCod, T01TO10_A361DisCod, T01TO10_A44AlbRecCod
            }
            , new Object[] {
            T01TO11_A396EmprCod, T01TO11_A361DisCod, T01TO11_A44AlbRecCod
            }
            , new Object[] {
            T01TO12_A396EmprCod, T01TO12_A361DisCod, T01TO12_A44AlbRecCod
            }
            , new Object[] {
            T01TO13_A60AlbRUniUti, T01TO13_A54AlbRPieUti, T01TO13_A47AlbREst, T01TO13_A58AlbRUniEnt, T01TO13_A52AlbRPieEnt, T01TO13_A56AlbRUni, T01TO13_A55AlbRReo, T01TO13_A45AlbRef, T01TO13_A4920AlbRGrm2, T01TO13_A4921AlbRAnc,
            T01TO13_A6463AlbRLote, T01TO13_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TO17_A60AlbRUniUti, T01TO17_A54AlbRPieUti, T01TO17_A47AlbREst, T01TO17_A58AlbRUniEnt, T01TO17_A52AlbRPieEnt, T01TO17_A56AlbRUni, T01TO17_A55AlbRReo, T01TO17_A45AlbRef, T01TO17_A4920AlbRGrm2, T01TO17_A4921AlbRAnc,
            T01TO17_A6463AlbRLote, T01TO17_A252CliCod
            }
            , new Object[] {
            T01TO18_A279CliNom
            }
            , new Object[] {
            T01TO19_A396EmprCod, T01TO19_A361DisCod, T01TO19_A44AlbRecCod, T01TO19_A9756Dis_CUb
            }
            , new Object[] {
            T01TO20_A396EmprCod, T01TO20_A361DisCod, T01TO20_A44AlbRecCod, T01TO20_A380DisPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01TO22_A396EmprCod, T01TO22_A361DisCod, T01TO22_A44AlbRecCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV42Pgmname = "Pedidos.DisAlb__TRN" ;
      WebComp_Wcdisalb__wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte AV32FlagCli ;
   private byte AV18errartref ;
   private byte GXt_int5 ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int6[] ;
   private byte ZV32FlagCli ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short AV33FlagEmp ;
   private short RcdFound35 ;
   private short nCmpId ;
   private short nIsDirty_35 ;
   private int wcpOAV12DisCod ;
   private int wcpOAV7AlbRecCod ;
   private int wcpOAV37ClicodIn ;
   private int Z361DisCod ;
   private int Z44AlbRecCod ;
   private int Z673Piezas ;
   private int Z52AlbRPieEnt ;
   private int Z252CliCod ;
   private int O673Piezas ;
   private int O54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int AV37ClicodIn ;
   private int A252CliCod ;
   private int AV12DisCod ;
   private int AV7AlbRecCod ;
   private int trnEnded ;
   private int edtAlbRecCod_Enabled ;
   private int imgavPromptalbreccod_Visible ;
   private int imgavPromptalbreccod_Enabled ;
   private int edtKilos_Visible ;
   private int edtKilos_Enabled ;
   private int edtMetros_Visible ;
   private int edtMetros_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A673Piezas ;
   private int edtPiezas_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV11Clicod ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int idxLst ;
   private int GXv_int11[] ;
   private int GXv_int10[] ;
   private int ZO54AlbRPieUti ;
   private int ZV37ClicodIn ;
   private java.math.BigDecimal Z595Kilos ;
   private java.math.BigDecimal Z631Metros ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O631Metros ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal O595Kilos ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV38DisArtcodIn ;
   private String wcpOAV40DisUniMedIn ;
   private String Z396EmprCod ;
   private String Z56AlbRUni ;
   private String Z55AlbRReo ;
   private String Z45AlbRef ;
   private String Z6463AlbRLote ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV40DisUniMedIn ;
   private String A55AlbRReo ;
   private String Gx_mode ;
   private String AV13EmprCod ;
   private String AV38DisArtcodIn ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecCod_Internalname ;
   private String A56AlbRUni ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String WebComp_Wcdisalb__wc_Component ;
   private String OldWcdisalb__wc ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtAlbRecCod_Jsonclick ;
   private String imgavPromptalbreccod_Internalname ;
   private String imgavPromptalbreccod_gximage ;
   private String sImgUrl ;
   private String imgavPromptalbreccod_Jsonclick ;
   private String edtKilos_Internalname ;
   private String edtKilos_Jsonclick ;
   private String edtMetros_Internalname ;
   private String edtMetros_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtPiezas_Internalname ;
   private String edtPiezas_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV42Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String AV19msg7 ;
   private String A392DisUniMed ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A279CliNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode35 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV31Station ;
   private String AV34EmprNom ;
   private String AV30UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV41Rc ;
   private String GXt_char1 ;
   private String AV8AlbRef ;
   private String AV39DisUniMed ;
   private String Z392DisUniMed ;
   private String Z335DisArtCod ;
   private String Z337DisArtDsc ;
   private String Z279CliNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char4[] ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV10AlbRfeni ;
   private java.util.Date AV9Albrfenff ;
   private java.util.Date Z369DisFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean AV35PromptAlbrecCod_IsBlob ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcdisalb__wc ;
   private boolean Gx_longc ;
   private String AV43Promptalbreccod_GXI ;
   private String AV35PromptAlbrecCod ;
   private GXWebComponent WebComp_Wcdisalb__wc ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01TO6_A369DisFec ;
   private String[] T01TO6_A392DisUniMed ;
   private String[] T01TO6_A335DisArtCod ;
   private String[] T01TO6_A337DisArtDsc ;
   private java.math.BigDecimal[] T01TO5_A60AlbRUniUti ;
   private int[] T01TO5_A54AlbRPieUti ;
   private byte[] T01TO5_A47AlbREst ;
   private java.math.BigDecimal[] T01TO5_A58AlbRUniEnt ;
   private int[] T01TO5_A52AlbRPieEnt ;
   private String[] T01TO5_A56AlbRUni ;
   private String[] T01TO5_A55AlbRReo ;
   private String[] T01TO5_A45AlbRef ;
   private short[] T01TO5_A4920AlbRGrm2 ;
   private short[] T01TO5_A4921AlbRAnc ;
   private String[] T01TO5_A6463AlbRLote ;
   private int[] T01TO5_A252CliCod ;
   private String[] T01TO7_A279CliNom ;
   private java.math.BigDecimal[] T01TO8_A595Kilos ;
   private java.math.BigDecimal[] T01TO8_A631Metros ;
   private int[] T01TO8_A673Piezas ;
   private java.math.BigDecimal[] T01TO8_A60AlbRUniUti ;
   private int[] T01TO8_A54AlbRPieUti ;
   private byte[] T01TO8_A47AlbREst ;
   private java.util.Date[] T01TO8_A369DisFec ;
   private String[] T01TO8_A392DisUniMed ;
   private String[] T01TO8_A279CliNom ;
   private String[] T01TO8_A335DisArtCod ;
   private String[] T01TO8_A337DisArtDsc ;
   private java.math.BigDecimal[] T01TO8_A58AlbRUniEnt ;
   private int[] T01TO8_A52AlbRPieEnt ;
   private String[] T01TO8_A56AlbRUni ;
   private String[] T01TO8_A55AlbRReo ;
   private String[] T01TO8_A45AlbRef ;
   private short[] T01TO8_A4920AlbRGrm2 ;
   private short[] T01TO8_A4921AlbRAnc ;
   private String[] T01TO8_A6463AlbRLote ;
   private String[] T01TO8_A396EmprCod ;
   private int[] T01TO8_A44AlbRecCod ;
   private int[] T01TO8_A361DisCod ;
   private int[] T01TO8_A252CliCod ;
   private String[] T01TO9_A279CliNom ;
   private String[] T01TO10_A396EmprCod ;
   private int[] T01TO10_A361DisCod ;
   private int[] T01TO10_A44AlbRecCod ;
   private java.math.BigDecimal[] T01TO3_A595Kilos ;
   private java.math.BigDecimal[] T01TO3_A631Metros ;
   private int[] T01TO3_A673Piezas ;
   private String[] T01TO3_A396EmprCod ;
   private int[] T01TO3_A44AlbRecCod ;
   private int[] T01TO3_A361DisCod ;
   private String[] T01TO11_A396EmprCod ;
   private int[] T01TO11_A361DisCod ;
   private int[] T01TO11_A44AlbRecCod ;
   private String[] T01TO12_A396EmprCod ;
   private int[] T01TO12_A361DisCod ;
   private int[] T01TO12_A44AlbRecCod ;
   private java.math.BigDecimal[] T01TO2_A595Kilos ;
   private java.math.BigDecimal[] T01TO2_A631Metros ;
   private int[] T01TO2_A673Piezas ;
   private String[] T01TO2_A396EmprCod ;
   private int[] T01TO2_A44AlbRecCod ;
   private int[] T01TO2_A361DisCod ;
   private java.math.BigDecimal[] T01TO13_A60AlbRUniUti ;
   private int[] T01TO13_A54AlbRPieUti ;
   private byte[] T01TO13_A47AlbREst ;
   private java.math.BigDecimal[] T01TO13_A58AlbRUniEnt ;
   private int[] T01TO13_A52AlbRPieEnt ;
   private String[] T01TO13_A56AlbRUni ;
   private String[] T01TO13_A55AlbRReo ;
   private String[] T01TO13_A45AlbRef ;
   private short[] T01TO13_A4920AlbRGrm2 ;
   private short[] T01TO13_A4921AlbRAnc ;
   private String[] T01TO13_A6463AlbRLote ;
   private int[] T01TO13_A252CliCod ;
   private java.math.BigDecimal[] T01TO17_A60AlbRUniUti ;
   private int[] T01TO17_A54AlbRPieUti ;
   private byte[] T01TO17_A47AlbREst ;
   private java.math.BigDecimal[] T01TO17_A58AlbRUniEnt ;
   private int[] T01TO17_A52AlbRPieEnt ;
   private String[] T01TO17_A56AlbRUni ;
   private String[] T01TO17_A55AlbRReo ;
   private String[] T01TO17_A45AlbRef ;
   private short[] T01TO17_A4920AlbRGrm2 ;
   private short[] T01TO17_A4921AlbRAnc ;
   private String[] T01TO17_A6463AlbRLote ;
   private int[] T01TO17_A252CliCod ;
   private String[] T01TO18_A279CliNom ;
   private String[] T01TO19_A396EmprCod ;
   private int[] T01TO19_A361DisCod ;
   private int[] T01TO19_A44AlbRecCod ;
   private String[] T01TO19_A9756Dis_CUb ;
   private String[] T01TO20_A396EmprCod ;
   private int[] T01TO20_A361DisCod ;
   private int[] T01TO20_A44AlbRecCod ;
   private String[] T01TO20_A380DisPieCod ;
   private String[] T01TO22_A396EmprCod ;
   private int[] T01TO22_A361DisCod ;
   private int[] T01TO22_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01TO4_A60AlbRUniUti ;
   private int[] T01TO4_A54AlbRPieUti ;
   private byte[] T01TO4_A47AlbREst ;
   private java.math.BigDecimal[] T01TO4_A58AlbRUniEnt ;
   private int[] T01TO4_A52AlbRPieEnt ;
   private String[] T01TO4_A56AlbRUni ;
   private String[] T01TO4_A55AlbRReo ;
   private String[] T01TO4_A45AlbRef ;
   private short[] T01TO4_A4920AlbRGrm2 ;
   private short[] T01TO4_A4921AlbRAnc ;
   private String[] T01TO4_A6463AlbRLote ;
   private int[] T01TO4_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class disalb__trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb__trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TO2", "SELECT Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Kilos, Metros, Piezas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO3", "SELECT Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO4", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO5", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO6", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Kilos, TM1.Metros, TM1.Piezas, T3.AlbRUniUti, T3.AlbRPieUti, T3.AlbREst, T2.DisFec, T2.DisUniMed, T4.CliNom, T2.DisArtCod, T2.DisArtDsc, T3.AlbRUniEnt, T3.AlbRPieEnt, T3.AlbRUni, T3.AlbRReo, T3.AlbRef, T3.AlbRGrm2, T3.AlbRAnc, T3.AlbRLote, TM1.EmprCod, TM1.AlbRecCod, TM1.DisCod, T3.CliCod FROM (((TXPDISALB TM1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE ( DisCod > ? or DisCod = ? and AlbRecCod > ?) and EmprCod = ? ORDER BY EmprCod, DisCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TO12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE ( DisCod < ? or DisCod = ? and AlbRecCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DisCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TO13", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TO14", "INSERT INTO TXPDISALB(Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01TO15", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01TO16", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("T01TO17", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TO19", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TO20", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TO21", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01TO22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 2);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

