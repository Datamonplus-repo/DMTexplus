package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxkardex extends GXProcedure
{
   public pxkardex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxkardex.class ), "" );
   }

   public pxkardex( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 )
   {
      pxkardex.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pxkardex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxkardex.this.AV29PrdNum = aP1[0];
      this.aP1 = aP1;
      pxkardex.this.AV19Ccstkfeci = aP2[0];
      this.aP2 = aP2;
      pxkardex.this.AV18Ccstkfecf = aP3[0];
      this.aP3 = aP3;
      pxkardex.this.AV62Filename = aP4[0];
      this.aP4 = aP4;
      pxkardex.this.AV63ErrorMessage = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25Kardex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KARDEX", ""), GXv_int2) ;
      pxkardex.this.GXt_int1 = GXv_int2[0] ;
      AV25Kardex = GXt_int1 ;
      GXt_int1 = AV54Lavanderias ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      pxkardex.this.GXt_int1 = GXv_int2[0] ;
      AV54Lavanderias = GXt_int1 ;
      GXt_int1 = AV59Nalbaran20 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int2) ;
      pxkardex.this.GXt_int1 = GXv_int2[0] ;
      AV59Nalbaran20 = GXt_int1 ;
      /* Using cursor P046N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV29PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P046N2_A719PrdNum[0] ;
         A718PrdNom = P046N2_A718PrdNom[0] ;
         AV30Producto = GXutil.trim( A719PrdNum) + "_" + GXutil.trim( A718PrdNom) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV64CellRow = 3 ;
      /* Using cursor P046N3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV29PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P046N3_A719PrdNum[0] ;
         A3915EmpNumDec = P046N3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P046N3_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P046N3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P046N3_n3915EmpNumDec[0] ;
         /* Execute user subroutine: 'SALDOINICIAL' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV61ExcelDocument.Cells(AV64CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV36Saldo)) );
         AV61ExcelDocument.Cells(AV64CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38Saldo_v)) );
         AV64CellRow = (int)(AV64CellRow+1) ;
         AV37Saldo_l = AV36Saldo ;
         /* Using cursor P046N4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, AV19Ccstkfeci, AV18Ccstkfecf});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A3348CCStkFec = P046N4_A3348CCStkFec[0] ;
            A3345TipMovCc = P046N4_A3345TipMovCc[0] ;
            A12858CCStkNAlb = P046N4_A12858CCStkNAlb[0] ;
            A3354CCStkAlb = P046N4_A3354CCStkAlb[0] ;
            A12229CCStkDoc = P046N4_A12229CCStkDoc[0] ;
            A3357CCStkDsc = P046N4_A3357CCStkDsc[0] ;
            A3353CCStkPed = P046N4_A3353CCStkPed[0] ;
            A3350CCStkBar = P046N4_A3350CCStkBar[0] ;
            A3352CCStkPar = P046N4_A3352CCStkPar[0] ;
            A3351CCStkReo = P046N4_A3351CCStkReo[0] ;
            A3356CCStkHor = P046N4_A3356CCStkHor[0] ;
            A3344CCStkCanS = P046N4_A3344CCStkCanS[0] ;
            A3349CCStkPre = P046N4_A3349CCStkPre[0] ;
            A3343CCStkCanE = P046N4_A3343CCStkCanE[0] ;
            A3342CCStkLin = P046N4_A3342CCStkLin[0] ;
            A3916ValorEI = A3343CCStkCanE.multiply(A3349CCStkPre) ;
            if ( A3915EmpNumDec == 0 )
            {
               A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 0) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 2) ;
               }
               else
               {
                  A3909ValorE = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3917ValorSI = A3344CCStkCanS.multiply(A3349CCStkPre) ;
            if ( A3915EmpNumDec == 0 )
            {
               A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 0) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 2) ;
               }
               else
               {
                  A3910ValorS = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "CD", "")) != 0 )
            {
               if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EC", "")) != 0 )
               {
                  AV8Texto = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  AV61ExcelDocument.Cells(AV64CellRow, 1, 1, 1).setText( AV8Texto );
                  AV52Barpie = 0 ;
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EI", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "AD", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 ) )
                  {
                     AV60CCstkNalb = ((AV59Nalbaran20==0) ? A3354CCStkAlb : A12858CCStkNAlb) ;
                     AV8Texto = ((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EI", ""))==0)&&(GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Disolucion Auxiliares", ""))==0) ? GXutil.trim( GXutil.str( A12229CCStkDoc, 10, 0)) : AV60CCstkNalb) ;
                     AV61ExcelDocument.Cells(AV64CellRow, 2, 1, 1).setText( AV8Texto );
                     AV8Texto = ((A3353CCStkPed>0) ? GXutil.str( A3353CCStkPed, 8, 0) : "") ;
                     AV61ExcelDocument.Cells(AV64CellRow, 3, 1, 1).setText( AV8Texto );
                  }
                  else
                  {
                     AV24Hdr = " " ;
                     if ( A3350CCStkBar > 0 )
                     {
                        AV24Hdr = GXutil.str( A3350CCStkBar, 8, 0) + "-" + GXutil.str( A3351CCStkReo, 1, 0) + A3352CCStkPar ;
                        AV49CCStkBar = A3350CCStkBar ;
                        AV50CCStkReo = A3351CCStkReo ;
                        AV51CCStkPar = A3352CCStkPar ;
                        /* Execute user subroutine: 'BARCAD' */
                        S131 ();
                        if ( returnInSub )
                        {
                           pr_default.close(2);
                           pr_default.close(1);
                           pr_default.close(1);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SI", "")) == 0 ) )
                     {
                        AV8Texto = ((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0) ? GXutil.str( A3353CCStkPed, 8, 0) : GXutil.trim( GXutil.str( A12229CCStkDoc, 10, 0))) ;
                        AV61ExcelDocument.Cells(AV64CellRow, 3, 1, 1).setText( AV8Texto );
                     }
                     else
                     {
                        AV8Texto = AV24Hdr ;
                        AV61ExcelDocument.Cells(AV64CellRow, 2, 1, 1).setText( AV8Texto );
                        if ( AV54Lavanderias == 1 )
                        {
                           AV8Texto = GXutil.str( AV52Barpie, 6, 0) ;
                        }
                        else
                        {
                           AV8Texto = GXutil.str( AV53BarKgm, 9, 2) ;
                        }
                        AV61ExcelDocument.Cells(AV64CellRow, 4, 1, 1).setText( AV8Texto );
                     }
                  }
                  AV8Texto = A3357CCStkDsc ;
                  AV61ExcelDocument.Cells(AV64CellRow, 5, 1, 1).setText( AV8Texto );
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) && ( AV25Kardex == 1 ) )
                  {
                     AV35Recfec = A3348CCStkFec ;
                     /* Execute user subroutine: 'RECUEN' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(1);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     if ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Recuento de Almacen           ", "")) == 0 )
                     {
                        AV37Saldo_l = AV32Recexirea ;
                     }
                     if ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Recuento de CC                ", "")) == 0 )
                     {
                        AV37Saldo_l = AV37Saldo_l.add(AV31RecExiRcc) ;
                     }
                     AV20Ccstkpre = A3349CCStkPre ;
                  }
                  else
                  {
                     AV8Texto = GXutil.str( A3343CCStkCanE, 12, 4) ;
                     AV61ExcelDocument.Cells(AV64CellRow, 6, 1, 1).setText( AV8Texto );
                     AV20Ccstkpre = A3349CCStkPre ;
                     if ( A3344CCStkCanS.doubleValue() > 0 )
                     {
                        AV20Ccstkpre = DecimalUtil.doubleToDec(0) ;
                     }
                     AV8Texto = GXutil.str( AV20Ccstkpre, 14, 5) ;
                     AV61ExcelDocument.Cells(AV64CellRow, 7, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.str( A3909ValorE, 11, 2) ;
                     AV61ExcelDocument.Cells(AV64CellRow, 8, 1, 1).setText( AV8Texto );
                     if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Envio a CC, Sobrante", "")) == 0 )
                     {
                     }
                     else
                     {
                        AV8Texto = GXutil.str( A3344CCStkCanS, 12, 4) ;
                        AV61ExcelDocument.Cells(AV64CellRow, 9, 1, 1).setText( AV8Texto );
                     }
                     AV20Ccstkpre = A3349CCStkPre ;
                     if ( A3343CCStkCanE.doubleValue() > 0 )
                     {
                        AV20Ccstkpre = DecimalUtil.doubleToDec(0) ;
                     }
                     AV8Texto = GXutil.str( AV20Ccstkpre, 14, 5) ;
                     AV61ExcelDocument.Cells(AV64CellRow, 10, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.str( A3910ValorS, 12, 2) ;
                     AV61ExcelDocument.Cells(AV64CellRow, 11, 1, 1).setText( AV8Texto );
                     AV37Saldo_l = AV37Saldo_l.add(A3343CCStkCanE) ;
                     if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Envio a CC, Sobrante", "")) == 0 )
                     {
                     }
                     else
                     {
                        AV37Saldo_l = AV37Saldo_l.subtract(A3344CCStkCanS) ;
                     }
                  }
                  AV8Texto = GXutil.str( AV37Saldo_l, 12, 4) ;
                  if ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Recuento de Almacen           ", "")) == 0 )
                  {
                     AV8Texto = GXutil.str( AV32Recexirea, 12, 4) ;
                  }
                  if ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Recuento de CC                ", "")) == 0 )
                  {
                     AV8Texto = GXutil.str( AV31RecExiRcc, 12, 4) ;
                  }
                  AV61ExcelDocument.Cells(AV64CellRow, 12, 1, 1).setText( AV8Texto );
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) && ( AV25Kardex == 1 ) )
                  {
                     AV38Saldo_v = AV37Saldo_l.multiply(AV20Ccstkpre) ;
                     AV20Ccstkpre = A3349CCStkPre ;
                  }
                  else
                  {
                     if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Envio a CC, Sobrante", "")) == 0 )
                     {
                        AV38Saldo_v = AV38Saldo_v.add(((A3909ValorE))) ;
                     }
                     else
                     {
                        AV38Saldo_v = AV38Saldo_v.add(((A3909ValorE.subtract(A3910ValorS)))) ;
                     }
                     AV20Ccstkpre = A3349CCStkPre ;
                     AV38Saldo_v = AV37Saldo_l.multiply(AV20Ccstkpre) ;
                  }
                  AV8Texto = GXutil.str( AV20Ccstkpre, 14, 5) ;
                  AV61ExcelDocument.Cells(AV64CellRow, 13, 1, 1).setText( AV8Texto );
                  AV8Texto = GXutil.str( AV38Saldo_v, 11, 2) ;
                  AV61ExcelDocument.Cells(AV64CellRow, 14, 1, 1).setText( AV8Texto );
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) && ( AV25Kardex == 1 ) )
                  {
                  }
                  else
                  {
                     AV21Entradas = AV21Entradas.add(A3343CCStkCanE) ;
                     if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Envio a CC, Sobrante", "")) == 0 )
                     {
                     }
                     else
                     {
                        AV39Salidas = AV39Salidas.add(A3344CCStkCanS) ;
                     }
                     AV40Valore = AV40Valore.add(A3909ValorE) ;
                     if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Envio a CC, Sobrante", "")) == 0 )
                     {
                     }
                     else
                     {
                        AV42Valors = AV42Valors.add(A3910ValorS) ;
                     }
                  }
                  AV64CellRow = (int)(AV64CellRow+1) ;
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV64CellRow = (int)(AV64CellRow+2) ;
      AV8Texto = GXutil.str( AV21Entradas, 12, 4) ;
      AV61ExcelDocument.Cells(AV64CellRow, 6, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV40Valore, 11, 2) ;
      AV61ExcelDocument.Cells(AV64CellRow, 8, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV39Salidas, 12, 4) ;
      AV61ExcelDocument.Cells(AV64CellRow, 9, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV42Valors, 12, 2) ;
      AV61ExcelDocument.Cells(AV64CellRow, 11, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV37Saldo_l, 12, 4) ;
      AV61ExcelDocument.Cells(AV64CellRow, 12, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV38Saldo_v, 11, 2) ;
      AV61ExcelDocument.Cells(AV64CellRow, 14, 1, 1).setText( AV8Texto );
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SALDOINICIAL' Routine */
      returnInSub = false ;
      AV44Recfec1 = GXutil.nullDate() ;
      AV47Ccstklin = 0 ;
      /* Using cursor P046N5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV29PrdNum, AV19Ccstkfeci});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P046N5_A719PrdNum[0] ;
         A3345TipMovCc = P046N5_A3345TipMovCc[0] ;
         A3348CCStkFec = P046N5_A3348CCStkFec[0] ;
         A3342CCStkLin = P046N5_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV44Recfec1 = A3348CCStkFec ;
            AV47Ccstklin = A3342CCStkLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV47Ccstklin > 0 )
      {
         AV45Exiteo = DecimalUtil.doubleToDec(0) ;
         AV46PreRec = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P046N6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV29PrdNum, AV44Recfec1});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A810RecFec = P046N6_A810RecFec[0] ;
            A719PrdNum = P046N6_A719PrdNum[0] ;
            A807RecExiRea = P046N6_A807RecExiRea[0] ;
            A809RecExiTeo = P046N6_A809RecExiTeo[0] ;
            A6573RecPreRec = P046N6_A6573RecPreRec[0] ;
            if ( ( A809RecExiTeo.doubleValue() > 0 ) && ( A807RecExiRea.doubleValue() == 0 ) )
            {
               AV45Exiteo = A809RecExiTeo ;
            }
            if ( A807RecExiRea.doubleValue() > 0 )
            {
               AV45Exiteo = A807RecExiRea ;
            }
            AV46PreRec = A6573RecPreRec ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      AV16CCStkCanE = DecimalUtil.doubleToDec(0) ;
      AV17CCStkCanS = DecimalUtil.doubleToDec(0) ;
      AV36Saldo = DecimalUtil.doubleToDec(0) ;
      AV41ValoreI = DecimalUtil.doubleToDec(0) ;
      AV43ValorSF = DecimalUtil.doubleToDec(0) ;
      if ( AV47Ccstklin > 0 )
      {
         AV16CCStkCanE = AV45Exiteo ;
         AV41ValoreI = GXutil.roundDecimal( AV16CCStkCanE.multiply(AV46PreRec), 2) ;
         AV48PrimeraLec = (byte)(0) ;
         AV58CCstkfec = GXutil.nullDate() ;
         /* Using cursor P046N7 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV29PrdNum, Long.valueOf(AV47Ccstklin), AV19Ccstkfeci});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A3348CCStkFec = P046N7_A3348CCStkFec[0] ;
            A3342CCStkLin = P046N7_A3342CCStkLin[0] ;
            A719PrdNum = P046N7_A719PrdNum[0] ;
            A3345TipMovCc = P046N7_A3345TipMovCc[0] ;
            A3343CCStkCanE = P046N7_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P046N7_A3344CCStkCanS[0] ;
            A3349CCStkPre = P046N7_A3349CCStkPre[0] ;
            if ( ( AV48PrimeraLec == 0 ) && ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) )
            {
               AV48PrimeraLec = (byte)(1) ;
            }
            else
            {
               if ( DecimalUtil.compareTo(A3344CCStkCanS, A3343CCStkCanE) == 0 )
               {
                  if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "CC", "")) == 0 )
                  {
                     AV17CCStkCanS = AV17CCStkCanS.add(A3344CCStkCanS) ;
                     AV43ValorSF = AV43ValorSF.add((GXutil.roundDecimal( AV17CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                  }
                  if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "CD", "")) == 0 )
                  {
                  }
               }
               else
               {
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EI", "")) == 0 ) )
                  {
                     AV16CCStkCanE = AV16CCStkCanE.add(A3343CCStkCanE) ;
                     AV41ValoreI = AV41ValoreI.add((GXutil.roundDecimal( A3343CCStkCanE.multiply(A3349CCStkPre), 2))) ;
                  }
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SI", "")) == 0 ) )
                  {
                     AV17CCStkCanS = AV17CCStkCanS.add(A3344CCStkCanS) ;
                     AV43ValorSF = AV43ValorSF.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                  }
               }
            }
            AV58CCstkfec = A3348CCStkFec ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      else
      {
         AV58CCstkfec = GXutil.nullDate() ;
         /* Using cursor P046N8 */
         pr_default.execute(6, new Object[] {A396EmprCod, AV29PrdNum, AV19Ccstkfeci});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A3348CCStkFec = P046N8_A3348CCStkFec[0] ;
            A719PrdNum = P046N8_A719PrdNum[0] ;
            A3343CCStkCanE = P046N8_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P046N8_A3344CCStkCanS[0] ;
            A3349CCStkPre = P046N8_A3349CCStkPre[0] ;
            A3342CCStkLin = P046N8_A3342CCStkLin[0] ;
            AV16CCStkCanE = AV16CCStkCanE.add(A3343CCStkCanE) ;
            AV17CCStkCanS = AV17CCStkCanS.add(A3344CCStkCanS) ;
            AV41ValoreI = AV41ValoreI.add((GXutil.roundDecimal( A3343CCStkCanE.multiply(A3349CCStkPre), 2))) ;
            AV43ValorSF = AV43ValorSF.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
            AV58CCstkfec = A3348CCStkFec ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      AV36Saldo = AV16CCStkCanE.subtract(AV17CCStkCanS) ;
      AV38Saldo_v = AV41ValoreI.subtract(AV43ValorSF) ;
   }

   public void S121( )
   {
      /* 'RECUEN' Routine */
      returnInSub = false ;
      AV34Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV32Recexirea = DecimalUtil.doubleToDec(0) ;
      AV33recExiTcc = DecimalUtil.doubleToDec(0) ;
      AV31RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P046N9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV29PrdNum, AV35Recfec});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A810RecFec = P046N9_A810RecFec[0] ;
         A719PrdNum = P046N9_A719PrdNum[0] ;
         A809RecExiTeo = P046N9_A809RecExiTeo[0] ;
         A807RecExiRea = P046N9_A807RecExiRea[0] ;
         A808RecExiTcc = P046N9_A808RecExiTcc[0] ;
         A806RecExiRcc = P046N9_A806RecExiRcc[0] ;
         AV34Recexiteo = A809RecExiTeo ;
         AV32Recexirea = A807RecExiRea ;
         AV33recExiTcc = A808RecExiTcc ;
         AV31RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV52Barpie = 0 ;
      AV53BarKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P046N11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV49CCStkBar), Byte.valueOf(AV50CCStkReo), AV51CCStkPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P046N11_A130BarCodPar[0] ;
         A132BarCodReo = P046N11_A132BarCodReo[0] ;
         A129BarCod = P046N11_A129BarCod[0] ;
         A166BarKgm = P046N11_A166BarKgm[0] ;
         A199BarPie1 = P046N11_A199BarPie1[0] ;
         A365DisDes = P046N11_A365DisDes[0] ;
         A898BarPieNDes = P046N11_A898BarPieNDes[0] ;
         A166BarKgm = P046N11_A166BarKgm[0] ;
         A199BarPie1 = P046N11_A199BarPie1[0] ;
         A898BarPieNDes = P046N11_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV52Barpie = A198BarPie ;
         AV53BarKgm = A166BarKgm ;
         /* Using cursor P046N12 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A119BarAgrCod = P046N12_A119BarAgrCod[0] ;
            A124BarAgrReo = P046N12_A124BarAgrReo[0] ;
            A122BarAgrPar = P046N12_A122BarAgrPar[0] ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A119BarAgrCod ;
            GXv_int2[0] = A124BarAgrReo ;
            GXv_char5[0] = A122BarAgrPar ;
            GXv_decimal6[0] = AV55Kgs ;
            GXv_decimal7[0] = AV56Mts ;
            GXv_int8[0] = AV57Pzs ;
            new app.pkgmtpz(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_int8) ;
            pxkardex.this.A396EmprCod = GXv_char3[0] ;
            pxkardex.this.A119BarAgrCod = GXv_int4[0] ;
            pxkardex.this.A124BarAgrReo = GXv_int2[0] ;
            pxkardex.this.A122BarAgrPar = GXv_char5[0] ;
            pxkardex.this.AV55Kgs = GXv_decimal6[0] ;
            pxkardex.this.AV56Mts = GXv_decimal7[0] ;
            pxkardex.this.AV57Pzs = GXv_int8[0] ;
            AV53BarKgm = AV53BarKgm.add(AV55Kgs) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S141( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV65Random = (int)(GXutil.random( )*10000) ;
      AV62Filename = "KardexporOpcion1_" + GXutil.trim( AV30Producto) + httpContext.getMessage( "_Export-", "") + GXutil.trim( GXutil.str( AV65Random, 8, 0)) + ".xlsx" ;
      AV62Filename = GXutil.strReplace( AV62Filename, " ", "_") ;
      AV62Filename = GXutil.strReplace( AV62Filename, "__", "_") ;
      AV62Filename = GXutil.strReplace( AV62Filename, "#", "_") ;
      AV61ExcelDocument.Open(AV62Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV61ExcelDocument.Clear();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV61ExcelDocument.getErrCode() != 0 )
      {
         AV62Filename = "" ;
         AV63ErrorMessage = AV61ExcelDocument.getErrDescription() ;
         AV61ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV61ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV61ExcelDocument.Close();
   }

   public void S171( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV61ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Periodo ", "")+GXutil.trim( localUtil.dtoc( AV19Ccstkfeci, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+" "+GXutil.trim( localUtil.dtoc( AV18Ccstkfecf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
      AV61ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Ingresos", "") );
      AV61ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Egresos", "") );
      AV61ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Saldo", "") );
      AV61ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV61ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV61ExcelDocument.Cells(1, 6, 1, 1).setBold( (short)(1) );
      AV61ExcelDocument.Cells(1, 6, 1, 1).setColor( 11 );
      AV61ExcelDocument.Cells(1, 9, 1, 1).setBold( (short)(1) );
      AV61ExcelDocument.Cells(1, 9, 1, 1).setColor( 11 );
      AV61ExcelDocument.Cells(1, 12, 1, 1).setBold( (short)(1) );
      AV61ExcelDocument.Cells(1, 12, 1, 1).setColor( 11 );
      AV61ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV61ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Doc/Ref", "") );
      AV61ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Pedido", "") );
      AV61ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV61ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Detalle", "") );
      AV61ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV61ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV61ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV61ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV61ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV61ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV61ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV61ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV61ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV14i = 1 ;
      while ( AV14i <= 20 )
      {
         AV61ExcelDocument.Cells(2, AV14i, 1, 1).setBold( (short)(1) );
         AV61ExcelDocument.Cells(2, AV14i, 1, 1).setColor( 11 );
         AV14i = (int)(AV14i+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxkardex.this.A396EmprCod;
      this.aP1[0] = pxkardex.this.AV29PrdNum;
      this.aP2[0] = pxkardex.this.AV19Ccstkfeci;
      this.aP3[0] = pxkardex.this.AV18Ccstkfecf;
      this.aP4[0] = pxkardex.this.AV62Filename;
      this.aP5[0] = pxkardex.this.AV63ErrorMessage;
      CloseOpenCursors();
      AV61ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P046N2_A396EmprCod = new String[] {""} ;
      P046N2_A719PrdNum = new String[] {""} ;
      P046N2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV30Producto = "" ;
      P046N3_A396EmprCod = new String[] {""} ;
      P046N3_A719PrdNum = new String[] {""} ;
      P046N3_A3915EmpNumDec = new byte[1] ;
      P046N3_n3915EmpNumDec = new boolean[] {false} ;
      AV61ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV36Saldo = DecimalUtil.ZERO ;
      AV38Saldo_v = DecimalUtil.ZERO ;
      AV37Saldo_l = DecimalUtil.ZERO ;
      P046N4_A396EmprCod = new String[] {""} ;
      P046N4_A719PrdNum = new String[] {""} ;
      P046N4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P046N4_A3345TipMovCc = new String[] {""} ;
      P046N4_A12858CCStkNAlb = new String[] {""} ;
      P046N4_A3354CCStkAlb = new String[] {""} ;
      P046N4_A12229CCStkDoc = new long[1] ;
      P046N4_A3357CCStkDsc = new String[] {""} ;
      P046N4_A3353CCStkPed = new int[1] ;
      P046N4_A3350CCStkBar = new int[1] ;
      P046N4_A3352CCStkPar = new String[] {""} ;
      P046N4_A3351CCStkReo = new byte[1] ;
      P046N4_A3356CCStkHor = new String[] {""} ;
      P046N4_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N4_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N4_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N4_A3342CCStkLin = new long[1] ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A12858CCStkNAlb = "" ;
      A3354CCStkAlb = "" ;
      A3357CCStkDsc = "" ;
      A3352CCStkPar = "" ;
      A3356CCStkHor = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      AV8Texto = "" ;
      AV60CCstkNalb = "" ;
      AV24Hdr = "" ;
      AV51CCStkPar = "" ;
      AV53BarKgm = DecimalUtil.ZERO ;
      AV35Recfec = GXutil.nullDate() ;
      AV32Recexirea = DecimalUtil.ZERO ;
      AV31RecExiRcc = DecimalUtil.ZERO ;
      AV20Ccstkpre = DecimalUtil.ZERO ;
      AV21Entradas = DecimalUtil.ZERO ;
      AV39Salidas = DecimalUtil.ZERO ;
      AV40Valore = DecimalUtil.ZERO ;
      AV42Valors = DecimalUtil.ZERO ;
      AV44Recfec1 = GXutil.nullDate() ;
      P046N5_A396EmprCod = new String[] {""} ;
      P046N5_A719PrdNum = new String[] {""} ;
      P046N5_A3345TipMovCc = new String[] {""} ;
      P046N5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P046N5_A3342CCStkLin = new long[1] ;
      AV45Exiteo = DecimalUtil.ZERO ;
      AV46PreRec = DecimalUtil.ZERO ;
      P046N6_A396EmprCod = new String[] {""} ;
      P046N6_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P046N6_A719PrdNum = new String[] {""} ;
      P046N6_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N6_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N6_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      AV16CCStkCanE = DecimalUtil.ZERO ;
      AV17CCStkCanS = DecimalUtil.ZERO ;
      AV41ValoreI = DecimalUtil.ZERO ;
      AV43ValorSF = DecimalUtil.ZERO ;
      AV58CCstkfec = GXutil.nullDate() ;
      P046N7_A396EmprCod = new String[] {""} ;
      P046N7_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P046N7_A3342CCStkLin = new long[1] ;
      P046N7_A719PrdNum = new String[] {""} ;
      P046N7_A3345TipMovCc = new String[] {""} ;
      P046N7_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N7_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N7_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N8_A396EmprCod = new String[] {""} ;
      P046N8_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P046N8_A719PrdNum = new String[] {""} ;
      P046N8_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N8_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N8_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N8_A3342CCStkLin = new long[1] ;
      AV34Recexiteo = DecimalUtil.ZERO ;
      AV33recExiTcc = DecimalUtil.ZERO ;
      P046N9_A396EmprCod = new String[] {""} ;
      P046N9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P046N9_A719PrdNum = new String[] {""} ;
      P046N9_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N9_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N9_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N9_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      P046N11_A396EmprCod = new String[] {""} ;
      P046N11_A130BarCodPar = new String[] {""} ;
      P046N11_A132BarCodReo = new byte[1] ;
      P046N11_A129BarCod = new int[1] ;
      P046N11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046N11_A199BarPie1 = new short[1] ;
      P046N11_A365DisDes = new String[] {""} ;
      P046N11_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P046N12_A396EmprCod = new String[] {""} ;
      P046N12_A129BarCod = new int[1] ;
      P046N12_A132BarCodReo = new byte[1] ;
      P046N12_A130BarCodPar = new String[] {""} ;
      P046N12_A119BarAgrCod = new int[1] ;
      P046N12_A124BarAgrReo = new byte[1] ;
      P046N12_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      AV55Kgs = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV56Mts = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxkardex__default(),
         new Object[] {
             new Object[] {
            P046N2_A396EmprCod, P046N2_A719PrdNum, P046N2_A718PrdNom
            }
            , new Object[] {
            P046N3_A396EmprCod, P046N3_A719PrdNum, P046N3_A3915EmpNumDec, P046N3_n3915EmpNumDec
            }
            , new Object[] {
            P046N4_A396EmprCod, P046N4_A719PrdNum, P046N4_A3348CCStkFec, P046N4_A3345TipMovCc, P046N4_A12858CCStkNAlb, P046N4_A3354CCStkAlb, P046N4_A12229CCStkDoc, P046N4_A3357CCStkDsc, P046N4_A3353CCStkPed, P046N4_A3350CCStkBar,
            P046N4_A3352CCStkPar, P046N4_A3351CCStkReo, P046N4_A3356CCStkHor, P046N4_A3344CCStkCanS, P046N4_A3349CCStkPre, P046N4_A3343CCStkCanE, P046N4_A3342CCStkLin
            }
            , new Object[] {
            P046N5_A396EmprCod, P046N5_A719PrdNum, P046N5_A3345TipMovCc, P046N5_A3348CCStkFec, P046N5_A3342CCStkLin
            }
            , new Object[] {
            P046N6_A396EmprCod, P046N6_A810RecFec, P046N6_A719PrdNum, P046N6_A807RecExiRea, P046N6_A809RecExiTeo, P046N6_A6573RecPreRec
            }
            , new Object[] {
            P046N7_A396EmprCod, P046N7_A3348CCStkFec, P046N7_A3342CCStkLin, P046N7_A719PrdNum, P046N7_A3345TipMovCc, P046N7_A3343CCStkCanE, P046N7_A3344CCStkCanS, P046N7_A3349CCStkPre
            }
            , new Object[] {
            P046N8_A396EmprCod, P046N8_A3348CCStkFec, P046N8_A719PrdNum, P046N8_A3343CCStkCanE, P046N8_A3344CCStkCanS, P046N8_A3349CCStkPre, P046N8_A3342CCStkLin
            }
            , new Object[] {
            P046N9_A396EmprCod, P046N9_A810RecFec, P046N9_A719PrdNum, P046N9_A809RecExiTeo, P046N9_A807RecExiRea, P046N9_A808RecExiTcc, P046N9_A806RecExiRcc
            }
            , new Object[] {
            P046N11_A396EmprCod, P046N11_A130BarCodPar, P046N11_A132BarCodReo, P046N11_A129BarCod, P046N11_A166BarKgm, P046N11_A199BarPie1, P046N11_A365DisDes, P046N11_A898BarPieNDes
            }
            , new Object[] {
            P046N12_A396EmprCod, P046N12_A129BarCod, P046N12_A132BarCodReo, P046N12_A130BarCodPar, P046N12_A119BarAgrCod, P046N12_A124BarAgrReo, P046N12_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Kardex ;
   private byte AV54Lavanderias ;
   private byte AV59Nalbaran20 ;
   private byte GXt_int1 ;
   private byte A3915EmpNumDec ;
   private byte A3351CCStkReo ;
   private byte AV50CCStkReo ;
   private byte AV48PrimeraLec ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int2[] ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV64CellRow ;
   private int A3353CCStkPed ;
   private int A3350CCStkBar ;
   private int AV52Barpie ;
   private int AV49CCStkBar ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A119BarAgrCod ;
   private int GXv_int4[] ;
   private int AV57Pzs ;
   private int GXv_int8[] ;
   private int AV65Random ;
   private int AV14i ;
   private long A12229CCStkDoc ;
   private long A3342CCStkLin ;
   private long AV47Ccstklin ;
   private java.math.BigDecimal AV36Saldo ;
   private java.math.BigDecimal AV38Saldo_v ;
   private java.math.BigDecimal AV37Saldo_l ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal AV53BarKgm ;
   private java.math.BigDecimal AV32Recexirea ;
   private java.math.BigDecimal AV31RecExiRcc ;
   private java.math.BigDecimal AV20Ccstkpre ;
   private java.math.BigDecimal AV21Entradas ;
   private java.math.BigDecimal AV39Salidas ;
   private java.math.BigDecimal AV40Valore ;
   private java.math.BigDecimal AV42Valors ;
   private java.math.BigDecimal AV45Exiteo ;
   private java.math.BigDecimal AV46PreRec ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV16CCStkCanE ;
   private java.math.BigDecimal AV17CCStkCanS ;
   private java.math.BigDecimal AV41ValoreI ;
   private java.math.BigDecimal AV43ValorSF ;
   private java.math.BigDecimal AV34Recexiteo ;
   private java.math.BigDecimal AV33recExiTcc ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV55Kgs ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV56Mts ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String AV29PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV30Producto ;
   private String A3345TipMovCc ;
   private String A12858CCStkNAlb ;
   private String A3354CCStkAlb ;
   private String A3357CCStkDsc ;
   private String A3352CCStkPar ;
   private String A3356CCStkHor ;
   private String AV8Texto ;
   private String AV60CCstkNalb ;
   private String AV24Hdr ;
   private String AV51CCStkPar ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A122BarAgrPar ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private java.util.Date AV19Ccstkfeci ;
   private java.util.Date AV18Ccstkfecf ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV35Recfec ;
   private java.util.Date AV44Recfec1 ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV58CCstkfec ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private String AV62Filename ;
   private String AV63ErrorMessage ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P046N2_A396EmprCod ;
   private String[] P046N2_A719PrdNum ;
   private String[] P046N2_A718PrdNom ;
   private String[] P046N3_A396EmprCod ;
   private String[] P046N3_A719PrdNum ;
   private byte[] P046N3_A3915EmpNumDec ;
   private boolean[] P046N3_n3915EmpNumDec ;
   private String[] P046N4_A396EmprCod ;
   private String[] P046N4_A719PrdNum ;
   private java.util.Date[] P046N4_A3348CCStkFec ;
   private String[] P046N4_A3345TipMovCc ;
   private String[] P046N4_A12858CCStkNAlb ;
   private String[] P046N4_A3354CCStkAlb ;
   private long[] P046N4_A12229CCStkDoc ;
   private String[] P046N4_A3357CCStkDsc ;
   private int[] P046N4_A3353CCStkPed ;
   private int[] P046N4_A3350CCStkBar ;
   private String[] P046N4_A3352CCStkPar ;
   private byte[] P046N4_A3351CCStkReo ;
   private String[] P046N4_A3356CCStkHor ;
   private java.math.BigDecimal[] P046N4_A3344CCStkCanS ;
   private java.math.BigDecimal[] P046N4_A3349CCStkPre ;
   private java.math.BigDecimal[] P046N4_A3343CCStkCanE ;
   private long[] P046N4_A3342CCStkLin ;
   private String[] P046N5_A396EmprCod ;
   private String[] P046N5_A719PrdNum ;
   private String[] P046N5_A3345TipMovCc ;
   private java.util.Date[] P046N5_A3348CCStkFec ;
   private long[] P046N5_A3342CCStkLin ;
   private String[] P046N6_A396EmprCod ;
   private java.util.Date[] P046N6_A810RecFec ;
   private String[] P046N6_A719PrdNum ;
   private java.math.BigDecimal[] P046N6_A807RecExiRea ;
   private java.math.BigDecimal[] P046N6_A809RecExiTeo ;
   private java.math.BigDecimal[] P046N6_A6573RecPreRec ;
   private String[] P046N7_A396EmprCod ;
   private java.util.Date[] P046N7_A3348CCStkFec ;
   private long[] P046N7_A3342CCStkLin ;
   private String[] P046N7_A719PrdNum ;
   private String[] P046N7_A3345TipMovCc ;
   private java.math.BigDecimal[] P046N7_A3343CCStkCanE ;
   private java.math.BigDecimal[] P046N7_A3344CCStkCanS ;
   private java.math.BigDecimal[] P046N7_A3349CCStkPre ;
   private String[] P046N8_A396EmprCod ;
   private java.util.Date[] P046N8_A3348CCStkFec ;
   private String[] P046N8_A719PrdNum ;
   private java.math.BigDecimal[] P046N8_A3343CCStkCanE ;
   private java.math.BigDecimal[] P046N8_A3344CCStkCanS ;
   private java.math.BigDecimal[] P046N8_A3349CCStkPre ;
   private long[] P046N8_A3342CCStkLin ;
   private String[] P046N9_A396EmprCod ;
   private java.util.Date[] P046N9_A810RecFec ;
   private String[] P046N9_A719PrdNum ;
   private java.math.BigDecimal[] P046N9_A809RecExiTeo ;
   private java.math.BigDecimal[] P046N9_A807RecExiRea ;
   private java.math.BigDecimal[] P046N9_A808RecExiTcc ;
   private java.math.BigDecimal[] P046N9_A806RecExiRcc ;
   private String[] P046N11_A396EmprCod ;
   private String[] P046N11_A130BarCodPar ;
   private byte[] P046N11_A132BarCodReo ;
   private int[] P046N11_A129BarCod ;
   private java.math.BigDecimal[] P046N11_A166BarKgm ;
   private short[] P046N11_A199BarPie1 ;
   private String[] P046N11_A365DisDes ;
   private int[] P046N11_A898BarPieNDes ;
   private String[] P046N12_A396EmprCod ;
   private int[] P046N12_A129BarCod ;
   private byte[] P046N12_A132BarCodReo ;
   private String[] P046N12_A130BarCodPar ;
   private int[] P046N12_A119BarAgrCod ;
   private byte[] P046N12_A124BarAgrReo ;
   private String[] P046N12_A122BarAgrPar ;
   private com.genexus.gxoffice.ExcelDoc AV61ExcelDocument ;
}

final  class pxkardex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P046N2", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046N3", "SELECT T1.EmprCod, T1.PrdNum, T2.EmpNumDec FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046N4", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkNAlb, CCStkAlb, CCStkDoc, CCStkDsc, CCStkPed, CCStkBar, CCStkPar, CCStkReo, CCStkHor, CCStkCanS, CCStkPre, CCStkCanE, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P046N5", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec < ? ORDER BY EmprCod, PrdNum, CCStkFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P046N6", "SELECT EmprCod, RecFec, PrdNum, RecExiRea, RecExiTeo, RecPreRec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046N7", "SELECT EmprCod, CCStkFec, CCStkLin, PrdNum, TipMovCc, CCStkCanE, CCStkCanS, CCStkPre FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkLin > ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P046N8", "SELECT EmprCod, CCStkFec, PrdNum, CCStkCanE, CCStkCanS, CCStkPre, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P046N9", "SELECT EmprCod, RecFec, PrdNum, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046N11", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046N12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,4);
               ((long[]) buf[16])[0] = rslt.getLong(17);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

