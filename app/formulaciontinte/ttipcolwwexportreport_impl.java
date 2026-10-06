package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipcolwwexportreport_impl extends GXWebReport
{
   public ttipcolwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV33Title = httpContext.getMessage( "Lista de Tipo de Colorante", "") ;
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
         h8GZ0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV39FilterFullText)==0) )
      {
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39FilterFullText, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV16TFTipColCod) && (0==AV17TFTipColCod_To) ) )
      {
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TFTipColCod), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV22TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFTipColCod_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFTipColCod_To), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFTipColDsc_Sel)==0) )
      {
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFTipColDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFTipColDsc)==0) )
         {
            h8GZ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFTipColDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV20TFTipColTie) && (0==AV21TFTipColTie_To) ) )
      {
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tiempo Teo.", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFTipColTie), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV23TFTipColTie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tiempo Teo.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFTipColTie_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFTipColTie_To), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV45TFTipArtFam) && (0==AV46TFTipArtFam_To) ) )
      {
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Clase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFTipArtFam), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFTipArtFam_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Clase", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFTipArtFam_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFTipArtFam_To), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFTipDscFam_Sel)==0) )
      {
         h8GZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFTipDscFam_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV47TFTipDscFam)==0) )
         {
            h8GZ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFTipDscFam, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8GZ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8GZ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 30, Gx_line+10, 135, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 139, Gx_line+10, 351, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tiempo Teo.", ""), 355, Gx_line+10, 461, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Clase", ""), 465, Gx_line+10, 571, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 575, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV56Formulaciontinte_ttipcolwwds_1_filterfulltext = AV39FilterFullText ;
      AV57Formulaciontinte_ttipcolwwds_2_tftipcolcod = AV16TFTipColCod ;
      AV58Formulaciontinte_ttipcolwwds_3_tftipcolcod_to = AV17TFTipColCod_To ;
      AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc = AV18TFTipColDsc ;
      AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = AV19TFTipColDsc_Sel ;
      AV61Formulaciontinte_ttipcolwwds_6_tftipcoltie = AV20TFTipColTie ;
      AV62Formulaciontinte_ttipcolwwds_7_tftipcoltie_to = AV21TFTipColTie_To ;
      AV63Formulaciontinte_ttipcolwwds_8_tftipartfam = AV45TFTipArtFam ;
      AV64Formulaciontinte_ttipcolwwds_9_tftipartfam_to = AV46TFTipArtFam_To ;
      AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam = AV47TFTipDscFam ;
      AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = AV48TFTipDscFam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV57Formulaciontinte_ttipcolwwds_2_tftipcolcod) ,
                                           Byte.valueOf(AV58Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) ,
                                           AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                           AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                           Integer.valueOf(AV61Formulaciontinte_ttipcolwwds_6_tftipcoltie) ,
                                           Integer.valueOf(AV62Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) ,
                                           Short.valueOf(AV63Formulaciontinte_ttipcolwwds_8_tftipartfam) ,
                                           Short.valueOf(AV64Formulaciontinte_ttipcolwwds_9_tftipartfam_to) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A4999TipColTie) ,
                                           Short.valueOf(A5723TipArtFam) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV56Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                           A5724TipDscFam ,
                                           AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                           AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc), 30, "%") ;
      /* Using cursor P08GZ2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV57Formulaciontinte_ttipcolwwds_2_tftipcolcod), Byte.valueOf(AV58Formulaciontinte_ttipcolwwds_3_tftipcolcod_to), lV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc, AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel, Integer.valueOf(AV61Formulaciontinte_ttipcolwwds_6_tftipcoltie), Integer.valueOf(AV62Formulaciontinte_ttipcolwwds_7_tftipcoltie_to), Short.valueOf(AV63Formulaciontinte_ttipcolwwds_8_tftipartfam), Short.valueOf(AV64Formulaciontinte_ttipcolwwds_9_tftipartfam_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4999TipColTie = P08GZ2_A4999TipColTie[0] ;
         n4999TipColTie = P08GZ2_n4999TipColTie[0] ;
         A832TipColDsc = P08GZ2_A832TipColDsc[0] ;
         n832TipColDsc = P08GZ2_n832TipColDsc[0] ;
         A831TipColCod = P08GZ2_A831TipColCod[0] ;
         A5723TipArtFam = P08GZ2_A5723TipArtFam[0] ;
         n5723TipArtFam = P08GZ2_n5723TipArtFam[0] ;
         A396EmprCod = P08GZ2_A396EmprCod[0] ;
         GXt_char2 = A5724TipDscFam ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5723TipArtFam ;
         GXv_char5[0] = GXt_char2 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         ttipcolwwexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         ttipcolwwexportreport_impl.this.A5723TipArtFam = GXv_int4[0] ;
         ttipcolwwexportreport_impl.this.GXt_char2 = GXv_char5[0] ;
         A5724TipDscFam = GXt_char2 ;
         if ( (GXutil.strcmp("", AV56Formulaciontinte_ttipcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV56Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4999TipColTie, 6, 0) , GXutil.padr( "%" + AV56Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5723TipArtFam, 4, 0) , GXutil.padr( "%" + AV56Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam)==0) ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) || ( ( GXutil.strcmp(A5724TipDscFam, AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel) == 0 ) ) )
               {
                  /* Execute user subroutine: 'BEFOREPRINTLINE' */
                  S144 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     if (true) return;
                  }
                  h8GZ0( false, 36) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 30, Gx_line+10, 135, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 139, Gx_line+10, 351, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4999TipColTie), "ZZZZZ9")), 355, Gx_line+10, 461, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5723TipArtFam), "ZZZ9")), 465, Gx_line+10, 571, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5724TipDscFam, "")), 575, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+36) ;
                  /* Execute user subroutine: 'AFTERPRINTLINE' */
                  S161 ();
                  if ( returnInSub )
                  {
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
      if ( GXutil.strcmp(AV12Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV39FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV16TFTipColCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFTipColCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV18TFTipColDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV19TFTipColDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLTIE") == 0 )
         {
            AV20TFTipColTie = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTipColTie_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTFAM") == 0 )
         {
            AV45TFTipArtFam = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFTipArtFam_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM") == 0 )
         {
            AV47TFTipDscFam = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM_SEL") == 0 )
         {
            AV48TFTipDscFam_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
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

   public void h8GZ0( boolean bFoot ,
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
               AV30PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV26DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV33Title = AV52Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
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
      AV39FilterFullText = "" ;
      AV22TFTipColCod_To_Description = "" ;
      AV19TFTipColDsc_Sel = "" ;
      AV18TFTipColDsc = "" ;
      AV23TFTipColTie_To_Description = "" ;
      AV49TFTipArtFam_To_Description = "" ;
      AV48TFTipDscFam_Sel = "" ;
      AV47TFTipDscFam = "" ;
      A832TipColDsc = "" ;
      A5724TipDscFam = "" ;
      AV56Formulaciontinte_ttipcolwwds_1_filterfulltext = "" ;
      AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = "" ;
      AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam = "" ;
      AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = "" ;
      scmdbuf = "" ;
      lV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      P08GZ2_A4999TipColTie = new int[1] ;
      P08GZ2_n4999TipColTie = new boolean[] {false} ;
      P08GZ2_A832TipColDsc = new String[] {""} ;
      P08GZ2_n832TipColDsc = new boolean[] {false} ;
      P08GZ2_A831TipColCod = new byte[1] ;
      P08GZ2_A5723TipArtFam = new short[1] ;
      P08GZ2_n5723TipArtFam = new boolean[] {false} ;
      P08GZ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_char5 = new String[1] ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV30PageInfo = "" ;
      AV26DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV52Pgmdesc = "" ;
      AV41AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcolwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08GZ2_A4999TipColTie, P08GZ2_n4999TipColTie, P08GZ2_A832TipColDsc, P08GZ2_n832TipColDsc, P08GZ2_A831TipColCod, P08GZ2_A5723TipArtFam, P08GZ2_n5723TipArtFam, P08GZ2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV52Pgmdesc = httpContext.getMessage( "Listado Tipo Colorante", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV52Pgmdesc = httpContext.getMessage( "Listado Tipo Colorante", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV16TFTipColCod ;
   private byte AV17TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV57Formulaciontinte_ttipcolwwds_2_tftipcolcod ;
   private byte AV58Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ;
   private short gxcookieaux ;
   private short AV45TFTipArtFam ;
   private short AV46TFTipArtFam_To ;
   private short A5723TipArtFam ;
   private short AV63Formulaciontinte_ttipcolwwds_8_tftipartfam ;
   private short AV64Formulaciontinte_ttipcolwwds_9_tftipartfam_to ;
   private short AV10OrderedBy ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV20TFTipColTie ;
   private int AV21TFTipColTie_To ;
   private int A4999TipColTie ;
   private int AV61Formulaciontinte_ttipcolwwds_6_tftipcoltie ;
   private int AV62Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ;
   private int AV67GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFTipColDsc_Sel ;
   private String AV18TFTipColDsc ;
   private String AV48TFTipDscFam_Sel ;
   private String AV47TFTipDscFam ;
   private String A832TipColDsc ;
   private String A5724TipDscFam ;
   private String AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ;
   private String AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam ;
   private String AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ;
   private String scmdbuf ;
   private String lV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV52Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n4999TipColTie ;
   private boolean n832TipColDsc ;
   private boolean n5723TipArtFam ;
   private String AV33Title ;
   private String AV39FilterFullText ;
   private String AV22TFTipColCod_To_Description ;
   private String AV23TFTipColTie_To_Description ;
   private String AV49TFTipArtFam_To_Description ;
   private String AV56Formulaciontinte_ttipcolwwds_1_filterfulltext ;
   private String AV30PageInfo ;
   private String AV26DateInfo ;
   private String AV41AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private int[] P08GZ2_A4999TipColTie ;
   private boolean[] P08GZ2_n4999TipColTie ;
   private String[] P08GZ2_A832TipColDsc ;
   private boolean[] P08GZ2_n832TipColDsc ;
   private byte[] P08GZ2_A831TipColCod ;
   private short[] P08GZ2_A5723TipArtFam ;
   private boolean[] P08GZ2_n5723TipArtFam ;
   private String[] P08GZ2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class ttipcolwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV57Formulaciontinte_ttipcolwwds_2_tftipcolcod ,
                                          byte AV58Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ,
                                          String AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                          String AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                          int AV61Formulaciontinte_ttipcolwwds_6_tftipcoltie ,
                                          int AV62Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ,
                                          short AV63Formulaciontinte_ttipcolwwds_8_tftipartfam ,
                                          short AV64Formulaciontinte_ttipcolwwds_9_tftipartfam_to ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A4999TipColTie ,
                                          short A5723TipArtFam ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV56Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                          String A5724TipDscFam ,
                                          String AV66Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                          String AV65Formulaciontinte_ttipcolwwds_10_tftipdscfam )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT TipColTie, TipColDsc, TipColCod, TipArtFam, EmprCod FROM TXPTIPCOL" ;
      if ( ! (0==AV57Formulaciontinte_ttipcolwwds_2_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_ttipcolwwds_4_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipColDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_ttipcolwwds_6_tftipcoltie) )
      {
         addWhere(sWhereString, "(TipColTie >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) )
      {
         addWhere(sWhereString, "(TipColTie <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_ttipcolwwds_8_tftipartfam) )
      {
         addWhere(sWhereString, "(TipArtFam >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_ttipcolwwds_9_tftipartfam_to) )
      {
         addWhere(sWhereString, "(TipArtFam <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColDsc" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColTie" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColTie DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipArtFam" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipArtFam DESC" ;
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
                  return conditional_P08GZ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               return;
      }
   }

}

