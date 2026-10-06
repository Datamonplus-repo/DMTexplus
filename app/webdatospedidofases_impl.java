package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webdatospedidofases_impl extends GXDataArea
{
   public webdatospedidofases_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webdatospedidofases_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdatospedidofases_impl.class ));
   }

   public webdatospedidofases_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavSdtfasepedidos__fascod = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "NumeroItem") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"SDTFASEPEDIDOS__FASCOD") == 0 )
         {
            AV11EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvsdtfasepedidos__fascodDC2( AV11EmprCod) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "NumeroItem") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "NumeroItem") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtfasepedidos") == 0 )
         {
            gxnrgridsdtfasepedidos_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtfasepedidos") == 0 )
         {
            gxgrgridsdtfasepedidos_refresh_invoke( ) ;
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
            AV33NumeroItem = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33NumeroItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33NumeroItem), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMEROITEM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33NumeroItem), "ZZZ9")));
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridsdtfasepedidos_newrow_invoke( )
   {
      nRC_GXsfl_15 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_15"))) ;
      nGXsfl_15_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_15_idx"))) ;
      sGXsfl_15_idx = httpContext.GetPar( "sGXsfl_15_idx") ;
      AV39Adicionar = httpContext.GetPar( "Adicionar") ;
      AV40Eliminar = httpContext.GetPar( "Eliminar") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtfasepedidos_newrow( ) ;
      /* End function gxnrGridsdtfasepedidos_newrow_invoke */
   }

   public void gxgrgridsdtfasepedidos_refresh_invoke( )
   {
      subGridsdtfasepedidos_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtfasepedidos_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV30SdtFasePedidos);
      AV33NumeroItem = (short)(GXutil.lval( httpContext.GetPar( "NumeroItem"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24SdtEnCabezadoPedido);
      AV9Contexto = httpContext.GetPar( "Contexto") ;
      AV39Adicionar = httpContext.GetPar( "Adicionar") ;
      AV40Eliminar = httpContext.GetPar( "Eliminar") ;
      AV11EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtfasepedidos_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
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

   public byte executeStartEvent( )
   {
      paDC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDC2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webdatospedidofases", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV33NumeroItem,4,0))}, new String[] {"NumeroItem"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMEROITEM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33NumeroItem), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Contexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtfasepedidos", AV30SdtFasePedidos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtfasepedidos", AV30SdtFasePedidos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_15", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_15, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTFASEPEDIDOS", AV30SdtFasePedidos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTFASEPEDIDOS", AV30SdtFasePedidos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMEROITEM", GXutil.ltrim( localUtil.ntoc( AV33NumeroItem, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMEROITEM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33NumeroItem), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTENCABEZADOPEDIDO", AV24SdtEnCabezadoPedido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTENCABEZADOPEDIDO", AV24SdtEnCabezadoPedido);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTO", AV9Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Contexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISFASLIN", GXutil.ltrim( localUtil.ntoc( AV34DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMEROINDEX", GXutil.ltrim( localUtil.ntoc( AV36NumeroIndex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtfasepedidos_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_EMPOWERER_Infinitescrolling", GXutil.rtrim( Gridsdtfasepedidos_empowerer_Infinitescrolling));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weDC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDC2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webdatospedidofases", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV33NumeroItem,4,0))}, new String[] {"NumeroItem"})  ;
   }

   public String getPgmname( )
   {
      return "WebDatosPedidoFases" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Datos Pedido Fases", "") ;
   }

   public void wbDC0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, divTablecontent_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtfasepedidosContainer.SetWrapped(nGXWrapped);
         startgridcontrol15( ) ;
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_15 = (int)(nGXsfl_15_idx-1) ;
         if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridsdtfasepedidosContainer.AddObjectProperty("GRIDSDTFASEPEDIDOS_nEOF", GRIDSDTFASEPEDIDOS_nEOF);
            GridsdtfasepedidosContainer.AddObjectProperty("GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GRIDSDTFASEPEDIDOS_nFirstRecordOnPage);
            AV45GXV1 = nGXsfl_15_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridsdtfasepedidosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdtfasepedidos", GridsdtfasepedidosContainer, subGridsdtfasepedidos_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtfasepedidosContainerData", GridsdtfasepedidosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtfasepedidosContainerData"+"V", GridsdtfasepedidosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtfasepedidosContainerData"+"V"+"\" value='"+GridsdtfasepedidosContainer.GridValuesHidden()+"'/>") ;
            }
         }
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
         /* User Defined Control */
         ucGridsdtfasepedidos_empowerer.setProperty("InfiniteScrolling", Gridsdtfasepedidos_empowerer_Infinitescrolling);
         ucGridsdtfasepedidos_empowerer.render(context, "wwp.gridempowerer", Gridsdtfasepedidos_empowerer_Internalname, "GRIDSDTFASEPEDIDOS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridsdtfasepedidosContainer.AddObjectProperty("GRIDSDTFASEPEDIDOS_nEOF", GRIDSDTFASEPEDIDOS_nEOF);
               GridsdtfasepedidosContainer.AddObjectProperty("GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GRIDSDTFASEPEDIDOS_nFirstRecordOnPage);
               AV45GXV1 = nGXsfl_15_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridsdtfasepedidosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdtfasepedidos", GridsdtfasepedidosContainer, subGridsdtfasepedidos_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtfasepedidosContainerData", GridsdtfasepedidosContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtfasepedidosContainerData"+"V", GridsdtfasepedidosContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtfasepedidosContainerData"+"V"+"\" value='"+GridsdtfasepedidosContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startDC2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Datos Pedido Fases", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDC0( ) ;
   }

   public void wsDC2( )
   {
      startDC2( ) ;
      evtDC2( ) ;
   }

   public void evtDC2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTFASEPEDIDOSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDSDTFASEPEDIDOSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridsdtfasepedidos_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridsdtfasepedidos_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridsdtfasepedidos_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridsdtfasepedidos_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "GRIDSDTFASEPEDIDOS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VADICIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VELIMINAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 42), "SDTFASEPEDIDOS__FASCOD.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VADICIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VELIMINAR.CLICK") == 0 ) )
                        {
                           nGXsfl_15_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_152( ) ;
                           AV45GXV1 = nGXsfl_15_idx ;
                           if ( ( AV30SdtFasePedidos.size() >= AV45GXV1 ) && ( AV45GXV1 > 0 ) )
                           {
                              AV30SdtFasePedidos.currentItem( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)) );
                              AV39Adicionar = httpContext.cgiGet( edtavAdicionar_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAdicionar_Internalname, AV39Adicionar);
                              AV40Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV40Eliminar);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11DC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTFASEPEDIDOS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e12DC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e13DC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VADICIONAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e14DC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VELIMINAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e15DC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTFASEPEDIDOS__FASCOD.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e16DC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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
   }

   public void weDC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void paDC2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvsdtfasepedidos__fascodDC2( String AV11EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvsdtfasepedidos__fascod_dataDC2( AV11EmprCod) ;
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

   public void gxvsdtfasepedidos__fascod_htmlDC2( String AV11EmprCod )
   {
      String gxdynajaxvalue;
      gxdlvsdtfasepedidos__fascod_dataDC2( AV11EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavSdtfasepedidos__fascod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavSdtfasepedidos__fascod.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvsdtfasepedidos__fascod_dataDC2( String AV11EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add(httpContext.getMessage( "GX_EmptyItemText", ""));
      /* Using cursor H00DC2 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00DC2_A457FasCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DC2_A460FasDsc[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxnrgridsdtfasepedidos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_152( ) ;
      while ( nGXsfl_15_idx <= nRC_GXsfl_15 )
      {
         sendrow_152( ) ;
         nGXsfl_15_idx = ((subGridsdtfasepedidos_Islastpage==1)&&(nGXsfl_15_idx+1>subgridsdtfasepedidos_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtfasepedidosContainer)) ;
      /* End function gxnrGridsdtfasepedidos_newrow */
   }

   public void gxgrgridsdtfasepedidos_refresh( int subGridsdtfasepedidos_Rows ,
                                               GXBaseCollection<app.SdtSdtFasePedido> AV30SdtFasePedidos ,
                                               short AV33NumeroItem ,
                                               app.SdtSdtEncabezadoPedido AV24SdtEnCabezadoPedido ,
                                               String AV9Contexto ,
                                               String AV39Adicionar ,
                                               String AV40Eliminar ,
                                               String AV11EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13DC2 ();
      GRIDSDTFASEPEDIDOS_nCurrentRecord = 0 ;
      rfDC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtfasepedidos_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = 0 ;
      GRIDSDTFASEPEDIDOS_nCurrentRecord = 0 ;
      GXCCtl = "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage_" + sGXsfl_15_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfDC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAdicionar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAdicionar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAdicionar_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavEliminar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminar_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtfasepedidos__disfaslin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtfasepedidos__disfaslin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtfasepedidos__disfaslin_Enabled), 5, 0), !bGXsfl_15_Refreshing);
   }

   public void rfDC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtfasepedidosContainer.ClearRows();
      }
      wbStart = (short)(15) ;
      /* Execute user event: Refresh */
      e13DC2 ();
      nGXsfl_15_idx = (int)(1+GRIDSDTFASEPEDIDOS_nFirstRecordOnPage) ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      bGXsfl_15_Refreshing = true ;
      GridsdtfasepedidosContainer.AddObjectProperty("GridName", "Gridsdtfasepedidos");
      GridsdtfasepedidosContainer.AddObjectProperty("CmpContext", "");
      GridsdtfasepedidosContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtfasepedidosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridsdtfasepedidosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtfasepedidosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtfasepedidosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtfasepedidosContainer.setPageSize( subgridsdtfasepedidos_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_152( ) ;
         e12DC2 ();
         if ( ( GRIDSDTFASEPEDIDOS_nCurrentRecord > 0 ) && ( GRIDSDTFASEPEDIDOS_nGridOutOfScope == 0 ) && ( nGXsfl_15_idx == 1 ) )
         {
            GRIDSDTFASEPEDIDOS_nCurrentRecord = 0 ;
            GRIDSDTFASEPEDIDOS_nGridOutOfScope = 1 ;
            subgridsdtfasepedidos_firstpage( ) ;
            e12DC2 ();
         }
         wbEnd = (short)(15) ;
         wbDC0( ) ;
      }
      bGXsfl_15_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMEROITEM", GXutil.ltrim( localUtil.ntoc( AV33NumeroItem, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMEROITEM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33NumeroItem), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTO", AV9Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Contexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
   }

   public int subgridsdtfasepedidos_fnc_pagecount( )
   {
      GRIDSDTFASEPEDIDOS_nRecordCount = subgridsdtfasepedidos_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTFASEPEDIDOS_nRecordCount) % (subgridsdtfasepedidos_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTFASEPEDIDOS_nRecordCount/ (double) (subgridsdtfasepedidos_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTFASEPEDIDOS_nRecordCount/ (double) (subgridsdtfasepedidos_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtfasepedidos_fnc_recordcount( )
   {
      return AV30SdtFasePedidos.size() ;
   }

   public int subgridsdtfasepedidos_fnc_recordsperpage( )
   {
      if ( subGridsdtfasepedidos_Rows > 0 )
      {
         return subGridsdtfasepedidos_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtfasepedidos_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage/ (double) (subgridsdtfasepedidos_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtfasepedidos_firstpage( )
   {
      GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtfasepedidos_nextpage( )
   {
      GRIDSDTFASEPEDIDOS_nRecordCount = subgridsdtfasepedidos_fnc_recordcount( ) ;
      if ( ( GRIDSDTFASEPEDIDOS_nRecordCount >= subgridsdtfasepedidos_fnc_recordsperpage( ) ) && ( GRIDSDTFASEPEDIDOS_nEOF == 0 ) )
      {
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTFASEPEDIDOS_nFirstRecordOnPage+subgridsdtfasepedidos_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRIDSDTFASEPEDIDOS_nEOF == 1 )
      {
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = GRIDSDTFASEPEDIDOS_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtfasepedidosContainer.AddObjectProperty("GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GRIDSDTFASEPEDIDOS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTFASEPEDIDOS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtfasepedidos_previouspage( )
   {
      if ( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage >= subgridsdtfasepedidos_fnc_recordsperpage( ) )
      {
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTFASEPEDIDOS_nFirstRecordOnPage-subgridsdtfasepedidos_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtfasepedidos_lastpage( )
   {
      GRIDSDTFASEPEDIDOS_nRecordCount = subgridsdtfasepedidos_fnc_recordcount( ) ;
      if ( GRIDSDTFASEPEDIDOS_nRecordCount > subgridsdtfasepedidos_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTFASEPEDIDOS_nRecordCount) % (subgridsdtfasepedidos_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTFASEPEDIDOS_nRecordCount-subgridsdtfasepedidos_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTFASEPEDIDOS_nRecordCount-((int)((GRIDSDTFASEPEDIDOS_nRecordCount) % (subgridsdtfasepedidos_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtfasepedidos_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = (long)(subgridsdtfasepedidos_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavAdicionar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAdicionar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAdicionar_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavEliminar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminar_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtfasepedidos__disfaslin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtfasepedidos__disfaslin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtfasepedidos__disfaslin_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      gxvsdtfasepedidos__fascod_htmlDC2( AV11EmprCod) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtfasepedidos"), AV30SdtFasePedidos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTFASEPEDIDOS"), AV30SdtFasePedidos);
         /* Read saved values. */
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDSDTFASEPEDIDOS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDTFASEPEDIDOS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTFASEPEDIDOS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTFASEPEDIDOS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtfasepedidos_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTFASEPEDIDOS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridsdtfasepedidos_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDTFASEPEDIDOS_EMPOWERER_Gridinternalname") ;
         Gridsdtfasepedidos_empowerer_Infinitescrolling = httpContext.cgiGet( "GRIDSDTFASEPEDIDOS_EMPOWERER_Infinitescrolling") ;
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_15_fel_idx = 0 ;
         while ( nGXsfl_15_fel_idx < nRC_GXsfl_15 )
         {
            nGXsfl_15_fel_idx = ((subGridsdtfasepedidos_Islastpage==1)&&(nGXsfl_15_fel_idx+1>subgridsdtfasepedidos_fnc_recordsperpage( )) ? 1 : nGXsfl_15_fel_idx+1) ;
            sGXsfl_15_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_152( ) ;
            AV45GXV1 = nGXsfl_15_fel_idx ;
            if ( ( AV30SdtFasePedidos.size() >= AV45GXV1 ) && ( AV45GXV1 > 0 ) )
            {
               AV30SdtFasePedidos.currentItem( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)) );
               AV39Adicionar = httpContext.cgiGet( edtavAdicionar_Internalname) ;
               AV40Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
            }
         }
         if ( nGXsfl_15_fel_idx == 0 )
         {
            nGXsfl_15_idx = 1 ;
            sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_152( ) ;
         }
         nGXsfl_15_fel_idx = 1 ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e11DC2 ();
      if (returnInSub) return;
   }

   public void e11DC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV39Adicionar = "<i class=\"fa fa-plus\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAdicionar_Internalname, AV39Adicionar);
      AV40Eliminar = "<i class=\"fa fa-times\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV40Eliminar);
      GXt_char1 = AV48Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webdatospedidofases_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Station = GXt_char1 ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV49Emprnom ;
      GXv_char4[0] = AV50Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char2, GXv_char3, GXv_char4) ;
      webdatospedidofases_impl.this.AV11EmprCod = GXv_char2[0] ;
      webdatospedidofases_impl.this.AV49Emprnom = GXv_char3[0] ;
      webdatospedidofases_impl.this.AV50Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
      Gridsdtfasepedidos_empowerer_Gridinternalname = subGridsdtfasepedidos_Internalname ;
      ucGridsdtfasepedidos_empowerer.sendProperty(context, "", false, Gridsdtfasepedidos_empowerer_Internalname, "GridInternalName", Gridsdtfasepedidos_empowerer_Gridinternalname);
      subGridsdtfasepedidos_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Rows, (byte)(6), (byte)(0), ".", "")));
      GXt_char1 = AV11EmprCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
      webdatospedidofases_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
      AV9Contexto = "CapturaDatosPedidosCliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Contexto", AV9Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Contexto, ""))));
      AV10DatosPedidoJSON = AV25WebSession.getValue(AV9Contexto) ;
      if ( (GXutil.strcmp("", AV10DatosPedidoJSON)==0) )
      {
         AV18Mensajes = httpContext.getMessage( "Sin Registros", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Mensajes", AV18Mensajes);
      }
      else
      {
         AV24SdtEnCabezadoPedido.fromJSonString(AV10DatosPedidoJSON, null);
         AV30SdtFasePedidos = ((app.SdtSdtArticuloPedido)AV24SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido().elementAt(-1+AV33NumeroItem)).getgxTv_SdtSdtArticuloPedido_Fases() ;
         gx_BV15 = true ;
         AV42ProCod = ((app.SdtSdtArticuloPedido)AV24SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido().elementAt(-1+AV33NumeroItem)).getgxTv_SdtSdtArticuloPedido_Procod() ;
         GXt_char1 = AV41ProDsc ;
         GXv_char4[0] = AV11EmprCod ;
         GXv_char3[0] = AV42ProCod ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprodsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         webdatospedidofases_impl.this.AV11EmprCod = GXv_char4[0] ;
         webdatospedidofases_impl.this.AV42ProCod = GXv_char3[0] ;
         webdatospedidofases_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11EmprCod, "@!"))));
         AV41ProDsc = GXt_char1 ;
         Form.setCaption( GXutil.format( "Fases para %1 - %2", ((app.SdtSdtArticuloPedido)AV24SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido().elementAt(-1+AV33NumeroItem)).getgxTv_SdtSdtArticuloPedido_Artdsc(), AV41ProDsc, "", "", "", "", "", "", "") );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         if ( AV30SdtFasePedidos.size() == 0 )
         {
            AV18Mensajes = httpContext.getMessage( "Sin Registros", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Mensajes", AV18Mensajes);
         }
      }
      divTablecontent_Visible = (((GXutil.strcmp("", AV18Mensajes)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTablecontent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablecontent_Visible), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV18Mensajes)==0) )
      {
         httpContext.GX_msglist.addItem(AV18Mensajes);
      }
   }

   private void e12DC2( )
   {
      /* Gridsdtfasepedidos_Load Routine */
      returnInSub = false ;
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV30SdtFasePedidos.size() )
      {
         AV30SdtFasePedidos.currentItem( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(15) ;
         }
         if ( ( subGridsdtfasepedidos_Islastpage == 1 ) || ( subGridsdtfasepedidos_Rows == 0 ) || ( ( GRIDSDTFASEPEDIDOS_nCurrentRecord >= GRIDSDTFASEPEDIDOS_nFirstRecordOnPage ) && ( GRIDSDTFASEPEDIDOS_nCurrentRecord < GRIDSDTFASEPEDIDOS_nFirstRecordOnPage + subgridsdtfasepedidos_fnc_recordsperpage( ) ) ) )
         {
            sendrow_152( ) ;
            GRIDSDTFASEPEDIDOS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTFASEPEDIDOS_nCurrentRecord + 1 >= subgridsdtfasepedidos_fnc_recordcount( ) )
            {
               GRIDSDTFASEPEDIDOS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTFASEPEDIDOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTFASEPEDIDOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTFASEPEDIDOS_nCurrentRecord = (long)(GRIDSDTFASEPEDIDOS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_15_Refreshing )
         {
            httpContext.doAjaxLoad(15, GridsdtfasepedidosRow);
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void e13DC2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'GESTIONAR SET WEBSESSION' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SdtFasePedidos", AV30SdtFasePedidos);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24SdtEnCabezadoPedido", AV24SdtEnCabezadoPedido);
   }

   public void e14DC2( )
   {
      AV45GXV1 = nGXsfl_15_idx ;
      if ( ( AV45GXV1 > 0 ) && ( AV30SdtFasePedidos.size() >= AV45GXV1 ) )
      {
         AV30SdtFasePedidos.currentItem( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)) );
      }
      /* Adicionar_Click Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).getgxTv_SdtSdtFasePedido_Fascod())==0) )
      {
         AV34DisFasLin = ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).getgxTv_SdtSdtFasePedido_Disfaslin() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34DisFasLin), 4, 0));
         /* Execute user subroutine: 'ADICIONAR FASE' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SdtFasePedidos", AV30SdtFasePedidos);
      nGXsfl_15_bak_idx = nGXsfl_15_idx ;
      gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      nGXsfl_15_idx = nGXsfl_15_bak_idx ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24SdtEnCabezadoPedido", AV24SdtEnCabezadoPedido);
   }

   public void e15DC2( )
   {
      AV45GXV1 = nGXsfl_15_idx ;
      if ( ( AV45GXV1 > 0 ) && ( AV30SdtFasePedidos.size() >= AV45GXV1 ) )
      {
         AV30SdtFasePedidos.currentItem( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)) );
      }
      /* Eliminar_Click Routine */
      returnInSub = false ;
      AV36NumeroIndex = (short)(AV30SdtFasePedidos.indexof(((app.SdtSdtFasePedido)AV30SdtFasePedidos.currentItem()))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36NumeroIndex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36NumeroIndex), 4, 0));
      /* Execute user subroutine: 'REMOVER FASE' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SdtFasePedidos", AV30SdtFasePedidos);
      nGXsfl_15_bak_idx = nGXsfl_15_idx ;
      gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      nGXsfl_15_idx = nGXsfl_15_bak_idx ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24SdtEnCabezadoPedido", AV24SdtEnCabezadoPedido);
   }

   public void e16DC2( )
   {
      AV45GXV1 = nGXsfl_15_idx ;
      if ( ( AV45GXV1 > 0 ) && ( AV30SdtFasePedidos.size() >= AV45GXV1 ) )
      {
         AV30SdtFasePedidos.currentItem( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)) );
      }
      /* Sdtfasepedidos__fascod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).getgxTv_SdtSdtFasePedido_Fascod())==0) )
      {
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( AV11EmprCod, ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).getgxTv_SdtSdtFasePedido_Fascod(), GXv_char4) ;
         webdatospedidofases_impl.this.GXt_char1 = GXv_char4[0] ;
         ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).setgxTv_SdtSdtFasePedido_Fasdsc( GXt_char1 );
         /* Execute user subroutine: 'GESTIONAR SET WEBSESSION' */
         S112 ();
         if (returnInSub) return;
      }
      else
      {
         if ( ! (GXutil.strcmp("", ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).getgxTv_SdtSdtFasePedido_Fasdsc())==0) )
         {
            ((app.SdtSdtFasePedido)(AV30SdtFasePedidos.currentItem())).setgxTv_SdtSdtFasePedido_Fasdsc( "" );
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SdtFasePedidos", AV30SdtFasePedidos);
      nGXsfl_15_bak_idx = nGXsfl_15_idx ;
      gxgrgridsdtfasepedidos_refresh( subGridsdtfasepedidos_Rows, AV30SdtFasePedidos, AV33NumeroItem, AV24SdtEnCabezadoPedido, AV9Contexto, AV39Adicionar, AV40Eliminar, AV11EmprCod) ;
      nGXsfl_15_idx = nGXsfl_15_bak_idx ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24SdtEnCabezadoPedido", AV24SdtEnCabezadoPedido);
   }

   public void S122( )
   {
      /* 'ADICIONAR FASE' Routine */
      returnInSub = false ;
      AV35SiguienteDisFasLin = (short)(0) ;
      AV51GXV4 = 1 ;
      while ( AV51GXV4 <= AV30SdtFasePedidos.size() )
      {
         AV28SdtFasePedido = (app.SdtSdtFasePedido)((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV51GXV4));
         if ( AV28SdtFasePedido.getgxTv_SdtSdtFasePedido_Disfaslin() > AV34DisFasLin )
         {
            if ( (0==AV35SiguienteDisFasLin) || ( AV35SiguienteDisFasLin > AV28SdtFasePedido.getgxTv_SdtSdtFasePedido_Disfaslin() ) )
            {
               AV35SiguienteDisFasLin = AV28SdtFasePedido.getgxTv_SdtSdtFasePedido_Disfaslin() ;
            }
         }
         AV51GXV4 = (int)(AV51GXV4+1) ;
      }
      if ( (0==AV35SiguienteDisFasLin) )
      {
         AV35SiguienteDisFasLin = (short)(AV34DisFasLin+50) ;
      }
      AV35SiguienteDisFasLin = (short)(AV35SiguienteDisFasLin+AV34DisFasLin) ;
      AV35SiguienteDisFasLin = (short)(AV35SiguienteDisFasLin/ (double) (2)) ;
      AV35SiguienteDisFasLin = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(AV35SiguienteDisFasLin), 0))) ;
      if ( ! ( AV35SiguienteDisFasLin == AV34DisFasLin ) )
      {
         AV28SdtFasePedido = (app.SdtSdtFasePedido)new app.SdtSdtFasePedido(remoteHandle, context);
         AV28SdtFasePedido.setgxTv_SdtSdtFasePedido_Disfaslin( AV35SiguienteDisFasLin );
         AV30SdtFasePedidos.add(AV28SdtFasePedido, AV35SiguienteDisFasLin);
         gx_BV15 = true ;
         /* Execute user subroutine: 'GESTIONAR SET WEBSESSION' */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void S132( )
   {
      /* 'REMOVER FASE' Routine */
      returnInSub = false ;
      AV30SdtFasePedidos.removeItem(AV36NumeroIndex);
      gx_BV15 = true ;
      /* Execute user subroutine: 'GESTIONAR SET WEBSESSION' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'GESTIONAR SET WEBSESSION' Routine */
      returnInSub = false ;
      AV30SdtFasePedidos.sort("DisFasLin");
      gx_BV15 = true ;
      ((app.SdtSdtArticuloPedido)AV24SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido().elementAt(-1+AV33NumeroItem)).getgxTv_SdtSdtArticuloPedido_Fases().fromJSonString(AV30SdtFasePedidos.toJSonString(false), null);
      AV10DatosPedidoJSON = AV24SdtEnCabezadoPedido.toJSonString(false, true) ;
      AV25WebSession.setValue(AV9Contexto, AV10DatosPedidoJSON);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV33NumeroItem = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33NumeroItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33NumeroItem), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMEROITEM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33NumeroItem), "ZZZ9")));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      paDC2( ) ;
      wsDC2( ) ;
      weDC2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613482370", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("webdatospedidofases.js", "?20267613482370", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_152( )
   {
      edtavAdicionar_Internalname = "vADICIONAR_"+sGXsfl_15_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_15_idx ;
      edtavSdtfasepedidos__disfaslin_Internalname = "SDTFASEPEDIDOS__DISFASLIN_"+sGXsfl_15_idx ;
      dynavSdtfasepedidos__fascod.setInternalname( "SDTFASEPEDIDOS__FASCOD_"+sGXsfl_15_idx );
   }

   public void subsflControlProps_fel_152( )
   {
      edtavAdicionar_Internalname = "vADICIONAR_"+sGXsfl_15_fel_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_15_fel_idx ;
      edtavSdtfasepedidos__disfaslin_Internalname = "SDTFASEPEDIDOS__DISFASLIN_"+sGXsfl_15_fel_idx ;
      dynavSdtfasepedidos__fascod.setInternalname( "SDTFASEPEDIDOS__FASCOD_"+sGXsfl_15_fel_idx );
   }

   public void sendrow_152( )
   {
      subsflControlProps_152( ) ;
      wbDC0( ) ;
      if ( ( subGridsdtfasepedidos_Rows * 1 == 0 ) || ( nGXsfl_15_idx - GRIDSDTFASEPEDIDOS_nFirstRecordOnPage <= subgridsdtfasepedidos_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtfasepedidosRow = GXWebRow.GetNew(context,GridsdtfasepedidosContainer) ;
         if ( subGridsdtfasepedidos_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtfasepedidos_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtfasepedidos_Class, "") != 0 )
            {
               subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Odd" ;
            }
         }
         else if ( subGridsdtfasepedidos_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtfasepedidos_Backstyle = (byte)(0) ;
            subGridsdtfasepedidos_Backcolor = subGridsdtfasepedidos_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtfasepedidos_Class, "") != 0 )
            {
               subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtfasepedidos_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtfasepedidos_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtfasepedidos_Class, "") != 0 )
            {
               subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Odd" ;
            }
            subGridsdtfasepedidos_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtfasepedidos_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtfasepedidos_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_15_idx) % (2))) == 0 )
            {
               subGridsdtfasepedidos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtfasepedidos_Class, "") != 0 )
               {
                  subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtfasepedidos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtfasepedidos_Class, "") != 0 )
               {
                  subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_15_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAdicionar_Enabled!=0)&&(edtavAdicionar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 16,'',false,'"+sGXsfl_15_idx+"',15)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtfasepedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAdicionar_Internalname,GXutil.rtrim( AV39Adicionar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAdicionar_Enabled!=0)&&(edtavAdicionar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,16);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVADICIONAR.CLICK."+sGXsfl_15_idx+"'","","","","",edtavAdicionar_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAdicionar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 17,'',false,'"+sGXsfl_15_idx+"',15)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtfasepedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,GXutil.rtrim( AV40Eliminar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,17);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVELIMINAR.CLICK."+sGXsfl_15_idx+"'","","","","",edtavEliminar_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEliminar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtfasepedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtfasepedidos__disfaslin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)).getgxTv_SdtSdtFasePedido_Disfaslin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtfasepedidos__disfaslin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)).getgxTv_SdtSdtFasePedido_Disfaslin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)).getgxTv_SdtSdtFasePedido_Disfaslin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtfasepedidos__disfaslin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtfasepedidos__disfaslin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         gxvsdtfasepedidos__fascod_htmlDC2( AV11EmprCod) ;
         /* Subfile cell */
         if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((dynavSdtfasepedidos__fascod.getEnabled()!=0)&&(dynavSdtfasepedidos__fascod.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'',false,'"+sGXsfl_15_idx+"',15)\"" : " ") ;
         if ( ( dynavSdtfasepedidos__fascod.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SDTFASEPEDIDOS__FASCOD_" + sGXsfl_15_idx ;
            dynavSdtfasepedidos__fascod.setName( GXCCtl );
            dynavSdtfasepedidos__fascod.setWebtags( "" );
         }
         /* ComboBox */
         GridsdtfasepedidosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynavSdtfasepedidos__fascod,dynavSdtfasepedidos__fascod.getInternalname(),GXutil.rtrim( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)).getgxTv_SdtSdtFasePedido_Fascod()),Integer.valueOf(1),dynavSdtfasepedidos__fascod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((dynavSdtfasepedidos__fascod.getEnabled()!=0)&&(dynavSdtfasepedidos__fascod.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,19);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         dynavSdtfasepedidos__fascod.setValue( GXutil.rtrim( ((app.SdtSdtFasePedido)AV30SdtFasePedidos.elementAt(-1+AV45GXV1)).getgxTv_SdtSdtFasePedido_Fascod()) );
         httpContext.ajax_rsp_assign_prop("", false, dynavSdtfasepedidos__fascod.getInternalname(), "Values", dynavSdtfasepedidos__fascod.ToJavascriptSource(), !bGXsfl_15_Refreshing);
         send_integrity_lvl_hashesDC2( ) ;
         GridsdtfasepedidosContainer.AddRow(GridsdtfasepedidosRow);
         nGXsfl_15_idx = ((subGridsdtfasepedidos_Islastpage==1)&&(nGXsfl_15_idx+1>subgridsdtfasepedidos_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      /* End function sendrow_152 */
   }

   public void startgridcontrol15( )
   {
      if ( GridsdtfasepedidosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridsdtfasepedidosContainer"+"DivS\" data-gxgridid=\"15\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtfasepedidos_Internalname, subGridsdtfasepedidos_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtfasepedidos_Backcolorstyle == 0 )
         {
            subGridsdtfasepedidos_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtfasepedidos_Class) > 0 )
            {
               subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtfasepedidos_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtfasepedidos_Backcolorstyle == 1 )
            {
               subGridsdtfasepedidos_Titlebackcolor = subGridsdtfasepedidos_Allbackcolor ;
               if ( GXutil.len( subGridsdtfasepedidos_Class) > 0 )
               {
                  subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtfasepedidos_Class) > 0 )
               {
                  subGridsdtfasepedidos_Linesclass = subGridsdtfasepedidos_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N°", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtfasepedidosContainer.AddObjectProperty("GridName", "Gridsdtfasepedidos");
      }
      else
      {
         GridsdtfasepedidosContainer.AddObjectProperty("GridName", "Gridsdtfasepedidos");
         GridsdtfasepedidosContainer.AddObjectProperty("Header", subGridsdtfasepedidos_Header);
         GridsdtfasepedidosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridsdtfasepedidosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("CmpContext", "");
         GridsdtfasepedidosContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtfasepedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtfasepedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV39Adicionar));
         GridsdtfasepedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAdicionar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddColumnProperties(GridsdtfasepedidosColumn);
         GridsdtfasepedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtfasepedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV40Eliminar));
         GridsdtfasepedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddColumnProperties(GridsdtfasepedidosColumn);
         GridsdtfasepedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtfasepedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtfasepedidos__disfaslin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddColumnProperties(GridsdtfasepedidosColumn);
         GridsdtfasepedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtfasepedidosContainer.AddColumnProperties(GridsdtfasepedidosColumn);
         GridsdtfasepedidosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtfasepedidosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtfasepedidos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavAdicionar_Internalname = "vADICIONAR" ;
      edtavEliminar_Internalname = "vELIMINAR" ;
      edtavSdtfasepedidos__disfaslin_Internalname = "SDTFASEPEDIDOS__DISFASLIN" ;
      dynavSdtfasepedidos__fascod.setInternalname( "SDTFASEPEDIDOS__FASCOD" );
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridsdtfasepedidos_empowerer_Internalname = "GRIDSDTFASEPEDIDOS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsdtfasepedidos_Internalname = "GRIDSDTFASEPEDIDOS" ;
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
      subGridsdtfasepedidos_Allowcollapsing = (byte)(0) ;
      subGridsdtfasepedidos_Allowselection = (byte)(0) ;
      subGridsdtfasepedidos_Header = "" ;
      dynavSdtfasepedidos__fascod.setJsonclick( "" );
      dynavSdtfasepedidos__fascod.setVisible( -1 );
      dynavSdtfasepedidos__fascod.setEnabled( 1 );
      edtavSdtfasepedidos__disfaslin_Jsonclick = "" ;
      edtavSdtfasepedidos__disfaslin_Enabled = 0 ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_Visible = -1 ;
      edtavEliminar_Enabled = 1 ;
      edtavAdicionar_Jsonclick = "" ;
      edtavAdicionar_Visible = -1 ;
      edtavAdicionar_Enabled = 1 ;
      subGridsdtfasepedidos_Class = "GridNoBorder WorkWith" ;
      subGridsdtfasepedidos_Backcolorstyle = (byte)(0) ;
      edtavSdtfasepedidos__disfaslin_Enabled = -1 ;
      divTablecontent_Visible = 1 ;
      Gridsdtfasepedidos_empowerer_Infinitescrolling = "Grid" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Web Datos Pedido Fases", "") );
      subGridsdtfasepedidos_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "SDTFASEPEDIDOS__FASCOD_" + sGXsfl_15_idx ;
      dynavSdtfasepedidos__fascod.setName( GXCCtl );
      dynavSdtfasepedidos__fascod.setWebtags( "" );
      /* End function init_web_controls */
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("GRIDSDTFASEPEDIDOS.LOAD","{handler:'e12DC2',iparms:[]");
      setEventMetadata("GRIDSDTFASEPEDIDOS.LOAD",",oparms:[]}");
      setEventMetadata("VADICIONAR.CLICK","{handler:'e14DC2',iparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV34DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VADICIONAR.CLICK",",oparms:[{av:'AV34DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("VELIMINAR.CLICK","{handler:'e15DC2',iparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV36NumeroIndex',fld:'vNUMEROINDEX',pic:'ZZZ9'},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VELIMINAR.CLICK",",oparms:[{av:'AV36NumeroIndex',fld:'vNUMEROINDEX',pic:'ZZZ9'},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("SDTFASEPEDIDOS__FASCOD.CONTROLVALUECHANGED","{handler:'e16DC2',iparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''}]");
      setEventMetadata("SDTFASEPEDIDOS__FASCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("GRIDSDTFASEPEDIDOS_FIRSTPAGE","{handler:'subgridsdtfasepedidos_firstpage',iparms:[{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15}]");
      setEventMetadata("GRIDSDTFASEPEDIDOS_FIRSTPAGE",",oparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("GRIDSDTFASEPEDIDOS_PREVPAGE","{handler:'subgridsdtfasepedidos_previouspage',iparms:[{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15}]");
      setEventMetadata("GRIDSDTFASEPEDIDOS_PREVPAGE",",oparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("GRIDSDTFASEPEDIDOS_NEXTPAGE","{handler:'subgridsdtfasepedidos_nextpage',iparms:[{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15}]");
      setEventMetadata("GRIDSDTFASEPEDIDOS_NEXTPAGE",",oparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("GRIDSDTFASEPEDIDOS_LASTPAGE","{handler:'subgridsdtfasepedidos_lastpage',iparms:[{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTFASEPEDIDOS_nEOF'},{av:'subGridsdtfasepedidos_Rows',ctrl:'GRIDSDTFASEPEDIDOS',prop:'Rows'},{av:'AV39Adicionar',fld:'vADICIONAR',pic:''},{av:'AV40Eliminar',fld:'vELIMINAR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33NumeroItem',fld:'vNUMEROITEM',pic:'ZZZ9',hsh:true},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV9Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15}]");
      setEventMetadata("GRIDSDTFASEPEDIDOS_LASTPAGE",",oparms:[{av:'AV30SdtFasePedidos',fld:'vSDTFASEPEDIDOS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTFASEPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTFASEPEDIDOS',prop:'GridRC',grid:15},{av:'AV24SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv3',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11EmprCod = "" ;
      AV39Adicionar = "" ;
      AV40Eliminar = "" ;
      AV30SdtFasePedidos = new GXBaseCollection<app.SdtSdtFasePedido>(app.SdtSdtFasePedido.class, "SdtFasePedido", "TexplusNET", remoteHandle);
      AV24SdtEnCabezadoPedido = new app.SdtSdtEncabezadoPedido(remoteHandle, context);
      AV9Contexto = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Gridsdtfasepedidos_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridsdtfasepedidosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtfasepedidos_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H00DC2_A457FasCod = new String[] {""} ;
      H00DC2_A460FasDsc = new String[] {""} ;
      H00DC2_A396EmprCod = new String[] {""} ;
      GXCCtl = "" ;
      AV48Station = "" ;
      AV49Emprnom = "" ;
      AV50Usurcod = "" ;
      AV10DatosPedidoJSON = "" ;
      AV25WebSession = httpContext.getWebSession();
      AV18Mensajes = "" ;
      AV42ProCod = "" ;
      AV41ProDsc = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GridsdtfasepedidosRow = new com.genexus.webpanels.GXWebRow();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      A460FasDsc = "" ;
      AV28SdtFasePedido = new app.SdtSdtFasePedido(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsdtfasepedidos_Linesclass = "" ;
      TempTags = "" ;
      ROClassString = "" ;
      GridsdtfasepedidosColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webdatospedidofases__default(),
         new Object[] {
             new Object[] {
            H00DC2_A457FasCod, H00DC2_A460FasDsc, H00DC2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAdicionar_Enabled = 0 ;
      edtavEliminar_Enabled = 0 ;
      edtavSdtfasepedidos__disfaslin_Enabled = 0 ;
   }

   private byte GRIDSDTFASEPEDIDOS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGridsdtfasepedidos_Backcolorstyle ;
   private byte subGridsdtfasepedidos_Backstyle ;
   private byte subGridsdtfasepedidos_Titlebackstyle ;
   private byte subGridsdtfasepedidos_Allowselection ;
   private byte subGridsdtfasepedidos_Allowhovering ;
   private byte subGridsdtfasepedidos_Allowcollapsing ;
   private byte subGridsdtfasepedidos_Collapsed ;
   private short wcpOAV33NumeroItem ;
   private short AV33NumeroItem ;
   private short AV34DisFasLin ;
   private short AV36NumeroIndex ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV35SiguienteDisFasLin ;
   private int nRC_GXsfl_15 ;
   private int subGridsdtfasepedidos_Rows ;
   private int nGXsfl_15_idx=1 ;
   private int divTablecontent_Visible ;
   private int AV45GXV1 ;
   private int gxdynajaxindex ;
   private int subGridsdtfasepedidos_Islastpage ;
   private int edtavAdicionar_Enabled ;
   private int edtavEliminar_Enabled ;
   private int edtavSdtfasepedidos__disfaslin_Enabled ;
   private int GRIDSDTFASEPEDIDOS_nGridOutOfScope ;
   private int nGXsfl_15_fel_idx=1 ;
   private int nGXsfl_15_bak_idx=1 ;
   private int AV51GXV4 ;
   private int idxLst ;
   private int subGridsdtfasepedidos_Backcolor ;
   private int subGridsdtfasepedidos_Allbackcolor ;
   private int edtavAdicionar_Visible ;
   private int edtavEliminar_Visible ;
   private int subGridsdtfasepedidos_Titlebackcolor ;
   private int subGridsdtfasepedidos_Selectedindex ;
   private int subGridsdtfasepedidos_Selectioncolor ;
   private int subGridsdtfasepedidos_Hoveringcolor ;
   private long GRIDSDTFASEPEDIDOS_nFirstRecordOnPage ;
   private long GRIDSDTFASEPEDIDOS_nCurrentRecord ;
   private long GRIDSDTFASEPEDIDOS_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11EmprCod ;
   private String sGXsfl_15_idx="0001" ;
   private String AV39Adicionar ;
   private String AV40Eliminar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridsdtfasepedidos_empowerer_Gridinternalname ;
   private String Gridsdtfasepedidos_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String sStyleString ;
   private String subGridsdtfasepedidos_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdtfasepedidos_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavAdicionar_Internalname ;
   private String edtavEliminar_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String GXCCtl ;
   private String edtavSdtfasepedidos__disfaslin_Internalname ;
   private String sGXsfl_15_fel_idx="0001" ;
   private String AV48Station ;
   private String AV49Emprnom ;
   private String AV50Usurcod ;
   private String AV42ProCod ;
   private String AV41ProDsc ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String A460FasDsc ;
   private String subGridsdtfasepedidos_Class ;
   private String subGridsdtfasepedidos_Linesclass ;
   private String TempTags ;
   private String ROClassString ;
   private String edtavAdicionar_Jsonclick ;
   private String edtavEliminar_Jsonclick ;
   private String edtavSdtfasepedidos__disfaslin_Jsonclick ;
   private String subGridsdtfasepedidos_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_15_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV15 ;
   private boolean gx_refresh_fired ;
   private String AV9Contexto ;
   private String AV10DatosPedidoJSON ;
   private String AV18Mensajes ;
   private com.genexus.webpanels.GXWebGrid GridsdtfasepedidosContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtfasepedidosRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtfasepedidosColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV25WebSession ;
   private com.genexus.webpanels.GXUserControl ucGridsdtfasepedidos_empowerer ;
   private HTMLChoice dynavSdtfasepedidos__fascod ;
   private IDataStoreProvider pr_default ;
   private String[] H00DC2_A457FasCod ;
   private String[] H00DC2_A460FasDsc ;
   private String[] H00DC2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdtFasePedido> AV30SdtFasePedidos ;
   private app.SdtSdtEncabezadoPedido AV24SdtEnCabezadoPedido ;
   private app.SdtSdtFasePedido AV28SdtFasePedido ;
}

final  class webdatospedidofases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DC2", "SELECT FasCod, FasDsc, EmprCod FROM TXPFASPRO WHERE (Not (rtrim(FasCod) IS NULL AND NOT(FasCod IS NULL))) AND (EmprCod = ?) ORDER BY FasDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               return;
      }
   }

}

