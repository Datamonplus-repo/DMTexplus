package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class taddfin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV36Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV35Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
         A11349Aur_Reccod = (int)(GXutil.lval( httpContext.GetPar( "Aur_Reccod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
         A11358Aur_CodDef = (short)(GXutil.lval( httpContext.GetPar( "Aur_CodDef"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_1IX1515( A396EmprCod, AV36Pgmname, AV8UsurCod, AV12Station, AV35Inc_obs, A11349Aur_Reccod, A11358Aur_CodDef) ;
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
            A11349Aur_Reccod = (int)(GXutil.lval( httpContext.GetPar( "Aur_Reccod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Modificacion Defecto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAur_CodDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public taddfin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public taddfin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( taddfin_impl.class ));
   }

   public taddfin_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TAdDfIn.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Recepcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_Reccod_Internalname, GXutil.ltrim( localUtil.ntoc( A11349Aur_Reccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_Reccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11349Aur_Reccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11349Aur_Reccod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_Reccod_Jsonclick, 0, "", "", "", "", "", 1, edtAur_Reccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Defecto", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_CodDef_Internalname, GXutil.ltrim( localUtil.ntoc( A11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_CodDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11358Aur_CodDef), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11358Aur_CodDef), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_CodDef_Jsonclick, 0, "", "", "", "", "", 1, edtAur_CodDef_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Defecto", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_DscDef_Internalname, GXutil.rtrim( A11360Aur_DscDef), GXutil.rtrim( localUtil.format( A11360Aur_DscDef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_DscDef_Jsonclick, 0, "", "", "", "", "", 1, edtAur_DscDef_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Unidades por tipo de defecto", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_Und_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11359Aur_Und), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11359Aur_Und), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_Und_Jsonclick, 0, "", "", "", "", "", 1, edtAur_Und_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAdDfIn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAdDfIn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TAdDfIn.htm");
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
      e111IX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11349Aur_Reccod = (int)(localUtil.ctol( httpContext.cgiGet( "Z11349Aur_Reccod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11358Aur_CodDef = (short)(localUtil.ctol( httpContext.cgiGet( "Z11358Aur_CodDef"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11359Aur_Und = (int)(localUtil.ctol( httpContext.cgiGet( "Z11359Aur_Und"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11358Aur_CodDef = (short)(localUtil.ctol( httpContext.cgiGet( "O11358Aur_CodDef"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV34Aur_coddef = (short)(localUtil.ctol( httpContext.cgiGet( "vAUR_CODDEF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11349Aur_Reccod = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_Reccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_CodDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_CodDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_CODDEF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAur_CodDef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11358Aur_CodDef = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
            }
            else
            {
               A11358Aur_CodDef = (short)(localUtil.ctol( httpContext.cgiGet( edtAur_CodDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
            }
            A11360Aur_DscDef = httpContext.cgiGet( edtAur_DscDef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", A11360Aur_DscDef);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_UND");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAur_Und_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11359Aur_Und = 0 ;
               n11359Aur_Und = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11359Aur_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11359Aur_Und), 6, 0));
            }
            else
            {
               A11359Aur_Und = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11359Aur_Und = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11359Aur_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11359Aur_Und), 6, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TAdDfIn");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A11358Aur_CodDef != Z11358Aur_CodDef ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("taddfin:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A11349Aur_Reccod = (int)(GXutil.lval( httpContext.GetPar( "Aur_Reccod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
               A11358Aur_CodDef = (short)(GXutil.lval( httpContext.GetPar( "Aur_CodDef"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
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
                        e111IX2 ();
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
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
                     }
                  }
                  else
                  {
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
            initAll1IX1515( ) ;
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1IX1515( ) ;
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

   public void confirm_1IX0( )
   {
      beforeValidate1IX1515( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IX1515( ) ;
         }
         else
         {
            checkExtendedTable1IX1515( ) ;
            if ( AnyError == 0 )
            {
               zm1IX1515( 6) ;
               zm1IX1515( 7) ;
            }
            closeExtendedTableCursors1IX1515( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IX0( ) ;
      }
   }

   public void resetCaption1IX0( )
   {
   }

   public void e111IX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      taddfin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      taddfin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      taddfin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1266_", ""), (byte)(99), GXv_char2) ;
      taddfin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      taddfin_impl.this.A396EmprCod = GXv_char2[0] ;
      taddfin_impl.this.AV11EmprNom = GXv_char3[0] ;
      taddfin_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1IX1515( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11359Aur_Und = T01IX3_A11359Aur_Und[0] ;
         }
         else
         {
            Z11359Aur_Und = A11359Aur_Und ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z11358Aur_CodDef = A11358Aur_CodDef ;
         Z11359Aur_Und = A11359Aur_Und ;
         Z396EmprCod = A396EmprCod ;
         Z11349Aur_Reccod = A11349Aur_Reccod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TAdDfIn" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01IX4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IX4_A407EmprNom[0] ;
      n407EmprNom = T01IX4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01IX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "AUDITORIA ENTRADAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "AUR_RECCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
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

   public void load1IX1515( )
   {
      /* Using cursor T01IX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1515 = (short)(1) ;
         A407EmprNom = T01IX6_A407EmprNom[0] ;
         n407EmprNom = T01IX6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11359Aur_Und = T01IX6_A11359Aur_Und[0] ;
         n11359Aur_Und = T01IX6_n11359Aur_Und[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11359Aur_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11359Aur_Und), 6, 0));
         zm1IX1515( -5) ;
      }
      pr_default.close(4);
      onLoadActions1IX1515( ) ;
   }

   public void onLoadActions1IX1515( )
   {
      GXt_char1 = A11360Aur_DscDef ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char4) ;
      taddfin_impl.this.GXt_char1 = GXv_char4[0] ;
      A11360Aur_DscDef = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", A11360Aur_DscDef);
      AV34Aur_coddef = O11358Aur_CodDef ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Aur_coddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Aur_coddef), 4, 0));
   }

   public void checkExtendedTable1IX1515( )
   {
      nIsDirty_1515 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1515 = (short)(1) ;
      GXt_char1 = A11360Aur_DscDef ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char4) ;
      taddfin_impl.this.GXt_char1 = GXv_char4[0] ;
      A11360Aur_DscDef = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", A11360Aur_DscDef);
      AV34Aur_coddef = O11358Aur_CodDef ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Aur_coddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Aur_coddef), 4, 0));
   }

   public void closeExtendedTableCursors1IX1515( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1IX1515( )
   {
      /* Using cursor T01IX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1515 = (short)(1) ;
      }
      else
      {
         RcdFound1515 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01IX3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IX3_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
      {
         zm1IX1515( 5) ;
         RcdFound1515 = (short)(1) ;
         A11358Aur_CodDef = T01IX3_A11358Aur_CodDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
         A11359Aur_Und = T01IX3_A11359Aur_Und[0] ;
         n11359Aur_Und = T01IX3_n11359Aur_Und[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11359Aur_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11359Aur_Und), 6, 0));
         O11358Aur_CodDef = A11358Aur_CodDef ;
         httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11349Aur_Reccod = A11349Aur_Reccod ;
         Z11358Aur_CodDef = A11358Aur_CodDef ;
         sMode1515 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1IX1515( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1515 = (short)(0) ;
            initializeNonKey1IX1515( ) ;
         }
         Gx_mode = sMode1515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1515 = (short)(0) ;
         initializeNonKey1IX1515( ) ;
         sMode1515 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IX1515( ) ;
      if ( RcdFound1515 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1515 = (short)(0) ;
      /* Using cursor T01IX8 */
      pr_default.execute(6, new Object[] {Short.valueOf(A11358Aur_CodDef), A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01IX8_A11358Aur_CodDef[0] < A11358Aur_CodDef ) ) && ( GXutil.strcmp(T01IX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IX8_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01IX8_A11358Aur_CodDef[0] > A11358Aur_CodDef ) ) && ( GXutil.strcmp(T01IX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IX8_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            A11358Aur_CodDef = T01IX8_A11358Aur_CodDef[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
            RcdFound1515 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1515 = (short)(0) ;
      /* Using cursor T01IX9 */
      pr_default.execute(7, new Object[] {Short.valueOf(A11358Aur_CodDef), A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01IX9_A11358Aur_CodDef[0] > A11358Aur_CodDef ) ) && ( GXutil.strcmp(T01IX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IX9_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01IX9_A11358Aur_CodDef[0] < A11358Aur_CodDef ) ) && ( GXutil.strcmp(T01IX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IX9_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            A11358Aur_CodDef = T01IX9_A11358Aur_CodDef[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
            RcdFound1515 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IX1515( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAur_CodDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IX1515( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1515 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) || ( A11358Aur_CodDef != Z11358Aur_CodDef ) )
            {
               A11358Aur_CodDef = Z11358Aur_CodDef ;
               httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAur_CodDef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1IX1515( ) ;
               GX_FocusControl = edtAur_CodDef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) || ( A11358Aur_CodDef != Z11358Aur_CodDef ) )
            {
               /* Insert record */
               GX_FocusControl = edtAur_CodDef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IX1515( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtAur_CodDef_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1IX1515( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) || ( A11358Aur_CodDef != Z11358Aur_CodDef ) )
      {
         A11358Aur_CodDef = Z11358Aur_CodDef ;
         httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAur_CodDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
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
      getKey1IX1515( ) ;
      if ( RcdFound1515 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) || ( A11358Aur_CodDef != Z11358Aur_CodDef ) )
         {
            A11358Aur_CodDef = Z11358Aur_CodDef ;
            httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) || ( A11358Aur_CodDef != Z11358Aur_CodDef ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "taddfin");
      GX_FocusControl = edtAur_Und_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IX0( ) ;
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
      if ( RcdFound1515 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAur_Und_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IX1515( ) ;
      if ( RcdFound1515 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      GX_FocusControl = edtAur_Und_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IX1515( ) ;
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
      if ( RcdFound1515 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      GX_FocusControl = edtAur_Und_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      if ( RcdFound1515 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      GX_FocusControl = edtAur_Und_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IX1515( ) ;
      if ( RcdFound1515 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1515 != 0 )
         {
            scanNext1IX1515( ) ;
         }
      }
      GX_FocusControl = edtAur_Und_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IX1515( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IX1515( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAUDRE1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z11359Aur_Und != T01IX2_A11359Aur_Und[0] ) )
         {
            if ( Z11359Aur_Und != T01IX2_A11359Aur_Und[0] )
            {
               GXutil.writeLogln("taddfin:[seudo value changed for attri]"+"Aur_Und");
               GXutil.writeLogRaw("Old: ",Z11359Aur_Und);
               GXutil.writeLogRaw("Current: ",T01IX2_A11359Aur_Und[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAUDRE1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IX1515( )
   {
      beforeValidate1IX1515( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IX1515( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IX1515( 0) ;
         checkOptimisticConcurrency1IX1515( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IX1515( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IX1515( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IX10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A11358Aur_CodDef), Boolean.valueOf(n11359Aur_Und), Integer.valueOf(A11359Aur_Und), A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDRE1");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1IX0( ) ;
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
            load1IX1515( ) ;
         }
         endLevel1IX1515( ) ;
      }
      closeExtendedTableCursors1IX1515( ) ;
   }

   public void update1IX1515( )
   {
      beforeValidate1IX1515( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IX1515( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IX1515( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IX1515( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IX1515( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IX11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n11359Aur_Und), Integer.valueOf(A11359Aur_Und), A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDRE1");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAUDRE1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IX1515( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( A11358Aur_CodDef != O11358Aur_CodDef ) && true /* After */ )
                     {
                        AV35Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modificacion Defecto. Defecto actual ", ""), "") + GXutil.str( AV34Aur_coddef, 4, 0) + httpContext.getMessage( httpContext.getMessage( " pasa a ", ""), "") + GXutil.str( A11358Aur_CodDef, 4, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
                     }
                     if ( ( A11358Aur_CodDef != O11358Aur_CodDef ) && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV8UsurCod, AV12Station, AV35Inc_obs, A11349Aur_Reccod, (byte)(0), " ") ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IX0( ) ;
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
         endLevel1IX1515( ) ;
      }
      closeExtendedTableCursors1IX1515( ) ;
   }

   public void deferredUpdate1IX1515( )
   {
   }

   public void delete( )
   {
      beforeValidate1IX1515( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IX1515( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IX1515( ) ;
         afterConfirm1IX1515( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IX1515( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IX12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDRE1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1515 == 0 )
                     {
                        initAll1IX1515( ) ;
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption1IX0( ) ;
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
      sMode1515 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IX1515( ) ;
      Gx_mode = sMode1515 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IX1515( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11360Aur_DscDef ;
         GXv_char4[0] = GXt_char1 ;
         new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char4) ;
         taddfin_impl.this.GXt_char1 = GXv_char4[0] ;
         A11360Aur_DscDef = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", A11360Aur_DscDef);
         AV34Aur_coddef = O11358Aur_CodDef ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Aur_coddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Aur_coddef), 4, 0));
      }
   }

   public void endLevel1IX1515( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IX1515( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "taddfin");
         if ( AnyError == 0 )
         {
            confirmValues1IX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "taddfin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IX1515( )
   {
      /* Scan By routine */
      /* Using cursor T01IX13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      RcdFound1515 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1515 = (short)(1) ;
         A11358Aur_CodDef = T01IX13_A11358Aur_CodDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IX1515( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1515 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1515 = (short)(1) ;
         A11358Aur_CodDef = T01IX13_A11358Aur_CodDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
      }
   }

   public void scanEnd1IX1515( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1IX1515( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IX1515( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IX1515( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IX1515( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IX1515( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IX1515( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IX1515( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAur_Reccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Reccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Reccod_Enabled), 5, 0), true);
      edtAur_CodDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_CodDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_CodDef_Enabled), 5, 0), true);
      edtAur_DscDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_DscDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_DscDef_Enabled), 5, 0), true);
      edtAur_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Und_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IX1515( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IX0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.taddfin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11349Aur_Reccod,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","Aur_Reccod","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TAdDfIn");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("taddfin:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11349Aur_Reccod", GXutil.ltrim( localUtil.ntoc( Z11349Aur_Reccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11358Aur_CodDef", GXutil.ltrim( localUtil.ntoc( Z11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11359Aur_Und", GXutil.ltrim( localUtil.ntoc( Z11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11358Aur_CodDef", GXutil.ltrim( localUtil.ntoc( O11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUR_CODDEF", GXutil.ltrim( localUtil.ntoc( AV34Aur_coddef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV35Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.taddfin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11349Aur_Reccod,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","Aur_Reccod","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TAdDfIn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modificacion Defecto", "") ;
   }

   public void initializeNonKey1IX1515( )
   {
      AV34Aur_coddef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Aur_coddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Aur_coddef), 4, 0));
      A11360Aur_DscDef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", A11360Aur_DscDef);
      A11359Aur_Und = 0 ;
      n11359Aur_Und = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11359Aur_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11359Aur_Und), 6, 0));
      AV35Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
      Z11359Aur_Und = 0 ;
   }

   public void initAll1IX1515( )
   {
      A11358Aur_CodDef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11358Aur_CodDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11358Aur_CodDef), 4, 0));
      initializeNonKey1IX1515( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241582080", true, true);
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
      httpContext.AddJavascriptSource("taddfin.js", "?20268241582081", false, true);
      /* End function include_jscripts */
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
      edtAur_Reccod_Internalname = "AUR_RECCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAur_CodDef_Internalname = "AUR_CODDEF" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAur_DscDef_Internalname = "AUR_DSCDEF" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAur_Und_Internalname = "AUR_UND" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Modificacion Defecto", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAur_Und_Jsonclick = "" ;
      edtAur_Und_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Und_Enabled = 1 ;
      edtAur_DscDef_Jsonclick = "" ;
      edtAur_DscDef_Backcolor = (int)(0xFFFFFF) ;
      edtAur_DscDef_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAur_CodDef_Jsonclick = "" ;
      edtAur_CodDef_Backcolor = (int)(0xFFFFFF) ;
      edtAur_CodDef_Enabled = 1 ;
      edtAur_Reccod_Jsonclick = "" ;
      edtAur_Reccod_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Reccod_Enabled = 0 ;
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

   public void xc_4_1IX1515( String A396EmprCod ,
                             String AV36Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV35Inc_obs ,
                             int A11349Aur_Reccod ,
                             short A11358Aur_CodDef )
   {
      if ( ( A11358Aur_CodDef != O11358Aur_CodDef ) && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV8UsurCod, AV12Station, AV35Inc_obs, A11349Aur_Reccod, (byte)(0), " ") ;
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

   public void init_web_controls( )
   {
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

   public void valid_Aur_coddef( )
   {
      GXt_char1 = A11360Aur_DscDef ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char4) ;
      taddfin_impl.this.GXt_char1 = GXv_char4[0] ;
      A11360Aur_DscDef = GXt_char1 ;
      AV34Aur_coddef = O11358Aur_CodDef ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", GXutil.rtrim( A11360Aur_DscDef));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Aur_coddef", GXutil.ltrim( localUtil.ntoc( AV34Aur_coddef, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11349Aur_Reccod',fld:'AUR_RECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_AUR_RECCOD","{handler:'valid_Aur_reccod',iparms:[]");
      setEventMetadata("VALID_AUR_RECCOD",",oparms:[]}");
      setEventMetadata("VALID_AUR_CODDEF","{handler:'valid_Aur_coddef',iparms:[{av:'O11358Aur_CodDef'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11358Aur_CodDef',fld:'AUR_CODDEF',pic:'ZZZ9'},{av:'A11360Aur_DscDef',fld:'AUR_DSCDEF',pic:''},{av:'AV34Aur_coddef',fld:'vAUR_CODDEF',pic:'ZZZ9'}]");
      setEventMetadata("VALID_AUR_CODDEF",",oparms:[{av:'A11360Aur_DscDef',fld:'AUR_DSCDEF',pic:''},{av:'AV34Aur_coddef',fld:'vAUR_CODDEF',pic:'ZZZ9'}]}");
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
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV35Inc_obs = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A11360Aur_DscDef = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T01IX4_A407EmprNom = new String[] {""} ;
      T01IX4_n407EmprNom = new boolean[] {false} ;
      T01IX5_A396EmprCod = new String[] {""} ;
      T01IX6_A11358Aur_CodDef = new short[1] ;
      T01IX6_A407EmprNom = new String[] {""} ;
      T01IX6_n407EmprNom = new boolean[] {false} ;
      T01IX6_A11359Aur_Und = new int[1] ;
      T01IX6_n11359Aur_Und = new boolean[] {false} ;
      T01IX6_A396EmprCod = new String[] {""} ;
      T01IX6_A11349Aur_Reccod = new int[1] ;
      T01IX7_A396EmprCod = new String[] {""} ;
      T01IX7_A11349Aur_Reccod = new int[1] ;
      T01IX7_A11358Aur_CodDef = new short[1] ;
      T01IX3_A11358Aur_CodDef = new short[1] ;
      T01IX3_A11359Aur_Und = new int[1] ;
      T01IX3_n11359Aur_Und = new boolean[] {false} ;
      T01IX3_A396EmprCod = new String[] {""} ;
      T01IX3_A11349Aur_Reccod = new int[1] ;
      sMode1515 = "" ;
      T01IX8_A396EmprCod = new String[] {""} ;
      T01IX8_A11349Aur_Reccod = new int[1] ;
      T01IX8_A11358Aur_CodDef = new short[1] ;
      T01IX9_A396EmprCod = new String[] {""} ;
      T01IX9_A11349Aur_Reccod = new int[1] ;
      T01IX9_A11358Aur_CodDef = new short[1] ;
      T01IX2_A11358Aur_CodDef = new short[1] ;
      T01IX2_A11359Aur_Und = new int[1] ;
      T01IX2_n11359Aur_Und = new boolean[] {false} ;
      T01IX2_A396EmprCod = new String[] {""} ;
      T01IX2_A11349Aur_Reccod = new int[1] ;
      T01IX13_A396EmprCod = new String[] {""} ;
      T01IX13_A11349Aur_Reccod = new int[1] ;
      T01IX13_A11358Aur_CodDef = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z11360Aur_DscDef = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.taddfin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.taddfin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.taddfin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.taddfin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.taddfin__default(),
         new Object[] {
             new Object[] {
            T01IX2_A11358Aur_CodDef, T01IX2_A11359Aur_Und, T01IX2_n11359Aur_Und, T01IX2_A396EmprCod, T01IX2_A11349Aur_Reccod
            }
            , new Object[] {
            T01IX3_A11358Aur_CodDef, T01IX3_A11359Aur_Und, T01IX3_n11359Aur_Und, T01IX3_A396EmprCod, T01IX3_A11349Aur_Reccod
            }
            , new Object[] {
            T01IX4_A407EmprNom, T01IX4_n407EmprNom
            }
            , new Object[] {
            T01IX5_A396EmprCod
            }
            , new Object[] {
            T01IX6_A11358Aur_CodDef, T01IX6_A407EmprNom, T01IX6_n407EmprNom, T01IX6_A11359Aur_Und, T01IX6_n11359Aur_Und, T01IX6_A396EmprCod, T01IX6_A11349Aur_Reccod
            }
            , new Object[] {
            T01IX7_A396EmprCod, T01IX7_A11349Aur_Reccod, T01IX7_A11358Aur_CodDef
            }
            , new Object[] {
            T01IX8_A396EmprCod, T01IX8_A11349Aur_Reccod, T01IX8_A11358Aur_CodDef
            }
            , new Object[] {
            T01IX9_A396EmprCod, T01IX9_A11349Aur_Reccod, T01IX9_A11358Aur_CodDef
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IX13_A396EmprCod, T01IX13_A11349Aur_Reccod, T01IX13_A11358Aur_CodDef
            }
         }
      );
      Z11349Aur_Reccod = 0 ;
      A11349Aur_Reccod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TAdDfIn" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z11358Aur_CodDef ;
   private short O11358Aur_CodDef ;
   private short A11358Aur_CodDef ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV34Aur_coddef ;
   private short RcdFound1515 ;
   private short nIsDirty_1515 ;
   private short ZV34Aur_coddef ;
   private int wcpOA11349Aur_Reccod ;
   private int Z11349Aur_Reccod ;
   private int Z11359Aur_Und ;
   private int A11349Aur_Reccod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAur_Reccod_Enabled ;
   private int edtAur_CodDef_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAur_DscDef_Enabled ;
   private int A11359Aur_Und ;
   private int edtAur_Und_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtAur_Und_Backcolor ;
   private int edtAur_DscDef_Backcolor ;
   private int edtAur_CodDef_Backcolor ;
   private int edtAur_Reccod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV36Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAur_CodDef_Internalname ;
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
   private String edtAur_Reccod_Internalname ;
   private String edtAur_Reccod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAur_CodDef_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAur_DscDef_Internalname ;
   private String A11360Aur_DscDef ;
   private String edtAur_DscDef_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAur_Und_Internalname ;
   private String edtAur_Und_Jsonclick ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sMode1515 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z11360Aur_DscDef ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n11359Aur_Und ;
   private boolean returnInSub ;
   private String AV35Inc_obs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01IX4_A407EmprNom ;
   private boolean[] T01IX4_n407EmprNom ;
   private String[] T01IX5_A396EmprCod ;
   private short[] T01IX6_A11358Aur_CodDef ;
   private String[] T01IX6_A407EmprNom ;
   private boolean[] T01IX6_n407EmprNom ;
   private int[] T01IX6_A11359Aur_Und ;
   private boolean[] T01IX6_n11359Aur_Und ;
   private String[] T01IX6_A396EmprCod ;
   private int[] T01IX6_A11349Aur_Reccod ;
   private String[] T01IX7_A396EmprCod ;
   private int[] T01IX7_A11349Aur_Reccod ;
   private short[] T01IX7_A11358Aur_CodDef ;
   private short[] T01IX3_A11358Aur_CodDef ;
   private int[] T01IX3_A11359Aur_Und ;
   private boolean[] T01IX3_n11359Aur_Und ;
   private String[] T01IX3_A396EmprCod ;
   private int[] T01IX3_A11349Aur_Reccod ;
   private String[] T01IX8_A396EmprCod ;
   private int[] T01IX8_A11349Aur_Reccod ;
   private short[] T01IX8_A11358Aur_CodDef ;
   private String[] T01IX9_A396EmprCod ;
   private int[] T01IX9_A11349Aur_Reccod ;
   private short[] T01IX9_A11358Aur_CodDef ;
   private short[] T01IX2_A11358Aur_CodDef ;
   private int[] T01IX2_A11359Aur_Und ;
   private boolean[] T01IX2_n11359Aur_Und ;
   private String[] T01IX2_A396EmprCod ;
   private int[] T01IX2_A11349Aur_Reccod ;
   private String[] T01IX13_A396EmprCod ;
   private int[] T01IX13_A11349Aur_Reccod ;
   private short[] T01IX13_A11358Aur_CodDef ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class taddfin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taddfin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taddfin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taddfin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taddfin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IX2", "SELECT Aur_CodDef, Aur_Und, EmprCod, Aur_Reccod FROM TXPAUDRE1 WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ?  FOR UPDATE OF Aur_Und NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IX3", "SELECT Aur_CodDef, Aur_Und, EmprCod, Aur_Reccod FROM TXPAUDRE1 WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IX4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IX5", "SELECT EmprCod FROM TXPAUDREP WHERE EmprCod = ? AND Aur_Reccod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IX6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Aur_CodDef, T2.EmprNom, TM1.Aur_Und, TM1.EmprCod, TM1.Aur_Reccod FROM (TXPAUDRE1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Aur_Reccod = ? and TM1.Aur_CodDef = ? ORDER BY TM1.EmprCod, TM1.Aur_Reccod, TM1.Aur_CodDef ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IX7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IX8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE ( Aur_CodDef > ?) and EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod, Aur_Reccod, Aur_CodDef) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IX9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE ( Aur_CodDef < ?) and EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod DESC, Aur_Reccod DESC, Aur_CodDef DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IX10", "INSERT INTO TXPAUDRE1(Aur_CodDef, Aur_Und, EmprCod, Aur_Reccod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPAUDRE1")
         ,new UpdateCursor("T01IX11", "UPDATE TXPAUDRE1 SET Aur_Und=?  WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ?", GX_NOMASK, "TXPAUDRE1")
         ,new UpdateCursor("T01IX12", "DELETE FROM TXPAUDRE1  WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ?", GX_NOMASK, "TXPAUDRE1")
         ,new ForEachCursor("T01IX13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod, Aur_Reccod, Aur_CodDef ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

