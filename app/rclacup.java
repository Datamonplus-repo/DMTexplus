package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rclacup extends GXReport
{
   public rclacup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rclacup.class ), "" );
   }

   public rclacup( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      rclacup.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      rclacup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rclacup.this.AV33BarCod = aP1[0];
      this.aP1 = aP1;
      rclacup.this.AV34BarCodReo = aP2[0];
      this.aP2 = aP2;
      rclacup.this.AV35BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "CUPCLA", "", 2, 1, 256, 17280, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Cupones Prod Acab. Cladd") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P077H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV33BarCod), Byte.valueOf(AV34BarCodReo), AV35BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1205MacBarPar = P077H2_A1205MacBarPar[0] ;
            A1204MacBarReo = P077H2_A1204MacBarReo[0] ;
            A1203MacBarCod = P077H2_A1203MacBarCod[0] ;
            A1199MacCod = P077H2_A1199MacCod[0] ;
            A1201MacLin = P077H2_A1201MacLin[0] ;
            AV36MacCod = A1199MacCod ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV38BarKgmCru = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P077H3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV33BarCod), Byte.valueOf(AV34BarCodReo), AV35BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P077H3_A130BarCodPar[0] ;
            A132BarCodReo = P077H3_A132BarCodReo[0] ;
            A129BarCod = P077H3_A129BarCod[0] ;
            A1431BarLocDis = P077H3_A1431BarLocDis[0] ;
            A182BarMat = P077H3_A182BarMat[0] ;
            A212BarSer = P077H3_A212BarSer[0] ;
            A2311BarCliDes = P077H3_A2311BarCliDes[0] ;
            A1652BarSerDsc = P077H3_A1652BarSerDsc[0] ;
            A136BarColNum = P077H3_A136BarColNum[0] ;
            A1234BarNomCli = P077H3_A1234BarNomCli[0] ;
            A135BarColNom = P077H3_A135BarColNom[0] ;
            A161BarFecSal = P077H3_A161BarFecSal[0] ;
            A3134BarAncSal1 = P077H3_A3134BarAncSal1[0] ;
            A143BarDisNum = P077H3_A143BarDisNum[0] ;
            A2826BarNumLot = P077H3_A2826BarNumLot[0] ;
            GXt_char1 = AV8CliNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.pclinom(remoteHandle, context).execute( A396EmprCod, A2311BarCliDes, GXv_char2) ;
            rclacup.this.GXt_char1 = GXv_char2[0] ;
            AV8CliNom = GXt_char1 ;
            AV8CliNom = GXutil.trim( AV8CliNom) ;
            AV9BarSer = GXutil.trim( GXutil.substring( A212BarSer, 1, 6)) ;
            AV10BarSerDsc = A1652BarSerDsc ;
            AV12BarColNum = A136BarColNum ;
            AV11BarColNom = (GXutil.like(A212BarSer,GXutil.padr(httpContext.getMessage( "%E%", ""),254, "%"), ' ') ? A135BarColNom : A1234BarNomCli) ;
            AV39BarCod1 = A129BarCod ;
            AV40BarCodReo1 = A132BarCodReo ;
            AV41BarCodPar1 = A130BarCodPar ;
            /* Using cursor P077H4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A201BarPieEst = P077H4_A201BarPieEst[0] ;
               A1271BarPieLzd = P077H4_A1271BarPieLzd[0] ;
               A170BarKilLan = P077H4_A170BarKilLan[0] ;
               A183BarMetLan = P077H4_A183BarMetLan[0] ;
               A203BarPieKil = P077H4_A203BarPieKil[0] ;
               A200BarPieCod = P077H4_A200BarPieCod[0] ;
               AV14BarPie = (int)(AV14BarPie+(((GXutil.strcmp(GXutil.substring( A212BarSer, 7, 1), httpContext.getMessage( "T", ""))==0)&&(GXutil.strcmp(GXutil.substring( GXutil.trim( A182BarMat), 1, 5), httpContext.getMessage( "PUNTO", ""))==0)&&(GXutil.strcmp(A1431BarLocDis, httpContext.getMessage( "O", ""))==0) ? 1 : A1271BarPieLzd))) ;
               AV15BarKgm = AV15BarKgm.add(A170BarKilLan) ;
               AV47BarMtr = AV47BarMtr.add(A183BarMetLan) ;
               AV38BarKgmCru = AV38BarKgmCru.add(A203BarPieKil) ;
               AV20BarSer1[1-1] = GXutil.trim( GXutil.substring( A212BarSer, 1, 6)) ;
               AV21BarPie1[1-1] = (short)(AV21BarPie1[1-1]+(((GXutil.strcmp(GXutil.substring( A212BarSer, 7, 1), httpContext.getMessage( "T", ""))==0)&&(GXutil.strcmp(GXutil.substring( GXutil.trim( A182BarMat), 1, 5), httpContext.getMessage( "PUNTO", ""))==0)&&(GXutil.strcmp(A1431BarLocDis, httpContext.getMessage( "O", ""))==0) ? 1 : A1271BarPieLzd))) ;
               AV22BarKgm1[1-1] = AV22BarKgm1[1-1].add(A170BarKilLan) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Execute user subroutine: 'KILOS' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV44Prenda = (byte)(((GXutil.strcmp(GXutil.substring( A212BarSer, 7, 1), httpContext.getMessage( "C", ""))==0)&&(GXutil.strcmp(GXutil.substring( GXutil.trim( A182BarMat), 1, 6), httpContext.getMessage( "PRENDA", ""))==0) ? 1 : 0)) ;
            if ( AV44Prenda == 1 )
            {
               AV45MtrPie = httpContext.getMessage( "Prendas :", "") ;
               AV46MtrPieU = DecimalUtil.doubleToDec(AV14BarPie) ;
            }
            else
            {
               AV45MtrPie = httpContext.getMessage( "Metros :", "") ;
               AV46MtrPieU = AV47BarMtr ;
            }
            AV13Merma = (AV38BarKgmCru.subtract(AV15BarKgm)).divide(AV38BarKgmCru, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
            AV16BarFecSal = A161BarFecSal ;
            /* Using cursor P077H5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A44AlbRecCod = P077H5_A44AlbRecCod[0] ;
               A200BarPieCod = P077H5_A200BarPieCod[0] ;
               A201BarPieEst = P077H5_A201BarPieEst[0] ;
               /* Using cursor P077H6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A2159AlbRecPie = P077H6_A2159AlbRecPie[0] ;
                  A4798AlRPieClaM = P077H6_A4798AlRPieClaM[0] ;
                  n4798AlRPieClaM = P077H6_n4798AlRPieClaM[0] ;
                  /* Using cursor P077H7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n4798AlRPieClaM), Byte.valueOf(A4798AlRPieClaM)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A7082CClCod = P077H7_A7082CClCod[0] ;
                     A7083CClDsc = P077H7_A7083CClDsc[0] ;
                     n7083CClDsc = P077H7_n7083CClDsc[0] ;
                     AV17Calidad = A7083CClDsc ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(5);
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV18BarAncSal1 = A3134BarAncSal1 ;
            AV23BarDisNum = GXutil.trim( A143BarDisNum) ;
            AV24BarNumLot = GXutil.padl( GXutil.trim( GXutil.str( ((int)((A2826BarNumLot) % (1000))), 10, 0)), (short)(3), "0") ;
            AV39BarCod1 = AV33BarCod ;
            AV40BarCodReo1 = AV34BarCodReo ;
            AV41BarCodPar1 = AV35BarCodPar ;
            /* Execute user subroutine: 'CABEZAL' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'PIEZAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P077H8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV36MacCod), Integer.valueOf(AV33BarCod), Byte.valueOf(AV34BarCodReo), AV35BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A1205MacBarPar = P077H8_A1205MacBarPar[0] ;
            A1204MacBarReo = P077H8_A1204MacBarReo[0] ;
            A1203MacBarCod = P077H8_A1203MacBarCod[0] ;
            A1199MacCod = P077H8_A1199MacCod[0] ;
            A1201MacLin = P077H8_A1201MacLin[0] ;
            AV39BarCod1 = A1203MacBarCod ;
            AV40BarCodReo1 = A1204MacBarReo ;
            AV41BarCodPar1 = A1205MacBarPar ;
            /* Execute user subroutine: 'PIEZAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h77H0( true, 0) ;
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
      /* 'PIEZAS' Routine */
      returnInSub = false ;
      /* Using cursor P077H9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV39BarCod1), Byte.valueOf(AV40BarCodReo1), AV41BarCodPar1});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A44AlbRecCod = P077H9_A44AlbRecCod[0] ;
         A200BarPieCod = P077H9_A200BarPieCod[0] ;
         A201BarPieEst = P077H9_A201BarPieEst[0] ;
         A130BarCodPar = P077H9_A130BarCodPar[0] ;
         A132BarCodReo = P077H9_A132BarCodReo[0] ;
         A129BarCod = P077H9_A129BarCod[0] ;
         A45AlbRef = P077H9_A45AlbRef[0] ;
         A212BarSer = P077H9_A212BarSer[0] ;
         A1652BarSerDsc = P077H9_A1652BarSerDsc[0] ;
         A136BarColNum = P077H9_A136BarColNum[0] ;
         A1234BarNomCli = P077H9_A1234BarNomCli[0] ;
         A135BarColNom = P077H9_A135BarColNom[0] ;
         A170BarKilLan = P077H9_A170BarKilLan[0] ;
         A182BarMat = P077H9_A182BarMat[0] ;
         A1271BarPieLzd = P077H9_A1271BarPieLzd[0] ;
         A183BarMetLan = P077H9_A183BarMetLan[0] ;
         A3134BarAncSal1 = P077H9_A3134BarAncSal1[0] ;
         A6489BarPieIdPz = P077H9_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = P077H9_n6489BarPieIdPz[0] ;
         A143BarDisNum = P077H9_A143BarDisNum[0] ;
         A2826BarNumLot = P077H9_A2826BarNumLot[0] ;
         A45AlbRef = P077H9_A45AlbRef[0] ;
         A212BarSer = P077H9_A212BarSer[0] ;
         A1652BarSerDsc = P077H9_A1652BarSerDsc[0] ;
         A136BarColNum = P077H9_A136BarColNum[0] ;
         A1234BarNomCli = P077H9_A1234BarNomCli[0] ;
         A135BarColNom = P077H9_A135BarColNom[0] ;
         A182BarMat = P077H9_A182BarMat[0] ;
         A3134BarAncSal1 = P077H9_A3134BarAncSal1[0] ;
         A143BarDisNum = P077H9_A143BarDisNum[0] ;
         A2826BarNumLot = P077H9_A2826BarNumLot[0] ;
         AV27BarPieNum = (int)(GXutil.lval( A200BarPieCod)) ;
         AV9BarSer = GXutil.trim( GXutil.substring( A212BarSer, 1, 6)) + "(" + GXutil.trim( A45AlbRef) + ")" ;
         AV10BarSerDsc = A1652BarSerDsc ;
         AV12BarColNum = A136BarColNum ;
         AV11BarColNom = (GXutil.like(A212BarSer,GXutil.padr(httpContext.getMessage( "%E%", ""),254, "%"), ' ') ? A135BarColNom : A1234BarNomCli) ;
         AV15BarKgm = A170BarKilLan ;
         AV44Prenda = (byte)(((GXutil.strcmp(GXutil.substring( A212BarSer, 7, 1), httpContext.getMessage( "C", ""))==0)&&(GXutil.strcmp(GXutil.substring( GXutil.trim( A182BarMat), 1, 6), httpContext.getMessage( "PRENDA", ""))==0) ? 1 : 0)) ;
         if ( AV44Prenda == 1 )
         {
            AV45MtrPie = httpContext.getMessage( "Prendas :", "") ;
            AV46MtrPieU = DecimalUtil.doubleToDec(A1271BarPieLzd) ;
         }
         else
         {
            AV45MtrPie = httpContext.getMessage( "Metros :", "") ;
            AV46MtrPieU = A183BarMetLan ;
         }
         /* Using cursor P077H10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A2159AlbRecPie = P077H10_A2159AlbRecPie[0] ;
            A4798AlRPieClaM = P077H10_A4798AlRPieClaM[0] ;
            n4798AlRPieClaM = P077H10_n4798AlRPieClaM[0] ;
            /* Using cursor P077H11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n4798AlRPieClaM), Byte.valueOf(A4798AlRPieClaM)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A7082CClCod = P077H11_A7082CClCod[0] ;
               A7083CClDsc = P077H11_A7083CClDsc[0] ;
               n7083CClDsc = P077H11_n7083CClDsc[0] ;
               AV17Calidad = A7083CClDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(9);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         AV18BarAncSal1 = A3134BarAncSal1 ;
         AV28HDR = GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + A130BarCodPar ;
         AV28HDR = GXutil.padl( AV28HDR, (short)(10), "0") ;
         AV42AlbRecCod = A44AlbRecCod ;
         AV43AlbRecPie = A200BarPieCod ;
         /* Execute user subroutine: 'DEFECTOS' */
         S129 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV31BarPieIdPz = A6489BarPieIdPz ;
         AV32Ren = A183BarMetLan.divide(A170BarKilLan, 18, java.math.RoundingMode.DOWN) ;
         AV23BarDisNum = GXutil.trim( A143BarDisNum) ;
         AV24BarNumLot = GXutil.right( GXutil.padl( GXutil.trim( GXutil.str( A2826BarNumLot, 10, 0)), (short)(6), "0"), 3) ;
         /* Execute user subroutine: 'PIEZA' */
         S139 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'KILOS' Routine */
      returnInSub = false ;
      AV37Cont = (byte)(1) ;
      /* Using cursor P077H12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV36MacCod), Integer.valueOf(AV33BarCod), Byte.valueOf(AV34BarCodReo), AV35BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A1205MacBarPar = P077H12_A1205MacBarPar[0] ;
         A1204MacBarReo = P077H12_A1204MacBarReo[0] ;
         A1203MacBarCod = P077H12_A1203MacBarCod[0] ;
         A1199MacCod = P077H12_A1199MacCod[0] ;
         A1201MacLin = P077H12_A1201MacLin[0] ;
         AV37Cont = (byte)(AV37Cont+1) ;
         /* Using cursor P077H13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A129BarCod = P077H13_A129BarCod[0] ;
            A132BarCodReo = P077H13_A132BarCodReo[0] ;
            A130BarCodPar = P077H13_A130BarCodPar[0] ;
            A1271BarPieLzd = P077H13_A1271BarPieLzd[0] ;
            A1431BarLocDis = P077H13_A1431BarLocDis[0] ;
            A182BarMat = P077H13_A182BarMat[0] ;
            A212BarSer = P077H13_A212BarSer[0] ;
            A170BarKilLan = P077H13_A170BarKilLan[0] ;
            A183BarMetLan = P077H13_A183BarMetLan[0] ;
            A203BarPieKil = P077H13_A203BarPieKil[0] ;
            A200BarPieCod = P077H13_A200BarPieCod[0] ;
            A1431BarLocDis = P077H13_A1431BarLocDis[0] ;
            A182BarMat = P077H13_A182BarMat[0] ;
            A212BarSer = P077H13_A212BarSer[0] ;
            AV14BarPie = (int)(AV14BarPie+(((GXutil.strcmp(GXutil.substring( A212BarSer, 7, 1), httpContext.getMessage( "T", ""))==0)&&(GXutil.strcmp(GXutil.substring( GXutil.trim( A182BarMat), 1, 5), httpContext.getMessage( "PUNTO", ""))==0)&&(GXutil.strcmp(A1431BarLocDis, httpContext.getMessage( "O", ""))==0) ? 1 : A1271BarPieLzd))) ;
            AV15BarKgm = AV15BarKgm.add(A170BarKilLan) ;
            AV47BarMtr = AV47BarMtr.add(A183BarMetLan) ;
            AV38BarKgmCru = AV38BarKgmCru.add(A203BarPieKil) ;
            if ( AV37Cont <= 4 )
            {
               AV20BarSer1[AV37Cont-1] = GXutil.trim( GXutil.substring( A212BarSer, 1, 6)) ;
               AV21BarPie1[AV37Cont-1] = (short)(AV21BarPie1[AV37Cont-1]+(((GXutil.strcmp(GXutil.substring( A212BarSer, 7, 1), httpContext.getMessage( "T", ""))==0)&&(GXutil.strcmp(GXutil.substring( GXutil.trim( A182BarMat), 1, 5), httpContext.getMessage( "PUNTO", ""))==0)&&(GXutil.strcmp(A1431BarLocDis, httpContext.getMessage( "O", ""))==0) ? 1 : A1271BarPieLzd))) ;
               AV22BarKgm1[AV37Cont-1] = AV22BarKgm1[AV37Cont-1].add(A170BarKilLan) ;
            }
            pr_default.readNext(11);
         }
         pr_default.close(11);
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S129( ) throws ProcessInterruptedException
   {
      /* 'DEFECTOS' Routine */
      returnInSub = false ;
      /* Using cursor P077H14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV42AlbRecCod), AV43AlbRecPie});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A5261AlrDefPri = P077H14_A5261AlrDefPri[0] ;
         n5261AlrDefPri = P077H14_n5261AlrDefPri[0] ;
         A2159AlbRecPie = P077H14_A2159AlbRecPie[0] ;
         A44AlbRecCod = P077H14_A44AlbRecCod[0] ;
         A4395AlRDefCod = P077H14_A4395AlRDefCod[0] ;
         A4396AlRDefDsc = P077H14_A4396AlRDefDsc[0] ;
         n4396AlRDefDsc = P077H14_n4396AlRDefDsc[0] ;
         A4412AlRFasCod = P077H14_A4412AlRFasCod[0] ;
         A4396AlRDefDsc = P077H14_A4396AlRDefDsc[0] ;
         n4396AlRDefDsc = P077H14_n4396AlRDefDsc[0] ;
         AV29AlrDefCod = A4395AlRDefCod ;
         AV30AlrDefDsc = A4396AlRDefDsc ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CABEZAL' Routine */
      returnInSub = false ;
      h77H0( false, 286) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8CliNom, "")), 4, Gx_line+5, 262, Gx_line+24, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarSer, "")), 4, Gx_line+25, 93, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarSerDsc, "")), 66, Gx_line+25, 257, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarColNom, "")), 66, Gx_line+43, 162, Gx_line+61, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12BarColNum), "ZZZZZ9")), 4, Gx_line+43, 49, Gx_line+61, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Merma :", ""), 70, Gx_line+61, 122, Gx_line+76, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Merma, "Z9.99 %")), 160, Gx_line+60, 212, Gx_line+77, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14BarPie), "ZZZZZ9")), 160, Gx_line+77, 205, Gx_line+94, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas :", ""), 63, Gx_line+79, 122, Gx_line+94, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15BarKgm, "ZZZZZ9.99")), 160, Gx_line+95, 227, Gx_line+112, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos :", ""), 70, Gx_line+96, 122, Gx_line+111, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(localUtil.format( AV16BarFecSal, "99/99/99"), 160, Gx_line+113, 219, Gx_line+130, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha :", ""), 70, Gx_line+114, 122, Gx_line+129, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("/", 131, Gx_line+244, 142, Gx_line+263, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22BarKgm1[1-1], "ZZZZZZ.ZZ")), 170, Gx_line+179, 237, Gx_line+196, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21BarPie1[1-1]), "ZZZZ")), 104, Gx_line+179, 134, Gx_line+196, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20BarSer1[1-1], "")), 39, Gx_line+179, 69, Gx_line+196, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22BarKgm1[3-1], "ZZZZZZ.ZZ")), 170, Gx_line+211, 237, Gx_line+228, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21BarPie1[3-1]), "ZZZZ")), 104, Gx_line+211, 134, Gx_line+228, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20BarSer1[3-1], "")), 39, Gx_line+211, 69, Gx_line+228, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22BarKgm1[4-1], "ZZZZZZ.ZZ")), 170, Gx_line+228, 236, Gx_line+244, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21BarPie1[4-1]), "ZZZZ")), 104, Gx_line+228, 133, Gx_line+244, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20BarSer1[4-1], "")), 39, Gx_line+228, 68, Gx_line+244, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22BarKgm1[2-1], "ZZZZZZ.ZZ")), 170, Gx_line+195, 237, Gx_line+212, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21BarPie1[2-1]), "ZZZZ")), 104, Gx_line+195, 134, Gx_line+212, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20BarSer1[2-1], "")), 39, Gx_line+195, 69, Gx_line+212, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23BarDisNum, "")), 24, Gx_line+244, 128, Gx_line+263, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarNumLot, "")), 143, Gx_line+244, 247, Gx_line+263, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45MtrPie, "")), 55, Gx_line+131, 122, Gx_line+147, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46MtrPieU, "ZZZZZZ9.99")), 160, Gx_line+130, 234, Gx_line+147, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+286) ;
      /* Noskip command */
      Gx_line = Gx_OldLine ;
      AV8CliNom = "" ;
      AV9BarSer = "" ;
      AV10BarSerDsc = "" ;
      AV12BarColNum = 0 ;
      AV11BarColNom = "" ;
      AV13Merma = DecimalUtil.ZERO ;
      AV14BarPie = 0 ;
      AV15BarKgm = DecimalUtil.ZERO ;
      AV16BarFecSal = GXutil.nullDate() ;
      AV17Calidad = "" ;
      AV18BarAncSal1 = (short)(0) ;
      AV19Estante = "" ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV20BarSer1[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV21BarPie1[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV22BarKgm1[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV23BarDisNum = "" ;
      AV24BarNumLot = "" ;
      AV25Contador = 0 ;
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'PIEZA' Routine */
      returnInSub = false ;
      AV25Contador = (long)(AV25Contador+1) ;
      AV25Contador = ((int)((AV25Contador) % (12))) ;
      AV26Col = ((int)((AV25Contador) % (3))) ;
      if ( AV26Col == 0 )
      {
         /* Execute user subroutine: 'PIEZA1' */
         S161 ();
         if (returnInSub) return;
      }
      else if ( AV26Col == 1 )
      {
         /* Execute user subroutine: 'PIEZA2' */
         S171 ();
         if (returnInSub) return;
      }
      else if ( AV26Col == 2 )
      {
         /* Execute user subroutine: 'PIEZA3' */
         S181 ();
         if (returnInSub) return;
      }
      AV9BarSer = "" ;
      AV10BarSerDsc = "" ;
      AV12BarColNum = 0 ;
      AV11BarColNom = "" ;
      AV15BarKgm = DecimalUtil.ZERO ;
      AV17Calidad = "" ;
      AV18BarAncSal1 = (short)(0) ;
      AV28HDR = "" ;
      AV29AlrDefCod = (short)(0) ;
      AV30AlrDefDsc = "" ;
      AV31BarPieIdPz = "" ;
      AV32Ren = DecimalUtil.ZERO ;
      AV19Estante = "" ;
      AV23BarDisNum = "" ;
      AV24BarNumLot = "" ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'PIEZA1' Routine */
      returnInSub = false ;
      h77H0( false, 286) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27BarPieNum), "ZZZ,ZZZ,ZZZ")), 0, Gx_line+5, 230, Gx_line+24, 2, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarSer, "")), 4, Gx_line+25, 93, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarSerDsc, "")), 93, Gx_line+25, 256, Gx_line+42, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarColNom, "")), 93, Gx_line+43, 189, Gx_line+61, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12BarColNum), "ZZZZZ9")), 4, Gx_line+43, 49, Gx_line+61, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Peso :", ""), 70, Gx_line+65, 115, Gx_line+80, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Calidad :", ""), 48, Gx_line+84, 115, Gx_line+99, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho :", ""), 63, Gx_line+104, 115, Gx_line+119, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta :", ""), 11, Gx_line+124, 114, Gx_line+139, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Defecto :", ""), 33, Gx_line+144, 114, Gx_line+159, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("/", 131, Gx_line+244, 142, Gx_line+263, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23BarDisNum, "")), 24, Gx_line+244, 128, Gx_line+263, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarNumLot, "")), 143, Gx_line+244, 247, Gx_line+263, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 4, Gx_line+183, 114, Gx_line+198, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Rinde :", ""), 63, Gx_line+203, 115, Gx_line+218, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15BarKgm, "ZZZZZ9.99")), 119, Gx_line+64, 186, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Calidad, "")), 119, Gx_line+83, 208, Gx_line+100, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18BarAncSal1), "ZZZ9")), 119, Gx_line+103, 149, Gx_line+120, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28HDR, "")), 119, Gx_line+123, 193, Gx_line+140, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29AlrDefCod), "ZZZ9")), 119, Gx_line+143, 149, Gx_line+160, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30AlrDefDsc, "")), 119, Gx_line+163, 269, Gx_line+179, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc Defecto :", ""), 11, Gx_line+164, 114, Gx_line+179, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31BarPieIdPz, "")), 119, Gx_line+186, 229, Gx_line+203, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Ren, "ZZ9.99")), 119, Gx_line+205, 164, Gx_line+222, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46MtrPieU, "ZZZZZZ9.99")), 119, Gx_line+224, 193, Gx_line+241, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45MtrPie, "")), 48, Gx_line+225, 115, Gx_line+241, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+286) ;
      /* Noskip command */
      Gx_line = Gx_OldLine ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PIEZA2' Routine */
      returnInSub = false ;
      h77H0( false, 286) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarSer, "")), 278, Gx_line+25, 367, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarSerDsc, "")), 367, Gx_line+25, 530, Gx_line+42, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarColNom, "")), 367, Gx_line+43, 463, Gx_line+61, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12BarColNum), "ZZZZZ9")), 278, Gx_line+43, 323, Gx_line+61, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Peso :", ""), 344, Gx_line+65, 389, Gx_line+80, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Calidad :", ""), 322, Gx_line+84, 389, Gx_line+99, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho :", ""), 336, Gx_line+104, 388, Gx_line+119, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta :", ""), 285, Gx_line+124, 388, Gx_line+139, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Defecto :", ""), 307, Gx_line+144, 388, Gx_line+159, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("/", 405, Gx_line+244, 416, Gx_line+263, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23BarDisNum, "")), 298, Gx_line+244, 402, Gx_line+263, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarNumLot, "")), 420, Gx_line+244, 524, Gx_line+263, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 278, Gx_line+183, 388, Gx_line+198, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Rinde :", ""), 336, Gx_line+203, 388, Gx_line+218, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15BarKgm, "ZZZZZ9.99")), 393, Gx_line+64, 460, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Calidad, "")), 393, Gx_line+83, 482, Gx_line+100, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18BarAncSal1), "ZZZ9")), 393, Gx_line+103, 423, Gx_line+120, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28HDR, "")), 393, Gx_line+123, 467, Gx_line+140, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29AlrDefCod), "ZZZ9")), 393, Gx_line+143, 423, Gx_line+160, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30AlrDefDsc, "")), 393, Gx_line+163, 543, Gx_line+179, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc Defecto :", ""), 285, Gx_line+164, 388, Gx_line+179, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31BarPieIdPz, "")), 393, Gx_line+186, 503, Gx_line+203, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Ren, "ZZ9.99")), 393, Gx_line+205, 438, Gx_line+222, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27BarPieNum), "ZZZ,ZZZ,ZZZ")), 274, Gx_line+5, 504, Gx_line+24, 2, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46MtrPieU, "ZZZZZZ9.99")), 393, Gx_line+223, 467, Gx_line+240, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45MtrPie, "")), 322, Gx_line+224, 389, Gx_line+240, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+286) ;
      /* Noskip command */
      Gx_line = Gx_OldLine ;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'PIEZA3' Routine */
      returnInSub = false ;
      h77H0( false, 286) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarSer, "")), 552, Gx_line+25, 641, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarSerDsc, "")), 641, Gx_line+25, 804, Gx_line+42, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarColNom, "")), 641, Gx_line+43, 737, Gx_line+61, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12BarColNum), "ZZZZZ9")), 552, Gx_line+43, 597, Gx_line+61, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Peso :", ""), 618, Gx_line+65, 663, Gx_line+80, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Calidad :", ""), 596, Gx_line+84, 663, Gx_line+99, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho :", ""), 610, Gx_line+104, 662, Gx_line+119, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta :", ""), 559, Gx_line+124, 662, Gx_line+139, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Defecto :", ""), 581, Gx_line+144, 662, Gx_line+159, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("/", 679, Gx_line+244, 690, Gx_line+263, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23BarDisNum, "")), 572, Gx_line+244, 676, Gx_line+263, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarNumLot, "")), 692, Gx_line+244, 796, Gx_line+263, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 552, Gx_line+183, 662, Gx_line+198, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Rinde :", ""), 610, Gx_line+203, 662, Gx_line+218, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15BarKgm, "ZZZZZ9.99")), 667, Gx_line+64, 734, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Calidad, "")), 667, Gx_line+83, 756, Gx_line+100, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18BarAncSal1), "ZZZ9")), 667, Gx_line+103, 697, Gx_line+120, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28HDR, "")), 667, Gx_line+123, 741, Gx_line+140, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29AlrDefCod), "ZZZ9")), 667, Gx_line+143, 697, Gx_line+160, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30AlrDefDsc, "")), 667, Gx_line+163, 817, Gx_line+179, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc Defecto :", ""), 559, Gx_line+164, 662, Gx_line+179, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31BarPieIdPz, "")), 667, Gx_line+186, 777, Gx_line+203, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Ren, "ZZ9.99")), 667, Gx_line+205, 712, Gx_line+222, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27BarPieNum), "ZZZ,ZZZ,ZZZ")), 548, Gx_line+5, 778, Gx_line+24, 2, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46MtrPieU, "ZZZZZZ9.99")), 667, Gx_line+224, 741, Gx_line+241, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45MtrPie, "")), 596, Gx_line+225, 663, Gx_line+241, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+286) ;
      /* Noskip command */
      Gx_line = Gx_OldLine ;
      Gx_line = (int)(Gx_line+288) ;
   }

   public void h77H0( boolean bFoot ,
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
      this.aP0[0] = rclacup.this.A396EmprCod;
      this.aP1[0] = rclacup.this.AV33BarCod;
      this.aP2[0] = rclacup.this.AV34BarCodReo;
      this.aP3[0] = rclacup.this.AV35BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P077H2_A396EmprCod = new String[] {""} ;
      P077H2_A1205MacBarPar = new String[] {""} ;
      P077H2_A1204MacBarReo = new byte[1] ;
      P077H2_A1203MacBarCod = new int[1] ;
      P077H2_A1199MacCod = new int[1] ;
      P077H2_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV38BarKgmCru = DecimalUtil.ZERO ;
      P077H3_A396EmprCod = new String[] {""} ;
      P077H3_A130BarCodPar = new String[] {""} ;
      P077H3_A132BarCodReo = new byte[1] ;
      P077H3_A129BarCod = new int[1] ;
      P077H3_A1431BarLocDis = new String[] {""} ;
      P077H3_A182BarMat = new String[] {""} ;
      P077H3_A212BarSer = new String[] {""} ;
      P077H3_A2311BarCliDes = new int[1] ;
      P077H3_A1652BarSerDsc = new String[] {""} ;
      P077H3_A136BarColNum = new int[1] ;
      P077H3_A1234BarNomCli = new String[] {""} ;
      P077H3_A135BarColNom = new String[] {""} ;
      P077H3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P077H3_A3134BarAncSal1 = new short[1] ;
      P077H3_A143BarDisNum = new String[] {""} ;
      P077H3_A2826BarNumLot = new int[1] ;
      A130BarCodPar = "" ;
      A1431BarLocDis = "" ;
      A182BarMat = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      AV8CliNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV9BarSer = "" ;
      AV10BarSerDsc = "" ;
      AV11BarColNom = "" ;
      AV41BarCodPar1 = "" ;
      P077H4_A396EmprCod = new String[] {""} ;
      P077H4_A129BarCod = new int[1] ;
      P077H4_A132BarCodReo = new byte[1] ;
      P077H4_A130BarCodPar = new String[] {""} ;
      P077H4_A201BarPieEst = new byte[1] ;
      P077H4_A1271BarPieLzd = new int[1] ;
      P077H4_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H4_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H4_A200BarPieCod = new String[] {""} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV15BarKgm = DecimalUtil.ZERO ;
      AV47BarMtr = DecimalUtil.ZERO ;
      AV20BarSer1 = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV20BarSer1[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21BarPie1 = new short[4] ;
      AV22BarKgm1 = new java.math.BigDecimal[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV22BarKgm1[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV45MtrPie = "" ;
      AV46MtrPieU = DecimalUtil.ZERO ;
      AV13Merma = DecimalUtil.ZERO ;
      AV16BarFecSal = GXutil.nullDate() ;
      P077H5_A396EmprCod = new String[] {""} ;
      P077H5_A129BarCod = new int[1] ;
      P077H5_A132BarCodReo = new byte[1] ;
      P077H5_A130BarCodPar = new String[] {""} ;
      P077H5_A44AlbRecCod = new int[1] ;
      P077H5_A200BarPieCod = new String[] {""} ;
      P077H5_A201BarPieEst = new byte[1] ;
      P077H6_A396EmprCod = new String[] {""} ;
      P077H6_A44AlbRecCod = new int[1] ;
      P077H6_A2159AlbRecPie = new String[] {""} ;
      P077H6_A4798AlRPieClaM = new byte[1] ;
      P077H6_n4798AlRPieClaM = new boolean[] {false} ;
      A2159AlbRecPie = "" ;
      P077H7_A396EmprCod = new String[] {""} ;
      P077H7_A7082CClCod = new byte[1] ;
      P077H7_A7083CClDsc = new String[] {""} ;
      P077H7_n7083CClDsc = new boolean[] {false} ;
      A7083CClDsc = "" ;
      AV17Calidad = "" ;
      AV23BarDisNum = "" ;
      AV24BarNumLot = "" ;
      P077H8_A396EmprCod = new String[] {""} ;
      P077H8_A1205MacBarPar = new String[] {""} ;
      P077H8_A1204MacBarReo = new byte[1] ;
      P077H8_A1203MacBarCod = new int[1] ;
      P077H8_A1199MacCod = new int[1] ;
      P077H8_A1201MacLin = new short[1] ;
      P077H9_A396EmprCod = new String[] {""} ;
      P077H9_A44AlbRecCod = new int[1] ;
      P077H9_A200BarPieCod = new String[] {""} ;
      P077H9_A201BarPieEst = new byte[1] ;
      P077H9_A130BarCodPar = new String[] {""} ;
      P077H9_A132BarCodReo = new byte[1] ;
      P077H9_A129BarCod = new int[1] ;
      P077H9_A45AlbRef = new String[] {""} ;
      P077H9_A212BarSer = new String[] {""} ;
      P077H9_A1652BarSerDsc = new String[] {""} ;
      P077H9_A136BarColNum = new int[1] ;
      P077H9_A1234BarNomCli = new String[] {""} ;
      P077H9_A135BarColNom = new String[] {""} ;
      P077H9_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H9_A182BarMat = new String[] {""} ;
      P077H9_A1271BarPieLzd = new int[1] ;
      P077H9_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H9_A3134BarAncSal1 = new short[1] ;
      P077H9_A6489BarPieIdPz = new String[] {""} ;
      P077H9_n6489BarPieIdPz = new boolean[] {false} ;
      P077H9_A143BarDisNum = new String[] {""} ;
      P077H9_A2826BarNumLot = new int[1] ;
      A45AlbRef = "" ;
      A6489BarPieIdPz = "" ;
      P077H10_A396EmprCod = new String[] {""} ;
      P077H10_A44AlbRecCod = new int[1] ;
      P077H10_A2159AlbRecPie = new String[] {""} ;
      P077H10_A4798AlRPieClaM = new byte[1] ;
      P077H10_n4798AlRPieClaM = new boolean[] {false} ;
      P077H11_A396EmprCod = new String[] {""} ;
      P077H11_A7082CClCod = new byte[1] ;
      P077H11_A7083CClDsc = new String[] {""} ;
      P077H11_n7083CClDsc = new boolean[] {false} ;
      AV28HDR = "" ;
      AV43AlbRecPie = "" ;
      AV31BarPieIdPz = "" ;
      AV32Ren = DecimalUtil.ZERO ;
      P077H12_A396EmprCod = new String[] {""} ;
      P077H12_A1205MacBarPar = new String[] {""} ;
      P077H12_A1204MacBarReo = new byte[1] ;
      P077H12_A1203MacBarCod = new int[1] ;
      P077H12_A1199MacCod = new int[1] ;
      P077H12_A1201MacLin = new short[1] ;
      P077H13_A396EmprCod = new String[] {""} ;
      P077H13_A129BarCod = new int[1] ;
      P077H13_A132BarCodReo = new byte[1] ;
      P077H13_A130BarCodPar = new String[] {""} ;
      P077H13_A1271BarPieLzd = new int[1] ;
      P077H13_A1431BarLocDis = new String[] {""} ;
      P077H13_A182BarMat = new String[] {""} ;
      P077H13_A212BarSer = new String[] {""} ;
      P077H13_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H13_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H13_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077H13_A200BarPieCod = new String[] {""} ;
      P077H14_A396EmprCod = new String[] {""} ;
      P077H14_A5261AlrDefPri = new byte[1] ;
      P077H14_n5261AlrDefPri = new boolean[] {false} ;
      P077H14_A2159AlbRecPie = new String[] {""} ;
      P077H14_A44AlbRecCod = new int[1] ;
      P077H14_A4395AlRDefCod = new short[1] ;
      P077H14_A4396AlRDefDsc = new String[] {""} ;
      P077H14_n4396AlRDefDsc = new boolean[] {false} ;
      P077H14_A4412AlRFasCod = new String[] {""} ;
      A4396AlRDefDsc = "" ;
      A4412AlRFasCod = "" ;
      AV30AlrDefDsc = "" ;
      AV19Estante = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rclacup__default(),
         new Object[] {
             new Object[] {
            P077H2_A396EmprCod, P077H2_A1205MacBarPar, P077H2_A1204MacBarReo, P077H2_A1203MacBarCod, P077H2_A1199MacCod, P077H2_A1201MacLin
            }
            , new Object[] {
            P077H3_A396EmprCod, P077H3_A130BarCodPar, P077H3_A132BarCodReo, P077H3_A129BarCod, P077H3_A1431BarLocDis, P077H3_A182BarMat, P077H3_A212BarSer, P077H3_A2311BarCliDes, P077H3_A1652BarSerDsc, P077H3_A136BarColNum,
            P077H3_A1234BarNomCli, P077H3_A135BarColNom, P077H3_A161BarFecSal, P077H3_A3134BarAncSal1, P077H3_A143BarDisNum, P077H3_A2826BarNumLot
            }
            , new Object[] {
            P077H4_A396EmprCod, P077H4_A129BarCod, P077H4_A132BarCodReo, P077H4_A130BarCodPar, P077H4_A201BarPieEst, P077H4_A1271BarPieLzd, P077H4_A170BarKilLan, P077H4_A183BarMetLan, P077H4_A203BarPieKil, P077H4_A200BarPieCod
            }
            , new Object[] {
            P077H5_A396EmprCod, P077H5_A129BarCod, P077H5_A132BarCodReo, P077H5_A130BarCodPar, P077H5_A44AlbRecCod, P077H5_A200BarPieCod, P077H5_A201BarPieEst
            }
            , new Object[] {
            P077H6_A396EmprCod, P077H6_A44AlbRecCod, P077H6_A2159AlbRecPie, P077H6_A4798AlRPieClaM, P077H6_n4798AlRPieClaM
            }
            , new Object[] {
            P077H7_A396EmprCod, P077H7_A7082CClCod, P077H7_A7083CClDsc, P077H7_n7083CClDsc
            }
            , new Object[] {
            P077H8_A396EmprCod, P077H8_A1205MacBarPar, P077H8_A1204MacBarReo, P077H8_A1203MacBarCod, P077H8_A1199MacCod, P077H8_A1201MacLin
            }
            , new Object[] {
            P077H9_A396EmprCod, P077H9_A44AlbRecCod, P077H9_A200BarPieCod, P077H9_A201BarPieEst, P077H9_A130BarCodPar, P077H9_A132BarCodReo, P077H9_A129BarCod, P077H9_A45AlbRef, P077H9_A212BarSer, P077H9_A1652BarSerDsc,
            P077H9_A136BarColNum, P077H9_A1234BarNomCli, P077H9_A135BarColNom, P077H9_A170BarKilLan, P077H9_A182BarMat, P077H9_A1271BarPieLzd, P077H9_A183BarMetLan, P077H9_A3134BarAncSal1, P077H9_A6489BarPieIdPz, P077H9_n6489BarPieIdPz,
            P077H9_A143BarDisNum, P077H9_A2826BarNumLot
            }
            , new Object[] {
            P077H10_A396EmprCod, P077H10_A44AlbRecCod, P077H10_A2159AlbRecPie, P077H10_A4798AlRPieClaM, P077H10_n4798AlRPieClaM
            }
            , new Object[] {
            P077H11_A396EmprCod, P077H11_A7082CClCod, P077H11_A7083CClDsc, P077H11_n7083CClDsc
            }
            , new Object[] {
            P077H12_A396EmprCod, P077H12_A1205MacBarPar, P077H12_A1204MacBarReo, P077H12_A1203MacBarCod, P077H12_A1199MacCod, P077H12_A1201MacLin
            }
            , new Object[] {
            P077H13_A396EmprCod, P077H13_A129BarCod, P077H13_A132BarCodReo, P077H13_A130BarCodPar, P077H13_A1271BarPieLzd, P077H13_A1431BarLocDis, P077H13_A182BarMat, P077H13_A212BarSer, P077H13_A170BarKilLan, P077H13_A183BarMetLan,
            P077H13_A203BarPieKil, P077H13_A200BarPieCod
            }
            , new Object[] {
            P077H14_A396EmprCod, P077H14_A5261AlrDefPri, P077H14_n5261AlrDefPri, P077H14_A2159AlbRecPie, P077H14_A44AlbRecCod, P077H14_A4395AlRDefCod, P077H14_A4396AlRDefDsc, P077H14_n4396AlRDefDsc, P077H14_A4412AlRFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV34BarCodReo ;
   private byte A1204MacBarReo ;
   private byte A132BarCodReo ;
   private byte AV40BarCodReo1 ;
   private byte A201BarPieEst ;
   private byte AV44Prenda ;
   private byte A4798AlRPieClaM ;
   private byte A7082CClCod ;
   private byte AV37Cont ;
   private byte A5261AlrDefPri ;
   private short A1201MacLin ;
   private short A3134BarAncSal1 ;
   private short AV21BarPie1[] ;
   private short AV18BarAncSal1 ;
   private short A4395AlRDefCod ;
   private short AV29AlrDefCod ;
   private short Gx_err ;
   private int AV33BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1203MacBarCod ;
   private int A1199MacCod ;
   private int AV36MacCod ;
   private int A129BarCod ;
   private int A2311BarCliDes ;
   private int A136BarColNum ;
   private int A2826BarNumLot ;
   private int AV12BarColNum ;
   private int AV39BarCod1 ;
   private int A1271BarPieLzd ;
   private int AV14BarPie ;
   private int A44AlbRecCod ;
   private int AV27BarPieNum ;
   private int AV42AlbRecCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private long AV25Contador ;
   private long AV26Col ;
   private java.math.BigDecimal AV38BarKgmCru ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV15BarKgm ;
   private java.math.BigDecimal AV47BarMtr ;
   private java.math.BigDecimal AV22BarKgm1[] ;
   private java.math.BigDecimal AV46MtrPieU ;
   private java.math.BigDecimal AV13Merma ;
   private java.math.BigDecimal AV32Ren ;
   private String A396EmprCod ;
   private String AV35BarCodPar ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String A130BarCodPar ;
   private String A1431BarLocDis ;
   private String A182BarMat ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String AV8CliNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9BarSer ;
   private String AV10BarSerDsc ;
   private String AV11BarColNom ;
   private String AV41BarCodPar1 ;
   private String A200BarPieCod ;
   private String AV20BarSer1[] ;
   private String AV45MtrPie ;
   private String A2159AlbRecPie ;
   private String A7083CClDsc ;
   private String AV17Calidad ;
   private String AV23BarDisNum ;
   private String AV24BarNumLot ;
   private String A45AlbRef ;
   private String A6489BarPieIdPz ;
   private String AV28HDR ;
   private String AV43AlbRecPie ;
   private String AV31BarPieIdPz ;
   private String A4396AlRDefDsc ;
   private String A4412AlRFasCod ;
   private String AV30AlrDefDsc ;
   private String AV19Estante ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV16BarFecSal ;
   private boolean returnInSub ;
   private boolean n4798AlRPieClaM ;
   private boolean n7083CClDsc ;
   private boolean n6489BarPieIdPz ;
   private boolean n5261AlrDefPri ;
   private boolean n4396AlRDefDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P077H2_A396EmprCod ;
   private String[] P077H2_A1205MacBarPar ;
   private byte[] P077H2_A1204MacBarReo ;
   private int[] P077H2_A1203MacBarCod ;
   private int[] P077H2_A1199MacCod ;
   private short[] P077H2_A1201MacLin ;
   private String[] P077H3_A396EmprCod ;
   private String[] P077H3_A130BarCodPar ;
   private byte[] P077H3_A132BarCodReo ;
   private int[] P077H3_A129BarCod ;
   private String[] P077H3_A1431BarLocDis ;
   private String[] P077H3_A182BarMat ;
   private String[] P077H3_A212BarSer ;
   private int[] P077H3_A2311BarCliDes ;
   private String[] P077H3_A1652BarSerDsc ;
   private int[] P077H3_A136BarColNum ;
   private String[] P077H3_A1234BarNomCli ;
   private String[] P077H3_A135BarColNom ;
   private java.util.Date[] P077H3_A161BarFecSal ;
   private short[] P077H3_A3134BarAncSal1 ;
   private String[] P077H3_A143BarDisNum ;
   private int[] P077H3_A2826BarNumLot ;
   private String[] P077H4_A396EmprCod ;
   private int[] P077H4_A129BarCod ;
   private byte[] P077H4_A132BarCodReo ;
   private String[] P077H4_A130BarCodPar ;
   private byte[] P077H4_A201BarPieEst ;
   private int[] P077H4_A1271BarPieLzd ;
   private java.math.BigDecimal[] P077H4_A170BarKilLan ;
   private java.math.BigDecimal[] P077H4_A183BarMetLan ;
   private java.math.BigDecimal[] P077H4_A203BarPieKil ;
   private String[] P077H4_A200BarPieCod ;
   private String[] P077H5_A396EmprCod ;
   private int[] P077H5_A129BarCod ;
   private byte[] P077H5_A132BarCodReo ;
   private String[] P077H5_A130BarCodPar ;
   private int[] P077H5_A44AlbRecCod ;
   private String[] P077H5_A200BarPieCod ;
   private byte[] P077H5_A201BarPieEst ;
   private String[] P077H6_A396EmprCod ;
   private int[] P077H6_A44AlbRecCod ;
   private String[] P077H6_A2159AlbRecPie ;
   private byte[] P077H6_A4798AlRPieClaM ;
   private boolean[] P077H6_n4798AlRPieClaM ;
   private String[] P077H7_A396EmprCod ;
   private byte[] P077H7_A7082CClCod ;
   private String[] P077H7_A7083CClDsc ;
   private boolean[] P077H7_n7083CClDsc ;
   private String[] P077H8_A396EmprCod ;
   private String[] P077H8_A1205MacBarPar ;
   private byte[] P077H8_A1204MacBarReo ;
   private int[] P077H8_A1203MacBarCod ;
   private int[] P077H8_A1199MacCod ;
   private short[] P077H8_A1201MacLin ;
   private String[] P077H9_A396EmprCod ;
   private int[] P077H9_A44AlbRecCod ;
   private String[] P077H9_A200BarPieCod ;
   private byte[] P077H9_A201BarPieEst ;
   private String[] P077H9_A130BarCodPar ;
   private byte[] P077H9_A132BarCodReo ;
   private int[] P077H9_A129BarCod ;
   private String[] P077H9_A45AlbRef ;
   private String[] P077H9_A212BarSer ;
   private String[] P077H9_A1652BarSerDsc ;
   private int[] P077H9_A136BarColNum ;
   private String[] P077H9_A1234BarNomCli ;
   private String[] P077H9_A135BarColNom ;
   private java.math.BigDecimal[] P077H9_A170BarKilLan ;
   private String[] P077H9_A182BarMat ;
   private int[] P077H9_A1271BarPieLzd ;
   private java.math.BigDecimal[] P077H9_A183BarMetLan ;
   private short[] P077H9_A3134BarAncSal1 ;
   private String[] P077H9_A6489BarPieIdPz ;
   private boolean[] P077H9_n6489BarPieIdPz ;
   private String[] P077H9_A143BarDisNum ;
   private int[] P077H9_A2826BarNumLot ;
   private String[] P077H10_A396EmprCod ;
   private int[] P077H10_A44AlbRecCod ;
   private String[] P077H10_A2159AlbRecPie ;
   private byte[] P077H10_A4798AlRPieClaM ;
   private boolean[] P077H10_n4798AlRPieClaM ;
   private String[] P077H11_A396EmprCod ;
   private byte[] P077H11_A7082CClCod ;
   private String[] P077H11_A7083CClDsc ;
   private boolean[] P077H11_n7083CClDsc ;
   private String[] P077H12_A396EmprCod ;
   private String[] P077H12_A1205MacBarPar ;
   private byte[] P077H12_A1204MacBarReo ;
   private int[] P077H12_A1203MacBarCod ;
   private int[] P077H12_A1199MacCod ;
   private short[] P077H12_A1201MacLin ;
   private String[] P077H13_A396EmprCod ;
   private int[] P077H13_A129BarCod ;
   private byte[] P077H13_A132BarCodReo ;
   private String[] P077H13_A130BarCodPar ;
   private int[] P077H13_A1271BarPieLzd ;
   private String[] P077H13_A1431BarLocDis ;
   private String[] P077H13_A182BarMat ;
   private String[] P077H13_A212BarSer ;
   private java.math.BigDecimal[] P077H13_A170BarKilLan ;
   private java.math.BigDecimal[] P077H13_A183BarMetLan ;
   private java.math.BigDecimal[] P077H13_A203BarPieKil ;
   private String[] P077H13_A200BarPieCod ;
   private String[] P077H14_A396EmprCod ;
   private byte[] P077H14_A5261AlrDefPri ;
   private boolean[] P077H14_n5261AlrDefPri ;
   private String[] P077H14_A2159AlbRecPie ;
   private int[] P077H14_A44AlbRecCod ;
   private short[] P077H14_A4395AlRDefCod ;
   private String[] P077H14_A4396AlRDefDsc ;
   private boolean[] P077H14_n4396AlRDefDsc ;
   private String[] P077H14_A4412AlRFasCod ;
}

final  class rclacup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P077H2", "SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacCod, MacLin FROM TXPLMACRO WHERE (EmprCod = ?) AND (MacBarCod = ?) AND (MacBarReo = ?) AND (MacBarPar = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarLocDis, BarMat, BarSer, BarCliDes, BarSerDsc, BarColNum, BarNomCli, BarColNom, BarFecSal, BarAncSal1, BarDisNum, BarNumLot FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077H4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieLzd, BarKilLan, BarMetLan, BarPieKil, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod, BarPieEst FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H6", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRPieClaM FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077H7", "SELECT EmprCod, CClCod, CClDsc FROM TXPClaCla WHERE EmprCod = ? and CClCod = ? ORDER BY EmprCod, CClCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077H8", "SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacCod, MacLin FROM TXPLMACRO WHERE (EmprCod = ? and MacCod = ?) AND (RTRIM(LTRIM(TO_CHAR(MacBarCod,'999999999'))) || RTRIM(LTRIM(TO_CHAR(MacBarReo,'999999999'))) || MacBarPar <> RTRIM(LTRIM(TO_CHAR(?,'999999999'))) || RTRIM(LTRIM(TO_CHAR(?,'999999999'))) || ?) ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H9", "SELECT T1.EmprCod, T1.AlbRecCod, T1.BarPieCod, T1.BarPieEst, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRef, T3.BarSer, T3.BarSerDsc, T3.BarColNum, T3.BarNomCli, T3.BarColNom, T1.BarKilLan, T3.BarMat, T1.BarPieLzd, T1.BarMetLan, T3.BarAncSal1, T1.BarPieIdPz, T3.BarDisNum, T3.BarNumLot FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarPieEst = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H10", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRPieClaM FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077H11", "SELECT EmprCod, CClCod, CClDsc FROM TXPClaCla WHERE EmprCod = ? and CClCod = ? ORDER BY EmprCod, CClCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077H12", "SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacCod, MacLin FROM TXPLMACRO WHERE (EmprCod = ? and MacCod = ?) AND (RTRIM(LTRIM(TO_CHAR(MacBarCod,'999999999'))) || RTRIM(LTRIM(TO_CHAR(MacBarReo,'999999999'))) || MacBarPar <> RTRIM(LTRIM(TO_CHAR(?,'999999999'))) || RTRIM(LTRIM(TO_CHAR(?,'999999999'))) || ?) ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H13", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieLzd, T2.BarLocDis, T2.BarMat, T2.BarSer, T1.BarKilLan, T1.BarMetLan, T1.BarPieKil, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077H14", "SELECT T1.EmprCod, T1.AlrDefPri, T1.AlbRecPie, T1.AlbRecCod, T1.AlRDefCod AS AlRDefCod, T2.TipDefDsc AS AlRDefDsc, T1.AlRFasCod FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) WHERE (T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ?) AND (T1.AlrDefPri = 1) ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 9);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

