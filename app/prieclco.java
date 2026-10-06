package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class prieclco extends GXReport
{
   public prieclco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prieclco.class ), "" );
   }

   public prieclco( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      prieclco.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      prieclco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prieclco.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      prieclco.this.AV10Riesgo = aP2[0];
      this.aP2 = aP2;
      prieclco.this.AV15Kgsalb = aP3[0];
      this.aP3 = aP3;
      prieclco.this.AV17KgsDisp = aP4[0];
      this.aP4 = aP4;
      prieclco.this.AV16KgsHDR = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName(AV13Fichero) ;
         getPrinter().GxSetDocFormat("RTF") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         System.out.println( httpContext.getMessage( "Consulta Riesgo Cliente", "") );
         AV10Riesgo = DecimalUtil.doubleToDec(0) ;
         AV15Kgsalb = DecimalUtil.doubleToDec(0) ;
         AV17KgsDisp = DecimalUtil.doubleToDec(0) ;
         AV16KgsHDR = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P01JF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P01JF2_A252CliCod[0] ;
            n252CliCod = P01JF2_n252CliCod[0] ;
            A300CliRieCir = P01JF2_A300CliRieCir[0] ;
            A279CliNom = P01JF2_A279CliNom[0] ;
            AV10Riesgo = A300CliRieCir ;
            AV14CliNom = A279CliNom ;
            h1JF0( false, 25) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total Facturas pendientes de cobro:", ""), 53, Gx_line+0, 279, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A300CliRieCir, "ZZZZZZZZ9.99")), 342, Gx_line+1, 431, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+25) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P01JF4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A33AlbProEst = P01JF4_A33AlbProEst[0] ;
            A1243GuiRemCli = P01JF4_A1243GuiRemCli[0] ;
            A30AlbProCod = P01JF4_A30AlbProCod[0] ;
            A34AlbProfch = P01JF4_A34AlbProfch[0] ;
            A35AlbProKgs = P01JF4_A35AlbProKgs[0] ;
            n35AlbProKgs = P01JF4_n35AlbProKgs[0] ;
            A35AlbProKgs = P01JF4_A35AlbProKgs[0] ;
            n35AlbProKgs = P01JF4_n35AlbProKgs[0] ;
            GXt_decimal1 = AV12Total ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A30AlbProCod ;
            GXv_decimal4[0] = GXt_decimal1 ;
            new app.ptotalbpr(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_decimal4) ;
            prieclco.this.A396EmprCod = GXv_char2[0] ;
            prieclco.this.A30AlbProCod = GXv_int3[0] ;
            prieclco.this.GXt_decimal1 = GXv_decimal4[0] ;
            AV12Total = GXt_decimal1 ;
            AV10Riesgo = AV10Riesgo.add(AV12Total) ;
            AV15Kgsalb = AV15Kgsalb.add(A35AlbProKgs) ;
            h1JF0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albarán Nro. ", ""), 53, Gx_line+0, 135, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 155, Gx_line+0, 229, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Total, "ZZZZZZZZ9.99")), 342, Gx_line+1, 431, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 244, Gx_line+1, 303, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         h1JF0( false, 5) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+5) ;
         /* Using cursor P01JF5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A252CliCod = P01JF5_A252CliCod[0] ;
            n252CliCod = P01JF5_n252CliCod[0] ;
            A16AlbComEst = P01JF5_A16AlbComEst[0] ;
            A14AlbComCod = P01JF5_A14AlbComCod[0] ;
            A17AlbComFch = P01JF5_A17AlbComFch[0] ;
            GXt_decimal1 = AV12Total ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int5[0] = A14AlbComCod ;
            GXv_decimal4[0] = GXt_decimal1 ;
            new app.ptotalbc(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_decimal4) ;
            prieclco.this.A396EmprCod = GXv_char2[0] ;
            prieclco.this.A14AlbComCod = GXv_int5[0] ;
            prieclco.this.GXt_decimal1 = GXv_decimal4[0] ;
            AV12Total = GXt_decimal1 ;
            AV10Riesgo = AV10Riesgo.add(AV12Total) ;
            h1JF0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albarán Nro. ", ""), 53, Gx_line+0, 135, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 170, Gx_line+0, 229, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Total, "ZZZZZZZZ9.99")), 342, Gx_line+1, 431, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 244, Gx_line+1, 303, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         h1JF0( false, 6) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+6) ;
         /* Using cursor P01JF7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A213BarSit = P01JF7_A213BarSit[0] ;
            A252CliCod = P01JF7_A252CliCod[0] ;
            n252CliCod = P01JF7_n252CliCod[0] ;
            A130BarCodPar = P01JF7_A130BarCodPar[0] ;
            A132BarCodReo = P01JF7_A132BarCodReo[0] ;
            A129BarCod = P01JF7_A129BarCod[0] ;
            A159BarFecGen = P01JF7_A159BarFecGen[0] ;
            A166BarKgm = P01JF7_A166BarKgm[0] ;
            n166BarKgm = P01JF7_n166BarKgm[0] ;
            A166BarKgm = P01JF7_A166BarKgm[0] ;
            n166BarKgm = P01JF7_n166BarKgm[0] ;
            GXt_decimal1 = AV12Total ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char7[0] = A130BarCodPar ;
            GXv_int8[0] = 0 ;
            GXv_char9[0] = httpContext.getMessage( "H", "") ;
            GXv_decimal4[0] = GXt_decimal1 ;
            new app.pprehdr(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_int6, GXv_char7, GXv_int8, GXv_char9, GXv_decimal4) ;
            prieclco.this.A396EmprCod = GXv_char2[0] ;
            prieclco.this.A129BarCod = GXv_int5[0] ;
            prieclco.this.A132BarCodReo = GXv_int6[0] ;
            prieclco.this.A130BarCodPar = GXv_char7[0] ;
            prieclco.this.GXt_decimal1 = GXv_decimal4[0] ;
            AV12Total = GXt_decimal1 ;
            AV10Riesgo = AV10Riesgo.add(AV12Total) ;
            AV16KgsHDR = AV16KgsHDR.add(A166BarKgm) ;
            h1JF0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "H. de Ruta Nro.", ""), 53, Gx_line+0, 149, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 170, Gx_line+0, 229, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Total, "ZZZZZZZZ9.99")), 342, Gx_line+1, 431, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 244, Gx_line+1, 303, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         h1JF0( false, 5) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+5) ;
         /* Using cursor P01JF8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A367DisEst = P01JF8_A367DisEst[0] ;
            A252CliCod = P01JF8_A252CliCod[0] ;
            n252CliCod = P01JF8_n252CliCod[0] ;
            A361DisCod = P01JF8_A361DisCod[0] ;
            A375DisNumUni = P01JF8_A375DisNumUni[0] ;
            A369DisFec = P01JF8_A369DisFec[0] ;
            GXt_decimal1 = AV12Total ;
            GXv_char9[0] = A396EmprCod ;
            GXv_int8[0] = 0 ;
            GXv_int6[0] = (byte)(0) ;
            GXv_char7[0] = " " ;
            GXv_int5[0] = A361DisCod ;
            GXv_char2[0] = httpContext.getMessage( "D", "") ;
            GXv_decimal4[0] = GXt_decimal1 ;
            new app.pprehdr(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int6, GXv_char7, GXv_int5, GXv_char2, GXv_decimal4) ;
            prieclco.this.A396EmprCod = GXv_char9[0] ;
            prieclco.this.A361DisCod = GXv_int5[0] ;
            prieclco.this.GXt_decimal1 = GXv_decimal4[0] ;
            AV12Total = GXt_decimal1 ;
            AV10Riesgo = AV10Riesgo.add(AV12Total) ;
            AV17KgsDisp = AV17KgsDisp.add(A375DisNumUni) ;
            h1JF0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Disposición Nro.", ""), 53, Gx_line+0, 157, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 170, Gx_line+1, 229, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Total, "ZZZZZZZZ9.99")), 342, Gx_line+1, 431, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 244, Gx_line+0, 303, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         h1JF0( false, 28) ;
         getPrinter().GxDrawLine(0, Gx_line+5, 679, Gx_line+5, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10Riesgo, "ZZZZZZZZ9.99")), 342, Gx_line+11, 431, Gx_line+28, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+28) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1JF0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h1JF0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composición del Riesgo Circulante del cliente ", ""), 21, Gx_line+26, 358, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")), 366, Gx_line+26, 417, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 497, Gx_line+2, 556, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 564, Gx_line+2, 623, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 635, Gx_line+2, 680, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+47, 679, Gx_line+47, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14CliNom, "")), 424, Gx_line+26, 644, Gx_line+44, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+59) ;
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

   protected void cleanup( )
   {
      this.aP0[0] = prieclco.this.A396EmprCod;
      this.aP1[0] = prieclco.this.AV8CliCod;
      this.aP2[0] = prieclco.this.AV10Riesgo;
      this.aP3[0] = prieclco.this.AV15Kgsalb;
      this.aP4[0] = prieclco.this.AV17KgsDisp;
      this.aP5[0] = prieclco.this.AV16KgsHDR;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Fichero = "" ;
      scmdbuf = "" ;
      P01JF2_A396EmprCod = new String[] {""} ;
      P01JF2_A252CliCod = new int[1] ;
      P01JF2_n252CliCod = new boolean[] {false} ;
      P01JF2_A300CliRieCir = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JF2_A279CliNom = new String[] {""} ;
      A300CliRieCir = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV14CliNom = "" ;
      P01JF4_A396EmprCod = new String[] {""} ;
      P01JF4_A33AlbProEst = new byte[1] ;
      P01JF4_A1243GuiRemCli = new int[1] ;
      P01JF4_A30AlbProCod = new long[1] ;
      P01JF4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01JF4_A35AlbProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JF4_n35AlbProKgs = new boolean[] {false} ;
      A34AlbProfch = GXutil.nullDate() ;
      A35AlbProKgs = DecimalUtil.ZERO ;
      AV12Total = DecimalUtil.ZERO ;
      GXv_int3 = new long[1] ;
      P01JF5_A396EmprCod = new String[] {""} ;
      P01JF5_A252CliCod = new int[1] ;
      P01JF5_n252CliCod = new boolean[] {false} ;
      P01JF5_A16AlbComEst = new byte[1] ;
      P01JF5_A14AlbComCod = new int[1] ;
      P01JF5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A17AlbComFch = GXutil.nullDate() ;
      P01JF7_A396EmprCod = new String[] {""} ;
      P01JF7_A213BarSit = new byte[1] ;
      P01JF7_A252CliCod = new int[1] ;
      P01JF7_n252CliCod = new boolean[] {false} ;
      P01JF7_A130BarCodPar = new String[] {""} ;
      P01JF7_A132BarCodReo = new byte[1] ;
      P01JF7_A129BarCod = new int[1] ;
      P01JF7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P01JF7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JF7_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      P01JF8_A396EmprCod = new String[] {""} ;
      P01JF8_A367DisEst = new byte[1] ;
      P01JF8_A252CliCod = new int[1] ;
      P01JF8_n252CliCod = new boolean[] {false} ;
      P01JF8_A361DisCod = new int[1] ;
      P01JF8_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JF8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A369DisFec = GXutil.nullDate() ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char9 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prieclco__default(),
         new Object[] {
             new Object[] {
            P01JF2_A396EmprCod, P01JF2_A252CliCod, P01JF2_A300CliRieCir, P01JF2_A279CliNom
            }
            , new Object[] {
            P01JF4_A396EmprCod, P01JF4_A33AlbProEst, P01JF4_A1243GuiRemCli, P01JF4_A30AlbProCod, P01JF4_A34AlbProfch, P01JF4_A35AlbProKgs, P01JF4_n35AlbProKgs
            }
            , new Object[] {
            P01JF5_A396EmprCod, P01JF5_A252CliCod, P01JF5_A16AlbComEst, P01JF5_A14AlbComCod, P01JF5_A17AlbComFch
            }
            , new Object[] {
            P01JF7_A396EmprCod, P01JF7_A213BarSit, P01JF7_A252CliCod, P01JF7_n252CliCod, P01JF7_A130BarCodPar, P01JF7_A132BarCodReo, P01JF7_A129BarCod, P01JF7_A159BarFecGen, P01JF7_A166BarKgm, P01JF7_n166BarKgm
            }
            , new Object[] {
            P01JF8_A396EmprCod, P01JF8_A367DisEst, P01JF8_A252CliCod, P01JF8_A361DisCod, P01JF8_A375DisNumUni, P01JF8_A369DisFec
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      AV13Fichero = httpContext.getMessage( httpContext.getMessage( "RIECLI", ""), "") ;
   }

   private byte A33AlbProEst ;
   private byte A16AlbComEst ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A367DisEst ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private int A1243GuiRemCli ;
   private int A14AlbComCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int GXv_int8[] ;
   private int GXv_int5[] ;
   private long A30AlbProCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV10Riesgo ;
   private java.math.BigDecimal AV15Kgsalb ;
   private java.math.BigDecimal AV17KgsDisp ;
   private java.math.BigDecimal AV16KgsHDR ;
   private java.math.BigDecimal A300CliRieCir ;
   private java.math.BigDecimal A35AlbProKgs ;
   private java.math.BigDecimal AV12Total ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String AV13Fichero ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String AV14CliNom ;
   private String A130BarCodPar ;
   private String GXv_char9[] ;
   private String GXv_char7[] ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A369DisFec ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n35AlbProKgs ;
   private boolean n166BarKgm ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01JF2_A396EmprCod ;
   private int[] P01JF2_A252CliCod ;
   private boolean[] P01JF2_n252CliCod ;
   private java.math.BigDecimal[] P01JF2_A300CliRieCir ;
   private String[] P01JF2_A279CliNom ;
   private String[] P01JF4_A396EmprCod ;
   private byte[] P01JF4_A33AlbProEst ;
   private int[] P01JF4_A1243GuiRemCli ;
   private long[] P01JF4_A30AlbProCod ;
   private java.util.Date[] P01JF4_A34AlbProfch ;
   private java.math.BigDecimal[] P01JF4_A35AlbProKgs ;
   private boolean[] P01JF4_n35AlbProKgs ;
   private String[] P01JF5_A396EmprCod ;
   private int[] P01JF5_A252CliCod ;
   private boolean[] P01JF5_n252CliCod ;
   private byte[] P01JF5_A16AlbComEst ;
   private int[] P01JF5_A14AlbComCod ;
   private java.util.Date[] P01JF5_A17AlbComFch ;
   private String[] P01JF7_A396EmprCod ;
   private byte[] P01JF7_A213BarSit ;
   private int[] P01JF7_A252CliCod ;
   private boolean[] P01JF7_n252CliCod ;
   private String[] P01JF7_A130BarCodPar ;
   private byte[] P01JF7_A132BarCodReo ;
   private int[] P01JF7_A129BarCod ;
   private java.util.Date[] P01JF7_A159BarFecGen ;
   private java.math.BigDecimal[] P01JF7_A166BarKgm ;
   private boolean[] P01JF7_n166BarKgm ;
   private String[] P01JF8_A396EmprCod ;
   private byte[] P01JF8_A367DisEst ;
   private int[] P01JF8_A252CliCod ;
   private boolean[] P01JF8_n252CliCod ;
   private int[] P01JF8_A361DisCod ;
   private java.math.BigDecimal[] P01JF8_A375DisNumUni ;
   private java.util.Date[] P01JF8_A369DisFec ;
}

final  class prieclco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01JF2", "SELECT EmprCod, CliCod, CliRieCir, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01JF4", "SELECT T1.EmprCod, T1.AlbProEst, T1.GuiRemCli, T1.AlbProCod, T1.AlbProfch, COALESCE( T2.AlbProKgs, 0) AS AlbProKgs FROM (TXPCALPRD T1 LEFT JOIN (SELECT SUM(BarAlbKgmE) AS AlbProKgs, EmprCod, AlbProCod FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ? and T1.GuiRemCli = ?) AND (T1.AlbProEst < 2) ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JF5", "SELECT EmprCod, CliCod, AlbComEst, AlbComCod, AlbComFch FROM TXPCALCOM WHERE (EmprCod = ? and CliCod = ?) AND (AlbComEst < 2) ORDER BY EmprCod, CliCod, AlbComEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JF7", "SELECT T1.EmprCod, T1.BarSit, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFecGen, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.BarSit < 9) ORDER BY T1.EmprCod, T1.CliCod, T1.BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JF8", "SELECT EmprCod, DisEst, CliCod, DisCod, DisNumUni, DisFec FROM TXPDISPOS WHERE (EmprCod = ? and CliCod = ?) AND (DisEst < 3) ORDER BY EmprCod, CliCod, DisEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

