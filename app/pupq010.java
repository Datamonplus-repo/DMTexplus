package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupq010 extends GXProcedure
{
   public pupq010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupq010.class ), "" );
   }

   public pupq010( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pupq010.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      pupq010.this.AV64Emprcod = aP0[0];
      this.aP0 = aP0;
      pupq010.this.AV82Prdnum1 = aP1[0];
      this.aP1 = aP1;
      pupq010.this.AV83Prdnum2 = aP2[0];
      this.aP2 = aP2;
      pupq010.this.AV50CantInv = aP3[0];
      this.aP3 = aP3;
      pupq010.this.AV56Compras = aP4[0];
      this.aP4 = aP4;
      pupq010.this.AV58Consumos = aP5[0];
      this.aP5 = aP5;
      pupq010.this.AV57Compras2 = aP6[0];
      this.aP6 = aP6;
      pupq010.this.AV59consumos2 = aP7[0];
      this.aP7 = aP7;
      pupq010.this.AV76Obs = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV79Prdexialm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05QJ2 */
      pr_default.execute(0, new Object[] {AV64Emprcod, AV82Prdnum1, AV83Prdnum2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05QJ2_A719PrdNum[0] ;
         A396EmprCod = P05QJ2_A396EmprCod[0] ;
         A704PrdExiAlm = P05QJ2_A704PrdExiAlm[0] ;
         A718PrdNom = P05QJ2_A718PrdNom[0] ;
         AV81Prdnum = A719PrdNum ;
         AV79Prdexialm = A704PrdExiAlm ;
         AV80prdNom = A718PrdNom ;
         /* Execute user subroutine: 'PROCESAMOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESAMOS' Routine */
      returnInSub = false ;
      AV88SiInventario = (byte)(0) ;
      AV68EntUniRem = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05QJ3 */
      pr_default.execute(1, new Object[] {AV64Emprcod, AV81Prdnum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A411EntCon = P05QJ3_A411EntCon[0] ;
         A719PrdNum = P05QJ3_A719PrdNum[0] ;
         A396EmprCod = P05QJ3_A396EmprCod[0] ;
         A5686EntLotN = P05QJ3_A5686EntLotN[0] ;
         A5691EntBnc = P05QJ3_A5691EntBnc[0] ;
         A419EntUniRem = P05QJ3_A419EntUniRem[0] ;
         A597LinEnt = P05QJ3_A597LinEnt[0] ;
         AV68EntUniRem = AV68EntUniRem.add((((AV61Cotexsur==0) ? A419EntUniRem : ((GXutil.strcmp(A5691EntBnc, httpContext.getMessage( "ENVIADO", ""))==0)&&(GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "CERRADO", ""))==0) ? A419EntUniRem : DecimalUtil.doubleToDec(0))))) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV85Recfec = GXutil.nullDate() ;
      AV84RecExiRea = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05QJ4 */
      pr_default.execute(2, new Object[] {AV64Emprcod, AV81Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P05QJ4_A396EmprCod[0] ;
         A719PrdNum = P05QJ4_A719PrdNum[0] ;
         A807RecExiRea = P05QJ4_A807RecExiRea[0] ;
         A810RecFec = P05QJ4_A810RecFec[0] ;
         AV85Recfec = A810RecFec ;
         AV84RecExiRea = A807RecExiRea ;
         AV88SiInventario = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV67Entradas = DecimalUtil.doubleToDec(0) ;
      AV86Salidas = DecimalUtil.doubleToDec(0) ;
      AV55CCstklin = 0 ;
      if ( AV88SiInventario == 1 )
      {
         /* Using cursor P05QJ5 */
         pr_default.execute(3, new Object[] {AV64Emprcod, AV81Prdnum, AV85Recfec});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P05QJ5_A396EmprCod[0] ;
            A719PrdNum = P05QJ5_A719PrdNum[0] ;
            A3348CCStkFec = P05QJ5_A3348CCStkFec[0] ;
            A3345TipMovCc = P05QJ5_A3345TipMovCc[0] ;
            A3342CCStkLin = P05QJ5_A3342CCStkLin[0] ;
            A3356CCStkHor = P05QJ5_A3356CCStkHor[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
               AV54CCStkHor = A3356CCStkHor ;
               AV55CCstklin = A3342CCStkLin ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05QJ6 */
         pr_default.execute(4, new Object[] {AV64Emprcod, AV81Prdnum, AV85Recfec});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P05QJ6_A396EmprCod[0] ;
            A719PrdNum = P05QJ6_A719PrdNum[0] ;
            A3348CCStkFec = P05QJ6_A3348CCStkFec[0] ;
            A3345TipMovCc = P05QJ6_A3345TipMovCc[0] ;
            A3343CCStkCanE = P05QJ6_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P05QJ6_A3344CCStkCanS[0] ;
            A3356CCStkHor = P05QJ6_A3356CCStkHor[0] ;
            A3342CCStkLin = P05QJ6_A3342CCStkLin[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
            }
            else
            {
               AV67Entradas = AV67Entradas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
               AV86Salidas = AV86Salidas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
         /* Using cursor P05QJ7 */
         pr_default.execute(5, new Object[] {AV64Emprcod, AV81Prdnum});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A396EmprCod = P05QJ7_A396EmprCod[0] ;
            A719PrdNum = P05QJ7_A719PrdNum[0] ;
            A3356CCStkHor = P05QJ7_A3356CCStkHor[0] ;
            A3348CCStkFec = P05QJ7_A3348CCStkFec[0] ;
            A3342CCStkLin = P05QJ7_A3342CCStkLin[0] ;
            AV55CCstklin = 5 ;
            AV85Recfec = A3348CCStkFec ;
            AV54CCStkHor = A3356CCStkHor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      AV85Recfec = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Recfec)) ? Gx_date : AV85Recfec) ;
      AV50CantInv = DecimalUtil.doubleToDec(0) ;
      AV58Consumos = DecimalUtil.doubleToDec(0) ;
      AV56Compras = DecimalUtil.doubleToDec(0) ;
      AV57Compras2 = DecimalUtil.doubleToDec(0) ;
      AV59consumos2 = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05QJ8 */
      pr_default.execute(6, new Object[] {AV64Emprcod, AV81Prdnum, AV85Recfec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P05QJ8_A396EmprCod[0] ;
         A719PrdNum = P05QJ8_A719PrdNum[0] ;
         A3348CCStkFec = P05QJ8_A3348CCStkFec[0] ;
         A3345TipMovCc = P05QJ8_A3345TipMovCc[0] ;
         A3343CCStkCanE = P05QJ8_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P05QJ8_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05QJ8_A3356CCStkHor[0] ;
         A3342CCStkLin = P05QJ8_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV53Ccstkfec = A3348CCStkFec ;
            /* Execute user subroutine: 'INVENTARIO' */
            S128 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV58Consumos = DecimalUtil.doubleToDec(0) ;
            AV56Compras = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV56Compras = AV56Compras.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            AV58Consumos = AV58Consumos.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            AV57Compras2 = AV57Compras2.add(((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0)&&GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV85Recfec))) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            AV59consumos2 = AV59consumos2.add(((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)&&GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV85Recfec)))||((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)&&GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV85Recfec)))||((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0)&&GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV85Recfec))) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV70ExisCalculadas = ((GXutil.strcmp(AV87Siacumular, httpContext.getMessage( "N", ""))==0) ? AV50CantInv.add(AV56Compras).subtract(AV58Consumos) : AV50CantInv.subtract(AV86Salidas).add(AV56Compras).subtract(AV58Consumos)) ;
      AV62Dif = AV79Prdexialm.subtract(AV70ExisCalculadas) ;
      AV63Dif2 = ((AV68EntUniRem.doubleValue()>0) ? AV70ExisCalculadas.subtract(AV68EntUniRem) : DecimalUtil.doubleToDec(0)) ;
      AV76Obs = ((AV88SiInventario==0) ? httpContext.getMessage( "Nunca se hizo Inventario", "") : httpContext.getMessage( "Inventario ultimo ", "")+localUtil.dtoc( AV85Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
   }

   public void S128( )
   {
      /* 'INVENTARIO' Routine */
      returnInSub = false ;
      AV50CantInv = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05QJ9 */
      pr_default.execute(7, new Object[] {AV64Emprcod, AV81Prdnum, AV53Ccstkfec});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A810RecFec = P05QJ9_A810RecFec[0] ;
         A719PrdNum = P05QJ9_A719PrdNum[0] ;
         A396EmprCod = P05QJ9_A396EmprCod[0] ;
         A807RecExiRea = P05QJ9_A807RecExiRea[0] ;
         AV50CantInv = A807RecExiRea ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupq010.this.AV64Emprcod;
      this.aP1[0] = pupq010.this.AV82Prdnum1;
      this.aP2[0] = pupq010.this.AV83Prdnum2;
      this.aP3[0] = pupq010.this.AV50CantInv;
      this.aP4[0] = pupq010.this.AV56Compras;
      this.aP5[0] = pupq010.this.AV58Consumos;
      this.aP6[0] = pupq010.this.AV57Compras2;
      this.aP7[0] = pupq010.this.AV59consumos2;
      this.aP8[0] = pupq010.this.AV76Obs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV79Prdexialm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05QJ2_A719PrdNum = new String[] {""} ;
      P05QJ2_A396EmprCod = new String[] {""} ;
      P05QJ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV81Prdnum = "" ;
      AV80prdNom = "" ;
      AV68EntUniRem = DecimalUtil.ZERO ;
      P05QJ3_A411EntCon = new byte[1] ;
      P05QJ3_A719PrdNum = new String[] {""} ;
      P05QJ3_A396EmprCod = new String[] {""} ;
      P05QJ3_A5686EntLotN = new String[] {""} ;
      P05QJ3_A5691EntBnc = new String[] {""} ;
      P05QJ3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ3_A597LinEnt = new short[1] ;
      A5686EntLotN = "" ;
      A5691EntBnc = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      AV85Recfec = GXutil.nullDate() ;
      AV84RecExiRea = DecimalUtil.ZERO ;
      P05QJ4_A396EmprCod = new String[] {""} ;
      P05QJ4_A719PrdNum = new String[] {""} ;
      P05QJ4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      AV67Entradas = DecimalUtil.ZERO ;
      AV86Salidas = DecimalUtil.ZERO ;
      P05QJ5_A396EmprCod = new String[] {""} ;
      P05QJ5_A719PrdNum = new String[] {""} ;
      P05QJ5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05QJ5_A3345TipMovCc = new String[] {""} ;
      P05QJ5_A3342CCStkLin = new long[1] ;
      P05QJ5_A3356CCStkHor = new String[] {""} ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3356CCStkHor = "" ;
      AV54CCStkHor = "" ;
      P05QJ6_A396EmprCod = new String[] {""} ;
      P05QJ6_A719PrdNum = new String[] {""} ;
      P05QJ6_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05QJ6_A3345TipMovCc = new String[] {""} ;
      P05QJ6_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ6_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ6_A3356CCStkHor = new String[] {""} ;
      P05QJ6_A3342CCStkLin = new long[1] ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      P05QJ7_A396EmprCod = new String[] {""} ;
      P05QJ7_A719PrdNum = new String[] {""} ;
      P05QJ7_A3356CCStkHor = new String[] {""} ;
      P05QJ7_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05QJ7_A3342CCStkLin = new long[1] ;
      Gx_date = GXutil.nullDate() ;
      P05QJ8_A396EmprCod = new String[] {""} ;
      P05QJ8_A719PrdNum = new String[] {""} ;
      P05QJ8_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05QJ8_A3345TipMovCc = new String[] {""} ;
      P05QJ8_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ8_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QJ8_A3356CCStkHor = new String[] {""} ;
      P05QJ8_A3342CCStkLin = new long[1] ;
      AV53Ccstkfec = GXutil.nullDate() ;
      AV70ExisCalculadas = DecimalUtil.ZERO ;
      AV87Siacumular = "" ;
      AV62Dif = DecimalUtil.ZERO ;
      AV63Dif2 = DecimalUtil.ZERO ;
      P05QJ9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05QJ9_A719PrdNum = new String[] {""} ;
      P05QJ9_A396EmprCod = new String[] {""} ;
      P05QJ9_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupq010__default(),
         new Object[] {
             new Object[] {
            P05QJ2_A719PrdNum, P05QJ2_A396EmprCod, P05QJ2_A704PrdExiAlm, P05QJ2_A718PrdNom
            }
            , new Object[] {
            P05QJ3_A411EntCon, P05QJ3_A719PrdNum, P05QJ3_A396EmprCod, P05QJ3_A5686EntLotN, P05QJ3_A5691EntBnc, P05QJ3_A419EntUniRem, P05QJ3_A597LinEnt
            }
            , new Object[] {
            P05QJ4_A396EmprCod, P05QJ4_A719PrdNum, P05QJ4_A807RecExiRea, P05QJ4_A810RecFec
            }
            , new Object[] {
            P05QJ5_A396EmprCod, P05QJ5_A719PrdNum, P05QJ5_A3348CCStkFec, P05QJ5_A3345TipMovCc, P05QJ5_A3342CCStkLin, P05QJ5_A3356CCStkHor
            }
            , new Object[] {
            P05QJ6_A396EmprCod, P05QJ6_A719PrdNum, P05QJ6_A3348CCStkFec, P05QJ6_A3345TipMovCc, P05QJ6_A3343CCStkCanE, P05QJ6_A3344CCStkCanS, P05QJ6_A3356CCStkHor, P05QJ6_A3342CCStkLin
            }
            , new Object[] {
            P05QJ7_A396EmprCod, P05QJ7_A719PrdNum, P05QJ7_A3356CCStkHor, P05QJ7_A3348CCStkFec, P05QJ7_A3342CCStkLin
            }
            , new Object[] {
            P05QJ8_A396EmprCod, P05QJ8_A719PrdNum, P05QJ8_A3348CCStkFec, P05QJ8_A3345TipMovCc, P05QJ8_A3343CCStkCanE, P05QJ8_A3344CCStkCanS, P05QJ8_A3356CCStkHor, P05QJ8_A3342CCStkLin
            }
            , new Object[] {
            P05QJ9_A810RecFec, P05QJ9_A719PrdNum, P05QJ9_A396EmprCod, P05QJ9_A807RecExiRea
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV88SiInventario ;
   private byte A411EntCon ;
   private byte AV61Cotexsur ;
   private short A597LinEnt ;
   private short Gx_err ;
   private long AV55CCstklin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV50CantInv ;
   private java.math.BigDecimal AV56Compras ;
   private java.math.BigDecimal AV58Consumos ;
   private java.math.BigDecimal AV57Compras2 ;
   private java.math.BigDecimal AV59consumos2 ;
   private java.math.BigDecimal AV79Prdexialm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV68EntUniRem ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal AV84RecExiRea ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV67Entradas ;
   private java.math.BigDecimal AV86Salidas ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV70ExisCalculadas ;
   private java.math.BigDecimal AV62Dif ;
   private java.math.BigDecimal AV63Dif2 ;
   private String AV64Emprcod ;
   private String AV82Prdnum1 ;
   private String AV83Prdnum2 ;
   private String AV76Obs ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV81Prdnum ;
   private String AV80prdNom ;
   private String A5686EntLotN ;
   private String A5691EntBnc ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String AV54CCStkHor ;
   private String AV87Siacumular ;
   private java.util.Date AV85Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private java.util.Date AV53Ccstkfec ;
   private boolean returnInSub ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05QJ2_A719PrdNum ;
   private String[] P05QJ2_A396EmprCod ;
   private java.math.BigDecimal[] P05QJ2_A704PrdExiAlm ;
   private String[] P05QJ2_A718PrdNom ;
   private byte[] P05QJ3_A411EntCon ;
   private String[] P05QJ3_A719PrdNum ;
   private String[] P05QJ3_A396EmprCod ;
   private String[] P05QJ3_A5686EntLotN ;
   private String[] P05QJ3_A5691EntBnc ;
   private java.math.BigDecimal[] P05QJ3_A419EntUniRem ;
   private short[] P05QJ3_A597LinEnt ;
   private String[] P05QJ4_A396EmprCod ;
   private String[] P05QJ4_A719PrdNum ;
   private java.math.BigDecimal[] P05QJ4_A807RecExiRea ;
   private java.util.Date[] P05QJ4_A810RecFec ;
   private String[] P05QJ5_A396EmprCod ;
   private String[] P05QJ5_A719PrdNum ;
   private java.util.Date[] P05QJ5_A3348CCStkFec ;
   private String[] P05QJ5_A3345TipMovCc ;
   private long[] P05QJ5_A3342CCStkLin ;
   private String[] P05QJ5_A3356CCStkHor ;
   private String[] P05QJ6_A396EmprCod ;
   private String[] P05QJ6_A719PrdNum ;
   private java.util.Date[] P05QJ6_A3348CCStkFec ;
   private String[] P05QJ6_A3345TipMovCc ;
   private java.math.BigDecimal[] P05QJ6_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05QJ6_A3344CCStkCanS ;
   private String[] P05QJ6_A3356CCStkHor ;
   private long[] P05QJ6_A3342CCStkLin ;
   private String[] P05QJ7_A396EmprCod ;
   private String[] P05QJ7_A719PrdNum ;
   private String[] P05QJ7_A3356CCStkHor ;
   private java.util.Date[] P05QJ7_A3348CCStkFec ;
   private long[] P05QJ7_A3342CCStkLin ;
   private String[] P05QJ8_A396EmprCod ;
   private String[] P05QJ8_A719PrdNum ;
   private java.util.Date[] P05QJ8_A3348CCStkFec ;
   private String[] P05QJ8_A3345TipMovCc ;
   private java.math.BigDecimal[] P05QJ8_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05QJ8_A3344CCStkCanS ;
   private String[] P05QJ8_A3356CCStkHor ;
   private long[] P05QJ8_A3342CCStkLin ;
   private java.util.Date[] P05QJ9_A810RecFec ;
   private String[] P05QJ9_A719PrdNum ;
   private String[] P05QJ9_A396EmprCod ;
   private java.math.BigDecimal[] P05QJ9_A807RecExiRea ;
}

final  class pupq010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05QJ2", "SELECT PrdNum, EmprCod, PrdExiAlm, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05QJ3", "SELECT EntCon, PrdNum, EmprCod, EntLotN, EntBnc, EntUniRem, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05QJ4", "SELECT * FROM (SELECT EmprCod, PrdNum, RecExiRea, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05QJ5", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkLin, CCStkHor FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05QJ6", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05QJ7", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkHor, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05QJ8", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec >= ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05QJ9", "SELECT RecFec, PrdNum, EmprCod, RecExiRea FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
      }
   }

}

