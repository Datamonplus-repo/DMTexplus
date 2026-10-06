package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prptabcsodicos extends GXProcedure
{
   public prptabcsodicos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prptabcsodicos.class ), "" );
   }

   public prptabcsodicos( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      prptabcsodicos.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      prptabcsodicos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prptabcsodicos.this.AV198ImpCod = aP1[0];
      this.aP1 = aP1;
      prptabcsodicos.this.AV234Pdigito = aP2[0];
      this.aP2 = aP2;
      prptabcsodicos.this.AV193Any = aP3[0];
      this.aP3 = aP3;
      prptabcsodicos.this.AV220Mesi = aP4[0];
      this.aP4 = aP4;
      prptabcsodicos.this.AV219MesF = aP5[0];
      this.aP5 = aP5;
      prptabcsodicos.this.aP6 = aP6;
      prptabcsodicos.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04LB2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P04LB2_A407EmprNom[0] ;
         n407EmprNom = P04LB2_n407EmprNom[0] ;
         AV121EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_char1 = AV171Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN755_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV171Lit2 = GXt_char1 ;
      GXt_char1 = AV211Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2471_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV211Lit4 = GXt_char1 ;
      GXt_char1 = AV204Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV204Lit13 = GXt_char1 ;
      GXt_char1 = AV205Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV205Lit14 = GXt_char1 ;
      GXt_char1 = AV206Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV206Lit15 = GXt_char1 ;
      GXt_char1 = AV208Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT139_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV208Lit17 = GXt_char1 ;
      GXt_char1 = AV209Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
      prptabcsodicos.this.GXt_char1 = GXv_char2[0] ;
      AV209Lit18 = GXt_char1 ;
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
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV193Any ;
      GXv_int4[0] = AV220Mesi ;
      GXv_int5[0] = AV219MesF ;
      new app.pordprd1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int5) ;
      prptabcsodicos.this.A396EmprCod = GXv_char2[0] ;
      prptabcsodicos.this.AV193Any = GXv_int3[0] ;
      prptabcsodicos.this.AV220Mesi = GXv_int4[0] ;
      prptabcsodicos.this.AV219MesF = GXv_int5[0] ;
      AV224Porcen = DecimalUtil.doubleToDec(0) ;
      AV223PorAcu = DecimalUtil.doubleToDec(0) ;
      AV225PorcGrp = DecimalUtil.doubleToDec(0) ;
      AV230TotGrp = DecimalUtil.doubleToDec(0) ;
      AV231TotInf = DecimalUtil.doubleToDec(0) ;
      AV196Flag = (byte)(1) ;
      AV228TotCoN = DecimalUtil.doubleToDec(0) ;
      AV195Fila = (byte)(3) ;
      /* Using cursor P04LB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV234Pdigito, Short.valueOf(AV193Any)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A681PrdAny = P04LB3_A681PrdAny[0] ;
         A719PrdNum = P04LB3_A719PrdNum[0] ;
         A331DifValConA = P04LB3_A331DifValConA[0] ;
         n331DifValConA = P04LB3_n331DifValConA[0] ;
         /* Using cursor P04LB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV220Mesi), Byte.valueOf(AV219MesF)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A720PrdNumMes = P04LB4_A720PrdNumMes[0] ;
            A747PrdValConM = P04LB4_A747PrdValConM[0] ;
            A744PrdUniConM = P04LB4_A744PrdUniConM[0] ;
            if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
            {
               AV228TotCoN = AV228TotCoN.add(A747PrdValConM) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P04LB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV234Pdigito, Short.valueOf(AV193Any)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A681PrdAny = P04LB5_A681PrdAny[0] ;
         A719PrdNum = P04LB5_A719PrdNum[0] ;
         A4693PrdNum2 = P04LB5_A4693PrdNum2[0] ;
         A718PrdNom = P04LB5_A718PrdNom[0] ;
         A331DifValConA = P04LB5_A331DifValConA[0] ;
         n331DifValConA = P04LB5_n331DifValConA[0] ;
         A4693PrdNum2 = P04LB5_A4693PrdNum2[0] ;
         A718PrdNom = P04LB5_A718PrdNom[0] ;
         /* Using cursor P04LB6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV220Mesi), Byte.valueOf(AV219MesF)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk4LB6 = false ;
            A744PrdUniConM = P04LB6_A744PrdUniConM[0] ;
            A747PrdValConM = P04LB6_A747PrdValConM[0] ;
            A720PrdNumMes = P04LB6_A720PrdNumMes[0] ;
            if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
            {
               AV224Porcen = DecimalUtil.doubleToDec(0) ;
               if ( AV196Flag == 3 )
               {
                  AV196Flag = (byte)(4) ;
               }
               AV226PrdUniConM = DecimalUtil.doubleToDec(0) ;
               AV227PrdValConM = DecimalUtil.doubleToDec(0) ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P04LB6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P04LB6_A719PrdNum[0], A719PrdNum) == 0 ) && ( P04LB6_A681PrdAny[0] == A681PrdAny ) )
               {
                  brk4LB6 = false ;
                  A744PrdUniConM = P04LB6_A744PrdUniConM[0] ;
                  A747PrdValConM = P04LB6_A747PrdValConM[0] ;
                  A720PrdNumMes = P04LB6_A720PrdNumMes[0] ;
                  AV226PrdUniConM = AV226PrdUniConM.add(A744PrdUniConM) ;
                  AV227PrdValConM = AV227PrdValConM.add(A747PrdValConM) ;
                  brk4LB6 = true ;
                  pr_default.readNext(4);
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
               AV236ExcelDocument.Cells(AV195Fila, 1, 1, 1).setText( A719PrdNum );
               AV236ExcelDocument.Cells(AV195Fila, 2, 1, 1).setText( A4693PrdNum2 );
               AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( A718PrdNom );
               AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV226PrdUniConM)) );
               AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV227PrdValConM)) );
               AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV224Porcen)) );
               AV225PorcGrp = AV225PorcGrp.add(AV224Porcen) ;
               AV230TotGrp = AV230TotGrp.add(AV227PrdValConM) ;
               AV233TotUniC = AV233TotUniC.add(AV226PrdUniConM) ;
               if ( ( AV223PorAcu.doubleValue() >= 80 ) && ( AV196Flag == 1 ) )
               {
                  AV195Fila = (byte)(AV195Fila+1) ;
                  AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV204Lit13 );
                  AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV233TotUniC)) );
                  AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV230TotGrp)) );
                  AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV225PorcGrp)) );
                  AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
                  AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
                  AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
                  AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
                  AV225PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV230TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV233TotUniC = DecimalUtil.doubleToDec(0) ;
                  AV196Flag = (byte)(2) ;
               }
               if ( ( AV223PorAcu.doubleValue() > 95 ) && ( AV196Flag == 2 ) )
               {
                  AV195Fila = (byte)(AV195Fila+1) ;
                  AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV205Lit14 );
                  AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV233TotUniC)) );
                  AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV230TotGrp)) );
                  AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV225PorcGrp)) );
                  AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
                  AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
                  AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
                  AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
                  AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
                  AV225PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV230TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV233TotUniC = DecimalUtil.doubleToDec(0) ;
                  AV196Flag = (byte)(3) ;
               }
               AV195Fila = (byte)(AV195Fila+1) ;
            }
            if ( ! brk4LB6 )
            {
               brk4LB6 = true ;
               pr_default.readNext(4);
            }
         }
         pr_default.close(4);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV196Flag == 4 )
      {
         AV195Fila = (byte)(AV195Fila+1) ;
         AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV206Lit15 );
         AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV233TotUniC)) );
         AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV230TotGrp)) );
         AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV225PorcGrp)) );
         AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
         AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
         AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
         AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
         AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
         AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
         AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
         AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
      }
      AV195Fila = (byte)(AV195Fila+1) ;
      AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setText( AV207Lit16 );
      AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV232TotInfC)) );
      AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV231TotInf)) );
      AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV223PorAcu)) );
      AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(AV195Fila, 3, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(AV195Fila, 4, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(AV195Fila, 5, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(AV195Fila, 6, 1, 1).setColor( 11 );
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
      AV239Random = (int)(GXutil.random( )*10000) ;
      AV237Filename = "ABC_Consumos_SodicosExport-" + GXutil.trim( GXutil.str( AV239Random, 8, 0)) + ".xlsx" ;
      AV236ExcelDocument.Open(AV237Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV236ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV236ExcelDocument.getErrCode() != 0 )
      {
         AV237Filename = "" ;
         AV238ErrorMessage = AV236ExcelDocument.getErrDescription() ;
         AV236ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV236ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV236ExcelDocument.Close();
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV236ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Año", "") );
      AV236ExcelDocument.Cells(1, 2, 1, 1).setNumber( AV193Any );
      AV236ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Meses", "") );
      AV236ExcelDocument.Cells(1, 4, 1, 1).setNumber( AV220Mesi );
      AV236ExcelDocument.Cells(1, 5, 1, 1).setNumber( AV219MesF );
      AV236ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV236ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Producto Ext.", "") );
      AV236ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Descripcion.", "") );
      AV236ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Unidades Consumo Acumuladas", "") );
      AV236ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV236ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "% Total", "") );
      AV236ExcelDocument.Cells(2, 1, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(2, 2, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(2, 3, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(2, 4, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(2, 5, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(2, 6, 1, 1).setBold( (short)(1) );
      AV236ExcelDocument.Cells(2, 1, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(2, 2, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(2, 3, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(2, 4, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(2, 5, 1, 1).setColor( 11 );
      AV236ExcelDocument.Cells(2, 6, 1, 1).setColor( 11 );
   }

   protected void cleanup( )
   {
      this.aP0[0] = prptabcsodicos.this.A396EmprCod;
      this.aP1[0] = prptabcsodicos.this.AV198ImpCod;
      this.aP2[0] = prptabcsodicos.this.AV234Pdigito;
      this.aP3[0] = prptabcsodicos.this.AV193Any;
      this.aP4[0] = prptabcsodicos.this.AV220Mesi;
      this.aP5[0] = prptabcsodicos.this.AV219MesF;
      this.aP6[0] = prptabcsodicos.this.AV237Filename;
      this.aP7[0] = prptabcsodicos.this.AV238ErrorMessage;
      CloseOpenCursors();
      AV236ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV237Filename = "" ;
      AV238ErrorMessage = "" ;
      scmdbuf = "" ;
      P04LB2_A396EmprCod = new String[] {""} ;
      P04LB2_A407EmprNom = new String[] {""} ;
      P04LB2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV121EmprNom = "" ;
      AV171Lit2 = "" ;
      AV211Lit4 = "" ;
      AV204Lit13 = "" ;
      AV205Lit14 = "" ;
      AV206Lit15 = "" ;
      AV208Lit17 = "" ;
      AV209Lit18 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      AV224Porcen = DecimalUtil.ZERO ;
      AV223PorAcu = DecimalUtil.ZERO ;
      AV225PorcGrp = DecimalUtil.ZERO ;
      AV230TotGrp = DecimalUtil.ZERO ;
      AV231TotInf = DecimalUtil.ZERO ;
      AV228TotCoN = DecimalUtil.ZERO ;
      P04LB3_A396EmprCod = new String[] {""} ;
      P04LB3_A681PrdAny = new short[1] ;
      P04LB3_A719PrdNum = new String[] {""} ;
      P04LB3_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04LB3_n331DifValConA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      P04LB4_A396EmprCod = new String[] {""} ;
      P04LB4_A719PrdNum = new String[] {""} ;
      P04LB4_A681PrdAny = new short[1] ;
      P04LB4_A720PrdNumMes = new byte[1] ;
      P04LB4_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04LB4_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A747PrdValConM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      P04LB5_A396EmprCod = new String[] {""} ;
      P04LB5_A681PrdAny = new short[1] ;
      P04LB5_A719PrdNum = new String[] {""} ;
      P04LB5_A4693PrdNum2 = new String[] {""} ;
      P04LB5_A718PrdNom = new String[] {""} ;
      P04LB5_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04LB5_n331DifValConA = new boolean[] {false} ;
      A4693PrdNum2 = "" ;
      A718PrdNom = "" ;
      P04LB6_A396EmprCod = new String[] {""} ;
      P04LB6_A719PrdNum = new String[] {""} ;
      P04LB6_A681PrdAny = new short[1] ;
      P04LB6_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04LB6_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04LB6_A720PrdNumMes = new byte[1] ;
      AV226PrdUniConM = DecimalUtil.ZERO ;
      AV227PrdValConM = DecimalUtil.ZERO ;
      AV232TotInfC = DecimalUtil.ZERO ;
      AV236ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV233TotUniC = DecimalUtil.ZERO ;
      AV207Lit16 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prptabcsodicos__default(),
         new Object[] {
             new Object[] {
            P04LB2_A396EmprCod, P04LB2_A407EmprNom, P04LB2_n407EmprNom
            }
            , new Object[] {
            P04LB3_A396EmprCod, P04LB3_A681PrdAny, P04LB3_A719PrdNum, P04LB3_A331DifValConA, P04LB3_n331DifValConA
            }
            , new Object[] {
            P04LB4_A396EmprCod, P04LB4_A719PrdNum, P04LB4_A681PrdAny, P04LB4_A720PrdNumMes, P04LB4_A747PrdValConM, P04LB4_A744PrdUniConM
            }
            , new Object[] {
            P04LB5_A396EmprCod, P04LB5_A681PrdAny, P04LB5_A719PrdNum, P04LB5_A4693PrdNum2, P04LB5_A718PrdNom, P04LB5_A331DifValConA, P04LB5_n331DifValConA
            }
            , new Object[] {
            P04LB6_A396EmprCod, P04LB6_A719PrdNum, P04LB6_A681PrdAny, P04LB6_A744PrdUniConM, P04LB6_A747PrdValConM, P04LB6_A720PrdNumMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV220Mesi ;
   private byte AV219MesF ;
   private byte GXv_int4[] ;
   private byte GXv_int5[] ;
   private byte AV196Flag ;
   private byte AV195Fila ;
   private byte A720PrdNumMes ;
   private short AV193Any ;
   private short GXv_int3[] ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV239Random ;
   private java.math.BigDecimal AV224Porcen ;
   private java.math.BigDecimal AV223PorAcu ;
   private java.math.BigDecimal AV225PorcGrp ;
   private java.math.BigDecimal AV230TotGrp ;
   private java.math.BigDecimal AV231TotInf ;
   private java.math.BigDecimal AV228TotCoN ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal AV226PrdUniConM ;
   private java.math.BigDecimal AV227PrdValConM ;
   private java.math.BigDecimal AV232TotInfC ;
   private java.math.BigDecimal AV233TotUniC ;
   private String A396EmprCod ;
   private String AV198ImpCod ;
   private String AV234Pdigito ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV121EmprNom ;
   private String AV171Lit2 ;
   private String AV211Lit4 ;
   private String AV204Lit13 ;
   private String AV205Lit14 ;
   private String AV206Lit15 ;
   private String AV208Lit17 ;
   private String AV209Lit18 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A719PrdNum ;
   private String A4693PrdNum2 ;
   private String A718PrdNom ;
   private String AV207Lit16 ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n331DifValConA ;
   private boolean brk4LB6 ;
   private String AV237Filename ;
   private String AV238ErrorMessage ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04LB2_A396EmprCod ;
   private String[] P04LB2_A407EmprNom ;
   private boolean[] P04LB2_n407EmprNom ;
   private String[] P04LB3_A396EmprCod ;
   private short[] P04LB3_A681PrdAny ;
   private String[] P04LB3_A719PrdNum ;
   private java.math.BigDecimal[] P04LB3_A331DifValConA ;
   private boolean[] P04LB3_n331DifValConA ;
   private String[] P04LB4_A396EmprCod ;
   private String[] P04LB4_A719PrdNum ;
   private short[] P04LB4_A681PrdAny ;
   private byte[] P04LB4_A720PrdNumMes ;
   private java.math.BigDecimal[] P04LB4_A747PrdValConM ;
   private java.math.BigDecimal[] P04LB4_A744PrdUniConM ;
   private String[] P04LB5_A396EmprCod ;
   private short[] P04LB5_A681PrdAny ;
   private String[] P04LB5_A719PrdNum ;
   private String[] P04LB5_A4693PrdNum2 ;
   private String[] P04LB5_A718PrdNom ;
   private java.math.BigDecimal[] P04LB5_A331DifValConA ;
   private boolean[] P04LB5_n331DifValConA ;
   private String[] P04LB6_A396EmprCod ;
   private String[] P04LB6_A719PrdNum ;
   private short[] P04LB6_A681PrdAny ;
   private java.math.BigDecimal[] P04LB6_A744PrdUniConM ;
   private java.math.BigDecimal[] P04LB6_A747PrdValConM ;
   private byte[] P04LB6_A720PrdNumMes ;
   private com.genexus.gxoffice.ExcelDoc AV236ExcelDocument ;
}

final  class prptabcsodicos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04LB2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04LB3", "SELECT EmprCod, PrdAny, PrdNum, DifValConA FROM TXPCPRDES WHERE (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = ?) AND (PrdAny = ?) ORDER BY EmprCod, DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04LB4", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdValConM, PrdUniConM FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04LB5", "SELECT T1.EmprCod, T1.PrdAny, T1.PrdNum, T2.PrdNum2, T2.PrdNom, T1.DifValConA FROM (TXPCPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (SUBSTR(T1.PrdNum, 1, 1) = ?) AND (T1.PrdAny = ?) ORDER BY T1.EmprCod, T1.DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04LB6", "SELECT EmprCod, PrdNum, PrdAny, PrdUniConM, PrdValConM, PrdNumMes FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

