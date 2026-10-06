package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprettx extends GXProcedure
{
   public pprettx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprettx.class ), "" );
   }

   public pprettx( int remoteHandle ,
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
                                           byte[] aP6 )
   {
      pprettx.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pprettx.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pprettx.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pprettx.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      pprettx.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      pprettx.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      pprettx.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      pprettx.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      pprettx.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV45Flag ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100006", GXv_int1) ;
      pprettx.this.AV45Flag = GXv_int1[0] ;
      AV65FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV65FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pprettx.this.AV65FlagRecCol = GXv_int1[0] ;
      AV70FlagPorCol = (byte)(0) ;
      GXv_int1[0] = AV70FlagPorCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PORCOL", ""), GXv_int1) ;
      pprettx.this.AV70FlagPorCol = GXv_int1[0] ;
      AV19PreKgm = DecimalUtil.ZERO ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV24PreDef = httpContext.getMessage( "S", "") ;
      /* Using cursor P040J3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P040J3_A130BarCodPar[0] ;
         A132BarCodReo = P040J3_A132BarCodReo[0] ;
         A129BarCod = P040J3_A129BarCod[0] ;
         A396EmprCod = P040J3_A396EmprCod[0] ;
         A161BarFecSal = P040J3_A161BarFecSal[0] ;
         A252CliCod = P040J3_A252CliCod[0] ;
         n252CliCod = P040J3_n252CliCod[0] ;
         A212BarSer = P040J3_A212BarSer[0] ;
         A135BarColNom = P040J3_A135BarColNom[0] ;
         A136BarColNum = P040J3_A136BarColNum[0] ;
         A218BarTipCol = P040J3_A218BarTipCol[0] ;
         A2010BarTipDis = P040J3_A2010BarTipDis[0] ;
         A361DisCod = P040J3_A361DisCod[0] ;
         A228BarUniMed = P040J3_A228BarUniMed[0] ;
         A120BarAgrEst = P040J3_A120BarAgrEst[0] ;
         A193BarOpeEsp = P040J3_A193BarOpeEsp[0] ;
         A5253BarAcc = P040J3_A5253BarAcc[0] ;
         A184BarMtr = P040J3_A184BarMtr[0] ;
         A166BarKgm = P040J3_A166BarKgm[0] ;
         A184BarMtr = P040J3_A184BarMtr[0] ;
         A166BarKgm = P040J3_A166BarKgm[0] ;
         A161BarFecSal = Gx_date ;
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV87BarTipDis = A2010BarTipDis ;
         AV74DisCod = A361DisCod ;
         /* Execute user subroutine: 'DISPOS' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
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
         if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( AV71FlagPreAgr == 1 ) )
         {
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
            new app.ppreagr(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_decimal5) ;
            pprettx.this.A396EmprCod = GXv_char2[0] ;
            pprettx.this.A129BarCod = GXv_int3[0] ;
            pprettx.this.A132BarCodReo = GXv_int1[0] ;
            pprettx.this.A130BarCodPar = GXv_char4[0] ;
            pprettx.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal5[0])) ;
         }
         AV48ProCod = "" ;
         /* Using cursor P040J4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A761ProFasLin = P040J4_A761ProFasLin[0] ;
            n761ProFasLin = P040J4_n761ProFasLin[0] ;
            A758ProCod = P040J4_A758ProCod[0] ;
            AV48ProCod = A758ProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV95Pgcol1 == 1 )
         {
            AV21Operesp = (byte)(A193BarOpeEsp+10) ;
            AV19PreKgm = AV93Pg_pk ;
            AV20PreMts = AV94Pg_pm ;
            A161BarFecSal = GXutil.today( ) ;
         }
         else
         {
            if ( AV98Lprepr == 1 )
            {
               AV21Operesp = (byte)(A193BarOpeEsp+10) ;
               AV19PreKgm = AV97Proprekgm ;
               AV20PreMts = AV96ProPremtr ;
               A161BarFecSal = GXutil.today( ) ;
            }
            else
            {
               /* Execute user subroutine: 'LOCFOR' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
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
               if ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV21Operesp = (byte)(10) ;
                  AV19PreKgm = AV83DisPreKgm ;
                  AV20PreMts = AV84DisPreMtr ;
               }
            }
         }
         /* Using cursor P040J5 */
         pr_default.execute(2, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV92IntCodF = (byte)(0) ;
      /* Using cursor P040J6 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = P040J6_A831TipColCod[0] ;
         A483ForColNum = P040J6_A483ForColNum[0] ;
         A482ForColNom = P040J6_A482ForColNom[0] ;
         A494ForSer = P040J6_A494ForSer[0] ;
         A252CliCod = P040J6_A252CliCod[0] ;
         n252CliCod = P040J6_n252CliCod[0] ;
         A396EmprCod = P040J6_A396EmprCod[0] ;
         A5362IntCodF = P040J6_A5362IntCodF[0] ;
         n5362IntCodF = P040J6_n5362IntCodF[0] ;
         AV92IntCodF = A5362IntCodF ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV93Pg_pk = DecimalUtil.doubleToDec(0) ;
      AV94Pg_pm = DecimalUtil.doubleToDec(0) ;
      AV95Pgcol1 = (byte)(0) ;
      /* Using cursor P040J7 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV48ProCod, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10581Pg_Tc = P040J7_A10581Pg_Tc[0] ;
         A10580Pg_ColNum = P040J7_A10580Pg_ColNum[0] ;
         A10579Pg_ColNom = P040J7_A10579Pg_ColNom[0] ;
         A10577Pg_Procod = P040J7_A10577Pg_Procod[0] ;
         A65ArtCod = P040J7_A65ArtCod[0] ;
         A252CliCod = P040J7_A252CliCod[0] ;
         n252CliCod = P040J7_n252CliCod[0] ;
         A396EmprCod = P040J7_A396EmprCod[0] ;
         A10582Pg_Pk = P040J7_A10582Pg_Pk[0] ;
         n10582Pg_Pk = P040J7_n10582Pg_Pk[0] ;
         A10583Pg_Pm = P040J7_A10583Pg_Pm[0] ;
         n10583Pg_Pm = P040J7_n10583Pg_Pm[0] ;
         AV93Pg_pk = A10582Pg_Pk ;
         AV94Pg_pm = A10583Pg_Pm ;
         AV95Pgcol1 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      AV96ProPremtr = DecimalUtil.doubleToDec(0) ;
      AV97Proprekgm = DecimalUtil.doubleToDec(0) ;
      AV98Lprepr = (byte)(0) ;
      /* Using cursor P040J8 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV48ProCod, AV31BarSer, Byte.valueOf(AV92IntCodF)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A583IntCod = P040J8_A583IntCod[0] ;
         A65ArtCod = P040J8_A65ArtCod[0] ;
         A1504CliProCod = P040J8_A1504CliProCod[0] ;
         A252CliCod = P040J8_A252CliCod[0] ;
         n252CliCod = P040J8_n252CliCod[0] ;
         A396EmprCod = P040J8_A396EmprCod[0] ;
         A1464ProPreMtr = P040J8_A1464ProPreMtr[0] ;
         n1464ProPreMtr = P040J8_n1464ProPreMtr[0] ;
         A1465ProPreKgm = P040J8_A1465ProPreKgm[0] ;
         n1465ProPreKgm = P040J8_n1465ProPreKgm[0] ;
         AV96ProPremtr = A1464ProPreMtr ;
         AV97Proprekgm = A1465ProPreKgm ;
         AV98Lprepr = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P040J9 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A831TipColCod = P040J9_A831TipColCod[0] ;
         A483ForColNum = P040J9_A483ForColNum[0] ;
         A482ForColNom = P040J9_A482ForColNom[0] ;
         A494ForSer = P040J9_A494ForSer[0] ;
         A252CliCod = P040J9_A252CliCod[0] ;
         n252CliCod = P040J9_n252CliCod[0] ;
         A396EmprCod = P040J9_A396EmprCod[0] ;
         A583IntCod = P040J9_A583IntCod[0] ;
         A493ForPreMtr = P040J9_A493ForPreMtr[0] ;
         n493ForPreMtr = P040J9_n493ForPreMtr[0] ;
         A492ForPreKgm = P040J9_A492ForPreKgm[0] ;
         n492ForPreKgm = P040J9_n492ForPreKgm[0] ;
         A491ForPreDef = P040J9_A491ForPreDef[0] ;
         n491ForPreDef = P040J9_n491ForPreDef[0] ;
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
         /* Using cursor P040J10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A1521RecValFin = P040J10_A1521RecValFin[0] ;
            n1521RecValFin = P040J10_n1521RecValFin[0] ;
            A1520RecValIni = P040J10_A1520RecValIni[0] ;
            n1520RecValIni = P040J10_n1520RecValIni[0] ;
            A1522RecCanRec = P040J10_A1522RecCanRec[0] ;
            n1522RecCanRec = P040J10_n1522RecCanRec[0] ;
            A1519RecCorLin = P040J10_A1519RecCorLin[0] ;
            if ( ( ( AV27LimUni >= A1520RecValIni ) && ( AV27LimUni <= A1521RecValFin ) ) || ( ( AV27LimUni >= A1520RecValIni ) && (0==A1521RecValFin) ) )
            {
               AV22TotRec = A1522RecCanRec ;
               AV54PorRec = A1522RecCanRec ;
               if ( AV70FlagPorCol == 0 )
               {
                  if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "K", "")) == 0 )
                  {
                     AV19PreKgm = AV22TotRec ;
                  }
                  else
                  {
                     AV20PreMts = AV22TotRec ;
                  }
               }
               else
               {
                  AV22TotRec = DecimalUtil.doubleToDec(0) ;
                  if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                     AV20PreMts = AV20PreMts.add(AV22TotRec) ;
                  }
                  else
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                     AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
                  }
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      if ( AV65FlagRecCol == 1 )
      {
         /* Using cursor P040J11 */
         pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A596LimUni = P040J11_A596LimUni[0] ;
            n596LimUni = P040J11_n596LimUni[0] ;
            A65ArtCod = P040J11_A65ArtCod[0] ;
            A252CliCod = P040J11_A252CliCod[0] ;
            n252CliCod = P040J11_n252CliCod[0] ;
            A396EmprCod = P040J11_A396EmprCod[0] ;
            A675PorRec = P040J11_A675PorRec[0] ;
            n675PorRec = P040J11_n675PorRec[0] ;
            A598LinRec = P040J11_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
         {
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
            }
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) )
      {
         /* Execute user subroutine: 'LOCART' */
         S131 ();
         if (returnInSub) return;
      }
   }

   public void S131( )
   {
      /* 'LOCART' Routine */
      returnInSub = false ;
      /* Using cursor P040J12 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A65ArtCod = P040J12_A65ArtCod[0] ;
         A252CliCod = P040J12_A252CliCod[0] ;
         n252CliCod = P040J12_n252CliCod[0] ;
         A396EmprCod = P040J12_A396EmprCod[0] ;
         A92ArtPreKgm = P040J12_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P040J12_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P040J12_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P040J12_n93ArtPreMtr[0] ;
         A91ArtPreDef = P040J12_A91ArtPreDef[0] ;
         n91ArtPreDef = P040J12_n91ArtPreDef[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         AV20PreMts = A93ArtPreMtr ;
         if ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Using cursor P040J13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A583IntCod = P040J13_A583IntCod[0] ;
            A831TipColCod = P040J13_A831TipColCod[0] ;
            A586IntPreKgm = P040J13_A586IntPreKgm[0] ;
            n586IntPreKgm = P040J13_n586IntPreKgm[0] ;
            A587IntPreMtr = P040J13_A587IntPreMtr[0] ;
            n587IntPreMtr = P040J13_n587IntPreMtr[0] ;
            A585IntPreDef = P040J13_A585IntPreDef[0] ;
            n585IntPreDef = P040J13_n585IntPreDef[0] ;
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
         pr_default.close(10);
         AV80TotRecInt = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P040J14 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A596LimUni = P040J14_A596LimUni[0] ;
            n596LimUni = P040J14_n596LimUni[0] ;
            A675PorRec = P040J14_A675PorRec[0] ;
            n675PorRec = P040J14_n675PorRec[0] ;
            A598LinRec = P040J14_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
         {
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S141( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV83DisPreKgm = DecimalUtil.doubleToDec(0) ;
      AV84DisPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P040J15 */
      pr_default.execute(12, new Object[] {Integer.valueOf(AV74DisCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A361DisCod = P040J15_A361DisCod[0] ;
         A388DisPreKgm = P040J15_A388DisPreKgm[0] ;
         A389DisPreMtr = P040J15_A389DisPreMtr[0] ;
         A396EmprCod = P040J15_A396EmprCod[0] ;
         AV83DisPreKgm = A388DisPreKgm ;
         AV84DisPreMtr = A389DisPreMtr ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprettx.this.AV15EmprCod;
      this.aP1[0] = pprettx.this.AV16BarCod;
      this.aP2[0] = pprettx.this.AV17BarReo;
      this.aP3[0] = pprettx.this.AV18BarPar;
      this.aP4[0] = pprettx.this.AV19PreKgm;
      this.aP5[0] = pprettx.this.AV20PreMts;
      this.aP6[0] = pprettx.this.AV21Operesp;
      this.aP7[0] = pprettx.this.AV22TotRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprettx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24PreDef = "" ;
      scmdbuf = "" ;
      P040J3_A130BarCodPar = new String[] {""} ;
      P040J3_A132BarCodReo = new byte[1] ;
      P040J3_A129BarCod = new int[1] ;
      P040J3_A396EmprCod = new String[] {""} ;
      P040J3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P040J3_A252CliCod = new int[1] ;
      P040J3_n252CliCod = new boolean[] {false} ;
      P040J3_A212BarSer = new String[] {""} ;
      P040J3_A135BarColNom = new String[] {""} ;
      P040J3_A136BarColNum = new int[1] ;
      P040J3_A218BarTipCol = new byte[1] ;
      P040J3_A2010BarTipDis = new String[] {""} ;
      P040J3_A361DisCod = new int[1] ;
      P040J3_A228BarUniMed = new String[] {""} ;
      P040J3_A120BarAgrEst = new String[] {""} ;
      P040J3_A193BarOpeEsp = new byte[1] ;
      P040J3_A5253BarAcc = new String[] {""} ;
      P040J3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      A5253BarAcc = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV87BarTipDis = "" ;
      AV44UniMed = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV48ProCod = "" ;
      P040J4_A396EmprCod = new String[] {""} ;
      P040J4_A129BarCod = new int[1] ;
      P040J4_A132BarCodReo = new byte[1] ;
      P040J4_A130BarCodPar = new String[] {""} ;
      P040J4_A761ProFasLin = new short[1] ;
      P040J4_n761ProFasLin = new boolean[] {false} ;
      P040J4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV93Pg_pk = DecimalUtil.ZERO ;
      AV94Pg_pm = DecimalUtil.ZERO ;
      AV97Proprekgm = DecimalUtil.ZERO ;
      AV96ProPremtr = DecimalUtil.ZERO ;
      AV36Noprecio = "" ;
      AV83DisPreKgm = DecimalUtil.ZERO ;
      AV84DisPreMtr = DecimalUtil.ZERO ;
      P040J6_A831TipColCod = new byte[1] ;
      P040J6_A483ForColNum = new int[1] ;
      P040J6_A482ForColNom = new String[] {""} ;
      P040J6_A494ForSer = new String[] {""} ;
      P040J6_A252CliCod = new int[1] ;
      P040J6_n252CliCod = new boolean[] {false} ;
      P040J6_A396EmprCod = new String[] {""} ;
      P040J6_A5362IntCodF = new byte[1] ;
      P040J6_n5362IntCodF = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P040J7_A10581Pg_Tc = new short[1] ;
      P040J7_A10580Pg_ColNum = new int[1] ;
      P040J7_A10579Pg_ColNom = new String[] {""} ;
      P040J7_A10577Pg_Procod = new String[] {""} ;
      P040J7_A65ArtCod = new String[] {""} ;
      P040J7_A252CliCod = new int[1] ;
      P040J7_n252CliCod = new boolean[] {false} ;
      P040J7_A396EmprCod = new String[] {""} ;
      P040J7_A10582Pg_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J7_n10582Pg_Pk = new boolean[] {false} ;
      P040J7_A10583Pg_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J7_n10583Pg_Pm = new boolean[] {false} ;
      A10579Pg_ColNom = "" ;
      A10577Pg_Procod = "" ;
      A65ArtCod = "" ;
      A10582Pg_Pk = DecimalUtil.ZERO ;
      A10583Pg_Pm = DecimalUtil.ZERO ;
      P040J8_A583IntCod = new byte[1] ;
      P040J8_A65ArtCod = new String[] {""} ;
      P040J8_A1504CliProCod = new String[] {""} ;
      P040J8_A252CliCod = new int[1] ;
      P040J8_n252CliCod = new boolean[] {false} ;
      P040J8_A396EmprCod = new String[] {""} ;
      P040J8_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J8_n1464ProPreMtr = new boolean[] {false} ;
      P040J8_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J8_n1465ProPreKgm = new boolean[] {false} ;
      A1504CliProCod = "" ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
      P040J9_A831TipColCod = new byte[1] ;
      P040J9_A483ForColNum = new int[1] ;
      P040J9_A482ForColNom = new String[] {""} ;
      P040J9_A494ForSer = new String[] {""} ;
      P040J9_A252CliCod = new int[1] ;
      P040J9_n252CliCod = new boolean[] {false} ;
      P040J9_A396EmprCod = new String[] {""} ;
      P040J9_A583IntCod = new byte[1] ;
      P040J9_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J9_n493ForPreMtr = new boolean[] {false} ;
      P040J9_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J9_n492ForPreKgm = new boolean[] {false} ;
      P040J9_A491ForPreDef = new String[] {""} ;
      P040J9_n491ForPreDef = new boolean[] {false} ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P040J10_A396EmprCod = new String[] {""} ;
      P040J10_A252CliCod = new int[1] ;
      P040J10_n252CliCod = new boolean[] {false} ;
      P040J10_A494ForSer = new String[] {""} ;
      P040J10_A482ForColNom = new String[] {""} ;
      P040J10_A483ForColNum = new int[1] ;
      P040J10_A831TipColCod = new byte[1] ;
      P040J10_A1521RecValFin = new int[1] ;
      P040J10_n1521RecValFin = new boolean[] {false} ;
      P040J10_A1520RecValIni = new int[1] ;
      P040J10_n1520RecValIni = new boolean[] {false} ;
      P040J10_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J10_n1522RecCanRec = new boolean[] {false} ;
      P040J10_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      AV54PorRec = DecimalUtil.ZERO ;
      P040J11_A596LimUni = new int[1] ;
      P040J11_n596LimUni = new boolean[] {false} ;
      P040J11_A65ArtCod = new String[] {""} ;
      P040J11_A252CliCod = new int[1] ;
      P040J11_n252CliCod = new boolean[] {false} ;
      P040J11_A396EmprCod = new String[] {""} ;
      P040J11_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J11_n675PorRec = new boolean[] {false} ;
      P040J11_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      P040J12_A65ArtCod = new String[] {""} ;
      P040J12_A252CliCod = new int[1] ;
      P040J12_n252CliCod = new boolean[] {false} ;
      P040J12_A396EmprCod = new String[] {""} ;
      P040J12_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J12_n92ArtPreKgm = new boolean[] {false} ;
      P040J12_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J12_n93ArtPreMtr = new boolean[] {false} ;
      P040J12_A91ArtPreDef = new String[] {""} ;
      P040J12_n91ArtPreDef = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P040J13_A396EmprCod = new String[] {""} ;
      P040J13_A252CliCod = new int[1] ;
      P040J13_n252CliCod = new boolean[] {false} ;
      P040J13_A65ArtCod = new String[] {""} ;
      P040J13_A583IntCod = new byte[1] ;
      P040J13_A831TipColCod = new byte[1] ;
      P040J13_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J13_n586IntPreKgm = new boolean[] {false} ;
      P040J13_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J13_n587IntPreMtr = new boolean[] {false} ;
      P040J13_A585IntPreDef = new String[] {""} ;
      P040J13_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      AV80TotRecInt = DecimalUtil.ZERO ;
      P040J14_A396EmprCod = new String[] {""} ;
      P040J14_A252CliCod = new int[1] ;
      P040J14_n252CliCod = new boolean[] {false} ;
      P040J14_A65ArtCod = new String[] {""} ;
      P040J14_A596LimUni = new int[1] ;
      P040J14_n596LimUni = new boolean[] {false} ;
      P040J14_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J14_n675PorRec = new boolean[] {false} ;
      P040J14_A598LinRec = new byte[1] ;
      P040J15_A361DisCod = new int[1] ;
      P040J15_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J15_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P040J15_A396EmprCod = new String[] {""} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprettx__default(),
         new Object[] {
             new Object[] {
            P040J3_A130BarCodPar, P040J3_A132BarCodReo, P040J3_A129BarCod, P040J3_A396EmprCod, P040J3_A161BarFecSal, P040J3_A252CliCod, P040J3_n252CliCod, P040J3_A212BarSer, P040J3_A135BarColNom, P040J3_A136BarColNum,
            P040J3_A218BarTipCol, P040J3_A2010BarTipDis, P040J3_A361DisCod, P040J3_A228BarUniMed, P040J3_A120BarAgrEst, P040J3_A193BarOpeEsp, P040J3_A5253BarAcc, P040J3_A184BarMtr, P040J3_A166BarKgm
            }
            , new Object[] {
            P040J4_A396EmprCod, P040J4_A129BarCod, P040J4_A132BarCodReo, P040J4_A130BarCodPar, P040J4_A761ProFasLin, P040J4_n761ProFasLin, P040J4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P040J6_A831TipColCod, P040J6_A483ForColNum, P040J6_A482ForColNom, P040J6_A494ForSer, P040J6_A252CliCod, P040J6_A396EmprCod, P040J6_A5362IntCodF, P040J6_n5362IntCodF
            }
            , new Object[] {
            P040J7_A10581Pg_Tc, P040J7_A10580Pg_ColNum, P040J7_A10579Pg_ColNom, P040J7_A10577Pg_Procod, P040J7_A65ArtCod, P040J7_A252CliCod, P040J7_A396EmprCod, P040J7_A10582Pg_Pk, P040J7_n10582Pg_Pk, P040J7_A10583Pg_Pm,
            P040J7_n10583Pg_Pm
            }
            , new Object[] {
            P040J8_A583IntCod, P040J8_A65ArtCod, P040J8_A1504CliProCod, P040J8_A252CliCod, P040J8_A396EmprCod, P040J8_A1464ProPreMtr, P040J8_n1464ProPreMtr, P040J8_A1465ProPreKgm, P040J8_n1465ProPreKgm
            }
            , new Object[] {
            P040J9_A831TipColCod, P040J9_A483ForColNum, P040J9_A482ForColNom, P040J9_A494ForSer, P040J9_A252CliCod, P040J9_A396EmprCod, P040J9_A583IntCod, P040J9_A493ForPreMtr, P040J9_n493ForPreMtr, P040J9_A492ForPreKgm,
            P040J9_n492ForPreKgm, P040J9_A491ForPreDef, P040J9_n491ForPreDef
            }
            , new Object[] {
            P040J10_A396EmprCod, P040J10_A252CliCod, P040J10_A494ForSer, P040J10_A482ForColNom, P040J10_A483ForColNum, P040J10_A831TipColCod, P040J10_A1521RecValFin, P040J10_n1521RecValFin, P040J10_A1520RecValIni, P040J10_n1520RecValIni,
            P040J10_A1522RecCanRec, P040J10_n1522RecCanRec, P040J10_A1519RecCorLin
            }
            , new Object[] {
            P040J11_A596LimUni, P040J11_n596LimUni, P040J11_A65ArtCod, P040J11_A252CliCod, P040J11_A396EmprCod, P040J11_A675PorRec, P040J11_n675PorRec, P040J11_A598LinRec
            }
            , new Object[] {
            P040J12_A65ArtCod, P040J12_A252CliCod, P040J12_A396EmprCod, P040J12_A92ArtPreKgm, P040J12_n92ArtPreKgm, P040J12_A93ArtPreMtr, P040J12_n93ArtPreMtr, P040J12_A91ArtPreDef, P040J12_n91ArtPreDef
            }
            , new Object[] {
            P040J13_A396EmprCod, P040J13_A252CliCod, P040J13_A65ArtCod, P040J13_A583IntCod, P040J13_A831TipColCod, P040J13_A586IntPreKgm, P040J13_n586IntPreKgm, P040J13_A587IntPreMtr, P040J13_n587IntPreMtr, P040J13_A585IntPreDef,
            P040J13_n585IntPreDef
            }
            , new Object[] {
            P040J14_A396EmprCod, P040J14_A252CliCod, P040J14_A65ArtCod, P040J14_A596LimUni, P040J14_n596LimUni, P040J14_A675PorRec, P040J14_n675PorRec, P040J14_A598LinRec
            }
            , new Object[] {
            P040J15_A361DisCod, P040J15_A388DisPreKgm, P040J15_A389DisPreMtr, P040J15_A396EmprCod
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
   private byte AV45Flag ;
   private byte AV65FlagRecCol ;
   private byte AV70FlagPorCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte AV71FlagPreAgr ;
   private byte GXv_int1[] ;
   private byte AV95Pgcol1 ;
   private byte AV98Lprepr ;
   private byte AV92IntCodF ;
   private byte A831TipColCod ;
   private byte A5362IntCodF ;
   private byte A583IntCod ;
   private byte AV25IntCod ;
   private byte A1519RecCorLin ;
   private byte A598LinRec ;
   private short A761ProFasLin ;
   private short A10581Pg_Tc ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV74DisCod ;
   private int AV27LimUni ;
   private int GXv_int3[] ;
   private int A483ForColNum ;
   private int A10580Pg_ColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV93Pg_pk ;
   private java.math.BigDecimal AV94Pg_pm ;
   private java.math.BigDecimal AV97Proprekgm ;
   private java.math.BigDecimal AV96ProPremtr ;
   private java.math.BigDecimal AV83DisPreKgm ;
   private java.math.BigDecimal AV84DisPreMtr ;
   private java.math.BigDecimal A10582Pg_Pk ;
   private java.math.BigDecimal A10583Pg_Pm ;
   private java.math.BigDecimal A1464ProPreMtr ;
   private java.math.BigDecimal A1465ProPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal AV54PorRec ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal AV80TotRecInt ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String A5253BarAcc ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV87BarTipDis ;
   private String AV44UniMed ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV48ProCod ;
   private String A758ProCod ;
   private String AV36Noprecio ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A10579Pg_ColNom ;
   private String A10577Pg_Procod ;
   private String A65ArtCod ;
   private String A1504CliProCod ;
   private String A491ForPreDef ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n5362IntCodF ;
   private boolean n10582Pg_Pk ;
   private boolean n10583Pg_Pm ;
   private boolean n1464ProPreMtr ;
   private boolean n1465ProPreKgm ;
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
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P040J3_A130BarCodPar ;
   private byte[] P040J3_A132BarCodReo ;
   private int[] P040J3_A129BarCod ;
   private String[] P040J3_A396EmprCod ;
   private java.util.Date[] P040J3_A161BarFecSal ;
   private int[] P040J3_A252CliCod ;
   private boolean[] P040J3_n252CliCod ;
   private String[] P040J3_A212BarSer ;
   private String[] P040J3_A135BarColNom ;
   private int[] P040J3_A136BarColNum ;
   private byte[] P040J3_A218BarTipCol ;
   private String[] P040J3_A2010BarTipDis ;
   private int[] P040J3_A361DisCod ;
   private String[] P040J3_A228BarUniMed ;
   private String[] P040J3_A120BarAgrEst ;
   private byte[] P040J3_A193BarOpeEsp ;
   private String[] P040J3_A5253BarAcc ;
   private java.math.BigDecimal[] P040J3_A184BarMtr ;
   private java.math.BigDecimal[] P040J3_A166BarKgm ;
   private String[] P040J4_A396EmprCod ;
   private int[] P040J4_A129BarCod ;
   private byte[] P040J4_A132BarCodReo ;
   private String[] P040J4_A130BarCodPar ;
   private short[] P040J4_A761ProFasLin ;
   private boolean[] P040J4_n761ProFasLin ;
   private String[] P040J4_A758ProCod ;
   private byte[] P040J6_A831TipColCod ;
   private int[] P040J6_A483ForColNum ;
   private String[] P040J6_A482ForColNom ;
   private String[] P040J6_A494ForSer ;
   private int[] P040J6_A252CliCod ;
   private boolean[] P040J6_n252CliCod ;
   private String[] P040J6_A396EmprCod ;
   private byte[] P040J6_A5362IntCodF ;
   private boolean[] P040J6_n5362IntCodF ;
   private short[] P040J7_A10581Pg_Tc ;
   private int[] P040J7_A10580Pg_ColNum ;
   private String[] P040J7_A10579Pg_ColNom ;
   private String[] P040J7_A10577Pg_Procod ;
   private String[] P040J7_A65ArtCod ;
   private int[] P040J7_A252CliCod ;
   private boolean[] P040J7_n252CliCod ;
   private String[] P040J7_A396EmprCod ;
   private java.math.BigDecimal[] P040J7_A10582Pg_Pk ;
   private boolean[] P040J7_n10582Pg_Pk ;
   private java.math.BigDecimal[] P040J7_A10583Pg_Pm ;
   private boolean[] P040J7_n10583Pg_Pm ;
   private byte[] P040J8_A583IntCod ;
   private String[] P040J8_A65ArtCod ;
   private String[] P040J8_A1504CliProCod ;
   private int[] P040J8_A252CliCod ;
   private boolean[] P040J8_n252CliCod ;
   private String[] P040J8_A396EmprCod ;
   private java.math.BigDecimal[] P040J8_A1464ProPreMtr ;
   private boolean[] P040J8_n1464ProPreMtr ;
   private java.math.BigDecimal[] P040J8_A1465ProPreKgm ;
   private boolean[] P040J8_n1465ProPreKgm ;
   private byte[] P040J9_A831TipColCod ;
   private int[] P040J9_A483ForColNum ;
   private String[] P040J9_A482ForColNom ;
   private String[] P040J9_A494ForSer ;
   private int[] P040J9_A252CliCod ;
   private boolean[] P040J9_n252CliCod ;
   private String[] P040J9_A396EmprCod ;
   private byte[] P040J9_A583IntCod ;
   private java.math.BigDecimal[] P040J9_A493ForPreMtr ;
   private boolean[] P040J9_n493ForPreMtr ;
   private java.math.BigDecimal[] P040J9_A492ForPreKgm ;
   private boolean[] P040J9_n492ForPreKgm ;
   private String[] P040J9_A491ForPreDef ;
   private boolean[] P040J9_n491ForPreDef ;
   private String[] P040J10_A396EmprCod ;
   private int[] P040J10_A252CliCod ;
   private boolean[] P040J10_n252CliCod ;
   private String[] P040J10_A494ForSer ;
   private String[] P040J10_A482ForColNom ;
   private int[] P040J10_A483ForColNum ;
   private byte[] P040J10_A831TipColCod ;
   private int[] P040J10_A1521RecValFin ;
   private boolean[] P040J10_n1521RecValFin ;
   private int[] P040J10_A1520RecValIni ;
   private boolean[] P040J10_n1520RecValIni ;
   private java.math.BigDecimal[] P040J10_A1522RecCanRec ;
   private boolean[] P040J10_n1522RecCanRec ;
   private byte[] P040J10_A1519RecCorLin ;
   private int[] P040J11_A596LimUni ;
   private boolean[] P040J11_n596LimUni ;
   private String[] P040J11_A65ArtCod ;
   private int[] P040J11_A252CliCod ;
   private boolean[] P040J11_n252CliCod ;
   private String[] P040J11_A396EmprCod ;
   private java.math.BigDecimal[] P040J11_A675PorRec ;
   private boolean[] P040J11_n675PorRec ;
   private byte[] P040J11_A598LinRec ;
   private String[] P040J12_A65ArtCod ;
   private int[] P040J12_A252CliCod ;
   private boolean[] P040J12_n252CliCod ;
   private String[] P040J12_A396EmprCod ;
   private java.math.BigDecimal[] P040J12_A92ArtPreKgm ;
   private boolean[] P040J12_n92ArtPreKgm ;
   private java.math.BigDecimal[] P040J12_A93ArtPreMtr ;
   private boolean[] P040J12_n93ArtPreMtr ;
   private String[] P040J12_A91ArtPreDef ;
   private boolean[] P040J12_n91ArtPreDef ;
   private String[] P040J13_A396EmprCod ;
   private int[] P040J13_A252CliCod ;
   private boolean[] P040J13_n252CliCod ;
   private String[] P040J13_A65ArtCod ;
   private byte[] P040J13_A583IntCod ;
   private byte[] P040J13_A831TipColCod ;
   private java.math.BigDecimal[] P040J13_A586IntPreKgm ;
   private boolean[] P040J13_n586IntPreKgm ;
   private java.math.BigDecimal[] P040J13_A587IntPreMtr ;
   private boolean[] P040J13_n587IntPreMtr ;
   private String[] P040J13_A585IntPreDef ;
   private boolean[] P040J13_n585IntPreDef ;
   private String[] P040J14_A396EmprCod ;
   private int[] P040J14_A252CliCod ;
   private boolean[] P040J14_n252CliCod ;
   private String[] P040J14_A65ArtCod ;
   private int[] P040J14_A596LimUni ;
   private boolean[] P040J14_n596LimUni ;
   private java.math.BigDecimal[] P040J14_A675PorRec ;
   private boolean[] P040J14_n675PorRec ;
   private byte[] P040J14_A598LinRec ;
   private int[] P040J15_A361DisCod ;
   private java.math.BigDecimal[] P040J15_A388DisPreKgm ;
   private java.math.BigDecimal[] P040J15_A389DisPreMtr ;
   private String[] P040J15_A396EmprCod ;
}

final  class pprettx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P040J3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.DisCod, T1.BarUniMed, T1.BarAgrEst, T1.BarOpeEsp, T1.BarAcc, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P040J5", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P040J6", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCodF FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J7", "SELECT Pg_Tc, Pg_ColNum, Pg_ColNom, Pg_Procod, ArtCod, CliCod, EmprCod, Pg_Pk, Pg_Pm FROM TXPPGCOL1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Pg_Procod = ? and Pg_ColNom = ? and Pg_ColNum = ? and Pg_Tc = ? ORDER BY EmprCod, CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J8", "SELECT IntCod, ArtCod, CliProCod, CliCod, EmprCod, ProPreMtr, ProPreKgm FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J9", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreMtr, ForPreKgm, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J10", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P040J11", "SELECT * FROM (SELECT LimUni, ArtCod, CliCod, EmprCod, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J12", "SELECT ArtCod, CliCod, EmprCod, ArtPreKgm, ArtPreMtr, ArtPreDef FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J13", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J14", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040J15", "SELECT DisCod, DisPreKgm, DisPreMtr, EmprCod FROM TXPDISPOS WHERE DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
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
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 7 :
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
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 10 :
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
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

