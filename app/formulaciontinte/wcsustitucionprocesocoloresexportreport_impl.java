package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsustitucionprocesocoloresexportreport_impl extends GXWebReport
{
   public wcsustitucionprocesocoloresexportreport_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S151 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV44Title = httpContext.getMessage( "Lista de Mantenimiento de Formulas", "") ;
         /* Execute user subroutine: 'PRINTFILTERS' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTCOLUMNTITLES' */
         S121 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTDATA' */
         S131 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTFOOTER' */
         S171 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8IY0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PRINTFILTERS' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV67FilterFullText)==0) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67FilterFullText, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV16TFCliCod) && (0==AV17TFCliCod_To) ) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TFCliCod), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV32TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFCliCod_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFCliCod_To), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFCliNom_Sel)==0) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFCliNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFCliNom)==0) )
         {
            h8IY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFCliNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV21TFForSer_Sel)==0) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFForSer_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFForSer)==0) )
         {
            h8IY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFForSer, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFForSerDsc_Sel)==0) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFForSerDsc_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFForSerDsc)==0) )
         {
            h8IY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFForSerDsc, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFForColNom_Sel)==0) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFForColNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFForColNom)==0) )
         {
            h8IY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFForColNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV26TFForColNum) && (0==AV27TFForColNum_To) ) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFForColNum), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFForColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFForColNum_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFForColNum_To), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV28TFTipColCod) && (0==AV29TFTipColCod_To) ) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFTipColCod), "Z9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tc", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFTipColCod_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFTipColCod_To), "Z9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFTipColDsc_Sel)==0) )
      {
         h8IY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFTipColDsc_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFTipColDsc)==0) )
         {
            h8IY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFTipColDsc, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8IY0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8IY0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 94, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 218, Gx_line+10, 340, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 344, Gx_line+10, 466, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 470, Gx_line+10, 531, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 535, Gx_line+10, 596, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 600, Gx_line+10, 661, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 665, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV67FilterFullText ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV16TFCliCod ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV17TFCliCod_To ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV18TFCliNom ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV19TFCliNom_Sel ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV20TFForSer ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV21TFForSer_Sel ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV22TFForSerDsc ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV23TFForSerDsc_Sel ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV24TFForColNom ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV25TFForColNom_Sel ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV26TFForColNum ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV27TFForColNum_To ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV28TFTipColCod ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV29TFTipColCod_To ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV30TFTipColDsc ;
      AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV82Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV91Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV92Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV93Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV94Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV51Clicod) ,
                                           Integer.valueOf(AV52Clicod_to) ,
                                           AV53ForColNom ,
                                           AV54ForColNom_to ,
                                           Integer.valueOf(AV55ForColNum) ,
                                           Integer.valueOf(AV56ForColNum_to) ,
                                           AV57ForSer ,
                                           AV58ForSer_to ,
                                           Byte.valueOf(AV59IntCod) ,
                                           Byte.valueOf(AV60IntCod_to) ,
                                           Short.valueOf(AV61MatCod) ,
                                           Short.valueOf(AV62MatCod_to) ,
                                           Byte.valueOf(AV63TipColCod) ,
                                           Byte.valueOf(AV64TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV65ProForCod ,
                                           AV50Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08IY2 */
      pr_default.execute(0, new Object[] {AV50Emprcod, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV82Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV91Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV92Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV93Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV94Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV51Clicod), Integer.valueOf(AV52Clicod_to), AV53ForColNom, AV54ForColNom_to, Integer.valueOf(AV55ForColNum), Integer.valueOf(AV56ForColNum_to), AV57ForSer, AV58ForSer_to, Byte.valueOf(AV59IntCod), Byte.valueOf(AV60IntCod_to), Short.valueOf(AV61MatCod), Short.valueOf(AV62MatCod_to), Byte.valueOf(AV63TipColCod), Byte.valueOf(AV64TipColCod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A626MatCod = P08IY2_A626MatCod[0] ;
         A583IntCod = P08IY2_A583IntCod[0] ;
         A396EmprCod = P08IY2_A396EmprCod[0] ;
         A832TipColDsc = P08IY2_A832TipColDsc[0] ;
         n832TipColDsc = P08IY2_n832TipColDsc[0] ;
         A831TipColCod = P08IY2_A831TipColCod[0] ;
         A483ForColNum = P08IY2_A483ForColNum[0] ;
         A482ForColNom = P08IY2_A482ForColNom[0] ;
         A5742ForSerDsc = P08IY2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08IY2_n5742ForSerDsc[0] ;
         A494ForSer = P08IY2_A494ForSer[0] ;
         A279CliNom = P08IY2_A279CliNom[0] ;
         A252CliCod = P08IY2_A252CliCod[0] ;
         A832TipColDsc = P08IY2_A832TipColDsc[0] ;
         n832TipColDsc = P08IY2_n832TipColDsc[0] ;
         A279CliNom = P08IY2_A279CliNom[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8IY0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 94, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 218, Gx_line+10, 340, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 344, Gx_line+10, 466, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 470, Gx_line+10, 531, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 535, Gx_line+10, 596, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 600, Gx_line+10, 661, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 665, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV12Session.getValue("FormulacionTinte.WCSustitucionProcesoColoresGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSustitucionProcesoColoresGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("FormulacionTinte.WCSustitucionProcesoColoresGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV20TFForSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV21TFForSer_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV22TFForSerDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV23TFForSerDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV24TFForColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV25TFForColNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV26TFForColNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFForColNum_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV28TFTipColCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFTipColCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV30TFTipColDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV31TFTipColDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV50Emprcod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV51Clicod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV52Clicod_to = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV53ForColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV54ForColNom_to = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV55ForColNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV56ForColNum_to = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV57ForSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV58ForSer_to = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD") == 0 )
         {
            AV59IntCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD_TO") == 0 )
         {
            AV60IntCod_to = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MATCOD") == 0 )
         {
            AV61MatCod = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MATCOD_TO") == 0 )
         {
            AV62MatCod_to = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV63TipColCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV64TipColCod_to = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV65ProForCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODDESTINO") == 0 )
         {
            AV66ProForCodDestino = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORDSC") == 0 )
         {
            AV73ProforDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void h8IY0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               AV41PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV37DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            AV44Title = AV76Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
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
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44Title = "" ;
      AV67FilterFullText = "" ;
      AV32TFCliCod_To_Description = "" ;
      AV19TFCliNom_Sel = "" ;
      AV18TFCliNom = "" ;
      AV21TFForSer_Sel = "" ;
      AV20TFForSer = "" ;
      AV23TFForSerDsc_Sel = "" ;
      AV22TFForSerDsc = "" ;
      AV25TFForColNom_Sel = "" ;
      AV24TFForColNom = "" ;
      AV33TFForColNum_To_Description = "" ;
      AV34TFTipColCod_To_Description = "" ;
      AV31TFTipColDsc_Sel = "" ;
      AV30TFTipColDsc = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = "" ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = "" ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = "" ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = "" ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = "" ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = "" ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = "" ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = "" ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = "" ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = "" ;
      AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = "" ;
      lV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = "" ;
      lV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = "" ;
      lV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = "" ;
      lV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = "" ;
      lV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = "" ;
      AV53ForColNom = "" ;
      AV54ForColNom_to = "" ;
      AV57ForSer = "" ;
      AV58ForSer_to = "" ;
      AV65ProForCod = "" ;
      AV50Emprcod = "" ;
      A396EmprCod = "" ;
      P08IY2_A626MatCod = new short[1] ;
      P08IY2_A583IntCod = new byte[1] ;
      P08IY2_A396EmprCod = new String[] {""} ;
      P08IY2_A832TipColDsc = new String[] {""} ;
      P08IY2_n832TipColDsc = new boolean[] {false} ;
      P08IY2_A831TipColCod = new byte[1] ;
      P08IY2_A483ForColNum = new int[1] ;
      P08IY2_A482ForColNom = new String[] {""} ;
      P08IY2_A5742ForSerDsc = new String[] {""} ;
      P08IY2_n5742ForSerDsc = new boolean[] {false} ;
      P08IY2_A494ForSer = new String[] {""} ;
      P08IY2_A279CliNom = new String[] {""} ;
      P08IY2_A252CliCod = new int[1] ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV66ProForCodDestino = "" ;
      AV73ProforDsc = "" ;
      AV41PageInfo = "" ;
      AV37DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV76Pgmdesc = "" ;
      AV69AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsustitucionprocesocoloresexportreport__default(),
         new Object[] {
             new Object[] {
            P08IY2_A626MatCod, P08IY2_A583IntCod, P08IY2_A396EmprCod, P08IY2_A832TipColDsc, P08IY2_n832TipColDsc, P08IY2_A831TipColCod, P08IY2_A483ForColNum, P08IY2_A482ForColNom, P08IY2_A5742ForSerDsc, P08IY2_n5742ForSerDsc,
            P08IY2_A494ForSer, P08IY2_A279CliNom, P08IY2_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV76Pgmdesc = httpContext.getMessage( "WCSustitucion Proceso Colores Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV76Pgmdesc = httpContext.getMessage( "WCSustitucion Proceso Colores Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV28TFTipColCod ;
   private byte AV29TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV93Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ;
   private byte AV94Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ;
   private byte AV59IntCod ;
   private byte AV60IntCod_to ;
   private byte AV63TipColCod ;
   private byte AV64TipColCod_to ;
   private byte A583IntCod ;
   private short gxcookieaux ;
   private short AV61MatCod ;
   private short AV62MatCod_to ;
   private short A626MatCod ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV26TFForColNum ;
   private int AV27TFForColNum_To ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV81Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ;
   private int AV82Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ;
   private int AV91Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ;
   private int AV92Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ;
   private int AV51Clicod ;
   private int AV52Clicod_to ;
   private int AV55ForColNum ;
   private int AV56ForColNum_to ;
   private int AV97GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFCliNom_Sel ;
   private String AV18TFCliNom ;
   private String AV21TFForSer_Sel ;
   private String AV20TFForSer ;
   private String AV23TFForSerDsc_Sel ;
   private String AV22TFForSerDsc ;
   private String AV25TFForColNom_Sel ;
   private String AV24TFForColNom ;
   private String AV31TFTipColDsc_Sel ;
   private String AV30TFTipColDsc ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ;
   private String AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ;
   private String AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ;
   private String AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ;
   private String AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ;
   private String AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ;
   private String AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ;
   private String AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ;
   private String AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ;
   private String AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ;
   private String lV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ;
   private String lV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ;
   private String lV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ;
   private String lV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ;
   private String AV53ForColNom ;
   private String AV54ForColNom_to ;
   private String AV57ForSer ;
   private String AV58ForSer_to ;
   private String AV65ProForCod ;
   private String AV50Emprcod ;
   private String A396EmprCod ;
   private String AV66ProForCodDestino ;
   private String AV73ProforDsc ;
   private String AV76Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private String AV44Title ;
   private String AV67FilterFullText ;
   private String AV32TFCliCod_To_Description ;
   private String AV33TFForColNum_To_Description ;
   private String AV34TFTipColCod_To_Description ;
   private String AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ;
   private String lV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ;
   private String AV41PageInfo ;
   private String AV37DateInfo ;
   private String AV69AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private short[] P08IY2_A626MatCod ;
   private byte[] P08IY2_A583IntCod ;
   private String[] P08IY2_A396EmprCod ;
   private String[] P08IY2_A832TipColDsc ;
   private boolean[] P08IY2_n832TipColDsc ;
   private byte[] P08IY2_A831TipColCod ;
   private int[] P08IY2_A483ForColNum ;
   private String[] P08IY2_A482ForColNom ;
   private String[] P08IY2_A5742ForSerDsc ;
   private boolean[] P08IY2_n5742ForSerDsc ;
   private String[] P08IY2_A494ForSer ;
   private String[] P08IY2_A279CliNom ;
   private int[] P08IY2_A252CliCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class wcsustitucionprocesocoloresexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV81Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV82Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV91Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV92Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV93Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV94Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV51Clicod ,
                                          int AV52Clicod_to ,
                                          String AV53ForColNom ,
                                          String AV54ForColNom_to ,
                                          int AV55ForColNum ,
                                          int AV56ForColNum_to ,
                                          String AV57ForSer ,
                                          String AV58ForSer_to ,
                                          byte AV59IntCod ,
                                          byte AV60IntCod_to ,
                                          short AV61MatCod ,
                                          short AV62MatCod_to ,
                                          byte AV63TipColCod ,
                                          byte AV64TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV65ProForCod ,
                                          String AV50Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MatCod, T1.IntCod, T1.EmprCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV91Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV51Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV55ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV56ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV59IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV60IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV61MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV62MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV63TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV64TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08IY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
      }
   }

}

