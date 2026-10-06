package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rst0011e extends GXProcedure
{
   public rst0011e( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rst0011e.class ), "" );
   }

   public rst0011e( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      rst0011e.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      rst0011e.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rst0011e.this.AV15ImpCod = aP1[0];
      this.aP1 = aP1;
      rst0011e.this.AV16PProd = aP2[0];
      this.aP2 = aP2;
      rst0011e.this.AV17UProd = aP3[0];
      this.aP3 = aP3;
      rst0011e.this.AV18Any = aP4[0];
      this.aP4 = aP4;
      rst0011e.this.AV109Opcion = aP5[0];
      this.aP5 = aP5;
      rst0011e.this.aP6 = aP6;
      rst0011e.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV102Fila = 1 ;
      AV103Columna = 1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV95Divisori = (short)(1) ;
      AV36AnyCab = (short)(AV18Any-1) ;
      AV79TipCol = "" ;
      AV43UniCpA = DecimalUtil.ZERO ;
      AV45ValCpA = DecimalUtil.ZERO ;
      AV44UniCoA = DecimalUtil.ZERO ;
      AV46ValCoA = DecimalUtil.ZERO ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV39UniCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV41ValCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV40UniConTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV42ValConTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV83UniCoG = DecimalUtil.ZERO ;
      AV82UniCpG = DecimalUtil.ZERO ;
      AV85ValCoG = DecimalUtil.ZERO ;
      AV84ValCpG = DecimalUtil.ZERO ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV86UniCprGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV88ValCprGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV87UniConGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV89ValConGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV102Fila = 3 ;
      AV103Columna = 1 ;
      AV110Inicio = (short)(0) ;
      /* Using cursor P07197 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16PProd, AV17UProd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7192 = false ;
         A719PrdNum = P07197_A719PrdNum[0] ;
         A681PrdAny = P07197_A681PrdAny[0] ;
         A676PrdAcuConA = P07197_A676PrdAcuConA[0] ;
         A331DifValConA = P07197_A331DifValConA[0] ;
         n331DifValConA = P07197_n331DifValConA[0] ;
         A724PrdPreAct = P07197_A724PrdPreAct[0] ;
         A704PrdExiAlm = P07197_A704PrdExiAlm[0] ;
         A3915EmpNumDec = P07197_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P07197_n3915EmpNumDec[0] ;
         A726PrdPreMed = P07197_A726PrdPreMed[0] ;
         A718PrdNom = P07197_A718PrdNom[0] ;
         A4693PrdNum2 = P07197_A4693PrdNum2[0] ;
         A677PrdAcuCprA = P07197_A677PrdAcuCprA[0] ;
         A748PrdValCprA = P07197_A748PrdValCprA[0] ;
         A746PrdValConA = P07197_A746PrdValConA[0] ;
         A3907ValorPS = P07197_A3907ValorPS[0] ;
         n3907ValorPS = P07197_n3907ValorPS[0] ;
         A3906ValorPE = P07197_A3906ValorPE[0] ;
         n3906ValorPE = P07197_n3906ValorPE[0] ;
         A3915EmpNumDec = P07197_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P07197_n3915EmpNumDec[0] ;
         A724PrdPreAct = P07197_A724PrdPreAct[0] ;
         A704PrdExiAlm = P07197_A704PrdExiAlm[0] ;
         A726PrdPreMed = P07197_A726PrdPreMed[0] ;
         A718PrdNom = P07197_A718PrdNom[0] ;
         A4693PrdNum2 = P07197_A4693PrdNum2[0] ;
         A3906ValorPE = P07197_A3906ValorPE[0] ;
         n3906ValorPE = P07197_n3906ValorPE[0] ;
         A3907ValorPS = P07197_A3907ValorPS[0] ;
         n3907ValorPS = P07197_n3907ValorPS[0] ;
         A677PrdAcuCprA = P07197_A677PrdAcuCprA[0] ;
         A748PrdValCprA = P07197_A748PrdValCprA[0] ;
         A746PrdValConA = P07197_A746PrdValConA[0] ;
         A3908ValorT = A3906ValorPE.subtract(A3907ValorPS) ;
         AV94PrdPreAct = A724PrdPreAct ;
         AV38Exist = A704PrdExiAlm ;
         if ( A3915EmpNumDec == 0 )
         {
            AV37Importe = GXutil.roundDecimal( AV38Exist.multiply(AV94PrdPreAct), 0) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV37Importe = GXutil.roundDecimal( AV38Exist.multiply(AV94PrdPreAct), 2) ;
            }
         }
         AV92PrecioP = A724PrdPreAct.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN) ;
         if ( AV91FlagpreMed == 1 )
         {
            AV92PrecioP = A726PrdPreMed.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN) ;
            AV37Importe = A3908ValorT ;
         }
         AV32UniConAnt = DecimalUtil.doubleToDec(0) ;
         AV33UniCprAnt = DecimalUtil.doubleToDec(0) ;
         AV34ValCprAnt = DecimalUtil.doubleToDec(0) ;
         AV35ValConAnt = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07197_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07197_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk7192 = false ;
            A681PrdAny = P07197_A681PrdAny[0] ;
            A676PrdAcuConA = P07197_A676PrdAcuConA[0] ;
            if ( ( GXutil.strcmp(A719PrdNum, AV16PProd) >= 0 ) && ( GXutil.strcmp(A719PrdNum, AV17UProd) <= 0 ) )
            {
               if ( A681PrdAny == AV18Any - 1 )
               {
                  /* Using cursor P07199 */
                  pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
                  if ( (pr_default.getStatus(1) != 101) )
                  {
                     A677PrdAcuCprA = P07199_A677PrdAcuCprA[0] ;
                     A748PrdValCprA = P07199_A748PrdValCprA[0] ;
                     A746PrdValConA = P07199_A746PrdValConA[0] ;
                  }
                  else
                  {
                     A677PrdAcuCprA = DecimalUtil.doubleToDec(0) ;
                     A748PrdValCprA = DecimalUtil.doubleToDec(0) ;
                     A746PrdValConA = DecimalUtil.doubleToDec(0) ;
                  }
                  pr_default.close(1);
                  AV32UniConAnt = A676PrdAcuConA.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN) ;
                  AV33UniCprAnt = A677PrdAcuCprA ;
                  AV34ValCprAnt = A748PrdValCprA ;
                  AV35ValConAnt = A746PrdValConA.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN) ;
               }
            }
            brk7192 = true ;
            pr_default.readNext(0);
         }
         AV29TotUniCon = DecimalUtil.doubleToDec(0) ;
         AV28TotUniCpr = DecimalUtil.doubleToDec(0) ;
         AV31TotValCon = DecimalUtil.doubleToDec(0) ;
         AV30TotValCpr = DecimalUtil.doubleToDec(0) ;
         AV24I = (byte)(1) ;
         while ( AV24I <= 12 )
         {
            AV23UniCprMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
            AV25ValCprMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
            AV26UniConMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
            AV27ValConMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
            AV24I = (byte)(AV24I+1) ;
         }
         /* Using cursor P071910 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV18Any)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A681PrdAny = P071910_A681PrdAny[0] ;
            A720PrdNumMes = P071910_A720PrdNumMes[0] ;
            A745PrdUniCprM = P071910_A745PrdUniCprM[0] ;
            A749PrdValCprM = P071910_A749PrdValCprM[0] ;
            A744PrdUniConM = P071910_A744PrdUniConM[0] ;
            A747PrdValConM = P071910_A747PrdValConM[0] ;
            AV24I = A720PrdNumMes ;
            AV23UniCprMes[AV24I-1] = AV23UniCprMes[AV24I-1].add(A745PrdUniCprM) ;
            AV28TotUniCpr = AV28TotUniCpr.add(A745PrdUniCprM) ;
            AV25ValCprMes[AV24I-1] = AV25ValCprMes[AV24I-1].add(A749PrdValCprM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV30TotValCpr = AV30TotValCpr.add(A749PrdValCprM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV26UniConMes[AV24I-1] = AV26UniConMes[AV24I-1].add(A744PrdUniConM) ;
            AV29TotUniCon = AV29TotUniCon.add(A744PrdUniConM) ;
            AV27ValConMes[AV24I-1] = AV27ValConMes[AV24I-1].add(A747PrdValConM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV31TotValCon = AV31TotValCon.add(A747PrdValConM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV39UniCprTot[AV24I-1] = AV39UniCprTot[AV24I-1].add(A745PrdUniCprM) ;
            AV41ValCprTot[AV24I-1] = AV41ValCprTot[AV24I-1].add(A749PrdValCprM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV40UniConTot[AV24I-1] = AV40UniConTot[AV24I-1].add(A744PrdUniConM) ;
            AV42ValConTot[AV24I-1] = AV42ValConTot[AV24I-1].add(A747PrdValConM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV86UniCprGen[AV24I-1] = AV86UniCprGen[AV24I-1].add(A745PrdUniCprM) ;
            AV88ValCprGen[AV24I-1] = AV88ValCprGen[AV24I-1].add(A749PrdValCprM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            AV87UniConGen[AV24I-1] = AV87UniConGen[AV24I-1].add(A744PrdUniConM) ;
            AV89ValConGen[AV24I-1] = AV89ValConGen[AV24I-1].add(A747PrdValConM.divide(DecimalUtil.doubleToDec(AV95Divisori), 18, java.math.RoundingMode.DOWN)) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV96Producto = GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) ;
         AV104ExcelDocument.Cells(AV102Fila, 1, 1, 1).setText( AV96Producto );
         AV104ExcelDocument.Cells(AV102Fila, 2, 1, 1).setText( A4693PrdNum2 );
         if ( ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "B", "")) == 0 ) )
         {
            AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[1-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[2-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[3-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[4-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[5-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[6-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[7-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[8-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[9-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[10-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[11-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23UniCprMes[12-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV28TotUniCpr)) );
            AV104ExcelDocument.Cells(AV102Fila, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33UniCprAnt)) );
            if ( AV110Inicio == 0 )
            {
               AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Compras", "") );
            }
            AV102Fila = (int)(AV102Fila+1) ;
            AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[1-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[2-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[3-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[4-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[5-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[6-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[7-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[8-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[9-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[10-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[11-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValCprMes[12-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV30TotValCpr)) );
            AV104ExcelDocument.Cells(AV102Fila, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV34ValCprAnt)) );
            if ( AV110Inicio == 0 )
            {
               AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Valor", "") );
            }
         }
         if ( ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "A", "")) == 0 ) )
         {
            AV102Fila = (int)(AV102Fila+(((GXutil.strcmp(AV109Opcion, httpContext.getMessage( "A", ""))==0) ? 1 : 2))) ;
            AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[1-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[2-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[3-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[4-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[5-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[6-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[7-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[8-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[9-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[10-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[11-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26UniConMes[12-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29TotUniCon)) );
            AV104ExcelDocument.Cells(AV102Fila, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV32UniConAnt)) );
            if ( AV110Inicio == 0 )
            {
               AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Consumos", "") );
            }
            AV102Fila = (int)(AV102Fila+1) ;
            AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[1-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[2-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[3-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[4-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[5-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[6-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[7-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[8-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[9-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[10-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[11-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ValConMes[12-1])) );
            AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV31TotValCon)) );
            AV104ExcelDocument.Cells(AV102Fila, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV35ValConAnt)) );
            if ( AV110Inicio == 0 )
            {
               AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Valor", "") );
            }
         }
         AV102Fila = (int)(AV102Fila+1) ;
         AV43UniCpA = AV43UniCpA.add(AV28TotUniCpr) ;
         AV45ValCpA = AV45ValCpA.add(AV30TotValCpr) ;
         AV44UniCoA = AV44UniCoA.add(AV29TotUniCon) ;
         AV46ValCoA = AV46ValCoA.add(AV31TotValCon) ;
         AV79TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
         AV82UniCpG = AV82UniCpG.add(AV28TotUniCpr) ;
         AV84ValCpG = AV84ValCpG.add(AV30TotValCpr) ;
         AV83UniCoG = AV83UniCoG.add(AV29TotUniCon) ;
         AV85ValCoG = AV85ValCoG.add(AV31TotValCon) ;
         AV110Inicio = (short)(1) ;
         if ( ! brk7192 )
         {
            brk7192 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "B", "")) == 0 ) )
      {
         AV102Fila = (int)(AV102Fila+2) ;
         AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[1-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[2-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[3-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[4-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[5-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[6-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[7-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[8-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[9-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[10-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[11-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86UniCprGen[12-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV82UniCpG)) );
         AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Compras", "") );
         AV102Fila = (int)(AV102Fila+1) ;
         AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[1-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[2-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[3-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[4-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[5-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[6-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[7-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[8-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[9-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[10-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[11-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88ValCprGen[12-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84ValCpG)) );
         AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      }
      if ( ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV109Opcion, httpContext.getMessage( "A", "")) == 0 ) )
      {
         AV102Fila = (int)(AV102Fila+2) ;
         AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[1-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[2-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[3-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[4-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[5-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[6-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[7-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[8-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[9-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[10-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[11-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87UniConGen[12-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83UniCoG)) );
         AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Consumos", "") );
         AV102Fila = (int)(AV102Fila+1) ;
         AV104ExcelDocument.Cells(AV102Fila, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[1-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[2-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[3-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[4-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[5-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[6-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[7-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[8-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[9-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[10-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[11-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89ValConGen[12-1])) );
         AV104ExcelDocument.Cells(AV102Fila, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV85ValCoG)) );
         AV104ExcelDocument.Cells(AV102Fila, 17, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV108Random = (int)(GXutil.random( )*10000) ;
      AV105Filename = "Estadisticas Productos_" + GXutil.trim( GXutil.str( AV18Any, 4, 0)) + httpContext.getMessage( "Export-", "") + GXutil.trim( GXutil.str( AV108Random, 8, 0)) + ".xlsx" ;
      AV104ExcelDocument.Open(AV105Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV104ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV104ExcelDocument.getErrCode() != 0 )
      {
         AV105Filename = "" ;
         AV106ErrorMessage = AV104ExcelDocument.getErrDescription() ;
         AV104ExcelDocument.Close();
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV104ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV104ExcelDocument.Close();
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV104ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Año ", "")+GXutil.trim( GXutil.str( AV18Any, 4, 0)) );
      AV104ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV104ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV104ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV104ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Producto Ext.", "") );
      AV104ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Enero", "") );
      AV104ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Febrero", "") );
      AV104ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Marzo", "") );
      AV104ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Abril", "") );
      AV104ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Mayo", "") );
      AV104ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Junio", "") );
      AV104ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Julio", "") );
      AV104ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Agosto", "") );
      AV104ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Septiembre", "") );
      AV104ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Octubre", "") );
      AV104ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Noviembre", "") );
      AV104ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Diciembre", "") );
      AV104ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Total", "") );
      AV104ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Año Anterior", "") );
      AV107t = (short)(1) ;
      while ( AV107t <= 17 )
      {
         AV104ExcelDocument.Cells(2, AV107t, 1, 1).setBold( (short)(1) );
         AV104ExcelDocument.Cells(2, AV107t, 1, 1).setColor( 11 );
         AV107t = (short)(AV107t+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = rst0011e.this.A396EmprCod;
      this.aP1[0] = rst0011e.this.AV15ImpCod;
      this.aP2[0] = rst0011e.this.AV16PProd;
      this.aP3[0] = rst0011e.this.AV17UProd;
      this.aP4[0] = rst0011e.this.AV18Any;
      this.aP5[0] = rst0011e.this.AV109Opcion;
      this.aP6[0] = rst0011e.this.AV105Filename;
      this.aP7[0] = rst0011e.this.AV106ErrorMessage;
      CloseOpenCursors();
      AV104ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV105Filename = "" ;
      AV106ErrorMessage = "" ;
      AV79TipCol = "" ;
      AV43UniCpA = DecimalUtil.ZERO ;
      AV45ValCpA = DecimalUtil.ZERO ;
      AV44UniCoA = DecimalUtil.ZERO ;
      AV46ValCoA = DecimalUtil.ZERO ;
      AV39UniCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV39UniCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV41ValCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV41ValCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV40UniConTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV40UniConTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV42ValConTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV42ValConTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV83UniCoG = DecimalUtil.ZERO ;
      AV82UniCpG = DecimalUtil.ZERO ;
      AV85ValCoG = DecimalUtil.ZERO ;
      AV84ValCpG = DecimalUtil.ZERO ;
      AV86UniCprGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV86UniCprGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV88ValCprGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV88ValCprGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV87UniConGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV87UniConGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV89ValConGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV89ValConGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P07197_A396EmprCod = new String[] {""} ;
      P07197_A719PrdNum = new String[] {""} ;
      P07197_A681PrdAny = new short[1] ;
      P07197_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_n331DifValConA = new boolean[] {false} ;
      P07197_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A3915EmpNumDec = new byte[1] ;
      P07197_n3915EmpNumDec = new boolean[] {false} ;
      P07197_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A718PrdNom = new String[] {""} ;
      P07197_A4693PrdNum2 = new String[] {""} ;
      P07197_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_A3907ValorPS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_n3907ValorPS = new boolean[] {false} ;
      P07197_A3906ValorPE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07197_n3906ValorPE = new boolean[] {false} ;
      A719PrdNum = "" ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A4693PrdNum2 = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A3907ValorPS = DecimalUtil.ZERO ;
      A3906ValorPE = DecimalUtil.ZERO ;
      A3908ValorT = DecimalUtil.ZERO ;
      AV94PrdPreAct = DecimalUtil.ZERO ;
      AV38Exist = DecimalUtil.ZERO ;
      AV37Importe = DecimalUtil.ZERO ;
      AV92PrecioP = DecimalUtil.ZERO ;
      AV32UniConAnt = DecimalUtil.ZERO ;
      AV33UniCprAnt = DecimalUtil.ZERO ;
      AV34ValCprAnt = DecimalUtil.ZERO ;
      AV35ValConAnt = DecimalUtil.ZERO ;
      P07199_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07199_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07199_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV29TotUniCon = DecimalUtil.ZERO ;
      AV28TotUniCpr = DecimalUtil.ZERO ;
      AV31TotValCon = DecimalUtil.ZERO ;
      AV30TotValCpr = DecimalUtil.ZERO ;
      AV23UniCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV23UniCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV25ValCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV25ValCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV26UniConMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV26UniConMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27ValConMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV27ValConMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P071910_A396EmprCod = new String[] {""} ;
      P071910_A719PrdNum = new String[] {""} ;
      P071910_A681PrdAny = new short[1] ;
      P071910_A720PrdNumMes = new byte[1] ;
      P071910_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071910_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071910_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071910_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      AV96Producto = "" ;
      AV104ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0011e__default(),
         new Object[] {
             new Object[] {
            P07197_A396EmprCod, P07197_A719PrdNum, P07197_A681PrdAny, P07197_A676PrdAcuConA, P07197_A331DifValConA, P07197_n331DifValConA, P07197_A724PrdPreAct, P07197_A704PrdExiAlm, P07197_A3915EmpNumDec, P07197_n3915EmpNumDec,
            P07197_A726PrdPreMed, P07197_A718PrdNom, P07197_A4693PrdNum2, P07197_A677PrdAcuCprA, P07197_A748PrdValCprA, P07197_A746PrdValConA, P07197_A3907ValorPS, P07197_n3907ValorPS, P07197_A3906ValorPE, P07197_n3906ValorPE
            }
            , new Object[] {
            P07199_A677PrdAcuCprA, P07199_A748PrdValCprA, P07199_A746PrdValConA
            }
            , new Object[] {
            P071910_A396EmprCod, P071910_A719PrdNum, P071910_A681PrdAny, P071910_A720PrdNumMes, P071910_A745PrdUniCprM, P071910_A749PrdValCprM, P071910_A744PrdUniConM, P071910_A747PrdValConM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private byte AV91FlagpreMed ;
   private byte AV24I ;
   private byte A720PrdNumMes ;
   private short AV18Any ;
   private short AV95Divisori ;
   private short AV36AnyCab ;
   private short AV110Inicio ;
   private short A681PrdAny ;
   private short AV107t ;
   private short Gx_err ;
   private int AV102Fila ;
   private int AV103Columna ;
   private int GX_I ;
   private int AV108Random ;
   private java.math.BigDecimal AV43UniCpA ;
   private java.math.BigDecimal AV45ValCpA ;
   private java.math.BigDecimal AV44UniCoA ;
   private java.math.BigDecimal AV46ValCoA ;
   private java.math.BigDecimal AV39UniCprTot[] ;
   private java.math.BigDecimal AV41ValCprTot[] ;
   private java.math.BigDecimal AV40UniConTot[] ;
   private java.math.BigDecimal AV42ValConTot[] ;
   private java.math.BigDecimal AV83UniCoG ;
   private java.math.BigDecimal AV82UniCpG ;
   private java.math.BigDecimal AV85ValCoG ;
   private java.math.BigDecimal AV84ValCpG ;
   private java.math.BigDecimal AV86UniCprGen[] ;
   private java.math.BigDecimal AV88ValCprGen[] ;
   private java.math.BigDecimal AV87UniConGen[] ;
   private java.math.BigDecimal AV89ValConGen[] ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A3907ValorPS ;
   private java.math.BigDecimal A3906ValorPE ;
   private java.math.BigDecimal A3908ValorT ;
   private java.math.BigDecimal AV94PrdPreAct ;
   private java.math.BigDecimal AV38Exist ;
   private java.math.BigDecimal AV37Importe ;
   private java.math.BigDecimal AV92PrecioP ;
   private java.math.BigDecimal AV32UniConAnt ;
   private java.math.BigDecimal AV33UniCprAnt ;
   private java.math.BigDecimal AV34ValCprAnt ;
   private java.math.BigDecimal AV35ValConAnt ;
   private java.math.BigDecimal AV29TotUniCon ;
   private java.math.BigDecimal AV28TotUniCpr ;
   private java.math.BigDecimal AV31TotValCon ;
   private java.math.BigDecimal AV30TotValCpr ;
   private java.math.BigDecimal AV23UniCprMes[] ;
   private java.math.BigDecimal AV25ValCprMes[] ;
   private java.math.BigDecimal AV26UniConMes[] ;
   private java.math.BigDecimal AV27ValConMes[] ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProd ;
   private String AV17UProd ;
   private String AV109Opcion ;
   private String AV79TipCol ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A4693PrdNum2 ;
   private String AV96Producto ;
   private boolean returnInSub ;
   private boolean brk7192 ;
   private boolean n331DifValConA ;
   private boolean n3915EmpNumDec ;
   private boolean n3907ValorPS ;
   private boolean n3906ValorPE ;
   private String AV105Filename ;
   private String AV106ErrorMessage ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P07197_A396EmprCod ;
   private String[] P07197_A719PrdNum ;
   private short[] P07197_A681PrdAny ;
   private java.math.BigDecimal[] P07197_A676PrdAcuConA ;
   private java.math.BigDecimal[] P07197_A331DifValConA ;
   private boolean[] P07197_n331DifValConA ;
   private java.math.BigDecimal[] P07197_A724PrdPreAct ;
   private java.math.BigDecimal[] P07197_A704PrdExiAlm ;
   private byte[] P07197_A3915EmpNumDec ;
   private boolean[] P07197_n3915EmpNumDec ;
   private java.math.BigDecimal[] P07197_A726PrdPreMed ;
   private String[] P07197_A718PrdNom ;
   private String[] P07197_A4693PrdNum2 ;
   private java.math.BigDecimal[] P07197_A677PrdAcuCprA ;
   private java.math.BigDecimal[] P07197_A748PrdValCprA ;
   private java.math.BigDecimal[] P07197_A746PrdValConA ;
   private java.math.BigDecimal[] P07197_A3907ValorPS ;
   private boolean[] P07197_n3907ValorPS ;
   private java.math.BigDecimal[] P07197_A3906ValorPE ;
   private boolean[] P07197_n3906ValorPE ;
   private java.math.BigDecimal[] P07199_A677PrdAcuCprA ;
   private java.math.BigDecimal[] P07199_A748PrdValCprA ;
   private java.math.BigDecimal[] P07199_A746PrdValConA ;
   private String[] P071910_A396EmprCod ;
   private String[] P071910_A719PrdNum ;
   private short[] P071910_A681PrdAny ;
   private byte[] P071910_A720PrdNumMes ;
   private java.math.BigDecimal[] P071910_A745PrdUniCprM ;
   private java.math.BigDecimal[] P071910_A749PrdValCprM ;
   private java.math.BigDecimal[] P071910_A744PrdUniConM ;
   private java.math.BigDecimal[] P071910_A747PrdValConM ;
   private com.genexus.gxoffice.ExcelDoc AV104ExcelDocument ;
}

final  class rst0011e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07197", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAny, T1.PrdAcuConA, T1.DifValConA, T3.PrdPreAct, T3.PrdExiAlm, T2.EmpNumDec, T3.PrdPreMed, T3.PrdNom, T3.PrdNum2, COALESCE( T6.PrdAcuCprA, 0) AS PrdAcuCprA, COALESCE( T6.PrdValCprA, 0) AS PrdValCprA, COALESCE( T6.PrdValConA, 0) AS PrdValConA, COALESCE( T5.ValorPS, 0) AS ValorPS, COALESCE( T4.ValorPE, 0) AS ValorPE FROM (((((TXPCPRDES T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(COALESCE( T8.ValorE, 0)) AS ValorPE, T7.EmprCod, T7.PrdNum FROM (TXPCCSTKS T7 LEFT JOIN (SELECT CASE  WHEN COALESCE( T10.EmpNumDec, 0) = 0 THEN ROUND(( T9.CCStkCanE * CAST(T9.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T10.EmpNumDec, 0) = 2 THEN ROUND(( T9.CCStkCanE * CAST(T9.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorE, T9.EmprCod, T9.PrdNum, T9.CCStkLin FROM (TXPCCSTKS T9 INNER JOIN TXPEMPRES T10 ON T10.EmprCod = T9.EmprCod) ) T8 ON T8.EmprCod = T7.EmprCod AND T8.PrdNum = T7.PrdNum AND T8.CCStkLin = T7.CCStkLin) GROUP BY T7.EmprCod, T7.PrdNum ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(COALESCE( T8.ValorS, 0)) AS ValorPS, T7.EmprCod, T7.PrdNum FROM (TXPCCSTKS T7 LEFT JOIN (SELECT CASE  WHEN COALESCE( T10.EmpNumDec, 0) = 0 THEN ROUND(( T9.CCStkCanS * CAST(T9.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T10.EmpNumDec, 0) = 2 THEN ROUND(( T9.CCStkCanS * CAST(T9.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T9.EmprCod, T9.PrdNum, T9.CCStkLin FROM (TXPCCSTKS T9 INNER JOIN TXPEMPRES T10 ON T10.EmprCod = T9.EmprCod) ) T8 ON T8.EmprCod = T7.EmprCod AND T8.PrdNum = T7.PrdNum AND T8.CCStkLin = T7.CCStkLin) GROUP BY T7.EmprCod, T7.PrdNum ) T5 ON T5.EmprCod = T1.EmprCod AND T5.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(PrdUniCprM) AS PrdAcuCprA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdValConM) AS PrdValConA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T6 ON T6.EmprCod = T1.EmprCod AND T6.PrdNum = T1.PrdNum AND T6.PrdAny = T1.PrdAny) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07199", "SELECT COALESCE( T1.PrdAcuCprA, 0) AS PrdAcuCprA, COALESCE( T1.PrdValCprA, 0) AS PrdValCprA, COALESCE( T1.PrdValConA, 0) AS PrdValConA FROM (SELECT SUM(PrdUniCprM) AS PrdAcuCprA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdValConM) AS PrdValConA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? AND T1.PrdAny = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P071910", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdValCprM, PrdUniConM, PrdValConM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

