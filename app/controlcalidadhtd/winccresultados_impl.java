package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class winccresultados_impl extends GXDataArea
{
   public winccresultados_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public winccresultados_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( winccresultados_impl.class ));
   }

   public winccresultados_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
         {
            gxnrgrid4_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid4") == 0 )
         {
            gxgrgrid4_refresh_invoke( ) ;
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
      nRC_GXsfl_124 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_124"))) ;
      nGXsfl_124_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_124_idx"))) ;
      sGXsfl_124_idx = httpContext.GetPar( "sGXsfl_124_idx") ;
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
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      AV16carvitin = (byte)(GXutil.lval( httpContext.GetPar( "carvitin"))) ;
      AV25CCOpeCod = (int)(GXutil.lval( httpContext.GetPar( "CCOpeCod"))) ;
      AV45errControl = (byte)(GXutil.lval( httpContext.GetPar( "errControl"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV43EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
      AV10BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
      AV9BarCodParIn = httpContext.GetPar( "BarCodParIn") ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      A460FasDsc = httpContext.GetPar( "FasDsc") ;
      A759ProDsc = httpContext.GetPar( "ProDsc") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV46FasCod = httpContext.GetPar( "FasCod") ;
      A4036CCTDsc = httpContext.GetPar( "CCTDsc") ;
      AV38Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV5Artcod = httpContext.GetPar( "Artcod") ;
      AV21CCFColNom = httpContext.GetPar( "CCFColNom") ;
      AV22CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
      AV42Cuaderno = (short)(GXutil.lval( httpContext.GetPar( "Cuaderno"))) ;
      AV17CCCno5 = (byte)(GXutil.lval( httpContext.GetPar( "CCCno5"))) ;
      AV27Ccser1 = (byte)(GXutil.lval( httpContext.GetPar( "Ccser1"))) ;
      AV76ProCod = httpContext.GetPar( "ProCod") ;
      AV15BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV28CctCod = (int)(GXutil.lval( httpContext.GetPar( "CctCod"))) ;
      A4032CCOpeCod = (int)(GXutil.lval( httpContext.GetPar( "CCOpeCod"))) ;
      n4032CCOpeCod = false ;
      AV40CnoEnc = (byte)(GXutil.lval( httpContext.GetPar( "CnoEnc"))) ;
      AV41CtrlfsLb = (byte)(GXutil.lval( httpContext.GetPar( "CtrlfsLb"))) ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void gxnrgrid4_newrow_invoke( )
   {
      nRC_GXsfl_142 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_142"))) ;
      nGXsfl_142_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_142_idx"))) ;
      sGXsfl_142_idx = httpContext.GetPar( "sGXsfl_142_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid4_newrow( ) ;
      /* End function gxnrGrid4_newrow_invoke */
   }

   public void gxgrgrid4_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      AV16carvitin = (byte)(GXutil.lval( httpContext.GetPar( "carvitin"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV43EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
      AV10BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
      AV9BarCodParIn = httpContext.GetPar( "BarCodParIn") ;
      AV76ProCod = httpContext.GetPar( "ProCod") ;
      AV15BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV28CctCod = (int)(GXutil.lval( httpContext.GetPar( "CctCod"))) ;
      A4036CCTDsc = httpContext.GetPar( "CCTDsc") ;
      A4032CCOpeCod = (int)(GXutil.lval( httpContext.GetPar( "CCOpeCod"))) ;
      n4032CCOpeCod = false ;
      A4033CCFch = localUtil.parseDateParm( httpContext.GetPar( "CCFch")) ;
      n4033CCFch = false ;
      A3281CcObs = httpContext.GetPar( "CcObs") ;
      n3281CcObs = false ;
      AV40CnoEnc = (byte)(GXutil.lval( httpContext.GetPar( "CnoEnc"))) ;
      AV41CtrlfsLb = (byte)(GXutil.lval( httpContext.GetPar( "CtrlfsLb"))) ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid4_refresh_invoke */
   }

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_153 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_153"))) ;
      nGXsfl_153_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_153_idx"))) ;
      sGXsfl_153_idx = httpContext.GetPar( "sGXsfl_153_idx") ;
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
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      AV16carvitin = (byte)(GXutil.lval( httpContext.GetPar( "carvitin"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
      AV43EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
      AV10BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
      AV9BarCodParIn = httpContext.GetPar( "BarCodParIn") ;
      AV76ProCod = httpContext.GetPar( "ProCod") ;
      AV15BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV29CCTCodGrid = (int)(GXutil.lval( httpContext.GetPar( "CCTCodGrid"))) ;
      A4043CCTLinDsc = httpContext.GetPar( "CCTLinDsc") ;
      A13252CCEspecif = httpContext.GetPar( "CCEspecif") ;
      A13251CCMetodo = httpContext.GetPar( "CCMetodo") ;
      A4048CCTLinTpoI = httpContext.GetPar( "CCTLinTpoI") ;
      A4035CCVal = httpContext.GetPar( "CCVal") ;
      A4049CCTValLin = (byte)(GXutil.lval( httpContext.GetPar( "CCTValLin"))) ;
      AV28CctCod = (int)(GXutil.lval( httpContext.GetPar( "CctCod"))) ;
      AV34CCTLinGrid = (short)(GXutil.lval( httpContext.GetPar( "CCTLinGrid"))) ;
      A4051CCTVal = httpContext.GetPar( "CCTVal") ;
      AV37CCValGrid = httpContext.GetPar( "CCValGrid") ;
      A4050CCTValDsc = httpContext.GetPar( "CCTValDsc") ;
      AV40CnoEnc = (byte)(GXutil.lval( httpContext.GetPar( "CnoEnc"))) ;
      AV41CtrlfsLb = (byte)(GXutil.lval( httpContext.GetPar( "CtrlfsLb"))) ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
      pa1X62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1X62( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.winccresultados", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CnoEnc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLFSLB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41CtrlfsLb), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WINCCResultados");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\winccresultados:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_124", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_124, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_142", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_142, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_153", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_153, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV16carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC", GXutil.rtrim( A4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CCESPECIF", GXutil.rtrim( A13252CCEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "CCMETODO", GXutil.rtrim( A13251CCMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOI", GXutil.rtrim( A4048CCTLinTpoI));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVAL", GXutil.rtrim( A4035CCVal));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALLIN", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVAL", GXutil.rtrim( A4051CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALDSC", GXutil.rtrim( A4050CCTValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTDSC", GXutil.rtrim( A4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOPECOD", GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCH", localUtil.dtoc( A4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOBS", A3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC", GXutil.rtrim( A759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCFCOLNOM", GXutil.rtrim( AV21CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCFCOLNUM", GXutil.ltrim( localUtil.ntoc( AV22CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARANCACA1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGRAACA", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAANH", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCNOENC", GXutil.ltrim( localUtil.ntoc( AV40CnoEnc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CnoEnc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCOLNOM", GXutil.rtrim( A4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCOLNUM", GXutil.ltrim( localUtil.ntoc( A4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TB1_COD", GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCARTCOD", GXutil.rtrim( A11736CCArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTIID", GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCCOLNOM", GXutil.rtrim( A11737CCColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CCCOLNUM", GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCCTC", GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTID", GXutil.ltrim( localUtil.ntoc( A11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTABLA_BARCAD", GXutil.ltrim( localUtil.ntoc( AV80Tabla_Barcad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLFSLB", GXutil.ltrim( localUtil.ntoc( AV41CtrlfsLb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLFSLB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41CtrlfsLb), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_Rows", GXutil.ltrim( localUtil.ntoc( subGrid4_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid3_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid4_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
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
         we1X62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1X62( ) ;
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
      return formatLink("app.controlcalidadhtd.winccresultados", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WINCCResultados" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Resultados CCalidad", "") ;
   }

   public void wb1X60( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodin_Internalname, httpContext.getMessage( "Ordem S", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodin_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarcodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarcodIN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarcodIN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoin_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoin_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarcodreoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarcodreoIN), "9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarcodreoIN), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparin_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparin_Internalname, GXutil.rtrim( AV9BarCodParIn), GXutil.rtrim( localUtil.format( AV9BarCodParIn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebar_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilogramos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Barkgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV13Barkgm, "ZZZZZ9.99") : localUtil.format( AV13Barkgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV14BarMtr, "ZZZZZ9.99") : localUtil.format( AV14BarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCuaderno_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCuaderno_Internalname, httpContext.getMessage( "Cuaderno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCuaderno_Internalname, GXutil.ltrim( localUtil.ntoc( AV42Cuaderno, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCuaderno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42Cuaderno), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42Cuaderno), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuaderno_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCuaderno_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTb1_dsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTb1_dsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTb1_dsc_Internalname, GXutil.rtrim( AV81tb1_dsc), GXutil.rtrim( localUtil.format( AV81tb1_dsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTb1_dsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTb1_dsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarancaca1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarancaca1_Internalname, httpContext.getMessage( "Largura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarancaca1_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarancaca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarancaca1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarancaca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBargraaca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBargraaca_Internalname, httpContext.getMessage( "Gramaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargraaca_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBargraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargraaca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargraaca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV38Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV38Clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV39CliNom), GXutil.rtrim( localUtil.format( AV39CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV5Artcod), GXutil.rtrim( localUtil.format( AV5Artcod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtdsc_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtdsc_Internalname, GXutil.rtrim( AV6ARtDsc), GXutil.rtrim( localUtil.format( AV6ARtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtncopiarresultado_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Copiar Resultado", ""), bttBtnbtncopiarresultado_Jsonclick, 5, httpContext.getMessage( "Copiar Resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBTNCOPIARRESULTADO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuttonelement2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Borrar Resultado", ""), bttBtnbuttonelement2_Jsonclick, 7, httpContext.getMessage( "Borrar Resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111x61_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\WINCCResultados.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, "DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         wb_table1_110_1X62( true) ;
      }
      else
      {
         wb_table1_110_1X62( false) ;
      }
      return  ;
   }

   public void wb_table1_110_1X62e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontainergrid_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrid1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol124( ) ;
      }
      if ( wbEnd == 124 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_124 = (int)(nGXsfl_124_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrid4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid4Container.SetWrapped(nGXWrapped);
         startgridcontrol142( ) ;
      }
      if ( wbEnd == 142 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_142 = (int)(nGXsfl_142_idx-1) ;
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid4Container.AddObjectProperty("GRID4_nEOF", GRID4_nEOF);
            Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid4", Grid4Container, subGrid4_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData", Grid4Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"V", Grid4Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid4ContainerData"+"V"+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
            }
         }
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid3Container.SetWrapped(nGXWrapped);
         startgridcontrol153( ) ;
      }
      if ( wbEnd == 153 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_153 = (int)(nGXsfl_153_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid3Container.AddObjectProperty("GRID3_nEOF", GRID3_nEOF);
            Grid3Container.AddObjectProperty("GRID3_nFirstRecordOnPage", GRID3_nFirstRecordOnPage);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcser1_Internalname, httpContext.getMessage( "Ccser1", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcser1_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Ccser1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCcser1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27Ccser1), "9") : localUtil.format( DecimalUtil.doubleToDec(AV27Ccser1), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcser1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcser1_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCccno5_Internalname, httpContext.getMessage( "CCCno5", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCccno5_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CCCno5, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCccno5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17CCCno5), "9") : localUtil.format( DecimalUtil.doubleToDec(AV17CCCno5), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCccno5_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCccno5_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV115Pgmname), GXutil.rtrim( localUtil.format( AV115Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINCCResultados.htm");
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
         /* User Defined Control */
         ucGrid3_empowerer.render(context, "wwp.gridempowerer", Grid3_empowerer_Internalname, "GRID3_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid4_empowerer.render(context, "wwp.gridempowerer", Grid4_empowerer_Internalname, "GRID4_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 124 )
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
               Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
               Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
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
      if ( wbEnd == 142 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid4Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid4Container.AddObjectProperty("GRID4_nEOF", GRID4_nEOF);
               Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid4", Grid4Container, subGrid4_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData", Grid4Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"V", Grid4Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid4ContainerData"+"V"+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 153 )
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
               Grid3Container.AddObjectProperty("GRID3_nEOF", GRID3_nEOF);
               Grid3Container.AddObjectProperty("GRID3_nFirstRecordOnPage", GRID3_nFirstRecordOnPage);
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

   public void start1X62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Resultados CCalidad", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1X60( ) ;
   }

   public void ws1X62( )
   {
      start1X62( ) ;
      evt1X62( ) ;
   }

   public void evt1X62( )
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
                        else if ( GXutil.strcmp(sEvt, "'DOBTN_PIDARTIGO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBTN_PIDArtigo' */
                           e121X62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e131X62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e141X62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBTNCOPIARRESULTADO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBtnCopiarResultado' */
                           e151X62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID4PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID4PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid4_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid4_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid4_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid4_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID3PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID3PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid3_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid3_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid3_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid3_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VBARORDLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VBARORDLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_124_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1242( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARORDLIN");
                              GX_FocusControl = edtavBarordlin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV15BarOrdLin = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
                           }
                           else
                           {
                              AV15BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
                           }
                           AV76ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV76ProCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
                           AV77ProDsc = httpContext.cgiGet( edtavProdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV77ProDsc);
                           AV46FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV46FasCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
                           AV47FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV47FasDsc);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTCOD");
                              GX_FocusControl = edtavCctcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28CctCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
                           }
                           else
                           {
                              AV28CctCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
                           }
                           AV31CctDsc = httpContext.cgiGet( edtavCctdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCctdsc_Internalname, AV31CctDsc);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCOPECOD");
                              GX_FocusControl = edtavCcopecod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25CCOpeCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
                           }
                           else
                           {
                              AV25CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavErrcontrol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavErrcontrol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vERRCONTROL");
                              GX_FocusControl = edtavErrcontrol_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV45errControl = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavErrcontrol_Internalname, GXutil.str( AV45errControl, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
                           }
                           else
                           {
                              AV45errControl = (byte)(localUtil.ctol( httpContext.cgiGet( edtavErrcontrol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavErrcontrol_Internalname, GXutil.str( AV45errControl, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFASEST");
                              GX_FocusControl = edtavBarfasest_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV11BarFasEst = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
                           }
                           else
                           {
                              AV11BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFAS");
                              GX_FocusControl = edtavCcfas_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19Ccfas = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
                           }
                           else
                           {
                              AV19Ccfas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOK");
                              GX_FocusControl = edtavOk_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV75Ok = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavOk_Internalname, GXutil.str( AV75Ok, 1, 0));
                           }
                           else
                           {
                              AV75Ok = (byte)(localUtil.ctol( httpContext.cgiGet( edtavOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavOk_Internalname, GXutil.str( AV75Ok, 1, 0));
                           }
                           AV107VerResultado = httpContext.cgiGet( edtavVerresultado_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavVerresultado_Internalname, AV107VerResultado);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161X62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171X62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181X62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VBARORDLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191X62 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID4.LOAD") == 0 )
                        {
                           nGXsfl_142_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_142_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_142_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1425( ) ;
                           AV29CCTCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCctcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTCodGrid), 6, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCODGRID"+"_"+sGXsfl_142_idx, getSecureSignedToken( sGXsfl_142_idx, localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9")));
                           AV32CCTDscGrid = httpContext.cgiGet( edtavCctdscgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCctdscgrid_Internalname, AV32CCTDscGrid);
                           AV20CCFchGrid = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcfchgrid_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCcfchgrid_Internalname, localUtil.format(AV20CCFchGrid, "99/99/99"));
                           AV26CCOpeCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcopecodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCcopecodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCOpeCodGrid), 6, 0));
                           AV24CcObsGrid = httpContext.cgiGet( edtavCcobsgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCcobsgrid_Internalname, AV24CcObsGrid);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID4.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201X65 ();
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
                           nGXsfl_153_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_153_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_153_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1533( ) ;
                           AV34CCTLinGrid = (short)(localUtil.ctol( httpContext.cgiGet( edtavCctlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCctlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTLinGrid), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9")));
                           AV33CCTLinDscGrid = httpContext.cgiGet( edtavCctlindscgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCctlindscgrid_Internalname, AV33CCTLinDscGrid);
                           AV23CCMetodoGrid = httpContext.cgiGet( edtavCcmetodogrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCcmetodogrid_Internalname, AV23CCMetodoGrid);
                           AV18CCEspecifGrid = httpContext.cgiGet( edtavCcespecifgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCcespecifgrid_Internalname, AV18CCEspecifGrid);
                           AV37CCValGrid = httpContext.cgiGet( edtavCcvalgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCcvalgrid_Internalname, AV37CCValGrid);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCVALGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, GXutil.rtrim( localUtil.format( AV37CCValGrid, ""))));
                           AV104CCTValGrid = httpContext.cgiGet( edtavCctvalgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCctvalgrid_Internalname, AV104CCTValGrid);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e211X63 ();
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

   public void we1X62( )
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

   public void pa1X62( )
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
            GX_FocusControl = edtavBarcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_1242( ) ;
      while ( nGXsfl_124_idx <= nRC_GXsfl_124 )
      {
         sendrow_1242( ) ;
         nGXsfl_124_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1533( ) ;
      while ( nGXsfl_153_idx <= nRC_GXsfl_153 )
      {
         sendrow_1533( ) ;
         nGXsfl_153_idx = ((subGrid3_Islastpage==1)&&(nGXsfl_153_idx+1>subgrid3_fnc_recordsperpage( )) ? 1 : nGXsfl_153_idx+1) ;
         sGXsfl_153_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_153_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1533( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1425( ) ;
      while ( nGXsfl_142_idx <= nRC_GXsfl_142 )
      {
         sendrow_1425( ) ;
         nGXsfl_142_idx = ((subGrid4_Islastpage==1)&&(nGXsfl_142_idx+1>subgrid4_fnc_recordsperpage( )) ? 1 : nGXsfl_142_idx+1) ;
         sGXsfl_142_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_142_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1425( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid4Container)) ;
      /* End function gxnrGrid4_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int subGrid4_Rows ,
                                  int subGrid3_Rows ,
                                  byte AV16carvitin ,
                                  int AV25CCOpeCod ,
                                  byte AV45errControl ,
                                  String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar ,
                                  String A758ProCod ,
                                  short A194BarOrdLin ,
                                  String AV43EmprCod ,
                                  int AV8BarcodIN ,
                                  byte AV10BarcodreoIN ,
                                  String AV9BarCodParIn ,
                                  String A457FasCod ,
                                  String A460FasDsc ,
                                  String A759ProDsc ,
                                  byte A153BarFasEst ,
                                  int A4031CCTCod ,
                                  String AV46FasCod ,
                                  String A4036CCTDsc ,
                                  int AV38Clicod ,
                                  String AV5Artcod ,
                                  String AV21CCFColNom ,
                                  int AV22CCFColNum ,
                                  short AV42Cuaderno ,
                                  byte AV17CCCno5 ,
                                  byte AV27Ccser1 ,
                                  String AV76ProCod ,
                                  short AV15BarOrdLin ,
                                  int AV28CctCod ,
                                  int A4032CCOpeCod ,
                                  byte AV40CnoEnc ,
                                  byte AV41CtrlfsLb ,
                                  String AV115Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171X62 ();
      GRID1_nCurrentRecord = 0 ;
      rf1X62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WINCCResultados");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\winccresultados:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid1_refresh */
   }

   public void gxgrgrid4_refresh( int subGrid1_Rows ,
                                  int subGrid4_Rows ,
                                  int subGrid3_Rows ,
                                  byte AV16carvitin ,
                                  String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar ,
                                  String A758ProCod ,
                                  short A194BarOrdLin ,
                                  int A4031CCTCod ,
                                  String AV43EmprCod ,
                                  int AV8BarcodIN ,
                                  byte AV10BarcodreoIN ,
                                  String AV9BarCodParIn ,
                                  String AV76ProCod ,
                                  short AV15BarOrdLin ,
                                  int AV28CctCod ,
                                  String A4036CCTDsc ,
                                  int A4032CCOpeCod ,
                                  java.util.Date A4033CCFch ,
                                  String A3281CcObs ,
                                  byte AV40CnoEnc ,
                                  byte AV41CtrlfsLb ,
                                  String AV115Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171X62 ();
      GRID4_nCurrentRecord = 0 ;
      rf1X65( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WINCCResultados");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\winccresultados:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid4_refresh */
   }

   public void gxgrgrid3_refresh( int subGrid1_Rows ,
                                  int subGrid4_Rows ,
                                  int subGrid3_Rows ,
                                  byte AV16carvitin ,
                                  String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar ,
                                  String A758ProCod ,
                                  short A194BarOrdLin ,
                                  int A4031CCTCod ,
                                  short A4034CCTLin ,
                                  String AV43EmprCod ,
                                  int AV8BarcodIN ,
                                  byte AV10BarcodreoIN ,
                                  String AV9BarCodParIn ,
                                  String AV76ProCod ,
                                  short AV15BarOrdLin ,
                                  int AV29CCTCodGrid ,
                                  String A4043CCTLinDsc ,
                                  String A13252CCEspecif ,
                                  String A13251CCMetodo ,
                                  String A4048CCTLinTpoI ,
                                  String A4035CCVal ,
                                  byte A4049CCTValLin ,
                                  int AV28CctCod ,
                                  short AV34CCTLinGrid ,
                                  String A4051CCTVal ,
                                  String AV37CCValGrid ,
                                  String A4050CCTValDsc ,
                                  byte AV40CnoEnc ,
                                  byte AV41CtrlfsLb ,
                                  String AV115Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171X62 ();
      GRID3_nCurrentRecord = 0 ;
      rf1X63( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WINCCResultados");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\winccresultados:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid3_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV76ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV28CctCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRCONTROL", GXutil.ltrim( localUtil.ntoc( AV45errControl, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV46FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCFAS", GXutil.ltrim( localUtil.ntoc( AV19Ccfas, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASEST", GXutil.ltrim( localUtil.ntoc( AV11BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCODGRID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCODGRID", GXutil.ltrim( localUtil.ntoc( AV29CCTCodGrid, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINGRID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTLINGRID", GXutil.ltrim( localUtil.ntoc( AV34CCTLinGrid, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCVALGRID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37CCValGrid, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCVALGRID", GXutil.rtrim( AV37CCValGrid));
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
      rf1X62( ) ;
      rf1X65( ) ;
      rf1X63( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV115Pgmname = "ControlCalidadHTD.WINCCResultados" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
      Gx_err = (short)(0) ;
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCcopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcopecod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavErrcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrcontrol_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavBarfasest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasest_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCcfas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfas_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOk_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavVerresultado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVerresultado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVerresultado_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCctcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcodgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCctdscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdscgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCcfchgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfchgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfchgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCcopecodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcopecodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcopecodgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCcobsgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcobsgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcobsgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCctlingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlingrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCctlindscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindscgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcmetodogrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcmetodogrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcmetodogrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcespecifgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcespecifgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcespecifgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcvalgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcvalgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcvalgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCctvalgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctvalgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctvalgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcser1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcser1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcser1_Enabled), 5, 0), true);
      edtavCccno5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCccno5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCccno5_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1X62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(124) ;
      /* Execute user event: Refresh */
      e171X62 ();
      nGXsfl_124_idx = 1 ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1242( ) ;
      bGXsfl_124_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_1242( ) ;
         e181X62 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_124_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e181X62 ();
         }
         wbEnd = (short)(124) ;
         wb1X60( ) ;
      }
      bGXsfl_124_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1X62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV16carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCNOENC", GXutil.ltrim( localUtil.ntoc( AV40CnoEnc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CnoEnc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLFSLB", GXutil.ltrim( localUtil.ntoc( AV41CtrlfsLb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLFSLB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41CtrlfsLb), "9")));
   }

   public void rf1X63( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid3Container.ClearRows();
      }
      wbStart = (short)(153) ;
      nGXsfl_153_idx = 1 ;
      sGXsfl_153_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_153_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1533( ) ;
      bGXsfl_153_Refreshing = true ;
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_1533( ) ;
         e211X63 ();
         if ( ( GRID3_nCurrentRecord > 0 ) && ( GRID3_nGridOutOfScope == 0 ) && ( nGXsfl_153_idx == 1 ) )
         {
            GRID3_nCurrentRecord = 0 ;
            GRID3_nGridOutOfScope = 1 ;
            subgrid3_firstpage( ) ;
            e211X63 ();
         }
         wbEnd = (short)(153) ;
         wb1X60( ) ;
      }
      bGXsfl_153_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1X63( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCVALGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, GXutil.rtrim( localUtil.format( AV37CCValGrid, ""))));
   }

   public void rf1X65( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid4Container.ClearRows();
      }
      wbStart = (short)(142) ;
      nGXsfl_142_idx = 1 ;
      sGXsfl_142_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_142_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1425( ) ;
      bGXsfl_142_Refreshing = true ;
      Grid4Container.AddObjectProperty("GridName", "Grid4");
      Grid4Container.AddObjectProperty("CmpContext", "");
      Grid4Container.AddObjectProperty("InMasterPage", "false");
      Grid4Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.setPageSize( subgrid4_fnc_recordsperpage( ) );
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
         subsflControlProps_1425( ) ;
         e201X65 ();
         if ( ( GRID4_nCurrentRecord > 0 ) && ( GRID4_nGridOutOfScope == 0 ) && ( nGXsfl_142_idx == 1 ) )
         {
            GRID4_nCurrentRecord = 0 ;
            GRID4_nGridOutOfScope = 1 ;
            subgrid4_firstpage( ) ;
            e201X65 ();
         }
         wbEnd = (short)(142) ;
         wb1X60( ) ;
      }
      bGXsfl_142_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1X65( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCODGRID"+"_"+sGXsfl_142_idx, getSecureSignedToken( sGXsfl_142_idx, localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9")));
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
         gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid3_lastpage( )
   {
      subGrid3_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
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
         gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgrid4_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid4_fnc_recordcount( )
   {
      return (int)(((subGrid4_Recordcount==0) ? GRID4_nFirstRecordOnPage+1 : subGrid4_Recordcount)) ;
   }

   public int subgrid4_fnc_recordsperpage( )
   {
      if ( subGrid4_Rows > 0 )
      {
         return subGrid4_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid4_fnc_currentpage( )
   {
      return (int)(((subGrid4_Islastpage==1) ? subgrid4_fnc_recordcount( )/ (double) (subgrid4_fnc_recordsperpage( ))+((((int)((subgrid4_fnc_recordcount( )) % (subgrid4_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID4_nFirstRecordOnPage/ (double) (subgrid4_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid4_firstpage( )
   {
      GRID4_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid4_nextpage( )
   {
      if ( GRID4_nEOF == 0 )
      {
         GRID4_nFirstRecordOnPage = (long)(GRID4_nFirstRecordOnPage+subgrid4_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID4_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid4_previouspage( )
   {
      if ( GRID4_nFirstRecordOnPage >= subgrid4_fnc_recordsperpage( ) )
      {
         GRID4_nFirstRecordOnPage = (long)(GRID4_nFirstRecordOnPage-subgrid4_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid4_lastpage( )
   {
      subGrid4_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid4_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID4_nFirstRecordOnPage = (long)(subgrid4_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID4_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV115Pgmname = "ControlCalidadHTD.WINCCResultados" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
      Gx_err = (short)(0) ;
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCcopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcopecod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavErrcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrcontrol_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavBarfasest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasest_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCcfas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfas_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOk_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavVerresultado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVerresultado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVerresultado_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtavCctcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcodgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCctdscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdscgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCcfchgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfchgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfchgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCcopecodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcopecodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcopecodgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCcobsgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcobsgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcobsgrid_Enabled), 5, 0), !bGXsfl_142_Refreshing);
      edtavCctlingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlingrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCctlindscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindscgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcmetodogrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcmetodogrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcmetodogrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcespecifgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcespecifgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcespecifgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcvalgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcvalgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcvalgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCctvalgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctvalgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctvalgrid_Enabled), 5, 0), !bGXsfl_153_Refreshing);
      edtavCcser1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcser1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcser1_Enabled), 5, 0), true);
      edtavCccno5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCccno5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCccno5_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1X60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161X62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_142 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_142"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_153 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_153"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV41CtrlfsLb = (byte)(localUtil.ctol( httpContext.cgiGet( "vCTRLFSLB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID4_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID4_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID3_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID3_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID4_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID4_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID3_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID3_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid4_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID4_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID4_Rows", GXutil.ltrim( localUtil.ntoc( subGrid4_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid3_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID3_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
         Grid3_empowerer_Gridinternalname = httpContext.cgiGet( "GRID3_EMPOWERER_Gridinternalname") ;
         Grid4_empowerer_Gridinternalname = httpContext.cgiGet( "GRID4_EMPOWERER_Gridinternalname") ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODIN");
            GX_FocusControl = edtavBarcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8BarcodIN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarcodIN), 8, 0));
         }
         else
         {
            AV8BarcodIN = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarcodIN), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOIN");
            GX_FocusControl = edtavBarcodreoin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarcodreoIN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarcodreoIN", GXutil.str( AV10BarcodreoIN, 1, 0));
         }
         else
         {
            AV10BarcodreoIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarcodreoIN", GXutil.str( AV10BarcodreoIN, 1, 0));
         }
         AV9BarCodParIn = httpContext.cgiGet( edtavBarcodparin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodParIn", AV9BarCodParIn);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Barkgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barkgm", GXutil.ltrimstr( AV13Barkgm, 9, 2));
         }
         else
         {
            AV13Barkgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barkgm", GXutil.ltrimstr( AV13Barkgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
            GX_FocusControl = edtavBarmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarMtr", GXutil.ltrimstr( AV14BarMtr, 9, 2));
         }
         else
         {
            AV14BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarMtr", GXutil.ltrimstr( AV14BarMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuaderno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuaderno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUADERNO");
            GX_FocusControl = edtavCuaderno_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42Cuaderno = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Cuaderno", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Cuaderno), 4, 0));
         }
         else
         {
            AV42Cuaderno = (short)(localUtil.ctol( httpContext.cgiGet( edtavCuaderno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Cuaderno", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Cuaderno), 4, 0));
         }
         AV81tb1_dsc = httpContext.cgiGet( edtavTb1_dsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81tb1_dsc", AV81tb1_dsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARANCACA1");
            GX_FocusControl = edtavBarancaca1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7BarAncAca1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarAncAca1), 3, 0));
         }
         else
         {
            AV7BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarAncAca1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARGRAACA");
            GX_FocusControl = edtavBargraaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarGraAca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarGraAca), 4, 0));
         }
         else
         {
            AV12BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarGraAca), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38Clicod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod), 6, 0));
         }
         else
         {
            AV38Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod), 6, 0));
         }
         AV39CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39CliNom", AV39CliNom);
         AV5Artcod = httpContext.cgiGet( edtavArtcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Artcod", AV5Artcod);
         AV6ARtDsc = httpContext.cgiGet( edtavArtdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6ARtDsc", AV6ARtDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcser1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcser1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSER1");
            GX_FocusControl = edtavCcser1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Ccser1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Ccser1", GXutil.str( AV27Ccser1, 1, 0));
         }
         else
         {
            AV27Ccser1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcser1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Ccser1", GXutil.str( AV27Ccser1, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCccno5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCccno5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCCNO5");
            GX_FocusControl = edtavCccno5_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17CCCno5 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CCCno5", GXutil.str( AV17CCCno5, 1, 0));
         }
         else
         {
            AV17CCCno5 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCccno5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CCCno5", GXutil.str( AV17CCCno5, 1, 0));
         }
         AV115Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_124_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid1_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
         if ( nGXsfl_124_idx > 0 )
         {
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARORDLIN");
               GX_FocusControl = edtavBarordlin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV15BarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
            }
            else
            {
               AV15BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
            }
            AV76ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV76ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
            AV77ProDsc = httpContext.cgiGet( edtavProdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV77ProDsc);
            AV46FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV46FasCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
            AV47FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV47FasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTCOD");
               GX_FocusControl = edtavCctcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV28CctCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
            }
            else
            {
               AV28CctCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
            }
            AV31CctDsc = httpContext.cgiGet( edtavCctdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCctdsc_Internalname, AV31CctDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCOPECOD");
               GX_FocusControl = edtavCcopecod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV25CCOpeCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
            }
            else
            {
               AV25CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavErrcontrol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavErrcontrol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vERRCONTROL");
               GX_FocusControl = edtavErrcontrol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV45errControl = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavErrcontrol_Internalname, GXutil.str( AV45errControl, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
            }
            else
            {
               AV45errControl = (byte)(localUtil.ctol( httpContext.cgiGet( edtavErrcontrol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavErrcontrol_Internalname, GXutil.str( AV45errControl, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFASEST");
               GX_FocusControl = edtavBarfasest_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV11BarFasEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
            }
            else
            {
               AV11BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFAS");
               GX_FocusControl = edtavCcfas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV19Ccfas = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
            }
            else
            {
               AV19Ccfas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcfas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOK");
               GX_FocusControl = edtavOk_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV75Ok = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavOk_Internalname, GXutil.str( AV75Ok, 1, 0));
            }
            else
            {
               AV75Ok = (byte)(localUtil.ctol( httpContext.cgiGet( edtavOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavOk_Internalname, GXutil.str( AV75Ok, 1, 0));
            }
            AV107VerResultado = httpContext.cgiGet( edtavVerresultado_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavVerresultado_Internalname, AV107VerResultado);
         }
         nGXsfl_142_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid4_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_142_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_142_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1425( ) ;
         if ( nGXsfl_142_idx > 0 )
         {
            AV29CCTCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCctcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTCodGrid), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCODGRID"+"_"+sGXsfl_142_idx, getSecureSignedToken( sGXsfl_142_idx, localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9")));
            AV32CCTDscGrid = httpContext.cgiGet( edtavCctdscgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCctdscgrid_Internalname, AV32CCTDscGrid);
            AV20CCFchGrid = localUtil.ctod( httpContext.cgiGet( edtavCcfchgrid_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCcfchgrid_Internalname, localUtil.format(AV20CCFchGrid, "99/99/99"));
            AV26CCOpeCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcopecodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCcopecodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCOpeCodGrid), 6, 0));
            AV24CcObsGrid = httpContext.cgiGet( edtavCcobsgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCcobsgrid_Internalname, AV24CcObsGrid);
         }
         nGXsfl_153_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid3_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_153_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_153_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1533( ) ;
         if ( nGXsfl_153_idx > 0 )
         {
            AV34CCTLinGrid = (short)(localUtil.ctol( httpContext.cgiGet( edtavCctlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCctlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTLinGrid), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9")));
            AV33CCTLinDscGrid = httpContext.cgiGet( edtavCctlindscgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCctlindscgrid_Internalname, AV33CCTLinDscGrid);
            AV23CCMetodoGrid = httpContext.cgiGet( edtavCcmetodogrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCcmetodogrid_Internalname, AV23CCMetodoGrid);
            AV18CCEspecifGrid = httpContext.cgiGet( edtavCcespecifgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCcespecifgrid_Internalname, AV18CCEspecifGrid);
            AV37CCValGrid = httpContext.cgiGet( edtavCcvalgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCcvalgrid_Internalname, AV37CCValGrid);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCVALGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, GXutil.rtrim( localUtil.format( AV37CCValGrid, ""))));
            AV104CCTValGrid = httpContext.cgiGet( edtavCctvalgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCctvalgrid_Internalname, AV104CCTValGrid);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WINCCResultados");
         AV115Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\winccresultados:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e161X62 ();
      if (returnInSub) return;
   }

   public void e161X62( )
   {
      /* Start Routine */
      returnInSub = false ;
      tblTablebutton_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTablebutton_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTablebutton_Visible), 5, 0), true);
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      winccresultados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = AV43EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char4[0] = AV82UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      winccresultados_impl.this.AV43EmprCod = GXv_char2[0] ;
      winccresultados_impl.this.AV44EmprNom = GXv_char3[0] ;
      winccresultados_impl.this.AV82UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      Grid3_empowerer_Gridinternalname = subGrid3_Internalname ;
      ucGrid3_empowerer.sendProperty(context, "", false, Grid3_empowerer_Internalname, "GridInternalName", Grid3_empowerer_Gridinternalname);
      subGrid3_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid4_empowerer_Gridinternalname = subGrid4_Internalname ;
      ucGrid4_empowerer.sendProperty(context, "", false, Grid4_empowerer_Internalname, "GridInternalName", Grid4_empowerer_Gridinternalname);
      subGrid4_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID4_Rows", GXutil.ltrim( localUtil.ntoc( subGrid4_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GXt_char1 = AV51Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV51Lit0 = GXt_char1 ;
      GXt_char1 = AV71LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV71LitFe = GXt_char1 ;
      GXt_char1 = AV62Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV115Pgmname, (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV62Lit2 = GXt_char1 ;
      GXt_char1 = AV64Lit3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV64Lit3 = GXt_char1 ;
      GXt_char1 = AV65Lit4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1022_", ""), (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV65Lit4 = GXt_char1 ;
      GXt_char1 = AV66Lit5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT312_", ""), (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV66Lit5 = GXt_char1 ;
      GXt_char1 = AV67Lit6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV67Lit6 = GXt_char1 ;
      AV82UsurCod = " " ;
      GXt_char1 = AV79Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      winccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV79Station = GXt_char1 ;
      GXv_char4[0] = AV43EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char2[0] = AV82UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char4, GXv_char3, GXv_char2) ;
      winccresultados_impl.this.AV43EmprCod = GXv_char4[0] ;
      winccresultados_impl.this.AV44EmprNom = GXv_char3[0] ;
      winccresultados_impl.this.AV82UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      GXt_int5 = AV40CnoEnc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int6) ;
      winccresultados_impl.this.GXt_int5 = GXv_int6[0] ;
      AV40CnoEnc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40CnoEnc", GXutil.str( AV40CnoEnc, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CnoEnc), "9")));
      GXt_int5 = AV16carvitin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      winccresultados_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16carvitin", GXutil.str( AV16carvitin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16carvitin), "9")));
      GXt_int5 = AV78SoloOperario ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "SOLOOP", ""), GXv_int6) ;
      winccresultados_impl.this.GXt_int5 = GXv_int6[0] ;
      AV78SoloOperario = GXt_int5 ;
      GXt_int5 = AV41CtrlfsLb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "CTRFLB", ""), GXv_int6) ;
      winccresultados_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41CtrlfsLb = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41CtrlfsLb", GXutil.str( AV41CtrlfsLb, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLFSLB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41CtrlfsLb), "9")));
      subGrid1_Allowselection = (byte)(1) ;
      subGrid4_Allowselection = (byte)(1) ;
      subGrid3_Allowselection = (byte)(1) ;
   }

   public void e171X62( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S112 ();
      if (returnInSub) return;
      edtavBarordlin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Columnheaderclass", edtavBarordlin_Columnheaderclass, !bGXsfl_124_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e181X62( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV107VerResultado = "<i class=\"fas fa-diagnoses\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavVerresultado_Internalname, AV107VerResultado);
      if ( AV25CCOpeCod == 0 )
      {
         edtavVerresultado_Class = "Attribute" ;
      }
      else
      {
         edtavVerresultado_Class = "Invisible" ;
      }
      edtavBarordlin_Columnclass = ((AV45errControl==1) ? "WWColumn WWColumnTag WWColumnTagDanger WWColumnTagDangerSingleCell" : "WWColumn") ;
      /* Using cursor H01X62 */
      pr_default.execute(0, new Object[] {AV43EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = H01X62_A130BarCodPar[0] ;
         A132BarCodReo = H01X62_A132BarCodReo[0] ;
         A129BarCod = H01X62_A129BarCod[0] ;
         A396EmprCod = H01X62_A396EmprCod[0] ;
         A457FasCod = H01X62_A457FasCod[0] ;
         A460FasDsc = H01X62_A460FasDsc[0] ;
         A759ProDsc = H01X62_A759ProDsc[0] ;
         A153BarFasEst = H01X62_A153BarFasEst[0] ;
         A194BarOrdLin = H01X62_A194BarOrdLin[0] ;
         A758ProCod = H01X62_A758ProCod[0] ;
         A460FasDsc = H01X62_A460FasDsc[0] ;
         A759ProDsc = H01X62_A759ProDsc[0] ;
         AV15BarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
         AV46FasCod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV46FasCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
         AV47FasDsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV47FasDsc);
         AV76ProCod = A758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV76ProCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
         AV77ProDsc = A759ProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV77ProDsc);
         AV11BarFasEst = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
         /* Execute user subroutine: 'CCFAS' */
         S137 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV15BarOrdLin = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
         AV46FasCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV46FasCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
         AV47FasDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV47FasDsc);
         AV76ProCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV76ProCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
         AV77ProDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV77ProDsc);
         AV28CctCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
         AV31CctDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctdsc_Internalname, AV31CctDsc);
         AV19Ccfas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
         AV45errControl = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavErrcontrol_Internalname, GXutil.str( AV45errControl, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
         AV25CCOpeCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
         AV11BarFasEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
         AV72LoadBarcad = (byte)(1) ;
         tblTablebutton_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTablebutton_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTablebutton_Visible), 5, 0), true);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
   }

   public void e121X62( )
   {
      /* 'DoBTN_PIDArtigo' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV43EmprCod ;
      GXv_int7[0] = AV8BarcodIN ;
      GXv_int6[0] = AV10BarcodreoIN ;
      GXv_char3[0] = AV9BarCodParIn ;
      GXv_int8[0] = AV15BarOrdLin ;
      GXv_int9[0] = (byte)(3) ;
      new app.pidartigo(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8, GXv_int9) ;
      winccresultados_impl.this.AV43EmprCod = GXv_char4[0] ;
      winccresultados_impl.this.AV8BarcodIN = GXv_int7[0] ;
      winccresultados_impl.this.AV10BarcodreoIN = GXv_int6[0] ;
      winccresultados_impl.this.AV9BarCodParIn = GXv_char3[0] ;
      winccresultados_impl.this.AV15BarOrdLin = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarcodIN), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarcodreoIN", GXutil.str( AV10BarcodreoIN, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodParIn", AV9BarCodParIn);
      httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e131X62( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV43EmprCod ;
      GXv_int7[0] = AV8BarcodIN ;
      GXv_int9[0] = AV10BarcodreoIN ;
      GXv_char3[0] = AV9BarCodParIn ;
      new app.pficcontinuidadcolor(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int9, GXv_char3) ;
      winccresultados_impl.this.AV43EmprCod = GXv_char4[0] ;
      winccresultados_impl.this.AV8BarcodIN = GXv_int7[0] ;
      winccresultados_impl.this.AV10BarcodreoIN = GXv_int9[0] ;
      winccresultados_impl.this.AV9BarCodParIn = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarcodIN), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarcodreoIN", GXutil.str( AV10BarcodreoIN, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodParIn", AV9BarCodParIn);
      /*  Sending Event outputs  */
   }

   public void e141X62( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV72LoadBarcad = (byte)(0) ;
      AV80Tabla_Barcad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Tabla_Barcad", GXutil.str( AV80Tabla_Barcad, 1, 0));
      /* Using cursor H01X64 */
      pr_default.execute(1, new Object[] {AV43EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = H01X64_A130BarCodPar[0] ;
         A132BarCodReo = H01X64_A132BarCodReo[0] ;
         A129BarCod = H01X64_A129BarCod[0] ;
         A396EmprCod = H01X64_A396EmprCod[0] ;
         A252CliCod = H01X64_A252CliCod[0] ;
         n252CliCod = H01X64_n252CliCod[0] ;
         A279CliNom = H01X64_A279CliNom[0] ;
         A212BarSer = H01X64_A212BarSer[0] ;
         A1652BarSerDsc = H01X64_A1652BarSerDsc[0] ;
         A125BarAncAca1 = H01X64_A125BarAncAca1[0] ;
         A1909BarGraAca = H01X64_A1909BarGraAca[0] ;
         A135BarColNom = H01X64_A135BarColNom[0] ;
         A136BarColNum = H01X64_A136BarColNum[0] ;
         A4466BarAcaAnh = H01X64_A4466BarAcaAnh[0] ;
         A166BarKgm = H01X64_A166BarKgm[0] ;
         A184BarMtr = H01X64_A184BarMtr[0] ;
         A166BarKgm = H01X64_A166BarKgm[0] ;
         A184BarMtr = H01X64_A184BarMtr[0] ;
         A279CliNom = H01X64_A279CliNom[0] ;
         AV13Barkgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Barkgm", GXutil.ltrimstr( AV13Barkgm, 9, 2));
         AV14BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarMtr", GXutil.ltrimstr( AV14BarMtr, 9, 2));
         AV80Tabla_Barcad = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Tabla_Barcad", GXutil.str( AV80Tabla_Barcad, 1, 0));
         AV38Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod), 6, 0));
         AV39CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39CliNom", AV39CliNom);
         AV5Artcod = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Artcod", AV5Artcod);
         AV6ARtDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6ARtDsc", AV6ARtDsc);
         AV7BarAncAca1 = A125BarAncAca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarAncAca1), 3, 0));
         AV12BarGraAca = A1909BarGraAca ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarGraAca), 4, 0));
         AV21CCFColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21CCFColNom", AV21CCFColNom);
         AV22CCFColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CCFColNum), 6, 0));
         AV42Cuaderno = A4466BarAcaAnh ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cuaderno", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Cuaderno), 4, 0));
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A4466BarAcaAnh ;
         GXv_char3[0] = AV81tb1_dsc ;
         new app.pptable1(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         winccresultados_impl.this.A396EmprCod = GXv_char4[0] ;
         winccresultados_impl.this.A4466BarAcaAnh = GXv_int8[0] ;
         winccresultados_impl.this.AV81tb1_dsc = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV81tb1_dsc", AV81tb1_dsc);
         AV81tb1_dsc = ((AV42Cuaderno>0) ? AV81tb1_dsc : " ") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81tb1_dsc", AV81tb1_dsc);
         /* Execute user subroutine: 'CCSER1' */
         S148 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( AV40CnoEnc == 1 )
         {
            /* Execute user subroutine: 'CCCNO5' */
            S158 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( (0==AV80Tabla_Barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Codigo", ""));
         GX_FocusControl = edtavBarcodin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV13Barkgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14BarMtr)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta HDR, NO tiene kilos/metros ¡", ""));
      }
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      gxgrgrid1_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, AV25CCOpeCod, AV45errControl, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, A457FasCod, A460FasDsc, A759ProDsc, A153BarFasEst, A4031CCTCod, AV46FasCod, A4036CCTDsc, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV17CCCno5, AV27Ccser1, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4032CCOpeCod, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      /*  Sending Event outputs  */
   }

   public void e151X62( )
   {
      /* 'DoBtnCopiarResultado' Routine */
      returnInSub = false ;
      if ( ( AV80Tabla_Barcad == 1 ) && ( AV15BarOrdLin > 0 ) && ( AV28CctCod > 0 ) )
      {
         GXt_int5 = AV48flag ;
         GXv_int9[0] = GXt_int5 ;
         new app.controlcalidadhtd.cpcc01(remoteHandle, context).execute( AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, GXv_int9) ;
         winccresultados_impl.this.GXt_int5 = GXv_int9[0] ;
         AV48flag = GXt_int5 ;
         if ( AV48flag == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. há resultados¡", ""));
         }
         else
         {
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ( AV16carvitin == 1 ) ) )
      {
         bttBtnuseraction1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnuseraction1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnuseraction1_Visible), 5, 0), true);
      }
   }

   public void e191X62( )
   {
      /* Barordlin_Click Routine */
      returnInSub = false ;
      gxgrgrid3_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4034CCTLin, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV29CCTCodGrid, A4043CCTLinDsc, A13252CCEspecif, A13251CCMetodo, A4048CCTLinTpoI, A4035CCVal, A4049CCTValLin, AV28CctCod, AV34CCTLinGrid, A4051CCTVal, AV37CCValGrid, A4050CCTValDsc, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(153) ;
      }
      if ( ( subGrid3_Islastpage == 1 ) || ( subGrid3_Rows == 0 ) || ( ( GRID3_nCurrentRecord >= GRID3_nFirstRecordOnPage ) && ( GRID3_nCurrentRecord < GRID3_nFirstRecordOnPage + subgrid3_fnc_recordsperpage( ) ) ) )
      {
         sendrow_1533( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_153_Refreshing )
      {
         httpContext.doAjaxLoad(153, Grid3Row);
      }
      gxgrgrid4_refresh( subGrid1_Rows, subGrid4_Rows, subGrid3_Rows, AV16carvitin, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, AV43EmprCod, AV8BarcodIN, AV10BarcodreoIN, AV9BarCodParIn, AV76ProCod, AV15BarOrdLin, AV28CctCod, A4036CCTDsc, A4032CCOpeCod, A4033CCFch, A3281CcObs, AV40CnoEnc, AV41CtrlfsLb, AV115Pgmname) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(142) ;
      }
      if ( ( subGrid4_Islastpage == 1 ) || ( subGrid4_Rows == 0 ) || ( ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage ) && ( GRID4_nCurrentRecord < GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) ) ) )
      {
         sendrow_1425( ) ;
         GRID4_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid4_Islastpage == 1 ) && ( ((int)((GRID4_nCurrentRecord) % (subgrid4_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID4_nFirstRecordOnPage = GRID4_nCurrentRecord ;
         }
      }
      if ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) )
      {
         GRID4_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID4_nCurrentRecord = (long)(GRID4_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_142_Refreshing )
      {
         httpContext.doAjaxLoad(142, Grid4Row);
      }
      /*  Sending Event outputs  */
   }

   public void S137( )
   {
      /* 'CCFAS' Routine */
      returnInSub = false ;
      AV28CctCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
      AV31CctDsc = " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCctdsc_Internalname, AV31CctDsc);
      AV19Ccfas = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
      AV25CCOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
      /* Using cursor H01X65 */
      pr_default.execute(2, new Object[] {AV43EmprCod, AV46FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = H01X65_A457FasCod[0] ;
         A396EmprCod = H01X65_A396EmprCod[0] ;
         A4036CCTDsc = H01X65_A4036CCTDsc[0] ;
         A4031CCTCod = H01X65_A4031CCTCod[0] ;
         A4036CCTDsc = H01X65_A4036CCTDsc[0] ;
         AV28CctCod = A4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28CctCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")));
         AV31CctDsc = A4036CCTDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctdsc_Internalname, AV31CctDsc);
         AV19Ccfas = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcfas_Internalname, GXutil.str( AV19Ccfas, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFAS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")));
         /* Execute user subroutine: 'OPERARIO' */
         S169 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(124) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1242( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_124_Refreshing )
         {
            httpContext.doAjaxLoad(124, Grid1Row);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV19Ccfas == 0 )
      {
         AV15BarOrdLin = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarOrdLin), 4, 0));
         AV46FasCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV46FasCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV46FasCod, "@!"))));
         AV47FasDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV47FasDsc);
         AV76ProCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV76ProCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV76ProCod, ""))));
         AV77ProDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV77ProDsc);
         AV11BarFasEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV11BarFasEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASEST"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")));
      }
      AV30Cctcodout = AV28CctCod ;
      GXv_int9[0] = AV45errControl ;
      new app.pprc251(remoteHandle, context).execute( AV43EmprCod, AV38Clicod, AV5Artcod, AV21CCFColNom, AV22CCFColNum, AV42Cuaderno, AV30Cctcodout, AV17CCCno5, AV27Ccser1, GXv_int9) ;
      winccresultados_impl.this.AV45errControl = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavErrcontrol_Internalname, GXutil.str( AV45errControl, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRCONTROL"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")));
   }

   public void S169( )
   {
      /* 'OPERARIO' Routine */
      returnInSub = false ;
      AV25CCOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
      /* Using cursor H01X66 */
      pr_default.execute(3, new Object[] {AV43EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn, AV76ProCod, Short.valueOf(AV15BarOrdLin), Integer.valueOf(AV28CctCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4031CCTCod = H01X66_A4031CCTCod[0] ;
         A194BarOrdLin = H01X66_A194BarOrdLin[0] ;
         A758ProCod = H01X66_A758ProCod[0] ;
         A130BarCodPar = H01X66_A130BarCodPar[0] ;
         A132BarCodReo = H01X66_A132BarCodReo[0] ;
         A129BarCod = H01X66_A129BarCod[0] ;
         A396EmprCod = H01X66_A396EmprCod[0] ;
         A4032CCOpeCod = H01X66_A4032CCOpeCod[0] ;
         n4032CCOpeCod = H01X66_n4032CCOpeCod[0] ;
         AV25CCOpeCod = A4032CCOpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcopecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CCOpeCod), 6, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S148( )
   {
      /* 'CCSER1' Routine */
      returnInSub = false ;
      AV27Ccser1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Ccser1", GXutil.str( AV27Ccser1, 1, 0));
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV5Artcod ,
                                           AV21CCFColNom ,
                                           Integer.valueOf(AV22CCFColNum) ,
                                           A65ArtCod ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV38Clicod) ,
                                           AV43EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor H01X67 */
      pr_default.execute(4, new Object[] {AV43EmprCod, Integer.valueOf(AV38Clicod), AV5Artcod, AV21CCFColNom, Integer.valueOf(AV22CCFColNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4059CCFColNum = H01X67_A4059CCFColNum[0] ;
         A4058CCFColNom = H01X67_A4058CCFColNom[0] ;
         A65ArtCod = H01X67_A65ArtCod[0] ;
         A252CliCod = H01X67_A252CliCod[0] ;
         n252CliCod = H01X67_n252CliCod[0] ;
         A396EmprCod = H01X67_A396EmprCod[0] ;
         A4031CCTCod = H01X67_A4031CCTCod[0] ;
         AV27Ccser1 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Ccser1", GXutil.str( AV27Ccser1, 1, 0));
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S158( )
   {
      /* 'CCCNO5' Routine */
      returnInSub = false ;
      AV17CCCno5 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCCno5", GXutil.str( AV17CCCno5, 1, 0));
      /* Using cursor H01X68 */
      pr_default.execute(5, new Object[] {AV43EmprCod, Integer.valueOf(AV38Clicod), Short.valueOf(AV42Cuaderno)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A9713Tb1_Cod = H01X68_A9713Tb1_Cod[0] ;
         A252CliCod = H01X68_A252CliCod[0] ;
         n252CliCod = H01X68_n252CliCod[0] ;
         A396EmprCod = H01X68_A396EmprCod[0] ;
         A4031CCTCod = H01X68_A4031CCTCod[0] ;
         A11750IntId = H01X68_A11750IntId[0] ;
         A11749CCCTc = H01X68_A11749CCCTc[0] ;
         A11738CCColNum = H01X68_A11738CCColNum[0] ;
         A11737CCColNom = H01X68_A11737CCColNom[0] ;
         A11748TipArtiId = H01X68_A11748TipArtiId[0] ;
         A11736CCArtCod = H01X68_A11736CCArtCod[0] ;
         AV17CCCno5 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17CCCno5", GXutil.str( AV17CCCno5, 1, 0));
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S124( )
   {
      /* 'CCDEF2' Routine */
      returnInSub = false ;
      AV36CCTValDsc = " " ;
      /* Using cursor H01X69 */
      pr_default.execute(6, new Object[] {AV43EmprCod, Integer.valueOf(AV28CctCod), Short.valueOf(AV34CCTLinGrid), AV37CCValGrid});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4051CCTVal = H01X69_A4051CCTVal[0] ;
         A4034CCTLin = H01X69_A4034CCTLin[0] ;
         A4031CCTCod = H01X69_A4031CCTCod[0] ;
         A396EmprCod = H01X69_A396EmprCod[0] ;
         A4050CCTValDsc = H01X69_A4050CCTValDsc[0] ;
         A4049CCTValLin = H01X69_A4049CCTValLin[0] ;
         AV36CCTValDsc = A4050CCTValDsc ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   private void e211X63( )
   {
      /* Grid3_Load Routine */
      returnInSub = false ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV76ProCod ,
                                           Integer.valueOf(AV29CCTCodGrid) ,
                                           A758ProCod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV15BarOrdLin) ,
                                           AV43EmprCod ,
                                           Integer.valueOf(AV8BarcodIN) ,
                                           Byte.valueOf(AV10BarcodreoIN) ,
                                           AV9BarCodParIn ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01X610 */
      pr_default.execute(7, new Object[] {AV43EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn, Short.valueOf(AV15BarOrdLin), AV76ProCod, Integer.valueOf(AV29CCTCodGrid)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A4031CCTCod = H01X610_A4031CCTCod[0] ;
         A194BarOrdLin = H01X610_A194BarOrdLin[0] ;
         A758ProCod = H01X610_A758ProCod[0] ;
         A130BarCodPar = H01X610_A130BarCodPar[0] ;
         A132BarCodReo = H01X610_A132BarCodReo[0] ;
         A129BarCod = H01X610_A129BarCod[0] ;
         A396EmprCod = H01X610_A396EmprCod[0] ;
         A4043CCTLinDsc = H01X610_A4043CCTLinDsc[0] ;
         A13252CCEspecif = H01X610_A13252CCEspecif[0] ;
         A13251CCMetodo = H01X610_A13251CCMetodo[0] ;
         A4048CCTLinTpoI = H01X610_A4048CCTLinTpoI[0] ;
         A4035CCVal = H01X610_A4035CCVal[0] ;
         A4034CCTLin = H01X610_A4034CCTLin[0] ;
         A4043CCTLinDsc = H01X610_A4043CCTLinDsc[0] ;
         A4048CCTLinTpoI = H01X610_A4048CCTLinTpoI[0] ;
         AV33CCTLinDscGrid = A4043CCTLinDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctlindscgrid_Internalname, AV33CCTLinDscGrid);
         AV34CCTLinGrid = A4034CCTLin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTLinGrid), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9")));
         AV18CCEspecifGrid = A13252CCEspecif ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcespecifgrid_Internalname, AV18CCEspecifGrid);
         AV23CCMetodoGrid = A13251CCMetodo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcmetodogrid_Internalname, AV23CCMetodoGrid);
         AV35CCTLinTpoIng = A4048CCTLinTpoI ;
         AV37CCValGrid = A4035CCVal ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcvalgrid_Internalname, AV37CCValGrid);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCVALGRID"+"_"+sGXsfl_153_idx, getSecureSignedToken( sGXsfl_153_idx, GXutil.rtrim( localUtil.format( AV37CCValGrid, ""))));
         AV36CCTValDsc = " " ;
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "L", "")) == 0 ) && ( GXutil.strcmp(AV37CCValGrid, " ") != 0 ) )
         {
            /* Execute user subroutine: 'CCDEF2' */
            S124 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(7);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(153) ;
         }
         if ( ( subGrid3_Islastpage == 1 ) || ( subGrid3_Rows == 0 ) || ( ( GRID3_nCurrentRecord >= GRID3_nFirstRecordOnPage ) && ( GRID3_nCurrentRecord < GRID3_nFirstRecordOnPage + subgrid3_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1533( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_153_Refreshing )
         {
            httpContext.doAjaxLoad(153, Grid3Row);
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      /*  Sending Event outputs  */
   }

   private void e201X65( )
   {
      /* Grid4_Load Routine */
      returnInSub = false ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV76ProCod ,
                                           Integer.valueOf(AV28CctCod) ,
                                           A758ProCod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV15BarOrdLin) ,
                                           AV43EmprCod ,
                                           Integer.valueOf(AV8BarcodIN) ,
                                           Byte.valueOf(AV10BarcodreoIN) ,
                                           AV9BarCodParIn ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01X611 */
      pr_default.execute(8, new Object[] {AV43EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn, Short.valueOf(AV15BarOrdLin), AV76ProCod, Integer.valueOf(AV28CctCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4031CCTCod = H01X611_A4031CCTCod[0] ;
         A194BarOrdLin = H01X611_A194BarOrdLin[0] ;
         A758ProCod = H01X611_A758ProCod[0] ;
         A130BarCodPar = H01X611_A130BarCodPar[0] ;
         A132BarCodReo = H01X611_A132BarCodReo[0] ;
         A129BarCod = H01X611_A129BarCod[0] ;
         A396EmprCod = H01X611_A396EmprCod[0] ;
         A4036CCTDsc = H01X611_A4036CCTDsc[0] ;
         A4032CCOpeCod = H01X611_A4032CCOpeCod[0] ;
         n4032CCOpeCod = H01X611_n4032CCOpeCod[0] ;
         A4033CCFch = H01X611_A4033CCFch[0] ;
         n4033CCFch = H01X611_n4033CCFch[0] ;
         A3281CcObs = H01X611_A3281CcObs[0] ;
         n3281CcObs = H01X611_n3281CcObs[0] ;
         A4036CCTDsc = H01X611_A4036CCTDsc[0] ;
         AV29CCTCodGrid = A4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTCodGrid), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCODGRID"+"_"+sGXsfl_142_idx, getSecureSignedToken( sGXsfl_142_idx, localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9")));
         AV32CCTDscGrid = A4036CCTDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCctdscgrid_Internalname, AV32CCTDscGrid);
         AV26CCOpeCodGrid = A4032CCOpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcopecodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCOpeCodGrid), 6, 0));
         AV20CCFchGrid = A4033CCFch ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcfchgrid_Internalname, localUtil.format(AV20CCFchGrid, "99/99/99"));
         AV24CcObsGrid = A3281CcObs ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCcobsgrid_Internalname, AV24CcObsGrid);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(142) ;
         }
         if ( ( subGrid4_Islastpage == 1 ) || ( subGrid4_Rows == 0 ) || ( ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage ) && ( GRID4_nCurrentRecord < GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1425( ) ;
            GRID4_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid4_Islastpage == 1 ) && ( ((int)((GRID4_nCurrentRecord) % (subgrid4_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID4_nFirstRecordOnPage = GRID4_nCurrentRecord ;
            }
         }
         if ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) )
         {
            GRID4_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID4_nCurrentRecord = (long)(GRID4_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_142_Refreshing )
         {
            httpContext.doAjaxLoad(142, Grid4Row);
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      /*  Sending Event outputs  */
   }

   public void wb_table1_110_1X62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTablebutton_Visible == 0 )
         {
            sStyleString += "display:none;" ;
         }
         app.GxWebStd.gx_table_start( httpContext, tblTablebutton_Internalname, tblTablebutton_Internalname, "", "TableAlignRight", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtn_pidartigo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Ficha Amostras", ""), bttBtnbtn_pidartigo_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBTN_PIDARTIGO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Ficha de Continuidade de Cor", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Ficha de Continuidade de Cor", ""), "", StyleString, ClassString, bttBtnuseraction1_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WINCCResultados.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_110_1X62e( true) ;
      }
      else
      {
         wb_table1_110_1X62e( false) ;
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
      pa1X62( ) ;
      ws1X62( ) ;
      we1X62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011134365", true, true);
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
         httpContext.AddJavascriptSource("controlcalidadhtd/winccresultados.js", "?202671011134365", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1242( )
   {
      edtavBarordlin_Internalname = "vBARORDLIN_"+sGXsfl_124_idx ;
      edtavProcod_Internalname = "vPROCOD_"+sGXsfl_124_idx ;
      edtavProdsc_Internalname = "vPRODSC_"+sGXsfl_124_idx ;
      edtavFascod_Internalname = "vFASCOD_"+sGXsfl_124_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_124_idx ;
      edtavCctcod_Internalname = "vCCTCOD_"+sGXsfl_124_idx ;
      edtavCctdsc_Internalname = "vCCTDSC_"+sGXsfl_124_idx ;
      edtavCcopecod_Internalname = "vCCOPECOD_"+sGXsfl_124_idx ;
      edtavErrcontrol_Internalname = "vERRCONTROL_"+sGXsfl_124_idx ;
      edtavBarfasest_Internalname = "vBARFASEST_"+sGXsfl_124_idx ;
      edtavCcfas_Internalname = "vCCFAS_"+sGXsfl_124_idx ;
      edtavOk_Internalname = "vOK_"+sGXsfl_124_idx ;
      edtavVerresultado_Internalname = "vVERRESULTADO_"+sGXsfl_124_idx ;
   }

   public void subsflControlProps_fel_1242( )
   {
      edtavBarordlin_Internalname = "vBARORDLIN_"+sGXsfl_124_fel_idx ;
      edtavProcod_Internalname = "vPROCOD_"+sGXsfl_124_fel_idx ;
      edtavProdsc_Internalname = "vPRODSC_"+sGXsfl_124_fel_idx ;
      edtavFascod_Internalname = "vFASCOD_"+sGXsfl_124_fel_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_124_fel_idx ;
      edtavCctcod_Internalname = "vCCTCOD_"+sGXsfl_124_fel_idx ;
      edtavCctdsc_Internalname = "vCCTDSC_"+sGXsfl_124_fel_idx ;
      edtavCcopecod_Internalname = "vCCOPECOD_"+sGXsfl_124_fel_idx ;
      edtavErrcontrol_Internalname = "vERRCONTROL_"+sGXsfl_124_fel_idx ;
      edtavBarfasest_Internalname = "vBARFASEST_"+sGXsfl_124_fel_idx ;
      edtavCcfas_Internalname = "vCCFAS_"+sGXsfl_124_fel_idx ;
      edtavOk_Internalname = "vOK_"+sGXsfl_124_fel_idx ;
      edtavVerresultado_Internalname = "vVERRESULTADO_"+sGXsfl_124_fel_idx ;
   }

   public void sendrow_1242( )
   {
      subsflControlProps_1242( ) ;
      wb1X60( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_124_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_124_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_124_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarordlin_Enabled!=0)&&(edtavBarordlin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 125,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV15BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15BarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarordlin_Enabled!=0)&&(edtavBarordlin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVBARORDLIN.CLICK."+sGXsfl_124_idx+"'","","","","",edtavBarordlin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavBarordlin_Columnclass,edtavBarordlin_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavBarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProcod_Enabled!=0)&&(edtavProcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 126,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProcod_Internalname,GXutil.rtrim( AV76ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProcod_Enabled!=0)&&(edtavProcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,126);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavProcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProdsc_Enabled!=0)&&(edtavProdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 127,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProdsc_Internalname,GXutil.rtrim( AV77ProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProdsc_Enabled!=0)&&(edtavProdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,127);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavProdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFascod_Enabled!=0)&&(edtavFascod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 128,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFascod_Internalname,GXutil.rtrim( AV46FasCod),GXutil.rtrim( localUtil.format( AV46FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavFascod_Enabled!=0)&&(edtavFascod_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,128);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 129,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV47FasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,129);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCctcod_Enabled!=0)&&(edtavCctcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 130,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV28CctCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28CctCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCctcod_Enabled!=0)&&(edtavCctcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,130);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCctcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCctdsc_Enabled!=0)&&(edtavCctdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 131,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctdsc_Internalname,GXutil.rtrim( AV31CctDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCctdsc_Enabled!=0)&&(edtavCctdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,131);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCctdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcopecod_Enabled!=0)&&(edtavCcopecod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 132,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcopecod_Internalname,GXutil.ltrim( localUtil.ntoc( AV25CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25CCOpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcopecod_Enabled!=0)&&(edtavCcopecod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcopecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcopecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavErrcontrol_Enabled!=0)&&(edtavErrcontrol_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 133,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavErrcontrol_Internalname,GXutil.ltrim( localUtil.ntoc( AV45errControl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavErrcontrol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z") : localUtil.format( DecimalUtil.doubleToDec(AV45errControl), "Z")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavErrcontrol_Enabled!=0)&&(edtavErrcontrol_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavErrcontrol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavErrcontrol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfasest_Enabled!=0)&&(edtavBarfasest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 134,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasest_Internalname,GXutil.ltrim( localUtil.ntoc( AV11BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfasest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(AV11BarFasEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarfasest_Enabled!=0)&&(edtavBarfasest_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarfasest_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcfas_Enabled!=0)&&(edtavCcfas_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 135,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcfas_Internalname,GXutil.ltrim( localUtil.ntoc( AV19Ccfas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcfas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z") : localUtil.format( DecimalUtil.doubleToDec(AV19Ccfas), "Z")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcfas_Enabled!=0)&&(edtavCcfas_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcfas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcfas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOk_Enabled!=0)&&(edtavOk_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 136,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOk_Internalname,GXutil.ltrim( localUtil.ntoc( AV75Ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOk_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV75Ok), "9") : localUtil.format( DecimalUtil.doubleToDec(AV75Ok), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavOk_Enabled!=0)&&(edtavOk_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavOk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavOk_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavVerresultado_Enabled!=0)&&(edtavVerresultado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 137,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = edtavVerresultado_Class ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVerresultado_Internalname,GXutil.rtrim( AV107VerResultado),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavVerresultado_Enabled!=0)&&(edtavVerresultado_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,137);\"" : " "),"'"+""+"'"+",false,"+"'"+"e221x62_client"+"'","","",httpContext.getMessage( "Resultados", ""),"",edtavVerresultado_Jsonclick,Integer.valueOf(7),edtavVerresultado_Class,"",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavVerresultado_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1X62( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_124_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      /* End function sendrow_1242 */
   }

   public void subsflControlProps_1425( )
   {
      edtavCctcodgrid_Internalname = "vCCTCODGRID_"+sGXsfl_142_idx ;
      edtavCctdscgrid_Internalname = "vCCTDSCGRID_"+sGXsfl_142_idx ;
      edtavCcfchgrid_Internalname = "vCCFCHGRID_"+sGXsfl_142_idx ;
      edtavCcopecodgrid_Internalname = "vCCOPECODGRID_"+sGXsfl_142_idx ;
      edtavCcobsgrid_Internalname = "vCCOBSGRID_"+sGXsfl_142_idx ;
   }

   public void subsflControlProps_fel_1425( )
   {
      edtavCctcodgrid_Internalname = "vCCTCODGRID_"+sGXsfl_142_fel_idx ;
      edtavCctdscgrid_Internalname = "vCCTDSCGRID_"+sGXsfl_142_fel_idx ;
      edtavCcfchgrid_Internalname = "vCCFCHGRID_"+sGXsfl_142_fel_idx ;
      edtavCcopecodgrid_Internalname = "vCCOPECODGRID_"+sGXsfl_142_fel_idx ;
      edtavCcobsgrid_Internalname = "vCCOBSGRID_"+sGXsfl_142_fel_idx ;
   }

   public void sendrow_1425( )
   {
      subsflControlProps_1425( ) ;
      wb1X60( ) ;
      if ( ( subGrid4_Rows * 1 == 0 ) || ( nGXsfl_142_idx <= subgrid4_fnc_recordsperpage( ) * 1 ) )
      {
         Grid4Row = GXWebRow.GetNew(context,Grid4Container) ;
         if ( subGrid4_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid4_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
         }
         else if ( subGrid4_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid4_Backstyle = (byte)(0) ;
            subGrid4_Backcolor = subGrid4_Allbackcolor ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Uniform" ;
            }
         }
         else if ( subGrid4_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid4_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
            subGrid4_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid4_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid4_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_142_idx) % (2))) == 0 )
            {
               subGrid4_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Even" ;
               }
            }
            else
            {
               subGrid4_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Odd" ;
               }
            }
         }
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_142_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctcodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV29CCTCodGrid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCctcodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29CCTCodGrid), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctcodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCctcodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(142),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctdscgrid_Internalname,GXutil.rtrim( AV32CCTDscGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctdscgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCctdscgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(142),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcfchgrid_Internalname,localUtil.format(AV20CCFchGrid, "99/99/99"),localUtil.format( AV20CCFchGrid, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcfchgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcfchgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(142),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcopecodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV26CCOpeCodGrid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcopecodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26CCOpeCodGrid), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26CCOpeCodGrid), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcopecodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcopecodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(142),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcobsgrid_Internalname,AV24CcObsGrid,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcobsgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcobsgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(142),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1X65( ) ;
         Grid4Container.AddRow(Grid4Row);
         nGXsfl_142_idx = ((subGrid4_Islastpage==1)&&(nGXsfl_142_idx+1>subgrid4_fnc_recordsperpage( )) ? 1 : nGXsfl_142_idx+1) ;
         sGXsfl_142_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_142_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1425( ) ;
      }
      /* End function sendrow_1425 */
   }

   public void subsflControlProps_1533( )
   {
      edtavCctlingrid_Internalname = "vCCTLINGRID_"+sGXsfl_153_idx ;
      edtavCctlindscgrid_Internalname = "vCCTLINDSCGRID_"+sGXsfl_153_idx ;
      edtavCcmetodogrid_Internalname = "vCCMETODOGRID_"+sGXsfl_153_idx ;
      edtavCcespecifgrid_Internalname = "vCCESPECIFGRID_"+sGXsfl_153_idx ;
      edtavCcvalgrid_Internalname = "vCCVALGRID_"+sGXsfl_153_idx ;
      edtavCctvalgrid_Internalname = "vCCTVALGRID_"+sGXsfl_153_idx ;
   }

   public void subsflControlProps_fel_1533( )
   {
      edtavCctlingrid_Internalname = "vCCTLINGRID_"+sGXsfl_153_fel_idx ;
      edtavCctlindscgrid_Internalname = "vCCTLINDSCGRID_"+sGXsfl_153_fel_idx ;
      edtavCcmetodogrid_Internalname = "vCCMETODOGRID_"+sGXsfl_153_fel_idx ;
      edtavCcespecifgrid_Internalname = "vCCESPECIFGRID_"+sGXsfl_153_fel_idx ;
      edtavCcvalgrid_Internalname = "vCCVALGRID_"+sGXsfl_153_fel_idx ;
      edtavCctvalgrid_Internalname = "vCCTVALGRID_"+sGXsfl_153_fel_idx ;
   }

   public void sendrow_1533( )
   {
      subsflControlProps_1533( ) ;
      wb1X60( ) ;
      if ( ( subGrid3_Rows * 1 == 0 ) || ( nGXsfl_153_idx <= subgrid3_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_153_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_153_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctlingrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV34CCTLinGrid, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCctlingrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34CCTLinGrid), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctlingrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCctlingrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(153),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctlindscgrid_Internalname,GXutil.rtrim( AV33CCTLinDscGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctlindscgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCctlindscgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(153),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcmetodogrid_Internalname,GXutil.rtrim( AV23CCMetodoGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcmetodogrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcmetodogrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(153),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcespecifgrid_Internalname,GXutil.rtrim( AV18CCEspecifGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcespecifgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcespecifgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(153),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcvalgrid_Internalname,GXutil.rtrim( AV37CCValGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcvalgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcvalgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(153),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCctvalgrid_Internalname,GXutil.rtrim( AV104CCTValGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCctvalgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCctvalgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(153),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1X63( ) ;
         Grid3Container.AddRow(Grid3Row);
         nGXsfl_153_idx = ((subGrid3_Islastpage==1)&&(nGXsfl_153_idx+1>subgrid3_fnc_recordsperpage( )) ? 1 : nGXsfl_153_idx+1) ;
         sGXsfl_153_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_153_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1533( ) ;
      }
      /* End function sendrow_1533 */
   }

   public void startgridcontrol124( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"124\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Processo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavVerresultado_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBarordlin_Columnclass));
         Grid1Column.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBarordlin_Columnheaderclass));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV76ProCod));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV77ProDsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV46FasCod));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV47FasDsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28CctCod, (byte)(6), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV31CctDsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25CCOpeCod, (byte)(6), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcopecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45errControl, (byte)(1), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavErrcontrol_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11BarFasEst, (byte)(1), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasest_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19Ccfas, (byte)(1), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcfas_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75Ok, (byte)(1), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOk_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV107VerResultado));
         Grid1Column.AddObjectProperty("Class", GXutil.rtrim( edtavVerresultado_Class));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVerresultado_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol142( )
   {
      if ( Grid4Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid4Container"+"DivS\" data-gxgridid=\"142\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid4_Internalname, subGrid4_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid4_Backcolorstyle == 0 )
         {
            subGrid4_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid4_Class) > 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Title" ;
            }
         }
         else
         {
            subGrid4_Titlebackstyle = (byte)(1) ;
            if ( subGrid4_Backcolorstyle == 1 )
            {
               subGrid4_Titlebackcolor = subGrid4_Allbackcolor ;
               if ( GXutil.len( subGrid4_Class) > 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid4_Class) > 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción del Test", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid4Container.AddObjectProperty("GridName", "Grid4");
      }
      else
      {
         Grid4Container.AddObjectProperty("GridName", "Grid4");
         Grid4Container.AddObjectProperty("Header", subGrid4_Header);
         Grid4Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("CmpContext", "");
         Grid4Container.AddObjectProperty("InMasterPage", "false");
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV29CCTCodGrid, (byte)(6), (byte)(0), ".", "")));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctcodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.rtrim( AV32CCTDscGrid));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctdscgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", localUtil.format(AV20CCFchGrid, "99/99/99"));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcfchgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26CCOpeCodGrid, (byte)(6), (byte)(0), ".", "")));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcopecodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", AV24CcObsGrid);
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcobsgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol153( )
   {
      if ( Grid3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid3Container"+"DivS\" data-gxgridid=\"153\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metodo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Especificacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Resultado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid3Container.AddObjectProperty("GridName", "Grid3");
      }
      else
      {
         Grid3Container.AddObjectProperty("GridName", "Grid3");
         Grid3Container.AddObjectProperty("Header", subGrid3_Header);
         Grid3Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("CmpContext", "");
         Grid3Container.AddObjectProperty("InMasterPage", "false");
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34CCTLinGrid, (byte)(4), (byte)(0), ".", "")));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctlingrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV33CCTLinDscGrid));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctlindscgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV23CCMetodoGrid));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcmetodogrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV18CCEspecifGrid));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcespecifgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV37CCValGrid));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcvalgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV104CCTValGrid));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCctvalgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void init_default_properties( )
   {
      edtavBarcodin_Internalname = "vBARCODIN" ;
      edtavBarcodreoin_Internalname = "vBARCODREOIN" ;
      edtavBarcodparin_Internalname = "vBARCODPARIN" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      divTablebar_Internalname = "TABLEBAR" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      edtavCuaderno_Internalname = "vCUADERNO" ;
      edtavTb1_dsc_Internalname = "vTB1_DSC" ;
      edtavBarancaca1_Internalname = "vBARANCACA1" ;
      edtavBargraaca_Internalname = "vBARGRAACA" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavArtdsc_Internalname = "vARTDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnbtncopiarresultado_Internalname = "BTNBTNCOPIARRESULTADO" ;
      bttBtnbuttonelement2_Internalname = "BTNBUTTONELEMENT2" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      bttBtnbtn_pidartigo_Internalname = "BTNBTN_PIDARTIGO" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      tblTablebutton_Internalname = "TABLEBUTTON" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      edtavProcod_Internalname = "vPROCOD" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtavCctcod_Internalname = "vCCTCOD" ;
      edtavCctdsc_Internalname = "vCCTDSC" ;
      edtavCcopecod_Internalname = "vCCOPECOD" ;
      edtavErrcontrol_Internalname = "vERRCONTROL" ;
      edtavBarfasest_Internalname = "vBARFASEST" ;
      edtavCcfas_Internalname = "vCCFAS" ;
      edtavOk_Internalname = "vOK" ;
      edtavVerresultado_Internalname = "vVERRESULTADO" ;
      divTablegrid1_Internalname = "TABLEGRID1" ;
      edtavCctcodgrid_Internalname = "vCCTCODGRID" ;
      edtavCctdscgrid_Internalname = "vCCTDSCGRID" ;
      edtavCcfchgrid_Internalname = "vCCFCHGRID" ;
      edtavCcopecodgrid_Internalname = "vCCOPECODGRID" ;
      edtavCcobsgrid_Internalname = "vCCOBSGRID" ;
      divTablegrid4_Internalname = "TABLEGRID4" ;
      edtavCctlingrid_Internalname = "vCCTLINGRID" ;
      edtavCctlindscgrid_Internalname = "vCCTLINDSCGRID" ;
      edtavCcmetodogrid_Internalname = "vCCMETODOGRID" ;
      edtavCcespecifgrid_Internalname = "vCCESPECIFGRID" ;
      edtavCcvalgrid_Internalname = "vCCVALGRID" ;
      edtavCctvalgrid_Internalname = "vCCTVALGRID" ;
      edtavCcser1_Internalname = "vCCSER1" ;
      edtavCccno5_Internalname = "vCCCNO5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontainergrid_Internalname = "TABLECONTAINERGRID" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Grid3_empowerer_Internalname = "GRID3_EMPOWERER" ;
      Grid4_empowerer_Internalname = "GRID4_EMPOWERER" ;
      Grid1_empowerer_Internalname = "GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid4_Internalname = "GRID4" ;
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
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Header = "" ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      subGrid4_Allowhovering = (byte)(-1) ;
      subGrid4_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowhovering = (byte)(-1) ;
      subGrid1_Header = "" ;
      edtavCctvalgrid_Jsonclick = "" ;
      edtavCctvalgrid_Enabled = 0 ;
      edtavCcvalgrid_Jsonclick = "" ;
      edtavCcvalgrid_Enabled = 0 ;
      edtavCcespecifgrid_Jsonclick = "" ;
      edtavCcespecifgrid_Enabled = 0 ;
      edtavCcmetodogrid_Jsonclick = "" ;
      edtavCcmetodogrid_Enabled = 0 ;
      edtavCctlindscgrid_Jsonclick = "" ;
      edtavCctlindscgrid_Enabled = 0 ;
      edtavCctlingrid_Jsonclick = "" ;
      edtavCctlingrid_Enabled = 0 ;
      subGrid3_Class = "GridNoBorder WorkWith" ;
      subGrid3_Backcolorstyle = (byte)(0) ;
      edtavCcobsgrid_Jsonclick = "" ;
      edtavCcobsgrid_Enabled = 0 ;
      edtavCcopecodgrid_Jsonclick = "" ;
      edtavCcopecodgrid_Enabled = 0 ;
      edtavCcfchgrid_Jsonclick = "" ;
      edtavCcfchgrid_Enabled = 0 ;
      edtavCctdscgrid_Jsonclick = "" ;
      edtavCctdscgrid_Enabled = 0 ;
      edtavCctcodgrid_Jsonclick = "" ;
      edtavCctcodgrid_Enabled = 0 ;
      subGrid4_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid4_Backcolorstyle = (byte)(0) ;
      edtavVerresultado_Jsonclick = "" ;
      edtavVerresultado_Class = "Attribute" ;
      edtavVerresultado_Visible = -1 ;
      edtavVerresultado_Enabled = 1 ;
      edtavOk_Jsonclick = "" ;
      edtavOk_Visible = 0 ;
      edtavOk_Enabled = 1 ;
      edtavCcfas_Jsonclick = "" ;
      edtavCcfas_Visible = 0 ;
      edtavCcfas_Enabled = 1 ;
      edtavBarfasest_Jsonclick = "" ;
      edtavBarfasest_Visible = 0 ;
      edtavBarfasest_Enabled = 1 ;
      edtavErrcontrol_Jsonclick = "" ;
      edtavErrcontrol_Visible = 0 ;
      edtavErrcontrol_Enabled = 1 ;
      edtavCcopecod_Jsonclick = "" ;
      edtavCcopecod_Visible = -1 ;
      edtavCcopecod_Enabled = 1 ;
      edtavCctdsc_Jsonclick = "" ;
      edtavCctdsc_Visible = -1 ;
      edtavCctdsc_Enabled = 1 ;
      edtavCctcod_Jsonclick = "" ;
      edtavCctcod_Visible = -1 ;
      edtavCctcod_Enabled = 1 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Visible = -1 ;
      edtavFasdsc_Enabled = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Visible = -1 ;
      edtavFascod_Enabled = 1 ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Visible = -1 ;
      edtavProdsc_Enabled = 1 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Visible = -1 ;
      edtavProcod_Enabled = 1 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Columnclass = "WWColumn" ;
      edtavBarordlin_Visible = -1 ;
      edtavBarordlin_Enabled = 1 ;
      subGrid1_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      bttBtnuseraction1_Visible = 1 ;
      edtavBarordlin_Columnheaderclass = "" ;
      tblTablebutton_Visible = 1 ;
      subGrid3_Allowselection = (byte)(0) ;
      subGrid4_Allowselection = (byte)(1) ;
      subGrid1_Allowselection = (byte)(1) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavCccno5_Jsonclick = "" ;
      edtavCccno5_Enabled = 1 ;
      edtavCcser1_Jsonclick = "" ;
      edtavCcser1_Enabled = 1 ;
      edtavArtdsc_Jsonclick = "" ;
      edtavArtdsc_Enabled = 1 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavBargraaca_Jsonclick = "" ;
      edtavBargraaca_Enabled = 1 ;
      edtavBarancaca1_Jsonclick = "" ;
      edtavBarancaca1_Enabled = 1 ;
      edtavTb1_dsc_Jsonclick = "" ;
      edtavTb1_dsc_Enabled = 1 ;
      edtavCuaderno_Jsonclick = "" ;
      edtavCuaderno_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      edtavBarcodparin_Jsonclick = "" ;
      edtavBarcodparin_Enabled = 1 ;
      edtavBarcodreoin_Jsonclick = "" ;
      edtavBarcodreoin_Enabled = 1 ;
      edtavBarcodin_Jsonclick = "" ;
      edtavBarcodin_Enabled = 1 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada Resultados CCalidad", "") );
      subGrid3_Rows = 0 ;
      subGrid4_Rows = 0 ;
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID3.LOAD","{handler:'e211X63',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''}]");
      setEventMetadata("GRID3.LOAD",",oparms:[{av:'AV33CCTLinDscGrid',fld:'vCCTLINDSCGRID',pic:''},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'AV18CCEspecifGrid',fld:'vCCESPECIFGRID',pic:''},{av:'AV23CCMetodoGrid',fld:'vCCMETODOGRID',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true}]}");
      setEventMetadata("GRID4.LOAD","{handler:'e201X65',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''}]");
      setEventMetadata("GRID4.LOAD",",oparms:[{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'AV32CCTDscGrid',fld:'vCCTDSCGRID',pic:''},{av:'AV26CCOpeCodGrid',fld:'vCCOPECODGRID',pic:'ZZZZZ9'},{av:'AV20CCFchGrid',fld:'vCCFCHGRID',pic:''},{av:'AV24CcObsGrid',fld:'vCCOBSGRID',pic:''}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e181X62',iparms:[{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV107VerResultado',fld:'vVERRESULTADO',pic:''},{av:'edtavVerresultado_Class',ctrl:'vVERRESULTADO',prop:'Class'},{av:'edtavBarordlin_Columnclass',ctrl:'vBARORDLIN',prop:'Columnclass'},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV47FasDsc',fld:'vFASDSC',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV77ProDsc',fld:'vPRODSC',pic:''},{av:'AV11BarFasEst',fld:'vBARFASEST',pic:'9',hsh:true},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV31CctDsc',fld:'vCCTDSC',pic:''},{av:'AV19Ccfas',fld:'vCCFAS',pic:'Z',hsh:true},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'tblTablebutton_Visible',ctrl:'TABLEBUTTON',prop:'Visible'}]}");
      setEventMetadata("'DOBTN_PIDARTIGO'","{handler:'e121X62',iparms:[{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("'DOBTN_PIDARTIGO'",",oparms:[{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e131X62',iparms:[{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e141X62',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'AV81tb1_dsc',fld:'vTB1_DSC',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A11737CCColNom',fld:'CCCOLNOM',pic:''},{av:'A11738CCColNum',fld:'CCCOLNUM',pic:'ZZZZZ9'},{av:'A11749CCCTc',fld:'CCCTC',pic:'Z9'},{av:'A11750IntId',fld:'INTID',pic:'ZZZ9'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV80Tabla_Barcad',fld:'vTABLA_BARCAD',pic:'9'},{av:'AV13Barkgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV14BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39CliNom',fld:'vCLINOM',pic:''},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV6ARtDsc',fld:'vARTDSC',pic:''},{av:'AV7BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV12BarGraAca',fld:'vBARGRAACA',pic:'ZZZ9'},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV81tb1_dsc',fld:'vTB1_DSC',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("'DOBTNCOPIARRESULTADO'","{handler:'e151X62',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80Tabla_Barcad',fld:'vTABLA_BARCAD',pic:'9'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''}]");
      setEventMetadata("'DOBTNCOPIARRESULTADO'",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("'DOBUTTONELEMENT2'","{handler:'e111X61',iparms:[]");
      setEventMetadata("'DOBUTTONELEMENT2'",",oparms:[]}");
      setEventMetadata("VBARORDLIN.CLICK","{handler:'e191X62',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'}]");
      setEventMetadata("VBARORDLIN.CLICK",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("VVERRESULTADO.CLICK","{handler:'e221X62',iparms:[{av:'AV13Barkgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV14BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV19Ccfas',fld:'vCCFAS',pic:'Z',hsh:true},{av:'AV11BarFasEst',fld:'vBARFASEST',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VVERRESULTADO.CLICK",",oparms:[{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'AV25CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9'},{av:'AV45errControl',fld:'vERRCONTROL',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'AV38Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Artcod',fld:'vARTCOD',pic:''},{av:'AV21CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV22CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV42Cuaderno',fld:'vCUADERNO',pic:'ZZZ9'},{av:'AV17CCCno5',fld:'vCCCNO5',pic:'9'},{av:'AV27Ccser1',fld:'vCCSER1',pic:'9'},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID3_FIRSTPAGE","{handler:'subgrid3_firstpage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID3_FIRSTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID3_PREVPAGE","{handler:'subgrid3_previouspage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID3_PREVPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID3_NEXTPAGE","{handler:'subgrid3_nextpage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID3_NEXTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID3_LASTPAGE","{handler:'subgrid3_lastpage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV29CCTCodGrid',fld:'vCCTCODGRID',pic:'ZZZZZ9',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A13252CCEspecif',fld:'CCESPECIF',pic:''},{av:'A13251CCMetodo',fld:'CCMETODO',pic:''},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTLinGrid',fld:'vCCTLINGRID',pic:'ZZZ9',hsh:true},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'AV37CCValGrid',fld:'vCCVALGRID',pic:'',hsh:true},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID3_LASTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID4_FIRSTPAGE","{handler:'subgrid4_firstpage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID4_FIRSTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID4_PREVPAGE","{handler:'subgrid4_previouspage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID4_PREVPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID4_NEXTPAGE","{handler:'subgrid4_nextpage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID4_NEXTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("GRID4_LASTPAGE","{handler:'subgrid4_lastpage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV10BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV9BarCodParIn',fld:'vBARCODPARIN',pic:''},{av:'AV76ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV15BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV28CctCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'AV40CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV41CtrlfsLb',fld:'vCTRLFSLB',pic:'9',hsh:true},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID4_LASTPAGE",",oparms:[{av:'edtavBarordlin_Columnheaderclass',ctrl:'vBARORDLIN',prop:'Columnheaderclass'},{ctrl:'BTNUSERACTION1',prop:'Visible'}]}");
      setEventMetadata("VALIDV_BARCODIN","{handler:'validv_Barcodin',iparms:[]");
      setEventMetadata("VALIDV_BARCODIN",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREOIN","{handler:'validv_Barcodreoin',iparms:[]");
      setEventMetadata("VALIDV_BARCODREOIN",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPARIN","{handler:'validv_Barcodparin',iparms:[]");
      setEventMetadata("VALIDV_BARCODPARIN",",oparms:[]}");
      setEventMetadata("VALIDV_CUADERNO","{handler:'validv_Cuaderno',iparms:[]");
      setEventMetadata("VALIDV_CUADERNO",",oparms:[]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARORDLIN","{handler:'validv_Barordlin',iparms:[]");
      setEventMetadata("VALIDV_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALIDV_PROCOD","{handler:'validv_Procod',iparms:[]");
      setEventMetadata("VALIDV_PROCOD",",oparms:[]}");
      setEventMetadata("VALIDV_FASCOD","{handler:'validv_Fascod',iparms:[]");
      setEventMetadata("VALIDV_FASCOD",",oparms:[]}");
      setEventMetadata("VALIDV_CCTCOD","{handler:'validv_Cctcod',iparms:[]");
      setEventMetadata("VALIDV_CCTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Verresultado',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Ccobsgrid',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALIDV_CCTLINGRID","{handler:'validv_Cctlingrid',iparms:[]");
      setEventMetadata("VALIDV_CCTLINGRID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Cctvalgrid',iparms:[]");
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
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV43EmprCod = "" ;
      AV9BarCodParIn = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A759ProDsc = "" ;
      AV46FasCod = "" ;
      A4036CCTDsc = "" ;
      AV5Artcod = "" ;
      AV21CCFColNom = "" ;
      AV76ProCod = "" ;
      AV115Pgmname = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A3281CcObs = "" ;
      A4043CCTLinDsc = "" ;
      A13252CCEspecif = "" ;
      A13251CCMetodo = "" ;
      A4048CCTLinTpoI = "" ;
      A4035CCVal = "" ;
      A4051CCTVal = "" ;
      AV37CCValGrid = "" ;
      A4050CCTValDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      A11736CCArtCod = "" ;
      A11737CCColNom = "" ;
      Grid3_empowerer_Gridinternalname = "" ;
      Grid4_empowerer_Gridinternalname = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV13Barkgm = DecimalUtil.ZERO ;
      AV14BarMtr = DecimalUtil.ZERO ;
      AV81tb1_dsc = "" ;
      AV39CliNom = "" ;
      AV6ARtDsc = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnbtncopiarresultado_Jsonclick = "" ;
      bttBtnbuttonelement2_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid3_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid4_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV77ProDsc = "" ;
      AV47FasDsc = "" ;
      AV31CctDsc = "" ;
      AV107VerResultado = "" ;
      AV32CCTDscGrid = "" ;
      AV20CCFchGrid = GXutil.nullDate() ;
      AV24CcObsGrid = "" ;
      AV33CCTLinDscGrid = "" ;
      AV23CCMetodoGrid = "" ;
      AV18CCEspecifGrid = "" ;
      AV104CCTValGrid = "" ;
      hsh = "" ;
      AV79Station = "" ;
      AV44EmprNom = "" ;
      AV82UsurCod = "" ;
      AV51Lit0 = "" ;
      AV71LitFe = "" ;
      AV62Lit2 = "" ;
      AV64Lit3 = "" ;
      AV65Lit4 = "" ;
      AV66Lit5 = "" ;
      AV67Lit6 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      H01X62_A130BarCodPar = new String[] {""} ;
      H01X62_A132BarCodReo = new byte[1] ;
      H01X62_A129BarCod = new int[1] ;
      H01X62_A396EmprCod = new String[] {""} ;
      H01X62_A457FasCod = new String[] {""} ;
      H01X62_A460FasDsc = new String[] {""} ;
      H01X62_A759ProDsc = new String[] {""} ;
      H01X62_A153BarFasEst = new byte[1] ;
      H01X62_A194BarOrdLin = new short[1] ;
      H01X62_A758ProCod = new String[] {""} ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      H01X64_A130BarCodPar = new String[] {""} ;
      H01X64_A132BarCodReo = new byte[1] ;
      H01X64_A129BarCod = new int[1] ;
      H01X64_A396EmprCod = new String[] {""} ;
      H01X64_A252CliCod = new int[1] ;
      H01X64_n252CliCod = new boolean[] {false} ;
      H01X64_A279CliNom = new String[] {""} ;
      H01X64_A212BarSer = new String[] {""} ;
      H01X64_A1652BarSerDsc = new String[] {""} ;
      H01X64_A125BarAncAca1 = new short[1] ;
      H01X64_A1909BarGraAca = new short[1] ;
      H01X64_A135BarColNom = new String[] {""} ;
      H01X64_A136BarColNum = new int[1] ;
      H01X64_A4466BarAcaAnh = new short[1] ;
      H01X64_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X64_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char3 = new String[1] ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      H01X65_A457FasCod = new String[] {""} ;
      H01X65_A396EmprCod = new String[] {""} ;
      H01X65_A4036CCTDsc = new String[] {""} ;
      H01X65_A4031CCTCod = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXv_int9 = new byte[1] ;
      H01X66_A4031CCTCod = new int[1] ;
      H01X66_A194BarOrdLin = new short[1] ;
      H01X66_A758ProCod = new String[] {""} ;
      H01X66_A130BarCodPar = new String[] {""} ;
      H01X66_A132BarCodReo = new byte[1] ;
      H01X66_A129BarCod = new int[1] ;
      H01X66_A396EmprCod = new String[] {""} ;
      H01X66_A4032CCOpeCod = new int[1] ;
      H01X66_n4032CCOpeCod = new boolean[] {false} ;
      H01X67_A4059CCFColNum = new int[1] ;
      H01X67_A4058CCFColNom = new String[] {""} ;
      H01X67_A65ArtCod = new String[] {""} ;
      H01X67_A252CliCod = new int[1] ;
      H01X67_n252CliCod = new boolean[] {false} ;
      H01X67_A396EmprCod = new String[] {""} ;
      H01X67_A4031CCTCod = new int[1] ;
      H01X68_A9713Tb1_Cod = new short[1] ;
      H01X68_A252CliCod = new int[1] ;
      H01X68_n252CliCod = new boolean[] {false} ;
      H01X68_A396EmprCod = new String[] {""} ;
      H01X68_A4031CCTCod = new int[1] ;
      H01X68_A11750IntId = new short[1] ;
      H01X68_A11749CCCTc = new byte[1] ;
      H01X68_A11738CCColNum = new int[1] ;
      H01X68_A11737CCColNom = new String[] {""} ;
      H01X68_A11748TipArtiId = new short[1] ;
      H01X68_A11736CCArtCod = new String[] {""} ;
      AV36CCTValDsc = "" ;
      H01X69_A4051CCTVal = new String[] {""} ;
      H01X69_A4034CCTLin = new short[1] ;
      H01X69_A4031CCTCod = new int[1] ;
      H01X69_A396EmprCod = new String[] {""} ;
      H01X69_A4050CCTValDsc = new String[] {""} ;
      H01X69_A4049CCTValLin = new byte[1] ;
      H01X610_A4031CCTCod = new int[1] ;
      H01X610_A194BarOrdLin = new short[1] ;
      H01X610_A758ProCod = new String[] {""} ;
      H01X610_A130BarCodPar = new String[] {""} ;
      H01X610_A132BarCodReo = new byte[1] ;
      H01X610_A129BarCod = new int[1] ;
      H01X610_A396EmprCod = new String[] {""} ;
      H01X610_A4043CCTLinDsc = new String[] {""} ;
      H01X610_A13252CCEspecif = new String[] {""} ;
      H01X610_A13251CCMetodo = new String[] {""} ;
      H01X610_A4048CCTLinTpoI = new String[] {""} ;
      H01X610_A4035CCVal = new String[] {""} ;
      H01X610_A4034CCTLin = new short[1] ;
      AV35CCTLinTpoIng = "" ;
      H01X611_A4031CCTCod = new int[1] ;
      H01X611_A194BarOrdLin = new short[1] ;
      H01X611_A758ProCod = new String[] {""} ;
      H01X611_A130BarCodPar = new String[] {""} ;
      H01X611_A132BarCodReo = new byte[1] ;
      H01X611_A129BarCod = new int[1] ;
      H01X611_A396EmprCod = new String[] {""} ;
      H01X611_A4036CCTDsc = new String[] {""} ;
      H01X611_A4032CCOpeCod = new int[1] ;
      H01X611_n4032CCOpeCod = new boolean[] {false} ;
      H01X611_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01X611_n4033CCFch = new boolean[] {false} ;
      H01X611_A3281CcObs = new String[] {""} ;
      H01X611_n3281CcObs = new boolean[] {false} ;
      bttBtnbtn_pidartigo_Jsonclick = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      subGrid4_Linesclass = "" ;
      subGrid3_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.winccresultados__default(),
         new Object[] {
             new Object[] {
            H01X62_A130BarCodPar, H01X62_A132BarCodReo, H01X62_A129BarCod, H01X62_A396EmprCod, H01X62_A457FasCod, H01X62_A460FasDsc, H01X62_A759ProDsc, H01X62_A153BarFasEst, H01X62_A194BarOrdLin, H01X62_A758ProCod
            }
            , new Object[] {
            H01X64_A130BarCodPar, H01X64_A132BarCodReo, H01X64_A129BarCod, H01X64_A396EmprCod, H01X64_A252CliCod, H01X64_n252CliCod, H01X64_A279CliNom, H01X64_A212BarSer, H01X64_A1652BarSerDsc, H01X64_A125BarAncAca1,
            H01X64_A1909BarGraAca, H01X64_A135BarColNom, H01X64_A136BarColNum, H01X64_A4466BarAcaAnh, H01X64_A166BarKgm, H01X64_A184BarMtr
            }
            , new Object[] {
            H01X65_A457FasCod, H01X65_A396EmprCod, H01X65_A4036CCTDsc, H01X65_A4031CCTCod
            }
            , new Object[] {
            H01X66_A4031CCTCod, H01X66_A194BarOrdLin, H01X66_A758ProCod, H01X66_A130BarCodPar, H01X66_A132BarCodReo, H01X66_A129BarCod, H01X66_A396EmprCod, H01X66_A4032CCOpeCod, H01X66_n4032CCOpeCod
            }
            , new Object[] {
            H01X67_A4059CCFColNum, H01X67_A4058CCFColNom, H01X67_A65ArtCod, H01X67_A252CliCod, H01X67_A396EmprCod, H01X67_A4031CCTCod
            }
            , new Object[] {
            H01X68_A9713Tb1_Cod, H01X68_A252CliCod, H01X68_A396EmprCod, H01X68_A4031CCTCod, H01X68_A11750IntId, H01X68_A11749CCCTc, H01X68_A11738CCColNum, H01X68_A11737CCColNom, H01X68_A11748TipArtiId, H01X68_A11736CCArtCod
            }
            , new Object[] {
            H01X69_A4051CCTVal, H01X69_A4034CCTLin, H01X69_A4031CCTCod, H01X69_A396EmprCod, H01X69_A4050CCTValDsc, H01X69_A4049CCTValLin
            }
            , new Object[] {
            H01X610_A4031CCTCod, H01X610_A194BarOrdLin, H01X610_A758ProCod, H01X610_A130BarCodPar, H01X610_A132BarCodReo, H01X610_A129BarCod, H01X610_A396EmprCod, H01X610_A4043CCTLinDsc, H01X610_A13252CCEspecif, H01X610_A13251CCMetodo,
            H01X610_A4048CCTLinTpoI, H01X610_A4035CCVal, H01X610_A4034CCTLin
            }
            , new Object[] {
            H01X611_A4031CCTCod, H01X611_A194BarOrdLin, H01X611_A758ProCod, H01X611_A130BarCodPar, H01X611_A132BarCodReo, H01X611_A129BarCod, H01X611_A396EmprCod, H01X611_A4036CCTDsc, H01X611_A4032CCOpeCod, H01X611_n4032CCOpeCod,
            H01X611_A4033CCFch, H01X611_n4033CCFch, H01X611_A3281CcObs, H01X611_n3281CcObs
            }
         }
      );
      AV115Pgmname = "ControlCalidadHTD.WINCCResultados" ;
      /* GeneXus formulas. */
      AV115Pgmname = "ControlCalidadHTD.WINCCResultados" ;
      Gx_err = (short)(0) ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavProcod_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
      edtavFascod_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavCctcod_Enabled = 0 ;
      edtavCctdsc_Enabled = 0 ;
      edtavCcopecod_Enabled = 0 ;
      edtavErrcontrol_Enabled = 0 ;
      edtavBarfasest_Enabled = 0 ;
      edtavCcfas_Enabled = 0 ;
      edtavOk_Enabled = 0 ;
      edtavVerresultado_Enabled = 0 ;
      edtavCctcodgrid_Enabled = 0 ;
      edtavCctdscgrid_Enabled = 0 ;
      edtavCcfchgrid_Enabled = 0 ;
      edtavCcopecodgrid_Enabled = 0 ;
      edtavCcobsgrid_Enabled = 0 ;
      edtavCctlingrid_Enabled = 0 ;
      edtavCctlindscgrid_Enabled = 0 ;
      edtavCcmetodogrid_Enabled = 0 ;
      edtavCcespecifgrid_Enabled = 0 ;
      edtavCcvalgrid_Enabled = 0 ;
      edtavCctvalgrid_Enabled = 0 ;
      edtavCcser1_Enabled = 0 ;
      edtavCccno5_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID1_nEOF ;
   private byte GRID4_nEOF ;
   private byte GRID3_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV16carvitin ;
   private byte AV45errControl ;
   private byte A132BarCodReo ;
   private byte AV10BarcodreoIN ;
   private byte A153BarFasEst ;
   private byte AV17CCCno5 ;
   private byte AV27Ccser1 ;
   private byte AV40CnoEnc ;
   private byte AV41CtrlfsLb ;
   private byte A4049CCTValLin ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A11749CCCTc ;
   private byte AV80Tabla_Barcad ;
   private byte AV11BarFasEst ;
   private byte AV19Ccfas ;
   private byte AV75Ok ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid4_Backcolorstyle ;
   private byte AV78SoloOperario ;
   private byte subGrid1_Allowselection ;
   private byte subGrid4_Allowselection ;
   private byte subGrid3_Allowselection ;
   private byte AV72LoadBarcad ;
   private byte GXv_int6[] ;
   private byte AV48flag ;
   private byte GXt_int5 ;
   private byte GXv_int9[] ;
   private byte subGrid1_Backstyle ;
   private byte subGrid4_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid4_Titlebackstyle ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid3_Titlebackstyle ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A194BarOrdLin ;
   private short AV42Cuaderno ;
   private short AV15BarOrdLin ;
   private short A4034CCTLin ;
   private short AV34CCTLinGrid ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A4466BarAcaAnh ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short A11750IntId ;
   private short wbEnd ;
   private short wbStart ;
   private short AV7BarAncAca1 ;
   private short AV12BarGraAca ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int8[] ;
   private int nRC_GXsfl_124 ;
   private int nRC_GXsfl_142 ;
   private int nRC_GXsfl_153 ;
   private int subGrid1_Rows ;
   private int subGrid4_Rows ;
   private int subGrid3_Rows ;
   private int nGXsfl_124_idx=1 ;
   private int AV25CCOpeCod ;
   private int A129BarCod ;
   private int AV8BarcodIN ;
   private int A4031CCTCod ;
   private int AV38Clicod ;
   private int AV22CCFColNum ;
   private int AV28CctCod ;
   private int A4032CCOpeCod ;
   private int nGXsfl_142_idx=1 ;
   private int nGXsfl_153_idx=1 ;
   private int AV29CCTCodGrid ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A4059CCFColNum ;
   private int A11738CCColNum ;
   private int edtavBarcodin_Enabled ;
   private int edtavBarcodreoin_Enabled ;
   private int edtavBarcodparin_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavCuaderno_Enabled ;
   private int edtavTb1_dsc_Enabled ;
   private int edtavBarancaca1_Enabled ;
   private int edtavBargraaca_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavArtdsc_Enabled ;
   private int edtavCcser1_Enabled ;
   private int edtavCccno5_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV26CCOpeCodGrid ;
   private int subGrid1_Islastpage ;
   private int subGrid3_Islastpage ;
   private int subGrid4_Islastpage ;
   private int edtavBarordlin_Enabled ;
   private int edtavProcod_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavCctcod_Enabled ;
   private int edtavCctdsc_Enabled ;
   private int edtavCcopecod_Enabled ;
   private int edtavErrcontrol_Enabled ;
   private int edtavBarfasest_Enabled ;
   private int edtavCcfas_Enabled ;
   private int edtavOk_Enabled ;
   private int edtavVerresultado_Enabled ;
   private int edtavCctcodgrid_Enabled ;
   private int edtavCctdscgrid_Enabled ;
   private int edtavCcfchgrid_Enabled ;
   private int edtavCcopecodgrid_Enabled ;
   private int edtavCcobsgrid_Enabled ;
   private int edtavCctlingrid_Enabled ;
   private int edtavCctlindscgrid_Enabled ;
   private int edtavCcmetodogrid_Enabled ;
   private int edtavCcespecifgrid_Enabled ;
   private int edtavCcvalgrid_Enabled ;
   private int edtavCctvalgrid_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int GRID3_nGridOutOfScope ;
   private int GRID4_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int subGrid3_Recordcount ;
   private int subGrid4_Recordcount ;
   private int tblTablebutton_Visible ;
   private int GXv_int7[] ;
   private int bttBtnuseraction1_Visible ;
   private int AV30Cctcodout ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavBarordlin_Visible ;
   private int edtavProcod_Visible ;
   private int edtavProdsc_Visible ;
   private int edtavFascod_Visible ;
   private int edtavFasdsc_Visible ;
   private int edtavCctcod_Visible ;
   private int edtavCctdsc_Visible ;
   private int edtavCcopecod_Visible ;
   private int edtavErrcontrol_Visible ;
   private int edtavBarfasest_Visible ;
   private int edtavCcfas_Visible ;
   private int edtavOk_Visible ;
   private int edtavVerresultado_Visible ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid4_Titlebackcolor ;
   private int subGrid4_Selectedindex ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid3_Titlebackcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID4_nCurrentRecord ;
   private long GRID3_nCurrentRecord ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV13Barkgm ;
   private java.math.BigDecimal AV14BarMtr ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_124_idx="0001" ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV43EmprCod ;
   private String AV9BarCodParIn ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A759ProDsc ;
   private String AV46FasCod ;
   private String A4036CCTDsc ;
   private String AV5Artcod ;
   private String AV21CCFColNom ;
   private String AV76ProCod ;
   private String AV115Pgmname ;
   private String sGXsfl_142_idx="0001" ;
   private String sGXsfl_153_idx="0001" ;
   private String A4043CCTLinDsc ;
   private String A13252CCEspecif ;
   private String A13251CCMetodo ;
   private String A4048CCTLinTpoI ;
   private String A4035CCVal ;
   private String A4051CCTVal ;
   private String AV37CCValGrid ;
   private String A4050CCTValDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Grid3_empowerer_Gridinternalname ;
   private String Grid4_empowerer_Gridinternalname ;
   private String Grid1_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String edtavBarcodin_Internalname ;
   private String TempTags ;
   private String edtavBarcodin_Jsonclick ;
   private String edtavBarcodreoin_Internalname ;
   private String edtavBarcodreoin_Jsonclick ;
   private String edtavBarcodparin_Internalname ;
   private String edtavBarcodparin_Jsonclick ;
   private String divTablebar_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavCuaderno_Internalname ;
   private String edtavCuaderno_Jsonclick ;
   private String edtavTb1_dsc_Internalname ;
   private String AV81tb1_dsc ;
   private String edtavTb1_dsc_Jsonclick ;
   private String edtavBarancaca1_Internalname ;
   private String edtavBarancaca1_Jsonclick ;
   private String edtavBargraaca_Internalname ;
   private String edtavBargraaca_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String AV39CliNom ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavArtdsc_Internalname ;
   private String AV6ARtDsc ;
   private String edtavArtdsc_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnbtncopiarresultado_Internalname ;
   private String bttBtnbtncopiarresultado_Jsonclick ;
   private String bttBtnbuttonelement2_Internalname ;
   private String bttBtnbuttonelement2_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divTablecontainergrid_Internalname ;
   private String divTablegrid1_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String divTablegrid4_Internalname ;
   private String subGrid4_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String subGrid3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavCcser1_Internalname ;
   private String edtavCcser1_Jsonclick ;
   private String edtavCccno5_Internalname ;
   private String edtavCccno5_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid3_empowerer_Internalname ;
   private String Grid4_empowerer_Internalname ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavBarordlin_Internalname ;
   private String edtavProcod_Internalname ;
   private String AV77ProDsc ;
   private String edtavProdsc_Internalname ;
   private String edtavFascod_Internalname ;
   private String AV47FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String edtavCctcod_Internalname ;
   private String AV31CctDsc ;
   private String edtavCctdsc_Internalname ;
   private String edtavCcopecod_Internalname ;
   private String edtavErrcontrol_Internalname ;
   private String edtavBarfasest_Internalname ;
   private String edtavCcfas_Internalname ;
   private String edtavOk_Internalname ;
   private String AV107VerResultado ;
   private String edtavVerresultado_Internalname ;
   private String edtavCctcodgrid_Internalname ;
   private String AV32CCTDscGrid ;
   private String edtavCctdscgrid_Internalname ;
   private String edtavCcfchgrid_Internalname ;
   private String edtavCcopecodgrid_Internalname ;
   private String edtavCcobsgrid_Internalname ;
   private String edtavCctlingrid_Internalname ;
   private String AV33CCTLinDscGrid ;
   private String edtavCctlindscgrid_Internalname ;
   private String AV23CCMetodoGrid ;
   private String edtavCcmetodogrid_Internalname ;
   private String AV18CCEspecifGrid ;
   private String edtavCcespecifgrid_Internalname ;
   private String edtavCcvalgrid_Internalname ;
   private String AV104CCTValGrid ;
   private String edtavCctvalgrid_Internalname ;
   private String hsh ;
   private String tblTablebutton_Internalname ;
   private String AV79Station ;
   private String AV44EmprNom ;
   private String AV82UsurCod ;
   private String AV51Lit0 ;
   private String AV71LitFe ;
   private String AV62Lit2 ;
   private String AV64Lit3 ;
   private String AV65Lit4 ;
   private String AV66Lit5 ;
   private String AV67Lit6 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String edtavBarordlin_Columnheaderclass ;
   private String edtavVerresultado_Class ;
   private String edtavBarordlin_Columnclass ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String bttBtnuseraction1_Internalname ;
   private String AV36CCTValDsc ;
   private String AV35CCTLinTpoIng ;
   private String bttBtnbtn_pidartigo_Internalname ;
   private String bttBtnbtn_pidartigo_Jsonclick ;
   private String bttBtnuseraction1_Jsonclick ;
   private String sGXsfl_124_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavBarordlin_Jsonclick ;
   private String edtavProcod_Jsonclick ;
   private String edtavProdsc_Jsonclick ;
   private String edtavFascod_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavCctcod_Jsonclick ;
   private String edtavCctdsc_Jsonclick ;
   private String edtavCcopecod_Jsonclick ;
   private String edtavErrcontrol_Jsonclick ;
   private String edtavBarfasest_Jsonclick ;
   private String edtavCcfas_Jsonclick ;
   private String edtavOk_Jsonclick ;
   private String edtavVerresultado_Jsonclick ;
   private String sGXsfl_142_fel_idx="0001" ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String edtavCctcodgrid_Jsonclick ;
   private String edtavCctdscgrid_Jsonclick ;
   private String edtavCcfchgrid_Jsonclick ;
   private String edtavCcopecodgrid_Jsonclick ;
   private String edtavCcobsgrid_Jsonclick ;
   private String sGXsfl_153_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavCctlingrid_Jsonclick ;
   private String edtavCctlindscgrid_Jsonclick ;
   private String edtavCcmetodogrid_Jsonclick ;
   private String edtavCcespecifgrid_Jsonclick ;
   private String edtavCcvalgrid_Jsonclick ;
   private String edtavCctvalgrid_Jsonclick ;
   private String subGrid1_Header ;
   private String subGrid4_Header ;
   private String subGrid3_Header ;
   private java.util.Date A4033CCFch ;
   private java.util.Date AV20CCFchGrid ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private boolean n3281CcObs ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_124_Refreshing=false ;
   private boolean bGXsfl_142_Refreshing=false ;
   private boolean bGXsfl_153_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n252CliCod ;
   private String A3281CcObs ;
   private String AV24CcObsGrid ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid3_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid4_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01X62_A130BarCodPar ;
   private byte[] H01X62_A132BarCodReo ;
   private int[] H01X62_A129BarCod ;
   private String[] H01X62_A396EmprCod ;
   private String[] H01X62_A457FasCod ;
   private String[] H01X62_A460FasDsc ;
   private String[] H01X62_A759ProDsc ;
   private byte[] H01X62_A153BarFasEst ;
   private short[] H01X62_A194BarOrdLin ;
   private String[] H01X62_A758ProCod ;
   private String[] H01X64_A130BarCodPar ;
   private byte[] H01X64_A132BarCodReo ;
   private int[] H01X64_A129BarCod ;
   private String[] H01X64_A396EmprCod ;
   private int[] H01X64_A252CliCod ;
   private boolean[] H01X64_n252CliCod ;
   private String[] H01X64_A279CliNom ;
   private String[] H01X64_A212BarSer ;
   private String[] H01X64_A1652BarSerDsc ;
   private short[] H01X64_A125BarAncAca1 ;
   private short[] H01X64_A1909BarGraAca ;
   private String[] H01X64_A135BarColNom ;
   private int[] H01X64_A136BarColNum ;
   private short[] H01X64_A4466BarAcaAnh ;
   private java.math.BigDecimal[] H01X64_A166BarKgm ;
   private java.math.BigDecimal[] H01X64_A184BarMtr ;
   private String[] H01X65_A457FasCod ;
   private String[] H01X65_A396EmprCod ;
   private String[] H01X65_A4036CCTDsc ;
   private int[] H01X65_A4031CCTCod ;
   private int[] H01X66_A4031CCTCod ;
   private short[] H01X66_A194BarOrdLin ;
   private String[] H01X66_A758ProCod ;
   private String[] H01X66_A130BarCodPar ;
   private byte[] H01X66_A132BarCodReo ;
   private int[] H01X66_A129BarCod ;
   private String[] H01X66_A396EmprCod ;
   private int[] H01X66_A4032CCOpeCod ;
   private boolean[] H01X66_n4032CCOpeCod ;
   private int[] H01X67_A4059CCFColNum ;
   private String[] H01X67_A4058CCFColNom ;
   private String[] H01X67_A65ArtCod ;
   private int[] H01X67_A252CliCod ;
   private boolean[] H01X67_n252CliCod ;
   private String[] H01X67_A396EmprCod ;
   private int[] H01X67_A4031CCTCod ;
   private short[] H01X68_A9713Tb1_Cod ;
   private int[] H01X68_A252CliCod ;
   private boolean[] H01X68_n252CliCod ;
   private String[] H01X68_A396EmprCod ;
   private int[] H01X68_A4031CCTCod ;
   private short[] H01X68_A11750IntId ;
   private byte[] H01X68_A11749CCCTc ;
   private int[] H01X68_A11738CCColNum ;
   private String[] H01X68_A11737CCColNom ;
   private short[] H01X68_A11748TipArtiId ;
   private String[] H01X68_A11736CCArtCod ;
   private String[] H01X69_A4051CCTVal ;
   private short[] H01X69_A4034CCTLin ;
   private int[] H01X69_A4031CCTCod ;
   private String[] H01X69_A396EmprCod ;
   private String[] H01X69_A4050CCTValDsc ;
   private byte[] H01X69_A4049CCTValLin ;
   private int[] H01X610_A4031CCTCod ;
   private short[] H01X610_A194BarOrdLin ;
   private String[] H01X610_A758ProCod ;
   private String[] H01X610_A130BarCodPar ;
   private byte[] H01X610_A132BarCodReo ;
   private int[] H01X610_A129BarCod ;
   private String[] H01X610_A396EmprCod ;
   private String[] H01X610_A4043CCTLinDsc ;
   private String[] H01X610_A13252CCEspecif ;
   private String[] H01X610_A13251CCMetodo ;
   private String[] H01X610_A4048CCTLinTpoI ;
   private String[] H01X610_A4035CCVal ;
   private short[] H01X610_A4034CCTLin ;
   private int[] H01X611_A4031CCTCod ;
   private short[] H01X611_A194BarOrdLin ;
   private String[] H01X611_A758ProCod ;
   private String[] H01X611_A130BarCodPar ;
   private byte[] H01X611_A132BarCodReo ;
   private int[] H01X611_A129BarCod ;
   private String[] H01X611_A396EmprCod ;
   private String[] H01X611_A4036CCTDsc ;
   private int[] H01X611_A4032CCOpeCod ;
   private boolean[] H01X611_n4032CCOpeCod ;
   private java.util.Date[] H01X611_A4033CCFch ;
   private boolean[] H01X611_n4033CCFch ;
   private String[] H01X611_A3281CcObs ;
   private boolean[] H01X611_n3281CcObs ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class winccresultados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01X67( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV5Artcod ,
                                          String AV21CCFColNom ,
                                          int AV22CCFColNum ,
                                          String A65ArtCod ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum ,
                                          int A252CliCod ,
                                          int AV38Clicod ,
                                          String AV43EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[5];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT CCFColNum, CCFColNom, ArtCod, CliCod, EmprCod, CCTCod FROM TXPCCSer1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV5Artcod)==0) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21CCFColNom)==0) )
      {
         addWhere(sWhereString, "(CCFColNom = ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV22CCFColNum) )
      {
         addWhere(sWhereString, "(CCFColNum = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CCTCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H01X610( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV76ProCod ,
                                           int AV29CCTCodGrid ,
                                           String A758ProCod ,
                                           int A4031CCTCod ,
                                           short A194BarOrdLin ,
                                           short AV15BarOrdLin ,
                                           String AV43EmprCod ,
                                           int AV8BarcodIN ,
                                           byte AV10BarcodreoIN ,
                                           String AV9BarCodParIn ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[7];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.CCTLinDsc, T1.CCEspecif, T1.CCMetodo, T2.CCTLinTpoI, T1.CCVal, T1.CCTLin" ;
      scmdbuf += " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      if ( ! (GXutil.strcmp("", AV76ProCod)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV29CCTCodGrid) )
      {
         addWhere(sWhereString, "(T1.CCTCod = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H01X611( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV76ProCod ,
                                           int AV28CctCod ,
                                           String A758ProCod ,
                                           int A4031CCTCod ,
                                           short A194BarOrdLin ,
                                           short AV15BarOrdLin ,
                                           String AV43EmprCod ,
                                           int AV8BarcodIN ,
                                           byte AV10BarcodreoIN ,
                                           String AV9BarCodParIn ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[7];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.CCTDsc, T1.CCOpeCod, T1.CCFch, T1.CcObs FROM (TXPCC T1 INNER JOIN" ;
      scmdbuf += " TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      if ( ! (GXutil.strcmp("", AV76ProCod)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV28CctCod) )
      {
         addWhere(sWhereString, "(T1.CCTCod = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 4 :
                  return conditional_H01X67(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 7 :
                  return conditional_H01X610(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] );
            case 8 :
                  return conditional_H01X611(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01X62", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.FasCod, T2.FasDsc, T3.ProDsc, T1.BarFasEst, T1.BarOrdLin, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X64", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T3.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarAncAca1, T1.BarGraAca, T1.BarColNom, T1.BarColNum, T1.BarAcaAnh, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01X65", "SELECT T1.FasCod, T1.EmprCod, T2.CCTDsc, T1.CCTCod FROM (TXPCCFas T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X66", "SELECT CCTCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, CCOpeCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01X67", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X68", "SELECT Tb1_Cod, CliCod, EmprCod, CCTCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X69", "SELECT CCTVal, CCTLin, CCTCod, EmprCod, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (RTRIM(LTRIM(CCTVal)) = RTRIM(LTRIM(?))) ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X610", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X611", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

