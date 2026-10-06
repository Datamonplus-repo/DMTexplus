package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productosalternativos_wc1exportreport_impl extends GXWebReport
{
   public productosalternativos_wc1exportreport_impl( com.genexus.internet.HttpContext context )
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
         AV47Title = httpContext.getMessage( "Lista de Productos Alternativos", "") ;
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
         h9TW0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV15FilterFullText)==0) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFPrdNum_Sel)==0) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFPrdNum_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFPrdNum)==0) )
         {
            h9TW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNum, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFPrdNom_Sel)==0) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFPrdNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFPrdNom)==0) )
         {
            h9TW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrdNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFPrdAltNum_Sel)==0) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFPrdAltNum_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFPrdAltNum)==0) )
         {
            h9TW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFPrdAltNum, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFPrdAltNom_Sel)==0) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrdAltNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFPrdAltNom)==0) )
         {
            h9TW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPrdAltNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV28TFPrvAltNum) && (0==AV29TFPrvAltNum_To) ) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFPrvAltNum), "ZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFPrvAltNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrvAltNum_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFPrvAltNum_To), "ZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFPrvAltNom_Sel)==0) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPrvAltNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFPrvAltNom)==0) )
         {
            h9TW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFPrvAltNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPrdAltFac)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFPrdAltFac_To)==0) ) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFPrdAltFac, "Z9.9999")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFPrdAltFac_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Factor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFPrdAltFac_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFPrdAltFac_To, "Z9.9999")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV34TFPrdAltCam_Sel) )
      {
         h9TW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cambiar?", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFPrdAltCam_Sel), "9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9TW0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9TW0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 96, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 100, Gx_line+10, 232, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 236, Gx_line+10, 302, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 306, Gx_line+10, 438, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 442, Gx_line+10, 508, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 512, Gx_line+10, 645, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 649, Gx_line+10, 716, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cambiar?", ""), 720, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV15FilterFullText ;
      AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV20TFPrdNum ;
      AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV21TFPrdNum_Sel ;
      AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV22TFPrdNom ;
      AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV23TFPrdNom_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV24TFPrdAltNum ;
      AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV25TFPrdAltNum_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV26TFPrdAltNom ;
      AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV27TFPrdAltNom_Sel ;
      AV64Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV28TFPrvAltNum ;
      AV65Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV29TFPrvAltNum_To ;
      AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV30TFPrvAltNom ;
      AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV31TFPrvAltNom_Sel ;
      AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV32TFPrdAltFac ;
      AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV33TFPrdAltFac_To ;
      AV70Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV34TFPrdAltCam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV70Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV11Prdnumfrom ,
                                           AV12prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV64Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV65Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09TW2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV64Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV64Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV65Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV65Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV11Prdnumfrom, AV12prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11718PrdAltCam = P09TW2_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09TW2_A678PrdAltFac[0] ;
         A680PrdAltNum = P09TW2_A680PrdAltNum[0] ;
         A718PrdNom = P09TW2_A718PrdNom[0] ;
         A719PrdNum = P09TW2_A719PrdNum[0] ;
         A679PrdAltNom = P09TW2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09TW2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09TW2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09TW2_n778PrvAltNum[0] ;
         A396EmprCod = P09TW2_A396EmprCod[0] ;
         A718PrdNom = P09TW2_A718PrdNom[0] ;
         A679PrdAltNom = P09TW2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09TW2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09TW2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09TW2_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         productosalternativos_wc1exportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         productosalternativos_wc1exportreport_impl.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1exportreport_impl.this.GXt_char2 = GXv_char5[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
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
                  h9TW0( false, 36) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 96, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 100, Gx_line+10, 232, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A680PrdAltNum, "")), 236, Gx_line+10, 302, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A679PrdAltNom, "")), 306, Gx_line+10, 438, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A778PrvAltNum), "ZZZZZ9")), 442, Gx_line+10, 508, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A777PrvAltNom, "")), 512, Gx_line+10, 645, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A678PrdAltFac, "Z9.9999")), 649, Gx_line+10, 716, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11718PrdAltCam), "9")), 720, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV16Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV16Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      AV13OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV14OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV20TFPrdNum = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV21TFPrdNum_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV22TFPrdNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV23TFPrdNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV24TFPrdAltNum = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV25TFPrdAltNum_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV26TFPrdAltNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV27TFPrdAltNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV28TFPrvAltNum = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFPrvAltNum_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV30TFPrvAltNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV31TFPrvAltNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV32TFPrdAltFac = CommonUtil.decimalVal( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFPrdAltFac_To = CommonUtil.decimalVal( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTCAM_SEL") == 0 )
         {
            AV34TFPrdAltCam_Sel = (byte)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV11Prdnumfrom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV12prdnumto = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
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

   public void h9TW0( boolean bFoot ,
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
               AV45PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV42DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV47Title = AV51Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV47Title = "" ;
      AV15FilterFullText = "" ;
      AV21TFPrdNum_Sel = "" ;
      AV20TFPrdNum = "" ;
      AV23TFPrdNom_Sel = "" ;
      AV22TFPrdNom = "" ;
      AV25TFPrdAltNum_Sel = "" ;
      AV24TFPrdAltNum = "" ;
      AV27TFPrdAltNom_Sel = "" ;
      AV26TFPrdAltNom = "" ;
      AV35TFPrvAltNum_To_Description = "" ;
      AV31TFPrvAltNom_Sel = "" ;
      AV30TFPrvAltNom = "" ;
      AV32TFPrdAltFac = DecimalUtil.ZERO ;
      AV33TFPrdAltFac_To = DecimalUtil.ZERO ;
      AV36TFPrdAltFac_To_Description = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = "" ;
      AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = "" ;
      AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = "" ;
      AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = "" ;
      AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = "" ;
      AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = "" ;
      AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      lV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      lV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      lV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      lV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV11Prdnumfrom = "" ;
      AV12prdnumto = "" ;
      AV10Emprcod = "" ;
      A396EmprCod = "" ;
      P09TW2_A11718PrdAltCam = new byte[1] ;
      P09TW2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09TW2_A680PrdAltNum = new String[] {""} ;
      P09TW2_A718PrdNom = new String[] {""} ;
      P09TW2_A719PrdNum = new String[] {""} ;
      P09TW2_A679PrdAltNom = new String[] {""} ;
      P09TW2_n679PrdAltNom = new boolean[] {false} ;
      P09TW2_A778PrvAltNum = new int[1] ;
      P09TW2_n778PrvAltNum = new boolean[] {false} ;
      P09TW2_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      AV16Session = httpContext.getWebSession();
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45PageInfo = "" ;
      AV42DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV51Pgmdesc = "" ;
      AV40AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_wc1exportreport__default(),
         new Object[] {
             new Object[] {
            P09TW2_A11718PrdAltCam, P09TW2_A678PrdAltFac, P09TW2_A680PrdAltNum, P09TW2_A718PrdNom, P09TW2_A719PrdNum, P09TW2_A679PrdAltNom, P09TW2_n679PrdAltNom, P09TW2_A778PrvAltNum, P09TW2_n778PrvAltNum, P09TW2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV51Pgmdesc = httpContext.getMessage( "Listado Productos Alternativos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV51Pgmdesc = httpContext.getMessage( "Listado Productos Alternativos", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV34TFPrdAltCam_Sel ;
   private byte A11718PrdAltCam ;
   private byte AV70Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ;
   private short gxcookieaux ;
   private short AV13OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV28TFPrvAltNum ;
   private int AV29TFPrvAltNum_To ;
   private int A778PrvAltNum ;
   private int AV64Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ;
   private int AV65Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ;
   private int GXv_int4[] ;
   private int AV71GXV1 ;
   private java.math.BigDecimal AV32TFPrdAltFac ;
   private java.math.BigDecimal AV33TFPrdAltFac_To ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ;
   private java.math.BigDecimal AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFPrdNum_Sel ;
   private String AV20TFPrdNum ;
   private String AV23TFPrdNom_Sel ;
   private String AV22TFPrdNom ;
   private String AV25TFPrdAltNum_Sel ;
   private String AV24TFPrdAltNum ;
   private String AV27TFPrdAltNom_Sel ;
   private String AV26TFPrdAltNom ;
   private String AV31TFPrvAltNom_Sel ;
   private String AV30TFPrvAltNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ;
   private String AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ;
   private String AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ;
   private String AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ;
   private String AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ;
   private String AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ;
   private String scmdbuf ;
   private String lV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String lV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String lV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String lV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV11Prdnumfrom ;
   private String AV12prdnumto ;
   private String AV10Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV51Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV14OrderedDsc ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private String AV47Title ;
   private String AV15FilterFullText ;
   private String AV35TFPrvAltNum_To_Description ;
   private String AV36TFPrdAltFac_To_Description ;
   private String AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String lV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String AV45PageInfo ;
   private String AV42DateInfo ;
   private String AV40AppName ;
   private com.genexus.webpanels.WebSession AV16Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P09TW2_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09TW2_A678PrdAltFac ;
   private String[] P09TW2_A680PrdAltNum ;
   private String[] P09TW2_A718PrdNom ;
   private String[] P09TW2_A719PrdNum ;
   private String[] P09TW2_A679PrdAltNom ;
   private boolean[] P09TW2_n679PrdAltNom ;
   private int[] P09TW2_A778PrvAltNum ;
   private boolean[] P09TW2_n778PrvAltNum ;
   private String[] P09TW2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
}

final  class productosalternativos_wc1exportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09TW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV70Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV11Prdnumfrom ,
                                          String AV12prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV55Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV63Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV62Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV64Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV65Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV67Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV66Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV70Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV11Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltCam" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltCam DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09TW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

