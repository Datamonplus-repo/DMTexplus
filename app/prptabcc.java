package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prptabcc extends GXProcedure
{
   public prptabcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prptabcc.class ), "" );
   }

   public prptabcc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      prptabcc.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      prptabcc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prptabcc.this.AV198ImpCod = aP1[0];
      this.aP1 = aP1;
      prptabcc.this.AV193Anyo = aP2[0];
      this.aP2 = aP2;
      prptabcc.this.AV220Mesi = aP3[0];
      this.aP3 = aP3;
      prptabcc.this.AV219MesF = aP4[0];
      this.aP4 = aP4;
      prptabcc.this.aP5 = aP5;
      prptabcc.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
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
      AV195Fila = 1 ;
      AV194Columna = 1 ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV193Anyo ;
      GXv_int3[0] = AV220Mesi ;
      GXv_int4[0] = AV219MesF ;
      new app.pordprd1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4) ;
      prptabcc.this.A396EmprCod = GXv_char1[0] ;
      prptabcc.this.AV193Anyo = GXv_int2[0] ;
      prptabcc.this.AV220Mesi = GXv_int3[0] ;
      prptabcc.this.AV219MesF = GXv_int4[0] ;
      AV224Porcen = DecimalUtil.doubleToDec(0) ;
      AV223PorAcu = DecimalUtil.doubleToDec(0) ;
      AV225PorcGrp = DecimalUtil.doubleToDec(0) ;
      AV230TotGrp = DecimalUtil.doubleToDec(0) ;
      AV231TotInf = DecimalUtil.doubleToDec(0) ;
      AV196Flag = (byte)(1) ;
      AV195Fila = 3 ;
      /* Using cursor P04L82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV193Anyo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A681PrdAny = P04L82_A681PrdAny[0] ;
         A719PrdNum = P04L82_A719PrdNum[0] ;
         A331DifValConA = P04L82_A331DifValConA[0] ;
         n331DifValConA = P04L82_n331DifValConA[0] ;
         /* Using cursor P04L83 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV220Mesi), Byte.valueOf(AV219MesF)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A720PrdNumMes = P04L83_A720PrdNumMes[0] ;
            A747PrdValConM = P04L83_A747PrdValConM[0] ;
            A744PrdUniConM = P04L83_A744PrdUniConM[0] ;
            if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
            {
               AV228TotCoN = AV228TotCoN.add(A747PrdValConM) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04L84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV193Anyo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A681PrdAny = P04L84_A681PrdAny[0] ;
         A719PrdNum = P04L84_A719PrdNum[0] ;
         A4693PrdNum2 = P04L84_A4693PrdNum2[0] ;
         A718PrdNom = P04L84_A718PrdNom[0] ;
         A331DifValConA = P04L84_A331DifValConA[0] ;
         n331DifValConA = P04L84_n331DifValConA[0] ;
         A4693PrdNum2 = P04L84_A4693PrdNum2[0] ;
         A718PrdNom = P04L84_A718PrdNom[0] ;
         /* Using cursor P04L85 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV220Mesi), Byte.valueOf(AV219MesF)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            brk4L85 = false ;
            A744PrdUniConM = P04L85_A744PrdUniConM[0] ;
            A747PrdValConM = P04L85_A747PrdValConM[0] ;
            A720PrdNumMes = P04L85_A720PrdNumMes[0] ;
            if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
            {
               if ( AV196Flag == 3 )
               {
                  AV196Flag = (byte)(4) ;
               }
               AV226PrdUniConM = DecimalUtil.doubleToDec(0) ;
               AV227PrdValConM = DecimalUtil.doubleToDec(0) ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P04L85_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P04L85_A719PrdNum[0], A719PrdNum) == 0 ) && ( P04L85_A681PrdAny[0] == A681PrdAny ) )
               {
                  brk4L85 = false ;
                  A744PrdUniConM = P04L85_A744PrdUniConM[0] ;
                  A747PrdValConM = P04L85_A747PrdValConM[0] ;
                  A720PrdNumMes = P04L85_A720PrdNumMes[0] ;
                  AV226PrdUniConM = AV226PrdUniConM.add(A744PrdUniConM) ;
                  AV227PrdValConM = AV227PrdValConM.add(A747PrdValConM) ;
                  brk4L85 = true ;
                  pr_default.readNext(3);
               }
               if ( AV228TotCoN.doubleValue() != 0 )
               {
                  AV224Porcen = AV227PrdValConM.multiply(DecimalUtil.doubleToDec(100)).divide(AV228TotCoN, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV224Porcen = DecimalUtil.doubleToDec(0) ;
               }
               AV223PorAcu = AV223PorAcu.add(AV224Porcen) ;
               AV231TotInf = AV231TotInf.add(AV227PrdValConM) ;
               AV232TotInfC = AV232TotInfC.add(AV226PrdUniConM) ;
               AV234ExcelDocument.Cells(AV195Fila, 1, 1, 1).setText( A719PrdNum );
               AV234ExcelDocument.Cells(AV195Fila, 2, 1, 1).setText( A4693PrdNum2 );
               AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( A718PrdNom );
               AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV226PrdUniConM)) );
               AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV227PrdValConM)) );
               AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV224Porcen)) );
               AV225PorcGrp = AV225PorcGrp.add(AV224Porcen) ;
               AV230TotGrp = AV230TotGrp.add(AV227PrdValConM) ;
               AV233TotUniC = AV233TotUniC.add(AV226PrdUniConM) ;
               AV195Fila = (int)(AV195Fila+1) ;
               if ( ( AV223PorAcu.doubleValue() >= 80 ) && ( AV196Flag == 1 ) )
               {
                  AV195Fila = (int)(AV195Fila+1) ;
                  AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV204Lit13 );
                  AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV233TotUniC)) );
                  AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV230TotGrp)) );
                  AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV225PorcGrp)) );
                  AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
                  AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
                  AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
                  AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
                  AV225PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV230TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV233TotUniC = DecimalUtil.doubleToDec(0) ;
                  AV196Flag = (byte)(2) ;
               }
               if ( ( AV223PorAcu.doubleValue() > 95 ) && ( AV196Flag == 2 ) )
               {
                  AV195Fila = (int)(AV195Fila+1) ;
                  AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV205Lit14 );
                  AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV233TotUniC)) );
                  AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV230TotGrp)) );
                  AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV225PorcGrp)) );
                  AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
                  AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
                  AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
                  AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
                  AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
                  AV225PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV230TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV233TotUniC = DecimalUtil.doubleToDec(0) ;
                  AV196Flag = (byte)(3) ;
               }
            }
            if ( ! brk4L85 )
            {
               brk4L85 = true ;
               pr_default.readNext(3);
            }
         }
         pr_default.close(3);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV196Flag == 4 )
      {
         AV195Fila = (int)(AV195Fila+1) ;
         AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV206Lit15 );
         AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV233TotUniC)) );
         AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV230TotGrp)) );
         AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV225PorcGrp)) );
         AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
         AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
         AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
         AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
         AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
         AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
         AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
         AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
      }
      AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV207Lit16 );
      AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV232TotInfC)) );
      AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV231TotInf)) );
      AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV223PorAcu)) );
      AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
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
      AV237Random = (int)(GXutil.random( )*10000) ;
      AV235Filename = "ABC_Consumos_TodosExport-" + GXutil.trim( GXutil.str( AV237Random, 8, 0)) + ".xlsx" ;
      AV234ExcelDocument.Open(AV235Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV234ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV234ExcelDocument.getErrCode() != 0 )
      {
         AV235Filename = "" ;
         AV236ErrorMessage = AV234ExcelDocument.getErrDescription() ;
         AV234ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV234ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV234ExcelDocument.Close();
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV234ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Año", "") );
      AV234ExcelDocument.Cells(1, 2, 1, 1).setNumber( AV193Anyo );
      AV234ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Meses", "") );
      AV234ExcelDocument.Cells(1, 4, 1, 1).setNumber( AV220Mesi );
      AV234ExcelDocument.Cells(1, 5, 1, 1).setNumber( AV219MesF );
      AV234ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV234ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Producto Ext.", "") );
      AV234ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Descripcion.", "") );
      AV234ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Unidades Consumo Acumuladas", "") );
      AV234ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV234ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "% Total", "") );
      AV234ExcelDocument.Cells(2, 1, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(2, 2, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(2, 3, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(2, 4, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(2, 5, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(2, 6, 1, 1).setBold( (short)(1) );
      AV234ExcelDocument.Cells(2, 1, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(2, 2, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(2, 3, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(2, 4, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(2, 5, 1, 1).setColor( 11 );
      AV234ExcelDocument.Cells(2, 6, 1, 1).setColor( 11 );
   }

   protected void cleanup( )
   {
      this.aP0[0] = prptabcc.this.A396EmprCod;
      this.aP1[0] = prptabcc.this.AV198ImpCod;
      this.aP2[0] = prptabcc.this.AV193Anyo;
      this.aP3[0] = prptabcc.this.AV220Mesi;
      this.aP4[0] = prptabcc.this.AV219MesF;
      this.aP5[0] = prptabcc.this.AV235Filename;
      this.aP6[0] = prptabcc.this.AV236ErrorMessage;
      CloseOpenCursors();
      AV234ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV235Filename = "" ;
      AV236ErrorMessage = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int4 = new byte[1] ;
      AV224Porcen = DecimalUtil.ZERO ;
      AV223PorAcu = DecimalUtil.ZERO ;
      AV225PorcGrp = DecimalUtil.ZERO ;
      AV230TotGrp = DecimalUtil.ZERO ;
      AV231TotInf = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04L82_A396EmprCod = new String[] {""} ;
      P04L82_A681PrdAny = new short[1] ;
      P04L82_A719PrdNum = new String[] {""} ;
      P04L82_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04L82_n331DifValConA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      P04L83_A396EmprCod = new String[] {""} ;
      P04L83_A719PrdNum = new String[] {""} ;
      P04L83_A681PrdAny = new short[1] ;
      P04L83_A720PrdNumMes = new byte[1] ;
      P04L83_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04L83_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A747PrdValConM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      AV228TotCoN = DecimalUtil.ZERO ;
      P04L84_A396EmprCod = new String[] {""} ;
      P04L84_A681PrdAny = new short[1] ;
      P04L84_A719PrdNum = new String[] {""} ;
      P04L84_A4693PrdNum2 = new String[] {""} ;
      P04L84_A718PrdNom = new String[] {""} ;
      P04L84_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04L84_n331DifValConA = new boolean[] {false} ;
      A4693PrdNum2 = "" ;
      A718PrdNom = "" ;
      P04L85_A396EmprCod = new String[] {""} ;
      P04L85_A719PrdNum = new String[] {""} ;
      P04L85_A681PrdAny = new short[1] ;
      P04L85_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04L85_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04L85_A720PrdNumMes = new byte[1] ;
      AV226PrdUniConM = DecimalUtil.ZERO ;
      AV227PrdValConM = DecimalUtil.ZERO ;
      AV232TotInfC = DecimalUtil.ZERO ;
      AV234ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV233TotUniC = DecimalUtil.ZERO ;
      AV204Lit13 = "" ;
      AV205Lit14 = "" ;
      AV206Lit15 = "" ;
      AV207Lit16 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prptabcc__default(),
         new Object[] {
             new Object[] {
            P04L82_A396EmprCod, P04L82_A681PrdAny, P04L82_A719PrdNum, P04L82_A331DifValConA, P04L82_n331DifValConA
            }
            , new Object[] {
            P04L83_A396EmprCod, P04L83_A719PrdNum, P04L83_A681PrdAny, P04L83_A720PrdNumMes, P04L83_A747PrdValConM, P04L83_A744PrdUniConM
            }
            , new Object[] {
            P04L84_A396EmprCod, P04L84_A681PrdAny, P04L84_A719PrdNum, P04L84_A4693PrdNum2, P04L84_A718PrdNom, P04L84_A331DifValConA, P04L84_n331DifValConA
            }
            , new Object[] {
            P04L85_A396EmprCod, P04L85_A719PrdNum, P04L85_A681PrdAny, P04L85_A744PrdUniConM, P04L85_A747PrdValConM, P04L85_A720PrdNumMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV220Mesi ;
   private byte AV219MesF ;
   private byte GXv_int3[] ;
   private byte GXv_int4[] ;
   private byte AV196Flag ;
   private byte A720PrdNumMes ;
   private short AV193Anyo ;
   private short GXv_int2[] ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV195Fila ;
   private int AV194Columna ;
   private int AV237Random ;
   private java.math.BigDecimal AV224Porcen ;
   private java.math.BigDecimal AV223PorAcu ;
   private java.math.BigDecimal AV225PorcGrp ;
   private java.math.BigDecimal AV230TotGrp ;
   private java.math.BigDecimal AV231TotInf ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal AV228TotCoN ;
   private java.math.BigDecimal AV226PrdUniConM ;
   private java.math.BigDecimal AV227PrdValConM ;
   private java.math.BigDecimal AV232TotInfC ;
   private java.math.BigDecimal AV233TotUniC ;
   private String A396EmprCod ;
   private String AV198ImpCod ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A4693PrdNum2 ;
   private String A718PrdNom ;
   private String AV204Lit13 ;
   private String AV205Lit14 ;
   private String AV206Lit15 ;
   private String AV207Lit16 ;
   private boolean returnInSub ;
   private boolean n331DifValConA ;
   private boolean brk4L85 ;
   private String AV235Filename ;
   private String AV236ErrorMessage ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04L82_A396EmprCod ;
   private short[] P04L82_A681PrdAny ;
   private String[] P04L82_A719PrdNum ;
   private java.math.BigDecimal[] P04L82_A331DifValConA ;
   private boolean[] P04L82_n331DifValConA ;
   private String[] P04L83_A396EmprCod ;
   private String[] P04L83_A719PrdNum ;
   private short[] P04L83_A681PrdAny ;
   private byte[] P04L83_A720PrdNumMes ;
   private java.math.BigDecimal[] P04L83_A747PrdValConM ;
   private java.math.BigDecimal[] P04L83_A744PrdUniConM ;
   private String[] P04L84_A396EmprCod ;
   private short[] P04L84_A681PrdAny ;
   private String[] P04L84_A719PrdNum ;
   private String[] P04L84_A4693PrdNum2 ;
   private String[] P04L84_A718PrdNom ;
   private java.math.BigDecimal[] P04L84_A331DifValConA ;
   private boolean[] P04L84_n331DifValConA ;
   private String[] P04L85_A396EmprCod ;
   private String[] P04L85_A719PrdNum ;
   private short[] P04L85_A681PrdAny ;
   private java.math.BigDecimal[] P04L85_A744PrdUniConM ;
   private java.math.BigDecimal[] P04L85_A747PrdValConM ;
   private byte[] P04L85_A720PrdNumMes ;
   private com.genexus.gxoffice.ExcelDoc AV234ExcelDocument ;
}

final  class prptabcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04L82", "SELECT EmprCod, PrdAny, PrdNum, DifValConA FROM TXPCPRDES WHERE (EmprCod = ?) AND (PrdAny = ?) ORDER BY EmprCod, DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04L83", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdValConM, PrdUniConM FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04L84", "SELECT T1.EmprCod, T1.PrdAny, T1.PrdNum, T2.PrdNum2, T2.PrdNom, T1.DifValConA FROM (TXPCPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdAny = ?) ORDER BY T1.EmprCod, T1.DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04L85", "SELECT EmprCod, PrdNum, PrdAny, PrdUniConM, PrdValConM, PrdNumMes FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

