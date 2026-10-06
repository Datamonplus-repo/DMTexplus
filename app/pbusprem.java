package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprem extends GXProcedure
{
   public pbusprem( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprem.class ), "" );
   }

   public pbusprem( int remoteHandle ,
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
      pbusprem.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pbusprem.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprem.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbusprem.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      pbusprem.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      pbusprem.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      pbusprem.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      pbusprem.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      pbusprem.this.AV22TotRec = aP7[0];
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
      pbusprem.this.AV45Flag = GXv_int1[0] ;
      GXv_int1[0] = AV60FlagPer ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      pbusprem.this.AV60FlagPer = GXv_int1[0] ;
      GXv_int1[0] = AV61FlagTintbo ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTBO", ""), GXv_int1) ;
      pbusprem.this.AV61FlagTintbo = GXv_int1[0] ;
      GXv_int1[0] = AV67FlagRibes ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RIBES", ""), GXv_int1) ;
      pbusprem.this.AV67FlagRibes = GXv_int1[0] ;
      GXv_int1[0] = AV64FlagGrabis ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "GRABIS", ""), GXv_int1) ;
      pbusprem.this.AV64FlagGrabis = GXv_int1[0] ;
      AV65FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV65FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pbusprem.this.AV65FlagRecCol = GXv_int1[0] ;
      GXv_int1[0] = AV68FlagPrePar ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREPAR", ""), GXv_int1) ;
      pbusprem.this.AV68FlagPrePar = GXv_int1[0] ;
      GXv_int1[0] = AV71FlagPreAgr ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREAGR", ""), GXv_int1) ;
      pbusprem.this.AV71FlagPreAgr = GXv_int1[0] ;
      GXv_int1[0] = AV72Finite ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int1) ;
      pbusprem.this.AV72Finite = GXv_int1[0] ;
      GXv_int1[0] = AV79RecarE ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECESC", ""), GXv_int1) ;
      pbusprem.this.AV79RecarE = GXv_int1[0] ;
      GXv_int1[0] = AV81Texknit ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int1) ;
      pbusprem.this.AV81Texknit = GXv_int1[0] ;
      GXv_int1[0] = AV82BusPr3 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BUSPR3", ""), GXv_int1) ;
      pbusprem.this.AV82BusPr3 = GXv_int1[0] ;
      GXv_int1[0] = AV85FlagSala ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int1) ;
      pbusprem.this.AV85FlagSala = GXv_int1[0] ;
      GXv_int1[0] = AV86PLinea ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pbusprem.this.AV86PLinea = GXv_int1[0] ;
      GXt_int2 = AV89Tintutex ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int1) ;
      pbusprem.this.GXt_int2 = GXv_int1[0] ;
      AV89Tintutex = GXt_int2 ;
      GXt_int2 = AV90Tas ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TAS", ""), GXv_int1) ;
      pbusprem.this.GXt_int2 = GXv_int1[0] ;
      AV90Tas = GXt_int2 ;
      AV70FlagPorCol = (byte)(0) ;
      GXv_int1[0] = AV70FlagPorCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PORCOL", ""), GXv_int1) ;
      pbusprem.this.AV70FlagPorCol = GXv_int1[0] ;
      if ( AV82BusPr3 == 1 )
      {
         GXv_char3[0] = AV15EmprCod ;
         GXv_int4[0] = AV16BarCod ;
         GXv_int1[0] = AV17BarReo ;
         GXv_char5[0] = AV18BarPar ;
         GXv_decimal6[0] = AV19PreKgm ;
         GXv_decimal7[0] = AV20PreMts ;
         GXv_int8[0] = AV21Operesp ;
         GXv_decimal9[0] = AV22TotRec ;
         new app.pbuspr3(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int1, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_decimal9) ;
         pbusprem.this.AV15EmprCod = GXv_char3[0] ;
         pbusprem.this.AV16BarCod = GXv_int4[0] ;
         pbusprem.this.AV17BarReo = GXv_int1[0] ;
         pbusprem.this.AV18BarPar = GXv_char5[0] ;
         pbusprem.this.AV19PreKgm = GXv_decimal6[0] ;
         pbusprem.this.AV20PreMts = GXv_decimal7[0] ;
         pbusprem.this.AV21Operesp = GXv_int8[0] ;
         pbusprem.this.AV22TotRec = GXv_decimal9[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV45Flag == 1 )
      {
         GXv_char5[0] = AV15EmprCod ;
         GXv_int4[0] = AV16BarCod ;
         GXv_int8[0] = AV17BarReo ;
         GXv_char3[0] = AV18BarPar ;
         GXv_decimal9[0] = AV19PreKgm ;
         GXv_decimal7[0] = AV20PreMts ;
         GXv_int1[0] = AV21Operesp ;
         GXv_decimal6[0] = AV22TotRec ;
         new app.ptarpro(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_int8, GXv_char3, GXv_decimal9, GXv_decimal7, GXv_int1, GXv_decimal6) ;
         pbusprem.this.AV15EmprCod = GXv_char5[0] ;
         pbusprem.this.AV16BarCod = GXv_int4[0] ;
         pbusprem.this.AV17BarReo = GXv_int8[0] ;
         pbusprem.this.AV18BarPar = GXv_char3[0] ;
         pbusprem.this.AV19PreKgm = GXv_decimal9[0] ;
         pbusprem.this.AV20PreMts = GXv_decimal7[0] ;
         pbusprem.this.AV21Operesp = GXv_int1[0] ;
         pbusprem.this.AV22TotRec = GXv_decimal6[0] ;
      }
      else
      {
         AV19PreKgm = DecimalUtil.ZERO ;
         AV20PreMts = DecimalUtil.ZERO ;
         AV24PreDef = httpContext.getMessage( "S", "") ;
         /* Using cursor P02XP2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar, AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A132BarCodReo = P02XP2_A132BarCodReo[0] ;
            A130BarCodPar = P02XP2_A130BarCodPar[0] ;
            A129BarCod = P02XP2_A129BarCod[0] ;
            A396EmprCod = P02XP2_A396EmprCod[0] ;
            A161BarFecSal = P02XP2_A161BarFecSal[0] ;
            A252CliCod = P02XP2_A252CliCod[0] ;
            n252CliCod = P02XP2_n252CliCod[0] ;
            A212BarSer = P02XP2_A212BarSer[0] ;
            A135BarColNom = P02XP2_A135BarColNom[0] ;
            A136BarColNum = P02XP2_A136BarColNum[0] ;
            A218BarTipCol = P02XP2_A218BarTipCol[0] ;
            A2010BarTipDis = P02XP2_A2010BarTipDis[0] ;
            A361DisCod = P02XP2_A361DisCod[0] ;
            A228BarUniMed = P02XP2_A228BarUniMed[0] ;
            A120BarAgrEst = P02XP2_A120BarAgrEst[0] ;
            A193BarOpeEsp = P02XP2_A193BarOpeEsp[0] ;
            A148BarEstReo = P02XP2_A148BarEstReo[0] ;
            A5253BarAcc = P02XP2_A5253BarAcc[0] ;
            /* Using cursor P02XP4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            if ( (pr_default.getStatus(1) != 101) )
            {
               A184BarMtr = P02XP4_A184BarMtr[0] ;
               A166BarKgm = P02XP4_A166BarKgm[0] ;
            }
            else
            {
               A184BarMtr = DecimalUtil.doubleToDec(0) ;
               A166BarKgm = DecimalUtil.doubleToDec(0) ;
            }
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
               pr_default.close(1);
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
               GXv_char5[0] = A396EmprCod ;
               GXv_int4[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_decimal9[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
               new app.ppreagr(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_int8, GXv_char3, GXv_decimal9) ;
               pbusprem.this.A396EmprCod = GXv_char5[0] ;
               pbusprem.this.A129BarCod = GXv_int4[0] ;
               pbusprem.this.A132BarCodReo = GXv_int8[0] ;
               pbusprem.this.A130BarCodPar = GXv_char3[0] ;
               pbusprem.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
            }
            if ( AV68FlagPrePar == 1 )
            {
               GXv_char5[0] = AV15EmprCod ;
               GXv_int4[0] = AV16BarCod ;
               GXv_int8[0] = AV17BarReo ;
               GXv_decimal9[0] = AV69TotUni ;
               new app.ptotpar(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_int8, GXv_decimal9) ;
               pbusprem.this.AV15EmprCod = GXv_char5[0] ;
               pbusprem.this.AV16BarCod = GXv_int4[0] ;
               pbusprem.this.AV17BarReo = GXv_int8[0] ;
               pbusprem.this.AV69TotUni = GXv_decimal9[0] ;
               AV27LimUni = (int)(DecimalUtil.decToDouble(AV69TotUni)) ;
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
            if ( ( AV89Tintutex == 1 ) && ( A148BarEstReo == 1 ) && ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV21Operesp = (byte)(A193BarOpeEsp+10) ;
            }
            if ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 )
            {
               AV21Operesp = (byte)(10) ;
               AV19PreKgm = AV83DisPreKgm ;
               AV20PreMts = AV84DisPreMtr ;
            }
            /* Using cursor P02XP5 */
            pr_default.execute(2, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(1);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P02XP6 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = P02XP6_A831TipColCod[0] ;
         A483ForColNum = P02XP6_A483ForColNum[0] ;
         A482ForColNom = P02XP6_A482ForColNom[0] ;
         A494ForSer = P02XP6_A494ForSer[0] ;
         A252CliCod = P02XP6_A252CliCod[0] ;
         n252CliCod = P02XP6_n252CliCod[0] ;
         A396EmprCod = P02XP6_A396EmprCod[0] ;
         A3915EmpNumDec = P02XP6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02XP6_n3915EmpNumDec[0] ;
         A583IntCod = P02XP6_A583IntCod[0] ;
         A493ForPreMtr = P02XP6_A493ForPreMtr[0] ;
         n493ForPreMtr = P02XP6_n493ForPreMtr[0] ;
         A492ForPreKgm = P02XP6_A492ForPreKgm[0] ;
         n492ForPreKgm = P02XP6_n492ForPreKgm[0] ;
         A491ForPreDef = P02XP6_A491ForPreDef[0] ;
         n491ForPreDef = P02XP6_n491ForPreDef[0] ;
         A3915EmpNumDec = P02XP6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02XP6_n3915EmpNumDec[0] ;
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
         /* Using cursor P02XP7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1521RecValFin = P02XP7_A1521RecValFin[0] ;
            n1521RecValFin = P02XP7_n1521RecValFin[0] ;
            A1520RecValIni = P02XP7_A1520RecValIni[0] ;
            n1520RecValIni = P02XP7_n1520RecValIni[0] ;
            A1522RecCanRec = P02XP7_A1522RecCanRec[0] ;
            n1522RecCanRec = P02XP7_n1522RecCanRec[0] ;
            A1519RecCorLin = P02XP7_A1519RecCorLin[0] ;
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
      if ( AV65FlagRecCol == 1 )
      {
         /* Using cursor P02XP8 */
         pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A596LimUni = P02XP8_A596LimUni[0] ;
            n596LimUni = P02XP8_n596LimUni[0] ;
            A65ArtCod = P02XP8_A65ArtCod[0] ;
            A252CliCod = P02XP8_A252CliCod[0] ;
            n252CliCod = P02XP8_n252CliCod[0] ;
            A396EmprCod = P02XP8_A396EmprCod[0] ;
            A675PorRec = P02XP8_A675PorRec[0] ;
            n675PorRec = P02XP8_n675PorRec[0] ;
            A598LinRec = P02XP8_A598LinRec[0] ;
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
               if ( AV67FlagRibes == 1 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 3) ;
               }
               else
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
      /* Using cursor P02XP9 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A65ArtCod = P02XP9_A65ArtCod[0] ;
         A252CliCod = P02XP9_A252CliCod[0] ;
         n252CliCod = P02XP9_n252CliCod[0] ;
         A396EmprCod = P02XP9_A396EmprCod[0] ;
         A92ArtPreKgm = P02XP9_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P02XP9_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P02XP9_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P02XP9_n93ArtPreMtr[0] ;
         A91ArtPreDef = P02XP9_A91ArtPreDef[0] ;
         n91ArtPreDef = P02XP9_n91ArtPreDef[0] ;
         A3915EmpNumDec = P02XP9_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02XP9_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P02XP9_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02XP9_n3915EmpNumDec[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         AV20PreMts = A93ArtPreMtr ;
         if ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Using cursor P02XP10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A583IntCod = P02XP10_A583IntCod[0] ;
            A831TipColCod = P02XP10_A831TipColCod[0] ;
            A586IntPreKgm = P02XP10_A586IntPreKgm[0] ;
            n586IntPreKgm = P02XP10_n586IntPreKgm[0] ;
            A587IntPreMtr = P02XP10_A587IntPreMtr[0] ;
            n587IntPreMtr = P02XP10_n587IntPreMtr[0] ;
            A585IntPreDef = P02XP10_A585IntPreDef[0] ;
            n585IntPreDef = P02XP10_n585IntPreDef[0] ;
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
         AV80TotRecInt = DecimalUtil.doubleToDec(0) ;
         if ( AV79RecarE == 1 )
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
               AV20PreMts = AV20PreMts.add(AV80TotRecInt) ;
            }
            else
            {
               AV19PreKgm = AV19PreKgm.add(AV80TotRecInt) ;
            }
         }
         /* Using cursor P02XP11 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(AV27LimUni)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A596LimUni = P02XP11_A596LimUni[0] ;
            n596LimUni = P02XP11_n596LimUni[0] ;
            A675PorRec = P02XP11_A675PorRec[0] ;
            n675PorRec = P02XP11_n675PorRec[0] ;
            A598LinRec = P02XP11_A598LinRec[0] ;
            AV54PorRec = A675PorRec ;
            if ( ( AV60FlagPer == 1 ) && ( AV35CliCod == 17 ) )
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
            if ( AV64FlagGrabis == 1 )
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
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = AV22TotRec.add(GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0)) ;
                  AV19PreKgm = AV19PreKgm.add(GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0)) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = AV22TotRec.add(GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2)) ;
                     AV19PreKgm = AV19PreKgm.add(GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2)) ;
                  }
               }
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
            }
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
      AV80TotRecInt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02XP12 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod), Integer.valueOf(AV27LimUni)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A4322Limite5 = P02XP12_A4322Limite5[0] ;
         A583IntCod = P02XP12_A583IntCod[0] ;
         A831TipColCod = P02XP12_A831TipColCod[0] ;
         A65ArtCod = P02XP12_A65ArtCod[0] ;
         A252CliCod = P02XP12_A252CliCod[0] ;
         n252CliCod = P02XP12_n252CliCod[0] ;
         A396EmprCod = P02XP12_A396EmprCod[0] ;
         A4323RecIImp = P02XP12_A4323RecIImp[0] ;
         n4323RecIImp = P02XP12_n4323RecIImp[0] ;
         AV80TotRecInt = A4323RecIImp ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S141( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV83DisPreKgm = DecimalUtil.doubleToDec(0) ;
      AV84DisPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02XP13 */
      pr_default.execute(10, new Object[] {Integer.valueOf(AV74DisCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A361DisCod = P02XP13_A361DisCod[0] ;
         A388DisPreKgm = P02XP13_A388DisPreKgm[0] ;
         A389DisPreMtr = P02XP13_A389DisPreMtr[0] ;
         A396EmprCod = P02XP13_A396EmprCod[0] ;
         AV83DisPreKgm = A388DisPreKgm ;
         AV84DisPreMtr = A389DisPreMtr ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprem.this.AV15EmprCod;
      this.aP1[0] = pbusprem.this.AV16BarCod;
      this.aP2[0] = pbusprem.this.AV17BarReo;
      this.aP3[0] = pbusprem.this.AV18BarPar;
      this.aP4[0] = pbusprem.this.AV19PreKgm;
      this.aP5[0] = pbusprem.this.AV20PreMts;
      this.aP6[0] = pbusprem.this.AV21Operesp;
      this.aP7[0] = pbusprem.this.AV22TotRec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV24PreDef = "" ;
      scmdbuf = "" ;
      P02XP2_A132BarCodReo = new byte[1] ;
      P02XP2_A130BarCodPar = new String[] {""} ;
      P02XP2_A129BarCod = new int[1] ;
      P02XP2_A396EmprCod = new String[] {""} ;
      P02XP2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P02XP2_A252CliCod = new int[1] ;
      P02XP2_n252CliCod = new boolean[] {false} ;
      P02XP2_A212BarSer = new String[] {""} ;
      P02XP2_A135BarColNom = new String[] {""} ;
      P02XP2_A136BarColNum = new int[1] ;
      P02XP2_A218BarTipCol = new byte[1] ;
      P02XP2_A2010BarTipDis = new String[] {""} ;
      P02XP2_A361DisCod = new int[1] ;
      P02XP2_A228BarUniMed = new String[] {""} ;
      P02XP2_A120BarAgrEst = new String[] {""} ;
      P02XP2_A193BarOpeEsp = new byte[1] ;
      P02XP2_A148BarEstReo = new byte[1] ;
      P02XP2_A5253BarAcc = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      A5253BarAcc = "" ;
      P02XP4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV87BarTipDis = "" ;
      AV44UniMed = "" ;
      GXv_char3 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV69TotUni = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV36Noprecio = "" ;
      AV83DisPreKgm = DecimalUtil.ZERO ;
      AV84DisPreMtr = DecimalUtil.ZERO ;
      P02XP6_A831TipColCod = new byte[1] ;
      P02XP6_A483ForColNum = new int[1] ;
      P02XP6_A482ForColNom = new String[] {""} ;
      P02XP6_A494ForSer = new String[] {""} ;
      P02XP6_A252CliCod = new int[1] ;
      P02XP6_n252CliCod = new boolean[] {false} ;
      P02XP6_A396EmprCod = new String[] {""} ;
      P02XP6_A3915EmpNumDec = new byte[1] ;
      P02XP6_n3915EmpNumDec = new boolean[] {false} ;
      P02XP6_A583IntCod = new byte[1] ;
      P02XP6_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP6_n493ForPreMtr = new boolean[] {false} ;
      P02XP6_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP6_n492ForPreKgm = new boolean[] {false} ;
      P02XP6_A491ForPreDef = new String[] {""} ;
      P02XP6_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P02XP7_A396EmprCod = new String[] {""} ;
      P02XP7_A252CliCod = new int[1] ;
      P02XP7_n252CliCod = new boolean[] {false} ;
      P02XP7_A494ForSer = new String[] {""} ;
      P02XP7_A482ForColNom = new String[] {""} ;
      P02XP7_A483ForColNum = new int[1] ;
      P02XP7_A831TipColCod = new byte[1] ;
      P02XP7_A1521RecValFin = new int[1] ;
      P02XP7_n1521RecValFin = new boolean[] {false} ;
      P02XP7_A1520RecValIni = new int[1] ;
      P02XP7_n1520RecValIni = new boolean[] {false} ;
      P02XP7_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP7_n1522RecCanRec = new boolean[] {false} ;
      P02XP7_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      AV54PorRec = DecimalUtil.ZERO ;
      P02XP8_A596LimUni = new int[1] ;
      P02XP8_n596LimUni = new boolean[] {false} ;
      P02XP8_A65ArtCod = new String[] {""} ;
      P02XP8_A252CliCod = new int[1] ;
      P02XP8_n252CliCod = new boolean[] {false} ;
      P02XP8_A396EmprCod = new String[] {""} ;
      P02XP8_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP8_n675PorRec = new boolean[] {false} ;
      P02XP8_A598LinRec = new byte[1] ;
      A65ArtCod = "" ;
      A675PorRec = DecimalUtil.ZERO ;
      P02XP9_A65ArtCod = new String[] {""} ;
      P02XP9_A252CliCod = new int[1] ;
      P02XP9_n252CliCod = new boolean[] {false} ;
      P02XP9_A396EmprCod = new String[] {""} ;
      P02XP9_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP9_n92ArtPreKgm = new boolean[] {false} ;
      P02XP9_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP9_n93ArtPreMtr = new boolean[] {false} ;
      P02XP9_A91ArtPreDef = new String[] {""} ;
      P02XP9_n91ArtPreDef = new boolean[] {false} ;
      P02XP9_A3915EmpNumDec = new byte[1] ;
      P02XP9_n3915EmpNumDec = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P02XP10_A396EmprCod = new String[] {""} ;
      P02XP10_A252CliCod = new int[1] ;
      P02XP10_n252CliCod = new boolean[] {false} ;
      P02XP10_A65ArtCod = new String[] {""} ;
      P02XP10_A583IntCod = new byte[1] ;
      P02XP10_A831TipColCod = new byte[1] ;
      P02XP10_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP10_n586IntPreKgm = new boolean[] {false} ;
      P02XP10_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP10_n587IntPreMtr = new boolean[] {false} ;
      P02XP10_A585IntPreDef = new String[] {""} ;
      P02XP10_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      AV80TotRecInt = DecimalUtil.ZERO ;
      P02XP11_A396EmprCod = new String[] {""} ;
      P02XP11_A252CliCod = new int[1] ;
      P02XP11_n252CliCod = new boolean[] {false} ;
      P02XP11_A65ArtCod = new String[] {""} ;
      P02XP11_A596LimUni = new int[1] ;
      P02XP11_n596LimUni = new boolean[] {false} ;
      P02XP11_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP11_n675PorRec = new boolean[] {false} ;
      P02XP11_A598LinRec = new byte[1] ;
      P02XP12_A4322Limite5 = new short[1] ;
      P02XP12_A583IntCod = new byte[1] ;
      P02XP12_A831TipColCod = new byte[1] ;
      P02XP12_A65ArtCod = new String[] {""} ;
      P02XP12_A252CliCod = new int[1] ;
      P02XP12_n252CliCod = new boolean[] {false} ;
      P02XP12_A396EmprCod = new String[] {""} ;
      P02XP12_A4323RecIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP12_n4323RecIImp = new boolean[] {false} ;
      A4323RecIImp = DecimalUtil.ZERO ;
      P02XP13_A361DisCod = new int[1] ;
      P02XP13_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP13_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XP13_A396EmprCod = new String[] {""} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprem__default(),
         new Object[] {
             new Object[] {
            P02XP2_A132BarCodReo, P02XP2_A130BarCodPar, P02XP2_A129BarCod, P02XP2_A396EmprCod, P02XP2_A161BarFecSal, P02XP2_A252CliCod, P02XP2_n252CliCod, P02XP2_A212BarSer, P02XP2_A135BarColNom, P02XP2_A136BarColNum,
            P02XP2_A218BarTipCol, P02XP2_A2010BarTipDis, P02XP2_A361DisCod, P02XP2_A228BarUniMed, P02XP2_A120BarAgrEst, P02XP2_A193BarOpeEsp, P02XP2_A148BarEstReo, P02XP2_A5253BarAcc
            }
            , new Object[] {
            P02XP4_A184BarMtr, P02XP4_A166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P02XP6_A831TipColCod, P02XP6_A483ForColNum, P02XP6_A482ForColNom, P02XP6_A494ForSer, P02XP6_A252CliCod, P02XP6_A396EmprCod, P02XP6_A3915EmpNumDec, P02XP6_n3915EmpNumDec, P02XP6_A583IntCod, P02XP6_A493ForPreMtr,
            P02XP6_n493ForPreMtr, P02XP6_A492ForPreKgm, P02XP6_n492ForPreKgm, P02XP6_A491ForPreDef, P02XP6_n491ForPreDef
            }
            , new Object[] {
            P02XP7_A396EmprCod, P02XP7_A252CliCod, P02XP7_A494ForSer, P02XP7_A482ForColNom, P02XP7_A483ForColNum, P02XP7_A831TipColCod, P02XP7_A1521RecValFin, P02XP7_n1521RecValFin, P02XP7_A1520RecValIni, P02XP7_n1520RecValIni,
            P02XP7_A1522RecCanRec, P02XP7_n1522RecCanRec, P02XP7_A1519RecCorLin
            }
            , new Object[] {
            P02XP8_A596LimUni, P02XP8_n596LimUni, P02XP8_A65ArtCod, P02XP8_A252CliCod, P02XP8_A396EmprCod, P02XP8_A675PorRec, P02XP8_n675PorRec, P02XP8_A598LinRec
            }
            , new Object[] {
            P02XP9_A65ArtCod, P02XP9_A252CliCod, P02XP9_A396EmprCod, P02XP9_A92ArtPreKgm, P02XP9_n92ArtPreKgm, P02XP9_A93ArtPreMtr, P02XP9_n93ArtPreMtr, P02XP9_A91ArtPreDef, P02XP9_n91ArtPreDef, P02XP9_A3915EmpNumDec,
            P02XP9_n3915EmpNumDec
            }
            , new Object[] {
            P02XP10_A396EmprCod, P02XP10_A252CliCod, P02XP10_A65ArtCod, P02XP10_A583IntCod, P02XP10_A831TipColCod, P02XP10_A586IntPreKgm, P02XP10_n586IntPreKgm, P02XP10_A587IntPreMtr, P02XP10_n587IntPreMtr, P02XP10_A585IntPreDef,
            P02XP10_n585IntPreDef
            }
            , new Object[] {
            P02XP11_A396EmprCod, P02XP11_A252CliCod, P02XP11_A65ArtCod, P02XP11_A596LimUni, P02XP11_n596LimUni, P02XP11_A675PorRec, P02XP11_n675PorRec, P02XP11_A598LinRec
            }
            , new Object[] {
            P02XP12_A4322Limite5, P02XP12_A583IntCod, P02XP12_A831TipColCod, P02XP12_A65ArtCod, P02XP12_A252CliCod, P02XP12_A396EmprCod, P02XP12_A4323RecIImp, P02XP12_n4323RecIImp
            }
            , new Object[] {
            P02XP13_A361DisCod, P02XP13_A388DisPreKgm, P02XP13_A389DisPreMtr, P02XP13_A396EmprCod
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
   private byte AV82BusPr3 ;
   private byte AV85FlagSala ;
   private byte AV86PLinea ;
   private byte AV89Tintutex ;
   private byte AV90Tas ;
   private byte GXt_int2 ;
   private byte AV70FlagPorCol ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte A148BarEstReo ;
   private byte AV34TipColCod ;
   private byte GXv_int8[] ;
   private byte A3915EmpNumDec ;
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
   private int A361DisCod ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV74DisCod ;
   private int AV27LimUni ;
   private int GXv_int4[] ;
   private int A483ForColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV69TotUni ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV83DisPreKgm ;
   private java.math.BigDecimal AV84DisPreMtr ;
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
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV36Noprecio ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
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
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02XP2_A132BarCodReo ;
   private String[] P02XP2_A130BarCodPar ;
   private int[] P02XP2_A129BarCod ;
   private String[] P02XP2_A396EmprCod ;
   private java.util.Date[] P02XP2_A161BarFecSal ;
   private int[] P02XP2_A252CliCod ;
   private boolean[] P02XP2_n252CliCod ;
   private String[] P02XP2_A212BarSer ;
   private String[] P02XP2_A135BarColNom ;
   private int[] P02XP2_A136BarColNum ;
   private byte[] P02XP2_A218BarTipCol ;
   private String[] P02XP2_A2010BarTipDis ;
   private int[] P02XP2_A361DisCod ;
   private String[] P02XP2_A228BarUniMed ;
   private String[] P02XP2_A120BarAgrEst ;
   private byte[] P02XP2_A193BarOpeEsp ;
   private byte[] P02XP2_A148BarEstReo ;
   private String[] P02XP2_A5253BarAcc ;
   private java.math.BigDecimal[] P02XP4_A184BarMtr ;
   private java.math.BigDecimal[] P02XP4_A166BarKgm ;
   private byte[] P02XP6_A831TipColCod ;
   private int[] P02XP6_A483ForColNum ;
   private String[] P02XP6_A482ForColNom ;
   private String[] P02XP6_A494ForSer ;
   private int[] P02XP6_A252CliCod ;
   private boolean[] P02XP6_n252CliCod ;
   private String[] P02XP6_A396EmprCod ;
   private byte[] P02XP6_A3915EmpNumDec ;
   private boolean[] P02XP6_n3915EmpNumDec ;
   private byte[] P02XP6_A583IntCod ;
   private java.math.BigDecimal[] P02XP6_A493ForPreMtr ;
   private boolean[] P02XP6_n493ForPreMtr ;
   private java.math.BigDecimal[] P02XP6_A492ForPreKgm ;
   private boolean[] P02XP6_n492ForPreKgm ;
   private String[] P02XP6_A491ForPreDef ;
   private boolean[] P02XP6_n491ForPreDef ;
   private String[] P02XP7_A396EmprCod ;
   private int[] P02XP7_A252CliCod ;
   private boolean[] P02XP7_n252CliCod ;
   private String[] P02XP7_A494ForSer ;
   private String[] P02XP7_A482ForColNom ;
   private int[] P02XP7_A483ForColNum ;
   private byte[] P02XP7_A831TipColCod ;
   private int[] P02XP7_A1521RecValFin ;
   private boolean[] P02XP7_n1521RecValFin ;
   private int[] P02XP7_A1520RecValIni ;
   private boolean[] P02XP7_n1520RecValIni ;
   private java.math.BigDecimal[] P02XP7_A1522RecCanRec ;
   private boolean[] P02XP7_n1522RecCanRec ;
   private byte[] P02XP7_A1519RecCorLin ;
   private int[] P02XP8_A596LimUni ;
   private boolean[] P02XP8_n596LimUni ;
   private String[] P02XP8_A65ArtCod ;
   private int[] P02XP8_A252CliCod ;
   private boolean[] P02XP8_n252CliCod ;
   private String[] P02XP8_A396EmprCod ;
   private java.math.BigDecimal[] P02XP8_A675PorRec ;
   private boolean[] P02XP8_n675PorRec ;
   private byte[] P02XP8_A598LinRec ;
   private String[] P02XP9_A65ArtCod ;
   private int[] P02XP9_A252CliCod ;
   private boolean[] P02XP9_n252CliCod ;
   private String[] P02XP9_A396EmprCod ;
   private java.math.BigDecimal[] P02XP9_A92ArtPreKgm ;
   private boolean[] P02XP9_n92ArtPreKgm ;
   private java.math.BigDecimal[] P02XP9_A93ArtPreMtr ;
   private boolean[] P02XP9_n93ArtPreMtr ;
   private String[] P02XP9_A91ArtPreDef ;
   private boolean[] P02XP9_n91ArtPreDef ;
   private byte[] P02XP9_A3915EmpNumDec ;
   private boolean[] P02XP9_n3915EmpNumDec ;
   private String[] P02XP10_A396EmprCod ;
   private int[] P02XP10_A252CliCod ;
   private boolean[] P02XP10_n252CliCod ;
   private String[] P02XP10_A65ArtCod ;
   private byte[] P02XP10_A583IntCod ;
   private byte[] P02XP10_A831TipColCod ;
   private java.math.BigDecimal[] P02XP10_A586IntPreKgm ;
   private boolean[] P02XP10_n586IntPreKgm ;
   private java.math.BigDecimal[] P02XP10_A587IntPreMtr ;
   private boolean[] P02XP10_n587IntPreMtr ;
   private String[] P02XP10_A585IntPreDef ;
   private boolean[] P02XP10_n585IntPreDef ;
   private String[] P02XP11_A396EmprCod ;
   private int[] P02XP11_A252CliCod ;
   private boolean[] P02XP11_n252CliCod ;
   private String[] P02XP11_A65ArtCod ;
   private int[] P02XP11_A596LimUni ;
   private boolean[] P02XP11_n596LimUni ;
   private java.math.BigDecimal[] P02XP11_A675PorRec ;
   private boolean[] P02XP11_n675PorRec ;
   private byte[] P02XP11_A598LinRec ;
   private short[] P02XP12_A4322Limite5 ;
   private byte[] P02XP12_A583IntCod ;
   private byte[] P02XP12_A831TipColCod ;
   private String[] P02XP12_A65ArtCod ;
   private int[] P02XP12_A252CliCod ;
   private boolean[] P02XP12_n252CliCod ;
   private String[] P02XP12_A396EmprCod ;
   private java.math.BigDecimal[] P02XP12_A4323RecIImp ;
   private boolean[] P02XP12_n4323RecIImp ;
   private int[] P02XP13_A361DisCod ;
   private java.math.BigDecimal[] P02XP13_A388DisPreKgm ;
   private java.math.BigDecimal[] P02XP13_A389DisPreMtr ;
   private String[] P02XP13_A396EmprCod ;
}

final  class pbusprem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XP2", "SELECT BarCodReo, BarCodPar, BarCod, EmprCod, BarFecSal, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarTipDis, DisCod, BarUniMed, BarAgrEst, BarOpeEsp, BarEstReo, BarAcc FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarFecSal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP4", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XP5", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02XP6", "SELECT T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T2.EmpNumDec, T1.IntCod, T1.ForPreMtr, T1.ForPreKgm, T1.ForPreDef FROM (TXPCFORMU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP7", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XP8", "SELECT * FROM (SELECT LimUni, ArtCod, CliCod, EmprCod, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP9", "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtPreKgm, T1.ArtPreMtr, T1.ArtPreDef, T2.EmpNumDec FROM (TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP10", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP11", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP12", "SELECT * FROM (SELECT Limite5, IntCod, TipColCod, ArtCod, CliCod, EmprCod, RecIImp FROM TXPRecInt WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and Limite5 > ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XP13", "SELECT DisCod, DisPreKgm, DisPreMtr, EmprCod FROM TXPDISPOS WHERE DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

