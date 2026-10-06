package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptarsab extends GXProcedure
{
   public ptarsab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptarsab.class ), "" );
   }

   public ptarsab( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           byte[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 )
   {
      ptarsab.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      ptarsab.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptarsab.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptarsab.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ptarsab.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ptarsab.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ptarsab.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ptarsab.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ptarsab.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      ptarsab.this.AV62AlbBarRec = aP8[0];
      this.aP8 = aP8;
      ptarsab.this.AV27LimUni = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV76BarAlbKgmE = AV27LimUni ;
      /* Using cursor P00J02 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00J02_A396EmprCod[0] ;
         A3915EmpNumDec = P00J02_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00J02_n3915EmpNumDec[0] ;
         AV75EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV63KilMin = 0 ;
      GXv_char1[0] = AV15EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "KILMIN", "") ;
      GXv_int3[0] = AV70PreMin ;
      GXv_char4[0] = AV64ContDsc ;
      new app.pleocon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      ptarsab.this.AV15EmprCod = GXv_char1[0] ;
      ptarsab.this.AV70PreMin = GXv_int3[0] ;
      ptarsab.this.AV64ContDsc = GXv_char4[0] ;
      AV71ContDsc6 = GXutil.substring( AV64ContDsc, 1, 6) ;
      AV63KilMin = (int)(GXutil.lval( AV71ContDsc6)) ;
      AV73PreMinEur = DecimalUtil.doubleToDec(AV70PreMin/ (double) (100)) ;
      AV19PreKgm = DecimalUtil.ZERO ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV22TotRec = DecimalUtil.ZERO ;
      AV21Operesp = (byte)(0) ;
      AV62AlbBarRec = DecimalUtil.ZERO ;
      AV27LimUni = DecimalUtil.doubleToDec(0) ;
      AV77NumPar = (byte)(0) ;
      /* Using cursor P00J04 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A132BarCodReo = P00J04_A132BarCodReo[0] ;
         A129BarCod = P00J04_A129BarCod[0] ;
         A396EmprCod = P00J04_A396EmprCod[0] ;
         A130BarCodPar = P00J04_A130BarCodPar[0] ;
         A166BarKgm = P00J04_A166BarKgm[0] ;
         n166BarKgm = P00J04_n166BarKgm[0] ;
         A166BarKgm = P00J04_A166BarKgm[0] ;
         n166BarKgm = P00J04_n166BarKgm[0] ;
         AV27LimUni = AV27LimUni.add(A166BarKgm) ;
         if ( GXutil.strcmp(A130BarCodPar, " ") != 0 )
         {
            AV77NumPar = (byte)(AV77NumPar+1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV77NumPar == 0 )
      {
         AV27LimUni = AV76BarAlbKgmE ;
      }
      /* Using cursor P00J05 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P00J05_A361DisCod[0] ;
         A132BarCodReo = P00J05_A132BarCodReo[0] ;
         A130BarCodPar = P00J05_A130BarCodPar[0] ;
         A129BarCod = P00J05_A129BarCod[0] ;
         A396EmprCod = P00J05_A396EmprCod[0] ;
         A161BarFecSal = P00J05_A161BarFecSal[0] ;
         A252CliCod = P00J05_A252CliCod[0] ;
         n252CliCod = P00J05_n252CliCod[0] ;
         A212BarSer = P00J05_A212BarSer[0] ;
         A135BarColNom = P00J05_A135BarColNom[0] ;
         A136BarColNum = P00J05_A136BarColNum[0] ;
         A218BarTipCol = P00J05_A218BarTipCol[0] ;
         A3310BarFac = P00J05_A3310BarFac[0] ;
         A2010BarTipDis = P00J05_A2010BarTipDis[0] ;
         A1157TipConCod = P00J05_A1157TipConCod[0] ;
         n1157TipConCod = P00J05_n1157TipConCod[0] ;
         A148BarEstReo = P00J05_A148BarEstReo[0] ;
         A193BarOpeEsp = P00J05_A193BarOpeEsp[0] ;
         A1157TipConCod = P00J05_A1157TipConCod[0] ;
         n1157TipConCod = P00J05_n1157TipConCod[0] ;
         A161BarFecSal = Gx_date ;
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV72BarFac = A3310BarFac ;
         AV54PorRec = DecimalUtil.ZERO ;
         AV44UniMed = httpContext.getMessage( "K", "") ;
         AV60BarTipDis = A2010BarTipDis ;
         AV61TipConCod = A1157TipConCod ;
         /* Execute user subroutine: 'LOCFOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV27LimUni.doubleValue() < AV63KilMin ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73PreMinEur)==0) )
         {
            AV19PreKgm = AV73PreMinEur ;
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
         A161BarFecSal = GXutil.today( ) ;
         AV62AlbBarRec = AV54PorRec ;
         if ( GXutil.strcmp(AV72BarFac, httpContext.getMessage( "N", "")) == 0 )
         {
            AV62AlbBarRec = DecimalUtil.ZERO ;
            AV22TotRec = DecimalUtil.ZERO ;
            AV19PreKgm = DecimalUtil.ZERO ;
            AV21Operesp = (byte)(10) ;
         }
         /* Using cursor P00J06 */
         pr_default.execute(3, new Object[] {A161BarFecSal, Byte.valueOf(A193BarOpeEsp), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV27LimUni = AV76BarAlbKgmE ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      AV66FlagFor = (byte)(0) ;
      AV67ForPreKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00J07 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P00J07_A831TipColCod[0] ;
         A483ForColNum = P00J07_A483ForColNum[0] ;
         A482ForColNom = P00J07_A482ForColNom[0] ;
         A494ForSer = P00J07_A494ForSer[0] ;
         A252CliCod = P00J07_A252CliCod[0] ;
         n252CliCod = P00J07_n252CliCod[0] ;
         A396EmprCod = P00J07_A396EmprCod[0] ;
         A583IntCod = P00J07_A583IntCod[0] ;
         A492ForPreKgm = P00J07_A492ForPreKgm[0] ;
         n492ForPreKgm = P00J07_n492ForPreKgm[0] ;
         AV25IntCod = A583IntCod ;
         AV66FlagFor = (byte)(1) ;
         AV67ForPreKgm = A492ForPreKgm ;
         /* Using cursor P00J08 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1521RecValFin = P00J08_A1521RecValFin[0] ;
            n1521RecValFin = P00J08_n1521RecValFin[0] ;
            A1520RecValIni = P00J08_A1520RecValIni[0] ;
            n1520RecValIni = P00J08_n1520RecValIni[0] ;
            A1522RecCanRec = P00J08_A1522RecCanRec[0] ;
            n1522RecCanRec = P00J08_n1522RecCanRec[0] ;
            A1519RecCorLin = P00J08_A1519RecCorLin[0] ;
            if ( ( ( AV27LimUni.doubleValue() >= A1520RecValIni ) && ( AV27LimUni.doubleValue() <= A1521RecValFin ) ) || ( ( AV27LimUni.doubleValue() >= A1520RecValIni ) && (0==A1521RecValFin) ) )
            {
               AV22TotRec = A1522RecCanRec ;
               AV67ForPreKgm = AV67ForPreKgm.add(AV22TotRec) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
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
         /* Using cursor P00J09 */
         pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV60BarTipDis, AV27LimUni});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A2929RecLim1 = P00J09_A2929RecLim1[0] ;
            A2927RecProCod = P00J09_A2927RecProCod[0] ;
            A252CliCod = P00J09_A252CliCod[0] ;
            n252CliCod = P00J09_n252CliCod[0] ;
            A396EmprCod = P00J09_A396EmprCod[0] ;
            A2930RecPre1 = P00J09_A2930RecPre1[0] ;
            n2930RecPre1 = P00J09_n2930RecPre1[0] ;
            AV19PreKgm = AV19PreKgm.add(A2930RecPre1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P00J010 */
         pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV27LimUni});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A2931Limite2 = P00J010_A2931Limite2[0] ;
            A65ArtCod = P00J010_A65ArtCod[0] ;
            A252CliCod = P00J010_A252CliCod[0] ;
            n252CliCod = P00J010_n252CliCod[0] ;
            A396EmprCod = P00J010_A396EmprCod[0] ;
            A2932Precio2 = P00J010_A2932Precio2[0] ;
            n2932Precio2 = P00J010_n2932Precio2[0] ;
            AV19PreKgm = AV19PreKgm.add(A2932Precio2) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P00J011 */
         pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), Short.valueOf(AV61TipConCod), AV27LimUni});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A2935Limite3 = P00J011_A2935Limite3[0] ;
            A2933RecTipCon = P00J011_A2933RecTipCon[0] ;
            A252CliCod = P00J011_A252CliCod[0] ;
            n252CliCod = P00J011_n252CliCod[0] ;
            A396EmprCod = P00J011_A396EmprCod[0] ;
            A2936Precio3 = P00J011_A2936Precio3[0] ;
            n2936Precio3 = P00J011_n2936Precio3[0] ;
            AV19PreKgm = AV19PreKgm.add(A2936Precio3) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
   }

   public void S121( )
   {
      /* 'LOCART' Routine */
      returnInSub = false ;
      /* Using cursor P00J012 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A65ArtCod = P00J012_A65ArtCod[0] ;
         A252CliCod = P00J012_A252CliCod[0] ;
         n252CliCod = P00J012_n252CliCod[0] ;
         A396EmprCod = P00J012_A396EmprCod[0] ;
         A92ArtPreKgm = P00J012_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P00J012_n92ArtPreKgm[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         /* Using cursor P00J013 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, AV27LimUni});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A596LimUni = P00J013_A596LimUni[0] ;
            n596LimUni = P00J013_n596LimUni[0] ;
            A675PorRec = P00J013_A675PorRec[0] ;
            n675PorRec = P00J013_n675PorRec[0] ;
            A598LinRec = P00J013_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         AV69FlagArt = (byte)(0) ;
         /* Using cursor P00J014 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A583IntCod = P00J014_A583IntCod[0] ;
            A831TipColCod = P00J014_A831TipColCod[0] ;
            A586IntPreKgm = P00J014_A586IntPreKgm[0] ;
            n586IntPreKgm = P00J014_n586IntPreKgm[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A586IntPreKgm)==0) )
            {
               AV19PreKgm = A586IntPreKgm ;
               AV69FlagArt = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
         if ( AV69FlagArt == 1 )
         {
            /* Using cursor P00J015 */
            pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV25IntCod), AV27LimUni});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A2939Limite4 = P00J015_A2939Limite4[0] ;
               A2937RecIntCod = P00J015_A2937RecIntCod[0] ;
               A2940Precio4 = P00J015_A2940Precio4[0] ;
               n2940Precio4 = P00J015_n2940Precio4[0] ;
               AV19PreKgm = AV19PreKgm.add(A2940Precio4) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(12);
            }
            pr_default.close(12);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptarsab.this.AV15EmprCod;
      this.aP1[0] = ptarsab.this.AV16BarCod;
      this.aP2[0] = ptarsab.this.AV17BarReo;
      this.aP3[0] = ptarsab.this.AV18BarPar;
      this.aP4[0] = ptarsab.this.AV19PreKgm;
      this.aP5[0] = ptarsab.this.AV20PreMts;
      this.aP6[0] = ptarsab.this.AV21Operesp;
      this.aP7[0] = ptarsab.this.AV22TotRec;
      this.aP8[0] = ptarsab.this.AV62AlbBarRec;
      this.aP9[0] = ptarsab.this.AV27LimUni;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptarsab");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV76BarAlbKgmE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00J02_A396EmprCod = new String[] {""} ;
      P00J02_A3915EmpNumDec = new byte[1] ;
      P00J02_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV64ContDsc = "" ;
      GXv_char4 = new String[1] ;
      AV71ContDsc6 = "" ;
      AV73PreMinEur = DecimalUtil.ZERO ;
      P00J04_A132BarCodReo = new byte[1] ;
      P00J04_A129BarCod = new int[1] ;
      P00J04_A396EmprCod = new String[] {""} ;
      P00J04_A130BarCodPar = new String[] {""} ;
      P00J04_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J04_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      P00J05_A361DisCod = new int[1] ;
      P00J05_A132BarCodReo = new byte[1] ;
      P00J05_A130BarCodPar = new String[] {""} ;
      P00J05_A129BarCod = new int[1] ;
      P00J05_A396EmprCod = new String[] {""} ;
      P00J05_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P00J05_A252CliCod = new int[1] ;
      P00J05_n252CliCod = new boolean[] {false} ;
      P00J05_A212BarSer = new String[] {""} ;
      P00J05_A135BarColNom = new String[] {""} ;
      P00J05_A136BarColNum = new int[1] ;
      P00J05_A218BarTipCol = new byte[1] ;
      P00J05_A3310BarFac = new String[] {""} ;
      P00J05_A2010BarTipDis = new String[] {""} ;
      P00J05_A1157TipConCod = new short[1] ;
      P00J05_n1157TipConCod = new boolean[] {false} ;
      P00J05_A148BarEstReo = new byte[1] ;
      P00J05_A193BarOpeEsp = new byte[1] ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A3310BarFac = "" ;
      A2010BarTipDis = "" ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV72BarFac = "" ;
      AV54PorRec = DecimalUtil.ZERO ;
      AV44UniMed = "" ;
      AV60BarTipDis = "" ;
      AV67ForPreKgm = DecimalUtil.ZERO ;
      P00J07_A831TipColCod = new byte[1] ;
      P00J07_A483ForColNum = new int[1] ;
      P00J07_A482ForColNom = new String[] {""} ;
      P00J07_A494ForSer = new String[] {""} ;
      P00J07_A252CliCod = new int[1] ;
      P00J07_n252CliCod = new boolean[] {false} ;
      P00J07_A396EmprCod = new String[] {""} ;
      P00J07_A583IntCod = new byte[1] ;
      P00J07_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J07_n492ForPreKgm = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      P00J08_A396EmprCod = new String[] {""} ;
      P00J08_A252CliCod = new int[1] ;
      P00J08_n252CliCod = new boolean[] {false} ;
      P00J08_A494ForSer = new String[] {""} ;
      P00J08_A482ForColNom = new String[] {""} ;
      P00J08_A483ForColNum = new int[1] ;
      P00J08_A831TipColCod = new byte[1] ;
      P00J08_A1521RecValFin = new int[1] ;
      P00J08_n1521RecValFin = new boolean[] {false} ;
      P00J08_A1520RecValIni = new int[1] ;
      P00J08_n1520RecValIni = new boolean[] {false} ;
      P00J08_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J08_n1522RecCanRec = new boolean[] {false} ;
      P00J08_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      P00J09_A2929RecLim1 = new short[1] ;
      P00J09_A2927RecProCod = new String[] {""} ;
      P00J09_A252CliCod = new int[1] ;
      P00J09_n252CliCod = new boolean[] {false} ;
      P00J09_A396EmprCod = new String[] {""} ;
      P00J09_A2930RecPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J09_n2930RecPre1 = new boolean[] {false} ;
      A2927RecProCod = "" ;
      A2930RecPre1 = DecimalUtil.ZERO ;
      P00J010_A2931Limite2 = new short[1] ;
      P00J010_A65ArtCod = new String[] {""} ;
      P00J010_A252CliCod = new int[1] ;
      P00J010_n252CliCod = new boolean[] {false} ;
      P00J010_A396EmprCod = new String[] {""} ;
      P00J010_A2932Precio2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J010_n2932Precio2 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A2932Precio2 = DecimalUtil.ZERO ;
      P00J011_A2935Limite3 = new short[1] ;
      P00J011_A2933RecTipCon = new short[1] ;
      P00J011_A252CliCod = new int[1] ;
      P00J011_n252CliCod = new boolean[] {false} ;
      P00J011_A396EmprCod = new String[] {""} ;
      P00J011_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J011_n2936Precio3 = new boolean[] {false} ;
      A2936Precio3 = DecimalUtil.ZERO ;
      P00J012_A65ArtCod = new String[] {""} ;
      P00J012_A252CliCod = new int[1] ;
      P00J012_n252CliCod = new boolean[] {false} ;
      P00J012_A396EmprCod = new String[] {""} ;
      P00J012_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J012_n92ArtPreKgm = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      P00J013_A396EmprCod = new String[] {""} ;
      P00J013_A252CliCod = new int[1] ;
      P00J013_n252CliCod = new boolean[] {false} ;
      P00J013_A65ArtCod = new String[] {""} ;
      P00J013_A596LimUni = new int[1] ;
      P00J013_n596LimUni = new boolean[] {false} ;
      P00J013_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J013_n675PorRec = new boolean[] {false} ;
      P00J013_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      P00J014_A396EmprCod = new String[] {""} ;
      P00J014_A252CliCod = new int[1] ;
      P00J014_n252CliCod = new boolean[] {false} ;
      P00J014_A65ArtCod = new String[] {""} ;
      P00J014_A583IntCod = new byte[1] ;
      P00J014_A831TipColCod = new byte[1] ;
      P00J014_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J014_n586IntPreKgm = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      P00J015_A396EmprCod = new String[] {""} ;
      P00J015_A252CliCod = new int[1] ;
      P00J015_n252CliCod = new boolean[] {false} ;
      P00J015_A65ArtCod = new String[] {""} ;
      P00J015_A2939Limite4 = new short[1] ;
      P00J015_A2937RecIntCod = new byte[1] ;
      P00J015_A2940Precio4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00J015_n2940Precio4 = new boolean[] {false} ;
      A2940Precio4 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptarsab__default(),
         new Object[] {
             new Object[] {
            P00J02_A396EmprCod, P00J02_A3915EmpNumDec, P00J02_n3915EmpNumDec
            }
            , new Object[] {
            P00J04_A132BarCodReo, P00J04_A129BarCod, P00J04_A396EmprCod, P00J04_A130BarCodPar, P00J04_A166BarKgm, P00J04_n166BarKgm
            }
            , new Object[] {
            P00J05_A361DisCod, P00J05_A132BarCodReo, P00J05_A130BarCodPar, P00J05_A129BarCod, P00J05_A396EmprCod, P00J05_A161BarFecSal, P00J05_A252CliCod, P00J05_n252CliCod, P00J05_A212BarSer, P00J05_A135BarColNom,
            P00J05_A136BarColNum, P00J05_A218BarTipCol, P00J05_A3310BarFac, P00J05_A2010BarTipDis, P00J05_A1157TipConCod, P00J05_n1157TipConCod, P00J05_A148BarEstReo, P00J05_A193BarOpeEsp
            }
            , new Object[] {
            }
            , new Object[] {
            P00J07_A831TipColCod, P00J07_A483ForColNum, P00J07_A482ForColNom, P00J07_A494ForSer, P00J07_A252CliCod, P00J07_A396EmprCod, P00J07_A583IntCod, P00J07_A492ForPreKgm, P00J07_n492ForPreKgm
            }
            , new Object[] {
            P00J08_A396EmprCod, P00J08_A252CliCod, P00J08_A494ForSer, P00J08_A482ForColNom, P00J08_A483ForColNum, P00J08_A831TipColCod, P00J08_A1521RecValFin, P00J08_n1521RecValFin, P00J08_A1520RecValIni, P00J08_n1520RecValIni,
            P00J08_A1522RecCanRec, P00J08_n1522RecCanRec, P00J08_A1519RecCorLin
            }
            , new Object[] {
            P00J09_A2929RecLim1, P00J09_A2927RecProCod, P00J09_A252CliCod, P00J09_A396EmprCod, P00J09_A2930RecPre1, P00J09_n2930RecPre1
            }
            , new Object[] {
            P00J010_A2931Limite2, P00J010_A65ArtCod, P00J010_A252CliCod, P00J010_A396EmprCod, P00J010_A2932Precio2, P00J010_n2932Precio2
            }
            , new Object[] {
            P00J011_A2935Limite3, P00J011_A2933RecTipCon, P00J011_A252CliCod, P00J011_A396EmprCod, P00J011_A2936Precio3, P00J011_n2936Precio3
            }
            , new Object[] {
            P00J012_A65ArtCod, P00J012_A252CliCod, P00J012_A396EmprCod, P00J012_A92ArtPreKgm, P00J012_n92ArtPreKgm
            }
            , new Object[] {
            P00J013_A396EmprCod, P00J013_A252CliCod, P00J013_A65ArtCod, P00J013_A596LimUni, P00J013_n596LimUni, P00J013_A675PorRec, P00J013_n675PorRec, P00J013_A598LinRec
            }
            , new Object[] {
            P00J014_A396EmprCod, P00J014_A252CliCod, P00J014_A65ArtCod, P00J014_A583IntCod, P00J014_A831TipColCod, P00J014_A586IntPreKgm, P00J014_n586IntPreKgm
            }
            , new Object[] {
            P00J015_A396EmprCod, P00J015_A252CliCod, P00J015_A65ArtCod, P00J015_A2939Limite4, P00J015_A2937RecIntCod, P00J015_A2940Precio4, P00J015_n2940Precio4
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV21Operesp ;
   private byte A3915EmpNumDec ;
   private byte AV75EmpNumDec ;
   private byte AV77NumPar ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
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
   private int AV16BarCod ;
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
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV62AlbBarRec ;
   private java.math.BigDecimal AV27LimUni ;
   private java.math.BigDecimal AV76BarAlbKgmE ;
   private java.math.BigDecimal AV73PreMinEur ;
   private java.math.BigDecimal A166BarKgm ;
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
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV64ContDsc ;
   private String GXv_char4[] ;
   private String AV71ContDsc6 ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A3310BarFac ;
   private String A2010BarTipDis ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV72BarFac ;
   private String AV44UniMed ;
   private String AV60BarTipDis ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A2927RecProCod ;
   private String A65ArtCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n3915EmpNumDec ;
   private boolean n166BarKgm ;
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
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00J02_A396EmprCod ;
   private byte[] P00J02_A3915EmpNumDec ;
   private boolean[] P00J02_n3915EmpNumDec ;
   private byte[] P00J04_A132BarCodReo ;
   private int[] P00J04_A129BarCod ;
   private String[] P00J04_A396EmprCod ;
   private String[] P00J04_A130BarCodPar ;
   private java.math.BigDecimal[] P00J04_A166BarKgm ;
   private boolean[] P00J04_n166BarKgm ;
   private int[] P00J05_A361DisCod ;
   private byte[] P00J05_A132BarCodReo ;
   private String[] P00J05_A130BarCodPar ;
   private int[] P00J05_A129BarCod ;
   private String[] P00J05_A396EmprCod ;
   private java.util.Date[] P00J05_A161BarFecSal ;
   private int[] P00J05_A252CliCod ;
   private boolean[] P00J05_n252CliCod ;
   private String[] P00J05_A212BarSer ;
   private String[] P00J05_A135BarColNom ;
   private int[] P00J05_A136BarColNum ;
   private byte[] P00J05_A218BarTipCol ;
   private String[] P00J05_A3310BarFac ;
   private String[] P00J05_A2010BarTipDis ;
   private short[] P00J05_A1157TipConCod ;
   private boolean[] P00J05_n1157TipConCod ;
   private byte[] P00J05_A148BarEstReo ;
   private byte[] P00J05_A193BarOpeEsp ;
   private byte[] P00J07_A831TipColCod ;
   private int[] P00J07_A483ForColNum ;
   private String[] P00J07_A482ForColNom ;
   private String[] P00J07_A494ForSer ;
   private int[] P00J07_A252CliCod ;
   private boolean[] P00J07_n252CliCod ;
   private String[] P00J07_A396EmprCod ;
   private byte[] P00J07_A583IntCod ;
   private java.math.BigDecimal[] P00J07_A492ForPreKgm ;
   private boolean[] P00J07_n492ForPreKgm ;
   private String[] P00J08_A396EmprCod ;
   private int[] P00J08_A252CliCod ;
   private boolean[] P00J08_n252CliCod ;
   private String[] P00J08_A494ForSer ;
   private String[] P00J08_A482ForColNom ;
   private int[] P00J08_A483ForColNum ;
   private byte[] P00J08_A831TipColCod ;
   private int[] P00J08_A1521RecValFin ;
   private boolean[] P00J08_n1521RecValFin ;
   private int[] P00J08_A1520RecValIni ;
   private boolean[] P00J08_n1520RecValIni ;
   private java.math.BigDecimal[] P00J08_A1522RecCanRec ;
   private boolean[] P00J08_n1522RecCanRec ;
   private byte[] P00J08_A1519RecCorLin ;
   private short[] P00J09_A2929RecLim1 ;
   private String[] P00J09_A2927RecProCod ;
   private int[] P00J09_A252CliCod ;
   private boolean[] P00J09_n252CliCod ;
   private String[] P00J09_A396EmprCod ;
   private java.math.BigDecimal[] P00J09_A2930RecPre1 ;
   private boolean[] P00J09_n2930RecPre1 ;
   private short[] P00J010_A2931Limite2 ;
   private String[] P00J010_A65ArtCod ;
   private int[] P00J010_A252CliCod ;
   private boolean[] P00J010_n252CliCod ;
   private String[] P00J010_A396EmprCod ;
   private java.math.BigDecimal[] P00J010_A2932Precio2 ;
   private boolean[] P00J010_n2932Precio2 ;
   private short[] P00J011_A2935Limite3 ;
   private short[] P00J011_A2933RecTipCon ;
   private int[] P00J011_A252CliCod ;
   private boolean[] P00J011_n252CliCod ;
   private String[] P00J011_A396EmprCod ;
   private java.math.BigDecimal[] P00J011_A2936Precio3 ;
   private boolean[] P00J011_n2936Precio3 ;
   private String[] P00J012_A65ArtCod ;
   private int[] P00J012_A252CliCod ;
   private boolean[] P00J012_n252CliCod ;
   private String[] P00J012_A396EmprCod ;
   private java.math.BigDecimal[] P00J012_A92ArtPreKgm ;
   private boolean[] P00J012_n92ArtPreKgm ;
   private String[] P00J013_A396EmprCod ;
   private int[] P00J013_A252CliCod ;
   private boolean[] P00J013_n252CliCod ;
   private String[] P00J013_A65ArtCod ;
   private int[] P00J013_A596LimUni ;
   private boolean[] P00J013_n596LimUni ;
   private java.math.BigDecimal[] P00J013_A675PorRec ;
   private boolean[] P00J013_n675PorRec ;
   private byte[] P00J013_A598LinRec ;
   private String[] P00J014_A396EmprCod ;
   private int[] P00J014_A252CliCod ;
   private boolean[] P00J014_n252CliCod ;
   private String[] P00J014_A65ArtCod ;
   private byte[] P00J014_A583IntCod ;
   private byte[] P00J014_A831TipColCod ;
   private java.math.BigDecimal[] P00J014_A586IntPreKgm ;
   private boolean[] P00J014_n586IntPreKgm ;
   private String[] P00J015_A396EmprCod ;
   private int[] P00J015_A252CliCod ;
   private boolean[] P00J015_n252CliCod ;
   private String[] P00J015_A65ArtCod ;
   private short[] P00J015_A2939Limite4 ;
   private byte[] P00J015_A2937RecIntCod ;
   private java.math.BigDecimal[] P00J015_A2940Precio4 ;
   private boolean[] P00J015_n2940Precio4 ;
}

final  class ptarsab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00J02", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J04", "SELECT T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarCodPar, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? ORDER BY T1.EmprCod, T1.BarCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00J05", "SELECT T1.DisCod, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarFac, T1.BarTipDis, T2.TipConCod, T1.BarEstReo, T1.BarOpeEsp FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar  FOR UPDATE OF T1.BarFecSal, T1.BarOpeEsp NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00J06", "UPDATE TXPBARCAD SET BarFecSal=?, BarOpeEsp=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00J07", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreKgm FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J08", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00J09", "SELECT * FROM (SELECT RecLim1, RecProCod, CliCod, EmprCod, RecPre1 FROM TXPRECPRO WHERE EmprCod = ? and CliCod = ? and RecProCod = ? and RecLim1 > ? ORDER BY EmprCod, CliCod, RecProCod, RecLim1) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J010", "SELECT * FROM (SELECT Limite2, ArtCod, CliCod, EmprCod, Precio2 FROM TXPRECARB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Limite2 > ? ORDER BY EmprCod, CliCod, ArtCod, Limite2) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J011", "SELECT * FROM (SELECT Limite3, RecTipCon, CliCod, EmprCod, Precio3 FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? and Limite3 > ? ORDER BY EmprCod, CliCod, RecTipCon, Limite3) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J012", "SELECT ArtCod, CliCod, EmprCod, ArtPreKgm FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J013", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J014", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00J015", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite4, RecIntCod, Precio4 FROM TXPLRBART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and RecIntCod = ? and Limite4 > ? ORDER BY EmprCod, CliCod, ArtCod, RecIntCod, Limite4) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
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

