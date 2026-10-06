package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspr3 extends GXProcedure
{
   public pbuspr3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspr3.class ), "" );
   }

   public pbuspr3( int remoteHandle ,
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
      pbuspr3.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pbuspr3.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspr3.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbuspr3.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      pbuspr3.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      pbuspr3.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      pbuspr3.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      pbuspr3.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      pbuspr3.this.AV22TotRec = aP7[0];
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
      pbuspr3.this.AV45Flag = GXv_int1[0] ;
      GXv_int1[0] = AV60FlagPer ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      pbuspr3.this.AV60FlagPer = GXv_int1[0] ;
      GXv_int1[0] = AV61FlagTintbo ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTBO", ""), GXv_int1) ;
      pbuspr3.this.AV61FlagTintbo = GXv_int1[0] ;
      GXv_int1[0] = AV67FlagRibes ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RIBES", ""), GXv_int1) ;
      pbuspr3.this.AV67FlagRibes = GXv_int1[0] ;
      GXv_int1[0] = AV64FlagGrabis ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "GRABIS", ""), GXv_int1) ;
      pbuspr3.this.AV64FlagGrabis = GXv_int1[0] ;
      AV65FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV65FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pbuspr3.this.AV65FlagRecCol = GXv_int1[0] ;
      GXv_int1[0] = AV68FlagPrePar ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREPAR", ""), GXv_int1) ;
      pbuspr3.this.AV68FlagPrePar = GXv_int1[0] ;
      GXv_int1[0] = AV71FlagPreAgr ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREAGR", ""), GXv_int1) ;
      pbuspr3.this.AV71FlagPreAgr = GXv_int1[0] ;
      GXv_int1[0] = AV72Finite ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int1) ;
      pbuspr3.this.AV72Finite = GXv_int1[0] ;
      GXv_int1[0] = AV79RecarE ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECESC", ""), GXv_int1) ;
      pbuspr3.this.AV79RecarE = GXv_int1[0] ;
      GXv_int1[0] = AV81Texknit ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEXKNIT", ""), GXv_int1) ;
      pbuspr3.this.AV81Texknit = GXv_int1[0] ;
      AV70FlagPorCol = (byte)(0) ;
      GXv_int1[0] = AV70FlagPorCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PORCOL", ""), GXv_int1) ;
      pbuspr3.this.AV70FlagPorCol = GXv_int1[0] ;
      if ( AV45Flag == 1 )
      {
         GXv_char2[0] = AV15EmprCod ;
         GXv_int3[0] = AV16BarCod ;
         GXv_int1[0] = AV17BarReo ;
         GXv_char4[0] = AV18BarPar ;
         GXv_decimal5[0] = AV19PreKgm ;
         GXv_decimal6[0] = AV20PreMts ;
         GXv_int7[0] = AV21Operesp ;
         GXv_decimal8[0] = AV22TotRec ;
         new app.ptarpro(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8) ;
         pbuspr3.this.AV15EmprCod = GXv_char2[0] ;
         pbuspr3.this.AV16BarCod = GXv_int3[0] ;
         pbuspr3.this.AV17BarReo = GXv_int1[0] ;
         pbuspr3.this.AV18BarPar = GXv_char4[0] ;
         pbuspr3.this.AV19PreKgm = GXv_decimal5[0] ;
         pbuspr3.this.AV20PreMts = GXv_decimal6[0] ;
         pbuspr3.this.AV21Operesp = GXv_int7[0] ;
         pbuspr3.this.AV22TotRec = GXv_decimal8[0] ;
      }
      else
      {
         AV19PreKgm = DecimalUtil.ZERO ;
         AV20PreMts = DecimalUtil.ZERO ;
         AV24PreDef = httpContext.getMessage( "S", "") ;
         /* Using cursor P01AF3 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A132BarCodReo = P01AF3_A132BarCodReo[0] ;
            A130BarCodPar = P01AF3_A130BarCodPar[0] ;
            A129BarCod = P01AF3_A129BarCod[0] ;
            A396EmprCod = P01AF3_A396EmprCod[0] ;
            A161BarFecSal = P01AF3_A161BarFecSal[0] ;
            A252CliCod = P01AF3_A252CliCod[0] ;
            n252CliCod = P01AF3_n252CliCod[0] ;
            A212BarSer = P01AF3_A212BarSer[0] ;
            A135BarColNom = P01AF3_A135BarColNom[0] ;
            A136BarColNum = P01AF3_A136BarColNum[0] ;
            A218BarTipCol = P01AF3_A218BarTipCol[0] ;
            A228BarUniMed = P01AF3_A228BarUniMed[0] ;
            A120BarAgrEst = P01AF3_A120BarAgrEst[0] ;
            A193BarOpeEsp = P01AF3_A193BarOpeEsp[0] ;
            A2010BarTipDis = P01AF3_A2010BarTipDis[0] ;
            A184BarMtr = P01AF3_A184BarMtr[0] ;
            A166BarKgm = P01AF3_A166BarKgm[0] ;
            A184BarMtr = P01AF3_A184BarMtr[0] ;
            A166BarKgm = P01AF3_A166BarKgm[0] ;
            A161BarFecSal = Gx_date ;
            AV35CliCod = A252CliCod ;
            AV31BarSer = A212BarSer ;
            AV32BarColNom = A135BarColNom ;
            AV33BarColNum = A136BarColNum ;
            AV34TipColCod = A218BarTipCol ;
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
               GXv_char4[0] = A396EmprCod ;
               GXv_int3[0] = A129BarCod ;
               GXv_int7[0] = A132BarCodReo ;
               GXv_char2[0] = A130BarCodPar ;
               GXv_decimal8[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
               new app.ppreagr(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int7, GXv_char2, GXv_decimal8) ;
               pbuspr3.this.A396EmprCod = GXv_char4[0] ;
               pbuspr3.this.A129BarCod = GXv_int3[0] ;
               pbuspr3.this.A132BarCodReo = GXv_int7[0] ;
               pbuspr3.this.A130BarCodPar = GXv_char2[0] ;
               pbuspr3.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal8[0])) ;
            }
            if ( AV68FlagPrePar == 1 )
            {
               GXv_char4[0] = AV15EmprCod ;
               GXv_int3[0] = AV16BarCod ;
               GXv_int7[0] = AV17BarReo ;
               GXv_decimal8[0] = AV69TotUni ;
               new app.ptotpar(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int7, GXv_decimal8) ;
               pbuspr3.this.AV15EmprCod = GXv_char4[0] ;
               pbuspr3.this.AV16BarCod = GXv_int3[0] ;
               pbuspr3.this.AV17BarReo = GXv_int7[0] ;
               pbuspr3.this.AV69TotUni = GXv_decimal8[0] ;
               AV27LimUni = (int)(DecimalUtil.decToDouble(AV69TotUni)) ;
            }
            /* Execute user subroutine: 'LOCFOR' */
            S111 ();
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
            if ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "A", "")) == 0 ) && ( AV61FlagTintbo == 1 ) )
            {
               AV21Operesp = (byte)(10) ;
            }
            if ( ( AV67FlagRibes == 1 ) && ( A193BarOpeEsp == 7 ) )
            {
               AV21Operesp = (byte)(10) ;
               AV19PreKgm = DecimalUtil.doubleToDec(0) ;
               AV20PreMts = DecimalUtil.doubleToDec(0) ;
            }
            A161BarFecSal = GXutil.today( ) ;
            /* Using cursor P01AF4 */
            pr_default.execute(1, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P01AF5 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P01AF5_A831TipColCod[0] ;
         A483ForColNum = P01AF5_A483ForColNum[0] ;
         A482ForColNom = P01AF5_A482ForColNom[0] ;
         A494ForSer = P01AF5_A494ForSer[0] ;
         A252CliCod = P01AF5_A252CliCod[0] ;
         n252CliCod = P01AF5_n252CliCod[0] ;
         A396EmprCod = P01AF5_A396EmprCod[0] ;
         A583IntCod = P01AF5_A583IntCod[0] ;
         A493ForPreMtr = P01AF5_A493ForPreMtr[0] ;
         n493ForPreMtr = P01AF5_n493ForPreMtr[0] ;
         A492ForPreKgm = P01AF5_A492ForPreKgm[0] ;
         n492ForPreKgm = P01AF5_n492ForPreKgm[0] ;
         A491ForPreDef = P01AF5_A491ForPreDef[0] ;
         n491ForPreDef = P01AF5_n491ForPreDef[0] ;
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
         /* Using cursor P01AF6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1521RecValFin = P01AF6_A1521RecValFin[0] ;
            n1521RecValFin = P01AF6_n1521RecValFin[0] ;
            A1520RecValIni = P01AF6_A1520RecValIni[0] ;
            n1520RecValIni = P01AF6_n1520RecValIni[0] ;
            A1522RecCanRec = P01AF6_A1522RecCanRec[0] ;
            n1522RecCanRec = P01AF6_n1522RecCanRec[0] ;
            A1519RecCorLin = P01AF6_A1519RecCorLin[0] ;
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
                  if ( AV60FlagPer == 1 )
                  {
                     AV22TotRec = DecimalUtil.ZERO ;
                  }
               }
               else
               {
                  AV22TotRec = DecimalUtil.doubleToDec(0) ;
                  if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
                     AV20PreMts = AV20PreMts.add(AV22TotRec) ;
                  }
                  else
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
                     AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
                  }
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV65FlagRecCol == 1 )
      {
         /* Using cursor P01AF7 */
         pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A596LimUni = P01AF7_A596LimUni[0] ;
            n596LimUni = P01AF7_n596LimUni[0] ;
            A65ArtCod = P01AF7_A65ArtCod[0] ;
            A252CliCod = P01AF7_A252CliCod[0] ;
            n252CliCod = P01AF7_n252CliCod[0] ;
            A396EmprCod = P01AF7_A396EmprCod[0] ;
            A675PorRec = P01AF7_A675PorRec[0] ;
            n675PorRec = P01AF7_n675PorRec[0] ;
            A598LinRec = P01AF7_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
         {
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( AV67FlagRibes == 1 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
               }
               else
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
               }
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               if ( AV67FlagRibes == 1 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
               }
               else
               {
                  AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
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
      /* Using cursor P01AF8 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P01AF8_A65ArtCod[0] ;
         A252CliCod = P01AF8_A252CliCod[0] ;
         n252CliCod = P01AF8_n252CliCod[0] ;
         A396EmprCod = P01AF8_A396EmprCod[0] ;
         A92ArtPreKgm = P01AF8_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P01AF8_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P01AF8_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P01AF8_n93ArtPreMtr[0] ;
         A91ArtPreDef = P01AF8_A91ArtPreDef[0] ;
         n91ArtPreDef = P01AF8_n91ArtPreDef[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         AV20PreMts = A93ArtPreMtr ;
         if ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Using cursor P01AF9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A583IntCod = P01AF9_A583IntCod[0] ;
            A831TipColCod = P01AF9_A831TipColCod[0] ;
            A586IntPreKgm = P01AF9_A586IntPreKgm[0] ;
            n586IntPreKgm = P01AF9_n586IntPreKgm[0] ;
            A587IntPreMtr = P01AF9_A587IntPreMtr[0] ;
            n587IntPreMtr = P01AF9_n587IntPreMtr[0] ;
            A585IntPreDef = P01AF9_A585IntPreDef[0] ;
            n585IntPreDef = P01AF9_n585IntPreDef[0] ;
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
         pr_default.close(6);
         AV80TotRecInt = DecimalUtil.doubleToDec(0) ;
         if ( AV79RecarE == 1 )
         {
            /* Execute user subroutine: 'RECINT' */
            S136 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV20PreMts = AV20PreMts.add(AV80TotRecInt) ;
            }
            else
            {
               AV19PreKgm = AV19PreKgm.add(AV80TotRecInt) ;
            }
         }
         /* Using cursor P01AF10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A596LimUni = P01AF10_A596LimUni[0] ;
            n596LimUni = P01AF10_n596LimUni[0] ;
            A675PorRec = P01AF10_A675PorRec[0] ;
            n675PorRec = P01AF10_n675PorRec[0] ;
            A598LinRec = P01AF10_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            if ( ( AV60FlagPer == 1 ) && ( AV35CliCod == 17 ) )
            {
               AV19PreKgm = AV20PreMts ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
         {
            if ( AV64FlagGrabis == 1 )
            {
               AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
               AV22TotRec = AV22TotRec.add(GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3)) ;
               AV19PreKgm = AV19PreKgm.add(GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3)) ;
            }
            else
            {
               if ( GXutil.strcmp(AV44UniMed, httpContext.getMessage( "M", "")) == 0 )
               {
                  if ( AV67FlagRibes == 1 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
                  }
                  else
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
                  }
                  AV20PreMts = AV20PreMts.add(AV22TotRec) ;
               }
               else
               {
                  if ( AV67FlagRibes == 1 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
                  }
                  else
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
                  }
                  AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S136( )
   {
      /* 'RECINT' Routine */
      returnInSub = false ;
      AV80TotRecInt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01AF11 */
      pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod), Integer.valueOf(AV27LimUni)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4322Limite5 = P01AF11_A4322Limite5[0] ;
         A583IntCod = P01AF11_A583IntCod[0] ;
         A831TipColCod = P01AF11_A831TipColCod[0] ;
         A65ArtCod = P01AF11_A65ArtCod[0] ;
         A252CliCod = P01AF11_A252CliCod[0] ;
         n252CliCod = P01AF11_n252CliCod[0] ;
         A396EmprCod = P01AF11_A396EmprCod[0] ;
         A4323RecIImp = P01AF11_A4323RecIImp[0] ;
         n4323RecIImp = P01AF11_n4323RecIImp[0] ;
         AV80TotRecInt = A4323RecIImp ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspr3.this.AV15EmprCod;
      this.aP1[0] = pbuspr3.this.AV16BarCod;
      this.aP2[0] = pbuspr3.this.AV17BarReo;
      this.aP3[0] = pbuspr3.this.AV18BarPar;
      this.aP4[0] = pbuspr3.this.AV19PreKgm;
      this.aP5[0] = pbuspr3.this.AV20PreMts;
      this.aP6[0] = pbuspr3.this.AV21Operesp;
      this.aP7[0] = pbuspr3.this.AV22TotRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbuspr3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV24PreDef = "" ;
      scmdbuf = "" ;
      P01AF3_A132BarCodReo = new byte[1] ;
      P01AF3_A130BarCodPar = new String[] {""} ;
      P01AF3_A129BarCod = new int[1] ;
      P01AF3_A396EmprCod = new String[] {""} ;
      P01AF3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P01AF3_A252CliCod = new int[1] ;
      P01AF3_n252CliCod = new boolean[] {false} ;
      P01AF3_A212BarSer = new String[] {""} ;
      P01AF3_A135BarColNom = new String[] {""} ;
      P01AF3_A136BarColNum = new int[1] ;
      P01AF3_A218BarTipCol = new byte[1] ;
      P01AF3_A228BarUniMed = new String[] {""} ;
      P01AF3_A120BarAgrEst = new String[] {""} ;
      P01AF3_A193BarOpeEsp = new byte[1] ;
      P01AF3_A2010BarTipDis = new String[] {""} ;
      P01AF3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      A2010BarTipDis = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV44UniMed = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int7 = new byte[1] ;
      AV69TotUni = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV36Noprecio = "" ;
      P01AF5_A831TipColCod = new byte[1] ;
      P01AF5_A483ForColNum = new int[1] ;
      P01AF5_A482ForColNom = new String[] {""} ;
      P01AF5_A494ForSer = new String[] {""} ;
      P01AF5_A252CliCod = new int[1] ;
      P01AF5_n252CliCod = new boolean[] {false} ;
      P01AF5_A396EmprCod = new String[] {""} ;
      P01AF5_A583IntCod = new byte[1] ;
      P01AF5_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF5_n493ForPreMtr = new boolean[] {false} ;
      P01AF5_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF5_n492ForPreKgm = new boolean[] {false} ;
      P01AF5_A491ForPreDef = new String[] {""} ;
      P01AF5_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P01AF6_A396EmprCod = new String[] {""} ;
      P01AF6_A252CliCod = new int[1] ;
      P01AF6_n252CliCod = new boolean[] {false} ;
      P01AF6_A494ForSer = new String[] {""} ;
      P01AF6_A482ForColNom = new String[] {""} ;
      P01AF6_A483ForColNum = new int[1] ;
      P01AF6_A831TipColCod = new byte[1] ;
      P01AF6_A1521RecValFin = new int[1] ;
      P01AF6_n1521RecValFin = new boolean[] {false} ;
      P01AF6_A1520RecValIni = new int[1] ;
      P01AF6_n1520RecValIni = new boolean[] {false} ;
      P01AF6_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF6_n1522RecCanRec = new boolean[] {false} ;
      P01AF6_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      AV54PorRec = DecimalUtil.ZERO ;
      P01AF7_A596LimUni = new int[1] ;
      P01AF7_n596LimUni = new boolean[] {false} ;
      P01AF7_A65ArtCod = new String[] {""} ;
      P01AF7_A252CliCod = new int[1] ;
      P01AF7_n252CliCod = new boolean[] {false} ;
      P01AF7_A396EmprCod = new String[] {""} ;
      P01AF7_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF7_n675PorRec = new boolean[] {false} ;
      P01AF7_A598LinRec = new byte[1] ;
      A65ArtCod = "" ;
      A675PorRec = DecimalUtil.ZERO ;
      P01AF8_A65ArtCod = new String[] {""} ;
      P01AF8_A252CliCod = new int[1] ;
      P01AF8_n252CliCod = new boolean[] {false} ;
      P01AF8_A396EmprCod = new String[] {""} ;
      P01AF8_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF8_n92ArtPreKgm = new boolean[] {false} ;
      P01AF8_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF8_n93ArtPreMtr = new boolean[] {false} ;
      P01AF8_A91ArtPreDef = new String[] {""} ;
      P01AF8_n91ArtPreDef = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P01AF9_A396EmprCod = new String[] {""} ;
      P01AF9_A252CliCod = new int[1] ;
      P01AF9_n252CliCod = new boolean[] {false} ;
      P01AF9_A65ArtCod = new String[] {""} ;
      P01AF9_A583IntCod = new byte[1] ;
      P01AF9_A831TipColCod = new byte[1] ;
      P01AF9_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF9_n586IntPreKgm = new boolean[] {false} ;
      P01AF9_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF9_n587IntPreMtr = new boolean[] {false} ;
      P01AF9_A585IntPreDef = new String[] {""} ;
      P01AF9_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      AV80TotRecInt = DecimalUtil.ZERO ;
      P01AF10_A396EmprCod = new String[] {""} ;
      P01AF10_A252CliCod = new int[1] ;
      P01AF10_n252CliCod = new boolean[] {false} ;
      P01AF10_A65ArtCod = new String[] {""} ;
      P01AF10_A596LimUni = new int[1] ;
      P01AF10_n596LimUni = new boolean[] {false} ;
      P01AF10_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF10_n675PorRec = new boolean[] {false} ;
      P01AF10_A598LinRec = new byte[1] ;
      P01AF11_A4322Limite5 = new short[1] ;
      P01AF11_A583IntCod = new byte[1] ;
      P01AF11_A831TipColCod = new byte[1] ;
      P01AF11_A65ArtCod = new String[] {""} ;
      P01AF11_A252CliCod = new int[1] ;
      P01AF11_n252CliCod = new boolean[] {false} ;
      P01AF11_A396EmprCod = new String[] {""} ;
      P01AF11_A4323RecIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AF11_n4323RecIImp = new boolean[] {false} ;
      A4323RecIImp = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspr3__default(),
         new Object[] {
             new Object[] {
            P01AF3_A132BarCodReo, P01AF3_A130BarCodPar, P01AF3_A129BarCod, P01AF3_A396EmprCod, P01AF3_A161BarFecSal, P01AF3_A252CliCod, P01AF3_n252CliCod, P01AF3_A212BarSer, P01AF3_A135BarColNom, P01AF3_A136BarColNum,
            P01AF3_A218BarTipCol, P01AF3_A228BarUniMed, P01AF3_A120BarAgrEst, P01AF3_A193BarOpeEsp, P01AF3_A2010BarTipDis, P01AF3_A184BarMtr, P01AF3_A166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P01AF5_A831TipColCod, P01AF5_A483ForColNum, P01AF5_A482ForColNom, P01AF5_A494ForSer, P01AF5_A252CliCod, P01AF5_A396EmprCod, P01AF5_A583IntCod, P01AF5_A493ForPreMtr, P01AF5_n493ForPreMtr, P01AF5_A492ForPreKgm,
            P01AF5_n492ForPreKgm, P01AF5_A491ForPreDef, P01AF5_n491ForPreDef
            }
            , new Object[] {
            P01AF6_A396EmprCod, P01AF6_A252CliCod, P01AF6_A494ForSer, P01AF6_A482ForColNom, P01AF6_A483ForColNum, P01AF6_A831TipColCod, P01AF6_A1521RecValFin, P01AF6_n1521RecValFin, P01AF6_A1520RecValIni, P01AF6_n1520RecValIni,
            P01AF6_A1522RecCanRec, P01AF6_n1522RecCanRec, P01AF6_A1519RecCorLin
            }
            , new Object[] {
            P01AF7_A596LimUni, P01AF7_n596LimUni, P01AF7_A65ArtCod, P01AF7_A252CliCod, P01AF7_A396EmprCod, P01AF7_A675PorRec, P01AF7_n675PorRec, P01AF7_A598LinRec
            }
            , new Object[] {
            P01AF8_A65ArtCod, P01AF8_A252CliCod, P01AF8_A396EmprCod, P01AF8_A92ArtPreKgm, P01AF8_n92ArtPreKgm, P01AF8_A93ArtPreMtr, P01AF8_n93ArtPreMtr, P01AF8_A91ArtPreDef, P01AF8_n91ArtPreDef
            }
            , new Object[] {
            P01AF9_A396EmprCod, P01AF9_A252CliCod, P01AF9_A65ArtCod, P01AF9_A583IntCod, P01AF9_A831TipColCod, P01AF9_A586IntPreKgm, P01AF9_n586IntPreKgm, P01AF9_A587IntPreMtr, P01AF9_n587IntPreMtr, P01AF9_A585IntPreDef,
            P01AF9_n585IntPreDef
            }
            , new Object[] {
            P01AF10_A396EmprCod, P01AF10_A252CliCod, P01AF10_A65ArtCod, P01AF10_A596LimUni, P01AF10_n596LimUni, P01AF10_A675PorRec, P01AF10_n675PorRec, P01AF10_A598LinRec
            }
            , new Object[] {
            P01AF11_A4322Limite5, P01AF11_A583IntCod, P01AF11_A831TipColCod, P01AF11_A65ArtCod, P01AF11_A252CliCod, P01AF11_A396EmprCod, P01AF11_A4323RecIImp, P01AF11_n4323RecIImp
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
   private byte AV60FlagPer ;
   private byte AV61FlagTintbo ;
   private byte AV67FlagRibes ;
   private byte AV64FlagGrabis ;
   private byte AV65FlagRecCol ;
   private byte AV68FlagPrePar ;
   private byte AV71FlagPreAgr ;
   private byte AV72Finite ;
   private byte AV79RecarE ;
   private byte AV81Texknit ;
   private byte AV70FlagPorCol ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte GXv_int7[] ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV25IntCod ;
   private byte A1519RecCorLin ;
   private byte A598LinRec ;
   private short A4322Limite5 ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV27LimUni ;
   private int GXv_int3[] ;
   private int A483ForColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV69TotUni ;
   private java.math.BigDecimal GXv_decimal8[] ;
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
   private java.math.BigDecimal A4323RecIImp ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String A2010BarTipDis ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
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
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
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
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P01AF3_A132BarCodReo ;
   private String[] P01AF3_A130BarCodPar ;
   private int[] P01AF3_A129BarCod ;
   private String[] P01AF3_A396EmprCod ;
   private java.util.Date[] P01AF3_A161BarFecSal ;
   private int[] P01AF3_A252CliCod ;
   private boolean[] P01AF3_n252CliCod ;
   private String[] P01AF3_A212BarSer ;
   private String[] P01AF3_A135BarColNom ;
   private int[] P01AF3_A136BarColNum ;
   private byte[] P01AF3_A218BarTipCol ;
   private String[] P01AF3_A228BarUniMed ;
   private String[] P01AF3_A120BarAgrEst ;
   private byte[] P01AF3_A193BarOpeEsp ;
   private String[] P01AF3_A2010BarTipDis ;
   private java.math.BigDecimal[] P01AF3_A184BarMtr ;
   private java.math.BigDecimal[] P01AF3_A166BarKgm ;
   private byte[] P01AF5_A831TipColCod ;
   private int[] P01AF5_A483ForColNum ;
   private String[] P01AF5_A482ForColNom ;
   private String[] P01AF5_A494ForSer ;
   private int[] P01AF5_A252CliCod ;
   private boolean[] P01AF5_n252CliCod ;
   private String[] P01AF5_A396EmprCod ;
   private byte[] P01AF5_A583IntCod ;
   private java.math.BigDecimal[] P01AF5_A493ForPreMtr ;
   private boolean[] P01AF5_n493ForPreMtr ;
   private java.math.BigDecimal[] P01AF5_A492ForPreKgm ;
   private boolean[] P01AF5_n492ForPreKgm ;
   private String[] P01AF5_A491ForPreDef ;
   private boolean[] P01AF5_n491ForPreDef ;
   private String[] P01AF6_A396EmprCod ;
   private int[] P01AF6_A252CliCod ;
   private boolean[] P01AF6_n252CliCod ;
   private String[] P01AF6_A494ForSer ;
   private String[] P01AF6_A482ForColNom ;
   private int[] P01AF6_A483ForColNum ;
   private byte[] P01AF6_A831TipColCod ;
   private int[] P01AF6_A1521RecValFin ;
   private boolean[] P01AF6_n1521RecValFin ;
   private int[] P01AF6_A1520RecValIni ;
   private boolean[] P01AF6_n1520RecValIni ;
   private java.math.BigDecimal[] P01AF6_A1522RecCanRec ;
   private boolean[] P01AF6_n1522RecCanRec ;
   private byte[] P01AF6_A1519RecCorLin ;
   private int[] P01AF7_A596LimUni ;
   private boolean[] P01AF7_n596LimUni ;
   private String[] P01AF7_A65ArtCod ;
   private int[] P01AF7_A252CliCod ;
   private boolean[] P01AF7_n252CliCod ;
   private String[] P01AF7_A396EmprCod ;
   private java.math.BigDecimal[] P01AF7_A675PorRec ;
   private boolean[] P01AF7_n675PorRec ;
   private byte[] P01AF7_A598LinRec ;
   private String[] P01AF8_A65ArtCod ;
   private int[] P01AF8_A252CliCod ;
   private boolean[] P01AF8_n252CliCod ;
   private String[] P01AF8_A396EmprCod ;
   private java.math.BigDecimal[] P01AF8_A92ArtPreKgm ;
   private boolean[] P01AF8_n92ArtPreKgm ;
   private java.math.BigDecimal[] P01AF8_A93ArtPreMtr ;
   private boolean[] P01AF8_n93ArtPreMtr ;
   private String[] P01AF8_A91ArtPreDef ;
   private boolean[] P01AF8_n91ArtPreDef ;
   private String[] P01AF9_A396EmprCod ;
   private int[] P01AF9_A252CliCod ;
   private boolean[] P01AF9_n252CliCod ;
   private String[] P01AF9_A65ArtCod ;
   private byte[] P01AF9_A583IntCod ;
   private byte[] P01AF9_A831TipColCod ;
   private java.math.BigDecimal[] P01AF9_A586IntPreKgm ;
   private boolean[] P01AF9_n586IntPreKgm ;
   private java.math.BigDecimal[] P01AF9_A587IntPreMtr ;
   private boolean[] P01AF9_n587IntPreMtr ;
   private String[] P01AF9_A585IntPreDef ;
   private boolean[] P01AF9_n585IntPreDef ;
   private String[] P01AF10_A396EmprCod ;
   private int[] P01AF10_A252CliCod ;
   private boolean[] P01AF10_n252CliCod ;
   private String[] P01AF10_A65ArtCod ;
   private int[] P01AF10_A596LimUni ;
   private boolean[] P01AF10_n596LimUni ;
   private java.math.BigDecimal[] P01AF10_A675PorRec ;
   private boolean[] P01AF10_n675PorRec ;
   private byte[] P01AF10_A598LinRec ;
   private short[] P01AF11_A4322Limite5 ;
   private byte[] P01AF11_A583IntCod ;
   private byte[] P01AF11_A831TipColCod ;
   private String[] P01AF11_A65ArtCod ;
   private int[] P01AF11_A252CliCod ;
   private boolean[] P01AF11_n252CliCod ;
   private String[] P01AF11_A396EmprCod ;
   private java.math.BigDecimal[] P01AF11_A4323RecIImp ;
   private boolean[] P01AF11_n4323RecIImp ;
}

final  class pbuspr3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AF3", "SELECT T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarUniMed, T1.BarAgrEst, T1.BarOpeEsp, T1.BarTipDis, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01AF4", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P01AF5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreMtr, ForPreKgm, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01AF6", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01AF7", "SELECT * FROM (SELECT LimUni, ArtCod, CliCod, EmprCod, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01AF8", "SELECT ArtCod, CliCod, EmprCod, ArtPreKgm, ArtPreMtr, ArtPreDef FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01AF9", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01AF10", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01AF11", "SELECT * FROM (SELECT Limite5, IntCod, TipColCod, ArtCod, CliCod, EmprCod, RecIImp FROM TXPRecInt WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and Limite5 > ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 5 :
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
            case 6 :
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
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

