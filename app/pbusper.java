package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusper extends GXProcedure
{
   public pbusper( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusper.class ), "" );
   }

   public pbusper( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           int[] aP3 ,
                                           byte[] aP4 ,
                                           String[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           byte[] aP8 )
   {
      pbusper.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pbusper.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusper.this.AV35CliCod = aP1[0];
      this.aP1 = aP1;
      pbusper.this.AV37FasCod = aP2[0];
      this.aP2 = aP2;
      pbusper.this.AV16BarCod = aP3[0];
      this.aP3 = aP3;
      pbusper.this.AV17BarReo = aP4[0];
      this.aP4 = aP4;
      pbusper.this.AV18BarPar = aP5[0];
      this.aP5 = aP5;
      pbusper.this.AV19PreKgm = aP6[0];
      this.aP6 = aP6;
      pbusper.this.AV20PreMts = aP7[0];
      this.aP7 = aP7;
      pbusper.this.AV21Operesp = aP8[0];
      this.aP8 = aP8;
      pbusper.this.AV22TotRec = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV62FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV62FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pbusper.this.AV62FlagRecCol = GXv_int1[0] ;
      AV64FlagPrePar = (byte)(0) ;
      GXv_int1[0] = AV64FlagPrePar ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREPAR", ""), GXv_int1) ;
      pbusper.this.AV64FlagPrePar = GXv_int1[0] ;
      AV67FlagPreAgr = (byte)(0) ;
      GXv_int1[0] = AV67FlagPreAgr ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREAGR", ""), GXv_int1) ;
      pbusper.this.AV67FlagPreAgr = GXv_int1[0] ;
      AV75RecarE = (byte)(0) ;
      GXv_int1[0] = AV75RecarE ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECESC", ""), GXv_int1) ;
      pbusper.this.AV75RecarE = GXv_int1[0] ;
      AV66FlagPorCol = (byte)(0) ;
      GXv_int1[0] = AV66FlagPorCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PORCOL", ""), GXv_int1) ;
      pbusper.this.AV66FlagPorCol = GXv_int1[0] ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_int3[0] = AV35CliCod ;
      GXv_char4[0] = AV79CliCtrl ;
      new app.pclictr(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
      pbusper.this.AV15EmprCod = GXv_char2[0] ;
      pbusper.this.AV35CliCod = GXv_int3[0] ;
      pbusper.this.AV79CliCtrl = GXv_char4[0] ;
      AV19PreKgm = DecimalUtil.ZERO ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV24PreDef = httpContext.getMessage( "S", "") ;
      /* Using cursor P01V22 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar, AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P01V22_A132BarCodReo[0] ;
         A130BarCodPar = P01V22_A130BarCodPar[0] ;
         A129BarCod = P01V22_A129BarCod[0] ;
         A396EmprCod = P01V22_A396EmprCod[0] ;
         A161BarFecSal = P01V22_A161BarFecSal[0] ;
         A212BarSer = P01V22_A212BarSer[0] ;
         A135BarColNom = P01V22_A135BarColNom[0] ;
         A136BarColNum = P01V22_A136BarColNum[0] ;
         A218BarTipCol = P01V22_A218BarTipCol[0] ;
         A1500BarNMtr = P01V22_A1500BarNMtr[0] ;
         A228BarUniMed = P01V22_A228BarUniMed[0] ;
         A120BarAgrEst = P01V22_A120BarAgrEst[0] ;
         A193BarOpeEsp = P01V22_A193BarOpeEsp[0] ;
         /* Using cursor P01V24 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(1) != 101) )
         {
            A184BarMtr = P01V24_A184BarMtr[0] ;
            A166BarKgm = P01V24_A166BarKgm[0] ;
         }
         else
         {
            A184BarMtr = DecimalUtil.doubleToDec(0) ;
            A166BarKgm = DecimalUtil.doubleToDec(0) ;
         }
         A161BarFecSal = Gx_date ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV81BarNMtr = A1500BarNMtr ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A184BarMtr, 0))) ;
            AV44UniMed = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A166BarKgm, 0))) ;
            AV44UniMed = httpContext.getMessage( "K", "") ;
         }
         if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( AV67FlagPreAgr == 1 ) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
            new app.ppreagr(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int1, GXv_char2, GXv_decimal5) ;
            pbusper.this.A396EmprCod = GXv_char4[0] ;
            pbusper.this.A129BarCod = GXv_int3[0] ;
            pbusper.this.A132BarCodReo = GXv_int1[0] ;
            pbusper.this.A130BarCodPar = GXv_char2[0] ;
            pbusper.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal5[0])) ;
         }
         if ( AV64FlagPrePar == 1 )
         {
            GXv_char4[0] = AV15EmprCod ;
            GXv_int3[0] = AV16BarCod ;
            GXv_int1[0] = AV17BarReo ;
            GXv_decimal5[0] = AV65TotUni ;
            new app.ptotpar(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int1, GXv_decimal5) ;
            pbusper.this.AV15EmprCod = GXv_char4[0] ;
            pbusper.this.AV16BarCod = GXv_int3[0] ;
            pbusper.this.AV17BarReo = GXv_int1[0] ;
            pbusper.this.AV65TotUni = GXv_decimal5[0] ;
            AV27LimUni = (int)(DecimalUtil.decToDouble(AV65TotUni)) ;
         }
         /* Execute user subroutine: 'LOCFOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) )
         {
            AV36Noprecio = httpContext.getMessage( "N", "") ;
         }
         else
         {
            AV36Noprecio = httpContext.getMessage( "S", "") ;
         }
         if ( ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) )
         {
            AV21Operesp = (byte)(2) ;
         }
         if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) && ( A193BarOpeEsp == 4 ) )
         {
            AV21Operesp = (byte)(4) ;
         }
         if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( ( A193BarOpeEsp == 1 ) || ( A193BarOpeEsp == 5 ) || ( A193BarOpeEsp == 7 ) )
            {
               AV21Operesp = A193BarOpeEsp ;
            }
            else
            {
               AV21Operesp = (byte)(A193BarOpeEsp+10) ;
            }
         }
         A161BarFecSal = GXutil.today( ) ;
         /* Using cursor P01V25 */
         pr_default.execute(2, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      if ( GXutil.strcmp(AV79CliCtrl, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Execute user subroutine: 'EXTERNOS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19PreKgm = AV19PreKgm.add(AV80PreExtPre) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P01V26 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = P01V26_A831TipColCod[0] ;
         A483ForColNum = P01V26_A483ForColNum[0] ;
         A482ForColNom = P01V26_A482ForColNom[0] ;
         A494ForSer = P01V26_A494ForSer[0] ;
         A252CliCod = P01V26_A252CliCod[0] ;
         A396EmprCod = P01V26_A396EmprCod[0] ;
         A3915EmpNumDec = P01V26_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P01V26_n3915EmpNumDec[0] ;
         A583IntCod = P01V26_A583IntCod[0] ;
         A493ForPreMtr = P01V26_A493ForPreMtr[0] ;
         n493ForPreMtr = P01V26_n493ForPreMtr[0] ;
         A492ForPreKgm = P01V26_A492ForPreKgm[0] ;
         n492ForPreKgm = P01V26_n492ForPreKgm[0] ;
         A491ForPreDef = P01V26_A491ForPreDef[0] ;
         n491ForPreDef = P01V26_n491ForPreDef[0] ;
         A3915EmpNumDec = P01V26_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P01V26_n3915EmpNumDec[0] ;
         AV25IntCod = A583IntCod ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A492ForPreKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A493ForPreMtr)==0) )
         {
            AV19PreKgm = A492ForPreKgm ;
            AV20PreMts = A493ForPreMtr ;
            if ( GXutil.strcmp(A491ForPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Using cursor P01V27 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1521RecValFin = P01V27_A1521RecValFin[0] ;
            n1521RecValFin = P01V27_n1521RecValFin[0] ;
            A1520RecValIni = P01V27_A1520RecValIni[0] ;
            n1520RecValIni = P01V27_n1520RecValIni[0] ;
            A1522RecCanRec = P01V27_A1522RecCanRec[0] ;
            n1522RecCanRec = P01V27_n1522RecCanRec[0] ;
            A1519RecCorLin = P01V27_A1519RecCorLin[0] ;
            if ( ( ( AV27LimUni >= A1520RecValIni ) && ( AV27LimUni <= A1521RecValFin ) ) || ( ( AV27LimUni >= A1520RecValIni ) && (0==A1521RecValFin) ) )
            {
               AV22TotRec = A1522RecCanRec ;
               AV54PorRec = A1522RecCanRec ;
               if ( AV66FlagPorCol == 0 )
               {
                  if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "K", "")) == 0 )
                  {
                     AV19PreKgm = AV22TotRec ;
                  }
                  else
                  {
                     AV20PreMts = AV22TotRec ;
                  }
                  AV22TotRec = DecimalUtil.ZERO ;
               }
               else
               {
                  AV22TotRec = DecimalUtil.doubleToDec(0) ;
                  if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
                     }
                     else
                     {
                        AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                     AV20PreMts = AV20PreMts.add(AV22TotRec) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
                     }
                     else
                     {
                        AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                     AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
                  }
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV62FlagRecCol == 1 )
      {
         /* Using cursor P01V28 */
         pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A596LimUni = P01V28_A596LimUni[0] ;
            n596LimUni = P01V28_n596LimUni[0] ;
            A65ArtCod = P01V28_A65ArtCod[0] ;
            A252CliCod = P01V28_A252CliCod[0] ;
            A396EmprCod = P01V28_A396EmprCod[0] ;
            A675PorRec = P01V28_A675PorRec[0] ;
            n675PorRec = P01V28_n675PorRec[0] ;
            A598LinRec = P01V28_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
         {
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
            }
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) )
      {
         /* Execute user subroutine: 'LOCART' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'LOCART' Routine */
      returnInSub = false ;
      /* Using cursor P01V29 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A65ArtCod = P01V29_A65ArtCod[0] ;
         A252CliCod = P01V29_A252CliCod[0] ;
         A396EmprCod = P01V29_A396EmprCod[0] ;
         A92ArtPreKgm = P01V29_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P01V29_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P01V29_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P01V29_n93ArtPreMtr[0] ;
         A91ArtPreDef = P01V29_A91ArtPreDef[0] ;
         n91ArtPreDef = P01V29_n91ArtPreDef[0] ;
         A3915EmpNumDec = P01V29_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P01V29_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P01V29_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P01V29_n3915EmpNumDec[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         AV20PreMts = A93ArtPreMtr ;
         if ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Using cursor P01V210 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A583IntCod = P01V210_A583IntCod[0] ;
            A831TipColCod = P01V210_A831TipColCod[0] ;
            A586IntPreKgm = P01V210_A586IntPreKgm[0] ;
            n586IntPreKgm = P01V210_n586IntPreKgm[0] ;
            A587IntPreMtr = P01V210_A587IntPreMtr[0] ;
            n587IntPreMtr = P01V210_n587IntPreMtr[0] ;
            A585IntPreDef = P01V210_A585IntPreDef[0] ;
            n585IntPreDef = P01V210_n585IntPreDef[0] ;
            AV19PreKgm = AV19PreKgm.add(A586IntPreKgm) ;
            AV20PreMts = AV20PreMts.add(A587IntPreMtr) ;
            if ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(A585IntPreDef, httpContext.getMessage( "N", "")) == 0 )
               {
                  AV24PreDef = httpContext.getMessage( "N", "") ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         AV76TotRecInt = DecimalUtil.doubleToDec(0) ;
         if ( AV75RecarE == 1 )
         {
            /* Execute user subroutine: 'RECINT' */
            S136 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV20PreMts = AV20PreMts.add(AV76TotRecInt) ;
            }
            else
            {
               AV19PreKgm = AV19PreKgm.add(AV76TotRecInt) ;
            }
         }
         /* Using cursor P01V211 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A596LimUni = P01V211_A596LimUni[0] ;
            n596LimUni = P01V211_n596LimUni[0] ;
            A675PorRec = P01V211_A675PorRec[0] ;
            n675PorRec = P01V211_n675PorRec[0] ;
            A598LinRec = P01V211_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            if ( AV35CliCod == 17 )
            {
               AV19PreKgm = AV20PreMts ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
         {
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
            }
            AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S136( )
   {
      /* 'RECINT' Routine */
      returnInSub = false ;
      AV76TotRecInt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01V212 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod), Integer.valueOf(AV27LimUni)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A4322Limite5 = P01V212_A4322Limite5[0] ;
         A583IntCod = P01V212_A583IntCod[0] ;
         A831TipColCod = P01V212_A831TipColCod[0] ;
         A65ArtCod = P01V212_A65ArtCod[0] ;
         A252CliCod = P01V212_A252CliCod[0] ;
         A396EmprCod = P01V212_A396EmprCod[0] ;
         A4323RecIImp = P01V212_A4323RecIImp[0] ;
         n4323RecIImp = P01V212_n4323RecIImp[0] ;
         AV76TotRecInt = A4323RecIImp ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S141( )
   {
      /* 'EXTERNOS' Routine */
      returnInSub = false ;
      AV80PreExtPre = DecimalUtil.ZERO ;
      AV45FlagExt = (byte)(0) ;
      /* Using cursor P01V213 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV37FasCod, AV31BarSer, AV81BarNMtr});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A2427PreExtNMtr = P01V213_A2427PreExtNMtr[0] ;
         A2740PreExtSer = P01V213_A2740PreExtSer[0] ;
         A457FasCod = P01V213_A457FasCod[0] ;
         A252CliCod = P01V213_A252CliCod[0] ;
         A396EmprCod = P01V213_A396EmprCod[0] ;
         A2428PreExtPre = P01V213_A2428PreExtPre[0] ;
         n2428PreExtPre = P01V213_n2428PreExtPre[0] ;
         AV80PreExtPre = A2428PreExtPre ;
         AV45FlagExt = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      if ( (0==AV45FlagExt) )
      {
         /* Using cursor P01V214 */
         pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV37FasCod, AV81BarNMtr});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A2427PreExtNMtr = P01V214_A2427PreExtNMtr[0] ;
            A2740PreExtSer = P01V214_A2740PreExtSer[0] ;
            A457FasCod = P01V214_A457FasCod[0] ;
            A252CliCod = P01V214_A252CliCod[0] ;
            A396EmprCod = P01V214_A396EmprCod[0] ;
            A2428PreExtPre = P01V214_A2428PreExtPre[0] ;
            n2428PreExtPre = P01V214_n2428PreExtPre[0] ;
            AV45FlagExt = (byte)(1) ;
            AV80PreExtPre = A2428PreExtPre ;
            pr_default.readNext(11);
         }
         pr_default.close(11);
      }
      if ( (0==AV45FlagExt) )
      {
         /* Using cursor P01V215 */
         pr_default.execute(12, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV37FasCod, AV31BarSer});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A2427PreExtNMtr = P01V215_A2427PreExtNMtr[0] ;
            A2740PreExtSer = P01V215_A2740PreExtSer[0] ;
            A457FasCod = P01V215_A457FasCod[0] ;
            A252CliCod = P01V215_A252CliCod[0] ;
            A396EmprCod = P01V215_A396EmprCod[0] ;
            A2428PreExtPre = P01V215_A2428PreExtPre[0] ;
            n2428PreExtPre = P01V215_n2428PreExtPre[0] ;
            AV45FlagExt = (byte)(1) ;
            AV80PreExtPre = A2428PreExtPre ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
      }
      if ( ( AV21Operesp == 0 ) || ( AV21Operesp >= 10 ) )
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80PreExtPre)==0) && (0==AV45FlagExt) )
         {
            AV21Operesp = (byte)(2) ;
         }
         else
         {
            AV21Operesp = (byte)(10) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusper.this.AV15EmprCod;
      this.aP1[0] = pbusper.this.AV35CliCod;
      this.aP2[0] = pbusper.this.AV37FasCod;
      this.aP3[0] = pbusper.this.AV16BarCod;
      this.aP4[0] = pbusper.this.AV17BarReo;
      this.aP5[0] = pbusper.this.AV18BarPar;
      this.aP6[0] = pbusper.this.AV19PreKgm;
      this.aP7[0] = pbusper.this.AV20PreMts;
      this.aP8[0] = pbusper.this.AV21Operesp;
      this.aP9[0] = pbusper.this.AV22TotRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbusper");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV79CliCtrl = "" ;
      AV24PreDef = "" ;
      scmdbuf = "" ;
      P01V22_A132BarCodReo = new byte[1] ;
      P01V22_A130BarCodPar = new String[] {""} ;
      P01V22_A129BarCod = new int[1] ;
      P01V22_A396EmprCod = new String[] {""} ;
      P01V22_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P01V22_A212BarSer = new String[] {""} ;
      P01V22_A135BarColNom = new String[] {""} ;
      P01V22_A136BarColNum = new int[1] ;
      P01V22_A218BarTipCol = new byte[1] ;
      P01V22_A1500BarNMtr = new String[] {""} ;
      P01V22_A228BarUniMed = new String[] {""} ;
      P01V22_A120BarAgrEst = new String[] {""} ;
      P01V22_A193BarOpeEsp = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1500BarNMtr = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      P01V24_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V24_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV81BarNMtr = "" ;
      AV44UniMed = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      AV65TotUni = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV36Noprecio = "" ;
      AV80PreExtPre = DecimalUtil.ZERO ;
      P01V26_A831TipColCod = new byte[1] ;
      P01V26_A483ForColNum = new int[1] ;
      P01V26_A482ForColNom = new String[] {""} ;
      P01V26_A494ForSer = new String[] {""} ;
      P01V26_A252CliCod = new int[1] ;
      P01V26_A396EmprCod = new String[] {""} ;
      P01V26_A3915EmpNumDec = new byte[1] ;
      P01V26_n3915EmpNumDec = new boolean[] {false} ;
      P01V26_A583IntCod = new byte[1] ;
      P01V26_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V26_n493ForPreMtr = new boolean[] {false} ;
      P01V26_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V26_n492ForPreKgm = new boolean[] {false} ;
      P01V26_A491ForPreDef = new String[] {""} ;
      P01V26_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P01V27_A396EmprCod = new String[] {""} ;
      P01V27_A252CliCod = new int[1] ;
      P01V27_A494ForSer = new String[] {""} ;
      P01V27_A482ForColNom = new String[] {""} ;
      P01V27_A483ForColNum = new int[1] ;
      P01V27_A831TipColCod = new byte[1] ;
      P01V27_A1521RecValFin = new int[1] ;
      P01V27_n1521RecValFin = new boolean[] {false} ;
      P01V27_A1520RecValIni = new int[1] ;
      P01V27_n1520RecValIni = new boolean[] {false} ;
      P01V27_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V27_n1522RecCanRec = new boolean[] {false} ;
      P01V27_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      AV54PorRec = DecimalUtil.ZERO ;
      P01V28_A596LimUni = new int[1] ;
      P01V28_n596LimUni = new boolean[] {false} ;
      P01V28_A65ArtCod = new String[] {""} ;
      P01V28_A252CliCod = new int[1] ;
      P01V28_A396EmprCod = new String[] {""} ;
      P01V28_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V28_n675PorRec = new boolean[] {false} ;
      P01V28_A598LinRec = new byte[1] ;
      A65ArtCod = "" ;
      A675PorRec = DecimalUtil.ZERO ;
      P01V29_A65ArtCod = new String[] {""} ;
      P01V29_A252CliCod = new int[1] ;
      P01V29_A396EmprCod = new String[] {""} ;
      P01V29_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V29_n92ArtPreKgm = new boolean[] {false} ;
      P01V29_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V29_n93ArtPreMtr = new boolean[] {false} ;
      P01V29_A91ArtPreDef = new String[] {""} ;
      P01V29_n91ArtPreDef = new boolean[] {false} ;
      P01V29_A3915EmpNumDec = new byte[1] ;
      P01V29_n3915EmpNumDec = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P01V210_A396EmprCod = new String[] {""} ;
      P01V210_A252CliCod = new int[1] ;
      P01V210_A65ArtCod = new String[] {""} ;
      P01V210_A583IntCod = new byte[1] ;
      P01V210_A831TipColCod = new byte[1] ;
      P01V210_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V210_n586IntPreKgm = new boolean[] {false} ;
      P01V210_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V210_n587IntPreMtr = new boolean[] {false} ;
      P01V210_A585IntPreDef = new String[] {""} ;
      P01V210_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      AV76TotRecInt = DecimalUtil.ZERO ;
      P01V211_A396EmprCod = new String[] {""} ;
      P01V211_A252CliCod = new int[1] ;
      P01V211_A65ArtCod = new String[] {""} ;
      P01V211_A596LimUni = new int[1] ;
      P01V211_n596LimUni = new boolean[] {false} ;
      P01V211_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V211_n675PorRec = new boolean[] {false} ;
      P01V211_A598LinRec = new byte[1] ;
      P01V212_A4322Limite5 = new short[1] ;
      P01V212_A583IntCod = new byte[1] ;
      P01V212_A831TipColCod = new byte[1] ;
      P01V212_A65ArtCod = new String[] {""} ;
      P01V212_A252CliCod = new int[1] ;
      P01V212_A396EmprCod = new String[] {""} ;
      P01V212_A4323RecIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V212_n4323RecIImp = new boolean[] {false} ;
      A4323RecIImp = DecimalUtil.ZERO ;
      P01V213_A2427PreExtNMtr = new String[] {""} ;
      P01V213_A2740PreExtSer = new String[] {""} ;
      P01V213_A457FasCod = new String[] {""} ;
      P01V213_A252CliCod = new int[1] ;
      P01V213_A396EmprCod = new String[] {""} ;
      P01V213_A2428PreExtPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V213_n2428PreExtPre = new boolean[] {false} ;
      A2427PreExtNMtr = "" ;
      A2740PreExtSer = "" ;
      A457FasCod = "" ;
      A2428PreExtPre = DecimalUtil.ZERO ;
      P01V214_A2427PreExtNMtr = new String[] {""} ;
      P01V214_A2740PreExtSer = new String[] {""} ;
      P01V214_A457FasCod = new String[] {""} ;
      P01V214_A252CliCod = new int[1] ;
      P01V214_A396EmprCod = new String[] {""} ;
      P01V214_A2428PreExtPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V214_n2428PreExtPre = new boolean[] {false} ;
      P01V215_A2427PreExtNMtr = new String[] {""} ;
      P01V215_A2740PreExtSer = new String[] {""} ;
      P01V215_A457FasCod = new String[] {""} ;
      P01V215_A252CliCod = new int[1] ;
      P01V215_A396EmprCod = new String[] {""} ;
      P01V215_A2428PreExtPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01V215_n2428PreExtPre = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusper__default(),
         new Object[] {
             new Object[] {
            P01V22_A132BarCodReo, P01V22_A130BarCodPar, P01V22_A129BarCod, P01V22_A396EmprCod, P01V22_A161BarFecSal, P01V22_A212BarSer, P01V22_A135BarColNom, P01V22_A136BarColNum, P01V22_A218BarTipCol, P01V22_A1500BarNMtr,
            P01V22_A228BarUniMed, P01V22_A120BarAgrEst, P01V22_A193BarOpeEsp
            }
            , new Object[] {
            P01V24_A184BarMtr, P01V24_A166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P01V26_A831TipColCod, P01V26_A483ForColNum, P01V26_A482ForColNom, P01V26_A494ForSer, P01V26_A252CliCod, P01V26_A396EmprCod, P01V26_A3915EmpNumDec, P01V26_n3915EmpNumDec, P01V26_A583IntCod, P01V26_A493ForPreMtr,
            P01V26_n493ForPreMtr, P01V26_A492ForPreKgm, P01V26_n492ForPreKgm, P01V26_A491ForPreDef, P01V26_n491ForPreDef
            }
            , new Object[] {
            P01V27_A396EmprCod, P01V27_A252CliCod, P01V27_A494ForSer, P01V27_A482ForColNom, P01V27_A483ForColNum, P01V27_A831TipColCod, P01V27_A1521RecValFin, P01V27_n1521RecValFin, P01V27_A1520RecValIni, P01V27_n1520RecValIni,
            P01V27_A1522RecCanRec, P01V27_n1522RecCanRec, P01V27_A1519RecCorLin
            }
            , new Object[] {
            P01V28_A596LimUni, P01V28_n596LimUni, P01V28_A65ArtCod, P01V28_A252CliCod, P01V28_A396EmprCod, P01V28_A675PorRec, P01V28_n675PorRec, P01V28_A598LinRec
            }
            , new Object[] {
            P01V29_A65ArtCod, P01V29_A252CliCod, P01V29_A396EmprCod, P01V29_A92ArtPreKgm, P01V29_n92ArtPreKgm, P01V29_A93ArtPreMtr, P01V29_n93ArtPreMtr, P01V29_A91ArtPreDef, P01V29_n91ArtPreDef, P01V29_A3915EmpNumDec,
            P01V29_n3915EmpNumDec
            }
            , new Object[] {
            P01V210_A396EmprCod, P01V210_A252CliCod, P01V210_A65ArtCod, P01V210_A583IntCod, P01V210_A831TipColCod, P01V210_A586IntPreKgm, P01V210_n586IntPreKgm, P01V210_A587IntPreMtr, P01V210_n587IntPreMtr, P01V210_A585IntPreDef,
            P01V210_n585IntPreDef
            }
            , new Object[] {
            P01V211_A396EmprCod, P01V211_A252CliCod, P01V211_A65ArtCod, P01V211_A596LimUni, P01V211_n596LimUni, P01V211_A675PorRec, P01V211_n675PorRec, P01V211_A598LinRec
            }
            , new Object[] {
            P01V212_A4322Limite5, P01V212_A583IntCod, P01V212_A831TipColCod, P01V212_A65ArtCod, P01V212_A252CliCod, P01V212_A396EmprCod, P01V212_A4323RecIImp, P01V212_n4323RecIImp
            }
            , new Object[] {
            P01V213_A2427PreExtNMtr, P01V213_A2740PreExtSer, P01V213_A457FasCod, P01V213_A252CliCod, P01V213_A396EmprCod, P01V213_A2428PreExtPre, P01V213_n2428PreExtPre
            }
            , new Object[] {
            P01V214_A2427PreExtNMtr, P01V214_A2740PreExtSer, P01V214_A457FasCod, P01V214_A252CliCod, P01V214_A396EmprCod, P01V214_A2428PreExtPre, P01V214_n2428PreExtPre
            }
            , new Object[] {
            P01V215_A2427PreExtNMtr, P01V215_A2740PreExtSer, P01V215_A457FasCod, P01V215_A252CliCod, P01V215_A396EmprCod, P01V215_A2428PreExtPre, P01V215_n2428PreExtPre
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
   private byte AV62FlagRecCol ;
   private byte AV64FlagPrePar ;
   private byte AV67FlagPreAgr ;
   private byte AV75RecarE ;
   private byte AV66FlagPorCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV25IntCod ;
   private byte A1519RecCorLin ;
   private byte A598LinRec ;
   private byte AV45FlagExt ;
   private short A4322Limite5 ;
   private short Gx_err ;
   private int AV35CliCod ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV33BarColNum ;
   private int AV27LimUni ;
   private int GXv_int3[] ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV65TotUni ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV80PreExtPre ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal AV54PorRec ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal AV76TotRecInt ;
   private java.math.BigDecimal A4323RecIImp ;
   private java.math.BigDecimal A2428PreExtPre ;
   private String AV15EmprCod ;
   private String AV37FasCod ;
   private String AV18BarPar ;
   private String AV79CliCtrl ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1500BarNMtr ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV81BarNMtr ;
   private String AV44UniMed ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV36Noprecio ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private String A2427PreExtNMtr ;
   private String A2740PreExtSer ;
   private String A457FasCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n493ForPreMtr ;
   private boolean n492ForPreKgm ;
   private boolean n491ForPreDef ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private boolean n1522RecCanRec ;
   private boolean n596LimUni ;
   private boolean n675PorRec ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n91ArtPreDef ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private boolean n585IntPreDef ;
   private boolean n4323RecIImp ;
   private boolean n2428PreExtPre ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P01V22_A132BarCodReo ;
   private String[] P01V22_A130BarCodPar ;
   private int[] P01V22_A129BarCod ;
   private String[] P01V22_A396EmprCod ;
   private java.util.Date[] P01V22_A161BarFecSal ;
   private String[] P01V22_A212BarSer ;
   private String[] P01V22_A135BarColNom ;
   private int[] P01V22_A136BarColNum ;
   private byte[] P01V22_A218BarTipCol ;
   private String[] P01V22_A1500BarNMtr ;
   private String[] P01V22_A228BarUniMed ;
   private String[] P01V22_A120BarAgrEst ;
   private byte[] P01V22_A193BarOpeEsp ;
   private java.math.BigDecimal[] P01V24_A184BarMtr ;
   private java.math.BigDecimal[] P01V24_A166BarKgm ;
   private byte[] P01V26_A831TipColCod ;
   private int[] P01V26_A483ForColNum ;
   private String[] P01V26_A482ForColNom ;
   private String[] P01V26_A494ForSer ;
   private int[] P01V26_A252CliCod ;
   private String[] P01V26_A396EmprCod ;
   private byte[] P01V26_A3915EmpNumDec ;
   private boolean[] P01V26_n3915EmpNumDec ;
   private byte[] P01V26_A583IntCod ;
   private java.math.BigDecimal[] P01V26_A493ForPreMtr ;
   private boolean[] P01V26_n493ForPreMtr ;
   private java.math.BigDecimal[] P01V26_A492ForPreKgm ;
   private boolean[] P01V26_n492ForPreKgm ;
   private String[] P01V26_A491ForPreDef ;
   private boolean[] P01V26_n491ForPreDef ;
   private String[] P01V27_A396EmprCod ;
   private int[] P01V27_A252CliCod ;
   private String[] P01V27_A494ForSer ;
   private String[] P01V27_A482ForColNom ;
   private int[] P01V27_A483ForColNum ;
   private byte[] P01V27_A831TipColCod ;
   private int[] P01V27_A1521RecValFin ;
   private boolean[] P01V27_n1521RecValFin ;
   private int[] P01V27_A1520RecValIni ;
   private boolean[] P01V27_n1520RecValIni ;
   private java.math.BigDecimal[] P01V27_A1522RecCanRec ;
   private boolean[] P01V27_n1522RecCanRec ;
   private byte[] P01V27_A1519RecCorLin ;
   private int[] P01V28_A596LimUni ;
   private boolean[] P01V28_n596LimUni ;
   private String[] P01V28_A65ArtCod ;
   private int[] P01V28_A252CliCod ;
   private String[] P01V28_A396EmprCod ;
   private java.math.BigDecimal[] P01V28_A675PorRec ;
   private boolean[] P01V28_n675PorRec ;
   private byte[] P01V28_A598LinRec ;
   private String[] P01V29_A65ArtCod ;
   private int[] P01V29_A252CliCod ;
   private String[] P01V29_A396EmprCod ;
   private java.math.BigDecimal[] P01V29_A92ArtPreKgm ;
   private boolean[] P01V29_n92ArtPreKgm ;
   private java.math.BigDecimal[] P01V29_A93ArtPreMtr ;
   private boolean[] P01V29_n93ArtPreMtr ;
   private String[] P01V29_A91ArtPreDef ;
   private boolean[] P01V29_n91ArtPreDef ;
   private byte[] P01V29_A3915EmpNumDec ;
   private boolean[] P01V29_n3915EmpNumDec ;
   private String[] P01V210_A396EmprCod ;
   private int[] P01V210_A252CliCod ;
   private String[] P01V210_A65ArtCod ;
   private byte[] P01V210_A583IntCod ;
   private byte[] P01V210_A831TipColCod ;
   private java.math.BigDecimal[] P01V210_A586IntPreKgm ;
   private boolean[] P01V210_n586IntPreKgm ;
   private java.math.BigDecimal[] P01V210_A587IntPreMtr ;
   private boolean[] P01V210_n587IntPreMtr ;
   private String[] P01V210_A585IntPreDef ;
   private boolean[] P01V210_n585IntPreDef ;
   private String[] P01V211_A396EmprCod ;
   private int[] P01V211_A252CliCod ;
   private String[] P01V211_A65ArtCod ;
   private int[] P01V211_A596LimUni ;
   private boolean[] P01V211_n596LimUni ;
   private java.math.BigDecimal[] P01V211_A675PorRec ;
   private boolean[] P01V211_n675PorRec ;
   private byte[] P01V211_A598LinRec ;
   private short[] P01V212_A4322Limite5 ;
   private byte[] P01V212_A583IntCod ;
   private byte[] P01V212_A831TipColCod ;
   private String[] P01V212_A65ArtCod ;
   private int[] P01V212_A252CliCod ;
   private String[] P01V212_A396EmprCod ;
   private java.math.BigDecimal[] P01V212_A4323RecIImp ;
   private boolean[] P01V212_n4323RecIImp ;
   private String[] P01V213_A2427PreExtNMtr ;
   private String[] P01V213_A2740PreExtSer ;
   private String[] P01V213_A457FasCod ;
   private int[] P01V213_A252CliCod ;
   private String[] P01V213_A396EmprCod ;
   private java.math.BigDecimal[] P01V213_A2428PreExtPre ;
   private boolean[] P01V213_n2428PreExtPre ;
   private String[] P01V214_A2427PreExtNMtr ;
   private String[] P01V214_A2740PreExtSer ;
   private String[] P01V214_A457FasCod ;
   private int[] P01V214_A252CliCod ;
   private String[] P01V214_A396EmprCod ;
   private java.math.BigDecimal[] P01V214_A2428PreExtPre ;
   private boolean[] P01V214_n2428PreExtPre ;
   private String[] P01V215_A2427PreExtNMtr ;
   private String[] P01V215_A2740PreExtSer ;
   private String[] P01V215_A457FasCod ;
   private int[] P01V215_A252CliCod ;
   private String[] P01V215_A396EmprCod ;
   private java.math.BigDecimal[] P01V215_A2428PreExtPre ;
   private boolean[] P01V215_n2428PreExtPre ;
}

final  class pbusper__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01V22", "SELECT BarCodReo, BarCodPar, BarCod, EmprCod, BarFecSal, BarSer, BarColNom, BarColNum, BarTipCol, BarNMtr, BarUniMed, BarAgrEst, BarOpeEsp FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarFecSal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V24", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01V25", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P01V26", "SELECT T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T2.EmpNumDec, T1.IntCod, T1.ForPreMtr, T1.ForPreKgm, T1.ForPreDef FROM (TXPCFORMU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V27", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01V28", "SELECT * FROM (SELECT LimUni, ArtCod, CliCod, EmprCod, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V29", "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtPreKgm, T1.ArtPreMtr, T1.ArtPreDef, T2.EmpNumDec FROM (TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V210", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V211", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V212", "SELECT * FROM (SELECT Limite5, IntCod, TipColCod, ArtCod, CliCod, EmprCod, RecIImp FROM TXPRecInt WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and Limite5 > ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V213", "SELECT PreExtNMtr, PreExtSer, FasCod, CliCod, EmprCod, PreExtPre FROM TXPPREEXT WHERE EmprCod = ? and CliCod = ? and FasCod = ? and PreExtSer = ? and PreExtNMtr = ? ORDER BY EmprCod, CliCod, FasCod, PreExtSer, PreExtNMtr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01V214", "SELECT PreExtNMtr, PreExtSer, FasCod, CliCod, EmprCod, PreExtPre FROM TXPPREEXT WHERE (EmprCod = ? and CliCod = ? and FasCod = ?) AND ((rtrim(PreExtSer) IS NULL AND NOT(PreExtSer IS NULL))) AND (PreExtNMtr = ?) ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01V215", "SELECT PreExtNMtr, PreExtSer, FasCod, CliCod, EmprCod, PreExtPre FROM TXPPREEXT WHERE (EmprCod = ? and CliCod = ? and FasCod = ? and PreExtSer = ?) AND ((rtrim(PreExtNMtr) IS NULL AND NOT(PreExtNMtr IS NULL))) ORDER BY EmprCod, CliCod, FasCod, PreExtSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 4 :
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
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
      }
   }

}

