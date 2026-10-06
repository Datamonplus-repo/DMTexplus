package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxmlkardex extends GXProcedure
{
   public pxmlkardex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxmlkardex.class ), "" );
   }

   public pxmlkardex( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pxmlkardex.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pxmlkardex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxmlkardex.this.AV121PrdNum1 = aP1[0];
      this.aP1 = aP1;
      pxmlkardex.this.AV122PrdNum2 = aP2[0];
      this.aP2 = aP2;
      pxmlkardex.this.AV77Ccstkfeci = aP3[0];
      this.aP3 = aP3;
      pxmlkardex.this.AV76Ccstkfecf = aP4[0];
      this.aP4 = aP4;
      pxmlkardex.this.AV130Op = aP5[0];
      this.aP5 = aP5;
      pxmlkardex.this.AV126Filename = aP6[0];
      this.aP6 = aP6;
      pxmlkardex.this.AV127ErrorMessage = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV83Kardex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KARDEX", ""), GXv_int2) ;
      pxmlkardex.this.GXt_int1 = GXv_int2[0] ;
      AV83Kardex = GXt_int1 ;
      GXt_int1 = AV112Lavanderias ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      pxmlkardex.this.GXt_int1 = GXv_int2[0] ;
      AV112Lavanderias = GXt_int1 ;
      GXt_int1 = AV123Nalbaran20 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int2) ;
      pxmlkardex.this.GXt_int1 = GXv_int2[0] ;
      AV123Nalbaran20 = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV129CellRow = 3 ;
      /* Using cursor P04V92 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV121PrdNum1, AV122PrdNum2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P04V92_A719PrdNum[0] ;
         A718PrdNom = P04V92_A718PrdNom[0] ;
         AV87PrdNum = A719PrdNum ;
         /* Execute user subroutine: 'SALDOINICIAL' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV125ExcelDocument.Cells(AV129CellRow, 1, 1, 1).setText( A719PrdNum );
         AV125ExcelDocument.Cells(AV129CellRow, 2, 1, 1).setText( A718PrdNom );
         AV125ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV94Saldo)) );
         AV125ExcelDocument.Cells(AV129CellRow, 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV96Saldo_v)) );
         AV129CellRow = (int)(AV129CellRow+1) ;
         AV95Saldo_l = AV94Saldo ;
         /* Execute user subroutine: 'CCSTKS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV79Entradas = DecimalUtil.doubleToDec(0) ;
         AV98Valore = DecimalUtil.doubleToDec(0) ;
         AV97Salidas = DecimalUtil.doubleToDec(0) ;
         AV100Valors = DecimalUtil.doubleToDec(0) ;
         AV95Saldo_l = DecimalUtil.doubleToDec(0) ;
         AV96Saldo_v = DecimalUtil.doubleToDec(0) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV130Op, httpContext.getMessage( "N", "")) == 0 )
      {
         /* Using cursor P04V93 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV87PrdNum, AV77Ccstkfeci, AV76Ccstkfecf});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3348CCStkFec = P04V93_A3348CCStkFec[0] ;
            A719PrdNum = P04V93_A719PrdNum[0] ;
            A3345TipMovCc = P04V93_A3345TipMovCc[0] ;
            A718PrdNom = P04V93_A718PrdNom[0] ;
            A12858CCStkNAlb = P04V93_A12858CCStkNAlb[0] ;
            A3354CCStkAlb = P04V93_A3354CCStkAlb[0] ;
            A12229CCStkDoc = P04V93_A12229CCStkDoc[0] ;
            A3357CCStkDsc = P04V93_A3357CCStkDsc[0] ;
            A3350CCStkBar = P04V93_A3350CCStkBar[0] ;
            A3352CCStkPar = P04V93_A3352CCStkPar[0] ;
            A3351CCStkReo = P04V93_A3351CCStkReo[0] ;
            A3353CCStkPed = P04V93_A3353CCStkPed[0] ;
            A3342CCStkLin = P04V93_A3342CCStkLin[0] ;
            A3344CCStkCanS = P04V93_A3344CCStkCanS[0] ;
            A3349CCStkPre = P04V93_A3349CCStkPre[0] ;
            A3343CCStkCanE = P04V93_A3343CCStkCanE[0] ;
            A3915EmpNumDec = P04V93_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P04V93_n3915EmpNumDec[0] ;
            A3915EmpNumDec = P04V93_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P04V93_n3915EmpNumDec[0] ;
            A718PrdNom = P04V93_A718PrdNom[0] ;
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
            if ( GXutil.strcmp(A3345TipMovCc, "CD") != 0 )
            {
               AV125ExcelDocument.Cells(AV129CellRow, 1, 1, 1).setText( A719PrdNum );
               AV125ExcelDocument.Cells(AV129CellRow, 2, 1, 1).setText( A718PrdNom );
               GXt_dtime3 = GXutil.resetTime( A3348CCStkFec );
               AV125ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV125ExcelDocument.Cells(AV129CellRow, 3, 1, 1).setDate( GXt_dtime3 );
               AV110Barpie = 0 ;
               if ( ( GXutil.strcmp(A3345TipMovCc, "EN") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "EI") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "AD") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "SD") == 0 ) )
               {
                  AV124CCstkNalb = ((AV123Nalbaran20==0) ? A3354CCStkAlb : A12858CCStkNAlb) ;
                  AV66Texto = ((GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Disolucion Auxiliares         ", ""))==0) ? GXutil.str( A12229CCStkDoc, 10, 0) : AV124CCstkNalb) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 4, 1, 1).setText( AV66Texto );
               }
               else
               {
                  AV82Hdr = " " ;
                  if ( A3350CCStkBar > 0 )
                  {
                     AV82Hdr = GXutil.str( A3350CCStkBar, 8, 0) + "-" + GXutil.str( A3351CCStkReo, 1, 0) + A3352CCStkPar ;
                     AV107CCStkBar = A3350CCStkBar ;
                     AV108CCStkReo = A3351CCStkReo ;
                     AV109CCStkPar = A3352CCStkPar ;
                     /* Execute user subroutine: 'BARCAD' */
                     S123 ();
                     if ( returnInSub )
                     {
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        returnInSub = true;
                        if (true) return;
                     }
                  }
                  if ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 )
                  {
                     AV125ExcelDocument.Cells(AV129CellRow, 4, 1, 1).setNumber( A3353CCStkPed );
                  }
                  else
                  {
                     AV66Texto = AV82Hdr ;
                     AV125ExcelDocument.Cells(AV129CellRow, 4, 1, 1).setText( AV82Hdr );
                     if ( AV112Lavanderias == 1 )
                     {
                        AV66Texto = GXutil.str( AV110Barpie, 6, 0) ;
                     }
                     else
                     {
                        AV66Texto = GXutil.str( AV111BarKgm, 9, 2) ;
                     }
                     AV125ExcelDocument.Cells(AV129CellRow, 5, 1, 1).setText( AV66Texto );
                  }
               }
               AV66Texto = A3357CCStkDsc ;
               AV125ExcelDocument.Cells(AV129CellRow, 6, 1, 1).setText( AV66Texto );
               if ( A3350CCStkBar > 0 )
               {
                  AV66Texto = GXutil.str( AV117clicod, 6, 0) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 7, 1, 1).setText( AV66Texto );
                  AV66Texto = GXutil.trim( AV116Barser) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 8, 1, 1).setText( AV66Texto );
                  AV66Texto = GXutil.trim( AV120Barserdsc) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 9, 1, 1).setText( AV66Texto );
                  AV66Texto = GXutil.trim( AV118Barcolnom) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 10, 1, 1).setText( AV66Texto );
                  AV66Texto = GXutil.trim( AV119Procesos) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 11, 1, 1).setText( AV66Texto );
               }
               else
               {
               }
               if ( ( GXutil.strcmp(A3345TipMovCc, "SR") == 0 ) && ( AV83Kardex == 1 ) )
               {
                  AV93Recfec = A3348CCStkFec ;
                  /* Execute user subroutine: 'RECUEN' */
                  S133 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( GXutil.strcmp(A3357CCStkDsc, "Recuento de Almacen           ") == 0 )
                  {
                     AV95Saldo_l = AV90Recexirea ;
                  }
                  if ( GXutil.strcmp(A3357CCStkDsc, "Recuento de CC                ") == 0 )
                  {
                     AV95Saldo_l = AV95Saldo_l.add(AV89RecExiRcc) ;
                  }
                  AV78Ccstkpre = A3349CCStkPre ;
               }
               else
               {
                  AV66Texto = GXutil.str( A3343CCStkCanE, 12, 4) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setText( AV66Texto );
                  AV78Ccstkpre = A3349CCStkPre ;
                  if ( A3344CCStkCanS.doubleValue() > 0 )
                  {
                     AV78Ccstkpre = DecimalUtil.doubleToDec(0) ;
                  }
                  AV66Texto = GXutil.str( AV78Ccstkpre, 14, 5) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 13, 1, 1).setText( AV66Texto );
                  AV66Texto = GXutil.str( A3909ValorE, 11, 2) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setText( AV66Texto );
                  if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), "Envio a CC, Sobrante") == 0 )
                  {
                     AV66Texto = " " ;
                  }
                  else
                  {
                     AV66Texto = GXutil.str( A3344CCStkCanS, 12, 4) ;
                     AV125ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setText( AV66Texto );
                  }
                  AV78Ccstkpre = A3349CCStkPre ;
                  if ( A3343CCStkCanE.doubleValue() > 0 )
                  {
                     AV78Ccstkpre = DecimalUtil.doubleToDec(0) ;
                  }
                  AV66Texto = GXutil.str( AV78Ccstkpre, 14, 5) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 16, 1, 1).setText( AV66Texto );
                  AV66Texto = GXutil.str( A3910ValorS, 12, 2) ;
                  AV125ExcelDocument.Cells(AV129CellRow, 17, 1, 1).setText( AV66Texto );
                  AV95Saldo_l = AV95Saldo_l.add(A3343CCStkCanE) ;
                  if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), "Envio a CC, Sobrante") == 0 )
                  {
                  }
                  else
                  {
                     AV95Saldo_l = AV95Saldo_l.subtract(A3344CCStkCanS) ;
                  }
               }
               AV66Texto = GXutil.str( AV95Saldo_l, 12, 4) ;
               if ( GXutil.strcmp(A3357CCStkDsc, "Recuento de Almacen           ") == 0 )
               {
                  AV66Texto = GXutil.str( AV90Recexirea, 12, 4) ;
               }
               if ( GXutil.strcmp(A3357CCStkDsc, "Recuento de CC                ") == 0 )
               {
                  AV66Texto = GXutil.str( AV89RecExiRcc, 12, 4) ;
               }
               AV125ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setText( AV66Texto );
               if ( ( GXutil.strcmp(A3345TipMovCc, "SR") == 0 ) && ( AV83Kardex == 1 ) )
               {
                  AV96Saldo_v = AV95Saldo_l.multiply(AV78Ccstkpre) ;
                  AV78Ccstkpre = A3349CCStkPre ;
               }
               else
               {
                  if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), "Envio a CC, Sobrante") == 0 )
                  {
                     AV96Saldo_v = AV96Saldo_v.add(((A3909ValorE))) ;
                  }
                  else
                  {
                     AV96Saldo_v = AV96Saldo_v.add(((A3909ValorE.subtract(A3910ValorS)))) ;
                  }
                  AV78Ccstkpre = A3349CCStkPre ;
                  AV96Saldo_v = AV95Saldo_l.multiply(AV78Ccstkpre) ;
               }
               AV66Texto = GXutil.str( AV78Ccstkpre, 14, 5) ;
               AV125ExcelDocument.Cells(AV129CellRow, 19, 1, 1).setText( AV66Texto );
               AV66Texto = GXutil.str( AV96Saldo_v, 11, 2) ;
               AV125ExcelDocument.Cells(AV129CellRow, 20, 1, 1).setText( AV66Texto );
               if ( ( GXutil.strcmp(A3345TipMovCc, "SR") == 0 ) && ( AV83Kardex == 1 ) )
               {
               }
               else
               {
                  AV79Entradas = AV79Entradas.add(A3343CCStkCanE) ;
                  if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), "Envio a CC, Sobrante") == 0 )
                  {
                  }
                  else
                  {
                     AV97Salidas = AV97Salidas.add(A3344CCStkCanS) ;
                  }
                  AV98Valore = AV98Valore.add(A3909ValorE) ;
                  if ( GXutil.strcmp(GXutil.trim( A3357CCStkDsc), "Envio a CC, Sobrante") == 0 )
                  {
                  }
                  else
                  {
                     AV100Valors = AV100Valors.add(A3910ValorS) ;
                  }
               }
               AV129CellRow = (int)(AV129CellRow+1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'TOTALINSUMO' */
         S141 ();
         if (returnInSub) return;
         AV129CellRow = (int)(AV129CellRow+1) ;
      }
   }

   public void S141( )
   {
      /* 'TOTALINSUMO' Routine */
      returnInSub = false ;
      AV129CellRow = (int)(AV129CellRow+2) ;
      AV66Texto = GXutil.str( AV79Entradas, 12, 4) ;
      AV125ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setText( AV66Texto );
      AV66Texto = GXutil.str( AV98Valore, 11, 2) ;
      AV125ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setText( AV66Texto );
      AV66Texto = GXutil.str( AV97Salidas, 12, 4) ;
      AV125ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setText( AV66Texto );
      AV66Texto = GXutil.str( AV100Valors, 12, 2) ;
      AV125ExcelDocument.Cells(AV129CellRow, 17, 1, 1).setText( AV66Texto );
      AV66Texto = GXutil.str( AV95Saldo_l, 12, 4) ;
      AV125ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setText( AV66Texto );
      AV66Texto = GXutil.str( AV96Saldo_v, 11, 2) ;
      AV125ExcelDocument.Cells(AV129CellRow, 20, 1, 1).setText( AV66Texto );
   }

   public void S151( )
   {
      /* 'SALDOINICIAL' Routine */
      returnInSub = false ;
      AV102Recfec1 = GXutil.nullDate() ;
      AV105Ccstklin = 0 ;
      AV103Exiteo = DecimalUtil.doubleToDec(0) ;
      AV104PreRec = DecimalUtil.doubleToDec(0) ;
      AV74CCStkCanE = DecimalUtil.doubleToDec(0) ;
      AV75CCStkCanS = DecimalUtil.doubleToDec(0) ;
      AV94Saldo = DecimalUtil.doubleToDec(0) ;
      AV99ValoreI = DecimalUtil.doubleToDec(0) ;
      AV101ValorSF = DecimalUtil.doubleToDec(0) ;
      AV94Saldo = DecimalUtil.doubleToDec(0) ;
      AV96Saldo_v = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04V94 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV87PrdNum, AV77Ccstkfeci});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P04V94_A719PrdNum[0] ;
         A3345TipMovCc = P04V94_A3345TipMovCc[0] ;
         A3348CCStkFec = P04V94_A3348CCStkFec[0] ;
         A3342CCStkLin = P04V94_A3342CCStkLin[0] ;
         AV102Recfec1 = A3348CCStkFec ;
         AV105Ccstklin = A3342CCStkLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV105Ccstklin > 0 )
      {
         AV103Exiteo = DecimalUtil.doubleToDec(0) ;
         AV104PreRec = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P04V95 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV87PrdNum, AV102Recfec1});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A810RecFec = P04V95_A810RecFec[0] ;
            A719PrdNum = P04V95_A719PrdNum[0] ;
            A807RecExiRea = P04V95_A807RecExiRea[0] ;
            A809RecExiTeo = P04V95_A809RecExiTeo[0] ;
            A6573RecPreRec = P04V95_A6573RecPreRec[0] ;
            if ( ( A809RecExiTeo.doubleValue() > 0 ) && ( A807RecExiRea.doubleValue() == 0 ) )
            {
               AV103Exiteo = A809RecExiTeo ;
            }
            if ( A807RecExiRea.doubleValue() > 0 )
            {
               AV103Exiteo = A807RecExiRea ;
            }
            AV104PreRec = A6573RecPreRec ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      AV74CCStkCanE = DecimalUtil.doubleToDec(0) ;
      AV75CCStkCanS = DecimalUtil.doubleToDec(0) ;
      AV94Saldo = DecimalUtil.doubleToDec(0) ;
      AV99ValoreI = DecimalUtil.doubleToDec(0) ;
      AV101ValorSF = DecimalUtil.doubleToDec(0) ;
      if ( AV105Ccstklin > 0 )
      {
         AV74CCStkCanE = AV103Exiteo ;
         AV99ValoreI = GXutil.roundDecimal( AV74CCStkCanE.multiply(AV104PreRec), 2) ;
         AV106PrimeraLec = (byte)(0) ;
         /* Using cursor P04V96 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV87PrdNum, Long.valueOf(AV105Ccstklin), AV77Ccstkfeci});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A3348CCStkFec = P04V96_A3348CCStkFec[0] ;
            A3342CCStkLin = P04V96_A3342CCStkLin[0] ;
            A719PrdNum = P04V96_A719PrdNum[0] ;
            A3345TipMovCc = P04V96_A3345TipMovCc[0] ;
            A3343CCStkCanE = P04V96_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P04V96_A3344CCStkCanS[0] ;
            A3349CCStkPre = P04V96_A3349CCStkPre[0] ;
            if ( ( AV106PrimeraLec == 0 ) && ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) )
            {
               AV106PrimeraLec = (byte)(1) ;
            }
            else
            {
               if ( DecimalUtil.compareTo(A3344CCStkCanS, A3343CCStkCanE) == 0 )
               {
                  if ( GXutil.strcmp(A3345TipMovCc, "CC") == 0 )
                  {
                     AV75CCStkCanS = AV75CCStkCanS.add(A3344CCStkCanS) ;
                     AV101ValorSF = AV101ValorSF.add((GXutil.roundDecimal( AV75CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                  }
                  if ( GXutil.strcmp(A3345TipMovCc, "CD") == 0 )
                  {
                  }
               }
               else
               {
                  if ( ( GXutil.strcmp(A3345TipMovCc, "EN") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "EI") == 0 ) )
                  {
                     AV74CCStkCanE = AV74CCStkCanE.add(A3343CCStkCanE) ;
                     AV99ValoreI = AV99ValoreI.add((GXutil.roundDecimal( A3343CCStkCanE.multiply(A3349CCStkPre), 2))) ;
                  }
                  if ( ( GXutil.strcmp(A3345TipMovCc, "SC") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "SI") == 0 ) )
                  {
                     AV75CCStkCanS = AV75CCStkCanS.add(A3344CCStkCanS) ;
                     AV101ValorSF = AV101ValorSF.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                  }
               }
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
         /* Using cursor P04V97 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV87PrdNum, AV77Ccstkfeci});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A3348CCStkFec = P04V97_A3348CCStkFec[0] ;
            A719PrdNum = P04V97_A719PrdNum[0] ;
            A3345TipMovCc = P04V97_A3345TipMovCc[0] ;
            A3343CCStkCanE = P04V97_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P04V97_A3344CCStkCanS[0] ;
            A3349CCStkPre = P04V97_A3349CCStkPre[0] ;
            A3342CCStkLin = P04V97_A3342CCStkLin[0] ;
            if ( ( GXutil.strcmp(A3345TipMovCc, "EN") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "EI") == 0 ) )
            {
               AV74CCStkCanE = AV74CCStkCanE.add(A3343CCStkCanE) ;
            }
            if ( ( GXutil.strcmp(A3345TipMovCc, "SC") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "SI") == 0 ) )
            {
               AV75CCStkCanS = AV75CCStkCanS.add(A3344CCStkCanS) ;
            }
            AV99ValoreI = AV99ValoreI.add((GXutil.roundDecimal( A3343CCStkCanE.multiply(A3349CCStkPre), 2))) ;
            AV101ValorSF = AV101ValorSF.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      AV94Saldo = AV74CCStkCanE.subtract(AV75CCStkCanS) ;
      AV96Saldo_v = AV99ValoreI.subtract(AV101ValorSF) ;
   }

   public void S133( )
   {
      /* 'RECUEN' Routine */
      returnInSub = false ;
      AV92Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV90Recexirea = DecimalUtil.doubleToDec(0) ;
      AV91recExiTcc = DecimalUtil.doubleToDec(0) ;
      AV89RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04V98 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV87PrdNum, AV93Recfec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A810RecFec = P04V98_A810RecFec[0] ;
         A719PrdNum = P04V98_A719PrdNum[0] ;
         A809RecExiTeo = P04V98_A809RecExiTeo[0] ;
         A807RecExiRea = P04V98_A807RecExiRea[0] ;
         A808RecExiTcc = P04V98_A808RecExiTcc[0] ;
         A806RecExiRcc = P04V98_A806RecExiRcc[0] ;
         AV92Recexiteo = A809RecExiTeo ;
         AV90Recexirea = A807RecExiRea ;
         AV91recExiTcc = A808RecExiTcc ;
         AV89RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S161( )
   {
      /* 'GOTOCOLUMNA' Routine */
      returnInSub = false ;
   }

   public void S123( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV110Barpie = 0 ;
      AV111BarKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04V910 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV107CCStkBar), Byte.valueOf(AV108CCStkReo), AV109CCStkPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A130BarCodPar = P04V910_A130BarCodPar[0] ;
         A132BarCodReo = P04V910_A132BarCodReo[0] ;
         A129BarCod = P04V910_A129BarCod[0] ;
         A212BarSer = P04V910_A212BarSer[0] ;
         A1652BarSerDsc = P04V910_A1652BarSerDsc[0] ;
         A252CliCod = P04V910_A252CliCod[0] ;
         n252CliCod = P04V910_n252CliCod[0] ;
         A135BarColNom = P04V910_A135BarColNom[0] ;
         A166BarKgm = P04V910_A166BarKgm[0] ;
         A199BarPie1 = P04V910_A199BarPie1[0] ;
         A365DisDes = P04V910_A365DisDes[0] ;
         A898BarPieNDes = P04V910_A898BarPieNDes[0] ;
         A166BarKgm = P04V910_A166BarKgm[0] ;
         A199BarPie1 = P04V910_A199BarPie1[0] ;
         A898BarPieNDes = P04V910_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV110Barpie = A198BarPie ;
         AV111BarKgm = A166BarKgm ;
         AV116Barser = A212BarSer ;
         AV120Barserdsc = A1652BarSerDsc ;
         AV117clicod = A252CliCod ;
         AV118Barcolnom = A135BarColNom ;
         /* Using cursor P04V911 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A119BarAgrCod = P04V911_A119BarAgrCod[0] ;
            A124BarAgrReo = P04V911_A124BarAgrReo[0] ;
            A122BarAgrPar = P04V911_A122BarAgrPar[0] ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A119BarAgrCod ;
            GXv_int2[0] = A124BarAgrReo ;
            GXv_char6[0] = A122BarAgrPar ;
            GXv_decimal7[0] = AV113Kgs ;
            GXv_decimal8[0] = AV114Mts ;
            GXv_int9[0] = AV115Pzs ;
            new app.pkgmtpz(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int2, GXv_char6, GXv_decimal7, GXv_decimal8, GXv_int9) ;
            pxmlkardex.this.A396EmprCod = GXv_char4[0] ;
            pxmlkardex.this.A119BarAgrCod = GXv_int5[0] ;
            pxmlkardex.this.A124BarAgrReo = GXv_int2[0] ;
            pxmlkardex.this.A122BarAgrPar = GXv_char6[0] ;
            pxmlkardex.this.AV113Kgs = GXv_decimal7[0] ;
            pxmlkardex.this.AV114Mts = GXv_decimal8[0] ;
            pxmlkardex.this.AV115Pzs = GXv_int9[0] ;
            AV111BarKgm = AV111BarKgm.add(AV113Kgs) ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      AV119Procesos = "" ;
      /* Using cursor P04V912 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV107CCStkBar), Byte.valueOf(AV108CCStkReo), AV109CCStkPar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A4494HreBarPar = P04V912_A4494HreBarPar[0] ;
         A4493HreBarReo = P04V912_A4493HreBarReo[0] ;
         A4492HreBarCod = P04V912_A4492HreBarCod[0] ;
         A4551HreProCod = P04V912_A4551HreProCod[0] ;
         A4550HreLinPro = P04V912_A4550HreLinPro[0] ;
         A4545HreLinMaq = P04V912_A4545HreLinMaq[0] ;
         A4495HreNumCie = P04V912_A4495HreNumCie[0] ;
         if ( GXutil.strcmp(AV119Procesos, " ") == 0 )
         {
            AV119Procesos = A4551HreProCod ;
         }
         else
         {
            AV119Procesos += "/" + A4551HreProCod ;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S171( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV128Random = (int)(GXutil.random( )*10000) ;
      AV126Filename = "KardexporIntervaloExport-" + GXutil.trim( GXutil.str( AV128Random, 8, 0)) + ".xlsx" ;
      AV125ExcelDocument.Open(AV126Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S181 ();
      if (returnInSub) return;
      AV125ExcelDocument.Clear();
   }

   public void S181( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV125ExcelDocument.getErrCode() != 0 )
      {
         AV126Filename = "" ;
         AV127ErrorMessage = AV125ExcelDocument.getErrDescription() ;
         AV125ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV125ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S181 ();
      if (returnInSub) return;
      AV125ExcelDocument.Close();
   }

   public void S201( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV125ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Periodo ", "")+GXutil.trim( localUtil.dtoc( AV77Ccstkfeci, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+" "+GXutil.trim( localUtil.dtoc( AV76Ccstkfecf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
      AV125ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Ingresos", "") );
      AV125ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Egresos", "") );
      AV125ExcelDocument.Cells(1, 18, 1, 1).setText( httpContext.getMessage( "Saldo", "") );
      AV125ExcelDocument.Cells(1, 12, 1, 1).setBold( (short)(1) );
      AV125ExcelDocument.Cells(1, 12, 1, 1).setColor( 11 );
      AV125ExcelDocument.Cells(1, 15, 1, 1).setBold( (short)(1) );
      AV125ExcelDocument.Cells(1, 15, 1, 1).setColor( 11 );
      AV125ExcelDocument.Cells(1, 18, 1, 1).setBold( (short)(1) );
      AV125ExcelDocument.Cells(1, 18, 1, 1).setColor( 11 );
      AV125ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV125ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV125ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV125ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Doc/Ref", "") );
      AV125ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV125ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Detalle", "") );
      AV125ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV125ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV125ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV125ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV125ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Procesos", "") );
      AV125ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV125ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV125ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV125ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV125ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV125ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV125ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV125ExcelDocument.Cells(2, 19, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV125ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV72i = 1 ;
      while ( AV72i <= 20 )
      {
         AV125ExcelDocument.Cells(2, AV72i, 1, 1).setBold( (short)(1) );
         AV125ExcelDocument.Cells(2, AV72i, 1, 1).setColor( 11 );
         AV72i = (int)(AV72i+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxmlkardex.this.A396EmprCod;
      this.aP1[0] = pxmlkardex.this.AV121PrdNum1;
      this.aP2[0] = pxmlkardex.this.AV122PrdNum2;
      this.aP3[0] = pxmlkardex.this.AV77Ccstkfeci;
      this.aP4[0] = pxmlkardex.this.AV76Ccstkfecf;
      this.aP5[0] = pxmlkardex.this.AV130Op;
      this.aP6[0] = pxmlkardex.this.AV126Filename;
      this.aP7[0] = pxmlkardex.this.AV127ErrorMessage;
      CloseOpenCursors();
      AV125ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04V92_A396EmprCod = new String[] {""} ;
      P04V92_A719PrdNum = new String[] {""} ;
      P04V92_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV87PrdNum = "" ;
      AV125ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV94Saldo = DecimalUtil.ZERO ;
      AV96Saldo_v = DecimalUtil.ZERO ;
      AV95Saldo_l = DecimalUtil.ZERO ;
      AV79Entradas = DecimalUtil.ZERO ;
      AV98Valore = DecimalUtil.ZERO ;
      AV97Salidas = DecimalUtil.ZERO ;
      AV100Valors = DecimalUtil.ZERO ;
      P04V93_A396EmprCod = new String[] {""} ;
      P04V93_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V93_A719PrdNum = new String[] {""} ;
      P04V93_A3345TipMovCc = new String[] {""} ;
      P04V93_A718PrdNom = new String[] {""} ;
      P04V93_A12858CCStkNAlb = new String[] {""} ;
      P04V93_A3354CCStkAlb = new String[] {""} ;
      P04V93_A12229CCStkDoc = new long[1] ;
      P04V93_A3357CCStkDsc = new String[] {""} ;
      P04V93_A3350CCStkBar = new int[1] ;
      P04V93_A3352CCStkPar = new String[] {""} ;
      P04V93_A3351CCStkReo = new byte[1] ;
      P04V93_A3353CCStkPed = new int[1] ;
      P04V93_A3342CCStkLin = new long[1] ;
      P04V93_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V93_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V93_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V93_A3915EmpNumDec = new byte[1] ;
      P04V93_n3915EmpNumDec = new boolean[] {false} ;
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
      GXt_dtime3 = GXutil.resetTime( GXutil.nullDate() );
      AV124CCstkNalb = "" ;
      AV66Texto = "" ;
      AV82Hdr = "" ;
      AV109CCStkPar = "" ;
      AV111BarKgm = DecimalUtil.ZERO ;
      AV116Barser = "" ;
      AV120Barserdsc = "" ;
      AV118Barcolnom = "" ;
      AV119Procesos = "" ;
      AV93Recfec = GXutil.nullDate() ;
      AV90Recexirea = DecimalUtil.ZERO ;
      AV89RecExiRcc = DecimalUtil.ZERO ;
      AV78Ccstkpre = DecimalUtil.ZERO ;
      AV102Recfec1 = GXutil.nullDate() ;
      AV103Exiteo = DecimalUtil.ZERO ;
      AV104PreRec = DecimalUtil.ZERO ;
      AV74CCStkCanE = DecimalUtil.ZERO ;
      AV75CCStkCanS = DecimalUtil.ZERO ;
      AV99ValoreI = DecimalUtil.ZERO ;
      AV101ValorSF = DecimalUtil.ZERO ;
      P04V94_A396EmprCod = new String[] {""} ;
      P04V94_A719PrdNum = new String[] {""} ;
      P04V94_A3345TipMovCc = new String[] {""} ;
      P04V94_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V94_A3342CCStkLin = new long[1] ;
      P04V95_A396EmprCod = new String[] {""} ;
      P04V95_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V95_A719PrdNum = new String[] {""} ;
      P04V95_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V95_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V95_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      P04V96_A396EmprCod = new String[] {""} ;
      P04V96_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V96_A3342CCStkLin = new long[1] ;
      P04V96_A719PrdNum = new String[] {""} ;
      P04V96_A3345TipMovCc = new String[] {""} ;
      P04V96_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V96_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V96_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V97_A396EmprCod = new String[] {""} ;
      P04V97_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V97_A719PrdNum = new String[] {""} ;
      P04V97_A3345TipMovCc = new String[] {""} ;
      P04V97_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V97_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V97_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V97_A3342CCStkLin = new long[1] ;
      AV92Recexiteo = DecimalUtil.ZERO ;
      AV91recExiTcc = DecimalUtil.ZERO ;
      P04V98_A396EmprCod = new String[] {""} ;
      P04V98_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V98_A719PrdNum = new String[] {""} ;
      P04V98_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V98_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V98_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V98_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      P04V910_A396EmprCod = new String[] {""} ;
      P04V910_A130BarCodPar = new String[] {""} ;
      P04V910_A132BarCodReo = new byte[1] ;
      P04V910_A129BarCod = new int[1] ;
      P04V910_A212BarSer = new String[] {""} ;
      P04V910_A1652BarSerDsc = new String[] {""} ;
      P04V910_A252CliCod = new int[1] ;
      P04V910_n252CliCod = new boolean[] {false} ;
      P04V910_A135BarColNom = new String[] {""} ;
      P04V910_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V910_A199BarPie1 = new short[1] ;
      P04V910_A365DisDes = new String[] {""} ;
      P04V910_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P04V911_A396EmprCod = new String[] {""} ;
      P04V911_A129BarCod = new int[1] ;
      P04V911_A132BarCodReo = new byte[1] ;
      P04V911_A130BarCodPar = new String[] {""} ;
      P04V911_A119BarAgrCod = new int[1] ;
      P04V911_A124BarAgrReo = new byte[1] ;
      P04V911_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char6 = new String[1] ;
      AV113Kgs = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV114Mts = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      P04V912_A396EmprCod = new String[] {""} ;
      P04V912_A4494HreBarPar = new String[] {""} ;
      P04V912_A4493HreBarReo = new byte[1] ;
      P04V912_A4492HreBarCod = new int[1] ;
      P04V912_A4551HreProCod = new String[] {""} ;
      P04V912_A4550HreLinPro = new byte[1] ;
      P04V912_A4545HreLinMaq = new short[1] ;
      P04V912_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      A4551HreProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxmlkardex__default(),
         new Object[] {
             new Object[] {
            P04V92_A396EmprCod, P04V92_A719PrdNum, P04V92_A718PrdNom
            }
            , new Object[] {
            P04V93_A396EmprCod, P04V93_A3348CCStkFec, P04V93_A719PrdNum, P04V93_A3345TipMovCc, P04V93_A718PrdNom, P04V93_A12858CCStkNAlb, P04V93_A3354CCStkAlb, P04V93_A12229CCStkDoc, P04V93_A3357CCStkDsc, P04V93_A3350CCStkBar,
            P04V93_A3352CCStkPar, P04V93_A3351CCStkReo, P04V93_A3353CCStkPed, P04V93_A3342CCStkLin, P04V93_A3344CCStkCanS, P04V93_A3349CCStkPre, P04V93_A3343CCStkCanE, P04V93_A3915EmpNumDec, P04V93_n3915EmpNumDec
            }
            , new Object[] {
            P04V94_A396EmprCod, P04V94_A719PrdNum, P04V94_A3345TipMovCc, P04V94_A3348CCStkFec, P04V94_A3342CCStkLin
            }
            , new Object[] {
            P04V95_A396EmprCod, P04V95_A810RecFec, P04V95_A719PrdNum, P04V95_A807RecExiRea, P04V95_A809RecExiTeo, P04V95_A6573RecPreRec
            }
            , new Object[] {
            P04V96_A396EmprCod, P04V96_A3348CCStkFec, P04V96_A3342CCStkLin, P04V96_A719PrdNum, P04V96_A3345TipMovCc, P04V96_A3343CCStkCanE, P04V96_A3344CCStkCanS, P04V96_A3349CCStkPre
            }
            , new Object[] {
            P04V97_A396EmprCod, P04V97_A3348CCStkFec, P04V97_A719PrdNum, P04V97_A3345TipMovCc, P04V97_A3343CCStkCanE, P04V97_A3344CCStkCanS, P04V97_A3349CCStkPre, P04V97_A3342CCStkLin
            }
            , new Object[] {
            P04V98_A396EmprCod, P04V98_A810RecFec, P04V98_A719PrdNum, P04V98_A809RecExiTeo, P04V98_A807RecExiRea, P04V98_A808RecExiTcc, P04V98_A806RecExiRcc
            }
            , new Object[] {
            P04V910_A396EmprCod, P04V910_A130BarCodPar, P04V910_A132BarCodReo, P04V910_A129BarCod, P04V910_A212BarSer, P04V910_A1652BarSerDsc, P04V910_A252CliCod, P04V910_n252CliCod, P04V910_A135BarColNom, P04V910_A166BarKgm,
            P04V910_A199BarPie1, P04V910_A365DisDes, P04V910_A898BarPieNDes
            }
            , new Object[] {
            P04V911_A396EmprCod, P04V911_A129BarCod, P04V911_A132BarCodReo, P04V911_A130BarCodPar, P04V911_A119BarAgrCod, P04V911_A124BarAgrReo, P04V911_A122BarAgrPar
            }
            , new Object[] {
            P04V912_A396EmprCod, P04V912_A4494HreBarPar, P04V912_A4493HreBarReo, P04V912_A4492HreBarCod, P04V912_A4551HreProCod, P04V912_A4550HreLinPro, P04V912_A4545HreLinMaq, P04V912_A4495HreNumCie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV83Kardex ;
   private byte AV112Lavanderias ;
   private byte AV123Nalbaran20 ;
   private byte GXt_int1 ;
   private byte A3351CCStkReo ;
   private byte A3915EmpNumDec ;
   private byte AV108CCStkReo ;
   private byte AV106PrimeraLec ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int2[] ;
   private byte A4493HreBarReo ;
   private byte A4550HreLinPro ;
   private byte A4495HreNumCie ;
   private short A199BarPie1 ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV129CellRow ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV110Barpie ;
   private int AV107CCStkBar ;
   private int AV117clicod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A119BarAgrCod ;
   private int GXv_int5[] ;
   private int AV115Pzs ;
   private int GXv_int9[] ;
   private int A4492HreBarCod ;
   private int AV128Random ;
   private int AV72i ;
   private long A12229CCStkDoc ;
   private long A3342CCStkLin ;
   private long AV105Ccstklin ;
   private java.math.BigDecimal AV94Saldo ;
   private java.math.BigDecimal AV96Saldo_v ;
   private java.math.BigDecimal AV95Saldo_l ;
   private java.math.BigDecimal AV79Entradas ;
   private java.math.BigDecimal AV98Valore ;
   private java.math.BigDecimal AV97Salidas ;
   private java.math.BigDecimal AV100Valors ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal AV111BarKgm ;
   private java.math.BigDecimal AV90Recexirea ;
   private java.math.BigDecimal AV89RecExiRcc ;
   private java.math.BigDecimal AV78Ccstkpre ;
   private java.math.BigDecimal AV103Exiteo ;
   private java.math.BigDecimal AV104PreRec ;
   private java.math.BigDecimal AV74CCStkCanE ;
   private java.math.BigDecimal AV75CCStkCanS ;
   private java.math.BigDecimal AV99ValoreI ;
   private java.math.BigDecimal AV101ValorSF ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV92Recexiteo ;
   private java.math.BigDecimal AV91recExiTcc ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV113Kgs ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV114Mts ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV121PrdNum1 ;
   private String AV122PrdNum2 ;
   private String AV130Op ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV87PrdNum ;
   private String A3345TipMovCc ;
   private String A12858CCStkNAlb ;
   private String A3354CCStkAlb ;
   private String A3357CCStkDsc ;
   private String A3352CCStkPar ;
   private String AV124CCstkNalb ;
   private String AV66Texto ;
   private String AV82Hdr ;
   private String AV109CCStkPar ;
   private String AV116Barser ;
   private String AV120Barserdsc ;
   private String AV118Barcolnom ;
   private String AV119Procesos ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A365DisDes ;
   private String A122BarAgrPar ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String A4494HreBarPar ;
   private String A4551HreProCod ;
   private java.util.Date GXt_dtime3 ;
   private java.util.Date AV77Ccstkfeci ;
   private java.util.Date AV76Ccstkfecf ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV93Recfec ;
   private java.util.Date AV102Recfec1 ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n252CliCod ;
   private String AV126Filename ;
   private String AV127ErrorMessage ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04V92_A396EmprCod ;
   private String[] P04V92_A719PrdNum ;
   private String[] P04V92_A718PrdNom ;
   private String[] P04V93_A396EmprCod ;
   private java.util.Date[] P04V93_A3348CCStkFec ;
   private String[] P04V93_A719PrdNum ;
   private String[] P04V93_A3345TipMovCc ;
   private String[] P04V93_A718PrdNom ;
   private String[] P04V93_A12858CCStkNAlb ;
   private String[] P04V93_A3354CCStkAlb ;
   private long[] P04V93_A12229CCStkDoc ;
   private String[] P04V93_A3357CCStkDsc ;
   private int[] P04V93_A3350CCStkBar ;
   private String[] P04V93_A3352CCStkPar ;
   private byte[] P04V93_A3351CCStkReo ;
   private int[] P04V93_A3353CCStkPed ;
   private long[] P04V93_A3342CCStkLin ;
   private java.math.BigDecimal[] P04V93_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04V93_A3349CCStkPre ;
   private java.math.BigDecimal[] P04V93_A3343CCStkCanE ;
   private byte[] P04V93_A3915EmpNumDec ;
   private boolean[] P04V93_n3915EmpNumDec ;
   private String[] P04V94_A396EmprCod ;
   private String[] P04V94_A719PrdNum ;
   private String[] P04V94_A3345TipMovCc ;
   private java.util.Date[] P04V94_A3348CCStkFec ;
   private long[] P04V94_A3342CCStkLin ;
   private String[] P04V95_A396EmprCod ;
   private java.util.Date[] P04V95_A810RecFec ;
   private String[] P04V95_A719PrdNum ;
   private java.math.BigDecimal[] P04V95_A807RecExiRea ;
   private java.math.BigDecimal[] P04V95_A809RecExiTeo ;
   private java.math.BigDecimal[] P04V95_A6573RecPreRec ;
   private String[] P04V96_A396EmprCod ;
   private java.util.Date[] P04V96_A3348CCStkFec ;
   private long[] P04V96_A3342CCStkLin ;
   private String[] P04V96_A719PrdNum ;
   private String[] P04V96_A3345TipMovCc ;
   private java.math.BigDecimal[] P04V96_A3343CCStkCanE ;
   private java.math.BigDecimal[] P04V96_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04V96_A3349CCStkPre ;
   private String[] P04V97_A396EmprCod ;
   private java.util.Date[] P04V97_A3348CCStkFec ;
   private String[] P04V97_A719PrdNum ;
   private String[] P04V97_A3345TipMovCc ;
   private java.math.BigDecimal[] P04V97_A3343CCStkCanE ;
   private java.math.BigDecimal[] P04V97_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04V97_A3349CCStkPre ;
   private long[] P04V97_A3342CCStkLin ;
   private String[] P04V98_A396EmprCod ;
   private java.util.Date[] P04V98_A810RecFec ;
   private String[] P04V98_A719PrdNum ;
   private java.math.BigDecimal[] P04V98_A809RecExiTeo ;
   private java.math.BigDecimal[] P04V98_A807RecExiRea ;
   private java.math.BigDecimal[] P04V98_A808RecExiTcc ;
   private java.math.BigDecimal[] P04V98_A806RecExiRcc ;
   private String[] P04V910_A396EmprCod ;
   private String[] P04V910_A130BarCodPar ;
   private byte[] P04V910_A132BarCodReo ;
   private int[] P04V910_A129BarCod ;
   private String[] P04V910_A212BarSer ;
   private String[] P04V910_A1652BarSerDsc ;
   private int[] P04V910_A252CliCod ;
   private boolean[] P04V910_n252CliCod ;
   private String[] P04V910_A135BarColNom ;
   private java.math.BigDecimal[] P04V910_A166BarKgm ;
   private short[] P04V910_A199BarPie1 ;
   private String[] P04V910_A365DisDes ;
   private int[] P04V910_A898BarPieNDes ;
   private String[] P04V911_A396EmprCod ;
   private int[] P04V911_A129BarCod ;
   private byte[] P04V911_A132BarCodReo ;
   private String[] P04V911_A130BarCodPar ;
   private int[] P04V911_A119BarAgrCod ;
   private byte[] P04V911_A124BarAgrReo ;
   private String[] P04V911_A122BarAgrPar ;
   private String[] P04V912_A396EmprCod ;
   private String[] P04V912_A4494HreBarPar ;
   private byte[] P04V912_A4493HreBarReo ;
   private int[] P04V912_A4492HreBarCod ;
   private String[] P04V912_A4551HreProCod ;
   private byte[] P04V912_A4550HreLinPro ;
   private short[] P04V912_A4545HreLinMaq ;
   private byte[] P04V912_A4495HreNumCie ;
   private com.genexus.gxoffice.ExcelDoc AV125ExcelDocument ;
}

final  class pxmlkardex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04V92", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04V93", "SELECT T1.EmprCod, T1.CCStkFec, T1.PrdNum, T1.TipMovCc, T3.PrdNom, T1.CCStkNAlb, T1.CCStkAlb, T1.CCStkDoc, T1.CCStkDsc, T1.CCStkBar, T1.CCStkPar, T1.CCStkReo, T1.CCStkPed, T1.CCStkLin, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, T2.EmpNumDec FROM ((TXPCCSTKS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T1.CCStkFec >= ?) AND (T1.CCStkFec <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04V94", "SELECT * FROM (SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec < ?) AND (TipMovCc = 'SR') ORDER BY EmprCod, PrdNum, CCStkFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04V95", "SELECT EmprCod, RecFec, PrdNum, RecExiRea, RecExiTeo, RecPreRec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04V96", "SELECT EmprCod, CCStkFec, CCStkLin, PrdNum, TipMovCc, CCStkCanE, CCStkCanS, CCStkPre FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkLin > ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04V97", "SELECT EmprCod, CCStkFec, PrdNum, TipMovCc, CCStkCanE, CCStkCanS, CCStkPre, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04V98", "SELECT EmprCod, RecFec, PrdNum, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04V910", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSer, T1.BarSerDsc, T1.CliCod, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04V911", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04V912", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreProCod, HreLinPro, HreLinMaq, HreNumCie FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,4);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               return;
            case 7 :
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
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 9 :
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
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

