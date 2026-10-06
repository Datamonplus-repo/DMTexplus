package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tincint_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A10972Int_cod = (byte)(GXutil.lval( httpContext.GetPar( "Int_cod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         A11043Int_Un = httpContext.GetPar( "Int_Un") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         A10966Int_Lin = (short)(GXutil.lval( httpContext.GetPar( "Int_Lin"))) ;
         AV32Int_vali = CommonUtil.decimalVal( httpContext.GetPar( "Int_vali"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
         AV33Int_valf = CommonUtil.decimalVal( httpContext.GetPar( "Int_valf"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
         AV34Int_pk = CommonUtil.decimalVal( httpContext.GetPar( "Int_pk"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
         AV35Int_pm = CommonUtil.decimalVal( httpContext.GetPar( "Int_pm"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
         A10967Int_ValI = CommonUtil.decimalVal( httpContext.GetPar( "Int_ValI"), ".") ;
         n10967Int_ValI = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_1AG1469( A396EmprCod, A252CliCod, A65ArtCod, A10972Int_cod, A11043Int_Un, A10966Int_Lin, AV32Int_vali, AV33Int_valf, AV34Int_pk, AV35Int_pm, A10967Int_ValI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A10972Int_cod = (byte)(GXutil.lval( httpContext.GetPar( "Int_cod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         A11043Int_Un = httpContext.GetPar( "Int_Un") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         A10966Int_Lin = (short)(GXutil.lval( httpContext.GetPar( "Int_Lin"))) ;
         AV32Int_vali = CommonUtil.decimalVal( httpContext.GetPar( "Int_vali"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
         AV33Int_valf = CommonUtil.decimalVal( httpContext.GetPar( "Int_valf"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
         AV34Int_pk = CommonUtil.decimalVal( httpContext.GetPar( "Int_pk"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
         AV35Int_pm = CommonUtil.decimalVal( httpContext.GetPar( "Int_pm"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
         A10968Int_ValF = CommonUtil.decimalVal( httpContext.GetPar( "Int_ValF"), ".") ;
         n10968Int_ValF = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_1AG1469( A396EmprCod, A252CliCod, A65ArtCod, A10972Int_cod, A11043Int_Un, A10966Int_Lin, AV32Int_vali, AV33Int_valf, AV34Int_pk, AV35Int_pm, A10968Int_ValF) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A10972Int_cod = (byte)(GXutil.lval( httpContext.GetPar( "Int_cod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         A11043Int_Un = httpContext.GetPar( "Int_Un") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         A10966Int_Lin = (short)(GXutil.lval( httpContext.GetPar( "Int_Lin"))) ;
         A10969Int_Pk = CommonUtil.decimalVal( httpContext.GetPar( "Int_Pk"), ".") ;
         n10969Int_Pk = false ;
         A10970Int_Pm = CommonUtil.decimalVal( httpContext.GetPar( "Int_Pm"), ".") ;
         n10970Int_Pm = false ;
         AV36Msg_err1 = httpContext.GetPar( "Msg_err1") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_err1", AV36Msg_err1);
         A10971Int_Tp = httpContext.GetPar( "Int_Tp") ;
         n10971Int_Tp = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_20_1AG1469( A396EmprCod, A252CliCod, A65ArtCod, A10972Int_cod, A11043Int_Un, A10966Int_Lin, A10969Int_Pk, A10970Int_Pm, AV36Msg_err1, A10971Int_Tp) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1AG1469( ) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A10972Int_cod = (byte)(GXutil.lval( httpContext.GetPar( "Int_cod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
            A10973Int_Dsc = httpContext.GetPar( "Int_Dsc") ;
            n10973Int_Dsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10973Int_Dsc", A10973Int_Dsc);
            A11043Int_Un = httpContext.GetPar( "Int_Un") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      A10965Int_Ulin = (short)(GXutil.lval( httpContext.GetPar( "Int_Ulin"))) ;
      n10965Int_Ulin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tincint_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tincint_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tincint_impl.class ));
   }

   public tincint_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 5,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtInt_cod_Internalname, GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInt_cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10972Int_cod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10972Int_cod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInt_cod_Jsonclick, 0, "", "", "", "", "", 1, edtInt_cod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtInt_Un_Internalname, GXutil.rtrim( A11043Int_Un), GXutil.rtrim( localUtil.format( A11043Int_Un, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInt_Un_Jsonclick, 0, "", "", "", "", "", 1, edtInt_Un_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtInt_Dsc_Internalname, GXutil.rtrim( A10973Int_Dsc), GXutil.rtrim( localUtil.format( A10973Int_Dsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInt_Dsc_Jsonclick, 0, "", "", "", "", "", 1, edtInt_Dsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtInt_Ulin_Internalname, GXutil.ltrim( localUtil.ntoc( A10965Int_Ulin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInt_Ulin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10965Int_Ulin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10965Int_Ulin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInt_Ulin_Jsonclick, 0, "", "", "", "", "", 1, edtInt_Ulin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol70( ) ;
      nGXsfl_70_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1469 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1469 = (short)(1) ;
            scanStart1AG1469( ) ;
            while ( RcdFound1469 != 0 )
            {
               init_level_properties1469( ) ;
               getByPrimaryKey1AG1469( ) ;
               addRow1AG1469( ) ;
               scanNext1AG1469( ) ;
            }
            scanEnd1AG1469( ) ;
            nBlankRcdCount1469 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B10965Int_Ulin = A10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         standaloneNotModal1AG1469( ) ;
         standaloneModal1AG1469( ) ;
         sMode1469 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1AG1469( ) ;
            edtavnRcdDeleted_1469_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1469_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1469_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1469_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtInt_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_LIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInt_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtInt_ValI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_VALI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInt_ValI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_ValI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtInt_ValF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_VALF_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInt_ValF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_ValF_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtInt_Pk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_PK_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInt_Pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Pk_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtInt_Pm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_PM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInt_Pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Pm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtInt_Tp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_TP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInt_Tp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Tp_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1469 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AG1469( ) ;
            }
            sendRow1AG1469( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1469 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10965Int_Ulin = B10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1469 = (short)(5) ;
         nRcdExists_1469 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AG1469( ) ;
            while ( RcdFound1469 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701469( ) ;
               init_level_properties1469( ) ;
               standaloneNotModal1AG1469( ) ;
               getByPrimaryKey1AG1469( ) ;
               standaloneModal1AG1469( ) ;
               addRow1AG1469( ) ;
               scanNext1AG1469( ) ;
            }
            scanEnd1AG1469( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1469 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701469( ) ;
      initAll1AG1469( ) ;
      init_level_properties1469( ) ;
      B10965Int_Ulin = A10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      nRcdExists_1469 = (short)(0) ;
      nIsMod_1469 = (short)(0) ;
      nRcdDeleted_1469 = (short)(0) ;
      nBlankRcdCount1469 = (short)(nBlankRcdUsr1469+nBlankRcdCount1469) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1469 > 0 )
      {
         standaloneNotModal1AG1469( ) ;
         standaloneModal1AG1469( ) ;
         addRow1AG1469( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtInt_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1469 = (short)(nBlankRcdCount1469-1) ;
      }
      Gx_mode = sMode1469 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A10965Int_Ulin = B10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
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
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCINT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TINCINT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      e111AG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z10972Int_cod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10972Int_cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11043Int_Un = httpContext.cgiGet( "Z11043Int_Un") ;
            Z10965Int_Ulin = (short)(localUtil.ctol( httpContext.cgiGet( "Z10965Int_Ulin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10965Int_Ulin = (short)(localUtil.ctol( httpContext.cgiGet( "O10965Int_Ulin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37H_diaA = localUtil.ctod( httpContext.cgiGet( "vH_DIAA"), 0) ;
            AV41Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Oldpk = localUtil.ctond( httpContext.cgiGet( "vOLDPK")) ;
            AV39Oldpm = localUtil.ctond( httpContext.cgiGet( "vOLDPM")) ;
            AV35Int_pm = localUtil.ctond( httpContext.cgiGet( "vINT_PM")) ;
            AV34Int_pk = localUtil.ctond( httpContext.cgiGet( "vINT_PK")) ;
            AV33Int_valf = localUtil.ctond( httpContext.cgiGet( "vINT_VALF")) ;
            AV32Int_vali = localUtil.ctond( httpContext.cgiGet( "vINT_VALI")) ;
            AV36Msg_err1 = httpContext.cgiGet( "vMSG_ERR1") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A10972Int_cod = (byte)(localUtil.ctol( httpContext.cgiGet( edtInt_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
            A11043Int_Un = httpContext.cgiGet( edtInt_Un_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
            A10973Int_Dsc = httpContext.cgiGet( edtInt_Dsc_Internalname) ;
            n10973Int_Dsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10973Int_Dsc", A10973Int_Dsc);
            A10965Int_Ulin = (short)(localUtil.ctol( httpContext.cgiGet( edtInt_Ulin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10965Int_Ulin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A10972Int_cod = (byte)(GXutil.lval( httpContext.GetPar( "Int_cod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
               A11043Int_Un = httpContext.GetPar( "Int_Un") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
               standaloneModal( ) ;
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
                        e111AG2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'HIST E'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Hist E' */
                        e121AG2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "GET") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_get( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_check( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                        /* No code required for Help button. It is implemented at the Browser level. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1AG1468( ) ;
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
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1469_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1469_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_get_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes1AG1468( ) ;
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

   public void confirm_1AG0( )
   {
      beforeValidate1AG1468( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AG1468( ) ;
         }
         else
         {
            checkExtendedTable1AG1468( ) ;
            if ( AnyError == 0 )
            {
               zm1AG1468( 25) ;
               zm1AG1468( 26) ;
               zm1AG1468( 27) ;
               zm1AG1468( 28) ;
            }
            closeExtendedTableCursors1AG1468( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1468 = Gx_mode ;
         confirm_1AG1469( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1468 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AG0( ) ;
      }
   }

   public void confirm_1AG1469( )
   {
      s10965Int_Ulin = O10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1AG1469( ) ;
         if ( ( nRcdExists_1469 != 0 ) || ( nIsMod_1469 != 0 ) )
         {
            getKey1AG1469( ) ;
            if ( ( nRcdExists_1469 == 0 ) && ( nRcdDeleted_1469 == 0 ) )
            {
               if ( RcdFound1469 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AG1469( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AG1469( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1AG1469( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O10965Int_Ulin = A10965Int_Ulin ;
                     n10965Int_Ulin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "INT_LIN_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtInt_Lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1469 != 0 )
               {
                  if ( nRcdDeleted_1469 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AG1469( ) ;
                     load1AG1469( ) ;
                     beforeValidate1AG1469( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AG1469( ) ;
                        O10965Int_Ulin = A10965Int_Ulin ;
                        n10965Int_Ulin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1469 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AG1469( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AG1469( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1AG1469( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O10965Int_Ulin = A10965Int_Ulin ;
                           n10965Int_Ulin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1469 == 0 )
                  {
                     GXCCtl = "INT_LIN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtInt_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1469_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_ValI_Internalname, GXutil.ltrim( localUtil.ntoc( A10967Int_ValI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_ValF_Internalname, GXutil.ltrim( localUtil.ntoc( A10968Int_ValF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Tp_Internalname, GXutil.rtrim( A10971Int_Tp)) ;
         httpContext.changePostValue( "ZT_"+"Z10966Int_Lin_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10966Int_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10971Int_Tp_"+sGXsfl_70_idx, GXutil.rtrim( Z10971Int_Tp)) ;
         httpContext.changePostValue( "ZT_"+"Z10967Int_ValI_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10967Int_ValI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10968Int_ValF_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10968Int_ValF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10969Int_Pk_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10970Int_Pm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10970Int_Pm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10969Int_Pk_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1469_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1469_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1469_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1469 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1469_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1469_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_VALI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_VALF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_PK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_PM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_TP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Tp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O10965Int_Ulin = s10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AG0( )
   {
   }

   public void e111AG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tincint_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV41Pgmname, (byte)(99), GXv_char2) ;
      tincint_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tincint_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tincint_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
      tincint_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV15Lit3 = httpContext.getMessage( "Unidad", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Articulo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV18Lit6 = httpContext.getMessage( "Intensidad", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tincint_impl.this.A396EmprCod = GXv_char2[0] ;
      tincint_impl.this.AV11EmprNom = GXv_char3[0] ;
      tincint_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121AG2( )
   {
      /* 'Hist E' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1AG1468( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10965Int_Ulin = T01AG5_A10965Int_Ulin[0] ;
         }
         else
         {
            Z10965Int_Ulin = A10965Int_Ulin ;
         }
      }
      if ( GX_JID == -24 )
      {
         Z11043Int_Un = A11043Int_Un ;
         Z10965Int_Ulin = A10965Int_Ulin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10972Int_cod = A10972Int_cod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z10973Int_Dsc = A10973Int_Dsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtInt_Ulin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Ulin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Ulin_Enabled), 5, 0), true);
      AV37H_diaA = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37H_diaA", localUtil.format(AV37H_diaA, "99/99/99"));
      if ( true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      AV41Pgmname = "TINCINT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtInt_Ulin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Ulin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Ulin_Enabled), 5, 0), true);
      /* Using cursor T01AG6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AG6_A407EmprNom[0] ;
      n407EmprNom = T01AG6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01AG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AG7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01AG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T01AG8_A69ArtDsc[0] ;
      n69ArtDsc = T01AG8_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
      /* Using cursor T01AG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INT_COD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_check_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_check_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
   }

   public void load1AG1468( )
   {
      /* Using cursor T01AG10 */
      pr_default.execute(8, new Object[] {A11043Int_Un, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1468 = (short)(1) ;
         A407EmprNom = T01AG10_A407EmprNom[0] ;
         n407EmprNom = T01AG10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AG10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01AG10_A69ArtDsc[0] ;
         n69ArtDsc = T01AG10_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A10965Int_Ulin = T01AG10_A10965Int_Ulin[0] ;
         n10965Int_Ulin = T01AG10_n10965Int_Ulin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         zm1AG1468( -24) ;
      }
      pr_default.close(8);
      onLoadActions1AG1468( ) ;
   }

   public void onLoadActions1AG1468( )
   {
   }

   public void checkExtendedTable1AG1468( )
   {
      nIsDirty_1468 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1AG1468( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1AG1468( )
   {
      /* Using cursor T01AG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1468 = (short)(1) ;
      }
      else
      {
         RcdFound1468 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01AG5_A11043Int_Un[0], A11043Int_Un) == 0 ) && ( GXutil.strcmp(T01AG5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AG5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AG5_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AG5_A10972Int_cod[0] == A10972Int_cod ) )
      {
         zm1AG1468( 24) ;
         RcdFound1468 = (short)(1) ;
         A10965Int_Ulin = T01AG5_A10965Int_Ulin[0] ;
         n10965Int_Ulin = T01AG5_n10965Int_Ulin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         O10965Int_Ulin = A10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10972Int_cod = A10972Int_cod ;
         Z11043Int_Un = A11043Int_Un ;
         sMode1468 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AG1468( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1468 = (short)(0) ;
            initializeNonKey1AG1468( ) ;
         }
         Gx_mode = sMode1468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1468 = (short)(0) ;
         initializeNonKey1AG1468( ) ;
         sMode1468 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1AG1468( ) ;
      if ( RcdFound1468 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1468 = (short)(0) ;
      /* Using cursor T01AG12 */
      pr_default.execute(10, new Object[] {A11043Int_Un, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01AG12_A11043Int_Un[0], A11043Int_Un) == 0 ) && ( GXutil.strcmp(T01AG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AG12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AG12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AG12_A10972Int_cod[0] == A10972Int_cod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01AG12_A11043Int_Un[0], A11043Int_Un) == 0 ) && ( GXutil.strcmp(T01AG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AG12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AG12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AG12_A10972Int_cod[0] == A10972Int_cod ) )
         {
            RcdFound1468 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1468 = (short)(0) ;
      /* Using cursor T01AG13 */
      pr_default.execute(11, new Object[] {A11043Int_Un, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01AG13_A11043Int_Un[0], A11043Int_Un) == 0 ) && ( GXutil.strcmp(T01AG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AG13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AG13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AG13_A10972Int_cod[0] == A10972Int_cod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01AG13_A11043Int_Un[0], A11043Int_Un) == 0 ) && ( GXutil.strcmp(T01AG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AG13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AG13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AG13_A10972Int_cod[0] == A10972Int_cod ) )
         {
            RcdFound1468 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AG1468( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A10965Int_Ulin = O10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         insert1AG1468( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1468 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A10972Int_cod != Z10972Int_cod ) || ( GXutil.strcmp(A11043Int_Un, Z11043Int_Un) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A10965Int_Ulin = O10965Int_Ulin ;
               n10965Int_Ulin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A10965Int_Ulin = O10965Int_Ulin ;
               n10965Int_Ulin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
               update1AG1468( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A10972Int_cod != Z10972Int_cod ) || ( GXutil.strcmp(A11043Int_Un, Z11043Int_Un) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A10965Int_Ulin = O10965Int_Ulin ;
               n10965Int_Ulin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
               insert1AG1468( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A10965Int_Ulin = O10965Int_Ulin ;
                  n10965Int_Ulin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
                  insert1AG1468( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A10972Int_cod != Z10972Int_cod ) || ( GXutil.strcmp(A11043Int_Un, Z11043Int_Un) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A10965Int_Ulin = O10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1AG1468( ) ;
      if ( RcdFound1468 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A10972Int_cod != Z10972Int_cod ) || ( GXutil.strcmp(A11043Int_Un, Z11043Int_Un) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A10972Int_cod != Z10972Int_cod ) || ( GXutil.strcmp(A11043Int_Un, Z11043Int_Un) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tincint");
   }

   public void insert_check( )
   {
      confirm_1AG0( ) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound1468 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AG1468( ) ;
      if ( RcdFound1468 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AG1468( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound1468 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound1468 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AG1468( ) ;
      if ( RcdFound1468 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1468 != 0 )
         {
            scanNext1AG1468( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AG1468( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AG1468( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPuINCIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10965Int_Ulin != T01AG4_A10965Int_Ulin[0] ) )
         {
            if ( Z10965Int_Ulin != T01AG4_A10965Int_Ulin[0] )
            {
               GXutil.writeLogln("tincint:[seudo value changed for attri]"+"Int_Ulin");
               GXutil.writeLogRaw("Old: ",Z10965Int_Ulin);
               GXutil.writeLogRaw("Current: ",T01AG4_A10965Int_Ulin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPuINCIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AG1468( )
   {
      beforeValidate1AG1468( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AG1468( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AG1468( 0) ;
         checkOptimisticConcurrency1AG1468( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AG1468( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AG1468( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AG14 */
                  pr_default.execute(12, new Object[] {A11043Int_Un, Boolean.valueOf(n10965Int_Ulin), Short.valueOf(A10965Int_Ulin), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPuINCIN");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1AG1468( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AG0( ) ;
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
            load1AG1468( ) ;
         }
         endLevel1AG1468( ) ;
      }
      closeExtendedTableCursors1AG1468( ) ;
   }

   public void update1AG1468( )
   {
      beforeValidate1AG1468( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AG1468( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AG1468( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AG1468( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AG1468( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AG15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n10965Int_Ulin), Short.valueOf(A10965Int_Ulin), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPuINCIN");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPuINCIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AG1468( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AG1468( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AG0( ) ;
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
         endLevel1AG1468( ) ;
      }
      closeExtendedTableCursors1AG1468( ) ;
   }

   public void deferredUpdate1AG1468( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AG1468( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AG1468( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AG1468( ) ;
         afterConfirm1AG1468( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AG1468( ) ;
            if ( AnyError == 0 )
            {
               A10965Int_Ulin = O10965Int_Ulin ;
               n10965Int_Ulin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
               scanStart1AG1469( ) ;
               while ( RcdFound1469 != 0 )
               {
                  getByPrimaryKey1AG1469( ) ;
                  delete1AG1469( ) ;
                  scanNext1AG1469( ) ;
                  O10965Int_Ulin = A10965Int_Ulin ;
                  n10965Int_Ulin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
               }
               scanEnd1AG1469( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AG16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPuINCIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1468 == 0 )
                        {
                           initAll1AG1468( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaption1AG0( ) ;
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
      sMode1468 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AG1468( ) ;
      Gx_mode = sMode1468 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AG1468( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1AG1469( )
   {
      s10965Int_Ulin = O10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1AG1469( ) ;
         if ( ( nRcdExists_1469 != 0 ) || ( nIsMod_1469 != 0 ) )
         {
            standaloneNotModal1AG1469( ) ;
            getKey1AG1469( ) ;
            if ( ( nRcdExists_1469 == 0 ) && ( nRcdDeleted_1469 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AG1469( ) ;
            }
            else
            {
               if ( RcdFound1469 != 0 )
               {
                  if ( ( nRcdDeleted_1469 != 0 ) && ( nRcdExists_1469 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AG1469( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1469 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AG1469( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1469 == 0 )
                  {
                     GXCCtl = "INT_LIN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtInt_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O10965Int_Ulin = A10965Int_Ulin ;
            n10965Int_Ulin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1469_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_ValI_Internalname, GXutil.ltrim( localUtil.ntoc( A10967Int_ValI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_ValF_Internalname, GXutil.ltrim( localUtil.ntoc( A10968Int_ValF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInt_Tp_Internalname, GXutil.rtrim( A10971Int_Tp)) ;
         httpContext.changePostValue( "ZT_"+"Z10966Int_Lin_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10966Int_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10971Int_Tp_"+sGXsfl_70_idx, GXutil.rtrim( Z10971Int_Tp)) ;
         httpContext.changePostValue( "ZT_"+"Z10967Int_ValI_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10967Int_ValI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10968Int_ValF_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10968Int_ValF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10969Int_Pk_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10970Int_Pm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10970Int_Pm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10969Int_Pk_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1469_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1469_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1469_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1469 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1469_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1469_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_VALI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_VALF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_PK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_PM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INT_TP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Tp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AG1469( ) ;
      if ( AnyError != 0 )
      {
         O10965Int_Ulin = s10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      }
      nRcdExists_1469 = (short)(0) ;
      nIsMod_1469 = (short)(0) ;
      nRcdDeleted_1469 = (short)(0) ;
   }

   public void processLevel1AG1468( )
   {
      /* Save parent mode. */
      sMode1468 = Gx_mode ;
      processNestedLevel1AG1469( ) ;
      if ( AnyError != 0 )
      {
         O10965Int_Ulin = s10965Int_Ulin ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1468 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01AG17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n10965Int_Ulin), Short.valueOf(A10965Int_Ulin), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPuINCIN");
   }

   public void endLevel1AG1468( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1AG1468( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tincint");
         if ( AnyError == 0 )
         {
            confirmValues1AG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tincint");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AG1468( )
   {
      /* Scan By routine */
      /* Using cursor T01AG18 */
      pr_default.execute(16, new Object[] {A11043Int_Un, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      RcdFound1468 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1468 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AG1468( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1468 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1468 = (short)(1) ;
      }
   }

   public void scanEnd1AG1468( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1AG1468( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AG1468( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AG1468( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AG1468( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AG1468( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AG1468( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AG1468( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtInt_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_cod_Enabled), 5, 0), true);
      edtInt_Un_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Un_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Un_Enabled), 5, 0), true);
      edtInt_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Dsc_Enabled), 5, 0), true);
      edtInt_Ulin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Ulin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Ulin_Enabled), 5, 0), true);
   }

   public void zm1AG1469( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10971Int_Tp = T01AG3_A10971Int_Tp[0] ;
            Z10967Int_ValI = T01AG3_A10967Int_ValI[0] ;
            Z10968Int_ValF = T01AG3_A10968Int_ValF[0] ;
            Z10969Int_Pk = T01AG3_A10969Int_Pk[0] ;
            Z10970Int_Pm = T01AG3_A10970Int_Pm[0] ;
         }
         else
         {
            Z10971Int_Tp = A10971Int_Tp ;
            Z10967Int_ValI = A10967Int_ValI ;
            Z10968Int_ValF = A10968Int_ValF ;
            Z10969Int_Pk = A10969Int_Pk ;
            Z10970Int_Pm = A10970Int_Pm ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10972Int_cod = A10972Int_cod ;
         Z11043Int_Un = A11043Int_Un ;
         Z10966Int_Lin = A10966Int_Lin ;
         Z10971Int_Tp = A10971Int_Tp ;
         Z10967Int_ValI = A10967Int_ValI ;
         Z10968Int_ValF = A10968Int_ValF ;
         Z10969Int_Pk = A10969Int_Pk ;
         Z10970Int_Pm = A10970Int_Pm ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1AG1469( )
   {
      edtInt_Ulin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Ulin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Ulin_Enabled), 5, 0), true);
      edtInt_Ulin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Ulin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Ulin_Enabled), 5, 0), true);
   }

   public void standaloneModal1AG1469( )
   {
      if ( isIns( )  )
      {
         A10965Int_Ulin = (short)(O10965Int_Ulin+1) ;
         n10965Int_Ulin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A10966Int_Lin = A10965Int_Ulin ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10971Int_Tp)==0) && ( Gx_BScreen == 0 ) )
      {
         A10971Int_Tp = E10971Int_Tp ;
         n10971Int_Tp = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtInt_Lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInt_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtInt_Lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInt_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1AG1469( )
   {
      /* Using cursor T01AG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1469 = (short)(1) ;
         A10971Int_Tp = T01AG19_A10971Int_Tp[0] ;
         n10971Int_Tp = T01AG19_n10971Int_Tp[0] ;
         A10967Int_ValI = T01AG19_A10967Int_ValI[0] ;
         n10967Int_ValI = T01AG19_n10967Int_ValI[0] ;
         A10968Int_ValF = T01AG19_A10968Int_ValF[0] ;
         n10968Int_ValF = T01AG19_n10968Int_ValF[0] ;
         A10969Int_Pk = T01AG19_A10969Int_Pk[0] ;
         n10969Int_Pk = T01AG19_n10969Int_Pk[0] ;
         A10970Int_Pm = T01AG19_A10970Int_Pm[0] ;
         n10970Int_Pm = T01AG19_n10970Int_Pm[0] ;
         zm1AG1469( -29) ;
      }
      pr_default.close(17);
      onLoadActions1AG1469( ) ;
   }

   public void onLoadActions1AG1469( )
   {
      AV38Oldpk = O10969Int_Pk ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrimstr( AV38Oldpk, 13, 5));
      AV39Oldpm = O10970Int_Pm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrimstr( AV39Oldpm, 13, 5));
   }

   public void checkExtendedTable1AG1469( )
   {
      nIsDirty_1469 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1AG1469( ) ;
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_int6[0] = A10972Int_cod ;
         GXv_char2[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal8[0] = AV32Int_vali ;
         GXv_decimal9[0] = AV33Int_valf ;
         GXv_decimal10[0] = AV34Int_pk ;
         GXv_decimal11[0] = AV35Int_pm ;
         new app.pctrvi(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
         tincint_impl.this.A396EmprCod = GXv_char4[0] ;
         tincint_impl.this.A252CliCod = GXv_int5[0] ;
         tincint_impl.this.A65ArtCod = GXv_char3[0] ;
         tincint_impl.this.A10972Int_cod = GXv_int6[0] ;
         tincint_impl.this.A11043Int_Un = GXv_char2[0] ;
         tincint_impl.this.A10966Int_Lin = GXv_int7[0] ;
         tincint_impl.this.AV32Int_vali = GXv_decimal8[0] ;
         tincint_impl.this.AV33Int_valf = GXv_decimal9[0] ;
         tincint_impl.this.AV34Int_pk = GXv_decimal10[0] ;
         tincint_impl.this.AV35Int_pm = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
      }
      if ( ( AV33Int_valf.doubleValue() > 0 ) && ( (A10967Int_ValI.subtract(AV33Int_valf)).doubleValue() > 1 ) && true /* After */ )
      {
         GXCCtl = "INT_VALI_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Inicial Incorrecto. Valor Inicial=Valor Final_Anterior+1¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV33Int_valf.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A10967Int_ValI, AV33Int_valf) <= 0 ) && true /* After */ )
      {
         GXCCtl = "INT_VALI_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Inicial menor o igual a Valor Final Linea Anterior ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_int6[0] = A10972Int_cod ;
         GXv_char2[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = AV32Int_vali ;
         GXv_decimal10[0] = AV33Int_valf ;
         GXv_decimal9[0] = AV34Int_pk ;
         GXv_decimal8[0] = AV35Int_pm ;
         new app.pctrvf(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8) ;
         tincint_impl.this.A396EmprCod = GXv_char4[0] ;
         tincint_impl.this.A252CliCod = GXv_int5[0] ;
         tincint_impl.this.A65ArtCod = GXv_char3[0] ;
         tincint_impl.this.A10972Int_cod = GXv_int6[0] ;
         tincint_impl.this.A11043Int_Un = GXv_char2[0] ;
         tincint_impl.this.A10966Int_Lin = GXv_int7[0] ;
         tincint_impl.this.AV32Int_vali = GXv_decimal11[0] ;
         tincint_impl.this.AV33Int_valf = GXv_decimal10[0] ;
         tincint_impl.this.AV34Int_pk = GXv_decimal9[0] ;
         tincint_impl.this.AV35Int_pm = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
      }
      if ( ( A10968Int_ValF.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A10968Int_ValF, A10967Int_ValI) <= 0 ) && true /* After */ )
      {
         GXCCtl = "INT_VALF_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final menor o igual a Valor Inicial ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV32Int_vali.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A10968Int_ValF, AV32Int_vali) >= 0 ) && true /* After */ )
      {
         GXCCtl = "INT_VALF_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final mayor o igual a Valor Inicial Linea Siguiente ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A10967Int_ValI.doubleValue() > 0 ) && ( A10968Int_ValF.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "INT_VALF_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final igual a CERO ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A10967Int_ValI.doubleValue() == 0 ) && ( A10968Int_ValF.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "INT_VALF_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final/Valor Final igual a CERO ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV38Oldpk = O10969Int_Pk ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrimstr( AV38Oldpk, 13, 5));
      AV39Oldpm = O10970Int_Pm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrimstr( AV39Oldpm, 13, 5));
      if ( ! ( ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "U", "")) == 0 ) ) )
      {
         GXCCtl = "INT_TP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor posible T o U", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Tp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A10969Int_Pk.doubleValue() == 0 ) && ( A10970Int_Pm.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "INT_TP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Precio Kg/Precio Mt igual a CERO ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Tp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AG1469( )
   {
   }

   public void enableDisable1AG1469( )
   {
   }

   public void getKey1AG1469( )
   {
      /* Using cursor T01AG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1469 = (short)(1) ;
      }
      else
      {
         RcdFound1469 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1AG1469( )
   {
      /* Using cursor T01AG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01AG3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AG3_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AG3_A10972Int_cod[0] == A10972Int_cod ) && ( GXutil.strcmp(T01AG3_A11043Int_Un[0], A11043Int_Un) == 0 ) && ( GXutil.strcmp(T01AG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AG1469( 29) ;
         RcdFound1469 = (short)(1) ;
         initializeNonKey1AG1469( ) ;
         A10966Int_Lin = T01AG3_A10966Int_Lin[0] ;
         A10971Int_Tp = T01AG3_A10971Int_Tp[0] ;
         n10971Int_Tp = T01AG3_n10971Int_Tp[0] ;
         A10967Int_ValI = T01AG3_A10967Int_ValI[0] ;
         n10967Int_ValI = T01AG3_n10967Int_ValI[0] ;
         A10968Int_ValF = T01AG3_A10968Int_ValF[0] ;
         n10968Int_ValF = T01AG3_n10968Int_ValF[0] ;
         A10969Int_Pk = T01AG3_A10969Int_Pk[0] ;
         n10969Int_Pk = T01AG3_n10969Int_Pk[0] ;
         A10970Int_Pm = T01AG3_A10970Int_Pm[0] ;
         n10970Int_Pm = T01AG3_n10970Int_Pm[0] ;
         O10970Int_Pm = A10970Int_Pm ;
         n10970Int_Pm = false ;
         O10969Int_Pk = A10969Int_Pk ;
         n10969Int_Pk = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10972Int_cod = A10972Int_cod ;
         Z11043Int_Un = A11043Int_Un ;
         Z10966Int_Lin = A10966Int_Lin ;
         sMode1469 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AG1469( ) ;
         load1AG1469( ) ;
         Gx_mode = sMode1469 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1469 = (short)(0) ;
         initializeNonKey1AG1469( ) ;
         sMode1469 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AG1469( ) ;
         Gx_mode = sMode1469 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AG1469( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AG1469( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINCIN1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10971Int_Tp, T01AG2_A10971Int_Tp[0]) != 0 ) || ( DecimalUtil.compareTo(Z10967Int_ValI, T01AG2_A10967Int_ValI[0]) != 0 ) || ( DecimalUtil.compareTo(Z10968Int_ValF, T01AG2_A10968Int_ValF[0]) != 0 ) || ( DecimalUtil.compareTo(Z10969Int_Pk, T01AG2_A10969Int_Pk[0]) != 0 ) || ( DecimalUtil.compareTo(Z10970Int_Pm, T01AG2_A10970Int_Pm[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10971Int_Tp, T01AG2_A10971Int_Tp[0]) != 0 )
            {
               GXutil.writeLogln("tincint:[seudo value changed for attri]"+"Int_Tp");
               GXutil.writeLogRaw("Old: ",Z10971Int_Tp);
               GXutil.writeLogRaw("Current: ",T01AG2_A10971Int_Tp[0]);
            }
            if ( DecimalUtil.compareTo(Z10967Int_ValI, T01AG2_A10967Int_ValI[0]) != 0 )
            {
               GXutil.writeLogln("tincint:[seudo value changed for attri]"+"Int_ValI");
               GXutil.writeLogRaw("Old: ",Z10967Int_ValI);
               GXutil.writeLogRaw("Current: ",T01AG2_A10967Int_ValI[0]);
            }
            if ( DecimalUtil.compareTo(Z10968Int_ValF, T01AG2_A10968Int_ValF[0]) != 0 )
            {
               GXutil.writeLogln("tincint:[seudo value changed for attri]"+"Int_ValF");
               GXutil.writeLogRaw("Old: ",Z10968Int_ValF);
               GXutil.writeLogRaw("Current: ",T01AG2_A10968Int_ValF[0]);
            }
            if ( DecimalUtil.compareTo(Z10969Int_Pk, T01AG2_A10969Int_Pk[0]) != 0 )
            {
               GXutil.writeLogln("tincint:[seudo value changed for attri]"+"Int_Pk");
               GXutil.writeLogRaw("Old: ",Z10969Int_Pk);
               GXutil.writeLogRaw("Current: ",T01AG2_A10969Int_Pk[0]);
            }
            if ( DecimalUtil.compareTo(Z10970Int_Pm, T01AG2_A10970Int_Pm[0]) != 0 )
            {
               GXutil.writeLogln("tincint:[seudo value changed for attri]"+"Int_Pm");
               GXutil.writeLogRaw("Old: ",Z10970Int_Pm);
               GXutil.writeLogRaw("Current: ",T01AG2_A10970Int_Pm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINCIN1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AG1469( )
   {
      beforeValidate1AG1469( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AG1469( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AG1469( 0) ;
         checkOptimisticConcurrency1AG1469( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AG1469( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AG1469( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AG21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin), Boolean.valueOf(n10971Int_Tp), A10971Int_Tp, Boolean.valueOf(n10967Int_ValI), A10967Int_ValI, Boolean.valueOf(n10968Int_ValF), A10968Int_ValF, Boolean.valueOf(n10969Int_Pk), A10969Int_Pk, Boolean.valueOf(n10970Int_Pm), A10970Int_Pm, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCIN1");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        E10971Int_Tp = A10971Int_Tp ;
                        n10971Int_Tp = false ;
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
            load1AG1469( ) ;
         }
         endLevel1AG1469( ) ;
      }
      closeExtendedTableCursors1AG1469( ) ;
   }

   public void update1AG1469( )
   {
      beforeValidate1AG1469( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AG1469( ) ;
      }
      if ( ( nIsMod_1469 != 0 ) || ( nIsDirty_1469 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AG1469( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AG1469( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AG1469( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AG22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n10971Int_Tp), A10971Int_Tp, Boolean.valueOf(n10967Int_ValI), A10967Int_ValI, Boolean.valueOf(n10968Int_ValF), A10968Int_ValF, Boolean.valueOf(n10969Int_Pk), A10969Int_Pk, Boolean.valueOf(n10970Int_Pm), A10970Int_Pm, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCIN1");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINCIN1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AG1469( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( DecimalUtil.compareTo(A10969Int_Pk, AV38Oldpk) != 0 ) || ( DecimalUtil.compareTo(A10970Int_Pm, AV39Oldpm) != 0 ) ) && true /* After */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int5[0] = A252CliCod ;
                           GXv_char3[0] = A65ArtCod ;
                           GXv_int6[0] = (byte)(0) ;
                           GXv_int12[0] = A10972Int_cod ;
                           GXv_date13[0] = AV37H_diaA ;
                           GXv_char2[0] = A11043Int_Un ;
                           GXv_int7[0] = A10966Int_Lin ;
                           GXv_decimal11[0] = A10967Int_ValI ;
                           GXv_decimal10[0] = A10968Int_ValF ;
                           GXv_decimal9[0] = AV38Oldpk ;
                           GXv_decimal8[0] = AV39Oldpm ;
                           GXv_char14[0] = A10971Int_Tp ;
                           GXv_char15[0] = AV12Station ;
                           GXv_char16[0] = AV8UsurCod ;
                           GXv_char17[0] = httpContext.getMessage( "Mantenimiento Precios, Cliente-Articulo-Intensidad-Escalado", "") ;
                           new app.phpreie(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6, GXv_int12, GXv_date13, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_char14, GXv_char15, GXv_char16, GXv_char17) ;
                           tincint_impl.this.A396EmprCod = GXv_char4[0] ;
                           tincint_impl.this.A252CliCod = GXv_int5[0] ;
                           tincint_impl.this.A65ArtCod = GXv_char3[0] ;
                           tincint_impl.this.A10972Int_cod = GXv_int12[0] ;
                           tincint_impl.this.AV37H_diaA = GXv_date13[0] ;
                           tincint_impl.this.A11043Int_Un = GXv_char2[0] ;
                           tincint_impl.this.A10966Int_Lin = GXv_int7[0] ;
                           tincint_impl.this.A10967Int_ValI = GXv_decimal11[0] ;
                           tincint_impl.this.A10968Int_ValF = GXv_decimal10[0] ;
                           tincint_impl.this.AV38Oldpk = GXv_decimal9[0] ;
                           tincint_impl.this.AV39Oldpm = GXv_decimal8[0] ;
                           tincint_impl.this.A10971Int_Tp = GXv_char14[0] ;
                           tincint_impl.this.AV12Station = GXv_char15[0] ;
                           tincint_impl.this.AV8UsurCod = GXv_char16[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV37H_diaA", localUtil.format(AV37H_diaA, "99/99/99"));
                           httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
                           httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrimstr( AV38Oldpk, 13, 5));
                           httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrimstr( AV39Oldpm, 13, 5));
                           httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
                           httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AG1469( ) ;
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
            endLevel1AG1469( ) ;
         }
      }
      closeExtendedTableCursors1AG1469( ) ;
   }

   public void deferredUpdate1AG1469( )
   {
   }

   public void delete1AG1469( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AG1469( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AG1469( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AG1469( ) ;
         afterConfirm1AG1469( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AG1469( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AG23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCIN1");
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
      sMode1469 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AG1469( ) ;
      Gx_mode = sMode1469 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AG1469( )
   {
      standaloneModal1AG1469( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV38Oldpk = O10969Int_Pk ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrimstr( AV38Oldpk, 13, 5));
         AV39Oldpm = O10970Int_Pm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrimstr( AV39Oldpm, 13, 5));
      }
   }

   public void endLevel1AG1469( )
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

   public void scanStart1AG1469( )
   {
      /* Scan By routine */
      /* Using cursor T01AG24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
      RcdFound1469 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1469 = (short)(1) ;
         A10966Int_Lin = T01AG24_A10966Int_Lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AG1469( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1469 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1469 = (short)(1) ;
         A10966Int_Lin = T01AG24_A10966Int_Lin[0] ;
      }
   }

   public void scanEnd1AG1469( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1AG1469( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "T", "")) == 0 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = A10972Int_cod ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = A10969Int_Pk ;
         GXv_decimal10[0] = A10970Int_Pm ;
         GXv_char14[0] = AV36Msg_err1 ;
         new app.pctrve(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_char14) ;
         tincint_impl.this.A396EmprCod = GXv_char17[0] ;
         tincint_impl.this.A252CliCod = GXv_int5[0] ;
         tincint_impl.this.A65ArtCod = GXv_char16[0] ;
         tincint_impl.this.A10972Int_cod = GXv_int12[0] ;
         tincint_impl.this.A11043Int_Un = GXv_char15[0] ;
         tincint_impl.this.A10966Int_Lin = GXv_int7[0] ;
         tincint_impl.this.A10969Int_Pk = GXv_decimal11[0] ;
         tincint_impl.this.A10970Int_Pm = GXv_decimal10[0] ;
         tincint_impl.this.AV36Msg_err1 = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_err1", AV36Msg_err1);
      }
      if ( ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "T", "")) == 0 ) && ( A10969Int_Pk.doubleValue() > 0 ) && ( A10970Int_Pm.doubleValue() > 0 ) && true /* After */ )
      {
         GXCCtl = "INT_PK_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ha introducido 2 valores. Solo uno ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Pk_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "T", "")) == 0 ) && ( GXutil.strcmp(AV36Msg_err1, " ") != 0 ) && true /* After */ )
      {
         GXCCtl = "INT_TP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(AV36Msg_err1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Tp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1AG1469( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AG1469( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AG1469( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AG1469( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AG1469( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AG1469( )
   {
      edtInt_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtInt_ValI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_ValI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_ValI_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtInt_ValF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_ValF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_ValF_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtInt_Pk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Pk_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtInt_Pm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Pm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtInt_Tp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Tp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Tp_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes1AG1469( )
   {
   }

   public void send_integrity_lvl_hashes1AG1468( )
   {
   }

   public void subsflControlProps_701469( )
   {
      edtavnRcdDeleted_1469_Internalname = "vNRCDDELETED_1469_"+sGXsfl_70_idx ;
      edtInt_Lin_Internalname = "INT_LIN_"+sGXsfl_70_idx ;
      edtInt_ValI_Internalname = "INT_VALI_"+sGXsfl_70_idx ;
      edtInt_ValF_Internalname = "INT_VALF_"+sGXsfl_70_idx ;
      edtInt_Pk_Internalname = "INT_PK_"+sGXsfl_70_idx ;
      edtInt_Pm_Internalname = "INT_PM_"+sGXsfl_70_idx ;
      edtInt_Tp_Internalname = "INT_TP_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701469( )
   {
      edtavnRcdDeleted_1469_Internalname = "vNRCDDELETED_1469_"+sGXsfl_70_fel_idx ;
      edtInt_Lin_Internalname = "INT_LIN_"+sGXsfl_70_fel_idx ;
      edtInt_ValI_Internalname = "INT_VALI_"+sGXsfl_70_fel_idx ;
      edtInt_ValF_Internalname = "INT_VALF_"+sGXsfl_70_fel_idx ;
      edtInt_Pk_Internalname = "INT_PK_"+sGXsfl_70_fel_idx ;
      edtInt_Pm_Internalname = "INT_PM_"+sGXsfl_70_fel_idx ;
      edtInt_Tp_Internalname = "INT_TP_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1AG1469( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701469( ) ;
      sendRow1AG1469( ) ;
   }

   public void sendRow1AG1469( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
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
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1469_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1469_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1469), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1469), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1469_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1469_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInt_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10966Int_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInt_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtInt_Lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInt_ValI_Internalname,GXutil.ltrim( localUtil.ntoc( A10967Int_ValI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInt_ValI_Enabled!=0) ? localUtil.format( A10967Int_ValI, "ZZZZZ9.99") : localUtil.format( A10967Int_ValI, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInt_ValI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtInt_ValI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInt_ValF_Internalname,GXutil.ltrim( localUtil.ntoc( A10968Int_ValF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInt_ValF_Enabled!=0) ? localUtil.format( A10968Int_ValF, "ZZZZZ9.99") : localUtil.format( A10968Int_ValF, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInt_ValF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtInt_ValF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInt_Pk_Internalname,GXutil.ltrim( localUtil.ntoc( A10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInt_Pk_Enabled!=0) ? localUtil.format( A10969Int_Pk, "ZZZZZZ9.999") : localUtil.format( A10969Int_Pk, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInt_Pk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtInt_Pk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInt_Pm_Internalname,GXutil.ltrim( localUtil.ntoc( A10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInt_Pm_Enabled!=0) ? localUtil.format( A10970Int_Pm, "ZZZZZZ9.999") : localUtil.format( A10970Int_Pm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInt_Pm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtInt_Pm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1469_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInt_Tp_Internalname,GXutil.rtrim( A10971Int_Tp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInt_Tp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtInt_Tp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AG1469( ) ;
      GXCCtl = "Z10966Int_Lin_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10966Int_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10971Int_Tp_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10971Int_Tp));
      GXCCtl = "Z10967Int_ValI_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10967Int_ValI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10968Int_ValF_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10968Int_ValF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10969Int_Pk_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10970Int_Pm_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O10970Int_Pm_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O10969Int_Pk_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1469_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1469_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1469_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1469, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1469_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1469_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_VALI_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_VALF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_PK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pk_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_PM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_TP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Tp_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AG1469( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701469( ) ;
      edtavnRcdDeleted_1469_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1469_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInt_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_LIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInt_ValI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_VALI_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInt_ValF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_VALF_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInt_Pk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_PK_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInt_Pm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_PM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInt_Tp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INT_TP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1469_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1469_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1469");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1469_Internalname ;
         wbErr = true ;
         nRcdDeleted_1469 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1469 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1469_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInt_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInt_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "INT_LIN_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Lin_Internalname ;
         wbErr = true ;
         A10966Int_Lin = (short)(0) ;
      }
      else
      {
         A10966Int_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtInt_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtInt_ValI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtInt_ValI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "INT_VALI_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValI_Internalname ;
         wbErr = true ;
         A10967Int_ValI = DecimalUtil.ZERO ;
         n10967Int_ValI = false ;
      }
      else
      {
         A10967Int_ValI = localUtil.ctond( httpContext.cgiGet( edtInt_ValI_Internalname)) ;
         n10967Int_ValI = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtInt_ValF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtInt_ValF_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "INT_VALF_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
         wbErr = true ;
         A10968Int_ValF = DecimalUtil.ZERO ;
         n10968Int_ValF = false ;
      }
      else
      {
         A10968Int_ValF = localUtil.ctond( httpContext.cgiGet( edtInt_ValF_Internalname)) ;
         n10968Int_ValF = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtInt_Pk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtInt_Pk_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "INT_PK_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Pk_Internalname ;
         wbErr = true ;
         A10969Int_Pk = DecimalUtil.ZERO ;
         n10969Int_Pk = false ;
      }
      else
      {
         A10969Int_Pk = localUtil.ctond( httpContext.cgiGet( edtInt_Pk_Internalname)) ;
         n10969Int_Pk = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtInt_Pm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtInt_Pm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "INT_PM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_Pm_Internalname ;
         wbErr = true ;
         A10970Int_Pm = DecimalUtil.ZERO ;
         n10970Int_Pm = false ;
      }
      else
      {
         A10970Int_Pm = localUtil.ctond( httpContext.cgiGet( edtInt_Pm_Internalname)) ;
         n10970Int_Pm = false ;
      }
      A10971Int_Tp = httpContext.cgiGet( edtInt_Tp_Internalname) ;
      n10971Int_Tp = false ;
      GXCCtl = "Z10966Int_Lin_" + sGXsfl_70_idx ;
      Z10966Int_Lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10971Int_Tp_" + sGXsfl_70_idx ;
      Z10971Int_Tp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10967Int_ValI_" + sGXsfl_70_idx ;
      Z10967Int_ValI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10968Int_ValF_" + sGXsfl_70_idx ;
      Z10968Int_ValF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10969Int_Pk_" + sGXsfl_70_idx ;
      Z10969Int_Pk = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10970Int_Pm_" + sGXsfl_70_idx ;
      Z10970Int_Pm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O10970Int_Pm_" + sGXsfl_70_idx ;
      O10970Int_Pm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O10969Int_Pk_" + sGXsfl_70_idx ;
      O10969Int_Pk = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1469_" + sGXsfl_70_idx ;
      nRcdDeleted_1469 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1469_" + sGXsfl_70_idx ;
      nRcdExists_1469 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1469_" + sGXsfl_70_idx ;
      nIsMod_1469 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtInt_Lin_Enabled = edtInt_Lin_Enabled ;
   }

   public void confirmValues1AG0( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701469( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701469( ) ;
         httpContext.changePostValue( "Z10966Int_Lin_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10966Int_Lin_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10966Int_Lin_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10971Int_Tp_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10971Int_Tp_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10971Int_Tp_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10967Int_ValI_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10967Int_ValI_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10967Int_ValI_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10968Int_ValF_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10968Int_ValF_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10968Int_ValF_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10969Int_Pk_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10969Int_Pk_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10969Int_Pk_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10970Int_Pm_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10970Int_Pm_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10970Int_Pm_"+sGXsfl_70_idx) ;
      }
      httpContext.changePostValue( "O10970Int_Pm", httpContext.cgiGet( "T10970Int_Pm")) ;
      httpContext.deletePostValue( "T10970Int_Pm") ;
      httpContext.changePostValue( "O10969Int_Pk", httpContext.cgiGet( "T10969Int_Pk")) ;
      httpContext.deletePostValue( "T10969Int_Pk") ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
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
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tincint", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A10972Int_cod,2,0)),GXutil.URLEncode(GXutil.rtrim(A10973Int_Dsc)),GXutil.URLEncode(GXutil.rtrim(A11043Int_Un))}, new String[] {"EmprCod","CliCod","ArtCod","Int_cod","Int_Dsc","Int_Un"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10972Int_cod", GXutil.ltrim( localUtil.ntoc( Z10972Int_cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11043Int_Un", GXutil.rtrim( Z11043Int_Un));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10965Int_Ulin", GXutil.ltrim( localUtil.ntoc( Z10965Int_Ulin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10965Int_Ulin", GXutil.ltrim( localUtil.ntoc( O10965Int_Ulin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vH_DIAA", localUtil.dtoc( AV37H_diaA, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPK", GXutil.ltrim( localUtil.ntoc( AV38Oldpk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPM", GXutil.ltrim( localUtil.ntoc( AV39Oldpm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINT_PM", GXutil.ltrim( localUtil.ntoc( AV35Int_pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINT_PK", GXutil.ltrim( localUtil.ntoc( AV34Int_pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINT_VALF", GXutil.ltrim( localUtil.ntoc( AV33Int_valf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINT_VALI", GXutil.ltrim( localUtil.ntoc( AV32Int_vali, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR1", GXutil.rtrim( AV36Msg_err1));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
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
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
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
      return formatLink("app.tincint", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A10972Int_cod,2,0)),GXutil.URLEncode(GXutil.rtrim(A10973Int_Dsc)),GXutil.URLEncode(GXutil.rtrim(A11043Int_Un))}, new String[] {"EmprCod","CliCod","ArtCod","Int_cod","Int_Dsc","Int_Un"})  ;
   }

   public String getPgmname( )
   {
      return "TINCINT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "") ;
   }

   public void initializeNonKey1AG1468( )
   {
      A10965Int_Ulin = (short)(0) ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      O10965Int_Ulin = A10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      Z10965Int_Ulin = (short)(0) ;
   }

   public void initAll1AG1468( )
   {
      initializeNonKey1AG1468( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AG1469( )
   {
      AV35Int_pm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
      AV34Int_pk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
      AV33Int_valf = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
      AV32Int_vali = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
      AV36Msg_err1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_err1", AV36Msg_err1);
      AV38Oldpk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrimstr( AV38Oldpk, 13, 5));
      AV39Oldpm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrimstr( AV39Oldpm, 13, 5));
      A10967Int_ValI = DecimalUtil.ZERO ;
      n10967Int_ValI = false ;
      A10968Int_ValF = DecimalUtil.ZERO ;
      n10968Int_ValF = false ;
      A10969Int_Pk = DecimalUtil.ZERO ;
      n10969Int_Pk = false ;
      A10970Int_Pm = DecimalUtil.ZERO ;
      n10970Int_Pm = false ;
      A10971Int_Tp = E10971Int_Tp ;
      n10971Int_Tp = false ;
      O10970Int_Pm = A10970Int_Pm ;
      n10970Int_Pm = false ;
      O10969Int_Pk = A10969Int_Pk ;
      n10969Int_Pk = false ;
      Z10971Int_Tp = "" ;
      Z10967Int_ValI = DecimalUtil.ZERO ;
      Z10968Int_ValF = DecimalUtil.ZERO ;
      Z10969Int_Pk = DecimalUtil.ZERO ;
      Z10970Int_Pm = DecimalUtil.ZERO ;
   }

   public void initAll1AG1469( )
   {
      A10966Int_Lin = (short)(0) ;
      initializeNonKey1AG1469( ) ;
   }

   public void standaloneModalInsert1AG1469( )
   {
      A10965Int_Ulin = i10965Int_Ulin ;
      n10965Int_Ulin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10965Int_Ulin), 4, 0));
      A10971Int_Tp = i10971Int_Tp ;
      n10971Int_Tp = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241562080", true, true);
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
      httpContext.AddJavascriptSource("tincint.js", "?20268241562080", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1469( )
   {
      edtInt_Lin_Enabled = defedtInt_Lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtInt_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInt_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void startgridcontrol70( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1469, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1469_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10967Int_ValI, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10968Int_ValF, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_ValF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10969Int_Pk, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pk_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10970Int_Pm, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Pm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10971Int_Tp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInt_Tp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtInt_cod_Internalname = "INT_COD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtInt_Un_Internalname = "INT_UN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtInt_Dsc_Internalname = "INT_DSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtInt_Ulin_Internalname = "INT_ULIN" ;
      edtavnRcdDeleted_1469_Internalname = "vNRCDDELETED_1469" ;
      edtInt_Lin_Internalname = "INT_LIN" ;
      edtInt_ValI_Internalname = "INT_VALI" ;
      edtInt_ValF_Internalname = "INT_VALF" ;
      edtInt_Pk_Internalname = "INT_PK" ;
      edtInt_Pm_Internalname = "INT_PM" ;
      edtInt_Tp_Internalname = "INT_TP" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "") );
      edtInt_Tp_Jsonclick = "" ;
      edtInt_Pm_Jsonclick = "" ;
      edtInt_Pk_Jsonclick = "" ;
      edtInt_ValF_Jsonclick = "" ;
      edtInt_ValI_Jsonclick = "" ;
      edtInt_Lin_Jsonclick = "" ;
      edtavnRcdDeleted_1469_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtInt_Tp_Enabled = 1 ;
      edtInt_Pm_Enabled = 1 ;
      edtInt_Pk_Enabled = 1 ;
      edtInt_ValF_Enabled = 1 ;
      edtInt_ValI_Enabled = 1 ;
      edtInt_Lin_Enabled = 1 ;
      edtavnRcdDeleted_1469_Enabled = 1 ;
      edtInt_Ulin_Jsonclick = "" ;
      edtInt_Ulin_Backcolor = (int)(0xFFFFFF) ;
      edtInt_Ulin_Enabled = 0 ;
      edtInt_Dsc_Jsonclick = "" ;
      edtInt_Dsc_Backcolor = (int)(0xFFFFFF) ;
      edtInt_Dsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtInt_Un_Jsonclick = "" ;
      edtInt_Un_Backcolor = (int)(0xFFFFFF) ;
      edtInt_Un_Enabled = 0 ;
      edtInt_cod_Jsonclick = "" ;
      edtInt_cod_Backcolor = (int)(0xFFFFFF) ;
      edtInt_cod_Enabled = 0 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void xc_11_1AG1469( String A396EmprCod ,
                              int A252CliCod ,
                              String A65ArtCod ,
                              byte A10972Int_cod ,
                              String A11043Int_Un ,
                              short A10966Int_Lin ,
                              java.math.BigDecimal AV32Int_vali ,
                              java.math.BigDecimal AV33Int_valf ,
                              java.math.BigDecimal AV34Int_pk ,
                              java.math.BigDecimal AV35Int_pm ,
                              java.math.BigDecimal A10967Int_ValI )
   {
      if ( true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = A10972Int_cod ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = AV32Int_vali ;
         GXv_decimal10[0] = AV33Int_valf ;
         GXv_decimal9[0] = AV34Int_pk ;
         GXv_decimal8[0] = AV35Int_pm ;
         new app.pctrvi(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8) ;
         A396EmprCod = GXv_char17[0] ;
         A252CliCod = GXv_int5[0] ;
         A65ArtCod = GXv_char16[0] ;
         A10972Int_cod = GXv_int12[0] ;
         A11043Int_Un = GXv_char15[0] ;
         A10966Int_Lin = GXv_int7[0] ;
         AV32Int_vali = GXv_decimal11[0] ;
         AV33Int_valf = GXv_decimal10[0] ;
         AV34Int_pk = GXv_decimal9[0] ;
         AV35Int_pm = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11043Int_Un))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Int_vali, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Int_valf, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34Int_pk, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35Int_pm, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_1AG1469( String A396EmprCod ,
                              int A252CliCod ,
                              String A65ArtCod ,
                              byte A10972Int_cod ,
                              String A11043Int_Un ,
                              short A10966Int_Lin ,
                              java.math.BigDecimal AV32Int_vali ,
                              java.math.BigDecimal AV33Int_valf ,
                              java.math.BigDecimal AV34Int_pk ,
                              java.math.BigDecimal AV35Int_pm ,
                              java.math.BigDecimal A10968Int_ValF )
   {
      if ( true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = A10972Int_cod ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = AV32Int_vali ;
         GXv_decimal10[0] = AV33Int_valf ;
         GXv_decimal9[0] = AV34Int_pk ;
         GXv_decimal8[0] = AV35Int_pm ;
         new app.pctrvf(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8) ;
         A396EmprCod = GXv_char17[0] ;
         A252CliCod = GXv_int5[0] ;
         A65ArtCod = GXv_char16[0] ;
         A10972Int_cod = GXv_int12[0] ;
         A11043Int_Un = GXv_char15[0] ;
         A10966Int_Lin = GXv_int7[0] ;
         AV32Int_vali = GXv_decimal11[0] ;
         AV33Int_valf = GXv_decimal10[0] ;
         AV34Int_pk = GXv_decimal9[0] ;
         AV35Int_pm = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrimstr( AV32Int_vali, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrimstr( AV33Int_valf, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrimstr( AV34Int_pk, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrimstr( AV35Int_pm, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11043Int_Un))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Int_vali, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Int_valf, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34Int_pk, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35Int_pm, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_20_1AG1469( String A396EmprCod ,
                              int A252CliCod ,
                              String A65ArtCod ,
                              byte A10972Int_cod ,
                              String A11043Int_Un ,
                              short A10966Int_Lin ,
                              java.math.BigDecimal A10969Int_Pk ,
                              java.math.BigDecimal A10970Int_Pm ,
                              String AV36Msg_err1 ,
                              String A10971Int_Tp )
   {
      if ( true /* After */ && ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "T", "")) == 0 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = A10972Int_cod ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = A10969Int_Pk ;
         GXv_decimal10[0] = A10970Int_Pm ;
         GXv_char14[0] = AV36Msg_err1 ;
         new app.pctrve(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_char14) ;
         A396EmprCod = GXv_char17[0] ;
         A252CliCod = GXv_int5[0] ;
         A65ArtCod = GXv_char16[0] ;
         A10972Int_cod = GXv_int12[0] ;
         A11043Int_Un = GXv_char15[0] ;
         A10966Int_Lin = GXv_int7[0] ;
         A10969Int_Pk = GXv_decimal11[0] ;
         A10970Int_Pm = GXv_decimal10[0] ;
         AV36Msg_err1 = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_err1", AV36Msg_err1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11043Int_Un))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10969Int_Pk, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10970Int_Pm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36Msg_err1))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_1AG1469( )
   {
      if ( ( ( DecimalUtil.compareTo(A10969Int_Pk, AV38Oldpk) != 0 ) || ( DecimalUtil.compareTo(A10970Int_Pm, AV39Oldpm) != 0 ) ) && true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = (byte)(0) ;
         GXv_int6[0] = A10972Int_cod ;
         GXv_date13[0] = AV37H_diaA ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = A10967Int_ValI ;
         GXv_decimal10[0] = A10968Int_ValF ;
         GXv_decimal9[0] = AV38Oldpk ;
         GXv_decimal8[0] = AV39Oldpm ;
         GXv_char14[0] = A10971Int_Tp ;
         GXv_char4[0] = AV12Station ;
         GXv_char3[0] = AV8UsurCod ;
         GXv_char2[0] = httpContext.getMessage( "Mantenimiento Precios, Cliente-Articulo-Intensidad-Escalado", "") ;
         new app.phpreie(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_int6, GXv_date13, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_char14, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char17[0] ;
         A252CliCod = GXv_int5[0] ;
         A65ArtCod = GXv_char16[0] ;
         A10972Int_cod = GXv_int6[0] ;
         AV37H_diaA = GXv_date13[0] ;
         A11043Int_Un = GXv_char15[0] ;
         A10966Int_Lin = GXv_int7[0] ;
         A10967Int_ValI = GXv_decimal11[0] ;
         A10968Int_ValF = GXv_decimal10[0] ;
         AV38Oldpk = GXv_decimal9[0] ;
         AV39Oldpm = GXv_decimal8[0] ;
         A10971Int_Tp = GXv_char14[0] ;
         AV12Station = GXv_char4[0] ;
         AV8UsurCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10972Int_cod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV37H_diaA", localUtil.format(AV37H_diaA, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", A11043Int_Un);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrimstr( AV38Oldpk, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrimstr( AV39Oldpm, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_701469( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AG1469( ) ;
         standaloneModal1AG1469( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AG1469( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701469( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AG25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AG25_A407EmprNom[0] ;
      n407EmprNom = T01AG25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T01AG26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AG26_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(24);
      /* Using cursor T01AG27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T01AG27_A69ArtDsc[0] ;
      n69ArtDsc = T01AG27_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(25);
      /* Using cursor T01AG28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INT_COD");
         AnyError = (short)(1) ;
      }
      A10973Int_Dsc = T01AG28_A10973Int_Dsc[0] ;
      n10973Int_Dsc = T01AG28_n10973Int_Dsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10973Int_Dsc", A10973Int_Dsc);
      pr_default.close(26);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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

   public void valid_Int_un( )
   {
      n10965Int_Ulin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10965Int_Ulin", GXutil.ltrim( localUtil.ntoc( A10965Int_Ulin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10973Int_Dsc", GXutil.rtrim( A10973Int_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10972Int_cod", GXutil.ltrim( localUtil.ntoc( Z10972Int_cod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11043Int_Un", GXutil.rtrim( Z11043Int_Un));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10965Int_Ulin", GXutil.ltrim( localUtil.ntoc( Z10965Int_Ulin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10973Int_Dsc", GXutil.rtrim( Z10973Int_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "O10965Int_Ulin", GXutil.ltrim( localUtil.ntoc( O10965Int_Ulin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Int_vali( )
   {
      n10967Int_ValI = false ;
      if ( true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = A10972Int_cod ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = AV32Int_vali ;
         GXv_decimal10[0] = AV33Int_valf ;
         GXv_decimal9[0] = AV34Int_pk ;
         GXv_decimal8[0] = AV35Int_pm ;
         new app.pctrvi(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8) ;
         tincint_impl.this.A396EmprCod = GXv_char17[0] ;
         A396EmprCod = this.A396EmprCod ;
         tincint_impl.this.A252CliCod = GXv_int5[0] ;
         A252CliCod = this.A252CliCod ;
         tincint_impl.this.A65ArtCod = GXv_char16[0] ;
         A65ArtCod = this.A65ArtCod ;
         tincint_impl.this.A10972Int_cod = GXv_int12[0] ;
         A10972Int_cod = this.A10972Int_cod ;
         tincint_impl.this.A11043Int_Un = GXv_char15[0] ;
         A11043Int_Un = this.A11043Int_Un ;
         tincint_impl.this.A10966Int_Lin = GXv_int7[0] ;
         A10966Int_Lin = this.A10966Int_Lin ;
         tincint_impl.this.AV32Int_vali = GXv_decimal11[0] ;
         AV32Int_vali = this.AV32Int_vali ;
         tincint_impl.this.AV33Int_valf = GXv_decimal10[0] ;
         AV33Int_valf = this.AV33Int_valf ;
         tincint_impl.this.AV34Int_pk = GXv_decimal9[0] ;
         AV34Int_pk = this.AV34Int_pk ;
         tincint_impl.this.AV35Int_pm = GXv_decimal8[0] ;
         AV35Int_pm = this.AV35Int_pm ;
      }
      if ( ( AV33Int_valf.doubleValue() > 0 ) && ( (A10967Int_ValI.subtract(AV33Int_valf)).doubleValue() > 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Inicial Incorrecto. Valor Inicial=Valor Final_Anterior+1¡¡¡", ""), 1, "INT_VALI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValI_Internalname ;
      }
      if ( ( AV33Int_valf.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A10967Int_ValI, AV33Int_valf) <= 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Inicial menor o igual a Valor Final Linea Anterior ¡¡¡", ""), 1, "INT_VALI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValI_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", GXutil.rtrim( A11043Int_Un));
      httpContext.ajax_rsp_assign_attri("", false, "A10966Int_Lin", GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrim( localUtil.ntoc( AV32Int_vali, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrim( localUtil.ntoc( AV33Int_valf, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrim( localUtil.ntoc( AV34Int_pk, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrim( localUtil.ntoc( AV35Int_pm, (byte)(13), (byte)(5), ".", "")));
   }

   public void valid_Int_valf( )
   {
      n10968Int_ValF = false ;
      if ( true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char16[0] = A65ArtCod ;
         GXv_int12[0] = A10972Int_cod ;
         GXv_char15[0] = A11043Int_Un ;
         GXv_int7[0] = A10966Int_Lin ;
         GXv_decimal11[0] = AV32Int_vali ;
         GXv_decimal10[0] = AV33Int_valf ;
         GXv_decimal9[0] = AV34Int_pk ;
         GXv_decimal8[0] = AV35Int_pm ;
         new app.pctrvf(remoteHandle, context).execute( GXv_char17, GXv_int5, GXv_char16, GXv_int12, GXv_char15, GXv_int7, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8) ;
         tincint_impl.this.A396EmprCod = GXv_char17[0] ;
         A396EmprCod = this.A396EmprCod ;
         tincint_impl.this.A252CliCod = GXv_int5[0] ;
         A252CliCod = this.A252CliCod ;
         tincint_impl.this.A65ArtCod = GXv_char16[0] ;
         A65ArtCod = this.A65ArtCod ;
         tincint_impl.this.A10972Int_cod = GXv_int12[0] ;
         A10972Int_cod = this.A10972Int_cod ;
         tincint_impl.this.A11043Int_Un = GXv_char15[0] ;
         A11043Int_Un = this.A11043Int_Un ;
         tincint_impl.this.A10966Int_Lin = GXv_int7[0] ;
         A10966Int_Lin = this.A10966Int_Lin ;
         tincint_impl.this.AV32Int_vali = GXv_decimal11[0] ;
         AV32Int_vali = this.AV32Int_vali ;
         tincint_impl.this.AV33Int_valf = GXv_decimal10[0] ;
         AV33Int_valf = this.AV33Int_valf ;
         tincint_impl.this.AV34Int_pk = GXv_decimal9[0] ;
         AV34Int_pk = this.AV34Int_pk ;
         tincint_impl.this.AV35Int_pm = GXv_decimal8[0] ;
         AV35Int_pm = this.AV35Int_pm ;
      }
      if ( ( A10968Int_ValF.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A10968Int_ValF, A10967Int_ValI) <= 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final menor o igual a Valor Inicial ¡¡¡", ""), 1, "INT_VALF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
      }
      if ( ( AV32Int_vali.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A10968Int_ValF, AV32Int_vali) >= 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final mayor o igual a Valor Inicial Linea Siguiente ¡¡¡", ""), 1, "INT_VALF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
      }
      if ( ( A10967Int_ValI.doubleValue() > 0 ) && ( A10968Int_ValF.doubleValue() == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final igual a CERO ¡¡¡", ""), 1, "INT_VALF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
      }
      if ( ( A10967Int_ValI.doubleValue() == 0 ) && ( A10968Int_ValF.doubleValue() == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Valor Final/Valor Final igual a CERO ¡¡¡", ""), 1, "INT_VALF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInt_ValF_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A10972Int_cod", GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11043Int_Un", GXutil.rtrim( A11043Int_Un));
      httpContext.ajax_rsp_assign_attri("", false, "A10966Int_Lin", GXutil.ltrim( localUtil.ntoc( A10966Int_Lin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Int_vali", GXutil.ltrim( localUtil.ntoc( AV32Int_vali, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Int_valf", GXutil.ltrim( localUtil.ntoc( AV33Int_valf, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Int_pk", GXutil.ltrim( localUtil.ntoc( AV34Int_pk, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Int_pm", GXutil.ltrim( localUtil.ntoc( AV35Int_pm, (byte)(13), (byte)(5), ".", "")));
   }

   public void valid_Int_pk( )
   {
      n10969Int_Pk = false ;
      AV38Oldpk = O10969Int_Pk ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV38Oldpk", GXutil.ltrim( localUtil.ntoc( AV38Oldpk, (byte)(13), (byte)(5), ".", "")));
   }

   public void valid_Int_pm( )
   {
      n10970Int_Pm = false ;
      AV39Oldpm = O10970Int_Pm ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV39Oldpm", GXutil.ltrim( localUtil.ntoc( AV39Oldpm, (byte)(13), (byte)(5), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A10973Int_Dsc',fld:'INT_DSC',pic:''},{av:'A11043Int_Un',fld:'INT_UN',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'HIST E'","{handler:'e121AG2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'}]");
      setEventMetadata("'HIST E'",",oparms:[{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_INT_COD","{handler:'valid_Int_cod',iparms:[]");
      setEventMetadata("VALID_INT_COD",",oparms:[]}");
      setEventMetadata("VALID_INT_UN","{handler:'valid_Int_un',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A10965Int_Ulin',fld:'INT_ULIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV37H_diaA',fld:'vH_DIAA',pic:''}]");
      setEventMetadata("VALID_INT_UN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A10965Int_Ulin',fld:'INT_ULIN',pic:'ZZZ9'},{av:'A10973Int_Dsc',fld:'INT_DSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z10972Int_cod'},{av:'Z11043Int_Un'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z10965Int_Ulin'},{av:'Z10973Int_Dsc'},{av:'O10965Int_Ulin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_INT_ULIN","{handler:'valid_Int_ulin',iparms:[]");
      setEventMetadata("VALID_INT_ULIN",",oparms:[]}");
      setEventMetadata("VALID_INT_LIN","{handler:'valid_Int_lin',iparms:[]");
      setEventMetadata("VALID_INT_LIN",",oparms:[]}");
      setEventMetadata("VALID_INT_VALI","{handler:'valid_Int_vali',iparms:[{av:'A10966Int_Lin',fld:'INT_LIN',pic:'ZZZ9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10967Int_ValI',fld:'INT_VALI',pic:'ZZZZZ9.99'},{av:'AV35Int_pm',fld:'vINT_PM',pic:'ZZZZZZ9.999'},{av:'AV34Int_pk',fld:'vINT_PK',pic:'ZZZZZZ9.999'},{av:'AV33Int_valf',fld:'vINT_VALF',pic:'ZZZZZ9.99'},{av:'AV32Int_vali',fld:'vINT_VALI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_INT_VALI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10966Int_Lin',fld:'INT_LIN',pic:'ZZZ9'},{av:'AV32Int_vali',fld:'vINT_VALI',pic:'ZZZZZ9.99'},{av:'AV33Int_valf',fld:'vINT_VALF',pic:'ZZZZZ9.99'},{av:'AV34Int_pk',fld:'vINT_PK',pic:'ZZZZZZ9.999'},{av:'AV35Int_pm',fld:'vINT_PM',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_INT_VALF","{handler:'valid_Int_valf',iparms:[{av:'AV35Int_pm',fld:'vINT_PM',pic:'ZZZZZZ9.999'},{av:'AV34Int_pk',fld:'vINT_PK',pic:'ZZZZZZ9.999'},{av:'AV33Int_valf',fld:'vINT_VALF',pic:'ZZZZZ9.99'},{av:'AV32Int_vali',fld:'vINT_VALI',pic:'ZZZZZ9.99'},{av:'A10966Int_Lin',fld:'INT_LIN',pic:'ZZZ9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10968Int_ValF',fld:'INT_VALF',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_INT_VALF",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10966Int_Lin',fld:'INT_LIN',pic:'ZZZ9'},{av:'AV32Int_vali',fld:'vINT_VALI',pic:'ZZZZZ9.99'},{av:'AV33Int_valf',fld:'vINT_VALF',pic:'ZZZZZ9.99'},{av:'AV34Int_pk',fld:'vINT_PK',pic:'ZZZZZZ9.999'},{av:'AV35Int_pm',fld:'vINT_PM',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_INT_PK","{handler:'valid_Int_pk',iparms:[{av:'O10969Int_Pk'},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'AV38Oldpk',fld:'vOLDPK',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_INT_PK",",oparms:[{av:'AV38Oldpk',fld:'vOLDPK',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_INT_PM","{handler:'valid_Int_pm',iparms:[{av:'O10970Int_Pm'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'AV39Oldpm',fld:'vOLDPM',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_INT_PM",",oparms:[{av:'AV39Oldpm',fld:'vOLDPM',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_INT_TP","{handler:'valid_Int_tp',iparms:[]");
      setEventMetadata("VALID_INT_TP",",oparms:[]}");
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
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(23);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E10971Int_Tp = "" ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA10973Int_Dsc = "" ;
      wcpOA11043Int_Un = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z11043Int_Un = "" ;
      Z10971Int_Tp = "" ;
      Z10967Int_ValI = DecimalUtil.ZERO ;
      Z10968Int_ValF = DecimalUtil.ZERO ;
      Z10969Int_Pk = DecimalUtil.ZERO ;
      Z10970Int_Pm = DecimalUtil.ZERO ;
      O10970Int_Pm = DecimalUtil.ZERO ;
      O10969Int_Pk = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A11043Int_Un = "" ;
      AV32Int_vali = DecimalUtil.ZERO ;
      AV33Int_valf = DecimalUtil.ZERO ;
      AV34Int_pk = DecimalUtil.ZERO ;
      AV35Int_pm = DecimalUtil.ZERO ;
      A10967Int_ValI = DecimalUtil.ZERO ;
      A10968Int_ValF = DecimalUtil.ZERO ;
      A10969Int_Pk = DecimalUtil.ZERO ;
      A10970Int_Pm = DecimalUtil.ZERO ;
      AV36Msg_err1 = "" ;
      A10971Int_Tp = "" ;
      A10973Int_Dsc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_mode = "" ;
      sStyleString = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1469 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37H_diaA = GXutil.nullDate() ;
      AV41Pgmname = "" ;
      AV38Oldpk = DecimalUtil.ZERO ;
      AV39Oldpm = DecimalUtil.ZERO ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1468 = "" ;
      GXCCtl = "" ;
      T10970Int_Pm = DecimalUtil.ZERO ;
      T10969Int_Pk = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      GXt_char1 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV11EmprNom = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z10973Int_Dsc = "" ;
      T01AG6_A407EmprNom = new String[] {""} ;
      T01AG6_n407EmprNom = new boolean[] {false} ;
      T01AG7_A279CliNom = new String[] {""} ;
      T01AG8_A69ArtDsc = new String[] {""} ;
      T01AG8_n69ArtDsc = new boolean[] {false} ;
      T01AG9_A10973Int_Dsc = new String[] {""} ;
      T01AG9_n10973Int_Dsc = new boolean[] {false} ;
      T01AG10_A10973Int_Dsc = new String[] {""} ;
      T01AG10_n10973Int_Dsc = new boolean[] {false} ;
      T01AG10_A11043Int_Un = new String[] {""} ;
      T01AG10_A407EmprNom = new String[] {""} ;
      T01AG10_n407EmprNom = new boolean[] {false} ;
      T01AG10_A279CliNom = new String[] {""} ;
      T01AG10_A69ArtDsc = new String[] {""} ;
      T01AG10_n69ArtDsc = new boolean[] {false} ;
      T01AG10_A10965Int_Ulin = new short[1] ;
      T01AG10_n10965Int_Ulin = new boolean[] {false} ;
      T01AG10_A396EmprCod = new String[] {""} ;
      T01AG10_A252CliCod = new int[1] ;
      T01AG10_A65ArtCod = new String[] {""} ;
      T01AG10_A10972Int_cod = new byte[1] ;
      T01AG11_A396EmprCod = new String[] {""} ;
      T01AG11_A252CliCod = new int[1] ;
      T01AG11_A65ArtCod = new String[] {""} ;
      T01AG11_A10972Int_cod = new byte[1] ;
      T01AG11_A11043Int_Un = new String[] {""} ;
      T01AG5_A11043Int_Un = new String[] {""} ;
      T01AG5_A10965Int_Ulin = new short[1] ;
      T01AG5_n10965Int_Ulin = new boolean[] {false} ;
      T01AG5_A396EmprCod = new String[] {""} ;
      T01AG5_A252CliCod = new int[1] ;
      T01AG5_A65ArtCod = new String[] {""} ;
      T01AG5_A10972Int_cod = new byte[1] ;
      T01AG12_A11043Int_Un = new String[] {""} ;
      T01AG12_A396EmprCod = new String[] {""} ;
      T01AG12_A252CliCod = new int[1] ;
      T01AG12_A65ArtCod = new String[] {""} ;
      T01AG12_A10972Int_cod = new byte[1] ;
      T01AG13_A11043Int_Un = new String[] {""} ;
      T01AG13_A396EmprCod = new String[] {""} ;
      T01AG13_A252CliCod = new int[1] ;
      T01AG13_A65ArtCod = new String[] {""} ;
      T01AG13_A10972Int_cod = new byte[1] ;
      T01AG4_A11043Int_Un = new String[] {""} ;
      T01AG4_A10965Int_Ulin = new short[1] ;
      T01AG4_n10965Int_Ulin = new boolean[] {false} ;
      T01AG4_A396EmprCod = new String[] {""} ;
      T01AG4_A252CliCod = new int[1] ;
      T01AG4_A65ArtCod = new String[] {""} ;
      T01AG4_A10972Int_cod = new byte[1] ;
      T01AG18_A396EmprCod = new String[] {""} ;
      T01AG18_A252CliCod = new int[1] ;
      T01AG18_A65ArtCod = new String[] {""} ;
      T01AG18_A10972Int_cod = new byte[1] ;
      T01AG18_A11043Int_Un = new String[] {""} ;
      E10971Int_Tp = "" ;
      T01AG19_A252CliCod = new int[1] ;
      T01AG19_A65ArtCod = new String[] {""} ;
      T01AG19_A10972Int_cod = new byte[1] ;
      T01AG19_A11043Int_Un = new String[] {""} ;
      T01AG19_A10966Int_Lin = new short[1] ;
      T01AG19_A10971Int_Tp = new String[] {""} ;
      T01AG19_n10971Int_Tp = new boolean[] {false} ;
      T01AG19_A10967Int_ValI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG19_n10967Int_ValI = new boolean[] {false} ;
      T01AG19_A10968Int_ValF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG19_n10968Int_ValF = new boolean[] {false} ;
      T01AG19_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG19_n10969Int_Pk = new boolean[] {false} ;
      T01AG19_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG19_n10970Int_Pm = new boolean[] {false} ;
      T01AG19_A396EmprCod = new String[] {""} ;
      T01AG20_A396EmprCod = new String[] {""} ;
      T01AG20_A252CliCod = new int[1] ;
      T01AG20_A65ArtCod = new String[] {""} ;
      T01AG20_A10972Int_cod = new byte[1] ;
      T01AG20_A11043Int_Un = new String[] {""} ;
      T01AG20_A10966Int_Lin = new short[1] ;
      T01AG3_A252CliCod = new int[1] ;
      T01AG3_A65ArtCod = new String[] {""} ;
      T01AG3_A10972Int_cod = new byte[1] ;
      T01AG3_A11043Int_Un = new String[] {""} ;
      T01AG3_A10966Int_Lin = new short[1] ;
      T01AG3_A10971Int_Tp = new String[] {""} ;
      T01AG3_n10971Int_Tp = new boolean[] {false} ;
      T01AG3_A10967Int_ValI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG3_n10967Int_ValI = new boolean[] {false} ;
      T01AG3_A10968Int_ValF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG3_n10968Int_ValF = new boolean[] {false} ;
      T01AG3_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG3_n10969Int_Pk = new boolean[] {false} ;
      T01AG3_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG3_n10970Int_Pm = new boolean[] {false} ;
      T01AG3_A396EmprCod = new String[] {""} ;
      T01AG2_A252CliCod = new int[1] ;
      T01AG2_A65ArtCod = new String[] {""} ;
      T01AG2_A10972Int_cod = new byte[1] ;
      T01AG2_A11043Int_Un = new String[] {""} ;
      T01AG2_A10966Int_Lin = new short[1] ;
      T01AG2_A10971Int_Tp = new String[] {""} ;
      T01AG2_n10971Int_Tp = new boolean[] {false} ;
      T01AG2_A10967Int_ValI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG2_n10967Int_ValI = new boolean[] {false} ;
      T01AG2_A10968Int_ValF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG2_n10968Int_ValF = new boolean[] {false} ;
      T01AG2_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG2_n10969Int_Pk = new boolean[] {false} ;
      T01AG2_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AG2_n10970Int_Pm = new boolean[] {false} ;
      T01AG2_A396EmprCod = new String[] {""} ;
      T01AG24_A396EmprCod = new String[] {""} ;
      T01AG24_A252CliCod = new int[1] ;
      T01AG24_A65ArtCod = new String[] {""} ;
      T01AG24_A10972Int_cod = new byte[1] ;
      T01AG24_A11043Int_Un = new String[] {""} ;
      T01AG24_A10966Int_Lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10971Int_Tp = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int6 = new byte[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_char14 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T01AG25_A407EmprNom = new String[] {""} ;
      T01AG25_n407EmprNom = new boolean[] {false} ;
      T01AG26_A279CliNom = new String[] {""} ;
      T01AG27_A69ArtDsc = new String[] {""} ;
      T01AG27_n69ArtDsc = new boolean[] {false} ;
      T01AG28_A10973Int_Dsc = new String[] {""} ;
      T01AG28_n10973Int_Dsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ11043Int_Un = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ10973Int_Dsc = "" ;
      ZV32Int_vali = DecimalUtil.ZERO ;
      ZV33Int_valf = DecimalUtil.ZERO ;
      ZV34Int_pk = DecimalUtil.ZERO ;
      ZV35Int_pm = DecimalUtil.ZERO ;
      GXv_char17 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      ZV38Oldpk = DecimalUtil.ZERO ;
      ZV39Oldpm = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tincint__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tincint__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tincint__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tincint__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tincint__default(),
         new Object[] {
             new Object[] {
            T01AG2_A252CliCod, T01AG2_A65ArtCod, T01AG2_A10972Int_cod, T01AG2_A11043Int_Un, T01AG2_A10966Int_Lin, T01AG2_A10971Int_Tp, T01AG2_n10971Int_Tp, T01AG2_A10967Int_ValI, T01AG2_n10967Int_ValI, T01AG2_A10968Int_ValF,
            T01AG2_n10968Int_ValF, T01AG2_A10969Int_Pk, T01AG2_n10969Int_Pk, T01AG2_A10970Int_Pm, T01AG2_n10970Int_Pm, T01AG2_A396EmprCod
            }
            , new Object[] {
            T01AG3_A252CliCod, T01AG3_A65ArtCod, T01AG3_A10972Int_cod, T01AG3_A11043Int_Un, T01AG3_A10966Int_Lin, T01AG3_A10971Int_Tp, T01AG3_n10971Int_Tp, T01AG3_A10967Int_ValI, T01AG3_n10967Int_ValI, T01AG3_A10968Int_ValF,
            T01AG3_n10968Int_ValF, T01AG3_A10969Int_Pk, T01AG3_n10969Int_Pk, T01AG3_A10970Int_Pm, T01AG3_n10970Int_Pm, T01AG3_A396EmprCod
            }
            , new Object[] {
            T01AG4_A11043Int_Un, T01AG4_A10965Int_Ulin, T01AG4_n10965Int_Ulin, T01AG4_A396EmprCod, T01AG4_A252CliCod, T01AG4_A65ArtCod, T01AG4_A10972Int_cod
            }
            , new Object[] {
            T01AG5_A11043Int_Un, T01AG5_A10965Int_Ulin, T01AG5_n10965Int_Ulin, T01AG5_A396EmprCod, T01AG5_A252CliCod, T01AG5_A65ArtCod, T01AG5_A10972Int_cod
            }
            , new Object[] {
            T01AG6_A407EmprNom, T01AG6_n407EmprNom
            }
            , new Object[] {
            T01AG7_A279CliNom
            }
            , new Object[] {
            T01AG8_A69ArtDsc, T01AG8_n69ArtDsc
            }
            , new Object[] {
            T01AG9_A10973Int_Dsc, T01AG9_n10973Int_Dsc
            }
            , new Object[] {
            T01AG10_A10973Int_Dsc, T01AG10_n10973Int_Dsc, T01AG10_A11043Int_Un, T01AG10_A407EmprNom, T01AG10_n407EmprNom, T01AG10_A279CliNom, T01AG10_A69ArtDsc, T01AG10_n69ArtDsc, T01AG10_A10965Int_Ulin, T01AG10_n10965Int_Ulin,
            T01AG10_A396EmprCod, T01AG10_A252CliCod, T01AG10_A65ArtCod, T01AG10_A10972Int_cod
            }
            , new Object[] {
            T01AG11_A396EmprCod, T01AG11_A252CliCod, T01AG11_A65ArtCod, T01AG11_A10972Int_cod, T01AG11_A11043Int_Un
            }
            , new Object[] {
            T01AG12_A11043Int_Un, T01AG12_A396EmprCod, T01AG12_A252CliCod, T01AG12_A65ArtCod, T01AG12_A10972Int_cod
            }
            , new Object[] {
            T01AG13_A11043Int_Un, T01AG13_A396EmprCod, T01AG13_A252CliCod, T01AG13_A65ArtCod, T01AG13_A10972Int_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AG18_A396EmprCod, T01AG18_A252CliCod, T01AG18_A65ArtCod, T01AG18_A10972Int_cod, T01AG18_A11043Int_Un
            }
            , new Object[] {
            T01AG19_A252CliCod, T01AG19_A65ArtCod, T01AG19_A10972Int_cod, T01AG19_A11043Int_Un, T01AG19_A10966Int_Lin, T01AG19_A10971Int_Tp, T01AG19_n10971Int_Tp, T01AG19_A10967Int_ValI, T01AG19_n10967Int_ValI, T01AG19_A10968Int_ValF,
            T01AG19_n10968Int_ValF, T01AG19_A10969Int_Pk, T01AG19_n10969Int_Pk, T01AG19_A10970Int_Pm, T01AG19_n10970Int_Pm, T01AG19_A396EmprCod
            }
            , new Object[] {
            T01AG20_A396EmprCod, T01AG20_A252CliCod, T01AG20_A65ArtCod, T01AG20_A10972Int_cod, T01AG20_A11043Int_Un, T01AG20_A10966Int_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AG24_A396EmprCod, T01AG24_A252CliCod, T01AG24_A65ArtCod, T01AG24_A10972Int_cod, T01AG24_A11043Int_Un, T01AG24_A10966Int_Lin
            }
            , new Object[] {
            T01AG25_A407EmprNom, T01AG25_n407EmprNom
            }
            , new Object[] {
            T01AG26_A279CliNom
            }
            , new Object[] {
            T01AG27_A69ArtDsc, T01AG27_n69ArtDsc
            }
            , new Object[] {
            T01AG28_A10973Int_Dsc, T01AG28_n10973Int_Dsc
            }
         }
      );
      Z11043Int_Un = "" ;
      A11043Int_Un = "" ;
      Z10973Int_Dsc = "" ;
      n10973Int_Dsc = false ;
      A10973Int_Dsc = "" ;
      n10973Int_Dsc = false ;
      Z10972Int_cod = (byte)(0) ;
      A10972Int_cod = (byte)(0) ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV41Pgmname = "TINCINT" ;
      Z10971Int_Tp = "" ;
      n10971Int_Tp = false ;
      E10971Int_Tp = "" ;
      n10971Int_Tp = false ;
      i10971Int_Tp = "" ;
      n10971Int_Tp = false ;
      A10971Int_Tp = "" ;
      n10971Int_Tp = false ;
   }

   private byte wcpOA10972Int_cod ;
   private byte Z10972Int_cod ;
   private byte GxWebError ;
   private byte A10972Int_cod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZZ10972Int_cod ;
   private byte GXv_int12[] ;
   private short Z10965Int_Ulin ;
   private short O10965Int_Ulin ;
   private short Z10966Int_Lin ;
   private short nRcdDeleted_1469 ;
   private short nRcdExists_1469 ;
   private short nIsMod_1469 ;
   private short A10966Int_Lin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10965Int_Ulin ;
   private short nBlankRcdCount1469 ;
   private short RcdFound1469 ;
   private short B10965Int_Ulin ;
   private short nBlankRcdUsr1469 ;
   private short s10965Int_Ulin ;
   private short RcdFound1468 ;
   private short nIsDirty_1468 ;
   private short nIsDirty_1469 ;
   private short i10965Int_Ulin ;
   private short ZZ10965Int_Ulin ;
   private short ZO10965Int_Ulin ;
   private short GXv_int7[] ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtInt_cod_Enabled ;
   private int edtInt_Un_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtInt_Dsc_Enabled ;
   private int edtInt_Ulin_Enabled ;
   private int edtavnRcdDeleted_1469_Enabled ;
   private int edtInt_Lin_Enabled ;
   private int edtInt_ValI_Enabled ;
   private int edtInt_ValF_Enabled ;
   private int edtInt_Pk_Enabled ;
   private int edtInt_Pm_Enabled ;
   private int edtInt_Tp_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtInt_Lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtInt_Ulin_Backcolor ;
   private int edtInt_Dsc_Backcolor ;
   private int edtInt_Un_Backcolor ;
   private int edtInt_cod_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10967Int_ValI ;
   private java.math.BigDecimal Z10968Int_ValF ;
   private java.math.BigDecimal Z10969Int_Pk ;
   private java.math.BigDecimal Z10970Int_Pm ;
   private java.math.BigDecimal O10970Int_Pm ;
   private java.math.BigDecimal O10969Int_Pk ;
   private java.math.BigDecimal AV32Int_vali ;
   private java.math.BigDecimal AV33Int_valf ;
   private java.math.BigDecimal AV34Int_pk ;
   private java.math.BigDecimal AV35Int_pm ;
   private java.math.BigDecimal A10967Int_ValI ;
   private java.math.BigDecimal A10968Int_ValF ;
   private java.math.BigDecimal A10969Int_Pk ;
   private java.math.BigDecimal A10970Int_Pm ;
   private java.math.BigDecimal AV38Oldpk ;
   private java.math.BigDecimal AV39Oldpm ;
   private java.math.BigDecimal T10970Int_Pm ;
   private java.math.BigDecimal T10969Int_Pk ;
   private java.math.BigDecimal ZV32Int_vali ;
   private java.math.BigDecimal ZV33Int_valf ;
   private java.math.BigDecimal ZV34Int_pk ;
   private java.math.BigDecimal ZV35Int_pm ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal ZV38Oldpk ;
   private java.math.BigDecimal ZV39Oldpm ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA10973Int_Dsc ;
   private String wcpOA11043Int_Un ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z11043Int_Un ;
   private String Z10971Int_Tp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A11043Int_Un ;
   private String AV36Msg_err1 ;
   private String A10971Int_Tp ;
   private String A10973Int_Dsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_70_idx="0001" ;
   private String Gx_mode ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtInt_cod_Internalname ;
   private String edtInt_cod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtInt_Un_Internalname ;
   private String edtInt_Un_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtInt_Dsc_Internalname ;
   private String edtInt_Dsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtInt_Ulin_Internalname ;
   private String edtInt_Ulin_Jsonclick ;
   private String sMode1469 ;
   private String edtavnRcdDeleted_1469_Internalname ;
   private String edtInt_Lin_Internalname ;
   private String edtInt_ValI_Internalname ;
   private String edtInt_ValF_Internalname ;
   private String edtInt_Pk_Internalname ;
   private String edtInt_Pm_Internalname ;
   private String edtInt_Tp_Internalname ;
   private String GX_FocusControl ;
   private String subGrid1_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_check_Internalname ;
   private String bttBtn_check_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String bttBtn_help_Internalname ;
   private String bttBtn_help_Jsonclick ;
   private String AV41Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1468 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String GXt_char1 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z10973Int_Dsc ;
   private String E10971Int_Tp ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1469_Jsonclick ;
   private String edtInt_Lin_Jsonclick ;
   private String edtInt_ValI_Jsonclick ;
   private String edtInt_ValF_Jsonclick ;
   private String edtInt_Pk_Jsonclick ;
   private String edtInt_Pm_Jsonclick ;
   private String edtInt_Tp_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10971Int_Tp ;
   private String subGrid1_Header ;
   private String GXv_char14[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ11043Int_Un ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ10973Int_Dsc ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private java.util.Date AV37H_diaA ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10967Int_ValI ;
   private boolean n10968Int_ValF ;
   private boolean n10969Int_Pk ;
   private boolean n10970Int_Pm ;
   private boolean n10971Int_Tp ;
   private boolean n10973Int_Dsc ;
   private boolean wbErr ;
   private boolean n10965Int_Ulin ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01AG6_A407EmprNom ;
   private boolean[] T01AG6_n407EmprNom ;
   private String[] T01AG7_A279CliNom ;
   private String[] T01AG8_A69ArtDsc ;
   private boolean[] T01AG8_n69ArtDsc ;
   private String[] T01AG9_A10973Int_Dsc ;
   private boolean[] T01AG9_n10973Int_Dsc ;
   private String[] T01AG10_A10973Int_Dsc ;
   private boolean[] T01AG10_n10973Int_Dsc ;
   private String[] T01AG10_A11043Int_Un ;
   private String[] T01AG10_A407EmprNom ;
   private boolean[] T01AG10_n407EmprNom ;
   private String[] T01AG10_A279CliNom ;
   private String[] T01AG10_A69ArtDsc ;
   private boolean[] T01AG10_n69ArtDsc ;
   private short[] T01AG10_A10965Int_Ulin ;
   private boolean[] T01AG10_n10965Int_Ulin ;
   private String[] T01AG10_A396EmprCod ;
   private int[] T01AG10_A252CliCod ;
   private String[] T01AG10_A65ArtCod ;
   private byte[] T01AG10_A10972Int_cod ;
   private String[] T01AG11_A396EmprCod ;
   private int[] T01AG11_A252CliCod ;
   private String[] T01AG11_A65ArtCod ;
   private byte[] T01AG11_A10972Int_cod ;
   private String[] T01AG11_A11043Int_Un ;
   private String[] T01AG5_A11043Int_Un ;
   private short[] T01AG5_A10965Int_Ulin ;
   private boolean[] T01AG5_n10965Int_Ulin ;
   private String[] T01AG5_A396EmprCod ;
   private int[] T01AG5_A252CliCod ;
   private String[] T01AG5_A65ArtCod ;
   private byte[] T01AG5_A10972Int_cod ;
   private String[] T01AG12_A11043Int_Un ;
   private String[] T01AG12_A396EmprCod ;
   private int[] T01AG12_A252CliCod ;
   private String[] T01AG12_A65ArtCod ;
   private byte[] T01AG12_A10972Int_cod ;
   private String[] T01AG13_A11043Int_Un ;
   private String[] T01AG13_A396EmprCod ;
   private int[] T01AG13_A252CliCod ;
   private String[] T01AG13_A65ArtCod ;
   private byte[] T01AG13_A10972Int_cod ;
   private String[] T01AG4_A11043Int_Un ;
   private short[] T01AG4_A10965Int_Ulin ;
   private boolean[] T01AG4_n10965Int_Ulin ;
   private String[] T01AG4_A396EmprCod ;
   private int[] T01AG4_A252CliCod ;
   private String[] T01AG4_A65ArtCod ;
   private byte[] T01AG4_A10972Int_cod ;
   private String[] T01AG18_A396EmprCod ;
   private int[] T01AG18_A252CliCod ;
   private String[] T01AG18_A65ArtCod ;
   private byte[] T01AG18_A10972Int_cod ;
   private String[] T01AG18_A11043Int_Un ;
   private int[] T01AG19_A252CliCod ;
   private String[] T01AG19_A65ArtCod ;
   private byte[] T01AG19_A10972Int_cod ;
   private String[] T01AG19_A11043Int_Un ;
   private short[] T01AG19_A10966Int_Lin ;
   private String[] T01AG19_A10971Int_Tp ;
   private boolean[] T01AG19_n10971Int_Tp ;
   private java.math.BigDecimal[] T01AG19_A10967Int_ValI ;
   private boolean[] T01AG19_n10967Int_ValI ;
   private java.math.BigDecimal[] T01AG19_A10968Int_ValF ;
   private boolean[] T01AG19_n10968Int_ValF ;
   private java.math.BigDecimal[] T01AG19_A10969Int_Pk ;
   private boolean[] T01AG19_n10969Int_Pk ;
   private java.math.BigDecimal[] T01AG19_A10970Int_Pm ;
   private boolean[] T01AG19_n10970Int_Pm ;
   private String[] T01AG19_A396EmprCod ;
   private String[] T01AG20_A396EmprCod ;
   private int[] T01AG20_A252CliCod ;
   private String[] T01AG20_A65ArtCod ;
   private byte[] T01AG20_A10972Int_cod ;
   private String[] T01AG20_A11043Int_Un ;
   private short[] T01AG20_A10966Int_Lin ;
   private int[] T01AG3_A252CliCod ;
   private String[] T01AG3_A65ArtCod ;
   private byte[] T01AG3_A10972Int_cod ;
   private String[] T01AG3_A11043Int_Un ;
   private short[] T01AG3_A10966Int_Lin ;
   private String[] T01AG3_A10971Int_Tp ;
   private boolean[] T01AG3_n10971Int_Tp ;
   private java.math.BigDecimal[] T01AG3_A10967Int_ValI ;
   private boolean[] T01AG3_n10967Int_ValI ;
   private java.math.BigDecimal[] T01AG3_A10968Int_ValF ;
   private boolean[] T01AG3_n10968Int_ValF ;
   private java.math.BigDecimal[] T01AG3_A10969Int_Pk ;
   private boolean[] T01AG3_n10969Int_Pk ;
   private java.math.BigDecimal[] T01AG3_A10970Int_Pm ;
   private boolean[] T01AG3_n10970Int_Pm ;
   private String[] T01AG3_A396EmprCod ;
   private int[] T01AG2_A252CliCod ;
   private String[] T01AG2_A65ArtCod ;
   private byte[] T01AG2_A10972Int_cod ;
   private String[] T01AG2_A11043Int_Un ;
   private short[] T01AG2_A10966Int_Lin ;
   private String[] T01AG2_A10971Int_Tp ;
   private boolean[] T01AG2_n10971Int_Tp ;
   private java.math.BigDecimal[] T01AG2_A10967Int_ValI ;
   private boolean[] T01AG2_n10967Int_ValI ;
   private java.math.BigDecimal[] T01AG2_A10968Int_ValF ;
   private boolean[] T01AG2_n10968Int_ValF ;
   private java.math.BigDecimal[] T01AG2_A10969Int_Pk ;
   private boolean[] T01AG2_n10969Int_Pk ;
   private java.math.BigDecimal[] T01AG2_A10970Int_Pm ;
   private boolean[] T01AG2_n10970Int_Pm ;
   private String[] T01AG2_A396EmprCod ;
   private String[] T01AG24_A396EmprCod ;
   private int[] T01AG24_A252CliCod ;
   private String[] T01AG24_A65ArtCod ;
   private byte[] T01AG24_A10972Int_cod ;
   private String[] T01AG24_A11043Int_Un ;
   private short[] T01AG24_A10966Int_Lin ;
   private String[] T01AG25_A407EmprNom ;
   private boolean[] T01AG25_n407EmprNom ;
   private String[] T01AG26_A279CliNom ;
   private String[] T01AG27_A69ArtDsc ;
   private boolean[] T01AG27_n69ArtDsc ;
   private String[] T01AG28_A10973Int_Dsc ;
   private boolean[] T01AG28_n10973Int_Dsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tincint__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincint__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincint__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincint__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AG2", "SELECT CliCod, ArtCod, Int_cod, Int_Un, Int_Lin, Int_Tp, Int_ValI, Int_ValF, Int_Pk, Int_Pm, EmprCod FROM TXPINCIN1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? AND Int_Lin = ?  FOR UPDATE OF Int_Tp, Int_ValI, Int_ValF, Int_Pk, Int_Pm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AG3", "SELECT CliCod, ArtCod, Int_cod, Int_Un, Int_Lin, Int_Tp, Int_ValI, Int_ValF, Int_Pk, Int_Pm, EmprCod FROM TXPINCIN1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? AND Int_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AG4", "SELECT Int_Un, Int_Ulin, EmprCod, CliCod, ArtCod, Int_cod FROM TXPuINCIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ?  FOR UPDATE OF Int_Ulin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG5", "SELECT Int_Un, Int_Ulin, EmprCod, CliCod, ArtCod, Int_cod FROM TXPuINCIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG8", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG9", "SELECT Int_Dsc FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG10", "SELECT /*+ FIRST_ROWS(1) */ T5.Int_Dsc, TM1.Int_Un, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.Int_Ulin, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.Int_cod FROM ((((TXPuINCIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPINCINT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod AND T5.ArtCod = TM1.ArtCod AND T5.Int_cod = TM1.Int_cod) WHERE TM1.Int_Un = ? and TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.Int_cod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.Int_cod, TM1.Int_Un ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Int_cod, Int_Un FROM TXPuINCIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Int_Un, EmprCod, CliCod, ArtCod, Int_cod FROM TXPuINCIN WHERE Int_Un = ? and EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Int_Un, EmprCod, CliCod, ArtCod, Int_cod FROM TXPuINCIN WHERE Int_Un = ? and EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, Int_cod DESC, Int_Un DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AG14", "INSERT INTO TXPuINCIN(Int_Un, Int_Ulin, EmprCod, CliCod, ArtCod, Int_cod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPuINCIN")
         ,new UpdateCursor("T01AG15", "UPDATE TXPuINCIN SET Int_Ulin=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ?", GX_NOMASK, "TXPuINCIN")
         ,new UpdateCursor("T01AG16", "DELETE FROM TXPuINCIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ?", GX_NOMASK, "TXPuINCIN")
         ,new UpdateCursor("T01AG17", "UPDATE TXPuINCIN SET Int_Ulin=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ?", GX_NOMASK, "TXPuINCIN")
         ,new ForEachCursor("T01AG18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, Int_cod, Int_Un FROM TXPuINCIN WHERE Int_Un = ? and EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG19", "SELECT CliCod, ArtCod, Int_cod, Int_Un, Int_Lin, Int_Tp, Int_ValI, Int_ValF, Int_Pk, Int_Pm, EmprCod FROM TXPINCIN1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? and Int_Un = ? and Int_Lin = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AG20", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin FROM TXPINCIN1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? AND Int_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AG21", "INSERT INTO TXPINCIN1(CliCod, ArtCod, Int_cod, Int_Un, Int_Lin, Int_Tp, Int_ValI, Int_ValF, Int_Pk, Int_Pm, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINCIN1")
         ,new UpdateCursor("T01AG22", "UPDATE TXPINCIN1 SET Int_Tp=?, Int_ValI=?, Int_ValF=?, Int_Pk=?, Int_Pm=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? AND Int_Lin = ?", GX_NOMASK, "TXPINCIN1")
         ,new UpdateCursor("T01AG23", "DELETE FROM TXPINCIN1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ? AND Int_Lin = ?", GX_NOMASK, "TXPINCIN1")
         ,new ForEachCursor("T01AG24", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin FROM TXPINCIN1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? and Int_Un = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AG25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG26", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG27", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AG28", "SELECT Int_Dsc FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 5);
               }
               stmt.setString(11, (String)parms[15], 3);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setString(8, (String)parms[12], 16);
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               stmt.setString(10, (String)parms[14], 1);
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

