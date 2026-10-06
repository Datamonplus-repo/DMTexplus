package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phtmlkardex extends GXProcedure
{
   public phtmlkardex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phtmlkardex.class ), "" );
   }

   public phtmlkardex( int remoteHandle ,
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
      phtmlkardex.this.aP5 = new String[] {""};
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
      phtmlkardex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phtmlkardex.this.AV29PrdNum = aP1[0];
      this.aP1 = aP1;
      phtmlkardex.this.AV19Ccstkfeci = aP2[0];
      this.aP2 = aP2;
      phtmlkardex.this.AV18Ccstkfecf = aP3[0];
      this.aP3 = aP3;
      phtmlkardex.this.AV66Filename = aP4[0];
      this.aP4 = aP4;
      phtmlkardex.this.AV67ErrorMessage = aP5[0];
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
      phtmlkardex.this.GXt_int1 = GXv_int2[0] ;
      AV25Kardex = GXt_int1 ;
      GXt_int1 = AV54Lavanderias ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      phtmlkardex.this.GXt_int1 = GXv_int2[0] ;
      AV54Lavanderias = GXt_int1 ;
      GXt_int1 = AV64Nalbaran20 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int2) ;
      phtmlkardex.this.GXt_int1 = GXv_int2[0] ;
      AV64Nalbaran20 = GXt_int1 ;
      /* Using cursor P04S42 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV29PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P04S42_A719PrdNum[0] ;
         A718PrdNom = P04S42_A718PrdNom[0] ;
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
      AV68CellRow = 3 ;
      /* Using cursor P04S43 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV29PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P04S43_A719PrdNum[0] ;
         A3915EmpNumDec = P04S43_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P04S43_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P04S43_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P04S43_n3915EmpNumDec[0] ;
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
         AV65ExcelDocument.Cells(AV68CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV36Saldo)) );
         AV65ExcelDocument.Cells(AV68CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38Saldo_v)) );
         AV68CellRow = (int)(AV68CellRow+1) ;
         AV37Saldo_l = AV36Saldo ;
         /* Using cursor P04S44 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, AV19Ccstkfeci, AV18Ccstkfecf});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A3348CCStkFec = P04S44_A3348CCStkFec[0] ;
            A3345TipMovCc = P04S44_A3345TipMovCc[0] ;
            A12858CCStkNAlb = P04S44_A12858CCStkNAlb[0] ;
            A3354CCStkAlb = P04S44_A3354CCStkAlb[0] ;
            A12229CCStkDoc = P04S44_A12229CCStkDoc[0] ;
            A3357CCStkDsc = P04S44_A3357CCStkDsc[0] ;
            A3350CCStkBar = P04S44_A3350CCStkBar[0] ;
            A3352CCStkPar = P04S44_A3352CCStkPar[0] ;
            A3351CCStkReo = P04S44_A3351CCStkReo[0] ;
            A3353CCStkPed = P04S44_A3353CCStkPed[0] ;
            A3344CCStkCanS = P04S44_A3344CCStkCanS[0] ;
            A3349CCStkPre = P04S44_A3349CCStkPre[0] ;
            A3343CCStkCanE = P04S44_A3343CCStkCanE[0] ;
            A3342CCStkLin = P04S44_A3342CCStkLin[0] ;
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
                  AV65ExcelDocument.Cells(AV68CellRow, 1, 1, 1).setText( AV8Texto );
                  AV52Barpie = 0 ;
                  if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EI", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "AD", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 ) )
                  {
                     AV63CCstkNalb = ((AV64Nalbaran20==0) ? A3354CCStkAlb : A12858CCStkNAlb) ;
                     AV8Texto = ((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EI", ""))==0)&&(GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Disolucion Auxiliares", ""))==0) ? GXutil.trim( GXutil.str( A12229CCStkDoc, 10, 0)) : AV63CCstkNalb) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 2, 1, 1).setText( AV8Texto );
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
                        AV8Texto = ((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SI", ""))==0) ? GXutil.trim( GXutil.str( A12229CCStkDoc, 10, 0)) : ((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)&&GXutil.like(A3357CCStkDsc,GXutil.padr(httpContext.getMessage( "%Lavado en Maquina(LM)%", ""),254, "%"), ' ') ? GXutil.str( A3350CCStkBar, 8, 0) : GXutil.str( A3353CCStkPed, 8, 0))) ;
                        AV65ExcelDocument.Cells(AV68CellRow, 2, 1, 1).setText( AV8Texto );
                     }
                     else
                     {
                        AV8Texto = AV24Hdr ;
                        AV65ExcelDocument.Cells(AV68CellRow, 2, 1, 1).setText( AV8Texto );
                        if ( AV54Lavanderias == 1 )
                        {
                           AV8Texto = GXutil.str( AV52Barpie, 6, 0) ;
                        }
                        else
                        {
                           AV8Texto = GXutil.str( AV53BarKgm, 9, 2) ;
                        }
                        AV65ExcelDocument.Cells(AV68CellRow, 3, 1, 1).setText( AV8Texto );
                     }
                  }
                  AV8Texto = A3357CCStkDsc ;
                  AV65ExcelDocument.Cells(AV68CellRow, 4, 1, 1).setText( AV8Texto );
                  if ( A3350CCStkBar > 0 )
                  {
                     AV8Texto = GXutil.str( AV59clicod, 6, 0) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 5, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.trim( AV58Barser) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 6, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.trim( AV62Barserdsc) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 7, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.trim( AV60Barcolnom) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 8, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.trim( AV61Procesos) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 9, 1, 1).setText( AV8Texto );
                  }
                  else
                  {
                  }
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
                     AV65ExcelDocument.Cells(AV68CellRow, 10, 1, 1).setText( AV8Texto );
                     AV20Ccstkpre = A3349CCStkPre ;
                     if ( A3344CCStkCanS.doubleValue() > 0 )
                     {
                        AV20Ccstkpre = DecimalUtil.doubleToDec(0) ;
                     }
                     AV8Texto = GXutil.str( AV20Ccstkpre, 14, 5) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 11, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.str( A3909ValorE, 11, 2) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 12, 1, 1).setText( AV8Texto );
                     if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), httpContext.getMessage( "Envio a CC, Sobrante", "")) == 0 )
                     {
                     }
                     else
                     {
                        AV8Texto = GXutil.str( A3344CCStkCanS, 12, 4) ;
                        AV65ExcelDocument.Cells(AV68CellRow, 13, 1, 1).setText( AV8Texto );
                     }
                     AV20Ccstkpre = A3349CCStkPre ;
                     if ( A3343CCStkCanE.doubleValue() > 0 )
                     {
                        AV20Ccstkpre = DecimalUtil.doubleToDec(0) ;
                     }
                     AV8Texto = GXutil.str( AV20Ccstkpre, 14, 5) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 14, 1, 1).setText( AV8Texto );
                     AV8Texto = GXutil.str( A3910ValorS, 12, 2) ;
                     AV65ExcelDocument.Cells(AV68CellRow, 15, 1, 1).setText( AV8Texto );
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
                  AV65ExcelDocument.Cells(AV68CellRow, 16, 1, 1).setText( AV8Texto );
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
                  AV65ExcelDocument.Cells(AV68CellRow, 17, 1, 1).setText( AV8Texto );
                  AV8Texto = GXutil.str( AV38Saldo_v, 11, 2) ;
                  AV65ExcelDocument.Cells(AV68CellRow, 18, 1, 1).setText( AV8Texto );
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
                  AV68CellRow = (int)(AV68CellRow+1) ;
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV68CellRow = (int)(AV68CellRow+2) ;
      AV8Texto = GXutil.str( AV21Entradas, 12, 4) ;
      AV65ExcelDocument.Cells(AV68CellRow, 10, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV40Valore, 11, 2) ;
      AV65ExcelDocument.Cells(AV68CellRow, 12, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV39Salidas, 12, 4) ;
      AV65ExcelDocument.Cells(AV68CellRow, 13, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV42Valors, 12, 2) ;
      AV65ExcelDocument.Cells(AV68CellRow, 15, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV37Saldo_l, 12, 4) ;
      AV65ExcelDocument.Cells(AV68CellRow, 16, 1, 1).setText( AV8Texto );
      AV8Texto = GXutil.str( AV38Saldo_v, 11, 2) ;
      AV65ExcelDocument.Cells(AV68CellRow, 18, 1, 1).setText( AV8Texto );
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
      /* Using cursor P04S45 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV29PrdNum, AV19Ccstkfeci});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P04S45_A719PrdNum[0] ;
         A3345TipMovCc = P04S45_A3345TipMovCc[0] ;
         A3348CCStkFec = P04S45_A3348CCStkFec[0] ;
         A3342CCStkLin = P04S45_A3342CCStkLin[0] ;
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
         /* Using cursor P04S46 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV29PrdNum, AV44Recfec1});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A810RecFec = P04S46_A810RecFec[0] ;
            A719PrdNum = P04S46_A719PrdNum[0] ;
            A807RecExiRea = P04S46_A807RecExiRea[0] ;
            A809RecExiTeo = P04S46_A809RecExiTeo[0] ;
            A6573RecPreRec = P04S46_A6573RecPreRec[0] ;
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
         /* Using cursor P04S47 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV29PrdNum, Long.valueOf(AV47Ccstklin), AV19Ccstkfeci});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A3348CCStkFec = P04S47_A3348CCStkFec[0] ;
            A3342CCStkLin = P04S47_A3342CCStkLin[0] ;
            A719PrdNum = P04S47_A719PrdNum[0] ;
            A3345TipMovCc = P04S47_A3345TipMovCc[0] ;
            A3343CCStkCanE = P04S47_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P04S47_A3344CCStkCanS[0] ;
            A3349CCStkPre = P04S47_A3349CCStkPre[0] ;
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
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      else
      {
         /* Using cursor P04S48 */
         pr_default.execute(6, new Object[] {A396EmprCod, AV29PrdNum, AV19Ccstkfeci});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A3348CCStkFec = P04S48_A3348CCStkFec[0] ;
            A719PrdNum = P04S48_A719PrdNum[0] ;
            A3345TipMovCc = P04S48_A3345TipMovCc[0] ;
            A3343CCStkCanE = P04S48_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P04S48_A3344CCStkCanS[0] ;
            A3349CCStkPre = P04S48_A3349CCStkPre[0] ;
            A3342CCStkLin = P04S48_A3342CCStkLin[0] ;
            if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EI", "")) == 0 ) )
            {
               AV16CCStkCanE = AV16CCStkCanE.add(A3343CCStkCanE) ;
            }
            if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SI", "")) == 0 ) )
            {
               AV17CCStkCanS = AV17CCStkCanS.add(A3344CCStkCanS) ;
            }
            AV41ValoreI = AV41ValoreI.add((GXutil.roundDecimal( A3343CCStkCanE.multiply(A3349CCStkPre), 2))) ;
            AV43ValorSF = AV43ValorSF.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
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
      /* Using cursor P04S49 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV29PrdNum, AV35Recfec});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A810RecFec = P04S49_A810RecFec[0] ;
         A719PrdNum = P04S49_A719PrdNum[0] ;
         A809RecExiTeo = P04S49_A809RecExiTeo[0] ;
         A807RecExiRea = P04S49_A807RecExiRea[0] ;
         A808RecExiTcc = P04S49_A808RecExiTcc[0] ;
         A806RecExiRcc = P04S49_A806RecExiRcc[0] ;
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
      /* Using cursor P04S411 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV49CCStkBar), Byte.valueOf(AV50CCStkReo), AV51CCStkPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P04S411_A130BarCodPar[0] ;
         A132BarCodReo = P04S411_A132BarCodReo[0] ;
         A129BarCod = P04S411_A129BarCod[0] ;
         A212BarSer = P04S411_A212BarSer[0] ;
         A1652BarSerDsc = P04S411_A1652BarSerDsc[0] ;
         A252CliCod = P04S411_A252CliCod[0] ;
         n252CliCod = P04S411_n252CliCod[0] ;
         A135BarColNom = P04S411_A135BarColNom[0] ;
         A166BarKgm = P04S411_A166BarKgm[0] ;
         A199BarPie1 = P04S411_A199BarPie1[0] ;
         A365DisDes = P04S411_A365DisDes[0] ;
         A898BarPieNDes = P04S411_A898BarPieNDes[0] ;
         A166BarKgm = P04S411_A166BarKgm[0] ;
         A199BarPie1 = P04S411_A199BarPie1[0] ;
         A898BarPieNDes = P04S411_A898BarPieNDes[0] ;
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
         AV58Barser = A212BarSer ;
         AV62Barserdsc = A1652BarSerDsc ;
         AV59clicod = A252CliCod ;
         AV60Barcolnom = A135BarColNom ;
         /* Using cursor P04S412 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A119BarAgrCod = P04S412_A119BarAgrCod[0] ;
            A124BarAgrReo = P04S412_A124BarAgrReo[0] ;
            A122BarAgrPar = P04S412_A122BarAgrPar[0] ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A119BarAgrCod ;
            GXv_int2[0] = A124BarAgrReo ;
            GXv_char5[0] = A122BarAgrPar ;
            GXv_decimal6[0] = AV55Kgs ;
            GXv_decimal7[0] = AV56Mts ;
            GXv_int8[0] = AV57Pzs ;
            new app.pkgmtpz(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_int8) ;
            phtmlkardex.this.A396EmprCod = GXv_char3[0] ;
            phtmlkardex.this.A119BarAgrCod = GXv_int4[0] ;
            phtmlkardex.this.A124BarAgrReo = GXv_int2[0] ;
            phtmlkardex.this.A122BarAgrPar = GXv_char5[0] ;
            phtmlkardex.this.AV55Kgs = GXv_decimal6[0] ;
            phtmlkardex.this.AV56Mts = GXv_decimal7[0] ;
            phtmlkardex.this.AV57Pzs = GXv_int8[0] ;
            AV53BarKgm = AV53BarKgm.add(AV55Kgs) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      AV61Procesos = "" ;
      /* Using cursor P04S413 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV49CCStkBar), Byte.valueOf(AV50CCStkReo), AV51CCStkPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A4494HreBarPar = P04S413_A4494HreBarPar[0] ;
         A4493HreBarReo = P04S413_A4493HreBarReo[0] ;
         A4492HreBarCod = P04S413_A4492HreBarCod[0] ;
         A4551HreProCod = P04S413_A4551HreProCod[0] ;
         A4550HreLinPro = P04S413_A4550HreLinPro[0] ;
         A4545HreLinMaq = P04S413_A4545HreLinMaq[0] ;
         A4495HreNumCie = P04S413_A4495HreNumCie[0] ;
         if ( GXutil.strcmp(AV61Procesos, " ") == 0 )
         {
            AV61Procesos = A4551HreProCod ;
         }
         else
         {
            AV61Procesos += "/" + A4551HreProCod ;
         }
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S141( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV69Random = (int)(GXutil.random( )*10000) ;
      AV66Filename = "KardexporOpcion2_" + GXutil.trim( AV30Producto) + httpContext.getMessage( "_Export-", "") + GXutil.trim( GXutil.str( AV69Random, 8, 0)) + ".xlsx" ;
      AV66Filename = GXutil.strReplace( AV66Filename, " ", "_") ;
      AV66Filename = GXutil.strReplace( AV66Filename, "__", "_") ;
      AV66Filename = GXutil.strReplace( AV66Filename, "#", "_") ;
      AV65ExcelDocument.Open(AV66Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV65ExcelDocument.Clear();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV65ExcelDocument.getErrCode() != 0 )
      {
         AV66Filename = "" ;
         AV67ErrorMessage = AV65ExcelDocument.getErrDescription() ;
         AV65ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV65ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV65ExcelDocument.Close();
   }

   public void S171( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV65ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Periodo ", "")+GXutil.trim( localUtil.dtoc( AV19Ccstkfeci, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+" "+GXutil.trim( localUtil.dtoc( AV18Ccstkfecf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
      AV65ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Ingresos", "") );
      AV65ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Egresos", "") );
      AV65ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Saldo", "") );
      AV65ExcelDocument.Cells(1, 11, 1, 1).setBold( (short)(1) );
      AV65ExcelDocument.Cells(1, 11, 1, 1).setColor( 11 );
      AV65ExcelDocument.Cells(1, 14, 1, 1).setBold( (short)(1) );
      AV65ExcelDocument.Cells(1, 14, 1, 1).setColor( 11 );
      AV65ExcelDocument.Cells(1, 17, 1, 1).setBold( (short)(1) );
      AV65ExcelDocument.Cells(1, 17, 1, 1).setColor( 11 );
      AV65ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV65ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Doc/Ref", "") );
      AV65ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV65ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Detalle", "") );
      AV65ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV65ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV65ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV65ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV65ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Procesos", "") );
      AV65ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV65ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV65ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV65ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV65ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV65ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV65ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV65ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV65ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV14i = 1 ;
      while ( AV14i <= 20 )
      {
         AV65ExcelDocument.Cells(2, AV14i, 1, 1).setBold( (short)(1) );
         AV65ExcelDocument.Cells(2, AV14i, 1, 1).setColor( 11 );
         AV14i = (int)(AV14i+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = phtmlkardex.this.A396EmprCod;
      this.aP1[0] = phtmlkardex.this.AV29PrdNum;
      this.aP2[0] = phtmlkardex.this.AV19Ccstkfeci;
      this.aP3[0] = phtmlkardex.this.AV18Ccstkfecf;
      this.aP4[0] = phtmlkardex.this.AV66Filename;
      this.aP5[0] = phtmlkardex.this.AV67ErrorMessage;
      CloseOpenCursors();
      AV65ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04S42_A396EmprCod = new String[] {""} ;
      P04S42_A719PrdNum = new String[] {""} ;
      P04S42_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV30Producto = "" ;
      P04S43_A396EmprCod = new String[] {""} ;
      P04S43_A719PrdNum = new String[] {""} ;
      P04S43_A3915EmpNumDec = new byte[1] ;
      P04S43_n3915EmpNumDec = new boolean[] {false} ;
      AV65ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV36Saldo = DecimalUtil.ZERO ;
      AV38Saldo_v = DecimalUtil.ZERO ;
      AV37Saldo_l = DecimalUtil.ZERO ;
      P04S44_A396EmprCod = new String[] {""} ;
      P04S44_A719PrdNum = new String[] {""} ;
      P04S44_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04S44_A3345TipMovCc = new String[] {""} ;
      P04S44_A12858CCStkNAlb = new String[] {""} ;
      P04S44_A3354CCStkAlb = new String[] {""} ;
      P04S44_A12229CCStkDoc = new long[1] ;
      P04S44_A3357CCStkDsc = new String[] {""} ;
      P04S44_A3350CCStkBar = new int[1] ;
      P04S44_A3352CCStkPar = new String[] {""} ;
      P04S44_A3351CCStkReo = new byte[1] ;
      P04S44_A3353CCStkPed = new int[1] ;
      P04S44_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S44_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S44_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S44_A3342CCStkLin = new long[1] ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A12858CCStkNAlb = "" ;
      A3354CCStkAlb = "" ;
      A3357CCStkDsc = "" ;
      A3352CCStkPar = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      AV8Texto = "" ;
      AV63CCstkNalb = "" ;
      AV24Hdr = "" ;
      AV51CCStkPar = "" ;
      AV53BarKgm = DecimalUtil.ZERO ;
      AV58Barser = "" ;
      AV62Barserdsc = "" ;
      AV60Barcolnom = "" ;
      AV61Procesos = "" ;
      AV35Recfec = GXutil.nullDate() ;
      AV32Recexirea = DecimalUtil.ZERO ;
      AV31RecExiRcc = DecimalUtil.ZERO ;
      AV20Ccstkpre = DecimalUtil.ZERO ;
      AV21Entradas = DecimalUtil.ZERO ;
      AV39Salidas = DecimalUtil.ZERO ;
      AV40Valore = DecimalUtil.ZERO ;
      AV42Valors = DecimalUtil.ZERO ;
      AV44Recfec1 = GXutil.nullDate() ;
      P04S45_A396EmprCod = new String[] {""} ;
      P04S45_A719PrdNum = new String[] {""} ;
      P04S45_A3345TipMovCc = new String[] {""} ;
      P04S45_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04S45_A3342CCStkLin = new long[1] ;
      AV45Exiteo = DecimalUtil.ZERO ;
      AV46PreRec = DecimalUtil.ZERO ;
      P04S46_A396EmprCod = new String[] {""} ;
      P04S46_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04S46_A719PrdNum = new String[] {""} ;
      P04S46_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S46_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S46_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      AV16CCStkCanE = DecimalUtil.ZERO ;
      AV17CCStkCanS = DecimalUtil.ZERO ;
      AV41ValoreI = DecimalUtil.ZERO ;
      AV43ValorSF = DecimalUtil.ZERO ;
      P04S47_A396EmprCod = new String[] {""} ;
      P04S47_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04S47_A3342CCStkLin = new long[1] ;
      P04S47_A719PrdNum = new String[] {""} ;
      P04S47_A3345TipMovCc = new String[] {""} ;
      P04S47_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S47_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S47_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S48_A396EmprCod = new String[] {""} ;
      P04S48_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04S48_A719PrdNum = new String[] {""} ;
      P04S48_A3345TipMovCc = new String[] {""} ;
      P04S48_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S48_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S48_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S48_A3342CCStkLin = new long[1] ;
      AV34Recexiteo = DecimalUtil.ZERO ;
      AV33recExiTcc = DecimalUtil.ZERO ;
      P04S49_A396EmprCod = new String[] {""} ;
      P04S49_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04S49_A719PrdNum = new String[] {""} ;
      P04S49_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S49_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S49_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S49_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      P04S411_A396EmprCod = new String[] {""} ;
      P04S411_A130BarCodPar = new String[] {""} ;
      P04S411_A132BarCodReo = new byte[1] ;
      P04S411_A129BarCod = new int[1] ;
      P04S411_A212BarSer = new String[] {""} ;
      P04S411_A1652BarSerDsc = new String[] {""} ;
      P04S411_A252CliCod = new int[1] ;
      P04S411_n252CliCod = new boolean[] {false} ;
      P04S411_A135BarColNom = new String[] {""} ;
      P04S411_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04S411_A199BarPie1 = new short[1] ;
      P04S411_A365DisDes = new String[] {""} ;
      P04S411_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P04S412_A396EmprCod = new String[] {""} ;
      P04S412_A129BarCod = new int[1] ;
      P04S412_A132BarCodReo = new byte[1] ;
      P04S412_A130BarCodPar = new String[] {""} ;
      P04S412_A119BarAgrCod = new int[1] ;
      P04S412_A124BarAgrReo = new byte[1] ;
      P04S412_A122BarAgrPar = new String[] {""} ;
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
      P04S413_A396EmprCod = new String[] {""} ;
      P04S413_A4494HreBarPar = new String[] {""} ;
      P04S413_A4493HreBarReo = new byte[1] ;
      P04S413_A4492HreBarCod = new int[1] ;
      P04S413_A4551HreProCod = new String[] {""} ;
      P04S413_A4550HreLinPro = new byte[1] ;
      P04S413_A4545HreLinMaq = new short[1] ;
      P04S413_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      A4551HreProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phtmlkardex__default(),
         new Object[] {
             new Object[] {
            P04S42_A396EmprCod, P04S42_A719PrdNum, P04S42_A718PrdNom
            }
            , new Object[] {
            P04S43_A396EmprCod, P04S43_A719PrdNum, P04S43_A3915EmpNumDec, P04S43_n3915EmpNumDec
            }
            , new Object[] {
            P04S44_A396EmprCod, P04S44_A719PrdNum, P04S44_A3348CCStkFec, P04S44_A3345TipMovCc, P04S44_A12858CCStkNAlb, P04S44_A3354CCStkAlb, P04S44_A12229CCStkDoc, P04S44_A3357CCStkDsc, P04S44_A3350CCStkBar, P04S44_A3352CCStkPar,
            P04S44_A3351CCStkReo, P04S44_A3353CCStkPed, P04S44_A3344CCStkCanS, P04S44_A3349CCStkPre, P04S44_A3343CCStkCanE, P04S44_A3342CCStkLin
            }
            , new Object[] {
            P04S45_A396EmprCod, P04S45_A719PrdNum, P04S45_A3345TipMovCc, P04S45_A3348CCStkFec, P04S45_A3342CCStkLin
            }
            , new Object[] {
            P04S46_A396EmprCod, P04S46_A810RecFec, P04S46_A719PrdNum, P04S46_A807RecExiRea, P04S46_A809RecExiTeo, P04S46_A6573RecPreRec
            }
            , new Object[] {
            P04S47_A396EmprCod, P04S47_A3348CCStkFec, P04S47_A3342CCStkLin, P04S47_A719PrdNum, P04S47_A3345TipMovCc, P04S47_A3343CCStkCanE, P04S47_A3344CCStkCanS, P04S47_A3349CCStkPre
            }
            , new Object[] {
            P04S48_A396EmprCod, P04S48_A3348CCStkFec, P04S48_A719PrdNum, P04S48_A3345TipMovCc, P04S48_A3343CCStkCanE, P04S48_A3344CCStkCanS, P04S48_A3349CCStkPre, P04S48_A3342CCStkLin
            }
            , new Object[] {
            P04S49_A396EmprCod, P04S49_A810RecFec, P04S49_A719PrdNum, P04S49_A809RecExiTeo, P04S49_A807RecExiRea, P04S49_A808RecExiTcc, P04S49_A806RecExiRcc
            }
            , new Object[] {
            P04S411_A396EmprCod, P04S411_A130BarCodPar, P04S411_A132BarCodReo, P04S411_A129BarCod, P04S411_A212BarSer, P04S411_A1652BarSerDsc, P04S411_A252CliCod, P04S411_n252CliCod, P04S411_A135BarColNom, P04S411_A166BarKgm,
            P04S411_A199BarPie1, P04S411_A365DisDes, P04S411_A898BarPieNDes
            }
            , new Object[] {
            P04S412_A396EmprCod, P04S412_A129BarCod, P04S412_A132BarCodReo, P04S412_A130BarCodPar, P04S412_A119BarAgrCod, P04S412_A124BarAgrReo, P04S412_A122BarAgrPar
            }
            , new Object[] {
            P04S413_A396EmprCod, P04S413_A4494HreBarPar, P04S413_A4493HreBarReo, P04S413_A4492HreBarCod, P04S413_A4551HreProCod, P04S413_A4550HreLinPro, P04S413_A4545HreLinMaq, P04S413_A4495HreNumCie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Kardex ;
   private byte AV54Lavanderias ;
   private byte AV64Nalbaran20 ;
   private byte GXt_int1 ;
   private byte A3915EmpNumDec ;
   private byte A3351CCStkReo ;
   private byte AV50CCStkReo ;
   private byte AV48PrimeraLec ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int2[] ;
   private byte A4493HreBarReo ;
   private byte A4550HreLinPro ;
   private byte A4495HreNumCie ;
   private short A199BarPie1 ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV68CellRow ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV52Barpie ;
   private int AV49CCStkBar ;
   private int AV59clicod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A119BarAgrCod ;
   private int GXv_int4[] ;
   private int AV57Pzs ;
   private int GXv_int8[] ;
   private int A4492HreBarCod ;
   private int AV69Random ;
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
   private String AV8Texto ;
   private String AV63CCstkNalb ;
   private String AV24Hdr ;
   private String AV51CCStkPar ;
   private String AV58Barser ;
   private String AV62Barserdsc ;
   private String AV60Barcolnom ;
   private String AV61Procesos ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A365DisDes ;
   private String A122BarAgrPar ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String A4494HreBarPar ;
   private String A4551HreProCod ;
   private java.util.Date AV19Ccstkfeci ;
   private java.util.Date AV18Ccstkfecf ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV35Recfec ;
   private java.util.Date AV44Recfec1 ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n252CliCod ;
   private String AV66Filename ;
   private String AV67ErrorMessage ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04S42_A396EmprCod ;
   private String[] P04S42_A719PrdNum ;
   private String[] P04S42_A718PrdNom ;
   private String[] P04S43_A396EmprCod ;
   private String[] P04S43_A719PrdNum ;
   private byte[] P04S43_A3915EmpNumDec ;
   private boolean[] P04S43_n3915EmpNumDec ;
   private String[] P04S44_A396EmprCod ;
   private String[] P04S44_A719PrdNum ;
   private java.util.Date[] P04S44_A3348CCStkFec ;
   private String[] P04S44_A3345TipMovCc ;
   private String[] P04S44_A12858CCStkNAlb ;
   private String[] P04S44_A3354CCStkAlb ;
   private long[] P04S44_A12229CCStkDoc ;
   private String[] P04S44_A3357CCStkDsc ;
   private int[] P04S44_A3350CCStkBar ;
   private String[] P04S44_A3352CCStkPar ;
   private byte[] P04S44_A3351CCStkReo ;
   private int[] P04S44_A3353CCStkPed ;
   private java.math.BigDecimal[] P04S44_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04S44_A3349CCStkPre ;
   private java.math.BigDecimal[] P04S44_A3343CCStkCanE ;
   private long[] P04S44_A3342CCStkLin ;
   private String[] P04S45_A396EmprCod ;
   private String[] P04S45_A719PrdNum ;
   private String[] P04S45_A3345TipMovCc ;
   private java.util.Date[] P04S45_A3348CCStkFec ;
   private long[] P04S45_A3342CCStkLin ;
   private String[] P04S46_A396EmprCod ;
   private java.util.Date[] P04S46_A810RecFec ;
   private String[] P04S46_A719PrdNum ;
   private java.math.BigDecimal[] P04S46_A807RecExiRea ;
   private java.math.BigDecimal[] P04S46_A809RecExiTeo ;
   private java.math.BigDecimal[] P04S46_A6573RecPreRec ;
   private String[] P04S47_A396EmprCod ;
   private java.util.Date[] P04S47_A3348CCStkFec ;
   private long[] P04S47_A3342CCStkLin ;
   private String[] P04S47_A719PrdNum ;
   private String[] P04S47_A3345TipMovCc ;
   private java.math.BigDecimal[] P04S47_A3343CCStkCanE ;
   private java.math.BigDecimal[] P04S47_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04S47_A3349CCStkPre ;
   private String[] P04S48_A396EmprCod ;
   private java.util.Date[] P04S48_A3348CCStkFec ;
   private String[] P04S48_A719PrdNum ;
   private String[] P04S48_A3345TipMovCc ;
   private java.math.BigDecimal[] P04S48_A3343CCStkCanE ;
   private java.math.BigDecimal[] P04S48_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04S48_A3349CCStkPre ;
   private long[] P04S48_A3342CCStkLin ;
   private String[] P04S49_A396EmprCod ;
   private java.util.Date[] P04S49_A810RecFec ;
   private String[] P04S49_A719PrdNum ;
   private java.math.BigDecimal[] P04S49_A809RecExiTeo ;
   private java.math.BigDecimal[] P04S49_A807RecExiRea ;
   private java.math.BigDecimal[] P04S49_A808RecExiTcc ;
   private java.math.BigDecimal[] P04S49_A806RecExiRcc ;
   private String[] P04S411_A396EmprCod ;
   private String[] P04S411_A130BarCodPar ;
   private byte[] P04S411_A132BarCodReo ;
   private int[] P04S411_A129BarCod ;
   private String[] P04S411_A212BarSer ;
   private String[] P04S411_A1652BarSerDsc ;
   private int[] P04S411_A252CliCod ;
   private boolean[] P04S411_n252CliCod ;
   private String[] P04S411_A135BarColNom ;
   private java.math.BigDecimal[] P04S411_A166BarKgm ;
   private short[] P04S411_A199BarPie1 ;
   private String[] P04S411_A365DisDes ;
   private int[] P04S411_A898BarPieNDes ;
   private String[] P04S412_A396EmprCod ;
   private int[] P04S412_A129BarCod ;
   private byte[] P04S412_A132BarCodReo ;
   private String[] P04S412_A130BarCodPar ;
   private int[] P04S412_A119BarAgrCod ;
   private byte[] P04S412_A124BarAgrReo ;
   private String[] P04S412_A122BarAgrPar ;
   private String[] P04S413_A396EmprCod ;
   private String[] P04S413_A4494HreBarPar ;
   private byte[] P04S413_A4493HreBarReo ;
   private int[] P04S413_A4492HreBarCod ;
   private String[] P04S413_A4551HreProCod ;
   private byte[] P04S413_A4550HreLinPro ;
   private short[] P04S413_A4545HreLinMaq ;
   private byte[] P04S413_A4495HreNumCie ;
   private com.genexus.gxoffice.ExcelDoc AV65ExcelDocument ;
}

final  class phtmlkardex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04S42", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04S43", "SELECT T1.EmprCod, T1.PrdNum, T2.EmpNumDec FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04S44", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkNAlb, CCStkAlb, CCStkDoc, CCStkDsc, CCStkBar, CCStkPar, CCStkReo, CCStkPed, CCStkCanS, CCStkPre, CCStkCanE, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04S45", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec < ? ORDER BY EmprCod, PrdNum, CCStkFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04S46", "SELECT EmprCod, RecFec, PrdNum, RecExiRea, RecExiTeo, RecPreRec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04S47", "SELECT EmprCod, CCStkFec, CCStkLin, PrdNum, TipMovCc, CCStkCanE, CCStkCanS, CCStkPre FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkLin > ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04S48", "SELECT EmprCod, CCStkFec, PrdNum, TipMovCc, CCStkCanE, CCStkCanS, CCStkPre, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04S49", "SELECT EmprCod, RecFec, PrdNum, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04S411", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSer, T1.BarSerDsc, T1.CliCod, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04S412", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04S413", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreProCod, HreLinPro, HreLinMaq, HreNumCie FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((long[]) buf[15])[0] = rslt.getLong(16);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

