package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ppreres extends GXReport
{
   public ppreres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreres.class ), "" );
   }

   public ppreres( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppreres.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      ppreres.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreres.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppreres.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppreres.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppreres.this.AV15DisComLin = aP4[0];
      this.aP4 = aP4;
      ppreres.this.AV16DisComCod = aP5[0];
      this.aP5 = aP5;
      ppreres.this.AV17FonCod = aP6[0];
      this.aP6 = aP6;
      ppreres.this.AV18RepComMtr = aP7[0];
      this.aP7 = aP7;
      ppreres.this.AV19Ok = aP8[0];
      this.aP8 = aP8;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("PRELANZAMIENTO DE RECETA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV44StkPas ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKPAS", ""), GXv_int1) ;
         ppreres.this.AV44StkPas = GXv_int1[0] ;
         GXv_int1[0] = AV45AltTEs ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALTTES", ""), GXv_int1) ;
         ppreres.this.AV45AltTEs = GXv_int1[0] ;
         AV19Ok = httpContext.getMessage( "S", "") ;
         hZX0( false, 29) ;
         getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Lanzamiento de la receta :", ""), 6, Gx_line+7, 175, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 181, Gx_line+7, 240, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 247, Gx_line+7, 255, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 261, Gx_line+7, 275, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16DisComCod, "")), 281, Gx_line+7, 345, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17FonCod, "")), 350, Gx_line+7, 414, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(0, Gx_line+0, 809, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(0, Gx_line+28, 809, Gx_line+28, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+29) ;
         /* Using cursor P00ZX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P00ZX2_A252CliCod[0] ;
            n252CliCod = P00ZX2_n252CliCod[0] ;
            A212BarSer = P00ZX2_A212BarSer[0] ;
            A1798BarDibCli = P00ZX2_A1798BarDibCli[0] ;
            A1799BarDibInt = P00ZX2_A1799BarDibInt[0] ;
            AV24BarSer = A212BarSer ;
            AV22BarDibCli = A1798BarDibCli ;
            AV23BarDibInt = A1799BarDibInt ;
            AV33CliCod = A252CliCod ;
            /* Execute user subroutine: 'TIPMAQ' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV48OkFormu = (byte)(0) ;
            /* Using cursor P00ZX3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV24BarSer, AV22BarDibCli, Integer.valueOf(AV23BarDibInt), AV16DisComCod, AV17FonCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2098MolCod = P00ZX3_A2098MolCod[0] ;
               A2078ColFon = P00ZX3_A2078ColFon[0] ;
               A2074ColCom = P00ZX3_A2074ColCom[0] ;
               A1014DibInt = P00ZX3_A1014DibInt[0] ;
               A1013DibCli = P00ZX3_A1013DibCli[0] ;
               A2141SerEst = P00ZX3_A2141SerEst[0] ;
               A2648MolForEst = P00ZX3_A2648MolForEst[0] ;
               n2648MolForEst = P00ZX3_n2648MolForEst[0] ;
               A2076ColEstMba = P00ZX3_A2076ColEstMba[0] ;
               n2076ColEstMba = P00ZX3_n2076ColEstMba[0] ;
               A2100MolCon = P00ZX3_A2100MolCon[0] ;
               n2100MolCon = P00ZX3_n2100MolCon[0] ;
               A2650MolPesMin = P00ZX3_A2650MolPesMin[0] ;
               n2650MolPesMin = P00ZX3_n2650MolPesMin[0] ;
               A2076ColEstMba = P00ZX3_A2076ColEstMba[0] ;
               n2076ColEstMba = P00ZX3_n2076ColEstMba[0] ;
               if ( GXutil.strcmp(A2648MolForEst, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV26ColEstMba = A2076ColEstMba ;
                  AV27MolCon = A2100MolCon ;
                  AV42MolPesMin = A2650MolPesMin ;
                  AV48OkFormu = (byte)(1) ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26ColEstMba)==0) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27MolCon)==0) )
                     {
                        AV28KilPas = A2650MolPesMin ;
                     }
                     else
                     {
                        AV28KilPas = AV18RepComMtr.multiply(AV27MolCon).divide(AV26ColEstMba, 18, java.math.RoundingMode.DOWN) ;
                        if ( DecimalUtil.compareTo(AV28KilPas, AV42MolPesMin) < 0 )
                        {
                           AV28KilPas = AV42MolPesMin ;
                        }
                     }
                     hZX0( false, 58) ;
                     getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 0, Gx_line+6, 46, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Consumo", ""), 146, Gx_line+6, 206, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Pesada Minima", ""), 365, Gx_line+6, 460, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "M.Base", ""), 0, Gx_line+24, 46, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18RepComMtr, "ZZZZZ9.99")), 66, Gx_line+6, 133, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27MolCon, "ZZZZZ9.99")), 284, Gx_line+6, 351, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42MolPesMin, "ZZZZZ9.99")), 474, Gx_line+6, 541, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Kilos Pasta Base", ""), 146, Gx_line+24, 249, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26ColEstMba, "ZZZZZ9.99")), 66, Gx_line+24, 133, Gx_line+40, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28KilPas, "ZZZZZ9.999")), 284, Gx_line+24, 358, Gx_line+40, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(0, Gx_line+0, 809, Gx_line+0, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(0, Gx_line+44, 809, Gx_line+44, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+58) ;
                  }
                  else
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  /* Using cursor P00ZX4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A2116PrdForCan = P00ZX4_A2116PrdForCan[0] ;
                     n2116PrdForCan = P00ZX4_n2116PrdForCan[0] ;
                     A2144UniEstCod = P00ZX4_A2144UniEstCod[0] ;
                     n2144UniEstCod = P00ZX4_n2144UniEstCod[0] ;
                     A685PrdCanRes = P00ZX4_A685PrdCanRes[0] ;
                     A704PrdExiAlm = P00ZX4_A704PrdExiAlm[0] ;
                     A719PrdNum = P00ZX4_A719PrdNum[0] ;
                     n719PrdNum = P00ZX4_n719PrdNum[0] ;
                     A2535ForPrdLin = P00ZX4_A2535ForPrdLin[0] ;
                     A685PrdCanRes = P00ZX4_A685PrdCanRes[0] ;
                     A704PrdExiAlm = P00ZX4_A704PrdExiAlm[0] ;
                     AV29RecEstCP = AV28KilPas.multiply(A2116PrdForCan) ;
                     if ( GXutil.strcmp(A2144UniEstCod, httpContext.getMessage( "GRS", "")) == 0 )
                     {
                        AV43Stock = A685PrdCanRes.add((AV29RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     }
                     else
                     {
                        AV43Stock = A685PrdCanRes.add(AV29RecEstCP) ;
                     }
                     if ( DecimalUtil.compareTo(AV43Stock, A704PrdExiAlm) > 0 )
                     {
                        hZX0( false, 15) ;
                        getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Stock insuficiente del producto :", ""), 19, Gx_line+0, 228, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 238, Gx_line+0, 314, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29RecEstCP, "ZZZZZ9.999")), 363, Gx_line+0, 437, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 481, Gx_line+0, 520, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                        AV46PrdNum = A719PrdNum ;
                        AV47PrdCnt = AV29RecEstCP ;
                        GXv_char2[0] = A396EmprCod ;
                        GXv_char3[0] = AV46PrdNum ;
                        GXv_decimal4[0] = AV47PrdCnt ;
                        GXv_char5[0] = A2144UniEstCod ;
                        new app.palttes(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_decimal4, GXv_char5) ;
                        ppreres.this.A396EmprCod = GXv_char2[0] ;
                        ppreres.this.AV46PrdNum = GXv_char3[0] ;
                        ppreres.this.AV47PrdCnt = GXv_decimal4[0] ;
                        ppreres.this.A2144UniEstCod = GXv_char5[0] ;
                        if ( ( GXutil.strcmp(AV46PrdNum, A719PrdNum) != 0 ) && ( AV45AltTEs == 1 ) )
                        {
                           hZX0( false, 16) ;
                           getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46PrdNum, "")), 294, Gx_line+0, 370, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47PrdCnt, "ZZZZZZ9.9999")), 388, Gx_line+0, 477, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 481, Gx_line+0, 520, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(httpContext.getMessage( "Se utilizará alternativo :", ""), 119, Gx_line+0, 272, Gx_line+15, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+16) ;
                        }
                        AV19Ok = httpContext.getMessage( "N", "") ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
                  /* Using cursor P00ZX5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A2107PasCod = P00ZX5_A2107PasCod[0] ;
                     n2107PasCod = P00ZX5_n2107PasCod[0] ;
                     A2109PasForCan = P00ZX5_A2109PasForCan[0] ;
                     n2109PasForCan = P00ZX5_n2109PasForCan[0] ;
                     A2657PasTotStk = P00ZX5_A2657PasTotStk[0] ;
                     n2657PasTotStk = P00ZX5_n2657PasTotStk[0] ;
                     A2656PasTotRes = P00ZX5_A2656PasTotRes[0] ;
                     n2656PasTotRes = P00ZX5_n2656PasTotRes[0] ;
                     A2654PasForLin = P00ZX5_A2654PasForLin[0] ;
                     A2657PasTotStk = P00ZX5_A2657PasTotStk[0] ;
                     n2657PasTotStk = P00ZX5_n2657PasTotStk[0] ;
                     A2656PasTotRes = P00ZX5_A2656PasTotRes[0] ;
                     n2656PasTotRes = P00ZX5_n2656PasTotRes[0] ;
                     AV30PasCod = A2107PasCod ;
                     /* Execute user subroutine: 'LPASTA' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(0);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV34MolCod = A2098MolCod ;
                     AV35PasForLin = A2654PasForLin ;
                     AV41RecEstPas = "" ;
                     AV41RecEstPas = GXutil.str( AV28KilPas.multiply(A2109PasForCan), 9, 2) ;
                     if ( ( ( DecimalUtil.compareTo(A2656PasTotRes.add((AV28KilPas.multiply(A2109PasForCan))), A2657PasTotStk) > 0 ) ) && ( AV44StkPas == 1 ) )
                     {
                        AV39Mensaje = httpContext.getMessage( "Stock insuficiente de Pasta ", "") + A2107PasCod + " " + AV41RecEstPas ;
                        AV19Ok = httpContext.getMessage( "N", "") ;
                        hZX0( false, 15) ;
                        getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Stock insuficiente de pasta :", ""), 0, Gx_line+0, 182, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 238, Gx_line+0, 314, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41RecEstPas, "999999.99")), 363, Gx_line+0, 477, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26ColEstMba)==0) )
            {
               if ( AV48OkFormu == 1 )
               {
                  hZX0( false, 15) ;
                  getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "¡¡ No hay metros base !!", ""), 6, Gx_line+0, 162, Gx_line+15, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               else
               {
                  hZX0( false, 16) ;
                  getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "¡¡ No EXISTE FORMULA  !!", ""), 13, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hZX0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'TIPMAQ' Routine */
      returnInSub = false ;
      /* Using cursor P00ZX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV22BarDibCli, Integer.valueOf(AV33CliCod), Integer.valueOf(AV23BarDibInt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1014DibInt = P00ZX6_A1014DibInt[0] ;
         A1013DibCli = P00ZX6_A1013DibCli[0] ;
         A252CliCod = P00ZX6_A252CliCod[0] ;
         n252CliCod = P00ZX6_n252CliCod[0] ;
         A1823DibTipMaq = P00ZX6_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P00ZX6_n1823DibTipMaq[0] ;
         AV31DibTipMaq = A1823DibTipMaq ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LPASTA' Routine */
      returnInSub = false ;
      /* Using cursor P00ZX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV30PasCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2107PasCod = P00ZX7_A2107PasCod[0] ;
         n2107PasCod = P00ZX7_n2107PasCod[0] ;
         A2106PasCanPrd = P00ZX7_A2106PasCanPrd[0] ;
         n2106PasCanPrd = P00ZX7_n2106PasCanPrd[0] ;
         A856ValCod = P00ZX7_A856ValCod[0] ;
         A719PrdNum = P00ZX7_A719PrdNum[0] ;
         n719PrdNum = P00ZX7_n719PrdNum[0] ;
         A856ValCod = P00ZX7_A856ValCod[0] ;
         if ( A856ValCod == 3 )
         {
            AV49Producto = A719PrdNum ;
            AV19Ok = httpContext.getMessage( "N", "") ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void hZX0( boolean bFoot ,
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
      this.aP0[0] = ppreres.this.A396EmprCod;
      this.aP1[0] = ppreres.this.A129BarCod;
      this.aP2[0] = ppreres.this.A132BarCodReo;
      this.aP3[0] = ppreres.this.A130BarCodPar;
      this.aP4[0] = ppreres.this.AV15DisComLin;
      this.aP5[0] = ppreres.this.AV16DisComCod;
      this.aP6[0] = ppreres.this.AV17FonCod;
      this.aP7[0] = ppreres.this.AV18RepComMtr;
      this.aP8[0] = ppreres.this.AV19Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00ZX2_A396EmprCod = new String[] {""} ;
      P00ZX2_A129BarCod = new int[1] ;
      P00ZX2_A132BarCodReo = new byte[1] ;
      P00ZX2_A130BarCodPar = new String[] {""} ;
      P00ZX2_A252CliCod = new int[1] ;
      P00ZX2_n252CliCod = new boolean[] {false} ;
      P00ZX2_A212BarSer = new String[] {""} ;
      P00ZX2_A1798BarDibCli = new String[] {""} ;
      P00ZX2_A1799BarDibInt = new int[1] ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      AV24BarSer = "" ;
      AV22BarDibCli = "" ;
      P00ZX3_A396EmprCod = new String[] {""} ;
      P00ZX3_A252CliCod = new int[1] ;
      P00ZX3_n252CliCod = new boolean[] {false} ;
      P00ZX3_A2098MolCod = new byte[1] ;
      P00ZX3_A2078ColFon = new String[] {""} ;
      P00ZX3_A2074ColCom = new String[] {""} ;
      P00ZX3_A1014DibInt = new int[1] ;
      P00ZX3_A1013DibCli = new String[] {""} ;
      P00ZX3_A2141SerEst = new String[] {""} ;
      P00ZX3_A2648MolForEst = new String[] {""} ;
      P00ZX3_n2648MolForEst = new boolean[] {false} ;
      P00ZX3_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX3_n2076ColEstMba = new boolean[] {false} ;
      P00ZX3_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX3_n2100MolCon = new boolean[] {false} ;
      P00ZX3_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX3_n2650MolPesMin = new boolean[] {false} ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      A2648MolForEst = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A2100MolCon = DecimalUtil.ZERO ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      AV26ColEstMba = DecimalUtil.ZERO ;
      AV27MolCon = DecimalUtil.ZERO ;
      AV42MolPesMin = DecimalUtil.ZERO ;
      AV28KilPas = DecimalUtil.ZERO ;
      P00ZX4_A396EmprCod = new String[] {""} ;
      P00ZX4_A252CliCod = new int[1] ;
      P00ZX4_n252CliCod = new boolean[] {false} ;
      P00ZX4_A2141SerEst = new String[] {""} ;
      P00ZX4_A1013DibCli = new String[] {""} ;
      P00ZX4_A1014DibInt = new int[1] ;
      P00ZX4_A2074ColCom = new String[] {""} ;
      P00ZX4_A2078ColFon = new String[] {""} ;
      P00ZX4_A2098MolCod = new byte[1] ;
      P00ZX4_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX4_n2116PrdForCan = new boolean[] {false} ;
      P00ZX4_A2144UniEstCod = new String[] {""} ;
      P00ZX4_n2144UniEstCod = new boolean[] {false} ;
      P00ZX4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX4_A719PrdNum = new String[] {""} ;
      P00ZX4_n719PrdNum = new boolean[] {false} ;
      P00ZX4_A2535ForPrdLin = new short[1] ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV29RecEstCP = DecimalUtil.ZERO ;
      AV43Stock = DecimalUtil.ZERO ;
      AV46PrdNum = "" ;
      AV47PrdCnt = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_char5 = new String[1] ;
      P00ZX5_A396EmprCod = new String[] {""} ;
      P00ZX5_A252CliCod = new int[1] ;
      P00ZX5_n252CliCod = new boolean[] {false} ;
      P00ZX5_A2141SerEst = new String[] {""} ;
      P00ZX5_A1013DibCli = new String[] {""} ;
      P00ZX5_A1014DibInt = new int[1] ;
      P00ZX5_A2074ColCom = new String[] {""} ;
      P00ZX5_A2078ColFon = new String[] {""} ;
      P00ZX5_A2098MolCod = new byte[1] ;
      P00ZX5_A2107PasCod = new String[] {""} ;
      P00ZX5_n2107PasCod = new boolean[] {false} ;
      P00ZX5_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX5_n2109PasForCan = new boolean[] {false} ;
      P00ZX5_A2657PasTotStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX5_n2657PasTotStk = new boolean[] {false} ;
      P00ZX5_A2656PasTotRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX5_n2656PasTotRes = new boolean[] {false} ;
      P00ZX5_A2654PasForLin = new short[1] ;
      A2107PasCod = "" ;
      A2109PasForCan = DecimalUtil.ZERO ;
      A2657PasTotStk = DecimalUtil.ZERO ;
      A2656PasTotRes = DecimalUtil.ZERO ;
      AV30PasCod = "" ;
      AV41RecEstPas = "" ;
      AV39Mensaje = "" ;
      P00ZX6_A396EmprCod = new String[] {""} ;
      P00ZX6_A1014DibInt = new int[1] ;
      P00ZX6_A1013DibCli = new String[] {""} ;
      P00ZX6_A252CliCod = new int[1] ;
      P00ZX6_n252CliCod = new boolean[] {false} ;
      P00ZX6_A1823DibTipMaq = new String[] {""} ;
      P00ZX6_n1823DibTipMaq = new boolean[] {false} ;
      A1823DibTipMaq = "" ;
      AV31DibTipMaq = "" ;
      P00ZX7_A396EmprCod = new String[] {""} ;
      P00ZX7_A2107PasCod = new String[] {""} ;
      P00ZX7_n2107PasCod = new boolean[] {false} ;
      P00ZX7_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZX7_n2106PasCanPrd = new boolean[] {false} ;
      P00ZX7_A856ValCod = new byte[1] ;
      P00ZX7_A719PrdNum = new String[] {""} ;
      P00ZX7_n719PrdNum = new boolean[] {false} ;
      A2106PasCanPrd = DecimalUtil.ZERO ;
      AV49Producto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreres__default(),
         new Object[] {
             new Object[] {
            P00ZX2_A396EmprCod, P00ZX2_A129BarCod, P00ZX2_A132BarCodReo, P00ZX2_A130BarCodPar, P00ZX2_A252CliCod, P00ZX2_n252CliCod, P00ZX2_A212BarSer, P00ZX2_A1798BarDibCli, P00ZX2_A1799BarDibInt
            }
            , new Object[] {
            P00ZX3_A396EmprCod, P00ZX3_A252CliCod, P00ZX3_A2098MolCod, P00ZX3_A2078ColFon, P00ZX3_A2074ColCom, P00ZX3_A1014DibInt, P00ZX3_A1013DibCli, P00ZX3_A2141SerEst, P00ZX3_A2648MolForEst, P00ZX3_n2648MolForEst,
            P00ZX3_A2076ColEstMba, P00ZX3_n2076ColEstMba, P00ZX3_A2100MolCon, P00ZX3_n2100MolCon, P00ZX3_A2650MolPesMin, P00ZX3_n2650MolPesMin
            }
            , new Object[] {
            P00ZX4_A396EmprCod, P00ZX4_A252CliCod, P00ZX4_A2141SerEst, P00ZX4_A1013DibCli, P00ZX4_A1014DibInt, P00ZX4_A2074ColCom, P00ZX4_A2078ColFon, P00ZX4_A2098MolCod, P00ZX4_A2116PrdForCan, P00ZX4_n2116PrdForCan,
            P00ZX4_A2144UniEstCod, P00ZX4_n2144UniEstCod, P00ZX4_A685PrdCanRes, P00ZX4_A704PrdExiAlm, P00ZX4_A719PrdNum, P00ZX4_n719PrdNum, P00ZX4_A2535ForPrdLin
            }
            , new Object[] {
            P00ZX5_A396EmprCod, P00ZX5_A252CliCod, P00ZX5_A2141SerEst, P00ZX5_A1013DibCli, P00ZX5_A1014DibInt, P00ZX5_A2074ColCom, P00ZX5_A2078ColFon, P00ZX5_A2098MolCod, P00ZX5_A2107PasCod, P00ZX5_n2107PasCod,
            P00ZX5_A2109PasForCan, P00ZX5_n2109PasForCan, P00ZX5_A2657PasTotStk, P00ZX5_n2657PasTotStk, P00ZX5_A2656PasTotRes, P00ZX5_n2656PasTotRes, P00ZX5_A2654PasForLin
            }
            , new Object[] {
            P00ZX6_A396EmprCod, P00ZX6_A1014DibInt, P00ZX6_A1013DibCli, P00ZX6_A252CliCod, P00ZX6_A1823DibTipMaq, P00ZX6_n1823DibTipMaq
            }
            , new Object[] {
            P00ZX7_A396EmprCod, P00ZX7_A2107PasCod, P00ZX7_A2106PasCanPrd, P00ZX7_n2106PasCanPrd, P00ZX7_A856ValCod, P00ZX7_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15DisComLin ;
   private byte AV44StkPas ;
   private byte AV45AltTEs ;
   private byte GXv_int1[] ;
   private byte AV48OkFormu ;
   private byte A2098MolCod ;
   private byte AV34MolCod ;
   private byte A856ValCod ;
   private short A2535ForPrdLin ;
   private short A2654PasForLin ;
   private short AV35PasForLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private int A1799BarDibInt ;
   private int AV23BarDibInt ;
   private int AV33CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV18RepComMtr ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal AV26ColEstMba ;
   private java.math.BigDecimal AV27MolCon ;
   private java.math.BigDecimal AV42MolPesMin ;
   private java.math.BigDecimal AV28KilPas ;
   private java.math.BigDecimal A2116PrdForCan ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV29RecEstCP ;
   private java.math.BigDecimal AV43Stock ;
   private java.math.BigDecimal AV47PrdCnt ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal A2109PasForCan ;
   private java.math.BigDecimal A2657PasTotStk ;
   private java.math.BigDecimal A2656PasTotRes ;
   private java.math.BigDecimal A2106PasCanPrd ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16DisComCod ;
   private String AV17FonCod ;
   private String AV19Ok ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String AV24BarSer ;
   private String AV22BarDibCli ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A2648MolForEst ;
   private String A2144UniEstCod ;
   private String A719PrdNum ;
   private String AV46PrdNum ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String A2107PasCod ;
   private String AV30PasCod ;
   private String AV41RecEstPas ;
   private String AV39Mensaje ;
   private String A1823DibTipMaq ;
   private String AV31DibTipMaq ;
   private String AV49Producto ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n2648MolForEst ;
   private boolean n2076ColEstMba ;
   private boolean n2100MolCon ;
   private boolean n2650MolPesMin ;
   private boolean n2116PrdForCan ;
   private boolean n2144UniEstCod ;
   private boolean n719PrdNum ;
   private boolean n2107PasCod ;
   private boolean n2109PasForCan ;
   private boolean n2657PasTotStk ;
   private boolean n2656PasTotRes ;
   private boolean n1823DibTipMaq ;
   private boolean n2106PasCanPrd ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZX2_A396EmprCod ;
   private int[] P00ZX2_A129BarCod ;
   private byte[] P00ZX2_A132BarCodReo ;
   private String[] P00ZX2_A130BarCodPar ;
   private int[] P00ZX2_A252CliCod ;
   private boolean[] P00ZX2_n252CliCod ;
   private String[] P00ZX2_A212BarSer ;
   private String[] P00ZX2_A1798BarDibCli ;
   private int[] P00ZX2_A1799BarDibInt ;
   private String[] P00ZX3_A396EmprCod ;
   private int[] P00ZX3_A252CliCod ;
   private boolean[] P00ZX3_n252CliCod ;
   private byte[] P00ZX3_A2098MolCod ;
   private String[] P00ZX3_A2078ColFon ;
   private String[] P00ZX3_A2074ColCom ;
   private int[] P00ZX3_A1014DibInt ;
   private String[] P00ZX3_A1013DibCli ;
   private String[] P00ZX3_A2141SerEst ;
   private String[] P00ZX3_A2648MolForEst ;
   private boolean[] P00ZX3_n2648MolForEst ;
   private java.math.BigDecimal[] P00ZX3_A2076ColEstMba ;
   private boolean[] P00ZX3_n2076ColEstMba ;
   private java.math.BigDecimal[] P00ZX3_A2100MolCon ;
   private boolean[] P00ZX3_n2100MolCon ;
   private java.math.BigDecimal[] P00ZX3_A2650MolPesMin ;
   private boolean[] P00ZX3_n2650MolPesMin ;
   private String[] P00ZX4_A396EmprCod ;
   private int[] P00ZX4_A252CliCod ;
   private boolean[] P00ZX4_n252CliCod ;
   private String[] P00ZX4_A2141SerEst ;
   private String[] P00ZX4_A1013DibCli ;
   private int[] P00ZX4_A1014DibInt ;
   private String[] P00ZX4_A2074ColCom ;
   private String[] P00ZX4_A2078ColFon ;
   private byte[] P00ZX4_A2098MolCod ;
   private java.math.BigDecimal[] P00ZX4_A2116PrdForCan ;
   private boolean[] P00ZX4_n2116PrdForCan ;
   private String[] P00ZX4_A2144UniEstCod ;
   private boolean[] P00ZX4_n2144UniEstCod ;
   private java.math.BigDecimal[] P00ZX4_A685PrdCanRes ;
   private java.math.BigDecimal[] P00ZX4_A704PrdExiAlm ;
   private String[] P00ZX4_A719PrdNum ;
   private boolean[] P00ZX4_n719PrdNum ;
   private short[] P00ZX4_A2535ForPrdLin ;
   private String[] P00ZX5_A396EmprCod ;
   private int[] P00ZX5_A252CliCod ;
   private boolean[] P00ZX5_n252CliCod ;
   private String[] P00ZX5_A2141SerEst ;
   private String[] P00ZX5_A1013DibCli ;
   private int[] P00ZX5_A1014DibInt ;
   private String[] P00ZX5_A2074ColCom ;
   private String[] P00ZX5_A2078ColFon ;
   private byte[] P00ZX5_A2098MolCod ;
   private String[] P00ZX5_A2107PasCod ;
   private boolean[] P00ZX5_n2107PasCod ;
   private java.math.BigDecimal[] P00ZX5_A2109PasForCan ;
   private boolean[] P00ZX5_n2109PasForCan ;
   private java.math.BigDecimal[] P00ZX5_A2657PasTotStk ;
   private boolean[] P00ZX5_n2657PasTotStk ;
   private java.math.BigDecimal[] P00ZX5_A2656PasTotRes ;
   private boolean[] P00ZX5_n2656PasTotRes ;
   private short[] P00ZX5_A2654PasForLin ;
   private String[] P00ZX6_A396EmprCod ;
   private int[] P00ZX6_A1014DibInt ;
   private String[] P00ZX6_A1013DibCli ;
   private int[] P00ZX6_A252CliCod ;
   private boolean[] P00ZX6_n252CliCod ;
   private String[] P00ZX6_A1823DibTipMaq ;
   private boolean[] P00ZX6_n1823DibTipMaq ;
   private String[] P00ZX7_A396EmprCod ;
   private String[] P00ZX7_A2107PasCod ;
   private boolean[] P00ZX7_n2107PasCod ;
   private java.math.BigDecimal[] P00ZX7_A2106PasCanPrd ;
   private boolean[] P00ZX7_n2106PasCanPrd ;
   private byte[] P00ZX7_A856ValCod ;
   private String[] P00ZX7_A719PrdNum ;
   private boolean[] P00ZX7_n719PrdNum ;
}

final  class ppreres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZX2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer, BarDibCli, BarDibInt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZX3", "SELECT T1.EmprCod, T1.CliCod, T1.MolCod, T1.ColFon, T1.ColCom, T1.DibInt, T1.DibCli, T1.SerEst, T1.MolForEst, T2.ColEstMba, T1.MolCon, T1.MolPesMin FROM (TXPMFORES T1 INNER JOIN TXPCFORES T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.SerEst = T1.SerEst AND T2.DibCli = T1.DibCli AND T2.DibInt = T1.DibInt AND T2.ColCom = T1.ColCom AND T2.ColFon = T1.ColFon) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZX4", "SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PrdForCan, T1.UniEstCod, T2.PrdCanRes, T2.PrdExiAlm, T1.PrdNum, T1.ForPrdLin FROM (TXPRECPR2 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.ForPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZX5", "SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PasCod, T1.PasForCan, T2.PasTotStk, T2.PasTotRes, T1.PasForLin FROM (TXPPASFOR T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZX6", "SELECT EmprCod, DibInt, DibCli, CliCod, DibTipMaq FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZX7", "SELECT T1.EmprCod, T1.PasCod, T1.PasCanPrd, T2.ValCod, T1.PrdNum FROM (TXPLPASTA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PasCod = ? ORDER BY T1.EmprCod, T1.PasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[14])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

