package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpte extends GXProcedure
{
   public pactpte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpte.class ), "" );
   }

   public pactpte( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           int[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           int[] aP9 ,
                           String[] aP10 ,
                           byte[] aP11 ,
                           java.util.Date[] aP12 )
   {
      pactpte.this.aP13 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        java.util.Date[] aP12 ,
                        long[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             java.util.Date[] aP12 ,
                             long[] aP13 )
   {
      pactpte.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpte.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pactpte.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactpte.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pactpte.this.AV19Kilos = aP4[0];
      this.aP4 = aP4;
      pactpte.this.AV20Metros = aP5[0];
      this.aP5 = aP5;
      pactpte.this.AV21Piezas = aP6[0];
      this.aP6 = aP6;
      pactpte.this.AV22KilAnt = aP7[0];
      this.aP7 = aP7;
      pactpte.this.AV23MtrAnt = aP8[0];
      this.aP8 = aP8;
      pactpte.this.AV24PieAnt = aP9[0];
      this.aP9 = aP9;
      pactpte.this.AV25Modo = aP10[0];
      this.aP10 = aP10;
      pactpte.this.AV26BarSit = aP11[0];
      this.aP11 = aP11;
      pactpte.this.AV39FecSal = aP12[0];
      this.aP12 = aP12;
      pactpte.this.AV45AlbProCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV38FlagBlati ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BLATI ", ""), GXv_int1) ;
      pactpte.this.AV38FlagBlati = GXv_int1[0] ;
      GXv_int1[0] = AV40FlagFini ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int1) ;
      pactpte.this.AV40FlagFini = GXv_int1[0] ;
      GXv_int1[0] = AV42JBP ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int1) ;
      pactpte.this.AV42JBP = GXv_int1[0] ;
      GXv_int1[0] = AV44Ecapi ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ECAPI", ""), GXv_int1) ;
      pactpte.this.AV44Ecapi = GXv_int1[0] ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_int3[0] = AV16BarCod ;
      GXv_int1[0] = AV17BarCodReo ;
      GXv_char4[0] = AV18BarCodPar ;
      GXv_decimal5[0] = AV19Kilos ;
      GXv_decimal6[0] = AV20Metros ;
      GXv_int7[0] = AV21Piezas ;
      GXv_decimal8[0] = AV22KilAnt ;
      GXv_decimal9[0] = AV23MtrAnt ;
      GXv_int10[0] = AV24PieAnt ;
      GXv_char11[0] = AV25Modo ;
      new app.pcampie(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char11) ;
      pactpte.this.AV15EmprCod = GXv_char2[0] ;
      pactpte.this.AV16BarCod = GXv_int3[0] ;
      pactpte.this.AV17BarCodReo = GXv_int1[0] ;
      pactpte.this.AV18BarCodPar = GXv_char4[0] ;
      pactpte.this.AV19Kilos = GXv_decimal5[0] ;
      pactpte.this.AV20Metros = GXv_decimal6[0] ;
      pactpte.this.AV21Piezas = GXv_int7[0] ;
      pactpte.this.AV22KilAnt = GXv_decimal8[0] ;
      pactpte.this.AV23MtrAnt = GXv_decimal9[0] ;
      pactpte.this.AV24PieAnt = GXv_int10[0] ;
      pactpte.this.AV25Modo = GXv_char11[0] ;
      if ( AV42JBP == 1 )
      {
         /* Using cursor P018Z2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P018Z2_A130BarCodPar[0] ;
            A132BarCodReo = P018Z2_A132BarCodReo[0] ;
            A129BarCod = P018Z2_A129BarCod[0] ;
            A396EmprCod = P018Z2_A396EmprCod[0] ;
            A3747BarPegCod = P018Z2_A3747BarPegCod[0] ;
            A3748BarPegReo = P018Z2_A3748BarPegReo[0] ;
            A3749BarPegPar = P018Z2_A3749BarPegPar[0] ;
            GXv_char11[0] = AV15EmprCod ;
            GXv_int10[0] = A3747BarPegCod ;
            GXv_int1[0] = A3748BarPegReo ;
            GXv_char4[0] = A3749BarPegPar ;
            GXv_decimal9[0] = AV19Kilos ;
            GXv_decimal8[0] = AV20Metros ;
            GXv_int7[0] = AV21Piezas ;
            GXv_decimal6[0] = AV22KilAnt ;
            GXv_decimal5[0] = AV23MtrAnt ;
            GXv_int3[0] = AV24PieAnt ;
            GXv_char2[0] = AV25Modo ;
            new app.pcampie(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4, GXv_decimal9, GXv_decimal8, GXv_int7, GXv_decimal6, GXv_decimal5, GXv_int3, GXv_char2) ;
            pactpte.this.AV15EmprCod = GXv_char11[0] ;
            pactpte.this.A3747BarPegCod = GXv_int10[0] ;
            pactpte.this.A3748BarPegReo = GXv_int1[0] ;
            pactpte.this.A3749BarPegPar = GXv_char4[0] ;
            pactpte.this.AV19Kilos = GXv_decimal9[0] ;
            pactpte.this.AV20Metros = GXv_decimal8[0] ;
            pactpte.this.AV21Piezas = GXv_int7[0] ;
            pactpte.this.AV22KilAnt = GXv_decimal6[0] ;
            pactpte.this.AV23MtrAnt = GXv_decimal5[0] ;
            pactpte.this.AV24PieAnt = GXv_int3[0] ;
            pactpte.this.AV25Modo = GXv_char2[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P018Z3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P018Z3_A130BarCodPar[0] ;
            A132BarCodReo = P018Z3_A132BarCodReo[0] ;
            A129BarCod = P018Z3_A129BarCod[0] ;
            A396EmprCod = P018Z3_A396EmprCod[0] ;
            A3753BarFoaCod = P018Z3_A3753BarFoaCod[0] ;
            A3754BarFoaReo = P018Z3_A3754BarFoaReo[0] ;
            A3755BarFoaPar = P018Z3_A3755BarFoaPar[0] ;
            GXv_char11[0] = AV15EmprCod ;
            GXv_int10[0] = A3753BarFoaCod ;
            GXv_int1[0] = A3754BarFoaReo ;
            GXv_char4[0] = A3755BarFoaPar ;
            GXv_decimal9[0] = AV19Kilos ;
            GXv_decimal8[0] = AV20Metros ;
            GXv_int7[0] = AV21Piezas ;
            GXv_decimal6[0] = AV22KilAnt ;
            GXv_decimal5[0] = AV23MtrAnt ;
            GXv_int3[0] = AV24PieAnt ;
            GXv_char2[0] = AV25Modo ;
            new app.pcampie(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4, GXv_decimal9, GXv_decimal8, GXv_int7, GXv_decimal6, GXv_decimal5, GXv_int3, GXv_char2) ;
            pactpte.this.AV15EmprCod = GXv_char11[0] ;
            pactpte.this.A3753BarFoaCod = GXv_int10[0] ;
            pactpte.this.A3754BarFoaReo = GXv_int1[0] ;
            pactpte.this.A3755BarFoaPar = GXv_char4[0] ;
            pactpte.this.AV19Kilos = GXv_decimal9[0] ;
            pactpte.this.AV20Metros = GXv_decimal8[0] ;
            pactpte.this.AV21Piezas = GXv_int7[0] ;
            pactpte.this.AV22KilAnt = GXv_decimal6[0] ;
            pactpte.this.AV23MtrAnt = GXv_decimal5[0] ;
            pactpte.this.AV24PieAnt = GXv_int3[0] ;
            pactpte.this.AV25Modo = GXv_char2[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      /* Using cursor P018Z6 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P018Z6_A130BarCodPar[0] ;
         A132BarCodReo = P018Z6_A132BarCodReo[0] ;
         A129BarCod = P018Z6_A129BarCod[0] ;
         A396EmprCod = P018Z6_A396EmprCod[0] ;
         A2010BarTipDis = P018Z6_A2010BarTipDis[0] ;
         A4016BarTin = P018Z6_A4016BarTin[0] ;
         A252CliCod = P018Z6_A252CliCod[0] ;
         n252CliCod = P018Z6_n252CliCod[0] ;
         A212BarSer = P018Z6_A212BarSer[0] ;
         A3133BarNumCor = P018Z6_A3133BarNumCor[0] ;
         A166BarKgm = P018Z6_A166BarKgm[0] ;
         A184BarMtr = P018Z6_A184BarMtr[0] ;
         A168BarKgmLan = P018Z6_A168BarKgmLan[0] ;
         A186BarMtrLan = P018Z6_A186BarMtrLan[0] ;
         A1538BarCMtr = P018Z6_A1538BarCMtr[0] ;
         A1537BarCMLan = P018Z6_A1537BarCMLan[0] ;
         A166BarKgm = P018Z6_A166BarKgm[0] ;
         A184BarMtr = P018Z6_A184BarMtr[0] ;
         A168BarKgmLan = P018Z6_A168BarKgmLan[0] ;
         A186BarMtrLan = P018Z6_A186BarMtrLan[0] ;
         A1538BarCMtr = P018Z6_A1538BarCMtr[0] ;
         A1537BarCMLan = P018Z6_A1537BarCMLan[0] ;
         AV37BarTipDis = A2010BarTipDis ;
         AV43BarTin = A4016BarTin ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_decimal9[0] = AV29ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char4, GXv_decimal9) ;
         pactpte.this.A396EmprCod = GXv_char11[0] ;
         pactpte.this.A252CliCod = GXv_int10[0] ;
         pactpte.this.A212BarSer = GXv_char4[0] ;
         pactpte.this.AV29ArtMer = GXv_decimal9[0] ;
         if ( ( GXutil.strcmp(AV43BarTin, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV37BarTipDis, httpContext.getMessage( "N", "")) == 0 ) )
         {
            AV30BarKgm = A166BarKgm ;
            AV31BarMtr = A184BarMtr ;
            AV32BarKgmLan = A168BarKgmLan ;
            AV33BarMtrLan = A186BarMtrLan ;
            AV34DifKgm = AV30BarKgm.subtract(AV32BarKgmLan) ;
            AV35DifMtr = AV31BarMtr.subtract(AV33BarMtrLan) ;
         }
         if ( ( GXutil.strcmp(AV37BarTipDis, httpContext.getMessage( "S", "")) == 0 ) && ( ( GXutil.strcmp(AV43BarTin, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(AV43BarTin, httpContext.getMessage( "S", "")) == 0 ) ) )
         {
            if ( GXutil.strcmp(AV43BarTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV30BarKgm = A166BarKgm ;
            }
            if ( GXutil.strcmp(AV43BarTin, httpContext.getMessage( "N", "")) == 0 )
            {
               AV30BarKgm = DecimalUtil.doubleToDec(0) ;
            }
            AV31BarMtr = A1538BarCMtr ;
            AV33BarMtrLan = A1537BarCMLan ;
            AV35DifMtr = AV31BarMtr.subtract(AV33BarMtrLan) ;
            if ( AV44Ecapi == 1 )
            {
               /* Using cursor P018Z7 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A457FasCod = P018Z7_A457FasCod[0] ;
                  A153BarFasEst = P018Z7_A153BarFasEst[0] ;
                  A227BarUni = P018Z7_A227BarUni[0] ;
                  A160BarFecRea = P018Z7_A160BarFecRea[0] ;
                  A194BarOrdLin = P018Z7_A194BarOrdLin[0] ;
                  A758ProCod = P018Z7_A758ProCod[0] ;
                  if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "PLEG", "")) == 0 )
                  {
                     A153BarFasEst = (byte)(2) ;
                     A227BarUni = A166BarKgm ;
                     A160BarFecRea = Gx_date ;
                     /* Using cursor P018Z8 */
                     pr_default.execute(4, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
         }
         AV36vCortes = (short)(A3133BarNumCor+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV27OK = " " ;
      if ( AV26BarSit != 9 )
      {
         if ( GXutil.strcmp(AV25Modo, httpContext.getMessage( "DEL", "")) != 0 )
         {
            while ( ( GXutil.strcmp(AV27OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) != 0 ) )
            {
               if ( AV36vCortes == 1 )
               {
               }
               else
               {
               }
            }
         }
         else
         {
            AV27OK = httpContext.getMessage( "N", "") ;
         }
      }
      if ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char11[0] = AV15EmprCod ;
         GXv_int10[0] = AV16BarCod ;
         GXv_int1[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_char2[0] = httpContext.getMessage( "C", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4, GXv_char2) ;
         pactpte.this.AV15EmprCod = GXv_char11[0] ;
         pactpte.this.AV16BarCod = GXv_int10[0] ;
         pactpte.this.AV17BarCodReo = GXv_int1[0] ;
         pactpte.this.AV18BarCodPar = GXv_char4[0] ;
         if ( AV40FlagFini == 1 )
         {
            GXv_char11[0] = AV15EmprCod ;
            GXv_int10[0] = AV16BarCod ;
            GXv_int1[0] = AV17BarCodReo ;
            GXv_char4[0] = AV18BarCodPar ;
            new app.pciefas(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4) ;
            pactpte.this.AV15EmprCod = GXv_char11[0] ;
            pactpte.this.AV16BarCod = GXv_int10[0] ;
            pactpte.this.AV17BarCodReo = GXv_int1[0] ;
            pactpte.this.AV18BarCodPar = GXv_char4[0] ;
         }
         if ( AV42JBP == 1 )
         {
            /* Using cursor P018Z9 */
            pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A130BarCodPar = P018Z9_A130BarCodPar[0] ;
               A132BarCodReo = P018Z9_A132BarCodReo[0] ;
               A129BarCod = P018Z9_A129BarCod[0] ;
               A396EmprCod = P018Z9_A396EmprCod[0] ;
               A3747BarPegCod = P018Z9_A3747BarPegCod[0] ;
               A3748BarPegReo = P018Z9_A3748BarPegReo[0] ;
               A3749BarPegPar = P018Z9_A3749BarPegPar[0] ;
               GXv_char11[0] = AV15EmprCod ;
               GXv_int10[0] = A3747BarPegCod ;
               GXv_int1[0] = A3748BarPegReo ;
               GXv_char4[0] = A3749BarPegPar ;
               GXv_char2[0] = httpContext.getMessage( "C", "") ;
               new app.pciebar(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4, GXv_char2) ;
               pactpte.this.AV15EmprCod = GXv_char11[0] ;
               pactpte.this.A3747BarPegCod = GXv_int10[0] ;
               pactpte.this.A3748BarPegReo = GXv_int1[0] ;
               pactpte.this.A3749BarPegPar = GXv_char4[0] ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Using cursor P018Z10 */
            pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A130BarCodPar = P018Z10_A130BarCodPar[0] ;
               A132BarCodReo = P018Z10_A132BarCodReo[0] ;
               A129BarCod = P018Z10_A129BarCod[0] ;
               A396EmprCod = P018Z10_A396EmprCod[0] ;
               A3753BarFoaCod = P018Z10_A3753BarFoaCod[0] ;
               A3754BarFoaReo = P018Z10_A3754BarFoaReo[0] ;
               A3755BarFoaPar = P018Z10_A3755BarFoaPar[0] ;
               GXv_char11[0] = AV15EmprCod ;
               GXv_int10[0] = A3753BarFoaCod ;
               GXv_int1[0] = A3754BarFoaReo ;
               GXv_char4[0] = A3755BarFoaPar ;
               GXv_char2[0] = httpContext.getMessage( "C", "") ;
               new app.pciebar(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4, GXv_char2) ;
               pactpte.this.AV15EmprCod = GXv_char11[0] ;
               pactpte.this.A3753BarFoaCod = GXv_int10[0] ;
               pactpte.this.A3754BarFoaReo = GXv_int1[0] ;
               pactpte.this.A3755BarFoaPar = GXv_char4[0] ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
         }
         if ( GXutil.strcmp(AV37BarTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char11[0] = AV15EmprCod ;
            GXv_int10[0] = AV16BarCod ;
            GXv_int1[0] = AV17BarCodReo ;
            GXv_char4[0] = AV18BarCodPar ;
            GXv_char2[0] = httpContext.getMessage( "C", "") ;
            new app.pciehoj(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int1, GXv_char4, GXv_char2) ;
            pactpte.this.AV15EmprCod = GXv_char11[0] ;
            pactpte.this.AV16BarCod = GXv_int10[0] ;
            pactpte.this.AV17BarCodReo = GXv_int1[0] ;
            pactpte.this.AV18BarCodPar = GXv_char4[0] ;
            GXv_char11[0] = AV15EmprCod ;
            GXv_int12[0] = AV45AlbProCod ;
            GXv_int10[0] = AV16BarCod ;
            GXv_int1[0] = AV17BarCodReo ;
            GXv_char4[0] = AV18BarCodPar ;
            new app.pcosest(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int10, GXv_int1, GXv_char4) ;
            pactpte.this.AV15EmprCod = GXv_char11[0] ;
            pactpte.this.AV45AlbProCod = GXv_int12[0] ;
            pactpte.this.AV16BarCod = GXv_int10[0] ;
            pactpte.this.AV17BarCodReo = GXv_int1[0] ;
            pactpte.this.AV18BarCodPar = GXv_char4[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpte.this.AV15EmprCod;
      this.aP1[0] = pactpte.this.AV16BarCod;
      this.aP2[0] = pactpte.this.AV17BarCodReo;
      this.aP3[0] = pactpte.this.AV18BarCodPar;
      this.aP4[0] = pactpte.this.AV19Kilos;
      this.aP5[0] = pactpte.this.AV20Metros;
      this.aP6[0] = pactpte.this.AV21Piezas;
      this.aP7[0] = pactpte.this.AV22KilAnt;
      this.aP8[0] = pactpte.this.AV23MtrAnt;
      this.aP9[0] = pactpte.this.AV24PieAnt;
      this.aP10[0] = pactpte.this.AV25Modo;
      this.aP11[0] = pactpte.this.AV26BarSit;
      this.aP12[0] = pactpte.this.AV39FecSal;
      this.aP13[0] = pactpte.this.AV45AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactpte");
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
      P018Z2_A130BarCodPar = new String[] {""} ;
      P018Z2_A132BarCodReo = new byte[1] ;
      P018Z2_A129BarCod = new int[1] ;
      P018Z2_A396EmprCod = new String[] {""} ;
      P018Z2_A3747BarPegCod = new int[1] ;
      P018Z2_A3748BarPegReo = new byte[1] ;
      P018Z2_A3749BarPegPar = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A3749BarPegPar = "" ;
      P018Z3_A130BarCodPar = new String[] {""} ;
      P018Z3_A132BarCodReo = new byte[1] ;
      P018Z3_A129BarCod = new int[1] ;
      P018Z3_A396EmprCod = new String[] {""} ;
      P018Z3_A3753BarFoaCod = new int[1] ;
      P018Z3_A3754BarFoaReo = new byte[1] ;
      P018Z3_A3755BarFoaPar = new String[] {""} ;
      A3755BarFoaPar = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int3 = new int[1] ;
      P018Z6_A130BarCodPar = new String[] {""} ;
      P018Z6_A132BarCodReo = new byte[1] ;
      P018Z6_A129BarCod = new int[1] ;
      P018Z6_A396EmprCod = new String[] {""} ;
      P018Z6_A2010BarTipDis = new String[] {""} ;
      P018Z6_A4016BarTin = new String[] {""} ;
      P018Z6_A252CliCod = new int[1] ;
      P018Z6_n252CliCod = new boolean[] {false} ;
      P018Z6_A212BarSer = new String[] {""} ;
      P018Z6_A3133BarNumCor = new short[1] ;
      P018Z6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018Z6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018Z6_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018Z6_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018Z6_A1538BarCMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018Z6_A1537BarCMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2010BarTipDis = "" ;
      A4016BarTin = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      A1538BarCMtr = DecimalUtil.ZERO ;
      A1537BarCMLan = DecimalUtil.ZERO ;
      AV37BarTipDis = "" ;
      AV43BarTin = "" ;
      AV29ArtMer = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV30BarKgm = DecimalUtil.ZERO ;
      AV31BarMtr = DecimalUtil.ZERO ;
      AV32BarKgmLan = DecimalUtil.ZERO ;
      AV33BarMtrLan = DecimalUtil.ZERO ;
      AV34DifKgm = DecimalUtil.ZERO ;
      AV35DifMtr = DecimalUtil.ZERO ;
      P018Z7_A396EmprCod = new String[] {""} ;
      P018Z7_A129BarCod = new int[1] ;
      P018Z7_A132BarCodReo = new byte[1] ;
      P018Z7_A130BarCodPar = new String[] {""} ;
      P018Z7_A457FasCod = new String[] {""} ;
      P018Z7_A153BarFasEst = new byte[1] ;
      P018Z7_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018Z7_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P018Z7_A194BarOrdLin = new short[1] ;
      P018Z7_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A758ProCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV27OK = "" ;
      P018Z9_A130BarCodPar = new String[] {""} ;
      P018Z9_A132BarCodReo = new byte[1] ;
      P018Z9_A129BarCod = new int[1] ;
      P018Z9_A396EmprCod = new String[] {""} ;
      P018Z9_A3747BarPegCod = new int[1] ;
      P018Z9_A3748BarPegReo = new byte[1] ;
      P018Z9_A3749BarPegPar = new String[] {""} ;
      P018Z10_A130BarCodPar = new String[] {""} ;
      P018Z10_A132BarCodReo = new byte[1] ;
      P018Z10_A129BarCod = new int[1] ;
      P018Z10_A396EmprCod = new String[] {""} ;
      P018Z10_A3753BarFoaCod = new int[1] ;
      P018Z10_A3754BarFoaReo = new byte[1] ;
      P018Z10_A3755BarFoaPar = new String[] {""} ;
      GXv_char2 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new long[1] ;
      GXv_int10 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpte__default(),
         new Object[] {
             new Object[] {
            P018Z2_A130BarCodPar, P018Z2_A132BarCodReo, P018Z2_A129BarCod, P018Z2_A396EmprCod, P018Z2_A3747BarPegCod, P018Z2_A3748BarPegReo, P018Z2_A3749BarPegPar
            }
            , new Object[] {
            P018Z3_A130BarCodPar, P018Z3_A132BarCodReo, P018Z3_A129BarCod, P018Z3_A396EmprCod, P018Z3_A3753BarFoaCod, P018Z3_A3754BarFoaReo, P018Z3_A3755BarFoaPar
            }
            , new Object[] {
            P018Z6_A130BarCodPar, P018Z6_A132BarCodReo, P018Z6_A129BarCod, P018Z6_A396EmprCod, P018Z6_A2010BarTipDis, P018Z6_A4016BarTin, P018Z6_A252CliCod, P018Z6_n252CliCod, P018Z6_A212BarSer, P018Z6_A3133BarNumCor,
            P018Z6_A166BarKgm, P018Z6_A184BarMtr, P018Z6_A168BarKgmLan, P018Z6_A186BarMtrLan, P018Z6_A1538BarCMtr, P018Z6_A1537BarCMLan
            }
            , new Object[] {
            P018Z7_A396EmprCod, P018Z7_A129BarCod, P018Z7_A132BarCodReo, P018Z7_A130BarCodPar, P018Z7_A457FasCod, P018Z7_A153BarFasEst, P018Z7_A227BarUni, P018Z7_A160BarFecRea, P018Z7_A194BarOrdLin, P018Z7_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P018Z9_A130BarCodPar, P018Z9_A132BarCodReo, P018Z9_A129BarCod, P018Z9_A396EmprCod, P018Z9_A3747BarPegCod, P018Z9_A3748BarPegReo, P018Z9_A3749BarPegPar
            }
            , new Object[] {
            P018Z10_A130BarCodPar, P018Z10_A132BarCodReo, P018Z10_A129BarCod, P018Z10_A396EmprCod, P018Z10_A3753BarFoaCod, P018Z10_A3754BarFoaReo, P018Z10_A3755BarFoaPar
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV26BarSit ;
   private byte AV38FlagBlati ;
   private byte AV40FlagFini ;
   private byte AV42JBP ;
   private byte AV44Ecapi ;
   private byte A132BarCodReo ;
   private byte A3748BarPegReo ;
   private byte A3754BarFoaReo ;
   private byte A153BarFasEst ;
   private byte GXv_int1[] ;
   private short A3133BarNumCor ;
   private short A194BarOrdLin ;
   private short AV36vCortes ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV21Piezas ;
   private int AV24PieAnt ;
   private int A129BarCod ;
   private int A3747BarPegCod ;
   private int A3753BarFoaCod ;
   private int GXv_int7[] ;
   private int GXv_int3[] ;
   private int A252CliCod ;
   private int GXv_int10[] ;
   private long AV45AlbProCod ;
   private long GXv_int12[] ;
   private java.math.BigDecimal AV19Kilos ;
   private java.math.BigDecimal AV20Metros ;
   private java.math.BigDecimal AV22KilAnt ;
   private java.math.BigDecimal AV23MtrAnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal A1538BarCMtr ;
   private java.math.BigDecimal A1537BarCMLan ;
   private java.math.BigDecimal AV29ArtMer ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV30BarKgm ;
   private java.math.BigDecimal AV31BarMtr ;
   private java.math.BigDecimal AV32BarKgmLan ;
   private java.math.BigDecimal AV33BarMtrLan ;
   private java.math.BigDecimal AV34DifKgm ;
   private java.math.BigDecimal AV35DifMtr ;
   private java.math.BigDecimal A227BarUni ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV25Modo ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A3749BarPegPar ;
   private String A3755BarFoaPar ;
   private String A2010BarTipDis ;
   private String A4016BarTin ;
   private String A212BarSer ;
   private String AV37BarTipDis ;
   private String AV43BarTin ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV27OK ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private java.util.Date AV39FecSal ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private long[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private java.util.Date[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P018Z2_A130BarCodPar ;
   private byte[] P018Z2_A132BarCodReo ;
   private int[] P018Z2_A129BarCod ;
   private String[] P018Z2_A396EmprCod ;
   private int[] P018Z2_A3747BarPegCod ;
   private byte[] P018Z2_A3748BarPegReo ;
   private String[] P018Z2_A3749BarPegPar ;
   private String[] P018Z3_A130BarCodPar ;
   private byte[] P018Z3_A132BarCodReo ;
   private int[] P018Z3_A129BarCod ;
   private String[] P018Z3_A396EmprCod ;
   private int[] P018Z3_A3753BarFoaCod ;
   private byte[] P018Z3_A3754BarFoaReo ;
   private String[] P018Z3_A3755BarFoaPar ;
   private String[] P018Z6_A130BarCodPar ;
   private byte[] P018Z6_A132BarCodReo ;
   private int[] P018Z6_A129BarCod ;
   private String[] P018Z6_A396EmprCod ;
   private String[] P018Z6_A2010BarTipDis ;
   private String[] P018Z6_A4016BarTin ;
   private int[] P018Z6_A252CliCod ;
   private boolean[] P018Z6_n252CliCod ;
   private String[] P018Z6_A212BarSer ;
   private short[] P018Z6_A3133BarNumCor ;
   private java.math.BigDecimal[] P018Z6_A166BarKgm ;
   private java.math.BigDecimal[] P018Z6_A184BarMtr ;
   private java.math.BigDecimal[] P018Z6_A168BarKgmLan ;
   private java.math.BigDecimal[] P018Z6_A186BarMtrLan ;
   private java.math.BigDecimal[] P018Z6_A1538BarCMtr ;
   private java.math.BigDecimal[] P018Z6_A1537BarCMLan ;
   private String[] P018Z7_A396EmprCod ;
   private int[] P018Z7_A129BarCod ;
   private byte[] P018Z7_A132BarCodReo ;
   private String[] P018Z7_A130BarCodPar ;
   private String[] P018Z7_A457FasCod ;
   private byte[] P018Z7_A153BarFasEst ;
   private java.math.BigDecimal[] P018Z7_A227BarUni ;
   private java.util.Date[] P018Z7_A160BarFecRea ;
   private short[] P018Z7_A194BarOrdLin ;
   private String[] P018Z7_A758ProCod ;
   private String[] P018Z9_A130BarCodPar ;
   private byte[] P018Z9_A132BarCodReo ;
   private int[] P018Z9_A129BarCod ;
   private String[] P018Z9_A396EmprCod ;
   private int[] P018Z9_A3747BarPegCod ;
   private byte[] P018Z9_A3748BarPegReo ;
   private String[] P018Z9_A3749BarPegPar ;
   private String[] P018Z10_A130BarCodPar ;
   private byte[] P018Z10_A132BarCodReo ;
   private int[] P018Z10_A129BarCod ;
   private String[] P018Z10_A396EmprCod ;
   private int[] P018Z10_A3753BarFoaCod ;
   private byte[] P018Z10_A3754BarFoaReo ;
   private String[] P018Z10_A3755BarFoaPar ;
}

final  class pactpte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018Z2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P018Z3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P018Z6", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarTipDis, T1.BarTin, T1.CliCod, T1.BarSer, T1.BarNumCor, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan, COALESCE( T3.BarCMtr, 0) AS BarCMtr, COALESCE( T3.BarCMLan, 0) AS BarCMLan FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarComMtr) AS BarCMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarComMLan) AS BarCMLan FROM TXPBARCOM GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P018Z7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarUni, BarFecRea, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018Z8", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P018Z9", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P018Z10", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

