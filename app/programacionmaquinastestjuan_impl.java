package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class programacionmaquinastestjuan_impl extends GXDataArea
{
   public programacionmaquinastestjuan_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public programacionmaquinastestjuan_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programacionmaquinastestjuan_impl.class ));
   }

   public programacionmaquinastestjuan_impl( int remoteHandle ,
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

   public void gxnrgridhdrs_newrow_invoke( )
   {
      nRC_GXsfl_29 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_29"))) ;
      nGXsfl_29_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_29_idx"))) ;
      sGXsfl_29_idx = httpContext.GetPar( "sGXsfl_29_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV38MaqCodCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5SDTMaquina);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6SDTMaquinaCollection);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridhdrs_refresh( AV38MaqCodCollection, AV5SDTMaquina, AV6SDTMaquinaCollection) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridhdrs_refresh_invoke */
   }

   public void gxnrgridmaquinas_newrow_invoke( )
   {
      nRC_GXsfl_16 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_16"))) ;
      nGXsfl_16_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_16_idx"))) ;
      sGXsfl_16_idx = httpContext.GetPar( "sGXsfl_16_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV38MaqCodCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6SDTMaquinaCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5SDTMaquina);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmaquinas_refresh( AV38MaqCodCollection, AV6SDTMaquinaCollection, AV5SDTMaquina) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmaquinas_refresh_invoke */
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
      paBS2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startBS2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.programacionmaquinastestjuan", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODCOLLECTION", getSecureSignedToken( "", AV38MaqCodCollection));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV6SDTMaquinaCollection));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV5SDTMaquina));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_16", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_16, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODCOLLECTION", AV38MaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODCOLLECTION", AV38MaqCodCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODCOLLECTION", getSecureSignedToken( "", AV38MaqCodCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINACOLLECTION", AV6SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINACOLLECTION", AV6SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV6SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINA", AV5SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINA", AV5SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV5SDTMaquina));
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
         weBS2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtBS2( ) ;
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
      return formatLink("app.programacionmaquinastestjuan", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProgramacionMaquinasTestJuan" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programacion Maquinas II", "") ;
   }

   public void wbBS0( )
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
         wb_table1_6_BS2( true) ;
      }
      else
      {
         wb_table1_6_BS2( false) ;
      }
      return  ;
   }

   public void wb_table1_6_BS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridmaquinasContainer.SetIsFreestyle(true);
         GridmaquinasContainer.SetWrapped(nGXWrapped);
         startgridcontrol16( ) ;
      }
      if ( wbEnd == 16 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_16 = (int)(nGXsfl_16_idx-1) ;
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 16 )
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
      if ( wbEnd == 29 )
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
               if ( ! isAjaxCallMode( ) )
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

   public void startBS2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programacion Maquinas II", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupBS0( ) ;
   }

   public void wsBS2( )
   {
      startBS2( ) ;
      evtBS2( ) ;
   }

   public void evtBS2( )
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "GRIDMAQUINAS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 ) )
                        {
                           nGXsfl_16_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_162( ) ;
                           AV7Maqcod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV7Maqcod);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e11BS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMAQUINAS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e12BS2 ();
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
                              sEvtType = GXutil.right( sEvt, 4) ;
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                              if ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 )
                              {
                                 nGXsfl_29_idx = (int)(GXutil.lval( sEvtType)) ;
                                 sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") + sGXsfl_16_idx ;
                                 subsflControlProps_293( ) ;
                                 AV33Varhtml = httpContext.cgiGet( edtavVarhtml_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
                                 AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
                                 app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
                                 AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV10BarCodReo, 1, 0));
                                 app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
                                 AV11BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV11BarCodPar);
                                 app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
                                 sEvtType = GXutil.right( sEvt, 1) ;
                                 if ( GXutil.strcmp(sEvtType, ".") == 0 )
                                 {
                                    sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                    if ( GXutil.strcmp(sEvt, "GRIDHDRS.LOAD") == 0 )
                                    {
                                       httpContext.wbHandled = (byte)(1) ;
                                       dynload_actions( ) ;
                                       e13BS3 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weBS2( )
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

   public void paBS2( )
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
      subsflControlProps_162( ) ;
      while ( nGXsfl_16_idx <= nRC_GXsfl_16 )
      {
         sendrow_162( ) ;
         nGXsfl_16_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_16_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_16_idx+1) ;
         sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_162( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridmaquinasContainer)) ;
      /* End function gxnrGridmaquinas_newrow */
   }

   public void gxnrgridhdrs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_293( ) ;
      while ( nGXsfl_29_idx <= nRC_GXsfl_29 )
      {
         sendrow_293( ) ;
         nGXsfl_29_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_29_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_29_idx+1) ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") + sGXsfl_16_idx ;
         subsflControlProps_293( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridhdrsContainer)) ;
      /* End function gxnrGridhdrs_newrow */
   }

   public void gxgrgridhdrs_refresh( GXSimpleCollection<String> AV38MaqCodCollection ,
                                     app.SdtSDTMaquina AV5SDTMaquina ,
                                     GXBaseCollection<app.SdtSDTMaquina> AV6SDTMaquinaCollection )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e11BS2 ();
      GRIDHDRS_nCurrentRecord = 0 ;
      rfBS3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridhdrs_refresh */
   }

   public void gxgrgridmaquinas_refresh( GXSimpleCollection<String> AV38MaqCodCollection ,
                                         GXBaseCollection<app.SdtSDTMaquina> AV6SDTMaquinaCollection ,
                                         app.SdtSDTMaquina AV5SDTMaquina )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e11BS2 ();
      GRIDMAQUINAS_nCurrentRecord = 0 ;
      rfBS2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridmaquinas_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodPar));
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
      rfBS2( ) ;
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
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_16_Refreshing);
      edtavVarhtml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarhtml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarhtml_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_29_Refreshing);
   }

   public void rfBS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridmaquinasContainer.ClearRows();
      }
      wbStart = (short)(16) ;
      /* Execute user event: Refresh */
      e11BS2 ();
      nGXsfl_16_idx = 1 ;
      sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_162( ) ;
      bGXsfl_16_Refreshing = true ;
      GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      GridmaquinasContainer.AddObjectProperty("CmpContext", "");
      GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
      GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTop"));
      GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGridTop");
      GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridmaquinasContainer.setPageSize( subgridmaquinas_fnc_recordsperpage( ) );
      if ( subGridhdrs_Islastpage != 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordcount( )-subgridhdrs_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_162( ) ;
         e12BS2 ();
         wbEnd = (short)(16) ;
         wbBS0( ) ;
      }
      bGXsfl_16_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBS2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODCOLLECTION", AV38MaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODCOLLECTION", AV38MaqCodCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODCOLLECTION", getSecureSignedToken( "", AV38MaqCodCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINACOLLECTION", AV6SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINACOLLECTION", AV6SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV6SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINA", AV5SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINA", AV5SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV5SDTMaquina));
   }

   public void rfBS3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer.ClearRows();
      }
      wbStart = (short)(29) ;
      nGXsfl_29_idx = 1 ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") + sGXsfl_16_idx ;
      subsflControlProps_293( ) ;
      bGXsfl_29_Refreshing = true ;
      GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      GridhdrsContainer.AddObjectProperty("CmpContext", "");
      GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
      GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GridhdrsContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhdrsContainer.setPageSize( subgridhdrs_fnc_recordsperpage( ) );
      GXCCtl = "GRIDHDRS_nFirstRecordOnPage_" + sGXsfl_16_idx ;
      if ( subGridhdrs_Islastpage != 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordcount( )-subgridhdrs_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_293( ) ;
         e13BS3 ();
         wbEnd = (short)(29) ;
         wbBS0( ) ;
      }
      bGXsfl_29_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBS3( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
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
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_16_Refreshing);
      edtavVarhtml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarhtml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarhtml_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupBS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_16 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_16"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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

   public void e11BS2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTMaquina1 = AV6SDTMaquinaCollection ;
      GXv_objcol_SdtSDTMaquina2[0] = GXt_objcol_SdtSDTMaquina1 ;
      new app.dpmaquina(remoteHandle, context).execute( "001", AV38MaqCodCollection, false, GXv_objcol_SdtSDTMaquina2) ;
      GXt_objcol_SdtSDTMaquina1 = GXv_objcol_SdtSDTMaquina2[0] ;
      AV6SDTMaquinaCollection = GXt_objcol_SdtSDTMaquina1 ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6SDTMaquinaCollection", AV6SDTMaquinaCollection);
   }

   private void e12BS2( )
   {
      /* Gridmaquinas_Load Routine */
      returnInSub = false ;
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV6SDTMaquinaCollection.size() )
      {
         AV5SDTMaquina = (app.SdtSDTMaquina)((app.SdtSDTMaquina)AV6SDTMaquinaCollection.elementAt(-1+AV41GXV1));
         AV7Maqcod = GXutil.substring( AV5SDTMaquina.getgxTv_SdtSDTMaquina_Maqdsc(), 1, 6) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV7Maqcod);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(16) ;
         }
         sendrow_162( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_16_Refreshing )
         {
            httpContext.doAjaxLoad(16, GridmaquinasRow);
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5SDTMaquina", AV5SDTMaquina);
   }

   private void e13BS3( )
   {
      /* Gridhdrs_Load Routine */
      returnInSub = false ;
      AV42GXV2 = 1 ;
      while ( AV42GXV2 <= AV5SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().size() )
      {
         AV8SDTHdrsporMaquina = (app.SdtSDTHdrsporMaquina)((app.SdtSDTHdrsporMaquina)AV5SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().elementAt(-1+AV42GXV2));
         AV9BarCod = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcod() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
         AV10BarCodReo = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodreo() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV10BarCodReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
         AV11BarCodPar = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodpar() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV11BarCodPar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_29_idx, getSecureSignedToken( sGXsfl_29_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
         AV12Hdr = GXutil.str( AV9BarCod, 8, 0) + "-" + GXutil.str( AV10BarCodReo, 1, 0) + AV11BarCodPar ;
         AV13Clinom = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Clinom() ;
         AV35Barser = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barser() ;
         AV34Barserdsc = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barserdsc() ;
         AV37BarKgm = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs() ;
         AV26BarcolNom = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnomcli() ;
         AV30BarfasEst = AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest() ;
         AV32BarfasEstTxt = ((AV30BarfasEst==1) ? httpContext.getMessage( "En PROCESO", "") : " ") ;
         AV25Rgb = ((AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()==0) ? 65793 : AV8SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()) ;
         GXv_int3[0] = AV18R ;
         GXv_int4[0] = AV16G ;
         GXv_int5[0] = AV14B ;
         GXv_int6[0] = AV19R2 ;
         GXv_int7[0] = AV17G2 ;
         GXv_int8[0] = AV15B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV25Rgb, GXv_int3, GXv_int4, GXv_int5, GXv_int6, GXv_int7, GXv_int8) ;
         programacionmaquinastestjuan_impl.this.AV18R = GXv_int3[0] ;
         programacionmaquinastestjuan_impl.this.AV16G = GXv_int4[0] ;
         programacionmaquinastestjuan_impl.this.AV14B = GXv_int5[0] ;
         programacionmaquinastestjuan_impl.this.AV19R2 = GXv_int6[0] ;
         programacionmaquinastestjuan_impl.this.AV17G2 = GXv_int7[0] ;
         programacionmaquinastestjuan_impl.this.AV15B2 = GXv_int8[0] ;
         edtavBarcod_Visible = 0 ;
         edtavBarcodreo_Visible = 0 ;
         edtavBarcodpar_Visible = 0 ;
         AV33Varhtml = GXutil.trim( AV26BarcolNom) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         AV33Varhtml += GXutil.trim( AV13Clinom) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         AV33Varhtml += GXutil.trim( AV35Barser) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         AV33Varhtml += GXutil.trim( AV34Barserdsc) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         AV33Varhtml += GXutil.trim( AV12Hdr) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         AV33Varhtml += GXutil.trim( GXutil.str( AV37BarKgm, 9, 2)) + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         AV33Varhtml += AV32BarfasEstTxt + httpContext.getMessage( "<br>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVarhtml_Internalname, AV33Varhtml);
         edtavVarhtml_Forecolor = GXutil.getColor( AV19R2, AV17G2, AV15B2) ;
         tblTablehdrs_Backcolor = GXutil.getColor( AV18R, AV16G, AV14B) ;
         httpContext.ajax_rsp_assign_prop("", false, tblTablehdrs_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTablehdrs_Backcolor), 9, 0), !bGXsfl_29_Refreshing);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(29) ;
         }
         sendrow_293( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_29_Refreshing )
         {
            httpContext.doAjaxLoad(29, GridhdrsRow);
         }
         AV42GXV2 = (int)(AV42GXV2+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_6_BS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString += "border:" + GXutil.str( 1, 3, 0) + "px solid;" ;
         if ( GXutil.strcmp(WebUtils.getHTMLColor( (int)(0xC0C0C0))+";", "") != 0 )
         {
            sStyleString += " border-color: " + WebUtils.getHTMLColor( (int)(0xC0C0C0)) + ";" ;
         }
         app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 1, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_6_BS2e( true) ;
      }
      else
      {
         wb_table1_6_BS2e( false) ;
      }
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
      paBS2( ) ;
      wsBS2( ) ;
      weBS2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016405187", true, true);
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
         httpContext.AddJavascriptSource("programacionmaquinastestjuan.js", "?202661016405187", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_293( )
   {
      edtavVarhtml_Internalname = "vVARHTML_"+sGXsfl_29_idx ;
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_29_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_29_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_29_idx ;
   }

   public void subsflControlProps_fel_293( )
   {
      edtavVarhtml_Internalname = "vVARHTML_"+sGXsfl_29_fel_idx ;
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_29_fel_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_29_fel_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_29_fel_idx ;
   }

   public void sendrow_293( )
   {
      subsflControlProps_293( ) ;
      wbBS0( ) ;
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
         if ( ((int)((nGXsfl_29_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGridhdrs_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_29_idx+"\">") ;
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGridhdrs_Linesclass,""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGrid2table_Internalname+"_"+sGXsfl_29_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Table start */
      GridhdrsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablehdrs_Internalname+"_"+sGXsfl_29_idx,Integer.valueOf(1),"","",Integer.valueOf(tblTablehdrs_Backcolor),(int)(0xFFFFFF),"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavVarhtml_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVarhtml_Internalname,GXutil.rtrim( AV33Varhtml),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavVarhtml_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavVarhtml_Forecolor)+";",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavVarhtml_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcod_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcod_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavBarcod_Visible),Integer.valueOf(edtavBarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcodreo_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavBarcodreo_Visible),Integer.valueOf(edtavBarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcodpar_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV11BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavBarcodpar_Visible),Integer.valueOf(edtavBarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
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
      send_integrity_lvl_hashesBS3( ) ;
      /* End of Columns property logic. */
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_29_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      GridhdrsContainer.AddRow(GridhdrsRow);
      nGXsfl_29_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_29_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_29_idx+1) ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") + sGXsfl_16_idx ;
      subsflControlProps_293( ) ;
      /* End function sendrow_293 */
   }

   public void subsflControlProps_162( )
   {
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_16_idx ;
      subGridhdrs_Internalname = "GRIDHDRS_"+sGXsfl_16_idx ;
   }

   public void subsflControlProps_fel_162( )
   {
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_16_fel_idx ;
      subGridhdrs_Internalname = "GRIDHDRS_"+sGXsfl_16_fel_idx ;
   }

   public void sendrow_162( )
   {
      subsflControlProps_162( ) ;
      wbBS0( ) ;
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
         subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
      }
      /* Start of Columns property logic. */
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGridmaquinas_Linesclass,""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGrid1table_Internalname+"_"+sGXsfl_16_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","","div"});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Table start */
      GridmaquinasRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablemaquinas_Internalname+"_"+sGXsfl_16_idx,Integer.valueOf(1),"Table100x100","","",(int)(0xF5F5F5),"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"","","div"});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV7Maqcod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavMaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","","FreeStyleGridCell"});
      /*  Child Grid Control  */
      GridmaquinasRow.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"GridhdrsContainer"});
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         GridhdrsContainer.Clear();
      }
      GridhdrsContainer.SetIsFreestyle(true);
      GridhdrsContainer.SetWrapped(nGXWrapped);
      startgridcontrol29( ) ;
      rfBS3( ) ;
      nRC_GXsfl_29 = (int)(nGXsfl_29_idx-1) ;
      send_integrity_footer_hashes( ) ;
      GXCCtl = "nRC_GXsfl_29_" + sGXsfl_16_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_29, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "</table>") ;
      }
      else
      {
         if ( ! isAjaxCallMode( ) )
         {
            app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"_"+sGXsfl_16_idx, GridhdrsContainer.ToJavascriptSource());
         }
         if ( isAjaxCallMode( ) )
         {
            GridmaquinasRow.AddGrid("Gridhdrs", GridhdrsContainer);
         }
         if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
         {
            app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V_"+sGXsfl_16_idx, GridhdrsContainer.GridValuesHidden());
         }
         else
         {
            httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V_"+sGXsfl_16_idx+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
         }
      }
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
      send_integrity_lvl_hashesBS2( ) ;
      /* End of Columns property logic. */
      GridmaquinasContainer.AddRow(GridmaquinasRow);
      nGXsfl_16_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_16_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_16_idx+1) ;
      sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_162( ) ;
      /* End function sendrow_162 */
   }

   public void startgridcontrol16( )
   {
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"DivS\" data-gxgridid=\"16\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmaquinas_Internalname, subGridmaquinas_Internalname, " "+"sdsmartgrid_snaptogrid=\"False\""+" ", "FreeStyleGridTop", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      }
      else
      {
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
         GridmaquinasContainer.AddObjectProperty("Header", subGridmaquinas_Header);
         GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTop"));
         GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGridTop");
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
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasColumn.AddObjectProperty("Value", GXutil.rtrim( AV7Maqcod));
         GridmaquinasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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

   public void startgridcontrol29( )
   {
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"DivS\" data-gxgridid=\"29\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridhdrs_Internalname, subGridhdrs_Internalname, " "+"sdsmartgrid_snaptogrid=\"False\""+" ", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV33Varhtml));
         GridhdrsColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavVarhtml_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVarhtml_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV11BarCodPar));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      tblTable2_Internalname = "TABLE2" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavVarhtml_Internalname = "vVARHTML" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      tblTablehdrs_Internalname = "TABLEHDRS" ;
      divGrid2table_Internalname = "GRID2TABLE" ;
      tblTablemaquinas_Internalname = "TABLEMAQUINAS" ;
      divGrid1table_Internalname = "GRID1TABLE" ;
      divTable4_Internalname = "TABLE4" ;
      divTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridhdrs_Internalname = "GRIDHDRS" ;
      subGridmaquinas_Internalname = "GRIDMAQUINAS" ;
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
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      subGridmaquinas_Class = "FreeStyleGridTop" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodpar_Visible = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodreo_Visible = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcod_Visible = 1 ;
      edtavVarhtml_Jsonclick = "" ;
      edtavVarhtml_Forecolor = (int)(0x000000) ;
      edtavVarhtml_Enabled = 0 ;
      subGridhdrs_Class = "FreeStyleGrid" ;
      tblTablehdrs_Backcolor = (int)(0x000000) ;
      subGridhdrs_Backcolorstyle = (byte)(0) ;
      subGridmaquinas_Backcolorstyle = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programacion Maquinas II", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDMAQUINAS_nEOF'},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'AV38MaqCodCollection',fld:'vMAQCODCOLLECTION',pic:'',hsh:true},{av:'AV6SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV6SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]}");
      setEventMetadata("GRIDMAQUINAS.LOAD","{handler:'e12BS2',iparms:[{av:'AV6SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("GRIDMAQUINAS.LOAD",",oparms:[{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true},{av:'AV7Maqcod',fld:'vMAQCOD',pic:''}]}");
      setEventMetadata("GRIDHDRS.LOAD","{handler:'e13BS3',iparms:[{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true}]");
      setEventMetadata("GRIDHDRS.LOAD",",oparms:[{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'edtavBarcod_Visible',ctrl:'vBARCOD',prop:'Visible'},{av:'edtavBarcodreo_Visible',ctrl:'vBARCODREO',prop:'Visible'},{av:'edtavBarcodpar_Visible',ctrl:'vBARCODPAR',prop:'Visible'},{av:'AV33Varhtml',fld:'vVARHTML',pic:''},{av:'edtavVarhtml_Forecolor',ctrl:'vVARHTML',prop:'Forecolor'},{av:'tblTablehdrs_Backcolor',ctrl:'TABLEHDRS',prop:'Backcolor'}]}");
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
      AV38MaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV5SDTMaquina = new app.SdtSDTMaquina(remoteHandle, context);
      AV6SDTMaquinaCollection = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridmaquinasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7Maqcod = "" ;
      AV33Varhtml = "" ;
      AV11BarCodPar = "" ;
      GXCCtl = "" ;
      GXt_objcol_SdtSDTMaquina1 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquina2 = new GXBaseCollection[1] ;
      GridmaquinasRow = new com.genexus.webpanels.GXWebRow();
      AV8SDTHdrsporMaquina = new app.SdtSDTHdrsporMaquina(remoteHandle, context);
      AV12Hdr = "" ;
      AV13Clinom = "" ;
      AV35Barser = "" ;
      AV34Barserdsc = "" ;
      AV37BarKgm = DecimalUtil.ZERO ;
      AV26BarcolNom = "" ;
      AV32BarfasEstTxt = "" ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new short[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new short[1] ;
      GridhdrsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridhdrs_Linesclass = "" ;
      ROClassString = "" ;
      subGridmaquinas_Linesclass = "" ;
      subGridmaquinas_Header = "" ;
      GridmaquinasColumn = new com.genexus.webpanels.GXWebColumn();
      subGridhdrs_Header = "" ;
      GridhdrsColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      edtavVarhtml_Enabled = 0 ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
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
   private byte AV30BarfasEst ;
   private byte subGridhdrs_Backstyle ;
   private byte subGridmaquinas_Backstyle ;
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
   private short AV18R ;
   private short GXv_int3[] ;
   private short AV16G ;
   private short GXv_int4[] ;
   private short AV14B ;
   private short GXv_int5[] ;
   private short AV19R2 ;
   private short GXv_int6[] ;
   private short AV17G2 ;
   private short GXv_int7[] ;
   private short AV15B2 ;
   private short GXv_int8[] ;
   private int nRC_GXsfl_29 ;
   private int nGXsfl_29_idx=1 ;
   private int nRC_GXsfl_16 ;
   private int nGXsfl_16_idx=1 ;
   private int AV9BarCod ;
   private int subGridmaquinas_Islastpage ;
   private int subGridhdrs_Islastpage ;
   private int edtavMaqcod_Enabled ;
   private int edtavVarhtml_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int AV41GXV1 ;
   private int AV42GXV2 ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int edtavVarhtml_Forecolor ;
   private int tblTablehdrs_Backcolor ;
   private int idxLst ;
   private int subGridhdrs_Backcolor ;
   private int subGridhdrs_Allbackcolor ;
   private int subGridmaquinas_Backcolor ;
   private int subGridmaquinas_Allbackcolor ;
   private int subGridmaquinas_Selectedindex ;
   private int subGridmaquinas_Selectioncolor ;
   private int subGridmaquinas_Hoveringcolor ;
   private int subGridhdrs_Selectedindex ;
   private int subGridhdrs_Selectioncolor ;
   private int subGridhdrs_Hoveringcolor ;
   private long GRIDHDRS_nCurrentRecord ;
   private long GRIDMAQUINAS_nCurrentRecord ;
   private long GRIDHDRS_nFirstRecordOnPage ;
   private long GRIDMAQUINAS_nFirstRecordOnPage ;
   private long AV25Rgb ;
   private java.math.BigDecimal AV37BarKgm ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_29_idx="0001" ;
   private String sGXsfl_16_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String divTable4_Internalname ;
   private String sStyleString ;
   private String subGridmaquinas_Internalname ;
   private String subGridhdrs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV7Maqcod ;
   private String edtavMaqcod_Internalname ;
   private String AV33Varhtml ;
   private String edtavVarhtml_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String AV11BarCodPar ;
   private String edtavBarcodpar_Internalname ;
   private String GXCCtl ;
   private String AV12Hdr ;
   private String AV13Clinom ;
   private String AV35Barser ;
   private String AV34Barserdsc ;
   private String AV26BarcolNom ;
   private String AV32BarfasEstTxt ;
   private String tblTablehdrs_Internalname ;
   private String tblTable2_Internalname ;
   private String sGXsfl_29_fel_idx="0001" ;
   private String subGridhdrs_Class ;
   private String subGridhdrs_Linesclass ;
   private String divGrid2table_Internalname ;
   private String ROClassString ;
   private String edtavVarhtml_Jsonclick ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String sGXsfl_16_fel_idx="0001" ;
   private String subGridmaquinas_Class ;
   private String subGridmaquinas_Linesclass ;
   private String divGrid1table_Internalname ;
   private String tblTablemaquinas_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String subGridmaquinas_Header ;
   private String subGridhdrs_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_16_Refreshing=false ;
   private boolean bGXsfl_29_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean gx_refresh_fired ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid GridmaquinasContainer ;
   private com.genexus.webpanels.GXWebGrid GridhdrsContainer ;
   private com.genexus.webpanels.GXWebRow GridmaquinasRow ;
   private com.genexus.webpanels.GXWebRow GridhdrsRow ;
   private com.genexus.webpanels.GXWebColumn GridmaquinasColumn ;
   private com.genexus.webpanels.GXWebColumn GridhdrsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV38MaqCodCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> AV6SDTMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> GXt_objcol_SdtSDTMaquina1 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXv_objcol_SdtSDTMaquina2[] ;
   private app.SdtSDTHdrsporMaquina AV8SDTHdrsporMaquina ;
   private app.SdtSDTMaquina AV5SDTMaquina ;
}

