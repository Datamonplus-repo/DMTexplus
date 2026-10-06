package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumen_impl extends GXDataArea
{
   public informeproduccionresumen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumen_impl.class ));
   }

   public informeproduccionresumen_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      dynavMaquinainicial = new HTMLChoice();
      dynavMaquinafinal = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vMAQUINAINICIAL") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvmaquinainicial162( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vMAQUINAFINAL") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvmaquinafinal162( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            gxnrgrid2_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid2") == 0 )
         {
            gxgrgrid2_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
         {
            gxnrgrid3_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid3") == 0 )
         {
            gxgrgrid3_refresh_invoke( ) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      AV13Emprcod = httpContext.GetPar( "Emprcod") ;
      dynavMaquinainicial.fromJSonString( httpContext.GetNextPar( ));
      AV5MaquinaInicial = httpContext.GetPar( "MaquinaInicial") ;
      dynavMaquinafinal.fromJSonString( httpContext.GetNextPar( ));
      AV6MaquinaFinal = httpContext.GetPar( "MaquinaFinal") ;
      A4441HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      n4441HisProDTF = false ;
      AV8FechaInicial = localUtil.parseDTimeParm( httpContext.GetPar( "FechaInicial")) ;
      AV9FechaFinal = localUtil.parseDTimeParm( httpContext.GetPar( "FechaFinal")) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      A606MaqDsc = httpContext.GetPar( "MaqDsc") ;
      n606MaqDsc = false ;
      AV18TTotk = CommonUtil.decimalVal( httpContext.GetPar( "TTotk"), ".") ;
      AV19TTotMt = CommonUtil.decimalVal( httpContext.GetPar( "TTotMt"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A602MaqCod, AV13Emprcod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, A606MaqDsc, AV18TTotk, AV19TTotMt) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public void gxgrgrid2_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A2247HisProTip = (short)(GXutil.lval( httpContext.GetPar( "HisProTip"))) ;
      AV13Emprcod = httpContext.GetPar( "Emprcod") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      dynavMaquinainicial.fromJSonString( httpContext.GetNextPar( ));
      AV5MaquinaInicial = httpContext.GetPar( "MaquinaInicial") ;
      dynavMaquinafinal.fromJSonString( httpContext.GetNextPar( ));
      AV6MaquinaFinal = httpContext.GetPar( "MaquinaFinal") ;
      A4441HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      n4441HisProDTF = false ;
      AV8FechaInicial = localUtil.parseDTimeParm( httpContext.GetPar( "FechaInicial")) ;
      AV9FechaFinal = localUtil.parseDTimeParm( httpContext.GetPar( "FechaFinal")) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      AV18TTotk = CommonUtil.decimalVal( httpContext.GetPar( "TTotk"), ".") ;
      AV19TTotMt = CommonUtil.decimalVal( httpContext.GetPar( "TTotMt"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A2247HisProTip, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid2_refresh_invoke */
   }

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid3_newrow( ) ;
      /* End function gxnrGrid3_newrow_invoke */
   }

   public void gxgrgrid3_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
      AV13Emprcod = httpContext.GetPar( "Emprcod") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      dynavMaquinainicial.fromJSonString( httpContext.GetNextPar( ));
      AV5MaquinaInicial = httpContext.GetPar( "MaquinaInicial") ;
      dynavMaquinafinal.fromJSonString( httpContext.GetNextPar( ));
      AV6MaquinaFinal = httpContext.GetPar( "MaquinaFinal") ;
      A4441HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      n4441HisProDTF = false ;
      AV8FechaInicial = localUtil.parseDTimeParm( httpContext.GetPar( "FechaInicial")) ;
      AV9FechaFinal = localUtil.parseDTimeParm( httpContext.GetPar( "FechaFinal")) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      AV18TTotk = CommonUtil.decimalVal( httpContext.GetPar( "TTotk"), ".") ;
      AV19TTotMt = CommonUtil.decimalVal( httpContext.GetPar( "TTotMt"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A503GruOpeCod, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid3_refresh_invoke */
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
      pa162( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start162( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informeproduccionresumen", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTK", getSecureSignedToken( "", localUtil.format( AV18TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTMT", getSecureSignedToken( "", localUtil.format( AV19TTotMt, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_95, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID2PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49Grid2PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID3PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51Grid3PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRUOPECOD", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRODTF", localUtil.ttoc( A4441HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTTOTK", GXutil.ltrim( localUtil.ntoc( AV18TTotk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTK", getSecureSignedToken( "", localUtil.format( AV18TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV19TTotMt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTMT", getSecureSignedToken( "", localUtil.format( AV19TTotMt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTIP", GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Class", GXutil.rtrim( Grid1paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showfirst", GXutil.booltostr( Grid1paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showprevious", GXutil.booltostr( Grid1paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Shownext", GXutil.booltostr( Grid1paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showlast", GXutil.booltostr( Grid1paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Grid1paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Grid1paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Grid1paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Grid1paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Grid1paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Previous", GXutil.rtrim( Grid1paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Next", GXutil.rtrim( Grid1paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Caption", GXutil.rtrim( Grid1paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Grid1paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Grid1paginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Class", GXutil.rtrim( Grid2paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Showfirst", GXutil.booltostr( Grid2paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Showprevious", GXutil.booltostr( Grid2paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Shownext", GXutil.booltostr( Grid2paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Showlast", GXutil.booltostr( Grid2paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Grid2paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Grid2paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Grid2paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Grid2paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Grid2paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid2paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Grid2paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Previous", GXutil.rtrim( Grid2paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Next", GXutil.rtrim( Grid2paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Caption", GXutil.rtrim( Grid2paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Grid2paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Grid2paginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Class", GXutil.rtrim( Grid3paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Showfirst", GXutil.booltostr( Grid3paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Showprevious", GXutil.booltostr( Grid3paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Shownext", GXutil.booltostr( Grid3paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Showlast", GXutil.booltostr( Grid3paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Grid3paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Grid3paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Grid3paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Grid3paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Grid3paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid3paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Grid3paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Previous", GXutil.rtrim( Grid3paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Next", GXutil.rtrim( Grid3paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Caption", GXutil.rtrim( Grid3paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Grid3paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Grid3paginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid3_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid2_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid3paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid3paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid2paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid2paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid3paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid3paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid2paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid2paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we162( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt162( ) ;
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
      return formatLink("app.informeproduccionresumen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "InformeProduccionResumen" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen", "") ;
   }

   public void wb160( )
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
         wb_table1_12_162( true) ;
      }
      else
      {
         wb_table1_12_162( false) ;
      }
      return  ;
   }

   public void wb_table1_12_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_34_162( true) ;
      }
      else
      {
         wb_table2_34_162( false) ;
      }
      return  ;
   }

   public void wb_table2_34_162e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV46Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid2currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV48Grid2CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid2currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid2currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid3currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV50Grid3CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid3currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid3currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         /* User Defined Control */
         ucGrid3_empowerer.render(context, "wwp.gridempowerer", Grid3_empowerer_Internalname, "GRID3_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid2_empowerer.render(context, "wwp.gridempowerer", Grid2_empowerer_Internalname, "GRID2_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid2Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 95 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid3Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container, subGrid3_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start162( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup160( ) ;
   }

   public void ws162( )
   {
      start162( ) ;
      evt162( ) ;
   }

   public void evt162( )
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
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11162 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12162 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID2PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13162 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID2PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14162 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID3PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15162 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID3PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16162 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV25MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV25MaqDsc);
                           AV16HisProKgr = localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV16HisProKgr, 9, 2));
                           AV23Por1k = localUtil.ctond( httpContext.cgiGet( edtavPor1k_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPor1k_Internalname, GXutil.ltrimstr( AV23Por1k, 6, 2));
                           AV15HisProMtr = localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV15HisProMtr, 9, 2));
                           AV24Por1m = localUtil.ctond( httpContext.cgiGet( edtavPor1m_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPor1m_Internalname, GXutil.ltrimstr( AV24Por1m, 6, 2));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e17162 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e18162 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e19162 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                        {
                           nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_696( ) ;
                           AV27TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTipartdsc_Internalname, AV27TipArtDsc);
                           AV31KgsTart = localUtil.ctond( httpContext.cgiGet( edtavKgstart_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavKgstart_Internalname, GXutil.ltrimstr( AV31KgsTart, 10, 2));
                           AV33Por2k = localUtil.ctond( httpContext.cgiGet( edtavPor2k_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPor2k_Internalname, GXutil.ltrimstr( AV33Por2k, 6, 2));
                           AV32MtsTart = localUtil.ctond( httpContext.cgiGet( edtavMtstart_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMtstart_Internalname, GXutil.ltrimstr( AV32MtsTart, 9, 2));
                           AV34Por2m = localUtil.ctond( httpContext.cgiGet( edtavPor2m_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPor2m_Internalname, GXutil.ltrimstr( AV34Por2m, 6, 2));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e20166 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID3.LOAD") == 0 )
                        {
                           nGXsfl_95_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_953( ) ;
                           AV36Openom = httpContext.cgiGet( edtavOpenom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavOpenom_Internalname, AV36Openom);
                           AV40Kgsope = localUtil.ctond( httpContext.cgiGet( edtavKgsope_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavKgsope_Internalname, GXutil.ltrimstr( AV40Kgsope, 9, 2));
                           AV42Por3k = localUtil.ctond( httpContext.cgiGet( edtavPor3k_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPor3k_Internalname, GXutil.ltrimstr( AV42Por3k, 6, 2));
                           AV41Mtsope = localUtil.ctond( httpContext.cgiGet( edtavMtsope_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMtsope_Internalname, GXutil.ltrimstr( AV41Mtsope, 9, 2));
                           AV43Por3m = localUtil.ctond( httpContext.cgiGet( edtavPor3m_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPor3m_Internalname, GXutil.ltrimstr( AV43Por3m, 6, 2));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21163 ();
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

   public void we162( )
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

   public void pa162( )
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
            GX_FocusControl = dynavMaquinainicial.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvmaquinainicial162( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvmaquinainicial_data162( ) ;
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

   public void gxvvmaquinainicial_html162( )
   {
      String gxdynajaxvalue;
      gxdlvvmaquinainicial_data162( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavMaquinainicial.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavMaquinainicial.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvmaquinainicial_data162( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add(httpContext.getMessage( "{{todas}}", ""));
      /* Using cursor H00162 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00162_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00162_A606MaqDsc[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlvvmaquinafinal162( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvmaquinafinal_data162( ) ;
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

   public void gxvvmaquinafinal_html162( )
   {
      String gxdynajaxvalue;
      gxdlvvmaquinafinal_data162( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavMaquinafinal.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavMaquinafinal.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvmaquinafinal_data162( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add(httpContext.getMessage( "{{todas}", ""));
      /* Using cursor H00163 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00163_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00163_A606MaqDsc[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_953( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         sendrow_953( ) ;
         nGXsfl_95_idx = ((subGrid3_Islastpage==1)&&(nGXsfl_95_idx+1>subgrid3_fnc_recordsperpage( )) ? 1 : nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_953( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_696( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_696( ) ;
         nGXsfl_69_idx = ((subGrid2_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid2_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_696( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  String A396EmprCod ,
                                  String A602MaqCod ,
                                  String AV13Emprcod ,
                                  String AV5MaquinaInicial ,
                                  String AV6MaquinaFinal ,
                                  java.util.Date A4441HisProDTF ,
                                  java.util.Date AV8FechaInicial ,
                                  java.util.Date AV9FechaFinal ,
                                  short A656ParCod ,
                                  java.math.BigDecimal A1525HisProKgr ,
                                  java.math.BigDecimal A1526HisProMtr ,
                                  String A606MaqDsc ,
                                  java.math.BigDecimal AV18TTotk ,
                                  java.math.BigDecimal AV19TTotMt )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18162 ();
      GRID1_nCurrentRecord = 0 ;
      rf162( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void gxgrgrid2_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  String A396EmprCod ,
                                  short A2247HisProTip ,
                                  String AV13Emprcod ,
                                  String A602MaqCod ,
                                  String AV5MaquinaInicial ,
                                  String AV6MaquinaFinal ,
                                  java.util.Date A4441HisProDTF ,
                                  java.util.Date AV8FechaInicial ,
                                  java.util.Date AV9FechaFinal ,
                                  short A656ParCod ,
                                  java.math.BigDecimal A1525HisProKgr ,
                                  java.math.BigDecimal A1526HisProMtr ,
                                  java.math.BigDecimal AV18TTotk ,
                                  java.math.BigDecimal AV19TTotMt )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18162 ();
      GRID2_nCurrentRecord = 0 ;
      rf166( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid2_refresh */
   }

   public void gxgrgrid3_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  String A396EmprCod ,
                                  int A503GruOpeCod ,
                                  String AV13Emprcod ,
                                  String A602MaqCod ,
                                  String AV5MaquinaInicial ,
                                  String AV6MaquinaFinal ,
                                  java.util.Date A4441HisProDTF ,
                                  java.util.Date AV8FechaInicial ,
                                  java.util.Date AV9FechaFinal ,
                                  short A656ParCod ,
                                  java.math.BigDecimal A1525HisProKgr ,
                                  java.math.BigDecimal A1526HisProMtr ,
                                  java.math.BigDecimal AV18TTotk ,
                                  java.math.BigDecimal AV19TTotMt )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18162 ();
      GRID3_nCurrentRecord = 0 ;
      rf163( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid3_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxvvmaquinainicial_html162( ) ;
         gxvvmaquinafinal_html162( ) ;
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( dynavMaquinainicial.getItemCount() > 0 )
      {
         AV5MaquinaInicial = dynavMaquinainicial.getValidValue(AV5MaquinaInicial) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5MaquinaInicial", AV5MaquinaInicial);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavMaquinainicial.setValue( GXutil.rtrim( AV5MaquinaInicial) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMaquinainicial.getInternalname(), "Values", dynavMaquinainicial.ToJavascriptSource(), true);
      }
      if ( dynavMaquinafinal.getItemCount() > 0 )
      {
         AV6MaquinaFinal = dynavMaquinafinal.getValidValue(AV6MaquinaFinal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MaquinaFinal", AV6MaquinaFinal);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavMaquinafinal.setValue( GXutil.rtrim( AV6MaquinaFinal) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMaquinafinal.getInternalname(), "Values", dynavMaquinafinal.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf162( ) ;
      rf166( ) ;
      rf163( ) ;
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
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavHisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprokgr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPor1k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor1k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1k_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavHispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispromtr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPor1m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor1m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1m_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavKgstart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgstart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgstart_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPor2k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor2k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor2k_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavMtstart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtstart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtstart_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPor2m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor2m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor2m_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavKgsope_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgsope_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsope_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavPor3k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor3k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor3k_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavMtsope_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtsope_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsope_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavPor3m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor3m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor3m_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void rf162( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e18162 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_432( ) ;
         e19162 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e19162 ();
         }
         wbEnd = (short)(43) ;
         wb160( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes162( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTTOTK", GXutil.ltrim( localUtil.ntoc( AV18TTotk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTK", getSecureSignedToken( "", localUtil.format( AV18TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV19TTotMt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTMT", getSecureSignedToken( "", localUtil.format( AV19TTotMt, "ZZZZZZ9.99")));
   }

   public void rf163( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid3Container.ClearRows();
      }
      wbStart = (short)(95) ;
      nGXsfl_95_idx = 1 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_953( ) ;
      bGXsfl_95_Refreshing = true ;
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.setPageSize( subgrid3_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_953( ) ;
         e21163 ();
         if ( ( GRID3_nCurrentRecord > 0 ) && ( GRID3_nGridOutOfScope == 0 ) && ( nGXsfl_95_idx == 1 ) )
         {
            GRID3_nCurrentRecord = 0 ;
            GRID3_nGridOutOfScope = 1 ;
            subgrid3_firstpage( ) ;
            e21163 ();
         }
         wbEnd = (short)(95) ;
         wb160( ) ;
      }
      bGXsfl_95_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes163( )
   {
   }

   public void rf166( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(69) ;
      nGXsfl_69_idx = 1 ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_696( ) ;
      bGXsfl_69_Refreshing = true ;
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.setPageSize( subgrid2_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_696( ) ;
         e20166 ();
         if ( ( GRID2_nCurrentRecord > 0 ) && ( GRID2_nGridOutOfScope == 0 ) && ( nGXsfl_69_idx == 1 ) )
         {
            GRID2_nCurrentRecord = 0 ;
            GRID2_nGridOutOfScope = 1 ;
            subgrid2_firstpage( ) ;
            e20166 ();
         }
         wbEnd = (short)(69) ;
         wb160( ) ;
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes166( )
   {
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return (int)(((subGrid1_Recordcount==0) ? GRID1_nFirstRecordOnPage+1 : subGrid1_Recordcount)) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(((subGrid1_Islastpage==1) ? subgrid1_fnc_recordcount( )/ (double) (subgrid1_fnc_recordsperpage( ))+((((int)((subgrid1_fnc_recordcount( )) % (subgrid1_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A602MaqCod, AV13Emprcod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, A606MaqDsc, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A602MaqCod, AV13Emprcod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, A606MaqDsc, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A602MaqCod, AV13Emprcod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, A606MaqDsc, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A602MaqCod, AV13Emprcod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, A606MaqDsc, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A602MaqCod, AV13Emprcod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, A606MaqDsc, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgrid3_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid3_fnc_recordcount( )
   {
      return (int)(((subGrid3_Recordcount==0) ? GRID3_nFirstRecordOnPage+1 : subGrid3_Recordcount)) ;
   }

   public int subgrid3_fnc_recordsperpage( )
   {
      if ( subGrid3_Rows > 0 )
      {
         return subGrid3_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid3_fnc_currentpage( )
   {
      return (int)(((subGrid3_Islastpage==1) ? subgrid3_fnc_recordcount( )/ (double) (subgrid3_fnc_recordsperpage( ))+((((int)((subgrid3_fnc_recordcount( )) % (subgrid3_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID3_nFirstRecordOnPage/ (double) (subgrid3_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid3_firstpage( )
   {
      GRID3_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A503GruOpeCod, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid3_nextpage( )
   {
      if ( GRID3_nEOF == 0 )
      {
         GRID3_nFirstRecordOnPage = (long)(GRID3_nFirstRecordOnPage+subgrid3_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("GRID3_nFirstRecordOnPage", GRID3_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A503GruOpeCod, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID3_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid3_previouspage( )
   {
      if ( GRID3_nFirstRecordOnPage >= subgrid3_fnc_recordsperpage( ) )
      {
         GRID3_nFirstRecordOnPage = (long)(GRID3_nFirstRecordOnPage-subgrid3_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A503GruOpeCod, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid3_lastpage( )
   {
      subGrid3_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A503GruOpeCod, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid3_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID3_nFirstRecordOnPage = (long)(subgrid3_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID3_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A503GruOpeCod, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgrid2_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_fnc_recordcount( )
   {
      return (int)(((subGrid2_Recordcount==0) ? GRID2_nFirstRecordOnPage+1 : subGrid2_Recordcount)) ;
   }

   public int subgrid2_fnc_recordsperpage( )
   {
      if ( subGrid2_Rows > 0 )
      {
         return subGrid2_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid2_fnc_currentpage( )
   {
      return (int)(((subGrid2_Islastpage==1) ? subgrid2_fnc_recordcount( )/ (double) (subgrid2_fnc_recordsperpage( ))+((((int)((subgrid2_fnc_recordcount( )) % (subgrid2_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID2_nFirstRecordOnPage/ (double) (subgrid2_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid2_firstpage( )
   {
      GRID2_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A2247HisProTip, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid2_nextpage( )
   {
      if ( GRID2_nEOF == 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage+subgrid2_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A2247HisProTip, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID2_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid2_previouspage( )
   {
      if ( GRID2_nFirstRecordOnPage >= subgrid2_fnc_recordsperpage( ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage-subgrid2_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A2247HisProTip, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid2_lastpage( )
   {
      subGrid2_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A2247HisProTip, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid2_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(subgrid2_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, A396EmprCod, A2247HisProTip, AV13Emprcod, A602MaqCod, AV5MaquinaInicial, AV6MaquinaFinal, A4441HisProDTF, AV8FechaInicial, AV9FechaFinal, A656ParCod, A1525HisProKgr, A1526HisProMtr, AV18TTotk, AV19TTotMt) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavHisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprokgr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPor1k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor1k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1k_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavHispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispromtr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPor1m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor1m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1m_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavKgstart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgstart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgstart_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPor2k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor2k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor2k_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavMtstart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtstart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtstart_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPor2m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor2m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor2m_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavKgsope_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgsope_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsope_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavPor3k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor3k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor3k_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavMtsope_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtsope_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsope_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtavPor3m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPor3m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor3m_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      gxvvmaquinainicial_html162( ) ;
      gxvvmaquinafinal_html162( ) ;
      fix_multi_value_controls( ) ;
   }

   public void strup160( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17162 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV47Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49Grid2PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID2PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51Grid3PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID3PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID2_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID3_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID3_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID2_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID3_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID3_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid2_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID2_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid3_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID3_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
         Grid1paginationbar_Class = httpContext.cgiGet( "GRID1PAGINATIONBAR_Class") ;
         Grid1paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showfirst")) ;
         Grid1paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showprevious")) ;
         Grid1paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Shownext")) ;
         Grid1paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showlast")) ;
         Grid1paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingbuttonsposition") ;
         Grid1paginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingcaptionposition") ;
         Grid1paginationbar_Emptygridclass = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridclass") ;
         Grid1paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselector")) ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageoptions") ;
         Grid1paginationbar_Previous = httpContext.cgiGet( "GRID1PAGINATIONBAR_Previous") ;
         Grid1paginationbar_Next = httpContext.cgiGet( "GRID1PAGINATIONBAR_Next") ;
         Grid1paginationbar_Caption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Caption") ;
         Grid1paginationbar_Emptygridcaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridcaption") ;
         Grid1paginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpagecaption") ;
         Grid2paginationbar_Class = httpContext.cgiGet( "GRID2PAGINATIONBAR_Class") ;
         Grid2paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRID2PAGINATIONBAR_Showfirst")) ;
         Grid2paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRID2PAGINATIONBAR_Showprevious")) ;
         Grid2paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRID2PAGINATIONBAR_Shownext")) ;
         Grid2paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRID2PAGINATIONBAR_Showlast")) ;
         Grid2paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRID2PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid2paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRID2PAGINATIONBAR_Pagingbuttonsposition") ;
         Grid2paginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRID2PAGINATIONBAR_Pagingcaptionposition") ;
         Grid2paginationbar_Emptygridclass = httpContext.cgiGet( "GRID2PAGINATIONBAR_Emptygridclass") ;
         Grid2paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRID2PAGINATIONBAR_Rowsperpageselector")) ;
         Grid2paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID2PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid2paginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRID2PAGINATIONBAR_Rowsperpageoptions") ;
         Grid2paginationbar_Previous = httpContext.cgiGet( "GRID2PAGINATIONBAR_Previous") ;
         Grid2paginationbar_Next = httpContext.cgiGet( "GRID2PAGINATIONBAR_Next") ;
         Grid2paginationbar_Caption = httpContext.cgiGet( "GRID2PAGINATIONBAR_Caption") ;
         Grid2paginationbar_Emptygridcaption = httpContext.cgiGet( "GRID2PAGINATIONBAR_Emptygridcaption") ;
         Grid2paginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRID2PAGINATIONBAR_Rowsperpagecaption") ;
         Grid3paginationbar_Class = httpContext.cgiGet( "GRID3PAGINATIONBAR_Class") ;
         Grid3paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRID3PAGINATIONBAR_Showfirst")) ;
         Grid3paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRID3PAGINATIONBAR_Showprevious")) ;
         Grid3paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRID3PAGINATIONBAR_Shownext")) ;
         Grid3paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRID3PAGINATIONBAR_Showlast")) ;
         Grid3paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRID3PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid3paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRID3PAGINATIONBAR_Pagingbuttonsposition") ;
         Grid3paginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRID3PAGINATIONBAR_Pagingcaptionposition") ;
         Grid3paginationbar_Emptygridclass = httpContext.cgiGet( "GRID3PAGINATIONBAR_Emptygridclass") ;
         Grid3paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRID3PAGINATIONBAR_Rowsperpageselector")) ;
         Grid3paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID3PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid3paginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRID3PAGINATIONBAR_Rowsperpageoptions") ;
         Grid3paginationbar_Previous = httpContext.cgiGet( "GRID3PAGINATIONBAR_Previous") ;
         Grid3paginationbar_Next = httpContext.cgiGet( "GRID3PAGINATIONBAR_Next") ;
         Grid3paginationbar_Caption = httpContext.cgiGet( "GRID3PAGINATIONBAR_Caption") ;
         Grid3paginationbar_Emptygridcaption = httpContext.cgiGet( "GRID3PAGINATIONBAR_Emptygridcaption") ;
         Grid3paginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRID3PAGINATIONBAR_Rowsperpagecaption") ;
         Grid3_empowerer_Gridinternalname = httpContext.cgiGet( "GRID3_EMPOWERER_Gridinternalname") ;
         Grid2_empowerer_Gridinternalname = httpContext.cgiGet( "GRID2_EMPOWERER_Gridinternalname") ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         Grid3paginationbar_Selectedpage = httpContext.cgiGet( "GRID3PAGINATIONBAR_Selectedpage") ;
         Grid3paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID3PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid2paginationbar_Selectedpage = httpContext.cgiGet( "GRID2PAGINATIONBAR_Selectedpage") ;
         Grid2paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID2PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         dynavMaquinainicial.setName( dynavMaquinainicial.getInternalname() );
         dynavMaquinainicial.setValue( httpContext.cgiGet( dynavMaquinainicial.getInternalname()) );
         AV5MaquinaInicial = httpContext.cgiGet( dynavMaquinainicial.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5MaquinaInicial", AV5MaquinaInicial);
         dynavMaquinafinal.setName( dynavMaquinafinal.getInternalname() );
         dynavMaquinafinal.setValue( httpContext.cgiGet( dynavMaquinafinal.getInternalname()) );
         AV6MaquinaFinal = httpContext.cgiGet( dynavMaquinafinal.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MaquinaFinal", AV6MaquinaFinal);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechainicial_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHAINICIAL");
            GX_FocusControl = edtavFechainicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8FechaInicial = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV8FechaInicial", localUtil.ttoc( AV8FechaInicial, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV8FechaInicial = localUtil.ctot( httpContext.cgiGet( edtavFechainicial_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FechaInicial", localUtil.ttoc( AV8FechaInicial, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechafinal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHAFINAL");
            GX_FocusControl = edtavFechafinal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9FechaFinal = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9FechaFinal", localUtil.ttoc( AV9FechaFinal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV9FechaFinal = localUtil.ctot( httpContext.cgiGet( edtavFechafinal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9FechaFinal", localUtil.ttoc( AV9FechaFinal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTK");
            GX_FocusControl = edtavTotk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Totk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Totk", GXutil.ltrimstr( AV20Totk, 10, 2));
         }
         else
         {
            AV20Totk = localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Totk", GXutil.ltrimstr( AV20Totk, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotmt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotmt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTMT");
            GX_FocusControl = edtavTotmt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21TotMt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TotMt", GXutil.ltrimstr( AV21TotMt, 10, 2));
         }
         else
         {
            AV21TotMt = localUtil.ctond( httpContext.cgiGet( edtavTotmt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TotMt", GXutil.ltrimstr( AV21TotMt, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotktart_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotktart_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTKTART");
            GX_FocusControl = edtavTotktart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28Totktart = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Totktart", GXutil.ltrimstr( AV28Totktart, 10, 2));
         }
         else
         {
            AV28Totktart = localUtil.ctond( httpContext.cgiGet( edtavTotktart_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Totktart", GXutil.ltrimstr( AV28Totktart, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotmtart_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotmtart_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTMTART");
            GX_FocusControl = edtavTotmtart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29TotMtart = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TotMtart", GXutil.ltrimstr( AV29TotMtart, 10, 2));
         }
         else
         {
            AV29TotMtart = localUtil.ctond( httpContext.cgiGet( edtavTotmtart_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TotMtart", GXutil.ltrimstr( AV29TotMtart, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotkope_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotkope_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTKOPE");
            GX_FocusControl = edtavTotkope_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37Totkope = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Totkope", GXutil.ltrimstr( AV37Totkope, 10, 2));
         }
         else
         {
            AV37Totkope = localUtil.ctond( httpContext.cgiGet( edtavTotkope_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Totkope", GXutil.ltrimstr( AV37Totkope, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotmtope_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotmtope_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTMTOPE");
            GX_FocusControl = edtavTotmtope_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38TotMtope = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TotMtope", GXutil.ltrimstr( AV38TotMtope, 10, 2));
         }
         else
         {
            AV38TotMtope = localUtil.ctond( httpContext.cgiGet( edtavTotmtope_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TotMtope", GXutil.ltrimstr( AV38TotMtope, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV46Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid2currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid2currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID2CURRENTPAGE");
            GX_FocusControl = edtavGrid2currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48Grid2CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
         }
         else
         {
            AV48Grid2CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid2currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid3currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid3currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID3CURRENTPAGE");
            GX_FocusControl = edtavGrid3currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50Grid3CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
         }
         else
         {
            AV50Grid3CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid3currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
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
      e17162 ();
      if (returnInSub) return;
   }

   public void e17162( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV13Emprcod = "001" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Emprcod, "@!"))));
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumen_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = AV13Emprcod ;
      GXv_char3[0] = AV55Emprnom ;
      GXv_char4[0] = AV56Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumen_impl.this.AV13Emprcod = GXv_char2[0] ;
      informeproduccionresumen_impl.this.AV55Emprnom = GXv_char3[0] ;
      informeproduccionresumen_impl.this.AV56Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Emprcod, "@!"))));
      Grid3_empowerer_Gridinternalname = subGrid3_Internalname ;
      ucGrid3_empowerer.sendProperty(context, "", false, Grid3_empowerer_Internalname, "GridInternalName", Grid3_empowerer_Gridinternalname);
      subGrid3_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      AV50Grid3CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
      edtavGrid3currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid3currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid3currentpage_Visible), 5, 0), true);
      AV51Grid3PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Grid3PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Grid3PageCount), 10, 0));
      Grid2_empowerer_Gridinternalname = subGrid2_Internalname ;
      ucGrid2_empowerer.sendProperty(context, "", false, Grid2_empowerer_Internalname, "GridInternalName", Grid2_empowerer_Gridinternalname);
      subGrid2_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      AV48Grid2CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
      edtavGrid2currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid2currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid2currentpage_Visible), 5, 0), true);
      AV49Grid2PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Grid2PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Grid2PageCount), 10, 0));
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV46Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV47Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Grid1PageCount), 10, 0));
      Grid3paginationbar_Rowsperpageselectedvalue = subGrid3_Rows ;
      ucGrid3paginationbar.sendProperty(context, "", false, Grid3paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid3paginationbar_Rowsperpageselectedvalue), 9, 0));
      Grid2paginationbar_Rowsperpageselectedvalue = subGrid2_Rows ;
      ucGrid2paginationbar.sendProperty(context, "", false, Grid2paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid2paginationbar_Rowsperpageselectedvalue), 9, 0));
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e18162( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e19162( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV20Totk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Totk", GXutil.ltrimstr( AV20Totk, 10, 2));
      AV21TotMt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21TotMt", GXutil.ltrimstr( AV21TotMt, 10, 2));
      /* Execute user subroutine: 'TOTALES' */
      S113 ();
      if (returnInSub) return;
      /* Using cursor H00164 */
      pr_default.execute(2, new Object[] {AV13Emprcod, AV5MaquinaInicial, AV5MaquinaInicial, AV6MaquinaFinal, AV6MaquinaFinal, AV8FechaInicial, AV9FechaFinal});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk169 = false ;
         A602MaqCod = H00164_A602MaqCod[0] ;
         A396EmprCod = H00164_A396EmprCod[0] ;
         A1525HisProKgr = H00164_A1525HisProKgr[0] ;
         A1526HisProMtr = H00164_A1526HisProMtr[0] ;
         A606MaqDsc = H00164_A606MaqDsc[0] ;
         n606MaqDsc = H00164_n606MaqDsc[0] ;
         A656ParCod = H00164_A656ParCod[0] ;
         n656ParCod = H00164_n656ParCod[0] ;
         A4441HisProDTF = H00164_A4441HisProDTF[0] ;
         n4441HisProDTF = H00164_n4441HisProDTF[0] ;
         A606MaqDsc = H00164_A606MaqDsc[0] ;
         n606MaqDsc = H00164_n606MaqDsc[0] ;
         AV15HisProMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV15HisProMtr, 9, 2));
         AV16HisProKgr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV16HisProKgr, 9, 2));
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(H00164_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(H00164_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk169 = false ;
            A1525HisProKgr = H00164_A1525HisProKgr[0] ;
            A1526HisProMtr = H00164_A1526HisProMtr[0] ;
            A656ParCod = H00164_A656ParCod[0] ;
            n656ParCod = H00164_n656ParCod[0] ;
            A4441HisProDTF = H00164_A4441HisProDTF[0] ;
            n4441HisProDTF = H00164_n4441HisProDTF[0] ;
            AV16HisProKgr = AV16HisProKgr.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV16HisProKgr, 9, 2));
            AV15HisProMtr = AV15HisProMtr.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV15HisProMtr, 9, 2));
            brk169 = true ;
            pr_default.readNext(2);
         }
         AV25MaqDsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV25MaqDsc);
         AV23Por1k = ((AV18TTotk.doubleValue()>0) ? (AV16HisProKgr.divide(AV18TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPor1k_Internalname, GXutil.ltrimstr( AV23Por1k, 6, 2));
         AV24Por1m = ((AV19TTotMt.doubleValue()>0) ? (AV15HisProMtr.divide(AV19TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPor1m_Internalname, GXutil.ltrimstr( AV24Por1m, 6, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
         {
            sendrow_432( ) ;
            GRID1_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
            }
         }
         if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) )
         {
            GRID1_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
         {
            httpContext.doAjaxLoad(43, Grid1Row);
         }
         AV20Totk = AV20Totk.add(AV16HisProKgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Totk", GXutil.ltrimstr( AV20Totk, 10, 2));
         AV21TotMt = AV21TotMt.add(AV15HisProMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21TotMt", GXutil.ltrimstr( AV21TotMt, 10, 2));
         if ( ! brk169 )
         {
            brk169 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
      /*  Sending Event outputs  */
   }

   public void e15162( )
   {
      /* Grid3paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid3paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV50Grid3CurrentPage = (long)(AV50Grid3CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
         subgrid3_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid3paginationbar_Selectedpage, "Next") == 0 )
      {
         AV50Grid3CurrentPage = (long)(AV50Grid3CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
         subgrid3_nextpage( ) ;
      }
      else
      {
         AV45PageToGo = (int)(GXutil.lval( Grid3paginationbar_Selectedpage)) ;
         AV50Grid3CurrentPage = AV45PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
         subgrid3_gotopage( AV45PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e16162( )
   {
      /* Grid3paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid3_Rows = Grid3paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      AV50Grid3CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Grid3CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Grid3CurrentPage), 10, 0));
      subgrid3_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13162( )
   {
      /* Grid2paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid2paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV48Grid2CurrentPage = (long)(AV48Grid2CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
         subgrid2_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid2paginationbar_Selectedpage, "Next") == 0 )
      {
         AV48Grid2CurrentPage = (long)(AV48Grid2CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
         subgrid2_nextpage( ) ;
      }
      else
      {
         AV45PageToGo = (int)(GXutil.lval( Grid2paginationbar_Selectedpage)) ;
         AV48Grid2CurrentPage = AV45PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
         subgrid2_gotopage( AV45PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e14162( )
   {
      /* Grid2paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid2_Rows = Grid2paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      AV48Grid2CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Grid2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Grid2CurrentPage), 10, 0));
      subgrid2_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e11162( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV46Grid1CurrentPage = (long)(AV46Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV46Grid1CurrentPage = (long)(AV46Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV45PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV46Grid1CurrentPage = AV45PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV45PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12162( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV46Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S113( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV18TTotk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18TTotk", GXutil.ltrimstr( AV18TTotk, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTK", getSecureSignedToken( "", localUtil.format( AV18TTotk, "ZZZZZZ9.99")));
      AV19TTotMt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19TTotMt", GXutil.ltrimstr( AV19TTotMt, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTMT", getSecureSignedToken( "", localUtil.format( AV19TTotMt, "ZZZZZZ9.99")));
      /* Optimized group. */
      /* Using cursor H00165 */
      pr_default.execute(3, new Object[] {AV13Emprcod, AV5MaquinaInicial, AV5MaquinaInicial, AV6MaquinaFinal, AV6MaquinaFinal, AV8FechaInicial, AV9FechaFinal});
      c1525HisProKgr = H00165_A1525HisProKgr[0] ;
      c1526HisProMtr = H00165_A1526HisProMtr[0] ;
      pr_default.close(3);
      AV18TTotk = AV18TTotk.add(c1525HisProKgr) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18TTotk", GXutil.ltrimstr( AV18TTotk, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTK", getSecureSignedToken( "", localUtil.format( AV18TTotk, "ZZZZZZ9.99")));
      AV19TTotMt = AV19TTotMt.add(c1526HisProMtr) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19TTotMt", GXutil.ltrimstr( AV19TTotMt, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTOTMT", getSecureSignedToken( "", localUtil.format( AV19TTotMt, "ZZZZZZ9.99")));
      /* End optimized group. */
   }

   private void e21163( )
   {
      /* Grid3_Load Routine */
      returnInSub = false ;
      AV37Totkope = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Totkope", GXutil.ltrimstr( AV37Totkope, 10, 2));
      AV38TotMtope = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TotMtope", GXutil.ltrimstr( AV38TotMtope, 10, 2));
      /* Execute user subroutine: 'TOTALES' */
      S113 ();
      if (returnInSub) return;
      /* Using cursor H00166 */
      pr_default.execute(4, new Object[] {AV13Emprcod, AV5MaquinaInicial, AV5MaquinaInicial, AV6MaquinaFinal, AV6MaquinaFinal, AV8FechaInicial, AV9FechaFinal});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk164 = false ;
         A503GruOpeCod = H00166_A503GruOpeCod[0] ;
         A396EmprCod = H00166_A396EmprCod[0] ;
         A1525HisProKgr = H00166_A1525HisProKgr[0] ;
         A1526HisProMtr = H00166_A1526HisProMtr[0] ;
         A606MaqDsc = H00166_A606MaqDsc[0] ;
         n606MaqDsc = H00166_n606MaqDsc[0] ;
         A656ParCod = H00166_A656ParCod[0] ;
         n656ParCod = H00166_n656ParCod[0] ;
         A4441HisProDTF = H00166_A4441HisProDTF[0] ;
         n4441HisProDTF = H00166_n4441HisProDTF[0] ;
         A602MaqCod = H00166_A602MaqCod[0] ;
         A606MaqDsc = H00166_A606MaqDsc[0] ;
         n606MaqDsc = H00166_n606MaqDsc[0] ;
         AV40Kgsope = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavKgsope_Internalname, GXutil.ltrimstr( AV40Kgsope, 9, 2));
         AV41Mtsope = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMtsope_Internalname, GXutil.ltrimstr( AV41Mtsope, 9, 2));
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(H00166_A396EmprCod[0], A396EmprCod) == 0 ) && ( H00166_A503GruOpeCod[0] == A503GruOpeCod ) )
         {
            brk164 = false ;
            A1525HisProKgr = H00166_A1525HisProKgr[0] ;
            A1526HisProMtr = H00166_A1526HisProMtr[0] ;
            A656ParCod = H00166_A656ParCod[0] ;
            n656ParCod = H00166_n656ParCod[0] ;
            A4441HisProDTF = H00166_A4441HisProDTF[0] ;
            n4441HisProDTF = H00166_n4441HisProDTF[0] ;
            A602MaqCod = H00166_A602MaqCod[0] ;
            AV40Kgsope = AV40Kgsope.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavKgsope_Internalname, GXutil.ltrimstr( AV40Kgsope, 9, 2));
            AV41Mtsope = AV41Mtsope.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMtsope_Internalname, GXutil.ltrimstr( AV41Mtsope, 9, 2));
            brk164 = true ;
            pr_default.readNext(4);
         }
         AV35Gruopecod = A503GruOpeCod ;
         GXt_char1 = AV36Openom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char4) ;
         informeproduccionresumen_impl.this.GXt_char1 = GXv_char4[0] ;
         AV36Openom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavOpenom_Internalname, AV36Openom);
         AV42Por3k = ((AV18TTotk.doubleValue()>0) ? (AV40Kgsope.divide(AV18TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPor3k_Internalname, GXutil.ltrimstr( AV42Por3k, 6, 2));
         AV43Por3m = ((AV19TTotMt.doubleValue()>0) ? (AV41Mtsope.divide(AV19TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPor3m_Internalname, GXutil.ltrimstr( AV43Por3m, 6, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(95) ;
         }
         if ( ( subGrid3_Islastpage == 1 ) || ( subGrid3_Rows == 0 ) || ( ( GRID3_nCurrentRecord >= GRID3_nFirstRecordOnPage ) && ( GRID3_nCurrentRecord < GRID3_nFirstRecordOnPage + subgrid3_fnc_recordsperpage( ) ) ) )
         {
            sendrow_953( ) ;
            GRID3_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid3_Islastpage == 1 ) && ( ((int)((GRID3_nCurrentRecord) % (subgrid3_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID3_nFirstRecordOnPage = GRID3_nCurrentRecord ;
            }
         }
         if ( GRID3_nCurrentRecord >= GRID3_nFirstRecordOnPage + subgrid3_fnc_recordsperpage( ) )
         {
            GRID3_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID3_nCurrentRecord = (long)(GRID3_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
         {
            httpContext.doAjaxLoad(95, Grid3Row);
         }
         AV37Totkope = AV37Totkope.add(AV40Kgsope) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Totkope", GXutil.ltrimstr( AV37Totkope, 10, 2));
         AV38TotMtope = AV38TotMtope.add(AV41Mtsope) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38TotMtope", GXutil.ltrimstr( AV38TotMtope, 10, 2));
         if ( ! brk164 )
         {
            brk164 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
      /*  Sending Event outputs  */
   }

   private void e20166( )
   {
      /* Grid2_Load Routine */
      returnInSub = false ;
      AV28Totktart = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Totktart", GXutil.ltrimstr( AV28Totktart, 10, 2));
      AV29TotMtart = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TotMtart", GXutil.ltrimstr( AV29TotMtart, 10, 2));
      /* Execute user subroutine: 'TOTALES' */
      S113 ();
      if (returnInSub) return;
      /* Using cursor H00167 */
      pr_default.execute(5, new Object[] {AV13Emprcod, AV5MaquinaInicial, AV5MaquinaInicial, AV6MaquinaFinal, AV6MaquinaFinal, AV8FechaInicial, AV9FechaFinal});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk167 = false ;
         A396EmprCod = H00167_A396EmprCod[0] ;
         A656ParCod = H00167_A656ParCod[0] ;
         n656ParCod = H00167_n656ParCod[0] ;
         A2247HisProTip = H00167_A2247HisProTip[0] ;
         A1525HisProKgr = H00167_A1525HisProKgr[0] ;
         A1526HisProMtr = H00167_A1526HisProMtr[0] ;
         A606MaqDsc = H00167_A606MaqDsc[0] ;
         n606MaqDsc = H00167_n606MaqDsc[0] ;
         A4441HisProDTF = H00167_A4441HisProDTF[0] ;
         n4441HisProDTF = H00167_n4441HisProDTF[0] ;
         A602MaqCod = H00167_A602MaqCod[0] ;
         A606MaqDsc = H00167_A606MaqDsc[0] ;
         n606MaqDsc = H00167_n606MaqDsc[0] ;
         AV31KgsTart = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavKgstart_Internalname, GXutil.ltrimstr( AV31KgsTart, 10, 2));
         AV32MtsTart = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMtstart_Internalname, GXutil.ltrimstr( AV32MtsTart, 9, 2));
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(H00167_A396EmprCod[0], A396EmprCod) == 0 ) && ( H00167_A2247HisProTip[0] == A2247HisProTip ) )
         {
            brk167 = false ;
            A656ParCod = H00167_A656ParCod[0] ;
            n656ParCod = H00167_n656ParCod[0] ;
            A1525HisProKgr = H00167_A1525HisProKgr[0] ;
            A1526HisProMtr = H00167_A1526HisProMtr[0] ;
            A4441HisProDTF = H00167_A4441HisProDTF[0] ;
            n4441HisProDTF = H00167_n4441HisProDTF[0] ;
            A602MaqCod = H00167_A602MaqCod[0] ;
            AV31KgsTart = AV31KgsTart.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavKgstart_Internalname, GXutil.ltrimstr( AV31KgsTart, 10, 2));
            AV32MtsTart = AV32MtsTart.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMtstart_Internalname, GXutil.ltrimstr( AV32MtsTart, 9, 2));
            brk167 = true ;
            pr_default.readNext(5);
         }
         AV26Hisprotip = A2247HisProTip ;
         GXt_char1 = AV27TipArtDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char4) ;
         informeproduccionresumen_impl.this.GXt_char1 = GXv_char4[0] ;
         AV27TipArtDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTipartdsc_Internalname, AV27TipArtDsc);
         AV33Por2k = ((AV18TTotk.doubleValue()>0) ? (AV31KgsTart.divide(AV18TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPor2k_Internalname, GXutil.ltrimstr( AV33Por2k, 6, 2));
         AV34Por2m = ((AV19TTotMt.doubleValue()>0) ? (AV32MtsTart.divide(AV19TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPor2m_Internalname, GXutil.ltrimstr( AV34Por2m, 6, 2));
         Gx_msg = httpContext.getMessage( "Procesando... ", "") + AV27TipArtDsc ;
         System.out.println( Gx_msg );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(69) ;
         }
         if ( ( subGrid2_Islastpage == 1 ) || ( subGrid2_Rows == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_fnc_recordsperpage( ) ) ) )
         {
            sendrow_696( ) ;
            GRID2_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
            }
         }
         if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_fnc_recordsperpage( ) )
         {
            GRID2_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
         {
            httpContext.doAjaxLoad(69, Grid2Row);
         }
         AV28Totktart = AV28Totktart.add(AV31KgsTart) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Totktart", GXutil.ltrimstr( AV28Totktart, 10, 2));
         AV29TotMtart = AV29TotMtart.add(AV32MtsTart) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29TotMtart", GXutil.ltrimstr( AV29TotMtart, 10, 2));
         if ( ! brk167 )
         {
            brk167 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
      /*  Sending Event outputs  */
   }

   public void wb_table2_34_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedmaquinas_Internalname, tblTablemergedmaquinas_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         wb_table3_37_162( true) ;
      }
      else
      {
         wb_table3_37_162( false) ;
      }
      return  ;
   }

   public void wb_table3_37_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_63_162( true) ;
      }
      else
      {
         wb_table4_63_162( false) ;
      }
      return  ;
   }

   public void wb_table4_63_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_89_162( true) ;
      }
      else
      {
         wb_table5_89_162( false) ;
      }
      return  ;
   }

   public void wb_table5_89_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_34_162e( true) ;
      }
      else
      {
         wb_table2_34_162e( false) ;
      }
   }

   public void wb_table5_89_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblOperarios_Internalname, tblOperarios_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='HasGridEmpowerer'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid3tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid3Container.SetWrapped(nGXWrapped);
         startgridcontrol95( ) ;
      }
      if ( wbEnd == 95 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_95 = (int)(nGXsfl_95_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container, subGrid3_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGrid3paginationbar.setProperty("Class", Grid3paginationbar_Class);
         ucGrid3paginationbar.setProperty("ShowFirst", Grid3paginationbar_Showfirst);
         ucGrid3paginationbar.setProperty("ShowPrevious", Grid3paginationbar_Showprevious);
         ucGrid3paginationbar.setProperty("ShowNext", Grid3paginationbar_Shownext);
         ucGrid3paginationbar.setProperty("ShowLast", Grid3paginationbar_Showlast);
         ucGrid3paginationbar.setProperty("PagesToShow", Grid3paginationbar_Pagestoshow);
         ucGrid3paginationbar.setProperty("PagingButtonsPosition", Grid3paginationbar_Pagingbuttonsposition);
         ucGrid3paginationbar.setProperty("PagingCaptionPosition", Grid3paginationbar_Pagingcaptionposition);
         ucGrid3paginationbar.setProperty("EmptyGridClass", Grid3paginationbar_Emptygridclass);
         ucGrid3paginationbar.setProperty("RowsPerPageSelector", Grid3paginationbar_Rowsperpageselector);
         ucGrid3paginationbar.setProperty("RowsPerPageOptions", Grid3paginationbar_Rowsperpageoptions);
         ucGrid3paginationbar.setProperty("Previous", Grid3paginationbar_Previous);
         ucGrid3paginationbar.setProperty("Next", Grid3paginationbar_Next);
         ucGrid3paginationbar.setProperty("Caption", Grid3paginationbar_Caption);
         ucGrid3paginationbar.setProperty("EmptyGridCaption", Grid3paginationbar_Emptygridcaption);
         ucGrid3paginationbar.setProperty("RowsPerPageCaption", Grid3paginationbar_Rowsperpagecaption);
         ucGrid3paginationbar.setProperty("CurrentPage", AV50Grid3CurrentPage);
         ucGrid3paginationbar.setProperty("PageCount", AV51Grid3PageCount);
         ucGrid3paginationbar.render(context, "dvelop.dvpaginationbar", Grid3paginationbar_Internalname, "GRID3PAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotkope_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotkope_Internalname, httpContext.getMessage( "Total Kgs", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotkope_Internalname, GXutil.ltrim( localUtil.ntoc( AV37Totkope, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotkope_Enabled!=0) ? localUtil.format( AV37Totkope, "ZZZZZZ9.99") : localUtil.format( AV37Totkope, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotkope_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotkope_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotmtope_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotmtope_Internalname, httpContext.getMessage( "Total Mts", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotmtope_Internalname, GXutil.ltrim( localUtil.ntoc( AV38TotMtope, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotmtope_Enabled!=0) ? localUtil.format( AV38TotMtope, "ZZZZZZ9.99") : localUtil.format( AV38TotMtope, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotmtope_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotmtope_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_89_162e( true) ;
      }
      else
      {
         wb_table5_89_162e( false) ;
      }
   }

   public void wb_table4_63_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTipodearticulo_Internalname, tblTipodearticulo_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='HasGridEmpowerer'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid2tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         startgridcontrol69( ) ;
      }
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (int)(nGXsfl_69_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGrid2paginationbar.setProperty("Class", Grid2paginationbar_Class);
         ucGrid2paginationbar.setProperty("ShowFirst", Grid2paginationbar_Showfirst);
         ucGrid2paginationbar.setProperty("ShowPrevious", Grid2paginationbar_Showprevious);
         ucGrid2paginationbar.setProperty("ShowNext", Grid2paginationbar_Shownext);
         ucGrid2paginationbar.setProperty("ShowLast", Grid2paginationbar_Showlast);
         ucGrid2paginationbar.setProperty("PagesToShow", Grid2paginationbar_Pagestoshow);
         ucGrid2paginationbar.setProperty("PagingButtonsPosition", Grid2paginationbar_Pagingbuttonsposition);
         ucGrid2paginationbar.setProperty("PagingCaptionPosition", Grid2paginationbar_Pagingcaptionposition);
         ucGrid2paginationbar.setProperty("EmptyGridClass", Grid2paginationbar_Emptygridclass);
         ucGrid2paginationbar.setProperty("RowsPerPageSelector", Grid2paginationbar_Rowsperpageselector);
         ucGrid2paginationbar.setProperty("RowsPerPageOptions", Grid2paginationbar_Rowsperpageoptions);
         ucGrid2paginationbar.setProperty("Previous", Grid2paginationbar_Previous);
         ucGrid2paginationbar.setProperty("Next", Grid2paginationbar_Next);
         ucGrid2paginationbar.setProperty("Caption", Grid2paginationbar_Caption);
         ucGrid2paginationbar.setProperty("EmptyGridCaption", Grid2paginationbar_Emptygridcaption);
         ucGrid2paginationbar.setProperty("RowsPerPageCaption", Grid2paginationbar_Rowsperpagecaption);
         ucGrid2paginationbar.setProperty("CurrentPage", AV48Grid2CurrentPage);
         ucGrid2paginationbar.setProperty("PageCount", AV49Grid2PageCount);
         ucGrid2paginationbar.render(context, "dvelop.dvpaginationbar", Grid2paginationbar_Internalname, "GRID2PAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotktart_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotktart_Internalname, httpContext.getMessage( "Total Kgs", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotktart_Internalname, GXutil.ltrim( localUtil.ntoc( AV28Totktart, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotktart_Enabled!=0) ? localUtil.format( AV28Totktart, "ZZZZZZ9.99") : localUtil.format( AV28Totktart, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotktart_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotktart_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotmtart_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotmtart_Internalname, httpContext.getMessage( "Total Mts", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotmtart_Internalname, GXutil.ltrim( localUtil.ntoc( AV29TotMtart, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotmtart_Enabled!=0) ? localUtil.format( AV29TotMtart, "ZZZZZZ9.99") : localUtil.format( AV29TotMtart, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotmtart_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotmtart_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_63_162e( true) ;
      }
      else
      {
         wb_table4_63_162e( false) ;
      }
   }

   public void wb_table3_37_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblMaquinas_Internalname, tblMaquinas_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='HasGridEmpowerer'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         /* User Defined Control */
         ucGrid1paginationbar.setProperty("Class", Grid1paginationbar_Class);
         ucGrid1paginationbar.setProperty("ShowFirst", Grid1paginationbar_Showfirst);
         ucGrid1paginationbar.setProperty("ShowPrevious", Grid1paginationbar_Showprevious);
         ucGrid1paginationbar.setProperty("ShowNext", Grid1paginationbar_Shownext);
         ucGrid1paginationbar.setProperty("ShowLast", Grid1paginationbar_Showlast);
         ucGrid1paginationbar.setProperty("PagesToShow", Grid1paginationbar_Pagestoshow);
         ucGrid1paginationbar.setProperty("PagingButtonsPosition", Grid1paginationbar_Pagingbuttonsposition);
         ucGrid1paginationbar.setProperty("PagingCaptionPosition", Grid1paginationbar_Pagingcaptionposition);
         ucGrid1paginationbar.setProperty("EmptyGridClass", Grid1paginationbar_Emptygridclass);
         ucGrid1paginationbar.setProperty("RowsPerPageSelector", Grid1paginationbar_Rowsperpageselector);
         ucGrid1paginationbar.setProperty("RowsPerPageOptions", Grid1paginationbar_Rowsperpageoptions);
         ucGrid1paginationbar.setProperty("Previous", Grid1paginationbar_Previous);
         ucGrid1paginationbar.setProperty("Next", Grid1paginationbar_Next);
         ucGrid1paginationbar.setProperty("Caption", Grid1paginationbar_Caption);
         ucGrid1paginationbar.setProperty("EmptyGridCaption", Grid1paginationbar_Emptygridcaption);
         ucGrid1paginationbar.setProperty("RowsPerPageCaption", Grid1paginationbar_Rowsperpagecaption);
         ucGrid1paginationbar.setProperty("CurrentPage", AV46Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV47Grid1PageCount);
         ucGrid1paginationbar.render(context, "dvelop.dvpaginationbar", Grid1paginationbar_Internalname, "GRID1PAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotk_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotk_Internalname, httpContext.getMessage( "Total Kgs", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotk_Internalname, GXutil.ltrim( localUtil.ntoc( AV20Totk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotk_Enabled!=0) ? localUtil.format( AV20Totk, "ZZZZZZ9.99") : localUtil.format( AV20Totk, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotk_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotk_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotmt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotmt_Internalname, httpContext.getMessage( "Total Mts", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotmt_Internalname, GXutil.ltrim( localUtil.ntoc( AV21TotMt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotmt_Enabled!=0) ? localUtil.format( AV21TotMt, "ZZZZZZ9.99") : localUtil.format( AV21TotMt, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotmt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotmt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_37_162e( true) ;
      }
      else
      {
         wb_table3_37_162e( false) ;
      }
   }

   public void wb_table1_12_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedtablecontent_Internalname, tblTablemergedtablecontent_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+dynavMaquinainicial.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavMaquinainicial.getInternalname(), httpContext.getMessage( "Maquina Inicial", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavMaquinainicial, dynavMaquinainicial.getInternalname(), GXutil.rtrim( AV5MaquinaInicial), 1, dynavMaquinainicial.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavMaquinainicial.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "", true, (byte)(0), "HLP_InformeProduccionResumen.htm");
         dynavMaquinainicial.setValue( GXutil.rtrim( AV5MaquinaInicial) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMaquinainicial.getInternalname(), "Values", dynavMaquinainicial.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+dynavMaquinafinal.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavMaquinafinal.getInternalname(), httpContext.getMessage( "Maquina Final", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavMaquinafinal, dynavMaquinafinal.getInternalname(), GXutil.rtrim( AV6MaquinaFinal), 1, dynavMaquinafinal.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavMaquinafinal.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "", true, (byte)(0), "HLP_InformeProduccionResumen.htm");
         dynavMaquinafinal.setValue( GXutil.rtrim( AV6MaquinaFinal) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMaquinafinal.getInternalname(), "Values", dynavMaquinafinal.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechainicial_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechainicial_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechainicial_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechainicial_Internalname, localUtil.ttoc( AV8FechaInicial, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV8FechaInicial, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechainicial_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechainicial_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechainicial_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechainicial_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformeProduccionResumen.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechafinal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechafinal_Internalname, httpContext.getMessage( "Fecha Final", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechafinal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechafinal_Internalname, localUtil.ttoc( AV9FechaFinal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV9FechaFinal, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechafinal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechafinal_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeProduccionResumen.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechafinal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechafinal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformeProduccionResumen.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_162e( true) ;
      }
      else
      {
         wb_table1_12_162e( false) ;
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
      pa162( ) ;
      ws162( ) ;
      we162( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016403016", true, true);
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
         httpContext.AddJavascriptSource("informeproduccionresumen.js", "?202661016403017", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavMaqdsc_Internalname = "vMAQDSC_"+sGXsfl_43_idx ;
      edtavHisprokgr_Internalname = "vHISPROKGR_"+sGXsfl_43_idx ;
      edtavPor1k_Internalname = "vPOR1K_"+sGXsfl_43_idx ;
      edtavHispromtr_Internalname = "vHISPROMTR_"+sGXsfl_43_idx ;
      edtavPor1m_Internalname = "vPOR1M_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavMaqdsc_Internalname = "vMAQDSC_"+sGXsfl_43_fel_idx ;
      edtavHisprokgr_Internalname = "vHISPROKGR_"+sGXsfl_43_fel_idx ;
      edtavPor1k_Internalname = "vPOR1K_"+sGXsfl_43_fel_idx ;
      edtavHispromtr_Internalname = "vHISPROMTR_"+sGXsfl_43_fel_idx ;
      edtavPor1m_Internalname = "vPOR1M_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb160( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV25MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( AV16HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprokgr_Enabled!=0) ? localUtil.format( AV16HisProKgr, "ZZZZZ9.99") : localUtil.format( AV16HisProKgr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor1k_Internalname,GXutil.ltrim( localUtil.ntoc( AV23Por1k, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor1k_Enabled!=0) ? localUtil.format( AV23Por1k, "ZZ9.99") : localUtil.format( AV23Por1k, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPor1k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor1k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV15HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHispromtr_Enabled!=0) ? localUtil.format( AV15HisProMtr, "ZZZZZ9.99") : localUtil.format( AV15HisProMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor1m_Internalname,GXutil.ltrim( localUtil.ntoc( AV24Por1m, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor1m_Enabled!=0) ? localUtil.format( AV24Por1m, "ZZ9.99") : localUtil.format( AV24Por1m, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPor1m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor1m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes162( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_43_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void subsflControlProps_696( )
   {
      edtavTipartdsc_Internalname = "vTIPARTDSC_"+sGXsfl_69_idx ;
      edtavKgstart_Internalname = "vKGSTART_"+sGXsfl_69_idx ;
      edtavPor2k_Internalname = "vPOR2K_"+sGXsfl_69_idx ;
      edtavMtstart_Internalname = "vMTSTART_"+sGXsfl_69_idx ;
      edtavPor2m_Internalname = "vPOR2M_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_696( )
   {
      edtavTipartdsc_Internalname = "vTIPARTDSC_"+sGXsfl_69_fel_idx ;
      edtavKgstart_Internalname = "vKGSTART_"+sGXsfl_69_fel_idx ;
      edtavPor2k_Internalname = "vPOR2K_"+sGXsfl_69_fel_idx ;
      edtavMtstart_Internalname = "vMTSTART_"+sGXsfl_69_fel_idx ;
      edtavPor2m_Internalname = "vPOR2M_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_696( )
   {
      subsflControlProps_696( ) ;
      wb160( ) ;
      if ( ( subGrid2_Rows * 1 == 0 ) || ( nGXsfl_69_idx <= subgrid2_fnc_recordsperpage( ) * 1 ) )
      {
         Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
         if ( subGrid2_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid2_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
         else if ( subGrid2_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid2_Backstyle = (byte)(0) ;
            subGrid2_Backcolor = subGrid2_Allbackcolor ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
            }
         }
         else if ( subGrid2_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
            subGrid2_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid2_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
            {
               subGrid2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Even" ;
               }
            }
            else
            {
               subGrid2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Odd" ;
               }
            }
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdsc_Internalname,GXutil.rtrim( AV27TipArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgstart_Internalname,GXutil.ltrim( localUtil.ntoc( AV31KgsTart, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKgstart_Enabled!=0) ? localUtil.format( AV31KgsTart, "ZZZZZZ9.99") : localUtil.format( AV31KgsTart, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKgstart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavKgstart_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor2k_Internalname,GXutil.ltrim( localUtil.ntoc( AV33Por2k, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor2k_Enabled!=0) ? localUtil.format( AV33Por2k, "ZZ9.99") : localUtil.format( AV33Por2k, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPor2k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor2k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMtstart_Internalname,GXutil.ltrim( localUtil.ntoc( AV32MtsTart, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMtstart_Enabled!=0) ? localUtil.format( AV32MtsTart, "ZZZZZ9.99") : localUtil.format( AV32MtsTart, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMtstart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMtstart_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor2m_Internalname,GXutil.ltrim( localUtil.ntoc( AV34Por2m, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor2m_Enabled!=0) ? localUtil.format( AV34Por2m, "ZZ9.99") : localUtil.format( AV34Por2m, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPor2m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor2m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes166( ) ;
         Grid2Container.AddRow(Grid2Row);
         nGXsfl_69_idx = ((subGrid2_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid2_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_696( ) ;
      }
      /* End function sendrow_696 */
   }

   public void subsflControlProps_953( )
   {
      edtavOpenom_Internalname = "vOPENOM_"+sGXsfl_95_idx ;
      edtavKgsope_Internalname = "vKGSOPE_"+sGXsfl_95_idx ;
      edtavPor3k_Internalname = "vPOR3K_"+sGXsfl_95_idx ;
      edtavMtsope_Internalname = "vMTSOPE_"+sGXsfl_95_idx ;
      edtavPor3m_Internalname = "vPOR3M_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_953( )
   {
      edtavOpenom_Internalname = "vOPENOM_"+sGXsfl_95_fel_idx ;
      edtavKgsope_Internalname = "vKGSOPE_"+sGXsfl_95_fel_idx ;
      edtavPor3k_Internalname = "vPOR3K_"+sGXsfl_95_fel_idx ;
      edtavMtsope_Internalname = "vMTSOPE_"+sGXsfl_95_fel_idx ;
      edtavPor3m_Internalname = "vPOR3M_"+sGXsfl_95_fel_idx ;
   }

   public void sendrow_953( )
   {
      subsflControlProps_953( ) ;
      wb160( ) ;
      if ( ( subGrid3_Rows * 1 == 0 ) || ( nGXsfl_95_idx <= subgrid3_fnc_recordsperpage( ) * 1 ) )
      {
         Grid3Row = GXWebRow.GetNew(context,Grid3Container) ;
         if ( subGrid3_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid3_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
         else if ( subGrid3_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid3_Backstyle = (byte)(0) ;
            subGrid3_Backcolor = subGrid3_Allbackcolor ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
            }
         }
         else if ( subGrid3_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid3_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
            subGrid3_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid3_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid3_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
            {
               subGrid3_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"Even" ;
               }
            }
            else
            {
               subGrid3_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"Odd" ;
               }
            }
         }
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_95_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpenom_Internalname,GXutil.rtrim( AV36Openom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavOpenom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOpenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgsope_Internalname,GXutil.ltrim( localUtil.ntoc( AV40Kgsope, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKgsope_Enabled!=0) ? localUtil.format( AV40Kgsope, "ZZZZZ9.99") : localUtil.format( AV40Kgsope, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKgsope_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavKgsope_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor3k_Internalname,GXutil.ltrim( localUtil.ntoc( AV42Por3k, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor3k_Enabled!=0) ? localUtil.format( AV42Por3k, "ZZ9.99") : localUtil.format( AV42Por3k, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPor3k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor3k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMtsope_Internalname,GXutil.ltrim( localUtil.ntoc( AV41Mtsope, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMtsope_Enabled!=0) ? localUtil.format( AV41Mtsope, "ZZZZZ9.99") : localUtil.format( AV41Mtsope, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMtsope_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMtsope_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor3m_Internalname,GXutil.ltrim( localUtil.ntoc( AV43Por3m, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor3m_Enabled!=0) ? localUtil.format( AV43Por3m, "ZZ9.99") : localUtil.format( AV43Por3m, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPor3m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor3m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes163( ) ;
         Grid3Container.AddRow(Grid3Row);
         nGXsfl_95_idx = ((subGrid3_Islastpage==1)&&(nGXsfl_95_idx+1>subgrid3_fnc_recordsperpage( )) ? 1 : nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_953( ) ;
      }
      /* End function sendrow_953 */
   }

   public void startgridcontrol95( )
   {
      if ( Grid3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid3Container"+"DivS\" data-gxgridid=\"95\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid3_Backcolorstyle == 0 )
         {
            subGrid3_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid3_Class) > 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Title" ;
            }
         }
         else
         {
            subGrid3_Titlebackstyle = (byte)(1) ;
            if ( subGrid3_Backcolorstyle == 1 )
            {
               subGrid3_Titlebackcolor = subGrid3_Allbackcolor ;
               if ( GXutil.len( subGrid3_Class) > 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid3_Class) > 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Dispuestos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Dispuestos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid3Container.AddObjectProperty("GridName", "Grid3");
      }
      else
      {
         Grid3Container.AddObjectProperty("GridName", "Grid3");
         Grid3Container.AddObjectProperty("Header", subGrid3_Header);
         Grid3Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("CmpContext", "");
         Grid3Container.AddObjectProperty("InMasterPage", "false");
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV36Openom));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40Kgsope, (byte)(9), (byte)(2), ".", "")));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKgsope_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42Por3k, (byte)(6), (byte)(2), ".", "")));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor3k_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41Mtsope, (byte)(9), (byte)(2), ".", "")));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMtsope_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43Por3m, (byte)(6), (byte)(2), ".", "")));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor3m_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol69( )
   {
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" data-gxgridid=\"69\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid2_Backcolorstyle == 0 )
         {
            subGrid2_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid2_Class) > 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Title" ;
            }
         }
         else
         {
            subGrid2_Titlebackstyle = (byte)(1) ;
            if ( subGrid2_Backcolorstyle == 1 )
            {
               subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Dispuestos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid2Container.AddObjectProperty("GridName", "Grid2");
      }
      else
      {
         Grid2Container.AddObjectProperty("GridName", "Grid2");
         Grid2Container.AddObjectProperty("Header", subGrid2_Header);
         Grid2Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("CmpContext", "");
         Grid2Container.AddObjectProperty("InMasterPage", "false");
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV27TipArtDsc));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31KgsTart, (byte)(10), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKgstart_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV33Por2k, (byte)(6), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor2k_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV32MtsTart, (byte)(9), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMtstart_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34Por2m, (byte)(6), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor2m_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol43( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"43\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HisProKgr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HisProMtr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV25MaqDsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16HisProKgr, (byte)(9), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23Por1k, (byte)(6), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor1k_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15HisProMtr, (byte)(9), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24Por1m, (byte)(6), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor1m_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divTablecontent_Internalname = "TABLECONTENT" ;
      dynavMaquinainicial.setInternalname( "vMAQUINAINICIAL" );
      dynavMaquinafinal.setInternalname( "vMAQUINAFINAL" );
      edtavFechainicial_Internalname = "vFECHAINICIAL" ;
      edtavFechafinal_Internalname = "vFECHAFINAL" ;
      tblTablemergedtablecontent_Internalname = "TABLEMERGEDTABLECONTENT" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      edtavHisprokgr_Internalname = "vHISPROKGR" ;
      edtavPor1k_Internalname = "vPOR1K" ;
      edtavHispromtr_Internalname = "vHISPROMTR" ;
      edtavPor1m_Internalname = "vPOR1M" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      edtavTotk_Internalname = "vTOTK" ;
      edtavTotmt_Internalname = "vTOTMT" ;
      tblMaquinas_Internalname = "MAQUINAS" ;
      edtavTipartdsc_Internalname = "vTIPARTDSC" ;
      edtavKgstart_Internalname = "vKGSTART" ;
      edtavPor2k_Internalname = "vPOR2K" ;
      edtavMtstart_Internalname = "vMTSTART" ;
      edtavPor2m_Internalname = "vPOR2M" ;
      Grid2paginationbar_Internalname = "GRID2PAGINATIONBAR" ;
      divGrid2tablewithpaginationbar_Internalname = "GRID2TABLEWITHPAGINATIONBAR" ;
      edtavTotktart_Internalname = "vTOTKTART" ;
      edtavTotmtart_Internalname = "vTOTMTART" ;
      tblTipodearticulo_Internalname = "TIPODEARTICULO" ;
      edtavOpenom_Internalname = "vOPENOM" ;
      edtavKgsope_Internalname = "vKGSOPE" ;
      edtavPor3k_Internalname = "vPOR3K" ;
      edtavMtsope_Internalname = "vMTSOPE" ;
      edtavPor3m_Internalname = "vPOR3M" ;
      Grid3paginationbar_Internalname = "GRID3PAGINATIONBAR" ;
      divGrid3tablewithpaginationbar_Internalname = "GRID3TABLEWITHPAGINATIONBAR" ;
      edtavTotkope_Internalname = "vTOTKOPE" ;
      edtavTotmtope_Internalname = "vTOTMTOPE" ;
      tblOperarios_Internalname = "OPERARIOS" ;
      tblTablemergedmaquinas_Internalname = "TABLEMERGEDMAQUINAS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
      edtavGrid2currentpage_Internalname = "vGRID2CURRENTPAGE" ;
      edtavGrid3currentpage_Internalname = "vGRID3CURRENTPAGE" ;
      Grid3_empowerer_Internalname = "GRID3_EMPOWERER" ;
      Grid2_empowerer_Internalname = "GRID2_EMPOWERER" ;
      Grid1_empowerer_Internalname = "GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
      subGrid3_Internalname = "GRID3" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Allowselection = (byte)(0) ;
      subGrid3_Header = "" ;
      edtavPor3m_Jsonclick = "" ;
      edtavPor3m_Enabled = 0 ;
      edtavMtsope_Jsonclick = "" ;
      edtavMtsope_Enabled = 0 ;
      edtavPor3k_Jsonclick = "" ;
      edtavPor3k_Enabled = 0 ;
      edtavKgsope_Jsonclick = "" ;
      edtavKgsope_Enabled = 0 ;
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Enabled = 0 ;
      subGrid3_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid3_Backcolorstyle = (byte)(0) ;
      edtavPor2m_Jsonclick = "" ;
      edtavPor2m_Enabled = 0 ;
      edtavMtstart_Jsonclick = "" ;
      edtavMtstart_Enabled = 0 ;
      edtavPor2k_Jsonclick = "" ;
      edtavPor2k_Enabled = 0 ;
      edtavKgstart_Jsonclick = "" ;
      edtavKgstart_Enabled = 0 ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 0 ;
      subGrid2_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtavPor1m_Jsonclick = "" ;
      edtavPor1m_Enabled = 0 ;
      edtavHispromtr_Jsonclick = "" ;
      edtavHispromtr_Enabled = 0 ;
      edtavPor1k_Jsonclick = "" ;
      edtavPor1k_Enabled = 0 ;
      edtavHisprokgr_Jsonclick = "" ;
      edtavHisprokgr_Enabled = 0 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavFechafinal_Jsonclick = "" ;
      edtavFechafinal_Enabled = 1 ;
      edtavFechainicial_Jsonclick = "" ;
      edtavFechainicial_Enabled = 1 ;
      dynavMaquinafinal.setJsonclick( "" );
      dynavMaquinafinal.setEnabled( 1 );
      dynavMaquinainicial.setJsonclick( "" );
      dynavMaquinainicial.setEnabled( 1 );
      edtavTotmt_Jsonclick = "" ;
      edtavTotmt_Enabled = 1 ;
      edtavTotk_Jsonclick = "" ;
      edtavTotk_Enabled = 1 ;
      edtavTotmtart_Jsonclick = "" ;
      edtavTotmtart_Enabled = 1 ;
      edtavTotktart_Jsonclick = "" ;
      edtavTotktart_Enabled = 1 ;
      edtavTotmtope_Jsonclick = "" ;
      edtavTotmtope_Enabled = 1 ;
      edtavTotkope_Jsonclick = "" ;
      edtavTotkope_Enabled = 1 ;
      edtavGrid3currentpage_Jsonclick = "" ;
      edtavGrid3currentpage_Visible = 1 ;
      edtavGrid2currentpage_Jsonclick = "" ;
      edtavGrid2currentpage_Visible = 1 ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      Grid3paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid3paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid3paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid3paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid3paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid3paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid3paginationbar_Rowsperpageselectedvalue = 10 ;
      Grid3paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid3paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid3paginationbar_Pagingcaptionposition = "Left" ;
      Grid3paginationbar_Pagingbuttonsposition = "Right" ;
      Grid3paginationbar_Pagestoshow = 5 ;
      Grid3paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid3paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid3paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid3paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid3paginationbar_Class = "PaginationBar" ;
      Grid2paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid2paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid2paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid2paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid2paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid2paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid2paginationbar_Rowsperpageselectedvalue = 10 ;
      Grid2paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid2paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid2paginationbar_Pagingcaptionposition = "Left" ;
      Grid2paginationbar_Pagingbuttonsposition = "Right" ;
      Grid2paginationbar_Pagestoshow = 5 ;
      Grid2paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid2paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid2paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid2paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid2paginationbar_Class = "PaginationBar" ;
      Grid1paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid1paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid1paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid1paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid1paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid1paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid1paginationbar_Rowsperpageselectedvalue = 10 ;
      Grid1paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid1paginationbar_Pagingcaptionposition = "Left" ;
      Grid1paginationbar_Pagingbuttonsposition = "Right" ;
      Grid1paginationbar_Pagestoshow = 5 ;
      Grid1paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Class = "PaginationBar" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Produccion Resumen", "") );
      subGrid3_Rows = 0 ;
      subGrid2_Rows = 0 ;
      subGrid1_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      dynavMaquinainicial.setName( "vMAQUINAINICIAL" );
      dynavMaquinainicial.setWebtags( "" );
      dynavMaquinafinal.setName( "vMAQUINAFINAL" );
      dynavMaquinafinal.setWebtags( "" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID3.LOAD","{handler:'e21163',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID3.LOAD",",oparms:[{av:'AV37Totkope',fld:'vTOTKOPE',pic:'ZZZZZZ9.99'},{av:'AV38TotMtope',fld:'vTOTMTOPE',pic:'ZZZZZZ9.99'},{av:'AV40Kgsope',fld:'vKGSOPE',pic:'ZZZZZ9.99'},{av:'AV41Mtsope',fld:'vMTSOPE',pic:'ZZZZZ9.99'},{av:'AV36Openom',fld:'vOPENOM',pic:''},{av:'AV42Por3k',fld:'vPOR3K',pic:'ZZ9.99'},{av:'AV43Por3m',fld:'vPOR3M',pic:'ZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("GRID2.LOAD","{handler:'e20166',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID2.LOAD",",oparms:[{av:'AV28Totktart',fld:'vTOTKTART',pic:'ZZZZZZ9.99'},{av:'AV29TotMtart',fld:'vTOTMTART',pic:'ZZZZZZ9.99'},{av:'AV31KgsTart',fld:'vKGSTART',pic:'ZZZZZZ9.99'},{av:'AV32MtsTart',fld:'vMTSTART',pic:'ZZZZZ9.99'},{av:'AV27TipArtDsc',fld:'vTIPARTDSC',pic:''},{av:'AV33Por2k',fld:'vPOR2K',pic:'ZZ9.99'},{av:'AV34Por2m',fld:'vPOR2M',pic:'ZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e19162',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV20Totk',fld:'vTOTK',pic:'ZZZZZZ9.99'},{av:'AV21TotMt',fld:'vTOTMT',pic:'ZZZZZZ9.99'},{av:'AV15HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV16HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV25MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV23Por1k',fld:'vPOR1K',pic:'ZZ9.99'},{av:'AV24Por1m',fld:'vPOR1M',pic:'ZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("GRID3PAGINATIONBAR.CHANGEPAGE","{handler:'e15162',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'Grid3paginationbar_Selectedpage',ctrl:'GRID3PAGINATIONBAR',prop:'SelectedPage'},{av:'AV50Grid3CurrentPage',fld:'vGRID3CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'}]");
      setEventMetadata("GRID3PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV50Grid3CurrentPage',fld:'vGRID3CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID3PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e16162',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'Grid3paginationbar_Rowsperpageselectedvalue',ctrl:'GRID3PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID3PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV50Grid3CurrentPage',fld:'vGRID3CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID2PAGINATIONBAR.CHANGEPAGE","{handler:'e13162',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'Grid2paginationbar_Selectedpage',ctrl:'GRID2PAGINATIONBAR',prop:'SelectedPage'},{av:'AV48Grid2CurrentPage',fld:'vGRID2CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID2PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV48Grid2CurrentPage',fld:'vGRID2CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID2PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14162',iparms:[{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'Grid2paginationbar_Rowsperpageselectedvalue',ctrl:'GRID2PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID2PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'AV48Grid2CurrentPage',fld:'vGRID2CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e11162',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV46Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV46Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12162',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynavMaquinainicial'},{av:'AV5MaquinaInicial',fld:'vMAQUINAINICIAL',pic:''},{av:'dynavMaquinafinal'},{av:'AV6MaquinaFinal',fld:'vMAQUINAFINAL',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV8FechaInicial',fld:'vFECHAINICIAL',pic:'99/99/99 99:99:99'},{av:'AV9FechaFinal',fld:'vFECHAFINAL',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV18TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV46Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'validv_Por1m',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Por2m',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Por3m',iparms:[]");
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
      Grid3paginationbar_Selectedpage = "" ;
      Grid2paginationbar_Selectedpage = "" ;
      Grid1paginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      AV13Emprcod = "" ;
      AV5MaquinaInicial = "" ;
      AV6MaquinaFinal = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV8FechaInicial = GXutil.resetTime( GXutil.nullDate() );
      AV9FechaFinal = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      AV18TTotk = DecimalUtil.ZERO ;
      AV19TTotMt = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid3_empowerer_Gridinternalname = "" ;
      Grid2_empowerer_Gridinternalname = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      ucGrid3_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid2_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25MaqDsc = "" ;
      AV16HisProKgr = DecimalUtil.ZERO ;
      AV23Por1k = DecimalUtil.ZERO ;
      AV15HisProMtr = DecimalUtil.ZERO ;
      AV24Por1m = DecimalUtil.ZERO ;
      AV27TipArtDsc = "" ;
      AV31KgsTart = DecimalUtil.ZERO ;
      AV33Por2k = DecimalUtil.ZERO ;
      AV32MtsTart = DecimalUtil.ZERO ;
      AV34Por2m = DecimalUtil.ZERO ;
      AV36Openom = "" ;
      AV40Kgsope = DecimalUtil.ZERO ;
      AV42Por3k = DecimalUtil.ZERO ;
      AV41Mtsope = DecimalUtil.ZERO ;
      AV43Por3m = DecimalUtil.ZERO ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H00162_A396EmprCod = new String[] {""} ;
      H00162_A602MaqCod = new String[] {""} ;
      H00162_A606MaqDsc = new String[] {""} ;
      H00162_n606MaqDsc = new boolean[] {false} ;
      H00163_A396EmprCod = new String[] {""} ;
      H00163_A602MaqCod = new String[] {""} ;
      H00163_A606MaqDsc = new String[] {""} ;
      H00163_n606MaqDsc = new boolean[] {false} ;
      AV20Totk = DecimalUtil.ZERO ;
      AV21TotMt = DecimalUtil.ZERO ;
      AV28Totktart = DecimalUtil.ZERO ;
      AV29TotMtart = DecimalUtil.ZERO ;
      AV37Totkope = DecimalUtil.ZERO ;
      AV38TotMtope = DecimalUtil.ZERO ;
      AV54Station = "" ;
      GXv_char2 = new String[1] ;
      AV55Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV56Usurcod = "" ;
      ucGrid3paginationbar = new com.genexus.webpanels.GXUserControl();
      ucGrid2paginationbar = new com.genexus.webpanels.GXUserControl();
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      H00164_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00164_A561HisProLin = new int[1] ;
      H00164_A602MaqCod = new String[] {""} ;
      H00164_A396EmprCod = new String[] {""} ;
      H00164_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00164_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00164_A606MaqDsc = new String[] {""} ;
      H00164_n606MaqDsc = new boolean[] {false} ;
      H00164_A656ParCod = new short[1] ;
      H00164_n656ParCod = new boolean[] {false} ;
      H00164_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00164_n4441HisProDTF = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      H00165_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00165_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00166_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00166_A561HisProLin = new int[1] ;
      H00166_A503GruOpeCod = new int[1] ;
      H00166_A396EmprCod = new String[] {""} ;
      H00166_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00166_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00166_A606MaqDsc = new String[] {""} ;
      H00166_n606MaqDsc = new boolean[] {false} ;
      H00166_A656ParCod = new short[1] ;
      H00166_n656ParCod = new boolean[] {false} ;
      H00166_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00166_n4441HisProDTF = new boolean[] {false} ;
      H00166_A602MaqCod = new String[] {""} ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      H00167_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00167_A561HisProLin = new int[1] ;
      H00167_A396EmprCod = new String[] {""} ;
      H00167_A656ParCod = new short[1] ;
      H00167_n656ParCod = new boolean[] {false} ;
      H00167_A2247HisProTip = new short[1] ;
      H00167_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00167_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00167_A606MaqDsc = new String[] {""} ;
      H00167_n606MaqDsc = new boolean[] {false} ;
      H00167_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00167_n4441HisProDTF = new boolean[] {false} ;
      H00167_A602MaqCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Gx_msg = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      subGrid2_Linesclass = "" ;
      subGrid3_Linesclass = "" ;
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informeproduccionresumen__default(),
         new Object[] {
             new Object[] {
            H00162_A396EmprCod, H00162_A602MaqCod, H00162_A606MaqDsc, H00162_n606MaqDsc
            }
            , new Object[] {
            H00163_A396EmprCod, H00163_A602MaqCod, H00163_A606MaqDsc, H00163_n606MaqDsc
            }
            , new Object[] {
            H00164_A558HisProFec, H00164_A561HisProLin, H00164_A602MaqCod, H00164_A396EmprCod, H00164_A1525HisProKgr, H00164_A1526HisProMtr, H00164_A606MaqDsc, H00164_n606MaqDsc, H00164_A656ParCod, H00164_n656ParCod,
            H00164_A4441HisProDTF, H00164_n4441HisProDTF
            }
            , new Object[] {
            H00165_A1525HisProKgr, H00165_A1526HisProMtr
            }
            , new Object[] {
            H00166_A558HisProFec, H00166_A561HisProLin, H00166_A503GruOpeCod, H00166_A396EmprCod, H00166_A1525HisProKgr, H00166_A1526HisProMtr, H00166_A606MaqDsc, H00166_n606MaqDsc, H00166_A656ParCod, H00166_n656ParCod,
            H00166_A4441HisProDTF, H00166_n4441HisProDTF, H00166_A602MaqCod
            }
            , new Object[] {
            H00167_A558HisProFec, H00167_A561HisProLin, H00167_A396EmprCod, H00167_A656ParCod, H00167_n656ParCod, H00167_A2247HisProTip, H00167_A1525HisProKgr, H00167_A1526HisProMtr, H00167_A606MaqDsc, H00167_n606MaqDsc,
            H00167_A4441HisProDTF, H00167_n4441HisProDTF, H00167_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      edtavHisprokgr_Enabled = 0 ;
      edtavPor1k_Enabled = 0 ;
      edtavHispromtr_Enabled = 0 ;
      edtavPor1m_Enabled = 0 ;
      edtavTipartdsc_Enabled = 0 ;
      edtavKgstart_Enabled = 0 ;
      edtavPor2k_Enabled = 0 ;
      edtavMtstart_Enabled = 0 ;
      edtavPor2m_Enabled = 0 ;
      edtavOpenom_Enabled = 0 ;
      edtavKgsope_Enabled = 0 ;
      edtavPor3k_Enabled = 0 ;
      edtavMtsope_Enabled = 0 ;
      edtavPor3m_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID1_nEOF ;
   private byte GRID2_nEOF ;
   private byte GRID3_nEOF ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid3_Titlebackstyle ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short A656ParCod ;
   private short A2247HisProTip ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV26Hisprotip ;
   private int Grid3paginationbar_Rowsperpageselectedvalue ;
   private int Grid2paginationbar_Rowsperpageselectedvalue ;
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nRC_GXsfl_69 ;
   private int nRC_GXsfl_95 ;
   private int subGrid1_Rows ;
   private int subGrid2_Rows ;
   private int subGrid3_Rows ;
   private int nGXsfl_43_idx=1 ;
   private int nGXsfl_69_idx=1 ;
   private int nGXsfl_95_idx=1 ;
   private int A503GruOpeCod ;
   private int Grid1paginationbar_Pagestoshow ;
   private int Grid2paginationbar_Pagestoshow ;
   private int Grid3paginationbar_Pagestoshow ;
   private int edtavGrid1currentpage_Visible ;
   private int edtavGrid2currentpage_Visible ;
   private int edtavGrid3currentpage_Visible ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int subGrid3_Islastpage ;
   private int subGrid2_Islastpage ;
   private int edtavMaqdsc_Enabled ;
   private int edtavHisprokgr_Enabled ;
   private int edtavPor1k_Enabled ;
   private int edtavHispromtr_Enabled ;
   private int edtavPor1m_Enabled ;
   private int edtavTipartdsc_Enabled ;
   private int edtavKgstart_Enabled ;
   private int edtavPor2k_Enabled ;
   private int edtavMtstart_Enabled ;
   private int edtavPor2m_Enabled ;
   private int edtavOpenom_Enabled ;
   private int edtavKgsope_Enabled ;
   private int edtavPor3k_Enabled ;
   private int edtavMtsope_Enabled ;
   private int edtavPor3m_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int GRID3_nGridOutOfScope ;
   private int GRID2_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int subGrid3_Recordcount ;
   private int subGrid2_Recordcount ;
   private int AV45PageToGo ;
   private int AV35Gruopecod ;
   private int edtavTotkope_Enabled ;
   private int edtavTotmtope_Enabled ;
   private int edtavTotktart_Enabled ;
   private int edtavTotmtart_Enabled ;
   private int edtavTotk_Enabled ;
   private int edtavTotmt_Enabled ;
   private int edtavFechainicial_Enabled ;
   private int edtavFechafinal_Enabled ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid3_Titlebackcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long AV47Grid1PageCount ;
   private long AV49Grid2PageCount ;
   private long AV51Grid3PageCount ;
   private long AV46Grid1CurrentPage ;
   private long AV48Grid2CurrentPage ;
   private long AV50Grid3CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID2_nCurrentRecord ;
   private long GRID3_nCurrentRecord ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV18TTotk ;
   private java.math.BigDecimal AV19TTotMt ;
   private java.math.BigDecimal AV16HisProKgr ;
   private java.math.BigDecimal AV23Por1k ;
   private java.math.BigDecimal AV15HisProMtr ;
   private java.math.BigDecimal AV24Por1m ;
   private java.math.BigDecimal AV31KgsTart ;
   private java.math.BigDecimal AV33Por2k ;
   private java.math.BigDecimal AV32MtsTart ;
   private java.math.BigDecimal AV34Por2m ;
   private java.math.BigDecimal AV40Kgsope ;
   private java.math.BigDecimal AV42Por3k ;
   private java.math.BigDecimal AV41Mtsope ;
   private java.math.BigDecimal AV43Por3m ;
   private java.math.BigDecimal AV20Totk ;
   private java.math.BigDecimal AV21TotMt ;
   private java.math.BigDecimal AV28Totktart ;
   private java.math.BigDecimal AV29TotMtart ;
   private java.math.BigDecimal AV37Totkope ;
   private java.math.BigDecimal AV38TotMtope ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private String Grid3paginationbar_Selectedpage ;
   private String Grid2paginationbar_Selectedpage ;
   private String Grid1paginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_43_idx="0001" ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV13Emprcod ;
   private String AV5MaquinaInicial ;
   private String AV6MaquinaFinal ;
   private String A606MaqDsc ;
   private String sGXsfl_69_idx="0001" ;
   private String sGXsfl_95_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Grid1paginationbar_Class ;
   private String Grid1paginationbar_Pagingbuttonsposition ;
   private String Grid1paginationbar_Pagingcaptionposition ;
   private String Grid1paginationbar_Emptygridclass ;
   private String Grid1paginationbar_Rowsperpageoptions ;
   private String Grid1paginationbar_Previous ;
   private String Grid1paginationbar_Next ;
   private String Grid1paginationbar_Caption ;
   private String Grid1paginationbar_Emptygridcaption ;
   private String Grid1paginationbar_Rowsperpagecaption ;
   private String Grid2paginationbar_Class ;
   private String Grid2paginationbar_Pagingbuttonsposition ;
   private String Grid2paginationbar_Pagingcaptionposition ;
   private String Grid2paginationbar_Emptygridclass ;
   private String Grid2paginationbar_Rowsperpageoptions ;
   private String Grid2paginationbar_Previous ;
   private String Grid2paginationbar_Next ;
   private String Grid2paginationbar_Caption ;
   private String Grid2paginationbar_Emptygridcaption ;
   private String Grid2paginationbar_Rowsperpagecaption ;
   private String Grid3paginationbar_Class ;
   private String Grid3paginationbar_Pagingbuttonsposition ;
   private String Grid3paginationbar_Pagingcaptionposition ;
   private String Grid3paginationbar_Emptygridclass ;
   private String Grid3paginationbar_Rowsperpageoptions ;
   private String Grid3paginationbar_Previous ;
   private String Grid3paginationbar_Next ;
   private String Grid3paginationbar_Caption ;
   private String Grid3paginationbar_Emptygridcaption ;
   private String Grid3paginationbar_Rowsperpagecaption ;
   private String Grid3_empowerer_Gridinternalname ;
   private String Grid2_empowerer_Gridinternalname ;
   private String Grid1_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String edtavGrid2currentpage_Internalname ;
   private String edtavGrid2currentpage_Jsonclick ;
   private String edtavGrid3currentpage_Internalname ;
   private String edtavGrid3currentpage_Jsonclick ;
   private String Grid3_empowerer_Internalname ;
   private String Grid2_empowerer_Internalname ;
   private String Grid1_empowerer_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid2_Internalname ;
   private String subGrid3_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV25MaqDsc ;
   private String edtavMaqdsc_Internalname ;
   private String edtavHisprokgr_Internalname ;
   private String edtavPor1k_Internalname ;
   private String edtavHispromtr_Internalname ;
   private String edtavPor1m_Internalname ;
   private String AV27TipArtDsc ;
   private String edtavTipartdsc_Internalname ;
   private String edtavKgstart_Internalname ;
   private String edtavPor2k_Internalname ;
   private String edtavMtstart_Internalname ;
   private String edtavPor2m_Internalname ;
   private String AV36Openom ;
   private String edtavOpenom_Internalname ;
   private String edtavKgsope_Internalname ;
   private String edtavPor3k_Internalname ;
   private String edtavMtsope_Internalname ;
   private String edtavPor3m_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtavFechainicial_Internalname ;
   private String edtavFechafinal_Internalname ;
   private String edtavTotk_Internalname ;
   private String edtavTotmt_Internalname ;
   private String edtavTotktart_Internalname ;
   private String edtavTotmtart_Internalname ;
   private String edtavTotkope_Internalname ;
   private String edtavTotmtope_Internalname ;
   private String AV54Station ;
   private String GXv_char2[] ;
   private String AV55Emprnom ;
   private String GXv_char3[] ;
   private String AV56Usurcod ;
   private String Grid3paginationbar_Internalname ;
   private String Grid2paginationbar_Internalname ;
   private String Grid1paginationbar_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String tblTablemergedmaquinas_Internalname ;
   private String tblOperarios_Internalname ;
   private String divGrid3tablewithpaginationbar_Internalname ;
   private String edtavTotkope_Jsonclick ;
   private String edtavTotmtope_Jsonclick ;
   private String tblTipodearticulo_Internalname ;
   private String divGrid2tablewithpaginationbar_Internalname ;
   private String edtavTotktart_Jsonclick ;
   private String edtavTotmtart_Jsonclick ;
   private String tblMaquinas_Internalname ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String edtavTotk_Jsonclick ;
   private String edtavTotmt_Jsonclick ;
   private String tblTablemergedtablecontent_Internalname ;
   private String divTablecontent_Internalname ;
   private String edtavFechainicial_Jsonclick ;
   private String edtavFechafinal_Jsonclick ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtavHisprokgr_Jsonclick ;
   private String edtavPor1k_Jsonclick ;
   private String edtavHispromtr_Jsonclick ;
   private String edtavPor1m_Jsonclick ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavTipartdsc_Jsonclick ;
   private String edtavKgstart_Jsonclick ;
   private String edtavPor2k_Jsonclick ;
   private String edtavMtstart_Jsonclick ;
   private String edtavPor2m_Jsonclick ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavOpenom_Jsonclick ;
   private String edtavKgsope_Jsonclick ;
   private String edtavPor3k_Jsonclick ;
   private String edtavMtsope_Jsonclick ;
   private String edtavPor3m_Jsonclick ;
   private String subGrid3_Header ;
   private String subGrid2_Header ;
   private String subGrid1_Header ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV8FechaInicial ;
   private java.util.Date AV9FechaFinal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean Grid1paginationbar_Showfirst ;
   private boolean Grid1paginationbar_Showprevious ;
   private boolean Grid1paginationbar_Shownext ;
   private boolean Grid1paginationbar_Showlast ;
   private boolean Grid1paginationbar_Rowsperpageselector ;
   private boolean Grid2paginationbar_Showfirst ;
   private boolean Grid2paginationbar_Showprevious ;
   private boolean Grid2paginationbar_Shownext ;
   private boolean Grid2paginationbar_Showlast ;
   private boolean Grid2paginationbar_Rowsperpageselector ;
   private boolean Grid3paginationbar_Showfirst ;
   private boolean Grid3paginationbar_Showprevious ;
   private boolean Grid3paginationbar_Shownext ;
   private boolean Grid3paginationbar_Showlast ;
   private boolean Grid3paginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean brk169 ;
   private boolean brk164 ;
   private boolean brk167 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucGrid3_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid2_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid3paginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid2paginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private HTMLChoice dynavMaquinainicial ;
   private HTMLChoice dynavMaquinafinal ;
   private IDataStoreProvider pr_default ;
   private String[] H00162_A396EmprCod ;
   private String[] H00162_A602MaqCod ;
   private String[] H00162_A606MaqDsc ;
   private boolean[] H00162_n606MaqDsc ;
   private String[] H00163_A396EmprCod ;
   private String[] H00163_A602MaqCod ;
   private String[] H00163_A606MaqDsc ;
   private boolean[] H00163_n606MaqDsc ;
   private java.util.Date[] H00164_A558HisProFec ;
   private int[] H00164_A561HisProLin ;
   private String[] H00164_A602MaqCod ;
   private String[] H00164_A396EmprCod ;
   private java.math.BigDecimal[] H00164_A1525HisProKgr ;
   private java.math.BigDecimal[] H00164_A1526HisProMtr ;
   private String[] H00164_A606MaqDsc ;
   private boolean[] H00164_n606MaqDsc ;
   private short[] H00164_A656ParCod ;
   private boolean[] H00164_n656ParCod ;
   private java.util.Date[] H00164_A4441HisProDTF ;
   private boolean[] H00164_n4441HisProDTF ;
   private java.math.BigDecimal[] H00165_A1525HisProKgr ;
   private java.math.BigDecimal[] H00165_A1526HisProMtr ;
   private java.util.Date[] H00166_A558HisProFec ;
   private int[] H00166_A561HisProLin ;
   private int[] H00166_A503GruOpeCod ;
   private String[] H00166_A396EmprCod ;
   private java.math.BigDecimal[] H00166_A1525HisProKgr ;
   private java.math.BigDecimal[] H00166_A1526HisProMtr ;
   private String[] H00166_A606MaqDsc ;
   private boolean[] H00166_n606MaqDsc ;
   private short[] H00166_A656ParCod ;
   private boolean[] H00166_n656ParCod ;
   private java.util.Date[] H00166_A4441HisProDTF ;
   private boolean[] H00166_n4441HisProDTF ;
   private String[] H00166_A602MaqCod ;
   private java.util.Date[] H00167_A558HisProFec ;
   private int[] H00167_A561HisProLin ;
   private String[] H00167_A396EmprCod ;
   private short[] H00167_A656ParCod ;
   private boolean[] H00167_n656ParCod ;
   private short[] H00167_A2247HisProTip ;
   private java.math.BigDecimal[] H00167_A1525HisProKgr ;
   private java.math.BigDecimal[] H00167_A1526HisProMtr ;
   private String[] H00167_A606MaqDsc ;
   private boolean[] H00167_n606MaqDsc ;
   private java.util.Date[] H00167_A4441HisProDTF ;
   private boolean[] H00167_n4441HisProDTF ;
   private String[] H00167_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class informeproduccionresumen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00162", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE MaqDsc <> ' ' ORDER BY MaqDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00163", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE MaqDsc <> ' ' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00164", "SELECT T1.HisProFec, T1.HisProLin, T1.MaqCod, T1.EmprCod, T1.HisProKgr, T1.HisProMtr, T2.MaqDsc, T1.ParCod, T1.HisProDTF FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ?) AND (T1.MaqCod >= ? or (rtrim(?) IS NULL)) AND (T1.MaqCod <= ? or (rtrim(?) IS NULL)) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.ParCod = 0) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00165", "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ? or (rtrim(?) IS NULL)) AND (MaqCod <= ? or (rtrim(?) IS NULL)) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (ParCod = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00166", "SELECT T1.HisProFec, T1.HisProLin, T1.GruOpeCod, T1.EmprCod, T1.HisProKgr, T1.HisProMtr, T2.MaqDsc, T1.ParCod, T1.HisProDTF, T1.MaqCod FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ?) AND (T1.MaqCod >= ? or (rtrim(?) IS NULL)) AND (T1.MaqCod <= ? or (rtrim(?) IS NULL)) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.ParCod = 0) ORDER BY T1.EmprCod, T1.GruOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00167", "SELECT T1.HisProFec, T1.HisProLin, T1.EmprCod, T1.ParCod, T1.HisProTip, T1.HisProKgr, T1.HisProMtr, T2.MaqDsc, T1.HisProDTF, T1.MaqCod FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ?) AND (T1.MaqCod >= ? or (rtrim(?) IS NULL)) AND (T1.MaqCod <= ? or (rtrim(?) IS NULL)) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.ParCod = 0) ORDER BY T1.EmprCod, T1.HisProTip ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               return;
      }
   }

}

