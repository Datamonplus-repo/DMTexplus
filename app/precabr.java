package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precabr extends GXProcedure
{
   public precabr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precabr.class ), "" );
   }

   public precabr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      precabr.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      precabr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precabr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV63KilMin = 0 ;
      GXv_char1[0] = AV15EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "KILMIN", "") ;
      GXv_int3[0] = AV70PreMin ;
      GXv_char4[0] = AV64ContDsc ;
      new app.pleocon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      precabr.this.AV15EmprCod = GXv_char1[0] ;
      precabr.this.AV70PreMin = GXv_int3[0] ;
      precabr.this.AV64ContDsc = GXv_char4[0] ;
      AV71ContDsc6 = GXutil.substring( AV64ContDsc, 1, 6) ;
      AV63KilMin = (int)(GXutil.lval( AV71ContDsc6)) ;
      AV74PreMinEur = DecimalUtil.doubleToDec(AV70PreMin/ (double) (100)) ;
      /* Using cursor P00OP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P00OP2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00OP2_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P00OP2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00OP2_n3915EmpNumDec[0] ;
         AV19PreKgm = DecimalUtil.ZERO ;
         AV20PreMts = DecimalUtil.ZERO ;
         AV22TotRec = DecimalUtil.ZERO ;
         AV21Operesp = (byte)(0) ;
         AV62AlbBarRec = DecimalUtil.ZERO ;
         AV15EmprCod = A396EmprCod ;
         /* Using cursor P00OP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1261BarAlbKgmE = P00OP3_A1261BarAlbKgmE[0] ;
            A1262BarPreKgm = P00OP3_A1262BarPreKgm[0] ;
            A32AlbProEsp = P00OP3_A32AlbProEsp[0] ;
            A40AlbProRec = P00OP3_A40AlbProRec[0] ;
            A2761AlbBarRec = P00OP3_A2761AlbBarRec[0] ;
            A130BarCodPar = P00OP3_A130BarCodPar[0] ;
            A132BarCodReo = P00OP3_A132BarCodReo[0] ;
            A129BarCod = P00OP3_A129BarCod[0] ;
            /* Using cursor P00OP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            /* Using cursor P00OP5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A361DisCod = P00OP5_A361DisCod[0] ;
            A252CliCod = P00OP5_A252CliCod[0] ;
            n252CliCod = P00OP5_n252CliCod[0] ;
            A212BarSer = P00OP5_A212BarSer[0] ;
            A135BarColNom = P00OP5_A135BarColNom[0] ;
            A136BarColNum = P00OP5_A136BarColNum[0] ;
            A218BarTipCol = P00OP5_A218BarTipCol[0] ;
            A3310BarFac = P00OP5_A3310BarFac[0] ;
            A2010BarTipDis = P00OP5_A2010BarTipDis[0] ;
            A148BarEstReo = P00OP5_A148BarEstReo[0] ;
            A193BarOpeEsp = P00OP5_A193BarOpeEsp[0] ;
            /* Using cursor P00OP6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            A1157TipConCod = P00OP6_A1157TipConCod[0] ;
            n1157TipConCod = P00OP6_n1157TipConCod[0] ;
            AV35CliCod = A252CliCod ;
            AV31BarSer = A212BarSer ;
            AV32BarColNom = A135BarColNom ;
            AV33BarColNum = A136BarColNum ;
            AV34TipColCod = A218BarTipCol ;
            AV73BarFac = A3310BarFac ;
            AV27LimUni = A1261BarAlbKgmE ;
            AV54PorRec = DecimalUtil.ZERO ;
            AV44UniMed = httpContext.getMessage( "K", "") ;
            AV60BarTipDis = A2010BarTipDis ;
            AV61TipConCod = A1157TipConCod ;
            AV75EmpNumDec = A3915EmpNumDec ;
            /* Execute user subroutine: 'LOCFOR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( AV27LimUni.doubleValue() < AV63KilMin ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74PreMinEur)==0) )
            {
               AV19PreKgm = AV74PreMinEur ;
               AV22TotRec = DecimalUtil.doubleToDec(0) ;
               AV21Operesp = (byte)(10) ;
            }
            else
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) )
               {
                  if ( A148BarEstReo == 2 )
                  {
                     AV21Operesp = A193BarOpeEsp ;
                  }
                  else
                  {
                     AV21Operesp = (byte)(A193BarOpeEsp+10) ;
                  }
                  A193BarOpeEsp = AV21Operesp ;
               }
               else
               {
                  AV21Operesp = (byte)(2) ;
               }
            }
            if ( GXutil.strcmp(AV73BarFac, httpContext.getMessage( "N", "")) == 0 )
            {
               A1262BarPreKgm = DecimalUtil.ZERO ;
               A32AlbProEsp = (byte)(10) ;
               A40AlbProRec = DecimalUtil.ZERO ;
               A2761AlbBarRec = DecimalUtil.ZERO ;
            }
            else
            {
               A1262BarPreKgm = AV19PreKgm ;
               A32AlbProEsp = AV21Operesp ;
               A40AlbProRec = AV22TotRec ;
               A2761AlbBarRec = AV54PorRec ;
            }
            /* Using cursor P00OP7 */
            pr_default.execute(5, new Object[] {Byte.valueOf(A193BarOpeEsp), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Using cursor P00OP8 */
            pr_default.execute(6, new Object[] {A1262BarPreKgm, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A2761AlbBarRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      AV66FlagFor = (byte)(0) ;
      AV67ForPreKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00OP9 */
      pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A831TipColCod = P00OP9_A831TipColCod[0] ;
         A483ForColNum = P00OP9_A483ForColNum[0] ;
         A482ForColNom = P00OP9_A482ForColNom[0] ;
         A494ForSer = P00OP9_A494ForSer[0] ;
         A252CliCod = P00OP9_A252CliCod[0] ;
         n252CliCod = P00OP9_n252CliCod[0] ;
         A583IntCod = P00OP9_A583IntCod[0] ;
         A492ForPreKgm = P00OP9_A492ForPreKgm[0] ;
         n492ForPreKgm = P00OP9_n492ForPreKgm[0] ;
         AV25IntCod = A583IntCod ;
         AV66FlagFor = (byte)(1) ;
         AV67ForPreKgm = A492ForPreKgm ;
         /* Using cursor P00OP10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A1521RecValFin = P00OP10_A1521RecValFin[0] ;
            n1521RecValFin = P00OP10_n1521RecValFin[0] ;
            A1520RecValIni = P00OP10_A1520RecValIni[0] ;
            n1520RecValIni = P00OP10_n1520RecValIni[0] ;
            A1522RecCanRec = P00OP10_A1522RecCanRec[0] ;
            n1522RecCanRec = P00OP10_n1522RecCanRec[0] ;
            A1519RecCorLin = P00OP10_A1519RecCorLin[0] ;
            if ( ( ( AV27LimUni.doubleValue() >= A1520RecValIni ) && ( AV27LimUni.doubleValue() <= A1521RecValFin ) ) || ( ( AV27LimUni.doubleValue() >= A1520RecValIni ) && (0==A1521RecValFin) ) )
            {
               AV22TotRec = A1522RecCanRec ;
               AV67ForPreKgm = AV67ForPreKgm.add(AV22TotRec) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(8);
         }
         pr_default.close(8);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      /* Execute user subroutine: 'LOCART' */
      S121 ();
      if (returnInSub) return;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67ForPreKgm)==0) )
      {
         AV19PreKgm = AV67ForPreKgm ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) )
      {
         if ( AV75EmpNumDec == 0 )
         {
            AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
         }
         else
         {
            if ( AV75EmpNumDec == 2 )
            {
               AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            }
         }
         AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
         /* Using cursor P00OP11 */
         pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV60BarTipDis, AV27LimUni});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A2929RecLim1 = P00OP11_A2929RecLim1[0] ;
            A2927RecProCod = P00OP11_A2927RecProCod[0] ;
            A252CliCod = P00OP11_A252CliCod[0] ;
            n252CliCod = P00OP11_n252CliCod[0] ;
            A2930RecPre1 = P00OP11_A2930RecPre1[0] ;
            n2930RecPre1 = P00OP11_n2930RecPre1[0] ;
            AV19PreKgm = AV19PreKgm.add(A2930RecPre1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Using cursor P00OP12 */
         pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV27LimUni});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A2931Limite2 = P00OP12_A2931Limite2[0] ;
            A65ArtCod = P00OP12_A65ArtCod[0] ;
            A252CliCod = P00OP12_A252CliCod[0] ;
            n252CliCod = P00OP12_n252CliCod[0] ;
            A2932Precio2 = P00OP12_A2932Precio2[0] ;
            n2932Precio2 = P00OP12_n2932Precio2[0] ;
            AV19PreKgm = AV19PreKgm.add(A2932Precio2) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         /* Using cursor P00OP13 */
         pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), Short.valueOf(AV61TipConCod), AV27LimUni});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A2935Limite3 = P00OP13_A2935Limite3[0] ;
            A2933RecTipCon = P00OP13_A2933RecTipCon[0] ;
            A252CliCod = P00OP13_A252CliCod[0] ;
            n252CliCod = P00OP13_n252CliCod[0] ;
            A2936Precio3 = P00OP13_A2936Precio3[0] ;
            n2936Precio3 = P00OP13_n2936Precio3[0] ;
            AV19PreKgm = AV19PreKgm.add(A2936Precio3) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(11);
         }
         pr_default.close(11);
      }
   }

   public void S121( )
   {
      /* 'LOCART' Routine */
      returnInSub = false ;
      /* Using cursor P00OP14 */
      pr_default.execute(12, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A65ArtCod = P00OP14_A65ArtCod[0] ;
         A252CliCod = P00OP14_A252CliCod[0] ;
         n252CliCod = P00OP14_n252CliCod[0] ;
         A92ArtPreKgm = P00OP14_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P00OP14_n92ArtPreKgm[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         /* Using cursor P00OP15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, AV27LimUni});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A596LimUni = P00OP15_A596LimUni[0] ;
            n596LimUni = P00OP15_n596LimUni[0] ;
            A675PorRec = P00OP15_A675PorRec[0] ;
            n675PorRec = P00OP15_n675PorRec[0] ;
            A598LinRec = P00OP15_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(13);
         }
         pr_default.close(13);
         AV69FlagArt = (byte)(0) ;
         /* Using cursor P00OP16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A583IntCod = P00OP16_A583IntCod[0] ;
            A831TipColCod = P00OP16_A831TipColCod[0] ;
            A586IntPreKgm = P00OP16_A586IntPreKgm[0] ;
            n586IntPreKgm = P00OP16_n586IntPreKgm[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A586IntPreKgm)==0) )
            {
               AV19PreKgm = A586IntPreKgm ;
               AV69FlagArt = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
         if ( AV69FlagArt == 1 )
         {
            /* Using cursor P00OP17 */
            pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV25IntCod), AV27LimUni});
            while ( (pr_default.getStatus(15) != 101) )
            {
               A2939Limite4 = P00OP17_A2939Limite4[0] ;
               A2937RecIntCod = P00OP17_A2937RecIntCod[0] ;
               A2940Precio4 = P00OP17_A2940Precio4[0] ;
               n2940Precio4 = P00OP17_n2940Precio4[0] ;
               AV19PreKgm = AV19PreKgm.add(A2940Precio4) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(15);
            }
            pr_default.close(15);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP0[0] = precabr.this.A396EmprCod;
      this.aP1[0] = precabr.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "precabr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV64ContDsc = "" ;
      GXv_char4 = new String[1] ;
      AV71ContDsc6 = "" ;
      AV74PreMinEur = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00OP2_A396EmprCod = new String[] {""} ;
      P00OP2_A30AlbProCod = new long[1] ;
      P00OP2_A3915EmpNumDec = new byte[1] ;
      P00OP2_n3915EmpNumDec = new boolean[] {false} ;
      AV19PreKgm = DecimalUtil.ZERO ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV22TotRec = DecimalUtil.ZERO ;
      AV62AlbBarRec = DecimalUtil.ZERO ;
      P00OP3_A396EmprCod = new String[] {""} ;
      P00OP3_A30AlbProCod = new long[1] ;
      P00OP3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP3_A32AlbProEsp = new byte[1] ;
      P00OP3_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP3_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP3_A130BarCodPar = new String[] {""} ;
      P00OP3_A132BarCodReo = new byte[1] ;
      P00OP3_A129BarCod = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      P00OP4_A396EmprCod = new String[] {""} ;
      P00OP5_A361DisCod = new int[1] ;
      P00OP5_A252CliCod = new int[1] ;
      P00OP5_n252CliCod = new boolean[] {false} ;
      P00OP5_A212BarSer = new String[] {""} ;
      P00OP5_A135BarColNom = new String[] {""} ;
      P00OP5_A136BarColNum = new int[1] ;
      P00OP5_A218BarTipCol = new byte[1] ;
      P00OP5_A3310BarFac = new String[] {""} ;
      P00OP5_A2010BarTipDis = new String[] {""} ;
      P00OP5_A148BarEstReo = new byte[1] ;
      P00OP5_A193BarOpeEsp = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A3310BarFac = "" ;
      A2010BarTipDis = "" ;
      P00OP6_A1157TipConCod = new short[1] ;
      P00OP6_n1157TipConCod = new boolean[] {false} ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV73BarFac = "" ;
      AV27LimUni = DecimalUtil.ZERO ;
      AV54PorRec = DecimalUtil.ZERO ;
      AV44UniMed = "" ;
      AV60BarTipDis = "" ;
      AV67ForPreKgm = DecimalUtil.ZERO ;
      P00OP9_A831TipColCod = new byte[1] ;
      P00OP9_A483ForColNum = new int[1] ;
      P00OP9_A482ForColNom = new String[] {""} ;
      P00OP9_A494ForSer = new String[] {""} ;
      P00OP9_A252CliCod = new int[1] ;
      P00OP9_n252CliCod = new boolean[] {false} ;
      P00OP9_A396EmprCod = new String[] {""} ;
      P00OP9_A583IntCod = new byte[1] ;
      P00OP9_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP9_n492ForPreKgm = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      P00OP10_A396EmprCod = new String[] {""} ;
      P00OP10_A252CliCod = new int[1] ;
      P00OP10_n252CliCod = new boolean[] {false} ;
      P00OP10_A494ForSer = new String[] {""} ;
      P00OP10_A482ForColNom = new String[] {""} ;
      P00OP10_A483ForColNum = new int[1] ;
      P00OP10_A831TipColCod = new byte[1] ;
      P00OP10_A1521RecValFin = new int[1] ;
      P00OP10_n1521RecValFin = new boolean[] {false} ;
      P00OP10_A1520RecValIni = new int[1] ;
      P00OP10_n1520RecValIni = new boolean[] {false} ;
      P00OP10_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP10_n1522RecCanRec = new boolean[] {false} ;
      P00OP10_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      P00OP11_A2929RecLim1 = new short[1] ;
      P00OP11_A2927RecProCod = new String[] {""} ;
      P00OP11_A252CliCod = new int[1] ;
      P00OP11_n252CliCod = new boolean[] {false} ;
      P00OP11_A396EmprCod = new String[] {""} ;
      P00OP11_A2930RecPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP11_n2930RecPre1 = new boolean[] {false} ;
      A2927RecProCod = "" ;
      A2930RecPre1 = DecimalUtil.ZERO ;
      P00OP12_A2931Limite2 = new short[1] ;
      P00OP12_A65ArtCod = new String[] {""} ;
      P00OP12_A252CliCod = new int[1] ;
      P00OP12_n252CliCod = new boolean[] {false} ;
      P00OP12_A396EmprCod = new String[] {""} ;
      P00OP12_A2932Precio2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP12_n2932Precio2 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A2932Precio2 = DecimalUtil.ZERO ;
      P00OP13_A2935Limite3 = new short[1] ;
      P00OP13_A2933RecTipCon = new short[1] ;
      P00OP13_A252CliCod = new int[1] ;
      P00OP13_n252CliCod = new boolean[] {false} ;
      P00OP13_A396EmprCod = new String[] {""} ;
      P00OP13_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP13_n2936Precio3 = new boolean[] {false} ;
      A2936Precio3 = DecimalUtil.ZERO ;
      P00OP14_A65ArtCod = new String[] {""} ;
      P00OP14_A252CliCod = new int[1] ;
      P00OP14_n252CliCod = new boolean[] {false} ;
      P00OP14_A396EmprCod = new String[] {""} ;
      P00OP14_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP14_n92ArtPreKgm = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      P00OP15_A396EmprCod = new String[] {""} ;
      P00OP15_A252CliCod = new int[1] ;
      P00OP15_n252CliCod = new boolean[] {false} ;
      P00OP15_A65ArtCod = new String[] {""} ;
      P00OP15_A596LimUni = new int[1] ;
      P00OP15_n596LimUni = new boolean[] {false} ;
      P00OP15_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP15_n675PorRec = new boolean[] {false} ;
      P00OP15_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      P00OP16_A396EmprCod = new String[] {""} ;
      P00OP16_A252CliCod = new int[1] ;
      P00OP16_n252CliCod = new boolean[] {false} ;
      P00OP16_A65ArtCod = new String[] {""} ;
      P00OP16_A583IntCod = new byte[1] ;
      P00OP16_A831TipColCod = new byte[1] ;
      P00OP16_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP16_n586IntPreKgm = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      P00OP17_A396EmprCod = new String[] {""} ;
      P00OP17_A252CliCod = new int[1] ;
      P00OP17_n252CliCod = new boolean[] {false} ;
      P00OP17_A65ArtCod = new String[] {""} ;
      P00OP17_A2939Limite4 = new short[1] ;
      P00OP17_A2937RecIntCod = new byte[1] ;
      P00OP17_A2940Precio4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OP17_n2940Precio4 = new boolean[] {false} ;
      A2940Precio4 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precabr__default(),
         new Object[] {
             new Object[] {
            P00OP2_A396EmprCod, P00OP2_A30AlbProCod, P00OP2_A3915EmpNumDec, P00OP2_n3915EmpNumDec
            }
            , new Object[] {
            P00OP3_A396EmprCod, P00OP3_A30AlbProCod, P00OP3_A1261BarAlbKgmE, P00OP3_A1262BarPreKgm, P00OP3_A32AlbProEsp, P00OP3_A40AlbProRec, P00OP3_A2761AlbBarRec, P00OP3_A130BarCodPar, P00OP3_A132BarCodReo, P00OP3_A129BarCod
            }
            , new Object[] {
            P00OP4_A396EmprCod
            }
            , new Object[] {
            P00OP5_A361DisCod, P00OP5_A252CliCod, P00OP5_n252CliCod, P00OP5_A212BarSer, P00OP5_A135BarColNom, P00OP5_A136BarColNum, P00OP5_A218BarTipCol, P00OP5_A3310BarFac, P00OP5_A2010BarTipDis, P00OP5_A148BarEstReo,
            P00OP5_A193BarOpeEsp
            }
            , new Object[] {
            P00OP6_A1157TipConCod, P00OP6_n1157TipConCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00OP9_A831TipColCod, P00OP9_A483ForColNum, P00OP9_A482ForColNom, P00OP9_A494ForSer, P00OP9_A252CliCod, P00OP9_A396EmprCod, P00OP9_A583IntCod, P00OP9_A492ForPreKgm, P00OP9_n492ForPreKgm
            }
            , new Object[] {
            P00OP10_A396EmprCod, P00OP10_A252CliCod, P00OP10_A494ForSer, P00OP10_A482ForColNom, P00OP10_A483ForColNum, P00OP10_A831TipColCod, P00OP10_A1521RecValFin, P00OP10_n1521RecValFin, P00OP10_A1520RecValIni, P00OP10_n1520RecValIni,
            P00OP10_A1522RecCanRec, P00OP10_n1522RecCanRec, P00OP10_A1519RecCorLin
            }
            , new Object[] {
            P00OP11_A2929RecLim1, P00OP11_A2927RecProCod, P00OP11_A252CliCod, P00OP11_A396EmprCod, P00OP11_A2930RecPre1, P00OP11_n2930RecPre1
            }
            , new Object[] {
            P00OP12_A2931Limite2, P00OP12_A65ArtCod, P00OP12_A252CliCod, P00OP12_A396EmprCod, P00OP12_A2932Precio2, P00OP12_n2932Precio2
            }
            , new Object[] {
            P00OP13_A2935Limite3, P00OP13_A2933RecTipCon, P00OP13_A252CliCod, P00OP13_A396EmprCod, P00OP13_A2936Precio3, P00OP13_n2936Precio3
            }
            , new Object[] {
            P00OP14_A65ArtCod, P00OP14_A252CliCod, P00OP14_A396EmprCod, P00OP14_A92ArtPreKgm, P00OP14_n92ArtPreKgm
            }
            , new Object[] {
            P00OP15_A396EmprCod, P00OP15_A252CliCod, P00OP15_A65ArtCod, P00OP15_A596LimUni, P00OP15_n596LimUni, P00OP15_A675PorRec, P00OP15_n675PorRec, P00OP15_A598LinRec
            }
            , new Object[] {
            P00OP16_A396EmprCod, P00OP16_A252CliCod, P00OP16_A65ArtCod, P00OP16_A583IntCod, P00OP16_A831TipColCod, P00OP16_A586IntPreKgm, P00OP16_n586IntPreKgm
            }
            , new Object[] {
            P00OP17_A396EmprCod, P00OP17_A252CliCod, P00OP17_A65ArtCod, P00OP17_A2939Limite4, P00OP17_A2937RecIntCod, P00OP17_A2940Precio4, P00OP17_n2940Precio4
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private byte AV21Operesp ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte AV75EmpNumDec ;
   private byte AV66FlagFor ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV25IntCod ;
   private byte A1519RecCorLin ;
   private byte A598LinRec ;
   private byte AV69FlagArt ;
   private byte A2937RecIntCod ;
   private short A1157TipConCod ;
   private short AV61TipConCod ;
   private short A2929RecLim1 ;
   private short A2931Limite2 ;
   private short A2935Limite3 ;
   private short A2933RecTipCon ;
   private short A2939Limite4 ;
   private short Gx_err ;
   private int AV63KilMin ;
   private int AV70PreMin ;
   private int GXv_int3[] ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int A483ForColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV74PreMinEur ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV62AlbBarRec ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal AV27LimUni ;
   private java.math.BigDecimal AV54PorRec ;
   private java.math.BigDecimal AV67ForPreKgm ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal A2930RecPre1 ;
   private java.math.BigDecimal A2932Precio2 ;
   private java.math.BigDecimal A2936Precio3 ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A2940Precio4 ;
   private String A396EmprCod ;
   private String AV15EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV64ContDsc ;
   private String GXv_char4[] ;
   private String AV71ContDsc6 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A3310BarFac ;
   private String A2010BarTipDis ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV73BarFac ;
   private String AV44UniMed ;
   private String AV60BarTipDis ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A2927RecProCod ;
   private String A65ArtCod ;
   private boolean n3915EmpNumDec ;
   private boolean n252CliCod ;
   private boolean n1157TipConCod ;
   private boolean returnInSub ;
   private boolean n492ForPreKgm ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private boolean n1522RecCanRec ;
   private boolean n2930RecPre1 ;
   private boolean n2932Precio2 ;
   private boolean n2936Precio3 ;
   private boolean n92ArtPreKgm ;
   private boolean n596LimUni ;
   private boolean n675PorRec ;
   private boolean n586IntPreKgm ;
   private boolean n2940Precio4 ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OP2_A396EmprCod ;
   private long[] P00OP2_A30AlbProCod ;
   private byte[] P00OP2_A3915EmpNumDec ;
   private boolean[] P00OP2_n3915EmpNumDec ;
   private String[] P00OP3_A396EmprCod ;
   private long[] P00OP3_A30AlbProCod ;
   private java.math.BigDecimal[] P00OP3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00OP3_A1262BarPreKgm ;
   private byte[] P00OP3_A32AlbProEsp ;
   private java.math.BigDecimal[] P00OP3_A40AlbProRec ;
   private java.math.BigDecimal[] P00OP3_A2761AlbBarRec ;
   private String[] P00OP3_A130BarCodPar ;
   private byte[] P00OP3_A132BarCodReo ;
   private int[] P00OP3_A129BarCod ;
   private String[] P00OP4_A396EmprCod ;
   private int[] P00OP5_A361DisCod ;
   private int[] P00OP5_A252CliCod ;
   private boolean[] P00OP5_n252CliCod ;
   private String[] P00OP5_A212BarSer ;
   private String[] P00OP5_A135BarColNom ;
   private int[] P00OP5_A136BarColNum ;
   private byte[] P00OP5_A218BarTipCol ;
   private String[] P00OP5_A3310BarFac ;
   private String[] P00OP5_A2010BarTipDis ;
   private byte[] P00OP5_A148BarEstReo ;
   private byte[] P00OP5_A193BarOpeEsp ;
   private short[] P00OP6_A1157TipConCod ;
   private boolean[] P00OP6_n1157TipConCod ;
   private byte[] P00OP9_A831TipColCod ;
   private int[] P00OP9_A483ForColNum ;
   private String[] P00OP9_A482ForColNom ;
   private String[] P00OP9_A494ForSer ;
   private int[] P00OP9_A252CliCod ;
   private boolean[] P00OP9_n252CliCod ;
   private String[] P00OP9_A396EmprCod ;
   private byte[] P00OP9_A583IntCod ;
   private java.math.BigDecimal[] P00OP9_A492ForPreKgm ;
   private boolean[] P00OP9_n492ForPreKgm ;
   private String[] P00OP10_A396EmprCod ;
   private int[] P00OP10_A252CliCod ;
   private boolean[] P00OP10_n252CliCod ;
   private String[] P00OP10_A494ForSer ;
   private String[] P00OP10_A482ForColNom ;
   private int[] P00OP10_A483ForColNum ;
   private byte[] P00OP10_A831TipColCod ;
   private int[] P00OP10_A1521RecValFin ;
   private boolean[] P00OP10_n1521RecValFin ;
   private int[] P00OP10_A1520RecValIni ;
   private boolean[] P00OP10_n1520RecValIni ;
   private java.math.BigDecimal[] P00OP10_A1522RecCanRec ;
   private boolean[] P00OP10_n1522RecCanRec ;
   private byte[] P00OP10_A1519RecCorLin ;
   private short[] P00OP11_A2929RecLim1 ;
   private String[] P00OP11_A2927RecProCod ;
   private int[] P00OP11_A252CliCod ;
   private boolean[] P00OP11_n252CliCod ;
   private String[] P00OP11_A396EmprCod ;
   private java.math.BigDecimal[] P00OP11_A2930RecPre1 ;
   private boolean[] P00OP11_n2930RecPre1 ;
   private short[] P00OP12_A2931Limite2 ;
   private String[] P00OP12_A65ArtCod ;
   private int[] P00OP12_A252CliCod ;
   private boolean[] P00OP12_n252CliCod ;
   private String[] P00OP12_A396EmprCod ;
   private java.math.BigDecimal[] P00OP12_A2932Precio2 ;
   private boolean[] P00OP12_n2932Precio2 ;
   private short[] P00OP13_A2935Limite3 ;
   private short[] P00OP13_A2933RecTipCon ;
   private int[] P00OP13_A252CliCod ;
   private boolean[] P00OP13_n252CliCod ;
   private String[] P00OP13_A396EmprCod ;
   private java.math.BigDecimal[] P00OP13_A2936Precio3 ;
   private boolean[] P00OP13_n2936Precio3 ;
   private String[] P00OP14_A65ArtCod ;
   private int[] P00OP14_A252CliCod ;
   private boolean[] P00OP14_n252CliCod ;
   private String[] P00OP14_A396EmprCod ;
   private java.math.BigDecimal[] P00OP14_A92ArtPreKgm ;
   private boolean[] P00OP14_n92ArtPreKgm ;
   private String[] P00OP15_A396EmprCod ;
   private int[] P00OP15_A252CliCod ;
   private boolean[] P00OP15_n252CliCod ;
   private String[] P00OP15_A65ArtCod ;
   private int[] P00OP15_A596LimUni ;
   private boolean[] P00OP15_n596LimUni ;
   private java.math.BigDecimal[] P00OP15_A675PorRec ;
   private boolean[] P00OP15_n675PorRec ;
   private byte[] P00OP15_A598LinRec ;
   private String[] P00OP16_A396EmprCod ;
   private int[] P00OP16_A252CliCod ;
   private boolean[] P00OP16_n252CliCod ;
   private String[] P00OP16_A65ArtCod ;
   private byte[] P00OP16_A583IntCod ;
   private byte[] P00OP16_A831TipColCod ;
   private java.math.BigDecimal[] P00OP16_A586IntPreKgm ;
   private boolean[] P00OP16_n586IntPreKgm ;
   private String[] P00OP17_A396EmprCod ;
   private int[] P00OP17_A252CliCod ;
   private boolean[] P00OP17_n252CliCod ;
   private String[] P00OP17_A65ArtCod ;
   private short[] P00OP17_A2939Limite4 ;
   private byte[] P00OP17_A2937RecIntCod ;
   private java.math.BigDecimal[] P00OP17_A2940Precio4 ;
   private boolean[] P00OP17_n2940Precio4 ;
}

final  class precabr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OP2", "SELECT T1.EmprCod, T1.AlbProCod, T2.EmpNumDec FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP3", "SELECT EmprCod, AlbProCod, BarAlbKgmE, BarPreKgm, AlbProEsp, AlbProRec, AlbBarRec, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF BarPreKgm, AlbProEsp, AlbProRec, AlbBarRec NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00OP4", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00OP5", "SELECT DisCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarFac, BarTipDis, BarEstReo, BarOpeEsp FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarOpeEsp NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00OP6", "SELECT TipConCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00OP7", "UPDATE TXPBARCAD SET BarOpeEsp=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P00OP8", "UPDATE TXPALBBAR SET BarPreKgm=?, AlbProEsp=?, AlbProRec=?, AlbBarRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00OP9", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreKgm FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP10", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00OP11", "SELECT * FROM (SELECT RecLim1, RecProCod, CliCod, EmprCod, RecPre1 FROM TXPRECPRO WHERE EmprCod = ? and CliCod = ? and RecProCod = ? and RecLim1 > ? ORDER BY EmprCod, CliCod, RecProCod, RecLim1) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP12", "SELECT * FROM (SELECT Limite2, ArtCod, CliCod, EmprCod, Precio2 FROM TXPRECARB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Limite2 > ? ORDER BY EmprCod, CliCod, ArtCod, Limite2) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP13", "SELECT * FROM (SELECT Limite3, RecTipCon, CliCod, EmprCod, Precio3 FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? and Limite3 > ? ORDER BY EmprCod, CliCod, RecTipCon, Limite3) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP14", "SELECT ArtCod, CliCod, EmprCod, ArtPreKgm FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP15", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP16", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OP17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite4, RecIntCod, Precio4 FROM TXPLRBART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and RecIntCod = ? and Limite4 > ? ORDER BY EmprCod, CliCod, ArtCod, RecIntCod, Limite4) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
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
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
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
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               return;
            case 14 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 15 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               return;
      }
   }

}

