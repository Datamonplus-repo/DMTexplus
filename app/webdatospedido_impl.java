package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webdatospedido_impl extends GXDataArea
{
   public webdatospedido_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webdatospedido_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdatospedido_impl.class ));
   }

   public webdatospedido_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSdtencabezadopedido_albrreo = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_displa = UIFactory.getCheckbox(this);
      chkavColorencontrado = UIFactory.getCheckbox(this);
      chkavColorprompt = UIFactory.getCheckbox(this);
      dynavSdtencabezadopedido_distipcol = new HTMLChoice();
      chkavSdtencabezadopedido_disnormst01 = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_disnormst02 = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_disnormst03 = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_disnormst04 = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_disnormst05 = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_disrec = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_nxt_statio = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_nxt_modelo = UIFactory.getCheckbox(this);
      chkavSdtencabezadopedido_disexp = UIFactory.getCheckbox(this);
      cmbavSdtencabezadopedido_nxt_artcli = new HTMLChoice();
      chkavRealizado = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCOMBOPROCDSC") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            A13771ProCDsc = httpContext.GetPar( "ProCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcomboprocdscDA0( AV18EmprCod, A13771ProCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"SDTENCABEZADOPEDIDO_CLICOD") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvsdtencabezadopedido_clicodDA0( AV18EmprCod, A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD") == 0 )
         {
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicodDA0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCOMBOPROCDSC") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            A13771ProCDsc = httpContext.GetPar( "ProCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcomboprocdscDA0( AV18EmprCod, A13771ProCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCOMBOPROCDSC") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            hV76ComboProCDsc = httpContext.GetPar( "hV76ComboProCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvcomboprocdscDA4( AV18EmprCod, hV76ComboProCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"SDTENCABEZADOPEDIDO_CLICOD") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvsdtencabezadopedido_clicodDA0( AV18EmprCod, A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"SDTENCABEZADOPEDIDO_CLICOD") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            hV79GXV1 = httpContext.GetPar( "hV79GXV1") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvsdtencabezadopedido_clicodDA2( AV18EmprCod, hV79GXV1) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD") == 0 )
         {
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicodDA0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICOD") == 0 )
         {
            hV9CliCod = httpContext.GetPar( "hV9CliCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicodDA2( hV9CliCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"SDTENCABEZADOPEDIDO_DISTIPCOL") == 0 )
         {
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvsdtencabezadopedido_distipcolDA2( AV18EmprCod) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Encabezado01") == 0 )
         {
            gxnrencabezado01_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Encabezado01") == 0 )
         {
            gxgrencabezado01_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Encabezado04") == 0 )
         {
            gxnrencabezado04_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Encabezado04") == 0 )
         {
            gxgrencabezado04_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtarticulopedidos") == 0 )
         {
            gxnrgridsdtarticulopedidos_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtarticulopedidos") == 0 )
         {
            gxgrgridsdtarticulopedidos_refresh_invoke( ) ;
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

   public void gxnrencabezado01_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      AV9CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrencabezado01_newrow( ) ;
      /* End function gxnrEncabezado01_newrow_invoke */
   }

   public void gxgrencabezado01_refresh_invoke( )
   {
      subGridsdtarticulopedidos_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtarticulopedidos_Rows"))) ;
      AV6AplicadoSetWebSession = GXutil.strtobool( httpContext.GetPar( "AplicadoSetWebSession")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39SdtEnCabezadoPedido);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV38SdtArticuloPedidos);
      AV9CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV12Contexto = httpContext.GetPar( "Contexto") ;
      AV11ColorEncontrado = GXutil.strtobool( httpContext.GetPar( "ColorEncontrado")) ;
      AV58ColorPrompt = GXutil.strtobool( httpContext.GetPar( "ColorPrompt")) ;
      AV32Realizado = GXutil.strtobool( httpContext.GetPar( "Realizado")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrencabezado01_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV9CliCod, AV12Contexto, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrEncabezado01_refresh_invoke */
   }

   public void gxnrencabezado04_newrow_invoke( )
   {
      nRC_GXsfl_171 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_171"))) ;
      nGXsfl_171_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_171_idx"))) ;
      sGXsfl_171_idx = httpContext.GetPar( "sGXsfl_171_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrencabezado04_newrow( ) ;
      /* End function gxnrEncabezado04_newrow_invoke */
   }

   public void gxgrencabezado04_refresh_invoke( )
   {
      subGridsdtarticulopedidos_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtarticulopedidos_Rows"))) ;
      AV6AplicadoSetWebSession = GXutil.strtobool( httpContext.GetPar( "AplicadoSetWebSession")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39SdtEnCabezadoPedido);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV38SdtArticuloPedidos);
      AV12Contexto = httpContext.GetPar( "Contexto") ;
      AV11ColorEncontrado = GXutil.strtobool( httpContext.GetPar( "ColorEncontrado")) ;
      AV58ColorPrompt = GXutil.strtobool( httpContext.GetPar( "ColorPrompt")) ;
      AV32Realizado = GXutil.strtobool( httpContext.GetPar( "Realizado")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrencabezado04_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrEncabezado04_refresh_invoke */
   }

   public void gxnrgridsdtarticulopedidos_newrow_invoke( )
   {
      nRC_GXsfl_333 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_333"))) ;
      nGXsfl_333_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_333_idx"))) ;
      sGXsfl_333_idx = httpContext.GetPar( "sGXsfl_333_idx") ;
      edtavInsert_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInsert_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInsert_Visible), 5, 0), !bGXsfl_333_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtarticulopedidos_newrow( ) ;
      /* End function gxnrGridsdtarticulopedidos_newrow_invoke */
   }

   public void gxgrgridsdtarticulopedidos_refresh_invoke( )
   {
      subGridsdtarticulopedidos_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtarticulopedidos_Rows"))) ;
      AV6AplicadoSetWebSession = GXutil.strtobool( httpContext.GetPar( "AplicadoSetWebSession")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39SdtEnCabezadoPedido);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV38SdtArticuloPedidos);
      AV12Contexto = httpContext.GetPar( "Contexto") ;
      edtavInsert_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInsert_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInsert_Visible), 5, 0), !bGXsfl_333_Refreshing);
      AV18EmprCod = httpContext.GetPar( "EmprCod") ;
      AV11ColorEncontrado = GXutil.strtobool( httpContext.GetPar( "ColorEncontrado")) ;
      AV58ColorPrompt = GXutil.strtobool( httpContext.GetPar( "ColorPrompt")) ;
      AV32Realizado = GXutil.strtobool( httpContext.GetPar( "Realizado")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtarticulopedidos_refresh_invoke */
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
      paDA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDA2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webdatospedido", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Contexto, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtencabezadopedido", AV39SdtEnCabezadoPedido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtencabezadopedido", AV39SdtEnCabezadoPedido);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtarticulopedidos", AV38SdtArticuloPedidos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtarticulopedidos", AV38SdtArticuloPedidos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_32, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_171", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_171, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_333", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_333, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCDSC_DATA", AV75ArtCDsc_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCDSC_DATA", AV75ArtCDsc_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTARTICULOPEDIDOSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV23GridSdtArticuloPedidosCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTARTICULOPEDIDOSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV24GridSdtArticuloPedidosPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTENCABEZADOPEDIDO_PROCECOD_DATA", AV67SdtEnCabezadoPedido_ProceCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTENCABEZADOPEDIDO_PROCECOD_DATA", AV67SdtEnCabezadoPedido_ProceCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTENCABEZADOPEDIDO_COD_IDTX_DATA", AV63SdtEnCabezadoPedido_Cod_Idtx_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTENCABEZADOPEDIDO_COD_IDTX_DATA", AV63SdtEnCabezadoPedido_Cod_Idtx_Data);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vAPLICADOSETWEBSESSION", AV6AplicadoSetWebSession);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTARTICULOPEDIDOS", AV38SdtArticuloPedidos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTARTICULOPEDIDOS", AV38SdtArticuloPedidos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTO", AV12Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Contexto, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMESSAGES", AV56Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMESSAGES", AV56Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMLIN", GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTFASEPEDIDOCOLLECTION", AV41SdtFasePedidoCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTFASEPEDIDOCOLLECTION", AV41SdtFasePedidoCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICOD", GXutil.ltrim( localUtil.ntoc( AV9CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTENCABEZADOPEDIDO", AV39SdtEnCabezadoPedido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTENCABEZADOPEDIDO", AV39SdtEnCabezadoPedido);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCDSC_Cls", GXutil.rtrim( Combo_artcdsc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCDSC_Selectedvalue_set", GXutil.rtrim( Combo_artcdsc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtarticulopedidospaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtarticulopedidospaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtarticulopedidospaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtarticulopedidospaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtarticulopedidospaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtarticulopedidospaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SDTENCABEZADOPEDIDO_PROCECOD_Cls", GXutil.rtrim( Combo_sdtencabezadopedido_procecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SDTENCABEZADOPEDIDO_PROCECOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_sdtencabezadopedido_procecod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SDTENCABEZADOPEDIDO_PROCECOD_Isgriditem", GXutil.booltostr( Combo_sdtencabezadopedido_procecod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX_Cls", GXutil.rtrim( Combo_sdtencabezadopedido_cod_idtx_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX_Titlecontrolidtoreplace", GXutil.rtrim( Combo_sdtencabezadopedido_cod_idtx_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX_Isgriditem", GXutil.booltostr( Combo_sdtencabezadopedido_cod_idtx_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtarticulopedidos_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCDSC_Selectedvalue_get", GXutil.rtrim( Combo_artcdsc_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtarticulopedidospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         weDA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDA2( ) ;
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
      return formatLink("app.webdatospedido", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebDatosPedido" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Datos Pedido", "") ;
   }

   public void wbDA0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 32, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 32, 2, 0)+","+"null"+");", httpContext.getMessage( "Reiniciar", ""), bttBtnlimpiar_Jsonclick, 5, httpContext.getMessage( "Reiniciar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         wb_table1_29_DA2( true) ;
      }
      else
      {
         wb_table1_29_DA2( false) ;
      }
      return  ;
   }

   public void wb_table1_29_DA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divEncabezado03_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
         ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
         ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
         ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
         ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
         ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
         ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
         ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
         ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
         ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
         ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
         wb_table2_105_DA2( true) ;
      }
      else
      {
         wb_table2_105_DA2( false) ;
      }
      return  ;
   }

   public void wb_table2_105_DA2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         /*  Grid Control  */
         Encabezado04Container.SetIsFreestyle(true);
         Encabezado04Container.SetWrapped(nGXWrapped);
         startgridcontrol171( ) ;
      }
      if ( wbEnd == 171 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_171 = (int)(nGXsfl_171_idx-1) ;
         if ( Encabezado04Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Encabezado04Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Encabezado04", Encabezado04Container, subEncabezado04_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Encabezado04ContainerData", Encabezado04Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Encabezado04ContainerData"+"V", Encabezado04Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Encabezado04ContainerData"+"V"+"\" value='"+Encabezado04Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divEncabezado05_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablaadicionar_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell ExtendedComboCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedartcdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_artcdsc_Internalname, httpContext.getMessage( "Artigo(s)", ""), "", "", lblTextblockcombo_artcdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_artcdsc.setProperty("Caption", Combo_artcdsc_Caption);
         ucCombo_artcdsc.setProperty("Cls", Combo_artcdsc_Cls);
         ucCombo_artcdsc.setProperty("DropDownOptionsData", AV75ArtCDsc_Data);
         ucCombo_artcdsc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_artcdsc_Internalname, "COMBO_ARTCDSCContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "HasGridEmpowerer", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdtarticulopedidostablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtarticulopedidosContainer.SetWrapped(nGXWrapped);
         startgridcontrol333( ) ;
      }
      if ( wbEnd == 333 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_333 = (int)(nGXsfl_333_idx-1) ;
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV109GXV31 = nGXsfl_333_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridsdtarticulopedidosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdtarticulopedidos", GridsdtarticulopedidosContainer, subGridsdtarticulopedidos_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtarticulopedidosContainerData", GridsdtarticulopedidosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtarticulopedidosContainerData"+"V", GridsdtarticulopedidosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtarticulopedidosContainerData"+"V"+"\" value='"+GridsdtarticulopedidosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtarticulopedidospaginationbar.setProperty("Class", Gridsdtarticulopedidospaginationbar_Class);
         ucGridsdtarticulopedidospaginationbar.setProperty("ShowFirst", Gridsdtarticulopedidospaginationbar_Showfirst);
         ucGridsdtarticulopedidospaginationbar.setProperty("ShowPrevious", Gridsdtarticulopedidospaginationbar_Showprevious);
         ucGridsdtarticulopedidospaginationbar.setProperty("ShowNext", Gridsdtarticulopedidospaginationbar_Shownext);
         ucGridsdtarticulopedidospaginationbar.setProperty("ShowLast", Gridsdtarticulopedidospaginationbar_Showlast);
         ucGridsdtarticulopedidospaginationbar.setProperty("PagesToShow", Gridsdtarticulopedidospaginationbar_Pagestoshow);
         ucGridsdtarticulopedidospaginationbar.setProperty("PagingButtonsPosition", Gridsdtarticulopedidospaginationbar_Pagingbuttonsposition);
         ucGridsdtarticulopedidospaginationbar.setProperty("PagingCaptionPosition", Gridsdtarticulopedidospaginationbar_Pagingcaptionposition);
         ucGridsdtarticulopedidospaginationbar.setProperty("EmptyGridClass", Gridsdtarticulopedidospaginationbar_Emptygridclass);
         ucGridsdtarticulopedidospaginationbar.setProperty("RowsPerPageSelector", Gridsdtarticulopedidospaginationbar_Rowsperpageselector);
         ucGridsdtarticulopedidospaginationbar.setProperty("RowsPerPageOptions", Gridsdtarticulopedidospaginationbar_Rowsperpageoptions);
         ucGridsdtarticulopedidospaginationbar.setProperty("Previous", Gridsdtarticulopedidospaginationbar_Previous);
         ucGridsdtarticulopedidospaginationbar.setProperty("Next", Gridsdtarticulopedidospaginationbar_Next);
         ucGridsdtarticulopedidospaginationbar.setProperty("Caption", Gridsdtarticulopedidospaginationbar_Caption);
         ucGridsdtarticulopedidospaginationbar.setProperty("EmptyGridCaption", Gridsdtarticulopedidospaginationbar_Emptygridcaption);
         ucGridsdtarticulopedidospaginationbar.setProperty("RowsPerPageCaption", Gridsdtarticulopedidospaginationbar_Rowsperpagecaption);
         ucGridsdtarticulopedidospaginationbar.setProperty("CurrentPage", AV23GridSdtArticuloPedidosCurrentPage);
         ucGridsdtarticulopedidospaginationbar.setProperty("PageCount", AV24GridSdtArticuloPedidosPageCount);
         ucGridsdtarticulopedidospaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtarticulopedidospaginationbar_Internalname, "GRIDSDTARTICULOPEDIDOSPAGINATIONBARContainer");
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
         ucCombo_sdtencabezadopedido_procecod.setProperty("Caption", Combo_sdtencabezadopedido_procecod_Caption);
         ucCombo_sdtencabezadopedido_procecod.setProperty("Cls", Combo_sdtencabezadopedido_procecod_Cls);
         ucCombo_sdtencabezadopedido_procecod.setProperty("IsGridItem", Combo_sdtencabezadopedido_procecod_Isgriditem);
         ucCombo_sdtencabezadopedido_procecod.setProperty("DropDownOptionsData", AV67SdtEnCabezadoPedido_ProceCod_Data);
         ucCombo_sdtencabezadopedido_procecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_sdtencabezadopedido_procecod_Internalname, "COMBO_SDTENCABEZADOPEDIDO_PROCECODContainer");
         /* User Defined Control */
         ucCombo_sdtencabezadopedido_cod_idtx.setProperty("Caption", Combo_sdtencabezadopedido_cod_idtx_Caption);
         ucCombo_sdtencabezadopedido_cod_idtx.setProperty("Cls", Combo_sdtencabezadopedido_cod_idtx_Cls);
         ucCombo_sdtencabezadopedido_cod_idtx.setProperty("IsGridItem", Combo_sdtencabezadopedido_cod_idtx_Isgriditem);
         ucCombo_sdtencabezadopedido_cod_idtx.setProperty("DropDownOptionsData", AV63SdtEnCabezadoPedido_Cod_Idtx_Data);
         ucCombo_sdtencabezadopedido_cod_idtx.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_sdtencabezadopedido_cod_idtx_Internalname, "COMBO_SDTENCABEZADOPEDIDO_COD_IDTXContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcdsc_Internalname, AV74ArtCDsc, GXutil.rtrim( localUtil.format( AV74ArtCDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcdsc_Jsonclick, 0, "Attribute", "", "", "", "", edtavArtcdsc_Visible, 1, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 357,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavDatospedidojson_Internalname, AV14DatosPedidoJSON, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,357);\"", (short)(1), edtavDatospedidojson_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "10485760", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebDatosPedido.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 358,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartcod_Internalname, AV16DisArtCod, GXutil.rtrim( localUtil.format( AV16DisArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,358);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavDisartcod_Visible, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAdicionar_Internalname, GXutil.rtrim( AV5Adicionar), GXutil.rtrim( localUtil.format( AV5Adicionar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+"EVADICIONAR.CLICK."+"'", "", "", "", "", edtavAdicionar_Jsonclick, 5, "Attribute", "", "", "", "", edtavAdicionar_Visible, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(1), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 360,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavRealizado.getInternalname(), GXutil.booltostr( AV32Realizado), "", "", chkavRealizado.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(360, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,360);\"");
         wb_table3_361_DA2( true) ;
      }
      else
      {
         wb_table3_361_DA2( false) ;
      }
      return  ;
   }

   public void wb_table3_361_DA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridsdtarticulopedidos_empowerer.render(context, "wwp.gridempowerer", Gridsdtarticulopedidos_empowerer_Internalname, "GRIDSDTARTICULOPEDIDOS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 32 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Encabezado01Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Encabezado01Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Encabezado01", Encabezado01Container, subEncabezado01_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Encabezado01ContainerData", Encabezado01Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Encabezado01ContainerData"+"V", Encabezado01Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Encabezado01ContainerData"+"V"+"\" value='"+Encabezado01Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 171 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Encabezado04Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Encabezado04Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Encabezado04", Encabezado04Container, subEncabezado04_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Encabezado04ContainerData", Encabezado04Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Encabezado04ContainerData"+"V", Encabezado04Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Encabezado04ContainerData"+"V"+"\" value='"+Encabezado04Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 333 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV109GXV31 = nGXsfl_333_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridsdtarticulopedidosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdtarticulopedidos", GridsdtarticulopedidosContainer, subGridsdtarticulopedidos_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtarticulopedidosContainerData", GridsdtarticulopedidosContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtarticulopedidosContainerData"+"V", GridsdtarticulopedidosContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtarticulopedidosContainerData"+"V"+"\" value='"+GridsdtarticulopedidosContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startDA2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Datos Pedido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDA0( ) ;
   }

   public void wsDA2( )
   {
      startDA2( ) ;
      evtDA2( ) ;
   }

   public void evtDA2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_SDTENCABEZADOPEDIDO_PROCECOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e16DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiar' */
                           e17DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VADICIONAR.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VREALIZADO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISCOLNOM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCOLORENCONTRADO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCOLORPROMPT.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e22DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISCOLNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e23DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISTIPCOL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e24DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISOBS.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e25DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISNOMCLI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e26DA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISNUMCLI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e27DA2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "ENCABEZADO01.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 46), "SDTENCABEZADOPEDIDO_CLICOD.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "ENCABEZADO01.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 49), "SDTENCABEZADOPEDIDO_DISENCCLI.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_32_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_322( ) ;
                           hV79GXV1 = httpContext.cgiGet( edtavSdtencabezadopedido_clicod_Internalname) ;
                           hV9CliCod = httpContext.cgiGet( edtavClicod_Internalname) ;
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disenccli( httpContext.cgiGet( edtavSdtencabezadopedido_disenccli_Internalname) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disfec( localUtil.ctot( httpContext.cgiGet( edtavSdtencabezadopedido_disfec_Internalname), 0) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disfeccli( localUtil.ctot( httpContext.cgiGet( edtavSdtencabezadopedido_disfeccli_Internalname), 0) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disfecent( localUtil.ctot( httpContext.cgiGet( edtavSdtencabezadopedido_disfecent_Internalname), 0) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Albrreo( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_albrreo.getInternalname()), "SI")==0) ? "SI" : "NO") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Displa( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_displa.getInternalname()), "S")==0) ? "S" : "N") );
                           GXCCtl = "GXHCSDTENCABEZADOPEDIDO_CLICOD_" + sGXsfl_32_idx ;
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Clicod( (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
                           GXCCtl = "GXHCvCLICOD_" + sGXsfl_32_idx ;
                           AV9CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCSDTENCABEZADOPEDIDO_CLICOD_" + sGXsfl_32_idx ;
                              AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Clicod( (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
                              GXCCtl = "GXHCvCLICOD_" + sGXsfl_32_idx ;
                              AV9CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                 e28DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e29DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENCABEZADO01.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e30DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_CLICOD.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e31DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENCABEZADO01.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e32DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISENCCLI.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e33DA2 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 27), "GRIDSDTARTICULOPEDIDOS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 49), "SDTARTICULOPEDIDOS__DISNUMPIE.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 45), "SDTARTICULOPEDIDOS__KILOS.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 46), "SDTARTICULOPEDIDOS__METROS.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 49), "SDTARTICULOPEDIDOS__DISARTANH.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 49), "SDTARTICULOPEDIDOS__DISGRAACA.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) )
                        {
                           nGXsfl_333_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_3334( ) ;
                           AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
                           if ( ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) && ( AV109GXV31 > 0 ) )
                           {
                              AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
                              AV15Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDelete_Internalname, AV15Delete);
                              AV26Insert = httpContext.cgiGet( edtavInsert_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavInsert_Internalname, AV26Insert);
                              hV76ComboProCDsc = httpContext.cgiGet( edtavComboprocdsc_Internalname) ;
                              AV30ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV30ProCod);
                              AV31ProDsc = httpContext.cgiGet( edtavProdsc_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV31ProDsc);
                              AV44Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV44Update);
                           }
                           GXCCtl = "GXHCvCOMBOPROCDSC_" + sGXsfl_333_idx ;
                           AV76ComboProCDsc = httpContext.cgiGet( GXCCtl) ;
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCvCOMBOPROCDSC_" + sGXsfl_333_idx ;
                              AV76ComboProCDsc = httpContext.cgiGet( GXCCtl) ;
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDSDTARTICULOPEDIDOS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e34DA4 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VDELETE.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e35DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VUPDATE.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e36DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTARTICULOPEDIDOS__DISNUMPIE.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e37DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTARTICULOPEDIDOS__KILOS.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e38DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTARTICULOPEDIDOS__METROS.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e39DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTARTICULOPEDIDOS__DISARTANH.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e40DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTARTICULOPEDIDOS__DISGRAACA.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e41DA2 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 17), "ENCABEZADO04.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 46), "SDTENCABEZADOPEDIDO_DISEXP.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 50), "SDTENCABEZADOPEDIDO_NXT_ARTCLI.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 47), "SDTENCABEZADOPEDIDO_DISPART.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 50), "SDTENCABEZADOPEDIDO_NXT_MODELO.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 50), "SDTENCABEZADOPEDIDO_NXT_STATIO.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 50), "SDTENCABEZADOPEDIDO_DISORDCOMP.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 46), "SDTENCABEZADOPEDIDO_DISREC.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 47), "SDTENCABEZADOPEDIDO_DISDEST.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 53), "SDTENCABEZADOPEDIDO_OBSERVACIONES.CONTROLVALUECHANGED") == 0 ) )
                        {
                           nGXsfl_171_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_171_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_171_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1713( ) ;
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disitem3( httpContext.cgiGet( edtavSdtencabezadopedido_disitem3_Internalname) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Procecod( (short)(localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_procecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Dispart( (short)(localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_dispart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disordcomp( httpContext.cgiGet( edtavSdtencabezadopedido_disordcomp_Internalname) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Cod_idtx( httpContext.cgiGet( edtavSdtencabezadopedido_cod_idtx_Internalname) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst01( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disnormst01.getInternalname()), "S")==0) ? "S" : "N") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst02( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disnormst02.getInternalname()), "S")==0) ? "S" : "N") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst03( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disnormst03.getInternalname()), "S")==0) ? "S" : "N") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst04( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disnormst04.getInternalname()), "S")==0) ? "S" : "N") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst05( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disnormst05.getInternalname()), "S")==0) ? "S" : "N") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disrec( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disrec.getInternalname()), "S")==0) ? "S" : "N") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disdest( httpContext.cgiGet( edtavSdtencabezadopedido_disdest_Internalname) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_statio( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_nxt_statio.getInternalname()), "SIM")==0) ? "SIM" : "NAO") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_modelo( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_nxt_modelo.getInternalname()), "SIM")==0) ? "SIM" : "NAO") );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disexp( ((GXutil.strcmp(httpContext.cgiGet( chkavSdtencabezadopedido_disexp.getInternalname()), "E")==0) ? "E" : "N") );
                           cmbavSdtencabezadopedido_nxt_artcli.setName( cmbavSdtencabezadopedido_nxt_artcli.getInternalname() );
                           cmbavSdtencabezadopedido_nxt_artcli.setValue( httpContext.cgiGet( cmbavSdtencabezadopedido_nxt_artcli.getInternalname()) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_artcli( httpContext.cgiGet( cmbavSdtencabezadopedido_nxt_artcli.getInternalname()) );
                           AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Observaciones( httpContext.cgiGet( edtavSdtencabezadopedido_observaciones_Internalname) );
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "ENCABEZADO04.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e42DA3 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISEXP.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e43DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_NXT_ARTCLI.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e44DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISPART.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e45DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_NXT_MODELO.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e46DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_NXT_STATIO.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e47DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISORDCOMP.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e48DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISREC.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e49DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_DISDEST.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e50DA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTENCABEZADOPEDIDO_OBSERVACIONES.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e51DA2 ();
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

   public void weDA2( )
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

   public void paDA2( )
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
            GX_FocusControl = edtavSdtencabezadopedido_discolnom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvcomboprocdscDA0( String AV18EmprCod ,
                                      String A13771ProCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvcomboprocdsc_dataDA0( AV18EmprCod, A13771ProCDsc) ;
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

   protected void gxsgvvcomboprocdsc_dataDA0( String AV18EmprCod ,
                                              String A13771ProCDsc )
   {
      l13771ProCDsc = GXutil.concat( GXutil.rtrim( A13771ProCDsc), "%", "") ;
      /* Using cursor H00DA2 */
      pr_default.execute(0, new Object[] {l13771ProCDsc, AV18EmprCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DA2_A13771ProCDsc[0]);
         gxdynajaxctrldescr.add(H00DA2_A13771ProCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvsdtencabezadopedido_clicodDA0( String AV18EmprCod ,
                                                   String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvsdtencabezadopedido_clicod_dataDA0( AV18EmprCod, A13735CliCNom) ;
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

   protected void gxsgvsdtencabezadopedido_clicod_dataDA0( String AV18EmprCod ,
                                                           String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H00DA3 */
      pr_default.execute(1, new Object[] {l13735CliCNom, AV18EmprCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DA3_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(H00DA3_A13735CliCNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvclicodDA0( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicod_dataDA0( A13735CliCNom) ;
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

   protected void gxsgvvclicod_dataDA0( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H00DA4 */
      pr_default.execute(2, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00DA4_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00DA4_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(H00DA4_A13735CliCNom[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxhcvvcomboprocdscDA4( String AV18EmprCod ,
                                      String A13771ProCDsc )
   {
      /* Using cursor H00DA5 */
      pr_default.execute(3, new Object[] {A13771ProCDsc, AV18EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13771ProCDsc = H00DA5_A13771ProCDsc[0] ;
         A396EmprCod = H00DA5_A396EmprCod[0] ;
         A758ProCod = H00DA5_A758ProCod[0] ;
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\"") ;
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
      pr_default.close(3);
   }

   public void gxhcvsdtencabezadopedido_clicodDA2( String AV18EmprCod ,
                                                   String A13735CliCNom )
   {
      /* Using cursor H00DA6 */
      pr_default.execute(4, new Object[] {A13735CliCNom, AV18EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A279CliNom = H00DA6_A279CliNom[0] ;
         A13735CliCNom = H00DA6_A13735CliCNom[0] ;
         A396EmprCod = H00DA6_A396EmprCod[0] ;
         A252CliCod = H00DA6_A252CliCod[0] ;
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(4);
   }

   public void gxhcvvclicodDA2( String A13735CliCNom )
   {
      /* Using cursor H00DA7 */
      pr_default.execute(5, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.strcmp(H00DA7_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = H00DA7_A13735CliCNom[0] ;
            A396EmprCod = H00DA7_A396EmprCod[0] ;
            A252CliCod = H00DA7_A252CliCod[0] ;
         }
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(5);
   }

   public void gxdlvsdtencabezadopedido_distipcolDA2( String AV18EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvsdtencabezadopedido_distipcol_dataDA2( AV18EmprCod) ;
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

   public void gxvsdtencabezadopedido_distipcol_htmlDA2( String AV18EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlvsdtencabezadopedido_distipcol_dataDA2( AV18EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavSdtencabezadopedido_distipcol.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavSdtencabezadopedido_distipcol.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 2, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvsdtencabezadopedido_distipcol_dataDA2( String AV18EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add(GXutil.ltrimstr( DecimalUtil.doubleToDec(0), 9, 0));
      gxdynajaxctrldescr.add(httpContext.getMessage( "GX_EmptyItemText", ""));
      /* Using cursor H00DA8 */
      pr_default.execute(6, new Object[] {AV18EmprCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00DA8_A831TipColCod[0], (byte)(2), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DA8_A832TipColDsc[0]));
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void gxnrencabezado01_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_322( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         sendrow_322( ) ;
         nGXsfl_32_idx = ((subEncabezado01_Islastpage==1)&&(nGXsfl_32_idx+1>subencabezado01_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Encabezado01Container)) ;
      /* End function gxnrEncabezado01_newrow */
   }

   public void gxnrencabezado04_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1713( ) ;
      while ( nGXsfl_171_idx <= nRC_GXsfl_171 )
      {
         sendrow_1713( ) ;
         nGXsfl_171_idx = ((subEncabezado04_Islastpage==1)&&(nGXsfl_171_idx+1>subencabezado04_fnc_recordsperpage( )) ? 1 : nGXsfl_171_idx+1) ;
         sGXsfl_171_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_171_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1713( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Encabezado04Container)) ;
      /* End function gxnrEncabezado04_newrow */
   }

   public void gxnrgridsdtarticulopedidos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_3334( ) ;
      while ( nGXsfl_333_idx <= nRC_GXsfl_333 )
      {
         sendrow_3334( ) ;
         nGXsfl_333_idx = ((subGridsdtarticulopedidos_Islastpage==1)&&(nGXsfl_333_idx+1>subgridsdtarticulopedidos_fnc_recordsperpage( )) ? 1 : nGXsfl_333_idx+1) ;
         sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3334( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtarticulopedidosContainer)) ;
      /* End function gxnrGridsdtarticulopedidos_newrow */
   }

   public void gxgrencabezado01_refresh( int subGridsdtarticulopedidos_Rows ,
                                         boolean AV6AplicadoSetWebSession ,
                                         app.SdtSdtEncabezadoPedido AV39SdtEnCabezadoPedido ,
                                         GXBaseCollection<app.SdtSdtArticuloPedido> AV38SdtArticuloPedidos ,
                                         int AV9CliCod ,
                                         String AV12Contexto ,
                                         boolean AV11ColorEncontrado ,
                                         boolean AV58ColorPrompt ,
                                         boolean AV32Realizado )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e29DA2 ();
      ENCABEZADO01_nCurrentRecord = 0 ;
      rfDA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrEncabezado01_refresh */
   }

   public void gxgrencabezado04_refresh( int subGridsdtarticulopedidos_Rows ,
                                         boolean AV6AplicadoSetWebSession ,
                                         app.SdtSdtEncabezadoPedido AV39SdtEnCabezadoPedido ,
                                         GXBaseCollection<app.SdtSdtArticuloPedido> AV38SdtArticuloPedidos ,
                                         String AV12Contexto ,
                                         boolean AV11ColorEncontrado ,
                                         boolean AV58ColorPrompt ,
                                         boolean AV32Realizado )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e29DA2 ();
      ENCABEZADO04_nCurrentRecord = 0 ;
      rfDA3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrEncabezado04_refresh */
   }

   public void gxgrgridsdtarticulopedidos_refresh( int subGridsdtarticulopedidos_Rows ,
                                                   boolean AV6AplicadoSetWebSession ,
                                                   app.SdtSdtEncabezadoPedido AV39SdtEnCabezadoPedido ,
                                                   GXBaseCollection<app.SdtSdtArticuloPedido> AV38SdtArticuloPedidos ,
                                                   String AV12Contexto ,
                                                   String AV18EmprCod ,
                                                   boolean AV11ColorEncontrado ,
                                                   boolean AV58ColorPrompt ,
                                                   boolean AV32Realizado )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e29DA2 ();
      GRIDSDTARTICULOPEDIDOS_nCurrentRecord = 0 ;
      rfDA4( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtarticulopedidos_refresh */
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
      AV11ColorEncontrado = GXutil.strtobool( GXutil.booltostr( AV11ColorEncontrado)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      AV58ColorPrompt = GXutil.strtobool( GXutil.booltostr( AV58ColorPrompt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58ColorPrompt", AV58ColorPrompt);
      if ( dynavSdtencabezadopedido_distipcol.getItemCount() > 0 )
      {
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( (byte)(GXutil.lval( dynavSdtencabezadopedido_distipcol.getValidValue(GXutil.trim( GXutil.str( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol(), 2, 0))))) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavSdtencabezadopedido_distipcol.setValue( GXutil.trim( GXutil.str( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol(), 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavSdtencabezadopedido_distipcol.getInternalname(), "Values", dynavSdtencabezadopedido_distipcol.ToJavascriptSource(), true);
      }
      AV32Realizado = GXutil.strtobool( GXutil.booltostr( AV32Realizado)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Realizado", AV32Realizado);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      /* Execute user event: Refresh */
      e29DA2 ();
      rfDA2( ) ;
      rfDA3( ) ;
      rfDA4( ) ;
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
      edtavSeleccionarcolor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSeleccionarcolor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSeleccionarcolor_Enabled), 5, 0), true);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtarticulopedidos__disartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtarticulopedidos__disartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtarticulopedidos__disartcod_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtarticulopedidos__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtarticulopedidos__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtarticulopedidos__artdsc_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavInsert_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInsert_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInsert_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtarticulopedidos__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtarticulopedidos__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtarticulopedidos__procod_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_333_Refreshing);
   }

   public void rfDA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Encabezado01Container.ClearRows();
      }
      wbStart = (short)(32) ;
      e32DA2 ();
      nGXsfl_32_idx = 1 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_322( ) ;
      bGXsfl_32_Refreshing = true ;
      Encabezado01Container.AddObjectProperty("GridName", "Encabezado01");
      Encabezado01Container.AddObjectProperty("CmpContext", "");
      Encabezado01Container.AddObjectProperty("InMasterPage", "false");
      Encabezado01Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Encabezado01Container.AddObjectProperty("Class", "FreeStyleGrid");
      Encabezado01Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Encabezado01Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Encabezado01Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Encabezado01Container.setPageSize( subencabezado01_fnc_recordsperpage( ) );
      if ( subEncabezado01_Islastpage != 0 )
      {
         ENCABEZADO01_nFirstRecordOnPage = (long)(subencabezado01_fnc_recordcount( )-subencabezado01_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "ENCABEZADO01_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( ENCABEZADO01_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("ENCABEZADO01_nFirstRecordOnPage", ENCABEZADO01_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_322( ) ;
         e30DA2 ();
         wbEnd = (short)(32) ;
         wbDA0( ) ;
      }
      bGXsfl_32_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTO", AV12Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Contexto, ""))));
   }

   public void rfDA3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Encabezado04Container.ClearRows();
      }
      wbStart = (short)(171) ;
      nGXsfl_171_idx = 1 ;
      sGXsfl_171_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_171_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1713( ) ;
      bGXsfl_171_Refreshing = true ;
      Encabezado04Container.AddObjectProperty("GridName", "Encabezado04");
      Encabezado04Container.AddObjectProperty("CmpContext", "");
      Encabezado04Container.AddObjectProperty("InMasterPage", "false");
      Encabezado04Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Encabezado04Container.AddObjectProperty("Class", "FreeStyleGrid");
      Encabezado04Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Encabezado04Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Encabezado04Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Encabezado04Container.setPageSize( subencabezado04_fnc_recordsperpage( ) );
      if ( subEncabezado01_Islastpage != 0 )
      {
         ENCABEZADO01_nFirstRecordOnPage = (long)(subencabezado01_fnc_recordcount( )-subencabezado01_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "ENCABEZADO01_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( ENCABEZADO01_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("ENCABEZADO01_nFirstRecordOnPage", ENCABEZADO01_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1713( ) ;
         e42DA3 ();
         wbEnd = (short)(171) ;
         wbDA0( ) ;
      }
      bGXsfl_171_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDA3( )
   {
   }

   public void rfDA4( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtarticulopedidosContainer.ClearRows();
      }
      wbStart = (short)(333) ;
      nGXsfl_333_idx = 1 ;
      sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3334( ) ;
      bGXsfl_333_Refreshing = true ;
      GridsdtarticulopedidosContainer.AddObjectProperty("GridName", "Gridsdtarticulopedidos");
      GridsdtarticulopedidosContainer.AddObjectProperty("CmpContext", "");
      GridsdtarticulopedidosContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtarticulopedidosContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtarticulopedidosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtarticulopedidosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtarticulopedidosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtarticulopedidosContainer.setPageSize( subgridsdtarticulopedidos_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_3334( ) ;
         e34DA4 ();
         if ( ( GRIDSDTARTICULOPEDIDOS_nCurrentRecord > 0 ) && ( GRIDSDTARTICULOPEDIDOS_nGridOutOfScope == 0 ) && ( nGXsfl_333_idx == 1 ) )
         {
            GRIDSDTARTICULOPEDIDOS_nCurrentRecord = 0 ;
            GRIDSDTARTICULOPEDIDOS_nGridOutOfScope = 1 ;
            subgridsdtarticulopedidos_firstpage( ) ;
            e34DA4 ();
         }
         wbEnd = (short)(333) ;
         wbDA0( ) ;
      }
      bGXsfl_333_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDA4( )
   {
   }

   public int subencabezado01_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subencabezado01_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subencabezado01_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subencabezado01_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subencabezado04_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subencabezado04_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subencabezado04_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subencabezado04_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridsdtarticulopedidos_fnc_pagecount( )
   {
      GRIDSDTARTICULOPEDIDOS_nRecordCount = subgridsdtarticulopedidos_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTARTICULOPEDIDOS_nRecordCount) % (subgridsdtarticulopedidos_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTARTICULOPEDIDOS_nRecordCount/ (double) (subgridsdtarticulopedidos_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTARTICULOPEDIDOS_nRecordCount/ (double) (subgridsdtarticulopedidos_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtarticulopedidos_fnc_recordcount( )
   {
      return AV38SdtArticuloPedidos.size() ;
   }

   public int subgridsdtarticulopedidos_fnc_recordsperpage( )
   {
      if ( subGridsdtarticulopedidos_Rows > 0 )
      {
         return subGridsdtarticulopedidos_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtarticulopedidos_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage/ (double) (subgridsdtarticulopedidos_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtarticulopedidos_firstpage( )
   {
      GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtarticulopedidos_nextpage( )
   {
      GRIDSDTARTICULOPEDIDOS_nRecordCount = subgridsdtarticulopedidos_fnc_recordcount( ) ;
      if ( ( GRIDSDTARTICULOPEDIDOS_nRecordCount >= subgridsdtarticulopedidos_fnc_recordsperpage( ) ) && ( GRIDSDTARTICULOPEDIDOS_nEOF == 0 ) )
      {
         GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage+subgridsdtarticulopedidos_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtarticulopedidosContainer.AddObjectProperty("GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTARTICULOPEDIDOS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtarticulopedidos_previouspage( )
   {
      if ( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage >= subgridsdtarticulopedidos_fnc_recordsperpage( ) )
      {
         GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage-subgridsdtarticulopedidos_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtarticulopedidos_lastpage( )
   {
      GRIDSDTARTICULOPEDIDOS_nRecordCount = subgridsdtarticulopedidos_fnc_recordcount( ) ;
      if ( GRIDSDTARTICULOPEDIDOS_nRecordCount > subgridsdtarticulopedidos_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTARTICULOPEDIDOS_nRecordCount) % (subgridsdtarticulopedidos_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTARTICULOPEDIDOS_nRecordCount-subgridsdtarticulopedidos_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = (long)(GRIDSDTARTICULOPEDIDOS_nRecordCount-((int)((GRIDSDTARTICULOPEDIDOS_nRecordCount) % (subgridsdtarticulopedidos_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtarticulopedidos_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = (long)(subgridsdtarticulopedidos_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSeleccionarcolor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSeleccionarcolor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSeleccionarcolor_Enabled), 5, 0), true);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtarticulopedidos__disartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtarticulopedidos__disartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtarticulopedidos__disartcod_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtarticulopedidos__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtarticulopedidos__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtarticulopedidos__artdsc_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavInsert_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInsert_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInsert_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtarticulopedidos__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtarticulopedidos__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtarticulopedidos__procod_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_333_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e28DA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      gxvsdtencabezadopedido_distipcol_htmlDA2( AV18EmprCod) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTENCABEZADOPEDIDO"), AV39SdtEnCabezadoPedido);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtencabezadopedido"), AV39SdtEnCabezadoPedido);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtarticulopedidos"), AV38SdtArticuloPedidos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTCDSC_DATA"), AV75ArtCDsc_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTENCABEZADOPEDIDO_PROCECOD_DATA"), AV67SdtEnCabezadoPedido_ProceCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTENCABEZADOPEDIDO_COD_IDTX_DATA"), AV63SdtEnCabezadoPedido_Cod_Idtx_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTARTICULOPEDIDOS"), AV38SdtArticuloPedidos);
         /* Read saved values. */
         nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_171 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_171"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_333 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_333"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV23GridSdtArticuloPedidosCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTARTICULOPEDIDOSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV24GridSdtArticuloPedidosPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTARTICULOPEDIDOSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV18EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTARTICULOPEDIDOS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtarticulopedidos_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
         Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
         Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
         Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
         Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
         Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
         Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
         Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
         Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
         Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
         Combo_artcdsc_Cls = httpContext.cgiGet( "COMBO_ARTCDSC_Cls") ;
         Combo_artcdsc_Selectedvalue_set = httpContext.cgiGet( "COMBO_ARTCDSC_Selectedvalue_set") ;
         Gridsdtarticulopedidospaginationbar_Class = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Class") ;
         Gridsdtarticulopedidospaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Showfirst")) ;
         Gridsdtarticulopedidospaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Showprevious")) ;
         Gridsdtarticulopedidospaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Shownext")) ;
         Gridsdtarticulopedidospaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Showlast")) ;
         Gridsdtarticulopedidospaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtarticulopedidospaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtarticulopedidospaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtarticulopedidospaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Emptygridclass") ;
         Gridsdtarticulopedidospaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtarticulopedidospaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtarticulopedidospaginationbar_Previous = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Previous") ;
         Gridsdtarticulopedidospaginationbar_Next = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Next") ;
         Gridsdtarticulopedidospaginationbar_Caption = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Caption") ;
         Gridsdtarticulopedidospaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtarticulopedidospaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         Combo_sdtencabezadopedido_procecod_Cls = httpContext.cgiGet( "COMBO_SDTENCABEZADOPEDIDO_PROCECOD_Cls") ;
         Combo_sdtencabezadopedido_procecod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_SDTENCABEZADOPEDIDO_PROCECOD_Titlecontrolidtoreplace") ;
         Combo_sdtencabezadopedido_procecod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SDTENCABEZADOPEDIDO_PROCECOD_Isgriditem")) ;
         Combo_sdtencabezadopedido_cod_idtx_Cls = httpContext.cgiGet( "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX_Cls") ;
         Combo_sdtencabezadopedido_cod_idtx_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX_Titlecontrolidtoreplace") ;
         Combo_sdtencabezadopedido_cod_idtx_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX_Isgriditem")) ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Gridsdtarticulopedidos_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOS_EMPOWERER_Gridinternalname") ;
         Gridsdtarticulopedidospaginationbar_Selectedpage = httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Selectedpage") ;
         Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_333 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_333"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_333_fel_idx = 0 ;
         while ( nGXsfl_333_fel_idx < nRC_GXsfl_333 )
         {
            nGXsfl_333_fel_idx = ((subGridsdtarticulopedidos_Islastpage==1)&&(nGXsfl_333_fel_idx+1>subgridsdtarticulopedidos_fnc_recordsperpage( )) ? 1 : nGXsfl_333_fel_idx+1) ;
            sGXsfl_333_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_3334( ) ;
            AV109GXV31 = (int)(nGXsfl_333_fel_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
            if ( ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) && ( AV109GXV31 > 0 ) )
            {
               AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
               AV15Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
               AV26Insert = httpContext.cgiGet( edtavInsert_Internalname) ;
               hV76ComboProCDsc = httpContext.cgiGet( edtavComboprocdsc_Internalname) ;
               AV30ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
               AV31ProDsc = httpContext.cgiGet( edtavProdsc_Internalname) ;
               AV44Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
            }
            GXCCtl = "GXHCvCOMBOPROCDSC_" + sGXsfl_333_fel_idx ;
            AV76ComboProCDsc = httpContext.cgiGet( GXCCtl) ;
            if ( ! httpContext.isAjaxRequest( ) )
            {
               GXCCtl = "GXHCvCOMBOPROCDSC_" + sGXsfl_333_fel_idx ;
               AV76ComboProCDsc = httpContext.cgiGet( GXCCtl) ;
            }
         }
         if ( nGXsfl_333_fel_idx == 0 )
         {
            nGXsfl_333_idx = 1 ;
            sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_3334( ) ;
         }
         nGXsfl_333_fel_idx = 1 ;
         /* Read variables values. */
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnom( httpContext.cgiGet( edtavSdtencabezadopedido_discolnom_Internalname) );
         AV42SeleccionarColor = httpContext.cgiGet( edtavSeleccionarcolor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42SeleccionarColor", AV42SeleccionarColor);
         AV11ColorEncontrado = GXutil.strtobool( httpContext.cgiGet( chkavColorencontrado.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
         AV58ColorPrompt = GXutil.strtobool( httpContext.cgiGet( chkavColorprompt.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58ColorPrompt", AV58ColorPrompt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_discolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_discolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SDTENCABEZADOPEDIDO_DISCOLNUM");
            GX_FocusControl = edtavSdtencabezadopedido_discolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( 0 );
         }
         else
         {
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( (int)(localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_discolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
         }
         dynavSdtencabezadopedido_distipcol.setName( dynavSdtencabezadopedido_distipcol.getInternalname() );
         dynavSdtencabezadopedido_distipcol.setValue( httpContext.cgiGet( dynavSdtencabezadopedido_distipcol.getInternalname()) );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( (byte)(GXutil.lval( httpContext.cgiGet( dynavSdtencabezadopedido_distipcol.getInternalname()))) );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnomcli( httpContext.cgiGet( edtavSdtencabezadopedido_disnomcli_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_disnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_disnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SDTENCABEZADOPEDIDO_DISNUMCLI");
            GX_FocusControl = edtavSdtencabezadopedido_disnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( 0 );
         }
         else
         {
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( (int)(localUtil.ctol( httpContext.cgiGet( edtavSdtencabezadopedido_disnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
         }
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disobs( httpContext.cgiGet( edtavSdtencabezadopedido_disobs_Internalname) );
         AV74ArtCDsc = httpContext.cgiGet( edtavArtcdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74ArtCDsc", AV74ArtCDsc);
         AV14DatosPedidoJSON = httpContext.cgiGet( edtavDatospedidojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
         AV16DisArtCod = httpContext.cgiGet( edtavDisartcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DisArtCod", AV16DisArtCod);
         AV5Adicionar = httpContext.cgiGet( edtavAdicionar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Adicionar", AV5Adicionar);
         AV32Realizado = GXutil.strtobool( httpContext.cgiGet( chkavRealizado.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Realizado", AV32Realizado);
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
      e28DA2 ();
      if (returnInSub) return;
   }

   public void e28DA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5Adicionar = "<i class=\"fa fa-cog fa-spin fa-1x fa-fw\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Adicionar", AV5Adicionar);
      AV42SeleccionarColor = "<i class=\"fa fa-cog fa-spin fa-1x fa-fw\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42SeleccionarColor", AV42SeleccionarColor);
      GXt_char1 = AV18EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      webdatospedido_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      AV12Contexto = "CapturaDatosPedidosCliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Contexto", AV12Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Contexto, ""))));
      AV14DatosPedidoJSON = AV45WebSession.getValue(AV12Contexto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
      if ( (GXutil.strcmp("", AV14DatosPedidoJSON)==0) )
      {
         /* Execute user subroutine: 'GENERAR SDT' */
         S112 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: 'CARGAR DATOS EN PANTALLA' */
         S122 ();
         if (returnInSub) return;
         AV9CliCod = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliCod), 6, 0));
         /* Using cursor H00DA9 */
         pr_default.execute(7, new Object[] {Integer.valueOf(AV9CliCod)});
         hV9CliCod = "" ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            hV9CliCod = H00DA9_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(7);
         httpContext.ajax_rsp_assign_attri("", false, "hV9CliCod", hV9CliCod);
      }
      if ( (0==AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod()) )
      {
         GX_FocusControl = edtavSdtencabezadopedido_clicod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GX_FocusControl = edtavSdtencabezadopedido_disenccli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Execute user subroutine: 'CARGAR DATOS NORMATIVAS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'MANEJO DE VISIBLES' */
      S142 ();
      if (returnInSub) return;
      subGridsdtarticulopedidos_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue = subGridsdtarticulopedidos_Rows ;
      ucGridsdtarticulopedidospaginationbar.sendProperty(context, "", false, Gridsdtarticulopedidospaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue), 9, 0));
      subGridsdtarticulopedidos_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue = subGridsdtarticulopedidos_Rows ;
      ucGridsdtarticulopedidospaginationbar.sendProperty(context, "", false, Gridsdtarticulopedidospaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV118Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webdatospedido_impl.this.GXt_char1 = GXv_char2[0] ;
      AV118Station = GXt_char1 ;
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV119Emprnom ;
      GXv_char4[0] = AV120Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV118Station, GXv_char2, GXv_char3, GXv_char4) ;
      webdatospedido_impl.this.AV18EmprCod = GXv_char2[0] ;
      webdatospedido_impl.this.AV119Emprnom = GXv_char3[0] ;
      webdatospedido_impl.this.AV120Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      edtavArtcdsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcdsc_Visible), 5, 0), true);
      Combo_sdtencabezadopedido_cod_idtx_Titlecontrolidtoreplace = edtavSdtencabezadopedido_cod_idtx_Internalname ;
      ucCombo_sdtencabezadopedido_cod_idtx.sendProperty(context, "", false, Combo_sdtencabezadopedido_cod_idtx_Internalname, "TitleControlIdToReplace", Combo_sdtencabezadopedido_cod_idtx_Titlecontrolidtoreplace);
      Combo_sdtencabezadopedido_procecod_Titlecontrolidtoreplace = edtavSdtencabezadopedido_procecod_Internalname ;
      ucCombo_sdtencabezadopedido_procecod.sendProperty(context, "", false, Combo_sdtencabezadopedido_procecod_Internalname, "TitleControlIdToReplace", Combo_sdtencabezadopedido_procecod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOSDTENCABEZADOPEDIDO_PROCECOD' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOSDTENCABEZADOPEDIDO_COD_IDTX' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOARTCDSC' */
      S172 ();
      if (returnInSub) return;
      edtavDatospedidojson_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatospedidojson_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatospedidojson_Visible), 5, 0), true);
      edtavDisartcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Visible), 5, 0), true);
      edtavAdicionar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAdicionar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAdicionar_Visible), 5, 0), true);
      chkavRealizado.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavRealizado.getInternalname(), "Visible", GXutil.ltrimstr( chkavRealizado.getVisible(), 5, 0), true);
      Gridsdtarticulopedidos_empowerer_Gridinternalname = subGridsdtarticulopedidos_Internalname ;
      ucGridsdtarticulopedidos_empowerer.sendProperty(context, "", false, Gridsdtarticulopedidos_empowerer_Internalname, "GridInternalName", Gridsdtarticulopedidos_empowerer_Gridinternalname);
      subGridsdtarticulopedidos_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue = subGridsdtarticulopedidos_Rows ;
      ucGridsdtarticulopedidospaginationbar.sendProperty(context, "", false, Gridsdtarticulopedidospaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue), 9, 0));
      chkavColorencontrado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavColorencontrado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavColorencontrado.getEnabled(), 5, 0), true);
      chkavColorprompt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavColorprompt.getInternalname(), "Enabled", GXutil.ltrimstr( chkavColorprompt.getEnabled(), 5, 0), true);
   }

   public void e29DA2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      if ( ! AV6AplicadoSetWebSession )
      {
         /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
         S182 ();
         if (returnInSub) return;
      }
      if ( AV6AplicadoSetWebSession )
      {
         /* Execute user subroutine: 'CARGAR DATOS EN PANTALLA' */
         S122 ();
         if (returnInSub) return;
         AV6AplicadoSetWebSession = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6AplicadoSetWebSession", AV6AplicadoSetWebSession);
      }
      AV23GridSdtArticuloPedidosCurrentPage = subgridsdtarticulopedidos_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23GridSdtArticuloPedidosCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridSdtArticuloPedidosCurrentPage), 10, 0));
      AV24GridSdtArticuloPedidosPageCount = subgridsdtarticulopedidos_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24GridSdtArticuloPedidosPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridSdtArticuloPedidosPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38SdtArticuloPedidos", AV38SdtArticuloPedidos);
   }

   private void e30DA2( )
   {
      /* Encabezado01_Load Routine */
      returnInSub = false ;
   }

   public void e11DA2( )
   {
      /* Gridsdtarticulopedidospaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtarticulopedidospaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtarticulopedidos_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtarticulopedidospaginationbar_Selectedpage, "Next") == 0 )
      {
         AV29PageToGo = subgridsdtarticulopedidos_fnc_currentpage( ) ;
         AV29PageToGo = (int)(AV29PageToGo+1) ;
         subgridsdtarticulopedidos_gotopage( AV29PageToGo) ;
      }
      else
      {
         AV29PageToGo = (int)(GXutil.lval( Gridsdtarticulopedidospaginationbar_Selectedpage)) ;
         subgridsdtarticulopedidos_gotopage( AV29PageToGo) ;
      }
   }

   public void e12DA2( )
   {
      /* Gridsdtarticulopedidospaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtarticulopedidos_Rows = Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtarticulopedidos_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e16DA2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDACIONES A REALIZAR' */
      S192 ();
      if (returnInSub) return;
      if ( AV56Messages.size() == 0 )
      {
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
      }
      else
      {
         AV121GXV40 = 1 ;
         while ( AV121GXV40 <= AV56Messages.size() )
         {
            AV54Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV56Messages.elementAt(-1+AV121GXV40));
            httpContext.GX_msglist.addItem(AV54Message.getgxTv_SdtMessages_Message_Description());
            AV121GXV40 = (int)(AV121GXV40+1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56Messages", AV56Messages);
   }

   public void e15DA2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S202 ();
         if (returnInSub) return;
      }
      if ( ! ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 ) )
      {
         callWebObject(formatLink("app.webdatospedido", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
      if ( gx_BV333 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38SdtArticuloPedidos", AV38SdtArticuloPedidos);
         nGXsfl_333_bak_idx = nGXsfl_333_idx ;
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
         nGXsfl_333_idx = nGXsfl_333_bak_idx ;
         sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3334( ) ;
      }
   }

   public void e17DA2( )
   {
      /* 'DoLimpiar' Routine */
      returnInSub = false ;
      AV14DatosPedidoJSON = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
      AV45WebSession.setValue(AV12Contexto, AV14DatosPedidoJSON);
      callWebObject(formatLink("app.webdatospedido", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void S202( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.resumendatospedido", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      new app.creardisposotrasbarcadotras(remoteHandle, context).execute( ) ;
      AV14DatosPedidoJSON = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
      AV45WebSession.setValue(AV12Contexto, AV14DatosPedidoJSON);
      AV39SdtEnCabezadoPedido.fromJSonString(AV14DatosPedidoJSON, null);
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'LOADCOMBOARTCDSC' Routine */
      returnInSub = false ;
      /* Using cursor H00DA10 */
      pr_default.execute(8, new Object[] {AV18EmprCod, Integer.valueOf(AV9CliCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A252CliCod = H00DA10_A252CliCod[0] ;
         A396EmprCod = H00DA10_A396EmprCod[0] ;
         A69ArtDsc = H00DA10_A69ArtDsc[0] ;
         n69ArtDsc = H00DA10_n69ArtDsc[0] ;
         A65ArtCod = H00DA10_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13751ArtCDsc", A13751ArtCDsc);
         AV59Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV59Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV59Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV75ArtCDsc_Data.add(AV59Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      Combo_artcdsc_Selectedvalue_set = AV74ArtCDsc ;
      ucCombo_artcdsc.sendProperty(context, "", false, Combo_artcdsc_Internalname, "SelectedValue_set", Combo_artcdsc_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'LOADCOMBOSDTENCABEZADOPEDIDO_COD_IDTX' Routine */
      returnInSub = false ;
      /* Using cursor H00DA11 */
      pr_default.execute(9, new Object[] {AV18EmprCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A396EmprCod = H00DA11_A396EmprCod[0] ;
         A10887Cod_Idtx = H00DA11_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = H00DA11_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = H00DA11_n10888Dsc_Idtx[0] ;
         AV59Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV59Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV59Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A10888Dsc_Idtx );
         AV63SdtEnCabezadoPedido_Cod_Idtx_Data.add(AV59Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S152( )
   {
      /* 'LOADCOMBOSDTENCABEZADOPEDIDO_PROCECOD' Routine */
      returnInSub = false ;
      /* Using cursor H00DA12 */
      pr_default.execute(10, new Object[] {AV18EmprCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A396EmprCod = H00DA12_A396EmprCod[0] ;
         A970ProceCod = H00DA12_A970ProceCod[0] ;
         A971ProceNom = H00DA12_A971ProceNom[0] ;
         n971ProceNom = H00DA12_n971ProceNom[0] ;
         AV59Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV59Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         AV59Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A971ProceNom );
         AV67SdtEnCabezadoPedido_ProceCod_Data.add(AV59Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void e14DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Combo_sdtencabezadopedido_cod_idtx_Onoptionclicked Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e13DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Combo_sdtencabezadopedido_procecod_Onoptionclicked Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e31DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (0==AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod()) )
      {
         AV9CliCod = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliCod), 6, 0));
         /* Using cursor H00DA13 */
         pr_default.execute(11, new Object[] {Integer.valueOf(AV9CliCod)});
         hV9CliCod = "" ;
         while ( (pr_default.getStatus(11) != 101) )
         {
            hV9CliCod = H00DA13_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(11);
         httpContext.ajax_rsp_assign_attri("", false, "hV9CliCod", hV9CliCod);
         /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
         S182 ();
         if (returnInSub) return;
         callWebObject(formatLink("app.webdatospedido", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e18DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Adicionar_Click Routine */
      returnInSub = false ;
      AV32Realizado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Realizado", AV32Realizado);
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.webdatospedidoarticulo", new String[] {GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Realizado"}) , new Object[] {"AV32Realizado"});
      AV6AplicadoSetWebSession = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AplicadoSetWebSession", AV6AplicadoSetWebSession);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e19DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Realizado_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV32Realizado )
      {
         AV32Realizado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Realizado", AV32Realizado);
         AV14DatosPedidoJSON = AV45WebSession.getValue(AV12Contexto) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
         AV39SdtEnCabezadoPedido.fromJSonString(AV14DatosPedidoJSON, null);
         AV38SdtArticuloPedidos = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido() ;
         gx_BV333 = true ;
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
      if ( gx_BV333 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38SdtArticuloPedidos", AV38SdtArticuloPedidos);
         nGXsfl_333_bak_idx = nGXsfl_333_idx ;
         gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
         nGXsfl_333_idx = nGXsfl_333_bak_idx ;
         sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3334( ) ;
      }
   }

   public void e35DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Delete_Click Routine */
      returnInSub = false ;
      AV43TemporalSdtArticuloPedido = (app.SdtSdtArticuloPedido)((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.currentItem());
      AV28NumeroIndex = (short)(AV38SdtArticuloPedidos.indexof(AV43TemporalSdtArticuloPedido)) ;
      AV38SdtArticuloPedidos.removeItem(AV28NumeroIndex);
      gx_BV333 = true ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38SdtArticuloPedidos", AV38SdtArticuloPedidos);
      nGXsfl_333_bak_idx = nGXsfl_333_idx ;
      gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      nGXsfl_333_idx = nGXsfl_333_bak_idx ;
      sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3334( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e36DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Update_Click Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).getgxTv_SdtSdtArticuloPedido_Procod())==0) )
      {
         if ( ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).getgxTv_SdtSdtArticuloPedido_Fases().size() == 0 )
         {
            /* Execute user subroutine: 'DETERMINAR FASES DE PROCESO' */
            S212 ();
            if (returnInSub) return;
         }
         if ( ! ( ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).getgxTv_SdtSdtArticuloPedido_Fases().size() == 0 ) )
         {
            AV43TemporalSdtArticuloPedido = (app.SdtSdtArticuloPedido)((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.currentItem());
            AV28NumeroIndex = (short)(AV38SdtArticuloPedidos.indexof(AV43TemporalSdtArticuloPedido)) ;
            if ( ! (0==AV28NumeroIndex) )
            {
               /* Window Datatype Object Property */
               AV46Window.setUrl( formatLink("app.webdatospedidofases", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV28NumeroIndex,4,0))}, new String[] {"NumeroItem"})  );
               AV46Window.setReturnParms(new Object[] {});
               httpContext.newWindow(AV46Window);
               AV6AplicadoSetWebSession = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AplicadoSetWebSession", AV6AplicadoSetWebSession);
            }
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Sin Datos de Fases", ""));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Sin Código Proceso", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38SdtArticuloPedidos", AV38SdtArticuloPedidos);
      nGXsfl_333_bak_idx = nGXsfl_333_idx ;
      gxgrgridsdtarticulopedidos_refresh( subGridsdtarticulopedidos_Rows, AV6AplicadoSetWebSession, AV39SdtEnCabezadoPedido, AV38SdtArticuloPedidos, AV12Contexto, AV18EmprCod, AV11ColorEncontrado, AV58ColorPrompt, AV32Realizado) ;
      nGXsfl_333_idx = nGXsfl_333_bak_idx ;
      sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3334( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41SdtFasePedidoCollection", AV41SdtFasePedidoCollection);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e20DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_discolnom_Controlvaluechanged Routine */
      returnInSub = false ;
      AV11ColorEncontrado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      GXv_int5[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum() ;
      GXv_int6[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol() ;
      GXv_int7[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli() ;
      GXv_char4[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli() ;
      GXv_char3[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs() ;
      GXv_boolean8[0] = AV11ColorEncontrado ;
      new app.datotcformu(remoteHandle, context).execute( AV18EmprCod, AV9CliCod, "", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom(), GXv_int5, GXv_int6, GXv_int7, GXv_char4, GXv_char3, GXv_boolean8) ;
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( GXv_int5[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( GXv_int6[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( GXv_int7[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnomcli( GXv_char4[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disobs( GXv_char3[0] );
      webdatospedido_impl.this.AV11ColorEncontrado = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      if ( ! AV11ColorEncontrado && ( ! (0==AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum()) || ! (0==AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol()) ) )
      {
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( 0 );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( (byte)(0) );
         GXv_int7[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum() ;
         GXv_int6[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol() ;
         GXv_int5[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli() ;
         GXv_char4[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli() ;
         GXv_char3[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs() ;
         GXv_boolean8[0] = AV11ColorEncontrado ;
         new app.datotcformu(remoteHandle, context).execute( AV18EmprCod, AV9CliCod, "", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom(), GXv_int7, GXv_int6, GXv_int5, GXv_char4, GXv_char3, GXv_boolean8) ;
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( GXv_int7[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( GXv_int6[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( GXv_int5[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnomcli( GXv_char4[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disobs( GXv_char3[0] );
         webdatospedido_impl.this.AV11ColorEncontrado = GXv_boolean8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      }
      if ( ! AV11ColorEncontrado )
      {
         /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e21DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Colorencontrado_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV11ColorEncontrado )
      {
         /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e22DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Colorprompt_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV58ColorPrompt )
      {
         AV11ColorEncontrado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
         GXv_int7[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum() ;
         GXv_int6[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol() ;
         GXv_int5[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli() ;
         GXv_char4[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli() ;
         GXv_char3[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs() ;
         GXv_boolean8[0] = AV11ColorEncontrado ;
         new app.datotcformu(remoteHandle, context).execute( AV18EmprCod, AV9CliCod, "", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom(), GXv_int7, GXv_int6, GXv_int5, GXv_char4, GXv_char3, GXv_boolean8) ;
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( GXv_int7[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( GXv_int6[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( GXv_int5[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnomcli( GXv_char4[0] );
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disobs( GXv_char3[0] );
         webdatospedido_impl.this.AV11ColorEncontrado = GXv_boolean8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
         if ( ! AV11ColorEncontrado )
         {
            /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
            S182 ();
            if (returnInSub) return;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e23DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_discolnum_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_int7[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum() ;
      GXv_int6[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol() ;
      GXv_int5[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli() ;
      GXv_char4[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli() ;
      GXv_char3[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs() ;
      GXv_boolean8[0] = AV11ColorEncontrado ;
      new app.datotcformu(remoteHandle, context).execute( AV18EmprCod, AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod(), "", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom(), GXv_int7, GXv_int6, GXv_int5, GXv_char4, GXv_char3, GXv_boolean8) ;
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( GXv_int7[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( GXv_int6[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( GXv_int5[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnomcli( GXv_char4[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disobs( GXv_char3[0] );
      webdatospedido_impl.this.AV11ColorEncontrado = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e24DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_distipcol_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_int7[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum() ;
      GXv_int6[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol() ;
      GXv_int5[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli() ;
      GXv_char4[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli() ;
      GXv_char3[0] = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs() ;
      GXv_boolean8[0] = AV11ColorEncontrado ;
      new app.datotcformu(remoteHandle, context).execute( AV18EmprCod, AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod(), "", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom(), GXv_int7, GXv_int6, GXv_int5, GXv_char4, GXv_char3, GXv_boolean8) ;
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Discolnum( GXv_int7[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Distipcol( GXv_int6[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnumcli( GXv_int5[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnomcli( GXv_char4[0] );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disobs( GXv_char3[0] );
      webdatospedido_impl.this.AV11ColorEncontrado = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e25DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disobs_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e26DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disnomcli_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e27DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disnumcli_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e43DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disexp_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MANEJO DE VISIBLES' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e44DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_nxt_artcli_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e45DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_dispart_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart()) )
      {
         httpContext.GX_msglist.addItem("Se requiere N° de Partida");
         GX_FocusControl = edtavSdtencabezadopedido_dispart_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e46DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_nxt_modelo_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e47DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_nxt_statio_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e48DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disordcomp_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e49DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disrec_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! ( GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(), "S") == 0 ) )
      {
         edtavSdtencabezadopedido_disdest_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSdtencabezadopedido_disdest_Internalname, "Caption", edtavSdtencabezadopedido_disdest_Caption, !bGXsfl_171_Refreshing);
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disdest( "" );
         edtavSdtencabezadopedido_disdest_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSdtencabezadopedido_disdest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtencabezadopedido_disdest_Visible), 5, 0), !bGXsfl_171_Refreshing);
      }
      else
      {
         edtavSdtencabezadopedido_disdest_Caption = "Motivo No Conforme" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSdtencabezadopedido_disdest_Internalname, "Caption", edtavSdtencabezadopedido_disdest_Caption, !bGXsfl_171_Refreshing);
         edtavSdtencabezadopedido_disdest_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSdtencabezadopedido_disdest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtencabezadopedido_disdest_Visible), 5, 0), !bGXsfl_171_Refreshing);
         GX_FocusControl = edtavSdtencabezadopedido_disdest_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e50DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disdest_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e37DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtarticulopedidos__disnumpie_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e38DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtarticulopedidos__kilos_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e39DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtarticulopedidos__metros_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e40DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtarticulopedidos__disartanh_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e41DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtarticulopedidos__disgraaca_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e32DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Encabezado01_Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGAR DATOS EN PANTALLA' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38SdtArticuloPedidos", AV38SdtArticuloPedidos);
   }

   public void e33DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_disenccli_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void e51DA2( )
   {
      AV109GXV31 = (int)(nGXsfl_333_idx+GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage) ;
      if ( ( AV109GXV31 > 0 ) && ( AV38SdtArticuloPedidos.size() >= AV109GXV31 ) )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
      }
      /* Sdtencabezadopedido_observaciones_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SdtEnCabezadoPedido", AV39SdtEnCabezadoPedido);
   }

   public void S212( )
   {
      /* 'DETERMINAR FASES DE PROCESO' Routine */
      returnInSub = false ;
      GXt_char1 = AV31ProDsc ;
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV30ProCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprodsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webdatospedido_impl.this.AV18EmprCod = GXv_char4[0] ;
      webdatospedido_impl.this.AV30ProCod = GXv_char3[0] ;
      webdatospedido_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV30ProCod);
      AV31ProDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV31ProDsc);
      if ( ! ( GXutil.strcmp(AV31ProDsc, "No existe proceso") == 0 ) && ! (GXutil.strcmp("", AV31ProDsc)==0) )
      {
         if ( ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).getgxTv_SdtSdtArticuloPedido_Fases().size() == 0 )
         {
            ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).setgxTv_SdtSdtArticuloPedido_Prodsc( AV31ProDsc );
            AV41SdtFasePedidoCollection.clear();
            /* Using cursor H00DA14 */
            pr_default.execute(12, new Object[] {AV18EmprCod, AV30ProCod});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A758ProCod = H00DA14_A758ProCod[0] ;
               A396EmprCod = H00DA14_A396EmprCod[0] ;
               A774ProNumLin = H00DA14_A774ProNumLin[0] ;
               A457FasCod = H00DA14_A457FasCod[0] ;
               A460FasDsc = H00DA14_A460FasDsc[0] ;
               A460FasDsc = H00DA14_A460FasDsc[0] ;
               AV40SdtFasePedido = (app.SdtSdtFasePedido)new app.SdtSdtFasePedido(remoteHandle, context);
               AV40SdtFasePedido.setgxTv_SdtSdtFasePedido_Disfaslin( A774ProNumLin );
               AV40SdtFasePedido.setgxTv_SdtSdtFasePedido_Fascod( A457FasCod );
               AV40SdtFasePedido.setgxTv_SdtSdtFasePedido_Fasdsc( A460FasDsc );
               AV41SdtFasePedidoCollection.add(AV40SdtFasePedido, 0);
               pr_default.readNext(12);
            }
            pr_default.close(12);
         }
      }
      else
      {
         AV41SdtFasePedidoCollection.clear();
      }
      ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).getgxTv_SdtSdtArticuloPedido_Fases().fromJSonString(AV41SdtFasePedidoCollection.toJSonString(false), null);
      /* Execute user subroutine: 'APLICAR SET WEBSESSION' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'APLICAR SET WEBSESSION' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest())==0) && ! ( GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(), "S") == 0 ) )
      {
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disdest( "" );
      }
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Articulopedido( AV38SdtArticuloPedidos );
      AV14DatosPedidoJSON = AV39SdtEnCabezadoPedido.toJSonString(false, true) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
      AV45WebSession.setValue(AV12Contexto, AV14DatosPedidoJSON);
   }

   public void S122( )
   {
      /* 'CARGAR DATOS EN PANTALLA' Routine */
      returnInSub = false ;
      AV14DatosPedidoJSON = AV45WebSession.getValue(AV12Contexto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14DatosPedidoJSON", AV14DatosPedidoJSON);
      AV39SdtEnCabezadoPedido.fromJSonString(AV14DatosPedidoJSON, null);
      AV38SdtArticuloPedidos = AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido() ;
      gx_BV333 = true ;
      if ( ! (GXutil.strcmp("", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest())==0) && ! ( GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(), "S") == 0 ) )
      {
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disdest( "" );
      }
   }

   public void S192( )
   {
      /* 'VALIDACIONES A REALIZAR' Routine */
      returnInSub = false ;
      AV56Messages.clear();
      if ( (GXutil.strcmp("", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest())==0) && ( GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(), "S") == 0 ) )
      {
         AV54Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV54Message.setgxTv_SdtMessages_Message_Id( "DisDest.IsEmpty()" );
         AV54Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Se requiere Motivo No Conforme", "") );
         AV56Messages.add(AV54Message, 0);
      }
      if ( (0==AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart()) )
      {
         AV54Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV54Message.setgxTv_SdtMessages_Message_Id( "DisPart.IsEmpty()" );
         AV54Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Se requiere N° Partida", "") );
         AV56Messages.add(AV54Message, 0);
      }
   }

   public void S142( )
   {
      /* 'MANEJO DE VISIBLES' Routine */
      returnInSub = false ;
      edtavDatospedidojson_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatospedidojson_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatospedidojson_Visible), 5, 0), true);
      edtavInsert_Visible = (((GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdes(), "S")==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInsert_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInsert_Visible), 5, 0), !bGXsfl_333_Refreshing);
      edtavSdtencabezadopedido_disdest_Visible = (((GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(), "S")==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtencabezadopedido_disdest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtencabezadopedido_disdest_Visible), 5, 0), !bGXsfl_171_Refreshing);
      lblTextblocksdtencabezadopedido_nxt_artcli_Visible = (((GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disexp(), "E")==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblocksdtencabezadopedido_nxt_artcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblocksdtencabezadopedido_nxt_artcli_Visible), 5, 0), !bGXsfl_171_Refreshing);
      cmbavSdtencabezadopedido_nxt_artcli.setVisible( (((GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disexp(), "E")==0)) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSdtencabezadopedido_nxt_artcli.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSdtencabezadopedido_nxt_artcli.getVisible(), 5, 0), !bGXsfl_171_Refreshing);
   }

   public void S132( )
   {
      /* 'CARGAR DATOS NORMATIVAS' Routine */
      returnInSub = false ;
      AV8CantidadNormas = (short)(0) ;
      AV126GXLvl651 = (byte)(0) ;
      /* Using cursor H00DA15 */
      pr_default.execute(13, new Object[] {AV18EmprCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A396EmprCod = H00DA15_A396EmprCod[0] ;
         A13218NormaDsc = H00DA15_A13218NormaDsc[0] ;
         n13218NormaDsc = H00DA15_n13218NormaDsc[0] ;
         A13217NormaID = H00DA15_A13217NormaID[0] ;
         AV126GXLvl651 = (byte)(1) ;
         AV8CantidadNormas = (short)(AV8CantidadNormas+1) ;
         if ( AV8CantidadNormas == 1 )
         {
            lblTextblocksdtencabezadopedido_disnormst01_Caption = A13218NormaDsc ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextblocksdtencabezadopedido_disnormst01_Internalname, "Caption", lblTextblocksdtencabezadopedido_disnormst01_Caption, !bGXsfl_171_Refreshing);
            if ( (GXutil.strcmp("", AV14DatosPedidoJSON)==0) )
            {
               AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormid01( A13217NormaID );
               AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst01( "N" );
            }
         }
         else if ( AV8CantidadNormas == 2 )
         {
            lblTextblocksdtencabezadopedido_disnormst02_Caption = A13218NormaDsc ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextblocksdtencabezadopedido_disnormst02_Internalname, "Caption", lblTextblocksdtencabezadopedido_disnormst02_Caption, !bGXsfl_171_Refreshing);
            if ( (GXutil.strcmp("", AV14DatosPedidoJSON)==0) )
            {
               AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormid02( A13217NormaID );
               AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst02( "N" );
            }
         }
         else if ( AV8CantidadNormas == 3 )
         {
            lblTextblocksdtencabezadopedido_disnormst03_Caption = A13218NormaDsc ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextblocksdtencabezadopedido_disnormst03_Internalname, "Caption", lblTextblocksdtencabezadopedido_disnormst03_Caption, !bGXsfl_171_Refreshing);
            if ( (GXutil.strcmp("", AV14DatosPedidoJSON)==0) )
            {
               AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormid03( A13217NormaID );
               AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst03( "N" );
            }
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
      if ( AV126GXLvl651 == 0 )
      {
         if ( (GXutil.strcmp("", AV14DatosPedidoJSON)==0) )
         {
            AV8CantidadNormas = (short)(AV8CantidadNormas+1) ;
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormid01( GXutil.trim( GXutil.str( AV8CantidadNormas, 4, 0)) );
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst01( "N" );
            AV8CantidadNormas = (short)(AV8CantidadNormas+1) ;
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormid02( GXutil.trim( GXutil.str( AV8CantidadNormas, 4, 0)) );
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst02( "N" );
            AV8CantidadNormas = (short)(AV8CantidadNormas+1) ;
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormid03( GXutil.trim( GXutil.str( AV8CantidadNormas, 4, 0)) );
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disnormst03( "N" );
         }
      }
   }

   public void S112( )
   {
      /* 'GENERAR SDT' Routine */
      returnInSub = false ;
      AV39SdtEnCabezadoPedido = (app.SdtSdtEncabezadoPedido)new app.SdtSdtEncabezadoPedido(remoteHandle, context);
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disfec( GXutil.now( ) );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disfeccli( GXutil.now( ) );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disfecent( (GXutil.dadd(GXutil.today( ),+(2))) );
      GXt_int9 = AV20FlagPS ;
      GXv_int6[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, "PZASS", GXv_int6) ;
      webdatospedido_impl.this.GXt_int9 = GXv_int6[0] ;
      AV20FlagPS = GXt_int9 ;
      AV17DisDes = ((AV20FlagPS==1) ? "S" : "N") ;
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disdes( AV17DisDes );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Disexp( "N" );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Dispart( (short)(1) );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_modelo( "NAO" );
      AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_statio( "NAO" );
      /* Execute user subroutine: 'CARGAR DATOS NORMATIVAS' */
      S132 ();
      if (returnInSub) return;
   }

   private void e42DA3( )
   {
      /* Encabezado04_Load Routine */
      returnInSub = false ;
   }

   private void e34DA4( )
   {
      /* Gridsdtarticulopedidos_Load Routine */
      returnInSub = false ;
      AV109GXV31 = 1 ;
      while ( AV109GXV31 <= AV38SdtArticuloPedidos.size() )
      {
         AV38SdtArticuloPedidos.currentItem( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)) );
         AV15Delete = "<i class=\"fa fa-times\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDelete_Internalname, AV15Delete);
         AV26Insert = httpContext.getMessage( "GXM_insert", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInsert_Internalname, AV26Insert);
         AV44Update = "<i class=\"fa fa-pen\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV44Update);
         if ( GXutil.strcmp(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdes(), "S") == 0 )
         {
            AV26Insert = "<i class=\"fa fa-plus\"></i>" ;
            httpContext.ajax_rsp_assign_attri("", false, edtavInsert_Internalname, AV26Insert);
         }
         AV44Update = "<i class=\"fa fa-list-ol\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV44Update);
         AV76ComboProCDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76ComboProCDsc", AV76ComboProCDsc);
         /* Using cursor H00DA16 */
         pr_default.execute(14, new Object[] {AV18EmprCod, AV76ComboProCDsc});
         hV76ComboProCDsc = "" ;
         while ( (pr_default.getStatus(14) != 101) )
         {
            hV76ComboProCDsc = H00DA16_A13771ProCDsc[0] ;
            if (true) break;
         }
         pr_default.close(14);
         httpContext.ajax_rsp_assign_attri("", false, "hV76ComboProCDsc", hV76ComboProCDsc);
         AV30ProCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV30ProCod);
         AV31ProDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV31ProDsc);
         AV30ProCod = ((app.SdtSdtArticuloPedido)(AV38SdtArticuloPedidos.currentItem())).getgxTv_SdtSdtArticuloPedido_Procod() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV30ProCod);
         GXt_char1 = AV31ProDsc ;
         GXv_char4[0] = AV18EmprCod ;
         GXv_char3[0] = AV30ProCod ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprodsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         webdatospedido_impl.this.AV18EmprCod = GXv_char4[0] ;
         webdatospedido_impl.this.AV30ProCod = GXv_char3[0] ;
         webdatospedido_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, edtavProcod_Internalname, AV30ProCod);
         AV31ProDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavProdsc_Internalname, AV31ProDsc);
         AV76ComboProCDsc = AV30ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76ComboProCDsc", AV76ComboProCDsc);
         /* Using cursor H00DA17 */
         pr_default.execute(15, new Object[] {AV18EmprCod, AV76ComboProCDsc});
         hV76ComboProCDsc = "" ;
         while ( (pr_default.getStatus(15) != 101) )
         {
            hV76ComboProCDsc = H00DA17_A13771ProCDsc[0] ;
            if (true) break;
         }
         pr_default.close(15);
         httpContext.ajax_rsp_assign_attri("", false, "hV76ComboProCDsc", hV76ComboProCDsc);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(333) ;
         }
         if ( ( subGridsdtarticulopedidos_Islastpage == 1 ) || ( subGridsdtarticulopedidos_Rows == 0 ) || ( ( GRIDSDTARTICULOPEDIDOS_nCurrentRecord >= GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage ) && ( GRIDSDTARTICULOPEDIDOS_nCurrentRecord < GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage + subgridsdtarticulopedidos_fnc_recordsperpage( ) ) ) )
         {
            sendrow_3334( ) ;
            GRIDSDTARTICULOPEDIDOS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTARTICULOPEDIDOS_nCurrentRecord + 1 >= subgridsdtarticulopedidos_fnc_recordcount( ) )
            {
               GRIDSDTARTICULOPEDIDOS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTARTICULOPEDIDOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTARTICULOPEDIDOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTARTICULOPEDIDOS_nCurrentRecord = (long)(GRIDSDTARTICULOPEDIDOS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_333_Refreshing )
         {
            httpContext.doAjaxLoad(333, GridsdtarticulopedidosRow);
         }
         AV109GXV31 = (int)(AV109GXV31+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table3_361_DA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_361_DA2e( true) ;
      }
      else
      {
         wb_table3_361_DA2e( false) ;
      }
   }

   public void wb_table2_105_DA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable9_Internalname, tblUnnamedtable9_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedsdtencabezadopedido_discolnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksdtencabezadopedido_discolnom_Internalname, httpContext.getMessage( "Cor", ""), "", "", lblTextblocksdtencabezadopedido_discolnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table4_115_DA2( true) ;
      }
      else
      {
         wb_table4_115_DA2( false) ;
      }
      return  ;
   }

   public void wb_table4_115_DA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesdtencabezadopedido_discolnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksdtencabezadopedido_discolnum_Internalname, httpContext.getMessage( "N° ", ""), "", "", lblTextblocksdtencabezadopedido_discolnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSdtencabezadopedido_discolnum_Internalname, httpContext.getMessage( "Numero Color", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtencabezadopedido_discolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSdtencabezadopedido_discolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum()), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtencabezadopedido_discolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSdtencabezadopedido_discolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesdtencabezadopedido_distipcol_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksdtencabezadopedido_distipcol_Internalname, httpContext.getMessage( "Tc", ""), "", "", lblTextblocksdtencabezadopedido_distipcol_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavSdtencabezadopedido_distipcol.getInternalname(), httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavSdtencabezadopedido_distipcol, dynavSdtencabezadopedido_distipcol.getInternalname(), GXutil.trim( GXutil.str( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol(), 2, 0)), 1, dynavSdtencabezadopedido_distipcol.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavSdtencabezadopedido_distipcol.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "", true, (byte)(0), "HLP_WebDatosPedido.htm");
         dynavSdtencabezadopedido_distipcol.setValue( GXutil.trim( GXutil.str( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol(), 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavSdtencabezadopedido_distipcol.getInternalname(), "Values", dynavSdtencabezadopedido_distipcol.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesdtencabezadopedido_disnomcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksdtencabezadopedido_disnomcli_Internalname, httpContext.getMessage( "Cor Cliente", ""), "", "", lblTextblocksdtencabezadopedido_disnomcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSdtencabezadopedido_disnomcli_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtencabezadopedido_disnomcli_Internalname, GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli()), GXutil.rtrim( localUtil.format( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtencabezadopedido_disnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSdtencabezadopedido_disnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesdtencabezadopedido_disnumcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksdtencabezadopedido_disnumcli_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblocksdtencabezadopedido_disnumcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSdtencabezadopedido_disnumcli_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtencabezadopedido_disnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSdtencabezadopedido_disnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli()), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtencabezadopedido_disnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSdtencabezadopedido_disnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesdtencabezadopedido_disobs_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksdtencabezadopedido_disobs_Internalname, httpContext.getMessage( "Cartaz", ""), "", "", lblTextblocksdtencabezadopedido_disobs_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSdtencabezadopedido_disobs_Internalname, httpContext.getMessage( "Colección", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtencabezadopedido_disobs_Internalname, GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs()), GXutil.rtrim( localUtil.format( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtencabezadopedido_disobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSdtencabezadopedido_disobs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_105_DA2e( true) ;
      }
      else
      {
         wb_table2_105_DA2e( false) ;
      }
   }

   public void wb_table4_115_DA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedsdtencabezadopedido_discolnom_Internalname, tblTablemergedsdtencabezadopedido_discolnom_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSdtencabezadopedido_discolnom_Internalname, httpContext.getMessage( "Color", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtencabezadopedido_discolnom_Internalname, GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom()), GXutil.rtrim( localUtil.format( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtencabezadopedido_discolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSdtencabezadopedido_discolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSeleccionarcolor_Internalname, httpContext.getMessage( "Seleccionar Color", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSeleccionarcolor_Internalname, GXutil.rtrim( AV42SeleccionarColor), GXutil.rtrim( localUtil.format( AV42SeleccionarColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+"e52da1_client"+"'", "", "", "", "", edtavSeleccionarcolor_Jsonclick, 7, "AttributeFL", "", "", "", "", 1, edtavSeleccionarcolor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(1), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosPedido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavColorencontrado.getInternalname(), httpContext.getMessage( "Color", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavColorencontrado.getInternalname(), GXutil.booltostr( AV11ColorEncontrado), "", httpContext.getMessage( "Color", ""), 1, chkavColorencontrado.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(125, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,125);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavColorprompt.getInternalname(), httpContext.getMessage( "Color Prompt", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavColorprompt.getInternalname(), GXutil.booltostr( AV58ColorPrompt), "", httpContext.getMessage( "Color Prompt", ""), 1, chkavColorprompt.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(128, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,128);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_115_DA2e( true) ;
      }
      else
      {
         wb_table4_115_DA2e( false) ;
      }
   }

   public void wb_table1_29_DA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         Encabezado01Container.SetIsFreestyle(true);
         Encabezado01Container.SetWrapped(nGXWrapped);
         startgridcontrol32( ) ;
      }
      if ( wbEnd == 32 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_32 = (int)(nGXsfl_32_idx-1) ;
         if ( Encabezado01Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Encabezado01Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Encabezado01", Encabezado01Container, subEncabezado01_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Encabezado01ContainerData", Encabezado01Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Encabezado01ContainerData"+"V", Encabezado01Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Encabezado01ContainerData"+"V"+"\" value='"+Encabezado01Container.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_29_DA2e( true) ;
      }
      else
      {
         wb_table1_29_DA2e( false) ;
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
      paDA2( ) ;
      wsDA2( ) ;
      weDA2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714191240", true, true);
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
      httpContext.AddJavascriptSource("webdatospedido.js", "?202681714191241", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_322( )
   {
      lblTextblocksdtencabezadopedido_clicod_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_CLICOD_"+sGXsfl_32_idx ;
      edtavSdtencabezadopedido_clicod_Internalname = "SDTENCABEZADOPEDIDO_CLICOD_"+sGXsfl_32_idx ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD_"+sGXsfl_32_idx ;
      edtavClicod_Internalname = "vCLICOD_"+sGXsfl_32_idx ;
      lblTextblocksdtencabezadopedido_disenccli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISENCCLI_"+sGXsfl_32_idx ;
      edtavSdtencabezadopedido_disenccli_Internalname = "SDTENCABEZADOPEDIDO_DISENCCLI_"+sGXsfl_32_idx ;
      lblTextblocksdtencabezadopedido_disfec_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFEC_"+sGXsfl_32_idx ;
      edtavSdtencabezadopedido_disfec_Internalname = "SDTENCABEZADOPEDIDO_DISFEC_"+sGXsfl_32_idx ;
      lblTextblocksdtencabezadopedido_disfeccli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFECCLI_"+sGXsfl_32_idx ;
      edtavSdtencabezadopedido_disfeccli_Internalname = "SDTENCABEZADOPEDIDO_DISFECCLI_"+sGXsfl_32_idx ;
      lblTextblocksdtencabezadopedido_disfecent_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFECENT_"+sGXsfl_32_idx ;
      edtavSdtencabezadopedido_disfecent_Internalname = "SDTENCABEZADOPEDIDO_DISFECENT_"+sGXsfl_32_idx ;
      lblTextblocksdtencabezadopedido_albrreo_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_ALBRREO_"+sGXsfl_32_idx ;
      chkavSdtencabezadopedido_albrreo.setInternalname( "SDTENCABEZADOPEDIDO_ALBRREO_"+sGXsfl_32_idx );
      lblTextblocksdtencabezadopedido_displa_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISPLA_"+sGXsfl_32_idx ;
      chkavSdtencabezadopedido_displa.setInternalname( "SDTENCABEZADOPEDIDO_DISPLA_"+sGXsfl_32_idx );
   }

   public void subsflControlProps_fel_322( )
   {
      lblTextblocksdtencabezadopedido_clicod_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_CLICOD_"+sGXsfl_32_fel_idx ;
      edtavSdtencabezadopedido_clicod_Internalname = "SDTENCABEZADOPEDIDO_CLICOD_"+sGXsfl_32_fel_idx ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD_"+sGXsfl_32_fel_idx ;
      edtavClicod_Internalname = "vCLICOD_"+sGXsfl_32_fel_idx ;
      lblTextblocksdtencabezadopedido_disenccli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISENCCLI_"+sGXsfl_32_fel_idx ;
      edtavSdtencabezadopedido_disenccli_Internalname = "SDTENCABEZADOPEDIDO_DISENCCLI_"+sGXsfl_32_fel_idx ;
      lblTextblocksdtencabezadopedido_disfec_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFEC_"+sGXsfl_32_fel_idx ;
      edtavSdtencabezadopedido_disfec_Internalname = "SDTENCABEZADOPEDIDO_DISFEC_"+sGXsfl_32_fel_idx ;
      lblTextblocksdtencabezadopedido_disfeccli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFECCLI_"+sGXsfl_32_fel_idx ;
      edtavSdtencabezadopedido_disfeccli_Internalname = "SDTENCABEZADOPEDIDO_DISFECCLI_"+sGXsfl_32_fel_idx ;
      lblTextblocksdtencabezadopedido_disfecent_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFECENT_"+sGXsfl_32_fel_idx ;
      edtavSdtencabezadopedido_disfecent_Internalname = "SDTENCABEZADOPEDIDO_DISFECENT_"+sGXsfl_32_fel_idx ;
      lblTextblocksdtencabezadopedido_albrreo_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_ALBRREO_"+sGXsfl_32_fel_idx ;
      chkavSdtencabezadopedido_albrreo.setInternalname( "SDTENCABEZADOPEDIDO_ALBRREO_"+sGXsfl_32_fel_idx );
      lblTextblocksdtencabezadopedido_displa_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISPLA_"+sGXsfl_32_fel_idx ;
      chkavSdtencabezadopedido_displa.setInternalname( "SDTENCABEZADOPEDIDO_DISPLA_"+sGXsfl_32_fel_idx );
   }

   public void sendrow_322( )
   {
      subsflControlProps_322( ) ;
      wbDA0( ) ;
      Encabezado01Row = GXWebRow.GetNew(context,Encabezado01Container) ;
      if ( subEncabezado01_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subEncabezado01_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subEncabezado01_Class, "") != 0 )
         {
            subEncabezado01_Linesclass = subEncabezado01_Class+"Odd" ;
         }
      }
      else if ( subEncabezado01_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subEncabezado01_Backstyle = (byte)(0) ;
         subEncabezado01_Backcolor = subEncabezado01_Allbackcolor ;
         if ( GXutil.strcmp(subEncabezado01_Class, "") != 0 )
         {
            subEncabezado01_Linesclass = subEncabezado01_Class+"Uniform" ;
         }
      }
      else if ( subEncabezado01_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subEncabezado01_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subEncabezado01_Class, "") != 0 )
         {
            subEncabezado01_Linesclass = subEncabezado01_Class+"Odd" ;
         }
         subEncabezado01_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subEncabezado01_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subEncabezado01_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subEncabezado01_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subEncabezado01_Class, "") != 0 )
            {
               subEncabezado01_Linesclass = subEncabezado01_Class+"Even" ;
            }
         }
         else
         {
            subEncabezado01_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subEncabezado01_Class, "") != 0 )
            {
               subEncabezado01_Linesclass = subEncabezado01_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Encabezado01Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subEncabezado01_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_32_idx+"\">") ;
      }
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablefsencabezado01_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_clicod_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_clicod_Internalname,httpContext.getMessage( "Cliente", ""),"","",lblTextblocksdtencabezadopedido_clicod_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_clicod_Internalname,httpContext.getMessage( "Cliente", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_clicod_Enabled!=0)&&(edtavSdtencabezadopedido_clicod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado01Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_clicod_Internalname,hV79GXV1,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_clicod_Enabled!=0)&&(edtavSdtencabezadopedido_clicod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_clicod_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(60),"chr",Integer.valueOf(1),"row",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtableclicod_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblockclicod_Internalname,httpContext.getMessage( "Cód. Cliente", ""),"","",lblTextblockclicod_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,httpContext.getMessage( "Cliente", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      Encabezado01Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,hV9CliCod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClicod_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(60),"chr",Integer.valueOf(1),"row",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disenccli_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disenccli_Internalname,httpContext.getMessage( "Talao Cliente", ""),"","",lblTextblocksdtencabezadopedido_disenccli_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disenccli_Internalname,httpContext.getMessage( "Pedido del Cliente ", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disenccli_Enabled!=0)&&(edtavSdtencabezadopedido_disenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado01Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disenccli_Internalname,GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disenccli()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disenccli_Enabled!=0)&&(edtavSdtencabezadopedido_disenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disenccli_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disfec_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disfec_Internalname,httpContext.getMessage( "Data Ent", ""),"","",lblTextblocksdtencabezadopedido_disfec_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      sendrow_32230( ) ;
   }

   public void sendrow_32230( )
   {
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disfec_Internalname,httpContext.getMessage( "Fecha Generación Pedido", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disfec_Enabled!=0)&&(edtavSdtencabezadopedido_disfec_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado01Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disfec_Internalname,localUtil.format(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfec(), "99/99/99"),localUtil.format( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfec(), "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disfec_Enabled!=0)&&(edtavSdtencabezadopedido_disfec_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disfec_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disfeccli_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disfeccli_Internalname,httpContext.getMessage( "Data Enc Cli", ""),"","",lblTextblocksdtencabezadopedido_disfeccli_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disfeccli_Internalname,httpContext.getMessage( "Fecha pedido cliente", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disfeccli_Enabled!=0)&&(edtavSdtencabezadopedido_disfeccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado01Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disfeccli_Internalname,localUtil.format(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfeccli(), "99/99/99"),localUtil.format( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfeccli(), "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disfeccli_Enabled!=0)&&(edtavSdtencabezadopedido_disfeccli_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disfeccli_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disfecent_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disfecent_Internalname,httpContext.getMessage( "Data Ent Prev", ""),"","",lblTextblocksdtencabezadopedido_disfecent_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disfecent_Internalname,httpContext.getMessage( "Fecha Entrega Prevista", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disfecent_Enabled!=0)&&(edtavSdtencabezadopedido_disfecent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado01Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disfecent_Internalname,localUtil.format(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfecent(), "99/99/99"),localUtil.format( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfecent(), "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disfecent_Enabled!=0)&&(edtavSdtencabezadopedido_disfecent_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disfecent_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_albrreo_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_albrreo_Internalname,httpContext.getMessage( "Reclamação?", ""),"","",lblTextblocksdtencabezadopedido_albrreo_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_albrreo.getInternalname(),httpContext.getMessage( "Reclamacion?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_albrreo.getEnabled()!=0)&&(chkavSdtencabezadopedido_albrreo.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_ALBRREO_" + sGXsfl_32_idx ;
      chkavSdtencabezadopedido_albrreo.setName( GXCCtl );
      chkavSdtencabezadopedido_albrreo.setWebtags( "" );
      chkavSdtencabezadopedido_albrreo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_albrreo.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_albrreo.getCaption(), !bGXsfl_32_Refreshing);
      chkavSdtencabezadopedido_albrreo.setCheckedValue( "NO" );
      Encabezado01Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_albrreo.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Albrreo(),"",httpContext.getMessage( "Reclamacion?", ""),Integer.valueOf(1),Integer.valueOf(1),"SI","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(89, this, 'SI', 'NO',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_albrreo.getEnabled()!=0)&&(chkavSdtencabezadopedido_albrreo.getVisible()!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,89);\"" : " ")});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_displa_Internalname+"_"+sGXsfl_32_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      sendrow_32260( ) ;
   }

   public void sendrow_32260( )
   {
      /* Text block */
      Encabezado01Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_displa_Internalname,httpContext.getMessage( "Amostras?", ""),"","",lblTextblocksdtencabezadopedido_displa_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado01Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado01Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_displa.getInternalname(),httpContext.getMessage( "Muestras?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_displa.getEnabled()!=0)&&(chkavSdtencabezadopedido_displa.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 97,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISPLA_" + sGXsfl_32_idx ;
      chkavSdtencabezadopedido_displa.setName( GXCCtl );
      chkavSdtencabezadopedido_displa.setWebtags( "" );
      chkavSdtencabezadopedido_displa.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_displa.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_displa.getCaption(), !bGXsfl_32_Refreshing);
      chkavSdtencabezadopedido_displa.setCheckedValue( "N" );
      Encabezado01Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_displa.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Displa(),"",httpContext.getMessage( "Muestras?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(97, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_displa.getEnabled()!=0)&&(chkavSdtencabezadopedido_displa.getVisible()!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,97);\"" : " ")});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado01Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      send_integrity_lvl_hashesDA2( ) ;
      GXCCtl = "GXHCSDTENCABEZADOPEDIDO_CLICOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "GXHCvCLICOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* End of Columns property logic. */
      Encabezado01Container.AddRow(Encabezado01Row);
      nGXsfl_32_idx = ((subEncabezado01_Islastpage==1)&&(nGXsfl_32_idx+1>subencabezado01_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_322( ) ;
      /* End function sendrow_322 */
   }

   public void subsflControlProps_1713( )
   {
      lblTextblocksdtencabezadopedido_disitem3_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISITEM3_"+sGXsfl_171_idx ;
      edtavSdtencabezadopedido_disitem3_Internalname = "SDTENCABEZADOPEDIDO_DISITEM3_"+sGXsfl_171_idx ;
      lblTextblockcombo_sdtencabezadopedido_procecod_Internalname = "TEXTBLOCKCOMBO_SDTENCABEZADOPEDIDO_PROCECOD_"+sGXsfl_171_idx ;
      edtavSdtencabezadopedido_procecod_Internalname = "SDTENCABEZADOPEDIDO_PROCECOD_"+sGXsfl_171_idx ;
      lblTextblocksdtencabezadopedido_dispart_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISPART_"+sGXsfl_171_idx ;
      edtavSdtencabezadopedido_dispart_Internalname = "SDTENCABEZADOPEDIDO_DISPART_"+sGXsfl_171_idx ;
      edtavSdtencabezadopedido_disordcomp_Internalname = "SDTENCABEZADOPEDIDO_DISORDCOMP_"+sGXsfl_171_idx ;
      lblTextblockcombo_sdtencabezadopedido_cod_idtx_Internalname = "TEXTBLOCKCOMBO_SDTENCABEZADOPEDIDO_COD_IDTX_"+sGXsfl_171_idx ;
      edtavSdtencabezadopedido_cod_idtx_Internalname = "SDTENCABEZADOPEDIDO_COD_IDTX_"+sGXsfl_171_idx ;
      lblTextblocksdtencabezadopedido_disnormst01_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST01_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst01.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST01_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_disnormst02_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST02_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst02.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST02_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_disnormst03_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST03_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst03.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST03_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_disnormst04_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST04_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst04.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST04_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_disnormst05_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST05_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst05.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST05_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_disrec_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISREC_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disrec.setInternalname( "SDTENCABEZADOPEDIDO_DISREC_"+sGXsfl_171_idx );
      edtavSdtencabezadopedido_disdest_Internalname = "SDTENCABEZADOPEDIDO_DISDEST_"+sGXsfl_171_idx ;
      lblTextblocksdtencabezadopedido_nxt_statio_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_STATIO_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_nxt_statio.setInternalname( "SDTENCABEZADOPEDIDO_NXT_STATIO_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_nxt_modelo_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_MODELO_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_nxt_modelo.setInternalname( "SDTENCABEZADOPEDIDO_NXT_MODELO_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_disexp_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISEXP_"+sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disexp.setInternalname( "SDTENCABEZADOPEDIDO_DISEXP_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_nxt_artcli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_ARTCLI_"+sGXsfl_171_idx ;
      cmbavSdtencabezadopedido_nxt_artcli.setInternalname( "SDTENCABEZADOPEDIDO_NXT_ARTCLI_"+sGXsfl_171_idx );
      lblTextblocksdtencabezadopedido_observaciones_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_OBSERVACIONES_"+sGXsfl_171_idx ;
      edtavSdtencabezadopedido_observaciones_Internalname = "SDTENCABEZADOPEDIDO_OBSERVACIONES_"+sGXsfl_171_idx ;
   }

   public void subsflControlProps_fel_1713( )
   {
      lblTextblocksdtencabezadopedido_disitem3_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISITEM3_"+sGXsfl_171_fel_idx ;
      edtavSdtencabezadopedido_disitem3_Internalname = "SDTENCABEZADOPEDIDO_DISITEM3_"+sGXsfl_171_fel_idx ;
      lblTextblockcombo_sdtencabezadopedido_procecod_Internalname = "TEXTBLOCKCOMBO_SDTENCABEZADOPEDIDO_PROCECOD_"+sGXsfl_171_fel_idx ;
      edtavSdtencabezadopedido_procecod_Internalname = "SDTENCABEZADOPEDIDO_PROCECOD_"+sGXsfl_171_fel_idx ;
      lblTextblocksdtencabezadopedido_dispart_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISPART_"+sGXsfl_171_fel_idx ;
      edtavSdtencabezadopedido_dispart_Internalname = "SDTENCABEZADOPEDIDO_DISPART_"+sGXsfl_171_fel_idx ;
      edtavSdtencabezadopedido_disordcomp_Internalname = "SDTENCABEZADOPEDIDO_DISORDCOMP_"+sGXsfl_171_fel_idx ;
      lblTextblockcombo_sdtencabezadopedido_cod_idtx_Internalname = "TEXTBLOCKCOMBO_SDTENCABEZADOPEDIDO_COD_IDTX_"+sGXsfl_171_fel_idx ;
      edtavSdtencabezadopedido_cod_idtx_Internalname = "SDTENCABEZADOPEDIDO_COD_IDTX_"+sGXsfl_171_fel_idx ;
      lblTextblocksdtencabezadopedido_disnormst01_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST01_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disnormst01.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST01_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_disnormst02_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST02_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disnormst02.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST02_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_disnormst03_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST03_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disnormst03.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST03_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_disnormst04_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST04_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disnormst04.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST04_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_disnormst05_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST05_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disnormst05.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST05_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_disrec_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISREC_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disrec.setInternalname( "SDTENCABEZADOPEDIDO_DISREC_"+sGXsfl_171_fel_idx );
      edtavSdtencabezadopedido_disdest_Internalname = "SDTENCABEZADOPEDIDO_DISDEST_"+sGXsfl_171_fel_idx ;
      lblTextblocksdtencabezadopedido_nxt_statio_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_STATIO_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_nxt_statio.setInternalname( "SDTENCABEZADOPEDIDO_NXT_STATIO_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_nxt_modelo_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_MODELO_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_nxt_modelo.setInternalname( "SDTENCABEZADOPEDIDO_NXT_MODELO_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_disexp_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISEXP_"+sGXsfl_171_fel_idx ;
      chkavSdtencabezadopedido_disexp.setInternalname( "SDTENCABEZADOPEDIDO_DISEXP_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_nxt_artcli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_ARTCLI_"+sGXsfl_171_fel_idx ;
      cmbavSdtencabezadopedido_nxt_artcli.setInternalname( "SDTENCABEZADOPEDIDO_NXT_ARTCLI_"+sGXsfl_171_fel_idx );
      lblTextblocksdtencabezadopedido_observaciones_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_OBSERVACIONES_"+sGXsfl_171_fel_idx ;
      edtavSdtencabezadopedido_observaciones_Internalname = "SDTENCABEZADOPEDIDO_OBSERVACIONES_"+sGXsfl_171_fel_idx ;
   }

   public void sendrow_1713( )
   {
      subsflControlProps_1713( ) ;
      wbDA0( ) ;
      Encabezado04Row = GXWebRow.GetNew(context,Encabezado04Container) ;
      if ( subEncabezado04_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subEncabezado04_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subEncabezado04_Class, "") != 0 )
         {
            subEncabezado04_Linesclass = subEncabezado04_Class+"Odd" ;
         }
      }
      else if ( subEncabezado04_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subEncabezado04_Backstyle = (byte)(0) ;
         subEncabezado04_Backcolor = subEncabezado04_Allbackcolor ;
         if ( GXutil.strcmp(subEncabezado04_Class, "") != 0 )
         {
            subEncabezado04_Linesclass = subEncabezado04_Class+"Uniform" ;
         }
      }
      else if ( subEncabezado04_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subEncabezado04_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subEncabezado04_Class, "") != 0 )
         {
            subEncabezado04_Linesclass = subEncabezado04_Class+"Odd" ;
         }
         subEncabezado04_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subEncabezado04_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subEncabezado04_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_171_idx) % (2))) == 0 )
         {
            subEncabezado04_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subEncabezado04_Class, "") != 0 )
            {
               subEncabezado04_Linesclass = subEncabezado04_Class+"Even" ;
            }
         }
         else
         {
            subEncabezado04_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subEncabezado04_Class, "") != 0 )
            {
               subEncabezado04_Linesclass = subEncabezado04_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Encabezado04Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subEncabezado04_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_171_idx+"\">") ;
      }
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablefsencabezado04_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable3_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disitem3_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disitem3_Internalname,httpContext.getMessage( "Nº Enc Cliente", ""),"","",lblTextblocksdtencabezadopedido_disitem3_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disitem3_Internalname,httpContext.getMessage( "N° Pedido Cliente", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disitem3_Enabled!=0)&&(edtavSdtencabezadopedido_disitem3_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 182,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado04Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disitem3_Internalname,GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disitem3()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disitem3_Enabled!=0)&&(edtavSdtencabezadopedido_disitem3_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,182);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disitem3_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(171),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop ExtendedComboCell","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTablesplittedsdtencabezadopedido_procecod_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblockcombo_sdtencabezadopedido_procecod_Internalname,httpContext.getMessage( "Malheiro", ""),"","",lblTextblockcombo_sdtencabezadopedido_procecod_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_procecod_Internalname,httpContext.getMessage( "Codigo de la Procedencia", ""),"col-sm-3 AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_procecod_Enabled!=0)&&(edtavSdtencabezadopedido_procecod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 190,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ROClassString = "Attribute" ;
      Encabezado04Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_procecod_Internalname,GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Procecod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Procecod()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_procecod_Enabled!=0)&&(edtavSdtencabezadopedido_procecod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,190);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_procecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(171),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_dispart_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_dispart_Internalname,httpContext.getMessage( "N° de Partida", ""),"","",lblTextblocksdtencabezadopedido_dispart_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_dispart_Internalname,httpContext.getMessage( "N° Partida", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_dispart_Enabled!=0)&&(edtavSdtencabezadopedido_dispart_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 198,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado04Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_dispart_Internalname,GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_dispart_Enabled!=0)&&(edtavSdtencabezadopedido_dispart_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,198);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_dispart_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(171),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavSdtencabezadopedido_disordcomp_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disordcomp_Internalname,httpContext.getMessage( "P.O.", ""),"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disordcomp_Enabled!=0)&&(edtavSdtencabezadopedido_disordcomp_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 202,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado04Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disordcomp_Internalname,AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disordcomp(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disordcomp_Enabled!=0)&&(edtavSdtencabezadopedido_disordcomp_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,202);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disordcomp_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(100),"%",Integer.valueOf(1),"row",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(171),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      sendrow_171330( ) ;
   }

   public void sendrow_171330( )
   {
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable4_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop ExtendedComboCell","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTablesplittedsdtencabezadopedido_cod_idtx_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblockcombo_sdtencabezadopedido_cod_idtx_Internalname,httpContext.getMessage( "Clear to Wear", ""),"","",lblTextblockcombo_sdtencabezadopedido_cod_idtx_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_cod_idtx_Internalname,httpContext.getMessage( "Id Certificado", ""),"col-sm-3 AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_cod_idtx_Enabled!=0)&&(edtavSdtencabezadopedido_cod_idtx_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 212,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ROClassString = "Attribute" ;
      Encabezado04Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_cod_idtx_Internalname,GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Cod_idtx()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_cod_idtx_Enabled!=0)&&(edtavSdtencabezadopedido_cod_idtx_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,212);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_cod_idtx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(171),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disnormst01_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disnormst01_Internalname,lblTextblocksdtencabezadopedido_disnormst01_Caption,"","",lblTextblocksdtencabezadopedido_disnormst01_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst01.getInternalname(),httpContext.getMessage( "Gots?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disnormst01.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst01.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 220,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST01_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst01.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst01.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst01.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst01.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst01.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst01.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst01.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst01(),"",httpContext.getMessage( "Gots?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(220, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disnormst01.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst01.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,220);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disnormst02_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disnormst02_Internalname,lblTextblocksdtencabezadopedido_disnormst02_Caption,"","",lblTextblocksdtencabezadopedido_disnormst02_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst02.getInternalname(),httpContext.getMessage( "Grs?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disnormst02.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst02.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 228,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST02_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst02.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst02.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst02.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst02.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst02.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst02.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst02.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst02(),"",httpContext.getMessage( "Grs?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(228, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disnormst02.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst02.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,228);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disnormst03_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      sendrow_171360( ) ;
   }

   public void sendrow_171360( )
   {
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disnormst03_Internalname,lblTextblocksdtencabezadopedido_disnormst03_Caption,"","",lblTextblocksdtencabezadopedido_disnormst03_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst03.getInternalname(),httpContext.getMessage( "Ocs?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disnormst03.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst03.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 236,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST03_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst03.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst03.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst03.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst03.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst03.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst03.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst03.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst03(),"",httpContext.getMessage( "Ocs?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(236, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disnormst03.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst03.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,236);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disnormst04_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disnormst04_Internalname,httpContext.getMessage( "RCS?", ""),"","",lblTextblocksdtencabezadopedido_disnormst04_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst04.getInternalname(),httpContext.getMessage( "RCS?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disnormst04.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst04.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 244,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST04_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst04.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst04.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst04.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst04.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst04.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst04.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst04.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst04(),"",httpContext.getMessage( "RCS?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(244, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disnormst04.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst04.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,244);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disnormst05_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disnormst05_Internalname,httpContext.getMessage( "OEKO-Tex?", ""),"","",lblTextblocksdtencabezadopedido_disnormst05_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst05.getInternalname(),httpContext.getMessage( "OEKO-Tex?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disnormst05.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst05.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 252,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST05_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst05.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst05.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst05.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst05.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst05.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst05.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disnormst05.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst05(),"",httpContext.getMessage( "OEKO-Tex?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(252, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disnormst05.getEnabled()!=0)&&(chkavSdtencabezadopedido_disnormst05.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,252);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable5_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disrec_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disrec_Internalname,httpContext.getMessage( "Não Conforme?", ""),"","",lblTextblocksdtencabezadopedido_disrec_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disrec.getInternalname(),httpContext.getMessage( "No conforme?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disrec.getEnabled()!=0)&&(chkavSdtencabezadopedido_disrec.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 262,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISREC_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disrec.setName( GXCCtl );
      chkavSdtencabezadopedido_disrec.setWebtags( "" );
      chkavSdtencabezadopedido_disrec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disrec.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disrec.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disrec.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disrec.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(),"",httpContext.getMessage( "No conforme?", ""),Integer.valueOf(1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(262, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disrec.getEnabled()!=0)&&(chkavSdtencabezadopedido_disrec.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,262);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      sendrow_171390( ) ;
   }

   public void sendrow_171390( )
   {
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavSdtencabezadopedido_disdest_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavSdtencabezadopedido_disdest_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disdest_Internalname,edtavSdtencabezadopedido_disdest_Caption,"gx-form-item AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_disdest_Enabled!=0)&&(edtavSdtencabezadopedido_disdest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 266,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ROClassString = "AttributeFL" ;
      Encabezado04Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_disdest_Internalname,GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_disdest_Enabled!=0)&&(edtavSdtencabezadopedido_disdest_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,266);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtencabezadopedido_disdest_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtavSdtencabezadopedido_disdest_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(171),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable6_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_nxt_statio_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_nxt_statio_Internalname,httpContext.getMessage( "Relatorio de Analide da composição da Malha?", ""),"","",lblTextblocksdtencabezadopedido_nxt_statio_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_nxt_statio.getInternalname(),httpContext.getMessage( "Relat Anal. da Compo da Malha?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_nxt_statio.getEnabled()!=0)&&(chkavSdtencabezadopedido_nxt_statio.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 276,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_NXT_STATIO_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_nxt_statio.setName( GXCCtl );
      chkavSdtencabezadopedido_nxt_statio.setWebtags( "" );
      chkavSdtencabezadopedido_nxt_statio.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_nxt_statio.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_nxt_statio.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_nxt_statio.setCheckedValue( "NAO" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_nxt_statio.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_statio(),"",httpContext.getMessage( "Relat Anal. da Compo da Malha?", ""),Integer.valueOf(1),Integer.valueOf(1),"SIM","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(276, this, 'SIM', 'NAO',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_nxt_statio.getEnabled()!=0)&&(chkavSdtencabezadopedido_nxt_statio.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,276);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_nxt_modelo_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_nxt_modelo_Internalname,httpContext.getMessage( "Lista de substâncias Restritas na Fabricação?", ""),"","",lblTextblocksdtencabezadopedido_nxt_modelo_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_nxt_modelo.getInternalname(),httpContext.getMessage( "Subst Restritas na Fabric?", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_nxt_modelo.getEnabled()!=0)&&(chkavSdtencabezadopedido_nxt_modelo.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 284,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_NXT_MODELO_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_nxt_modelo.setName( GXCCtl );
      chkavSdtencabezadopedido_nxt_modelo.setWebtags( "" );
      chkavSdtencabezadopedido_nxt_modelo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_nxt_modelo.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_nxt_modelo.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_nxt_modelo.setCheckedValue( "NAO" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_nxt_modelo.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_modelo(),"",httpContext.getMessage( "Subst Restritas na Fabric?", ""),Integer.valueOf(1),Integer.valueOf(1),"SIM","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(284, this, 'SIM', 'NAO',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_nxt_modelo.getEnabled()!=0)&&(chkavSdtencabezadopedido_nxt_modelo.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,284);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable7_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_disexp_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_disexp_Internalname,httpContext.getMessage( "Exportação", ""),"","",lblTextblocksdtencabezadopedido_disexp_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      sendrow_1713120( ) ;
   }

   public void sendrow_1713120( )
   {
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disexp.getInternalname(),httpContext.getMessage( "Exportación", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Check box */
      TempTags = " " + ((chkavSdtencabezadopedido_disexp.getEnabled()!=0)&&(chkavSdtencabezadopedido_disexp.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 294,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      GXCCtl = "SDTENCABEZADOPEDIDO_DISEXP_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disexp.setName( GXCCtl );
      chkavSdtencabezadopedido_disexp.setWebtags( "" );
      chkavSdtencabezadopedido_disexp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disexp.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disexp.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disexp.setCheckedValue( "N" );
      Encabezado04Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtencabezadopedido_disexp.getInternalname(),AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disexp(),"",httpContext.getMessage( "Exportación", ""),Integer.valueOf(1),Integer.valueOf(1),"E","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(294, this, 'E', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtencabezadopedido_disexp.getEnabled()!=0)&&(chkavSdtencabezadopedido_disexp.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,294);\"" : " ")});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_nxt_artcli_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_nxt_artcli_Internalname,httpContext.getMessage( "Enc Cliente", ""),"","",lblTextblocksdtencabezadopedido_nxt_artcli_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(lblTextblocksdtencabezadopedido_nxt_artcli_Visible),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {cmbavSdtencabezadopedido_nxt_artcli.getInternalname(),httpContext.getMessage( "Enc Cliente", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      TempTags = " " + ((cmbavSdtencabezadopedido_nxt_artcli.getEnabled()!=0)&&(cmbavSdtencabezadopedido_nxt_artcli.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 302,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      if ( ( cmbavSdtencabezadopedido_nxt_artcli.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "SDTENCABEZADOPEDIDO_NXT_ARTCLI_" + sGXsfl_171_idx ;
         cmbavSdtencabezadopedido_nxt_artcli.setName( GXCCtl );
         cmbavSdtencabezadopedido_nxt_artcli.setWebtags( "" );
         cmbavSdtencabezadopedido_nxt_artcli.addItem("Sem Definir", httpContext.getMessage( "Sem Definir", ""), (short)(0));
         cmbavSdtencabezadopedido_nxt_artcli.addItem("MARROCOS", httpContext.getMessage( "MARROCOS", ""), (short)(0));
         cmbavSdtencabezadopedido_nxt_artcli.addItem("MARROCOS (CORTA PT)", httpContext.getMessage( "MARROCOS (CORTA PT)", ""), (short)(0));
         if ( cmbavSdtencabezadopedido_nxt_artcli.getItemCount() > 0 )
         {
            AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_artcli( cmbavSdtencabezadopedido_nxt_artcli.getValidValue(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli()) );
         }
      }
      /* ComboBox */
      Encabezado04Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavSdtencabezadopedido_nxt_artcli,cmbavSdtencabezadopedido_nxt_artcli.getInternalname(),GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli()),Integer.valueOf(1),cmbavSdtencabezadopedido_nxt_artcli.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavSdtencabezadopedido_nxt_artcli.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"em",Integer.valueOf(0),"","","AttributeFL","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavSdtencabezadopedido_nxt_artcli.getEnabled()!=0)&&(cmbavSdtencabezadopedido_nxt_artcli.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,302);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbavSdtencabezadopedido_nxt_artcli.setValue( GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli()) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSdtencabezadopedido_nxt_artcli.getInternalname(), "Values", cmbavSdtencabezadopedido_nxt_artcli.ToJavascriptSource(), !bGXsfl_171_Refreshing);
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable8_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","DataContentCell DscTop","left","top","","flex-grow:1;","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablesdtencabezadopedido_observaciones_Internalname+"_"+sGXsfl_171_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 MergeLabelCell","left","top","","","div"});
      /* Text block */
      Encabezado04Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblocksdtencabezadopedido_observaciones_Internalname,httpContext.getMessage( "Observações", ""),"","",lblTextblocksdtencabezadopedido_observaciones_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Label",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Encabezado04Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Encabezado04Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_observaciones_Internalname,httpContext.getMessage( "Observaciones", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Multiple line edit */
      TempTags = " " + ((edtavSdtencabezadopedido_observaciones_Enabled!=0)&&(edtavSdtencabezadopedido_observaciones_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 312,'',false,'"+sGXsfl_171_idx+"',171)\"" : " ") ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      Encabezado04Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtavSdtencabezadopedido_observaciones_Internalname,AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSdtencabezadopedido_observaciones_Enabled!=0)&&(edtavSdtencabezadopedido_observaciones_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,312);\"" : " "),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(80),"chr",Integer.valueOf(7),"row",Integer.valueOf(0),StyleString,ClassString,"","","540",Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(-1),Boolean.valueOf(true),"","'"+""+"'"+",false,"+"'"+""+"'",Integer.valueOf(0)});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Encabezado04Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      send_integrity_lvl_hashesDA3( ) ;
      GXCCtl = "vSDTENCABEZADOPEDIDO_" + sGXsfl_171_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV39SdtEnCabezadoPedido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV39SdtEnCabezadoPedido);
      }
      /* End of Columns property logic. */
      Encabezado04Container.AddRow(Encabezado04Row);
      nGXsfl_171_idx = ((subEncabezado04_Islastpage==1)&&(nGXsfl_171_idx+1>subencabezado04_fnc_recordsperpage( )) ? 1 : nGXsfl_171_idx+1) ;
      sGXsfl_171_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_171_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1713( ) ;
      /* End function sendrow_1713 */
   }

   public void subsflControlProps_3334( )
   {
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__disartcod_Internalname = "SDTARTICULOPEDIDOS__DISARTCOD_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__artdsc_Internalname = "SDTARTICULOPEDIDOS__ARTDSC_"+sGXsfl_333_idx ;
      edtavInsert_Internalname = "vINSERT_"+sGXsfl_333_idx ;
      edtavComboprocdsc_Internalname = "vCOMBOPROCDSC_"+sGXsfl_333_idx ;
      edtavProcod_Internalname = "vPROCOD_"+sGXsfl_333_idx ;
      edtavProdsc_Internalname = "vPRODSC_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__procod_Internalname = "SDTARTICULOPEDIDOS__PROCOD_"+sGXsfl_333_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__disnumpie_Internalname = "SDTARTICULOPEDIDOS__DISNUMPIE_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__kilos_Internalname = "SDTARTICULOPEDIDOS__KILOS_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__metros_Internalname = "SDTARTICULOPEDIDOS__METROS_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__disartanh_Internalname = "SDTARTICULOPEDIDOS__DISARTANH_"+sGXsfl_333_idx ;
      edtavSdtarticulopedidos__disgraaca_Internalname = "SDTARTICULOPEDIDOS__DISGRAACA_"+sGXsfl_333_idx ;
   }

   public void subsflControlProps_fel_3334( )
   {
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__disartcod_Internalname = "SDTARTICULOPEDIDOS__DISARTCOD_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__artdsc_Internalname = "SDTARTICULOPEDIDOS__ARTDSC_"+sGXsfl_333_fel_idx ;
      edtavInsert_Internalname = "vINSERT_"+sGXsfl_333_fel_idx ;
      edtavComboprocdsc_Internalname = "vCOMBOPROCDSC_"+sGXsfl_333_fel_idx ;
      edtavProcod_Internalname = "vPROCOD_"+sGXsfl_333_fel_idx ;
      edtavProdsc_Internalname = "vPRODSC_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__procod_Internalname = "SDTARTICULOPEDIDOS__PROCOD_"+sGXsfl_333_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__disnumpie_Internalname = "SDTARTICULOPEDIDOS__DISNUMPIE_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__kilos_Internalname = "SDTARTICULOPEDIDOS__KILOS_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__metros_Internalname = "SDTARTICULOPEDIDOS__METROS_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__disartanh_Internalname = "SDTARTICULOPEDIDOS__DISARTANH_"+sGXsfl_333_fel_idx ;
      edtavSdtarticulopedidos__disgraaca_Internalname = "SDTARTICULOPEDIDOS__DISGRAACA_"+sGXsfl_333_fel_idx ;
   }

   public void sendrow_3334( )
   {
      subsflControlProps_3334( ) ;
      wbDA0( ) ;
      if ( ( subGridsdtarticulopedidos_Rows * 1 == 0 ) || ( nGXsfl_333_idx <= subgridsdtarticulopedidos_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtarticulopedidosRow = GXWebRow.GetNew(context,GridsdtarticulopedidosContainer) ;
         if ( subGridsdtarticulopedidos_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtarticulopedidos_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtarticulopedidos_Class, "") != 0 )
            {
               subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Odd" ;
            }
         }
         else if ( subGridsdtarticulopedidos_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtarticulopedidos_Backstyle = (byte)(0) ;
            subGridsdtarticulopedidos_Backcolor = subGridsdtarticulopedidos_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtarticulopedidos_Class, "") != 0 )
            {
               subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtarticulopedidos_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtarticulopedidos_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtarticulopedidos_Class, "") != 0 )
            {
               subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Odd" ;
            }
            subGridsdtarticulopedidos_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtarticulopedidos_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtarticulopedidos_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_333_idx) % (2))) == 0 )
            {
               subGridsdtarticulopedidos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtarticulopedidos_Class, "") != 0 )
               {
                  subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtarticulopedidos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtarticulopedidos_Class, "") != 0 )
               {
                  subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_333_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDelete_Enabled!=0)&&(edtavDelete_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 334,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,GXutil.rtrim( AV15Delete),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDelete_Enabled!=0)&&(edtavDelete_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,334);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVDELETE.CLICK."+sGXsfl_333_idx+"'","","",httpContext.getMessage( "GX_BtnDelete", ""),"",edtavDelete_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDelete_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__disartcod_Internalname,GXutil.rtrim( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disartcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__disartcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtarticulopedidos__disartcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__artdsc_Internalname,GXutil.rtrim( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Artdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__artdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtarticulopedidos__artdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInsert_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavInsert_Enabled!=0)&&(edtavInsert_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 337,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInsert_Internalname,GXutil.rtrim( AV26Insert),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInsert_Enabled!=0)&&(edtavInsert_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,337);\"" : " "),"'"+""+"'"+",false,"+"'"+"e53da4_client"+"'","","",httpContext.getMessage( "GXM_insert", ""),"",edtavInsert_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(edtavInsert_Visible),Integer.valueOf(edtavInsert_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavComboprocdsc_Enabled!=0)&&(edtavComboprocdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 338,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavComboprocdsc_Internalname,hV76ComboProCDsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavComboprocdsc_Enabled!=0)&&(edtavComboprocdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,338);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavComboprocdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProcod_Enabled!=0)&&(edtavProcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 339,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProcod_Internalname,GXutil.rtrim( AV30ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProcod_Enabled!=0)&&(edtavProcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,339);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavProcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProdsc_Enabled!=0)&&(edtavProdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 340,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProdsc_Internalname,GXutil.rtrim( AV31ProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProdsc_Enabled!=0)&&(edtavProdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,340);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavProdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__procod_Internalname,GXutil.rtrim( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Procod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__procod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtarticulopedidos__procod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 342,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,GXutil.rtrim( AV44Update),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,342);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVUPDATE.CLICK."+sGXsfl_333_idx+"'","","",httpContext.getMessage( "Fases", ""),"",edtavUpdate_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUpdate_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtarticulopedidos__disnumpie_Enabled!=0)&&(edtavSdtarticulopedidos__disnumpie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 343,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__disnumpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disnumpie(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disnumpie()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavSdtarticulopedidos__disnumpie_Enabled!=0)&&(edtavSdtarticulopedidos__disnumpie_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,343);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__disnumpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtarticulopedidos__kilos_Enabled!=0)&&(edtavSdtarticulopedidos__kilos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 344,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__kilos_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Kilos(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Kilos(), "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavSdtarticulopedidos__kilos_Enabled!=0)&&(edtavSdtarticulopedidos__kilos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,344);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__kilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtarticulopedidos__metros_Enabled!=0)&&(edtavSdtarticulopedidos__metros_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 345,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__metros_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Metros(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Metros(), "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavSdtarticulopedidos__metros_Enabled!=0)&&(edtavSdtarticulopedidos__metros_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,345);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__metros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtarticulopedidos__disartanh_Enabled!=0)&&(edtavSdtarticulopedidos__disartanh_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 346,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__disartanh_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disartanh(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disartanh()), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavSdtarticulopedidos__disartanh_Enabled!=0)&&(edtavSdtarticulopedidos__disartanh_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,346);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__disartanh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtarticulopedidos__disgraaca_Enabled!=0)&&(edtavSdtarticulopedidos__disgraaca_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 347,'',false,'"+sGXsfl_333_idx+"',333)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridsdtarticulopedidosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtarticulopedidos__disgraaca_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disgraaca(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.SdtSdtArticuloPedido)AV38SdtArticuloPedidos.elementAt(-1+AV109GXV31)).getgxTv_SdtSdtArticuloPedido_Disgraaca()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavSdtarticulopedidos__disgraaca_Enabled!=0)&&(edtavSdtarticulopedidos__disgraaca_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,347);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtarticulopedidos__disgraaca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(333),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesDA4( ) ;
         GXCCtl = "GXHCvCOMBOPROCDSC_" + sGXsfl_333_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV76ComboProCDsc);
         GXCCtl = "vSDTENCABEZADOPEDIDO_" + sGXsfl_333_idx ;
         if ( httpContext.isAjaxRequest( ) )
         {
            httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV39SdtEnCabezadoPedido);
         }
         else
         {
            httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV39SdtEnCabezadoPedido);
         }
         GridsdtarticulopedidosContainer.AddRow(GridsdtarticulopedidosRow);
         nGXsfl_333_idx = ((subGridsdtarticulopedidos_Islastpage==1)&&(nGXsfl_333_idx+1>subgridsdtarticulopedidos_fnc_recordsperpage( )) ? 1 : nGXsfl_333_idx+1) ;
         sGXsfl_333_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_333_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3334( ) ;
      }
      /* End function sendrow_3334 */
   }

   public void startgridcontrol171( )
   {
      if ( Encabezado04Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Encabezado04Container"+"DivS\" data-gxgridid=\"171\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subEncabezado04_Internalname, subEncabezado04_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         Encabezado04Container.AddObjectProperty("GridName", "Encabezado04");
      }
      else
      {
         Encabezado04Container.AddObjectProperty("GridName", "Encabezado04");
         Encabezado04Container.AddObjectProperty("Header", subEncabezado04_Header);
         Encabezado04Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         Encabezado04Container.AddObjectProperty("Class", "FreeStyleGrid");
         Encabezado04Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("CmpContext", "");
         Encabezado04Container.AddObjectProperty("InMasterPage", "false");
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disitem3_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disitem3()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblockcombo_sdtencabezadopedido_procecod_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Procecod(), (byte)(4), (byte)(0), ".", "")));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_dispart_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart(), (byte)(4), (byte)(0), ".", "")));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disordcomp());
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblockcombo_sdtencabezadopedido_cod_idtx_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Cod_idtx()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disnormst01_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst01()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disnormst02_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst02()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disnormst03_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst03()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disnormst04_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst04()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disnormst05_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst05()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disrec_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest()));
         Encabezado04Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtencabezadopedido_disdest_Visible, (byte)(5), (byte)(0), ".", "")));
         Encabezado04Column.AddObjectProperty("Caption", GXutil.rtrim( edtavSdtencabezadopedido_disdest_Caption));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_nxt_statio_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_statio()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_nxt_modelo_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_modelo()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disexp_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disexp()));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_nxt_artcli_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli()));
         Encabezado04Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavSdtencabezadopedido_nxt_artcli.getVisible(), (byte)(5), (byte)(0), ".", "")));
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_observaciones_Caption);
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado04Column.AddObjectProperty("Value", AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones());
         Encabezado04Container.AddColumnProperties(Encabezado04Column);
         Encabezado04Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Encabezado04Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subEncabezado04_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol333( )
   {
      if ( GridsdtarticulopedidosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridsdtarticulopedidosContainer"+"DivS\" data-gxgridid=\"333\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtarticulopedidos_Internalname, subGridsdtarticulopedidos_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtarticulopedidos_Backcolorstyle == 0 )
         {
            subGridsdtarticulopedidos_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtarticulopedidos_Class) > 0 )
            {
               subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtarticulopedidos_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtarticulopedidos_Backcolorstyle == 1 )
            {
               subGridsdtarticulopedidos_Titlebackcolor = subGridsdtarticulopedidos_Allbackcolor ;
               if ( GXutil.len( subGridsdtarticulopedidos_Class) > 0 )
               {
                  subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtarticulopedidos_Class) > 0 )
               {
                  subGridsdtarticulopedidos_Linesclass = subGridsdtarticulopedidos_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrição", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInsert_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Processo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Peças", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "largura(cm)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "gramajen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtarticulopedidosContainer.AddObjectProperty("GridName", "Gridsdtarticulopedidos");
      }
      else
      {
         GridsdtarticulopedidosContainer.AddObjectProperty("GridName", "Gridsdtarticulopedidos");
         GridsdtarticulopedidosContainer.AddObjectProperty("Header", subGridsdtarticulopedidos_Header);
         GridsdtarticulopedidosContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtarticulopedidosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("CmpContext", "");
         GridsdtarticulopedidosContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV15Delete));
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtarticulopedidos__disartcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtarticulopedidos__artdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV26Insert));
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInsert_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInsert_Visible, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Value", hV76ComboProCDsc);
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV30ProCod));
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV31ProDsc));
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtarticulopedidos__procod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosColumn.AddObjectProperty("Value", GXutil.rtrim( AV44Update));
         GridsdtarticulopedidosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtarticulopedidosContainer.AddColumnProperties(GridsdtarticulopedidosColumn);
         GridsdtarticulopedidosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtarticulopedidosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtarticulopedidos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol32( )
   {
      if ( Encabezado01Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Encabezado01Container"+"DivS\" data-gxgridid=\"32\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subEncabezado01_Internalname, subEncabezado01_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         Encabezado01Container.AddObjectProperty("GridName", "Encabezado01");
      }
      else
      {
         Encabezado01Container.AddObjectProperty("GridName", "Encabezado01");
         Encabezado01Container.AddObjectProperty("Header", subEncabezado01_Header);
         Encabezado01Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         Encabezado01Container.AddObjectProperty("Class", "FreeStyleGrid");
         Encabezado01Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("CmpContext", "");
         Encabezado01Container.AddObjectProperty("InMasterPage", "false");
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_clicod_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", hV79GXV1);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblockclicod_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", hV9CliCod);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disenccli_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disenccli()));
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disfec_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", localUtil.format(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfec(), "99/99/99"));
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disfeccli_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", localUtil.format(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfeccli(), "99/99/99"));
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_disfecent_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", localUtil.format(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfecent(), "99/99/99"));
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_albrreo_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Albrreo()));
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", lblTextblocksdtencabezadopedido_displa_Caption);
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Encabezado01Column.AddObjectProperty("Value", GXutil.rtrim( AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Displa()));
         Encabezado01Container.AddColumnProperties(Encabezado01Column);
         Encabezado01Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Encabezado01Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subEncabezado01_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnlimpiar_Internalname = "BTNLIMPIAR" ;
      lblTextblocksdtencabezadopedido_clicod_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_CLICOD" ;
      edtavSdtencabezadopedido_clicod_Internalname = "SDTENCABEZADOPEDIDO_CLICOD" ;
      divUnnamedtablesdtencabezadopedido_clicod_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_CLICOD" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblocksdtencabezadopedido_disenccli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISENCCLI" ;
      edtavSdtencabezadopedido_disenccli_Internalname = "SDTENCABEZADOPEDIDO_DISENCCLI" ;
      divUnnamedtablesdtencabezadopedido_disenccli_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISENCCLI" ;
      lblTextblocksdtencabezadopedido_disfec_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFEC" ;
      edtavSdtencabezadopedido_disfec_Internalname = "SDTENCABEZADOPEDIDO_DISFEC" ;
      divUnnamedtablesdtencabezadopedido_disfec_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISFEC" ;
      lblTextblocksdtencabezadopedido_disfeccli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFECCLI" ;
      edtavSdtencabezadopedido_disfeccli_Internalname = "SDTENCABEZADOPEDIDO_DISFECCLI" ;
      divUnnamedtablesdtencabezadopedido_disfeccli_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISFECCLI" ;
      lblTextblocksdtencabezadopedido_disfecent_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISFECENT" ;
      edtavSdtencabezadopedido_disfecent_Internalname = "SDTENCABEZADOPEDIDO_DISFECENT" ;
      divUnnamedtablesdtencabezadopedido_disfecent_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISFECENT" ;
      lblTextblocksdtencabezadopedido_albrreo_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_ALBRREO" ;
      chkavSdtencabezadopedido_albrreo.setInternalname( "SDTENCABEZADOPEDIDO_ALBRREO" );
      divUnnamedtablesdtencabezadopedido_albrreo_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_ALBRREO" ;
      lblTextblocksdtencabezadopedido_displa_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISPLA" ;
      chkavSdtencabezadopedido_displa.setInternalname( "SDTENCABEZADOPEDIDO_DISPLA" );
      divUnnamedtablesdtencabezadopedido_displa_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISPLA" ;
      divUnnamedtablefsencabezado01_Internalname = "UNNAMEDTABLEFSENCABEZADO01" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblocksdtencabezadopedido_discolnom_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISCOLNOM" ;
      edtavSdtencabezadopedido_discolnom_Internalname = "SDTENCABEZADOPEDIDO_DISCOLNOM" ;
      edtavSeleccionarcolor_Internalname = "vSELECCIONARCOLOR" ;
      chkavColorencontrado.setInternalname( "vCOLORENCONTRADO" );
      chkavColorprompt.setInternalname( "vCOLORPROMPT" );
      tblTablemergedsdtencabezadopedido_discolnom_Internalname = "TABLEMERGEDSDTENCABEZADOPEDIDO_DISCOLNOM" ;
      divTablesplittedsdtencabezadopedido_discolnom_Internalname = "TABLESPLITTEDSDTENCABEZADOPEDIDO_DISCOLNOM" ;
      lblTextblocksdtencabezadopedido_discolnum_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISCOLNUM" ;
      edtavSdtencabezadopedido_discolnum_Internalname = "SDTENCABEZADOPEDIDO_DISCOLNUM" ;
      divUnnamedtablesdtencabezadopedido_discolnum_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISCOLNUM" ;
      lblTextblocksdtencabezadopedido_distipcol_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISTIPCOL" ;
      dynavSdtencabezadopedido_distipcol.setInternalname( "SDTENCABEZADOPEDIDO_DISTIPCOL" );
      divUnnamedtablesdtencabezadopedido_distipcol_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISTIPCOL" ;
      lblTextblocksdtencabezadopedido_disnomcli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNOMCLI" ;
      edtavSdtencabezadopedido_disnomcli_Internalname = "SDTENCABEZADOPEDIDO_DISNOMCLI" ;
      divUnnamedtablesdtencabezadopedido_disnomcli_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNOMCLI" ;
      lblTextblocksdtencabezadopedido_disnumcli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNUMCLI" ;
      edtavSdtencabezadopedido_disnumcli_Internalname = "SDTENCABEZADOPEDIDO_DISNUMCLI" ;
      divUnnamedtablesdtencabezadopedido_disnumcli_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNUMCLI" ;
      lblTextblocksdtencabezadopedido_disobs_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISOBS" ;
      edtavSdtencabezadopedido_disobs_Internalname = "SDTENCABEZADOPEDIDO_DISOBS" ;
      divUnnamedtablesdtencabezadopedido_disobs_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISOBS" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      tblUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      divEncabezado03_Internalname = "ENCABEZADO03" ;
      lblTextblocksdtencabezadopedido_disitem3_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISITEM3" ;
      edtavSdtencabezadopedido_disitem3_Internalname = "SDTENCABEZADOPEDIDO_DISITEM3" ;
      divUnnamedtablesdtencabezadopedido_disitem3_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISITEM3" ;
      lblTextblockcombo_sdtencabezadopedido_procecod_Internalname = "TEXTBLOCKCOMBO_SDTENCABEZADOPEDIDO_PROCECOD" ;
      edtavSdtencabezadopedido_procecod_Internalname = "SDTENCABEZADOPEDIDO_PROCECOD" ;
      divTablesplittedsdtencabezadopedido_procecod_Internalname = "TABLESPLITTEDSDTENCABEZADOPEDIDO_PROCECOD" ;
      lblTextblocksdtencabezadopedido_dispart_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISPART" ;
      edtavSdtencabezadopedido_dispart_Internalname = "SDTENCABEZADOPEDIDO_DISPART" ;
      divUnnamedtablesdtencabezadopedido_dispart_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISPART" ;
      edtavSdtencabezadopedido_disordcomp_Internalname = "SDTENCABEZADOPEDIDO_DISORDCOMP" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockcombo_sdtencabezadopedido_cod_idtx_Internalname = "TEXTBLOCKCOMBO_SDTENCABEZADOPEDIDO_COD_IDTX" ;
      edtavSdtencabezadopedido_cod_idtx_Internalname = "SDTENCABEZADOPEDIDO_COD_IDTX" ;
      divTablesplittedsdtencabezadopedido_cod_idtx_Internalname = "TABLESPLITTEDSDTENCABEZADOPEDIDO_COD_IDTX" ;
      lblTextblocksdtencabezadopedido_disnormst01_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST01" ;
      chkavSdtencabezadopedido_disnormst01.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST01" );
      divUnnamedtablesdtencabezadopedido_disnormst01_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNORMST01" ;
      lblTextblocksdtencabezadopedido_disnormst02_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST02" ;
      chkavSdtencabezadopedido_disnormst02.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST02" );
      divUnnamedtablesdtencabezadopedido_disnormst02_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNORMST02" ;
      lblTextblocksdtencabezadopedido_disnormst03_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST03" ;
      chkavSdtencabezadopedido_disnormst03.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST03" );
      divUnnamedtablesdtencabezadopedido_disnormst03_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNORMST03" ;
      lblTextblocksdtencabezadopedido_disnormst04_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST04" ;
      chkavSdtencabezadopedido_disnormst04.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST04" );
      divUnnamedtablesdtencabezadopedido_disnormst04_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNORMST04" ;
      lblTextblocksdtencabezadopedido_disnormst05_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISNORMST05" ;
      chkavSdtencabezadopedido_disnormst05.setInternalname( "SDTENCABEZADOPEDIDO_DISNORMST05" );
      divUnnamedtablesdtencabezadopedido_disnormst05_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISNORMST05" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblocksdtencabezadopedido_disrec_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISREC" ;
      chkavSdtencabezadopedido_disrec.setInternalname( "SDTENCABEZADOPEDIDO_DISREC" );
      divUnnamedtablesdtencabezadopedido_disrec_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISREC" ;
      edtavSdtencabezadopedido_disdest_Internalname = "SDTENCABEZADOPEDIDO_DISDEST" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTextblocksdtencabezadopedido_nxt_statio_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_STATIO" ;
      chkavSdtencabezadopedido_nxt_statio.setInternalname( "SDTENCABEZADOPEDIDO_NXT_STATIO" );
      divUnnamedtablesdtencabezadopedido_nxt_statio_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_NXT_STATIO" ;
      lblTextblocksdtencabezadopedido_nxt_modelo_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_MODELO" ;
      chkavSdtencabezadopedido_nxt_modelo.setInternalname( "SDTENCABEZADOPEDIDO_NXT_MODELO" );
      divUnnamedtablesdtencabezadopedido_nxt_modelo_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_NXT_MODELO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblocksdtencabezadopedido_disexp_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_DISEXP" ;
      chkavSdtencabezadopedido_disexp.setInternalname( "SDTENCABEZADOPEDIDO_DISEXP" );
      divUnnamedtablesdtencabezadopedido_disexp_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_DISEXP" ;
      lblTextblocksdtencabezadopedido_nxt_artcli_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_ARTCLI" ;
      cmbavSdtencabezadopedido_nxt_artcli.setInternalname( "SDTENCABEZADOPEDIDO_NXT_ARTCLI" );
      divUnnamedtablesdtencabezadopedido_nxt_artcli_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_NXT_ARTCLI" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      lblTextblocksdtencabezadopedido_observaciones_Internalname = "TEXTBLOCKSDTENCABEZADOPEDIDO_OBSERVACIONES" ;
      edtavSdtencabezadopedido_observaciones_Internalname = "SDTENCABEZADOPEDIDO_OBSERVACIONES" ;
      divUnnamedtablesdtencabezadopedido_observaciones_Internalname = "UNNAMEDTABLESDTENCABEZADOPEDIDO_OBSERVACIONES" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtablefsencabezado04_Internalname = "UNNAMEDTABLEFSENCABEZADO04" ;
      lblTextblockcombo_artcdsc_Internalname = "TEXTBLOCKCOMBO_ARTCDSC" ;
      Combo_artcdsc_Internalname = "COMBO_ARTCDSC" ;
      divTablesplittedartcdsc_Internalname = "TABLESPLITTEDARTCDSC" ;
      divTablaadicionar_Internalname = "TABLAADICIONAR" ;
      edtavDelete_Internalname = "vDELETE" ;
      edtavSdtarticulopedidos__disartcod_Internalname = "SDTARTICULOPEDIDOS__DISARTCOD" ;
      edtavSdtarticulopedidos__artdsc_Internalname = "SDTARTICULOPEDIDOS__ARTDSC" ;
      edtavInsert_Internalname = "vINSERT" ;
      edtavComboprocdsc_Internalname = "vCOMBOPROCDSC" ;
      edtavProcod_Internalname = "vPROCOD" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      edtavSdtarticulopedidos__procod_Internalname = "SDTARTICULOPEDIDOS__PROCOD" ;
      edtavUpdate_Internalname = "vUPDATE" ;
      edtavSdtarticulopedidos__disnumpie_Internalname = "SDTARTICULOPEDIDOS__DISNUMPIE" ;
      edtavSdtarticulopedidos__kilos_Internalname = "SDTARTICULOPEDIDOS__KILOS" ;
      edtavSdtarticulopedidos__metros_Internalname = "SDTARTICULOPEDIDOS__METROS" ;
      edtavSdtarticulopedidos__disartanh_Internalname = "SDTARTICULOPEDIDOS__DISARTANH" ;
      edtavSdtarticulopedidos__disgraaca_Internalname = "SDTARTICULOPEDIDOS__DISGRAACA" ;
      Gridsdtarticulopedidospaginationbar_Internalname = "GRIDSDTARTICULOPEDIDOSPAGINATIONBAR" ;
      divGridsdtarticulopedidostablewithpaginationbar_Internalname = "GRIDSDTARTICULOPEDIDOSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divEncabezado05_Internalname = "ENCABEZADO05" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_sdtencabezadopedido_procecod_Internalname = "COMBO_SDTENCABEZADOPEDIDO_PROCECOD" ;
      Combo_sdtencabezadopedido_cod_idtx_Internalname = "COMBO_SDTENCABEZADOPEDIDO_COD_IDTX" ;
      edtavArtcdsc_Internalname = "vARTCDSC" ;
      edtavDatospedidojson_Internalname = "vDATOSPEDIDOJSON" ;
      edtavDisartcod_Internalname = "vDISARTCOD" ;
      edtavAdicionar_Internalname = "vADICIONAR" ;
      chkavRealizado.setInternalname( "vREALIZADO" );
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Gridsdtarticulopedidos_empowerer_Internalname = "GRIDSDTARTICULOPEDIDOS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subEncabezado01_Internalname = "ENCABEZADO01" ;
      subEncabezado04_Internalname = "ENCABEZADO04" ;
      subGridsdtarticulopedidos_Internalname = "GRIDSDTARTICULOPEDIDOS" ;
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
      subEncabezado01_Allowcollapsing = (byte)(0) ;
      lblTextblocksdtencabezadopedido_displa_Caption = httpContext.getMessage( "Amostras?", "") ;
      lblTextblocksdtencabezadopedido_albrreo_Caption = httpContext.getMessage( "Reclamação?", "") ;
      lblTextblocksdtencabezadopedido_disfecent_Caption = httpContext.getMessage( "Data Ent Prev", "") ;
      lblTextblocksdtencabezadopedido_disfeccli_Caption = httpContext.getMessage( "Data Enc Cli", "") ;
      lblTextblocksdtencabezadopedido_disfec_Caption = httpContext.getMessage( "Data Ent", "") ;
      lblTextblocksdtencabezadopedido_disenccli_Caption = httpContext.getMessage( "Talao Cliente", "") ;
      lblTextblockclicod_Caption = httpContext.getMessage( "Cód. Cliente", "") ;
      lblTextblocksdtencabezadopedido_clicod_Caption = httpContext.getMessage( "Cliente", "") ;
      subGridsdtarticulopedidos_Allowcollapsing = (byte)(0) ;
      subGridsdtarticulopedidos_Allowselection = (byte)(0) ;
      subGridsdtarticulopedidos_Header = "" ;
      subEncabezado04_Allowcollapsing = (byte)(0) ;
      lblTextblocksdtencabezadopedido_observaciones_Caption = httpContext.getMessage( "Observações", "") ;
      lblTextblocksdtencabezadopedido_nxt_artcli_Caption = httpContext.getMessage( "Enc Cliente", "") ;
      lblTextblocksdtencabezadopedido_disexp_Caption = httpContext.getMessage( "Exportação", "") ;
      lblTextblocksdtencabezadopedido_nxt_modelo_Caption = httpContext.getMessage( "Lista de substâncias Restritas na Fabricação?", "") ;
      lblTextblocksdtencabezadopedido_nxt_statio_Caption = httpContext.getMessage( "Relatorio de Analide da composição da Malha?", "") ;
      lblTextblocksdtencabezadopedido_disrec_Caption = httpContext.getMessage( "Não Conforme?", "") ;
      lblTextblocksdtencabezadopedido_disnormst05_Caption = httpContext.getMessage( "OEKO-Tex?", "") ;
      lblTextblocksdtencabezadopedido_disnormst04_Caption = httpContext.getMessage( "RCS?", "") ;
      lblTextblocksdtencabezadopedido_disnormst03_Caption = httpContext.getMessage( "Ocs?", "") ;
      lblTextblocksdtencabezadopedido_disnormst02_Caption = httpContext.getMessage( "Grs?", "") ;
      lblTextblocksdtencabezadopedido_disnormst01_Caption = httpContext.getMessage( "Gots?", "") ;
      lblTextblockcombo_sdtencabezadopedido_cod_idtx_Caption = httpContext.getMessage( "Clear to Wear", "") ;
      lblTextblocksdtencabezadopedido_dispart_Caption = httpContext.getMessage( "N° de Partida", "") ;
      lblTextblockcombo_sdtencabezadopedido_procecod_Caption = httpContext.getMessage( "Malheiro", "") ;
      lblTextblocksdtencabezadopedido_disitem3_Caption = httpContext.getMessage( "Nº Enc Cliente", "") ;
      edtavSdtarticulopedidos__disgraaca_Jsonclick = "" ;
      edtavSdtarticulopedidos__disgraaca_Visible = -1 ;
      edtavSdtarticulopedidos__disgraaca_Enabled = 1 ;
      edtavSdtarticulopedidos__disartanh_Jsonclick = "" ;
      edtavSdtarticulopedidos__disartanh_Visible = -1 ;
      edtavSdtarticulopedidos__disartanh_Enabled = 1 ;
      edtavSdtarticulopedidos__metros_Jsonclick = "" ;
      edtavSdtarticulopedidos__metros_Visible = -1 ;
      edtavSdtarticulopedidos__metros_Enabled = 1 ;
      edtavSdtarticulopedidos__kilos_Jsonclick = "" ;
      edtavSdtarticulopedidos__kilos_Visible = -1 ;
      edtavSdtarticulopedidos__kilos_Enabled = 1 ;
      edtavSdtarticulopedidos__disnumpie_Jsonclick = "" ;
      edtavSdtarticulopedidos__disnumpie_Visible = -1 ;
      edtavSdtarticulopedidos__disnumpie_Enabled = 1 ;
      edtavUpdate_Jsonclick = "" ;
      edtavUpdate_Visible = -1 ;
      edtavUpdate_Enabled = 1 ;
      edtavSdtarticulopedidos__procod_Jsonclick = "" ;
      edtavSdtarticulopedidos__procod_Enabled = 0 ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Visible = 0 ;
      edtavProdsc_Enabled = 1 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Visible = 0 ;
      edtavProcod_Enabled = 1 ;
      edtavComboprocdsc_Jsonclick = "" ;
      edtavComboprocdsc_Visible = -1 ;
      edtavComboprocdsc_Enabled = 1 ;
      edtavInsert_Jsonclick = "" ;
      edtavInsert_Enabled = 1 ;
      edtavSdtarticulopedidos__artdsc_Jsonclick = "" ;
      edtavSdtarticulopedidos__artdsc_Enabled = 0 ;
      edtavSdtarticulopedidos__disartcod_Jsonclick = "" ;
      edtavSdtarticulopedidos__disartcod_Enabled = 0 ;
      edtavDelete_Jsonclick = "" ;
      edtavDelete_Visible = -1 ;
      edtavDelete_Enabled = 1 ;
      subGridsdtarticulopedidos_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtarticulopedidos_Backcolorstyle = (byte)(0) ;
      edtavSdtencabezadopedido_observaciones_Visible = 1 ;
      edtavSdtencabezadopedido_observaciones_Enabled = 1 ;
      cmbavSdtencabezadopedido_nxt_artcli.setJsonclick( "" );
      cmbavSdtencabezadopedido_nxt_artcli.setVisible( 1 );
      cmbavSdtencabezadopedido_nxt_artcli.setEnabled( 1 );
      lblTextblocksdtencabezadopedido_nxt_artcli_Visible = 1 ;
      chkavSdtencabezadopedido_disexp.setCaption( httpContext.getMessage( "Exportación", "") );
      chkavSdtencabezadopedido_disexp.setVisible( 1 );
      chkavSdtencabezadopedido_disexp.setEnabled( 1 );
      chkavSdtencabezadopedido_nxt_modelo.setCaption( httpContext.getMessage( "Subst Restritas na Fabric?", "") );
      chkavSdtencabezadopedido_nxt_modelo.setVisible( 1 );
      chkavSdtencabezadopedido_nxt_modelo.setEnabled( 1 );
      chkavSdtencabezadopedido_nxt_statio.setCaption( httpContext.getMessage( "Relat Anal. da Compo da Malha?", "") );
      chkavSdtencabezadopedido_nxt_statio.setVisible( 1 );
      chkavSdtencabezadopedido_nxt_statio.setEnabled( 1 );
      edtavSdtencabezadopedido_disdest_Jsonclick = "" ;
      edtavSdtencabezadopedido_disdest_Enabled = 1 ;
      edtavSdtencabezadopedido_disdest_Caption = httpContext.getMessage( "Motivo N/C", "") ;
      edtavSdtencabezadopedido_disdest_Visible = 1 ;
      chkavSdtencabezadopedido_disrec.setCaption( httpContext.getMessage( "No conforme?", "") );
      chkavSdtencabezadopedido_disrec.setVisible( 1 );
      chkavSdtencabezadopedido_disrec.setEnabled( 1 );
      chkavSdtencabezadopedido_disnormst05.setCaption( httpContext.getMessage( "OEKO-Tex?", "") );
      chkavSdtencabezadopedido_disnormst05.setVisible( 1 );
      chkavSdtencabezadopedido_disnormst05.setEnabled( 1 );
      chkavSdtencabezadopedido_disnormst04.setCaption( httpContext.getMessage( "RCS?", "") );
      chkavSdtencabezadopedido_disnormst04.setVisible( 1 );
      chkavSdtencabezadopedido_disnormst04.setEnabled( 1 );
      chkavSdtencabezadopedido_disnormst03.setCaption( httpContext.getMessage( "Ocs?", "") );
      chkavSdtencabezadopedido_disnormst03.setVisible( 1 );
      chkavSdtencabezadopedido_disnormst03.setEnabled( 1 );
      chkavSdtencabezadopedido_disnormst02.setCaption( httpContext.getMessage( "Grs?", "") );
      chkavSdtencabezadopedido_disnormst02.setVisible( 1 );
      chkavSdtencabezadopedido_disnormst02.setEnabled( 1 );
      chkavSdtencabezadopedido_disnormst01.setCaption( httpContext.getMessage( "Gots?", "") );
      chkavSdtencabezadopedido_disnormst01.setVisible( 1 );
      chkavSdtencabezadopedido_disnormst01.setEnabled( 1 );
      edtavSdtencabezadopedido_cod_idtx_Jsonclick = "" ;
      edtavSdtencabezadopedido_cod_idtx_Visible = 1 ;
      edtavSdtencabezadopedido_cod_idtx_Enabled = 1 ;
      edtavSdtencabezadopedido_disordcomp_Jsonclick = "" ;
      edtavSdtencabezadopedido_disordcomp_Visible = 1 ;
      edtavSdtencabezadopedido_disordcomp_Enabled = 1 ;
      edtavSdtencabezadopedido_dispart_Jsonclick = "" ;
      edtavSdtencabezadopedido_dispart_Visible = 1 ;
      edtavSdtencabezadopedido_dispart_Enabled = 1 ;
      edtavSdtencabezadopedido_procecod_Jsonclick = "" ;
      edtavSdtencabezadopedido_procecod_Visible = 1 ;
      edtavSdtencabezadopedido_procecod_Enabled = 1 ;
      edtavSdtencabezadopedido_disitem3_Jsonclick = "" ;
      edtavSdtencabezadopedido_disitem3_Visible = 1 ;
      edtavSdtencabezadopedido_disitem3_Enabled = 1 ;
      subEncabezado04_Class = "FreeStyleGrid" ;
      chkavSdtencabezadopedido_displa.setCaption( httpContext.getMessage( "Muestras?", "") );
      chkavSdtencabezadopedido_displa.setVisible( 1 );
      chkavSdtencabezadopedido_displa.setEnabled( 1 );
      chkavSdtencabezadopedido_albrreo.setCaption( httpContext.getMessage( "Reclamacion?", "") );
      chkavSdtencabezadopedido_albrreo.setVisible( 1 );
      chkavSdtencabezadopedido_albrreo.setEnabled( 1 );
      edtavSdtencabezadopedido_disfecent_Jsonclick = "" ;
      edtavSdtencabezadopedido_disfecent_Visible = 1 ;
      edtavSdtencabezadopedido_disfecent_Enabled = 1 ;
      edtavSdtencabezadopedido_disfeccli_Jsonclick = "" ;
      edtavSdtencabezadopedido_disfeccli_Visible = 1 ;
      edtavSdtencabezadopedido_disfeccli_Enabled = 1 ;
      edtavSdtencabezadopedido_disfec_Jsonclick = "" ;
      edtavSdtencabezadopedido_disfec_Visible = 1 ;
      edtavSdtencabezadopedido_disfec_Enabled = 1 ;
      edtavSdtencabezadopedido_disenccli_Jsonclick = "" ;
      edtavSdtencabezadopedido_disenccli_Visible = 1 ;
      edtavSdtencabezadopedido_disenccli_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavSdtencabezadopedido_clicod_Jsonclick = "" ;
      edtavSdtencabezadopedido_clicod_Visible = 1 ;
      edtavSdtencabezadopedido_clicod_Enabled = 1 ;
      subEncabezado01_Class = "FreeStyleGrid" ;
      edtavSeleccionarcolor_Jsonclick = "" ;
      edtavSeleccionarcolor_Enabled = 1 ;
      edtavSdtencabezadopedido_discolnom_Jsonclick = "" ;
      edtavSdtencabezadopedido_discolnom_Enabled = 1 ;
      edtavSdtencabezadopedido_disobs_Jsonclick = "" ;
      edtavSdtencabezadopedido_disobs_Enabled = 1 ;
      edtavSdtencabezadopedido_disnumcli_Jsonclick = "" ;
      edtavSdtencabezadopedido_disnumcli_Enabled = 1 ;
      edtavSdtencabezadopedido_disnomcli_Jsonclick = "" ;
      edtavSdtencabezadopedido_disnomcli_Enabled = 1 ;
      dynavSdtencabezadopedido_distipcol.setJsonclick( "" );
      dynavSdtencabezadopedido_distipcol.setEnabled( 1 );
      edtavSdtencabezadopedido_discolnum_Jsonclick = "" ;
      edtavSdtencabezadopedido_discolnum_Enabled = 1 ;
      lblTextblocksdtencabezadopedido_disnormst03_Caption = httpContext.getMessage( "Ocs?", "") ;
      lblTextblocksdtencabezadopedido_disnormst02_Caption = httpContext.getMessage( "Grs?", "") ;
      lblTextblocksdtencabezadopedido_disnormst01_Caption = httpContext.getMessage( "Gots?", "") ;
      edtavSdtencabezadopedido_disdest_Caption = httpContext.getMessage( "Motivo N/C", "") ;
      chkavColorprompt.setEnabled( 1 );
      chkavColorencontrado.setEnabled( 1 );
      subEncabezado04_Backcolorstyle = (byte)(0) ;
      subEncabezado01_Backcolorstyle = (byte)(0) ;
      edtavSdtarticulopedidos__procod_Enabled = -1 ;
      edtavSdtarticulopedidos__artdsc_Enabled = -1 ;
      edtavSdtarticulopedidos__disartcod_Enabled = -1 ;
      chkavRealizado.setVisible( 1 );
      edtavAdicionar_Jsonclick = "" ;
      edtavAdicionar_Visible = 1 ;
      edtavDisartcod_Jsonclick = "" ;
      edtavDisartcod_Visible = 1 ;
      edtavDatospedidojson_Visible = 1 ;
      edtavArtcdsc_Jsonclick = "" ;
      edtavArtcdsc_Visible = 1 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "Realizar Procesamiento con los datos registrados" ;
      Dvelop_confirmpanel_confirmar_Title = httpContext.getMessage( "Confirmar Procesamiento", "") ;
      Combo_sdtencabezadopedido_cod_idtx_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_sdtencabezadopedido_cod_idtx_Titlecontrolidtoreplace = "" ;
      Combo_sdtencabezadopedido_cod_idtx_Cls = "ExtendedCombo AttributeFL" ;
      Combo_sdtencabezadopedido_procecod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_sdtencabezadopedido_procecod_Titlecontrolidtoreplace = "" ;
      Combo_sdtencabezadopedido_procecod_Cls = "ExtendedCombo AttributeFL" ;
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
      Gridsdtarticulopedidospaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtarticulopedidospaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtarticulopedidospaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtarticulopedidospaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtarticulopedidospaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtarticulopedidospaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtarticulopedidospaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtarticulopedidospaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtarticulopedidospaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtarticulopedidospaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtarticulopedidospaginationbar_Pagestoshow = 5 ;
      Gridsdtarticulopedidospaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtarticulopedidospaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtarticulopedidospaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtarticulopedidospaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtarticulopedidospaginationbar_Class = "PaginationBar" ;
      Combo_artcdsc_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Datos Cliente", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Web Datos Pedido", "") );
      edtavInsert_Visible = -1 ;
      subGridsdtarticulopedidos_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "SDTENCABEZADOPEDIDO_ALBRREO_" + sGXsfl_32_idx ;
      chkavSdtencabezadopedido_albrreo.setName( GXCCtl );
      chkavSdtencabezadopedido_albrreo.setWebtags( "" );
      chkavSdtencabezadopedido_albrreo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_albrreo.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_albrreo.getCaption(), !bGXsfl_32_Refreshing);
      chkavSdtencabezadopedido_albrreo.setCheckedValue( "NO" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISPLA_" + sGXsfl_32_idx ;
      chkavSdtencabezadopedido_displa.setName( GXCCtl );
      chkavSdtencabezadopedido_displa.setWebtags( "" );
      chkavSdtencabezadopedido_displa.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_displa.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_displa.getCaption(), !bGXsfl_32_Refreshing);
      chkavSdtencabezadopedido_displa.setCheckedValue( "N" );
      chkavColorencontrado.setName( "vCOLORENCONTRADO" );
      chkavColorencontrado.setWebtags( "" );
      chkavColorencontrado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavColorencontrado.getInternalname(), "TitleCaption", chkavColorencontrado.getCaption(), true);
      chkavColorencontrado.setCheckedValue( "false" );
      AV11ColorEncontrado = GXutil.strtobool( GXutil.booltostr( AV11ColorEncontrado)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ColorEncontrado", AV11ColorEncontrado);
      chkavColorprompt.setName( "vCOLORPROMPT" );
      chkavColorprompt.setWebtags( "" );
      chkavColorprompt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavColorprompt.getInternalname(), "TitleCaption", chkavColorprompt.getCaption(), true);
      chkavColorprompt.setCheckedValue( "false" );
      AV58ColorPrompt = GXutil.strtobool( GXutil.booltostr( AV58ColorPrompt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58ColorPrompt", AV58ColorPrompt);
      dynavSdtencabezadopedido_distipcol.setName( "SDTENCABEZADOPEDIDO_DISTIPCOL" );
      dynavSdtencabezadopedido_distipcol.setWebtags( "" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST01_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst01.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst01.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst01.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst01.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst01.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst01.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST02_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst02.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst02.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst02.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst02.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst02.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst02.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST03_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst03.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst03.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst03.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst03.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst03.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst03.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST04_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst04.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst04.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst04.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst04.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst04.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst04.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISNORMST05_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disnormst05.setName( GXCCtl );
      chkavSdtencabezadopedido_disnormst05.setWebtags( "" );
      chkavSdtencabezadopedido_disnormst05.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disnormst05.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disnormst05.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disnormst05.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISREC_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disrec.setName( GXCCtl );
      chkavSdtencabezadopedido_disrec.setWebtags( "" );
      chkavSdtencabezadopedido_disrec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disrec.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disrec.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disrec.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_NXT_STATIO_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_nxt_statio.setName( GXCCtl );
      chkavSdtencabezadopedido_nxt_statio.setWebtags( "" );
      chkavSdtencabezadopedido_nxt_statio.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_nxt_statio.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_nxt_statio.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_nxt_statio.setCheckedValue( "NAO" );
      GXCCtl = "SDTENCABEZADOPEDIDO_NXT_MODELO_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_nxt_modelo.setName( GXCCtl );
      chkavSdtencabezadopedido_nxt_modelo.setWebtags( "" );
      chkavSdtencabezadopedido_nxt_modelo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_nxt_modelo.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_nxt_modelo.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_nxt_modelo.setCheckedValue( "NAO" );
      GXCCtl = "SDTENCABEZADOPEDIDO_DISEXP_" + sGXsfl_171_idx ;
      chkavSdtencabezadopedido_disexp.setName( GXCCtl );
      chkavSdtencabezadopedido_disexp.setWebtags( "" );
      chkavSdtencabezadopedido_disexp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtencabezadopedido_disexp.getInternalname(), "TitleCaption", chkavSdtencabezadopedido_disexp.getCaption(), !bGXsfl_171_Refreshing);
      chkavSdtencabezadopedido_disexp.setCheckedValue( "N" );
      GXCCtl = "SDTENCABEZADOPEDIDO_NXT_ARTCLI_" + sGXsfl_171_idx ;
      cmbavSdtencabezadopedido_nxt_artcli.setName( GXCCtl );
      cmbavSdtencabezadopedido_nxt_artcli.setWebtags( "" );
      cmbavSdtencabezadopedido_nxt_artcli.addItem("Sem Definir", httpContext.getMessage( "Sem Definir", ""), (short)(0));
      cmbavSdtencabezadopedido_nxt_artcli.addItem("MARROCOS", httpContext.getMessage( "MARROCOS", ""), (short)(0));
      cmbavSdtencabezadopedido_nxt_artcli.addItem("MARROCOS (CORTA PT)", httpContext.getMessage( "MARROCOS (CORTA PT)", ""), (short)(0));
      if ( cmbavSdtencabezadopedido_nxt_artcli.getItemCount() > 0 )
      {
         AV39SdtEnCabezadoPedido.setgxTv_SdtSdtEncabezadoPedido_Nxt_artcli( cmbavSdtencabezadopedido_nxt_artcli.getValidValue(AV39SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli()) );
      }
      chkavRealizado.setName( "vREALIZADO" );
      chkavRealizado.setWebtags( "" );
      chkavRealizado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavRealizado.getInternalname(), "TitleCaption", chkavRealizado.getCaption(), true);
      chkavRealizado.setCheckedValue( "false" );
      AV32Realizado = GXutil.strtobool( GXutil.booltostr( AV32Realizado)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Realizado", AV32Realizado);
      /* End function init_web_controls */
   }

   public void validv_Gxv1( )
   {
      if ( (GXutil.strcmp("", hV79GXV1)==0) )
      {
         GXV1 = 0 ;
      }
      else
      {
         A13735CliCNom = hV79GXV1 ;
         /* Using cursor H00DA18 */
         pr_default.execute(16, new Object[] {A13735CliCNom, AV18EmprCod});
         GXV1 = H00DA18_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vGXV1");
               GX_FocusControl = edtavSdtencabezadopedido_clicod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV79GXV1", hV79GXV1);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "GXV1", GXutil.ltrim( localUtil.ntoc( GXV1, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV79GXV1", hV79GXV1);
   }

   public void validv_Clicod( )
   {
      if ( (GXutil.strcmp("", hV9CliCod)==0) )
      {
         AV9CliCod = 0 ;
      }
      else
      {
         A13735CliCNom = hV9CliCod ;
         /* Using cursor H00DA19 */
         pr_default.execute(17, new Object[] {A13735CliCNom});
         AV9CliCod = H00DA19_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV9CliCod", hV9CliCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9CliCod", GXutil.ltrim( localUtil.ntoc( AV9CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV9CliCod", hV9CliCod);
   }

   public void validv_Comboprocdsc( )
   {
      if ( (GXutil.strcmp("", hV76ComboProCDsc)==0) )
      {
         AV76ComboProCDsc = "" ;
      }
      else
      {
         A13771ProCDsc = hV76ComboProCDsc ;
         /* Using cursor H00DA20 */
         pr_default.execute(18, new Object[] {A13771ProCDsc, AV18EmprCod});
         AV76ComboProCDsc = H00DA20_A758ProCod[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vCOMBOPROCDSC");
               GX_FocusControl = edtavComboprocdsc_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV76ComboProCDsc", hV76ComboProCDsc);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV76ComboProCDsc", AV76ComboProCDsc);
      httpContext.ajax_rsp_assign_attri("", false, "hV76ComboProCDsc", hV76ComboProCDsc);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'ENCABEZADO01_nFirstRecordOnPage'},{av:'ENCABEZADO01_nEOF'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'ENCABEZADO04_nFirstRecordOnPage'},{av:'ENCABEZADO04_nEOF'},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV23GridSdtArticuloPedidosCurrentPage',fld:'vGRIDSDTARTICULOPEDIDOSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV24GridSdtArticuloPedidosPageCount',fld:'vGRIDSDTARTICULOPEDIDOSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333}]}");
      setEventMetadata("ENCABEZADO04.LOAD","{handler:'e42DA3',iparms:[]");
      setEventMetadata("ENCABEZADO04.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTARTICULOPEDIDOS.LOAD","{handler:'e34DA4',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("GRIDSDTARTICULOPEDIDOS.LOAD",",oparms:[{av:'AV15Delete',fld:'vDELETE',pic:''},{av:'AV26Insert',fld:'vINSERT',pic:''},{av:'AV44Update',fld:'vUPDATE',pic:''},{av:'AV76ComboProCDsc',fld:'vCOMBOPROCDSC',pic:''},{av:'AV30ProCod',fld:'vPROCOD',pic:''},{av:'AV31ProDsc',fld:'vPRODSC',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("ENCABEZADO01.LOAD","{handler:'e30DA2',iparms:[]");
      setEventMetadata("ENCABEZADO01.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTARTICULOPEDIDOSPAGINATIONBAR.CHANGEPAGE","{handler:'e11DA2',iparms:[{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''},{av:'Gridsdtarticulopedidospaginationbar_Selectedpage',ctrl:'GRIDSDTARTICULOPEDIDOSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTARTICULOPEDIDOSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTARTICULOPEDIDOSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12DA2',iparms:[{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''},{av:'Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTARTICULOPEDIDOSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTARTICULOPEDIDOSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e16DA2',iparms:[{av:'AV56Messages',fld:'vMESSAGES',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV56Messages',fld:'vMESSAGES',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e15DA2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'ENCABEZADO01_nFirstRecordOnPage'},{av:'ENCABEZADO01_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''},{av:'ENCABEZADO04_nFirstRecordOnPage'},{av:'ENCABEZADO04_nEOF'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV23GridSdtArticuloPedidosCurrentPage',fld:'vGRIDSDTARTICULOPEDIDOSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV24GridSdtArticuloPedidosPageCount',fld:'vGRIDSDTARTICULOPEDIDOSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333}]}");
      setEventMetadata("'DOLIMPIAR'","{handler:'e17DA2',iparms:[{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("'DOLIMPIAR'",",oparms:[{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("COMBO_SDTENCABEZADOPEDIDO_COD_IDTX.ONOPTIONCLICKED","{handler:'e14DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("COMBO_SDTENCABEZADOPEDIDO_COD_IDTX.ONOPTIONCLICKED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("COMBO_SDTENCABEZADOPEDIDO_PROCECOD.ONOPTIONCLICKED","{handler:'e13DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("COMBO_SDTENCABEZADOPEDIDO_PROCECOD.ONOPTIONCLICKED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_CLICOD.CONTROLVALUECHANGED","{handler:'e31DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_CLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("VADICIONAR.CLICK","{handler:'e18DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("VADICIONAR.CLICK",",oparms:[{av:'AV32Realizado',fld:'vREALIZADO',pic:''},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("VREALIZADO.CONTROLVALUECHANGED","{handler:'e19DA2',iparms:[{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''},{av:'ENCABEZADO01_nFirstRecordOnPage'},{av:'ENCABEZADO01_nEOF'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'ENCABEZADO04_nFirstRecordOnPage'},{av:'ENCABEZADO04_nEOF'}]");
      setEventMetadata("VREALIZADO.CONTROLVALUECHANGED",",oparms:[{av:'AV32Realizado',fld:'vREALIZADO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV23GridSdtArticuloPedidosCurrentPage',fld:'vGRIDSDTARTICULOPEDIDOSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV24GridSdtArticuloPedidosPageCount',fld:'vGRIDSDTARTICULOPEDIDOSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDELETE.CLICK","{handler:'e35DA2',iparms:[{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'ENCABEZADO01_nFirstRecordOnPage'},{av:'ENCABEZADO01_nEOF'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'ENCABEZADO04_nFirstRecordOnPage'},{av:'ENCABEZADO04_nEOF'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''}]");
      setEventMetadata("VDELETE.CLICK",",oparms:[{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("VUPDATE.CLICK","{handler:'e36DA2',iparms:[{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30ProCod',fld:'vPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV41SdtFasePedidoCollection',fld:'vSDTFASEPEDIDOCOLLECTION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'ENCABEZADO01_nFirstRecordOnPage'},{av:'ENCABEZADO01_nEOF'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'ENCABEZADO04_nFirstRecordOnPage'},{av:'ENCABEZADO04_nEOF'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''}]");
      setEventMetadata("VUPDATE.CLICK",",oparms:[{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV31ProDsc',fld:'vPRODSC',pic:''},{av:'AV30ProCod',fld:'vPROCOD',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV41SdtFasePedidoCollection',fld:'vSDTFASEPEDIDOCOLLECTION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISCOLNOM.CONTROLVALUECHANGED","{handler:'e20DA2',iparms:[{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISCOLNOM.CONTROLVALUECHANGED",",oparms:[{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("VSELECCIONARCOLOR.CLICK","{handler:'e52DA1',iparms:[{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]");
      setEventMetadata("VSELECCIONARCOLOR.CLICK",",oparms:[{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''}]}");
      setEventMetadata("VCOLORENCONTRADO.CONTROLVALUECHANGED","{handler:'e21DA2',iparms:[{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("VCOLORENCONTRADO.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("VCOLORPROMPT.CONTROLVALUECHANGED","{handler:'e22DA2',iparms:[{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("VCOLORPROMPT.CONTROLVALUECHANGED",",oparms:[{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISCOLNUM.CONTROLVALUECHANGED","{handler:'e23DA2',iparms:[{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISCOLNUM.CONTROLVALUECHANGED",",oparms:[{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISTIPCOL.CONTROLVALUECHANGED","{handler:'e24DA2',iparms:[{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISTIPCOL.CONTROLVALUECHANGED",",oparms:[{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISOBS.CONTROLVALUECHANGED","{handler:'e25DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISOBS.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISNOMCLI.CONTROLVALUECHANGED","{handler:'e26DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISNOMCLI.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISNUMCLI.CONTROLVALUECHANGED","{handler:'e27DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISNUMCLI.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISEXP.CONTROLVALUECHANGED","{handler:'e43DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISEXP.CONTROLVALUECHANGED",",oparms:[{av:'edtavDatospedidojson_Visible',ctrl:'vDATOSPEDIDOJSON',prop:'Visible'},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{ctrl:'SDTENCABEZADOPEDIDO_DISDEST',prop:'Visible'},{av:'lblTextblocksdtencabezadopedido_nxt_artcli_Visible',ctrl:'TEXTBLOCKSDTENCABEZADOPEDIDO_NXT_ARTCLI',prop:'Visible'},{ctrl:'SDTENCABEZADOPEDIDO_NXT_ARTCLI',prop:'Visible'},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_NXT_ARTCLI.CONTROLVALUECHANGED","{handler:'e44DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_NXT_ARTCLI.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISPART.CONTROLVALUECHANGED","{handler:'e45DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISPART.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_NXT_MODELO.CONTROLVALUECHANGED","{handler:'e46DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_NXT_MODELO.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_NXT_STATIO.CONTROLVALUECHANGED","{handler:'e47DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_NXT_STATIO.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISORDCOMP.CONTROLVALUECHANGED","{handler:'e48DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISORDCOMP.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISREC.CONTROLVALUECHANGED","{handler:'e49DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISREC.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{ctrl:'SDTENCABEZADOPEDIDO_DISDEST',prop:'Caption'},{ctrl:'SDTENCABEZADOPEDIDO_DISDEST',prop:'Visible'},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISDEST.CONTROLVALUECHANGED","{handler:'e50DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISDEST.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTARTICULOPEDIDOS__DISNUMPIE.CONTROLVALUECHANGED","{handler:'e37DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTARTICULOPEDIDOS__DISNUMPIE.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTARTICULOPEDIDOS__KILOS.CONTROLVALUECHANGED","{handler:'e38DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTARTICULOPEDIDOS__KILOS.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTARTICULOPEDIDOS__METROS.CONTROLVALUECHANGED","{handler:'e39DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTARTICULOPEDIDOS__METROS.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTARTICULOPEDIDOS__DISARTANH.CONTROLVALUECHANGED","{handler:'e40DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTARTICULOPEDIDOS__DISARTANH.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTARTICULOPEDIDOS__DISGRAACA.CONTROLVALUECHANGED","{handler:'e41DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTARTICULOPEDIDOS__DISGRAACA.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("ENCABEZADO01.REFRESH","{handler:'e32DA2',iparms:[{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'ENCABEZADO01_nFirstRecordOnPage'},{av:'ENCABEZADO01_nEOF'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'ENCABEZADO04_nFirstRecordOnPage'},{av:'ENCABEZADO04_nEOF'},{av:'GRIDSDTARTICULOPEDIDOS_nEOF'},{av:'subGridsdtarticulopedidos_Rows',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'Rows'},{av:'edtavInsert_Visible',ctrl:'vINSERT',prop:'Visible'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicadoSetWebSession',fld:'vAPLICADOSETWEBSESSION',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV11ColorEncontrado',fld:'vCOLORENCONTRADO',pic:''},{av:'AV58ColorPrompt',fld:'vCOLORPROMPT',pic:''},{av:'AV32Realizado',fld:'vREALIZADO',pic:''}]");
      setEventMetadata("ENCABEZADO01.REFRESH",",oparms:[{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''},{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISENCCLI.CONTROLVALUECHANGED","{handler:'e33DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_DISENCCLI.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("SDTENCABEZADOPEDIDO_OBSERVACIONES.CONTROLVALUECHANGED","{handler:'e51DA2',iparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV38SdtArticuloPedidos',fld:'vSDTARTICULOPEDIDOS',grid:333,pic:''},{av:'nGXsfl_333_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:333},{av:'GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_333',ctrl:'GRIDSDTARTICULOPEDIDOS',prop:'GridRC',grid:333},{av:'AV12Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("SDTENCABEZADOPEDIDO_OBSERVACIONES.CONTROLVALUECHANGED",",oparms:[{av:'AV39SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV14DatosPedidoJSON',fld:'vDATOSPEDIDOJSON',pic:''}]}");
      setEventMetadata("VINSERT.CLICK","{handler:'e53DA4',iparms:[]");
      setEventMetadata("VINSERT.CLICK",",oparms:[]}");
      setEventMetadata("VALIDV_GXV1","{handler:'validv_Gxv1',iparms:[{av:'hV79GXV1'},{av:'GXV1',fld:'SDTENCABEZADOPEDIDO_CLICOD',pic:'ZZZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_GXV1",",oparms:[{av:'GXV1',fld:'SDTENCABEZADOPEDIDO_CLICOD',pic:'ZZZZZ9'},{av:'hV79GXV1'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[{av:'hV9CliCod'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'hV9CliCod'}]}");
      setEventMetadata("VALIDV_GXV6","{handler:'validv_Gxv6',iparms:[]");
      setEventMetadata("VALIDV_GXV6",",oparms:[]}");
      setEventMetadata("VALIDV_GXV7","{handler:'validv_Gxv7',iparms:[]");
      setEventMetadata("VALIDV_GXV7",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv30',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPROCDSC","{handler:'validv_Comboprocdsc',iparms:[{av:'hV76ComboProCDsc'},{av:'AV76ComboProCDsc',fld:'vCOMBOPROCDSC',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_COMBOPROCDSC",",oparms:[{av:'AV76ComboProCDsc',fld:'vCOMBOPROCDSC',pic:''},{av:'hV76ComboProCDsc'}]}");
      setEventMetadata("VALIDV_PROCOD","{handler:'validv_Procod',iparms:[]");
      setEventMetadata("VALIDV_PROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv39',iparms:[]");
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
      AV39SdtEnCabezadoPedido = new app.SdtSdtEncabezadoPedido(remoteHandle, context);
      Gridsdtarticulopedidospaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Combo_artcdsc_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV18EmprCod = "" ;
      A13771ProCDsc = "" ;
      A13735CliCNom = "" ;
      hV76ComboProCDsc = "" ;
      hV79GXV1 = "" ;
      hV9CliCod = "" ;
      AV38SdtArticuloPedidos = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
      AV12Contexto = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV75ArtCDsc_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV67SdtEnCabezadoPedido_ProceCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV63SdtEnCabezadoPedido_Cod_Idtx_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV56Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV41SdtFasePedidoCollection = new GXBaseCollection<app.SdtSdtFasePedido>(app.SdtSdtFasePedido.class, "SdtFasePedido", "TexplusNET", remoteHandle);
      Combo_artcdsc_Selectedvalue_set = "" ;
      Gridsdtarticulopedidos_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnlimpiar_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      Encabezado04Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblTextblockcombo_artcdsc_Jsonclick = "" ;
      ucCombo_artcdsc = new com.genexus.webpanels.GXUserControl();
      Combo_artcdsc_Caption = "" ;
      GridsdtarticulopedidosContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridsdtarticulopedidospaginationbar = new com.genexus.webpanels.GXUserControl();
      ucCombo_sdtencabezadopedido_procecod = new com.genexus.webpanels.GXUserControl();
      Combo_sdtencabezadopedido_procecod_Caption = "" ;
      ucCombo_sdtencabezadopedido_cod_idtx = new com.genexus.webpanels.GXUserControl();
      Combo_sdtencabezadopedido_cod_idtx_Caption = "" ;
      AV74ArtCDsc = "" ;
      AV14DatosPedidoJSON = "" ;
      AV16DisArtCod = "" ;
      AV5Adicionar = "" ;
      ucGridsdtarticulopedidos_empowerer = new com.genexus.webpanels.GXUserControl();
      Encabezado01Container = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV15Delete = "" ;
      AV26Insert = "" ;
      AV30ProCod = "" ;
      AV31ProDsc = "" ;
      AV44Update = "" ;
      AV76ComboProCDsc = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13771ProCDsc = "" ;
      H00DA2_A13771ProCDsc = new String[] {""} ;
      l13735CliCNom = "" ;
      H00DA3_A13735CliCNom = new String[] {""} ;
      H00DA4_A13735CliCNom = new String[] {""} ;
      H00DA5_A13771ProCDsc = new String[] {""} ;
      H00DA5_A396EmprCod = new String[] {""} ;
      H00DA5_A758ProCod = new String[] {""} ;
      H00DA6_A279CliNom = new String[] {""} ;
      H00DA6_A13735CliCNom = new String[] {""} ;
      H00DA6_A396EmprCod = new String[] {""} ;
      H00DA6_A252CliCod = new int[1] ;
      A279CliNom = "" ;
      H00DA7_A13735CliCNom = new String[] {""} ;
      H00DA7_A396EmprCod = new String[] {""} ;
      H00DA7_A252CliCod = new int[1] ;
      H00DA8_A831TipColCod = new byte[1] ;
      H00DA8_A832TipColDsc = new String[] {""} ;
      H00DA8_n832TipColDsc = new boolean[] {false} ;
      H00DA8_A396EmprCod = new String[] {""} ;
      AV42SeleccionarColor = "" ;
      AV45WebSession = httpContext.getWebSession();
      H00DA9_A13735CliCNom = new String[] {""} ;
      H00DA9_A396EmprCod = new String[] {""} ;
      H00DA9_A252CliCod = new int[1] ;
      AV118Station = "" ;
      AV119Emprnom = "" ;
      AV120Usurcod = "" ;
      AV54Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      H00DA10_A252CliCod = new int[1] ;
      H00DA10_A396EmprCod = new String[] {""} ;
      H00DA10_A69ArtDsc = new String[] {""} ;
      H00DA10_n69ArtDsc = new boolean[] {false} ;
      H00DA10_A65ArtCod = new String[] {""} ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      AV59Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00DA11_A396EmprCod = new String[] {""} ;
      H00DA11_A10887Cod_Idtx = new String[] {""} ;
      H00DA11_A10888Dsc_Idtx = new String[] {""} ;
      H00DA11_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      H00DA12_A396EmprCod = new String[] {""} ;
      H00DA12_A970ProceCod = new short[1] ;
      H00DA12_A971ProceNom = new String[] {""} ;
      H00DA12_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      H00DA13_A13735CliCNom = new String[] {""} ;
      H00DA13_A396EmprCod = new String[] {""} ;
      H00DA13_A252CliCod = new int[1] ;
      AV43TemporalSdtArticuloPedido = new app.SdtSdtArticuloPedido(remoteHandle, context);
      AV46Window = new com.genexus.webpanels.GXWindow();
      GXv_int7 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_boolean8 = new boolean[1] ;
      A8886DisDest = "" ;
      H00DA14_A758ProCod = new String[] {""} ;
      H00DA14_A396EmprCod = new String[] {""} ;
      H00DA14_A774ProNumLin = new short[1] ;
      H00DA14_A457FasCod = new String[] {""} ;
      H00DA14_A460FasDsc = new String[] {""} ;
      AV40SdtFasePedido = new app.SdtSdtFasePedido(remoteHandle, context);
      A13218NormaDsc = "" ;
      A13217NormaID = "" ;
      H00DA15_A396EmprCod = new String[] {""} ;
      H00DA15_A13218NormaDsc = new String[] {""} ;
      H00DA15_n13218NormaDsc = new boolean[] {false} ;
      H00DA15_A13217NormaID = new String[] {""} ;
      GXv_int6 = new byte[1] ;
      AV17DisDes = "" ;
      H00DA16_A13771ProCDsc = new String[] {""} ;
      H00DA16_A396EmprCod = new String[] {""} ;
      H00DA16_A758ProCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      H00DA17_A13771ProCDsc = new String[] {""} ;
      H00DA17_A396EmprCod = new String[] {""} ;
      H00DA17_A758ProCod = new String[] {""} ;
      GridsdtarticulopedidosRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      lblTextblocksdtencabezadopedido_discolnom_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_discolnum_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_distipcol_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnomcli_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnumcli_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disobs_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Encabezado01Row = new com.genexus.webpanels.GXWebRow();
      subEncabezado01_Linesclass = "" ;
      lblTextblocksdtencabezadopedido_clicod_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disenccli_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disfec_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disfeccli_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disfecent_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_albrreo_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_displa_Jsonclick = "" ;
      Encabezado04Row = new com.genexus.webpanels.GXWebRow();
      subEncabezado04_Linesclass = "" ;
      lblTextblocksdtencabezadopedido_disitem3_Jsonclick = "" ;
      lblTextblockcombo_sdtencabezadopedido_procecod_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_dispart_Jsonclick = "" ;
      lblTextblockcombo_sdtencabezadopedido_cod_idtx_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnormst01_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnormst02_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnormst03_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnormst04_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disnormst05_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disrec_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_nxt_statio_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_nxt_modelo_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_disexp_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_nxt_artcli_Jsonclick = "" ;
      lblTextblocksdtencabezadopedido_observaciones_Jsonclick = "" ;
      subGridsdtarticulopedidos_Linesclass = "" ;
      subEncabezado04_Header = "" ;
      Encabezado04Column = new com.genexus.webpanels.GXWebColumn();
      GridsdtarticulopedidosColumn = new com.genexus.webpanels.GXWebColumn();
      subEncabezado01_Header = "" ;
      Encabezado01Column = new com.genexus.webpanels.GXWebColumn();
      H00DA18_A279CliNom = new String[] {""} ;
      H00DA18_A13735CliCNom = new String[] {""} ;
      H00DA18_A396EmprCod = new String[] {""} ;
      H00DA18_A252CliCod = new int[1] ;
      ZhV79GXV1 = "" ;
      H00DA19_A13735CliCNom = new String[] {""} ;
      H00DA19_A396EmprCod = new String[] {""} ;
      H00DA19_A252CliCod = new int[1] ;
      ZhV9CliCod = "" ;
      H00DA20_A13771ProCDsc = new String[] {""} ;
      H00DA20_A396EmprCod = new String[] {""} ;
      H00DA20_A758ProCod = new String[] {""} ;
      ZV76ComboProCDsc = "" ;
      ZhV76ComboProCDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webdatospedido__default(),
         new Object[] {
             new Object[] {
            H00DA2_A13771ProCDsc
            }
            , new Object[] {
            H00DA3_A13735CliCNom
            }
            , new Object[] {
            H00DA4_A13735CliCNom
            }
            , new Object[] {
            H00DA5_A13771ProCDsc, H00DA5_A396EmprCod, H00DA5_A758ProCod
            }
            , new Object[] {
            H00DA6_A279CliNom, H00DA6_A13735CliCNom, H00DA6_A396EmprCod, H00DA6_A252CliCod
            }
            , new Object[] {
            H00DA7_A13735CliCNom, H00DA7_A396EmprCod, H00DA7_A252CliCod
            }
            , new Object[] {
            H00DA8_A831TipColCod, H00DA8_A832TipColDsc, H00DA8_n832TipColDsc, H00DA8_A396EmprCod
            }
            , new Object[] {
            H00DA9_A13735CliCNom, H00DA9_A396EmprCod, H00DA9_A252CliCod
            }
            , new Object[] {
            H00DA10_A252CliCod, H00DA10_A396EmprCod, H00DA10_A69ArtDsc, H00DA10_n69ArtDsc, H00DA10_A65ArtCod
            }
            , new Object[] {
            H00DA11_A396EmprCod, H00DA11_A10887Cod_Idtx, H00DA11_A10888Dsc_Idtx, H00DA11_n10888Dsc_Idtx
            }
            , new Object[] {
            H00DA12_A396EmprCod, H00DA12_A970ProceCod, H00DA12_A971ProceNom, H00DA12_n971ProceNom
            }
            , new Object[] {
            H00DA13_A13735CliCNom, H00DA13_A396EmprCod, H00DA13_A252CliCod
            }
            , new Object[] {
            H00DA14_A758ProCod, H00DA14_A396EmprCod, H00DA14_A774ProNumLin, H00DA14_A457FasCod, H00DA14_A460FasDsc
            }
            , new Object[] {
            H00DA15_A396EmprCod, H00DA15_A13218NormaDsc, H00DA15_n13218NormaDsc, H00DA15_A13217NormaID
            }
            , new Object[] {
            H00DA16_A13771ProCDsc, H00DA16_A396EmprCod, H00DA16_A758ProCod
            }
            , new Object[] {
            H00DA17_A13771ProCDsc, H00DA17_A396EmprCod, H00DA17_A758ProCod
            }
            , new Object[] {
            H00DA18_A279CliNom, H00DA18_A13735CliCNom, H00DA18_A396EmprCod, H00DA18_A252CliCod
            }
            , new Object[] {
            H00DA19_A13735CliCNom, H00DA19_A396EmprCod, H00DA19_A252CliCod
            }
            , new Object[] {
            H00DA20_A13771ProCDsc, H00DA20_A396EmprCod, H00DA20_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSeleccionarcolor_Enabled = 0 ;
      edtavDelete_Enabled = 0 ;
      edtavSdtarticulopedidos__disartcod_Enabled = 0 ;
      edtavSdtarticulopedidos__artdsc_Enabled = 0 ;
      edtavInsert_Enabled = 0 ;
      edtavProcod_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
      edtavSdtarticulopedidos__procod_Enabled = 0 ;
      edtavUpdate_Enabled = 0 ;
   }

   private byte GRIDSDTARTICULOPEDIDOS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subEncabezado01_Backcolorstyle ;
   private byte subEncabezado04_Backcolorstyle ;
   private byte subGridsdtarticulopedidos_Backcolorstyle ;
   private byte ENCABEZADO01_nEOF ;
   private byte ENCABEZADO04_nEOF ;
   private byte AV126GXLvl651 ;
   private byte AV20FlagPS ;
   private byte GXt_int9 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subEncabezado01_Backstyle ;
   private byte subEncabezado04_Backstyle ;
   private byte subGridsdtarticulopedidos_Backstyle ;
   private byte subEncabezado04_Allowselection ;
   private byte subEncabezado04_Allowhovering ;
   private byte subEncabezado04_Allowcollapsing ;
   private byte subEncabezado04_Collapsed ;
   private byte subGridsdtarticulopedidos_Titlebackstyle ;
   private byte subGridsdtarticulopedidos_Allowselection ;
   private byte subGridsdtarticulopedidos_Allowhovering ;
   private byte subGridsdtarticulopedidos_Allowcollapsing ;
   private byte subGridsdtarticulopedidos_Collapsed ;
   private byte subEncabezado01_Allowselection ;
   private byte subEncabezado01_Allowhovering ;
   private byte subEncabezado01_Allowcollapsing ;
   private byte subEncabezado01_Collapsed ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A774ProNumLin ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short A970ProceCod ;
   private short AV28NumeroIndex ;
   private short AV8CantidadNormas ;
   private int Gridsdtarticulopedidospaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_32 ;
   private int nRC_GXsfl_171 ;
   private int nRC_GXsfl_333 ;
   private int subGridsdtarticulopedidos_Rows ;
   private int nGXsfl_32_idx=1 ;
   private int AV9CliCod ;
   private int nGXsfl_171_idx=1 ;
   private int nGXsfl_333_idx=1 ;
   private int edtavInsert_Visible ;
   private int Gridsdtarticulopedidospaginationbar_Pagestoshow ;
   private int AV109GXV31 ;
   private int edtavArtcdsc_Visible ;
   private int edtavDatospedidojson_Visible ;
   private int edtavDisartcod_Visible ;
   private int edtavAdicionar_Visible ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int subEncabezado01_Islastpage ;
   private int subEncabezado04_Islastpage ;
   private int subGridsdtarticulopedidos_Islastpage ;
   private int edtavSeleccionarcolor_Enabled ;
   private int edtavDelete_Enabled ;
   private int edtavSdtarticulopedidos__disartcod_Enabled ;
   private int edtavSdtarticulopedidos__artdsc_Enabled ;
   private int edtavInsert_Enabled ;
   private int edtavProcod_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavSdtarticulopedidos__procod_Enabled ;
   private int edtavUpdate_Enabled ;
   private int GRIDSDTARTICULOPEDIDOS_nGridOutOfScope ;
   private int nGXsfl_333_fel_idx=1 ;
   private int AV29PageToGo ;
   private int AV121GXV40 ;
   private int nGXsfl_333_bak_idx=1 ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int edtavSdtencabezadopedido_disdest_Visible ;
   private int lblTextblocksdtencabezadopedido_nxt_artcli_Visible ;
   private int edtavSdtencabezadopedido_discolnum_Enabled ;
   private int edtavSdtencabezadopedido_disnomcli_Enabled ;
   private int edtavSdtencabezadopedido_disnumcli_Enabled ;
   private int edtavSdtencabezadopedido_disobs_Enabled ;
   private int edtavSdtencabezadopedido_discolnom_Enabled ;
   private int idxLst ;
   private int subEncabezado01_Backcolor ;
   private int subEncabezado01_Allbackcolor ;
   private int edtavSdtencabezadopedido_clicod_Enabled ;
   private int edtavSdtencabezadopedido_clicod_Visible ;
   private int edtavSdtencabezadopedido_disenccli_Enabled ;
   private int edtavSdtencabezadopedido_disenccli_Visible ;
   private int edtavSdtencabezadopedido_disfec_Enabled ;
   private int edtavSdtencabezadopedido_disfec_Visible ;
   private int edtavSdtencabezadopedido_disfeccli_Enabled ;
   private int edtavSdtencabezadopedido_disfeccli_Visible ;
   private int edtavSdtencabezadopedido_disfecent_Enabled ;
   private int edtavSdtencabezadopedido_disfecent_Visible ;
   private int subEncabezado04_Backcolor ;
   private int subEncabezado04_Allbackcolor ;
   private int edtavSdtencabezadopedido_disitem3_Enabled ;
   private int edtavSdtencabezadopedido_disitem3_Visible ;
   private int edtavSdtencabezadopedido_procecod_Enabled ;
   private int edtavSdtencabezadopedido_procecod_Visible ;
   private int edtavSdtencabezadopedido_dispart_Enabled ;
   private int edtavSdtencabezadopedido_dispart_Visible ;
   private int edtavSdtencabezadopedido_disordcomp_Enabled ;
   private int edtavSdtencabezadopedido_disordcomp_Visible ;
   private int edtavSdtencabezadopedido_cod_idtx_Enabled ;
   private int edtavSdtencabezadopedido_cod_idtx_Visible ;
   private int edtavSdtencabezadopedido_disdest_Enabled ;
   private int edtavSdtencabezadopedido_observaciones_Enabled ;
   private int edtavSdtencabezadopedido_observaciones_Visible ;
   private int subGridsdtarticulopedidos_Backcolor ;
   private int subGridsdtarticulopedidos_Allbackcolor ;
   private int edtavDelete_Visible ;
   private int edtavComboprocdsc_Enabled ;
   private int edtavComboprocdsc_Visible ;
   private int edtavProcod_Visible ;
   private int edtavProdsc_Visible ;
   private int edtavUpdate_Visible ;
   private int edtavSdtarticulopedidos__disnumpie_Enabled ;
   private int edtavSdtarticulopedidos__disnumpie_Visible ;
   private int edtavSdtarticulopedidos__kilos_Enabled ;
   private int edtavSdtarticulopedidos__kilos_Visible ;
   private int edtavSdtarticulopedidos__metros_Enabled ;
   private int edtavSdtarticulopedidos__metros_Visible ;
   private int edtavSdtarticulopedidos__disartanh_Enabled ;
   private int edtavSdtarticulopedidos__disartanh_Visible ;
   private int edtavSdtarticulopedidos__disgraaca_Enabled ;
   private int edtavSdtarticulopedidos__disgraaca_Visible ;
   private int subEncabezado04_Selectedindex ;
   private int subEncabezado04_Selectioncolor ;
   private int subEncabezado04_Hoveringcolor ;
   private int subGridsdtarticulopedidos_Titlebackcolor ;
   private int subGridsdtarticulopedidos_Selectedindex ;
   private int subGridsdtarticulopedidos_Selectioncolor ;
   private int subGridsdtarticulopedidos_Hoveringcolor ;
   private int subEncabezado01_Selectedindex ;
   private int subEncabezado01_Selectioncolor ;
   private int subEncabezado01_Hoveringcolor ;
   private int GXV1=0 ;
   private int ZV79GXV1 ;
   private int ZV9CliCod ;
   private long GRIDSDTARTICULOPEDIDOS_nFirstRecordOnPage ;
   private long AV23GridSdtArticuloPedidosCurrentPage ;
   private long AV24GridSdtArticuloPedidosPageCount ;
   private long ENCABEZADO01_nCurrentRecord ;
   private long ENCABEZADO04_nCurrentRecord ;
   private long GRIDSDTARTICULOPEDIDOS_nCurrentRecord ;
   private long ENCABEZADO01_nFirstRecordOnPage ;
   private long GRIDSDTARTICULOPEDIDOS_nRecordCount ;
   private long ENCABEZADO04_nFirstRecordOnPage ;
   private String Gridsdtarticulopedidospaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Combo_artcdsc_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_333_idx="0001" ;
   private String AV18EmprCod ;
   private String sGXsfl_32_idx="0001" ;
   private String sGXsfl_171_idx="0001" ;
   private String edtavInsert_Internalname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Combo_artcdsc_Cls ;
   private String Combo_artcdsc_Selectedvalue_set ;
   private String Gridsdtarticulopedidospaginationbar_Class ;
   private String Gridsdtarticulopedidospaginationbar_Pagingbuttonsposition ;
   private String Gridsdtarticulopedidospaginationbar_Pagingcaptionposition ;
   private String Gridsdtarticulopedidospaginationbar_Emptygridclass ;
   private String Gridsdtarticulopedidospaginationbar_Rowsperpageoptions ;
   private String Gridsdtarticulopedidospaginationbar_Previous ;
   private String Gridsdtarticulopedidospaginationbar_Next ;
   private String Gridsdtarticulopedidospaginationbar_Caption ;
   private String Gridsdtarticulopedidospaginationbar_Emptygridcaption ;
   private String Gridsdtarticulopedidospaginationbar_Rowsperpagecaption ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Combo_sdtencabezadopedido_procecod_Cls ;
   private String Combo_sdtencabezadopedido_procecod_Titlecontrolidtoreplace ;
   private String Combo_sdtencabezadopedido_cod_idtx_Cls ;
   private String Combo_sdtencabezadopedido_cod_idtx_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Gridsdtarticulopedidos_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnlimpiar_Internalname ;
   private String bttBtnlimpiar_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divEncabezado03_Internalname ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String sStyleString ;
   private String subEncabezado04_Internalname ;
   private String divEncabezado05_Internalname ;
   private String divTablaadicionar_Internalname ;
   private String divTablesplittedartcdsc_Internalname ;
   private String lblTextblockcombo_artcdsc_Internalname ;
   private String lblTextblockcombo_artcdsc_Jsonclick ;
   private String Combo_artcdsc_Caption ;
   private String Combo_artcdsc_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridsdtarticulopedidostablewithpaginationbar_Internalname ;
   private String subGridsdtarticulopedidos_Internalname ;
   private String Gridsdtarticulopedidospaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_sdtencabezadopedido_procecod_Caption ;
   private String Combo_sdtencabezadopedido_procecod_Internalname ;
   private String Combo_sdtencabezadopedido_cod_idtx_Caption ;
   private String Combo_sdtencabezadopedido_cod_idtx_Internalname ;
   private String edtavArtcdsc_Internalname ;
   private String edtavArtcdsc_Jsonclick ;
   private String edtavDatospedidojson_Internalname ;
   private String edtavDisartcod_Internalname ;
   private String edtavDisartcod_Jsonclick ;
   private String edtavAdicionar_Internalname ;
   private String AV5Adicionar ;
   private String edtavAdicionar_Jsonclick ;
   private String Gridsdtarticulopedidos_empowerer_Internalname ;
   private String subEncabezado01_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtencabezadopedido_clicod_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavSdtencabezadopedido_disenccli_Internalname ;
   private String edtavSdtencabezadopedido_disfec_Internalname ;
   private String edtavSdtencabezadopedido_disfeccli_Internalname ;
   private String edtavSdtencabezadopedido_disfecent_Internalname ;
   private String GXCCtl ;
   private String AV15Delete ;
   private String edtavDelete_Internalname ;
   private String AV26Insert ;
   private String edtavComboprocdsc_Internalname ;
   private String AV30ProCod ;
   private String edtavProcod_Internalname ;
   private String AV31ProDsc ;
   private String edtavProdsc_Internalname ;
   private String AV44Update ;
   private String edtavUpdate_Internalname ;
   private String edtavSdtencabezadopedido_disitem3_Internalname ;
   private String edtavSdtencabezadopedido_procecod_Internalname ;
   private String edtavSdtencabezadopedido_dispart_Internalname ;
   private String edtavSdtencabezadopedido_disordcomp_Internalname ;
   private String edtavSdtencabezadopedido_cod_idtx_Internalname ;
   private String edtavSdtencabezadopedido_disdest_Internalname ;
   private String edtavSdtencabezadopedido_observaciones_Internalname ;
   private String edtavSdtencabezadopedido_discolnom_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String edtavSeleccionarcolor_Internalname ;
   private String edtavSdtarticulopedidos__disartcod_Internalname ;
   private String edtavSdtarticulopedidos__artdsc_Internalname ;
   private String edtavSdtarticulopedidos__procod_Internalname ;
   private String sGXsfl_333_fel_idx="0001" ;
   private String AV42SeleccionarColor ;
   private String edtavSdtencabezadopedido_discolnum_Internalname ;
   private String edtavSdtencabezadopedido_disnomcli_Internalname ;
   private String edtavSdtencabezadopedido_disnumcli_Internalname ;
   private String edtavSdtencabezadopedido_disobs_Internalname ;
   private String AV118Station ;
   private String AV119Emprnom ;
   private String AV120Usurcod ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A971ProceNom ;
   private String edtavSdtencabezadopedido_disdest_Caption ;
   private String A8886DisDest ;
   private String lblTextblocksdtencabezadopedido_nxt_artcli_Internalname ;
   private String A13218NormaDsc ;
   private String A13217NormaID ;
   private String lblTextblocksdtencabezadopedido_disnormst01_Caption ;
   private String lblTextblocksdtencabezadopedido_disnormst01_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst02_Caption ;
   private String lblTextblocksdtencabezadopedido_disnormst02_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst03_Caption ;
   private String lblTextblocksdtencabezadopedido_disnormst03_Internalname ;
   private String AV17DisDes ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblUnnamedtable9_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divTablesplittedsdtencabezadopedido_discolnom_Internalname ;
   private String lblTextblocksdtencabezadopedido_discolnom_Internalname ;
   private String lblTextblocksdtencabezadopedido_discolnom_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_discolnum_Internalname ;
   private String lblTextblocksdtencabezadopedido_discolnum_Internalname ;
   private String lblTextblocksdtencabezadopedido_discolnum_Jsonclick ;
   private String edtavSdtencabezadopedido_discolnum_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_distipcol_Internalname ;
   private String lblTextblocksdtencabezadopedido_distipcol_Internalname ;
   private String lblTextblocksdtencabezadopedido_distipcol_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnomcli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnomcli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnomcli_Jsonclick ;
   private String edtavSdtencabezadopedido_disnomcli_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnumcli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnumcli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnumcli_Jsonclick ;
   private String edtavSdtencabezadopedido_disnumcli_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disobs_Internalname ;
   private String lblTextblocksdtencabezadopedido_disobs_Internalname ;
   private String lblTextblocksdtencabezadopedido_disobs_Jsonclick ;
   private String edtavSdtencabezadopedido_disobs_Jsonclick ;
   private String tblTablemergedsdtencabezadopedido_discolnom_Internalname ;
   private String edtavSdtencabezadopedido_discolnom_Jsonclick ;
   private String edtavSeleccionarcolor_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String lblTextblocksdtencabezadopedido_clicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblocksdtencabezadopedido_disenccli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disfec_Internalname ;
   private String lblTextblocksdtencabezadopedido_disfeccli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disfecent_Internalname ;
   private String lblTextblocksdtencabezadopedido_albrreo_Internalname ;
   private String lblTextblocksdtencabezadopedido_displa_Internalname ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subEncabezado01_Class ;
   private String subEncabezado01_Linesclass ;
   private String divUnnamedtablefsencabezado01_Internalname ;
   private String divUnnamedtablesdtencabezadopedido_clicod_Internalname ;
   private String lblTextblocksdtencabezadopedido_clicod_Jsonclick ;
   private String ROClassString ;
   private String edtavSdtencabezadopedido_clicod_Jsonclick ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtavClicod_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disenccli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disenccli_Jsonclick ;
   private String edtavSdtencabezadopedido_disenccli_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disfec_Internalname ;
   private String lblTextblocksdtencabezadopedido_disfec_Jsonclick ;
   private String edtavSdtencabezadopedido_disfec_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disfeccli_Internalname ;
   private String lblTextblocksdtencabezadopedido_disfeccli_Jsonclick ;
   private String edtavSdtencabezadopedido_disfeccli_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disfecent_Internalname ;
   private String lblTextblocksdtencabezadopedido_disfecent_Jsonclick ;
   private String edtavSdtencabezadopedido_disfecent_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_albrreo_Internalname ;
   private String lblTextblocksdtencabezadopedido_albrreo_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_displa_Internalname ;
   private String lblTextblocksdtencabezadopedido_displa_Jsonclick ;
   private String lblTextblocksdtencabezadopedido_disitem3_Internalname ;
   private String lblTextblockcombo_sdtencabezadopedido_procecod_Internalname ;
   private String lblTextblocksdtencabezadopedido_dispart_Internalname ;
   private String lblTextblockcombo_sdtencabezadopedido_cod_idtx_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst04_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst05_Internalname ;
   private String lblTextblocksdtencabezadopedido_disrec_Internalname ;
   private String lblTextblocksdtencabezadopedido_nxt_statio_Internalname ;
   private String lblTextblocksdtencabezadopedido_nxt_modelo_Internalname ;
   private String lblTextblocksdtencabezadopedido_disexp_Internalname ;
   private String lblTextblocksdtencabezadopedido_observaciones_Internalname ;
   private String sGXsfl_171_fel_idx="0001" ;
   private String subEncabezado04_Class ;
   private String subEncabezado04_Linesclass ;
   private String divUnnamedtablefsencabezado04_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtablesdtencabezadopedido_disitem3_Internalname ;
   private String lblTextblocksdtencabezadopedido_disitem3_Jsonclick ;
   private String edtavSdtencabezadopedido_disitem3_Jsonclick ;
   private String divTablesplittedsdtencabezadopedido_procecod_Internalname ;
   private String lblTextblockcombo_sdtencabezadopedido_procecod_Jsonclick ;
   private String edtavSdtencabezadopedido_procecod_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_dispart_Internalname ;
   private String lblTextblocksdtencabezadopedido_dispart_Jsonclick ;
   private String edtavSdtencabezadopedido_dispart_Jsonclick ;
   private String edtavSdtencabezadopedido_disordcomp_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedsdtencabezadopedido_cod_idtx_Internalname ;
   private String lblTextblockcombo_sdtencabezadopedido_cod_idtx_Jsonclick ;
   private String edtavSdtencabezadopedido_cod_idtx_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnormst01_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst01_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnormst02_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst02_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnormst03_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst03_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnormst04_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst04_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_disnormst05_Internalname ;
   private String lblTextblocksdtencabezadopedido_disnormst05_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtablesdtencabezadopedido_disrec_Internalname ;
   private String lblTextblocksdtencabezadopedido_disrec_Jsonclick ;
   private String edtavSdtencabezadopedido_disdest_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtablesdtencabezadopedido_nxt_statio_Internalname ;
   private String lblTextblocksdtencabezadopedido_nxt_statio_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_nxt_modelo_Internalname ;
   private String lblTextblocksdtencabezadopedido_nxt_modelo_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtablesdtencabezadopedido_disexp_Internalname ;
   private String lblTextblocksdtencabezadopedido_disexp_Jsonclick ;
   private String divUnnamedtablesdtencabezadopedido_nxt_artcli_Internalname ;
   private String lblTextblocksdtencabezadopedido_nxt_artcli_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String divUnnamedtablesdtencabezadopedido_observaciones_Internalname ;
   private String lblTextblocksdtencabezadopedido_observaciones_Jsonclick ;
   private String edtavSdtarticulopedidos__disnumpie_Internalname ;
   private String edtavSdtarticulopedidos__kilos_Internalname ;
   private String edtavSdtarticulopedidos__metros_Internalname ;
   private String edtavSdtarticulopedidos__disartanh_Internalname ;
   private String edtavSdtarticulopedidos__disgraaca_Internalname ;
   private String subGridsdtarticulopedidos_Class ;
   private String subGridsdtarticulopedidos_Linesclass ;
   private String edtavDelete_Jsonclick ;
   private String edtavSdtarticulopedidos__disartcod_Jsonclick ;
   private String edtavSdtarticulopedidos__artdsc_Jsonclick ;
   private String edtavInsert_Jsonclick ;
   private String edtavComboprocdsc_Jsonclick ;
   private String edtavProcod_Jsonclick ;
   private String edtavProdsc_Jsonclick ;
   private String edtavSdtarticulopedidos__procod_Jsonclick ;
   private String edtavUpdate_Jsonclick ;
   private String edtavSdtarticulopedidos__disnumpie_Jsonclick ;
   private String edtavSdtarticulopedidos__kilos_Jsonclick ;
   private String edtavSdtarticulopedidos__metros_Jsonclick ;
   private String edtavSdtarticulopedidos__disartanh_Jsonclick ;
   private String edtavSdtarticulopedidos__disgraaca_Jsonclick ;
   private String subEncabezado04_Header ;
   private String lblTextblocksdtencabezadopedido_disitem3_Caption ;
   private String lblTextblockcombo_sdtencabezadopedido_procecod_Caption ;
   private String lblTextblocksdtencabezadopedido_dispart_Caption ;
   private String lblTextblockcombo_sdtencabezadopedido_cod_idtx_Caption ;
   private String lblTextblocksdtencabezadopedido_disnormst04_Caption ;
   private String lblTextblocksdtencabezadopedido_disnormst05_Caption ;
   private String lblTextblocksdtencabezadopedido_disrec_Caption ;
   private String lblTextblocksdtencabezadopedido_nxt_statio_Caption ;
   private String lblTextblocksdtencabezadopedido_nxt_modelo_Caption ;
   private String lblTextblocksdtencabezadopedido_disexp_Caption ;
   private String lblTextblocksdtencabezadopedido_nxt_artcli_Caption ;
   private String lblTextblocksdtencabezadopedido_observaciones_Caption ;
   private String subGridsdtarticulopedidos_Header ;
   private String subEncabezado01_Header ;
   private String lblTextblocksdtencabezadopedido_clicod_Caption ;
   private String lblTextblockclicod_Caption ;
   private String lblTextblocksdtencabezadopedido_disenccli_Caption ;
   private String lblTextblocksdtencabezadopedido_disfec_Caption ;
   private String lblTextblocksdtencabezadopedido_disfeccli_Caption ;
   private String lblTextblocksdtencabezadopedido_disfecent_Caption ;
   private String lblTextblocksdtencabezadopedido_albrreo_Caption ;
   private String lblTextblocksdtencabezadopedido_displa_Caption ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV6AplicadoSetWebSession ;
   private boolean AV11ColorEncontrado ;
   private boolean AV58ColorPrompt ;
   private boolean AV32Realizado ;
   private boolean bGXsfl_333_Refreshing=false ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean Gridsdtarticulopedidospaginationbar_Showfirst ;
   private boolean Gridsdtarticulopedidospaginationbar_Showprevious ;
   private boolean Gridsdtarticulopedidospaginationbar_Shownext ;
   private boolean Gridsdtarticulopedidospaginationbar_Showlast ;
   private boolean Gridsdtarticulopedidospaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_sdtencabezadopedido_procecod_Isgriditem ;
   private boolean Combo_sdtencabezadopedido_cod_idtx_Isgriditem ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean bGXsfl_171_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n69ArtDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n971ProceNom ;
   private boolean gx_BV333 ;
   private boolean GXv_boolean8[] ;
   private boolean n13218NormaDsc ;
   private String A13771ProCDsc ;
   private String A13735CliCNom ;
   private String hV76ComboProCDsc ;
   private String hV79GXV1 ;
   private String hV9CliCod ;
   private String AV12Contexto ;
   private String AV74ArtCDsc ;
   private String AV14DatosPedidoJSON ;
   private String AV16DisArtCod ;
   private String AV76ComboProCDsc ;
   private String l13771ProCDsc ;
   private String l13735CliCNom ;
   private String A13751ArtCDsc ;
   private String ZhV79GXV1 ;
   private String ZhV9CliCod ;
   private String ZV76ComboProCDsc ;
   private String ZhV76ComboProCDsc ;
   private com.genexus.webpanels.GXWebGrid Encabezado04Container ;
   private com.genexus.webpanels.GXWebGrid GridsdtarticulopedidosContainer ;
   private com.genexus.webpanels.GXWebGrid Encabezado01Container ;
   private com.genexus.webpanels.GXWebRow GridsdtarticulopedidosRow ;
   private com.genexus.webpanels.GXWebRow Encabezado01Row ;
   private com.genexus.webpanels.GXWebRow Encabezado04Row ;
   private com.genexus.webpanels.GXWebColumn Encabezado04Column ;
   private com.genexus.webpanels.GXWebColumn GridsdtarticulopedidosColumn ;
   private com.genexus.webpanels.GXWebColumn Encabezado01Column ;
   private com.genexus.webpanels.GXWindow AV46Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV45WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucCombo_artcdsc ;
   private com.genexus.webpanels.GXUserControl ucGridsdtarticulopedidospaginationbar ;
   private com.genexus.webpanels.GXUserControl ucCombo_sdtencabezadopedido_procecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_sdtencabezadopedido_cod_idtx ;
   private com.genexus.webpanels.GXUserControl ucGridsdtarticulopedidos_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private app.SdtSdtEncabezadoPedido AV39SdtEnCabezadoPedido ;
   private ICheckbox chkavSdtencabezadopedido_albrreo ;
   private ICheckbox chkavSdtencabezadopedido_displa ;
   private ICheckbox chkavColorencontrado ;
   private ICheckbox chkavColorprompt ;
   private HTMLChoice dynavSdtencabezadopedido_distipcol ;
   private ICheckbox chkavSdtencabezadopedido_disnormst01 ;
   private ICheckbox chkavSdtencabezadopedido_disnormst02 ;
   private ICheckbox chkavSdtencabezadopedido_disnormst03 ;
   private ICheckbox chkavSdtencabezadopedido_disnormst04 ;
   private ICheckbox chkavSdtencabezadopedido_disnormst05 ;
   private ICheckbox chkavSdtencabezadopedido_disrec ;
   private ICheckbox chkavSdtencabezadopedido_nxt_statio ;
   private ICheckbox chkavSdtencabezadopedido_nxt_modelo ;
   private ICheckbox chkavSdtencabezadopedido_disexp ;
   private HTMLChoice cmbavSdtencabezadopedido_nxt_artcli ;
   private ICheckbox chkavRealizado ;
   private IDataStoreProvider pr_default ;
   private String[] H00DA2_A13771ProCDsc ;
   private String[] H00DA3_A13735CliCNom ;
   private String[] H00DA4_A13735CliCNom ;
   private String[] H00DA5_A13771ProCDsc ;
   private String[] H00DA5_A396EmprCod ;
   private String[] H00DA5_A758ProCod ;
   private String[] H00DA6_A279CliNom ;
   private String[] H00DA6_A13735CliCNom ;
   private String[] H00DA6_A396EmprCod ;
   private int[] H00DA6_A252CliCod ;
   private String[] H00DA7_A13735CliCNom ;
   private String[] H00DA7_A396EmprCod ;
   private int[] H00DA7_A252CliCod ;
   private byte[] H00DA8_A831TipColCod ;
   private String[] H00DA8_A832TipColDsc ;
   private boolean[] H00DA8_n832TipColDsc ;
   private String[] H00DA8_A396EmprCod ;
   private String[] H00DA9_A13735CliCNom ;
   private String[] H00DA9_A396EmprCod ;
   private int[] H00DA9_A252CliCod ;
   private int[] H00DA10_A252CliCod ;
   private String[] H00DA10_A396EmprCod ;
   private String[] H00DA10_A69ArtDsc ;
   private boolean[] H00DA10_n69ArtDsc ;
   private String[] H00DA10_A65ArtCod ;
   private String[] H00DA11_A396EmprCod ;
   private String[] H00DA11_A10887Cod_Idtx ;
   private String[] H00DA11_A10888Dsc_Idtx ;
   private boolean[] H00DA11_n10888Dsc_Idtx ;
   private String[] H00DA12_A396EmprCod ;
   private short[] H00DA12_A970ProceCod ;
   private String[] H00DA12_A971ProceNom ;
   private boolean[] H00DA12_n971ProceNom ;
   private String[] H00DA13_A13735CliCNom ;
   private String[] H00DA13_A396EmprCod ;
   private int[] H00DA13_A252CliCod ;
   private String[] H00DA14_A758ProCod ;
   private String[] H00DA14_A396EmprCod ;
   private short[] H00DA14_A774ProNumLin ;
   private String[] H00DA14_A457FasCod ;
   private String[] H00DA14_A460FasDsc ;
   private String[] H00DA15_A396EmprCod ;
   private String[] H00DA15_A13218NormaDsc ;
   private boolean[] H00DA15_n13218NormaDsc ;
   private String[] H00DA15_A13217NormaID ;
   private String[] H00DA16_A13771ProCDsc ;
   private String[] H00DA16_A396EmprCod ;
   private String[] H00DA16_A758ProCod ;
   private String[] H00DA17_A13771ProCDsc ;
   private String[] H00DA17_A396EmprCod ;
   private String[] H00DA17_A758ProCod ;
   private String[] H00DA18_A279CliNom ;
   private String[] H00DA18_A13735CliCNom ;
   private String[] H00DA18_A396EmprCod ;
   private int[] H00DA18_A252CliCod ;
   private String[] H00DA19_A13735CliCNom ;
   private String[] H00DA19_A396EmprCod ;
   private int[] H00DA19_A252CliCod ;
   private String[] H00DA20_A13771ProCDsc ;
   private String[] H00DA20_A396EmprCod ;
   private String[] H00DA20_A758ProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV75ArtCDsc_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV67SdtEnCabezadoPedido_ProceCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV63SdtEnCabezadoPedido_Cod_Idtx_Data ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV56Messages ;
   private GXBaseCollection<app.SdtSdtArticuloPedido> AV38SdtArticuloPedidos ;
   private GXBaseCollection<app.SdtSdtFasePedido> AV41SdtFasePedidoCollection ;
   private com.genexus.SdtMessages_Message AV54Message ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV59Combo_DataItem ;
   private app.SdtSdtArticuloPedido AV43TemporalSdtArticuloPedido ;
   private app.SdtSdtFasePedido AV40SdtFasePedido ;
}

final  class webdatospedido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DA2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc FROM TXPPROCES WHERE (UPPER(RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc))) like '%' || UPPER(?)) AND (EmprCod = ?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) AND (Not (rtrim(CliNom) IS NULL AND NOT(CliNom IS NULL))) AND (EmprCod = ?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA5", "SELECT RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, EmprCod, ProCod FROM TXPPROCES WHERE (RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA6", "SELECT CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (Not (rtrim(CliNom) IS NULL AND NOT(CliNom IS NULL))) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA8", "SELECT TipColCod, TipColDsc, EmprCod FROM TXPTIPCOL WHERE EmprCod = ? ORDER BY TipColDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA10", "SELECT CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA11", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? ORDER BY Dsc_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA12", "SELECT EmprCod, ProceCod, ProceNom FROM TXPPROCED WHERE EmprCod = ? ORDER BY ProceNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA14", "SELECT T1.ProCod, T1.EmprCod, T1.ProNumLin, T1.FasCod, T2.FasDsc FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA15", "SELECT EmprCod, NormaDsc, NormaID FROM TXPNORMAS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA16", "SELECT RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, EmprCod, ProCod FROM TXPPROCES WHERE (EmprCod = ?) AND (ProCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA17", "SELECT RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, EmprCod, ProCod FROM TXPPROCES WHERE (EmprCod = ?) AND (ProCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA18", "SELECT CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (Not (rtrim(CliNom) IS NULL AND NOT(CliNom IS NULL))) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA19", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DA20", "SELECT RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, EmprCod, ProCod FROM TXPPROCES WHERE (RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

