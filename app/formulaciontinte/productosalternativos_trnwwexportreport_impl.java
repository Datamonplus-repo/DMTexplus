package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productosalternativos_trnwwexportreport_impl extends GXWebReport
{
   public productosalternativos_trnwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV33Title = httpContext.getMessage( "Lista de Productos Alternativos", "") ;
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
         h9E50( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFPrdNum_Sel)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFPrdNum_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFPrdNum)==0) )
         {
            h9E50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFPrdNum, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFPrdNom_Sel)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFPrdNom)==0) )
         {
            h9E50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFPrdNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFPrdAltNum_Sel)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFPrdAltNum_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFPrdAltNum)==0) )
         {
            h9E50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFPrdAltNum, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV39TFPrdAltNom_Sel)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFPrdAltNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFPrdAltNom)==0) )
         {
            h9E50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFPrdAltNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV43TFPrvAltNum) && (0==AV44TFPrvAltNum_To) ) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43TFPrvAltNum), "ZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV47TFPrvAltNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrvAltNum_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFPrvAltNum_To), "ZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFPrvAltNom_Sel)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFPrvAltNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV45TFPrvAltNom)==0) )
         {
            h9E50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFPrvAltNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAltFac)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdAltFac_To)==0) ) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TFPrdAltFac, "Z9.9999")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFPrdAltFac_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Factor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFPrdAltFac_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFPrdAltFac_To, "Z9.9999")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFValDsc_Sel)==0) )
      {
         h9E50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFValDsc_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFValDsc)==0) )
         {
            h9E50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFValDsc, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9E50( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9E50( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 90, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 94, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 218, Gx_line+10, 279, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 283, Gx_line+10, 405, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 409, Gx_line+10, 470, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 474, Gx_line+10, 596, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 600, Gx_line+10, 661, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 665, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV12FilterFullText ;
      AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV17TFPrdNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV18TFPrdNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV19TFPrdNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV20TFPrdNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV43TFPrvAltNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV44TFPrvAltNum_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV45TFPrvAltNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV46TFPrvAltNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV21TFValDsc ;
      AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV22TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV63Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV64Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E52 */
      pr_default.execute(0, new Object[] {AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV63Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV63Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV64Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV64Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09E52_A856ValCod[0] ;
         A857ValDsc = P09E52_A857ValDsc[0] ;
         n857ValDsc = P09E52_n857ValDsc[0] ;
         A678PrdAltFac = P09E52_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E52_A680PrdAltNum[0] ;
         A718PrdNom = P09E52_A718PrdNom[0] ;
         A719PrdNum = P09E52_A719PrdNum[0] ;
         A679PrdAltNom = P09E52_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E52_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E52_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E52_n778PrvAltNum[0] ;
         A396EmprCod = P09E52_A396EmprCod[0] ;
         A856ValCod = P09E52_A856ValCod[0] ;
         A718PrdNom = P09E52_A718PrdNom[0] ;
         A857ValDsc = P09E52_A857ValDsc[0] ;
         n857ValDsc = P09E52_n857ValDsc[0] ;
         A679PrdAltNom = P09E52_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E52_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E52_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E52_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         productosalternativos_trnwwexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         productosalternativos_trnwwexportreport_impl.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwexportreport_impl.this.GXt_char2 = GXv_char5[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  /* Execute user subroutine: 'BEFOREPRINTLINE' */
                  S144 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
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
                  h9E50( false, 36) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 90, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 94, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A680PrdAltNum, "")), 218, Gx_line+10, 279, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A679PrdAltNom, "")), 283, Gx_line+10, 405, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A778PrvAltNum), "ZZZZZ9")), 409, Gx_line+10, 470, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A777PrvAltNom, "")), 474, Gx_line+10, 596, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A678PrdAltFac, "Z9.9999")), 600, Gx_line+10, 661, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A857ValDsc, "")), 665, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_TRNWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV17TFPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV18TFPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV19TFPrdNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV20TFPrdNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV36TFPrdAltNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV37TFPrdAltNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV38TFPrdAltNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV39TFPrdAltNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV43TFPrvAltNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFPrvAltNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV45TFPrvAltNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV46TFPrvAltNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV40TFPrdAltFac = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFPrdAltFac_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV21TFValDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV22TFValDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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

   public void h9E50( boolean bFoot ,
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
               AV31PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV28DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV33Title = AV50Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV33Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFPrdNum_Sel = "" ;
      AV17TFPrdNum = "" ;
      AV20TFPrdNom_Sel = "" ;
      AV19TFPrdNom = "" ;
      AV37TFPrdAltNum_Sel = "" ;
      AV36TFPrdAltNum = "" ;
      AV39TFPrdAltNom_Sel = "" ;
      AV38TFPrdAltNom = "" ;
      AV47TFPrvAltNum_To_Description = "" ;
      AV46TFPrvAltNom_Sel = "" ;
      AV45TFPrvAltNom = "" ;
      AV40TFPrdAltFac = DecimalUtil.ZERO ;
      AV41TFPrdAltFac_To = DecimalUtil.ZERO ;
      AV42TFPrdAltFac_To_Description = "" ;
      AV22TFValDsc_Sel = "" ;
      AV21TFValDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = "" ;
      AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = "" ;
      AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = "" ;
      AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = "" ;
      AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = "" ;
      AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = "" ;
      AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = "" ;
      lV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      lV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      lV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      lV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      lV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      P09E52_A856ValCod = new byte[1] ;
      P09E52_A857ValDsc = new String[] {""} ;
      P09E52_n857ValDsc = new boolean[] {false} ;
      P09E52_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E52_A680PrdAltNum = new String[] {""} ;
      P09E52_A718PrdNom = new String[] {""} ;
      P09E52_A719PrdNum = new String[] {""} ;
      P09E52_A679PrdAltNom = new String[] {""} ;
      P09E52_n679PrdAltNom = new boolean[] {false} ;
      P09E52_A778PrvAltNum = new int[1] ;
      P09E52_n778PrvAltNum = new boolean[] {false} ;
      P09E52_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV31PageInfo = "" ;
      AV28DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV50Pgmdesc = "" ;
      AV26AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trnwwexportreport__default(),
         new Object[] {
             new Object[] {
            P09E52_A856ValCod, P09E52_A857ValDsc, P09E52_n857ValDsc, P09E52_A678PrdAltFac, P09E52_A680PrdAltNum, P09E52_A718PrdNom, P09E52_A719PrdNum, P09E52_A679PrdAltNom, P09E52_n679PrdAltNom, P09E52_A778PrvAltNum,
            P09E52_n778PrvAltNum, P09E52_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Listado Productos Alternativos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Listado Productos Alternativos", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV43TFPrvAltNum ;
   private int AV44TFPrvAltNum_To ;
   private int A778PrvAltNum ;
   private int AV63Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ;
   private int AV64Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ;
   private int GXv_int4[] ;
   private int AV71GXV1 ;
   private java.math.BigDecimal AV40TFPrdAltFac ;
   private java.math.BigDecimal AV41TFPrdAltFac_To ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ;
   private java.math.BigDecimal AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFPrdNum_Sel ;
   private String AV17TFPrdNum ;
   private String AV20TFPrdNom_Sel ;
   private String AV19TFPrdNom ;
   private String AV37TFPrdAltNum_Sel ;
   private String AV36TFPrdAltNum ;
   private String AV39TFPrdAltNom_Sel ;
   private String AV38TFPrdAltNom ;
   private String AV46TFPrvAltNom_Sel ;
   private String AV45TFPrvAltNom ;
   private String AV22TFValDsc_Sel ;
   private String AV21TFValDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String A857ValDsc ;
   private String AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ;
   private String AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ;
   private String AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ;
   private String AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ;
   private String AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ;
   private String AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ;
   private String AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String lV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String lV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String lV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String lV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV50Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n857ValDsc ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private String AV33Title ;
   private String AV12FilterFullText ;
   private String AV47TFPrvAltNum_To_Description ;
   private String AV42TFPrdAltFac_To_Description ;
   private String AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private String lV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private String AV31PageInfo ;
   private String AV28DateInfo ;
   private String AV26AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P09E52_A856ValCod ;
   private String[] P09E52_A857ValDsc ;
   private boolean[] P09E52_n857ValDsc ;
   private java.math.BigDecimal[] P09E52_A678PrdAltFac ;
   private String[] P09E52_A680PrdAltNum ;
   private String[] P09E52_A718PrdNom ;
   private String[] P09E52_A719PrdNum ;
   private String[] P09E52_A679PrdAltNom ;
   private boolean[] P09E52_n679PrdAltNom ;
   private int[] P09E52_A778PrvAltNum ;
   private boolean[] P09E52_n778PrvAltNum ;
   private String[] P09E52_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class productosalternativos_trnwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09E52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV63Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV64Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ValDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ValDsc DESC" ;
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
                  return conditional_P09E52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09E52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
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
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
      }
   }

}

