package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class programacionmaquinastestjuancopy1_impl extends GXDataArea
{
   public programacionmaquinastestjuancopy1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public programacionmaquinastestjuancopy1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programacionmaquinastestjuancopy1_impl.class ));
   }

   public programacionmaquinastestjuancopy1_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmaquinas") == 0 )
         {
            gxnrgridmaquinas_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmaquinas") == 0 )
         {
            gxgrgridmaquinas_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhdrs") == 0 )
         {
            gxnrgridhdrs_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridhdrs") == 0 )
         {
            gxgrgridhdrs_refresh_invoke( ) ;
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

   public void gxnrgridmaquinas_newrow_invoke( )
   {
      nRC_GXsfl_15 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_15"))) ;
      nGXsfl_15_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_15_idx"))) ;
      sGXsfl_15_idx = httpContext.GetPar( "sGXsfl_15_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmaquinas_newrow( ) ;
      /* End function gxnrGridmaquinas_newrow_invoke */
   }

   public void gxgrgridmaquinas_refresh_invoke( )
   {
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV34MaqCodCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV27SDTMaquinaCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26SDTMaquina);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmaquinas_refresh( AV34MaqCodCollection, AV27SDTMaquinaCollection, AV26SDTMaquina) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmaquinas_refresh_invoke */
   }

   public void gxnrgridhdrs_newrow_invoke( )
   {
      nRC_GXsfl_24 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_24"))) ;
      nGXsfl_24_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_24_idx"))) ;
      sGXsfl_24_idx = httpContext.GetPar( "sGXsfl_24_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridhdrs_newrow( ) ;
      /* End function gxnrGridhdrs_newrow_invoke */
   }

   public void gxgrgridhdrs_refresh_invoke( )
   {
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV34MaqCodCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26SDTMaquina);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV27SDTMaquinaCollection);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridhdrs_refresh( AV34MaqCodCollection, AV26SDTMaquina, AV27SDTMaquinaCollection) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridhdrs_refresh_invoke */
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
      paT52( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startT52( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.programacionmaquinastestjuancopy1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV27SDTMaquinaCollection));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV26SDTMaquina));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODCOLLECTION", getSecureSignedToken( "", AV34MaqCodCollection));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_15", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_15, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_24", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_24, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINACOLLECTION", AV27SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINACOLLECTION", AV27SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV27SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINA", AV26SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINA", AV26SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV26SDTMaquina));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODCOLLECTION", AV34MaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODCOLLECTION", AV34MaqCodCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODCOLLECTION", getSecureSignedToken( "", AV34MaqCodCollection));
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
         weT52( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtT52( ) ;
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
      return formatLink("app.programacionmaquinastestjuancopy1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProgramacionMaquinasTestJuanCopy1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programacion Maquinas Test Juan Copy1", "") ;
   }

   public void wbT50( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridmaquinasContainer.SetIsFreestyle(true);
         GridmaquinasContainer.SetWrapped(nGXWrapped);
         startgridcontrol15( ) ;
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_15 = (int)(nGXsfl_15_idx-1) ;
         if ( GridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridmaquinas", GridmaquinasContainer, subGridmaquinas_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData", GridmaquinasContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData"+"V", GridmaquinasContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridmaquinasContainerData"+"V"+"\" value='"+GridmaquinasContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridhdrsContainer.SetIsFreestyle(true);
         GridhdrsContainer.SetWrapped(nGXWrapped);
         startgridcontrol24( ) ;
      }
      if ( wbEnd == 24 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_24 = (int)(nGXsfl_24_idx-1) ;
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridhdrs", GridhdrsContainer, subGridhdrs_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData", GridhdrsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V", GridhdrsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V"+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
            if ( GridmaquinasContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridmaquinas", GridmaquinasContainer, subGridmaquinas_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData", GridmaquinasContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData"+"V", GridmaquinasContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridmaquinasContainerData"+"V"+"\" value='"+GridmaquinasContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 24 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridhdrsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridhdrs", GridhdrsContainer, subGridhdrs_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData", GridhdrsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V", GridhdrsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V"+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startT52( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programacion Maquinas Test Juan Copy1", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupT50( ) ;
   }

   public void wsT52( )
   {
      startT52( ) ;
      evtT52( ) ;
   }

   public void evtT52( )
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "GRIDMAQUINAS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_15_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_152( ) ;
                           AV19Maqcod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV19Maqcod);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11T52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMAQUINAS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e12T52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e13T52 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 )
                        {
                           nGXsfl_24_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_243( ) ;
                           AV30Varhtml = httpContext.cgiGet( edtavVarhtml_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
                           AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
                           AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV10BarCodReo, 1, 0));
                           AV9BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV9BarCodPar);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDHDRS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e14T53 ();
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

   public void weT52( )
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

   public void paT52( )
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

   public void gxnrgridmaquinas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_152( ) ;
      while ( nGXsfl_15_idx <= nRC_GXsfl_15 )
      {
         sendrow_152( ) ;
         nGXsfl_15_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_15_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridmaquinasContainer)) ;
      /* End function gxnrGridmaquinas_newrow */
   }

   public void gxnrgridhdrs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_243( ) ;
      while ( nGXsfl_24_idx <= nRC_GXsfl_24 )
      {
         sendrow_243( ) ;
         nGXsfl_24_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_24_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_24_idx+1) ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_243( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridhdrsContainer)) ;
      /* End function gxnrGridhdrs_newrow */
   }

   public void gxgrgridmaquinas_refresh( GXSimpleCollection<String> AV34MaqCodCollection ,
                                         GXBaseCollection<app.SdtSDTMaquina> AV27SDTMaquinaCollection ,
                                         app.SdtSDTMaquina AV26SDTMaquina )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13T52 ();
      GRIDMAQUINAS_nCurrentRecord = 0 ;
      rfT52( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridmaquinas_refresh */
   }

   public void gxgrgridhdrs_refresh( GXSimpleCollection<String> AV34MaqCodCollection ,
                                     app.SdtSDTMaquina AV26SDTMaquina ,
                                     GXBaseCollection<app.SdtSDTMaquina> AV27SDTMaquinaCollection )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13T52 ();
      GRIDHDRS_nCurrentRecord = 0 ;
      rfT53( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridhdrs_refresh */
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
      rfT52( ) ;
      rfT53( ) ;
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

   public void rfT52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridmaquinasContainer.ClearRows();
      }
      wbStart = (short)(15) ;
      /* Execute user event: Refresh */
      e13T52 ();
      nGXsfl_15_idx = 1 ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      bGXsfl_15_Refreshing = true ;
      GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      GridmaquinasContainer.AddObjectProperty("CmpContext", "");
      GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
      GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridmaquinasContainer.setPageSize( subgridmaquinas_fnc_recordsperpage( ) );
      if ( subGridmaquinas_Islastpage != 0 )
      {
         GRIDMAQUINAS_nFirstRecordOnPage = (long)(subgridmaquinas_fnc_recordcount( )-subgridmaquinas_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("GRIDMAQUINAS_nFirstRecordOnPage", GRIDMAQUINAS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_152( ) ;
         e12T52 ();
         wbEnd = (short)(15) ;
         wbT50( ) ;
      }
      bGXsfl_15_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesT52( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINACOLLECTION", AV27SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINACOLLECTION", AV27SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV27SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINA", AV26SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINA", AV26SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV26SDTMaquina));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODCOLLECTION", AV34MaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODCOLLECTION", AV34MaqCodCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODCOLLECTION", getSecureSignedToken( "", AV34MaqCodCollection));
   }

   public void rfT53( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer.ClearRows();
      }
      wbStart = (short)(24) ;
      nGXsfl_24_idx = 1 ;
      sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_243( ) ;
      bGXsfl_24_Refreshing = true ;
      GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      GridhdrsContainer.AddObjectProperty("CmpContext", "");
      GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
      GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GridhdrsContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhdrsContainer.setPageSize( subgridhdrs_fnc_recordsperpage( ) );
      if ( subGridmaquinas_Islastpage != 0 )
      {
         GRIDMAQUINAS_nFirstRecordOnPage = (long)(subgridmaquinas_fnc_recordcount( )-subgridmaquinas_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("GRIDMAQUINAS_nFirstRecordOnPage", GRIDMAQUINAS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_243( ) ;
         e14T53 ();
         wbEnd = (short)(24) ;
         wbT50( ) ;
      }
      bGXsfl_24_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesT53( )
   {
   }

   public int subgridmaquinas_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupT50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11T52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_24 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_24"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      e11T52 ();
      if (returnInSub) return;
   }

   public void e11T52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      programacionmaquinastestjuancopy1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV38Emprcod ;
      GXv_char3[0] = AV39Emprnom ;
      GXv_char4[0] = AV40Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      programacionmaquinastestjuancopy1_impl.this.AV38Emprcod = GXv_char2[0] ;
      programacionmaquinastestjuancopy1_impl.this.AV39Emprnom = GXv_char3[0] ;
      programacionmaquinastestjuancopy1_impl.this.AV40Usurcod = GXv_char4[0] ;
   }

   private void e12T52( )
   {
      /* Gridmaquinas_Load Routine */
      returnInSub = false ;
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV27SDTMaquinaCollection.size() )
      {
         AV26SDTMaquina = (app.SdtSDTMaquina)((app.SdtSDTMaquina)AV27SDTMaquinaCollection.elementAt(-1+AV41GXV1));
         AV19Maqcod = GXutil.substring( AV26SDTMaquina.getgxTv_SdtSDTMaquina_Maqdsc(), 1, 6) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV19Maqcod);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(15) ;
         }
         sendrow_152( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_15_Refreshing )
         {
            httpContext.doAjaxLoad(15, GridmaquinasRow);
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SDTMaquina", AV26SDTMaquina);
   }

   public void e13T52( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTMaquina5 = AV27SDTMaquinaCollection ;
      GXv_objcol_SdtSDTMaquina6[0] = GXt_objcol_SdtSDTMaquina5 ;
      new app.dpmaquina(remoteHandle, context).execute( "001", AV34MaqCodCollection, false, GXv_objcol_SdtSDTMaquina6) ;
      GXt_objcol_SdtSDTMaquina5 = GXv_objcol_SdtSDTMaquina6[0] ;
      AV27SDTMaquinaCollection = GXt_objcol_SdtSDTMaquina5 ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SDTMaquinaCollection", AV27SDTMaquinaCollection);
   }

   private void e14T53( )
   {
      /* Gridhdrs_Load Routine */
      returnInSub = false ;
      AV42GXV2 = 1 ;
      while ( AV42GXV2 <= AV26SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().size() )
      {
         AV5SDTHdrsporMaquina = (app.SdtSDTHdrsporMaquina)((app.SdtSDTHdrsporMaquina)AV26SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().elementAt(-1+AV42GXV2));
         AV8BarCod = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcod() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         AV10BarCodReo = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodreo() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV10BarCodReo, 1, 0));
         AV9BarCodPar = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodpar() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV9BarCodPar);
         AV17Hdr = GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV10BarCodReo, 1, 0) + AV9BarCodPar ;
         AV13Clinom = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Clinom() ;
         AV32Barser = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barser() ;
         AV31Barserdsc = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barserdsc() ;
         AV33BarKgm = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs() ;
         AV11BarcolNom = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnomcli() ;
         AV12BarfasEst = AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest() ;
         AV29BarfasEstTxt = ((AV12BarfasEst==1) ? httpContext.getMessage( "En PROCESO", "") : " ") ;
         AV25Rgb = ((AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()==0) ? 65793 : AV5SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()) ;
         GXv_int7[0] = AV23R ;
         GXv_int8[0] = AV15G ;
         GXv_int9[0] = AV6B ;
         GXv_int10[0] = AV24R2 ;
         GXv_int11[0] = AV16G2 ;
         GXv_int12[0] = AV7B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV25Rgb, GXv_int7, GXv_int8, GXv_int9, GXv_int10, GXv_int11, GXv_int12) ;
         programacionmaquinastestjuancopy1_impl.this.AV23R = GXv_int7[0] ;
         programacionmaquinastestjuancopy1_impl.this.AV15G = GXv_int8[0] ;
         programacionmaquinastestjuancopy1_impl.this.AV6B = GXv_int9[0] ;
         programacionmaquinastestjuancopy1_impl.this.AV24R2 = GXv_int10[0] ;
         programacionmaquinastestjuancopy1_impl.this.AV16G2 = GXv_int11[0] ;
         programacionmaquinastestjuancopy1_impl.this.AV7B2 = GXv_int12[0] ;
         edtavBarcod_Visible = 0 ;
         edtavBarcodreo_Visible = 0 ;
         edtavBarcodpar_Visible = 0 ;
         AV30Varhtml = GXutil.trim( AV11BarcolNom) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         AV30Varhtml += GXutil.trim( AV13Clinom) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         AV30Varhtml += GXutil.trim( AV32Barser) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         AV30Varhtml += GXutil.trim( AV31Barserdsc) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         AV30Varhtml += GXutil.trim( AV17Hdr) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         AV30Varhtml += GXutil.trim( GXutil.str( AV33BarKgm, 9, 2)) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         AV30Varhtml += AV29BarfasEstTxt + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV30Varhtml);
         edtavVarhtml_Forecolor = GXutil.getColor( AV24R2, AV16G2, AV7B2) ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(24) ;
         }
         sendrow_243( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_24_Refreshing )
         {
            httpContext.doAjaxLoad(24, GridhdrsRow);
         }
         AV42GXV2 = (int)(AV42GXV2+1) ;
      }
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paT52( ) ;
      wsT52( ) ;
      weT52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101642686", true, true);
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
         httpContext.AddJavascriptSource("programacionmaquinastestjuancopy1.js", "?20266101642687", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_152( )
   {
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_15_idx ;
   }

   public void subsflControlProps_fel_152( )
   {
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_15_fel_idx ;
   }

   public void sendrow_152( )
   {
      subsflControlProps_152( ) ;
      wbT50( ) ;
      GridmaquinasRow = GXWebRow.GetNew(context,GridmaquinasContainer) ;
      if ( subGridmaquinas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
      }
      else if ( subGridmaquinas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(0) ;
         subGridmaquinas_Backcolor = subGridmaquinas_Allbackcolor ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Uniform" ;
         }
      }
      else if ( subGridmaquinas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
         subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridmaquinas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_15_idx) % (2))) == 0 )
         {
            subGridmaquinas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
            {
               subGridmaquinas_Linesclass = subGridmaquinas_Class+"Even" ;
            }
         }
         else
         {
            subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
            {
               subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridmaquinas_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_15_idx+"\">") ;
      }
      /* Table start */
      GridmaquinasRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablefsgridmaquinas_Internalname+"_"+sGXsfl_15_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      GridmaquinasRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,httpContext.getMessage( "Maquina", ""),"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      GridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV19Maqcod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("table");
      }
      /* End of table */
      send_integrity_lvl_hashesT52( ) ;
      /* End of Columns property logic. */
      GridmaquinasContainer.AddRow(GridmaquinasRow);
      nGXsfl_15_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_15_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      /* End function sendrow_152 */
   }

   public void subsflControlProps_243( )
   {
      edtavVarhtml_Internalname = "vVARHTML_"+sGXsfl_24_idx ;
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_24_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_24_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_24_idx ;
   }

   public void subsflControlProps_fel_243( )
   {
      edtavVarhtml_Internalname = "vVARHTML_"+sGXsfl_24_fel_idx ;
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_24_fel_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_24_fel_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_24_fel_idx ;
   }

   public void sendrow_243( )
   {
      subsflControlProps_243( ) ;
      wbT50( ) ;
      GridhdrsRow = GXWebRow.GetNew(context,GridhdrsContainer) ;
      if ( subGridhdrs_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
         }
      }
      else if ( subGridhdrs_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(0) ;
         subGridhdrs_Backcolor = subGridhdrs_Allbackcolor ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Uniform" ;
         }
      }
      else if ( subGridhdrs_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
         }
         subGridhdrs_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridhdrs_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_24_idx) % (2))) == 0 )
         {
            subGridhdrs_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Even" ;
            }
         }
         else
         {
            subGridhdrs_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridhdrs_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_24_idx+"\">") ;
      }
      /* Table start */
      GridhdrsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablefsgridhdrs_Internalname+"_"+sGXsfl_24_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavVarhtml_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavVarhtml_Internalname,httpContext.getMessage( "Varhtml", ""),"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVarhtml_Internalname,GXutil.rtrim( AV30Varhtml),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavVarhtml_Jsonclick,Integer.valueOf(0),"AttributeFL","color:"+WebUtils.getHTMLColor( edtavVarhtml_Forecolor)+";",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcod_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,httpContext.getMessage( "Codigo Barcada", ""),"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtavBarcod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcodreo_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,httpContext.getMessage( "Codigo Reoperado Barcada", ""),"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtavBarcodreo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcodpar_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,httpContext.getMessage( "Codigo Particion Barcada", ""),"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV9BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtavBarcodpar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("table");
      }
      /* End of table */
      send_integrity_lvl_hashesT53( ) ;
      /* End of Columns property logic. */
      GridhdrsContainer.AddRow(GridhdrsRow);
      nGXsfl_24_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_24_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_24_idx+1) ;
      sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_243( ) ;
      /* End function sendrow_243 */
   }

   public void startgridcontrol15( )
   {
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"DivS\" data-gxgridid=\"15\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmaquinas_Internalname, subGridmaquinas_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      }
      else
      {
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
         GridmaquinasContainer.AddObjectProperty("Header", subGridmaquinas_Header);
         GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGrid");
         GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("CmpContext", "");
         GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasColumn.AddObjectProperty("Value", GXutil.rtrim( AV19Maqcod));
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol24( )
   {
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"DivS\" data-gxgridid=\"24\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridhdrs_Internalname, subGridhdrs_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      }
      else
      {
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
         GridhdrsContainer.AddObjectProperty("Header", subGridhdrs_Header);
         GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         GridhdrsContainer.AddObjectProperty("Class", "FreeStyleGrid");
         GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("CmpContext", "");
         GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV30Varhtml));
         GridhdrsColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavVarhtml_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV9BarCodPar));
         GridhdrsColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      tblUnnamedtablefsgridmaquinas_Internalname = "UNNAMEDTABLEFSGRIDMAQUINAS" ;
      edtavVarhtml_Internalname = "vVARHTML" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      tblUnnamedtablefsgridhdrs_Internalname = "UNNAMEDTABLEFSGRIDHDRS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridmaquinas_Internalname = "GRIDMAQUINAS" ;
      subGridhdrs_Internalname = "GRIDHDRS" ;
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
      subGridhdrs_Allowcollapsing = (byte)(0) ;
      subGridmaquinas_Allowcollapsing = (byte)(0) ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Visible = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Visible = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Visible = 1 ;
      edtavVarhtml_Jsonclick = "" ;
      edtavVarhtml_Forecolor = (int)(0x000000) ;
      subGridhdrs_Class = "FreeStyleGrid" ;
      edtavMaqcod_Jsonclick = "" ;
      subGridmaquinas_Class = "FreeStyleGrid" ;
      subGridhdrs_Backcolorstyle = (byte)(0) ;
      subGridmaquinas_Backcolorstyle = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programacion Maquinas Test Juan Copy1", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDMAQUINAS_nEOF'},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'AV27SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'AV26SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true},{av:'AV34MaqCodCollection',fld:'vMAQCODCOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV27SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]}");
      setEventMetadata("GRIDMAQUINAS.LOAD","{handler:'e12T52',iparms:[{av:'AV27SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("GRIDMAQUINAS.LOAD",",oparms:[{av:'AV26SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true},{av:'AV19Maqcod',fld:'vMAQCOD',pic:''}]}");
      setEventMetadata("GRIDHDRS.LOAD","{handler:'e14T53',iparms:[{av:'AV26SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true}]");
      setEventMetadata("GRIDHDRS.LOAD",",oparms:[{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'edtavBarcod_Visible',ctrl:'vBARCOD',prop:'Visible'},{av:'edtavBarcodreo_Visible',ctrl:'vBARCODREO',prop:'Visible'},{av:'edtavBarcodpar_Visible',ctrl:'vBARCODPAR',prop:'Visible'},{av:'AV30Varhtml',fld:'vVARHTML',pic:''},{av:'edtavVarhtml_Forecolor',ctrl:'vVARHTML',prop:'Forecolor'}]}");
      setEventMetadata("NULL","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barcodpar',iparms:[]");
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
      AV34MaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27SDTMaquinaCollection = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      AV26SDTMaquina = new app.SdtSDTMaquina(remoteHandle, context);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridmaquinasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV19Maqcod = "" ;
      AV30Varhtml = "" ;
      AV9BarCodPar = "" ;
      AV37Station = "" ;
      GXt_char1 = "" ;
      AV38Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV39Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV40Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GridmaquinasRow = new com.genexus.webpanels.GXWebRow();
      GXt_objcol_SdtSDTMaquina5 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquina6 = new GXBaseCollection[1] ;
      AV5SDTHdrsporMaquina = new app.SdtSDTHdrsporMaquina(remoteHandle, context);
      AV17Hdr = "" ;
      AV13Clinom = "" ;
      AV32Barser = "" ;
      AV31Barserdsc = "" ;
      AV33BarKgm = DecimalUtil.ZERO ;
      AV11BarcolNom = "" ;
      AV29BarfasEstTxt = "" ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GridhdrsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridmaquinas_Linesclass = "" ;
      ROClassString = "" ;
      subGridhdrs_Linesclass = "" ;
      subGridmaquinas_Header = "" ;
      GridmaquinasColumn = new com.genexus.webpanels.GXWebColumn();
      subGridhdrs_Header = "" ;
      GridhdrsColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV10BarCodReo ;
   private byte nDonePA ;
   private byte subGridmaquinas_Backcolorstyle ;
   private byte subGridhdrs_Backcolorstyle ;
   private byte GRIDMAQUINAS_nEOF ;
   private byte GRIDHDRS_nEOF ;
   private byte AV12BarfasEst ;
   private byte subGridmaquinas_Backstyle ;
   private byte subGridhdrs_Backstyle ;
   private byte subGridmaquinas_Allowselection ;
   private byte subGridmaquinas_Allowhovering ;
   private byte subGridmaquinas_Allowcollapsing ;
   private byte subGridmaquinas_Collapsed ;
   private byte subGridhdrs_Allowselection ;
   private byte subGridhdrs_Allowhovering ;
   private byte subGridhdrs_Allowcollapsing ;
   private byte subGridhdrs_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV23R ;
   private short GXv_int7[] ;
   private short AV15G ;
   private short GXv_int8[] ;
   private short AV6B ;
   private short GXv_int9[] ;
   private short AV24R2 ;
   private short GXv_int10[] ;
   private short AV16G2 ;
   private short GXv_int11[] ;
   private short AV7B2 ;
   private short GXv_int12[] ;
   private int nRC_GXsfl_15 ;
   private int nRC_GXsfl_24 ;
   private int nGXsfl_15_idx=1 ;
   private int nGXsfl_24_idx=1 ;
   private int AV8BarCod ;
   private int subGridmaquinas_Islastpage ;
   private int subGridhdrs_Islastpage ;
   private int AV41GXV1 ;
   private int AV42GXV2 ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int edtavVarhtml_Forecolor ;
   private int idxLst ;
   private int subGridmaquinas_Backcolor ;
   private int subGridmaquinas_Allbackcolor ;
   private int subGridhdrs_Backcolor ;
   private int subGridhdrs_Allbackcolor ;
   private int subGridmaquinas_Selectedindex ;
   private int subGridmaquinas_Selectioncolor ;
   private int subGridmaquinas_Hoveringcolor ;
   private int subGridhdrs_Selectedindex ;
   private int subGridhdrs_Selectioncolor ;
   private int subGridhdrs_Hoveringcolor ;
   private long GRIDMAQUINAS_nCurrentRecord ;
   private long GRIDHDRS_nCurrentRecord ;
   private long GRIDMAQUINAS_nFirstRecordOnPage ;
   private long GRIDHDRS_nFirstRecordOnPage ;
   private long AV25Rgb ;
   private java.math.BigDecimal AV33BarKgm ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_15_idx="0001" ;
   private String sGXsfl_24_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String sStyleString ;
   private String subGridmaquinas_Internalname ;
   private String subGridhdrs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV19Maqcod ;
   private String edtavMaqcod_Internalname ;
   private String AV30Varhtml ;
   private String edtavVarhtml_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String AV9BarCodPar ;
   private String edtavBarcodpar_Internalname ;
   private String AV37Station ;
   private String GXt_char1 ;
   private String AV38Emprcod ;
   private String GXv_char2[] ;
   private String AV39Emprnom ;
   private String GXv_char3[] ;
   private String AV40Usurcod ;
   private String GXv_char4[] ;
   private String AV17Hdr ;
   private String AV13Clinom ;
   private String AV32Barser ;
   private String AV31Barserdsc ;
   private String AV11BarcolNom ;
   private String AV29BarfasEstTxt ;
   private String sGXsfl_15_fel_idx="0001" ;
   private String subGridmaquinas_Class ;
   private String subGridmaquinas_Linesclass ;
   private String tblUnnamedtablefsgridmaquinas_Internalname ;
   private String ROClassString ;
   private String edtavMaqcod_Jsonclick ;
   private String sGXsfl_24_fel_idx="0001" ;
   private String subGridhdrs_Class ;
   private String subGridhdrs_Linesclass ;
   private String tblUnnamedtablefsgridhdrs_Internalname ;
   private String edtavVarhtml_Jsonclick ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String subGridmaquinas_Header ;
   private String subGridhdrs_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_15_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_24_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridmaquinasContainer ;
   private com.genexus.webpanels.GXWebGrid GridhdrsContainer ;
   private com.genexus.webpanels.GXWebRow GridmaquinasRow ;
   private com.genexus.webpanels.GXWebRow GridhdrsRow ;
   private com.genexus.webpanels.GXWebColumn GridmaquinasColumn ;
   private com.genexus.webpanels.GXWebColumn GridhdrsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV34MaqCodCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> AV27SDTMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> GXt_objcol_SdtSDTMaquina5 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXv_objcol_SdtSDTMaquina6[] ;
   private app.SdtSDTHdrsporMaquina AV5SDTHdrsporMaquina ;
   private app.SdtSDTMaquina AV26SDTMaquina ;
}

