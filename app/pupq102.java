package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupq102 extends GXProcedure
{
   public pupq102( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupq102.class ), "" );
   }

   public pupq102( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 )
   {
      pupq102.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             String[] aP13 )
   {
      pupq102.this.AV50Emprcod = aP0[0];
      this.aP0 = aP0;
      pupq102.this.AV74Prdnum1 = aP1[0];
      this.aP1 = aP1;
      pupq102.this.AV61Entradas = aP2[0];
      this.aP2 = aP2;
      pupq102.this.AV62Salidas = aP3[0];
      this.aP3 = aP3;
      pupq102.this.AV60Recfec = aP4[0];
      this.aP4 = aP4;
      pupq102.this.AV66CantInv = aP5[0];
      this.aP5 = aP5;
      pupq102.this.AV67Compras = aP6[0];
      this.aP6 = aP6;
      pupq102.this.AV68Consumos = aP7[0];
      this.aP7 = aP7;
      pupq102.this.AV69Prdexialm = aP8[0];
      this.aP8 = aP8;
      pupq102.this.AV71ExisCalculadas = aP9[0];
      this.aP9 = aP9;
      pupq102.this.AV75Dif = aP10[0];
      this.aP10 = aP10;
      pupq102.this.AV72EntUniRem = aP11[0];
      this.aP11 = aP11;
      pupq102.this.AV76Dif2 = aP12[0];
      this.aP12 = aP12;
      pupq102.this.AV78Obs = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV69Prdexialm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05RJ2 */
      pr_default.execute(0, new Object[] {AV50Emprcod, AV74Prdnum1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05RJ2_A719PrdNum[0] ;
         A396EmprCod = P05RJ2_A396EmprCod[0] ;
         A704PrdExiAlm = P05RJ2_A704PrdExiAlm[0] ;
         A718PrdNom = P05RJ2_A718PrdNom[0] ;
         AV49Prdnum = A719PrdNum ;
         AV69Prdexialm = A704PrdExiAlm ;
         AV70prdNom = A718PrdNom ;
         /* Execute user subroutine: 'PROCESAMOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESAMOS' Routine */
      returnInSub = false ;
      AV77SiInventario = (byte)(0) ;
      AV72EntUniRem = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05RJ3 */
      pr_default.execute(1, new Object[] {AV50Emprcod, AV49Prdnum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A411EntCon = P05RJ3_A411EntCon[0] ;
         A719PrdNum = P05RJ3_A719PrdNum[0] ;
         A396EmprCod = P05RJ3_A396EmprCod[0] ;
         A5686EntLotN = P05RJ3_A5686EntLotN[0] ;
         A5691EntBnc = P05RJ3_A5691EntBnc[0] ;
         A419EntUniRem = P05RJ3_A419EntUniRem[0] ;
         A597LinEnt = P05RJ3_A597LinEnt[0] ;
         AV72EntUniRem = AV72EntUniRem.add((((AV87Cotexsur==0) ? A419EntUniRem : ((GXutil.strcmp(A5691EntBnc, httpContext.getMessage( "ENVIADO", ""))==0)&&(GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "CERRADO", ""))==0) ? A419EntUniRem : DecimalUtil.doubleToDec(0))))) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV60Recfec = GXutil.nullDate() ;
      AV63RecExiRea = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05RJ4 */
      pr_default.execute(2, new Object[] {AV50Emprcod, AV49Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P05RJ4_A396EmprCod[0] ;
         A719PrdNum = P05RJ4_A719PrdNum[0] ;
         A807RecExiRea = P05RJ4_A807RecExiRea[0] ;
         A810RecFec = P05RJ4_A810RecFec[0] ;
         AV60Recfec = A810RecFec ;
         AV63RecExiRea = A807RecExiRea ;
         AV77SiInventario = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV61Entradas = DecimalUtil.doubleToDec(0) ;
      AV62Salidas = DecimalUtil.doubleToDec(0) ;
      AV64CCstklin = 0 ;
      if ( AV77SiInventario == 1 )
      {
         /* Using cursor P05RJ5 */
         pr_default.execute(3, new Object[] {AV50Emprcod, AV49Prdnum, AV60Recfec});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P05RJ5_A396EmprCod[0] ;
            A719PrdNum = P05RJ5_A719PrdNum[0] ;
            A3348CCStkFec = P05RJ5_A3348CCStkFec[0] ;
            A3345TipMovCc = P05RJ5_A3345TipMovCc[0] ;
            A3342CCStkLin = P05RJ5_A3342CCStkLin[0] ;
            A3356CCStkHor = P05RJ5_A3356CCStkHor[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
               AV89CCStkHor = A3356CCStkHor ;
               AV64CCstklin = A3342CCStkLin ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05RJ6 */
         pr_default.execute(4, new Object[] {AV50Emprcod, AV49Prdnum, AV60Recfec});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P05RJ6_A396EmprCod[0] ;
            A719PrdNum = P05RJ6_A719PrdNum[0] ;
            A3348CCStkFec = P05RJ6_A3348CCStkFec[0] ;
            A3345TipMovCc = P05RJ6_A3345TipMovCc[0] ;
            A3343CCStkCanE = P05RJ6_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P05RJ6_A3344CCStkCanS[0] ;
            A3356CCStkHor = P05RJ6_A3356CCStkHor[0] ;
            A3342CCStkLin = P05RJ6_A3342CCStkLin[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
            }
            else
            {
               AV61Entradas = AV61Entradas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
               AV62Salidas = AV62Salidas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
         /* Using cursor P05RJ7 */
         pr_default.execute(5, new Object[] {AV50Emprcod, AV49Prdnum});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A396EmprCod = P05RJ7_A396EmprCod[0] ;
            A719PrdNum = P05RJ7_A719PrdNum[0] ;
            A3356CCStkHor = P05RJ7_A3356CCStkHor[0] ;
            A3348CCStkFec = P05RJ7_A3348CCStkFec[0] ;
            A3342CCStkLin = P05RJ7_A3342CCStkLin[0] ;
            AV64CCstklin = 5 ;
            AV60Recfec = A3348CCStkFec ;
            AV89CCStkHor = A3356CCStkHor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      AV60Recfec = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Recfec)) ? Gx_date : AV60Recfec) ;
      AV66CantInv = DecimalUtil.doubleToDec(0) ;
      AV68Consumos = DecimalUtil.doubleToDec(0) ;
      AV67Compras = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05RJ8 */
      pr_default.execute(6, new Object[] {AV50Emprcod, AV49Prdnum, AV60Recfec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P05RJ8_A396EmprCod[0] ;
         A719PrdNum = P05RJ8_A719PrdNum[0] ;
         A3348CCStkFec = P05RJ8_A3348CCStkFec[0] ;
         A3345TipMovCc = P05RJ8_A3345TipMovCc[0] ;
         A3343CCStkCanE = P05RJ8_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P05RJ8_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05RJ8_A3356CCStkHor[0] ;
         A3342CCStkLin = P05RJ8_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV65Ccstkfec = A3348CCStkFec ;
            /* Execute user subroutine: 'INVENTARIO' */
            S128 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV68Consumos = DecimalUtil.doubleToDec(0) ;
            AV67Compras = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV67Compras = AV67Compras.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            AV68Consumos = AV68Consumos.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV71ExisCalculadas = ((GXutil.strcmp(AV84Siacumular, httpContext.getMessage( "N", ""))==0) ? AV66CantInv.add(AV67Compras).subtract(AV68Consumos) : AV66CantInv.subtract(AV62Salidas).add(AV67Compras).subtract(AV68Consumos)) ;
      AV75Dif = AV69Prdexialm.subtract(AV71ExisCalculadas) ;
      AV76Dif2 = ((AV72EntUniRem.doubleValue()>0) ? AV71ExisCalculadas.subtract(AV72EntUniRem) : DecimalUtil.doubleToDec(0)) ;
      AV78Obs = ((AV77SiInventario==0) ? httpContext.getMessage( "Nunca se hizo Inventario", "") : "") ;
   }

   public void S128( )
   {
      /* 'INVENTARIO' Routine */
      returnInSub = false ;
      AV66CantInv = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05RJ9 */
      pr_default.execute(7, new Object[] {AV50Emprcod, AV49Prdnum, AV65Ccstkfec});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A810RecFec = P05RJ9_A810RecFec[0] ;
         A719PrdNum = P05RJ9_A719PrdNum[0] ;
         A396EmprCod = P05RJ9_A396EmprCod[0] ;
         A807RecExiRea = P05RJ9_A807RecExiRea[0] ;
         AV66CantInv = A807RecExiRea ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupq102.this.AV50Emprcod;
      this.aP1[0] = pupq102.this.AV74Prdnum1;
      this.aP2[0] = pupq102.this.AV61Entradas;
      this.aP3[0] = pupq102.this.AV62Salidas;
      this.aP4[0] = pupq102.this.AV60Recfec;
      this.aP5[0] = pupq102.this.AV66CantInv;
      this.aP6[0] = pupq102.this.AV67Compras;
      this.aP7[0] = pupq102.this.AV68Consumos;
      this.aP8[0] = pupq102.this.AV69Prdexialm;
      this.aP9[0] = pupq102.this.AV71ExisCalculadas;
      this.aP10[0] = pupq102.this.AV75Dif;
      this.aP11[0] = pupq102.this.AV72EntUniRem;
      this.aP12[0] = pupq102.this.AV76Dif2;
      this.aP13[0] = pupq102.this.AV78Obs;
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
      P05RJ2_A719PrdNum = new String[] {""} ;
      P05RJ2_A396EmprCod = new String[] {""} ;
      P05RJ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV49Prdnum = "" ;
      AV70prdNom = "" ;
      P05RJ3_A411EntCon = new byte[1] ;
      P05RJ3_A719PrdNum = new String[] {""} ;
      P05RJ3_A396EmprCod = new String[] {""} ;
      P05RJ3_A5686EntLotN = new String[] {""} ;
      P05RJ3_A5691EntBnc = new String[] {""} ;
      P05RJ3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ3_A597LinEnt = new short[1] ;
      A5686EntLotN = "" ;
      A5691EntBnc = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      AV63RecExiRea = DecimalUtil.ZERO ;
      P05RJ4_A396EmprCod = new String[] {""} ;
      P05RJ4_A719PrdNum = new String[] {""} ;
      P05RJ4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      P05RJ5_A396EmprCod = new String[] {""} ;
      P05RJ5_A719PrdNum = new String[] {""} ;
      P05RJ5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05RJ5_A3345TipMovCc = new String[] {""} ;
      P05RJ5_A3342CCStkLin = new long[1] ;
      P05RJ5_A3356CCStkHor = new String[] {""} ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3356CCStkHor = "" ;
      AV89CCStkHor = "" ;
      P05RJ6_A396EmprCod = new String[] {""} ;
      P05RJ6_A719PrdNum = new String[] {""} ;
      P05RJ6_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05RJ6_A3345TipMovCc = new String[] {""} ;
      P05RJ6_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ6_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ6_A3356CCStkHor = new String[] {""} ;
      P05RJ6_A3342CCStkLin = new long[1] ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      P05RJ7_A396EmprCod = new String[] {""} ;
      P05RJ7_A719PrdNum = new String[] {""} ;
      P05RJ7_A3356CCStkHor = new String[] {""} ;
      P05RJ7_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05RJ7_A3342CCStkLin = new long[1] ;
      Gx_date = GXutil.nullDate() ;
      P05RJ8_A396EmprCod = new String[] {""} ;
      P05RJ8_A719PrdNum = new String[] {""} ;
      P05RJ8_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05RJ8_A3345TipMovCc = new String[] {""} ;
      P05RJ8_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ8_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RJ8_A3356CCStkHor = new String[] {""} ;
      P05RJ8_A3342CCStkLin = new long[1] ;
      AV65Ccstkfec = GXutil.nullDate() ;
      AV84Siacumular = "" ;
      P05RJ9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05RJ9_A719PrdNum = new String[] {""} ;
      P05RJ9_A396EmprCod = new String[] {""} ;
      P05RJ9_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupq102__default(),
         new Object[] {
             new Object[] {
            P05RJ2_A719PrdNum, P05RJ2_A396EmprCod, P05RJ2_A704PrdExiAlm, P05RJ2_A718PrdNom
            }
            , new Object[] {
            P05RJ3_A411EntCon, P05RJ3_A719PrdNum, P05RJ3_A396EmprCod, P05RJ3_A5686EntLotN, P05RJ3_A5691EntBnc, P05RJ3_A419EntUniRem, P05RJ3_A597LinEnt
            }
            , new Object[] {
            P05RJ4_A396EmprCod, P05RJ4_A719PrdNum, P05RJ4_A807RecExiRea, P05RJ4_A810RecFec
            }
            , new Object[] {
            P05RJ5_A396EmprCod, P05RJ5_A719PrdNum, P05RJ5_A3348CCStkFec, P05RJ5_A3345TipMovCc, P05RJ5_A3342CCStkLin, P05RJ5_A3356CCStkHor
            }
            , new Object[] {
            P05RJ6_A396EmprCod, P05RJ6_A719PrdNum, P05RJ6_A3348CCStkFec, P05RJ6_A3345TipMovCc, P05RJ6_A3343CCStkCanE, P05RJ6_A3344CCStkCanS, P05RJ6_A3356CCStkHor, P05RJ6_A3342CCStkLin
            }
            , new Object[] {
            P05RJ7_A396EmprCod, P05RJ7_A719PrdNum, P05RJ7_A3356CCStkHor, P05RJ7_A3348CCStkFec, P05RJ7_A3342CCStkLin
            }
            , new Object[] {
            P05RJ8_A396EmprCod, P05RJ8_A719PrdNum, P05RJ8_A3348CCStkFec, P05RJ8_A3345TipMovCc, P05RJ8_A3343CCStkCanE, P05RJ8_A3344CCStkCanS, P05RJ8_A3356CCStkHor, P05RJ8_A3342CCStkLin
            }
            , new Object[] {
            P05RJ9_A810RecFec, P05RJ9_A719PrdNum, P05RJ9_A396EmprCod, P05RJ9_A807RecExiRea
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV77SiInventario ;
   private byte A411EntCon ;
   private byte AV87Cotexsur ;
   private short A597LinEnt ;
   private short Gx_err ;
   private long AV64CCstklin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV61Entradas ;
   private java.math.BigDecimal AV62Salidas ;
   private java.math.BigDecimal AV66CantInv ;
   private java.math.BigDecimal AV67Compras ;
   private java.math.BigDecimal AV68Consumos ;
   private java.math.BigDecimal AV69Prdexialm ;
   private java.math.BigDecimal AV71ExisCalculadas ;
   private java.math.BigDecimal AV75Dif ;
   private java.math.BigDecimal AV72EntUniRem ;
   private java.math.BigDecimal AV76Dif2 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal AV63RecExiRea ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String AV50Emprcod ;
   private String AV74Prdnum1 ;
   private String AV78Obs ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV49Prdnum ;
   private String AV70prdNom ;
   private String A5686EntLotN ;
   private String A5691EntBnc ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String AV89CCStkHor ;
   private String AV84Siacumular ;
   private java.util.Date AV60Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private java.util.Date AV65Ccstkfec ;
   private boolean returnInSub ;
   private String[] aP13 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P05RJ2_A719PrdNum ;
   private String[] P05RJ2_A396EmprCod ;
   private java.math.BigDecimal[] P05RJ2_A704PrdExiAlm ;
   private String[] P05RJ2_A718PrdNom ;
   private byte[] P05RJ3_A411EntCon ;
   private String[] P05RJ3_A719PrdNum ;
   private String[] P05RJ3_A396EmprCod ;
   private String[] P05RJ3_A5686EntLotN ;
   private String[] P05RJ3_A5691EntBnc ;
   private java.math.BigDecimal[] P05RJ3_A419EntUniRem ;
   private short[] P05RJ3_A597LinEnt ;
   private String[] P05RJ4_A396EmprCod ;
   private String[] P05RJ4_A719PrdNum ;
   private java.math.BigDecimal[] P05RJ4_A807RecExiRea ;
   private java.util.Date[] P05RJ4_A810RecFec ;
   private String[] P05RJ5_A396EmprCod ;
   private String[] P05RJ5_A719PrdNum ;
   private java.util.Date[] P05RJ5_A3348CCStkFec ;
   private String[] P05RJ5_A3345TipMovCc ;
   private long[] P05RJ5_A3342CCStkLin ;
   private String[] P05RJ5_A3356CCStkHor ;
   private String[] P05RJ6_A396EmprCod ;
   private String[] P05RJ6_A719PrdNum ;
   private java.util.Date[] P05RJ6_A3348CCStkFec ;
   private String[] P05RJ6_A3345TipMovCc ;
   private java.math.BigDecimal[] P05RJ6_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05RJ6_A3344CCStkCanS ;
   private String[] P05RJ6_A3356CCStkHor ;
   private long[] P05RJ6_A3342CCStkLin ;
   private String[] P05RJ7_A396EmprCod ;
   private String[] P05RJ7_A719PrdNum ;
   private String[] P05RJ7_A3356CCStkHor ;
   private java.util.Date[] P05RJ7_A3348CCStkFec ;
   private long[] P05RJ7_A3342CCStkLin ;
   private String[] P05RJ8_A396EmprCod ;
   private String[] P05RJ8_A719PrdNum ;
   private java.util.Date[] P05RJ8_A3348CCStkFec ;
   private String[] P05RJ8_A3345TipMovCc ;
   private java.math.BigDecimal[] P05RJ8_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05RJ8_A3344CCStkCanS ;
   private String[] P05RJ8_A3356CCStkHor ;
   private long[] P05RJ8_A3342CCStkLin ;
   private java.util.Date[] P05RJ9_A810RecFec ;
   private String[] P05RJ9_A719PrdNum ;
   private String[] P05RJ9_A396EmprCod ;
   private java.math.BigDecimal[] P05RJ9_A807RecExiRea ;
}

final  class pupq102__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RJ2", "SELECT PrdNum, EmprCod, PrdExiAlm, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05RJ3", "SELECT EntCon, PrdNum, EmprCod, EntLotN, EntBnc, EntUniRem, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RJ4", "SELECT * FROM (SELECT EmprCod, PrdNum, RecExiRea, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05RJ5", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkLin, CCStkHor FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RJ6", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RJ7", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkHor, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05RJ8", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec >= ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RJ9", "SELECT RecFec, PrdNum, EmprCod, RecExiRea FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

