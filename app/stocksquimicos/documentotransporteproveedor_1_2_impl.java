package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_1_2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"ALBPRODTA") == 0 )
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
         gx3asaalbprodta1UG1838( A396EmprCod, A13418AlbProID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13425AlbProCliC = (int)(GXutil.lval( httpContext.GetPar( "AlbProCliC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A13425AlbProCliC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13419AlbProPrvI = (int)(GXutil.lval( httpContext.GetPar( "AlbProPrvI"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A13419AlbProPrvI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13453CatDocID = (short)(GXutil.lval( httpContext.GetPar( "CatDocID"))) ;
         n13453CatDocID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_34( A396EmprCod, A13453CatDocID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A719PrdNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_albpro") == 0 )
      {
         gxnrgridlevel_albpro_newrow_invoke( ) ;
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
            AV8EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
            AV23AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProID), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23AlbProID), "ZZZZZZZ9")));
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
         GX_FocusControl = edtAlbProID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_albpro_newrow_invoke( )
   {
      nRC_GXsfl_120 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_120"))) ;
      nGXsfl_120_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_120_idx"))) ;
      sGXsfl_120_idx = httpContext.GetPar( "sGXsfl_120_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_albpro_newrow( ) ;
      /* End function gxnrGridlevel_albpro_newrow_invoke */
   }

   public documentotransporteproveedor_1_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransporteproveedor_1_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_1_2_impl.class ));
   }

   public documentotransporteproveedor_1_2_impl( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProStAT = new HTMLChoice();
      cmbAlbProEnvA = new HTMLChoice();
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
      if ( cmbAlbProStAT.getItemCount() > 0 )
      {
         A13438AlbProStAT = (byte)(GXutil.lval( cmbAlbProStAT.getValidValue(GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProStAT.setValue( GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Values", cmbAlbProStAT.ToJavascriptSource(), true);
      }
      if ( cmbAlbProEnvA.getItemCount() > 0 )
      {
         A13435AlbProEnvA = cmbAlbProEnvA.getValidValue(A13435AlbProEnvA) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProEnvA.setValue( GXutil.rtrim( A13435AlbProEnvA) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEnvA.getInternalname(), "Values", cmbAlbProEnvA.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProID_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProID_Internalname, GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProID_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProDate_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProDate_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProDate_Internalname, localUtil.format(A13430AlbProDate, "99/99/99"), localUtil.format( A13430AlbProDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProDate_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProDate_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProDtA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProDtA_Internalname, httpContext.getMessage( "Data Doc. Ant.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProDtA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProDtA_Internalname, localUtil.format(A14399AlbProDtA, "99/99/99"), localUtil.format( A14399AlbProDtA, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProDtA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProDtA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProDtA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProDtA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbproprvid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbproprvid_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblockalbproprvid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albproprvid.setProperty("Caption", Combo_albproprvid_Caption);
      ucCombo_albproprvid.setProperty("Cls", Combo_albproprvid_Cls);
      ucCombo_albproprvid.setProperty("EmptyItem", Combo_albproprvid_Emptyitem);
      ucCombo_albproprvid.setProperty("DropDownOptionsData", AV35AlbProPrvID_Data);
      ucCombo_albproprvid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albproprvid_Internalname, "COMBO_ALBPROPRVIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProPrvI_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProPrvI_Internalname, GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13419AlbProPrvI), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProPrvI_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProPrvI_Visible, edtAlbProPrvI_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV32TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProMatr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProMatr_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProMatr_Internalname, GXutil.rtrim( A13424AlbProMatr), GXutil.rtrim( localUtil.format( A13424AlbProMatr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProMatr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProMatr_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProSal_Internalname, httpContext.getMessage( "Data-Hora Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProSal_Internalname, localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13429AlbProSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbProObs_Internalname, A13439AlbProObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", (short)(0), 1, edtAlbProObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMsg_dev_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavMsg_dev_Internalname, AV22Msg_dev, GXutil.rtrim( localUtil.format( AV22Msg_dev, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMsg_dev_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMsg_dev_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
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
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProStAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProStAT.getInternalname(), httpContext.getMessage( "Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProStAT, cmbAlbProStAT.getInternalname(), GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)), 1, cmbAlbProStAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbProStAT.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      cmbAlbProStAT.setValue( GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Values", cmbAlbProStAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProIDAT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProIDAT_Internalname, httpContext.getMessage( "Codigo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProIDAT_Internalname, GXutil.rtrim( A13436AlbProIDAT), GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProIDAT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProIDAT_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProEnvA.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProEnvA.getInternalname(), httpContext.getMessage( "A/M", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProEnvA, cmbAlbProEnvA.getInternalname(), GXutil.rtrim( A13435AlbProEnvA), 1, cmbAlbProEnvA.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProEnvA.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      cmbAlbProEnvA.setValue( GXutil.rtrim( A13435AlbProEnvA) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEnvA.getInternalname(), "Values", cmbAlbProEnvA.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProSys_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProSys_Internalname, httpContext.getMessage( "Data System Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProSys_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProSys_Internalname, localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13431AlbProSys, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProSys_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProSys_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProSys_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProSys_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProATCU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProATCU_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProATCU_Internalname, GXutil.rtrim( A14190AlbProATCU), GXutil.rtrim( localUtil.format( A14190AlbProATCU, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProATCU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProATCU_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProFm4d_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProFm4d_Internalname, httpContext.getMessage( "Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProFm4d_Internalname, GXutil.rtrim( A14376AlbProFm4d), GXutil.rtrim( localUtil.format( A14376AlbProFm4d, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProFm4d_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProFm4d_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_albpro_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_albpro( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV39Pgmname), GXutil.rtrim( localUtil.format( AV39Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albproprvid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbproprvid_Internalname, GXutil.ltrim( localUtil.ntoc( AV36ComboAlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalbproprvid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36ComboAlbProPrvID), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36ComboAlbProPrvID), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbproprvid_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbproprvid_Visible, edtavComboalbproprvid_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV34ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13425AlbProCliC), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCliC_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProCliC_Visible, edtAlbProCliC_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProDomE_Internalname, GXutil.ltrim( localUtil.ntoc( A13427AlbProDomE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProDomE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13427AlbProDomE), "9") : localUtil.format( DecimalUtil.doubleToDec(A13427AlbProDomE), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProDomE_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProDomE_Visible, edtAlbProDomE_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProTipo_Internalname, GXutil.rtrim( A13417AlbProTipo), GXutil.rtrim( localUtil.format( A13417AlbProTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProTipo_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProTipo_Visible, edtAlbProTipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCatDocID_Internalname, GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13453CatDocID), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCatDocID_Jsonclick, 0, "Attribute", "", "", "", "", edtCatDocID_Visible, edtCatDocID_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_1_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_albpro( )
   {
      /*  Grid Control  */
      startgridcontrol120( ) ;
      nGXsfl_120_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1839 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1839 = (short)(1) ;
            scanStart1UG1839( ) ;
            while ( RcdFound1839 != 0 )
            {
               init_level_properties1839( ) ;
               getByPrimaryKey1UG1839( ) ;
               addRow1UG1839( ) ;
               scanNext1UG1839( ) ;
            }
            scanEnd1UG1839( ) ;
            nBlankRcdCount1839 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1UG1839( ) ;
         standaloneModal1UG1839( ) ;
         sMode1839 = Gx_mode ;
         while ( nGXsfl_120_idx < nRC_GXsfl_120 )
         {
            bGXsfl_120_Refreshing = true ;
            readRow1UG1839( ) ;
            edtAlbProLine_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROLINE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtAlbProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRODSC_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDsc_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtAlbProCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCNT_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCnt_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            cmbAlbProUnd.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROUND_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProUnd.getEnabled(), 5, 0), !bGXsfl_120_Refreshing);
            edtAlbProCaja_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCAJA_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCaja_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCaja_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtAlbProObsL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROOBSL_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObsL_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            if ( ( nRcdExists_1839 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UG1839( ) ;
            }
            sendRow1UG1839( ) ;
            bGXsfl_120_Refreshing = false ;
         }
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1839 = (short)(5) ;
         nRcdExists_1839 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UG1839( ) ;
            while ( RcdFound1839 != 0 )
            {
               sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1201839( ) ;
               init_level_properties1839( ) ;
               standaloneNotModal1UG1839( ) ;
               getByPrimaryKey1UG1839( ) ;
               standaloneModal1UG1839( ) ;
               addRow1UG1839( ) ;
               scanNext1UG1839( ) ;
            }
            scanEnd1UG1839( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1839 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1201839( ) ;
         initAll1UG1839( ) ;
         init_level_properties1839( ) ;
         nRcdExists_1839 = (short)(0) ;
         nIsMod_1839 = (short)(0) ;
         nRcdDeleted_1839 = (short)(0) ;
         nBlankRcdCount1839 = (short)(nBlankRcdUsr1839+nBlankRcdCount1839) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1839 > 0 )
         {
            standaloneNotModal1UG1839( ) ;
            standaloneModal1UG1839( ) ;
            addRow1UG1839( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbProLine_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1839 = (short)(nBlankRcdCount1839-1) ;
         }
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_albproContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_albpro", Gridlevel_albproContainer, subGridlevel_albpro_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_albproContainerData", Gridlevel_albproContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_albproContainerData"+"V", Gridlevel_albproContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_albproContainerData"+"V"+"\" value='"+Gridlevel_albproContainer.GridValuesHidden()+"'/>") ;
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
      e111UG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBPROPRVID_DATA"), AV35AlbProPrvID_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV32TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( "Z13418AlbProID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13452AlbProInEx = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13452AlbProInEx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13417AlbProTipo = httpContext.cgiGet( "Z13417AlbProTipo") ;
            Z13430AlbProDate = localUtil.ctod( httpContext.cgiGet( "Z13430AlbProDate"), 0) ;
            Z13429AlbProSal = localUtil.ctot( httpContext.cgiGet( "Z13429AlbProSal"), 0) ;
            Z13427AlbProDomE = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13427AlbProDomE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13424AlbProMatr = httpContext.cgiGet( "Z13424AlbProMatr") ;
            Z13439AlbProObs = httpContext.cgiGet( "Z13439AlbProObs") ;
            Z13437AlbProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13437AlbProSta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13431AlbProSys = localUtil.ctot( httpContext.cgiGet( "Z13431AlbProSys"), 0) ;
            Z13433AlbProHh = httpContext.cgiGet( "Z13433AlbProHh") ;
            Z13434AlbProHhCt = httpContext.cgiGet( "Z13434AlbProHhCt") ;
            Z13435AlbProEnvA = httpContext.cgiGet( "Z13435AlbProEnvA") ;
            Z13436AlbProIDAT = httpContext.cgiGet( "Z13436AlbProIDAT") ;
            Z13438AlbProStAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13438AlbProStAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13440AlbProAnul = httpContext.cgiGet( "Z13440AlbProAnul") ;
            Z13441AlbProUltL = (short)(localUtil.ctol( httpContext.cgiGet( "Z13441AlbProUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13579AlbProLC1 = httpContext.cgiGet( "Z13579AlbProLC1") ;
            Z13580AlbProLC2 = httpContext.cgiGet( "Z13580AlbProLC2") ;
            Z13581AlbProLC3 = httpContext.cgiGet( "Z13581AlbProLC3") ;
            Z13582AlbProLD1 = httpContext.cgiGet( "Z13582AlbProLD1") ;
            Z13583AlbProLD2 = httpContext.cgiGet( "Z13583AlbProLD2") ;
            Z13584AlbProLD3 = httpContext.cgiGet( "Z13584AlbProLD3") ;
            Z14190AlbProATCU = httpContext.cgiGet( "Z14190AlbProATCU") ;
            Z14191AlbProSerA = httpContext.cgiGet( "Z14191AlbProSerA") ;
            Z14192AlbProTipA = httpContext.cgiGet( "Z14192AlbProTipA") ;
            Z13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z13425AlbProCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( "Z13419AlbProPrvI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "Z13453CatDocID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13452AlbProInEx = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13452AlbProInEx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13437AlbProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13437AlbProSta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13433AlbProHh = httpContext.cgiGet( "Z13433AlbProHh") ;
            A13434AlbProHhCt = httpContext.cgiGet( "Z13434AlbProHhCt") ;
            A13440AlbProAnul = httpContext.cgiGet( "Z13440AlbProAnul") ;
            A13441AlbProUltL = (short)(localUtil.ctol( httpContext.cgiGet( "Z13441AlbProUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13579AlbProLC1 = httpContext.cgiGet( "Z13579AlbProLC1") ;
            A13580AlbProLC2 = httpContext.cgiGet( "Z13580AlbProLC2") ;
            A13581AlbProLC3 = httpContext.cgiGet( "Z13581AlbProLC3") ;
            A13582AlbProLD1 = httpContext.cgiGet( "Z13582AlbProLD1") ;
            A13583AlbProLD2 = httpContext.cgiGet( "Z13583AlbProLD2") ;
            A13584AlbProLD3 = httpContext.cgiGet( "Z13584AlbProLD3") ;
            A14191AlbProSerA = httpContext.cgiGet( "Z14191AlbProSerA") ;
            n14191AlbProSerA = false ;
            A14192AlbProTipA = httpContext.cgiGet( "Z14192AlbProTipA") ;
            n14192AlbProTipA = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_120 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_120"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "N13453CatDocID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( "N13419AlbProPrvI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( "N13425AlbProCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A13433AlbProHh = httpContext.cgiGet( "ALBPROHH") ;
            AV8EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV23AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( "vALBPROID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Insert_CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CATDOCID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28Insert_AlbProPrvID = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBPROPRVID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Insert_AlbProCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBPROCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13452AlbProInEx = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPROINEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13437AlbProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPROSTA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13434AlbProHhCt = httpContext.cgiGet( "ALBPROHHCT") ;
            A13440AlbProAnul = httpContext.cgiGet( "ALBPROANUL") ;
            A13441AlbProUltL = (short)(localUtil.ctol( httpContext.cgiGet( "ALBPROULTL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13579AlbProLC1 = httpContext.cgiGet( "ALBPROLC1") ;
            A13580AlbProLC2 = httpContext.cgiGet( "ALBPROLC2") ;
            A13581AlbProLC3 = httpContext.cgiGet( "ALBPROLC3") ;
            A13582AlbProLD1 = httpContext.cgiGet( "ALBPROLD1") ;
            A13583AlbProLD2 = httpContext.cgiGet( "ALBPROLD2") ;
            A13584AlbProLD3 = httpContext.cgiGet( "ALBPROLD3") ;
            A14191AlbProSerA = httpContext.cgiGet( "ALBPROSERA") ;
            A14192AlbProTipA = httpContext.cgiGet( "ALBPROTIPA") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13426AlbProCliN = httpContext.cgiGet( "ALBPROCLIN") ;
            A13420AlbProPrvN = httpContext.cgiGet( "ALBPROPRVN") ;
            n13420AlbProPrvN = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A13454CatDocNom = httpContext.cgiGet( "CATDOCNOM") ;
            n13454CatDocNom = false ;
            A13445AlbProNRef = httpContext.cgiGet( "ALBPRONREF") ;
            n13445AlbProNRef = false ;
            A13446AlbProVRef = httpContext.cgiGet( "ALBPROVREF") ;
            n13446AlbProVRef = false ;
            A13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( "ALBPROPRVP")) ;
            n13852AlbProPrvp = false ;
            A13853AlbProDto = localUtil.ctond( httpContext.cgiGet( "ALBPRODTO")) ;
            n13853AlbProDto = false ;
            A14401AlbProLote = httpContext.cgiGet( "ALBPROLOTE") ;
            n14401AlbProLote = false ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "PRDEXIALM")) ;
            Combo_albproprvid_Objectcall = httpContext.cgiGet( "COMBO_ALBPROPRVID_Objectcall") ;
            Combo_albproprvid_Class = httpContext.cgiGet( "COMBO_ALBPROPRVID_Class") ;
            Combo_albproprvid_Icontype = httpContext.cgiGet( "COMBO_ALBPROPRVID_Icontype") ;
            Combo_albproprvid_Icon = httpContext.cgiGet( "COMBO_ALBPROPRVID_Icon") ;
            Combo_albproprvid_Caption = httpContext.cgiGet( "COMBO_ALBPROPRVID_Caption") ;
            Combo_albproprvid_Tooltip = httpContext.cgiGet( "COMBO_ALBPROPRVID_Tooltip") ;
            Combo_albproprvid_Cls = httpContext.cgiGet( "COMBO_ALBPROPRVID_Cls") ;
            Combo_albproprvid_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBPROPRVID_Selectedvalue_set") ;
            Combo_albproprvid_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBPROPRVID_Selectedvalue_get") ;
            Combo_albproprvid_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBPROPRVID_Selectedtext_set") ;
            Combo_albproprvid_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBPROPRVID_Selectedtext_get") ;
            Combo_albproprvid_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBPROPRVID_Gamoauthtoken") ;
            Combo_albproprvid_Ddointernalname = httpContext.cgiGet( "COMBO_ALBPROPRVID_Ddointernalname") ;
            Combo_albproprvid_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBPROPRVID_Titlecontrolalign") ;
            Combo_albproprvid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBPROPRVID_Dropdownoptionstype") ;
            Combo_albproprvid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Enabled")) ;
            Combo_albproprvid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Visible")) ;
            Combo_albproprvid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBPROPRVID_Titlecontrolidtoreplace") ;
            Combo_albproprvid_Datalisttype = httpContext.cgiGet( "COMBO_ALBPROPRVID_Datalisttype") ;
            Combo_albproprvid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Allowmultipleselection")) ;
            Combo_albproprvid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBPROPRVID_Datalistfixedvalues") ;
            Combo_albproprvid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Isgriditem")) ;
            Combo_albproprvid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Hasdescription")) ;
            Combo_albproprvid_Datalistproc = httpContext.cgiGet( "COMBO_ALBPROPRVID_Datalistproc") ;
            Combo_albproprvid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBPROPRVID_Datalistprocparametersprefix") ;
            Combo_albproprvid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBPROPRVID_Remoteservicesparameters") ;
            Combo_albproprvid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBPROPRVID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albproprvid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Includeonlyselectedoption")) ;
            Combo_albproprvid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Includeselectalloption")) ;
            Combo_albproprvid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Emptyitem")) ;
            Combo_albproprvid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBPROPRVID_Includeaddnewoption")) ;
            Combo_albproprvid_Htmltemplate = httpContext.cgiGet( "COMBO_ALBPROPRVID_Htmltemplate") ;
            Combo_albproprvid_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBPROPRVID_Multiplevaluestype") ;
            Combo_albproprvid_Loadingdata = httpContext.cgiGet( "COMBO_ALBPROPRVID_Loadingdata") ;
            Combo_albproprvid_Noresultsfound = httpContext.cgiGet( "COMBO_ALBPROPRVID_Noresultsfound") ;
            Combo_albproprvid_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBPROPRVID_Emptyitemtext") ;
            Combo_albproprvid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBPROPRVID_Onlyselectedvalues") ;
            Combo_albproprvid_Selectalltext = httpContext.cgiGet( "COMBO_ALBPROPRVID_Selectalltext") ;
            Combo_albproprvid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBPROPRVID_Multiplevaluesseparator") ;
            Combo_albproprvid_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBPROPRVID_Addnewoptiontext") ;
            Combo_trncod_Objectcall = httpContext.cgiGet( "COMBO_TRNCOD_Objectcall") ;
            Combo_trncod_Class = httpContext.cgiGet( "COMBO_TRNCOD_Class") ;
            Combo_trncod_Icontype = httpContext.cgiGet( "COMBO_TRNCOD_Icontype") ;
            Combo_trncod_Icon = httpContext.cgiGet( "COMBO_TRNCOD_Icon") ;
            Combo_trncod_Caption = httpContext.cgiGet( "COMBO_TRNCOD_Caption") ;
            Combo_trncod_Tooltip = httpContext.cgiGet( "COMBO_TRNCOD_Tooltip") ;
            Combo_trncod_Cls = httpContext.cgiGet( "COMBO_TRNCOD_Cls") ;
            Combo_trncod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_set") ;
            Combo_trncod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_get") ;
            Combo_trncod_Selectedtext_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_set") ;
            Combo_trncod_Selectedtext_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_get") ;
            Combo_trncod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TRNCOD_Gamoauthtoken") ;
            Combo_trncod_Ddointernalname = httpContext.cgiGet( "COMBO_TRNCOD_Ddointernalname") ;
            Combo_trncod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolalign") ;
            Combo_trncod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TRNCOD_Dropdownoptionstype") ;
            Combo_trncod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Enabled")) ;
            Combo_trncod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Visible")) ;
            Combo_trncod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolidtoreplace") ;
            Combo_trncod_Datalisttype = httpContext.cgiGet( "COMBO_TRNCOD_Datalisttype") ;
            Combo_trncod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Allowmultipleselection")) ;
            Combo_trncod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Datalistfixedvalues") ;
            Combo_trncod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Isgriditem")) ;
            Combo_trncod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Hasdescription")) ;
            Combo_trncod_Datalistproc = httpContext.cgiGet( "COMBO_TRNCOD_Datalistproc") ;
            Combo_trncod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TRNCOD_Datalistprocparametersprefix") ;
            Combo_trncod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TRNCOD_Remoteservicesparameters") ;
            Combo_trncod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRNCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trncod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeonlyselectedoption")) ;
            Combo_trncod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeselectalloption")) ;
            Combo_trncod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Emptyitem")) ;
            Combo_trncod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeaddnewoption")) ;
            Combo_trncod_Htmltemplate = httpContext.cgiGet( "COMBO_TRNCOD_Htmltemplate") ;
            Combo_trncod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluestype") ;
            Combo_trncod_Loadingdata = httpContext.cgiGet( "COMBO_TRNCOD_Loadingdata") ;
            Combo_trncod_Noresultsfound = httpContext.cgiGet( "COMBO_TRNCOD_Noresultsfound") ;
            Combo_trncod_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCOD_Emptyitemtext") ;
            Combo_trncod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Onlyselectedvalues") ;
            Combo_trncod_Selectalltext = httpContext.cgiGet( "COMBO_TRNCOD_Selectalltext") ;
            Combo_trncod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluesseparator") ;
            Combo_trncod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TRNCOD_Addnewoptiontext") ;
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
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13418AlbProID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            }
            else
            {
               A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbProDate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBPRODATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13430AlbProDate = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
            }
            else
            {
               A13430AlbProDate = localUtil.ctod( httpContext.cgiGet( edtAlbProDate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
            }
            A14399AlbProDtA = localUtil.ctod( httpContext.cgiGet( edtAlbProDtA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProPrvI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProPrvI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROPRVI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProPrvI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13419AlbProPrvI = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
            }
            else
            {
               A13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProPrvI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A13424AlbProMatr = httpContext.cgiGet( edtAlbProMatr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
            A13429AlbProSal = localUtil.ctot( httpContext.cgiGet( edtAlbProSal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A13439AlbProObs = httpContext.cgiGet( edtAlbProObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
            AV22Msg_dev = httpContext.cgiGet( edtavMsg_dev_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_dev", AV22Msg_dev);
            cmbAlbProStAT.setName( cmbAlbProStAT.getInternalname() );
            cmbAlbProStAT.setValue( httpContext.cgiGet( cmbAlbProStAT.getInternalname()) );
            A13438AlbProStAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProStAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
            A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
            cmbAlbProEnvA.setName( cmbAlbProEnvA.getInternalname() );
            cmbAlbProEnvA.setValue( httpContext.cgiGet( cmbAlbProEnvA.getInternalname()) );
            A13435AlbProEnvA = httpContext.cgiGet( cmbAlbProEnvA.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
            A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A14190AlbProATCU = httpContext.cgiGet( edtAlbProATCU_Internalname) ;
            n14190AlbProATCU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14190AlbProATCU", A14190AlbProATCU);
            A14376AlbProFm4d = httpContext.cgiGet( edtAlbProFm4d_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14376AlbProFm4d", A14376AlbProFm4d);
            AV39Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
            AV36ComboAlbProPrvID = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboalbproprvid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36ComboAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ComboAlbProPrvID), 6, 0));
            AV34ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCLIC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCliC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13425AlbProCliC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
            }
            else
            {
               A13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPRODOME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProDomE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13427AlbProDomE = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
            }
            else
            {
               A13427AlbProDomE = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
            }
            A13417AlbProTipo = httpContext.cgiGet( edtAlbProTipo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCatDocID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCatDocID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CATDOCID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCatDocID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13453CatDocID = (short)(0) ;
               n13453CatDocID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
            }
            else
            {
               A13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( edtCatDocID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13453CatDocID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_1_2");
            A13438AlbProStAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProStAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
            forbiddenHiddens.add("AlbProStAT", localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV39Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV39Pgmname, "")));
            forbiddenHiddens.add("AlbProInEx", localUtil.format( DecimalUtil.doubleToDec(A13452AlbProInEx), "9"));
            A13429AlbProSal = localUtil.ctot( httpContext.cgiGet( edtAlbProSal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbProSal", localUtil.format( A13429AlbProSal, "99/99/99 99:99"));
            forbiddenHiddens.add("AlbProSta", localUtil.format( DecimalUtil.doubleToDec(A13437AlbProSta), "9"));
            A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbProSys", localUtil.format( A13431AlbProSys, "99/99/99 99:99"));
            forbiddenHiddens.add("AlbProHh", GXutil.rtrim( localUtil.format( A13433AlbProHh, "")));
            forbiddenHiddens.add("AlbProHhCt", GXutil.rtrim( localUtil.format( A13434AlbProHhCt, "")));
            A13435AlbProEnvA = httpContext.cgiGet( cmbAlbProEnvA.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
            forbiddenHiddens.add("AlbProEnvA", GXutil.rtrim( localUtil.format( A13435AlbProEnvA, "")));
            A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
            forbiddenHiddens.add("AlbProIDAT", GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")));
            forbiddenHiddens.add("AlbProAnul", GXutil.rtrim( localUtil.format( A13440AlbProAnul, "")));
            forbiddenHiddens.add("AlbProUltL", localUtil.format( DecimalUtil.doubleToDec(A13441AlbProUltL), "ZZZ9"));
            forbiddenHiddens.add("AlbProLC1", GXutil.rtrim( localUtil.format( A13579AlbProLC1, "")));
            forbiddenHiddens.add("AlbProLC2", GXutil.rtrim( localUtil.format( A13580AlbProLC2, "")));
            forbiddenHiddens.add("AlbProLC3", GXutil.rtrim( localUtil.format( A13581AlbProLC3, "")));
            forbiddenHiddens.add("AlbProLD1", GXutil.rtrim( localUtil.format( A13582AlbProLD1, "")));
            forbiddenHiddens.add("AlbProLD2", GXutil.rtrim( localUtil.format( A13583AlbProLD2, "")));
            forbiddenHiddens.add("AlbProLD3", GXutil.rtrim( localUtil.format( A13584AlbProLD3, "")));
            A14190AlbProATCU = httpContext.cgiGet( edtAlbProATCU_Internalname) ;
            n14190AlbProATCU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14190AlbProATCU", A14190AlbProATCU);
            forbiddenHiddens.add("AlbProATCU", GXutil.rtrim( localUtil.format( A14190AlbProATCU, "")));
            forbiddenHiddens.add("AlbProSerA", GXutil.rtrim( localUtil.format( A14191AlbProSerA, "")));
            forbiddenHiddens.add("AlbProTipA", GXutil.rtrim( localUtil.format( A14192AlbProTipA, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A13418AlbProID != Z13418AlbProID ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\documentotransporteproveedor_1_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
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
                  sMode1838 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1838 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1838 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UG0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBPROID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProID_Internalname ;
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
                        e111UG2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UG2 ();
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
         e121UG2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UG1838( ) ;
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
         disableAttributes1UG1838( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavMsg_dev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMsg_dev_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbproprvid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbproprvid_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
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

   public void confirm_1UG0( )
   {
      beforeValidate1UG1838( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UG1838( ) ;
         }
         else
         {
            checkExtendedTable1UG1838( ) ;
            closeExtendedTableCursors1UG1838( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1838 = Gx_mode ;
         confirm_1UG1839( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1838 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1838 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1UG1839( )
   {
      nGXsfl_120_idx = 0 ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         readRow1UG1839( ) ;
         if ( ( nRcdExists_1839 != 0 ) || ( nIsMod_1839 != 0 ) )
         {
            getKey1UG1839( ) ;
            if ( ( nRcdExists_1839 == 0 ) && ( nRcdDeleted_1839 == 0 ) )
            {
               if ( RcdFound1839 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UG1839( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UG1839( ) ;
                     closeExtendedTableCursors1UG1839( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALBPROLINE_" + sGXsfl_120_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProLine_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1839 != 0 )
               {
                  if ( nRcdDeleted_1839 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UG1839( ) ;
                     load1UG1839( ) ;
                     beforeValidate1UG1839( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UG1839( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1839 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UG1839( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UG1839( ) ;
                           closeExtendedTableCursors1UG1839( ) ;
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
                  if ( nRcdDeleted_1839 == 0 )
                  {
                     GXCCtl = "ALBPROLINE_" + sGXsfl_120_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProLine_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbProLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtAlbProDsc_Internalname, GXutil.rtrim( A13448AlbProDsc)) ;
         httpContext.changePostValue( edtAlbProCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbProUnd.getInternalname(), GXutil.rtrim( A13444AlbProUnd)) ;
         httpContext.changePostValue( edtAlbProCaja_Internalname, GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProObsL_Internalname, GXutil.rtrim( A13447AlbProObsL)) ;
         httpContext.changePostValue( "ZT_"+"Z13442AlbProLine_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_120_idx, GXutil.rtrim( Z13448AlbProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_120_idx, GXutil.rtrim( Z13444AlbProUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_120_idx, GXutil.rtrim( Z13447AlbProObsL)) ;
         httpContext.changePostValue( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_120_idx, GXutil.rtrim( Z13445AlbProNRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_120_idx, GXutil.rtrim( Z13446AlbProVRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13853AlbProDto_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14401AlbProLote_"+sGXsfl_120_idx, GXutil.rtrim( Z14401AlbProLote)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_120_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1839_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1839_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1839_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1839 != 0 )
         {
            httpContext.changePostValue( "ALBPROLINE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRODSC_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROUND_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCAJA_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROOBSL_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UG0( )
   {
   }

   public void e111UG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransporteproveedor_1_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransporteproveedor_1_2_impl.this.AV8EmprCod = GXv_char2[0] ;
      documentotransporteproveedor_1_2_impl.this.AV9EmprNom = GXv_char3[0] ;
      documentotransporteproveedor_1_2_impl.this.AV10UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXt_int5 = (byte)(AV11FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV11FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11FirmaD), 4, 0));
      GXt_int5 = (byte)(AV12cernum) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CERNUM", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12cernum = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cernum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12cernum), 4, 0));
      GXt_int5 = (byte)(AV13RemTra) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13RemTra = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13RemTra", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RemTra), 4, 0));
      GXt_int5 = (byte)(AV14TraExt) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "EXTTRA", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV14TraExt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14TraExt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14TraExt), 4, 0));
      GXt_int5 = (byte)(AV15Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "WSDT", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Ws), 4, 0));
      GXt_int5 = (byte)(AV16Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Modhh), 4, 0));
      GXt_int5 = (byte)(AV17Ctrlf) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17Ctrlf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Ctrlf), 4, 0));
      GXt_int5 = (byte)(AV18DevCant) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "DEVPRO", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18DevCant = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18DevCant", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18DevCant), 4, 0));
      GXt_int5 = (byte)(AV19Endutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Endutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Endutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Endutex), 4, 0));
      GXt_int5 = (byte)(AV20soloProveedor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ONYPRO", ""), GXv_int6) ;
      documentotransporteproveedor_1_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20soloProveedor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20soloProveedor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20soloProveedor), 4, 0));
      if ( (0==AV13RemTra) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe contador REMTRA, crearlo", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(9);
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
      if ( (0==AV14TraExt) && ( AV19Endutex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe contador EXTTRA (mercado externo), crearlo", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(9);
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
      AV21Msg_errAT = ((AV12cernum==1) ? httpContext.getMessage( "NO se puede eliminar. Esta activo contador CERNUM", "") : httpContext.getMessage( "NO se puede eliminar. Esta activo FIRMA DIGITAL", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Msg_errAT", AV21Msg_errAT);
      AV22Msg_dev = ((AV18DevCant==0) ? " " : httpContext.getMessage( "Atencion esta activo contador DEVPRO, se genera movimientos de devolucion en Cuenta Corriente", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Msg_dev", AV22Msg_dev);
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentotransporteproveedor_1_2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV8EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char2[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      documentotransporteproveedor_1_2_impl.this.AV8EmprCod = GXv_char4[0] ;
      documentotransporteproveedor_1_2_impl.this.AV9EmprNom = GXv_char3[0] ;
      documentotransporteproveedor_1_2_impl.this.AV10UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_SdtWWPContext7[0] = AV24WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV24WWPContext = GXv_SdtWWPContext7[0] ;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV34ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtAlbProPrvI_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Visible), 5, 0), true);
      AV36ComboAlbProPrvID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ComboAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ComboAlbProPrvID), 6, 0));
      edtavComboalbproprvid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbproprvid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbproprvid_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOALBPROPRVID' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(9);
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
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(9);
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
      AV25TrnContext.fromxml(AV26WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV25TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV39Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV40GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GXV1), 8, 0));
         while ( AV40GXV1 <= AV25TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV31TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV25TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV40GXV1));
            if ( GXutil.strcmp(AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CatDocID") == 0 )
            {
               AV27Insert_CatDocID = (short)(GXutil.lval( AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Insert_CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Insert_CatDocID), 4, 0));
            }
            else if ( GXutil.strcmp(AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbProPrvID") == 0 )
            {
               AV28Insert_AlbProPrvID = (int)(GXutil.lval( AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28Insert_AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Insert_AlbProPrvID), 6, 0));
               if ( ! (0==AV28Insert_AlbProPrvID) )
               {
                  AV36ComboAlbProPrvID = AV28Insert_AlbProPrvID ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV36ComboAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ComboAlbProPrvID), 6, 0));
                  Combo_albproprvid_Selectedvalue_set = GXutil.trim( GXutil.str( AV36ComboAlbProPrvID, 6, 0)) ;
                  ucCombo_albproprvid.sendProperty(context, "", false, Combo_albproprvid_Internalname, "SelectedValue_set", Combo_albproprvid_Selectedvalue_set);
                  Combo_albproprvid_Enabled = false ;
                  ucCombo_albproprvid.sendProperty(context, "", false, Combo_albproprvid_Internalname, "Enabled", GXutil.booltostr( Combo_albproprvid_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbProCliCod") == 0 )
            {
               AV29Insert_AlbProCliCod = (int)(GXutil.lval( AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29Insert_AlbProCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Insert_AlbProCliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV30Insert_TrnCod = (short)(GXutil.lval( AV31TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Insert_TrnCod), 4, 0));
               if ( ! (0==AV30Insert_TrnCod) )
               {
                  AV34ComboTrnCod = AV30Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV34ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            AV40GXV1 = (int)(AV40GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GXV1), 8, 0));
         }
      }
      edtAlbProCliC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Visible), 5, 0), true);
      edtAlbProDomE_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDomE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDomE_Visible), 5, 0), true);
      edtAlbProTipo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProTipo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProTipo_Visible), 5, 0), true);
      edtCatDocID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Visible), 5, 0), true);
   }

   public void e121UG2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
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

   public void S122( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV32TrnCod_Data ;
      GXv_char4[0] = AV33ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.stocksquimicos.documentotransporteproveedor_1_2loaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV8EmprCod, AV23AlbProID, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      documentotransporteproveedor_1_2_impl.this.AV33ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV32TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_trncod_Selectedvalue_set = AV33ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV34ComboTrnCod = (short)(GXutil.lval( AV33ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOALBPROPRVID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV35AlbProPrvID_Data ;
      GXv_char4[0] = AV33ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.stocksquimicos.documentotransporteproveedor_1_2loaddvcombo(remoteHandle, context).execute( "AlbProPrvID", Gx_mode, AV8EmprCod, AV23AlbProID, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      documentotransporteproveedor_1_2_impl.this.AV33ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV35AlbProPrvID_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_albproprvid_Selectedvalue_set = AV33ComboSelectedValue ;
      ucCombo_albproprvid.sendProperty(context, "", false, Combo_albproprvid_Internalname, "SelectedValue_set", Combo_albproprvid_Selectedvalue_set);
      AV36ComboAlbProPrvID = (int)(GXutil.lval( AV33ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ComboAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ComboAlbProPrvID), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albproprvid_Enabled = false ;
         ucCombo_albproprvid.sendProperty(context, "", false, Combo_albproprvid_Internalname, "Enabled", GXutil.booltostr( Combo_albproprvid_Enabled));
      }
   }

   public void zm1UG1838( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13452AlbProInEx = T01UG6_A13452AlbProInEx[0] ;
            Z13417AlbProTipo = T01UG6_A13417AlbProTipo[0] ;
            Z13430AlbProDate = T01UG6_A13430AlbProDate[0] ;
            Z13429AlbProSal = T01UG6_A13429AlbProSal[0] ;
            Z13427AlbProDomE = T01UG6_A13427AlbProDomE[0] ;
            Z13424AlbProMatr = T01UG6_A13424AlbProMatr[0] ;
            Z13439AlbProObs = T01UG6_A13439AlbProObs[0] ;
            Z13437AlbProSta = T01UG6_A13437AlbProSta[0] ;
            Z13431AlbProSys = T01UG6_A13431AlbProSys[0] ;
            Z13433AlbProHh = T01UG6_A13433AlbProHh[0] ;
            Z13434AlbProHhCt = T01UG6_A13434AlbProHhCt[0] ;
            Z13435AlbProEnvA = T01UG6_A13435AlbProEnvA[0] ;
            Z13436AlbProIDAT = T01UG6_A13436AlbProIDAT[0] ;
            Z13438AlbProStAT = T01UG6_A13438AlbProStAT[0] ;
            Z13440AlbProAnul = T01UG6_A13440AlbProAnul[0] ;
            Z13441AlbProUltL = T01UG6_A13441AlbProUltL[0] ;
            Z13579AlbProLC1 = T01UG6_A13579AlbProLC1[0] ;
            Z13580AlbProLC2 = T01UG6_A13580AlbProLC2[0] ;
            Z13581AlbProLC3 = T01UG6_A13581AlbProLC3[0] ;
            Z13582AlbProLD1 = T01UG6_A13582AlbProLD1[0] ;
            Z13583AlbProLD2 = T01UG6_A13583AlbProLD2[0] ;
            Z13584AlbProLD3 = T01UG6_A13584AlbProLD3[0] ;
            Z14190AlbProATCU = T01UG6_A14190AlbProATCU[0] ;
            Z14191AlbProSerA = T01UG6_A14191AlbProSerA[0] ;
            Z14192AlbProTipA = T01UG6_A14192AlbProTipA[0] ;
            Z13425AlbProCliC = T01UG6_A13425AlbProCliC[0] ;
            Z13419AlbProPrvI = T01UG6_A13419AlbProPrvI[0] ;
            Z840TrnCod = T01UG6_A840TrnCod[0] ;
            Z13453CatDocID = T01UG6_A13453CatDocID[0] ;
         }
         else
         {
            Z13452AlbProInEx = A13452AlbProInEx ;
            Z13417AlbProTipo = A13417AlbProTipo ;
            Z13430AlbProDate = A13430AlbProDate ;
            Z13429AlbProSal = A13429AlbProSal ;
            Z13427AlbProDomE = A13427AlbProDomE ;
            Z13424AlbProMatr = A13424AlbProMatr ;
            Z13439AlbProObs = A13439AlbProObs ;
            Z13437AlbProSta = A13437AlbProSta ;
            Z13431AlbProSys = A13431AlbProSys ;
            Z13433AlbProHh = A13433AlbProHh ;
            Z13434AlbProHhCt = A13434AlbProHhCt ;
            Z13435AlbProEnvA = A13435AlbProEnvA ;
            Z13436AlbProIDAT = A13436AlbProIDAT ;
            Z13438AlbProStAT = A13438AlbProStAT ;
            Z13440AlbProAnul = A13440AlbProAnul ;
            Z13441AlbProUltL = A13441AlbProUltL ;
            Z13579AlbProLC1 = A13579AlbProLC1 ;
            Z13580AlbProLC2 = A13580AlbProLC2 ;
            Z13581AlbProLC3 = A13581AlbProLC3 ;
            Z13582AlbProLD1 = A13582AlbProLD1 ;
            Z13583AlbProLD2 = A13583AlbProLD2 ;
            Z13584AlbProLD3 = A13584AlbProLD3 ;
            Z14190AlbProATCU = A14190AlbProATCU ;
            Z14191AlbProSerA = A14191AlbProSerA ;
            Z14192AlbProTipA = A14192AlbProTipA ;
            Z13425AlbProCliC = A13425AlbProCliC ;
            Z13419AlbProPrvI = A13419AlbProPrvI ;
            Z840TrnCod = A840TrnCod ;
            Z13453CatDocID = A13453CatDocID ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z13418AlbProID = A13418AlbProID ;
         Z13452AlbProInEx = A13452AlbProInEx ;
         Z13417AlbProTipo = A13417AlbProTipo ;
         Z13430AlbProDate = A13430AlbProDate ;
         Z13429AlbProSal = A13429AlbProSal ;
         Z13427AlbProDomE = A13427AlbProDomE ;
         Z13424AlbProMatr = A13424AlbProMatr ;
         Z13439AlbProObs = A13439AlbProObs ;
         Z13437AlbProSta = A13437AlbProSta ;
         Z13431AlbProSys = A13431AlbProSys ;
         Z13433AlbProHh = A13433AlbProHh ;
         Z13434AlbProHhCt = A13434AlbProHhCt ;
         Z13435AlbProEnvA = A13435AlbProEnvA ;
         Z13436AlbProIDAT = A13436AlbProIDAT ;
         Z13438AlbProStAT = A13438AlbProStAT ;
         Z13440AlbProAnul = A13440AlbProAnul ;
         Z13441AlbProUltL = A13441AlbProUltL ;
         Z13579AlbProLC1 = A13579AlbProLC1 ;
         Z13580AlbProLC2 = A13580AlbProLC2 ;
         Z13581AlbProLC3 = A13581AlbProLC3 ;
         Z13582AlbProLD1 = A13582AlbProLD1 ;
         Z13583AlbProLD2 = A13583AlbProLD2 ;
         Z13584AlbProLD3 = A13584AlbProLD3 ;
         Z14190AlbProATCU = A14190AlbProATCU ;
         Z14191AlbProSerA = A14191AlbProSerA ;
         Z14192AlbProTipA = A14192AlbProTipA ;
         Z396EmprCod = A396EmprCod ;
         Z13425AlbProCliC = A13425AlbProCliC ;
         Z13419AlbProPrvI = A13419AlbProPrvI ;
         Z840TrnCod = A840TrnCod ;
         Z13453CatDocID = A13453CatDocID ;
         Z407EmprNom = A407EmprNom ;
         Z13454CatDocNom = A13454CatDocNom ;
         Z13420AlbProPrvN = A13420AlbProPrvN ;
         Z13426AlbProCliN = A13426AlbProCliN ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbAlbProStAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProStAT.getEnabled(), 5, 0), true);
      edtAlbProIDAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Enabled), 5, 0), true);
      cmbAlbProEnvA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEnvA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEnvA.getEnabled(), 5, 0), true);
      edtAlbProSys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Enabled), 5, 0), true);
      edtAlbProATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProATCU_Enabled), 5, 0), true);
      edtAlbProSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSal_Enabled), 5, 0), true);
      edtAlbProDtA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDtA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDtA_Enabled), 5, 0), true);
      AV39Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_1_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
      cmbAlbProStAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProStAT.getEnabled(), 5, 0), true);
      edtAlbProIDAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Enabled), 5, 0), true);
      cmbAlbProEnvA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEnvA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEnvA.getEnabled(), 5, 0), true);
      edtAlbProSys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Enabled), 5, 0), true);
      edtAlbProATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProATCU_Enabled), 5, 0), true);
      edtAlbProSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSal_Enabled), 5, 0), true);
      edtAlbProDtA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDtA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDtA_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         A396EmprCod = AV8EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UG7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UG7_A407EmprNom[0] ;
      n407EmprNom = T01UG7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV23AlbProID) )
      {
         A13418AlbProID = AV23AlbProID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
      if ( ! (0==AV23AlbProID) )
      {
         edtAlbProID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      }
      if ( ! (0==AV23AlbProID) )
      {
         edtAlbProID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_CatDocID) )
      {
         edtCatDocID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Enabled), 5, 0), true);
      }
      else
      {
         edtCatDocID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV28Insert_AlbProPrvID) )
      {
         edtAlbProPrvI_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProPrvI_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV29Insert_AlbProCliCod) )
      {
         edtAlbProCliC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProCliC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV30Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV29Insert_AlbProCliCod) )
      {
         A13425AlbProCliC = AV29Insert_AlbProCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_CatDocID) )
      {
         A13453CatDocID = AV27Insert_CatDocID ;
         n13453CatDocID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV28Insert_AlbProPrvID) )
      {
         A13419AlbProPrvI = AV28Insert_AlbProPrvID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
      }
      else
      {
         A13419AlbProPrvI = AV36ComboAlbProPrvID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV30Insert_TrnCod) )
      {
         A840TrnCod = AV30Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV34ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV34ComboTrnCod) )
            {
               A840TrnCod = AV34ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_date10 = A14399AlbProDtA ;
         GXv_date11[0] = GXt_date10 ;
         new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_date11) ;
         documentotransporteproveedor_1_2_impl.this.GXt_date10 = GXv_date11[0] ;
         A14399AlbProDtA = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
         /* Using cursor T01UG8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
         A13426AlbProCliN = T01UG8_A13426AlbProCliN[0] ;
         pr_default.close(6);
         /* Using cursor T01UG11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
         A13454CatDocNom = T01UG11_A13454CatDocNom[0] ;
         n13454CatDocNom = T01UG11_n13454CatDocNom[0] ;
         pr_default.close(9);
         /* Using cursor T01UG9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
         A13420AlbProPrvN = T01UG9_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = T01UG9_n13420AlbProPrvN[0] ;
         pr_default.close(7);
         /* Using cursor T01UG10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01UG10_A841TrnNom[0] ;
         n841TrnNom = T01UG10_n841TrnNom[0] ;
         pr_default.close(8);
      }
   }

   public void load1UG1838( )
   {
      /* Using cursor T01UG12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1838 = (short)(1) ;
         A407EmprNom = T01UG12_A407EmprNom[0] ;
         n407EmprNom = T01UG12_n407EmprNom[0] ;
         A13452AlbProInEx = T01UG12_A13452AlbProInEx[0] ;
         A13417AlbProTipo = T01UG12_A13417AlbProTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         A13430AlbProDate = T01UG12_A13430AlbProDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         A13429AlbProSal = T01UG12_A13429AlbProSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13454CatDocNom = T01UG12_A13454CatDocNom[0] ;
         n13454CatDocNom = T01UG12_n13454CatDocNom[0] ;
         A13420AlbProPrvN = T01UG12_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = T01UG12_n13420AlbProPrvN[0] ;
         A13426AlbProCliN = T01UG12_A13426AlbProCliN[0] ;
         A13427AlbProDomE = T01UG12_A13427AlbProDomE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         A841TrnNom = T01UG12_A841TrnNom[0] ;
         n841TrnNom = T01UG12_n841TrnNom[0] ;
         A13424AlbProMatr = T01UG12_A13424AlbProMatr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
         A13439AlbProObs = T01UG12_A13439AlbProObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
         A13437AlbProSta = T01UG12_A13437AlbProSta[0] ;
         A13431AlbProSys = T01UG12_A13431AlbProSys[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13433AlbProHh = T01UG12_A13433AlbProHh[0] ;
         A13434AlbProHhCt = T01UG12_A13434AlbProHhCt[0] ;
         A13435AlbProEnvA = T01UG12_A13435AlbProEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
         A13436AlbProIDAT = T01UG12_A13436AlbProIDAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
         A13438AlbProStAT = T01UG12_A13438AlbProStAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
         A13440AlbProAnul = T01UG12_A13440AlbProAnul[0] ;
         A13441AlbProUltL = T01UG12_A13441AlbProUltL[0] ;
         A13579AlbProLC1 = T01UG12_A13579AlbProLC1[0] ;
         A13580AlbProLC2 = T01UG12_A13580AlbProLC2[0] ;
         A13581AlbProLC3 = T01UG12_A13581AlbProLC3[0] ;
         A13582AlbProLD1 = T01UG12_A13582AlbProLD1[0] ;
         A13583AlbProLD2 = T01UG12_A13583AlbProLD2[0] ;
         A13584AlbProLD3 = T01UG12_A13584AlbProLD3[0] ;
         A14190AlbProATCU = T01UG12_A14190AlbProATCU[0] ;
         n14190AlbProATCU = T01UG12_n14190AlbProATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14190AlbProATCU", A14190AlbProATCU);
         A14191AlbProSerA = T01UG12_A14191AlbProSerA[0] ;
         n14191AlbProSerA = T01UG12_n14191AlbProSerA[0] ;
         A14192AlbProTipA = T01UG12_A14192AlbProTipA[0] ;
         n14192AlbProTipA = T01UG12_n14192AlbProTipA[0] ;
         A13425AlbProCliC = T01UG12_A13425AlbProCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         A13419AlbProPrvI = T01UG12_A13419AlbProPrvI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         A840TrnCod = T01UG12_A840TrnCod[0] ;
         n840TrnCod = T01UG12_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A13453CatDocID = T01UG12_A13453CatDocID[0] ;
         n13453CatDocID = T01UG12_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         zm1UG1838( -29) ;
      }
      pr_default.close(10);
      onLoadActions1UG1838( ) ;
   }

   public void onLoadActions1UG1838( )
   {
      A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14376AlbProFm4d", A14376AlbProFm4d);
      GXt_date10 = A14399AlbProDtA ;
      GXv_date11[0] = GXt_date10 ;
      new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_date11) ;
      documentotransporteproveedor_1_2_impl.this.GXt_date10 = GXv_date11[0] ;
      A14399AlbProDtA = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
   }

   public void checkExtendedTable1UG1838( )
   {
      nIsDirty_1838 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1838 = (short)(1) ;
      A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14376AlbProFm4d", A14376AlbProFm4d);
      /* Using cursor T01UG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Cliente", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13426AlbProCliN = T01UG8_A13426AlbProCliN[0] ;
      pr_default.close(6);
      /* Using cursor T01UG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13420AlbProPrvN = T01UG9_A13420AlbProPrvN[0] ;
      n13420AlbProPrvN = T01UG9_n13420AlbProPrvN[0] ;
      pr_default.close(7);
      /* Using cursor T01UG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01UG10_A841TrnNom[0] ;
      n841TrnNom = T01UG10_n841TrnNom[0] ;
      pr_default.close(8);
      /* Using cursor T01UG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13453CatDocID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Categorias Documento Transporte", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDocID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A13454CatDocNom = T01UG11_A13454CatDocNom[0] ;
      n13454CatDocNom = T01UG11_n13454CatDocNom[0] ;
      pr_default.close(9);
      nIsDirty_1838 = (short)(1) ;
      GXt_date10 = A14399AlbProDtA ;
      GXv_date11[0] = GXt_date10 ;
      new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_date11) ;
      documentotransporteproveedor_1_2_impl.this.GXt_date10 = GXv_date11[0] ;
      A14399AlbProDtA = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
   }

   public void closeExtendedTableCursors1UG1838( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_31( String A396EmprCod ,
                          int A13425AlbProCliC )
   {
      /* Using cursor T01UG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Cliente", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13426AlbProCliN = T01UG13_A13426AlbProCliN[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13426AlbProCliN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_32( String A396EmprCod ,
                          int A13419AlbProPrvI )
   {
      /* Using cursor T01UG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13420AlbProPrvN = T01UG14_A13420AlbProPrvN[0] ;
      n13420AlbProPrvN = T01UG14_n13420AlbProPrvN[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13420AlbProPrvN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_33( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01UG15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01UG15_A841TrnNom[0] ;
      n841TrnNom = T01UG15_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_34( String A396EmprCod ,
                          short A13453CatDocID )
   {
      /* Using cursor T01UG16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13453CatDocID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Categorias Documento Transporte", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDocID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A13454CatDocNom = T01UG16_A13454CatDocNom[0] ;
      n13454CatDocNom = T01UG16_n13454CatDocNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13454CatDocNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1UG1838( )
   {
      /* Using cursor T01UG17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1838 = (short)(1) ;
      }
      else
      {
         RcdFound1838 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1UG1838( 29) ;
         RcdFound1838 = (short)(1) ;
         A13418AlbProID = T01UG6_A13418AlbProID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A13452AlbProInEx = T01UG6_A13452AlbProInEx[0] ;
         A13417AlbProTipo = T01UG6_A13417AlbProTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         A13430AlbProDate = T01UG6_A13430AlbProDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         A13429AlbProSal = T01UG6_A13429AlbProSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13427AlbProDomE = T01UG6_A13427AlbProDomE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         A13424AlbProMatr = T01UG6_A13424AlbProMatr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
         A13439AlbProObs = T01UG6_A13439AlbProObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
         A13437AlbProSta = T01UG6_A13437AlbProSta[0] ;
         A13431AlbProSys = T01UG6_A13431AlbProSys[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13433AlbProHh = T01UG6_A13433AlbProHh[0] ;
         A13434AlbProHhCt = T01UG6_A13434AlbProHhCt[0] ;
         A13435AlbProEnvA = T01UG6_A13435AlbProEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
         A13436AlbProIDAT = T01UG6_A13436AlbProIDAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
         A13438AlbProStAT = T01UG6_A13438AlbProStAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
         A13440AlbProAnul = T01UG6_A13440AlbProAnul[0] ;
         A13441AlbProUltL = T01UG6_A13441AlbProUltL[0] ;
         A13579AlbProLC1 = T01UG6_A13579AlbProLC1[0] ;
         A13580AlbProLC2 = T01UG6_A13580AlbProLC2[0] ;
         A13581AlbProLC3 = T01UG6_A13581AlbProLC3[0] ;
         A13582AlbProLD1 = T01UG6_A13582AlbProLD1[0] ;
         A13583AlbProLD2 = T01UG6_A13583AlbProLD2[0] ;
         A13584AlbProLD3 = T01UG6_A13584AlbProLD3[0] ;
         A14190AlbProATCU = T01UG6_A14190AlbProATCU[0] ;
         n14190AlbProATCU = T01UG6_n14190AlbProATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14190AlbProATCU", A14190AlbProATCU);
         A14191AlbProSerA = T01UG6_A14191AlbProSerA[0] ;
         n14191AlbProSerA = T01UG6_n14191AlbProSerA[0] ;
         A14192AlbProTipA = T01UG6_A14192AlbProTipA[0] ;
         n14192AlbProTipA = T01UG6_n14192AlbProTipA[0] ;
         A396EmprCod = T01UG6_A396EmprCod[0] ;
         A13425AlbProCliC = T01UG6_A13425AlbProCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         A13419AlbProPrvI = T01UG6_A13419AlbProPrvI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         A840TrnCod = T01UG6_A840TrnCod[0] ;
         n840TrnCod = T01UG6_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A13453CatDocID = T01UG6_A13453CatDocID[0] ;
         n13453CatDocID = T01UG6_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13418AlbProID = A13418AlbProID ;
         sMode1838 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UG1838( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1838 = (short)(0) ;
            initializeNonKey1UG1838( ) ;
         }
         Gx_mode = sMode1838 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1838 = (short)(0) ;
         initializeNonKey1UG1838( ) ;
         sMode1838 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1838 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1UG1838( ) ;
      if ( RcdFound1838 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1838 = (short)(0) ;
      /* Using cursor T01UG18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01UG18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UG18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UG18_A13418AlbProID[0] < A13418AlbProID ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01UG18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UG18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UG18_A13418AlbProID[0] > A13418AlbProID ) ) )
         {
            A396EmprCod = T01UG18_A396EmprCod[0] ;
            A13418AlbProID = T01UG18_A13418AlbProID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            RcdFound1838 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound1838 = (short)(0) ;
      /* Using cursor T01UG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01UG19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UG19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UG19_A13418AlbProID[0] > A13418AlbProID ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01UG19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UG19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UG19_A13418AlbProID[0] < A13418AlbProID ) ) )
         {
            A396EmprCod = T01UG19_A396EmprCod[0] ;
            A13418AlbProID = T01UG19_A13418AlbProID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            RcdFound1838 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UG1838( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UG1838( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1838 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A13418AlbProID = Z13418AlbProID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBPROID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UG1838( ) ;
               GX_FocusControl = edtAlbProID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbProID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UG1838( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBPROID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlbProID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UG1838( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13418AlbProID = Z13418AlbProID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBPROID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UG1838( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UG5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( Z13452AlbProInEx != T01UG5_A13452AlbProInEx[0] ) || ( GXutil.strcmp(Z13417AlbProTipo, T01UG5_A13417AlbProTipo[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13430AlbProDate), GXutil.resetTime(T01UG5_A13430AlbProDate[0])) ) || !( GXutil.dateCompare(Z13429AlbProSal, T01UG5_A13429AlbProSal[0]) ) || ( Z13427AlbProDomE != T01UG5_A13427AlbProDomE[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13424AlbProMatr, T01UG5_A13424AlbProMatr[0]) != 0 ) || ( GXutil.strcmp(Z13439AlbProObs, T01UG5_A13439AlbProObs[0]) != 0 ) || ( Z13437AlbProSta != T01UG5_A13437AlbProSta[0] ) || !( GXutil.dateCompare(Z13431AlbProSys, T01UG5_A13431AlbProSys[0]) ) || ( GXutil.strcmp(Z13433AlbProHh, T01UG5_A13433AlbProHh[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13434AlbProHhCt, T01UG5_A13434AlbProHhCt[0]) != 0 ) || ( GXutil.strcmp(Z13435AlbProEnvA, T01UG5_A13435AlbProEnvA[0]) != 0 ) || ( GXutil.strcmp(Z13436AlbProIDAT, T01UG5_A13436AlbProIDAT[0]) != 0 ) || ( Z13438AlbProStAT != T01UG5_A13438AlbProStAT[0] ) || ( GXutil.strcmp(Z13440AlbProAnul, T01UG5_A13440AlbProAnul[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13441AlbProUltL != T01UG5_A13441AlbProUltL[0] ) || ( GXutil.strcmp(Z13579AlbProLC1, T01UG5_A13579AlbProLC1[0]) != 0 ) || ( GXutil.strcmp(Z13580AlbProLC2, T01UG5_A13580AlbProLC2[0]) != 0 ) || ( GXutil.strcmp(Z13581AlbProLC3, T01UG5_A13581AlbProLC3[0]) != 0 ) || ( GXutil.strcmp(Z13582AlbProLD1, T01UG5_A13582AlbProLD1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13583AlbProLD2, T01UG5_A13583AlbProLD2[0]) != 0 ) || ( GXutil.strcmp(Z13584AlbProLD3, T01UG5_A13584AlbProLD3[0]) != 0 ) || ( GXutil.strcmp(Z14190AlbProATCU, T01UG5_A14190AlbProATCU[0]) != 0 ) || ( GXutil.strcmp(Z14191AlbProSerA, T01UG5_A14191AlbProSerA[0]) != 0 ) || ( GXutil.strcmp(Z14192AlbProTipA, T01UG5_A14192AlbProTipA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13425AlbProCliC != T01UG5_A13425AlbProCliC[0] ) || ( Z13419AlbProPrvI != T01UG5_A13419AlbProPrvI[0] ) || ( Z840TrnCod != T01UG5_A840TrnCod[0] ) || ( Z13453CatDocID != T01UG5_A13453CatDocID[0] ) )
         {
            if ( Z13452AlbProInEx != T01UG5_A13452AlbProInEx[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProInEx");
               GXutil.writeLogRaw("Old: ",Z13452AlbProInEx);
               GXutil.writeLogRaw("Current: ",T01UG5_A13452AlbProInEx[0]);
            }
            if ( GXutil.strcmp(Z13417AlbProTipo, T01UG5_A13417AlbProTipo[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProTipo");
               GXutil.writeLogRaw("Old: ",Z13417AlbProTipo);
               GXutil.writeLogRaw("Current: ",T01UG5_A13417AlbProTipo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13430AlbProDate), GXutil.resetTime(T01UG5_A13430AlbProDate[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProDate");
               GXutil.writeLogRaw("Old: ",Z13430AlbProDate);
               GXutil.writeLogRaw("Current: ",T01UG5_A13430AlbProDate[0]);
            }
            if ( !( GXutil.dateCompare(Z13429AlbProSal, T01UG5_A13429AlbProSal[0]) ) )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProSal");
               GXutil.writeLogRaw("Old: ",Z13429AlbProSal);
               GXutil.writeLogRaw("Current: ",T01UG5_A13429AlbProSal[0]);
            }
            if ( Z13427AlbProDomE != T01UG5_A13427AlbProDomE[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProDomE");
               GXutil.writeLogRaw("Old: ",Z13427AlbProDomE);
               GXutil.writeLogRaw("Current: ",T01UG5_A13427AlbProDomE[0]);
            }
            if ( GXutil.strcmp(Z13424AlbProMatr, T01UG5_A13424AlbProMatr[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProMatr");
               GXutil.writeLogRaw("Old: ",Z13424AlbProMatr);
               GXutil.writeLogRaw("Current: ",T01UG5_A13424AlbProMatr[0]);
            }
            if ( GXutil.strcmp(Z13439AlbProObs, T01UG5_A13439AlbProObs[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProObs");
               GXutil.writeLogRaw("Old: ",Z13439AlbProObs);
               GXutil.writeLogRaw("Current: ",T01UG5_A13439AlbProObs[0]);
            }
            if ( Z13437AlbProSta != T01UG5_A13437AlbProSta[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProSta");
               GXutil.writeLogRaw("Old: ",Z13437AlbProSta);
               GXutil.writeLogRaw("Current: ",T01UG5_A13437AlbProSta[0]);
            }
            if ( !( GXutil.dateCompare(Z13431AlbProSys, T01UG5_A13431AlbProSys[0]) ) )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProSys");
               GXutil.writeLogRaw("Old: ",Z13431AlbProSys);
               GXutil.writeLogRaw("Current: ",T01UG5_A13431AlbProSys[0]);
            }
            if ( GXutil.strcmp(Z13433AlbProHh, T01UG5_A13433AlbProHh[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProHh");
               GXutil.writeLogRaw("Old: ",Z13433AlbProHh);
               GXutil.writeLogRaw("Current: ",T01UG5_A13433AlbProHh[0]);
            }
            if ( GXutil.strcmp(Z13434AlbProHhCt, T01UG5_A13434AlbProHhCt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProHhCt");
               GXutil.writeLogRaw("Old: ",Z13434AlbProHhCt);
               GXutil.writeLogRaw("Current: ",T01UG5_A13434AlbProHhCt[0]);
            }
            if ( GXutil.strcmp(Z13435AlbProEnvA, T01UG5_A13435AlbProEnvA[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProEnvA");
               GXutil.writeLogRaw("Old: ",Z13435AlbProEnvA);
               GXutil.writeLogRaw("Current: ",T01UG5_A13435AlbProEnvA[0]);
            }
            if ( GXutil.strcmp(Z13436AlbProIDAT, T01UG5_A13436AlbProIDAT[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProIDAT");
               GXutil.writeLogRaw("Old: ",Z13436AlbProIDAT);
               GXutil.writeLogRaw("Current: ",T01UG5_A13436AlbProIDAT[0]);
            }
            if ( Z13438AlbProStAT != T01UG5_A13438AlbProStAT[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProStAT");
               GXutil.writeLogRaw("Old: ",Z13438AlbProStAT);
               GXutil.writeLogRaw("Current: ",T01UG5_A13438AlbProStAT[0]);
            }
            if ( GXutil.strcmp(Z13440AlbProAnul, T01UG5_A13440AlbProAnul[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProAnul");
               GXutil.writeLogRaw("Old: ",Z13440AlbProAnul);
               GXutil.writeLogRaw("Current: ",T01UG5_A13440AlbProAnul[0]);
            }
            if ( Z13441AlbProUltL != T01UG5_A13441AlbProUltL[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProUltL");
               GXutil.writeLogRaw("Old: ",Z13441AlbProUltL);
               GXutil.writeLogRaw("Current: ",T01UG5_A13441AlbProUltL[0]);
            }
            if ( GXutil.strcmp(Z13579AlbProLC1, T01UG5_A13579AlbProLC1[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLC1");
               GXutil.writeLogRaw("Old: ",Z13579AlbProLC1);
               GXutil.writeLogRaw("Current: ",T01UG5_A13579AlbProLC1[0]);
            }
            if ( GXutil.strcmp(Z13580AlbProLC2, T01UG5_A13580AlbProLC2[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLC2");
               GXutil.writeLogRaw("Old: ",Z13580AlbProLC2);
               GXutil.writeLogRaw("Current: ",T01UG5_A13580AlbProLC2[0]);
            }
            if ( GXutil.strcmp(Z13581AlbProLC3, T01UG5_A13581AlbProLC3[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLC3");
               GXutil.writeLogRaw("Old: ",Z13581AlbProLC3);
               GXutil.writeLogRaw("Current: ",T01UG5_A13581AlbProLC3[0]);
            }
            if ( GXutil.strcmp(Z13582AlbProLD1, T01UG5_A13582AlbProLD1[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLD1");
               GXutil.writeLogRaw("Old: ",Z13582AlbProLD1);
               GXutil.writeLogRaw("Current: ",T01UG5_A13582AlbProLD1[0]);
            }
            if ( GXutil.strcmp(Z13583AlbProLD2, T01UG5_A13583AlbProLD2[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLD2");
               GXutil.writeLogRaw("Old: ",Z13583AlbProLD2);
               GXutil.writeLogRaw("Current: ",T01UG5_A13583AlbProLD2[0]);
            }
            if ( GXutil.strcmp(Z13584AlbProLD3, T01UG5_A13584AlbProLD3[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLD3");
               GXutil.writeLogRaw("Old: ",Z13584AlbProLD3);
               GXutil.writeLogRaw("Current: ",T01UG5_A13584AlbProLD3[0]);
            }
            if ( GXutil.strcmp(Z14190AlbProATCU, T01UG5_A14190AlbProATCU[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProATCU");
               GXutil.writeLogRaw("Old: ",Z14190AlbProATCU);
               GXutil.writeLogRaw("Current: ",T01UG5_A14190AlbProATCU[0]);
            }
            if ( GXutil.strcmp(Z14191AlbProSerA, T01UG5_A14191AlbProSerA[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProSerA");
               GXutil.writeLogRaw("Old: ",Z14191AlbProSerA);
               GXutil.writeLogRaw("Current: ",T01UG5_A14191AlbProSerA[0]);
            }
            if ( GXutil.strcmp(Z14192AlbProTipA, T01UG5_A14192AlbProTipA[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProTipA");
               GXutil.writeLogRaw("Old: ",Z14192AlbProTipA);
               GXutil.writeLogRaw("Current: ",T01UG5_A14192AlbProTipA[0]);
            }
            if ( Z13425AlbProCliC != T01UG5_A13425AlbProCliC[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProCliC");
               GXutil.writeLogRaw("Old: ",Z13425AlbProCliC);
               GXutil.writeLogRaw("Current: ",T01UG5_A13425AlbProCliC[0]);
            }
            if ( Z13419AlbProPrvI != T01UG5_A13419AlbProPrvI[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProPrvI");
               GXutil.writeLogRaw("Old: ",Z13419AlbProPrvI);
               GXutil.writeLogRaw("Current: ",T01UG5_A13419AlbProPrvI[0]);
            }
            if ( Z840TrnCod != T01UG5_A840TrnCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01UG5_A840TrnCod[0]);
            }
            if ( Z13453CatDocID != T01UG5_A13453CatDocID[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"CatDocID");
               GXutil.writeLogRaw("Old: ",Z13453CatDocID);
               GXutil.writeLogRaw("Current: ",T01UG5_A13453CatDocID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UG1838( )
   {
      beforeValidate1UG1838( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UG1838( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UG1838( 0) ;
         checkOptimisticConcurrency1UG1838( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UG1838( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UG1838( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UG20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A13418AlbProID), Byte.valueOf(A13452AlbProInEx), A13417AlbProTipo, A13430AlbProDate, A13429AlbProSal, Byte.valueOf(A13427AlbProDomE), A13424AlbProMatr, A13439AlbProObs, Byte.valueOf(A13437AlbProSta), A13431AlbProSys, A13433AlbProHh, A13434AlbProHhCt, A13435AlbProEnvA, A13436AlbProIDAT, Byte.valueOf(A13438AlbProStAT), A13440AlbProAnul, Short.valueOf(A13441AlbProUltL), A13579AlbProLC1, A13580AlbProLC2, A13581AlbProLC3, A13582AlbProLD1, A13583AlbProLD2, A13584AlbProLD3, Boolean.valueOf(n14190AlbProATCU), A14190AlbProATCU, Boolean.valueOf(n14191AlbProSerA), A14191AlbProSerA, Boolean.valueOf(n14192AlbProTipA), A14192AlbProTipA, A396EmprCod, Integer.valueOf(A13425AlbProCliC), Integer.valueOf(A13419AlbProPrvI), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
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
                        processLevel1UG1838( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UG0( ) ;
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
            load1UG1838( ) ;
         }
         endLevel1UG1838( ) ;
      }
      closeExtendedTableCursors1UG1838( ) ;
   }

   public void update1UG1838( )
   {
      beforeValidate1UG1838( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UG1838( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UG1838( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UG1838( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UG1838( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UG21 */
                  pr_default.execute(19, new Object[] {Byte.valueOf(A13452AlbProInEx), A13417AlbProTipo, A13430AlbProDate, A13429AlbProSal, Byte.valueOf(A13427AlbProDomE), A13424AlbProMatr, A13439AlbProObs, Byte.valueOf(A13437AlbProSta), A13431AlbProSys, A13433AlbProHh, A13434AlbProHhCt, A13435AlbProEnvA, A13436AlbProIDAT, Byte.valueOf(A13438AlbProStAT), A13440AlbProAnul, Short.valueOf(A13441AlbProUltL), A13579AlbProLC1, A13580AlbProLC2, A13581AlbProLC3, A13582AlbProLD1, A13583AlbProLD2, A13584AlbProLD3, Boolean.valueOf(n14190AlbProATCU), A14190AlbProATCU, Boolean.valueOf(n14191AlbProSerA), A14191AlbProSerA, Boolean.valueOf(n14192AlbProTipA), A14192AlbProTipA, Integer.valueOf(A13425AlbProCliC), Integer.valueOf(A13419AlbProPrvI), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID), A396EmprCod, Integer.valueOf(A13418AlbProID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UG1838( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UG1838( ) ;
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
         endLevel1UG1838( ) ;
      }
      closeExtendedTableCursors1UG1838( ) ;
   }

   public void deferredUpdate1UG1838( )
   {
   }

   public void delete( )
   {
      beforeValidate1UG1838( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UG1838( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UG1838( ) ;
         afterConfirm1UG1838( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UG1838( ) ;
            if ( AnyError == 0 )
            {
               scanStart1UG1839( ) ;
               while ( RcdFound1839 != 0 )
               {
                  getByPrimaryKey1UG1839( ) ;
                  delete1UG1839( ) ;
                  scanNext1UG1839( ) ;
               }
               scanEnd1UG1839( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UG22 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
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
      sMode1838 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UG1838( ) ;
      Gx_mode = sMode1838 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UG1838( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14376AlbProFm4d", A14376AlbProFm4d);
         /* Using cursor T01UG23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
         A13426AlbProCliN = T01UG23_A13426AlbProCliN[0] ;
         pr_default.close(21);
         /* Using cursor T01UG24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
         A13420AlbProPrvN = T01UG24_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = T01UG24_n13420AlbProPrvN[0] ;
         pr_default.close(22);
         /* Using cursor T01UG25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01UG25_A841TrnNom[0] ;
         n841TrnNom = T01UG25_n841TrnNom[0] ;
         pr_default.close(23);
         /* Using cursor T01UG26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
         A13454CatDocNom = T01UG26_A13454CatDocNom[0] ;
         n13454CatDocNom = T01UG26_n13454CatDocNom[0] ;
         pr_default.close(24);
         GXt_date10 = A14399AlbProDtA ;
         GXv_date11[0] = GXt_date10 ;
         new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_date11) ;
         documentotransporteproveedor_1_2_impl.this.GXt_date10 = GXv_date11[0] ;
         A14399AlbProDtA = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
      }
   }

   public void processNestedLevel1UG1839( )
   {
      nGXsfl_120_idx = 0 ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         readRow1UG1839( ) ;
         if ( ( nRcdExists_1839 != 0 ) || ( nIsMod_1839 != 0 ) )
         {
            standaloneNotModal1UG1839( ) ;
            getKey1UG1839( ) ;
            if ( ( nRcdExists_1839 == 0 ) && ( nRcdDeleted_1839 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UG1839( ) ;
            }
            else
            {
               if ( RcdFound1839 != 0 )
               {
                  if ( ( nRcdDeleted_1839 != 0 ) && ( nRcdExists_1839 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UG1839( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1839 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UG1839( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1839 == 0 )
                  {
                     GXCCtl = "ALBPROLINE_" + sGXsfl_120_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProLine_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbProLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtAlbProDsc_Internalname, GXutil.rtrim( A13448AlbProDsc)) ;
         httpContext.changePostValue( edtAlbProCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbProUnd.getInternalname(), GXutil.rtrim( A13444AlbProUnd)) ;
         httpContext.changePostValue( edtAlbProCaja_Internalname, GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProObsL_Internalname, GXutil.rtrim( A13447AlbProObsL)) ;
         httpContext.changePostValue( "ZT_"+"Z13442AlbProLine_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_120_idx, GXutil.rtrim( Z13448AlbProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_120_idx, GXutil.rtrim( Z13444AlbProUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_120_idx, GXutil.rtrim( Z13447AlbProObsL)) ;
         httpContext.changePostValue( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_120_idx, GXutil.rtrim( Z13445AlbProNRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_120_idx, GXutil.rtrim( Z13446AlbProVRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13853AlbProDto_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14401AlbProLote_"+sGXsfl_120_idx, GXutil.rtrim( Z14401AlbProLote)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_120_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1839_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1839_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1839_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1839 != 0 )
         {
            httpContext.changePostValue( "ALBPROLINE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRODSC_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROUND_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCAJA_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROOBSL_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UG1839( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1839 = (short)(0) ;
      nIsMod_1839 = (short)(0) ;
      nRcdDeleted_1839 = (short)(0) ;
   }

   public void processLevel1UG1838( )
   {
      /* Save parent mode. */
      sMode1838 = Gx_mode ;
      processNestedLevel1UG1839( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1838 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1UG1838( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UG1838( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_1_2");
         if ( AnyError == 0 )
         {
            confirmValues1UG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_1_2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UG1838( )
   {
      /* Scan By routine */
      /* Using cursor T01UG27 */
      pr_default.execute(25);
      RcdFound1838 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1838 = (short)(1) ;
         A396EmprCod = T01UG27_A396EmprCod[0] ;
         A13418AlbProID = T01UG27_A13418AlbProID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UG1838( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1838 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1838 = (short)(1) ;
         A396EmprCod = T01UG27_A396EmprCod[0] ;
         A13418AlbProID = T01UG27_A13418AlbProID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
   }

   public void scanEnd1UG1838( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1UG1838( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UG1838( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UG1838( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UG1838( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UG1838( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UG1838( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UG1838( )
   {
      edtAlbProID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      edtAlbProDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDate_Enabled), 5, 0), true);
      edtAlbProDtA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDtA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDtA_Enabled), 5, 0), true);
      edtAlbProPrvI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbProMatr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProMatr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProMatr_Enabled), 5, 0), true);
      edtAlbProSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSal_Enabled), 5, 0), true);
      edtAlbProObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObs_Enabled), 5, 0), true);
      edtavMsg_dev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMsg_dev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMsg_dev_Enabled), 5, 0), true);
      cmbAlbProStAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProStAT.getEnabled(), 5, 0), true);
      edtAlbProIDAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Enabled), 5, 0), true);
      cmbAlbProEnvA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEnvA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEnvA.getEnabled(), 5, 0), true);
      edtAlbProSys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Enabled), 5, 0), true);
      edtAlbProATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProATCU_Enabled), 5, 0), true);
      edtAlbProFm4d_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProFm4d_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProFm4d_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboalbproprvid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbproprvid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbproprvid_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtAlbProCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      edtAlbProDomE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDomE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDomE_Enabled), 5, 0), true);
      edtAlbProTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProTipo_Enabled), 5, 0), true);
      edtCatDocID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Enabled), 5, 0), true);
   }

   public void zm1UG1839( int GX_JID )
   {
      if ( ( GX_JID == 35 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13448AlbProDsc = T01UG3_A13448AlbProDsc[0] ;
            Z13443AlbProCnt = T01UG3_A13443AlbProCnt[0] ;
            Z13444AlbProUnd = T01UG3_A13444AlbProUnd[0] ;
            Z13449AlbProCaja = T01UG3_A13449AlbProCaja[0] ;
            Z13447AlbProObsL = T01UG3_A13447AlbProObsL[0] ;
            Z13445AlbProNRef = T01UG3_A13445AlbProNRef[0] ;
            Z13446AlbProVRef = T01UG3_A13446AlbProVRef[0] ;
            Z13852AlbProPrvp = T01UG3_A13852AlbProPrvp[0] ;
            Z13853AlbProDto = T01UG3_A13853AlbProDto[0] ;
            Z14401AlbProLote = T01UG3_A14401AlbProLote[0] ;
            Z719PrdNum = T01UG3_A719PrdNum[0] ;
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
            Z14401AlbProLote = A14401AlbProLote ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -35 )
      {
         Z13418AlbProID = A13418AlbProID ;
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
         Z14401AlbProLote = A14401AlbProLote ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z704PrdExiAlm = A704PrdExiAlm ;
      }
   }

   public void standaloneNotModal1UG1839( )
   {
   }

   public void standaloneModal1UG1839( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbProLine_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      }
      else
      {
         edtAlbProLine_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      }
   }

   public void load1UG1839( )
   {
      /* Using cursor T01UG28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A13448AlbProDsc = T01UG28_A13448AlbProDsc[0] ;
         n13448AlbProDsc = T01UG28_n13448AlbProDsc[0] ;
         A13443AlbProCnt = T01UG28_A13443AlbProCnt[0] ;
         n13443AlbProCnt = T01UG28_n13443AlbProCnt[0] ;
         A13444AlbProUnd = T01UG28_A13444AlbProUnd[0] ;
         n13444AlbProUnd = T01UG28_n13444AlbProUnd[0] ;
         A13449AlbProCaja = T01UG28_A13449AlbProCaja[0] ;
         n13449AlbProCaja = T01UG28_n13449AlbProCaja[0] ;
         A13447AlbProObsL = T01UG28_A13447AlbProObsL[0] ;
         n13447AlbProObsL = T01UG28_n13447AlbProObsL[0] ;
         A718PrdNom = T01UG28_A718PrdNom[0] ;
         A704PrdExiAlm = T01UG28_A704PrdExiAlm[0] ;
         A13445AlbProNRef = T01UG28_A13445AlbProNRef[0] ;
         n13445AlbProNRef = T01UG28_n13445AlbProNRef[0] ;
         A13446AlbProVRef = T01UG28_A13446AlbProVRef[0] ;
         n13446AlbProVRef = T01UG28_n13446AlbProVRef[0] ;
         A13852AlbProPrvp = T01UG28_A13852AlbProPrvp[0] ;
         n13852AlbProPrvp = T01UG28_n13852AlbProPrvp[0] ;
         A13853AlbProDto = T01UG28_A13853AlbProDto[0] ;
         n13853AlbProDto = T01UG28_n13853AlbProDto[0] ;
         A14401AlbProLote = T01UG28_A14401AlbProLote[0] ;
         n14401AlbProLote = T01UG28_n14401AlbProLote[0] ;
         A719PrdNum = T01UG28_A719PrdNum[0] ;
         zm1UG1839( -35) ;
      }
      pr_default.close(26);
      onLoadActions1UG1839( ) ;
   }

   public void onLoadActions1UG1839( )
   {
   }

   public void checkExtendedTable1UG1839( )
   {
      nIsDirty_1839 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1UG1839( ) ;
      /* Using cursor T01UG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UG4_A718PrdNom[0] ;
      A704PrdExiAlm = T01UG4_A704PrdExiAlm[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1UG1839( )
   {
      pr_default.close(2);
   }

   public void enableDisable1UG1839( )
   {
   }

   public void gxload_36( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01UG29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(27) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UG29_A718PrdNom[0] ;
      A704PrdExiAlm = T01UG29_A704PrdExiAlm[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void getKey1UG1839( )
   {
      /* Using cursor T01UG30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1839 = (short)(1) ;
      }
      else
      {
         RcdFound1839 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey1UG1839( )
   {
      /* Using cursor T01UG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UG1839( 35) ;
         RcdFound1839 = (short)(1) ;
         initializeNonKey1UG1839( ) ;
         A13442AlbProLine = T01UG3_A13442AlbProLine[0] ;
         A13448AlbProDsc = T01UG3_A13448AlbProDsc[0] ;
         n13448AlbProDsc = T01UG3_n13448AlbProDsc[0] ;
         A13443AlbProCnt = T01UG3_A13443AlbProCnt[0] ;
         n13443AlbProCnt = T01UG3_n13443AlbProCnt[0] ;
         A13444AlbProUnd = T01UG3_A13444AlbProUnd[0] ;
         n13444AlbProUnd = T01UG3_n13444AlbProUnd[0] ;
         A13449AlbProCaja = T01UG3_A13449AlbProCaja[0] ;
         n13449AlbProCaja = T01UG3_n13449AlbProCaja[0] ;
         A13447AlbProObsL = T01UG3_A13447AlbProObsL[0] ;
         n13447AlbProObsL = T01UG3_n13447AlbProObsL[0] ;
         A13445AlbProNRef = T01UG3_A13445AlbProNRef[0] ;
         n13445AlbProNRef = T01UG3_n13445AlbProNRef[0] ;
         A13446AlbProVRef = T01UG3_A13446AlbProVRef[0] ;
         n13446AlbProVRef = T01UG3_n13446AlbProVRef[0] ;
         A13852AlbProPrvp = T01UG3_A13852AlbProPrvp[0] ;
         n13852AlbProPrvp = T01UG3_n13852AlbProPrvp[0] ;
         A13853AlbProDto = T01UG3_A13853AlbProDto[0] ;
         n13853AlbProDto = T01UG3_n13853AlbProDto[0] ;
         A14401AlbProLote = T01UG3_A14401AlbProLote[0] ;
         n14401AlbProLote = T01UG3_n14401AlbProLote[0] ;
         A719PrdNum = T01UG3_A719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13418AlbProID = A13418AlbProID ;
         Z13442AlbProLine = A13442AlbProLine ;
         sMode1839 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UG1839( ) ;
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1839 = (short)(0) ;
         initializeNonKey1UG1839( ) ;
         sMode1839 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UG1839( ) ;
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UG1839( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UG1839( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13448AlbProDsc, T01UG2_A13448AlbProDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z13443AlbProCnt, T01UG2_A13443AlbProCnt[0]) != 0 ) || ( GXutil.strcmp(Z13444AlbProUnd, T01UG2_A13444AlbProUnd[0]) != 0 ) || ( Z13449AlbProCaja != T01UG2_A13449AlbProCaja[0] ) || ( GXutil.strcmp(Z13447AlbProObsL, T01UG2_A13447AlbProObsL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13445AlbProNRef, T01UG2_A13445AlbProNRef[0]) != 0 ) || ( GXutil.strcmp(Z13446AlbProVRef, T01UG2_A13446AlbProVRef[0]) != 0 ) || ( DecimalUtil.compareTo(Z13852AlbProPrvp, T01UG2_A13852AlbProPrvp[0]) != 0 ) || ( DecimalUtil.compareTo(Z13853AlbProDto, T01UG2_A13853AlbProDto[0]) != 0 ) || ( GXutil.strcmp(Z14401AlbProLote, T01UG2_A14401AlbProLote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z719PrdNum, T01UG2_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13448AlbProDsc, T01UG2_A13448AlbProDsc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProDsc");
               GXutil.writeLogRaw("Old: ",Z13448AlbProDsc);
               GXutil.writeLogRaw("Current: ",T01UG2_A13448AlbProDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z13443AlbProCnt, T01UG2_A13443AlbProCnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProCnt");
               GXutil.writeLogRaw("Old: ",Z13443AlbProCnt);
               GXutil.writeLogRaw("Current: ",T01UG2_A13443AlbProCnt[0]);
            }
            if ( GXutil.strcmp(Z13444AlbProUnd, T01UG2_A13444AlbProUnd[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProUnd");
               GXutil.writeLogRaw("Old: ",Z13444AlbProUnd);
               GXutil.writeLogRaw("Current: ",T01UG2_A13444AlbProUnd[0]);
            }
            if ( Z13449AlbProCaja != T01UG2_A13449AlbProCaja[0] )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProCaja");
               GXutil.writeLogRaw("Old: ",Z13449AlbProCaja);
               GXutil.writeLogRaw("Current: ",T01UG2_A13449AlbProCaja[0]);
            }
            if ( GXutil.strcmp(Z13447AlbProObsL, T01UG2_A13447AlbProObsL[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProObsL");
               GXutil.writeLogRaw("Old: ",Z13447AlbProObsL);
               GXutil.writeLogRaw("Current: ",T01UG2_A13447AlbProObsL[0]);
            }
            if ( GXutil.strcmp(Z13445AlbProNRef, T01UG2_A13445AlbProNRef[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProNRef");
               GXutil.writeLogRaw("Old: ",Z13445AlbProNRef);
               GXutil.writeLogRaw("Current: ",T01UG2_A13445AlbProNRef[0]);
            }
            if ( GXutil.strcmp(Z13446AlbProVRef, T01UG2_A13446AlbProVRef[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProVRef");
               GXutil.writeLogRaw("Old: ",Z13446AlbProVRef);
               GXutil.writeLogRaw("Current: ",T01UG2_A13446AlbProVRef[0]);
            }
            if ( DecimalUtil.compareTo(Z13852AlbProPrvp, T01UG2_A13852AlbProPrvp[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProPrvp");
               GXutil.writeLogRaw("Old: ",Z13852AlbProPrvp);
               GXutil.writeLogRaw("Current: ",T01UG2_A13852AlbProPrvp[0]);
            }
            if ( DecimalUtil.compareTo(Z13853AlbProDto, T01UG2_A13853AlbProDto[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProDto");
               GXutil.writeLogRaw("Old: ",Z13853AlbProDto);
               GXutil.writeLogRaw("Current: ",T01UG2_A13853AlbProDto[0]);
            }
            if ( GXutil.strcmp(Z14401AlbProLote, T01UG2_A14401AlbProLote[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"AlbProLote");
               GXutil.writeLogRaw("Old: ",Z14401AlbProLote);
               GXutil.writeLogRaw("Current: ",T01UG2_A14401AlbProLote[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01UG2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.documentotransporteproveedor_1_2:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01UG2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UG1839( )
   {
      beforeValidate1UG1839( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UG1839( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UG1839( 0) ;
         checkOptimisticConcurrency1UG1839( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UG1839( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UG1839( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UG31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine), Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13445AlbProNRef), A13445AlbProNRef, Boolean.valueOf(n13446AlbProVRef), A13446AlbProVRef, Boolean.valueOf(n13852AlbProPrvp), A13852AlbProPrvp, Boolean.valueOf(n13853AlbProDto), A13853AlbProDto, Boolean.valueOf(n14401AlbProLote), A14401AlbProLote, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
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
            load1UG1839( ) ;
         }
         endLevel1UG1839( ) ;
      }
      closeExtendedTableCursors1UG1839( ) ;
   }

   public void update1UG1839( )
   {
      beforeValidate1UG1839( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UG1839( ) ;
      }
      if ( ( nIsMod_1839 != 0 ) || ( nIsDirty_1839 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UG1839( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UG1839( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UG1839( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UG32 */
                     pr_default.execute(30, new Object[] {Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13445AlbProNRef), A13445AlbProNRef, Boolean.valueOf(n13446AlbProVRef), A13446AlbProVRef, Boolean.valueOf(n13852AlbProPrvp), A13852AlbProPrvp, Boolean.valueOf(n13853AlbProDto), A13853AlbProDto, Boolean.valueOf(n14401AlbProLote), A14401AlbProLote, A719PrdNum, A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UG1839( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UG1839( ) ;
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
            endLevel1UG1839( ) ;
         }
      }
      closeExtendedTableCursors1UG1839( ) ;
   }

   public void deferredUpdate1UG1839( )
   {
   }

   public void delete1UG1839( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UG1839( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UG1839( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UG1839( ) ;
         afterConfirm1UG1839( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UG1839( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UG33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
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
      sMode1839 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UG1839( ) ;
      Gx_mode = sMode1839 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UG1839( )
   {
      standaloneModal1UG1839( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UG34 */
         pr_default.execute(32, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UG34_A718PrdNom[0] ;
         A704PrdExiAlm = T01UG34_A704PrdExiAlm[0] ;
         pr_default.close(32);
      }
   }

   public void endLevel1UG1839( )
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

   public void scanStart1UG1839( )
   {
      /* Scan By routine */
      /* Using cursor T01UG35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      RcdFound1839 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A13442AlbProLine = T01UG35_A13442AlbProLine[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UG1839( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1839 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A13442AlbProLine = T01UG35_A13442AlbProLine[0] ;
      }
   }

   public void scanEnd1UG1839( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1UG1839( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UG1839( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UG1839( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UG1839( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UG1839( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UG1839( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UG1839( )
   {
      edtAlbProLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtAlbProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDsc_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtAlbProCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCnt_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      cmbAlbProUnd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProUnd.getEnabled(), 5, 0), !bGXsfl_120_Refreshing);
      edtAlbProCaja_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCaja_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCaja_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtAlbProObsL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObsL_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void send_integrity_lvl_hashes1UG1839( )
   {
   }

   public void send_integrity_lvl_hashes1UG1838( )
   {
   }

   public void subsflControlProps_1201839( )
   {
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_120_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_120_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_120_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_120_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_120_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_120_idx ;
      edtAlbProObsL_Internalname = "ALBPROOBSL_"+sGXsfl_120_idx ;
   }

   public void subsflControlProps_fel_1201839( )
   {
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_120_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_120_fel_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_120_fel_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_120_fel_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_120_fel_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_120_fel_idx ;
      edtAlbProObsL_Internalname = "ALBPROOBSL_"+sGXsfl_120_fel_idx ;
   }

   public void addRow1UG1839( )
   {
      nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1201839( ) ;
      sendRow1UG1839( ) ;
   }

   public void sendRow1UG1839( )
   {
      Gridlevel_albproRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_albpro_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_albpro_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_albpro_Class, "") != 0 )
         {
            subGridlevel_albpro_Linesclass = subGridlevel_albpro_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_albpro_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_albpro_Backstyle = (byte)(0) ;
         subGridlevel_albpro_Backcolor = subGridlevel_albpro_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_albpro_Class, "") != 0 )
         {
            subGridlevel_albpro_Linesclass = subGridlevel_albpro_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_albpro_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_albpro_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_albpro_Class, "") != 0 )
         {
            subGridlevel_albpro_Linesclass = subGridlevel_albpro_Class+"Odd" ;
         }
         subGridlevel_albpro_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_albpro_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_albpro_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_120_idx) % (2))) == 0 )
         {
            subGridlevel_albpro_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_albpro_Class, "") != 0 )
            {
               subGridlevel_albpro_Linesclass = subGridlevel_albpro_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_albpro_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_albpro_Class, "") != 0 )
            {
               subGridlevel_albpro_Linesclass = subGridlevel_albpro_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_albproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProLine_Internalname,GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProLine_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProLine_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_albproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_albproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDsc_Internalname,GXutil.rtrim( A13448AlbProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_albproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProCnt_Enabled!=0) ? localUtil.format( A13443AlbProCnt, "ZZZZZ9.99") : localUtil.format( A13443AlbProCnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      if ( ( cmbAlbProUnd.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "ALBPROUND_" + sGXsfl_120_idx ;
         cmbAlbProUnd.setName( GXCCtl );
         cmbAlbProUnd.setWebtags( "" );
         cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
         cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
         cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
         cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
         cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
         if ( cmbAlbProUnd.getItemCount() > 0 )
         {
            A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
            n13444AlbProUnd = false ;
         }
      }
      /* ComboBox */
      Gridlevel_albproRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProUnd,cmbAlbProUnd.getInternalname(),GXutil.rtrim( A13444AlbProUnd),Integer.valueOf(1),cmbAlbProUnd.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbProUnd.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbProUnd.setValue( GXutil.rtrim( A13444AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Values", cmbAlbProUnd.ToJavascriptSource(), !bGXsfl_120_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_albproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCaja_Internalname,GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProCaja_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCaja_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProCaja_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_albproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProObsL_Internalname,GXutil.rtrim( A13447AlbProObsL),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProObsL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProObsL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_albproRow);
      send_integrity_lvl_hashes1UG1839( ) ;
      GXCCtl = "Z13442AlbProLine_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13448AlbProDsc_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13448AlbProDsc));
      GXCCtl = "Z13443AlbProCnt_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13444AlbProUnd_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13444AlbProUnd));
      GXCCtl = "Z13449AlbProCaja_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13447AlbProObsL_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13447AlbProObsL));
      GXCCtl = "Z13445AlbProNRef_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13445AlbProNRef));
      GXCCtl = "Z13446AlbProVRef_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13446AlbProVRef));
      GXCCtl = "Z13852AlbProPrvp_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13853AlbProDto_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14401AlbProLote_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14401AlbProLote));
      GXCCtl = "Z719PrdNum_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1839_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1839_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1839_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8EmprCod));
      GXCCtl = "vALBPROID_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV23AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLINE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODSC_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROUND_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCAJA_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROOBSL_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_albproContainer.AddRow(Gridlevel_albproRow);
   }

   public void readRow1UG1839( )
   {
      nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1201839( ) ;
      edtAlbProLine_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROLINE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRODSC_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCNT_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbProUnd.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROUND_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbProCaja_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCAJA_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProObsL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROOBSL_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPROLINE_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProLine_Internalname ;
         wbErr = true ;
         A13442AlbProLine = (short)(0) ;
      }
      else
      {
         A13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A13448AlbProDsc = httpContext.cgiGet( edtAlbProDsc_Internalname) ;
      n13448AlbProDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPROCNT_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCnt_Internalname ;
         wbErr = true ;
         A13443AlbProCnt = DecimalUtil.ZERO ;
         n13443AlbProCnt = false ;
      }
      else
      {
         A13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)) ;
         n13443AlbProCnt = false ;
      }
      cmbAlbProUnd.setName( cmbAlbProUnd.getInternalname() );
      cmbAlbProUnd.setValue( httpContext.cgiGet( cmbAlbProUnd.getInternalname()) );
      A13444AlbProUnd = httpContext.cgiGet( cmbAlbProUnd.getInternalname()) ;
      n13444AlbProUnd = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPROCAJA_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCaja_Internalname ;
         wbErr = true ;
         A13449AlbProCaja = (short)(0) ;
         n13449AlbProCaja = false ;
      }
      else
      {
         A13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13449AlbProCaja = false ;
      }
      A13447AlbProObsL = httpContext.cgiGet( edtAlbProObsL_Internalname) ;
      n13447AlbProObsL = false ;
      GXCCtl = "Z13442AlbProLine_" + sGXsfl_120_idx ;
      Z13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13448AlbProDsc_" + sGXsfl_120_idx ;
      Z13448AlbProDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13443AlbProCnt_" + sGXsfl_120_idx ;
      Z13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13444AlbProUnd_" + sGXsfl_120_idx ;
      Z13444AlbProUnd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13449AlbProCaja_" + sGXsfl_120_idx ;
      Z13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13447AlbProObsL_" + sGXsfl_120_idx ;
      Z13447AlbProObsL = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13445AlbProNRef_" + sGXsfl_120_idx ;
      Z13445AlbProNRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13446AlbProVRef_" + sGXsfl_120_idx ;
      Z13446AlbProVRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13852AlbProPrvp_" + sGXsfl_120_idx ;
      Z13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13853AlbProDto_" + sGXsfl_120_idx ;
      Z13853AlbProDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14401AlbProLote_" + sGXsfl_120_idx ;
      Z14401AlbProLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_120_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13445AlbProNRef_" + sGXsfl_120_idx ;
      A13445AlbProNRef = httpContext.cgiGet( GXCCtl) ;
      n13445AlbProNRef = false ;
      GXCCtl = "Z13446AlbProVRef_" + sGXsfl_120_idx ;
      A13446AlbProVRef = httpContext.cgiGet( GXCCtl) ;
      n13446AlbProVRef = false ;
      GXCCtl = "Z13852AlbProPrvp_" + sGXsfl_120_idx ;
      A13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      n13852AlbProPrvp = false ;
      GXCCtl = "Z13853AlbProDto_" + sGXsfl_120_idx ;
      A13853AlbProDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      n13853AlbProDto = false ;
      GXCCtl = "Z14401AlbProLote_" + sGXsfl_120_idx ;
      A14401AlbProLote = httpContext.cgiGet( GXCCtl) ;
      n14401AlbProLote = false ;
      GXCCtl = "nRcdDeleted_1839_" + sGXsfl_120_idx ;
      nRcdDeleted_1839 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1839_" + sGXsfl_120_idx ;
      nRcdExists_1839 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1839_" + sGXsfl_120_idx ;
      nIsMod_1839 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbProLine_Enabled = edtAlbProLine_Enabled ;
   }

   public void confirmValues1UG0( )
   {
      nGXsfl_120_idx = 0 ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1201839( ) ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1201839( ) ;
         httpContext.changePostValue( "Z13442AlbProLine_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13442AlbProLine_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13442AlbProLine_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13448AlbProDsc_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13443AlbProCnt_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13444AlbProUnd_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13449AlbProCaja_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13447AlbProObsL_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13445AlbProNRef_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13446AlbProVRef_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13852AlbProPrvp_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z13853AlbProDto_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z13853AlbProDto_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13853AlbProDto_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z14401AlbProLote_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z14401AlbProLote_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14401AlbProLote_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_120_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.documentotransporteproveedor_1_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProID,8,0))}, new String[] {"Gx_mode","EmprCod","AlbProID"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_1_2");
      forbiddenHiddens.add("AlbProStAT", localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV39Pgmname, "")));
      forbiddenHiddens.add("AlbProInEx", localUtil.format( DecimalUtil.doubleToDec(A13452AlbProInEx), "9"));
      forbiddenHiddens.add("AlbProSal", localUtil.format( A13429AlbProSal, "99/99/99 99:99"));
      forbiddenHiddens.add("AlbProSta", localUtil.format( DecimalUtil.doubleToDec(A13437AlbProSta), "9"));
      forbiddenHiddens.add("AlbProSys", localUtil.format( A13431AlbProSys, "99/99/99 99:99"));
      forbiddenHiddens.add("AlbProHh", GXutil.rtrim( localUtil.format( A13433AlbProHh, "")));
      forbiddenHiddens.add("AlbProHhCt", GXutil.rtrim( localUtil.format( A13434AlbProHhCt, "")));
      forbiddenHiddens.add("AlbProEnvA", GXutil.rtrim( localUtil.format( A13435AlbProEnvA, "")));
      forbiddenHiddens.add("AlbProIDAT", GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")));
      forbiddenHiddens.add("AlbProAnul", GXutil.rtrim( localUtil.format( A13440AlbProAnul, "")));
      forbiddenHiddens.add("AlbProUltL", localUtil.format( DecimalUtil.doubleToDec(A13441AlbProUltL), "ZZZ9"));
      forbiddenHiddens.add("AlbProLC1", GXutil.rtrim( localUtil.format( A13579AlbProLC1, "")));
      forbiddenHiddens.add("AlbProLC2", GXutil.rtrim( localUtil.format( A13580AlbProLC2, "")));
      forbiddenHiddens.add("AlbProLC3", GXutil.rtrim( localUtil.format( A13581AlbProLC3, "")));
      forbiddenHiddens.add("AlbProLD1", GXutil.rtrim( localUtil.format( A13582AlbProLD1, "")));
      forbiddenHiddens.add("AlbProLD2", GXutil.rtrim( localUtil.format( A13583AlbProLD2, "")));
      forbiddenHiddens.add("AlbProLD3", GXutil.rtrim( localUtil.format( A13584AlbProLD3, "")));
      forbiddenHiddens.add("AlbProATCU", GXutil.rtrim( localUtil.format( A14190AlbProATCU, "")));
      forbiddenHiddens.add("AlbProSerA", GXutil.rtrim( localUtil.format( A14191AlbProSerA, "")));
      forbiddenHiddens.add("AlbProTipA", GXutil.rtrim( localUtil.format( A14192AlbProTipA, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_1_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13418AlbProID", GXutil.ltrim( localUtil.ntoc( Z13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13452AlbProInEx", GXutil.ltrim( localUtil.ntoc( Z13452AlbProInEx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13417AlbProTipo", GXutil.rtrim( Z13417AlbProTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13430AlbProDate", localUtil.dtoc( Z13430AlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13429AlbProSal", localUtil.ttoc( Z13429AlbProSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13427AlbProDomE", GXutil.ltrim( localUtil.ntoc( Z13427AlbProDomE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13424AlbProMatr", GXutil.rtrim( Z13424AlbProMatr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13439AlbProObs", Z13439AlbProObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13437AlbProSta", GXutil.ltrim( localUtil.ntoc( Z13437AlbProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13431AlbProSys", localUtil.ttoc( Z13431AlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13433AlbProHh", Z13433AlbProHh);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13434AlbProHhCt", Z13434AlbProHhCt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13435AlbProEnvA", GXutil.rtrim( Z13435AlbProEnvA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13436AlbProIDAT", GXutil.rtrim( Z13436AlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13438AlbProStAT", GXutil.ltrim( localUtil.ntoc( Z13438AlbProStAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13440AlbProAnul", GXutil.rtrim( Z13440AlbProAnul));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13441AlbProUltL", GXutil.ltrim( localUtil.ntoc( Z13441AlbProUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13579AlbProLC1", GXutil.rtrim( Z13579AlbProLC1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13580AlbProLC2", GXutil.rtrim( Z13580AlbProLC2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13581AlbProLC3", GXutil.rtrim( Z13581AlbProLC3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13582AlbProLD1", GXutil.rtrim( Z13582AlbProLD1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13583AlbProLD2", GXutil.rtrim( Z13583AlbProLD2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13584AlbProLD3", GXutil.rtrim( Z13584AlbProLD3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14190AlbProATCU", GXutil.rtrim( Z14190AlbProATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14191AlbProSerA", GXutil.rtrim( Z14191AlbProSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14192AlbProTipA", GXutil.rtrim( Z14192AlbProTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( Z13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( Z13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13453CatDocID", GXutil.ltrim( localUtil.ntoc( Z13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_120", GXutil.ltrim( localUtil.ntoc( nGXsfl_120_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13453CatDocID", GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBPROPRVID_DATA", AV35AlbProPrvID_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBPROPRVID_DATA", AV35AlbProPrvID_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV32TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV32TrnCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROHH", A13433AlbProHh);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROID", GXutil.ltrim( localUtil.ntoc( AV23AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CATDOCID", GXutil.ltrim( localUtil.ntoc( AV27Insert_CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBPROPRVID", GXutil.ltrim( localUtil.ntoc( AV28Insert_AlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBPROCLICOD", GXutil.ltrim( localUtil.ntoc( AV29Insert_AlbProCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV30Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROINEX", GXutil.ltrim( localUtil.ntoc( A13452AlbProInEx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSTA", GXutil.ltrim( localUtil.ntoc( A13437AlbProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROHHCT", A13434AlbProHhCt);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROANUL", GXutil.rtrim( A13440AlbProAnul));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROULTL", GXutil.ltrim( localUtil.ntoc( A13441AlbProUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLC1", GXutil.rtrim( A13579AlbProLC1));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLC2", GXutil.rtrim( A13580AlbProLC2));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLC3", GXutil.rtrim( A13581AlbProLC3));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLD1", GXutil.rtrim( A13582AlbProLD1));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLD2", GXutil.rtrim( A13583AlbProLD2));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLD3", GXutil.rtrim( A13584AlbProLD3));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSERA", GXutil.rtrim( A14191AlbProSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROTIPA", GXutil.rtrim( A14192AlbProTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCLIN", GXutil.rtrim( A13426AlbProCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVN", GXutil.rtrim( A13420AlbProPrvN));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CATDOCNOM", GXutil.rtrim( A13454CatDocNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRONREF", GXutil.rtrim( A13445AlbProNRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROVREF", GXutil.rtrim( A13446AlbProVRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVP", GXutil.ltrim( localUtil.ntoc( A13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODTO", GXutil.ltrim( localUtil.ntoc( A13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLOTE", GXutil.rtrim( A14401AlbProLote));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBPROPRVID_Objectcall", GXutil.rtrim( Combo_albproprvid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBPROPRVID_Cls", GXutil.rtrim( Combo_albproprvid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBPROPRVID_Selectedvalue_set", GXutil.rtrim( Combo_albproprvid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBPROPRVID_Enabled", GXutil.booltostr( Combo_albproprvid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBPROPRVID_Emptyitem", GXutil.booltostr( Combo_albproprvid_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      return formatLink("app.stocksquimicos.documentotransporteproveedor_1_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProID,8,0))}, new String[] {"Gx_mode","EmprCod","AlbProID"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.DocumentoTransporteProveedor_1_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Transporte Proveedor", "") ;
   }

   public void initializeNonKey1UG1838( )
   {
      A13453CatDocID = (short)(0) ;
      n13453CatDocID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
      A13419AlbProPrvI = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
      A13425AlbProCliC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A14376AlbProFm4d = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14376AlbProFm4d", A14376AlbProFm4d);
      A14399AlbProDtA = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
      A13452AlbProInEx = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
      A13417AlbProTipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
      A13430AlbProDate = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13454CatDocNom = "" ;
      n13454CatDocNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13454CatDocNom", A13454CatDocNom);
      A13420AlbProPrvN = "" ;
      n13420AlbProPrvN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", A13420AlbProPrvN);
      A13426AlbProCliN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
      A13427AlbProDomE = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A13424AlbProMatr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
      A13439AlbProObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
      A13437AlbProSta = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13433AlbProHh = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13433AlbProHh", A13433AlbProHh);
      A13434AlbProHhCt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13434AlbProHhCt", A13434AlbProHhCt);
      A13435AlbProEnvA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
      A13436AlbProIDAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
      A13438AlbProStAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
      A13440AlbProAnul = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13440AlbProAnul", A13440AlbProAnul);
      A13441AlbProUltL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      A13579AlbProLC1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13579AlbProLC1", A13579AlbProLC1);
      A13580AlbProLC2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13580AlbProLC2", A13580AlbProLC2);
      A13581AlbProLC3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13581AlbProLC3", A13581AlbProLC3);
      A13582AlbProLD1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13582AlbProLD1", A13582AlbProLD1);
      A13583AlbProLD2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13583AlbProLD2", A13583AlbProLD2);
      A13584AlbProLD3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13584AlbProLD3", A13584AlbProLD3);
      A14190AlbProATCU = "" ;
      n14190AlbProATCU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14190AlbProATCU", A14190AlbProATCU);
      A14191AlbProSerA = "" ;
      n14191AlbProSerA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14191AlbProSerA", A14191AlbProSerA);
      A14192AlbProTipA = "" ;
      n14192AlbProTipA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14192AlbProTipA", A14192AlbProTipA);
      Z13452AlbProInEx = (byte)(0) ;
      Z13417AlbProTipo = "" ;
      Z13430AlbProDate = GXutil.nullDate() ;
      Z13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      Z13427AlbProDomE = (byte)(0) ;
      Z13424AlbProMatr = "" ;
      Z13439AlbProObs = "" ;
      Z13437AlbProSta = (byte)(0) ;
      Z13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      Z13433AlbProHh = "" ;
      Z13434AlbProHhCt = "" ;
      Z13435AlbProEnvA = "" ;
      Z13436AlbProIDAT = "" ;
      Z13438AlbProStAT = (byte)(0) ;
      Z13440AlbProAnul = "" ;
      Z13441AlbProUltL = (short)(0) ;
      Z13579AlbProLC1 = "" ;
      Z13580AlbProLC2 = "" ;
      Z13581AlbProLC3 = "" ;
      Z13582AlbProLD1 = "" ;
      Z13583AlbProLD2 = "" ;
      Z13584AlbProLD3 = "" ;
      Z14190AlbProATCU = "" ;
      Z14191AlbProSerA = "" ;
      Z14192AlbProTipA = "" ;
      Z13425AlbProCliC = 0 ;
      Z13419AlbProPrvI = 0 ;
      Z840TrnCod = (short)(0) ;
      Z13453CatDocID = (short)(0) ;
   }

   public void initAll1UG1838( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A13418AlbProID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      initializeNonKey1UG1838( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UG1839( )
   {
      A719PrdNum = "" ;
      A13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      n13443AlbProCnt = false ;
      A13444AlbProUnd = "" ;
      n13444AlbProUnd = false ;
      A13449AlbProCaja = (short)(0) ;
      n13449AlbProCaja = false ;
      A13447AlbProObsL = "" ;
      n13447AlbProObsL = false ;
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
      A14401AlbProLote = "" ;
      n14401AlbProLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14401AlbProLote", A14401AlbProLote);
      Z13448AlbProDsc = "" ;
      Z13443AlbProCnt = DecimalUtil.ZERO ;
      Z13444AlbProUnd = "" ;
      Z13449AlbProCaja = (short)(0) ;
      Z13447AlbProObsL = "" ;
      Z13445AlbProNRef = "" ;
      Z13446AlbProVRef = "" ;
      Z13852AlbProPrvp = DecimalUtil.ZERO ;
      Z13853AlbProDto = DecimalUtil.ZERO ;
      Z14401AlbProLote = "" ;
      Z719PrdNum = "" ;
   }

   public void initAll1UG1839( )
   {
      A13442AlbProLine = (short)(0) ;
      initializeNonKey1UG1839( ) ;
   }

   public void standaloneModalInsert1UG1839( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103224", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/documentotransporteproveedor_1_2.js", "?202682116103224", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1839( )
   {
      edtAlbProLine_Enabled = defedtAlbProLine_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void startgridcontrol120( )
   {
      Gridlevel_albproContainer.AddObjectProperty("GridName", "Gridlevel_albpro");
      Gridlevel_albproContainer.AddObjectProperty("Header", subGridlevel_albpro_Header);
      Gridlevel_albproContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_albproContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_albproContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.rtrim( A13448AlbProDsc));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.rtrim( A13444AlbProUnd));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albproColumn.AddObjectProperty("Value", GXutil.rtrim( A13447AlbProObsL));
      Gridlevel_albproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddColumnProperties(Gridlevel_albproColumn);
      Gridlevel_albproContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albproContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpro_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbProID_Internalname = "ALBPROID" ;
      edtAlbProDate_Internalname = "ALBPRODATE" ;
      edtAlbProDtA_Internalname = "ALBPRODTA" ;
      lblTextblockalbproprvid_Internalname = "TEXTBLOCKALBPROPRVID" ;
      Combo_albproprvid_Internalname = "COMBO_ALBPROPRVID" ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI" ;
      divTablesplittedalbproprvid_Internalname = "TABLESPLITTEDALBPROPRVID" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtAlbProMatr_Internalname = "ALBPROMATR" ;
      edtAlbProSal_Internalname = "ALBPROSAL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtAlbProObs_Internalname = "ALBPROOBS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavMsg_dev_Internalname = "vMSG_DEV" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT" );
      edtAlbProIDAT_Internalname = "ALBPROIDAT" ;
      cmbAlbProEnvA.setInternalname( "ALBPROENVA" );
      edtAlbProSys_Internalname = "ALBPROSYS" ;
      edtAlbProATCU_Internalname = "ALBPROATCU" ;
      edtAlbProFm4d_Internalname = "ALBPROFM4D" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtAlbProLine_Internalname = "ALBPROLINE" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtAlbProDsc_Internalname = "ALBPRODSC" ;
      edtAlbProCnt_Internalname = "ALBPROCNT" ;
      cmbAlbProUnd.setInternalname( "ALBPROUND" );
      edtAlbProCaja_Internalname = "ALBPROCAJA" ;
      edtAlbProObsL_Internalname = "ALBPROOBSL" ;
      divTableleaflevel_albpro_Internalname = "TABLELEAFLEVEL_ALBPRO" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboalbproprvid_Internalname = "vCOMBOALBPROPRVID" ;
      divSectionattribute_albproprvid_Internalname = "SECTIONATTRIBUTE_ALBPROPRVID" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtAlbProCliC_Internalname = "ALBPROCLIC" ;
      edtAlbProDomE_Internalname = "ALBPRODOME" ;
      edtAlbProTipo_Internalname = "ALBPROTIPO" ;
      edtCatDocID_Internalname = "CATDOCID" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_albpro_Internalname = "GRIDLEVEL_ALBPRO" ;
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
      subGridlevel_albpro_Allowcollapsing = (byte)(0) ;
      subGridlevel_albpro_Allowselection = (byte)(0) ;
      subGridlevel_albpro_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Documento Transporte Proveedor", "") );
      edtAlbProObsL_Jsonclick = "" ;
      edtAlbProCaja_Jsonclick = "" ;
      cmbAlbProUnd.setJsonclick( "" );
      edtAlbProCnt_Jsonclick = "" ;
      edtAlbProDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtAlbProLine_Jsonclick = "" ;
      subGridlevel_albpro_Class = "GridNoBorder WorkWith" ;
      subGridlevel_albpro_Backcolorstyle = (byte)(0) ;
      edtAlbProObsL_Enabled = 1 ;
      edtAlbProCaja_Enabled = 1 ;
      cmbAlbProUnd.setEnabled( 1 );
      edtAlbProCnt_Enabled = 1 ;
      edtAlbProDsc_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtAlbProLine_Enabled = 1 ;
      edtCatDocID_Jsonclick = "" ;
      edtCatDocID_Enabled = 1 ;
      edtCatDocID_Visible = 1 ;
      edtAlbProTipo_Jsonclick = "" ;
      edtAlbProTipo_Enabled = 1 ;
      edtAlbProTipo_Visible = 1 ;
      edtAlbProDomE_Jsonclick = "" ;
      edtAlbProDomE_Enabled = 1 ;
      edtAlbProDomE_Visible = 1 ;
      edtAlbProCliC_Jsonclick = "" ;
      edtAlbProCliC_Enabled = 1 ;
      edtAlbProCliC_Visible = 1 ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboalbproprvid_Jsonclick = "" ;
      edtavComboalbproprvid_Enabled = 0 ;
      edtavComboalbproprvid_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbProFm4d_Jsonclick = "" ;
      edtAlbProFm4d_Enabled = 0 ;
      edtAlbProATCU_Jsonclick = "" ;
      edtAlbProATCU_Enabled = 0 ;
      edtAlbProSys_Jsonclick = "" ;
      edtAlbProSys_Enabled = 0 ;
      cmbAlbProEnvA.setJsonclick( "" );
      cmbAlbProEnvA.setEnabled( 0 );
      edtAlbProIDAT_Jsonclick = "" ;
      edtAlbProIDAT_Enabled = 0 ;
      cmbAlbProStAT.setJsonclick( "" );
      cmbAlbProStAT.setEnabled( 0 );
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtavMsg_dev_Jsonclick = "" ;
      edtavMsg_dev_Enabled = 0 ;
      edtAlbProObs_Enabled = 1 ;
      edtAlbProSal_Jsonclick = "" ;
      edtAlbProSal_Enabled = 0 ;
      edtAlbProMatr_Jsonclick = "" ;
      edtAlbProMatr_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbProPrvI_Jsonclick = "" ;
      edtAlbProPrvI_Enabled = 1 ;
      edtAlbProPrvI_Visible = 1 ;
      Combo_albproprvid_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albproprvid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albproprvid_Enabled = GXutil.toBoolean( -1) ;
      edtAlbProDtA_Jsonclick = "" ;
      edtAlbProDtA_Enabled = 0 ;
      edtAlbProDate_Jsonclick = "" ;
      edtAlbProDate_Enabled = 1 ;
      edtAlbProID_Jsonclick = "" ;
      edtAlbProID_Enabled = 1 ;
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

   public void gx3asaalbprodta1UG1838( String A396EmprCod ,
                                       int A13418AlbProID )
   {
      GXt_date10 = A14399AlbProDtA ;
      GXv_date11[0] = GXt_date10 ;
      new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_date11) ;
      documentotransporteproveedor_1_2_impl.this.GXt_date10 = GXv_date11[0] ;
      A14399AlbProDtA = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14399AlbProDtA, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_albpro_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1201839( ) ;
      while ( nGXsfl_120_idx <= nRC_GXsfl_120 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UG1839( ) ;
         standaloneModal1UG1839( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UG1839( ) ;
         nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1201839( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_albproContainer)) ;
      /* End function gxnrGridlevel_albpro_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbProStAT.setName( "ALBPROSTAT" );
      cmbAlbProStAT.setWebtags( "" );
      cmbAlbProStAT.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbProStAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbAlbProStAT.getItemCount() > 0 )
      {
         A13438AlbProStAT = (byte)(GXutil.lval( cmbAlbProStAT.getValidValue(GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
      }
      cmbAlbProEnvA.setName( "ALBPROENVA" );
      cmbAlbProEnvA.setWebtags( "" );
      cmbAlbProEnvA.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProEnvA.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      if ( cmbAlbProEnvA.getItemCount() > 0 )
      {
         A13435AlbProEnvA = cmbAlbProEnvA.getValidValue(A13435AlbProEnvA) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
      }
      GXCCtl = "ALBPROUND_" + sGXsfl_120_idx ;
      cmbAlbProUnd.setName( GXCCtl );
      cmbAlbProUnd.setWebtags( "" );
      cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
         n13444AlbProUnd = false ;
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

   public void valid_Albproid( )
   {
      GXt_date10 = A14399AlbProDtA ;
      GXv_date11[0] = GXt_date10 ;
      new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, GXv_date11) ;
      documentotransporteproveedor_1_2_impl.this.GXt_date10 = GXv_date11[0] ;
      A14399AlbProDtA = GXt_date10 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14399AlbProDtA", localUtil.format(A14399AlbProDtA, "99/99/99"));
   }

   public void valid_Albproprvi( )
   {
      n13420AlbProPrvN = false ;
      /* Using cursor T01UG24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
      }
      A13420AlbProPrvN = T01UG24_A13420AlbProPrvN[0] ;
      n13420AlbProPrvN = T01UG24_n13420AlbProPrvN[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", GXutil.rtrim( A13420AlbProPrvN));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01UG25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01UG25_A841TrnNom[0] ;
      n841TrnNom = T01UG25_n841TrnNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albproclic( )
   {
      /* Using cursor T01UG23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Cliente", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
      }
      A13426AlbProCliN = T01UG23_A13426AlbProCliN[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", GXutil.rtrim( A13426AlbProCliN));
   }

   public void valid_Catdocid( )
   {
      n13453CatDocID = false ;
      n13454CatDocNom = false ;
      /* Using cursor T01UG26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13453CatDocID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Categorias Documento Transporte", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDocID_Internalname ;
         }
      }
      A13454CatDocNom = T01UG26_A13454CatDocNom[0] ;
      n13454CatDocNom = T01UG26_n13454CatDocNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13454CatDocNom", GXutil.rtrim( A13454CatDocNom));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01UG34 */
      pr_default.execute(32, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01UG34_A718PrdNom[0] ;
      A704PrdExiAlm = T01UG34_A704PrdExiAlm[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV23AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV23AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'cmbAlbProStAT'},{av:'A13438AlbProStAT',fld:'ALBPROSTAT',pic:'9'},{av:'AV39Pgmname',fld:'vPGMNAME',pic:''},{av:'A13452AlbProInEx',fld:'ALBPROINEX',pic:'9'},{av:'A13429AlbProSal',fld:'ALBPROSAL',pic:'99/99/99 99:99'},{av:'A13437AlbProSta',fld:'ALBPROSTA',pic:'9'},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'A13433AlbProHh',fld:'ALBPROHH',pic:''},{av:'A13434AlbProHhCt',fld:'ALBPROHHCT',pic:''},{av:'cmbAlbProEnvA'},{av:'A13435AlbProEnvA',fld:'ALBPROENVA',pic:''},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:''},{av:'A13440AlbProAnul',fld:'ALBPROANUL',pic:''},{av:'A13441AlbProUltL',fld:'ALBPROULTL',pic:'ZZZ9'},{av:'A13579AlbProLC1',fld:'ALBPROLC1',pic:''},{av:'A13580AlbProLC2',fld:'ALBPROLC2',pic:''},{av:'A13581AlbProLC3',fld:'ALBPROLC3',pic:''},{av:'A13582AlbProLD1',fld:'ALBPROLD1',pic:''},{av:'A13583AlbProLD2',fld:'ALBPROLD2',pic:''},{av:'A13584AlbProLD3',fld:'ALBPROLD3',pic:''},{av:'A14190AlbProATCU',fld:'ALBPROATCU',pic:''},{av:'A14191AlbProSerA',fld:'ALBPROSERA',pic:''},{av:'A14192AlbProTipA',fld:'ALBPROTIPA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UG2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROID","{handler:'valid_Albproid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A14399AlbProDtA',fld:'ALBPRODTA',pic:''}]");
      setEventMetadata("VALID_ALBPROID",",oparms:[{av:'A14399AlbProDtA',fld:'ALBPRODTA',pic:''}]}");
      setEventMetadata("VALID_ALBPROPRVI","{handler:'valid_Albproprvi',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'A13420AlbProPrvN',fld:'ALBPROPRVN',pic:''}]");
      setEventMetadata("VALID_ALBPROPRVI",",oparms:[{av:'A13420AlbProPrvN',fld:'ALBPROPRVN',pic:''}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALIDV_COMBOALBPROPRVID","{handler:'validv_Comboalbproprvid',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBPROPRVID",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCLIC","{handler:'valid_Albproclic',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'A13426AlbProCliN',fld:'ALBPROCLIN',pic:''}]");
      setEventMetadata("VALID_ALBPROCLIC",",oparms:[{av:'A13426AlbProCliN',fld:'ALBPROCLIN',pic:''}]}");
      setEventMetadata("VALID_CATDOCID","{handler:'valid_Catdocid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13453CatDocID',fld:'CATDOCID',pic:'ZZZ9'},{av:'A13454CatDocNom',fld:'CATDOCNOM',pic:''}]");
      setEventMetadata("VALID_CATDOCID",",oparms:[{av:'A13454CatDocNom',fld:'CATDOCNOM',pic:''}]}");
      setEventMetadata("VALID_ALBPROLINE","{handler:'valid_Albproline',iparms:[]");
      setEventMetadata("VALID_ALBPROLINE",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("NULL","{handler:'valid_Albproobsl',iparms:[]");
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
      pr_default.close(32);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV8EmprCod = "" ;
      Z396EmprCod = "" ;
      Z13417AlbProTipo = "" ;
      Z13430AlbProDate = GXutil.nullDate() ;
      Z13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      Z13424AlbProMatr = "" ;
      Z13439AlbProObs = "" ;
      Z13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      Z13433AlbProHh = "" ;
      Z13434AlbProHhCt = "" ;
      Z13435AlbProEnvA = "" ;
      Z13436AlbProIDAT = "" ;
      Z13440AlbProAnul = "" ;
      Z13579AlbProLC1 = "" ;
      Z13580AlbProLC2 = "" ;
      Z13581AlbProLC3 = "" ;
      Z13582AlbProLD1 = "" ;
      Z13583AlbProLD2 = "" ;
      Z13584AlbProLD3 = "" ;
      Z14190AlbProATCU = "" ;
      Z14191AlbProSerA = "" ;
      Z14192AlbProTipA = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_albproprvid_Selectedvalue_get = "" ;
      Z13448AlbProDsc = "" ;
      Z13443AlbProCnt = DecimalUtil.ZERO ;
      Z13444AlbProUnd = "" ;
      Z13447AlbProObsL = "" ;
      Z13445AlbProNRef = "" ;
      Z13446AlbProVRef = "" ;
      Z13852AlbProPrvp = DecimalUtil.ZERO ;
      Z13853AlbProDto = DecimalUtil.ZERO ;
      Z14401AlbProLote = "" ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV8EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13435AlbProEnvA = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A14399AlbProDtA = GXutil.nullDate() ;
      lblTextblockalbproprvid_Jsonclick = "" ;
      ucCombo_albproprvid = new com.genexus.webpanels.GXUserControl();
      Combo_albproprvid_Caption = "" ;
      AV35AlbProPrvID_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV32TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A13424AlbProMatr = "" ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      ClassString = "" ;
      StyleString = "" ;
      A13439AlbProObs = "" ;
      AV22Msg_dev = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A13436AlbProIDAT = "" ;
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A14190AlbProATCU = "" ;
      A14376AlbProFm4d = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV39Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A13417AlbProTipo = "" ;
      Gridlevel_albproContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1839 = "" ;
      sStyleString = "" ;
      A13433AlbProHh = "" ;
      A13434AlbProHhCt = "" ;
      A13440AlbProAnul = "" ;
      A13579AlbProLC1 = "" ;
      A13580AlbProLC2 = "" ;
      A13581AlbProLC3 = "" ;
      A13582AlbProLD1 = "" ;
      A13583AlbProLD2 = "" ;
      A13584AlbProLD3 = "" ;
      A14191AlbProSerA = "" ;
      A14192AlbProTipA = "" ;
      A407EmprNom = "" ;
      A13426AlbProCliN = "" ;
      A13420AlbProPrvN = "" ;
      A841TrnNom = "" ;
      A13454CatDocNom = "" ;
      A13445AlbProNRef = "" ;
      A13446AlbProVRef = "" ;
      A13852AlbProPrvp = DecimalUtil.ZERO ;
      A13853AlbProDto = DecimalUtil.ZERO ;
      A14401AlbProLote = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      Combo_albproprvid_Objectcall = "" ;
      Combo_albproprvid_Class = "" ;
      Combo_albproprvid_Icontype = "" ;
      Combo_albproprvid_Icon = "" ;
      Combo_albproprvid_Tooltip = "" ;
      Combo_albproprvid_Selectedvalue_set = "" ;
      Combo_albproprvid_Selectedtext_set = "" ;
      Combo_albproprvid_Selectedtext_get = "" ;
      Combo_albproprvid_Gamoauthtoken = "" ;
      Combo_albproprvid_Ddointernalname = "" ;
      Combo_albproprvid_Titlecontrolalign = "" ;
      Combo_albproprvid_Dropdownoptionstype = "" ;
      Combo_albproprvid_Titlecontrolidtoreplace = "" ;
      Combo_albproprvid_Datalisttype = "" ;
      Combo_albproprvid_Datalistfixedvalues = "" ;
      Combo_albproprvid_Datalistproc = "" ;
      Combo_albproprvid_Datalistprocparametersprefix = "" ;
      Combo_albproprvid_Remoteservicesparameters = "" ;
      Combo_albproprvid_Htmltemplate = "" ;
      Combo_albproprvid_Multiplevaluestype = "" ;
      Combo_albproprvid_Loadingdata = "" ;
      Combo_albproprvid_Noresultsfound = "" ;
      Combo_albproprvid_Emptyitemtext = "" ;
      Combo_albproprvid_Onlyselectedvalues = "" ;
      Combo_albproprvid_Selectalltext = "" ;
      Combo_albproprvid_Multiplevaluesseparator = "" ;
      Combo_albproprvid_Addnewoptiontext = "" ;
      Combo_trncod_Objectcall = "" ;
      Combo_trncod_Class = "" ;
      Combo_trncod_Icontype = "" ;
      Combo_trncod_Icon = "" ;
      Combo_trncod_Tooltip = "" ;
      Combo_trncod_Selectedvalue_set = "" ;
      Combo_trncod_Selectedtext_set = "" ;
      Combo_trncod_Selectedtext_get = "" ;
      Combo_trncod_Gamoauthtoken = "" ;
      Combo_trncod_Ddointernalname = "" ;
      Combo_trncod_Titlecontrolalign = "" ;
      Combo_trncod_Dropdownoptionstype = "" ;
      Combo_trncod_Titlecontrolidtoreplace = "" ;
      Combo_trncod_Datalisttype = "" ;
      Combo_trncod_Datalistfixedvalues = "" ;
      Combo_trncod_Datalistproc = "" ;
      Combo_trncod_Datalistprocparametersprefix = "" ;
      Combo_trncod_Remoteservicesparameters = "" ;
      Combo_trncod_Htmltemplate = "" ;
      Combo_trncod_Multiplevaluestype = "" ;
      Combo_trncod_Loadingdata = "" ;
      Combo_trncod_Noresultsfound = "" ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1838 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13444AlbProUnd = "" ;
      A13447AlbProObsL = "" ;
      AV7Station = "" ;
      AV9EmprNom = "" ;
      AV10UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV21Msg_errAT = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV24WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV26WebSession = httpContext.getWebSession();
      AV31TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV33ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z13454CatDocNom = "" ;
      Z13420AlbProPrvN = "" ;
      Z13426AlbProCliN = "" ;
      Z841TrnNom = "" ;
      T01UG7_A407EmprNom = new String[] {""} ;
      T01UG7_n407EmprNom = new boolean[] {false} ;
      T01UG8_A13426AlbProCliN = new String[] {""} ;
      T01UG11_A13454CatDocNom = new String[] {""} ;
      T01UG11_n13454CatDocNom = new boolean[] {false} ;
      T01UG9_A13420AlbProPrvN = new String[] {""} ;
      T01UG9_n13420AlbProPrvN = new boolean[] {false} ;
      T01UG10_A841TrnNom = new String[] {""} ;
      T01UG10_n841TrnNom = new boolean[] {false} ;
      T01UG12_A13418AlbProID = new int[1] ;
      T01UG12_A407EmprNom = new String[] {""} ;
      T01UG12_n407EmprNom = new boolean[] {false} ;
      T01UG12_A13452AlbProInEx = new byte[1] ;
      T01UG12_A13417AlbProTipo = new String[] {""} ;
      T01UG12_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG12_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG12_A13454CatDocNom = new String[] {""} ;
      T01UG12_n13454CatDocNom = new boolean[] {false} ;
      T01UG12_A13420AlbProPrvN = new String[] {""} ;
      T01UG12_n13420AlbProPrvN = new boolean[] {false} ;
      T01UG12_A13426AlbProCliN = new String[] {""} ;
      T01UG12_A13427AlbProDomE = new byte[1] ;
      T01UG12_A841TrnNom = new String[] {""} ;
      T01UG12_n841TrnNom = new boolean[] {false} ;
      T01UG12_A13424AlbProMatr = new String[] {""} ;
      T01UG12_A13439AlbProObs = new String[] {""} ;
      T01UG12_A13437AlbProSta = new byte[1] ;
      T01UG12_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG12_A13433AlbProHh = new String[] {""} ;
      T01UG12_A13434AlbProHhCt = new String[] {""} ;
      T01UG12_A13435AlbProEnvA = new String[] {""} ;
      T01UG12_A13436AlbProIDAT = new String[] {""} ;
      T01UG12_A13438AlbProStAT = new byte[1] ;
      T01UG12_A13440AlbProAnul = new String[] {""} ;
      T01UG12_A13441AlbProUltL = new short[1] ;
      T01UG12_A13579AlbProLC1 = new String[] {""} ;
      T01UG12_A13580AlbProLC2 = new String[] {""} ;
      T01UG12_A13581AlbProLC3 = new String[] {""} ;
      T01UG12_A13582AlbProLD1 = new String[] {""} ;
      T01UG12_A13583AlbProLD2 = new String[] {""} ;
      T01UG12_A13584AlbProLD3 = new String[] {""} ;
      T01UG12_A14190AlbProATCU = new String[] {""} ;
      T01UG12_n14190AlbProATCU = new boolean[] {false} ;
      T01UG12_A14191AlbProSerA = new String[] {""} ;
      T01UG12_n14191AlbProSerA = new boolean[] {false} ;
      T01UG12_A14192AlbProTipA = new String[] {""} ;
      T01UG12_n14192AlbProTipA = new boolean[] {false} ;
      T01UG12_A396EmprCod = new String[] {""} ;
      T01UG12_A13425AlbProCliC = new int[1] ;
      T01UG12_A13419AlbProPrvI = new int[1] ;
      T01UG12_A840TrnCod = new short[1] ;
      T01UG12_n840TrnCod = new boolean[] {false} ;
      T01UG12_A13453CatDocID = new short[1] ;
      T01UG12_n13453CatDocID = new boolean[] {false} ;
      T01UG13_A13426AlbProCliN = new String[] {""} ;
      T01UG14_A13420AlbProPrvN = new String[] {""} ;
      T01UG14_n13420AlbProPrvN = new boolean[] {false} ;
      T01UG15_A841TrnNom = new String[] {""} ;
      T01UG15_n841TrnNom = new boolean[] {false} ;
      T01UG16_A13454CatDocNom = new String[] {""} ;
      T01UG16_n13454CatDocNom = new boolean[] {false} ;
      T01UG17_A396EmprCod = new String[] {""} ;
      T01UG17_A13418AlbProID = new int[1] ;
      T01UG6_A13418AlbProID = new int[1] ;
      T01UG6_A13452AlbProInEx = new byte[1] ;
      T01UG6_A13417AlbProTipo = new String[] {""} ;
      T01UG6_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG6_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG6_A13427AlbProDomE = new byte[1] ;
      T01UG6_A13424AlbProMatr = new String[] {""} ;
      T01UG6_A13439AlbProObs = new String[] {""} ;
      T01UG6_A13437AlbProSta = new byte[1] ;
      T01UG6_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG6_A13433AlbProHh = new String[] {""} ;
      T01UG6_A13434AlbProHhCt = new String[] {""} ;
      T01UG6_A13435AlbProEnvA = new String[] {""} ;
      T01UG6_A13436AlbProIDAT = new String[] {""} ;
      T01UG6_A13438AlbProStAT = new byte[1] ;
      T01UG6_A13440AlbProAnul = new String[] {""} ;
      T01UG6_A13441AlbProUltL = new short[1] ;
      T01UG6_A13579AlbProLC1 = new String[] {""} ;
      T01UG6_A13580AlbProLC2 = new String[] {""} ;
      T01UG6_A13581AlbProLC3 = new String[] {""} ;
      T01UG6_A13582AlbProLD1 = new String[] {""} ;
      T01UG6_A13583AlbProLD2 = new String[] {""} ;
      T01UG6_A13584AlbProLD3 = new String[] {""} ;
      T01UG6_A14190AlbProATCU = new String[] {""} ;
      T01UG6_n14190AlbProATCU = new boolean[] {false} ;
      T01UG6_A14191AlbProSerA = new String[] {""} ;
      T01UG6_n14191AlbProSerA = new boolean[] {false} ;
      T01UG6_A14192AlbProTipA = new String[] {""} ;
      T01UG6_n14192AlbProTipA = new boolean[] {false} ;
      T01UG6_A396EmprCod = new String[] {""} ;
      T01UG6_A13425AlbProCliC = new int[1] ;
      T01UG6_A13419AlbProPrvI = new int[1] ;
      T01UG6_A840TrnCod = new short[1] ;
      T01UG6_n840TrnCod = new boolean[] {false} ;
      T01UG6_A13453CatDocID = new short[1] ;
      T01UG6_n13453CatDocID = new boolean[] {false} ;
      T01UG18_A396EmprCod = new String[] {""} ;
      T01UG18_A13418AlbProID = new int[1] ;
      T01UG19_A396EmprCod = new String[] {""} ;
      T01UG19_A13418AlbProID = new int[1] ;
      T01UG5_A13418AlbProID = new int[1] ;
      T01UG5_A13452AlbProInEx = new byte[1] ;
      T01UG5_A13417AlbProTipo = new String[] {""} ;
      T01UG5_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG5_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG5_A13427AlbProDomE = new byte[1] ;
      T01UG5_A13424AlbProMatr = new String[] {""} ;
      T01UG5_A13439AlbProObs = new String[] {""} ;
      T01UG5_A13437AlbProSta = new byte[1] ;
      T01UG5_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      T01UG5_A13433AlbProHh = new String[] {""} ;
      T01UG5_A13434AlbProHhCt = new String[] {""} ;
      T01UG5_A13435AlbProEnvA = new String[] {""} ;
      T01UG5_A13436AlbProIDAT = new String[] {""} ;
      T01UG5_A13438AlbProStAT = new byte[1] ;
      T01UG5_A13440AlbProAnul = new String[] {""} ;
      T01UG5_A13441AlbProUltL = new short[1] ;
      T01UG5_A13579AlbProLC1 = new String[] {""} ;
      T01UG5_A13580AlbProLC2 = new String[] {""} ;
      T01UG5_A13581AlbProLC3 = new String[] {""} ;
      T01UG5_A13582AlbProLD1 = new String[] {""} ;
      T01UG5_A13583AlbProLD2 = new String[] {""} ;
      T01UG5_A13584AlbProLD3 = new String[] {""} ;
      T01UG5_A14190AlbProATCU = new String[] {""} ;
      T01UG5_n14190AlbProATCU = new boolean[] {false} ;
      T01UG5_A14191AlbProSerA = new String[] {""} ;
      T01UG5_n14191AlbProSerA = new boolean[] {false} ;
      T01UG5_A14192AlbProTipA = new String[] {""} ;
      T01UG5_n14192AlbProTipA = new boolean[] {false} ;
      T01UG5_A396EmprCod = new String[] {""} ;
      T01UG5_A13425AlbProCliC = new int[1] ;
      T01UG5_A13419AlbProPrvI = new int[1] ;
      T01UG5_A840TrnCod = new short[1] ;
      T01UG5_n840TrnCod = new boolean[] {false} ;
      T01UG5_A13453CatDocID = new short[1] ;
      T01UG5_n13453CatDocID = new boolean[] {false} ;
      T01UG23_A13426AlbProCliN = new String[] {""} ;
      T01UG24_A13420AlbProPrvN = new String[] {""} ;
      T01UG24_n13420AlbProPrvN = new boolean[] {false} ;
      T01UG25_A841TrnNom = new String[] {""} ;
      T01UG25_n841TrnNom = new boolean[] {false} ;
      T01UG26_A13454CatDocNom = new String[] {""} ;
      T01UG26_n13454CatDocNom = new boolean[] {false} ;
      T01UG27_A396EmprCod = new String[] {""} ;
      T01UG27_A13418AlbProID = new int[1] ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      T01UG28_A13418AlbProID = new int[1] ;
      T01UG28_A13442AlbProLine = new short[1] ;
      T01UG28_A13448AlbProDsc = new String[] {""} ;
      T01UG28_n13448AlbProDsc = new boolean[] {false} ;
      T01UG28_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG28_n13443AlbProCnt = new boolean[] {false} ;
      T01UG28_A13444AlbProUnd = new String[] {""} ;
      T01UG28_n13444AlbProUnd = new boolean[] {false} ;
      T01UG28_A13449AlbProCaja = new short[1] ;
      T01UG28_n13449AlbProCaja = new boolean[] {false} ;
      T01UG28_A13447AlbProObsL = new String[] {""} ;
      T01UG28_n13447AlbProObsL = new boolean[] {false} ;
      T01UG28_A718PrdNom = new String[] {""} ;
      T01UG28_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG28_A13445AlbProNRef = new String[] {""} ;
      T01UG28_n13445AlbProNRef = new boolean[] {false} ;
      T01UG28_A13446AlbProVRef = new String[] {""} ;
      T01UG28_n13446AlbProVRef = new boolean[] {false} ;
      T01UG28_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG28_n13852AlbProPrvp = new boolean[] {false} ;
      T01UG28_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG28_n13853AlbProDto = new boolean[] {false} ;
      T01UG28_A14401AlbProLote = new String[] {""} ;
      T01UG28_n14401AlbProLote = new boolean[] {false} ;
      T01UG28_A396EmprCod = new String[] {""} ;
      T01UG28_A719PrdNum = new String[] {""} ;
      T01UG4_A718PrdNom = new String[] {""} ;
      T01UG4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG29_A718PrdNom = new String[] {""} ;
      T01UG29_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG30_A396EmprCod = new String[] {""} ;
      T01UG30_A13418AlbProID = new int[1] ;
      T01UG30_A13442AlbProLine = new short[1] ;
      T01UG3_A13418AlbProID = new int[1] ;
      T01UG3_A13442AlbProLine = new short[1] ;
      T01UG3_A13448AlbProDsc = new String[] {""} ;
      T01UG3_n13448AlbProDsc = new boolean[] {false} ;
      T01UG3_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG3_n13443AlbProCnt = new boolean[] {false} ;
      T01UG3_A13444AlbProUnd = new String[] {""} ;
      T01UG3_n13444AlbProUnd = new boolean[] {false} ;
      T01UG3_A13449AlbProCaja = new short[1] ;
      T01UG3_n13449AlbProCaja = new boolean[] {false} ;
      T01UG3_A13447AlbProObsL = new String[] {""} ;
      T01UG3_n13447AlbProObsL = new boolean[] {false} ;
      T01UG3_A13445AlbProNRef = new String[] {""} ;
      T01UG3_n13445AlbProNRef = new boolean[] {false} ;
      T01UG3_A13446AlbProVRef = new String[] {""} ;
      T01UG3_n13446AlbProVRef = new boolean[] {false} ;
      T01UG3_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG3_n13852AlbProPrvp = new boolean[] {false} ;
      T01UG3_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG3_n13853AlbProDto = new boolean[] {false} ;
      T01UG3_A14401AlbProLote = new String[] {""} ;
      T01UG3_n14401AlbProLote = new boolean[] {false} ;
      T01UG3_A396EmprCod = new String[] {""} ;
      T01UG3_A719PrdNum = new String[] {""} ;
      T01UG2_A13418AlbProID = new int[1] ;
      T01UG2_A13442AlbProLine = new short[1] ;
      T01UG2_A13448AlbProDsc = new String[] {""} ;
      T01UG2_n13448AlbProDsc = new boolean[] {false} ;
      T01UG2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG2_n13443AlbProCnt = new boolean[] {false} ;
      T01UG2_A13444AlbProUnd = new String[] {""} ;
      T01UG2_n13444AlbProUnd = new boolean[] {false} ;
      T01UG2_A13449AlbProCaja = new short[1] ;
      T01UG2_n13449AlbProCaja = new boolean[] {false} ;
      T01UG2_A13447AlbProObsL = new String[] {""} ;
      T01UG2_n13447AlbProObsL = new boolean[] {false} ;
      T01UG2_A13445AlbProNRef = new String[] {""} ;
      T01UG2_n13445AlbProNRef = new boolean[] {false} ;
      T01UG2_A13446AlbProVRef = new String[] {""} ;
      T01UG2_n13446AlbProVRef = new boolean[] {false} ;
      T01UG2_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG2_n13852AlbProPrvp = new boolean[] {false} ;
      T01UG2_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG2_n13853AlbProDto = new boolean[] {false} ;
      T01UG2_A14401AlbProLote = new String[] {""} ;
      T01UG2_n14401AlbProLote = new boolean[] {false} ;
      T01UG2_A396EmprCod = new String[] {""} ;
      T01UG2_A719PrdNum = new String[] {""} ;
      T01UG34_A718PrdNom = new String[] {""} ;
      T01UG34_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UG35_A396EmprCod = new String[] {""} ;
      T01UG35_A13418AlbProID = new int[1] ;
      T01UG35_A13442AlbProLine = new short[1] ;
      Gridlevel_albproRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_albpro_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_albproColumn = new com.genexus.webpanels.GXWebColumn();
      GXt_date10 = GXutil.nullDate() ;
      GXv_date11 = new java.util.Date[1] ;
      Z14399AlbProDtA = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1_2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1_2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1_2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1_2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1_2__default(),
         new Object[] {
             new Object[] {
            T01UG2_A13418AlbProID, T01UG2_A13442AlbProLine, T01UG2_A13448AlbProDsc, T01UG2_n13448AlbProDsc, T01UG2_A13443AlbProCnt, T01UG2_n13443AlbProCnt, T01UG2_A13444AlbProUnd, T01UG2_n13444AlbProUnd, T01UG2_A13449AlbProCaja, T01UG2_n13449AlbProCaja,
            T01UG2_A13447AlbProObsL, T01UG2_n13447AlbProObsL, T01UG2_A13445AlbProNRef, T01UG2_n13445AlbProNRef, T01UG2_A13446AlbProVRef, T01UG2_n13446AlbProVRef, T01UG2_A13852AlbProPrvp, T01UG2_n13852AlbProPrvp, T01UG2_A13853AlbProDto, T01UG2_n13853AlbProDto,
            T01UG2_A14401AlbProLote, T01UG2_n14401AlbProLote, T01UG2_A396EmprCod, T01UG2_A719PrdNum
            }
            , new Object[] {
            T01UG3_A13418AlbProID, T01UG3_A13442AlbProLine, T01UG3_A13448AlbProDsc, T01UG3_n13448AlbProDsc, T01UG3_A13443AlbProCnt, T01UG3_n13443AlbProCnt, T01UG3_A13444AlbProUnd, T01UG3_n13444AlbProUnd, T01UG3_A13449AlbProCaja, T01UG3_n13449AlbProCaja,
            T01UG3_A13447AlbProObsL, T01UG3_n13447AlbProObsL, T01UG3_A13445AlbProNRef, T01UG3_n13445AlbProNRef, T01UG3_A13446AlbProVRef, T01UG3_n13446AlbProVRef, T01UG3_A13852AlbProPrvp, T01UG3_n13852AlbProPrvp, T01UG3_A13853AlbProDto, T01UG3_n13853AlbProDto,
            T01UG3_A14401AlbProLote, T01UG3_n14401AlbProLote, T01UG3_A396EmprCod, T01UG3_A719PrdNum
            }
            , new Object[] {
            T01UG4_A718PrdNom, T01UG4_A704PrdExiAlm
            }
            , new Object[] {
            T01UG5_A13418AlbProID, T01UG5_A13452AlbProInEx, T01UG5_A13417AlbProTipo, T01UG5_A13430AlbProDate, T01UG5_A13429AlbProSal, T01UG5_A13427AlbProDomE, T01UG5_A13424AlbProMatr, T01UG5_A13439AlbProObs, T01UG5_A13437AlbProSta, T01UG5_A13431AlbProSys,
            T01UG5_A13433AlbProHh, T01UG5_A13434AlbProHhCt, T01UG5_A13435AlbProEnvA, T01UG5_A13436AlbProIDAT, T01UG5_A13438AlbProStAT, T01UG5_A13440AlbProAnul, T01UG5_A13441AlbProUltL, T01UG5_A13579AlbProLC1, T01UG5_A13580AlbProLC2, T01UG5_A13581AlbProLC3,
            T01UG5_A13582AlbProLD1, T01UG5_A13583AlbProLD2, T01UG5_A13584AlbProLD3, T01UG5_A14190AlbProATCU, T01UG5_n14190AlbProATCU, T01UG5_A14191AlbProSerA, T01UG5_n14191AlbProSerA, T01UG5_A14192AlbProTipA, T01UG5_n14192AlbProTipA, T01UG5_A396EmprCod,
            T01UG5_A13425AlbProCliC, T01UG5_A13419AlbProPrvI, T01UG5_A840TrnCod, T01UG5_n840TrnCod, T01UG5_A13453CatDocID, T01UG5_n13453CatDocID
            }
            , new Object[] {
            T01UG6_A13418AlbProID, T01UG6_A13452AlbProInEx, T01UG6_A13417AlbProTipo, T01UG6_A13430AlbProDate, T01UG6_A13429AlbProSal, T01UG6_A13427AlbProDomE, T01UG6_A13424AlbProMatr, T01UG6_A13439AlbProObs, T01UG6_A13437AlbProSta, T01UG6_A13431AlbProSys,
            T01UG6_A13433AlbProHh, T01UG6_A13434AlbProHhCt, T01UG6_A13435AlbProEnvA, T01UG6_A13436AlbProIDAT, T01UG6_A13438AlbProStAT, T01UG6_A13440AlbProAnul, T01UG6_A13441AlbProUltL, T01UG6_A13579AlbProLC1, T01UG6_A13580AlbProLC2, T01UG6_A13581AlbProLC3,
            T01UG6_A13582AlbProLD1, T01UG6_A13583AlbProLD2, T01UG6_A13584AlbProLD3, T01UG6_A14190AlbProATCU, T01UG6_n14190AlbProATCU, T01UG6_A14191AlbProSerA, T01UG6_n14191AlbProSerA, T01UG6_A14192AlbProTipA, T01UG6_n14192AlbProTipA, T01UG6_A396EmprCod,
            T01UG6_A13425AlbProCliC, T01UG6_A13419AlbProPrvI, T01UG6_A840TrnCod, T01UG6_n840TrnCod, T01UG6_A13453CatDocID, T01UG6_n13453CatDocID
            }
            , new Object[] {
            T01UG7_A407EmprNom, T01UG7_n407EmprNom
            }
            , new Object[] {
            T01UG8_A13426AlbProCliN
            }
            , new Object[] {
            T01UG9_A13420AlbProPrvN, T01UG9_n13420AlbProPrvN
            }
            , new Object[] {
            T01UG10_A841TrnNom, T01UG10_n841TrnNom
            }
            , new Object[] {
            T01UG11_A13454CatDocNom, T01UG11_n13454CatDocNom
            }
            , new Object[] {
            T01UG12_A13418AlbProID, T01UG12_A407EmprNom, T01UG12_n407EmprNom, T01UG12_A13452AlbProInEx, T01UG12_A13417AlbProTipo, T01UG12_A13430AlbProDate, T01UG12_A13429AlbProSal, T01UG12_A13454CatDocNom, T01UG12_n13454CatDocNom, T01UG12_A13420AlbProPrvN,
            T01UG12_n13420AlbProPrvN, T01UG12_A13426AlbProCliN, T01UG12_A13427AlbProDomE, T01UG12_A841TrnNom, T01UG12_n841TrnNom, T01UG12_A13424AlbProMatr, T01UG12_A13439AlbProObs, T01UG12_A13437AlbProSta, T01UG12_A13431AlbProSys, T01UG12_A13433AlbProHh,
            T01UG12_A13434AlbProHhCt, T01UG12_A13435AlbProEnvA, T01UG12_A13436AlbProIDAT, T01UG12_A13438AlbProStAT, T01UG12_A13440AlbProAnul, T01UG12_A13441AlbProUltL, T01UG12_A13579AlbProLC1, T01UG12_A13580AlbProLC2, T01UG12_A13581AlbProLC3, T01UG12_A13582AlbProLD1,
            T01UG12_A13583AlbProLD2, T01UG12_A13584AlbProLD3, T01UG12_A14190AlbProATCU, T01UG12_n14190AlbProATCU, T01UG12_A14191AlbProSerA, T01UG12_n14191AlbProSerA, T01UG12_A14192AlbProTipA, T01UG12_n14192AlbProTipA, T01UG12_A396EmprCod, T01UG12_A13425AlbProCliC,
            T01UG12_A13419AlbProPrvI, T01UG12_A840TrnCod, T01UG12_n840TrnCod, T01UG12_A13453CatDocID, T01UG12_n13453CatDocID
            }
            , new Object[] {
            T01UG13_A13426AlbProCliN
            }
            , new Object[] {
            T01UG14_A13420AlbProPrvN, T01UG14_n13420AlbProPrvN
            }
            , new Object[] {
            T01UG15_A841TrnNom, T01UG15_n841TrnNom
            }
            , new Object[] {
            T01UG16_A13454CatDocNom, T01UG16_n13454CatDocNom
            }
            , new Object[] {
            T01UG17_A396EmprCod, T01UG17_A13418AlbProID
            }
            , new Object[] {
            T01UG18_A396EmprCod, T01UG18_A13418AlbProID
            }
            , new Object[] {
            T01UG19_A396EmprCod, T01UG19_A13418AlbProID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UG23_A13426AlbProCliN
            }
            , new Object[] {
            T01UG24_A13420AlbProPrvN, T01UG24_n13420AlbProPrvN
            }
            , new Object[] {
            T01UG25_A841TrnNom, T01UG25_n841TrnNom
            }
            , new Object[] {
            T01UG26_A13454CatDocNom, T01UG26_n13454CatDocNom
            }
            , new Object[] {
            T01UG27_A396EmprCod, T01UG27_A13418AlbProID
            }
            , new Object[] {
            T01UG28_A13418AlbProID, T01UG28_A13442AlbProLine, T01UG28_A13448AlbProDsc, T01UG28_n13448AlbProDsc, T01UG28_A13443AlbProCnt, T01UG28_n13443AlbProCnt, T01UG28_A13444AlbProUnd, T01UG28_n13444AlbProUnd, T01UG28_A13449AlbProCaja, T01UG28_n13449AlbProCaja,
            T01UG28_A13447AlbProObsL, T01UG28_n13447AlbProObsL, T01UG28_A718PrdNom, T01UG28_A704PrdExiAlm, T01UG28_A13445AlbProNRef, T01UG28_n13445AlbProNRef, T01UG28_A13446AlbProVRef, T01UG28_n13446AlbProVRef, T01UG28_A13852AlbProPrvp, T01UG28_n13852AlbProPrvp,
            T01UG28_A13853AlbProDto, T01UG28_n13853AlbProDto, T01UG28_A14401AlbProLote, T01UG28_n14401AlbProLote, T01UG28_A396EmprCod, T01UG28_A719PrdNum
            }
            , new Object[] {
            T01UG29_A718PrdNom, T01UG29_A704PrdExiAlm
            }
            , new Object[] {
            T01UG30_A396EmprCod, T01UG30_A13418AlbProID, T01UG30_A13442AlbProLine
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UG34_A718PrdNom, T01UG34_A704PrdExiAlm
            }
            , new Object[] {
            T01UG35_A396EmprCod, T01UG35_A13418AlbProID, T01UG35_A13442AlbProLine
            }
         }
      );
      AV39Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_1_2" ;
   }

   private byte Z13452AlbProInEx ;
   private byte Z13427AlbProDomE ;
   private byte Z13437AlbProSta ;
   private byte Z13438AlbProStAT ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13438AlbProStAT ;
   private byte A13427AlbProDomE ;
   private byte A13452AlbProInEx ;
   private byte A13437AlbProSta ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGridlevel_albpro_Backcolorstyle ;
   private byte subGridlevel_albpro_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_albpro_Allowselection ;
   private byte subGridlevel_albpro_Allowhovering ;
   private byte subGridlevel_albpro_Allowcollapsing ;
   private byte subGridlevel_albpro_Collapsed ;
   private short Z13441AlbProUltL ;
   private short Z840TrnCod ;
   private short Z13453CatDocID ;
   private short N13453CatDocID ;
   private short N840TrnCod ;
   private short Z13442AlbProLine ;
   private short Z13449AlbProCaja ;
   private short nRcdDeleted_1839 ;
   private short nRcdExists_1839 ;
   private short nIsMod_1839 ;
   private short A840TrnCod ;
   private short A13453CatDocID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV34ComboTrnCod ;
   private short nBlankRcdCount1839 ;
   private short RcdFound1839 ;
   private short nBlankRcdUsr1839 ;
   private short A13441AlbProUltL ;
   private short AV27Insert_CatDocID ;
   private short AV30Insert_TrnCod ;
   private short RcdFound1838 ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short AV11FirmaD ;
   private short AV12cernum ;
   private short AV13RemTra ;
   private short AV14TraExt ;
   private short AV15Ws ;
   private short AV16Modhh ;
   private short AV17Ctrlf ;
   private short AV18DevCant ;
   private short AV19Endutex ;
   private short AV20soloProveedor ;
   private short nIsDirty_1838 ;
   private short nIsDirty_1839 ;
   private int wcpOAV23AlbProID ;
   private int Z13418AlbProID ;
   private int Z13425AlbProCliC ;
   private int Z13419AlbProPrvI ;
   private int nRC_GXsfl_120 ;
   private int nGXsfl_120_idx=1 ;
   private int N13419AlbProPrvI ;
   private int N13425AlbProCliC ;
   private int A13418AlbProID ;
   private int A13425AlbProCliC ;
   private int A13419AlbProPrvI ;
   private int AV23AlbProID ;
   private int trnEnded ;
   private int edtAlbProID_Enabled ;
   private int edtAlbProDate_Enabled ;
   private int edtAlbProDtA_Enabled ;
   private int edtAlbProPrvI_Visible ;
   private int edtAlbProPrvI_Enabled ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtAlbProMatr_Enabled ;
   private int edtAlbProSal_Enabled ;
   private int edtAlbProObs_Enabled ;
   private int edtavMsg_dev_Enabled ;
   private int edtAlbProIDAT_Enabled ;
   private int edtAlbProSys_Enabled ;
   private int edtAlbProATCU_Enabled ;
   private int edtAlbProFm4d_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV36ComboAlbProPrvID ;
   private int edtavComboalbproprvid_Enabled ;
   private int edtavComboalbproprvid_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtAlbProCliC_Visible ;
   private int edtAlbProCliC_Enabled ;
   private int edtAlbProDomE_Enabled ;
   private int edtAlbProDomE_Visible ;
   private int edtAlbProTipo_Visible ;
   private int edtAlbProTipo_Enabled ;
   private int edtCatDocID_Visible ;
   private int edtCatDocID_Enabled ;
   private int edtAlbProLine_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtAlbProDsc_Enabled ;
   private int edtAlbProCnt_Enabled ;
   private int edtAlbProCaja_Enabled ;
   private int edtAlbProObsL_Enabled ;
   private int fRowAdded ;
   private int AV28Insert_AlbProPrvID ;
   private int AV29Insert_AlbProCliCod ;
   private int Combo_albproprvid_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV40GXV1 ;
   private int GX_JID ;
   private int subGridlevel_albpro_Backcolor ;
   private int subGridlevel_albpro_Allbackcolor ;
   private int defedtAlbProLine_Enabled ;
   private int idxLst ;
   private int subGridlevel_albpro_Selectedindex ;
   private int subGridlevel_albpro_Selectioncolor ;
   private int subGridlevel_albpro_Hoveringcolor ;
   private long GRIDLEVEL_ALBPRO_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13443AlbProCnt ;
   private java.math.BigDecimal Z13852AlbProPrvp ;
   private java.math.BigDecimal Z13853AlbProDto ;
   private java.math.BigDecimal A13852AlbProPrvp ;
   private java.math.BigDecimal A13853AlbProDto ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV8EmprCod ;
   private String Z396EmprCod ;
   private String Z13417AlbProTipo ;
   private String Z13424AlbProMatr ;
   private String Z13435AlbProEnvA ;
   private String Z13436AlbProIDAT ;
   private String Z13440AlbProAnul ;
   private String Z13579AlbProLC1 ;
   private String Z13580AlbProLC2 ;
   private String Z13581AlbProLC3 ;
   private String Z13582AlbProLD1 ;
   private String Z13583AlbProLD2 ;
   private String Z13584AlbProLD3 ;
   private String Z14190AlbProATCU ;
   private String Z14191AlbProSerA ;
   private String Z14192AlbProTipA ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_albproprvid_Selectedvalue_get ;
   private String Z13448AlbProDsc ;
   private String Z13444AlbProUnd ;
   private String Z13447AlbProObsL ;
   private String Z13445AlbProNRef ;
   private String Z13446AlbProVRef ;
   private String Z14401AlbProLote ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV8EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProID_Internalname ;
   private String sGXsfl_120_idx="0001" ;
   private String A13435AlbProEnvA ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtAlbProID_Jsonclick ;
   private String edtAlbProDate_Internalname ;
   private String edtAlbProDate_Jsonclick ;
   private String edtAlbProDtA_Internalname ;
   private String edtAlbProDtA_Jsonclick ;
   private String divTablesplittedalbproprvid_Internalname ;
   private String lblTextblockalbproprvid_Internalname ;
   private String lblTextblockalbproprvid_Jsonclick ;
   private String Combo_albproprvid_Caption ;
   private String Combo_albproprvid_Cls ;
   private String Combo_albproprvid_Internalname ;
   private String edtAlbProPrvI_Internalname ;
   private String edtAlbProPrvI_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbProMatr_Internalname ;
   private String A13424AlbProMatr ;
   private String edtAlbProMatr_Jsonclick ;
   private String edtAlbProSal_Internalname ;
   private String edtAlbProSal_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtAlbProObs_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtavMsg_dev_Internalname ;
   private String edtavMsg_dev_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbProIDAT_Internalname ;
   private String A13436AlbProIDAT ;
   private String edtAlbProIDAT_Jsonclick ;
   private String edtAlbProSys_Internalname ;
   private String edtAlbProSys_Jsonclick ;
   private String edtAlbProATCU_Internalname ;
   private String A14190AlbProATCU ;
   private String edtAlbProATCU_Jsonclick ;
   private String edtAlbProFm4d_Internalname ;
   private String A14376AlbProFm4d ;
   private String edtAlbProFm4d_Jsonclick ;
   private String divTableleaflevel_albpro_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV39Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_albproprvid_Internalname ;
   private String edtavComboalbproprvid_Internalname ;
   private String edtavComboalbproprvid_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String edtAlbProCliC_Internalname ;
   private String edtAlbProCliC_Jsonclick ;
   private String edtAlbProDomE_Internalname ;
   private String edtAlbProDomE_Jsonclick ;
   private String edtAlbProTipo_Internalname ;
   private String A13417AlbProTipo ;
   private String edtAlbProTipo_Jsonclick ;
   private String edtCatDocID_Internalname ;
   private String edtCatDocID_Jsonclick ;
   private String sMode1839 ;
   private String edtAlbProLine_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtAlbProDsc_Internalname ;
   private String edtAlbProCnt_Internalname ;
   private String edtAlbProCaja_Internalname ;
   private String edtAlbProObsL_Internalname ;
   private String sStyleString ;
   private String subGridlevel_albpro_Internalname ;
   private String A13440AlbProAnul ;
   private String A13579AlbProLC1 ;
   private String A13580AlbProLC2 ;
   private String A13581AlbProLC3 ;
   private String A13582AlbProLD1 ;
   private String A13583AlbProLD2 ;
   private String A13584AlbProLD3 ;
   private String A14191AlbProSerA ;
   private String A14192AlbProTipA ;
   private String A407EmprNom ;
   private String A13426AlbProCliN ;
   private String A13420AlbProPrvN ;
   private String A841TrnNom ;
   private String A13454CatDocNom ;
   private String A13445AlbProNRef ;
   private String A13446AlbProVRef ;
   private String A14401AlbProLote ;
   private String A718PrdNom ;
   private String Combo_albproprvid_Objectcall ;
   private String Combo_albproprvid_Class ;
   private String Combo_albproprvid_Icontype ;
   private String Combo_albproprvid_Icon ;
   private String Combo_albproprvid_Tooltip ;
   private String Combo_albproprvid_Selectedvalue_set ;
   private String Combo_albproprvid_Selectedtext_set ;
   private String Combo_albproprvid_Selectedtext_get ;
   private String Combo_albproprvid_Gamoauthtoken ;
   private String Combo_albproprvid_Ddointernalname ;
   private String Combo_albproprvid_Titlecontrolalign ;
   private String Combo_albproprvid_Dropdownoptionstype ;
   private String Combo_albproprvid_Titlecontrolidtoreplace ;
   private String Combo_albproprvid_Datalisttype ;
   private String Combo_albproprvid_Datalistfixedvalues ;
   private String Combo_albproprvid_Datalistproc ;
   private String Combo_albproprvid_Datalistprocparametersprefix ;
   private String Combo_albproprvid_Remoteservicesparameters ;
   private String Combo_albproprvid_Htmltemplate ;
   private String Combo_albproprvid_Multiplevaluestype ;
   private String Combo_albproprvid_Loadingdata ;
   private String Combo_albproprvid_Noresultsfound ;
   private String Combo_albproprvid_Emptyitemtext ;
   private String Combo_albproprvid_Onlyselectedvalues ;
   private String Combo_albproprvid_Selectalltext ;
   private String Combo_albproprvid_Multiplevaluesseparator ;
   private String Combo_albproprvid_Addnewoptiontext ;
   private String Combo_trncod_Objectcall ;
   private String Combo_trncod_Class ;
   private String Combo_trncod_Icontype ;
   private String Combo_trncod_Icon ;
   private String Combo_trncod_Tooltip ;
   private String Combo_trncod_Selectedvalue_set ;
   private String Combo_trncod_Selectedtext_set ;
   private String Combo_trncod_Selectedtext_get ;
   private String Combo_trncod_Gamoauthtoken ;
   private String Combo_trncod_Ddointernalname ;
   private String Combo_trncod_Titlecontrolalign ;
   private String Combo_trncod_Dropdownoptionstype ;
   private String Combo_trncod_Titlecontrolidtoreplace ;
   private String Combo_trncod_Datalisttype ;
   private String Combo_trncod_Datalistfixedvalues ;
   private String Combo_trncod_Datalistproc ;
   private String Combo_trncod_Datalistprocparametersprefix ;
   private String Combo_trncod_Remoteservicesparameters ;
   private String Combo_trncod_Htmltemplate ;
   private String Combo_trncod_Multiplevaluestype ;
   private String Combo_trncod_Loadingdata ;
   private String Combo_trncod_Noresultsfound ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1838 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A13448AlbProDsc ;
   private String A13444AlbProUnd ;
   private String A13447AlbProObsL ;
   private String AV7Station ;
   private String AV9EmprNom ;
   private String AV10UsurCod ;
   private String AV21Msg_errAT ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z13454CatDocNom ;
   private String Z13420AlbProPrvN ;
   private String Z13426AlbProCliN ;
   private String Z841TrnNom ;
   private String Z718PrdNom ;
   private String sGXsfl_120_fel_idx="0001" ;
   private String subGridlevel_albpro_Class ;
   private String subGridlevel_albpro_Linesclass ;
   private String ROClassString ;
   private String edtAlbProLine_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtAlbProDsc_Jsonclick ;
   private String edtAlbProCnt_Jsonclick ;
   private String edtAlbProCaja_Jsonclick ;
   private String edtAlbProObsL_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_albpro_Header ;
   private java.util.Date Z13429AlbProSal ;
   private java.util.Date Z13431AlbProSys ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date Z13430AlbProDate ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date A14399AlbProDtA ;
   private java.util.Date GXt_date10 ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date Z14399AlbProDtA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean n13453CatDocID ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_albproprvid_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean bGXsfl_120_Refreshing=false ;
   private boolean n14191AlbProSerA ;
   private boolean n14192AlbProTipA ;
   private boolean n407EmprNom ;
   private boolean n13420AlbProPrvN ;
   private boolean n841TrnNom ;
   private boolean n13454CatDocNom ;
   private boolean n13445AlbProNRef ;
   private boolean n13446AlbProVRef ;
   private boolean n13852AlbProPrvp ;
   private boolean n13853AlbProDto ;
   private boolean n14401AlbProLote ;
   private boolean Combo_albproprvid_Enabled ;
   private boolean Combo_albproprvid_Visible ;
   private boolean Combo_albproprvid_Allowmultipleselection ;
   private boolean Combo_albproprvid_Isgriditem ;
   private boolean Combo_albproprvid_Hasdescription ;
   private boolean Combo_albproprvid_Includeonlyselectedoption ;
   private boolean Combo_albproprvid_Includeselectalloption ;
   private boolean Combo_albproprvid_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n14190AlbProATCU ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n13448AlbProDsc ;
   private boolean n13443AlbProCnt ;
   private boolean n13444AlbProUnd ;
   private boolean n13449AlbProCaja ;
   private boolean n13447AlbProObsL ;
   private String Z13439AlbProObs ;
   private String Z13433AlbProHh ;
   private String Z13434AlbProHhCt ;
   private String A13439AlbProObs ;
   private String AV22Msg_dev ;
   private String A13433AlbProHh ;
   private String A13434AlbProHhCt ;
   private String AV33ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_albproContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_albproRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_albproColumn ;
   private com.genexus.webpanels.WebSession AV26WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_albproprvid ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbProStAT ;
   private HTMLChoice cmbAlbProEnvA ;
   private HTMLChoice cmbAlbProUnd ;
   private IDataStoreProvider pr_default ;
   private String[] T01UG7_A407EmprNom ;
   private boolean[] T01UG7_n407EmprNom ;
   private String[] T01UG8_A13426AlbProCliN ;
   private String[] T01UG11_A13454CatDocNom ;
   private boolean[] T01UG11_n13454CatDocNom ;
   private String[] T01UG9_A13420AlbProPrvN ;
   private boolean[] T01UG9_n13420AlbProPrvN ;
   private String[] T01UG10_A841TrnNom ;
   private boolean[] T01UG10_n841TrnNom ;
   private int[] T01UG12_A13418AlbProID ;
   private String[] T01UG12_A407EmprNom ;
   private boolean[] T01UG12_n407EmprNom ;
   private byte[] T01UG12_A13452AlbProInEx ;
   private String[] T01UG12_A13417AlbProTipo ;
   private java.util.Date[] T01UG12_A13430AlbProDate ;
   private java.util.Date[] T01UG12_A13429AlbProSal ;
   private String[] T01UG12_A13454CatDocNom ;
   private boolean[] T01UG12_n13454CatDocNom ;
   private String[] T01UG12_A13420AlbProPrvN ;
   private boolean[] T01UG12_n13420AlbProPrvN ;
   private String[] T01UG12_A13426AlbProCliN ;
   private byte[] T01UG12_A13427AlbProDomE ;
   private String[] T01UG12_A841TrnNom ;
   private boolean[] T01UG12_n841TrnNom ;
   private String[] T01UG12_A13424AlbProMatr ;
   private String[] T01UG12_A13439AlbProObs ;
   private byte[] T01UG12_A13437AlbProSta ;
   private java.util.Date[] T01UG12_A13431AlbProSys ;
   private String[] T01UG12_A13433AlbProHh ;
   private String[] T01UG12_A13434AlbProHhCt ;
   private String[] T01UG12_A13435AlbProEnvA ;
   private String[] T01UG12_A13436AlbProIDAT ;
   private byte[] T01UG12_A13438AlbProStAT ;
   private String[] T01UG12_A13440AlbProAnul ;
   private short[] T01UG12_A13441AlbProUltL ;
   private String[] T01UG12_A13579AlbProLC1 ;
   private String[] T01UG12_A13580AlbProLC2 ;
   private String[] T01UG12_A13581AlbProLC3 ;
   private String[] T01UG12_A13582AlbProLD1 ;
   private String[] T01UG12_A13583AlbProLD2 ;
   private String[] T01UG12_A13584AlbProLD3 ;
   private String[] T01UG12_A14190AlbProATCU ;
   private boolean[] T01UG12_n14190AlbProATCU ;
   private String[] T01UG12_A14191AlbProSerA ;
   private boolean[] T01UG12_n14191AlbProSerA ;
   private String[] T01UG12_A14192AlbProTipA ;
   private boolean[] T01UG12_n14192AlbProTipA ;
   private String[] T01UG12_A396EmprCod ;
   private int[] T01UG12_A13425AlbProCliC ;
   private int[] T01UG12_A13419AlbProPrvI ;
   private short[] T01UG12_A840TrnCod ;
   private boolean[] T01UG12_n840TrnCod ;
   private short[] T01UG12_A13453CatDocID ;
   private boolean[] T01UG12_n13453CatDocID ;
   private String[] T01UG13_A13426AlbProCliN ;
   private String[] T01UG14_A13420AlbProPrvN ;
   private boolean[] T01UG14_n13420AlbProPrvN ;
   private String[] T01UG15_A841TrnNom ;
   private boolean[] T01UG15_n841TrnNom ;
   private String[] T01UG16_A13454CatDocNom ;
   private boolean[] T01UG16_n13454CatDocNom ;
   private String[] T01UG17_A396EmprCod ;
   private int[] T01UG17_A13418AlbProID ;
   private int[] T01UG6_A13418AlbProID ;
   private byte[] T01UG6_A13452AlbProInEx ;
   private String[] T01UG6_A13417AlbProTipo ;
   private java.util.Date[] T01UG6_A13430AlbProDate ;
   private java.util.Date[] T01UG6_A13429AlbProSal ;
   private byte[] T01UG6_A13427AlbProDomE ;
   private String[] T01UG6_A13424AlbProMatr ;
   private String[] T01UG6_A13439AlbProObs ;
   private byte[] T01UG6_A13437AlbProSta ;
   private java.util.Date[] T01UG6_A13431AlbProSys ;
   private String[] T01UG6_A13433AlbProHh ;
   private String[] T01UG6_A13434AlbProHhCt ;
   private String[] T01UG6_A13435AlbProEnvA ;
   private String[] T01UG6_A13436AlbProIDAT ;
   private byte[] T01UG6_A13438AlbProStAT ;
   private String[] T01UG6_A13440AlbProAnul ;
   private short[] T01UG6_A13441AlbProUltL ;
   private String[] T01UG6_A13579AlbProLC1 ;
   private String[] T01UG6_A13580AlbProLC2 ;
   private String[] T01UG6_A13581AlbProLC3 ;
   private String[] T01UG6_A13582AlbProLD1 ;
   private String[] T01UG6_A13583AlbProLD2 ;
   private String[] T01UG6_A13584AlbProLD3 ;
   private String[] T01UG6_A14190AlbProATCU ;
   private boolean[] T01UG6_n14190AlbProATCU ;
   private String[] T01UG6_A14191AlbProSerA ;
   private boolean[] T01UG6_n14191AlbProSerA ;
   private String[] T01UG6_A14192AlbProTipA ;
   private boolean[] T01UG6_n14192AlbProTipA ;
   private String[] T01UG6_A396EmprCod ;
   private int[] T01UG6_A13425AlbProCliC ;
   private int[] T01UG6_A13419AlbProPrvI ;
   private short[] T01UG6_A840TrnCod ;
   private boolean[] T01UG6_n840TrnCod ;
   private short[] T01UG6_A13453CatDocID ;
   private boolean[] T01UG6_n13453CatDocID ;
   private String[] T01UG18_A396EmprCod ;
   private int[] T01UG18_A13418AlbProID ;
   private String[] T01UG19_A396EmprCod ;
   private int[] T01UG19_A13418AlbProID ;
   private int[] T01UG5_A13418AlbProID ;
   private byte[] T01UG5_A13452AlbProInEx ;
   private String[] T01UG5_A13417AlbProTipo ;
   private java.util.Date[] T01UG5_A13430AlbProDate ;
   private java.util.Date[] T01UG5_A13429AlbProSal ;
   private byte[] T01UG5_A13427AlbProDomE ;
   private String[] T01UG5_A13424AlbProMatr ;
   private String[] T01UG5_A13439AlbProObs ;
   private byte[] T01UG5_A13437AlbProSta ;
   private java.util.Date[] T01UG5_A13431AlbProSys ;
   private String[] T01UG5_A13433AlbProHh ;
   private String[] T01UG5_A13434AlbProHhCt ;
   private String[] T01UG5_A13435AlbProEnvA ;
   private String[] T01UG5_A13436AlbProIDAT ;
   private byte[] T01UG5_A13438AlbProStAT ;
   private String[] T01UG5_A13440AlbProAnul ;
   private short[] T01UG5_A13441AlbProUltL ;
   private String[] T01UG5_A13579AlbProLC1 ;
   private String[] T01UG5_A13580AlbProLC2 ;
   private String[] T01UG5_A13581AlbProLC3 ;
   private String[] T01UG5_A13582AlbProLD1 ;
   private String[] T01UG5_A13583AlbProLD2 ;
   private String[] T01UG5_A13584AlbProLD3 ;
   private String[] T01UG5_A14190AlbProATCU ;
   private boolean[] T01UG5_n14190AlbProATCU ;
   private String[] T01UG5_A14191AlbProSerA ;
   private boolean[] T01UG5_n14191AlbProSerA ;
   private String[] T01UG5_A14192AlbProTipA ;
   private boolean[] T01UG5_n14192AlbProTipA ;
   private String[] T01UG5_A396EmprCod ;
   private int[] T01UG5_A13425AlbProCliC ;
   private int[] T01UG5_A13419AlbProPrvI ;
   private short[] T01UG5_A840TrnCod ;
   private boolean[] T01UG5_n840TrnCod ;
   private short[] T01UG5_A13453CatDocID ;
   private boolean[] T01UG5_n13453CatDocID ;
   private String[] T01UG23_A13426AlbProCliN ;
   private String[] T01UG24_A13420AlbProPrvN ;
   private boolean[] T01UG24_n13420AlbProPrvN ;
   private String[] T01UG25_A841TrnNom ;
   private boolean[] T01UG25_n841TrnNom ;
   private String[] T01UG26_A13454CatDocNom ;
   private boolean[] T01UG26_n13454CatDocNom ;
   private String[] T01UG27_A396EmprCod ;
   private int[] T01UG27_A13418AlbProID ;
   private int[] T01UG28_A13418AlbProID ;
   private short[] T01UG28_A13442AlbProLine ;
   private String[] T01UG28_A13448AlbProDsc ;
   private boolean[] T01UG28_n13448AlbProDsc ;
   private java.math.BigDecimal[] T01UG28_A13443AlbProCnt ;
   private boolean[] T01UG28_n13443AlbProCnt ;
   private String[] T01UG28_A13444AlbProUnd ;
   private boolean[] T01UG28_n13444AlbProUnd ;
   private short[] T01UG28_A13449AlbProCaja ;
   private boolean[] T01UG28_n13449AlbProCaja ;
   private String[] T01UG28_A13447AlbProObsL ;
   private boolean[] T01UG28_n13447AlbProObsL ;
   private String[] T01UG28_A718PrdNom ;
   private java.math.BigDecimal[] T01UG28_A704PrdExiAlm ;
   private String[] T01UG28_A13445AlbProNRef ;
   private boolean[] T01UG28_n13445AlbProNRef ;
   private String[] T01UG28_A13446AlbProVRef ;
   private boolean[] T01UG28_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01UG28_A13852AlbProPrvp ;
   private boolean[] T01UG28_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01UG28_A13853AlbProDto ;
   private boolean[] T01UG28_n13853AlbProDto ;
   private String[] T01UG28_A14401AlbProLote ;
   private boolean[] T01UG28_n14401AlbProLote ;
   private String[] T01UG28_A396EmprCod ;
   private String[] T01UG28_A719PrdNum ;
   private String[] T01UG4_A718PrdNom ;
   private java.math.BigDecimal[] T01UG4_A704PrdExiAlm ;
   private String[] T01UG29_A718PrdNom ;
   private java.math.BigDecimal[] T01UG29_A704PrdExiAlm ;
   private String[] T01UG30_A396EmprCod ;
   private int[] T01UG30_A13418AlbProID ;
   private short[] T01UG30_A13442AlbProLine ;
   private int[] T01UG3_A13418AlbProID ;
   private short[] T01UG3_A13442AlbProLine ;
   private String[] T01UG3_A13448AlbProDsc ;
   private boolean[] T01UG3_n13448AlbProDsc ;
   private java.math.BigDecimal[] T01UG3_A13443AlbProCnt ;
   private boolean[] T01UG3_n13443AlbProCnt ;
   private String[] T01UG3_A13444AlbProUnd ;
   private boolean[] T01UG3_n13444AlbProUnd ;
   private short[] T01UG3_A13449AlbProCaja ;
   private boolean[] T01UG3_n13449AlbProCaja ;
   private String[] T01UG3_A13447AlbProObsL ;
   private boolean[] T01UG3_n13447AlbProObsL ;
   private String[] T01UG3_A13445AlbProNRef ;
   private boolean[] T01UG3_n13445AlbProNRef ;
   private String[] T01UG3_A13446AlbProVRef ;
   private boolean[] T01UG3_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01UG3_A13852AlbProPrvp ;
   private boolean[] T01UG3_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01UG3_A13853AlbProDto ;
   private boolean[] T01UG3_n13853AlbProDto ;
   private String[] T01UG3_A14401AlbProLote ;
   private boolean[] T01UG3_n14401AlbProLote ;
   private String[] T01UG3_A396EmprCod ;
   private String[] T01UG3_A719PrdNum ;
   private int[] T01UG2_A13418AlbProID ;
   private short[] T01UG2_A13442AlbProLine ;
   private String[] T01UG2_A13448AlbProDsc ;
   private boolean[] T01UG2_n13448AlbProDsc ;
   private java.math.BigDecimal[] T01UG2_A13443AlbProCnt ;
   private boolean[] T01UG2_n13443AlbProCnt ;
   private String[] T01UG2_A13444AlbProUnd ;
   private boolean[] T01UG2_n13444AlbProUnd ;
   private short[] T01UG2_A13449AlbProCaja ;
   private boolean[] T01UG2_n13449AlbProCaja ;
   private String[] T01UG2_A13447AlbProObsL ;
   private boolean[] T01UG2_n13447AlbProObsL ;
   private String[] T01UG2_A13445AlbProNRef ;
   private boolean[] T01UG2_n13445AlbProNRef ;
   private String[] T01UG2_A13446AlbProVRef ;
   private boolean[] T01UG2_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01UG2_A13852AlbProPrvp ;
   private boolean[] T01UG2_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01UG2_A13853AlbProDto ;
   private boolean[] T01UG2_n13853AlbProDto ;
   private String[] T01UG2_A14401AlbProLote ;
   private boolean[] T01UG2_n14401AlbProLote ;
   private String[] T01UG2_A396EmprCod ;
   private String[] T01UG2_A719PrdNum ;
   private String[] T01UG34_A718PrdNom ;
   private java.math.BigDecimal[] T01UG34_A704PrdExiAlm ;
   private String[] T01UG35_A396EmprCod ;
   private int[] T01UG35_A13418AlbProID ;
   private short[] T01UG35_A13442AlbProLine ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV35AlbProPrvID_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV32TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV24WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV25TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV31TrnContextAtt ;
}

final  class documentotransporteproveedor_1_2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_1_2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_1_2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_1_2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransporteproveedor_1_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UG2", "SELECT AlbProID, AlbProLine, AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, AlbProLote, EmprCod, PrdNum FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?  FOR UPDATE OF AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, AlbProLote, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG3", "SELECT AlbProID, AlbProLine, AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, AlbProLote, EmprCod, PrdNum FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG4", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG5", "SELECT AlbProID, AlbProInEx, AlbProTipo, AlbProDate, AlbProSal, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, EmprCod, AlbProCliC, AlbProPrvI, TrnCod, CatDocID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ?  FOR UPDATE OF AlbProInEx, AlbProTipo, AlbProDate, AlbProSal, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, AlbProCliC, AlbProPrvI, TrnCod, CatDocID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG6", "SELECT AlbProID, AlbProInEx, AlbProTipo, AlbProDate, AlbProSal, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, EmprCod, AlbProCliC, AlbProPrvI, TrnCod, CatDocID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG8", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG9", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG10", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG11", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG12", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbProID, T2.EmprNom, TM1.AlbProInEx, TM1.AlbProTipo, TM1.AlbProDate, TM1.AlbProSal, T3.CatDocNom, T4.PrvNom AS AlbProPrvN, T5.CliNom AS AlbProCliN, TM1.AlbProDomE, T6.TrnNom, TM1.AlbProMatr, TM1.AlbProObs, TM1.AlbProSta, TM1.AlbProSys, TM1.AlbProHh, TM1.AlbProHhCt, TM1.AlbProEnvA, TM1.AlbProIDAT, TM1.AlbProStAT, TM1.AlbProAnul, TM1.AlbProUltL, TM1.AlbProLC1, TM1.AlbProLC2, TM1.AlbProLC3, TM1.AlbProLD1, TM1.AlbProLD2, TM1.AlbProLD3, TM1.AlbProATCU, TM1.AlbProSerA, TM1.AlbProTipA, TM1.EmprCod, TM1.AlbProCliC AS AlbProCliC, TM1.AlbProPrvI AS AlbProPrvI, TM1.TrnCod, TM1.CatDocID FROM (((((TXPCALPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCATDOC T3 ON T3.EmprCod = TM1.EmprCod AND T3.CatDocID = TM1.CatDocID) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = TM1.AlbProPrvI) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.AlbProCliC) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.AlbProID = ? ORDER BY TM1.EmprCod, TM1.AlbProID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG13", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG14", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG15", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG16", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID FROM TXPCALPRO WHERE ( EmprCod > ? or EmprCod = ? and AlbProID > ?) ORDER BY EmprCod, AlbProID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UG19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID FROM TXPCALPRO WHERE ( EmprCod < ? or EmprCod = ? and AlbProID < ?) ORDER BY EmprCod DESC, AlbProID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UG20", "INSERT INTO TXPCALPRO(AlbProID, AlbProInEx, AlbProTipo, AlbProDate, AlbProSal, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, EmprCod, AlbProCliC, AlbProPrvI, TrnCod, CatDocID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCALPRO")
         ,new UpdateCursor("T01UG21", "UPDATE TXPCALPRO SET AlbProInEx=?, AlbProTipo=?, AlbProDate=?, AlbProSal=?, AlbProDomE=?, AlbProMatr=?, AlbProObs=?, AlbProSta=?, AlbProSys=?, AlbProHh=?, AlbProHhCt=?, AlbProEnvA=?, AlbProIDAT=?, AlbProStAT=?, AlbProAnul=?, AlbProUltL=?, AlbProLC1=?, AlbProLC2=?, AlbProLC3=?, AlbProLD1=?, AlbProLD2=?, AlbProLD3=?, AlbProATCU=?, AlbProSerA=?, AlbProTipA=?, AlbProCliC=?, AlbProPrvI=?, TrnCod=?, CatDocID=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK, "TXPCALPRO")
         ,new UpdateCursor("T01UG22", "DELETE FROM TXPCALPRO  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK, "TXPCALPRO")
         ,new ForEachCursor("T01UG23", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG24", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG25", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG26", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProID FROM TXPCALPRO ORDER BY EmprCod, AlbProID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG28", "SELECT T1.AlbProID, T1.AlbProLine, T1.AlbProDsc, T1.AlbProCnt, T1.AlbProUnd, T1.AlbProCaja, T1.AlbProObsL, T2.PrdNom, T2.PrdExiAlm, T1.AlbProNRef, T1.AlbProVRef, T1.AlbProPrvp, T1.AlbProDto, T1.AlbProLote, T1.EmprCod, T1.PrdNum FROM (TXPLALPRO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.AlbProID = ? and T1.AlbProLine = ? ORDER BY T1.EmprCod, T1.AlbProID, T1.AlbProLine ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG29", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG30", "SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UG31", "INSERT INTO TXPLALPRO(AlbProID, AlbProLine, AlbProDsc, AlbProCnt, AlbProUnd, AlbProCaja, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, AlbProLote, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLALPRO")
         ,new UpdateCursor("T01UG32", "UPDATE TXPLALPRO SET AlbProDsc=?, AlbProCnt=?, AlbProUnd=?, AlbProCaja=?, AlbProObsL=?, AlbProNRef=?, AlbProVRef=?, AlbProPrvp=?, AlbProDto=?, AlbProLote=?, PrdNum=?  WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?", GX_NOMASK, "TXPLALPRO")
         ,new UpdateCursor("T01UG33", "DELETE FROM TXPLALPRO  WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?", GX_NOMASK, "TXPLALPRO")
         ,new ForEachCursor("T01UG34", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UG35", "SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID, AlbProLine ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               ((String[]) buf[23])[0] = rslt.getString(14, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               ((String[]) buf[23])[0] = rslt.getString(14, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 40);
               ((String[]) buf[18])[0] = rslt.getString(19, 40);
               ((String[]) buf[19])[0] = rslt.getString(20, 40);
               ((String[]) buf[20])[0] = rslt.getString(21, 40);
               ((String[]) buf[21])[0] = rslt.getString(22, 40);
               ((String[]) buf[22])[0] = rslt.getString(23, 40);
               ((String[]) buf[23])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 40);
               ((String[]) buf[18])[0] = rslt.getString(19, 40);
               ((String[]) buf[19])[0] = rslt.getString(20, 40);
               ((String[]) buf[20])[0] = rslt.getString(21, 40);
               ((String[]) buf[21])[0] = rslt.getString(22, 40);
               ((String[]) buf[22])[0] = rslt.getString(23, 40);
               ((String[]) buf[23])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((String[]) buf[16])[0] = rslt.getVarchar(13);
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15);
               ((String[]) buf[19])[0] = rslt.getVarchar(16);
               ((String[]) buf[20])[0] = rslt.getVarchar(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((short[]) buf[25])[0] = rslt.getShort(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 40);
               ((String[]) buf[27])[0] = rslt.getString(24, 40);
               ((String[]) buf[28])[0] = rslt.getString(25, 40);
               ((String[]) buf[29])[0] = rslt.getString(26, 40);
               ((String[]) buf[30])[0] = rslt.getString(27, 40);
               ((String[]) buf[31])[0] = rslt.getString(28, 40);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(31, 4);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(32, 3);
               ((int[]) buf[39])[0] = rslt.getInt(33);
               ((int[]) buf[40])[0] = rslt.getInt(34);
               ((short[]) buf[41])[0] = rslt.getShort(35);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(36);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 3);
               ((String[]) buf[25])[0] = rslt.getString(16, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 33 :
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
               stmt.setString(2, (String)parms[1], 6);
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
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setVarchar(8, (String)parms[7], 200, false);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setVarchar(11, (String)parms[10], 200, false);
               stmt.setVarchar(12, (String)parms[11], 200, false);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 20);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 40);
               stmt.setString(19, (String)parms[18], 40);
               stmt.setString(20, (String)parms[19], 40);
               stmt.setString(21, (String)parms[20], 40);
               stmt.setString(22, (String)parms[21], 40);
               stmt.setString(23, (String)parms[22], 40);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[26], 20);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[28], 4);
               }
               stmt.setString(27, (String)parms[29], 3);
               stmt.setInt(28, ((Number) parms[30]).intValue());
               stmt.setInt(29, ((Number) parms[31]).intValue());
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[35]).shortValue());
               }
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 30);
               stmt.setVarchar(7, (String)parms[6], 200, false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setVarchar(10, (String)parms[9], 200, false);
               stmt.setVarchar(11, (String)parms[10], 200, false);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 20);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 40);
               stmt.setString(18, (String)parms[17], 40);
               stmt.setString(19, (String)parms[18], 40);
               stmt.setString(20, (String)parms[19], 40);
               stmt.setString(21, (String)parms[20], 40);
               stmt.setString(22, (String)parms[21], 40);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[25], 20);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[27], 4);
               }
               stmt.setInt(26, ((Number) parms[28]).intValue());
               stmt.setInt(27, ((Number) parms[29]).intValue());
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[33]).shortValue());
               }
               stmt.setString(30, (String)parms[34], 3);
               stmt.setInt(31, ((Number) parms[35]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 60);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 60);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 26);
               }
               stmt.setString(13, (String)parms[22], 3);
               stmt.setString(14, (String)parms[23], 6);
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
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 26);
               }
               stmt.setString(11, (String)parms[20], 6);
               stmt.setString(12, (String)parms[21], 3);
               stmt.setInt(13, ((Number) parms[22]).intValue());
               stmt.setShort(14, ((Number) parms[23]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

