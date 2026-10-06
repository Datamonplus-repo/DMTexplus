package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisnor_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DISNORMID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13814NormaDscID = httpContext.GetPar( "NormaDscID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgadisnormid1NF0( A396EmprCod, A13814NormaDscID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DISNORMID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13814NormaDscID = httpContext.GetPar( "NormaDscID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgadisnormid1NF0( A396EmprCod, A13814NormaDscID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"DISNORMID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h13213DisNormID = httpContext.GetPar( "h13213DisNormID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcadisnormid1NF1812( A396EmprCod, h13213DisNormID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13213DisNormID = httpContext.GetPar( "DisNormID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A13213DisNormID) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV34DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34DisCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Normas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisCod_Internalname ;
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
      nRC_GXsfl_28 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_28"))) ;
      nGXsfl_28_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_28_idx"))) ;
      sGXsfl_28_idx = httpContext.GetPar( "sGXsfl_28_idx") ;
      chkDisNormNC.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Visible", GXutil.ltrimstr( chkDisNormNC.getVisible(), 5, 0), !bGXsfl_28_Refreshing);
      chkDisNormSt.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Visible", GXutil.ltrimstr( chkDisNormSt.getVisible(), 5, 0), !bGXsfl_28_Refreshing);
      chkDisNormNC.setWidth( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Width", GXutil.ltrimstr( chkDisNormNC.getWidth(), 9, 0), !bGXsfl_28_Refreshing);
      chkDisNormSt.setWidth( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Width", GXutil.ltrimstr( chkDisNormSt.getWidth(), 9, 0), !bGXsfl_28_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tdisnor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisnor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisnor_impl.class ));
   }

   public tdisnor_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkDisNormSt = UIFactory.getCheckbox(this);
      chkDisNormNC = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISNOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISNOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISNOR.htm");
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

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol28( ) ;
      nGXsfl_28_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1812 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1812 = (short)(1) ;
            scanStart1NF1812( ) ;
            while ( RcdFound1812 != 0 )
            {
               init_level_properties1812( ) ;
               getByPrimaryKey1NF1812( ) ;
               addRow1NF1812( ) ;
               scanNext1NF1812( ) ;
            }
            scanEnd1NF1812( ) ;
            nBlankRcdCount1812 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NF1812( ) ;
         standaloneModal1NF1812( ) ;
         sMode1812 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRow1NF1812( ) ;
            edtDisNormID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMID_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtDisNormDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMDSC_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormDsc_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            chkDisNormSt.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMST_"+sGXsfl_28_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Width", GXutil.ltrimstr( chkDisNormSt.getWidth(), 9, 0), !bGXsfl_28_Refreshing);
            chkDisNormSt.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMST_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisNormSt.getEnabled(), 5, 0), !bGXsfl_28_Refreshing);
            chkDisNormSt.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMST_"+sGXsfl_28_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Visible", GXutil.ltrimstr( chkDisNormSt.getVisible(), 5, 0), !bGXsfl_28_Refreshing);
            chkDisNormNC.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMNC_"+sGXsfl_28_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Width", GXutil.ltrimstr( chkDisNormNC.getWidth(), 9, 0), !bGXsfl_28_Refreshing);
            chkDisNormNC.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMNC_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisNormNC.getEnabled(), 5, 0), !bGXsfl_28_Refreshing);
            chkDisNormNC.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMNC_"+sGXsfl_28_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Visible", GXutil.ltrimstr( chkDisNormNC.getVisible(), 5, 0), !bGXsfl_28_Refreshing);
            if ( ( nRcdExists_1812 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NF1812( ) ;
            }
            sendRow1NF1812( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1812 = (short)(5) ;
         nRcdExists_1812 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NF1812( ) ;
            while ( RcdFound1812 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_281812( ) ;
               init_level_properties1812( ) ;
               standaloneNotModal1NF1812( ) ;
               getByPrimaryKey1NF1812( ) ;
               standaloneModal1NF1812( ) ;
               addRow1NF1812( ) ;
               scanNext1NF1812( ) ;
            }
            scanEnd1NF1812( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1812 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_281812( ) ;
         initAll1NF1812( ) ;
         init_level_properties1812( ) ;
         nRcdExists_1812 = (short)(0) ;
         nIsMod_1812 = (short)(0) ;
         nRcdDeleted_1812 = (short)(0) ;
         nBlankRcdCount1812 = (short)(nBlankRcdUsr1812+nBlankRcdCount1812) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1812 > 0 )
         {
            standaloneNotModal1NF1812( ) ;
            standaloneModal1NF1812( ) ;
            addRow1NF1812( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDisNormID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1812 = (short)(nBlankRcdCount1812-1) ;
         }
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      e111NF2 ();
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
            Z8886DisDest = httpContext.cgiGet( "Z8886DisDest") ;
            A8886DisDest = httpContext.cgiGet( "Z8886DisDest") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV34DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8886DisDest = httpContext.cgiGet( "DISDEST") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13213DisNormID = httpContext.cgiGet( "GXHCDISNORMID") ;
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
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDISNOR");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("DisDest", GXutil.rtrim( localUtil.format( A8886DisDest, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A361DisCod != Z361DisCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdisnor:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                  sMode34 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode34 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound34 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1NF0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DISCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisCod_Internalname ;
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
                        e111NF2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121NF2 ();
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
         e121NF2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1NF34( ) ;
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
         disableAttributes1NF34( ) ;
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

   public void confirm_1NF0( )
   {
      beforeValidate1NF34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NF34( ) ;
         }
         else
         {
            checkExtendedTable1NF34( ) ;
            closeExtendedTableCursors1NF34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1NF1812( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1NF1812( )
   {
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow1NF1812( ) ;
         if ( ( nRcdExists_1812 != 0 ) || ( nIsMod_1812 != 0 ) )
         {
            getKey1NF1812( ) ;
            if ( ( nRcdExists_1812 == 0 ) && ( nRcdDeleted_1812 == 0 ) )
            {
               if ( RcdFound1812 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NF1812( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NF1812( ) ;
                     closeExtendedTableCursors1NF1812( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISNORMID_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisNormID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1812 != 0 )
               {
                  if ( nRcdDeleted_1812 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NF1812( ) ;
                     load1NF1812( ) ;
                     beforeValidate1NF1812( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NF1812( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1812 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NF1812( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NF1812( ) ;
                           closeExtendedTableCursors1NF1812( ) ;
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
                  if ( nRcdDeleted_1812 == 0 )
                  {
                     GXCCtl = "DISNORMID_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisNormID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisNormID_Internalname, h13213DisNormID) ;
         httpContext.changePostValue( edtDisNormDsc_Internalname, GXutil.rtrim( A13216DisNormDsc)) ;
         httpContext.changePostValue( chkDisNormSt.getInternalname(), ((GXutil.strcmp(A13214DisNormSt, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkDisNormNC.getInternalname(), ((GXutil.strcmp(A13215DisNormNC, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z13213DisNormID_"+sGXsfl_28_idx, GXutil.rtrim( Z13213DisNormID)) ;
         httpContext.changePostValue( "ZT_"+"Z13214DisNormSt_"+sGXsfl_28_idx, GXutil.rtrim( Z13214DisNormSt)) ;
         httpContext.changePostValue( "ZT_"+"Z13215DisNormNC_"+sGXsfl_28_idx, GXutil.rtrim( Z13215DisNormNC)) ;
         httpContext.changePostValue( "nRcdDeleted_1812_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1812_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1812_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1812 != 0 )
         {
            httpContext.changePostValue( "DISNORMID_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMDSC_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMST_"+sGXsfl_28_idx+"Width", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMST_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMST_"+sGXsfl_28_idx+"Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMNC_"+sGXsfl_28_idx+"Width", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMNC_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMNC_"+sGXsfl_28_idx+"Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NF0( )
   {
   }

   public void e111NF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdisnor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdisnor_impl.this.A396EmprCod = GXv_char2[0] ;
      tdisnor_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdisnor_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      tdisnor_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33Carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Carvema", GXutil.str( AV33Carvema, 1, 0));
      A8886DisDest_Visible = ((AV33Carvema==1) ? 0 : 1) ;
      chkDisNormNC.setVisible( ((AV33Carvema==1) ? 0 : 1) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Visible", GXutil.ltrimstr( chkDisNormNC.getVisible(), 5, 0), !bGXsfl_28_Refreshing);
      chkDisNormSt.setVisible( ((AV33Carvema==1) ? 0 : 1) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Visible", GXutil.ltrimstr( chkDisNormSt.getVisible(), 5, 0), !bGXsfl_28_Refreshing);
      if ( AV33Carvema == 1 )
      {
         chkDisNormNC.setWidth( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Width", GXutil.ltrimstr( chkDisNormNC.getWidth(), 9, 0), !bGXsfl_28_Refreshing);
         chkDisNormSt.setWidth( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Width", GXutil.ltrimstr( chkDisNormSt.getWidth(), 9, 0), !bGXsfl_28_Refreshing);
      }
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdisnor_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdisnor_impl.this.AV32EmprCod = GXv_char4[0] ;
      tdisnor_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdisnor_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e121NF2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tdisnorww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1NF34( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8886DisDest = T01NF6_A8886DisDest[0] ;
         }
         else
         {
            Z8886DisDest = A8886DisDest ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z361DisCod = A361DisCod ;
         Z8886DisDest = A8886DisDest ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01NF7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NF7_A407EmprNom[0] ;
      n407EmprNom = T01NF7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV34DisCod) )
      {
         A361DisCod = AV34DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV34DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV34DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
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
   }

   public void load1NF34( )
   {
      /* Using cursor T01NF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01NF8_A407EmprNom[0] ;
         n407EmprNom = T01NF8_n407EmprNom[0] ;
         A8886DisDest = T01NF8_A8886DisDest[0] ;
         zm1NF34( -8) ;
      }
      pr_default.close(6);
      onLoadActions1NF34( ) ;
   }

   public void onLoadActions1NF34( )
   {
   }

   public void checkExtendedTable1NF34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1NF34( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NF34( )
   {
      /* Using cursor T01NF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01NF6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NF34( 8) ;
         RcdFound34 = (short)(1) ;
         A361DisCod = T01NF6_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A8886DisDest = T01NF6_A8886DisDest[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NF34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1NF34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1NF34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1NF34( ) ;
      if ( RcdFound34 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01NF10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01NF10_A361DisCod[0] < A361DisCod ) ) && ( GXutil.strcmp(T01NF10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01NF10_A361DisCod[0] > A361DisCod ) ) && ( GXutil.strcmp(T01NF10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A361DisCod = T01NF10_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01NF11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01NF11_A361DisCod[0] > A361DisCod ) ) && ( GXutil.strcmp(T01NF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01NF11_A361DisCod[0] < A361DisCod ) ) && ( GXutil.strcmp(T01NF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A361DisCod = T01NF11_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NF34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NF34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1NF34( ) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NF34( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DISCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NF34( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1NF34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z8886DisDest, T01NF5_A8886DisDest[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8886DisDest, T01NF5_A8886DisDest[0]) != 0 )
            {
               GXutil.writeLogln("tdisnor:[seudo value changed for attri]"+"DisDest");
               GXutil.writeLogRaw("Old: ",Z8886DisDest);
               GXutil.writeLogRaw("Current: ",T01NF5_A8886DisDest[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NF34( )
   {
      beforeValidate1NF34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NF34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NF34( 0) ;
         checkOptimisticConcurrency1NF34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NF34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NF34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NF12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), A8886DisDest, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1NF34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NF0( ) ;
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
            load1NF34( ) ;
         }
         endLevel1NF34( ) ;
      }
      closeExtendedTableCursors1NF34( ) ;
   }

   public void update1NF34( )
   {
      beforeValidate1NF34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NF34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NF34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NF34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NF34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NF13 */
                  pr_default.execute(11, new Object[] {A8886DisDest, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NF34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int8[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
                     tdisnor_impl.this.A396EmprCod = GXv_char4[0] ;
                     tdisnor_impl.this.A361DisCod = GXv_int8[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NF34( ) ;
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
         endLevel1NF34( ) ;
      }
      closeExtendedTableCursors1NF34( ) ;
   }

   public void deferredUpdate1NF34( )
   {
   }

   public void delete( )
   {
      beforeValidate1NF34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NF34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NF34( ) ;
         afterConfirm1NF34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NF34( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NF1812( ) ;
               while ( RcdFound1812 != 0 )
               {
                  getByPrimaryKey1NF1812( ) ;
                  delete1NF1812( ) ;
                  scanNext1NF1812( ) ;
               }
               scanEnd1NF1812( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NF14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NF34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NF34( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NF15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01NF16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01NF17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01NF18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01NF19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01NF20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01NF21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01NF22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01NF23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01NF24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01NF25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevel1NF1812( )
   {
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow1NF1812( ) ;
         if ( ( nRcdExists_1812 != 0 ) || ( nIsMod_1812 != 0 ) )
         {
            standaloneNotModal1NF1812( ) ;
            getKey1NF1812( ) ;
            if ( ( nRcdExists_1812 == 0 ) && ( nRcdDeleted_1812 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NF1812( ) ;
            }
            else
            {
               if ( RcdFound1812 != 0 )
               {
                  if ( ( nRcdDeleted_1812 != 0 ) && ( nRcdExists_1812 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NF1812( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1812 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NF1812( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1812 == 0 )
                  {
                     GXCCtl = "DISNORMID_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisNormID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisNormID_Internalname, h13213DisNormID) ;
         httpContext.changePostValue( edtDisNormDsc_Internalname, GXutil.rtrim( A13216DisNormDsc)) ;
         httpContext.changePostValue( chkDisNormSt.getInternalname(), ((GXutil.strcmp(A13214DisNormSt, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkDisNormNC.getInternalname(), ((GXutil.strcmp(A13215DisNormNC, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z13213DisNormID_"+sGXsfl_28_idx, GXutil.rtrim( Z13213DisNormID)) ;
         httpContext.changePostValue( "ZT_"+"Z13214DisNormSt_"+sGXsfl_28_idx, GXutil.rtrim( Z13214DisNormSt)) ;
         httpContext.changePostValue( "ZT_"+"Z13215DisNormNC_"+sGXsfl_28_idx, GXutil.rtrim( Z13215DisNormNC)) ;
         httpContext.changePostValue( "nRcdDeleted_1812_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1812_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1812_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1812 != 0 )
         {
            httpContext.changePostValue( "DISNORMID_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMDSC_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMST_"+sGXsfl_28_idx+"Width", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMST_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMST_"+sGXsfl_28_idx+"Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMNC_"+sGXsfl_28_idx+"Width", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMNC_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMNC_"+sGXsfl_28_idx+"Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NF1812( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1812 = (short)(0) ;
      nIsMod_1812 = (short)(0) ;
      nRcdDeleted_1812 = (short)(0) ;
   }

   public void processLevel1NF34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1NF1812( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NF34( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NF34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisnor");
         if ( AnyError == 0 )
         {
            confirmValues1NF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisnor");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NF34( )
   {
      /* Scan By routine */
      /* Using cursor T01NF26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A361DisCod = T01NF26_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NF34( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A361DisCod = T01NF26_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void scanEnd1NF34( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1NF34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NF34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NF34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NF34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NF34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NF34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NF34( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
   }

   public void zm1NF1812( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13214DisNormSt = T01NF3_A13214DisNormSt[0] ;
            Z13215DisNormNC = T01NF3_A13215DisNormNC[0] ;
         }
         else
         {
            Z13214DisNormSt = A13214DisNormSt ;
            Z13215DisNormNC = A13215DisNormNC ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z361DisCod = A361DisCod ;
         Z13214DisNormSt = A13214DisNormSt ;
         Z13215DisNormNC = A13215DisNormNC ;
         Z396EmprCod = A396EmprCod ;
         Z13213DisNormID = A13213DisNormID ;
         Z13216DisNormDsc = A13216DisNormDsc ;
      }
   }

   public void standaloneNotModal1NF1812( )
   {
      edtDisNormDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormDsc_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void standaloneModal1NF1812( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisNormID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtDisNormID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void load1NF1812( )
   {
      /* Using cursor T01NF27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13216DisNormDsc = T01NF27_A13216DisNormDsc[0] ;
         n13216DisNormDsc = T01NF27_n13216DisNormDsc[0] ;
         A13214DisNormSt = T01NF27_A13214DisNormSt[0] ;
         A13215DisNormNC = T01NF27_A13215DisNormNC[0] ;
         zm1NF1812( -10) ;
      }
      pr_default.close(25);
      onLoadActions1NF1812( ) ;
   }

   public void onLoadActions1NF1812( )
   {
      /* Using cursor T01NF28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A13213DisNormID});
      h13213DisNormID = "" ;
      while ( (pr_default.getStatus(26) != 101) )
      {
         h13213DisNormID = T01NF28_A13814NormaDscID[0] ;
         if (true) break;
      }
      pr_default.close(26);
      httpContext.ajax_rsp_assign_attri("", false, "h13213DisNormID", h13213DisNormID);
   }

   public void checkExtendedTable1NF1812( )
   {
      nIsDirty_1812 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NF1812( ) ;
      /* Using cursor T01NF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "DISNORMID_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisNormID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13216DisNormDsc = T01NF4_A13216DisNormDsc[0] ;
      n13216DisNormDsc = T01NF4_n13216DisNormDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1NF1812( )
   {
      pr_default.close(2);
   }

   public void enableDisable1NF1812( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          String A13213DisNormID )
   {
      /* Using cursor T01NF29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(27) == 101) )
      {
         GXCCtl = "DISNORMID_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisNormID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13216DisNormDsc = T01NF29_A13216DisNormDsc[0] ;
      n13216DisNormDsc = T01NF29_n13216DisNormDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13216DisNormDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void getKey1NF1812( )
   {
      /* Using cursor T01NF30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1812 = (short)(1) ;
      }
      else
      {
         RcdFound1812 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey1NF1812( )
   {
      /* Using cursor T01NF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01NF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NF1812( 10) ;
         RcdFound1812 = (short)(1) ;
         initializeNonKey1NF1812( ) ;
         A13214DisNormSt = T01NF3_A13214DisNormSt[0] ;
         A13215DisNormNC = T01NF3_A13215DisNormNC[0] ;
         A13213DisNormID = T01NF3_A13213DisNormID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z13213DisNormID = A13213DisNormID ;
         sMode1812 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NF1812( ) ;
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1812 = (short)(0) ;
         initializeNonKey1NF1812( ) ;
         sMode1812 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NF1812( ) ;
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NF1812( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NF1812( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01NF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISNOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13214DisNormSt, T01NF2_A13214DisNormSt[0]) != 0 ) || ( GXutil.strcmp(Z13215DisNormNC, T01NF2_A13215DisNormNC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13214DisNormSt, T01NF2_A13214DisNormSt[0]) != 0 )
            {
               GXutil.writeLogln("tdisnor:[seudo value changed for attri]"+"DisNormSt");
               GXutil.writeLogRaw("Old: ",Z13214DisNormSt);
               GXutil.writeLogRaw("Current: ",T01NF2_A13214DisNormSt[0]);
            }
            if ( GXutil.strcmp(Z13215DisNormNC, T01NF2_A13215DisNormNC[0]) != 0 )
            {
               GXutil.writeLogln("tdisnor:[seudo value changed for attri]"+"DisNormNC");
               GXutil.writeLogRaw("Old: ",Z13215DisNormNC);
               GXutil.writeLogRaw("Current: ",T01NF2_A13215DisNormNC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISNOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NF1812( )
   {
      beforeValidate1NF1812( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NF1812( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NF1812( 0) ;
         checkOptimisticConcurrency1NF1812( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NF1812( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NF1812( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NF31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A361DisCod), A13214DisNormSt, A13215DisNormNC, A396EmprCod, A13213DisNormID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
                  if ( (pr_default.getStatus(29) == 1) )
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
            load1NF1812( ) ;
         }
         endLevel1NF1812( ) ;
      }
      closeExtendedTableCursors1NF1812( ) ;
   }

   public void update1NF1812( )
   {
      beforeValidate1NF1812( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NF1812( ) ;
      }
      if ( ( nIsMod_1812 != 0 ) || ( nIsDirty_1812 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NF1812( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NF1812( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NF1812( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NF32 */
                     pr_default.execute(30, new Object[] {A13214DisNormSt, A13215DisNormNC, A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISNOR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NF1812( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int8[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
                        tdisnor_impl.this.A396EmprCod = GXv_char4[0] ;
                        tdisnor_impl.this.A361DisCod = GXv_int8[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NF1812( ) ;
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
            endLevel1NF1812( ) ;
         }
      }
      closeExtendedTableCursors1NF1812( ) ;
   }

   public void deferredUpdate1NF1812( )
   {
   }

   public void delete1NF1812( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NF1812( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NF1812( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NF1812( ) ;
         afterConfirm1NF1812( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NF1812( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NF33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
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
      sMode1812 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NF1812( ) ;
      Gx_mode = sMode1812 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NF1812( )
   {
      standaloneModal1NF1812( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NF34 */
         pr_default.execute(32, new Object[] {A396EmprCod, A13213DisNormID});
         A13216DisNormDsc = T01NF34_A13216DisNormDsc[0] ;
         n13216DisNormDsc = T01NF34_n13216DisNormDsc[0] ;
         pr_default.close(32);
      }
   }

   public void endLevel1NF1812( )
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

   public void scanStart1NF1812( )
   {
      /* Scan By routine */
      /* Using cursor T01NF35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound1812 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13213DisNormID = T01NF35_A13213DisNormID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NF1812( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1812 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13213DisNormID = T01NF35_A13213DisNormID[0] ;
      }
   }

   public void scanEnd1NF1812( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1NF1812( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NF1812( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NF1812( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NF1812( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NF1812( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NF1812( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NF1812( )
   {
      edtDisNormID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtDisNormDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormDsc_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      chkDisNormSt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisNormSt.getEnabled(), 5, 0), !bGXsfl_28_Refreshing);
      chkDisNormNC.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisNormNC.getEnabled(), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashes1NF1812( )
   {
   }

   public void send_integrity_lvl_hashes1NF34( )
   {
   }

   public void subsflControlProps_281812( )
   {
      edtDisNormID_Internalname = "DISNORMID_"+sGXsfl_28_idx ;
      edtDisNormDsc_Internalname = "DISNORMDSC_"+sGXsfl_28_idx ;
      chkDisNormSt.setInternalname( "DISNORMST_"+sGXsfl_28_idx );
      chkDisNormNC.setInternalname( "DISNORMNC_"+sGXsfl_28_idx );
   }

   public void subsflControlProps_fel_281812( )
   {
      edtDisNormID_Internalname = "DISNORMID_"+sGXsfl_28_fel_idx ;
      edtDisNormDsc_Internalname = "DISNORMDSC_"+sGXsfl_28_fel_idx ;
      chkDisNormSt.setInternalname( "DISNORMST_"+sGXsfl_28_fel_idx );
      chkDisNormNC.setInternalname( "DISNORMNC_"+sGXsfl_28_fel_idx );
   }

   public void addRow1NF1812( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_281812( ) ;
      sendRow1NF1812( ) ;
   }

   public void sendRow1NF1812( )
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
         if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1812_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNormID_Internalname,h13213DisNormID,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNormID_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisNormID_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNormDsc_Internalname,GXutil.rtrim( A13216DisNormDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNormDsc_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtDisNormDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1812_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ClassString = "TagColum" ;
      StyleString = "" ;
      GXCCtl = "DISNORMST_" + sGXsfl_28_idx ;
      chkDisNormSt.setName( GXCCtl );
      chkDisNormSt.setWebtags( "" );
      chkDisNormSt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "TitleCaption", chkDisNormSt.getCaption(), !bGXsfl_28_Refreshing);
      chkDisNormSt.setCheckedValue( "N" );
      A13214DisNormSt = ((GXutil.strcmp(GXutil.rtrim( A13214DisNormSt), "S")==0) ? "S" : "N") ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisNormSt.getInternalname(),A13214DisNormSt,"","",Integer.valueOf(chkDisNormSt.getVisible()),Integer.valueOf(chkDisNormSt.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(31, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,31);\""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1812_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ClassString = "TagColum" ;
      StyleString = "" ;
      GXCCtl = "DISNORMNC_" + sGXsfl_28_idx ;
      chkDisNormNC.setName( GXCCtl );
      chkDisNormNC.setWebtags( "" );
      chkDisNormNC.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "TitleCaption", chkDisNormNC.getCaption(), !bGXsfl_28_Refreshing);
      chkDisNormNC.setCheckedValue( "N" );
      A13215DisNormNC = ((GXutil.strcmp(GXutil.rtrim( A13215DisNormNC), "S")==0) ? "S" : "N") ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisNormNC.getInternalname(),A13215DisNormNC,"","",Integer.valueOf(chkDisNormNC.getVisible()),Integer.valueOf(chkDisNormNC.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(32, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,32);\""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1NF1812( ) ;
      GXCCtl = "GXHCDISNORMID_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A13213DisNormID));
      GXCCtl = "Z13213DisNormID_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13213DisNormID));
      GXCCtl = "Z13214DisNormSt_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13214DisNormSt));
      GXCCtl = "Z13215DisNormNC_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13215DisNormNC));
      GXCCtl = "nRcdDeleted_1812_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1812_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1812_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_28_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV36TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMID_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMDSC_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMST_"+sGXsfl_28_idx+"Width", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getWidth(), (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMST_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMST_"+sGXsfl_28_idx+"Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMNC_"+sGXsfl_28_idx+"Width", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getWidth(), (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMNC_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMNC_"+sGXsfl_28_idx+"Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getVisible(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1NF1812( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_281812( ) ;
      edtDisNormID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMID_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisNormDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMDSC_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkDisNormSt.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMST_"+sGXsfl_28_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisNormSt.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMST_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisNormSt.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMST_"+sGXsfl_28_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisNormNC.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMNC_"+sGXsfl_28_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisNormNC.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMNC_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisNormNC.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMNC_"+sGXsfl_28_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      h13213DisNormID = httpContext.cgiGet( edtDisNormID_Internalname) ;
      A13216DisNormDsc = httpContext.cgiGet( edtDisNormDsc_Internalname) ;
      n13216DisNormDsc = false ;
      A13214DisNormSt = ((GXutil.strcmp(httpContext.cgiGet( chkDisNormSt.getInternalname()), "S")==0) ? "S" : "N") ;
      A13215DisNormNC = ((GXutil.strcmp(httpContext.cgiGet( chkDisNormNC.getInternalname()), "S")==0) ? "S" : "N") ;
      GXCCtl = "GXHCDISNORMID_" + sGXsfl_28_idx ;
      A13213DisNormID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13213DisNormID_" + sGXsfl_28_idx ;
      Z13213DisNormID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13214DisNormSt_" + sGXsfl_28_idx ;
      Z13214DisNormSt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13215DisNormNC_" + sGXsfl_28_idx ;
      Z13215DisNormNC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1812_" + sGXsfl_28_idx ;
      nRcdDeleted_1812 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1812_" + sGXsfl_28_idx ;
      nRcdExists_1812 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1812_" + sGXsfl_28_idx ;
      nIsMod_1812 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisNormDsc_Enabled = edtDisNormDsc_Enabled ;
      defedtDisNormID_Enabled = edtDisNormID_Enabled ;
   }

   public void confirmValues1NF0( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_281812( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_281812( ) ;
         httpContext.changePostValue( "Z13213DisNormID_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z13213DisNormID_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13213DisNormID_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z13214DisNormSt_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z13214DisNormSt_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13214DisNormSt_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z13215DisNormNC_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z13215DisNormNC_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13215DisNormNC_"+sGXsfl_28_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdisnor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDISNOR");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DisDest", GXutil.rtrim( localUtil.format( A8886DisDest, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdisnor:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8886DisDest", GXutil.rtrim( Z8886DisDest));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV36TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV36TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV34DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDEST", GXutil.rtrim( A8886DisDest));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCDISNORMID", GXutil.rtrim( A13213DisNormID));
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
      return formatLink("app.tdisnor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDISNOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Normas", "") ;
   }

   public void initializeNonKey1NF34( )
   {
      A8886DisDest = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8886DisDest", A8886DisDest);
      Z8886DisDest = "" ;
   }

   public void initAll1NF34( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      initializeNonKey1NF34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NF1812( )
   {
      A13216DisNormDsc = "" ;
      n13216DisNormDsc = false ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      Z13214DisNormSt = "" ;
      Z13215DisNormNC = "" ;
   }

   public void initAll1NF1812( )
   {
      h13213DisNormID = "" ;
      initializeNonKey1NF1812( ) ;
   }

   public void standaloneModalInsert1NF1812( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821167328", true, true);
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
      httpContext.AddJavascriptSource("tdisnor.js", "?2026821167329", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1812( )
   {
      edtDisNormDsc_Enabled = defedtDisNormDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormDsc_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtDisNormID_Enabled = defedtDisNormID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void startgridcontrol28( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", h13213DisNormID);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13216DisNormDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13214DisNormSt));
      Gridlevel_level1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getWidth(), (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormSt.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13215DisNormNC));
      Gridlevel_level1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getWidth(), (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkDisNormNC.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtDisNormID_Internalname = "DISNORMID" ;
      edtDisNormDsc_Internalname = "DISNORMDSC" ;
      chkDisNormSt.setInternalname( "DISNORMST" );
      chkDisNormNC.setInternalname( "DISNORMNC" );
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Normas", "") );
      chkDisNormNC.setCaption( "" );
      chkDisNormSt.setCaption( "" );
      edtDisNormDsc_Jsonclick = "" ;
      edtDisNormID_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      chkDisNormNC.setEnabled( 1 );
      chkDisNormSt.setEnabled( 1 );
      edtDisNormDsc_Enabled = 0 ;
      edtDisNormID_Enabled = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
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
      chkDisNormSt.setWidth( 0 );
      chkDisNormNC.setWidth( 0 );
      chkDisNormSt.setVisible( -1 );
      chkDisNormNC.setVisible( -1 );
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

   public void gxsgadisnormid1NF0( String A396EmprCod ,
                                   String A13814NormaDscID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgadisnormid_data1NF0( A396EmprCod, A13814NormaDscID) ;
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

   protected void gxsgadisnormid_data1NF0( String A396EmprCod ,
                                           String A13814NormaDscID )
   {
      l13814NormaDscID = GXutil.concat( GXutil.rtrim( A13814NormaDscID), "%", "") ;
      /* Using cursor T01NF36 */
      pr_default.execute(34, new Object[] {A396EmprCod, l13814NormaDscID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(34) != 101) )
      {
         gxdynajaxctrlcodr.add(T01NF36_A13814NormaDscID[0]);
         gxdynajaxctrldescr.add(T01NF36_A13814NormaDscID[0]);
         pr_default.readNext(34);
      }
      pr_default.close(34);
   }

   public void gxhcadisnormid1NF1812( String A396EmprCod ,
                                      String A13814NormaDscID )
   {
      /* Using cursor T01NF37 */
      pr_default.execute(35, new Object[] {A13814NormaDscID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(35) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13814NormaDscID = T01NF37_A13814NormaDscID[0] ;
         A396EmprCod = T01NF37_A396EmprCod[0] ;
         A13217NormaID = T01NF37_A13217NormaID[0] ;
         pr_default.readNext(35);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13217NormaID))+"\"") ;
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
      pr_default.close(35);
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_281812( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NF1812( ) ;
         standaloneModal1NF1812( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NF1812( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_281812( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "DISNORMST_" + sGXsfl_28_idx ;
      chkDisNormSt.setName( GXCCtl );
      chkDisNormSt.setWebtags( "" );
      chkDisNormSt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormSt.getInternalname(), "TitleCaption", chkDisNormSt.getCaption(), !bGXsfl_28_Refreshing);
      chkDisNormSt.setCheckedValue( "N" );
      A13214DisNormSt = ((GXutil.strcmp(GXutil.rtrim( A13214DisNormSt), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISNORMNC_" + sGXsfl_28_idx ;
      chkDisNormNC.setName( GXCCtl );
      chkDisNormNC.setWebtags( "" );
      chkDisNormNC.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisNormNC.getInternalname(), "TitleCaption", chkDisNormNC.getCaption(), !bGXsfl_28_Refreshing);
      chkDisNormNC.setCheckedValue( "N" );
      A13215DisNormNC = ((GXutil.strcmp(GXutil.rtrim( A13215DisNormNC), "S")==0) ? "S" : "N") ;
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

   public void valid_Disnormid( )
   {
      n13216DisNormDsc = false ;
      if ( (GXutil.strcmp("", h13213DisNormID)==0) )
      {
         A13213DisNormID = "" ;
      }
      else
      {
         A13814NormaDscID = h13213DisNormID ;
         /* Using cursor T01NF38 */
         pr_default.execute(36, new Object[] {A13814NormaDscID, A396EmprCod});
         A13213DisNormID = T01NF38_A13217NormaID[0] ;
         if ( ! ( (pr_default.getStatus(36) == 101) ) )
         {
            pr_default.readNext(36);
            if ( ! ( (pr_default.getStatus(36) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "DISNORMID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisNormID_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(36);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13213DisNormID", h13213DisNormID);
      /* Using cursor T01NF39 */
      pr_default.execute(37, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISNORMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisNormID_Internalname ;
      }
      A13216DisNormDsc = T01NF39_A13216DisNormDsc[0] ;
      n13216DisNormDsc = T01NF39_n13216DisNormDsc[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13213DisNormID", GXutil.rtrim( A13213DisNormID));
      httpContext.ajax_rsp_assign_attri("", false, "A13216DisNormDsc", GXutil.rtrim( A13216DisNormDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h13213DisNormID", h13213DisNormID);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A8886DisDest',fld:'DISDEST',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121NF2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_DISNORMID","{handler:'valid_Disnormid',iparms:[{av:'h13213DisNormID'},{av:'A13213DisNormID',fld:'DISNORMID',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13216DisNormDsc',fld:'DISNORMDSC',pic:''}]");
      setEventMetadata("VALID_DISNORMID",",oparms:[{av:'A13213DisNormID',fld:'DISNORMID',pic:''},{av:'A13216DisNormDsc',fld:'DISNORMDSC',pic:''},{av:'h13213DisNormID'}]}");
      setEventMetadata("NULL","{handler:'valid_Disnormnc',iparms:[]");
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
      pr_default.close(37);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8886DisDest = "" ;
      Z13213DisNormID = "" ;
      Z13214DisNormSt = "" ;
      Z13215DisNormNC = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13814NormaDscID = "" ;
      h13213DisNormID = "" ;
      A13213DisNormID = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1812 = "" ;
      sStyleString = "" ;
      A8886DisDest = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode34 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A13216DisNormDsc = "" ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T01NF7_A407EmprNom = new String[] {""} ;
      T01NF7_n407EmprNom = new boolean[] {false} ;
      T01NF8_A361DisCod = new int[1] ;
      T01NF8_A407EmprNom = new String[] {""} ;
      T01NF8_n407EmprNom = new boolean[] {false} ;
      T01NF8_A8886DisDest = new String[] {""} ;
      T01NF8_A396EmprCod = new String[] {""} ;
      T01NF9_A396EmprCod = new String[] {""} ;
      T01NF9_A361DisCod = new int[1] ;
      T01NF6_A361DisCod = new int[1] ;
      T01NF6_A8886DisDest = new String[] {""} ;
      T01NF6_A396EmprCod = new String[] {""} ;
      T01NF10_A396EmprCod = new String[] {""} ;
      T01NF10_A361DisCod = new int[1] ;
      T01NF11_A396EmprCod = new String[] {""} ;
      T01NF11_A361DisCod = new int[1] ;
      T01NF5_A361DisCod = new int[1] ;
      T01NF5_A8886DisDest = new String[] {""} ;
      T01NF5_A396EmprCod = new String[] {""} ;
      T01NF15_A396EmprCod = new String[] {""} ;
      T01NF15_A361DisCod = new int[1] ;
      T01NF15_A13376DisTraID = new String[] {""} ;
      T01NF16_A396EmprCod = new String[] {""} ;
      T01NF16_A361DisCod = new int[1] ;
      T01NF16_A13081DisDGLin = new byte[1] ;
      T01NF16_A13082DisDGDibCl = new String[] {""} ;
      T01NF16_A13083DisDGDibIn = new int[1] ;
      T01NF16_A13084DisDGComb = new String[] {""} ;
      T01NF16_A13085DisDGFondo = new String[] {""} ;
      T01NF17_A396EmprCod = new String[] {""} ;
      T01NF17_A361DisCod = new int[1] ;
      T01NF17_A7068DisNotLin = new byte[1] ;
      T01NF18_A396EmprCod = new String[] {""} ;
      T01NF18_A361DisCod = new int[1] ;
      T01NF18_A10197ProEspCod = new String[] {""} ;
      T01NF19_A396EmprCod = new String[] {""} ;
      T01NF19_A361DisCod = new int[1] ;
      T01NF19_A4594AccCod = new short[1] ;
      T01NF20_A396EmprCod = new String[] {""} ;
      T01NF20_A361DisCod = new int[1] ;
      T01NF20_A2524DisComLin = new byte[1] ;
      T01NF20_A1056DisComCod = new String[] {""} ;
      T01NF20_A1032FonCod = new String[] {""} ;
      T01NF21_A396EmprCod = new String[] {""} ;
      T01NF21_A361DisCod = new int[1] ;
      T01NF21_A3398DisRefBarC = new int[1] ;
      T01NF21_A3399DisRefBCRe = new byte[1] ;
      T01NF21_A3400DisRefBCPa = new String[] {""} ;
      T01NF21_A3607DisRefBPie = new String[] {""} ;
      T01NF22_A396EmprCod = new String[] {""} ;
      T01NF22_A361DisCod = new int[1] ;
      T01NF22_A376DisObsLin = new byte[1] ;
      T01NF23_A396EmprCod = new String[] {""} ;
      T01NF23_A361DisCod = new int[1] ;
      T01NF23_A758ProCod = new String[] {""} ;
      T01NF24_A396EmprCod = new String[] {""} ;
      T01NF24_A361DisCod = new int[1] ;
      T01NF24_A833TipDefCod = new short[1] ;
      T01NF25_A396EmprCod = new String[] {""} ;
      T01NF25_A361DisCod = new int[1] ;
      T01NF25_A44AlbRecCod = new int[1] ;
      T01NF26_A396EmprCod = new String[] {""} ;
      T01NF26_A361DisCod = new int[1] ;
      Z13216DisNormDsc = "" ;
      T01NF27_A361DisCod = new int[1] ;
      T01NF27_A13216DisNormDsc = new String[] {""} ;
      T01NF27_n13216DisNormDsc = new boolean[] {false} ;
      T01NF27_A13214DisNormSt = new String[] {""} ;
      T01NF27_A13215DisNormNC = new String[] {""} ;
      T01NF27_A396EmprCod = new String[] {""} ;
      T01NF27_A13213DisNormID = new String[] {""} ;
      T01NF28_A13814NormaDscID = new String[] {""} ;
      T01NF28_A396EmprCod = new String[] {""} ;
      T01NF28_A13217NormaID = new String[] {""} ;
      T01NF4_A13216DisNormDsc = new String[] {""} ;
      T01NF4_n13216DisNormDsc = new boolean[] {false} ;
      T01NF29_A13216DisNormDsc = new String[] {""} ;
      T01NF29_n13216DisNormDsc = new boolean[] {false} ;
      T01NF30_A396EmprCod = new String[] {""} ;
      T01NF30_A361DisCod = new int[1] ;
      T01NF30_A13213DisNormID = new String[] {""} ;
      T01NF3_A361DisCod = new int[1] ;
      T01NF3_A13214DisNormSt = new String[] {""} ;
      T01NF3_A13215DisNormNC = new String[] {""} ;
      T01NF3_A396EmprCod = new String[] {""} ;
      T01NF3_A13213DisNormID = new String[] {""} ;
      T01NF2_A361DisCod = new int[1] ;
      T01NF2_A13214DisNormSt = new String[] {""} ;
      T01NF2_A13215DisNormNC = new String[] {""} ;
      T01NF2_A396EmprCod = new String[] {""} ;
      T01NF2_A13213DisNormID = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      T01NF34_A13216DisNormDsc = new String[] {""} ;
      T01NF34_n13216DisNormDsc = new boolean[] {false} ;
      T01NF35_A396EmprCod = new String[] {""} ;
      T01NF35_A361DisCod = new int[1] ;
      T01NF35_A13213DisNormID = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13814NormaDscID = "" ;
      T01NF36_A13814NormaDscID = new String[] {""} ;
      T01NF37_A13814NormaDscID = new String[] {""} ;
      T01NF37_A396EmprCod = new String[] {""} ;
      T01NF37_A13217NormaID = new String[] {""} ;
      A13217NormaID = "" ;
      T01NF38_A13814NormaDscID = new String[] {""} ;
      T01NF38_A396EmprCod = new String[] {""} ;
      T01NF38_A13217NormaID = new String[] {""} ;
      T01NF39_A13216DisNormDsc = new String[] {""} ;
      T01NF39_n13216DisNormDsc = new boolean[] {false} ;
      Zh13213DisNormID = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisnor__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisnor__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisnor__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisnor__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisnor__default(),
         new Object[] {
             new Object[] {
            T01NF2_A361DisCod, T01NF2_A13214DisNormSt, T01NF2_A13215DisNormNC, T01NF2_A396EmprCod, T01NF2_A13213DisNormID
            }
            , new Object[] {
            T01NF3_A361DisCod, T01NF3_A13214DisNormSt, T01NF3_A13215DisNormNC, T01NF3_A396EmprCod, T01NF3_A13213DisNormID
            }
            , new Object[] {
            T01NF4_A13216DisNormDsc, T01NF4_n13216DisNormDsc
            }
            , new Object[] {
            T01NF5_A361DisCod, T01NF5_A8886DisDest, T01NF5_A396EmprCod
            }
            , new Object[] {
            T01NF6_A361DisCod, T01NF6_A8886DisDest, T01NF6_A396EmprCod
            }
            , new Object[] {
            T01NF7_A407EmprNom, T01NF7_n407EmprNom
            }
            , new Object[] {
            T01NF8_A361DisCod, T01NF8_A407EmprNom, T01NF8_n407EmprNom, T01NF8_A8886DisDest, T01NF8_A396EmprCod
            }
            , new Object[] {
            T01NF9_A396EmprCod, T01NF9_A361DisCod
            }
            , new Object[] {
            T01NF10_A396EmprCod, T01NF10_A361DisCod
            }
            , new Object[] {
            T01NF11_A396EmprCod, T01NF11_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NF15_A396EmprCod, T01NF15_A361DisCod, T01NF15_A13376DisTraID
            }
            , new Object[] {
            T01NF16_A396EmprCod, T01NF16_A361DisCod, T01NF16_A13081DisDGLin, T01NF16_A13082DisDGDibCl, T01NF16_A13083DisDGDibIn, T01NF16_A13084DisDGComb, T01NF16_A13085DisDGFondo
            }
            , new Object[] {
            T01NF17_A396EmprCod, T01NF17_A361DisCod, T01NF17_A7068DisNotLin
            }
            , new Object[] {
            T01NF18_A396EmprCod, T01NF18_A361DisCod, T01NF18_A10197ProEspCod
            }
            , new Object[] {
            T01NF19_A396EmprCod, T01NF19_A361DisCod, T01NF19_A4594AccCod
            }
            , new Object[] {
            T01NF20_A396EmprCod, T01NF20_A361DisCod, T01NF20_A2524DisComLin, T01NF20_A1056DisComCod, T01NF20_A1032FonCod
            }
            , new Object[] {
            T01NF21_A396EmprCod, T01NF21_A361DisCod, T01NF21_A3398DisRefBarC, T01NF21_A3399DisRefBCRe, T01NF21_A3400DisRefBCPa, T01NF21_A3607DisRefBPie
            }
            , new Object[] {
            T01NF22_A396EmprCod, T01NF22_A361DisCod, T01NF22_A376DisObsLin
            }
            , new Object[] {
            T01NF23_A396EmprCod, T01NF23_A361DisCod, T01NF23_A758ProCod
            }
            , new Object[] {
            T01NF24_A396EmprCod, T01NF24_A361DisCod, T01NF24_A833TipDefCod
            }
            , new Object[] {
            T01NF25_A396EmprCod, T01NF25_A361DisCod, T01NF25_A44AlbRecCod
            }
            , new Object[] {
            T01NF26_A396EmprCod, T01NF26_A361DisCod
            }
            , new Object[] {
            T01NF27_A361DisCod, T01NF27_A13216DisNormDsc, T01NF27_n13216DisNormDsc, T01NF27_A13214DisNormSt, T01NF27_A13215DisNormNC, T01NF27_A396EmprCod, T01NF27_A13213DisNormID
            }
            , new Object[] {
            T01NF28_A13814NormaDscID, T01NF28_A396EmprCod, T01NF28_A13217NormaID
            }
            , new Object[] {
            T01NF29_A13216DisNormDsc, T01NF29_n13216DisNormDsc
            }
            , new Object[] {
            T01NF30_A396EmprCod, T01NF30_A361DisCod, T01NF30_A13213DisNormID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NF34_A13216DisNormDsc, T01NF34_n13216DisNormDsc
            }
            , new Object[] {
            T01NF35_A396EmprCod, T01NF35_A361DisCod, T01NF35_A13213DisNormID
            }
            , new Object[] {
            T01NF36_A13814NormaDscID
            }
            , new Object[] {
            T01NF37_A13814NormaDscID, T01NF37_A396EmprCod, T01NF37_A13217NormaID
            }
            , new Object[] {
            T01NF38_A13814NormaDscID, T01NF38_A396EmprCod, T01NF38_A13217NormaID
            }
            , new Object[] {
            T01NF39_A13216DisNormDsc, T01NF39_n13216DisNormDsc
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte AV33Carvema ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_1812 ;
   private short nRcdExists_1812 ;
   private short nIsMod_1812 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1812 ;
   private short RcdFound1812 ;
   private short nBlankRcdUsr1812 ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_1812 ;
   private short gxhchits ;
   private int wcpOAV34DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int AV34DisCod ;
   private int trnEnded ;
   private int A361DisCod ;
   private int edtDisCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtDisNormID_Enabled ;
   private int edtDisNormDsc_Enabled ;
   private int fRowAdded ;
   private int A8886DisDest_Visible ;
   private int GX_JID ;
   private int GXv_int8[] ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtDisNormDsc_Enabled ;
   private int defedtDisNormID_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z8886DisDest ;
   private String Z13213DisNormID ;
   private String Z13214DisNormSt ;
   private String Z13215DisNormNC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A13213DisNormID ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisCod_Internalname ;
   private String sGXsfl_28_idx="0001" ;
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
   private String TempTags ;
   private String edtDisCod_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String sMode1812 ;
   private String edtDisNormID_Internalname ;
   private String edtDisNormDsc_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A8886DisDest ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A13216DisNormDsc ;
   private String A13214DisNormSt ;
   private String A13215DisNormNC ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z13216DisNormDsc ;
   private String GXv_char4[] ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtDisNormID_Jsonclick ;
   private String edtDisNormDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String A13217NormaID ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_28_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private String A13814NormaDscID ;
   private String h13213DisNormID ;
   private String l13814NormaDscID ;
   private String Zh13213DisNormID ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkDisNormSt ;
   private ICheckbox chkDisNormNC ;
   private IDataStoreProvider pr_default ;
   private String[] T01NF7_A407EmprNom ;
   private boolean[] T01NF7_n407EmprNom ;
   private int[] T01NF8_A361DisCod ;
   private String[] T01NF8_A407EmprNom ;
   private boolean[] T01NF8_n407EmprNom ;
   private String[] T01NF8_A8886DisDest ;
   private String[] T01NF8_A396EmprCod ;
   private String[] T01NF9_A396EmprCod ;
   private int[] T01NF9_A361DisCod ;
   private int[] T01NF6_A361DisCod ;
   private String[] T01NF6_A8886DisDest ;
   private String[] T01NF6_A396EmprCod ;
   private String[] T01NF10_A396EmprCod ;
   private int[] T01NF10_A361DisCod ;
   private String[] T01NF11_A396EmprCod ;
   private int[] T01NF11_A361DisCod ;
   private int[] T01NF5_A361DisCod ;
   private String[] T01NF5_A8886DisDest ;
   private String[] T01NF5_A396EmprCod ;
   private String[] T01NF15_A396EmprCod ;
   private int[] T01NF15_A361DisCod ;
   private String[] T01NF15_A13376DisTraID ;
   private String[] T01NF16_A396EmprCod ;
   private int[] T01NF16_A361DisCod ;
   private byte[] T01NF16_A13081DisDGLin ;
   private String[] T01NF16_A13082DisDGDibCl ;
   private int[] T01NF16_A13083DisDGDibIn ;
   private String[] T01NF16_A13084DisDGComb ;
   private String[] T01NF16_A13085DisDGFondo ;
   private String[] T01NF17_A396EmprCod ;
   private int[] T01NF17_A361DisCod ;
   private byte[] T01NF17_A7068DisNotLin ;
   private String[] T01NF18_A396EmprCod ;
   private int[] T01NF18_A361DisCod ;
   private String[] T01NF18_A10197ProEspCod ;
   private String[] T01NF19_A396EmprCod ;
   private int[] T01NF19_A361DisCod ;
   private short[] T01NF19_A4594AccCod ;
   private String[] T01NF20_A396EmprCod ;
   private int[] T01NF20_A361DisCod ;
   private byte[] T01NF20_A2524DisComLin ;
   private String[] T01NF20_A1056DisComCod ;
   private String[] T01NF20_A1032FonCod ;
   private String[] T01NF21_A396EmprCod ;
   private int[] T01NF21_A361DisCod ;
   private int[] T01NF21_A3398DisRefBarC ;
   private byte[] T01NF21_A3399DisRefBCRe ;
   private String[] T01NF21_A3400DisRefBCPa ;
   private String[] T01NF21_A3607DisRefBPie ;
   private String[] T01NF22_A396EmprCod ;
   private int[] T01NF22_A361DisCod ;
   private byte[] T01NF22_A376DisObsLin ;
   private String[] T01NF23_A396EmprCod ;
   private int[] T01NF23_A361DisCod ;
   private String[] T01NF23_A758ProCod ;
   private String[] T01NF24_A396EmprCod ;
   private int[] T01NF24_A361DisCod ;
   private short[] T01NF24_A833TipDefCod ;
   private String[] T01NF25_A396EmprCod ;
   private int[] T01NF25_A361DisCod ;
   private int[] T01NF25_A44AlbRecCod ;
   private String[] T01NF26_A396EmprCod ;
   private int[] T01NF26_A361DisCod ;
   private int[] T01NF27_A361DisCod ;
   private String[] T01NF27_A13216DisNormDsc ;
   private boolean[] T01NF27_n13216DisNormDsc ;
   private String[] T01NF27_A13214DisNormSt ;
   private String[] T01NF27_A13215DisNormNC ;
   private String[] T01NF27_A396EmprCod ;
   private String[] T01NF27_A13213DisNormID ;
   private String[] T01NF28_A13814NormaDscID ;
   private String[] T01NF28_A396EmprCod ;
   private String[] T01NF28_A13217NormaID ;
   private String[] T01NF4_A13216DisNormDsc ;
   private boolean[] T01NF4_n13216DisNormDsc ;
   private String[] T01NF29_A13216DisNormDsc ;
   private boolean[] T01NF29_n13216DisNormDsc ;
   private String[] T01NF30_A396EmprCod ;
   private int[] T01NF30_A361DisCod ;
   private String[] T01NF30_A13213DisNormID ;
   private int[] T01NF3_A361DisCod ;
   private String[] T01NF3_A13214DisNormSt ;
   private String[] T01NF3_A13215DisNormNC ;
   private String[] T01NF3_A396EmprCod ;
   private String[] T01NF3_A13213DisNormID ;
   private int[] T01NF2_A361DisCod ;
   private String[] T01NF2_A13214DisNormSt ;
   private String[] T01NF2_A13215DisNormNC ;
   private String[] T01NF2_A396EmprCod ;
   private String[] T01NF2_A13213DisNormID ;
   private String[] T01NF34_A13216DisNormDsc ;
   private boolean[] T01NF34_n13216DisNormDsc ;
   private String[] T01NF35_A396EmprCod ;
   private int[] T01NF35_A361DisCod ;
   private String[] T01NF35_A13213DisNormID ;
   private String[] T01NF36_A13814NormaDscID ;
   private String[] T01NF37_A13814NormaDscID ;
   private String[] T01NF37_A396EmprCod ;
   private String[] T01NF37_A13217NormaID ;
   private String[] T01NF38_A13814NormaDscID ;
   private String[] T01NF38_A396EmprCod ;
   private String[] T01NF38_A13217NormaID ;
   private String[] T01NF39_A13216DisNormDsc ;
   private boolean[] T01NF39_n13216DisNormDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tdisnor__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisnor__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisnor__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisnor__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisnor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NF2", "SELECT DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?  FOR UPDATE OF DisNormSt, DisNormNC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF3", "SELECT DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF4", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF5", "SELECT DisCod, DisDest, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisDest NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF6", "SELECT DisCod, DisDest, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF8", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, T2.EmprNom, TM1.DisDest, TM1.EmprCod FROM (TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( DisCod > ?) and EmprCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( DisCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NF12", "INSERT INTO TXPDISPOS(DisCod, DisDest, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01NF13", "UPDATE TXPDISPOS SET DisDest=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01NF14", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01NF15", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF16", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF17", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF18", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF19", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF20", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF21", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF22", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF23", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF24", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF25", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NF26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF27", "SELECT T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormSt, T1.DisNormNC, T1.EmprCod, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.DisNormID = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF28", "SELECT RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, ''))) AS NormaDscID, EmprCod, NormaID FROM TXPNORMAS WHERE (EmprCod = ?) AND (NormaID = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF29", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF30", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NF31", "INSERT INTO TXPDISNOR(DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDISNOR")
         ,new UpdateCursor("T01NF32", "UPDATE TXPDISNOR SET DisNormSt=?, DisNormNC=?  WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?", GX_NOMASK, "TXPDISNOR")
         ,new UpdateCursor("T01NF33", "DELETE FROM TXPDISNOR  WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?", GX_NOMASK, "TXPDISNOR")
         ,new ForEachCursor("T01NF34", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF35", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF36", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, ''))) AS NormaDscID FROM TXPNORMAS WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, '')))) like '%' || UPPER(?)) ORDER BY NormaDscID) WHERE rownum <= 10 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF37", "SELECT RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, ''))) AS NormaDscID, EmprCod, NormaID FROM TXPNORMAS WHERE (RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF38", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, ''))) AS NormaDscID, EmprCod, NormaID FROM TXPNORMAS WHERE (RTRIM(LTRIM(NormaID)) || '-' || RTRIM(LTRIM(COALESCE( NormaDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NF39", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
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
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 4);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 4);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 80);
               return;
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 80);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 36 :
               stmt.setVarchar(1, (String)parms[0], 80);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

