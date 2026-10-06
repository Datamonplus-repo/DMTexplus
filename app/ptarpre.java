package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptarpre extends GXProcedure
{
   public ptarpre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptarpre.class ), "" );
   }

   public ptarpre( int remoteHandle ,
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
      ptarpre.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      ptarpre.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptarpre.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptarpre.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ptarpre.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ptarpre.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ptarpre.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ptarpre.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ptarpre.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      ptarpre.this.AV23Recar = aP8[0];
      this.aP8 = aP8;
      ptarpre.this.AV24Dtos = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV47Flag ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100006", GXv_int1) ;
      ptarpre.this.AV47Flag = GXv_int1[0] ;
      GXv_int1[0] = AV57Pervaf ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      ptarpre.this.AV57Pervaf = GXv_int1[0] ;
      GXv_int1[0] = AV59FlagJm ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "JMOLTO", ""), GXv_int1) ;
      ptarpre.this.AV59FlagJm = GXv_int1[0] ;
      GXv_int1[0] = AV60FlagTm ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TRAVER", ""), GXv_int1) ;
      ptarpre.this.AV60FlagTm = GXv_int1[0] ;
      GXv_int1[0] = AV61FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int1) ;
      ptarpre.this.AV61FlagSalt = GXv_int1[0] ;
      GXv_int1[0] = AV62FlagItr ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int1) ;
      ptarpre.this.AV62FlagItr = GXv_int1[0] ;
      AV64FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV64FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      ptarpre.this.AV64FlagRecCol = GXv_int1[0] ;
      AV23Recar = DecimalUtil.ZERO ;
      AV24Dtos = DecimalUtil.ZERO ;
      if ( AV59FlagJm == 1 )
      {
         GXv_char2[0] = AV15EmprCod ;
         GXv_int3[0] = AV16BarCod ;
         GXv_int1[0] = AV17BarReo ;
         GXv_char4[0] = AV18BarPar ;
         GXv_decimal5[0] = AV19PreKgm ;
         GXv_decimal6[0] = AV20PreMts ;
         GXv_int7[0] = AV21Operesp ;
         GXv_decimal8[0] = AV22TotRec ;
         GXv_decimal9[0] = AV23Recar ;
         GXv_decimal10[0] = AV24Dtos ;
         new app.ptarjm1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_decimal10) ;
         ptarpre.this.AV15EmprCod = GXv_char2[0] ;
         ptarpre.this.AV16BarCod = GXv_int3[0] ;
         ptarpre.this.AV17BarReo = GXv_int1[0] ;
         ptarpre.this.AV18BarPar = GXv_char4[0] ;
         ptarpre.this.AV19PreKgm = GXv_decimal5[0] ;
         ptarpre.this.AV20PreMts = GXv_decimal6[0] ;
         ptarpre.this.AV21Operesp = GXv_int7[0] ;
         ptarpre.this.AV22TotRec = GXv_decimal8[0] ;
         ptarpre.this.AV23Recar = GXv_decimal9[0] ;
         ptarpre.this.AV24Dtos = GXv_decimal10[0] ;
      }
      else
      {
         if ( AV60FlagTm == 1 )
         {
         }
         else
         {
            if ( AV62FlagItr == 1 )
            {
               GXv_char4[0] = AV15EmprCod ;
               GXv_int3[0] = AV16BarCod ;
               GXv_int7[0] = AV17BarReo ;
               GXv_char2[0] = AV18BarPar ;
               GXv_decimal10[0] = AV19PreKgm ;
               GXv_decimal9[0] = AV20PreMts ;
               GXv_int1[0] = AV21Operesp ;
               GXv_decimal8[0] = AV22TotRec ;
               GXv_decimal6[0] = AV23Recar ;
               GXv_decimal5[0] = AV24Dtos ;
               new app.ptaritr(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int7, GXv_char2, GXv_decimal10, GXv_decimal9, GXv_int1, GXv_decimal8, GXv_decimal6, GXv_decimal5) ;
               ptarpre.this.AV15EmprCod = GXv_char4[0] ;
               ptarpre.this.AV16BarCod = GXv_int3[0] ;
               ptarpre.this.AV17BarReo = GXv_int7[0] ;
               ptarpre.this.AV18BarPar = GXv_char2[0] ;
               ptarpre.this.AV19PreKgm = GXv_decimal10[0] ;
               ptarpre.this.AV20PreMts = GXv_decimal9[0] ;
               ptarpre.this.AV21Operesp = GXv_int1[0] ;
               ptarpre.this.AV22TotRec = GXv_decimal8[0] ;
               ptarpre.this.AV23Recar = GXv_decimal6[0] ;
               ptarpre.this.AV24Dtos = GXv_decimal5[0] ;
            }
            else
            {
               if ( (0==AV47Flag) )
               {
                  AV19PreKgm = DecimalUtil.ZERO ;
                  AV20PreMts = DecimalUtil.ZERO ;
                  AV26PreDef = httpContext.getMessage( "S", "") ;
                  /* Using cursor P00G32 */
                  pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar, AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
                  while ( (pr_default.getStatus(0) != 101) )
                  {
                     A132BarCodReo = P00G32_A132BarCodReo[0] ;
                     A130BarCodPar = P00G32_A130BarCodPar[0] ;
                     A129BarCod = P00G32_A129BarCod[0] ;
                     A396EmprCod = P00G32_A396EmprCod[0] ;
                     A161BarFecSal = P00G32_A161BarFecSal[0] ;
                     A252CliCod = P00G32_A252CliCod[0] ;
                     n252CliCod = P00G32_n252CliCod[0] ;
                     A212BarSer = P00G32_A212BarSer[0] ;
                     A135BarColNom = P00G32_A135BarColNom[0] ;
                     A136BarColNum = P00G32_A136BarColNum[0] ;
                     A218BarTipCol = P00G32_A218BarTipCol[0] ;
                     A3310BarFac = P00G32_A3310BarFac[0] ;
                     A228BarUniMed = P00G32_A228BarUniMed[0] ;
                     A193BarOpeEsp = P00G32_A193BarOpeEsp[0] ;
                     /* Using cursor P00G34 */
                     pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     if ( (pr_default.getStatus(1) != 101) )
                     {
                        A184BarMtr = P00G34_A184BarMtr[0] ;
                        A166BarKgm = P00G34_A166BarKgm[0] ;
                     }
                     else
                     {
                        A184BarMtr = DecimalUtil.doubleToDec(0) ;
                        A166BarKgm = DecimalUtil.doubleToDec(0) ;
                     }
                     A161BarFecSal = Gx_date ;
                     AV37CliCod = A252CliCod ;
                     AV33BarSer = A212BarSer ;
                     AV34BarColNom = A135BarColNom ;
                     AV35BarColNum = A136BarColNum ;
                     AV36TipColCod = A218BarTipCol ;
                     if ( GXutil.strcmp(A3310BarFac, httpContext.getMessage( "N", "")) == 0 )
                     {
                        AV21Operesp = (byte)(10) ;
                        AV19PreKgm = DecimalUtil.doubleToDec(0) ;
                     }
                     else
                     {
                        if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
                        {
                           AV29LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A184BarMtr, 0))) ;
                           AV46UniMed = httpContext.getMessage( "M", "") ;
                        }
                        else
                        {
                           AV29LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A166BarKgm, 0))) ;
                           AV46UniMed = httpContext.getMessage( "K", "") ;
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
                           AV38Noprecio = httpContext.getMessage( "N", "") ;
                        }
                        else
                        {
                           AV38Noprecio = httpContext.getMessage( "S", "") ;
                        }
                        if ( ( GXutil.strcmp(AV26PreDef, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(AV38Noprecio, httpContext.getMessage( "N", "")) == 0 ) )
                        {
                           AV21Operesp = (byte)(2) ;
                        }
                        if ( ( GXutil.strcmp(AV38Noprecio, httpContext.getMessage( "N", "")) == 0 ) && ( A193BarOpeEsp == 4 ) )
                        {
                           AV21Operesp = (byte)(4) ;
                        }
                        if ( ( GXutil.strcmp(AV38Noprecio, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV26PreDef, httpContext.getMessage( "S", "")) == 0 ) )
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
                     }
                     /* Using cursor P00G35 */
                     pr_default.execute(2, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(0);
                  pr_default.close(1);
               }
               else
               {
                  AV54FlagPre = (byte)(0) ;
                  /* Using cursor P00G36 */
                  pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A130BarCodPar = P00G36_A130BarCodPar[0] ;
                     A132BarCodReo = P00G36_A132BarCodReo[0] ;
                     A129BarCod = P00G36_A129BarCod[0] ;
                     A396EmprCod = P00G36_A396EmprCod[0] ;
                     A252CliCod = P00G36_A252CliCod[0] ;
                     n252CliCod = P00G36_n252CliCod[0] ;
                     A212BarSer = P00G36_A212BarSer[0] ;
                     A135BarColNom = P00G36_A135BarColNom[0] ;
                     A136BarColNum = P00G36_A136BarColNum[0] ;
                     A218BarTipCol = P00G36_A218BarTipCol[0] ;
                     A161BarFecSal = P00G36_A161BarFecSal[0] ;
                     AV37CliCod = A252CliCod ;
                     AV33BarSer = A212BarSer ;
                     AV51ForSer = A212BarSer ;
                     AV52ForColNom = A135BarColNom ;
                     AV53ForColNum = A136BarColNum ;
                     AV36TipColCod = A218BarTipCol ;
                     /* Execute user subroutine: 'FORMULA' */
                     S141 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     /* Using cursor P00G37 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A758ProCod = P00G37_A758ProCod[0] ;
                        AV50ProCod = A758ProCod ;
                        AV55FlagPro = (byte)(0) ;
                        /* Execute user subroutine: 'PRECIOS' */
                        S131 ();
                        if ( returnInSub )
                        {
                           pr_default.close(4);
                           pr_default.close(3);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        if ( AV55FlagPro == 0 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                        pr_default.readNext(4);
                     }
                     pr_default.close(4);
                     if ( ( AV55FlagPro == 0 ) || ( AV54FlagPre == 1 ) )
                     {
                        AV21Operesp = (byte)(2) ;
                     }
                     else
                     {
                        if ( ( AV55FlagPro == 1 ) && ( AV54FlagPre == 0 ) )
                        {
                           AV21Operesp = (byte)(10) ;
                        }
                     }
                     A161BarFecSal = GXutil.today( ) ;
                     /* Using cursor P00G38 */
                     pr_default.execute(5, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(3);
               }
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P00G39 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV37CliCod), AV33BarSer, AV34BarColNom, Integer.valueOf(AV35BarColNum), Byte.valueOf(AV36TipColCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A831TipColCod = P00G39_A831TipColCod[0] ;
         A483ForColNum = P00G39_A483ForColNum[0] ;
         A482ForColNom = P00G39_A482ForColNom[0] ;
         A494ForSer = P00G39_A494ForSer[0] ;
         A252CliCod = P00G39_A252CliCod[0] ;
         n252CliCod = P00G39_n252CliCod[0] ;
         A396EmprCod = P00G39_A396EmprCod[0] ;
         A583IntCod = P00G39_A583IntCod[0] ;
         A492ForPreKgm = P00G39_A492ForPreKgm[0] ;
         n492ForPreKgm = P00G39_n492ForPreKgm[0] ;
         A493ForPreMtr = P00G39_A493ForPreMtr[0] ;
         n493ForPreMtr = P00G39_n493ForPreMtr[0] ;
         A491ForPreDef = P00G39_A491ForPreDef[0] ;
         n491ForPreDef = P00G39_n491ForPreDef[0] ;
         AV27IntCod = A583IntCod ;
         AV19PreKgm = A492ForPreKgm ;
         AV20PreMts = A493ForPreMtr ;
         if ( GXutil.strcmp(A491ForPreDef, httpContext.getMessage( "N", "")) == 0 )
         {
            AV26PreDef = httpContext.getMessage( "N", "") ;
         }
         /* Using cursor P00G310 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A1521RecValFin = P00G310_A1521RecValFin[0] ;
            n1521RecValFin = P00G310_n1521RecValFin[0] ;
            A1520RecValIni = P00G310_A1520RecValIni[0] ;
            n1520RecValIni = P00G310_n1520RecValIni[0] ;
            A1522RecCanRec = P00G310_A1522RecCanRec[0] ;
            n1522RecCanRec = P00G310_n1522RecCanRec[0] ;
            A1519RecCorLin = P00G310_A1519RecCorLin[0] ;
            if ( ( ( AV29LimUni >= A1520RecValIni ) && ( AV29LimUni <= A1521RecValFin ) ) || ( ( AV29LimUni >= A1520RecValIni ) && (0==A1521RecValFin) ) )
            {
               AV22TotRec = A1522RecCanRec ;
               if ( GXutil.strcmp(AV46UniMed, httpContext.getMessage( "K", "")) == 0 )
               {
                  AV19PreKgm = AV22TotRec ;
               }
               else
               {
                  AV20PreMts = AV22TotRec ;
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
      if ( AV64FlagRecCol == 1 )
      {
         /* Using cursor P00G311 */
         pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV37CliCod), AV33BarSer, Integer.valueOf(AV29LimUni)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A596LimUni = P00G311_A596LimUni[0] ;
            n596LimUni = P00G311_n596LimUni[0] ;
            A65ArtCod = P00G311_A65ArtCod[0] ;
            A252CliCod = P00G311_A252CliCod[0] ;
            n252CliCod = P00G311_n252CliCod[0] ;
            A396EmprCod = P00G311_A396EmprCod[0] ;
            A675PorRec = P00G311_A675PorRec[0] ;
            n675PorRec = P00G311_n675PorRec[0] ;
            A598LinRec = P00G311_A598LinRec[0] ;
            AV56PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56PorRec)==0) )
         {
            if ( GXutil.strcmp(AV46UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
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
      /* Using cursor P00G312 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV37CliCod), AV33BarSer});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A65ArtCod = P00G312_A65ArtCod[0] ;
         A252CliCod = P00G312_A252CliCod[0] ;
         n252CliCod = P00G312_n252CliCod[0] ;
         A396EmprCod = P00G312_A396EmprCod[0] ;
         A92ArtPreKgm = P00G312_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P00G312_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P00G312_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P00G312_n93ArtPreMtr[0] ;
         A91ArtPreDef = P00G312_A91ArtPreDef[0] ;
         n91ArtPreDef = P00G312_n91ArtPreDef[0] ;
         A3915EmpNumDec = P00G312_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00G312_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P00G312_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00G312_n3915EmpNumDec[0] ;
         AV19PreKgm = A92ArtPreKgm ;
         AV20PreMts = A93ArtPreMtr ;
         if ( GXutil.strcmp(AV26PreDef, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV26PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Using cursor P00G313 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(AV29LimUni)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A596LimUni = P00G313_A596LimUni[0] ;
            n596LimUni = P00G313_n596LimUni[0] ;
            A675PorRec = P00G313_A675PorRec[0] ;
            n675PorRec = P00G313_n675PorRec[0] ;
            A598LinRec = P00G313_A598LinRec[0] ;
            AV56PorRec = A675PorRec ;
            if ( ( AV57Pervaf == 1 ) && ( AV37CliCod == 17 ) )
            {
               AV19PreKgm = AV20PreMts ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56PorRec)==0) )
         {
            if ( GXutil.strcmp(AV46UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            else
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV56PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
            }
         }
         if ( AV61FlagSalt == 1 )
         {
            /* Using cursor P00G314 */
            pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV37CliCod), AV33BarSer, Integer.valueOf(AV29LimUni)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A2931Limite2 = P00G314_A2931Limite2[0] ;
               A65ArtCod = P00G314_A65ArtCod[0] ;
               A252CliCod = P00G314_A252CliCod[0] ;
               n252CliCod = P00G314_n252CliCod[0] ;
               A396EmprCod = P00G314_A396EmprCod[0] ;
               A2932Precio2 = P00G314_A2932Precio2[0] ;
               n2932Precio2 = P00G314_n2932Precio2[0] ;
               AV19PreKgm = AV19PreKgm.add(A2932Precio2) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(11);
            }
            pr_default.close(11);
         }
         /* Using cursor P00G315 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV36TipColCod), Byte.valueOf(AV27IntCod)});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A583IntCod = P00G315_A583IntCod[0] ;
            A831TipColCod = P00G315_A831TipColCod[0] ;
            A586IntPreKgm = P00G315_A586IntPreKgm[0] ;
            n586IntPreKgm = P00G315_n586IntPreKgm[0] ;
            A587IntPreMtr = P00G315_A587IntPreMtr[0] ;
            n587IntPreMtr = P00G315_n587IntPreMtr[0] ;
            A585IntPreDef = P00G315_A585IntPreDef[0] ;
            n585IntPreDef = P00G315_n585IntPreDef[0] ;
            AV19PreKgm = AV19PreKgm.add(A586IntPreKgm) ;
            AV20PreMts = AV20PreMts.add(A587IntPreMtr) ;
            if ( GXutil.strcmp(AV26PreDef, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(A585IntPreDef, httpContext.getMessage( "N", "")) == 0 )
               {
                  AV26PreDef = httpContext.getMessage( "N", "") ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(12);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S131( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      /* Using cursor P00G316 */
      pr_default.execute(13, new Object[] {AV15EmprCod, Integer.valueOf(AV37CliCod), AV50ProCod, AV33BarSer, Byte.valueOf(AV27IntCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A583IntCod = P00G316_A583IntCod[0] ;
         A1504CliProCod = P00G316_A1504CliProCod[0] ;
         A65ArtCod = P00G316_A65ArtCod[0] ;
         A252CliCod = P00G316_A252CliCod[0] ;
         n252CliCod = P00G316_n252CliCod[0] ;
         A396EmprCod = P00G316_A396EmprCod[0] ;
         A1464ProPreMtr = P00G316_A1464ProPreMtr[0] ;
         n1464ProPreMtr = P00G316_n1464ProPreMtr[0] ;
         A1465ProPreKgm = P00G316_A1465ProPreKgm[0] ;
         n1465ProPreKgm = P00G316_n1465ProPreKgm[0] ;
         AV55FlagPro = (byte)(1) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1465ProPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1464ProPreMtr)==0) )
         {
            AV54FlagPre = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S141( )
   {
      /* 'FORMULA' Routine */
      returnInSub = false ;
      AV27IntCod = (byte)(99) ;
      /* Using cursor P00G317 */
      pr_default.execute(14, new Object[] {AV15EmprCod, Integer.valueOf(AV37CliCod), AV51ForSer, AV52ForColNom, Integer.valueOf(AV53ForColNum), Byte.valueOf(AV36TipColCod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A831TipColCod = P00G317_A831TipColCod[0] ;
         A483ForColNum = P00G317_A483ForColNum[0] ;
         A482ForColNom = P00G317_A482ForColNom[0] ;
         A494ForSer = P00G317_A494ForSer[0] ;
         A252CliCod = P00G317_A252CliCod[0] ;
         n252CliCod = P00G317_n252CliCod[0] ;
         A396EmprCod = P00G317_A396EmprCod[0] ;
         A583IntCod = P00G317_A583IntCod[0] ;
         AV27IntCod = A583IntCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptarpre.this.AV15EmprCod;
      this.aP1[0] = ptarpre.this.AV16BarCod;
      this.aP2[0] = ptarpre.this.AV17BarReo;
      this.aP3[0] = ptarpre.this.AV18BarPar;
      this.aP4[0] = ptarpre.this.AV19PreKgm;
      this.aP5[0] = ptarpre.this.AV20PreMts;
      this.aP6[0] = ptarpre.this.AV21Operesp;
      this.aP7[0] = ptarpre.this.AV22TotRec;
      this.aP8[0] = ptarpre.this.AV23Recar;
      this.aP9[0] = ptarpre.this.AV24Dtos;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptarpre");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV26PreDef = "" ;
      scmdbuf = "" ;
      P00G32_A132BarCodReo = new byte[1] ;
      P00G32_A130BarCodPar = new String[] {""} ;
      P00G32_A129BarCod = new int[1] ;
      P00G32_A396EmprCod = new String[] {""} ;
      P00G32_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P00G32_A252CliCod = new int[1] ;
      P00G32_n252CliCod = new boolean[] {false} ;
      P00G32_A212BarSer = new String[] {""} ;
      P00G32_A135BarColNom = new String[] {""} ;
      P00G32_A136BarColNum = new int[1] ;
      P00G32_A218BarTipCol = new byte[1] ;
      P00G32_A3310BarFac = new String[] {""} ;
      P00G32_A228BarUniMed = new String[] {""} ;
      P00G32_A193BarOpeEsp = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A3310BarFac = "" ;
      A228BarUniMed = "" ;
      P00G34_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G34_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV33BarSer = "" ;
      AV34BarColNom = "" ;
      AV46UniMed = "" ;
      AV38Noprecio = "" ;
      P00G36_A130BarCodPar = new String[] {""} ;
      P00G36_A132BarCodReo = new byte[1] ;
      P00G36_A129BarCod = new int[1] ;
      P00G36_A396EmprCod = new String[] {""} ;
      P00G36_A252CliCod = new int[1] ;
      P00G36_n252CliCod = new boolean[] {false} ;
      P00G36_A212BarSer = new String[] {""} ;
      P00G36_A135BarColNom = new String[] {""} ;
      P00G36_A136BarColNum = new int[1] ;
      P00G36_A218BarTipCol = new byte[1] ;
      P00G36_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      AV51ForSer = "" ;
      AV52ForColNom = "" ;
      P00G37_A396EmprCod = new String[] {""} ;
      P00G37_A129BarCod = new int[1] ;
      P00G37_A132BarCodReo = new byte[1] ;
      P00G37_A130BarCodPar = new String[] {""} ;
      P00G37_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV50ProCod = "" ;
      P00G39_A831TipColCod = new byte[1] ;
      P00G39_A483ForColNum = new int[1] ;
      P00G39_A482ForColNom = new String[] {""} ;
      P00G39_A494ForSer = new String[] {""} ;
      P00G39_A252CliCod = new int[1] ;
      P00G39_n252CliCod = new boolean[] {false} ;
      P00G39_A396EmprCod = new String[] {""} ;
      P00G39_A583IntCod = new byte[1] ;
      P00G39_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G39_n492ForPreKgm = new boolean[] {false} ;
      P00G39_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G39_n493ForPreMtr = new boolean[] {false} ;
      P00G39_A491ForPreDef = new String[] {""} ;
      P00G39_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P00G310_A396EmprCod = new String[] {""} ;
      P00G310_A252CliCod = new int[1] ;
      P00G310_n252CliCod = new boolean[] {false} ;
      P00G310_A494ForSer = new String[] {""} ;
      P00G310_A482ForColNom = new String[] {""} ;
      P00G310_A483ForColNum = new int[1] ;
      P00G310_A831TipColCod = new byte[1] ;
      P00G310_A1521RecValFin = new int[1] ;
      P00G310_n1521RecValFin = new boolean[] {false} ;
      P00G310_A1520RecValIni = new int[1] ;
      P00G310_n1520RecValIni = new boolean[] {false} ;
      P00G310_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G310_n1522RecCanRec = new boolean[] {false} ;
      P00G310_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      P00G311_A596LimUni = new int[1] ;
      P00G311_n596LimUni = new boolean[] {false} ;
      P00G311_A65ArtCod = new String[] {""} ;
      P00G311_A252CliCod = new int[1] ;
      P00G311_n252CliCod = new boolean[] {false} ;
      P00G311_A396EmprCod = new String[] {""} ;
      P00G311_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G311_n675PorRec = new boolean[] {false} ;
      P00G311_A598LinRec = new byte[1] ;
      A65ArtCod = "" ;
      A675PorRec = DecimalUtil.ZERO ;
      AV56PorRec = DecimalUtil.ZERO ;
      P00G312_A65ArtCod = new String[] {""} ;
      P00G312_A252CliCod = new int[1] ;
      P00G312_n252CliCod = new boolean[] {false} ;
      P00G312_A396EmprCod = new String[] {""} ;
      P00G312_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G312_n92ArtPreKgm = new boolean[] {false} ;
      P00G312_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G312_n93ArtPreMtr = new boolean[] {false} ;
      P00G312_A91ArtPreDef = new String[] {""} ;
      P00G312_n91ArtPreDef = new boolean[] {false} ;
      P00G312_A3915EmpNumDec = new byte[1] ;
      P00G312_n3915EmpNumDec = new boolean[] {false} ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P00G313_A396EmprCod = new String[] {""} ;
      P00G313_A252CliCod = new int[1] ;
      P00G313_n252CliCod = new boolean[] {false} ;
      P00G313_A65ArtCod = new String[] {""} ;
      P00G313_A596LimUni = new int[1] ;
      P00G313_n596LimUni = new boolean[] {false} ;
      P00G313_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G313_n675PorRec = new boolean[] {false} ;
      P00G313_A598LinRec = new byte[1] ;
      P00G314_A2931Limite2 = new short[1] ;
      P00G314_A65ArtCod = new String[] {""} ;
      P00G314_A252CliCod = new int[1] ;
      P00G314_n252CliCod = new boolean[] {false} ;
      P00G314_A396EmprCod = new String[] {""} ;
      P00G314_A2932Precio2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G314_n2932Precio2 = new boolean[] {false} ;
      A2932Precio2 = DecimalUtil.ZERO ;
      P00G315_A396EmprCod = new String[] {""} ;
      P00G315_A252CliCod = new int[1] ;
      P00G315_n252CliCod = new boolean[] {false} ;
      P00G315_A65ArtCod = new String[] {""} ;
      P00G315_A583IntCod = new byte[1] ;
      P00G315_A831TipColCod = new byte[1] ;
      P00G315_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G315_n586IntPreKgm = new boolean[] {false} ;
      P00G315_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G315_n587IntPreMtr = new boolean[] {false} ;
      P00G315_A585IntPreDef = new String[] {""} ;
      P00G315_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      P00G316_A583IntCod = new byte[1] ;
      P00G316_A1504CliProCod = new String[] {""} ;
      P00G316_A65ArtCod = new String[] {""} ;
      P00G316_A252CliCod = new int[1] ;
      P00G316_n252CliCod = new boolean[] {false} ;
      P00G316_A396EmprCod = new String[] {""} ;
      P00G316_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G316_n1464ProPreMtr = new boolean[] {false} ;
      P00G316_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G316_n1465ProPreKgm = new boolean[] {false} ;
      A1504CliProCod = "" ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
      P00G317_A831TipColCod = new byte[1] ;
      P00G317_A483ForColNum = new int[1] ;
      P00G317_A482ForColNom = new String[] {""} ;
      P00G317_A494ForSer = new String[] {""} ;
      P00G317_A252CliCod = new int[1] ;
      P00G317_n252CliCod = new boolean[] {false} ;
      P00G317_A396EmprCod = new String[] {""} ;
      P00G317_A583IntCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptarpre__default(),
         new Object[] {
             new Object[] {
            P00G32_A132BarCodReo, P00G32_A130BarCodPar, P00G32_A129BarCod, P00G32_A396EmprCod, P00G32_A161BarFecSal, P00G32_A252CliCod, P00G32_n252CliCod, P00G32_A212BarSer, P00G32_A135BarColNom, P00G32_A136BarColNum,
            P00G32_A218BarTipCol, P00G32_A3310BarFac, P00G32_A228BarUniMed, P00G32_A193BarOpeEsp
            }
            , new Object[] {
            P00G34_A184BarMtr, P00G34_A166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P00G36_A130BarCodPar, P00G36_A132BarCodReo, P00G36_A129BarCod, P00G36_A396EmprCod, P00G36_A252CliCod, P00G36_n252CliCod, P00G36_A212BarSer, P00G36_A135BarColNom, P00G36_A136BarColNum, P00G36_A218BarTipCol,
            P00G36_A161BarFecSal
            }
            , new Object[] {
            P00G37_A396EmprCod, P00G37_A129BarCod, P00G37_A132BarCodReo, P00G37_A130BarCodPar, P00G37_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00G39_A831TipColCod, P00G39_A483ForColNum, P00G39_A482ForColNom, P00G39_A494ForSer, P00G39_A252CliCod, P00G39_A396EmprCod, P00G39_A583IntCod, P00G39_A492ForPreKgm, P00G39_n492ForPreKgm, P00G39_A493ForPreMtr,
            P00G39_n493ForPreMtr, P00G39_A491ForPreDef, P00G39_n491ForPreDef
            }
            , new Object[] {
            P00G310_A396EmprCod, P00G310_A252CliCod, P00G310_A494ForSer, P00G310_A482ForColNom, P00G310_A483ForColNum, P00G310_A831TipColCod, P00G310_A1521RecValFin, P00G310_n1521RecValFin, P00G310_A1520RecValIni, P00G310_n1520RecValIni,
            P00G310_A1522RecCanRec, P00G310_n1522RecCanRec, P00G310_A1519RecCorLin
            }
            , new Object[] {
            P00G311_A596LimUni, P00G311_n596LimUni, P00G311_A65ArtCod, P00G311_A252CliCod, P00G311_A396EmprCod, P00G311_A675PorRec, P00G311_n675PorRec, P00G311_A598LinRec
            }
            , new Object[] {
            P00G312_A65ArtCod, P00G312_A252CliCod, P00G312_A396EmprCod, P00G312_A92ArtPreKgm, P00G312_n92ArtPreKgm, P00G312_A93ArtPreMtr, P00G312_n93ArtPreMtr, P00G312_A91ArtPreDef, P00G312_n91ArtPreDef, P00G312_A3915EmpNumDec,
            P00G312_n3915EmpNumDec
            }
            , new Object[] {
            P00G313_A396EmprCod, P00G313_A252CliCod, P00G313_A65ArtCod, P00G313_A596LimUni, P00G313_n596LimUni, P00G313_A675PorRec, P00G313_n675PorRec, P00G313_A598LinRec
            }
            , new Object[] {
            P00G314_A2931Limite2, P00G314_A65ArtCod, P00G314_A252CliCod, P00G314_A396EmprCod, P00G314_A2932Precio2, P00G314_n2932Precio2
            }
            , new Object[] {
            P00G315_A396EmprCod, P00G315_A252CliCod, P00G315_A65ArtCod, P00G315_A583IntCod, P00G315_A831TipColCod, P00G315_A586IntPreKgm, P00G315_n586IntPreKgm, P00G315_A587IntPreMtr, P00G315_n587IntPreMtr, P00G315_A585IntPreDef,
            P00G315_n585IntPreDef
            }
            , new Object[] {
            P00G316_A583IntCod, P00G316_A1504CliProCod, P00G316_A65ArtCod, P00G316_A252CliCod, P00G316_A396EmprCod, P00G316_A1464ProPreMtr, P00G316_n1464ProPreMtr, P00G316_A1465ProPreKgm, P00G316_n1465ProPreKgm
            }
            , new Object[] {
            P00G317_A831TipColCod, P00G317_A483ForColNum, P00G317_A482ForColNom, P00G317_A494ForSer, P00G317_A252CliCod, P00G317_A396EmprCod, P00G317_A583IntCod
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
   private byte AV47Flag ;
   private byte AV57Pervaf ;
   private byte AV59FlagJm ;
   private byte AV60FlagTm ;
   private byte AV61FlagSalt ;
   private byte AV62FlagItr ;
   private byte AV64FlagRecCol ;
   private byte GXv_int7[] ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV36TipColCod ;
   private byte AV54FlagPre ;
   private byte AV55FlagPro ;
   private byte A3915EmpNumDec ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV27IntCod ;
   private byte A1519RecCorLin ;
   private byte A598LinRec ;
   private short A2931Limite2 ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int GXv_int3[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV37CliCod ;
   private int AV35BarColNum ;
   private int AV29LimUni ;
   private int AV53ForColNum ;
   private int A483ForColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV23Recar ;
   private java.math.BigDecimal AV24Dtos ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal AV56PorRec ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A2932Precio2 ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A1464ProPreMtr ;
   private java.math.BigDecimal A1465ProPreKgm ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV26PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A3310BarFac ;
   private String A228BarUniMed ;
   private String AV33BarSer ;
   private String AV34BarColNom ;
   private String AV46UniMed ;
   private String AV38Noprecio ;
   private String AV51ForSer ;
   private String AV52ForColNom ;
   private String A758ProCod ;
   private String AV50ProCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private String A1504CliProCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private boolean n1522RecCanRec ;
   private boolean n596LimUni ;
   private boolean n675PorRec ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n91ArtPreDef ;
   private boolean n3915EmpNumDec ;
   private boolean n2932Precio2 ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private boolean n585IntPreDef ;
   private boolean n1464ProPreMtr ;
   private boolean n1465ProPreKgm ;
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
   private byte[] P00G32_A132BarCodReo ;
   private String[] P00G32_A130BarCodPar ;
   private int[] P00G32_A129BarCod ;
   private String[] P00G32_A396EmprCod ;
   private java.util.Date[] P00G32_A161BarFecSal ;
   private int[] P00G32_A252CliCod ;
   private boolean[] P00G32_n252CliCod ;
   private String[] P00G32_A212BarSer ;
   private String[] P00G32_A135BarColNom ;
   private int[] P00G32_A136BarColNum ;
   private byte[] P00G32_A218BarTipCol ;
   private String[] P00G32_A3310BarFac ;
   private String[] P00G32_A228BarUniMed ;
   private byte[] P00G32_A193BarOpeEsp ;
   private java.math.BigDecimal[] P00G34_A184BarMtr ;
   private java.math.BigDecimal[] P00G34_A166BarKgm ;
   private String[] P00G36_A130BarCodPar ;
   private byte[] P00G36_A132BarCodReo ;
   private int[] P00G36_A129BarCod ;
   private String[] P00G36_A396EmprCod ;
   private int[] P00G36_A252CliCod ;
   private boolean[] P00G36_n252CliCod ;
   private String[] P00G36_A212BarSer ;
   private String[] P00G36_A135BarColNom ;
   private int[] P00G36_A136BarColNum ;
   private byte[] P00G36_A218BarTipCol ;
   private java.util.Date[] P00G36_A161BarFecSal ;
   private String[] P00G37_A396EmprCod ;
   private int[] P00G37_A129BarCod ;
   private byte[] P00G37_A132BarCodReo ;
   private String[] P00G37_A130BarCodPar ;
   private String[] P00G37_A758ProCod ;
   private byte[] P00G39_A831TipColCod ;
   private int[] P00G39_A483ForColNum ;
   private String[] P00G39_A482ForColNom ;
   private String[] P00G39_A494ForSer ;
   private int[] P00G39_A252CliCod ;
   private boolean[] P00G39_n252CliCod ;
   private String[] P00G39_A396EmprCod ;
   private byte[] P00G39_A583IntCod ;
   private java.math.BigDecimal[] P00G39_A492ForPreKgm ;
   private boolean[] P00G39_n492ForPreKgm ;
   private java.math.BigDecimal[] P00G39_A493ForPreMtr ;
   private boolean[] P00G39_n493ForPreMtr ;
   private String[] P00G39_A491ForPreDef ;
   private boolean[] P00G39_n491ForPreDef ;
   private String[] P00G310_A396EmprCod ;
   private int[] P00G310_A252CliCod ;
   private boolean[] P00G310_n252CliCod ;
   private String[] P00G310_A494ForSer ;
   private String[] P00G310_A482ForColNom ;
   private int[] P00G310_A483ForColNum ;
   private byte[] P00G310_A831TipColCod ;
   private int[] P00G310_A1521RecValFin ;
   private boolean[] P00G310_n1521RecValFin ;
   private int[] P00G310_A1520RecValIni ;
   private boolean[] P00G310_n1520RecValIni ;
   private java.math.BigDecimal[] P00G310_A1522RecCanRec ;
   private boolean[] P00G310_n1522RecCanRec ;
   private byte[] P00G310_A1519RecCorLin ;
   private int[] P00G311_A596LimUni ;
   private boolean[] P00G311_n596LimUni ;
   private String[] P00G311_A65ArtCod ;
   private int[] P00G311_A252CliCod ;
   private boolean[] P00G311_n252CliCod ;
   private String[] P00G311_A396EmprCod ;
   private java.math.BigDecimal[] P00G311_A675PorRec ;
   private boolean[] P00G311_n675PorRec ;
   private byte[] P00G311_A598LinRec ;
   private String[] P00G312_A65ArtCod ;
   private int[] P00G312_A252CliCod ;
   private boolean[] P00G312_n252CliCod ;
   private String[] P00G312_A396EmprCod ;
   private java.math.BigDecimal[] P00G312_A92ArtPreKgm ;
   private boolean[] P00G312_n92ArtPreKgm ;
   private java.math.BigDecimal[] P00G312_A93ArtPreMtr ;
   private boolean[] P00G312_n93ArtPreMtr ;
   private String[] P00G312_A91ArtPreDef ;
   private boolean[] P00G312_n91ArtPreDef ;
   private byte[] P00G312_A3915EmpNumDec ;
   private boolean[] P00G312_n3915EmpNumDec ;
   private String[] P00G313_A396EmprCod ;
   private int[] P00G313_A252CliCod ;
   private boolean[] P00G313_n252CliCod ;
   private String[] P00G313_A65ArtCod ;
   private int[] P00G313_A596LimUni ;
   private boolean[] P00G313_n596LimUni ;
   private java.math.BigDecimal[] P00G313_A675PorRec ;
   private boolean[] P00G313_n675PorRec ;
   private byte[] P00G313_A598LinRec ;
   private short[] P00G314_A2931Limite2 ;
   private String[] P00G314_A65ArtCod ;
   private int[] P00G314_A252CliCod ;
   private boolean[] P00G314_n252CliCod ;
   private String[] P00G314_A396EmprCod ;
   private java.math.BigDecimal[] P00G314_A2932Precio2 ;
   private boolean[] P00G314_n2932Precio2 ;
   private String[] P00G315_A396EmprCod ;
   private int[] P00G315_A252CliCod ;
   private boolean[] P00G315_n252CliCod ;
   private String[] P00G315_A65ArtCod ;
   private byte[] P00G315_A583IntCod ;
   private byte[] P00G315_A831TipColCod ;
   private java.math.BigDecimal[] P00G315_A586IntPreKgm ;
   private boolean[] P00G315_n586IntPreKgm ;
   private java.math.BigDecimal[] P00G315_A587IntPreMtr ;
   private boolean[] P00G315_n587IntPreMtr ;
   private String[] P00G315_A585IntPreDef ;
   private boolean[] P00G315_n585IntPreDef ;
   private byte[] P00G316_A583IntCod ;
   private String[] P00G316_A1504CliProCod ;
   private String[] P00G316_A65ArtCod ;
   private int[] P00G316_A252CliCod ;
   private boolean[] P00G316_n252CliCod ;
   private String[] P00G316_A396EmprCod ;
   private java.math.BigDecimal[] P00G316_A1464ProPreMtr ;
   private boolean[] P00G316_n1464ProPreMtr ;
   private java.math.BigDecimal[] P00G316_A1465ProPreKgm ;
   private boolean[] P00G316_n1465ProPreKgm ;
   private byte[] P00G317_A831TipColCod ;
   private int[] P00G317_A483ForColNum ;
   private String[] P00G317_A482ForColNom ;
   private String[] P00G317_A494ForSer ;
   private int[] P00G317_A252CliCod ;
   private boolean[] P00G317_n252CliCod ;
   private String[] P00G317_A396EmprCod ;
   private byte[] P00G317_A583IntCod ;
}

final  class ptarpre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G32", "SELECT BarCodReo, BarCodPar, BarCod, EmprCod, BarFecSal, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarFac, BarUniMed, BarOpeEsp FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarFecSal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G34", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00G35", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00G36", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF BarFecSal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G37", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00G38", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00G39", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreKgm, ForPreMtr, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G310", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00G311", "SELECT * FROM (SELECT LimUni, ArtCod, CliCod, EmprCod, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G312", "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtPreKgm, T1.ArtPreMtr, T1.ArtPreDef, T2.EmpNumDec FROM (TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G313", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G314", "SELECT * FROM (SELECT Limite2, ArtCod, CliCod, EmprCod, Precio2 FROM TXPRECARB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Limite2 > ? ORDER BY EmprCod, CliCod, ArtCod, Limite2) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G315", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G316", "SELECT IntCod, CliProCod, ArtCod, CliCod, EmprCod, ProPreMtr, ProPreKgm FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G317", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
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
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 14 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

