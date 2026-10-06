package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwdevpza_impl extends GXDataArea
{
   public webwdevpza_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwdevpza_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwdevpza_impl.class ));
   }

   public webwdevpza_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavOp = UIFactory.getCheckbox(this);
      cmbAlbRUni = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5ALbRecCod = (int)(GXutil.lval( httpContext.GetPar( "ALbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAlbreccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ALbRecCod), 8, 0));
               AV9DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DevGenCod), 8, 0));
               AV11DevGenUni = CommonUtil.decimalVal( httpContext.GetPar( "DevGenUni"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11DevGenUni", GXutil.ltrimstr( AV11DevGenUni, 9, 2));
               AV10DevGenPie = (short)(GXutil.lval( httpContext.GetPar( "DevGenPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DevGenPie), 4, 0));
               AV7AlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "AlbRUniUti"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRUniUti", GXutil.ltrimstr( AV7AlbRUniUti, 9, 2));
               AV6AlbRPieUti = (int)(GXutil.lval( httpContext.GetPar( "AlbRPieUti"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbRPieUti), 6, 0));
            }
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_6 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_6"))) ;
      nGXsfl_6_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_6_idx"))) ;
      sGXsfl_6_idx = httpContext.GetPar( "sGXsfl_6_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      AV5ALbRecCod = (int)(GXutil.lval( httpContext.GetPar( "ALbRecCod"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( AV5ALbRecCod, A396EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
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
      paB92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startB92( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5ALbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(AV10DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV7AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_6", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_6, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGENCOD", GXutil.ltrim( localUtil.ntoc( AV9DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGENUNI", GXutil.ltrim( localUtil.ntoc( AV11DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGENPIE", GXutil.ltrim( localUtil.ntoc( AV10DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV7AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV6AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weB92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtB92( ) ;
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
      return formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5ALbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(AV10DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV7AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
   }

   public String getPgmname( )
   {
      return "WebWdevpza" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion de Piezas", "") ;
   }

   public void wbB90( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol6( ) ;
      }
      if ( wbEnd == 6 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_6 = (int)(nGXsfl_6_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_19_B92( true) ;
      }
      else
      {
         wb_table1_19_B92( false) ;
      }
      return  ;
   }

   public void wb_table1_19_B92e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 6 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startB92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion de Piezas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupB90( ) ;
   }

   public void wsB92( )
   {
      startB92( ) ;
      evtB92( ) ;
   }

   public void evtB92( )
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
                        else if ( GXutil.strcmp(sEvt, "'ACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Actualizar' */
                           e11B92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e12B92 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_6_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_6_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_6_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_62( ) ;
                           AV28Op = ((GXutil.strcmp(httpContext.cgiGet( chkavOp.getInternalname()), "X")==0) ? "X" : "Z") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV28Op);
                           AV5ALbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlbreccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ALbRecCod), 8, 0));
                           A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
                           A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
                           A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGSSALD");
                              GX_FocusControl = edtavKgssald_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV14KgsSald = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV14KgsSald, 9, 2));
                           }
                           else
                           {
                              AV14KgsSald = localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV14KgsSald, 9, 2));
                           }
                           A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
                           A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMtssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMtssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTSSALD");
                              GX_FocusControl = edtavMtssald_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23MtsSald = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( AV23MtsSald, 9, 2));
                           }
                           else
                           {
                              AV23MtsSald = localUtil.ctond( httpContext.cgiGet( edtavMtssald_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( AV23MtsSald, 9, 2));
                           }
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13B92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14B92 ();
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

   public void weB92( )
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

   public void paB92( )
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_62( ) ;
      while ( nGXsfl_6_idx <= nRC_GXsfl_6 )
      {
         sendrow_62( ) ;
         nGXsfl_6_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_6_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_6_idx+1) ;
         sGXsfl_6_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_6_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_62( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int AV5ALbRecCod ,
                                  String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rfB92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
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
      send_integrity_hashes( ) ;
      rfB92( ) ;
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
   }

   public int subgrid1client_rec_count_fnc( )
   {
      GRID1_nRecordCount = 0 ;
      /* Using cursor H00B92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV5ALbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = H00B92_A44AlbRecCod[0] ;
         A56AlbRUni = H00B92_A56AlbRUni[0] ;
         A2158AlbRecMtrU = H00B92_A2158AlbRecMtrU[0] ;
         A2157AlbRecMtr = H00B92_A2157AlbRecMtr[0] ;
         A2156AlbRecKgmU = H00B92_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = H00B92_A2155AlbRecKgm[0] ;
         A2159AlbRecPie = H00B92_A2159AlbRecPie[0] ;
         A56AlbRUni = H00B92_A56AlbRUni[0] ;
         if ( ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) > 0 ) ) || ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) > 0 ) ) )
         {
            GRID1_nRecordCount = (long)(GRID1_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      return (int)(GRID1_nRecordCount) ;
   }

   public void rfB92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(6) ;
      nGXsfl_6_idx = 1 ;
      sGXsfl_6_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_6_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_62( ) ;
      bGXsfl_6_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_62( ) ;
         /* Using cursor H00B93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV5ALbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = H00B93_A44AlbRecCod[0] ;
            A56AlbRUni = H00B93_A56AlbRUni[0] ;
            A2158AlbRecMtrU = H00B93_A2158AlbRecMtrU[0] ;
            A2157AlbRecMtr = H00B93_A2157AlbRecMtr[0] ;
            A2156AlbRecKgmU = H00B93_A2156AlbRecKgmU[0] ;
            A2155AlbRecKgm = H00B93_A2155AlbRecKgm[0] ;
            A2159AlbRecPie = H00B93_A2159AlbRecPie[0] ;
            A56AlbRUni = H00B93_A56AlbRUni[0] ;
            if ( ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) > 0 ) ) || ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) > 0 ) ) )
            {
               /* Execute user event: Load */
               e14B92 ();
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         wbEnd = (short)(6) ;
         wbB90( ) ;
      }
      bGXsfl_6_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesB92( )
   {
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupB90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13B92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_6 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e13B92 ();
      if (returnInSub) return;
   }

   public void e13B92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwdevpza_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwdevpza_impl.this.A396EmprCod = GXv_char2[0] ;
      webwdevpza_impl.this.AV13EmprNom = GXv_char3[0] ;
      webwdevpza_impl.this.AV25UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
   }

   public void e11B92( )
   {
      /* 'Actualizar' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_6 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_6_fel_idx = 0 ;
      while ( nGXsfl_6_fel_idx < nRC_GXsfl_6 )
      {
         nGXsfl_6_fel_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_6_fel_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_6_fel_idx+1) ;
         sGXsfl_6_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_6_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_62( ) ;
         AV28Op = ((GXutil.strcmp(httpContext.cgiGet( chkavOp.getInternalname()), "X")==0) ? "X" : "Z") ;
         AV5ALbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGSSALD");
            GX_FocusControl = edtavKgssald_Internalname ;
            wbErr = true ;
            AV14KgsSald = DecimalUtil.ZERO ;
         }
         else
         {
            AV14KgsSald = localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)) ;
         }
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMtssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMtssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTSSALD");
            GX_FocusControl = edtavMtssald_Internalname ;
            wbErr = true ;
            AV23MtsSald = DecimalUtil.ZERO ;
         }
         else
         {
            AV23MtsSald = localUtil.ctond( httpContext.cgiGet( edtavMtssald_Internalname)) ;
         }
         cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         if ( GXutil.strcmp(AV28Op, "X") == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = AV9DevGenCod ;
            GXv_int6[0] = AV5ALbRecCod ;
            GXv_char3[0] = A2159AlbRecPie ;
            GXv_decimal7[0] = AV14KgsSald ;
            GXv_decimal8[0] = AV23MtsSald ;
            GXv_char2[0] = A56AlbRUni ;
            GXv_decimal9[0] = AV11DevGenUni ;
            GXv_int10[0] = AV10DevGenPie ;
            GXv_decimal11[0] = AV7AlbRUniUti ;
            GXv_int12[0] = AV6AlbRPieUti ;
            new app.pdevpza(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_char2, GXv_decimal9, GXv_int10, GXv_decimal11, GXv_int12) ;
            webwdevpza_impl.this.A396EmprCod = GXv_char4[0] ;
            webwdevpza_impl.this.AV9DevGenCod = GXv_int5[0] ;
            webwdevpza_impl.this.AV5ALbRecCod = GXv_int6[0] ;
            webwdevpza_impl.this.A2159AlbRecPie = GXv_char3[0] ;
            webwdevpza_impl.this.AV14KgsSald = GXv_decimal7[0] ;
            webwdevpza_impl.this.AV23MtsSald = GXv_decimal8[0] ;
            webwdevpza_impl.this.A56AlbRUni = GXv_char2[0] ;
            webwdevpza_impl.this.AV11DevGenUni = GXv_decimal9[0] ;
            webwdevpza_impl.this.AV10DevGenPie = GXv_int10[0] ;
            webwdevpza_impl.this.AV7AlbRUniUti = GXv_decimal11[0] ;
            webwdevpza_impl.this.AV6AlbRPieUti = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DevGenCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavAlbreccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ALbRecCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV14KgsSald, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( AV23MtsSald, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV11DevGenUni", GXutil.ltrimstr( AV11DevGenUni, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV10DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DevGenPie), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRUniUti", GXutil.ltrimstr( AV7AlbRUniUti, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV6AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbRPieUti), 6, 0));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_6_fel_idx == 0 )
      {
         nGXsfl_6_idx = 1 ;
         sGXsfl_6_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_6_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_62( ) ;
      }
      nGXsfl_6_fel_idx = 1 ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(AV5ALbRecCod),Integer.valueOf(AV9DevGenCod),AV11DevGenUni,Short.valueOf(AV10DevGenPie),AV7AlbRUniUti,Integer.valueOf(AV6AlbRPieUti)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV5ALbRecCod","AV9DevGenCod","AV11DevGenUni","AV10DevGenPie","AV7AlbRUniUti","AV6AlbRPieUti"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e12B92 ();
      if (returnInSub) return;
   }

   public void e12B92( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Op, "X") == 0 )
      {
         AV28Op = "" ;
         httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV28Op);
      }
      else
      {
         AV28Op = "X" ;
         httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV28Op);
      }
      /*  Sending Event outputs  */
   }

   private void e14B92( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV23MtsSald = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( AV23MtsSald, 9, 2));
      AV14KgsSald = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV14KgsSald, 9, 2));
      sendrow_62( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_6_Refreshing )
      {
         httpContext.doAjaxLoad(6, Grid1Row);
      }
   }

   public void wb_table1_19_B92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttEnter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 6, 1, 0)+","+"null"+");", httpContext.getMessage( "Marcar/Desmarcar", ""), bttEnter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWdevpza.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttMarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 6, 1, 0)+","+"null"+");", httpContext.getMessage( "Marcar Todos", ""), bttMarcartodos_Jsonclick, 7, httpContext.getMessage( "Marcar Todos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15b91_client"+"'", TempTags, "", 2, "HLP_WebWdevpza.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttActualizar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 6, 1, 0)+","+"null"+");", httpContext.getMessage( "Actualizar", ""), bttActualizar_Jsonclick, 5, httpContext.getMessage( "Actualizar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'ACTUALIZAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWdevpza.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_B92e( true) ;
      }
      else
      {
         wb_table1_19_B92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV5ALbRecCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAlbreccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ALbRecCod), 8, 0));
      AV9DevGenCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DevGenCod), 8, 0));
      AV11DevGenUni = (java.math.BigDecimal)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11DevGenUni", GXutil.ltrimstr( AV11DevGenUni, 9, 2));
      AV10DevGenPie = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DevGenPie), 4, 0));
      AV7AlbRUniUti = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRUniUti", GXutil.ltrimstr( AV7AlbRUniUti, 9, 2));
      AV6AlbRPieUti = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbRPieUti), 6, 0));
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
      paB92( ) ;
      wsB92( ) ;
      weB92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016405541", true, true);
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
      httpContext.AddJavascriptSource("webwdevpza.js", "?202661016405541", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_62( )
   {
      chkavOp.setInternalname( "vOP_"+sGXsfl_6_idx );
      edtavAlbreccod_Internalname = "vALBRECCOD_"+sGXsfl_6_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_6_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_6_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_6_idx ;
      edtavKgssald_Internalname = "vKGSSALD_"+sGXsfl_6_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_6_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_6_idx ;
      edtavMtssald_Internalname = "vMTSSALD_"+sGXsfl_6_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_6_idx );
   }

   public void subsflControlProps_fel_62( )
   {
      chkavOp.setInternalname( "vOP_"+sGXsfl_6_fel_idx );
      edtavAlbreccod_Internalname = "vALBRECCOD_"+sGXsfl_6_fel_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_6_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_6_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_6_fel_idx ;
      edtavKgssald_Internalname = "vKGSSALD_"+sGXsfl_6_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_6_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_6_fel_idx ;
      edtavMtssald_Internalname = "vMTSSALD_"+sGXsfl_6_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_6_fel_idx );
   }

   public void sendrow_62( )
   {
      subsflControlProps_62( ) ;
      wbB90( ) ;
      Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_6_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_6_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Check box */
      TempTags = " " + ((chkavOp.getEnabled()!=0)&&(chkavOp.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 7,'',false,'"+sGXsfl_6_idx+"',6)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "vOP_" + sGXsfl_6_idx ;
      chkavOp.setName( GXCCtl );
      chkavOp.setWebtags( "" );
      chkavOp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOp.getInternalname(), "TitleCaption", chkavOp.getCaption(), !bGXsfl_6_Refreshing);
      chkavOp.setCheckedValue( "Z" );
      AV28Op = ((GXutil.strcmp(GXutil.rtrim( AV28Op), "X")==0) ? "X" : "Z") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV28Op);
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavOp.getInternalname(),AV28Op,"","",Integer.valueOf(-1),Integer.valueOf(1),"X","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(7, this, 'X', 'Z',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavOp.getEnabled()!=0)&&(chkavOp.getVisible()!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,7);\"" : " ")});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbreccod_Internalname,GXutil.ltrim( localUtil.ntoc( AV5ALbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5ALbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbreccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavKgssald_Enabled!=0)&&(edtavKgssald_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 12,'',false,'"+sGXsfl_6_idx+"',6)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgssald_Internalname,GXutil.ltrim( localUtil.ntoc( AV14KgsSald, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV14KgsSald, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavKgssald_Enabled!=0)&&(edtavKgssald_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,12);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKgssald_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavMtssald_Enabled!=0)&&(edtavMtssald_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 15,'',false,'"+sGXsfl_6_idx+"',6)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMtssald_Internalname,GXutil.ltrim( localUtil.ntoc( AV23MtsSald, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV23MtsSald, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavMtssald_Enabled!=0)&&(edtavMtssald_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,15);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMtssald_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_6_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_6_Refreshing);
      send_integrity_lvl_hashesB92( ) ;
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_6_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_6_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_6_idx+1) ;
      sGXsfl_6_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_6_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_62( ) ;
      /* End function sendrow_62 */
   }

   public void startgridcontrol6( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"6\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AlbRecPie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Uti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Uti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid1Container.Clear();
         }
         Grid1Container.SetWrapped(nGXWrapped);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV28Op));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV5ALbRecCod, (byte)(8), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14KgsSald, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23MtsSald, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      chkavOp.setInternalname( "vOP" );
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtavKgssald_Internalname = "vKGSSALD" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtavMtssald_Internalname = "vMTSSALD" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      bttEnter_Internalname = "ENTER" ;
      bttMarcartodos_Internalname = "MARCARTODOS" ;
      bttActualizar_Internalname = "ACTUALIZAR" ;
      tblTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtavMtssald_Jsonclick = "" ;
      edtavMtssald_Visible = -1 ;
      edtavMtssald_Enabled = 1 ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtavKgssald_Jsonclick = "" ;
      edtavKgssald_Visible = -1 ;
      edtavKgssald_Enabled = 1 ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      edtavAlbreccod_Jsonclick = "" ;
      chkavOp.setCaption( "" );
      chkavOp.setVisible( -1 );
      chkavOp.setEnabled( 1 );
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Devolucion de Piezas", "") );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vOP_" + sGXsfl_6_idx ;
      chkavOp.setName( GXCCtl );
      chkavOp.setWebtags( "" );
      chkavOp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOp.getInternalname(), "TitleCaption", chkavOp.getCaption(), !bGXsfl_6_Refreshing);
      chkavOp.setCheckedValue( "Z" );
      AV28Op = ((GXutil.strcmp(GXutil.rtrim( AV28Op), "X")==0) ? "X" : "Z") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV28Op);
      GXCCtl = "ALBRUNI_" + sGXsfl_6_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV5ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ACTUALIZAR'","{handler:'e11B92',iparms:[{av:'AV28Op',fld:'vOP',grid:6,pic:'@!'},{av:'GRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_6',ctrl:'GRID1',grid:6,prop:'GridRC',grid:6},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV9DevGenCod',fld:'vDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV5ALbRecCod',fld:'vALBRECCOD',grid:6,pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',grid:6,pic:''},{av:'AV14KgsSald',fld:'vKGSSALD',grid:6,pic:'ZZZZZ9.99'},{av:'AV23MtsSald',fld:'vMTSSALD',grid:6,pic:'ZZZZZ9.99'},{av:'A56AlbRUni',fld:'ALBRUNI',grid:6,pic:'@!'},{av:'AV11DevGenUni',fld:'vDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV10DevGenPie',fld:'vDEVGENPIE',pic:'ZZZ9'},{av:'AV7AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV6AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'}]");
      setEventMetadata("'ACTUALIZAR'",",oparms:[{av:'AV6AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV7AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV10DevGenPie',fld:'vDEVGENPIE',pic:'ZZZ9'},{av:'AV11DevGenUni',fld:'vDEVGENUNI',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'AV23MtsSald',fld:'vMTSSALD',pic:'ZZZZZ9.99'},{av:'AV14KgsSald',fld:'vKGSSALD',pic:'ZZZZZ9.99'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV5ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9DevGenCod',fld:'vDEVGENCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'MARCAR TODOS'","{handler:'e15B91',iparms:[]");
      setEventMetadata("'MARCAR TODOS'",",oparms:[{av:'AV28Op',fld:'vOP',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e12B92',iparms:[{av:'AV28Op',fld:'vOP',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV28Op',fld:'vOP',pic:'@!'}]}");
      setEventMetadata("VALIDV_ALBRECCOD","{handler:'validv_Albreccod',iparms:[]");
      setEventMetadata("VALIDV_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV11DevGenUni = DecimalUtil.ZERO ;
      AV7AlbRUniUti = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV28Op = "" ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      AV14KgsSald = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      AV23MtsSald = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      scmdbuf = "" ;
      H00B92_A396EmprCod = new String[] {""} ;
      H00B92_A44AlbRecCod = new int[1] ;
      H00B92_A56AlbRUni = new String[] {""} ;
      H00B92_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B92_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B92_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B92_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B92_A2159AlbRecPie = new String[] {""} ;
      H00B93_A396EmprCod = new String[] {""} ;
      H00B93_A44AlbRecCod = new int[1] ;
      H00B93_A56AlbRUni = new String[] {""} ;
      H00B93_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B93_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B93_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B93_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B93_A2159AlbRecPie = new String[] {""} ;
      AV24Station = "" ;
      GXt_char1 = "" ;
      AV13EmprNom = "" ;
      AV25UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttEnter_Jsonclick = "" ;
      bttMarcartodos_Jsonclick = "" ;
      bttActualizar_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwdevpza__default(),
         new Object[] {
             new Object[] {
            H00B92_A396EmprCod, H00B92_A44AlbRecCod, H00B92_A56AlbRUni, H00B92_A2158AlbRecMtrU, H00B92_A2157AlbRecMtr, H00B92_A2156AlbRecKgmU, H00B92_A2155AlbRecKgm, H00B92_A2159AlbRecPie
            }
            , new Object[] {
            H00B93_A396EmprCod, H00B93_A44AlbRecCod, H00B93_A56AlbRUni, H00B93_A2158AlbRecMtrU, H00B93_A2157AlbRecMtr, H00B93_A2156AlbRecKgmU, H00B93_A2155AlbRecKgm, H00B93_A2159AlbRecPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GRID1_nEOF ;
   private short AV10DevGenPie ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int10[] ;
   private int wcpOAV5ALbRecCod ;
   private int nRC_GXsfl_6 ;
   private int AV5ALbRecCod ;
   private int AV9DevGenCod ;
   private int AV6AlbRPieUti ;
   private int nGXsfl_6_idx=1 ;
   private int subGrid1_Islastpage ;
   private int A44AlbRecCod ;
   private int nGXsfl_6_fel_idx=1 ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int GXv_int12[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavKgssald_Enabled ;
   private int edtavKgssald_Visible ;
   private int edtavMtssald_Enabled ;
   private int edtavMtssald_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal AV11DevGenUni ;
   private java.math.BigDecimal AV7AlbRUniUti ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal AV14KgsSald ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal AV23MtsSald ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String edtavAlbreccod_Internalname ;
   private String sGXsfl_6_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV28Op ;
   private String A2159AlbRecPie ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtavKgssald_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtavMtssald_Internalname ;
   private String A56AlbRUni ;
   private String scmdbuf ;
   private String AV24Station ;
   private String GXt_char1 ;
   private String AV13EmprNom ;
   private String AV25UsurCod ;
   private String sGXsfl_6_fel_idx="0001" ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttEnter_Internalname ;
   private String bttEnter_Jsonclick ;
   private String bttMarcartodos_Internalname ;
   private String bttMarcartodos_Jsonclick ;
   private String bttActualizar_Internalname ;
   private String bttActualizar_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavAlbreccod_Jsonclick ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtavKgssald_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtavMtssald_Jsonclick ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_6_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkavOp ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] H00B92_A396EmprCod ;
   private int[] H00B92_A44AlbRecCod ;
   private String[] H00B92_A56AlbRUni ;
   private java.math.BigDecimal[] H00B92_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] H00B92_A2157AlbRecMtr ;
   private java.math.BigDecimal[] H00B92_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] H00B92_A2155AlbRecKgm ;
   private String[] H00B92_A2159AlbRecPie ;
   private String[] H00B93_A396EmprCod ;
   private int[] H00B93_A44AlbRecCod ;
   private String[] H00B93_A56AlbRUni ;
   private java.math.BigDecimal[] H00B93_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] H00B93_A2157AlbRecMtr ;
   private java.math.BigDecimal[] H00B93_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] H00B93_A2155AlbRecKgm ;
   private String[] H00B93_A2159AlbRecPie ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwdevpza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00B92", "SELECT T1.EmprCod, T1.AlbRecCod, T2.AlbRUni, T1.AlbRecMtrU, T1.AlbRecMtr, T1.AlbRecKgmU, T1.AlbRecKgm, T1.AlbRecPie FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00B93", "SELECT T1.EmprCod, T1.AlbRecCod, T2.AlbRUni, T1.AlbRecMtrU, T1.AlbRecMtr, T1.AlbRecKgmU, T1.AlbRecKgm, T1.AlbRecPie FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

